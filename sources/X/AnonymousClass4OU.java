package X;

/* renamed from: X.4OU  reason: invalid class name */
public final class AnonymousClass4OU {
    public static final String[] A00(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return (String[]) new 11S("_").A03(str).toArray(new String[0]);
    }

    public final long A01(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        String[] A00 = A00(str);
        if (A00 != null && A00.length > 1) {
            str = A00[0];
        }
        0qQ.A0B(str, 0);
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }
}
