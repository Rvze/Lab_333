public class Snork extends Character implements Mining{
    Knife knife;

    public Snork(String name, TypeOfPerson typeOfPerson) {
        super(name, typeOfPerson);
    }

    @Override
    public boolean mine(Item item) {
        return item.isMineable();
    }

    @Override
    public GoldPiece getGoldPieces(Item item) {
        if(item.isMineable()) {
            GoldPiece goldPiece = new GoldPiece();
            System.out.println(getName() + " gets "+goldPiece.sizeToString()+' '+goldPiece.getName());
            return goldPiece;
        }
        else return null;
    }

    public void toTakeKnife(Knife knife){
        this.knife=knife;
    }


}
