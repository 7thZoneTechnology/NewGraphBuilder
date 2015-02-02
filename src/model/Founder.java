package model;

/**
 * @author Tarek Auel
 * @since Februar 01, 2015.
 */
public class Founder extends TeamMember {

    public String name;
    public String type = "Founder";

    @Override
    public String getRelType() {
        return "hasFounder";
    }
}
