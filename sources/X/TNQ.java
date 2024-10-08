package X;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzs;
import java.util.concurrent.Callable;

public final /* synthetic */ class TNQ implements Callable {
    public final /* synthetic */ C10158RnZ A00;
    public final /* synthetic */ C13521Tbq A01;
    public final /* synthetic */ STX A02;

    public /* synthetic */ TNQ(C10158RnZ rnZ, C13521Tbq tbq, STX stx) {
        this.A02 = stx;
        this.A00 = rnZ;
        this.A01 = tbq;
    }

    public final Object call() {
        STX stx = this.A02;
        C10158RnZ rnZ = this.A00;
        C13521Tbq tbq = this.A01;
        try {
            zzs zzs = stx.A0K;
            String packageName = stx.A01.getPackageName();
            String str = rnZ.A00;
            String str2 = stx.A0G;
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putString("playBillingLibraryVersion", str2);
            Bundle FPZ = zzs.FPZ(A0a, packageName, str, 9);
            int A022 = SUN.A02(FPZ, "BillingClient");
            String A07 = SUN.A07(FPZ, "BillingClient");
            C11230SGo sGo = C10139RnG.A0J;
            tbq.Ct9(C11230SGo.A00(A07, A022));
            return null;
        } catch (Exception e) {
            SUN.A0B("BillingClient", "Error acknowledge purchase!", e);
            C13891TjE tjE = stx.A02;
            C11230SGo sGo2 = C10139RnG.A0D;
            Pxf.A1C(sGo2, tjE, 28, 3);
            tbq.Ct9(sGo2);
            return null;
        }
    }
}
