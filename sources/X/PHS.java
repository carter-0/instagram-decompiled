package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.model.direct.DirectThreadKey;

public final class PHS implements C367608rH {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public PHS(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.A00 = i;
        this.A05 = str;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A04 = obj4;
        this.A01 = obj;
    }

    public final void onClick() {
        switch (this.A00) {
            case 0:
                NKG nkg = (NKG) this.A04;
                C333537Zi A002 = C333527Zh.A00(AnonymousClass7TE.A0l(nkg.A04));
                AnonymousClass0eM r0 = nkg.A05;
                C71810OrC.A00(A002.FJE(new C68965Nbs((C254703su) this.A01, (DirectThreadKey) r0.getValue()), (DirectThreadKey) r0.getValue(), (String) null), new C73949PmT(this.A03, this.A02, this.A05, 30), 1Lf.A01, 0);
                return;
            case 1:
                Intent intent = new Intent("android.intent.action.DIAL");
                intent.addFlags(268435456);
                intent.setData(0cp.A01((0bY) this.A03, 002.A0R("tel:", this.A05)));
                ((C70742OJn) this.A02).A00((C254783t2) this.A04, "CALL");
                0kR.A0D((Context) this.A01, intent);
                return;
            default:
                return;
        }
    }
}
