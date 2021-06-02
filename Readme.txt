Manual testing result: 
https://docs.google.com/document/d/1bbjhv3XNjXoYKveNxdCvEWmxrWCFUYJef4Cq4Is2MwU/edit

Automation:
*** How to run automation ***

1. Install IntelliJ

2. Import folder demo by IntelliJ as Maven project

3. Change path of ChromeDriver in BaseTest class (depend on OS Windows or MacOS)

   -> MacOS: System.setProperty("webdriver.chrome.driver",
                currentDir + "/src/main/resources/chromeDriver/chromedriver_90");

   -> Windows: System.setProperty("webdriver.chrome.driver",
                currentDir + "/src/main/resources/chromeDriver/chromedriver_90.exe");

4. Run the test case by runner of IntelliJ