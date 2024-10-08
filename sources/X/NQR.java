package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.request.DirectThreadApi;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

public final class NQR extends 2Cn {
    public final C272124k8 A00;
    public final 1a8 A01;
    public final UserSession A02;
    public final AnonymousClass7ZA A03;
    public final OCI A04;
    public final C254743sy A05;
    public final String A06;
    public final String A07;
    public final boolean A08 = true;

    public NQR(C272124k8 r3, 1a8 r4, UserSession userSession, AnonymousClass7ZA r6, OCI oci, C254743sy r8, String str, String str2) {
        0qQ.A0B(str2, 4);
        this.A02 = userSession;
        this.A07 = str;
        this.A00 = r3;
        this.A06 = str2;
        this.A03 = r6;
        this.A05 = r8;
        this.A01 = r4;
        this.A04 = oci;
    }

    public final void onFail(Exception exc) {
        0qQ.A0B(exc, 0);
        this.A00.onFail(new C268664dn(exc));
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str = (String) obj;
        C254743sy r4 = this.A05;
        if (r4 instanceof MsysThreadId) {
            if (182.A06(0Tu.A05, this.A02, 36317135353418535L)) {
                if (str == null) {
                    str = this.A07;
                }
                1a8 r2 = this.A01;
                AnonymousClass7ZA r0 = this.A03;
                if (r0 != null && r2 != null) {
                    if (r4 != null) {
                        PU7.A00(r0.AGo(r4, str), r2, this, 3);
                        return;
                    }
                    throw AnonymousClass7TE.A0y();
                }
                return;
            }
        }
        1OC A0C = DirectThreadApi.A0C(this.A02, this.A06, this.A07, str, this.A08);
        A0C.A00 = this.A00;
        1ES.A03(A0C);
    }
}
