package X;

import com.facebook.neko.directinstall.installer.DirectInstallDownloadEvent;
import com.google.common.collect.HashBiMap;

/* renamed from: X.S3r  reason: case insensitive filesystem */
public final class C10982S3r {
    public final /* synthetic */ SOL A00;

    public C10982S3r(SOL sol) {
        this.A00 = sol;
    }

    public final /* synthetic */ void A00(C8896REo rEo) {
        A01(new DirectInstallDownloadEvent(rEo));
    }

    public final void A01(DirectInstallDownloadEvent directInstallDownloadEvent) {
        int i;
        double d;
        int i2;
        SOL sol = this.A00;
        HashBiMap hashBiMap = SOL.A09;
        synchronized (sol.A04) {
            QP0 qp0 = sol.A02;
            i = qp0.A02;
            d = qp0.A00;
            i2 = qp0.A01;
            Integer num = (Integer) SOL.A09.get(directInstallDownloadEvent.A02);
            if (num != null) {
                i = num.intValue();
            }
            Double d2 = directInstallDownloadEvent.A01;
            if (d2 != null) {
                d = d2.doubleValue();
            }
            RE5 re5 = directInstallDownloadEvent.A00;
            if (re5 != null) {
                Integer num2 = (Integer) SOL.A08.get(re5);
                if (num2 != null) {
                    i2 = num2.intValue();
                    d = 0.0d;
                }
            } else {
                i2 = 0;
            }
        }
        SOL.A00(sol, d, i, i2);
    }
}
