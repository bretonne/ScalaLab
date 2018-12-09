val thrill = Array("Will", "fill", "until")
thrill(2)
thrill.count(s=>s.length==4)
//thrill.drop(2)
//thrill.dropRight(2)
thrill.exists(s=>s=="until")

thrill.filter(s=>s.length==4)

thrill.forall(s=>s.endsWith("l"))

//thrill.foreach(s=>print(s))

thrill.foreach(print)

thrill.head

thrill.init

thrill.isEmpty

thrill.last

thrill.foreach(s=>print(s + " "))

thrill.map(s=>s+"y")

thrill.mkString(",")

thrill.reverse

thrill.tail