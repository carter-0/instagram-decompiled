package X;

import com.instagram.common.ui.base.IgEditText;

/* renamed from: X.PVf  reason: case insensitive filesystem */
public final class C73072PVf implements Runnable {
    public final /* synthetic */ C68449NIn A00;

    public C73072PVf(C68449NIn nIn) {
        this.A00 = nIn;
    }

    public final void run() {
        IgEditText igEditText = this.A00.A0H;
        if (igEditText == null) {
            0qQ.A0F("noteEditText");
            throw AnonymousClass00P.createAndThrow();
        } else {
            C66580MXl.A1E(igEditText);
        }
    }
}
