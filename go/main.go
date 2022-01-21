package main

import (
	"fmt"
	"math/rand"
	"os"
	"strconv"
	"time"
)

func main() {
	// make empty slice of ints
	var heads int
	var tails int
	// get 1st arg
	if len(os.Args) < 2 {
		fmt.Println("Usage: go run main.go <string>")
		os.Exit(1)
	}
	flips, _ := strconv.Atoi(os.Args[1])

	flip := func() bool {
		return rand.Intn(2) == 0
	}

	start := time.Now()

	for i := 0; i < flips; i++ {
		if flip() {
			heads++
		} else {
			tails++
		}
	}

	elapsed := time.Since(start)

    fmt.Printf("elapsed: %vms\n", elapsed.Milliseconds())
    fmt.Printf("heads: %d\n", heads)
    fmt.Printf("tails: %d\n", tails)
    fmt.Printf("flips: %d\n", flips)
    fmt.Printf("heads ratio: %f\n", float64(heads)/float64(flips))
    fmt.Printf("tails ratio: %f\n", float64(tails)/float64(flips))



}
