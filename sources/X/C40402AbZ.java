package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* renamed from: X.AbZ  reason: case insensitive filesystem */
public final class C40402AbZ implements C13754TgQ {
    public final /* synthetic */ AnonymousClass8PZ A00;

    public final void DtS(C349307zv r6, int i) {
        ViewParent viewParent;
        AnonymousClass8PZ r3 = this.A00;
        FrameLayout frameLayout = r3.A06;
        if (frameLayout != null) {
            viewParent = frameLayout.getParent();
        } else {
            viewParent = null;
        }
        ViewGroup viewGroup = (ViewGroup) viewParent;
        if (viewGroup != null) {
            viewGroup.removeView(r3.A06);
        }
        r3.A06 = null;
        AnonymousClass8PZ.A00(r3, true);
        r3.A0I.A01(r6.A09, r6.A0k, false);
    }

    public final void DtT(Exception exc, boolean z) {
        0kD.A0C("GreenScreenReviewController", "transcode params failed", exc);
        AnonymousClass8PZ.A00(this.A00, false);
    }

    public C40402AbZ(AnonymousClass8PZ r1) {
        this.A00 = r1;
    }
}
