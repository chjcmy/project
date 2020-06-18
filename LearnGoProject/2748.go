package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func main() {
	in := bufio.NewScanner(os.Stdin)
	var fibo [91]uint64
	in.Scan()
	a, _ := strconv.Atoi(in.Text())
	fibo[0] = 0
	fibo[1] = 1
	for i:=2; i<=a; i++ {
		fibo[i] = fibo[i-1] + fibo[i-2]
	}
	fmt.Print(fibo[a])
}