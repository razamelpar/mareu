package fr.razamelpar.lamzone.mareu.Modeles;

import android.graphics.Color;

/**
 * Created by Alexandre Vanneçon "Razamelpar" on 15/10/2019.
 */
public enum ReunionRoom {

    BOWSER(1, "Bowser", Color.argb(255,38, 196, 236)),
    LUIGI(2, "Luigi", Color.argb(255,131, 166, 151)),
    MARIO(3, "Mario", Color.argb(255,232, 214, 48)),
    PEACH(4, "Peach", Color.argb(255,231, 62, 1)),
    TOAD(5, "Toad", Color.argb(255,157, 62, 12)),
    YOSHI(6, "Yoshi", Color.argb(255,255, 0, 255)),
    WARIO(7, "Wario", Color.argb(255,254, 27, 0)),
    DONKEYKONG(8, "Donkey Kong", Color.argb(255,247, 35, 12)),
    DIDDYKONG(9, "Diddy Kong", Color.argb(255,20, 148, 20)),
    DAISY(10, "Daisy", Color.argb(255,249, 66, 158));

    private int roomNumber;
    private String name;
    private int color;

    ReunionRoom(int roomNumber, String name, int color) {
        this.roomNumber = roomNumber;
        this.name = name;
        this.color = color;
    }

    // Static method return ReunionRoom
    public static ReunionRoom getRoom(String name) {
        for (ReunionRoom room : ReunionRoom.values()) {
            if (room.name.equals(name)) {
                return room;
            }
        }
        return null;
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

        for (ReunionRoom p : ReunionRoom.values())
            strs[i++] = p.toString().toLowerCase();

        return strs;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
