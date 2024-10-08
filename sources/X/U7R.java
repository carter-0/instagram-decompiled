package X;

import android.view.View;

public final class U7R extends AnonymousClass0uU {
    public final /* synthetic */ 2X4 A00;

    public U7R(2X4 r1) {
        this.A00 = r1;
    }

    public final void CvE(View view) {
        2X4 r2 = this.A00;
        r2.A0M.setAlpha(1.0f);
        r2.A0O.A07((AnonymousClass04L) null);
        r2.A0O = null;
    }

    public final void CvM(View view) {
        2X4 r2 = this.A00;
        r2.A0M.setVisibility(0);
        if (r2.A0M.getParent() instanceof View) {
            ((View) r2.A0M.getParent()).requestApplyInsets();
        }
    }
}
