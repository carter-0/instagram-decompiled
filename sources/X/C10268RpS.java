package X;

/* renamed from: X.RpS  reason: case insensitive filesystem */
public final class C10268RpS {
    public final String A00;

    public C10268RpS(String str, String str2) {
        int length = str.length();
        boolean z = false;
        Object[] A1Z = C51968G9o.A1Z(str, 23);
        if (length <= 23 ? true : z) {
            this.A00 = (str2 == null || str2.length() <= 0) ? null : str2;
            return;
        }
        throw Pxf.A0X("tag \"%s\" is longer than the %d character maximum", A1Z);
    }
}
