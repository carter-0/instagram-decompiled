package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.HashMap;

/* renamed from: X.OJm  reason: case insensitive filesystem */
public final class C70741OJm {
    public final /* synthetic */ C71870OsD A00;

    public C70741OJm(C71870OsD osD) {
        this.A00 = osD;
    }

    public final void A00(String str, String str2, String str3) {
        DirectThreadKey A04;
        AnonymousClass3U9 A0a;
        C71870OsD osD = this.A00;
        if (!osD.A0I) {
            C74501Pvv pvv = osD.A0E;
            if (pvv != null) {
                C254743sy r6 = osD.A0U;
                boolean z = false;
                if (r6 instanceof MsysThreadId) {
                    z = osD.A0X;
                } else if (!(!(r6 instanceof DirectThreadKey) || (A04 = C66647MaG.A04(r6)) == null || A04.A00 == null || (A0a = C66581MXm.A0a(1bJ.A00(osD.A0P), A04.A00)) == null || !A0a.CUG())) {
                    z = true;
                }
                HashMap A1E = AnonymousClass7TE.A1E();
                A1E.put("is_mixvm", Boolean.valueOf(osD.A0a));
                A1E.put("is_vm", Boolean.valueOf(osD.A0Y));
                A1E.put(C273654mx.A00(2933), Boolean.valueOf(osD.A0b));
                HashMap A1E2 = AnonymousClass7TE.A1E();
                A1E2.put("ephemeral_lifetime_ms", osD.A0S.A0C);
                pvv.CIh(osD.A0T, r6, str, str2, str3, A1E, A1E2, z);
            }
            C71870OsD.A03(osD);
        }
    }
}
