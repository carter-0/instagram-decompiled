package X;

/* renamed from: X.Sl8  reason: case insensitive filesystem */
public final class C12046Sl8 implements C13551TcN {
    public final /* synthetic */ C10791RyD A00;

    public C12046Sl8(C10791RyD ryD) {
        this.A00 = ryD;
    }

    public final void D1z(C11347SOg sOg) {
        C10791RyD ryD = this.A00;
        C340037kb r3 = ryD.A05;
        C340027ka r2 = ryD.A04;
        sOg.A03(ryD.A01, ryD.A02, r2, r3);
        QA3 qa3 = ryD.A00;
        if (qa3 != null && qa3.isShowing()) {
            QA3 qa32 = ryD.A00;
            if (qa32 != null) {
                qa32.dismiss();
            }
            ryD.A00 = null;
        }
    }
}
