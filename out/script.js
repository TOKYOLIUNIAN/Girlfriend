// 设置目标日期，格式为：年-月-日
const targetDate = new Date("2025-01-05"); // 这里设置目标日期，可以是任何日期

// 更新页面中显示的天数
function updateDays() {
    const currentDate = new Date(); // 获取当前日期
    const timeDifference = currentDate - targetDate; // 计算目标日期与当前日期之间的时间差（毫秒）
    const daysPassed = Math.floor(timeDifference / (1000 * 60 * 60 * 24)); // 将毫秒转化为天数
    document.getElementById('days-count').textContent = daysPassed; // 更新页面上的天数显示
}

// 每秒钟更新一次
setInterval(updateDays, 1000);
