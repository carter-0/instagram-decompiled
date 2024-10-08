package X;

/* renamed from: X.LGo  reason: case insensitive filesystem */
public abstract class C63976LGo {
    public static String A01(Integer num) {
        if (num == null) {
            return "null";
        }
        switch (num.intValue()) {
            case 1:
                return "IG_DEBUG_PLAYGROUND";
            case 2:
                return "IG_MUSIC_STICKER";
            default:
                return "UNDEFINED";
        }
    }

    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "IG_DEBUG_PLAYGROUND";
                break;
            case 2:
                str = "IG_MUSIC_STICKER";
                break;
            default:
                str = "UNDEFINED";
                break;
        }
        return C51966G9m.A04(str, intValue);
    }
}
