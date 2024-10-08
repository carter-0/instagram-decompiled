package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;

public final class QCG extends Fragment {
    public QmX A00;
    public QDA A01;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, X.QCG, java.lang.Object] */
    private void A00(View.OnClickListener onClickListener, View view, CompoundButton compoundButton, 2Fk r7) {
        03v.A0B(compoundButton, new U7M(this, 0));
        r7.A06(this, new C11650Sds(12, (Object) new C11532Sbt(onClickListener, compoundButton, r7, this), (Object) this, (Object) compoundButton));
        C11499SbM.A01(view, 42, this, onClickListener);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.QCG, X.07g, androidx.fragment.app.Fragment] */
    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1289893173);
        QCG.super.onCreate(bundle);
        this.A00 = (QmX) AnonymousClass2E0.A03().A03(getActivity(), QmX.class);
        QDA A002 = JTO.A0L(AnonymousClass2E0.A03().A00(), this).A00(QDA.class);
        this.A01 = A002;
        Bundle requireArguments = requireArguments();
        A002.A00 = requireArguments;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("PAYMENT_TYPE", QDA.A00(A002));
        A0a.putParcelable("logger_data", requireArguments.getParcelable("logger_data"));
        AnonymousClass2E0.A03().A04(A0a);
        AnonymousClass0fD.A09(-66663034, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1165451118);
        QmX qmX = this.A00;
        C13609Tdb tdb = qmX.A01;
        View A0C = DbT.A0C(((C12465Sux) tdb).A00, viewGroup, qmX.A00);
        0qQ.A07(A0C);
        AnonymousClass0fD.A09(1154918035, A02);
        return A0C;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r17, android.os.Bundle r18) {
        /*
            r16 = this;
            r0 = 2131441181(0x7f0b361d, float:1.8504366E38)
            r1 = r17
            android.widget.TextView r3 = X.DbU.A0G(r1, r0)
            r0 = 2131962189(0x7f13294d, float:1.9561096E38)
            r14 = r16
            X.DbU.A1G(r3, r14, r0)
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x0029
            android.os.Bundle r2 = r14.requireArguments()
            java.lang.String r0 = "should_hide_title"
            boolean r0 = r2.getBoolean(r0)
            if (r0 == 0) goto L_0x0029
            r0 = 8
            r3.setVisibility(r0)
        L_0x0029:
            X.QDA r6 = r14.A01
            r0 = 2131441180(0x7f0b361c, float:1.8504364E38)
            android.widget.TextView r7 = X.DbU.A0G(r1, r0)
            r0 = 2131962149(0x7f132925, float:1.9561015E38)
            r7.setText(r0)
            com.instagram.common.session.UserSession r0 = X.C11431STx.A00()
            X.0Tu r8 = X.0Tu.A06
            r4 = 36320494017847794(0x81094c000021f2, double:3.032564895552886E-306)
            boolean r0 = X.182.A06(r8, r0, r4)
            if (r0 == 0) goto L_0x0059
            com.instagram.common.session.UserSession r0 = X.C11431STx.A00()
            r2 = 36883443971326467(0x83094c00010203, double:3.3885767129503136E-306)
            java.lang.String r0 = X.182.A04(r8, r0, r2)
            r7.setText(r0)
        L_0x0059:
            r0 = 2131437694(0x7f0b287e, float:1.8497294E38)
            android.widget.TextView r7 = X.DbU.A0G(r1, r0)
            com.instagram.common.session.UserSession r0 = X.C11431STx.A00()
            boolean r0 = X.182.A06(r8, r0, r4)
            if (r0 == 0) goto L_0x01ec
            com.instagram.common.session.UserSession r0 = X.C11431STx.A00()
            r2 = 36883443971392004(0x83094c00020204, double:3.3885767129917595E-306)
            java.lang.String r0 = X.182.A04(r8, r0, r2)
            r7.setText(r0)
        L_0x007a:
            r0 = 2131437689(0x7f0b2879, float:1.8497284E38)
            android.view.View r4 = r1.findViewById(r0)
            X.2Fk r3 = r6.A01
            r0 = 19
            X.Sdq r2 = new X.Sdq
            r2.<init>((int) r0, (java.lang.Object) r4, (java.lang.Object) r14)
            r0 = 21
            X.C11651Sdt.A01(r14, r3, r2, r0)
            r2 = 2131441179(0x7f0b361b, float:1.8504362E38)
            android.view.View r5 = r1.requireViewById(r2)
            android.widget.CompoundButton r5 = (android.widget.CompoundButton) r5
            r2 = 2131441178(0x7f0b361a, float:1.850436E38)
            android.view.View r4 = r1.findViewById(r2)
            r2 = 10
            X.2gB r3 = X.TPM.A00(r3, r14, r2)
            r2 = 43
            X.SbM r2 = X.C11499SbM.A00(r14, r5, r2)
            r14.A00(r2, r4, r5, r3)
            X.QDA r3 = r14.A01
            r2 = 2131441175(0x7f0b3617, float:1.8504354E38)
            r7 = 2131441175(0x7f0b3617, float:1.8504354E38)
            android.view.View r10 = r1.findViewById(r2)
            r2 = 2131441176(0x7f0b3618, float:1.8504356E38)
            android.view.View r11 = r1.requireViewById(r2)
            android.widget.CompoundButton r11 = (android.widget.CompoundButton) r11
            r2 = 2131441177(0x7f0b3619, float:1.8504358E38)
            android.widget.TextView r12 = X.DbU.A0G(r1, r2)
            r2 = 2131962146(0x7f132922, float:1.9561009E38)
            r12.setText(r2)
            r2 = 2131428680(0x7f0b0548, float:1.8479011E38)
            android.widget.TextView r13 = X.DbU.A0G(r1, r2)
            boolean r2 = X.C11431STx.A03()
            r4 = 2131962145(0x7f132921, float:1.9561007E38)
            if (r2 == 0) goto L_0x00e3
            r4 = 2131966477(0x7f133a0d, float:1.9569793E38)
        L_0x00e3:
            r9 = 1
            X.QmX r6 = r14.A00
            r8 = 2130970814(0x7f0408be, float:1.7550349E38)
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.Context r2 = r6.getContext()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            boolean r2 = r2.resolveAttribute(r8, r5, r9)
            if (r2 == 0) goto L_0x01e8
            int r5 = r5.resourceId
            if (r5 == 0) goto L_0x01e8
            android.content.Context r2 = r6.getContext()
            android.content.res.Resources r2 = r2.getResources()
            java.lang.String r2 = r2.getString(r5)
        L_0x010c:
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = r14.getString(r4, r2)
            r13.setText(r2)
            X.QDE r2 = r3.A06
            X.2Fk r6 = r2.A02
            X.Sdj r8 = new X.Sdj
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r6.A06(r14, r8)
            r2 = 2131428675(0x7f0b0543, float:1.8479001E38)
            android.view.View r5 = r1.findViewById(r2)
            X.2Fk r4 = r3.A01
            r3 = 20
            X.Sdq r2 = new X.Sdq
            r2.<init>((int) r3, (java.lang.Object) r5, (java.lang.Object) r14)
            r4.A06(r14, r2)
            android.view.View r5 = r1.findViewById(r7)
            r2 = 9
            X.2gB r4 = X.TPM.A00(r6, r14, r2)
            r2 = 41
            X.SbM r2 = X.C11499SbM.A00(r14, r11, r2)
            r14.A00(r2, r5, r11, r4)
            X.QDA r4 = r14.A01
            r2 = 2131429811(0x7f0b09b3, float:1.8481305E38)
            android.view.View r13 = r1.requireViewById(r2)
            r2 = 2131429810(0x7f0b09b2, float:1.8481303E38)
            android.view.View r12 = r1.findViewById(r2)
            r2 = 2131429809(0x7f0b09b1, float:1.8481301E38)
            android.view.View r15 = r1.findViewById(r2)
            X.2Fk r2 = r4.A01
            r11 = 2
            X.Sdf r10 = new X.Sdf
            r10.<init>(r11, r12, r13, r14, r15)
            X.C11651Sdt.A01(r14, r2, r10, r0)
            r0 = 44
            X.C11496SbJ.A01(r13, r0, r14)
            android.os.Bundle r5 = r14.requireArguments()
            java.lang.String r4 = "fbpay_security_page_display"
            X.S7M r0 = X.AnonymousClass2E0.A03()
            X.2FO r2 = r0.A01
            java.util.Map r0 = X.S9s.A01(r5)
            r2.Cgl(r4, r0)
            r0 = 2131438588(0x7f0b2bfc, float:1.8499107E38)
            android.view.View r4 = r1.requireViewById(r0)
            X.QDA r0 = r14.A01
            X.2Fj r1 = r0.A04
            r0 = 34
            X.Sdu r0 = X.C11652Sdu.A00(r14, r0)
            X.C11651Sdt.A01(r14, r1, r0, r3)
            X.QDA r0 = r14.A01
            X.QDE r0 = r0.A06
            X.2Fj r1 = r0.A05
            r0 = 35
            X.Sdu r0 = X.C11652Sdu.A00(r14, r0)
            X.C11651Sdt.A01(r14, r1, r0, r3)
            X.QDA r0 = r14.A01
            X.2gB r2 = r0.A02
            r1 = 18
            X.Sdq r0 = new X.Sdq
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r14)
            r2.A06(r14, r0)
            X.QDA r0 = r14.A01
            X.2Fj r1 = r0.A05
            r0 = 36
            X.Sdu r0 = X.C11652Sdu.A00(r14, r0)
            X.C11651Sdt.A01(r14, r1, r0, r3)
            android.os.Bundle r1 = r14.requireArguments()
            if (r18 != 0) goto L_0x01e7
            java.lang.String r0 = "should_log_view_load_success"
            boolean r0 = r1.getBoolean(r0)
            if (r0 == 0) goto L_0x01e7
            com.facebookpay.logging.FBPayLoggerData r0 = X.Pxi.A0J(r1)
            java.util.LinkedHashMap r2 = X.C2818159r.A06(r0)
            java.lang.String r1 = "view_name"
            java.lang.String r0 = "security_settings"
            X.2FO r1 = X.SRV.A02(r1, r0, r2)
            java.lang.String r0 = "client_load_view_success"
            r1.Cgl(r0, r2)
        L_0x01e7:
            return
        L_0x01e8:
            java.lang.String r2 = ""
            goto L_0x010c
        L_0x01ec:
            r0 = 2131962148(0x7f132924, float:1.9561013E38)
            r7.setText(r0)
            goto L_0x007a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QCG.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
