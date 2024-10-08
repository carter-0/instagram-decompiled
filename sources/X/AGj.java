package X;

public abstract class AGj {
    public static final AnonymousClass95S A00;
    public static final AnonymousClass95S A01;
    public static final AnonymousClass95S A02;

    static {
        AnonymousClass95S r1 = (AnonymousClass95S) AnonymousClass95R.A00.A00("offlineexperiment/");
        A01 = r1;
        A02 = (AnonymousClass95S) r1.A00("values/");
        A00 = (AnonymousClass95S) r1.A00("exposed/");
    }

    public static final String A00(String str) {
        String A012 = A02.A00(002.A0C(str, '/')).A00("fdid/").A00("last_expose_time").A01();
        0qQ.A07(A012);
        return A012;
    }

    public static final String A01(String str) {
        String A012 = A02.A00(002.A0C(str, '/')).A00("fdid/").A00("unit_segment").A01();
        0qQ.A07(A012);
        return A012;
    }
}
