package fr.razamelpar.lamzone.mareu.Modeles;

/**
 * Created by Alexandre Vanneçon "Razamelpar" on 15/10/2019.
 */
public enum ReunionRoom {

    BOWSER(1, "Bowser"),
    LUIGI(2, "Luigi"),
    MARIO(3, "Mario"),
    PEACH(4, "Peach"),
    TOAD(5, "Toad"),
    YOSHI(6, "Yoshi"),
    WARIO(7,"Wario"),
    DONKEYKONG(8,"Donkey Kong"),
    DIDDYKONG(9,"Diddy Kong"),
    DAISY(10,"Daisy");

    private int roomNumber;
    private String name;

    ReunionRoom(int roomNumber, String name) {
        this.roomNumber = roomNumber;
        this.name = name;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }

    public String[] getValues() {
        String[] strs = new String[ReunionRoom.values().length];
        int i = 1;

        for (ReunionRoom p: ReunionRoom.values())
            strs[i++] = p.toString().toLowerCase();

        return strs;
    }
}
