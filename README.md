# 如何使用 TranslationApp 类生成文本文件
1. 将该文件放入你的literatureStats包中
2. 运行该程序
3. 按照以下方式设置输入文件和输出文件的路径。
```
String inputFilePath = "input/test.txt";（`test.txt`为测试题目）
String outputFilePath = "output.txt";
```
4. 运行结束后你会在菜单页下面看到生成的文件
5. 运用compare_files.py进行下面的比较


# 如何使用 compare_file 函数比较文本文件

1. 函数名称：`compare_file`
2. 参数：
   * `input.txt`：第一个要比较的文本文件名
   * `standard.txt`：标准输出文件名 （原文本：`o.txt`)
3. 返回值：无
4. 功能：比较两个文本文件是否相同，如果不同，则打印出不同的行号和具体差异。

以下是使用 `compare_files` 函数的步骤：

1. 按照以下方式调用函数：
```
compare_file("file1.txt", "file2.txt")
```
2. 其中，`file1.txt` 和 `file2.txt` 分别是要比较的两个文本文件的文件名。
   默认为`input.txt` 和 `standard.txt`比较，如果需要修改请放入自己的文件名。
   
3. 函数会逐行比较两个文件，并打印出差异行号和具体差异。如果两个文件长度不同，则也会打印出差异。
4. 如果两个文件相同，则函数会打印出 "文件 {file1} 和 {file2} 是相同的"。

# 新增literatureStats Junit test
原理和`a3algorithms`相同，使用时放入`tests`文件夹，直接运行，本次更新了10个自动测试。
- update : 另更新了文件3，现已支持所有类型的基本测试。
