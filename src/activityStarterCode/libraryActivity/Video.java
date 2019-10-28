package activityStarterCode.libraryActivity;

public class Video implements Media {
    private String title;
    private String director;
    private int numCopiesOwned;
    private int numCopies;

    Video(String title, String director, int numCopiesOwned) {
        this.title = title;
        this.director = director;
        this.numCopiesOwned = numCopiesOwned;
        numCopies = numCopiesOwned;
    }
    @Override
    public boolean checkOut() {
        if (numCopies > 0) {
            numCopies--;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean checkIn() {
        if(numCopies < numCopiesOwned) {
            numCopies++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String toString(){
        return "Video: " +this.title +" directed by, " +this.director +"\nAvailable: " +this.numCopies;
    }
}
