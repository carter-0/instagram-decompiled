package X;

public abstract class VBV {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "horizontal_cards";
            case 2:
                return "full_bleed_cards";
            default:
                return "text_cards";
        }
    }
}
