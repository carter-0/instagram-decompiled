package X;

/* renamed from: X.7xf  reason: invalid class name and case insensitive filesystem */
public final class C347967xf implements C347947xd {
    public static final C347967xf A00 = new Object();
    public static final C347957xe[] A01;
    public static final C347957xe A02;
    public static final String[] A03 = {"ig_meta_migrations"};

    /* JADX WARNING: type inference failed for: r0v2, types: [X.7xf, java.lang.Object] */
    static {
        C347957xe r1 = new C347957xe(1, "6b7603bffac240d4073c8a1b8f725fda0bbeb2a4", new String[]{"CREATE TABLE ig_meta_migrations\n(\nschema_name TEXT NOT NULL,\nsequence INTEGER NOT NULL,\nchecksum TEXT NOT NULL,\nPRIMARY KEY (schema_name, sequence)\n)"});
        A02 = r1;
        A01 = new C347957xe[]{r1};
    }

    public final String getName() {
        return "meta";
    }

    public final C347957xe[] BT1() {
        return A01;
    }

    public final String[] C3q() {
        return A03;
    }
}
