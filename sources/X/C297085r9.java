package X;

/* renamed from: X.5r9  reason: invalid class name and case insensitive filesystem */
public abstract class C297085r9 {
    public static final A7L A02(AnonymousClass0iw r1, 1Xj r2, Integer num, String str, boolean z) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(r1, 4);
        return new A7L(r1, r2, num, str, z);
    }

    public static final long A00(String str) {
        if (str != null) {
            String[] strArr = (String[]) new 11S("_").A03(str).toArray(new String[0]);
            if (strArr.length >= 2) {
                str = strArr[0];
            }
            0qQ.A0B(str, 0);
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e) {
                0KC.A0O("IgMutationHelper", "invalid id: %s", new Object[]{str, e});
            }
        }
        return 0;
    }

    public static final long A01(String str) {
        if (str != null) {
            String[] strArr = (String[]) new 11S("_").A03(str).toArray(new String[0]);
            if (strArr.length >= 2) {
                String str2 = strArr[1];
                0qQ.A0B(str2, 0);
                try {
                    return Long.parseLong(str2);
                } catch (NumberFormatException e) {
                    0KC.A0O("IgMutationHelper", "invalid id: %s", new Object[]{str2, e});
                }
            }
        }
        return 0;
    }
}
