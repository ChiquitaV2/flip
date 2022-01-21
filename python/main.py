import sys
import time
import random

# main method with arguments
def main(argv):
    heads = 0
    tails = 0
    # get first argument as integer
    counter = int(argv[0])
    # anon function random boolean
    random_boolean = lambda: random.choice([True, False])
    # start stopwatch
    start = time.time()
    # loop counter times
    for i in range(counter):
        # flip coin
        coin = random_boolean()
        if coin:
            heads += 1
        else:
            tails += 1
    # calculate elapsed time
    elapsed = time.time() - start

    # print results
    print("elapsed: %.3f ms" % (elapsed * 1000))
    print("heads: {}".format(heads))
    print("tails: {}".format(tails))
    print("flips: {}".format(counter))
    print("heads ratio: {}".format(heads / counter))
    print("tails ratio: {}".format(tails / counter))

if __name__ == "__main__":
    if len(sys.argv) > 1:
        main(sys.argv[1:])
    else:
        print("Usage: python main.py <number of flips>")