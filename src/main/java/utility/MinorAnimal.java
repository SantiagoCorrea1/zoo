/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

/**
 *
 * @author SANTIAGO
 */
public class MinorAnimal extends Animal{
    
    private String vulgarName;
    private String habitat;
    private String use;

    public MinorAnimal(String vulgarName, String habitat, String use, int code, String name, float weigth) {
        super(code, name, weigth);
        this.vulgarName = vulgarName;
        this.habitat = habitat;
        this.use = use;
    }

    public MinorAnimal() {
    }

    /**
     * @return the vulgarName
     */
    public String getVulgarName() {
        return vulgarName;
    }

    /**
     * @param vulgarName the vulgarName to set
     */
    public void setVulgarName(String vulgarName) {
        this.vulgarName = vulgarName;
    }

    /**
     * @return the habitat
     */
    public String getHabitat() {
        return habitat;
    }

    /**
     * @param habitat the habitat to set
     */
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    /**
     * @return the use
     */
    public String getUse() {
        return use;
    }

    /**
     * @param use the use to set
     */
    public void setUse(String use) {
        this.use = use;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MinorAnimal{vulgarName=").append(vulgarName);
        sb.append(", habitat=").append(habitat);
        sb.append(", use=").append(use);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
