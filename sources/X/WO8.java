package X;

import android.os.Bundle;

public final class WO8 implements X6L {
    public final /* synthetic */ Dd4 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public final void DED() {
    }

    public WO8(Dd4 dd4, String str, String str2) {
        this.A00 = dd4;
        this.A02 = str;
        this.A01 = str2;
    }

    public final void Doe(String str) {
        Dd4 dd4 = this.A00;
        C309516Yo r3 = new C309516Yo(dd4.A05, dd4.A0A);
        C13990Tnq.A0h();
        String str2 = this.A02;
        String str3 = this.A01;
        AnonymousClass7TG.A1N(str2, str);
        Bundle A0N = C51971G9r.A0N(str2);
        A0N.putString("access_token", str);
        A0N.putString("ad_account_id", str3);
        DbX.A18(A0N, new C15304UaB(), r3);
    }
}
