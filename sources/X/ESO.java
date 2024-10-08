package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

public final class ESO extends C47518E6c implements AnonymousClass0iw, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ManageSavedLoginFragment";
    public UserSession A00;
    public String A01;
    public boolean A02;

    public static void A06(ESO eso) {
        C47699EDi eDi = new C47699EDi(eso, 7);
        1OC A08 = FHA.A08(eso.requireContext(), eso.A00, AnonymousClass7TE.A0v());
        A08.A00 = eDi;
        eso.schedule(A08);
    }

    public final String getModuleName() {
        return "manage_saved_login";
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0062, code lost:
        if (r1.equals("consented") == false) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(X.ESO r9) {
        /*
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            com.instagram.common.session.UserSession r0 = r9.A00
            java.lang.String r8 = r0.A06
            X.27y r1 = X.27u.A00(r0)
            java.lang.String r0 = "ManageSavedLoginFragment"
            com.facebook.common.callercontext.CallerContext.A01(r0)
            boolean r7 = r1.A01()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            r4 = 2131972561(0x7f1351d1, float:1.9582133E38)
            com.instagram.common.session.UserSession r0 = r9.A00
            X.6qt r0 = X.C319606qt.A01(r0)
            boolean r3 = r0.A0K(r8)
            r0 = 14
            X.FQO r2 = new X.FQO
            r2.<init>(r9, r0)
            X.FdM r1 = new X.FdM
            r1.<init>(r9, r6, r8)
            X.PR9 r0 = new X.PR9
            r0.<init>((android.widget.CompoundButton.OnCheckedChangeListener) r2, (X.C358618bC) r1, (int) r4, (boolean) r3)
            r5.add(r0)
            r0 = 2131972560(0x7f1351d0, float:1.9582131E38)
            if (r7 == 0) goto L_0x0042
            r0 = 2131952966(0x7f130546, float:1.954239E38)
        L_0x0042:
            X.FGF.A00(r9, r5, r0)
            com.instagram.common.session.UserSession r3 = r9.A00
            X.0Tu r2 = X.0Tu.A06
            r0 = 36315151078525983(0x81047000000c1f, double:3.029185999211483E-306)
            boolean r0 = X.DbY.A1Y(r2, r3, r0)
            if (r0 == 0) goto L_0x0088
            r4 = 2131972571(0x7f1351db, float:1.9582153E38)
            java.lang.String r1 = r9.A01
            if (r1 == 0) goto L_0x0064
            java.lang.String r0 = "consented"
            boolean r0 = r1.equals(r0)
            r3 = 1
            if (r0 != 0) goto L_0x0065
        L_0x0064:
            r3 = 0
        L_0x0065:
            r0 = 15
            X.FQO r2 = new X.FQO
            r2.<init>(r9, r0)
            r0 = 11
            X.FdS r1 = new X.FdS
            r1.<init>(r9, r0)
            X.PR9 r0 = new X.PR9
            r0.<init>((android.widget.CompoundButton.OnCheckedChangeListener) r2, (X.C358618bC) r1, (int) r4, (boolean) r3)
            r5.add(r0)
            boolean r1 = r9.A02
            r0 = 2131972569(0x7f1351d9, float:1.958215E38)
            if (r1 == 0) goto L_0x0085
            r0 = 2131972570(0x7f1351da, float:1.9582151E38)
        L_0x0085:
            X.FGF.A00(r9, r5, r0)
        L_0x0088:
            r9.setItems(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ESO.A07(X.ESO):void");
    }

    public final void configureActionBar(2da r3) {
        r3.ErN(DbV.A05(this).getString(2131965847));
        r3.Eu4(true);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-7482423);
        super.onCreate(bundle);
        UserSession A0U = DbX.A0U(this);
        this.A00 = A0U;
        if (182.A06(0Tu.A06, A0U, 36315151078525983L)) {
            C49944FFx.A00.A02(this.A00, "manage_saved_login", "client_del_setting_opt_out_shown");
            A06(this);
        } else {
            A07(this);
        }
        AnonymousClass0fD.A09(541545386, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1210327061);
        super.onResume();
        if (DbY.A1Y(0Tu.A06, this.A00, 36315151078525983L)) {
            A06(this);
        } else {
            A07(this);
        }
        AnonymousClass0fD.A09(691635260, A022);
    }
}
