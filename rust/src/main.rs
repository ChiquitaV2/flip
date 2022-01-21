use std::env;
use rand::Rng;

fn main() {
    // get 1st argument as int
    let mut args = env::args();
    let count = args.nth(1).unwrap().parse::<i128>().unwrap();
    let mut heads = 0;
    let mut tails = 0;
    // random boolean
    let coin_flip = || {
        let mut rng = rand::thread_rng();
        return rng.gen_range(0..2) != 0;
    };

    // start timer
    let start = std::time::Instant::now();

    for _ in 0..count {
        if coin_flip() {
            heads+=1;
        } else {
            tails+=1;
        }
    }
    // stop timer
    let end = std::time::Instant::now();
    // calculate elapsed time
    let elapsed = end.duration_since(start);
    // print results
    println!("elapsed: {}ms", elapsed.as_millis());
    println!("heads: {}", heads);
    println!("tails: {}", tails);
    println!("flips: {}", count);
    println!("heads ratio: {}", heads as f64 / count as f64);
    println!("tails ratio: {}", tails as f64 / count as f64);
}
