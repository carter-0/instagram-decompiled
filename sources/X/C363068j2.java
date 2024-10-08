package X;

/* renamed from: X.8j2  reason: invalid class name and case insensitive filesystem */
public final class C363068j2 {
    public final void A01(String str, String str2) {
        0qQ.A0B(str, 0);
        C363078j3 r3 = C363058j1.A00;
        String A00 = A00(str);
        0qQ.A0B(A00, 0);
        if (!0KC.A01.isLoggable(3) && r3.A00) {
            0KC.A0D(A00, str2);
        }
    }

    public final void A02(String str, String str2) {
        C363078j3 r3 = C363058j1.A00;
        String A00 = A00(str);
        0qQ.A0B(A00, 0);
        if (!0KC.A01.isLoggable(4) && r3.A00) {
            0KC.A0D(A00, str2);
        }
    }

    public final void A03(String str, String str2) {
        0qQ.A0B(str2, 1);
        0qQ.A0B(A00(str), 0);
    }

    public final void A04(String str, String str2, Throwable th) {
        String A00 = A00(str);
        0qQ.A0B(A00, 0);
        0KC.A0F(A00, str2, th);
    }

    public final void A06(String str, String str2, Throwable th) {
        String A00 = A00(str);
        0qQ.A0B(A00, 0);
        0KC.A0H(A00, str2, th);
    }

    public static final String A00(String str) {
        if (!00p.A0k(str, "sup:", false)) {
            return 002.A0R("sup:", str);
        }
        return str;
    }

    public final void A05(String str, String str2, Throwable th) {
        String A00 = A00(str);
        0qQ.A0B(A00, 0);
        0KC.A0G(A00, str2, th);
    }

    public final void A07(String str, String str2, Throwable th) {
        String A00 = A00(str);
        0qQ.A0B(A00, 0);
        0KC.A0I(A00, str2, th);
    }
}
