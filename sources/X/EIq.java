package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class EIq extends C65261LqG {
    public final AnonymousClass0eM A00;
    public final FragmentActivity A01;
    public final String A02;

    public final void D7K() {
    }

    public final void D9U() {
    }

    public final void Di5() {
    }

    public final void A06(C74401PuH puH) {
        String str;
        2Dr r3 = (2Dm) this.A00.getValue();
        2Er r2 = this.A02;
        String str2 = null;
        if (r2 != null) {
            str = r2.C6C();
            str2 = r2.C6k();
        } else {
            str = null;
        }
        AnonymousClass3U9 A04 = 2Dr.A04(r3, str, str2);
        C47834EJg eJg = new C47834EJg(this.A01, this.A01, this.A02);
        if (A04 == null || !eJg.A08(A04)) {
            puH.onFailure();
            return;
        }
        eJg.A00 = A04;
        puH.DoM(eJg);
    }

    public final String AtC() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r0 == null) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence Axd() {
        /*
            r7 = this;
            X.2Er r0 = r7.A02
            if (r0 == 0) goto L_0x006e
            java.lang.String r5 = r0.Asi()
        L_0x0008:
            com.instagram.common.session.UserSession r6 = r7.A01
            X.9HW r3 = X.AnonymousClass9HV.A00(r6)
            r2 = 0
            if (r5 == 0) goto L_0x0034
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = r0.C6C()
            if (r0 == 0) goto L_0x006c
            X.3t0 r1 = new X.3t0
            r1.<init>(r0)
        L_0x001e:
            r0 = 44
            boolean r1 = r3.A00(r1, r0)
            android.content.Context r4 = r7.A00
            r0 = 2131954222(0x7f130a2e, float:1.9544937E38)
            if (r1 == 0) goto L_0x002e
            r0 = 2131954224(0x7f130a30, float:1.9544941E38)
        L_0x002e:
            java.lang.String r0 = X.DbW.A0h(r4, r5, r0)
            if (r0 != 0) goto L_0x003d
        L_0x0034:
            android.content.Context r4 = r7.A00
            r0 = 2131954223(0x7f130a2f, float:1.954494E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r4, r0)
        L_0x003d:
            android.text.SpannableStringBuilder r3 = X.DbS.A0C(r0)
            X.17i r0 = X.17h.A00(r6)
            java.util.concurrent.ConcurrentMap r0 = r0.A02
            java.lang.Object r0 = r0.get(r5)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x0053
            boolean r2 = r0.isVerified()
        L_0x0053:
            if (r5 == 0) goto L_0x006b
            if (r2 == 0) goto L_0x006b
            r2 = 0
            int r1 = X.00l.A08(r3, r5, r2, r2)
            r0 = -1
            if (r1 == r0) goto L_0x006b
            int r1 = X.00l.A08(r3, r5, r2, r2)
            int r0 = r5.length()
            int r1 = r1 + r0
            X.C244273av.A03(r4, r3, r1)
        L_0x006b:
            return r3
        L_0x006c:
            r1 = 0
            goto L_0x001e
        L_0x006e:
            r5 = 0
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EIq.Axd():java.lang.CharSequence");
    }

    public final CharSequence B7G() {
        return null;
    }

    public final String BqX() {
        return null;
    }

    public EIq(Context context, FragmentActivity fragmentActivity, UserSession userSession, 2Er r6, String str) {
        super(context, userSession, r6);
        this.A01 = fragmentActivity;
        this.A02 = str;
        this.A00 = AnonymousClass0eN.A01(new C41655Ay7(userSession, 18));
    }
}
