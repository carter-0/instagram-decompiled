package X;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzs;
import java.util.concurrent.Callable;

public final /* synthetic */ class TNL implements Callable {
    public final /* synthetic */ STX A00;
    public final /* synthetic */ C10159Rna A01;
    public final /* synthetic */ C13522Tbr A02;

    public /* synthetic */ TNL(STX stx, C10159Rna rna, C13522Tbr tbr) {
        this.A00 = stx;
        this.A01 = rna;
        this.A02 = tbr;
    }

    public final Object call() {
        int FOu;
        String str;
        STX stx = this.A00;
        C10159Rna rna = this.A01;
        C13522Tbr tbr = this.A02;
        String str2 = rna.A00;
        try {
            SUN.A09("BillingClient", 002.A0R("Consuming purchase with token: ", str2));
            if (stx.A06) {
                zzs zzs = stx.A0K;
                String packageName = stx.A01.getPackageName();
                boolean z = stx.A06;
                String str3 = stx.A0G;
                Bundle A0a = AnonymousClass7TE.A0a();
                if (z) {
                    A0a.putString("playBillingLibraryVersion", str3);
                }
                Bundle FPh = zzs.FPh(A0a, packageName, str2, 9);
                FOu = FPh.getInt("RESPONSE_CODE");
                str = SUN.A07(FPh, "BillingClient");
            } else {
                FOu = stx.A0K.FOu(3, stx.A01.getPackageName(), str2);
                str = "";
            }
            C11230SGo sGo = C10139RnG.A0J;
            C11230SGo A002 = C11230SGo.A00(str, FOu);
            if (FOu == 0) {
                SUN.A09("BillingClient", "Successfully consumed purchase.");
            } else {
                SUN.A0A("BillingClient", 002.A0O("Error consuming purchase with token. Response code: ", FOu));
                Pxf.A1C(A002, stx.A02, 23, 4);
            }
            tbr.D5u(A002, str2);
            return null;
        } catch (Exception e) {
            SUN.A0B("BillingClient", "Error consuming purchase!", e);
            C13891TjE tjE = stx.A02;
            C11230SGo sGo2 = C10139RnG.A0D;
            Pxf.A1C(sGo2, tjE, 29, 4);
            tbr.D5u(sGo2, str2);
            return null;
        }
    }
}
