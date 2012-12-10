def p = "cmd /c dir /B *.csv".execute()

def str = ""
str = p.text
def arr = str.split("\\\n")

arr.each { 
    m = it =~ /(\d\d)\.csv/
    if (m) {
        println "move $it vetInst2012${m[0][1]}.csv"
        def process = "cmd /c move $it vetInst2012${m[0][1]}.csv".execute()
        println process.text
        if (p.exitValue()) exit        
    }
}
"Finished"