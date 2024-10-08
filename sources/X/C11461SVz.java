package X;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;

/* renamed from: X.SVz  reason: case insensitive filesystem */
public final /* synthetic */ class C11461SVz implements IBinder.DeathRecipient {
    public final /* synthetic */ SOS A00;

    public /* synthetic */ C11461SVz(SOS sos) {
        this.A00 = sos;
    }

    public final void binderDied() {
        SOS sos = this.A00;
        C11228SGg sGg = sos.A06;
        sGg.A01("reportBinderDeath", Pxe.A1b());
        sos.A08.get();
        sGg.A01("%s : Binder has died.", "com.google.android.finsky.inappreviewservice.InAppReviewService");
        List<C13092TKz> list = sos.A09;
        for (C13092TKz tKz : list) {
            RemoteException A0I = Pxj.A0I("com.google.android.finsky.inappreviewservice.InAppReviewService");
            C365498nD r0 = tKz.A00;
            if (r0 != null) {
                r0.A02(A0I);
            }
        }
        list.clear();
        SOS.A00(sos);
    }
}
