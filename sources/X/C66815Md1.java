package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Md1  reason: case insensitive filesystem */
public final class C66815Md1 extends C392289uY {
    public C71015OYq A00;
    public N3L A01;
    public final UserSession A02;
    public final C14038Tof A03;
    public final C66813Mcz A04;
    public final C66814Md0 A05;
    public final C332347Up A06;
    public final 1Av A07;

    public final View A06(Context context) {
        0qQ.A0B(context, 0);
        N3L n3l = this.A01;
        if (n3l != null) {
            View inflate = View.inflate(context, R.layout.generic_v3_megaphone, (ViewGroup) null);
            int[] iArr = C71015OYq.A05;
            int i = 0;
            do {
                0nA.A0O(inflate.findViewById(iArr[i]));
                i++;
            } while (i < 4);
            0qQ.A0A(inflate);
            C71015OYq oYq = new C71015OYq(inflate, this, n3l);
            this.A00 = oYq;
            return oYq.A00;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        if (X.C66831MdP.A00(r10, java.lang.Integer.valueOf(r6.C6a()), r1) != false) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(X.C39761A8b r17, X.C74401PuH r18, X.AnonymousClass2Ep r19, boolean r20) {
        /*
            r16 = this;
            r0 = 1
            r5 = r18
            X.0qQ.A0B(r5, r0)
            r6 = r19
            if (r19 == 0) goto L_0x009c
            java.util.ArrayList r2 = r6.BRW()
            int r1 = r6.BXY()
            r3 = 0
            r0 = 2
            if (r1 != r0) goto L_0x009c
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x009c
            boolean r0 = r6.COb()
            if (r0 != 0) goto L_0x009c
            java.lang.Object r4 = r2.get(r3)
            r7 = r16
            com.instagram.common.session.UserSession r10 = r7.A02
            X.0Tu r2 = X.0Tu.A06
            r0 = 36310989255344528(0x8100a700020190, double:3.026554045473214E-306)
            boolean r0 = X.182.A06(r2, r10, r0)
            if (r0 == 0) goto L_0x009c
            if (r4 == 0) goto L_0x009c
            X.1Av r12 = r7.A07
            java.lang.String r2 = r6.C6k()
            java.lang.String r1 = ""
            r8 = r1
            if (r2 != 0) goto L_0x0045
            r2 = r1
        L_0x0045:
            java.lang.String r0 = r4.toString()
            boolean r0 = r12.A25(r2, r0)
            if (r0 == 0) goto L_0x006c
            X.7Up r0 = r7.A06
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x006c
            java.lang.String r0 = r6.C6k()
            if (r0 == 0) goto L_0x005e
            r1 = r0
        L_0x005e:
            int r0 = r6.C6a()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = X.C66831MdP.A00(r10, r0, r1)
            if (r0 == 0) goto L_0x009c
        L_0x006c:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36310989255541139(0x8100a700050193, double:3.0265540455975516E-306)
            boolean r0 = X.DbY.A1Z(r2, r10, r0)
            if (r0 == 0) goto L_0x009c
            java.lang.String r9 = r6.C6k()
            if (r9 != 0) goto L_0x0080
            r9 = r8
        L_0x0080:
            java.util.ArrayList r0 = r6.BRW()
            java.lang.Object r8 = r0.get(r3)
            java.lang.Long r8 = (java.lang.Long) r8
            X.0qQ.A0A(r8)
            long r14 = r8.longValue()
            X.McR r4 = new X.McR
            r4.<init>(r5, r6, r7, r8, r9)
            r11 = r4
            r13 = r9
            X.C66832MdQ.A01(r10, r11, r12, r13, r14)
            return
        L_0x009c:
            r5.onFailure()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66815Md1.A07(X.A8b, X.PuH, X.2Ep, boolean):void");
    }

    public static final void A00(C66815Md1 md1) {
        C74324Pt0 pt0 = md1.A00;
        if (pt0 != null) {
            pt0.onDismiss();
        }
        1Av r2 = md1.A07;
        N3L n3l = md1.A01;
        if (n3l != null) {
            r2.A0x(String.valueOf(n3l.A00));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A04(boolean z) {
        C66813Mcz.A00(C69476NmK.PROACTIVE_WARNING_BANNER_SHOWN, this.A04);
    }

    public C66815Md1(FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession) {
        this.A02 = userSession;
        this.A07 = 1Au.A00(userSession);
        this.A03 = new C14038Tof(fragmentActivity, r3, userSession);
        this.A04 = new C66813Mcz(r3, userSession);
        this.A05 = new C66814Md0(fragmentActivity, r3, userSession);
        this.A06 = C332337Uo.A00(userSession);
    }
}
