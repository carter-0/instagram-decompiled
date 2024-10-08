package X;

public abstract class VG1 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "food_delivery";
            case 2:
                return "get_quote";
            default:
                return "gift_card";
        }
    }
}
