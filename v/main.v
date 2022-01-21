module main

import os
import time
import rand

fn main() {
	// Storage 
	mut heads := 0
	mut tails := 0

	// How manyflipss to flip
	// 	flips := os.input('How many flips: ').int()
	mut flips := 10
	if os.args.len > 1 {
        flips = os.args[1].int()
    }

	// Anonymius flip function 
	flip := fn() bool {
		return rand.intn(2) != 0
	}

	// Start timer
	mut sw := time.new_stopwatch()

	// Run loop flips time
	for _ in 0..flips {
		if flip() {
			heads++
		} else {
			tails++
		}
	}

	println('elapsed: ${sw.elapsed().milliseconds()}ms')
	println('heads: $heads')
	println('tails: $tails')
	println('flips: $flips')
	println('heads ratio: ${heads/flips}')
	println('tails ratio: ${tails/flips}')


}
