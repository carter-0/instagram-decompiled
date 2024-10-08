package X;

/* renamed from: X.7Sz  reason: invalid class name and case insensitive filesystem */
public final class C331927Sz {
    public final AnonymousClass7T1[] A00 = {new Object(), new Object()};

    public final String A00(String str) {
        AnonymousClass7T1[] r4 = this.A00;
        int i = 0;
        do {
            AnonymousClass7T1 r1 = r4[i];
            if (r1.CmU(str)) {
                String hexString = Integer.toHexString(r1.EJr(str).hashCode());
                0qQ.A07(hexString);
                return hexString;
            }
            i++;
        } while (i < 2);
        throw new IllegalArgumentException(002.A0R("Cannot find Sanitizer for url=", str));
    }
}
