package X;

/* renamed from: X.KwM  reason: case insensitive filesystem */
public abstract class C63401KwM {
    public static final Long A00(C255773uh r2) {
        1iA r0;
        1Xj r1 = r2.A0b;
        C270194gL r02 = r2.A0c;
        if (r1 != null) {
            r0 = r1.BR7();
        } else if (r02 == null) {
            return null;
        } else {
            C278114wI r03 = r02.A06;
            if (r03 == null) {
                r03 = C278114wI.UNKNOWN;
            }
            if (r03.A01()) {
                r0 = 1iA.A0M;
            } else {
                r0 = 1iA.A0L;
            }
        }
        return DbS.A0j(r0.A00);
    }
}
