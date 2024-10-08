package X;

import android.content.pm.PackageManager;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;

public final class S2E {
    public C249513ju A00;
    public AnonymousClass0r6 A01;
    public 05G A02 = 106.A01((Object) null);

    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, X.SGZ] */
    public final void A00(FragmentActivity fragmentActivity) {
        C249513ju r1;
        Object obj;
        int i;
        0qQ.A0B(fragmentActivity, 0);
        1HR r0 = new 1HR(0);
        this.A00 = r0;
        this.A01 = 0u9.A04(r0);
        this.A02 = 106.A01((Object) null);
        Q2D q2d = new Q2D(new Q2E(fragmentActivity));
        S2Z s2z = new S2Z();
        s2z.A02 = fragmentActivity.getString(2131976370);
        s2z.A00 = 255;
        s2z.A04 = false;
        int A03 = q2d.A03(255);
        boolean A1Q = AnonymousClass7TF.A1Q(q2d.A03(15));
        boolean A1Q2 = AnonymousClass7TF.A1Q(A03);
        if (A1Q) {
            PackageManager packageManager = fragmentActivity.getPackageManager();
            if (Build.VERSION.SDK_INT < 29 || packageManager == null || !(packageManager.hasSystemFeature("android.hardware.biometrics.face") || packageManager.hasSystemFeature("android.hardware.biometrics.iris"))) {
                i = 2131976372;
            } else {
                i = 2131976373;
            }
        } else if (A1Q2) {
            i = 2131976371;
        } else {
            if (A03 == -2) {
                r1 = this.A00;
                obj = C11279SIt.A00;
            } else if (A03 == -1) {
                r1 = this.A00;
                obj = C11278SIs.A00;
            } else if (A03 == 1) {
                r1 = this.A00;
                obj = C11276SIq.A00;
            } else if (A03 == 15) {
                r1 = this.A00;
                obj = C11277SIr.A00;
            } else if (A03 != 11) {
                if (A03 == 12) {
                    r1 = this.A00;
                    obj = C11275SIp.A00;
                }
                this.A00.AI3((Throwable) null);
                this.A02.Epw(false);
                return;
            } else {
                r1 = this.A00;
                obj = SIn.A00;
            }
            r1.FIG(obj);
            this.A00.AI3((Throwable) null);
            this.A02.Epw(false);
            return;
        }
        s2z.A03 = fragmentActivity.getString(i);
        QAT qat = new QAT(this, 1);
        ? obj2 = new Object();
        0hq supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        QDG A0M = Pxj.A0M(fragmentActivity);
        obj2.A00 = supportFragmentManager;
        if (A0M != null) {
            A0M.A04 = qat;
        }
        SGZ.A00((SR5) null, s2z.A00(), obj2);
    }

    public S2E() {
        1HR r0 = new 1HR(0);
        this.A00 = r0;
        this.A01 = 0u9.A04(r0);
    }
}
