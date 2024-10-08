package X;

public abstract class Re2 {
    public static final boolean A00(String str) {
        if (str.equals("PRE_FETCH") || str.equals("PRE_WARM")) {
            return true;
        }
        return false;
    }
}
