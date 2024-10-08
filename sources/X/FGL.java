package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;

public final class FGL {
    public static boolean A07;
    public final Fragment A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C311496cm A03;
    public final C51950G8t A04;
    public final C49498Ewd A05;
    public final boolean A06;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002d, code lost:
        if (X.C67004Mgc.A06(r2, "android.permission.READ_CONTACTS") == false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C49711F2w A00(X.1P0 r16, X.G7Y r17, java.lang.String r18, java.lang.String r19, boolean r20, boolean r21, boolean r22) {
        /*
            r15 = this;
            r6 = r15
            androidx.fragment.app.Fragment r1 = r15.A00
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            android.app.Activity r2 = r3.getParent()
            if (r2 != 0) goto L_0x000e
            r2 = r3
        L_0x000e:
            X.EX9 r0 = X.EX9.CI_NUX_STEP
            r7 = r18
            boolean r11 = X.Dba.A1X(r0, r7)
            X.EX9 r0 = X.EX9.PARTIAL_CI_NUX
            boolean r10 = X.Dba.A1X(r0, r7)
            android.content.Context r0 = r1.requireContext()
            java.lang.String r1 = "android.permission.READ_CONTACTS"
            boolean r0 = X.1DL.A07(r0, r1)
            if (r0 != 0) goto L_0x002f
            boolean r0 = X.C67004Mgc.A06(r2, r1)
            r13 = 1
            if (r0 != 0) goto L_0x0030
        L_0x002f:
            r13 = 0
        L_0x0030:
            X.F2w r1 = new X.F2w
            r4 = r16
            r5 = r17
            r8 = r19
            r12 = r20
            r14 = r21
            r9 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FGL.A00(X.1P0, X.G7Y, java.lang.String, java.lang.String, boolean, boolean, boolean):X.F2w");
    }

    public final void A04(1P0 r14, G7Y g7y, EX9 ex9, String str, String str2, boolean z, boolean z2) {
        String str3 = str;
        0qQ.A0B(str3, 0);
        C311496cm r0 = this.A03;
        Fragment fragment = this.A00;
        Context requireContext = fragment.requireContext();
        boolean z3 = this.A06;
        C49208ErD.A00(requireContext, r0.A01, r0.A03, str3, z3);
        G7Y g7y2 = g7y;
        boolean z4 = z2;
        if (ex9 == EX9.REVISED_INLINE_UPSELL) {
            Context requireContext2 = fragment.requireContext();
            UserSession userSession = this.A02;
            if (C267044ar.A01(requireContext2, userSession)) {
                A02(this, true);
                A03(this, false);
                return;
            }
            A02(this, false);
            A00((1P0) null, g7y2, str3, (String) null, z4, false, false).A00("ci", true, true);
            C50277FWi.A00(userSession);
            return;
        }
        A00(r14, g7y, str3, str2, z4, z, false).A00(str3, false, false);
    }

    public final void A06(G7Y g7y, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        String str4 = str;
        if (1DL.A07(this.A00.requireContext(), "android.permission.READ_CONTACTS")) {
            A00((1P0) null, g7y, str4, str2, z, z2, true).A00(str3, z3, false);
        } else {
            this.A03.A04(AnonymousClass05K.A0Y, str3, str.equals(EX9.PARTIAL_CI_NUX.toString()));
        }
    }

    public final void A07(EX9 ex9) {
        A05((G7Y) null, ex9, true, false, false);
    }

    public static final void A01(Context context, FGL fgl, EX9 ex9, String str) {
        C49906FEe.A01(context, fgl.A02, SimpleWebViewActivity.A02, new C11225SFz(SQU.A01(context, "https://help.instagram.com/227486307449481")), str);
        C311496cm r3 = fgl.A03;
        String A0t = DbX.A0t(ex9);
        0Aj A0e = AnonymousClass7TE.A0e(r3.A02, "ci_modal_learn_more_tapped");
        if (A0t == null) {
            A0t = r3.A04;
        }
        DbV.A1J(A0e, A0t);
    }

    public static final void A02(FGL fgl, boolean z) {
        UserSession userSession = fgl.A02;
        1Au.A00(userSession).A1B(z);
        0xI A002 = 0xI.A00(fgl.A01, "contacts_import_permissions");
        A002.A09("enabled", Boolean.valueOf(z));
        19i A012 = DbT.A0P(userSession).A01(19f.A1V);
        if (A012 != null) {
            A002.A0C("phone_id", A012.A01);
        }
        DbU.A1R(A002, userSession);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.1qK, java.lang.Object] */
    public static final void A03(FGL fgl, boolean z) {
        Fragment fragment;
        0hq r0;
        Fragment fragment2 = fgl.A00;
        if ((fragment2 instanceof C51859G4r) || ((fragment = fragment2.mParentFragment) != null && (fragment instanceof C51859G4r))) {
            AnonymousClass1Nd.A00(fgl.A02).A00(new Object());
        } else if ((z || (r0 = fragment2.mFragmentManager) == null || AnonymousClass06S.A01(r0)) && AnonymousClass7TF.A1V(C66571pQ.A02)) {
            C309516Yo A0M = DbS.A0M(fragment2.requireActivity(), fgl.A02);
            A0M.A0G = true;
            FC6.A01();
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putBoolean(C273654mx.A00(35), false);
            DbW.A0x(A0a, new E3O(), A0M);
        }
    }

    /* JADX WARNING: type inference failed for: r1v11, types: [X.FJl] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.G7Y r24, X.EX9 r25, boolean r26, boolean r27, boolean r28) {
        /*
            r23 = this;
            r11 = r23
            r2 = r25
            if (r26 == 0) goto L_0x0018
            X.6cm r6 = r11.A03
            androidx.fragment.app.Fragment r0 = r11.A00
            android.content.Context r5 = r0.requireContext()
            boolean r4 = r11.A06
            r3 = 0
            com.instagram.common.session.UserSession r1 = r6.A03
            X.0iw r0 = r6.A01
            X.C49208ErD.A00(r5, r0, r1, r3, r4)
        L_0x0018:
            androidx.fragment.app.Fragment r1 = r11.A00
            android.content.Context r0 = r1.requireContext()
            com.instagram.common.session.UserSession r7 = r11.A02
            boolean r0 = X.C267044ar.A01(r0, r7)
            r3 = 0
            if (r0 == 0) goto L_0x002f
            r0 = 1
            A02(r11, r0)
            A03(r11, r3)
            return
        L_0x002f:
            A02(r11, r3)
            java.lang.String r14 = r2.toString()
            r12 = 0
            r13 = r24
            r16 = r28
            r15 = r12
            r18 = r3
            r17 = r3
            X.F2w r20 = r11.A00(r12, r13, r14, r15, r16, r17, r18)
            android.content.Context r5 = r1.requireContext()
            if (r27 != 0) goto L_0x005b
            X.EX9 r0 = X.EX9.SEARCH_NULLSTATE_UPSELL
            if (r2 == r0) goto L_0x005b
            X.EX9 r0 = X.EX9.FEED_SUGGESTED_USERS_UPSELL
            if (r2 == r0) goto L_0x005b
            X.EX9 r0 = X.EX9.FEED_SUGGESTED_PRODUCERS_UPSELL
            if (r2 == r0) goto L_0x005b
            X.EX9 r0 = X.EX9.NEWSFEED_SU_EARLY_FRIENDING
            if (r2 == r0) goto L_0x005b
            r2 = 0
        L_0x005b:
            r0 = 2131956569(0x7f131359, float:1.9549697E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r5, r0)
            X.8ab r4 = X.DbS.A0Y(r5)
            r4.A05 = r0
            r0 = 2131956574(0x7f13135e, float:1.9549708E38)
            java.lang.String r6 = X.AnonymousClass7TE.A16(r5, r0)
            X.0Tu r9 = X.0Tu.A05
            r0 = 36323040933718792(0x810b9d00042b08, double:3.034175575405312E-306)
            boolean r0 = X.182.A06(r9, r7, r0)
            r8 = 32
            if (r0 != 0) goto L_0x00ec
            r0 = 36323040933784329(0x810b9d00052b09, double:3.034175575446758E-306)
            boolean r0 = X.182.A06(r9, r7, r0)
            if (r0 != 0) goto L_0x00ec
            r0 = 2131956573(0x7f13135d, float:1.9549706E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r5, r0)
            java.lang.String r8 = X.002.A0T(r0, r6, r8)
            r0 = 11
            X.FJl r1 = new X.FJl
            r1.<init>((int) r0, (java.lang.Object) r5, (java.lang.Object) r11, (java.lang.Object) r2)
        L_0x009b:
            r4.A0Z(r1, r8, r6)
            r1 = 2131956567(0x7f131357, float:1.9549693E38)
            X.FJ6 r0 = X.FJ6.A00
            r4.A0I(r0, r1)
            r1 = 2131956568(0x7f131358, float:1.9549695E38)
            X.FJ7 r0 = X.FJ7.A00
            r4.A0H(r0, r1)
            X.FJs r0 = new X.FJs
            r17 = r0
            r18 = r5
            r19 = r13
            r21 = r11
            r22 = r2
            r17.<init>(r18, r19, r20, r21, r22)
            r4.A0f(r0)
            boolean r0 = r11.A06
            if (r0 == 0) goto L_0x00c7
            r4.A0r(r3)
        L_0x00c7:
            X.DbT.A1V(r4)
            X.6cm r4 = r11.A03
            java.lang.String r3 = X.DbX.A0t(r2)
            X.0wc r1 = r4.A02
            java.lang.String r0 = "ci_modal_impression"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            if (r3 != 0) goto L_0x00dc
            java.lang.String r3 = r4.A04
        L_0x00dc:
            X.DbS.A1N(r2, r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r26)
            java.lang.String r0 = "user_initiated"
            r2.A7p(r0, r1)
            r2.Cgf()
            return
        L_0x00ec:
            r0 = 2131956571(0x7f13135b, float:1.9549701E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r5, r0)
            r0 = 2131956572(0x7f13135c, float:1.9549704E38)
            java.lang.String r7 = X.AnonymousClass7TE.A16(r5, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass7TF.A0n(r1)
            r1.append(r8)
            r1.append(r6)
            java.lang.String r0 = "\n\n"
            r1.append(r0)
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r7, r1)
            android.text.SpannableStringBuilder r8 = X.DbS.A0C(r1)
            r0 = 2131956570(0x7f13135a, float:1.95497E38)
            java.lang.String r9 = X.AnonymousClass7TE.A16(r5, r0)
            r0 = 1062836634(0x3f59999a, float:0.85)
            android.text.style.RelativeSizeSpan r10 = new android.text.style.RelativeSizeSpan
            r10.<init>(r0)
            int r7 = X.00l.A08(r1, r9, r3, r3)
            int r0 = r9.length()
            int r7 = r7 + r0
            int r1 = r8.length()
            r0 = 33
            r8.setSpan(r10, r7, r1, r0)
            r19 = 1
            X.FIZ r1 = new X.FIZ
            r16 = r2
            r17 = r11
            r18 = r9
            r14 = r1
            r15 = r5
            r14.<init>(r15, r16, r17, r18, r19)
            goto L_0x009b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FGL.A05(X.G7Y, X.EX9, boolean, boolean, boolean):void");
    }

    public FGL(Fragment fragment, AnonymousClass0iw r3, UserSession userSession, C51950G8t g8t, C49498Ewd ewd) {
        AnonymousClass7TG.A1U(userSession, r3, fragment);
        this.A02 = userSession;
        this.A01 = r3;
        this.A00 = fragment;
        this.A04 = g8t;
        this.A05 = ewd;
        this.A03 = new C311496cm(r3, userSession);
        this.A06 = AnonymousClass7TF.A1V(g8t);
    }
}
