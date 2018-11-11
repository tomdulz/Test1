package models;

import java.security.PublicKey;

public class Players {
    private String firstName;
    private String lastName;
    private String club;
    private int Age;
    private int gkSkill;
    private int defSkill;
    private int midSkill;
    private int attSkill;
    private boolean injury;

    public Players(String firstName, String lastName, String club, int Age, int gkSkill, int defSkill, int midSkill, int attSkill, boolean injury) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.club = club;
        this.Age = Age;
        this.gkSkill = gkSkill;
        this.defSkill = defSkill;
        this.midSkill = midSkill;
        this.attSkill = attSkill;
        this.injury = injury;
    }
    public String toString(){
        return "FirstName: " + this.firstName +
        "\nLastName: " + this.lastName +
        "\nClub: " + this.club + "\n";
    }
}
