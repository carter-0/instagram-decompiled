package X;

import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.PVi  reason: case insensitive filesystem */
public final class C73075PVi implements Runnable {
    public final /* synthetic */ C68449NIn A00;

    public C73075PVi(C68449NIn nIn) {
        this.A00 = nIn;
    }

    public final void run() {
        IgLinearLayout igLinearLayout = this.A00.A0J;
        if (igLinearLayout == null) {
            0qQ.A0F("noteTypeEntryPointsLayout");
            throw AnonymousClass00P.createAndThrow();
        } else {
            igLinearLayout.setVisibility(0);
        }
    }
}
