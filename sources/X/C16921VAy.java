package X;

/* renamed from: X.VAy  reason: case insensitive filesystem */
public abstract class C16921VAy {
    public static final boolean A00(long j) {
        C17981VjJ vjJ;
        VVU A00;
        C276694tk A002 = C276674ti.A00();
        if (A002 != null) {
            C17981VjJ vjJ2 = A002.A03;
            if (!(vjJ2.A00(j) != null || (vjJ = A002.A04) == null || (A00 = vjJ.A00(j)) == null)) {
                boolean A1a = AnonymousClass7TE.A1a(C276674ti.A01(C276704tl.UNTRACKED, A002, new GNG(8, A002, A00)));
                if (A1a) {
                    vjJ2.A01(A00, j, false);
                }
                return !A1a;
            }
        }
        return false;
    }
}
