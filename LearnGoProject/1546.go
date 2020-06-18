package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func main() {
	in := bufio.NewScanner(os.Stdin)
	out := bufio.NewWriter(os.Stdout)

	max := 0
	sum := 0

	in.Split(bufio.ScanWords)

	in.Scan()

	a, _ := strconv.Atoi(in.Text())

	for i := 0; i < a; i++ {

		in.Scan()
		b, _ := strconv.Atoi(in.Text())
		sum += b

		if max < b {
			max = b
		}
	}

	res := float64(sum) / float64(max) / float64(a) * 100
	out.WriteString(fmt.Sprintf("%.2f", res))
	out.Flush()
}
