package X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public final class QCI extends Fragment {
    public C10835Ryv A00;
    public QDI A01;
    public Q6J A02;
    public QmW A03;
    public final C9829Rhr A04 = AnonymousClass2E0.A09();

    /* JADX WARNING: type inference failed for: r7v0, types: [X.07Z, X.07g, androidx.fragment.app.Fragment, java.lang.Object, X.QCI] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x013b, code lost:
        if (r1.A00.getBoolean("AUTH_FLOW_UTIL_PIN_FORGOT_VISIBLE", true) == false) goto L_0x013d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            r7 = this;
            X.Ryv r0 = new X.Ryv
            r0.<init>(r8)
            r7.A00 = r0
            X.S7M r0 = X.AnonymousClass2E0.A03()
            X.Se6 r0 = r0.A00()
            X.2YN r2 = X.JTO.A0L(r0, r7)
            java.lang.Class<X.QDI> r0 = X.QDI.class
            X.2YL r4 = r2.A00(r0)
            X.QDI r4 = (X.QDI) r4
            r7.A01 = r4
            android.os.Bundle r3 = r7.requireArguments()
            androidx.fragment.app.Fragment r1 = r7.mParentFragment
            boolean r0 = r1 instanceof X.C13783Tgy
            if (r0 == 0) goto L_0x01d3
            X.Tgy r1 = (X.C13783Tgy) r1
            X.SNj r0 = r1.BLL()
        L_0x002d:
            r4.A02(r3, r0)
            android.os.Bundle r1 = r7.requireArguments()
            java.lang.String r0 = "FBPAY_AUTH_STEP_SCREEN_DISPLAY_LOG"
            java.lang.String r0 = X.DbU.A0l(r1, r0)
            A00(r7, r0)
            X.Ryv r0 = r7.A00
            android.view.View r1 = r0.A00
            r0 = 8
            r1.setVisibility(r0)
            X.Ryv r0 = r7.A00
            android.widget.TextView r3 = r0.A08
            X.Q6J r1 = r7.A02
            r0 = 2131953310(0x7f13069e, float:1.9543087E38)
            X.DbT.A18(r1, r3, r0)
            X.Ryv r0 = r7.A00
            androidx.appcompat.widget.Toolbar r1 = r0.A0A
            r0 = 40
            X.SbJ r0 = X.C11496SbJ.A00(r7, r0)
            r1.setNavigationOnClickListener(r0)
            X.Ryv r0 = r7.A00
            androidx.appcompat.widget.Toolbar r0 = r0.A0A
            android.graphics.drawable.Drawable r4 = r0.getNavigationIcon()
            if (r4 == 0) goto L_0x007d
            X.Ryv r0 = r7.A00
            androidx.appcompat.widget.Toolbar r3 = r0.A0A
            X.AnonymousClass2E0.A0A()
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            r0 = 2130970004(0x7f040594, float:1.7548706E38)
            X.AnonymousClass4Ed.A02(r1, r4, r0)
            r3.setNavigationIcon((android.graphics.drawable.Drawable) r4)
        L_0x007d:
            X.AnonymousClass2E0.A0A()
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            X.Ryv r0 = r7.A00
            android.widget.ImageView r3 = r0.A03
            r4 = 0
            r6 = 1
            X.0qQ.A0B(r3, r6)
            r0 = 2130970004(0x7f040594, float:1.7548706E38)
            int r1 = X.2Yu.A0H(r1, r0)
            android.content.Context r0 = r3.getContext()
            X.DbX.A12(r0, r3, r1)
            X.QDI r3 = r7.A01
            android.os.Bundle r1 = r3.A00
            r0 = 2
            java.lang.String r5 = X.SQ8.A01(r1, r0)
            android.os.Bundle r0 = r3.A00
            java.lang.String r3 = X.SQ8.A01(r0, r6)
            r3.getClass()
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            java.util.Set r0 = X.QDI.A0B
            if (r1 != 0) goto L_0x01cd
            boolean r0 = r0.contains(r5)
        L_0x00b9:
            if (r0 == 0) goto L_0x01b3
            r3 = 18
            r1 = 4
        L_0x00be:
            android.text.InputFilter$LengthFilter r0 = new android.text.InputFilter$LengthFilter
            r0.<init>(r1)
            android.text.InputFilter[] r1 = new android.text.InputFilter[]{r0}
            X.Ryv r0 = r7.A00
            android.widget.EditText r0 = r0.A02
            r0.setFilters(r1)
            X.Ryv r0 = r7.A00
            android.widget.EditText r0 = r0.A02
            r0.setInputType(r3)
            X.Ryv r0 = r7.A00
            android.widget.EditText r0 = r0.A02
            r3 = 4
            X.C11462SaQ.A00(r0, r7, r3)
            X.QDI r0 = r7.A01
            boolean r0 = r0.A04()
            int r1 = X.DbW.A01(r0)
            X.Ryv r0 = r7.A00
            android.widget.Button r0 = r0.A01
            r0.setVisibility(r1)
            X.Ryv r0 = r7.A00
            android.widget.TextView r0 = r0.A07
            r0.setVisibility(r1)
            X.Ryv r0 = r7.A00
            android.widget.Button r1 = r0.A01
            r0 = 42
            X.C11496SbJ.A01(r1, r0, r7)
            X.Ryv r0 = r7.A00
            android.widget.TextView r1 = r0.A07
            r0 = 43
            X.C11496SbJ.A01(r1, r0, r7)
            X.QDI r0 = r7.A01
            X.2gB r1 = r0.A05
            r0 = 18
            X.C11652Sdu.A02(r7, r1, r0)
            X.QDI r0 = r7.A01
            X.2gB r5 = r0.A06
            r0 = 19
            X.Sdu r0 = X.C11652Sdu.A00(r7, r0)
            r1 = 20
            X.C11651Sdt.A01(r7, r5, r0, r1)
            X.QDI r0 = r7.A01
            X.2gB r0 = r0.A07
            X.C11652Sdu.A02(r7, r0, r1)
            X.Ryv r0 = r7.A00
            android.widget.TextView r5 = r0.A06
            X.QDI r1 = r7.A01
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x013d
            android.os.Bundle r1 = r1.A00
            java.lang.String r0 = "AUTH_FLOW_UTIL_PIN_FORGOT_VISIBLE"
            boolean r1 = r1.getBoolean(r0, r6)
            r0 = 0
            if (r1 != 0) goto L_0x013f
        L_0x013d:
            r0 = 8
        L_0x013f:
            r5.setVisibility(r0)
            X.Ryv r0 = r7.A00
            android.widget.TextView r1 = r0.A06
            r0 = 41
            X.C11496SbJ.A01(r1, r0, r7)
            X.Ryv r0 = r7.A00
            android.view.View r0 = r0.A00
            r0.setVisibility(r4)
            X.QDI r6 = r7.A01
            android.os.Bundle r5 = r7.requireArguments()
            X.QCm r4 = new X.QCm
            r4.<init>()
            X.2gB r1 = r6.A07
            r0 = 25
            X.Sdu r0 = X.C11652Sdu.A00(r4, r0)
            r4.A0E(r1, r0)
            boolean r0 = r6.A04()
            if (r0 == 0) goto L_0x0197
            java.lang.Class<X.QM9> r0 = X.QM9.class
            X.2YL r3 = r2.A00(r0)
            X.QCx r3 = (X.C7432QCx) r3
            com.facebookpay.logging.FBPayLoggerData r0 = X.Pxi.A0J(r5)
            r3.A00 = r0
            X.2Fj r2 = r6.A08
            r1 = 3
            X.TPJ r0 = new X.TPJ
            r0.<init>(r1, r3, r4)
            X.2gB r1 = X.AnonymousClass72Y.A02(r2, r0)
            r0 = 26
        L_0x018a:
            X.Sdu r0 = X.C11652Sdu.A00(r4, r0)
            r4.A0E(r1, r0)
            r0 = 21
            X.C11652Sdu.A02(r7, r4, r0)
            return
        L_0x0197:
            java.lang.Class<X.QMA> r0 = X.QMA.class
            X.2YL r2 = r2.A00(r0)
            X.QCx r2 = (X.C7432QCx) r2
            com.facebookpay.logging.FBPayLoggerData r0 = X.Pxi.A0J(r5)
            r2.A00 = r0
            X.2Fj r1 = r6.A08
            X.TPJ r0 = new X.TPJ
            r0.<init>(r3, r2, r4)
            X.2gB r1 = X.AnonymousClass72Y.A02(r1, r0)
            r0 = 27
            goto L_0x018a
        L_0x01b3:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r0 = "RECOVER_PIN"
            if (r1 != 0) goto L_0x01c8
            boolean r0 = r0.equalsIgnoreCase(r5)
        L_0x01bf:
            if (r0 == 0) goto L_0x01d6
            r3 = 129(0x81, float:1.81E-43)
            r1 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00be
        L_0x01c8:
            boolean r0 = r0.equalsIgnoreCase(r3)
            goto L_0x01bf
        L_0x01cd:
            boolean r0 = r0.contains(r3)
            goto L_0x00b9
        L_0x01d3:
            r0 = 0
            goto L_0x002d
        L_0x01d6:
            java.lang.String r1 = "not supported step by this screen"
            java.lang.String r0 = " second:"
            java.lang.String r0 = X.002.A0u(r1, r3, r0, r5)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QCI.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static void A00(QCI qci, String str) {
        AnonymousClass2E0.A03().A01.Cgl(str, S9s.A01(qci.requireArguments()));
    }

    public final void onConfigurationChanged(Configuration configuration) {
        requireContext().getResources();
        QCI.super.onConfigurationChanged(configuration);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2066164819);
        QCI.super.onCreate(bundle);
        this.A02 = new Q6J(requireContext(), this.A04);
        this.A03 = (QmW) AnonymousClass2E0.A03().A03(this.A02, QmW.class);
        AnonymousClass0fD.A09(-962646801, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2082763139);
        QmW qmW = this.A03;
        C13609Tdb tdb = qmW.A01;
        View A0C = DbT.A0C(((C12465Sux) tdb).A00, viewGroup, qmW.A00);
        0qQ.A07(A0C);
        AnonymousClass0fD.A09(-2039305757, A022);
        return A0C;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-714681413);
        QCI.super.onDestroyView();
        C9667Rel.A00(this.A00.A02);
        this.A00 = null;
        AnonymousClass0fD.A09(993306556, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1161161828);
        QCI.super.onResume();
        requireContext().getResources();
        AnonymousClass0fD.A09(1465883729, A022);
    }
}
