package X;

import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.Set;

public final class PE6 implements C51905G6z {
    public final int A00;
    public final Object A01;

    public PE6(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        if (r2 == null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r2 != null) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.C268654dm r10) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x007a;
                case 1: goto L_0x004e;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 0
            X.0qQ.A0B(r10, r0)
            java.lang.Object r2 = r10.A00()
            X.74W r2 = (X.AnonymousClass74W) r2
            java.lang.Object r1 = r9.A01
            X.67Z r1 = (X.AnonymousClass67Z) r1
            r7 = 0
            if (r2 == 0) goto L_0x004c
            int r0 = r2.mStatusCode
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x001c:
            java.lang.String r3 = java.lang.String.valueOf(r0)
            if (r2 == 0) goto L_0x0043
            java.lang.String r4 = r2.getErrorMessage()
            com.instagram.realtimeclient.DirectApiError r0 = r2.A03
            if (r0 == 0) goto L_0x0044
            java.lang.String r5 = r0.errorType
        L_0x002c:
            com.instagram.realtimeclient.DirectApiError r0 = r2.A03
            if (r0 == 0) goto L_0x0048
            java.lang.String r6 = r0.errorTitle
        L_0x0032:
            com.instagram.realtimeclient.DirectApiError r0 = r2.A03
            if (r0 == 0) goto L_0x0038
            java.lang.String r7 = r0.errorDescription
        L_0x0038:
            boolean r8 = r10 instanceof X.C268674do
            X.Dr1 r2 = new X.Dr1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.C72176Oxl.A02(r1, r2)
        L_0x0042:
            return
        L_0x0043:
            r4 = r7
        L_0x0044:
            r5 = r7
            if (r2 == 0) goto L_0x0048
            goto L_0x002c
        L_0x0048:
            r6 = r7
            if (r2 == 0) goto L_0x0038
            goto L_0x0032
        L_0x004c:
            r0 = r7
            goto L_0x001c
        L_0x004e:
            java.lang.Object r3 = r9.A01
            X.OEi r3 = (X.C70637OEi) r3
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r2 = r3.A02
            android.content.Context r1 = r2.getContext()
            java.lang.String r0 = "onAddUserChatRequestsClick_network_error"
            X.C59689JTv.A0E(r1, r0)
            X.TzX r1 = r2.mListAdapter
            X.3uh r0 = r3.A00
            com.instagram.user.model.User r2 = r3.A01
            java.util.HashMap r1 = r1.A0C
            java.lang.String r0 = r0.A0j
            java.lang.Object r0 = r1.get(r0)
            X.Tzb r0 = (X.C14629Tzb) r0
            if (r0 == 0) goto L_0x0042
            X.TrF r1 = r0.A0j
            java.util.Set r0 = r1.A0a
            r0.remove(r2)
            r1.A07()
            return
        L_0x007a:
            java.lang.Object r1 = r9.A01
            X.NJ6 r1 = (X.NJ6) r1
            r0 = 0
            r1.A05 = r0
            X.NJ6.A00(r1)
            boolean r0 = r1.isResumed()
            if (r0 == 0) goto L_0x0042
            android.content.Context r1 = r1.requireContext()
            boolean r0 = r10 instanceof X.C268674do
            X.C69904Nu6.A00(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PE6.onFail(X.4dm):void");
    }

    public final void onSuccess() {
        switch (this.A00) {
            case 0:
                NJ6 nj6 = (NJ6) this.A01;
                nj6.A05 = false;
                NJ6.A00(nj6);
                1Ng A002 = AnonymousClass1Nd.A00(nj6.A00);
                Set set = nj6.A0C;
                A002.A00(new C71908Osq(set));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    User A0k = DbT.A0k(it);
                    OLT olt = nj6.A02;
                    olt.getClass();
                    olt.A00(A0k);
                }
                set.clear();
                nj6.A09 = true;
                DbX.A1J(nj6);
                return;
            case 1:
                C70637OEi oEi = (C70637OEi) this.A01;
                C14625TzX tzX = oEi.A02.mListAdapter;
                C255773uh r0 = oEi.A00;
                User user = oEi.A01;
                C14629Tzb tzb = (C14629Tzb) tzX.A0C.get(r0.A0j);
                if (tzb != null) {
                    C14176TrF trF = tzb.A0j;
                    C255773uh r02 = trF.A03;
                    r02.getClass();
                    OLT olt2 = r02.A04;
                    if (olt2 != null) {
                        olt2.A00(user);
                        trF.A0a.remove(user);
                        trF.A07();
                        return;
                    }
                    return;
                }
                return;
            default:
                AnonymousClass67Z r1 = (AnonymousClass67Z) this.A01;
                C66990MgO.A00(r1, AnonymousClass7TE.A0v());
                r1.A00();
                return;
        }
    }
}
