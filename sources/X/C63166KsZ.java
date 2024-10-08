package X;

/* renamed from: X.KsZ  reason: case insensitive filesystem */
public abstract class C63166KsZ {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "DRAGGING";
            case 2:
                return "PRESSED";
            case 3:
                return "HIDDEN";
            case 4:
                return "AUDIO_LOADING";
            case 5:
                return "AUDIO_EMPTY";
            case 6:
                return "AUDIO_ADJUSTING";
            case 7:
                return "TEXT_EMPTY";
            default:
                return "DEFAULT";
        }
    }
}
