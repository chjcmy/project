package main

import "fmt"

func main() {
	var a int

	fmt.Scan(&a)

	if a >= 90 && a <= 100 {
		fmt.Print("A")
	} else if a >= 80 && a <= 89 {
		fmt.Print("B")
	} else if a >= 70 && a <= 79 {
		fmt.Print("C")
	} else if a >= 60 && a <= 69 {
		fmt.Print("D")
	} else {
		fmt.Print("F")
	}
}
