package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.ONw  reason: case insensitive filesystem */
public final class C70844ONw {
    public final AnonymousClass0iw A00;
    public final AnonymousClass7SU A01;
    public final C332907Wx A02;
    public final FragmentActivity A03;
    public final 1aU A04;
    public final UserSession A05;
    public final C70770OKq A06;
    public final C70957OTe A07;
    public final C254783t2 A08;

    public final 1aU A00(C69324NjP njP) {
        AnonymousClass9HR A042;
        0qQ.A0B(njP, 0);
        C70029Nw7 nw7 = C70029Nw7.$redex_init_class;
        if (njP.ordinal() != 1 || (A042 = AnonymousClass6W3.A04(this.A08)) == null || !(A042 instanceof MsysThreadId)) {
            return 1aU.A09(false);
        }
        C70957OTe oTe = this.A07;
        C70488O8n A002 = C73914Plp.A00(oTe.A03);
        PU9.A00(A002.A00.A01.A0M(new C72018Ous(new C73933PmD(A042, 32), 3)).A0Q(C318146oT.A00), oTe.A02, A042, oTe, 21);
        1aU A09 = 1aU.A09(true);
        0qQ.A0A(A09);
        return A09;
    }

    public final 1aU A01(C69355Nju nju) {
        0qQ.A0B(nju, 0);
        C70029Nw7 nw7 = C70029Nw7.$redex_init_class;
        if (nju.ordinal() != 11) {
            return 1aU.A09(false);
        }
        0xa A0q = AnonymousClass7TE.A0q(this.A05);
        String A002 = C273654mx.A00(1006);
        AnonymousClass7TG.A1M(A0q, A002, A0q.getInt(A002, 0) + 1);
        1aU A09 = 1aU.A09(true);
        0qQ.A0A(A09);
        return A09;
    }

    public final 1aU A02(C69355Nju nju) {
        AnonymousClass9HR A042;
        MsysThreadId msysThreadId;
        0qQ.A0B(nju, 0);
        C70029Nw7 nw7 = C70029Nw7.$redex_init_class;
        if (nju.ordinal() != 9 || (A042 = AnonymousClass6W3.A04(this.A08)) == null || !(A042 instanceof MsysThreadId) || (msysThreadId = (MsysThreadId) A042) == null) {
            return 1aU.A09(false);
        }
        C70957OTe oTe = this.A07;
        C66813Mcz.A00(C69476NmK.PROACTIVE_WARNING_BANNER_DISMISS, oTe.A04);
        C70957OTe.A00(oTe, msysThreadId);
        1aU A09 = 1aU.A09(true);
        0qQ.A0A(A09);
        return A09;
    }

    public C70844ONw(FragmentActivity fragmentActivity, AnonymousClass0iw r2, 1aU r3, UserSession userSession, AnonymousClass7SU r5, C332907Wx r6, C70770OKq oKq, C70957OTe oTe, C254783t2 r9) {
        this.A02 = r6;
        this.A04 = r3;
        this.A08 = r9;
        this.A03 = fragmentActivity;
        this.A00 = r2;
        this.A07 = oTe;
        this.A05 = userSession;
        this.A01 = r5;
        this.A06 = oKq;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cf, code lost:
        r0 = X.1aU.A09(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d7, code lost:
        X.0qQ.A0A(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00da, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.1aU A03(java.lang.String r11, X.C62320sa r12) {
        /*
            r10 = this;
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0u()
            if (r11 == 0) goto L_0x000e
            int r0 = r11.hashCode()
            r9 = 1
            switch(r0) {
                case -1282209724: goto L_0x00ab;
                case -291004589: goto L_0x005c;
                case 303969528: goto L_0x0044;
                case 320799635: goto L_0x0020;
                case 1863137100: goto L_0x0013;
                default: goto L_0x000e;
            }
        L_0x000e:
            X.1aU r0 = X.1aU.A09(r1)
            return r0
        L_0x0013:
            java.lang.String r0 = "thread_banner_dismiss"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x000e
            r12.invoke()
            goto L_0x00cf
        L_0x0020:
            java.lang.String r0 = "non_addressable_users_see_group_members"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x000e
            X.1aU r2 = r10.A04
            X.PoR r1 = X.C74062PoR.A00
            r0 = 9
            X.1aU r0 = X.C66789Mca.A00(r2, r1, r0)
            X.1aU r2 = r0.A0H()
            r0 = 42
            X.PqN r1 = new X.PqN
            r1.<init>(r10, r0)
            r0 = 34
            X.1aU r0 = X.C72120Owf.A03(r2, r1, r0)
            return r0
        L_0x0044:
            java.lang.String r0 = "global_delete_mitigation_learn_more"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x000e
            X.1aU r2 = r10.A04
            r0 = 43
            X.PqN r1 = new X.PqN
            r1.<init>(r10, r0)
            r0 = 34
            X.1aU r0 = X.C72120Owf.A03(r2, r1, r0)
            goto L_0x00d7
        L_0x005c:
            java.lang.String r0 = "proactive_warning_affirmative"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x000e
            X.3t2 r0 = r10.A08
            X.9HR r8 = X.AnonymousClass6W3.A04(r0)
            if (r8 == 0) goto L_0x000e
            boolean r0 = r8 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r0 == 0) goto L_0x000e
            com.instagram.model.direct.threadkey.impl.MsysThreadId r8 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r8
            if (r8 == 0) goto L_0x000e
            X.OTe r7 = r10.A07
            androidx.fragment.app.FragmentActivity r6 = r10.A03
            X.0iw r5 = r10.A00
            com.instagram.common.session.UserSession r0 = r7.A03
            X.O8n r0 = X.C73914Plp.A00(r0)
            X.1a8 r4 = r7.A02
            X.OCN r0 = r0.A00
            X.1aU r3 = r0.A01
            r0 = 32
            X.PmD r2 = new X.PmD
            r2.<init>(r8, r0)
            r1 = 3
            X.Ous r0 = new X.Ous
            r0.<init>(r2, r1)
            X.1aU r1 = r3.A0M(r0)
            X.4fh r0 = X.C318146oT.A00
            X.1aU r2 = r1.A0Q(r0)
            r1 = 13
            X.PUC r0 = new X.PUC
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7)
            r4.A02(r2, r0)
            X.C70957OTe.A00(r7, r8)
            goto L_0x00cf
        L_0x00ab:
            java.lang.String r0 = "proactive_warning_negative"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x000e
            X.3t2 r0 = r10.A08
            X.9HR r3 = X.AnonymousClass6W3.A04(r0)
            if (r3 == 0) goto L_0x000e
            boolean r0 = r3 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r0 == 0) goto L_0x000e
            com.instagram.model.direct.threadkey.impl.MsysThreadId r3 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r3
            if (r3 == 0) goto L_0x000e
            X.OTe r2 = r10.A07
            X.Mcz r1 = r2.A04
            X.NmK r0 = X.C69476NmK.PROACTIVE_WARNING_BANNER_SECONDARY_ACTION
            X.C66813Mcz.A00(r0, r1)
            X.C70957OTe.A00(r2, r3)
        L_0x00cf:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            X.1aU r0 = X.1aU.A09(r0)
        L_0x00d7:
            X.0qQ.A0A(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70844ONw.A03(java.lang.String, X.0sa):X.1aU");
    }
}
