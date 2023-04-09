def compare_files(file1, file2):
    """比较两个文本文件是否相同，如果不同，则打印出不同的行号"""
    with open(file1, 'r') as f1, open(file2, 'r') as f2:
        differences_found = False
        # 逐行比较两个文件
        for line_number, (line1, line2) in enumerate(zip(f1, f2), start=1):
            if line1 != line2:
                # 打印不同的行号和具体差异
                print(f"文件 {file1} 和 {file2} 在第 {line_number} 行不同：")
                print(f"{file1} 的内容: {line1.strip()}")
                print(f"{file2} 的内容: {line2.strip()}")
                differences_found = True

        # 如果两个文件长度不同，则打印差异
        if f1.readline() != '' or f2.readline() != '':
            print(f"文件 {file1} 和 {file2} 长度不同")
            differences_found = True

        # 如果没有发现差异，输出文件相同
        if not differences_found:
            print(f"文件 {file1} 和 {file2} 是相同的")
compare_files("input.txt", "standard.txt")