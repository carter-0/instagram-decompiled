package X;

public abstract class RUH {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "DO_NOTHING";
            case 1:
                return "SHOW_SAVE_DIALOG";
            case 2:
                return "SHOW_UPDATE_DIALOG";
            default:
                return "SHOW_OVERWRITE_DIALOG";
        }
    }
}
