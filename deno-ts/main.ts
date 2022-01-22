// store values
let heads = 0
let tails = 0


async function main(): Promise<void> {
    const amount = parseInt(Deno.args[0]);
    if (isNaN(amount)) {
        console.log("Please enter a number as the first argument");
        return;
    }
    // anon flip lambda
    const flip = async () : Promise<Boolean> => Math.random() < 0.5;

    // start the timer
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

main().catch(console.error);
