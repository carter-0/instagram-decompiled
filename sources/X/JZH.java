package X;

import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicBrowseCategory;
import java.util.Set;

public final class JZH implements C66575MXg {
    public final UserSession A00;
    public final C324356z9 A01;
    public final MusicBrowseCategory A02;
    public final C66542MVw A03;
    public final Set A04;
    public final Set A05;
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A01(new C66217MIy(this, 22));
    public final boolean A07;

    /* JADX WARNING: type inference failed for: r4v0, types: [X.07Z, androidx.fragment.app.Fragment, X.4DH] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public JZH(X.AnonymousClass4DH r4, com.instagram.common.session.UserSession r5, com.instagram.music.common.model.MusicBrowseCategory r6, X.C66542MVw r7, boolean r8) {
        /*
            r3 = this;
            r0 = 2
            X.0qQ.A0B(r5, r0)
            r3.<init>()
            r3.A00 = r5
            r3.A03 = r7
            r3.A02 = r6
            r1 = 22
            X.MIy r0 = new X.MIy
            r0.<init>(r3, r1)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r3.A06 = r0
            android.content.Context r2 = r4.requireContext()
            X.0gy r1 = X.AnonymousClass07i.A00(r4)
            X.6z9 r0 = new X.6z9
            r0.<init>(r2, r1, r5)
            r3.A01 = r0
            r3.A07 = r8
            r1 = 9
            X.Q1I r0 = new X.Q1I
            r0.<init>(r1)
            r3.A05 = r0
            r1 = 8
            X.Q1I r0 = new X.Q1I
            r0.<init>(r1)
            r3.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JZH.<init>(X.4DH, com.instagram.common.session.UserSession, com.instagram.music.common.model.MusicBrowseCategory, X.MVw, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00db, code lost:
        if (r3 != null) goto L_0x0042;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(boolean r13) {
        /*
            r12 = this;
            com.instagram.music.common.model.MusicBrowseCategory r3 = r12.A02
            if (r3 == 0) goto L_0x00bf
            java.lang.String r1 = r3.A00()
            java.lang.String r0 = "browse"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00bf
            com.instagram.common.session.UserSession r5 = r12.A00
            X.0Tu r4 = X.0Tu.A05
            r0 = 36315924172705467(0x81052400010ebb, double:3.029674907083589E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x00a4
            r0 = 42
            X.MP7 r2 = new X.MP7
            r2.<init>(r12, r0)
            r0 = 36315924172836541(0x81052400030ebd, double:3.029674907166481E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            X.RBA r7 = new X.RBA
            r7.<init>(r5, r2, r0)
            X.MVw r6 = r12.A03
            java.lang.Object r0 = r6.BnI()
            if (r0 != 0) goto L_0x003d
            r0 = r3
        L_0x003d:
            X.KV6 r1 = new X.KV6
            r1.<init>(r12, r0, r13)
        L_0x0042:
            java.util.Set r2 = r12.A05
            java.lang.String r0 = r3.A04
            boolean r0 = X.00k.A0u(r2, r0)
            if (r0 != 0) goto L_0x0094
            java.util.Set r2 = r12.A04
            java.lang.String r0 = r3.A00()
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x0094
        L_0x0058:
            if (r13 == 0) goto L_0x009d
            r11 = 0
            java.lang.Integer r8 = X.AnonymousClass05K.A0N
            X.0eM r0 = r12.A06
            java.lang.Object r0 = r0.getValue()
            long r4 = X.AnonymousClass7TE.A0R(r0)
        L_0x0067:
            java.lang.Long r9 = java.lang.Long.valueOf(r4)
            java.lang.Object r10 = r6.BnI()
            if (r10 != 0) goto L_0x0072
            r10 = r3
        L_0x0072:
            X.1OC r5 = r6.ANA(r7, r8, r9, r10, r11)
            int r0 = r5.hashCode()
            r1.A00 = r0
            if (r13 == 0) goto L_0x00df
            boolean r0 = r12.A07
            if (r0 == 0) goto L_0x00df
            X.6z9 r4 = r12.A01
            X.6zA r3 = r4.A03
            r2 = 0
            X.6rT r0 = new X.6rT
            r0.<init>(r5, r2, r1, r3)
            r5.A00 = r0
            X.4D6 r0 = r4.A02
            r0.schedule(r5)
            return
        L_0x0094:
            if (r13 == 0) goto L_0x009d
            r11 = 0
        L_0x0097:
            java.lang.Integer r8 = X.AnonymousClass05K.A0Y
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L_0x0067
        L_0x009d:
            X.6z9 r0 = r12.A01
            X.6zA r0 = r0.A03
            java.lang.String r11 = r0.A07
            goto L_0x0097
        L_0x00a4:
            java.lang.Class<X.D1w> r1 = X.C45697D1w.class
            X.0bH r0 = new X.0bH
            r0.<init>(r5)
            X.1NS r7 = new X.1NS
            r7.<init>(r0, r1)
            X.MVw r6 = r12.A03
            java.lang.Object r0 = r6.BnI()
            if (r0 != 0) goto L_0x00b9
            r0 = r3
        L_0x00b9:
            X.KV5 r1 = new X.KV5
            r1.<init>(r12, r0, r13)
            goto L_0x0042
        L_0x00bf:
            X.MVw r6 = r12.A03
            java.lang.Class<X.D1y> r2 = X.C45699D1y.class
            com.instagram.common.session.UserSession r1 = r12.A00
            X.0bH r0 = new X.0bH
            r0.<init>(r1)
            X.1NS r7 = new X.1NS
            r7.<init>(r0, r2)
            java.lang.Object r0 = r6.BnI()
            if (r0 != 0) goto L_0x00d6
            r0 = r3
        L_0x00d6:
            X.JZI r1 = new X.JZI
            r1.<init>(r12, r0, r13)
            if (r3 == 0) goto L_0x0058
            goto L_0x0042
        L_0x00df:
            X.6z9 r0 = r12.A01
            r0.A03(r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JZH.A00(boolean):void");
    }

    public final void ACw() {
        if (this.A01.A06()) {
            A00(false);
        }
    }

    public final boolean CJz() {
        return this.A03.CKd();
    }

    public final boolean CKB() {
        return this.A01.A05();
    }

    public final boolean CT5() {
        return AnonymousClass7TF.A1W(this.A01.A03.A03, AnonymousClass05K.A01);
    }

    public final void CgO() {
        A00(DbW.A1a(this.A01.A03.A07));
    }

    public final boolean isLoading() {
        return AnonymousClass7TF.A1W(this.A01.A03.A03, AnonymousClass05K.A00);
    }

    public final boolean CWV() {
        if (CT5()) {
            return true;
        }
        if (isLoading() && this.A03.EtB()) {
            return true;
        }
        C66542MVw mVw = this.A03;
        if (mVw.CKd() || !mVw.Et6() || this.A01.A03.A03 != AnonymousClass05K.A0C) {
            return false;
        }
        return true;
    }
}
