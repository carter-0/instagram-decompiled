package X;

import android.net.Uri;
import android.os.Bundle;
import java.util.HashMap;

public final class TK5 implements Runnable {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ SPF A02;
    public final /* synthetic */ C340037kb A03;
    public final /* synthetic */ QLA A04;

    public TK5(Uri uri, Bundle bundle, SPF spf, C340037kb r4, QLA qla) {
        this.A03 = r4;
        this.A04 = qla;
        this.A00 = uri;
        this.A02 = spf;
        this.A01 = bundle;
    }

    public final void run() {
        long j;
        String str;
        String obj;
        C340037kb r5 = this.A03;
        QLA qla = this.A04;
        Uri uri = this.A00;
        SPF spf = this.A02;
        r5.CgD(uri, qla, (String) null, spf.A04.A00());
        Bundle bundle = this.A01;
        Object obj2 = bundle.get("ad_id");
        if (obj2 == null || (obj = obj2.toString()) == null) {
            j = 0;
        } else {
            j = Long.parseLong(obj);
        }
        Object obj3 = bundle.get("iab_session_id");
        String str2 = "";
        if (obj3 == null || (str = obj3.toString()) == null) {
            str = str2;
        }
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("pageLoadSource", "EXTERNAL_LINK_PAGE_LOAD");
        A1E.put("tokenSource", RUC.A00(spf.A03.A01));
        A1E.put("is_organic", String.valueOf(spf.A02));
        String A0d = Pxi.A0d(bundle, "media_id");
        if (A0d != null) {
            str2 = A0d;
        }
        A1E.put("media_id", str2);
        SRY.A00().A04(j, "PAGE_LOADED", str, A1E);
    }
}
