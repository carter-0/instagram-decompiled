package X;

import android.view.MotionEvent;
import com.instagram.model.direct.messageid.MessageIdentifier;

public final class P84 implements AnonymousClass7DS {
    public final /* synthetic */ C72550PAh A00;

    public P84(C72550PAh pAh) {
        this.A00 = pAh;
    }

    public final /* bridge */ /* synthetic */ boolean DRa(MotionEvent motionEvent, Object obj, Object obj2) {
        C68818NYc nYc = (C68818NYc) obj;
        C72550PAh pAh = this.A00;
        0qQ.A0A(nYc);
        boolean BCL = nYc.BCL();
        MessageIdentifier BSG = nYc.BSG();
        AnonymousClass7XR r2 = pAh.A01;
        if (C70020Nvy.A00((C332927Wz) r2, BSG, BCL)) {
            return true;
        }
        ((AnonymousClass7YE) r2).CqK(nYc.A06, nYc.BSG().A01);
        return true;
    }
}
