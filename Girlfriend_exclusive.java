import java.io.FileWriter;
import java.io.IOException;

public class Girlfriend_exclusive {
    public static void main(String[] args) {
        try {
            // 创建 index.html 文件
            FileWriter indexWriter = new FileWriter("index.html");
            indexWriter.write("""
                    <!DOCTYPE html>
                    <html lang="en">
                    <head>
                        <meta charset="UTF-8">
                        <meta name="viewport" content="width=device-width, initial-scale=1.0">
                        <title>Girlfriend_exclusive</title>
                        <link rel="stylesheet" href="style.css">
                    </head>
                    <body>
                        <h1>你终于来了媳妇儿,这是我专门给你写的网站!</h1>
                        <h2>这里可以看到以前你看过的动漫和剧集</h2>
                        <h3>我想如果可以的话我们可以在这里存储我们的永久回忆             (目前版本更新1.0)  </h3>
                        <h3>我会在这里持续更新这个网站,我会永远珍惜我们之间的感情</h3>
                        <nav>
                            <a href="anime.html">Anime List</a>
                            <a href="search.html">Search</a>
                        </nav>
                    </body>
                    </html>
                    """);
            indexWriter.close();

            // 创建 anime.html 文件
            FileWriter animeWriter = new FileWriter("anime.html");
            animeWriter.write("""
                    <!DOCTYPE html>
                    <html lang="en">
                    <head>
                        <meta charset="UTF-8">
                        <meta name="viewport" content="width=device-width, initial-scale=1.0">
                        <title>Anime List</title>
                        <link rel="stylesheet" href="style.css">
                    </head>
                    <body>
                        <h1>Anime List</h1>
                        <ul>
                            <li><a href="https://www.bilibili.com" target="_blank">Death Note</a></li>
                            <li><a href="https://www.bilibili.com" target="_blank">Nana</a></li>
                        </ul>
                    </body>
                    </html>
                    """);
            animeWriter.close();

            // 创建 search.html 文件
            FileWriter searchWriter = new FileWriter("search.html");
            searchWriter.write("""
                    <!DOCTYPE html>
                    <html lang="en">
                    <head>
                        <meta charset="UTF-8">
                        <meta name="viewport" content="width=device-width, initial-scale=1.0">
                        <title>Search</title>
                        <link rel="stylesheet" href="style.css">
                        <script src="script.js" defer></script>
                    </head>
                    <body>
                        <h1>Search Anime</h1>
                        <input type="text" id="searchBox" placeholder="Search anime...">
                        <ul id="searchResults"></ul>
                    </body>
                    </html>
                    """);
            searchWriter.close();

            System.out.println("Website files generated successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the website files.");
            e.printStackTrace();
        }
    }
}
