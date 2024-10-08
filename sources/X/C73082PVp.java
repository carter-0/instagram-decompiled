package X;

import com.instagram.common.ui.base.IgEditText;

/* renamed from: X.PVp  reason: case insensitive filesystem */
public final class C73082PVp implements Runnable {
    public final /* synthetic */ C68449NIn A00;

    public C73082PVp(C68449NIn nIn) {
        this.A00 = nIn;
    }

    public final void run() {
        C68449NIn nIn = this.A00;
        IgEditText igEditText = nIn.A0H;
        if (igEditText == null) {
            0qQ.A0F("noteEditText");
            throw AnonymousClass00P.createAndThrow();
        }
        igEditText.invalidate();
        nIn.A19.postDelayed(this, 16);
    }
}
