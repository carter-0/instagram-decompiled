package X;

import com.instagram.direct.inbox.DirectInviteContactViewModel;
import com.instagram.direct.inbox.fragment.DirectSearchInboxFragment;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import java.util.HashSet;

public final class PE2 implements C51904G6y {
    public final int A00;
    public final Object A01;

    public PE2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DLz(C74414PuU puU) {
        EK7 ek7;
        C68963Nbq nbq;
        switch (this.A00) {
            case 0:
                EEP eep = (EEP) this.A01;
                HashSet hashSet = eep.A0q;
                synchronized (hashSet) {
                    if (puU instanceof C68273N8k) {
                        C68273N8k n8k = (C68273N8k) puU;
                        DirectSearchResult directSearchResult = n8k.A03;
                        if (directSearchResult instanceof DirectInviteContactViewModel) {
                            hashSet.remove((DirectShareTarget) hashSet.stream().filter(new C73453Pcv((DirectInviteContactViewModel) directSearchResult, 1)).findFirst().orElse((Object) null));
                            EK7 ek72 = eep.A0o.A02;
                            if (ek72 != null) {
                                ek72.A04(n8k);
                            }
                        }
                    }
                }
                return;
            case 1:
                EEP eep2 = ((C50389Fas) this.A01).A00;
                HashSet hashSet2 = eep2.A0q;
                synchronized (hashSet2) {
                    C68273N8k n8k2 = (C68273N8k) puU;
                    if (!(n8k2 == null || !hashSet2.remove(n8k2.A03) || (ek7 = eep2.A0o.A02) == null)) {
                        ek7.A04(n8k2);
                    }
                }
                return;
            case 2:
            case 3:
                0qQ.A0B(puU, 0);
                nbq = ((DirectSearchInboxFragment) this.A01).A05;
                if (nbq == null) {
                    return;
                }
                break;
            case 4:
                0qQ.A0B(puU, 0);
                nbq = ((C68477NJu) this.A01).A00;
                if (nbq == null) {
                    0qQ.A0F("impressionHelper");
                    throw AnonymousClass00P.createAndThrow();
                }
                break;
            default:
                return;
        }
        nbq.A04(puU);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        r0 = r0.A0o.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        r0.A03(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DM0(X.C74414PuU r2) {
        /*
            r1 = this;
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0030;
                case 1: goto L_0x0027;
                case 2: goto L_0x0006;
                case 3: goto L_0x0006;
                case 4: goto L_0x0011;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.Object r0 = r1.A01
            com.instagram.direct.inbox.fragment.DirectSearchInboxFragment r0 = (com.instagram.direct.inbox.fragment.DirectSearchInboxFragment) r0
            X.Nbq r0 = r0.A05
            goto L_0x003a
        L_0x0011:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.Object r0 = r1.A01
            X.NJu r0 = (X.C68477NJu) r0
            X.Nbq r0 = r0.A00
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = "impressionHelper"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0027:
            if (r2 == 0) goto L_0x0005
            java.lang.Object r0 = r1.A01
            X.Fas r0 = (X.C50389Fas) r0
            X.EEP r0 = r0.A00
            goto L_0x0036
        L_0x0030:
            if (r2 == 0) goto L_0x0005
            java.lang.Object r0 = r1.A01
            X.EEP r0 = (X.EEP) r0
        L_0x0036:
            X.Mi7 r0 = r0.A0o
            X.EK7 r0 = r0.A02
        L_0x003a:
            if (r0 == 0) goto L_0x0005
        L_0x003c:
            r0.A03(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PE2.DM0(X.PuU):void");
    }
}
