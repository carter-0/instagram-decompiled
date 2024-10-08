package X;

import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.9BB  reason: invalid class name */
public final class AnonymousClass9BB {
    public boolean A00;
    public final UserSession A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new AnonymousClass9L0(this, 3));
    public final 0xG A03 = new 0xG("AiAgentEligibilityRepository");

    public AnonymousClass9BB(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final void A01(FragmentActivity fragmentActivity, JPK jpk) {
        if (!this.A00) {
            this.A00 = true;
            C73664Phd phd = new C73664Phd(20, this, jpk);
            HashMap A022 = 0Yt.A02(new 0eP[]{new 0eP("on_complete", new Q3B(new J6W(38, jpk, phd, this)))});
            C229382nI A012 = C229382nI.A01((SparseArray) null, fragmentActivity, this.A03, this.A01);
            FBO A002 = HX9.A00("com.bloks.www.messenger.aibot.waitlist_signup_controller");
            A002.A03 = A022;
            A002.A00 = new Q3B(new C74193PqZ(phd, 3));
            A002.A01(fragmentActivity, A012);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        if (r7 != 2) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        return X.AnonymousClass05K.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003c, code lost:
        if (r7 != 3) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer A00() {
        /*
            r10 = this;
            com.instagram.common.session.UserSession r9 = r10.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36600873780318232(0x82084d00251018, double:3.2098781863378746E-306)
            long r0 = X.182.A01(r2, r9, r0)
            int r7 = (int) r0
            r0 = 3
            if (r7 >= r0) goto L_0x003c
            X.0eM r8 = r10.A02
            java.lang.Object r0 = r8.getValue()
            X.9BC r0 = (X.AnonymousClass9BC) r0
            X.0xa r1 = r0.A00
            java.lang.String r0 = "notification_receive_time_ms"
            r3 = 0
            long r5 = r1.getLong(r0, r3)
            r0 = 36600873780645914(0x82084d002a101a, double:3.209878186545102E-306)
            long r1 = X.182.A01(r2, r9, r0)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x003f
            long r5 = r5 + r1
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003f
        L_0x0039:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            return r0
        L_0x003c:
            if (r7 == r0) goto L_0x0039
            goto L_0x005d
        L_0x003f:
            r0 = 1
            if (r7 != r0) goto L_0x005a
            java.lang.Object r0 = r8.getValue()
            X.9BC r0 = (X.AnonymousClass9BC) r0
            X.0xa r2 = r0.A00
            r0 = 1519(0x5ef, float:2.129E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 != 0) goto L_0x0060
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            return r0
        L_0x005a:
            r0 = 2
            if (r7 == r0) goto L_0x0060
        L_0x005d:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            return r0
        L_0x0060:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9BB.A00():java.lang.Integer");
    }
}
