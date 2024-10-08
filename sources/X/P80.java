package X;

import android.view.MotionEvent;
import com.instagram.model.direct.messageid.MessageIdentifier;

public final class P80 implements AnonymousClass7DS {
    public final /* synthetic */ C72560PAr A00;

    public P80(C72560PAr pAr) {
        this.A00 = pAr;
    }

    public final /* bridge */ /* synthetic */ boolean DRa(MotionEvent motionEvent, Object obj, Object obj2) {
        NYI nyi = (NYI) obj;
        boolean BCL = nyi.BCL();
        MessageIdentifier BSG = nyi.BSG();
        AnonymousClass7XR r4 = this.A00.A04;
        if (!C70020Nvy.A00((C332927Wz) r4, BSG, BCL)) {
            C69603Nol nol = nyi.A01;
            if (!(nol instanceof C68859NZr)) {
                return false;
            }
            AnonymousClass7VM r42 = (AnonymousClass7VM) r4;
            0qQ.A0C(nol, "null cannot be cast to non-null type com.instagram.direct.messagethread.linkmessage.model.LinkContentViewModel.PreviewFields.Preview");
            String str = ((C68859NZr) nol).A05;
            if (str == null) {
                str = "";
            }
            r42.Cqo(str, nyi.A03, (String) null);
        }
        return true;
    }
}
