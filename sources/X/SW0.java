package X;

import android.os.IBinder;
import java.util.List;

public final /* synthetic */ class SW0 implements IBinder.DeathRecipient {
    public final /* synthetic */ SOT A00;

    public /* synthetic */ SW0(SOT sot) {
        this.A00 = sot;
    }

    public final void binderDied() {
        SOT sot = this.A00;
        C11229SGh sGh = sot.A06;
        sGh.A01("reportBinderDeath", Pxe.A1b());
        sot.A08.get();
        sGh.A01("%s : Binder has died.", "IntegrityService");
        List<TL4> list = sot.A09;
        for (TL4 A002 : list) {
            A002.A00(Pxj.A0I("IntegrityService"));
        }
        list.clear();
        SOT.A00(sot);
    }
}
