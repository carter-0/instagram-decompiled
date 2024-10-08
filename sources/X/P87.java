package X;

import android.view.MotionEvent;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

public final class P87 implements AnonymousClass7DS {
    public final /* synthetic */ C72558PAp A00;

    public P87(C72558PAp pAp) {
        this.A00 = pAp;
    }

    public final /* bridge */ /* synthetic */ boolean DRa(MotionEvent motionEvent, Object obj, Object obj2) {
        C328677Fs r6 = (C328677Fs) obj;
        C72558PAp pAp = this.A00;
        0qQ.A0A(r6);
        boolean BCL = r6.BCL();
        DirectMessageIdentifier directMessageIdentifier = r6.A01;
        AnonymousClass7XR r3 = pAp.A02;
        if (C70020Nvy.A00((C332927Wz) r3, directMessageIdentifier, BCL) || r6.Aqm() != 2FW.A0O) {
            return true;
        }
        ((C333117Xs) r3).Eu1(C327627Bo.NUX_TYPE_NONE, JTP.A0o(r6.A00), r6.CU2());
        return true;
    }
}
