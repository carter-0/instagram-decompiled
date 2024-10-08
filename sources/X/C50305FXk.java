package X;

/* renamed from: X.FXk  reason: case insensitive filesystem */
public final class C50305FXk implements C61110lV {
    public static String A00;
    public static String A01;
    public static String A02;
    public static final C50305FXk A03;

    public final boolean A00(0lg r4, String str) {
        String str2;
        if (!1AW.A06(DbS.A0J(r4, 2), 18302754023805739L) || Dbc.A12(r4, str) || (str2 = A02) == null || str2.length() == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.0lV, java.lang.Object, X.FXk] */
    static {
        ? obj = new Object();
        A03 = obj;
        14i.A05(obj);
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(-1496038186);
        A02 = null;
        A00 = null;
        A01 = null;
        AnonymousClass0fD.A0A(-10451535, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(1677661108, AnonymousClass0fD.A03(1906622948));
    }
}
