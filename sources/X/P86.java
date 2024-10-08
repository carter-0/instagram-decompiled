package X;

import android.view.MotionEvent;
import com.instagram.model.direct.messageid.MessageIdentifier;

public final class P86 implements AnonymousClass7DS {
    public final /* synthetic */ C72552PAj A00;

    public P86(C72552PAj pAj) {
        this.A00 = pAj;
    }

    public final /* bridge */ /* synthetic */ boolean DRa(MotionEvent motionEvent, Object obj, Object obj2) {
        NYU nyu = (NYU) obj;
        C72552PAj pAj = this.A00;
        0qQ.A0A(nyu);
        boolean BCL = nyu.BCL();
        MessageIdentifier BSG = nyu.BSG();
        AnonymousClass7XR r3 = pAj.A01;
        if (C70020Nvy.A00((C332927Wz) r3, BSG, BCL)) {
            return true;
        }
        C68868Na0 na0 = nyu.A04;
        String str = na0.A04;
        ((AnonymousClass7XH) r3).Cpy(na0.A01, str, na0.A02, nyu.BSG().A01, na0.A03, na0.A05, -1, na0.A07);
        return true;
    }
}
