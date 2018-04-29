def writefile(output):
    with open("Output.txt", "w") as text_file:
        text_file.write(output)

with open('Main.java', 'r') as myfile:
    oldfile=myfile.read().replace('\n', '\\n ')

print oldfile
oldfile.replace("   ", "    ")
writefile(oldfile)
