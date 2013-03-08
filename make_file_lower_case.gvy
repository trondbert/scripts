
class Foo {
    
public static void main(args) {
    def inFilename = args[0]    
    new Foo().runMe(inFilename)
}

void runMe(inFilename) {
    def outFile = new File(inFilename + ".tmp")
    def outWriter = new OutputStreamWriter(new FileOutputStream(outFile), "ISO-8859-1")
    def inFile = new File(inFilename)
    inFile.eachLine("ISO-8859-1") { line->
        println line
        outWriter << line.toLowerCase() + "\n"
    }
    outWriter.flush()
    outWriter.close()
    //inFile.renameTo(File.createTempFile("temp", ".bak"))
    //new File(outFilename).renameTo(new File("./result.txt"))
}
}
