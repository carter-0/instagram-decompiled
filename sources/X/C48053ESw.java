package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.common.upsell.DirectWellBeingUpsellBottomSheetData;
import com.instagram.urlhandlers.aistudio.AiStudioUrlHandlerActivity;
import java.util.ArrayList;
import org.webrtc.EglBase14Impl;

/* renamed from: X.ESw  reason: case insensitive filesystem */
public final class C48053ESw extends C2806552w {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00f0, code lost:
        r1.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00f3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0161, code lost:
        X.FFM.A02(r1, r2, r3, r2, r5, r2.getString(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0169, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x01e9, code lost:
        r0 = "https://help.instagram.com/477434105621119";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x01eb, code lost:
        r2 = X.Dba.A0J(r3, r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x025f, code lost:
        r2.A0A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0262, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0287, code lost:
        r1 = X.0cp.A03(X.Pxd.A00(r0));
        r0 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0291, code lost:
        X.0kR.A0F((android.content.Context) r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0296, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00af, code lost:
        r1.A0B(r3, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r23) {
        /*
            r22 = this;
            r7 = r22
            int r0 = r7.A00
            r1 = r23
            switch(r0) {
                case 0: goto L_0x0285;
                case 1: goto L_0x0282;
                case 2: goto L_0x0263;
                case 3: goto L_0x0225;
                case 4: goto L_0x0206;
                case 5: goto L_0x01f0;
                case 6: goto L_0x01df;
                case 7: goto L_0x01aa;
                case 8: goto L_0x008c;
                case 9: goto L_0x0055;
                case 10: goto L_0x019b;
                case 11: goto L_0x0175;
                case 12: goto L_0x016a;
                case 13: goto L_0x0147;
                case 14: goto L_0x0130;
                case 15: goto L_0x00b3;
                case 16: goto L_0x0110;
                case 17: goto L_0x003f;
                case 18: goto L_0x00f4;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r5 = r7.A02
            X.ERY r5 = (X.ERY) r5
            X.0eM r4 = r5.A00
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r4)
            java.lang.String r0 = "quiet_mode"
            X.0xG r0 = X.DbS.A0O(r0)
            X.AnonymousClass7TG.A1N(r1, r0)
            X.DcM r3 = new X.DcM
            r3.<init>(r0, r1)
            java.lang.Object r0 = r7.A01
            X.3FW r0 = (X.AnonymousClass3FW) r0
            X.F10 r1 = X.Dba.A0Q(r0)
            java.lang.String r2 = "self_profile"
            java.lang.String r0 = "ig_quiet_mode_self_profile_bottom_sheet_link_tap"
            X.DcM.A03(r3, r1, r0, r2)
            X.DbT.A1J(r5)
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.FGR.A05(r1, r0, r2)
        L_0x003e:
            return
        L_0x003f:
            java.lang.Object r1 = r7.A01
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            java.lang.Object r0 = r7.A02
            X.0lg r0 = (X.0lg) r0
            X.6Yo r1 = X.DbS.A0M(r1, r0)
            X.NKT r0 = new X.NKT
            r0.<init>()
            r1.A0D(r0)
            goto L_0x00f0
        L_0x0055:
            java.lang.Object r5 = r7.A02
            X.E5u r5 = (X.C47511E5u) r5
            X.0eM r4 = r5.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.F9v r1 = X.C48804EkS.A00(r0)
            java.lang.String r0 = "CLICK_BROWSER_SETTING"
            X.C49855F9v.A00(r1, r0)
            java.lang.Object r2 = r7.A01
            X.37D r2 = (X.AnonymousClass37D) r2
            if (r2 == 0) goto L_0x0077
            r1 = 0
            X.FmH r0 = new X.FmH
            r0.<init>(r1)
            X.DbU.A1U(r0, r2, r2)
        L_0x0077:
            X.6Yo r0 = X.DbZ.A0P(r5, r4)
            r3 = 0
            r0.A06()
            X.6Yo r1 = X.DbZ.A0P(r5, r4)
            r0 = 1
            r1.A0F = r0
            X.ERf r0 = new X.ERf
            r0.<init>()
            goto L_0x00af
        L_0x008c:
            X.37E r0 = X.AnonymousClass37D.A00
            java.lang.Object r2 = r7.A01
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            X.DbX.A10(r2, r0)
            java.lang.Object r0 = r7.A02
            X.E5z r0 = (X.C47516E5z) r0
            X.0eM r1 = r0.A00
            X.6Yo r0 = X.DbX.A0N(r2, r1)
            r3 = 0
            r0.A06()
            X.6Yo r1 = X.DbX.A0N(r2, r1)
            r0 = 1
            r1.A0F = r0
            X.ERe r0 = new X.ERe
            r0.<init>()
        L_0x00af:
            r1.A0B(r3, r0)
            goto L_0x00f0
        L_0x00b3:
            java.lang.Object r1 = r7.A02
            X.DwU r1 = (X.DwU) r1
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x003e
            X.FFR.A03()
            android.os.Bundle r4 = r1.A00()
            r2 = 0
            r1 = 33
            r0 = 59
            java.lang.String r1 = X.DcV.A02(r2, r1, r0)
            r0 = 1
            r4.putBoolean(r1, r0)
            java.lang.String r0 = "ARG_IS_ENABLING_WHATSAPP"
            r4.putBoolean(r0, r2)
            X.E3L r3 = new X.E3L
            r3.<init>()
            r3.setArguments(r4)
            java.lang.Object r0 = r7.A01
            X.EQk r0 = (X.C48001EQk) r0
            java.lang.Object r2 = r0.A01
            X.E5C r2 = (X.E5C) r2
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            java.lang.String r0 = X.E5C.__redex_internal_original_name
            com.instagram.common.session.UserSession r0 = r2.A02
            X.6Yo r1 = X.DbV.A0N(r3, r1, r0)
        L_0x00f0:
            r1.A04()
            return
        L_0x00f4:
            java.lang.Object r5 = r7.A02
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r4 = r7.A01
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            X.1OC r3 = X.FFP.A01(r4, r5)
            X.0hq r2 = r4.getSupportFragmentManager()
            r1 = 2
            X.EQT r0 = new X.EQT
            r0.<init>(r2, r4, r5, r1)
            r3.A00 = r0
            X.1ES.A03(r3)
            return
        L_0x0110:
            java.lang.Object r0 = r7.A02
            com.instagram.base.activity.IgFragmentActivity r0 = (com.instagram.base.activity.IgFragmentActivity) r0
            X.0wW r3 = r0.getSession()
            X.DbS.A1Z(r3)
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36887025977983725(0x830c8e003d02ed, double:3.3908419883839467E-306)
            java.lang.String r0 = X.182.A04(r2, r3, r0)
            android.net.Uri r1 = X.0cp.A03(r0)
            java.lang.Object r0 = r7.A01
            goto L_0x0291
        L_0x0130:
            java.lang.Object r1 = r7.A02
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r2 = r7.A01
            X.E55 r2 = (X.E55) r2
            X.0wW r3 = r2.A00
            java.lang.String r0 = "https://help.instagram.com/519522125107875"
            java.lang.String r5 = X.SQU.A02(r1, r0)
            X.0qQ.A07(r5)
            r0 = 2131957399(0x7f131697, float:1.955138E38)
            goto L_0x0161
        L_0x0147:
            java.lang.Object r1 = r7.A02
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r2 = r7.A01
            X.E55 r2 = (X.E55) r2
            X.0wW r3 = r2.A00
            r0 = 35
            java.lang.String r0 = X.C66579MXk.A00(r0)
            java.lang.String r5 = X.SQU.A02(r1, r0)
            X.0qQ.A07(r5)
            r0 = 2131975071(0x7f135b9f, float:1.9587224E38)
        L_0x0161:
            java.lang.String r6 = r2.getString(r0)
            r4 = r2
            X.FFM.A02(r1, r2, r3, r4, r5, r6)
            return
        L_0x016a:
            java.lang.Object r3 = r7.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r7.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.2EG r1 = X.2EG.A2B
            goto L_0x01e9
        L_0x0175:
            java.lang.Object r0 = r7.A02
            X.E0y r0 = (X.C47406E0y) r0
            android.content.Context r5 = r0.requireContext()
            X.0eM r4 = r0.A01
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r4)
            java.lang.Object r0 = r7.A01
            com.instagram.direct.wellbeing.common.upsell.DirectWellBeingUpsellBottomSheetData r0 = (com.instagram.direct.wellbeing.common.upsell.DirectWellBeingUpsellBottomSheetData) r0
            java.lang.String r1 = r0.A07
            X.2EG r0 = r0.A01
            r3 = 0
            X.Dbb.A0k(r5, r2, r0, r1)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r4)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.C49762F5o.A00(r2, r1, r0, r3)
            return
        L_0x019b:
            java.lang.Object r3 = r7.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r0 = r7.A02
            X.P2x r0 = (X.C72358P2x) r0
            com.instagram.common.session.UserSession r2 = r0.A02
            X.2EG r1 = X.2EG.A1V
            java.lang.String r0 = "https://help.instagram.com/1719149968895799"
            goto L_0x01eb
        L_0x01aa:
            r8 = 0
            X.0qQ.A0B(r1, r8)
            X.FEe r3 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            java.lang.Object r2 = r7.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r7.A02
            X.0lg r1 = (X.0lg) r1
            r0 = 1418(0x58a, float:1.987E-42)
            java.lang.String r21 = X.AnonymousClass000.A00(r0)
            r6 = 0
            r0 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r20 = r2.getString(r0)
            r13 = 1
            com.instagram.simplewebview.SimpleWebViewConfig r5 = new com.instagram.simplewebview.SimpleWebViewConfig
            r7 = r6
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r14 = r8
            r15 = r8
            r16 = r13
            r17 = r8
            r18 = r8
            r19 = r8
            r5.<init>((java.lang.String) r6, (java.lang.String) r7, (boolean) r8, (boolean) r9, (boolean) r10, (boolean) r11, (boolean) r12, (boolean) r13, (boolean) r14, (boolean) r15, (boolean) r16, (boolean) r17, (boolean) r18, (boolean) r19, (java.lang.String) r20, (java.lang.String) r21)
            r3.A02(r2, r1, r5)
            return
        L_0x01df:
            java.lang.Object r3 = r7.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r7.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.2EG r1 = X.2EG.A1U
        L_0x01e9:
            java.lang.String r0 = "https://help.instagram.com/477434105621119"
        L_0x01eb:
            X.SUL r2 = X.Dba.A0J(r3, r2, r1, r0)
            goto L_0x025f
        L_0x01f0:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Object r1 = r7.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r7.A02
            X.E0S r0 = (X.E0S) r0
            X.0eM r0 = r0.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.F5K.A01(r1, r0)
            return
        L_0x0206:
            java.lang.Object r4 = r7.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r0 = r7.A02
            X.E2a r0 = (X.C47430E2a) r0
            X.0eM r0 = r0.A07
            X.0lg r3 = X.DbT.A0X(r0)
            java.lang.String r2 = "https://www.facebook.com/help/instagram/1754230088373607?ref=learn_more"
            r1 = 2131964884(0x7f1333d4, float:1.9566562E38)
            r0 = 1
            X.0qQ.A0B(r3, r0)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r4, r1)
            X.FGP.A04(r4, r3, r2, r0)
            return
        L_0x0225:
            java.lang.Object r6 = r7.A02
            X.E0u r6 = (X.C47402E0u) r6
            X.0eM r5 = r6.A01
            X.0lg r1 = X.DbT.A0X(r5)
            java.lang.Object r4 = r7.A01
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            X.0eM r0 = r6.A00
            java.lang.Object r0 = r0.getValue()
            X.8Wg r0 = (X.C357048Wg) r0
            java.lang.String r3 = r0.A00
            r2 = 0
            r7 = 0
            X.0wc r1 = X.DbT.A0Q(r6, r1, r7)
            java.lang.String r0 = "instagram_bc_ads_ppl_boost_eligibility_error"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = "instagram_bc_ad_ppl_boost_eligibility_error_surface_guidelines"
            X.Dbc.A0f(r1, r0, r2, r3, r4)
            android.content.Context r3 = r6.requireContext()
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r5)
            X.2EG r5 = X.2EG.A0c
            java.lang.String r6 = "https://help.instagram.com/831260938290279"
            X.SUL r2 = new X.SUL
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x025f:
            r2.A0A()
            return
        L_0x0263:
            java.lang.Object r0 = r7.A02
            X.0lg r0 = (X.0lg) r0
            X.7Pr r1 = X.DbS.A0W(r0)
            java.lang.Object r2 = r7.A01
            android.app.Activity r2 = (android.app.Activity) r2
            r0 = 2131969177(0x7f134499, float:1.957527E38)
            X.DbZ.A0z(r2, r1, r0)
            X.7Pu r1 = r1.A00()
            X.E0e r0 = new X.E0e
            r0.<init>()
            r1.A02(r2, r0)
            return
        L_0x0282:
            r0 = 762(0x2fa, float:1.068E-42)
            goto L_0x0287
        L_0x0285:
            r0 = 761(0x2f9, float:1.066E-42)
        L_0x0287:
            java.lang.String r0 = X.Pxd.A00(r0)
            android.net.Uri r1 = X.0cp.A03(r0)
            java.lang.Object r0 = r7.A02
        L_0x0291:
            android.content.Context r0 = (android.content.Context) r0
            X.0kR.A0F(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48053ESw.onClick(android.view.View):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48053ESw(Integer num, Object obj, Object obj2, int i) {
        super(num);
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48053ESw(C47402E0u e0u, ArrayList arrayList, int i) {
        super(Integer.valueOf(i));
        this.A00 = 3;
        this.A02 = e0u;
        this.A01 = arrayList;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48053ESw(C47511E5u e5u, AnonymousClass37D r3, int i) {
        super(Integer.valueOf(i));
        this.A00 = 9;
        this.A02 = e5u;
        this.A01 = r3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48053ESw(AiStudioUrlHandlerActivity aiStudioUrlHandlerActivity, AiStudioUrlHandlerActivity aiStudioUrlHandlerActivity2, int i) {
        super(Integer.valueOf(i));
        this.A00 = 16;
        this.A02 = aiStudioUrlHandlerActivity;
        this.A01 = aiStudioUrlHandlerActivity2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48053ESw(Context context, C72358P2x p2x, int i) {
        super(Integer.valueOf(i));
        this.A00 = 10;
        this.A01 = context;
        this.A02 = p2x;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48053ESw(FragmentActivity fragmentActivity, C47516E5z e5z, int i) {
        super(Integer.valueOf(i));
        this.A00 = 8;
        this.A01 = fragmentActivity;
        this.A02 = e5z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48053ESw(AnonymousClass3FW r2, ERY ery, int i) {
        super(Integer.valueOf(i));
        this.A00 = 19;
        this.A02 = ery;
        this.A01 = r2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48053ESw(DirectWellBeingUpsellBottomSheetData directWellBeingUpsellBottomSheetData, C47406E0y e0y, int i) {
        super(Integer.valueOf(i));
        this.A00 = 11;
        this.A02 = e0y;
        this.A01 = directWellBeingUpsellBottomSheetData;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48053ESw(Context context, E0S e0s, int i) {
        super(Integer.valueOf(i));
        this.A00 = 5;
        this.A01 = context;
        this.A02 = e0s;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48053ESw(Context context, C47430E2a e2a, int i) {
        super(Integer.valueOf(i));
        this.A00 = 4;
        this.A01 = context;
        this.A02 = e2a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48053ESw(Context context, UserSession userSession, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = context;
        this.A02 = userSession;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48053ESw(FragmentActivity fragmentActivity, UserSession userSession, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        switch (i2) {
            case 2:
            case EglBase14Impl.EGLExt_SDK_VERSION:
                this.A02 = userSession;
                this.A01 = fragmentActivity;
                break;
            default:
                this.A01 = fragmentActivity;
                this.A02 = userSession;
                break;
        }
    }
}
