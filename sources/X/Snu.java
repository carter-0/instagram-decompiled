package X;

import com.facebook.msys.mci.NotificationCenterInternal$NotificationCallbackInternal;
import java.util.Map;

public final class Snu implements NotificationCenterInternal$NotificationCallbackInternal, AnonymousClass66d {
    public final int A00;
    public final Object A01;

    public Snu(C11223SFx sFx, int i) {
        this.A00 = i;
        this.A01 = sFx;
    }

    public final void onNewNotification(String str, AnonymousClass2Lq r6, Map map) {
        0ng rad;
        int i = this.A00;
        C11223SFx sFx = (C11223SFx) this.A01;
        switch (i) {
            case 0:
                rad = new RAD(sFx, map);
                break;
            case 1:
                rad = new RAE(sFx, map);
                break;
            default:
                rad = new RAF(sFx, map);
                break;
        }
        0no A002 = 0no.A00();
        0qQ.A07(A002);
        A002.A01(rad, 0);
    }
}
