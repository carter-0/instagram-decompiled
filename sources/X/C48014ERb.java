package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bugreporter.source.BugReportSource;
import com.instagram.common.session.UserSession;
import java.io.Serializable;

/* renamed from: X.ERb  reason: case insensitive filesystem */
public class C48014ERb extends C47518E6c {
    public static final String __redex_internal_original_name = "RageshakeBottomSheetFragment";
    public NMP A00;
    public C49673F1f A01;
    public C74547Pwg A02;
    public 2BT A03;
    public BugReportSource A04;
    public C49680F1n A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final View.OnClickListener A0D = FPB.A00(this, 11);
    public final String A0E = "rageshake_bottom_sheet";
    public final AnonymousClass0eM A0F = C227642jf.A01(this);

    public static final void A07(C48014ERb eRb) {
        eRb.A09 = true;
        DbX.A10(eRb.getActivity(), AnonymousClass37D.A00);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        Window window;
        String str;
        0qQ.A0B(view, 0);
        Context context = view.getContext();
        DbT.A16(context, view, 2Yu.A02(context));
        super.onViewCreated(view, bundle);
        A06(context, this);
        C49673F1f f1f = this.A01;
        if (f1f == null) {
            DbS.A12();
            throw AnonymousClass00P.createAndThrow();
        }
        if (this.A0B) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A00;
        }
        0Aj A0e = AnonymousClass7TE.A0e(f1f.A00, "rage_shake_impression");
        if (A0e.isSampled()) {
            if (num.intValue() != 0) {
                str = "menu";
            } else {
                str = "shake";
            }
            DbV.A1G(A0e, str);
        }
        AnonymousClass37D A0g = DbV.A0g(this, AnonymousClass37D.A00);
        if (A0g != null) {
            A0g.A0Q(new ERK(this, 0));
        } else {
            0wb.A01.Ew0("RageshakeBottomSheetFragment#bindBottomSheetNavListener", "BottomSheetNavigator.getBottomSheetNavigator() returned null, couldn't bind for listening to on dismiss.");
        }
        if (0oI.A09(context)) {
            FragmentActivity activity = getActivity();
            if (!(activity == null || (window = activity.getWindow()) == null)) {
                04R.A00(window, true);
            }
            if (A0g != null) {
                ((AnonymousClass37F) A0g).A0H = new FmI(activity, 2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r0.A00 != true) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(android.content.Context r21, X.C48014ERb r22) {
        /*
            r9 = r22
            X.0wW r8 = r9.getSession()
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            boolean r0 = r9.A0B
            r6 = 1
            if (r0 == 0) goto L_0x0019
            X.2BT r0 = r9.A03
            if (r0 == 0) goto L_0x0019
            boolean r0 = r0.A00
            r16 = 1
            if (r0 == r6) goto L_0x001b
        L_0x0019:
            r16 = 0
        L_0x001b:
            boolean r0 = r9 instanceof X.E8Q
            r10 = r21
            if (r0 == 0) goto L_0x0200
            X.F1n r1 = r9.A05
            if (r1 == 0) goto L_0x0342
            java.lang.String r0 = "show_build_out_of_date"
            r1.A00(r0)
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            r0 = 2131971287(0x7f134cd7, float:1.957955E38)
            X.FGF r1 = new X.FGF
            r1.<init>((int) r0)
            r1.A06 = r6
            r0 = 2132018635(0x7f1405cb, float:1.9675582E38)
            r1.A01 = r0
            r3 = 2131165184(0x7f070000, float:1.7944578E38)
            r1.A02 = r3
            r5.add(r1)
            android.content.Context r0 = r9.requireContext()
            long r11 = X.C61120lW.A01(r0)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r0 = r0.getTime()
            long r0 = r0 - r11
            r11 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 / r11
            int r2 = (int) r0
            r1 = 2131971286(0x7f134cd6, float:1.9579547E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.String r0 = X.DbV.A0z(r9, r0, r1)
            X.FGF r1 = new X.FGF
            r1.<init>((java.lang.CharSequence) r0)
            r0 = 2132018053(0x7f140385, float:1.9674402E38)
            r1.A01 = r0
            r1.A06 = r6
            r5.add(r1)
            java.lang.String r11 = "v"
            android.content.Context r0 = r9.requireContext()
            java.lang.String r4 = X.C61120lW.A04(r0)
            java.lang.String r2 = " (Build #"
            int r1 = X.C61120lW.A00()
            java.lang.String r0 = ")"
            java.lang.String r1 = X.002.A09(r1, r11, r4, r2, r0)
            X.FGF r0 = new X.FGF
            r0.<init>((java.lang.CharSequence) r1)
            r0.A06 = r6
            r5.add(r0)
            X.0wW r0 = r9.getSession()
            X.DbS.A1Z(r0)
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.9FM r12 = X.AnonymousClass9FL.A00(r0)
            int r1 = r12.A00
            com.instagram.release.buildinfo.BuildInfoStore r0 = r12.A02
            X.9J7 r0 = r0.A01
            int r0 = r0.A01
            r11 = 0
            if (r1 >= r0) goto L_0x00ae
            r11 = 1
        L_0x00ae:
            android.content.Context r1 = r9.requireContext()
            r0 = 2131971294(0x7f134cde, float:1.9579563E38)
            if (r11 == 0) goto L_0x00ba
            r0 = 2131971277(0x7f134ccd, float:1.9579529E38)
        L_0x00ba:
            java.lang.String r4 = X.AnonymousClass7TE.A16(r1, r0)
            int r2 = X.2Yu.A0D(r10)
            r0 = 3
            X.FNl r1 = new X.FNl
            r1.<init>(r0, r12, r9, r11)
            X.OFi r0 = new X.OFi
            r0.<init>(r1, r4, r4, r2)
            r5.add(r0)
            r0 = 2131971288(0x7f134cd8, float:1.9579551E38)
            X.FGF r2 = new X.FGF
            r2.<init>((int) r0)
            r0 = 2132018675(0x7f1405f3, float:1.9675663E38)
            r2.A01 = r0
            r2.A02 = r3
            r1 = 40
            X.FP2 r0 = new X.FP2
            r0.<init>((java.lang.Object) r9, (int) r1)
            r2.A04 = r0
            r2.A06 = r6
            r5.add(r2)
            X.DbV.A1W(r5, r6)
        L_0x00f0:
            r7.addAll(r5)
            android.content.Context r3 = r9.requireContext()
            r2 = 2131971255(0x7f134cb7, float:1.9579484E38)
            r1 = 11
            X.FPH r0 = new X.FPH
            r0.<init>((int) r1, (java.lang.Object) r10, (java.lang.Object) r9, (java.lang.Object) r8)
            X.Fmc r1 = X.C50989Fmc.A00(r3, r0, r2)
            r3 = 2131238465(0x7f081e41, float:1.809321E38)
            r1.A03 = r3
            r0 = 2131971256(0x7f134cb8, float:1.9579486E38)
            java.lang.String r0 = r10.getString(r0)
            r1.A07 = r0
            r0 = 2131238090(0x7f081cca, float:1.8092449E38)
            r1.A01 = r0
            r7.add(r1)
            if (r16 == 0) goto L_0x0133
            android.content.Context r2 = r9.requireContext()
            r1 = 2131971257(0x7f134cb9, float:1.9579488E38)
            r0 = 8
            X.FPB r0 = X.FPB.A00(r9, r0)
            X.Fmc r0 = X.C50989Fmc.A00(r2, r0, r1)
            r0.A03 = r3
            r7.add(r0)
        L_0x0133:
            X.DbV.A1W(r7, r6)
            X.0wW r1 = r9.getSession()
            X.2BT r0 = r9.A03
            if (r0 == 0) goto L_0x016c
            boolean r0 = r1 instanceof X.AnonymousClass0aP
            if (r0 != 0) goto L_0x016c
            boolean r0 = r1 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x016c
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            boolean r0 = X.1CI.A00(r1)
            if (r0 != 0) goto L_0x016c
            boolean r3 = X.AnonymousClass3GI.A00(r1)
            r2 = 2131971262(0x7f134cbe, float:1.9579498E38)
            r1 = 2
            X.FQ1 r0 = new X.FQ1
            r0.<init>(r1, r10, r9)
            X.PR9 r1 = X.DbS.A0f(r0, r2, r3)
            r0 = 2131971261(0x7f134cbd, float:1.9579496E38)
            if (r3 == 0) goto L_0x0167
            r0 = 2131971260(0x7f134cbc, float:1.9579494E38)
        L_0x0167:
            r1.A02 = r0
            r7.add(r1)
        L_0x016c:
            boolean r0 = r9.A0C
            if (r0 == 0) goto L_0x0192
            boolean r0 = r8 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0192
            r0 = r8
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            boolean r0 = X.2R8.A00(r0)
            if (r0 == 0) goto L_0x0192
            r4 = 2131971285(0x7f134cd5, float:1.9579545E38)
            X.0tS r3 = X.DbT.A0h()
            X.0s0 r2 = r3.A1i
            X.0YZ[] r1 = X.0tS.A4G
            r0 = 121(0x79, float:1.7E-43)
            boolean r1 = X.AnonymousClass7TG.A1a(r3, r2, r1, r0)
            r0 = 2
            X.C47518E6c.A05(r9, r7, r0, r4, r1)
        L_0x0192:
            boolean r0 = r9.A0B
            if (r0 != 0) goto L_0x033e
            boolean r0 = r8 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x033e
            r3 = r8
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            boolean r0 = X.2R8.A00(r3)
            if (r0 == 0) goto L_0x033e
            X.DbS.A1Z(r8)
            android.content.Context r4 = r9.requireContext()
            r2 = 2131971272(0x7f134cc8, float:1.9579519E38)
            r1 = 9
            X.FPH r0 = new X.FPH
            r0.<init>((android.content.Context) r10, (X.C48014ERb) r9, (com.instagram.common.session.UserSession) r3, (int) r1)
            X.C50989Fmc.A02(r4, r0, r7, r2)
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36318101721061241(0x81071f00001779, double:3.031051997432064E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x01d7
            android.content.Context r4 = r9.requireContext()
            r2 = 2131971276(0x7f134ccc, float:1.9579527E38)
            r1 = 17
            X.FPE r0 = new X.FPE
            r0.<init>((int) r1, (java.lang.Object) r3, (java.lang.Object) r9)
            X.C50989Fmc.A02(r4, r0, r7, r2)
        L_0x01d7:
            X.1RH r2 = X.1RH.A00()
            X.1US r0 = X.1US.A0M
            X.1US[] r0 = new X.1US[]{r0}
            X.PyC r1 = new X.PyC
            r1.<init>(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A03 = r0
            X.0hq r0 = X.DbV.A0I(r9)
            r1.A01 = r0
            X.Fda r0 = new X.Fda
            r0.<init>(r9, r3, r9, r7)
            r1.A02 = r0
            X.PyB r0 = new X.PyB
            r0.<init>(r1)
            r2.A03(r3, r0)
            return
        L_0x0200:
            r15 = 0
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            boolean r0 = r9.A0B
            if (r0 == 0) goto L_0x0214
            r1 = 2131237626(0x7f081afa, float:1.8091508E38)
            X.OTE r0 = new X.OTE
            r0.<init>((int) r1)
            r5.add(r0)
        L_0x0214:
            java.util.HashMap r11 = X.AnonymousClass7TE.A1E()
            r0 = 2131971266(0x7f134cc2, float:1.9579506E38)
            if (r16 != 0) goto L_0x0220
            r0 = 2131971265(0x7f134cc1, float:1.9579504E38)
        L_0x0220:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "title"
            r11.put(r1, r0)
            r0 = 2131971264(0x7f134cc0, float:1.9579502E38)
            if (r16 != 0) goto L_0x0231
            r0 = 2131971263(0x7f134cbf, float:1.95795E38)
        L_0x0231:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r3 = "subtitle"
            r11.put(r3, r0)
            r0 = 2131971267(0x7f134cc3, float:1.9579509E38)
            if (r16 != 0) goto L_0x0242
            r0 = 2131971293(0x7f134cdd, float:1.9579561E38)
        L_0x0242:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "button_cta"
            r11.put(r2, r0)
            java.lang.Object r0 = r11.get(r1)
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x0356
            int r4 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r0 = r11.get(r3)
            if (r0 == 0) goto L_0x0351
            int r3 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r0 = r11.get(r2)
            if (r0 == 0) goto L_0x034c
            int r2 = X.AnonymousClass7TE.A0M(r0)
            X.FGF r1 = new X.FGF
            r1.<init>((int) r4)
            r1.A06 = r6
            r0 = 2132018635(0x7f1405cb, float:1.9675582E38)
            r1.A01 = r0
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            r1.A02 = r0
            r5.add(r1)
            java.lang.String r0 = X.2Yu.A0K(r10)
            java.lang.String r1 = X.DbW.A0h(r10, r0, r3)
            X.FGF r0 = new X.FGF
            r0.<init>((java.lang.CharSequence) r1)
            r0.A06 = r6
            r5.add(r0)
            android.content.Context r0 = r9.requireContext()
            java.lang.String r3 = X.AnonymousClass7TE.A16(r0, r2)
            int r2 = X.2Yu.A0D(r10)
            if (r16 == 0) goto L_0x033a
            r0 = 7
            X.FPB r1 = X.FPB.A00(r9, r0)
        L_0x02a3:
            X.OFi r0 = new X.OFi
            r0.<init>(r1, r3, r3, r2)
            r5.add(r0)
            X.0wW r1 = r9.getSession()
            boolean r0 = r1 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x00f0
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            boolean r0 = X.2R8.A00(r1)
            if (r0 == 0) goto L_0x00f0
            X.0wW r0 = r9.getSession()
            boolean r0 = r0 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x00f0
            X.0wW r12 = r9.getSession()
            X.DbS.A1Z(r12)
            com.instagram.common.session.UserSession r12 = (com.instagram.common.session.UserSession) r12
            X.F1n r1 = r9.A05
            if (r1 == 0) goto L_0x0342
            java.lang.String r0 = "open"
            r1.A00(r0)
            android.content.Context r0 = r9.requireContext()
            long r2 = X.C61120lW.A01(r0)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r0 = r0.getTime()
            android.content.Context r11 = r9.requireContext()
            X.FBU r17 = X.C49296Esf.A00
            android.content.Context r18 = r9.requireContext()
            r21 = r0
            r19 = r2
            java.lang.String r13 = r17.A02(r18, r19, r21)
            java.lang.String r4 = ": v"
            java.lang.String r14 = X.C61120lW.A04(r18)
            java.lang.String r4 = X.002.A0g(r13, r4, r14)
            X.0qQ.A07(r4)
            android.content.Context r18 = r9.requireContext()
            int r14 = r17.A01(r18, r19, r21)
            X.Fmc r13 = new X.Fmc
            r13.<init>((android.content.Context) r11, (java.lang.CharSequence) r4, (int) r14)
            java.lang.Integer r0 = X.FBU.A00(r2, r0)
            int r1 = r0.intValue()
            if (r1 == r15) goto L_0x0336
            r0 = 2131238122(0x7f081cea, float:1.8092514E38)
            if (r1 == r6) goto L_0x0324
            r0 = 2131238123(0x7f081ceb, float:1.8092516E38)
        L_0x0324:
            r13.A03 = r0
            r13.A0B = r6
            r1 = 10
            X.FPH r0 = new X.FPH
            r0.<init>((android.content.Context) r10, (X.C48014ERb) r9, (com.instagram.common.session.UserSession) r12, (int) r1)
            r13.A05 = r0
            r5.add(r13)
            goto L_0x00f0
        L_0x0336:
            r0 = 2131231336(0x7f080268, float:1.807875E38)
            goto L_0x0324
        L_0x033a:
            android.view.View$OnClickListener r1 = r9.A0D
            goto L_0x02a3
        L_0x033e:
            r9.setBottomSheetMenuItems(r7)
            return
        L_0x0342:
            java.lang.String r0 = "dogfoodingRageshakeLogger"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x034c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0351:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0356:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48014ERb.A06(android.content.Context, X.ERb):void");
    }

    public final String getModuleName() {
        return this.A0E;
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0F);
    }

    public void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1848731738);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A06 = requireArguments.getString("ARG_RAGESHAKE_BOTTOM_SHEET_AD_ID");
        Serializable serializable = requireArguments.getSerializable("ARG_BOTTOM_SHEET_BUG_REPORT_SOURCE");
        0qQ.A0C(serializable, "null cannot be cast to non-null type com.instagram.bugreporter.source.BugReportSource");
        this.A04 = (BugReportSource) serializable;
        this.A0B = requireArguments.getBoolean("ARG_RAGESHAKE_BOTTOM_SHEET_MANUAL_REPORT_FROM_HELP_SETTING");
        this.A0C = requireArguments.getBoolean("ARG_RAGESHAKE_BOTTOM_SHEET_REPORT_FROM_LONG_PRESS");
        this.A0A = requireArguments.getBoolean("ARG_RAGESHAKE_DISMISSED_PREVIOUS_VIEWS");
        UserSession session = getSession();
        this.A01 = new C49673F1f(session, this.A0E);
        this.A08 = requireArguments.getString("ARG_SCREEN_FROM");
        this.A07 = requireArguments.getString("ARG_NAV_CHAIN");
        0qQ.A0B(session, 0);
        this.A03 = (2BT) session.A00(2BT.class);
        C74547Pwg A002 = C70853OOi.A00(requireArguments, session);
        if (A002 instanceof C71845Orm) {
            A002 = C70853OOi.A01(session);
        }
        this.A02 = A002;
        if (session instanceof UserSession) {
            this.A05 = new C49680F1n(session);
        }
        AnonymousClass0fD.A09(1827196043, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1565819063);
        C48014ERb.super.onPause();
        NMP nmp = this.A00;
        if (nmp != null) {
            nmp.A06();
            this.A00 = null;
            0KC.A0D(__redex_internal_original_name, "onPause, cleaned up mLaunchBugReporterTask");
        }
        AnonymousClass0fD.A09(493056056, A022);
    }
}
