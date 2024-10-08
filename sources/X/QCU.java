package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;

public final class QCU extends Fragment implements C13613Tdf {
    public C10834Ryu A00;
    public QDF A01;
    public QmV A02;

    private void A00() {
        this.A00.A00.setVisibility(8);
        if (!requireArguments().getBoolean("AUTH_FLOW_UTIL_SHOULD_OPEN_PAYPAL_LOGIN_DIRECTLY", false)) {
            this.A00.A0A.setVisibility(0);
        }
        Fragment A0R = getChildFragmentManager().A0R("FBPAY_AUTH_PAYPAL_FRAGMENT_TAG");
        if (A0R != null) {
            0s1 A0C = DbW.A0C(this);
            A0C.A03(A0R);
            A0C.A01();
        }
    }

    public static void A01(QCU qcu) {
        qcu.A00.A00.setVisibility(0);
        qcu.A00.A0A.setVisibility(4);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("WEB_FRAGMENT_LOAD_URL", DbU.A0l(qcu.A01.A00, "PAYPAL_LOGIN_URL"));
        A0a.putStringArray("WEB_FRAGMENT_INTERCEPT_URLS", new String[]{"fb://paypal_connect_success/", "fb://paypal_connect_fail/", "fb-messenger://paypal_connect_success/", "fb-messenger://paypal_connect_fail/", "https://www.instagram.com/payments/paypal_connect_success", "https://www.instagram.com/payments/paypal_connect_fail"});
        Fragment A012 = AnonymousClass2E0.A03().A04.A01(A0a, "AUTH_WEB_VIEW");
        A012.setTargetFragment((Fragment) null, 1111);
        0s1 A0C = DbW.A0C(qcu);
        A0C.A0C(A012, "FBPAY_AUTH_PAYPAL_FRAGMENT_TAG", R.id.paypal_login_webview_container);
        A0C.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean DGj(android.os.Bundle r6, int r7, boolean r8) {
        /*
            r5 = this;
            r0 = 1111(0x457, float:1.557E-42)
            if (r7 != r0) goto L_0x0036
            java.lang.String r4 = "WEB_FRAGMENT_INTERCEPTED_URL"
            java.lang.String r1 = r6.getString(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0067
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.lang.String r0 = "access_token"
            java.lang.String r1 = r1.getQueryParameter(r0)
        L_0x001a:
            r5.A00()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0038
            X.QDF r2 = r5.A01
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0036
            r2.A02 = r1
            r1 = 0
            X.2gB r0 = r2.A06
            r0.A0A(r1)
            X.QDF.A00(r2)
        L_0x0036:
            r0 = 0
            return r0
        L_0x0038:
            X.QDF r3 = r5.A01
            java.lang.String r2 = ""
            java.lang.String r1 = r6.getString(r4, r2)
            boolean r0 = android.webkit.URLUtil.isValidUrl(r1)
            if (r0 == 0) goto L_0x0060
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.lang.String r0 = "error_message"
            java.lang.String r1 = r1.getQueryParameter(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0060
        L_0x0056:
            java.lang.RuntimeException r1 = X.AnonymousClass7TE.A15(r1)
            X.2gB r0 = r3.A06
            r0.A0A(r1)
            goto L_0x0036
        L_0x0060:
            java.lang.String r0 = "ERROR_MESSAGE"
            java.lang.String r1 = r6.getString(r0, r2)
            goto L_0x0056
        L_0x0067:
            r1 = 0
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QCU.DGj(android.os.Bundle, int, boolean):boolean");
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.07Z, X.QCU, X.07g, androidx.fragment.app.Fragment, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        this.A00 = new C10834Ryu(view);
        2YN A0L = JTO.A0L(AnonymousClass2E0.A03().A00(), this);
        QDF A002 = A0L.A00(QDF.class);
        this.A01 = A002;
        A002.A02(requireArguments());
        this.A00.A01.setVisibility(8);
        this.A00.A09.setNavigationOnClickListener(C11496SbJ.A00(this, 39));
        Drawable navigationIcon = this.A00.A09.getNavigationIcon();
        if (navigationIcon != null) {
            Toolbar toolbar = this.A00.A09;
            AnonymousClass2E0.A0A();
            AnonymousClass4Ed.A02(requireActivity(), navigationIcon, R.attr.glyphColorPrimary);
            toolbar.setNavigationIcon(navigationIcon);
        }
        int i = 0;
        this.A00.A03.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.A01.A01())});
        this.A00.A03.setInputType(18);
        C11462SaQ.A00(this.A00.A03, this, 3);
        C11496SbJ.A01(this.A00.A02, 38, this);
        C11652Sdu.A02(this, this.A01.A06, 11);
        C11652Sdu.A02(this, this.A01.A04, 12);
        C11651Sdt.A01(this, this.A01.A05, C11652Sdu.A00(this, 13), 20);
        this.A00.A01.setVisibility(0);
        C7432QCx A003 = A0L.A00(C7432QCx.class);
        A003.A00 = Pxi.A0J(requireArguments());
        AnonymousClass2gB A0M = Pxh.A0M();
        AnonymousClass2gB A022 = AnonymousClass72Y.A02(this.A01.A07, new TPJ(2, A003, this));
        A0M.A0E(this.A01.A06, new C11650Sds(10, (Object) A0M, (Object) this, (Object) A022));
        A0M.A0E(A022, new C11648Sdq(15, (Object) A0M, (Object) this));
        C11652Sdu.A02(this, A0M, 14);
        A00();
        boolean A03 = this.A01.A03();
        TextView textView = this.A00.A07;
        if (A03) {
            i = 8;
        }
        textView.setVisibility(i);
        this.A00.A03.setVisibility(i);
        if (this.A01.A03()) {
            str = "fbpay_verify_paypal_display";
        } else {
            str = "fbpay_verify_cvv_display";
        }
        A02(this, str);
        if (requireArguments().getBoolean("AUTH_FLOW_UTIL_SHOULD_OPEN_PAYPAL_LOGIN_DIRECTLY", false)) {
            A01(this);
        }
    }

    public static void A02(QCU qcu, String str) {
        AnonymousClass2E0.A03().A01.Cgl(str, S9s.A01(qcu.requireArguments()));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(910701201);
        QCU.super.onCreate(bundle);
        this.A02 = (QmV) AnonymousClass2E0.A03().A03(getActivity(), QmV.class);
        AnonymousClass0fD.A09(-1720865477, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1976886797);
        QmV qmV = this.A02;
        C13609Tdb tdb = qmV.A01;
        View A0C = DbT.A0C(((C12465Sux) tdb).A00, viewGroup, qmV.A00);
        0qQ.A07(A0C);
        AnonymousClass0fD.A09(698431714, A022);
        return A0C;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(686483195);
        QCU.super.onDestroyView();
        C9667Rel.A00(this.A00.A03);
        this.A00 = null;
        AnonymousClass0fD.A09(-548785408, A022);
    }
}
