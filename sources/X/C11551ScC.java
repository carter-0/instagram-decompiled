package X;

import android.os.Bundle;

/* renamed from: X.ScC  reason: case insensitive filesystem */
public final class C11551ScC implements 1MD {
    public final /* synthetic */ C10824Ryk A00;
    public final /* synthetic */ QDJ A01;
    public final /* synthetic */ C10440RsH A02;
    public final /* synthetic */ SSY A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public C11551ScC(C10824Ryk ryk, QDJ qdj, C10440RsH rsH, SSY ssy, String str, boolean z) {
        this.A01 = qdj;
        this.A03 = ssy;
        this.A05 = z;
        this.A00 = ryk;
        this.A02 = rsH;
        this.A04 = str;
    }

    /* JADX WARNING: type inference failed for: r0v16, types: [X.QnQ, X.TQk] */
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        String str;
        C10586Rug A052;
        Bundle bundle;
        Bundle bundle2;
        String str2 = (String) obj;
        QDJ qdj = this.A01;
        JTP.A1B(qdj.A04, true);
        SSY ssy = this.A03;
        C10586Rug A053 = ssy.A05("THREE_DS");
        if (A053 == null || (bundle2 = A053.A00) == null) {
            str = null;
        } else {
            str = bundle2.getString("3ds_token_token");
        }
        if (!(!this.A05 || (A052 = ssy.A05("CSC")) == null || (bundle = A052.A00) == null)) {
            String string = bundle.getString("AUTH_FLOW_UTIL_CVV_CREDENTIAL_ENTERED");
            bundle.remove("AUTH_FLOW_UTIL_CVV_CREDENTIAL_ENTERED");
            if (string != null) {
                if (182.A06(0Tu.A05, C11431STx.A00(), 36314498247166614L)) {
                    QDJ.A00(this.A00, qdj);
                    C10440RsH rsH = this.A02;
                    C11009S5g s5g = qdj.A01;
                    if (s5g == null) {
                        0qQ.A0F("authFactorRequirement");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    ? tQk = new C13219TQk(0, "", "");
                    tQk.A00 = s5g;
                    rsH.A00 = tQk;
                    rsH.A01.putBoolean("REUSE_ATS_IN_AUTH_PROMPT_OBJ_SCOPED", true);
                }
                C10440RsH rsH2 = this.A02;
                C10824Ryk ryk = this.A00;
                AnonymousClass2gB A042 = ssy.A04(rsH2, C9653ReX.A00(ryk, string), "CREATE_CONTAINER");
                0qQ.A0A(A042);
                return AnonymousClass72Y.A02(A042, new C59094J6b((Object) ryk, (Object) qdj, this.A04, str, str2, 0));
            }
        }
        SIP sip = AnonymousClass2E0.A01().A0E;
        C10824Ryk ryk2 = this.A00;
        0qQ.A0A(str2);
        return sip.A01(qdj.A0A.A02((C298525tb) null, true), ryk2, str2, this.A04, str);
    }
}
