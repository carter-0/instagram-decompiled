package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Set;

public final class HBK extends C234532y8 {
    public int A00;
    public final double A01;
    public final double A02;
    public final long A03;
    public final long A04;
    public final FragmentActivity A05;
    public final UserSession A06;
    public final C228182kv A07;
    public final String A08 = AnonymousClass7TG.A0j();
    public final Set A09;
    public final Set A0A;
    public final AnonymousClass0eM A0B = AnonymousClass0eN.A01(new MML(this, 23));
    public final IPN A0C = new IPN(this);
    public final String A0D;
    public final Set A0E;

    public HBK(FragmentActivity fragmentActivity, UserSession userSession, C228182kv r9, String str) {
        this.A05 = fragmentActivity;
        this.A06 = userSession;
        this.A07 = r9;
        this.A0D = str;
        0Tu r2 = 0Tu.A05;
        this.A01 = 182.A00(r2, userSession, 37174114473149033L);
        this.A04 = 182.A01(r2, userSession, 36611164519602384L);
        this.A03 = 182.A01(r2, userSession, 36611164519995601L);
        this.A02 = 182.A00(r2, userSession, 37174114473214570L);
        this.A0E = C51967G9n.A0t(new C263274Jz[]{C263274Jz.UNDEFINED, C263274Jz.TAP_TO_SOUND}, 0);
        this.A0A = 0sc.A05(new C233162v9[]{C233162v9.CTA_CLICK, C233162v9.CTA_CLICK_PERSISTENT});
        this.A09 = 0sc.A05(new C233162v9[]{C233162v9.LIKE_CLICK, C233162v9.LIKE_CLICK_PERSISTENT, C233162v9.PROFILE_TAP, C233162v9.PROFILE_USERNAME_CAPTION_TAP, C233162v9.COMMENT_BUTTON_CLICK, C233162v9.CAPTION_CLICK});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r2 = r9.A06;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A00(X.1Xj r10) {
        /*
            r9 = this;
            boolean r0 = r10.CcK()
            r8 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0090
            com.instagram.common.session.UserSession r2 = r9.A06
            java.lang.String r7 = X.C231122qu.A07(r2, r10)
            if (r7 == 0) goto L_0x0090
            int r0 = r7.length()
            if (r0 == 0) goto L_0x0090
            int r0 = r9.A00
            long r4 = (long) r0
            long r0 = r9.A03
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x0090
            java.lang.String r0 = r9.A08
            java.lang.String r0 = X.002.A0R(r7, r0)
            int r0 = r0.hashCode()
            int r0 = java.lang.Math.abs(r0)
            double r4 = (double) r0
            r0 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            double r4 = r4 / r0
            double r0 = r9.A02
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 > 0) goto L_0x0090
            androidx.fragment.app.FragmentActivity r0 = r9.A05
            com.instagram.model.androidlink.AndroidLink r0 = X.AnonymousClass47K.A02(r0, r2, r10, r3, r3)
            if (r0 == 0) goto L_0x008e
            X.47L r1 = X.C271714jT.A01(r0)
        L_0x0046:
            X.47L r0 = X.AnonymousClass47L.AD_DESTINATION_WEB
            if (r1 != r0) goto L_0x0090
            boolean r0 = r10.A4b()
            if (r0 != 0) goto L_0x0090
            boolean r0 = X.C231122qu.A0P(r2, r10)
            if (r0 != 0) goto L_0x0090
            java.util.EnumSet r0 = X.1sx.A01
            X.0qQ.A0B(r2, r3)
            boolean r0 = X.C243213Xw.A03(r2, r10)
            if (r0 != 0) goto L_0x0090
            boolean r0 = r10.A60()
            if (r0 != 0) goto L_0x0090
            boolean r0 = r10.A5o()
            if (r0 != 0) goto L_0x0090
            boolean r0 = r10.A5e()
            if (r0 != 0) goto L_0x0090
            java.lang.String r0 = X.C231122qu.A0D(r2, r10)
            if (r0 == 0) goto L_0x007f
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0090
        L_0x007f:
            java.util.Set r1 = r9.A0E
            java.lang.String r0 = r9.A0D
            X.4Jz r0 = X.C263264Jy.A00(r2, r10, r0, r3)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0090
            return r8
        L_0x008e:
            r1 = 0
            goto L_0x0046
        L_0x0090:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HBK.A00(X.1Xj):boolean");
    }

    public final void Csa(C2354830a r2, 1Xj r3, AnonymousClass3W1 r4) {
        AnonymousClass7TG.A1N(r2, r3);
        if (A00(r3)) {
            r2.A00(this.A0C);
        }
    }

    public final void Cse(C2354830a r2, 1Xj r3, AnonymousClass3W1 r4) {
        AnonymousClass7TG.A1N(r2, r3);
        if (A00(r3)) {
            r2.A00(this.A0C);
        }
    }
}
