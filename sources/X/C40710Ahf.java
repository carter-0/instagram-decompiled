package X;

import android.os.Bundle;
import java.util.List;

/* renamed from: X.Ahf  reason: case insensitive filesystem */
public final class C40710Ahf implements B38 {
    public Integer A00;
    public String A01;
    public String A02;
    public String A03;

    public final void CMw(C371698yt r4) {
        if (r4 != null) {
            C371628yi r1 = C372058zb.A04;
            if (C371698yt.A01(r4, r1)) {
                C372058zb r12 = (C372058zb) r4.A02(r1);
                this.A01 = r12.A01;
                this.A03 = r12.A03;
                this.A02 = r12.A02;
                this.A00 = Integer.valueOf(C392739vI.A00(r12.A00));
            }
        }
    }

    public final List EzR() {
        return null;
    }

    public final void FKT(Bundle bundle) {
    }

    public final Bundle BH4() {
        return Q21.A00(AnonymousClass7TF.A0x("serviceType", 32), AnonymousClass7TE.A1L("accessToken", this.A01), AnonymousClass7TE.A1L("userAgent", this.A03), AnonymousClass7TE.A1L("sandbox", this.A02), AnonymousClass7TE.A1L("schemaType", this.A00));
    }
}
