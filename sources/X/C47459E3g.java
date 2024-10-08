package X;

import android.os.Bundle;
import android.widget.TextView;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.Map;

/* renamed from: X.E3g  reason: case insensitive filesystem */
public final class C47459E3g extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "SignUpWithBizOptionFragment";
    public TextView A00;
    public AnonymousClass0wW A01;
    public CircularImageView A02;
    public F3M A03;
    public String A04 = "suma";
    public String A05;
    public String A06;
    public BusinessFlowAnalyticsLogger A07;
    public final 1P0 A08 = new C47691EDa(this, 15);

    public final String getModuleName() {
        return "sign_up_with_biz_option";
    }

    public final AnonymousClass0wW getSession() {
        return this.A01;
    }

    public final boolean onBackPressed() {
        C49920FEv.A00.A02(this.A01, "sign_up_with_biz_option");
        AnonymousClass0wW r4 = this.A01;
        String str = this.A04;
        0xI A002 = C48730EjF.A00(AnonymousClass05K.A00);
        A002.A0C("step", "sign_up_with_biz_option");
        A002.A0C(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        A002.A0C("fb_user_id", (String) null);
        if (r4 != null) {
            DbU.A1R(A002, r4);
            return false;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1095703127);
        C47459E3g.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = DbX.A0T(this);
        this.A05 = C49041EoL.A00(this.mArguments);
        if (requireArguments.containsKey(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY)) {
            this.A04 = StringFormatUtil.formatStrLocaleSafe(AnonymousClass000.A00(397), "suma", requireArguments.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY));
        }
        F3M f3m = new F3M(this, this.A01);
        this.A03 = f3m;
        f3m.A00();
        1Q9.A01("business_conversion_flow").A08();
        BusinessFlowAnalyticsLogger A002 = C319596qs.A00(C319586qr.BUSINESS_SIGNUP_FLOW, this, this.A01, AnonymousClass7TF.A0b());
        this.A07 = A002;
        if (A002 != null) {
            A002.Cka(new C22030Xtl("sign_up_with_biz_option", this.A04, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        AnonymousClass0fD.A09(868138010, A022);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: type inference failed for: r0v23, types: [X.3Fb, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r21, android.view.ViewGroup r22, android.os.Bundle r23) {
        /*
            r20 = this;
            r0 = -803739848(0xffffffffd017e738, float:-1.01940511E10)
            int r5 = X.AnonymousClass0fD.A02(r0)
            r0 = 2131628937(0x7f0e1389, float:1.888518E38)
            r2 = r21
            r1 = r22
            android.view.View r14 = X.DbT.A0C(r2, r1, r0)
            r1 = 2131629410(0x7f0e1562, float:1.888614E38)
            android.view.ViewGroup r0 = X.Dba.A04(r14)
            r11 = 1
            r2.inflate(r1, r0, r11)
            r0 = 2131437613(0x7f0b282d, float:1.849713E38)
            android.widget.TextView r4 = X.DbU.A0G(r14, r0)
            r0 = 12
            r15 = r20
            X.FPD.A00(r4, r0, r15)
            r0 = 2131429281(0x7f0b07a1, float:1.848023E38)
            android.widget.TextView r3 = X.DbU.A0G(r14, r0)
            r0 = 13
            X.FPD.A00(r3, r0, r15)
            r0 = 2131430949(0x7f0b0e25, float:1.8483613E38)
            android.widget.TextView r0 = X.DbU.A0G(r14, r0)
            r15.A00 = r0
            X.0wW r0 = r15.A01
            X.DiE r18 = X.C46634DiE.A1V
            X.EXD r17 = X.EXD.A05
            r2 = 0
            r19 = r2
            r16 = r0
            X.C49958FGq.A05(r14, r15, r16, r17, r18, r19)
            r0 = 2131435701(0x7f0b20b5, float:1.8493252E38)
            android.view.View r1 = r14.findViewById(r0)
            android.content.Context r0 = r15.requireContext()
            android.widget.TextView r1 = (android.widget.TextView) r1
            X.FCK.A00(r1, r0)
            com.facebook.common.callercontext.CallerContext r0 = X.FRZ.A00
            X.0Tu r7 = X.0Tu.A05
            r0 = 18298162703893671(0x410215000204a7, double:1.892217598788666E-307)
            boolean r0 = X.1AW.A06(r7, r0)
            r9 = 8
            if (r0 == 0) goto L_0x00ad
            r0 = 2131438389(0x7f0b2b35, float:1.8498704E38)
            X.DbT.A1F(r14, r0, r9)
            r0 = 2131433531(0x7f0b183b, float:1.848885E38)
            X.DbT.A1F(r14, r0, r2)
        L_0x007b:
            r0 = 18298162703828134(0x410215000104a6, double:1.8922175987627624E-307)
            boolean r0 = X.1AW.A06(r7, r0)
            if (r0 == 0) goto L_0x00a6
            r0 = 2131433718(0x7f0b18f6, float:1.848923E38)
            X.DbT.A1F(r14, r0, r2)
            r0 = 2131956835(0x7f131463, float:1.9550237E38)
            r3.setText(r0)
            r0 = 2131956838(0x7f131466, float:1.9550243E38)
            r4.setText(r0)
            android.widget.TextView r1 = r15.A00
            r0 = 2131956855(0x7f131477, float:1.9550277E38)
            r1.setText(r0)
            r0 = 2131432574(0x7f0b147e, float:1.848691E38)
            X.DbT.A1F(r14, r0, r9)
        L_0x00a6:
            r0 = -1699192453(0xffffffff9ab8617b, float:-7.6258105E-23)
            X.AnonymousClass0fD.A09(r0, r5)
            return r14
        L_0x00ad:
            r0 = 2131438489(0x7f0b2b99, float:1.8498906E38)
            android.view.View r0 = r14.findViewById(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = (com.instagram.common.ui.widget.imageview.CircularImageView) r0
            r15.A02 = r0
            android.content.Context r10 = r15.getContext()
            X.0gy r8 = X.AnonymousClass07i.A00(r15)
            java.lang.String r12 = r15.A05
            X.1P0 r6 = r15.A08
            X.DbZ.A0t(r2, r10, r12, r6)
            java.lang.String r1 = "{\"%s\":\"%s\"}"
            java.lang.String r0 = "0"
            java.lang.String r13 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r1, r0, r12)
            java.lang.Class<X.F61> r1 = X.F61.class
            java.lang.String r0 = "PublicPageInfoQuery"
            X.ELg r12 = new X.ELg
            r12.<init>(r1, r0, r13, r11)
            java.lang.String r1 = "567067343352427"
            r0 = 600(0x258, float:8.41E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "%s|%s"
            java.lang.String r1 = X.0mp.A06(r0, r1)
            X.3Fb r0 = new X.3Fb
            r0.<init>()
            r0.A06 = r1
            r0.A09(r12)
            X.1OC r0 = r0.A04()
            r0.A00 = r6
            X.1ES.A00(r10, r8, r0)
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47459E3g.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
