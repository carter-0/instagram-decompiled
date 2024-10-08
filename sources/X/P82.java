package X;

import android.view.MotionEvent;
import com.instagram.model.direct.messageid.MessageIdentifier;

public final class P82 implements AnonymousClass7DS {
    public final AnonymousClass7XH A00;

    public final /* bridge */ /* synthetic */ boolean DRa(MotionEvent motionEvent, Object obj, Object obj2) {
        C328697Fu r15 = (C328697Fu) obj;
        C69608Noq noq = r15.A08;
        boolean BCL = r15.BCL();
        AnonymousClass7XH r4 = this.A00;
        if (C70020Nvy.A00((C332927Wz) r4, (MessageIdentifier) r15.A0F.getValue(), BCL) || noq == null || !(noq instanceof C68868Na0)) {
            return true;
        }
        C68868Na0 na0 = (C68868Na0) noq;
        String str = na0.A04;
        r4.Cpy(na0.A01, str, na0.A02, na0.A06, na0.A03, na0.A05, na0.A00, na0.A07);
        return true;
    }

    public P82(AnonymousClass7XH r1) {
        this.A00 = r1;
    }
}
