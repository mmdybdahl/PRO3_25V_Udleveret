package musicplayer;

public class MusicPlayer {
    private String state;

    public MusicPlayer() {
        state = "Stopped";
    }

    public void play() {

        if (state.equals("Stopped")) {

            System.out.println("Starter musik...");
            state = "Playing";

        } else if (state.equals("Paused")) {

            System.out.println("Genoptager musik...");
            state = "Playing";

        } else if (state.equals("Playing")) {

            System.out.println("Musik spiller allerede.");

        }

        printState();
    }

    public void pause() {

        if (state.equals("Playing")) {

            System.out.println("Musik sat på pause.");
            state = "Paused";

        } else if (state.equals("Paused")) {

            System.out.println("Musik er allerede pauset.");

        } else if (state.equals("Stopped")) {

            System.out.println("Kan ikke pause. Ingen musik spiller.");

        }

        printState();
    }

    public void stop() {

        if (state.equals("Playing")) {

            System.out.println("Stopper musik.");
            state = "Stopped";

        } else if (state.equals("Paused")) {

            System.out.println("Stopper musik.");
            state = "Stopped";

        } else if (state.equals("Stopped")) {

            System.out.println("Musik er allerede stoppet.");

        }

        printState();
    }

    private void printState() {
        System.out.println("State: " + state);
        System.out.println();
    }
}
