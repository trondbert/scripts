
def outFile = ""
new File("foo.txt").eachLine { line->
    if (line =~ /create/) {
        def m = line =~ /create .*package +(.*)/
        outFile = m[0][1] + ".sql"
        println outFile
    }
    
}
