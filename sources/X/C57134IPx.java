package X;

import android.view.View;

/* renamed from: X.IPx  reason: case insensitive filesystem */
public final class C57134IPx implements JPJ {
    public final /* synthetic */ C247003fc A00;
    public final /* synthetic */ C52250GKr A01;

    public C57134IPx(C247003fc r1, C52250GKr gKr) {
        this.A00 = r1;
        this.A01 = gKr;
    }

    public final void CsN() {
        C247003fc r1 = this.A00;
        if (r1 == C247003fc.SHARE_BUTTON || r1 == C247003fc.SHARE_BUTTON_NUDGE) {
            C52250GKr gKr = this.A01;
            JTC jtc = gKr.A02;
            C52091GEl gEl = gKr.A05;
            jtc.Djp((View) null, gEl.A03, gEl.A04, "content_notes_nux_primary", false);
        }
    }

    public final void CsO() {
        if (this.A00 == C247003fc.SHARE_BUTTON) {
            C52250GKr gKr = this.A01;
            JTC jtc = gKr.A02;
            C52091GEl gEl = gKr.A05;
            jtc.Djp((View) null, gEl.A03, gEl.A04, "content_notes_nux_secondary", false);
        }
    }
}
