package X;

import android.view.MotionEvent;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.P7x  reason: case insensitive filesystem */
public final class C72488P7x implements AnonymousClass7DS {
    public final /* synthetic */ C72548PAf A00;

    public C72488P7x(C72548PAf pAf) {
        this.A00 = pAf;
    }

    public final /* bridge */ /* synthetic */ boolean DRa(MotionEvent motionEvent, Object obj, Object obj2) {
        NYW nyw = (NYW) obj;
        PBT pbt = (PBT) obj2;
        C72548PAf pAf = this.A00;
        String str = nyw.BSG().A01;
        String str2 = nyw.A04;
        boolean BCL = nyw.BCL();
        0qQ.A0A(pbt);
        MessageIdentifier A0i = C66580MXl.A0i(str, (String) null);
        AnonymousClass7XR r1 = pAf.A01;
        if (C70020Nvy.A00((C332927Wz) r1, A0i, BCL)) {
            return true;
        }
        ((C332997Xg) r1).CpE(0nA.A0F(pbt.A03), (OMU) null, str2);
        return true;
    }
}
