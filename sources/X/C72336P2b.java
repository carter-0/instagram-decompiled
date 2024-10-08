package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.P2b  reason: case insensitive filesystem */
public final class C72336P2b implements C74394PuA {
    public final Context A00;
    public final FragmentActivity A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final N4P A04;

    public C72336P2b(Context context, FragmentActivity fragmentActivity, AnonymousClass0iw r4, UserSession userSession, N4P n4p) {
        0qQ.A0B(userSession, 3);
        this.A01 = fragmentActivity;
        this.A00 = context;
        this.A03 = userSession;
        this.A04 = n4p;
        this.A02 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0196, code lost:
        if (r1 >= r2) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List getItems() {
        /*
            r14 = this;
            X.N4P r10 = r14.A04
            X.0eM r9 = r10.A0c
            java.util.List r0 = X.JTO.A15(r9)
            java.util.ArrayList r8 = X.C51970G9q.A0m(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0010:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001a
            X.C68303N9q.A00(r8, r1)
            goto L_0x0010
        L_0x001a:
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            com.instagram.common.session.UserSession r6 = r14.A03
            X.2HN r1 = X.2HM.A00(r6)
            r5 = 0
            X.2HR r0 = r1.A0H
            java.lang.Object r0 = r0.A00()
            boolean r4 = X.AnonymousClass7TE.A1a(r0)
            X.2HR r0 = r1.A0B
            boolean r3 = X.DbX.A1Z(r0)
            boolean r12 = X.N4P.A05(r10)
            r11 = 1
            r2 = 1
            if (r12 == 0) goto L_0x003e
            r2 = 2
        L_0x003e:
            boolean r0 = r8 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0175
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0175
        L_0x0048:
            r11 = 0
        L_0x0049:
            if (r12 == 0) goto L_0x006c
            android.content.Context r5 = r14.A00
            r3 = 2131958973(0x7f131cbd, float:1.9554573E38)
            androidx.fragment.app.FragmentActivity r1 = r14.A01
            r0 = 2130970310(0x7f0406c6, float:1.7549327E38)
            if (r11 == 0) goto L_0x005a
            r0 = 2130970277(0x7f0406a5, float:1.754926E38)
        L_0x005a:
            int r2 = X.2Yu.A0H(r1, r0)
            X.Oj0 r0 = new X.Oj0
            r0.<init>(r14, r8, r11, r4)
            X.Fmc r1 = new X.Fmc
            r1.<init>(r5, r0, r3, r2)
        L_0x0068:
            r7.add(r1)
        L_0x006b:
            return r7
        L_0x006c:
            android.content.Context r2 = r14.A00
            r13 = 2131958973(0x7f131cbd, float:1.9554573E38)
            androidx.fragment.app.FragmentActivity r1 = r14.A01
            r0 = 2130970310(0x7f0406c6, float:1.7549327E38)
            if (r11 == 0) goto L_0x007b
            r0 = 2130970277(0x7f0406a5, float:1.754926E38)
        L_0x007b:
            int r1 = X.2Yu.A0H(r1, r0)
            r12 = 1
            X.IB1 r0 = new X.IB1
            r0.<init>(r12, r14, r11)
            X.C66583MXo.A0s(r2, r0, r7, r13, r1)
            if (r11 != 0) goto L_0x006b
            X.0Tu r11 = X.0Tu.A05
            r0 = 36313055139333801(0x810288004a06a9, double:3.0278605188266774E-306)
            boolean r0 = X.182.A06(r11, r6, r0)
            if (r0 == 0) goto L_0x011e
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r8.iterator()
        L_0x00a3:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00b8
            java.lang.Object r8 = r13.next()
            r0 = r8
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            boolean r0 = X.C70088Nx4.A00(r0, r5, r4, r3)
            X.DbV.A1U(r8, r11, r0)
            goto L_0x00a3
        L_0x00b8:
            java.util.Iterator r11 = r11.iterator()
        L_0x00bc:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x010f
            com.instagram.user.model.User r3 = X.DbT.A0k(r11)
            int r8 = r3.A00()
            r5 = 1
            if (r8 == r12) goto L_0x00d4
            r0 = 2
            if (r8 == r0) goto L_0x00d4
            r0 = 4
            if (r8 == r0) goto L_0x00d4
            r5 = 0
        L_0x00d4:
            java.lang.String r0 = "isEligible = "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", isArmadilloAddNonContactsToGroupsEnabled = "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", IsWaAddressable = "
            r1.append(r0)
            boolean r0 = r3.A1c()
            r1.append(r0)
            java.lang.String r0 = ", isFollowingCurrentUser = "
            r1.append(r0)
            boolean r0 = r3.A2A()
            r1.append(r0)
            java.lang.String r0 = ", isArmadilloMessageRequestEligible = "
            r1.append(r0)
            X.4Cl r0 = r3.A03
            java.lang.Boolean r0 = r0.COs()
            boolean r0 = X.AnonymousClass7TG.A1X(r0)
            r1.append(r0)
            goto L_0x00bc
        L_0x010f:
            java.lang.String r0 = X.DbT.A10(r1)
            java.lang.Object[] r3 = new java.lang.Object[]{r0}
            java.lang.String r1 = "CreateSecureThreadSection"
            java.lang.String r0 = "can not create e2ee thread because %s"
            X.0KC.A0P(r1, r0, r3)
        L_0x011e:
            boolean r0 = X.1CI.A00(r6)
            if (r0 == 0) goto L_0x006b
            r0 = 2131958968(0x7f131cb8, float:1.9554563E38)
            X.FGF.A01(r7, r0)
            java.util.List r0 = X.JTO.A15(r9)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x013b
            r0 = 2131958972(0x7f131cbc, float:1.9554571E38)
        L_0x0137:
            X.FGF.A01(r7, r0)
            return r7
        L_0x013b:
            com.instagram.user.model.User r3 = X.N4P.A01(r10)
            int r1 = r3.A00()
            if (r1 == r12) goto L_0x0161
            r0 = 2
            if (r1 == r0) goto L_0x0161
            r0 = 4
            if (r1 == r0) goto L_0x0161
            r1 = 2131958970(0x7f131cba, float:1.9554567E38)
            int r0 = r3.A00()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = X.DbW.A0h(r2, r0, r1)
            X.FGF r1 = new X.FGF
            r1.<init>((java.lang.CharSequence) r0)
            goto L_0x0068
        L_0x0161:
            boolean r0 = r3.A1c()
            if (r0 != 0) goto L_0x016b
            r0 = 2131958969(0x7f131cb9, float:1.9554565E38)
            goto L_0x0137
        L_0x016b:
            boolean r0 = r3.A2A()
            if (r0 != 0) goto L_0x006b
            r0 = 2131958971(0x7f131cbb, float:1.955457E38)
            goto L_0x0137
        L_0x0175:
            java.util.Iterator r13 = r8.iterator()
            r1 = 0
        L_0x017a:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0196
            com.instagram.user.model.User r0 = X.DbT.A0k(r13)
            boolean r0 = X.C70088Nx4.A00(r0, r12, r4, r3)
            if (r0 == 0) goto L_0x017a
            int r1 = r1 + 1
            if (r1 >= 0) goto L_0x017a
            X.0sr.A1S()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0196:
            if (r1 < r2) goto L_0x0048
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72336P2b.getItems():java.util.List");
    }

    public final boolean isEnabled() {
        return OPN.A01(this.A03, this.A04);
    }
}
