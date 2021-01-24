import java.util.ArrayList;

public interface Mining {
    boolean mine(Item item);
    GoldPiece getGoldPieces(Item item);
}