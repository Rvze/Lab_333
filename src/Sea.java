public class Sea {
    private String name;
    public Sea(String name){
        this.name=name;
    }

    public void destruct(Item item, DegreeOfBroke degreeOfBroke){
        item.setBroken(true);
        item.changeLongname(degreeOfBroke);
        System.out.println(getName()+' '+degreeOfBroke.name()+' '+item.getName());
    }
    public String getName() {
        return name;
    }
}
