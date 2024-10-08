package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.VwZ  reason: case insensitive filesystem */
public abstract class C18676VwZ {
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        if (X.182.A06(r2, r14, 36318024411780871L) != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(androidx.fragment.app.FragmentActivity r12, X.X6L r13, com.instagram.common.session.UserSession r14, java.lang.String r15) {
        /*
            r11 = r14
            r9 = r12
            X.AnonymousClass7TG.A1N(r12, r14)
            r0 = 3
            X.0qQ.A0B(r13, r0)
            boolean r0 = r12 instanceof com.instagram.base.activity.BaseFragmentActivity
            if (r0 == 0) goto L_0x0058
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318024411649798(0x81070d00001706, double:3.0310031066489674E-306)
            boolean r0 = X.182.A06(r2, r14, r0)
            if (r0 != 0) goto L_0x0026
            r0 = 36318024411780871(0x81070d00021707, double:3.0310031067318585E-306)
            boolean r1 = X.182.A06(r2, r14, r0)
            r0 = 0
            if (r1 == 0) goto L_0x0027
        L_0x0026:
            r0 = 1
        L_0x0027:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r0 == 0) goto L_0x0059
            r3 = 1
            r5 = 0
            X.Tnz r2 = new X.Tnz
            r4 = r3
            r6 = r5
            r7 = r3
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0035:
            X.JVf r0 = new X.JVf
            r0.<init>((X.C13997Tnz) r2, (java.lang.Integer) r1)
            java.util.List r1 = X.AnonymousClass7TE.A1I(r0)
            r0 = 22
            X.JwI r8 = new X.JwI
            r8.<init>((java.util.List) r1, (int) r0)
            com.instagram.base.activity.BaseFragmentActivity r9 = (com.instagram.base.activity.BaseFragmentActivity) r9
            X.WON r10 = new X.WON
            r10.<init>(r13)
            X.VzH r7 = new X.VzH
            r12 = r15
            r7.<init>(r8, r9, r10, r11, r12)
            r0 = 0
            r7.A00 = r0
            X.C18736VzH.A00(r7)
        L_0x0058:
            return
        L_0x0059:
            r4 = 1
            r8 = 0
            r3 = 8
            X.Tnz r2 = new X.Tnz
            r5 = r4
            r6 = r4
            r7 = r4
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18676VwZ.A01(androidx.fragment.app.FragmentActivity, X.X6L, com.instagram.common.session.UserSession, java.lang.String):void");
    }

    public static final void A02(FragmentActivity fragmentActivity, X3J x3j, UserSession userSession, boolean z) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 1);
        if (!z) {
            0Tu r2 = 0Tu.A05;
            if (!182.A06(r2, userSession, 36318024411649798L) && !182.A06(r2, userSession, 36318024411780871L)) {
                x3j.onComplete();
                return;
            }
        }
        0gy A00 = AnonymousClass07i.A00(fragmentActivity);
        C19182WOo wOo = new C19182WOo((Object) x3j, 0);
        0qQ.A0B(A00, 1);
        C18794W2b.A03(fragmentActivity, A00, new C19184WOq(fragmentActivity, A00, wOo, userSession2, true), userSession);
    }

    public static final void A00(FragmentActivity fragmentActivity, X6L x6l, UserSession userSession) {
        C18794W2b.A01(fragmentActivity, AnonymousClass07i.A00(fragmentActivity), new C19182WOo((Object) x6l, AnonymousClass7TG.A1Z(fragmentActivity, userSession) ? 1 : 0), userSession);
    }
}
