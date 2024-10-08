package X;

import com.instagram.common.ui.base.IgEditText;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.PYn  reason: case insensitive filesystem */
public final class C73209PYn implements Runnable {
    public final /* synthetic */ C68449NIn A00;
    public final /* synthetic */ AudioOverlayTrack A01;

    public C73209PYn(C68449NIn nIn, AudioOverlayTrack audioOverlayTrack) {
        this.A00 = nIn;
        this.A01 = audioOverlayTrack;
    }

    public final void run() {
        C68449NIn nIn = this.A00;
        C68449NIn.A0O(nIn, this.A01, false);
        IgEditText igEditText = nIn.A0H;
        if (igEditText == null) {
            0qQ.A0F("noteEditText");
            throw AnonymousClass00P.createAndThrow();
        } else {
            0nA.A0N(igEditText);
        }
    }
}
