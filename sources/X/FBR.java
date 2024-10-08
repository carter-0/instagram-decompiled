package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class FBR {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final AnonymousClass4DH A03;
    public final 1a8 A04 = 1a8.A00();
    public final UserSession A05;
    public final C254793t3 A06;
    public final C67350MmR A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final AnonymousClass7ZA A0B;
    public final C67089Mi7 A0C;
    public final ArrayList A0D;
    public final boolean A0E;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        if (r8.A07 != X.C67350MmR.ADMINS_AND_MODERATORS) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0112 A[LOOP:1: B:41:0x0110->B:42:0x0112, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.util.ArrayList r19) {
        /*
            r18 = this;
            r11 = 0
            r7 = r19
            X.0qQ.A0B(r7, r11)
            r8 = r18
            X.3t3 r9 = r8.A06
            boolean r0 = r9 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r0 != 0) goto L_0x001a
            int r10 = r8.A01
            r6 = 29
            if (r10 != r6) goto L_0x001e
            X.MmR r1 = r8.A07
            X.MmR r0 = X.C67350MmR.ADMINS_AND_MODERATORS
            if (r1 == r0) goto L_0x001e
        L_0x001a:
            A00(r8, r7)
        L_0x001d:
            return
        L_0x001e:
            android.content.Context r0 = r8.A02
            r17 = r0
            X.8ab r5 = X.DbS.A0Y(r17)
            boolean r12 = r8.A0A
            if (r12 == 0) goto L_0x00d1
            android.content.res.Resources r1 = r17.getResources()
            r0 = 2131959597(0x7f131f2d, float:1.9555839E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0035:
            X.0qQ.A0A(r0)
            r5.A05 = r0
            if (r12 == 0) goto L_0x0095
            r1 = 2131959596(0x7f131f2c, float:1.9555837E38)
        L_0x003f:
            r0 = r17
            java.lang.String r0 = r0.getString(r1)
        L_0x0045:
            X.0qQ.A0A(r0)
            r5.A0q(r0)
            if (r10 != r6) goto L_0x0056
            X.MmR r2 = r8.A07
            X.MmR r0 = X.C67350MmR.ADMINS_AND_MODERATORS
            r1 = 2131958923(0x7f131c8b, float:1.9554472E38)
            if (r2 == r0) goto L_0x0059
        L_0x0056:
            r1 = 2131952258(0x7f130282, float:1.9540954E38)
        L_0x0059:
            r0 = 15
            X.C50025FJk.A01(r5, r7, r8, r0, r1)
            X.FJ8 r0 = X.FJ8.A00
            r5.A0C(r0)
            r0 = 1
            X.AnonymousClass7TH.A0a(r5, r0)
            X.MmR r1 = r8.A07
            X.MmR r0 = X.C67350MmR.ADMINS_AND_MODERATORS
            if (r1 != r0) goto L_0x001d
            com.instagram.common.session.UserSession r0 = r8.A05
            X.Oxp r2 = X.C69867NtV.A00(r0)
            int r11 = r8.A00
            java.lang.String r4 = X.C300965yF.A07(r9)
            java.lang.String r5 = r8.A08
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r7.iterator()
        L_0x0083:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0135
            com.instagram.model.direct.DirectShareTarget r0 = X.DbT.A0f(r1)
            java.util.ArrayList r0 = r0.A0B()
            X.018.A16(r0, r3)
            goto L_0x0083
        L_0x0095:
            int r4 = r7.size()
            java.lang.Object r1 = r7.get(r11)
            com.instagram.model.direct.DirectShareTarget r1 = (com.instagram.model.direct.DirectShareTarget) r1
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r3 = r8.A05
            com.instagram.user.model.User r0 = r0.A01(r3)
            java.lang.String r2 = X.AnonymousClass50n.A03(r1, r0)
            X.0qQ.A07(r2)
            if (r10 != r6) goto L_0x00c4
            X.MmR r1 = r8.A07
            X.MmR r0 = X.C67350MmR.ADMINS_AND_MODERATORS
            if (r1 != r0) goto L_0x00c4
            boolean r0 = X.AnonymousClass7OI.A01(r3, r9)
            r1 = 2131958680(0x7f131b98, float:1.955398E38)
            if (r0 == 0) goto L_0x003f
            r1 = 2131958681(0x7f131b99, float:1.9553981E38)
            goto L_0x003f
        L_0x00c4:
            android.content.res.Resources r1 = r17.getResources()
            r0 = 2131820641(0x7f110061, float:1.9274003E38)
            java.lang.String r0 = X.DbV.A0v(r1, r2, r0, r4)
            goto L_0x0045
        L_0x00d1:
            X.MmR r2 = r8.A07
            X.MmR r0 = X.C67350MmR.ADMINS_AND_MODERATORS
            r1 = 1
            if (r2 != r0) goto L_0x00fa
            int r0 = r7.size()
            android.content.res.Resources r4 = r17.getResources()
            r3 = 2131958679(0x7f131b97, float:1.9553977E38)
            if (r0 <= r1) goto L_0x0101
            r3 = 2131958678(0x7f131b96, float:1.9553975E38)
            java.lang.Object[] r2 = new java.lang.Object[r1]
            int r0 = r7.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x00f2:
            r2[r11] = r0
            java.lang.String r0 = r4.getString(r3, r2)
            goto L_0x0035
        L_0x00fa:
            android.content.res.Resources r4 = r17.getResources()
            r3 = 2131958566(0x7f131b26, float:1.9553748E38)
        L_0x0101:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.instagram.common.session.UserSession r0 = r8.A05
            r16 = r0
            int r14 = r7.size()
            java.util.ArrayList r13 = X.DbS.A0v(r14)
            r1 = 0
        L_0x0110:
            if (r1 >= r14) goto L_0x0126
            java.lang.Object r15 = r7.get(r1)
            com.instagram.model.direct.DirectShareTarget r15 = (com.instagram.model.direct.DirectShareTarget) r15
            com.instagram.user.model.User r0 = X.DbT.A0j(r16)
            java.lang.String r0 = X.AnonymousClass50n.A03(r15, r0)
            r13.add(r0)
            int r1 = r1 + 1
            goto L_0x0110
        L_0x0126:
            java.lang.String r1 = ", "
            X.3El r0 = new X.3El
            r0.<init>(r1)
            java.lang.String r0 = r0.A02(r13)
            X.0qQ.A07(r0)
            goto L_0x00f2
        L_0x0135:
            java.util.HashMap r10 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = ","
            X.G3H r0 = X.G3H.A00
            java.lang.String r1 = X.DbT.A0z(r1, r3, r0)
            java.lang.String r0 = "moderator_igids"
            r10.put(r0, r1)
            com.instagram.common.session.UserSession r3 = r2.A00
            java.lang.String r6 = "thread_add_moderators"
            java.lang.String r7 = "tap"
            java.lang.String r8 = "invite_button"
            java.lang.String r9 = "add_moderators_sheet"
            X.C69871NtZ.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FBR.A01(java.util.ArrayList):void");
    }

    public static final void A00(FBR fbr, ArrayList arrayList) {
        FragmentActivity activity;
        Integer num;
        String str;
        C254763t0 r2;
        ArrayList arrayList2 = arrayList;
        ArrayList A022 = FFJ.A02(arrayList2);
        FBR fbr2 = fbr;
        Context context = fbr2.A02;
        AnonymousClass6ST r10 = new AnonymousClass6ST(context, true);
        DbU.A18(r10.getContext(), r10, 2131958577);
        int i = fbr2.A01;
        if (i != 29) {
            if (i == 47) {
                UserSession userSession = fbr2.A05;
                AnonymousClass4DH r22 = fbr2.A03;
                String A072 = C300965yF.A07(fbr2.A06);
                0qQ.A0B(A072, 2);
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r22, userSession), "direct_group_add_member");
                if (A0e.isSampled()) {
                    A0e.AAJ("open_thread_id", A072);
                    A0e.Cgf();
                }
            }
        } else if (fbr2.A07 == C67350MmR.COLLABORATOR) {
            C313756gx A002 = C313746gw.A00(fbr2.A05);
            int i2 = fbr2.A00;
            String A073 = C300965yF.A07(fbr2.A06);
            String str2 = fbr2.A08;
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                018.A16(DbT.A0f(it).A0B(), A1C);
            }
            1Ln A0J = DbT.A0J(A002);
            if (DbT.A1Y(A0J)) {
                HashMap A1E = AnonymousClass7TE.A1E();
                A1E.put("collaborator_igids", DbT.A0z(",", A1C, G3G.A00));
                DbW.A17(A0J, A002);
                DbV.A1M(A0J, "thread_add_collaborators");
                A0J.A0p("invite_button");
                A0J.A0i(DbZ.A0b(A0J, "add_collaborators_sheet", A073, str2, i2));
                A0J.A0w(A1E);
                A0J.Cgf();
            }
        }
        1a8 r8 = fbr2.A04;
        AnonymousClass7ZA r14 = fbr2.A0B;
        C254793t3 r23 = fbr2.A06;
        ArrayList arrayList3 = fbr2.A0D;
        ArrayList A0p = AnonymousClass7TF.A0p(arrayList3);
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            A0p.add(((PendingRecipient) it2.next()).A08);
        }
        List A0X = 00k.A0X(A0p);
        ArrayList A003 = FFJ.A00(fbr2.A05, arrayList2);
        r8.A02(r14.A9n(context, r23, fbr2.A07, A0X, A003, i), new C51137Fp9(0, fbr2, r10));
        AnonymousClass0fN.A00(r10);
        C67089Mi7 mi7 = fbr2.A0C;
        if (mi7 != null) {
            ArrayList A0p2 = AnonymousClass7TF.A0p(arrayList3);
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                A0p2.add(((PendingRecipient) it3.next()).getId());
            }
            C254923tH A004 = C300965yF.A00(r23);
            boolean z = fbr2.A0E;
            Iterator A1G = AnonymousClass7TE.A1G(arrayList2);
            boolean z2 = true;
            boolean z3 = false;
            while (A1G.hasNext()) {
                if (((DirectShareTarget) AnonymousClass7TF.A0a(A1G)).A0E()) {
                    z3 = true;
                }
            }
            if (!fbr2.A09 && !z3) {
                z2 = false;
            }
            EK7 ek7 = mi7.A02;
            if (ek7 != null) {
                ek7.A01();
            }
            C67210Mk6 mk6 = mi7.A03;
            if (mk6 != null && !mi7.A0A) {
                mi7.A0A = true;
                HashSet hashSet = new HashSet(A0p2);
                hashSet.addAll(A022);
                Integer num2 = AnonymousClass05K.A0C;
                if (z) {
                    num = AnonymousClass05K.A15;
                } else {
                    num = AnonymousClass05K.A0u;
                }
                Boolean valueOf = Boolean.valueOf(z2);
                if (A004 == C254923tH.DJANGO) {
                    if (r23 instanceof C254763t0) {
                        r2 = (C254763t0) r23;
                    } else if (!(r23 instanceof MsysThreadId)) {
                        if (r23 instanceof C69042Ndc) {
                            r2 = ((C69042Ndc) r23).A00;
                        } else {
                            throw AnonymousClass7TE.A0z(AnonymousClass7TG.A0m(r23, AnonymousClass000.A00(108), AnonymousClass7TE.A1A()));
                        }
                    }
                    str = r2.A00;
                    mk6.A09(A004, valueOf, num2, num, (String) null, str, hashSet);
                }
                str = null;
                mk6.A09(A004, valueOf, num2, num, (String) null, str, hashSet);
            }
        }
        AnonymousClass4DH r1 = fbr2.A03;
        if (!r1.mDetached && (activity = r1.getActivity()) != null) {
            DbT.A0K(activity).A0T();
        }
    }

    public FBR(AnonymousClass4DH r2, UserSession userSession, AnonymousClass7ZA r4, C67089Mi7 mi7, C254793t3 r6, C67350MmR mmR, String str, ArrayList arrayList, int i, int i2, boolean z, boolean z2, boolean z3) {
        AnonymousClass7TG.A1P(userSession, r6);
        AnonymousClass7TG.A1S(arrayList, r4);
        0qQ.A0B(mmR, 12);
        this.A05 = userSession;
        this.A03 = r2;
        this.A06 = r6;
        this.A08 = str;
        this.A0D = arrayList;
        this.A0B = r4;
        this.A0A = z;
        this.A0E = z2;
        this.A09 = z3;
        this.A01 = i;
        this.A00 = i2;
        this.A07 = mmR;
        this.A0C = mi7;
        this.A02 = r2.requireContext();
    }
}
