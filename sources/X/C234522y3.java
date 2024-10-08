package X;

import android.view.KeyEvent;
import android.view.View;

/* renamed from: X.2y3  reason: invalid class name and case insensitive filesystem */
public final class C234522y3 implements AnonymousClass4DM {
    public final /* synthetic */ C234422xq A00;

    public C234522y3(C234422xq r1) {
        this.A00 = r1;
    }

    public final boolean onVolumeKeyPressed(AnonymousClass5FQ r5, KeyEvent keyEvent) {
        0qQ.A0B(r5, 0);
        0qQ.A0B(keyEvent, 1);
        C234422xq r3 = this.A00;
        View view = new View(r3.A02);
        int i = 25;
        if (r5 == AnonymousClass5FQ.VOLUME_UP) {
            i = 24;
        }
        return r3.onKey(view, i, keyEvent);
    }
}
