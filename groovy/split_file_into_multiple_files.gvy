
class Foo {
    def outFilename = ""
    def fos = null

public static void main(args) {
    new Foo().runMe()
}

void runMe() {
    new File("foo.txt").eachLine { line->
        if (line =~ /create/) {
            def m = line =~ /create .*package +(.*)/
            fos?.flush()
            outFilename = m[0][1] + ".sql"
            fos = new FileOutputStream(outFilename)
            println ( "new file " + outFileName)
        }
        fos.write(line)    
    }
    fos.flush()
}
}
