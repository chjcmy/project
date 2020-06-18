package main

import (
	"bufio"
	"os"
	"strconv"
)

func main() {

	in := bufio.NewScanner(os.Stdin)
	out := bufio.NewWriter(os.Stdout)

	max := 0
	count := 0

	for i := 1; i <= 9; i++ {
		in.Scan()
		a, _ := strconv.Atoi(in.Text())

		if a > max {
			max = a
			count = i
		}
	}

	out.WriteString(strconv.Itoa(max) + "\n")
	out.WriteString(strconv.Itoa(count) + "\n")
	out.Flush()
}
