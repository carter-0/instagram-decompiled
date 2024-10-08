package X;

/* renamed from: X.VmE  reason: case insensitive filesystem */
public abstract class C18138VmE {
    public static final String A01(String str) {
        0qQ.A0B(str, 0);
        String A19 = AnonymousClass7TE.A19(DbV.A18(str, "_"), 0);
        if (00l.A0d(A19, ".", false)) {
            return DbU.A0t(DbV.A18(A19, "\\."), 1);
        }
        return A19;
    }

    public static final 1Yh A00() {
        1Yh r0 = 1Yh.A01;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("instance");
        throw AnonymousClass00P.createAndThrow();
    }
}
