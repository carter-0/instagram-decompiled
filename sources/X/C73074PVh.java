package X;

import com.instagram.common.ui.base.IgEditText;

/* renamed from: X.PVh  reason: case insensitive filesystem */
public final class C73074PVh implements Runnable {
    public final /* synthetic */ C68449NIn A00;

    public C73074PVh(C68449NIn nIn) {
        this.A00 = nIn;
    }

    public final void run() {
        IgEditText igEditText = this.A00.A0I;
        if (igEditText == null) {
            0qQ.A0F("promptEditText");
            throw AnonymousClass00P.createAndThrow();
        } else {
            C66580MXl.A1E(igEditText);
        }
    }
}
