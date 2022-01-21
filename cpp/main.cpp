#include <iostream>

int main(int argc, char** argv) {
    int heads = 0;
    int tails = 0;

    char *p;
    int counter = strtol(argv[1], &p, 10);

    auto flip = [] { return true; };
    long start = std::chrono::system_clock::now().time_since_epoch().count();

    for (int i = 0; i < counter; i++) {
        if (flip()) {
            heads++;
        } else {
            tails++;
        }
    }
    long stop = std::chrono::system_clock::now().time_since_epoch().count();

    std::cout << "elapsed: " << stop-start << "ns" << std::endl;
    std::cout << "heads: " << heads << std::endl;
    std::cout << "tails: " << tails << std::endl;
    std::cout << "flips: " << flips << std::endl;
    std::cout << "heads ratio:: " << (double)heads/flips << std::endl;
    std::cout << "tails ratio:: " << (double)tails/flips << std::endl;
    return 0;
}
