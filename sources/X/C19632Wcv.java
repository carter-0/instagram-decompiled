package X;

/* renamed from: X.Wcv  reason: case insensitive filesystem */
public final class C19632Wcv implements X53 {
    public final /* synthetic */ C19655WdJ A00;

    public C19632Wcv(C19655WdJ wdJ) {
        this.A00 = wdJ;
    }

    public final void DZt(C243373Ym r7) {
        long j;
        1QP r1;
        String str;
        0qQ.A0B(r7, 0);
        if (r7 == C243373Ym.SAVED) {
            C17839Vgs A002 = C17054VGc.A00(this.A00.A00);
            j = A002.A00;
            if (j > 0) {
                r1 = A002.A01;
                str = "SAVE_PRODUCT";
            } else {
                return;
            }
        } else if (r7 == C243373Ym.NOT_SAVED) {
            C17839Vgs A003 = C17054VGc.A00(this.A00.A00);
            j = A003.A00;
            if (j > 0) {
                r1 = A003.A01;
                str = "UNSAVE_PRODUCT";
            } else {
                return;
            }
        } else {
            return;
        }
        r1.flowMarkPoint(j, str);
    }
}
