package tile;

public class Tile {

    private boolean hasMine;
    private boolean isCleared;
    private boolean hasFlag;
    private int numberAdjacentMines;

    public Tile() {
        hasMine = false;
        isCleared = false;
        hasFlag = false;
        numberAdjacentMines = -1;
    }

    public void print() {
        if (hasMine) {
            System.out.print("*");
        } else {
            if (this.numberAdjacentMines == 0) {
                System.out.print("-");
            } else {
                System.out.print(this.numberAdjacentMines);
            }
        }
    }

    public void playerPrint() {
        if (isCleared) {
            if (this.numberAdjacentMines == 0) {
                System.out.print(" ");
            } else {
                System.out.print(this.numberAdjacentMines);
            }
        }
        else {
            if (hasFlag) {
                System.out.print("F");
            }
            else {
                System.out.print("#");
            }
        }
    }

    public boolean isHasMine() {
        return hasMine;
    }

    public void setHasMine(boolean hasMine) {
        this.hasMine = hasMine;
    }

    public boolean isIsCleared() {
        return isCleared;
    }

    public void setIsCleared(boolean isCleared) {
        this.isCleared = isCleared;
    }

    public boolean isHasFlag() {
        return hasFlag;
    }

    public void setHasFlag(boolean hasFlag) {
        this.hasFlag = hasFlag;
    }

    public int getNumberAdjacentMines() {
        return numberAdjacentMines;
    }

    public void setNumberAdjacentMines(int numberAdjacentMines) {
        this.numberAdjacentMines = numberAdjacentMines;
    }

}