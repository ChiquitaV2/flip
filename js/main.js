
let heads = 0
let tails = 0

const main = async () => {
    const amount = process.argv.slice(2)[0];
    console.time("elapsed");
    for (let i = 0; i < amount; i++) {
      if (await flip()) {
        heads++
      } else {
        tails++
      }
    }

    // end of stopwatch
    console.timeEnd("elapsed");

    // print raw results
    console.log("heads: " + heads)
    console.log("tails: " + tails);
    console.log("flips: " + amount);

    // print ratios
    console.log("heads ratio: " + (heads / amount));
    console.log("tails ratio: " + (tails / amount));
}

const flip = async () => Math.random() < 0.5;


main();
