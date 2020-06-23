package main

import (
	"fmt"
)

func main()  {
	var n int
	fmt.Scan(&n)
	a, b := 1, 1
	for ; n > 0; n-- {
		a, b = b, (a+b)%15746
	}
	fmt.Println(a)
}
