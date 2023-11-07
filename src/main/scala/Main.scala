object MapMapFilterProgram {
  def main(args: Array[String]): Unit = {
    var myMap: Map[String, Int] = Map("Alice" -> 25, "Bob" -> 30, "Charlie" -> 22, "David" -> 28)

    println("Original map:")
    myMap.foreach { case (name, age) =>
      println(s"$name -> $age")
    }

    // Map: Increment each person's age by 1
    val mappedMap = myMap.map { case (name, age) =>
      name -> (age + 1)
    }

    // Filter: Keep only people older than or equal to 25
    val filteredMap = myMap.filter { case (_, age) =>
      age >= 25
    }

    println("\nMap: Incremented ages by 1:")
    mappedMap.foreach { case (name, age) =>
      println(s"$name -> $age")
    }

    println("\nFilter: People aged 25 and older:")
    filteredMap.foreach { case (name, age) =>
      println(s"$name -> $age")
    }
  }
}
