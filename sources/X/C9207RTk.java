package X;

/* renamed from: X.RTk  reason: case insensitive filesystem */
public abstract class C9207RTk {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "RESOURCE_CACHE";
            case 2:
                return "DATA_CACHE";
            case 3:
                return "SOURCE";
            case 4:
                return "ENCODE";
            case 5:
                return "FINISHED";
            default:
                return "INITIALIZE";
        }
    }
}
