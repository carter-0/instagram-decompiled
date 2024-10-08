package X;

/* renamed from: X.9w0  reason: invalid class name and case insensitive filesystem */
public abstract class C393169w0 {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "BGRA";
                break;
            case 2:
                str = "YUV_GL3";
                break;
            default:
                str = "DEFAULT";
                break;
        }
        return str.hashCode() + intValue;
    }
}
