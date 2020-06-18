package main

import (
	"bufio"
	"os"
	"strconv"
)

func main() {
	in := bufio.NewScanner(os.Stdin)
	out := bufio.NewWriter(os.Stdout)

	a := 1

	for i := 0; i < 3; i++ {
		in.Scan()
		b, _ := strconv.Atoi(in.Text())
		a = a * b
	}

	var sum [10]int

	for i := 0; i < 10; i++ {
		sum[i] = 0
	}

	for a > 0 {
		num := a % 10
		sum[num] += 1
		a = a / 10
	}
	for i := 0; i < 10; i++ {
		out.WriteString(strconv.Itoa(sum[i]) + "\n")
	}
	out.Flush()
}
