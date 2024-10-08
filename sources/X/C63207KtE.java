package X;

/* renamed from: X.KtE  reason: case insensitive filesystem */
public abstract class C63207KtE {
    public static final void A00(LE1 le1, MXB mxb, AnonymousClass3Q2 r6, boolean z) {
        String id;
        0qQ.A0B(le1, 3);
        if (!z || mxb == null || (id = mxb.getId()) == null || id.length() == 0 || le1.A01 != AnonymousClass05K.A00) {
            r6.A5t = false;
            r6.A3c = null;
            r6.A4d = null;
            if (mxb == null) {
                return;
            }
        } else {
            r6.A5t = true;
            r6.A3c = mxb.getId();
            if (le1.A05) {
                r6.A4d = AnonymousClass7TE.A1I(AnonymousClass000.A00(416));
            }
        }
        mxb.getId();
    }
}
