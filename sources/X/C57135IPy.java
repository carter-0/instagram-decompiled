package X;

import android.view.View;

/* renamed from: X.IPy  reason: case insensitive filesystem */
public final class C57135IPy implements JPJ {
    public final /* synthetic */ C247003fc A00;
    public final /* synthetic */ C247433gK A01;
    public final /* synthetic */ C52244GKl A02;

    public C57135IPy(C247003fc r1, C247433gK r2, C52244GKl gKl) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = gKl;
    }

    public final void CsN() {
        if (((C247413gI) this.A01).A00 == C247003fc.SHARE_BUTTON || this.A00 == C247003fc.SHARE_BUTTON_NUDGE) {
            C52244GKl gKl = this.A02;
            gKl.A05.Djp((View) null, gKl.A01, gKl.A02, "content_notes_nux_primary", false);
        }
    }

    public final void CsO() {
        if (((C247413gI) this.A01).A00 == C247003fc.SHARE_BUTTON) {
            C52244GKl gKl = this.A02;
            gKl.A05.Djp((View) null, gKl.A01, gKl.A02, "content_notes_nux_secondary", false);
        }
    }
}
