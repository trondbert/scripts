assert "oot" == "Footer"[1..-3]

//Replace all accepts a closure as a second argument
assert "Headlines And Deadlines" ==
  "headlines and deadlines".replaceAll(/\w+/,
      {it[0].toUpperCase() + (it.size() > 1 ? it[1..-1] : "")}
  )
  
//Lookahead
assert      "str5" =~ /str(?=5)/
//Boolean or a Matcher
def matcher = "str5" =~ /str(?=5)/
assert matcher[0] == "str"

//Whole match, then groups
matcher = "str5 berry halle" =~ /str(?=5).*(b.*y) (\w+)/
assert matcher[0] == ["str5 berry halle", "berry", "halle"]

