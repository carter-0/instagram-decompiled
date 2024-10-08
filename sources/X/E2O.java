package X;

import com.instagram.common.ui.base.IgButton;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.progressbutton.ProgressButton;

public final class E2O extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AutoConfConsentFragment";
    public IgButton A00;
    public IgTextView A01;
    public ProgressButton A02;
    public String A03;
    public String A04;
    public String A05;
    public AnonymousClass6ST A06;
    public final String A07 = "\n\n";
    public final AnonymousClass0eM A08 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131952023);
    }

    public final String getModuleName() {
        return "auto_conf_consent";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A08);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10) {
        /*
            r7 = this;
            r0 = -1580850036(0xffffffffa1c6248c, float:-1.3426676E-18)
            int r5 = X.AnonymousClass0fD.A02(r0)
            r1 = 0
            X.0qQ.A0B(r8, r1)
            r0 = 2131624162(0x7f0e00e2, float:1.8875496E38)
            android.view.View r6 = r8.inflate(r0, r9, r1)
            android.os.Bundle r1 = r7.requireArguments()
            java.lang.String r0 = "REGISTER_START_MESSAGE"
            r3 = 0
            java.lang.String r0 = r1.getString(r0, r3)
            java.lang.String r2 = "Required value was null."
            if (r0 == 0) goto L_0x011e
            r7.A04 = r0
            android.os.Bundle r1 = r7.requireArguments()
            java.lang.String r0 = "NONCE"
            java.lang.String r0 = r1.getString(r0, r3)
            if (r0 == 0) goto L_0x0116
            r7.A03 = r0
            android.os.Bundle r1 = r7.requireArguments()
            java.lang.String r0 = "SMS_FLOW_TYPE"
            java.lang.String r0 = r1.getString(r0, r3)
            if (r0 == 0) goto L_0x0126
            r7.A05 = r0
            X.0qQ.A0A(r6)
            r0 = 2131428324(0x7f0b03e4, float:1.847829E38)
            android.view.View r0 = r6.requireViewById(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = (com.instagram.ui.widget.progressbutton.ProgressButton) r0
            r7.A02 = r0
            r0 = 2131428323(0x7f0b03e3, float:1.8478287E38)
            android.view.View r1 = r6.requireViewById(r0)
            com.instagram.common.ui.base.IgButton r1 = (com.instagram.common.ui.base.IgButton) r1
            r0 = 2131953324(0x7f1306ac, float:1.9543116E38)
            r1.setText(r0)
            r7.A00 = r1
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r7.A02
            if (r1 != 0) goto L_0x006c
            java.lang.String r0 = "saveButton"
        L_0x0064:
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x006c:
            r0 = 33
            X.FP0.A00(r1, r0, r7)
            com.instagram.common.ui.base.IgButton r1 = r7.A00
            if (r1 != 0) goto L_0x0078
            java.lang.String r0 = "notSaveButton"
            goto L_0x0064
        L_0x0078:
            r0 = 34
            X.FP0.A00(r1, r0, r7)
            r0 = 2131428322(0x7f0b03e2, float:1.8478285E38)
            com.instagram.common.ui.base.IgTextView r2 = X.DbT.A0a(r6, r0)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131953326(0x7f1306ae, float:1.954312E38)
            X.Dbb.A0l(r1, r2, r0)
            r7.A01 = r2
            android.content.Context r3 = r7.requireContext()
            r2 = 1
            com.instagram.common.ui.base.IgTextView r1 = r7.A01
            java.lang.String r0 = "helperButton"
            if (r1 == 0) goto L_0x0064
            X.FCK.A00(r1, r3)
            com.instagram.common.ui.base.IgTextView r1 = r7.A01
            if (r1 == 0) goto L_0x0064
            r0 = 35
            X.FP0.A00(r1, r0, r7)
            android.os.Bundle r3 = r7.requireArguments()
            r1 = 2
            java.lang.String r0 = "CONSENT_MODE"
            int r0 = r3.getInt(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00f3
            r1 = 2131953322(0x7f1306aa, float:1.9543112E38)
        L_0x00c4:
            java.lang.String r0 = r7.A07
            java.lang.String r1 = X.DbV.A0z(r7, r0, r1)
        L_0x00ca:
            r0 = 2131428320(0x7f0b03e0, float:1.8478281E38)
            X.DbX.A1E(r6, r1, r0)
            android.content.Context r0 = r7.requireContext()
            X.6ST r1 = new X.6ST
            r1.<init>(r0, r2)
            r0 = 2131965491(0x7f133633, float:1.9567793E38)
            X.DbU.A1L(r7, r1, r0)
            r7.A06 = r1
            X.0eM r0 = r7.A08
            X.0lg r4 = X.DbT.A0X(r0)
            java.lang.String r3 = "auto_conf_consent"
            java.lang.String r2 = "registration_flow"
            java.lang.String r1 = r7.A05
            if (r1 != 0) goto L_0x010a
            java.lang.String r0 = "smsFlowType"
            goto L_0x0064
        L_0x00f3:
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0102
            r1 = 2131953323(0x7f1306ab, float:1.9543114E38)
            goto L_0x00c4
        L_0x0102:
            r0 = 2131953321(0x7f1306a9, float:1.954311E38)
            java.lang.String r1 = r7.getString(r0)
            goto L_0x00ca
        L_0x010a:
            java.lang.String r0 = "client_reg_show_user_consent"
            X.C49944FFx.A01(r4, r3, r0, r2, r1)
            r0 = 1750040664(0x684f8058, float:3.9195895E24)
            X.AnonymousClass0fD.A09(r0, r5)
            return r6
        L_0x0116:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r2)
            r0 = 1982145069(0x7625222d, float:8.373263E32)
            goto L_0x012d
        L_0x011e:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r2)
            r0 = -187567987(0xfffffffff4d1f08d, float:-1.3306506E32)
            goto L_0x012d
        L_0x0126:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r2)
            r0 = 1455169083(0x56bc1e3b, float:1.03419012E14)
        L_0x012d:
            X.AnonymousClass0fD.A09(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E2O.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(518282891);
        super.onResume();
        AnonymousClass0fD.A09(2101440537, A022);
    }
}
