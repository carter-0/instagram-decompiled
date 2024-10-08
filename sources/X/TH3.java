package X;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class TH3 implements Runnable {
    public final /* synthetic */ C11350SOj A00;
    public final /* synthetic */ C11200SFa A01;

    public TH3(C11350SOj sOj, C11200SFa sFa) {
        this.A01 = sFa;
        this.A00 = sOj;
    }

    public final void run() {
        String str;
        C11350SOj sOj = this.A00;
        C8339Qop qop = (C8339Qop) sOj.A07;
        C8336Qom qom = (C8336Qom) sOj.A01(C8336Qom.class);
        if (TextUtils.isEmpty(qom.A02)) {
            C8483QvV qvV = qop.A01.A08;
            C11381SQt.A02(qvV);
            qom.A02 = qvV.A0K();
        }
        if (qop.A00 && TextUtils.isEmpty(qom.A04)) {
            C8488Qva qva = qop.A01.A05;
            C11381SQt.A02(qva);
            qva.A0J();
            AdvertisingIdClient.Info A002 = C8488Qva.A00(qva);
            if (A002 != null) {
                str = A002.A00;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            qom.A04 = str;
            qva.A0J();
            AdvertisingIdClient.Info A003 = C8488Qva.A00(qva);
            boolean z = false;
            if (A003 != null && !A003.A01) {
                z = true;
            }
            qom.A06 = z;
        }
        Iterator it = this.A01.A03.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass7TE.A11("zza");
        }
        AnonymousClass3Qk.A05("deliver should be called from worker thread");
        AnonymousClass3Qk.A08(sOj.A03, "Measurement must be submitted");
        List<C13740TgC> list = sOj.A08;
        if (!list.isEmpty()) {
            HashSet A1F = AnonymousClass7TE.A1F();
            for (C13740TgC tgC : list) {
                Uri FPA = tgC.FPA();
                if (!A1F.contains(FPA)) {
                    A1F.add(FPA);
                    tgC.FPI(sOj);
                }
            }
        }
    }
}
