package X;

import android.view.KeyEvent;
import android.view.ViewGroup;

/* renamed from: X.2xd  reason: invalid class name and case insensitive filesystem */
public final class C234302xd implements AnonymousClass4DM {
    public final /* synthetic */ AnonymousClass2xS A00;

    public C234302xd(AnonymousClass2xS r1) {
        this.A00 = r1;
    }

    public final boolean onVolumeKeyPressed(AnonymousClass5FQ r5, KeyEvent keyEvent) {
        ViewGroup CEd;
        0qQ.A0B(r5, 0);
        0qQ.A0B(keyEvent, 1);
        AnonymousClass2xS r1 = this.A00;
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        C238133Ar r0 = r1.A03;
        if (r0 == null || (CEd = r0.CEd()) == null) {
            return false;
        }
        C232722uK r2 = r1.A0G;
        int i2 = 25;
        if (r5 == AnonymousClass5FQ.VOLUME_UP) {
            i2 = 24;
        }
        return r2.onKey(CEd, i2, keyEvent);
    }
}
