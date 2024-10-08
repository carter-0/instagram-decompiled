package X;

import com.fbpay.w3c.security.SecurityProviderEphemeral;

/* renamed from: X.Sdk  reason: case insensitive filesystem */
public final class C11642Sdk implements AnonymousClass2gO {
    public final /* synthetic */ C2818659w A00;
    public final /* synthetic */ OMB A01;
    public final /* synthetic */ 2Mg A02;
    public final /* synthetic */ C12512Svp A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public C11642Sdk(C2818659w r1, OMB omb, 2Mg r3, C12512Svp svp, String str, String str2) {
        this.A00 = r1;
        this.A03 = svp;
        this.A01 = omb;
        this.A04 = str;
        this.A02 = r3;
        this.A05 = str2;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        SUj sUj = (SUj) obj;
        if (SUj.A0S(sUj)) {
            this.A00.A02(C11097S9y.A01(new RKV(this.A03)));
            this.A01.A00();
        } else if (SUj.A0V(sUj)) {
            String str = (String) SUj.A0D(sUj);
            C12512Svp svp = this.A03;
            String str2 = this.A04;
            C2818659w r1 = this.A00;
            OMB omb = this.A01;
            2Mg r3 = this.A02;
            String str3 = this.A05;
            if (omb == null) {
                omb = (OMB) SecurityProviderEphemeral.A00.invoke();
            }
            omb.A01(new TWU(r1, omb, r3, svp, str2, "$e2ee", str3, str));
        }
    }
}
