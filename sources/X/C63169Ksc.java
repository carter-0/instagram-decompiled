package X;

/* renamed from: X.Ksc  reason: case insensitive filesystem */
public abstract class C63169Ksc {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "UPLOAD";
                break;
            case 2:
                str = "REMIX_ORIGINAL";
                break;
            case 3:
                str = "SEQUENTIAL_REMIX_ORIGINAL";
                break;
            case 4:
                str = "AUDIO_BROWSER";
                break;
            default:
                str = "SEGMENT_REVIEW";
                break;
        }
        return C51966G9m.A04(str, intValue);
    }
}
