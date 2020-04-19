public class Bowling {

    public int runGame(int[] rounds) {
        int points = 0;
        int i = 0;

        if (rounds.length < 12 || rounds.length > 21) {
            return 0;
        }

        do {
            if (isStrike(rounds[i])) {
                points += rounds[i];
                points += rounds[i + 1];
                points += rounds[i + 2];
                i++;
            } else if (isSpare(rounds[i], rounds[i + 1])) {
                points += rounds[i];
                points += rounds[i + 1];
                points += rounds[i + 2];
                i += 2;
            } else {
                points += rounds[i];
                points += rounds[i + 1];
                i += 2;
            }
        } while (hasNextRound(i, rounds.length));
        return points;
    }

    public boolean isSpare(int actual, int next) {
        return (actual + next) == 10;
    }

    public boolean isStrike(int actual) {
        return actual == 10;
    }

    public boolean hasNextRound(int position, int size) {
        return (position + 2) < size;
    }
}
