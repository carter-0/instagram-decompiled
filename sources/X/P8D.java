package X;

import android.view.MotionEvent;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.messageid.MessageIdentifier;

public final class P8D implements AnonymousClass7DS {
    public final /* synthetic */ AnonymousClass7X4 A00;
    public final /* synthetic */ C72545PAc A01;

    public P8D(AnonymousClass7X4 r1, C72545PAc pAc) {
        this.A01 = pAc;
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.7X4, X.7VW] */
    public final /* bridge */ /* synthetic */ boolean DRa(MotionEvent motionEvent, Object obj, Object obj2) {
        NYZ nyz = (NYZ) obj;
        MessageIdentifier BSG = nyz.BSG();
        MessagingUser messagingUser = nyz.A02;
        boolean BCL = nyz.BCL();
        ? r1 = this.A00;
        if (BCL) {
            ((C332927Wz) r1).EuX(BSG);
            return true;
        }
        r1.CqM(messagingUser, "direct_thread_profile_message");
        return true;
    }
}
