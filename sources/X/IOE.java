package X;

import android.view.KeyEvent;

public final class IOE implements AnonymousClass4DM {
    public final /* synthetic */ C55955HqJ A00;
    public final /* synthetic */ C62320sa A01;

    public IOE(C55955HqJ hqJ, C62320sa r2) {
        this.A00 = hqJ;
        this.A01 = r2;
    }

    public final boolean onVolumeKeyPressed(AnonymousClass5FQ r6, KeyEvent keyEvent) {
        0qQ.A0B(r6, 0);
        C55955HqJ hqJ = this.A00;
        C54327H7y h7y = hqJ.A01;
        if (!AnonymousClass7TF.A1W(h7y.A04, JXT.STARTED) || !hqJ.A00 || r6 != AnonymousClass5FQ.VOLUME_UP) {
            return false;
        }
        hqJ.A00 = false;
        h7y.setVolume(1.0f);
        this.A01.invoke();
        return true;
    }
}
