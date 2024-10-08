package X;

import android.view.KeyEvent;

/* renamed from: X.8VU  reason: invalid class name */
public final class AnonymousClass8VU implements AnonymousClass4DM {
    public final /* synthetic */ AnonymousClass80R A00;

    public AnonymousClass8VU(AnonymousClass80R r1) {
        this.A00 = r1;
    }

    public final boolean onVolumeKeyPressed(AnonymousClass5FQ r3, KeyEvent keyEvent) {
        AnonymousClass80R r1 = this.A00;
        if (((C357358Xo) r1.A0H.A00.A00()).A06()) {
            return false;
        }
        return r1.A0l.onVolumeKeyPressed(r3, keyEvent);
    }
}
