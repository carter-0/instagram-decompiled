package X;

import android.view.ViewGroup;
import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.WnJ  reason: case insensitive filesystem */
public final class C20219WnJ implements Runnable {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ C14332TuD A01;

    public C20219WnJ(ViewGroup viewGroup, C14332TuD tuD) {
        this.A01 = tuD;
        this.A00 = viewGroup;
    }

    public final void run() {
        C14332TuD tuD = this.A01;
        IgFrameLayout igFrameLayout = tuD.A01;
        if (igFrameLayout != null) {
            igFrameLayout.removeView(tuD.A06);
        }
        ViewGroup viewGroup = tuD.A07;
        if (viewGroup != null) {
            viewGroup.addView(tuD.A06, tuD.A00);
        }
        this.A00.setVisibility(0);
        AnonymousClass7TH.A0R(tuD.A01);
    }
}
