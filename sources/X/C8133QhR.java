package X;

import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.QhR  reason: case insensitive filesystem */
public final class C8133QhR extends QCJ implements C13613Tdf {
    public ContextThemeWrapper A00;

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Object obj = requireArguments().get("ECP_CONTAINER_FRAGMENT_TYPE");
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Bundle A0a = AnonymousClass7TE.A0a();
        if (0qQ.A0K(str, "web_view_fragment")) {
            Object obj2 = requireArguments().get("ECP_PAYPAL_BA_LOADING_URL");
            0qQ.A0C(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = requireArguments().get("ECP_PAYPAL_BA_ALLOWED_INTERCEPT_URL");
            0qQ.A0C(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            A0a.putString("WEB_VIEW_URL", (String) obj2);
            A0a.putStringArray("WEB_VIEW_ALLOWED_INTERCEPT_URLS", (String[]) obj3);
            A0a.putBoolean("WEB_VIEW_FULL_SCREEN", true);
            Fragment A03 = AnonymousClass2E0.A01().A03(A0a, str);
            0s1 A0C = DbW.A0C(this);
            A03.setTargetFragment((Fragment) null, 1111);
            A0C.A0D(A03, "CHILD_FRAGMENT_TAG", R.id.ecp_container_view);
            A0C.A00();
            return;
        }
        throw C66580MXl.A11();
    }

    public final boolean DGj(Bundle bundle, int i, boolean z) {
        String str;
        if (i != 1111) {
            return false;
        }
        Fragment A0R = getChildFragmentManager().A0R("CHILD_FRAGMENT_TAG");
        if (A0R != null) {
            0s1 A0C = DbW.A0C(this);
            A0C.A03(A0R);
            A0C.A01();
        }
        String str2 = null;
        if (bundle != null) {
            str = bundle.getString("WEB_VIEW_RESULT_INTERCEPT_URL");
            str2 = bundle.getString("WEB_VIEW_RESULT_ERROR_MESSAGE_FOR_LOGGING");
        } else {
            str = null;
        }
        Object obj = requireArguments().get("ECP_CONTAINER_FRAGMENT_TYPE");
        DbS.A1Y(obj);
        if (0qQ.A0K(obj, "web_view_fragment")) {
            Bundle A0a = AnonymousClass7TE.A0a();
            String string = requireArguments().getString("ECP_CONTENT_FRAGMENT_REQUEST_KEY");
            if (string != null) {
                int i2 = 0;
                if ((str2 != null && str2.length() != 0) || str == null || str.length() == 0) {
                    A0a.putString("PAYPAL_BA_LINKING_ERROR_MESSAGE_FOR_LOGGING", str2);
                    i2 = 1;
                } else {
                    UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer(str);
                    if (0qQ.A0K(urlQuerySanitizer.getValue("cancel"), RealtimeSubscription.GRAPHQL_MQTT_VERSION)) {
                        i2 = 2;
                    } else {
                        String value = urlQuerySanitizer.getValue("ba_token");
                        if (value != null) {
                            A0a.putString("PAYPAL_BA_TOKEN", value);
                        }
                        i2 = 1;
                    }
                }
                A0a.putInt("PAYPAL_BA_LINKING_RESULT_STATUS", i2);
                getParentFragmentManager().A0z(string, A0a);
                STG.A03(this);
                return false;
            }
            throw AnonymousClass7TE.A0y();
        }
        throw C66580MXl.A11();
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1022478174);
        C8133QhR.super.onCreate(bundle);
        AnonymousClass0fD.A09(1915641427, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(857650437);
        ContextThemeWrapper A002 = QCJ.A00(this, layoutInflater);
        this.A00 = A002;
        View inflate = layoutInflater.cloneInContext(A002).inflate(R.layout.ecp_container_fragment, viewGroup, false);
        AnonymousClass0fD.A09(451865946, A02);
        return inflate;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002d, code lost:
        if (X.C11432SUd.A0N(r3) != true) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r12 = this;
            r0 = 1507775862(0x59ded576, float:7.8402685E15)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r4 = r12
            super.onResume()
            android.os.Bundle r1 = r12.requireArguments()
            java.lang.String r0 = "ECP_CONTAINER_FRAGMENT_TITLE"
            java.lang.String r6 = r1.getString(r0)
            android.os.Bundle r1 = r12.requireArguments()
            java.lang.String r0 = "ECP_LAUNCH_PARAMS"
            android.os.Parcelable r3 = r1.getParcelable(r0)
            boolean r0 = r3 instanceof com.facebookpay.expresscheckout.models.ECPPaymentRequest
            if (r0 == 0) goto L_0x002f
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r3 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r3
            r1 = 1
            if (r3 == 0) goto L_0x002f
            boolean r0 = X.C11432SUd.A0N(r3)
            r11 = 1
            if (r0 == r1) goto L_0x0030
        L_0x002f:
            r11 = 0
        L_0x0030:
            android.view.ContextThemeWrapper r3 = r12.A00
            if (r3 != 0) goto L_0x003f
            java.lang.String r0 = "viewContext"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003f:
            android.os.Bundle r1 = r12.requireArguments()
            java.lang.String r0 = "ECP_CONTAINER_FRAGMENT_NAV_BAR_STYLE"
            java.lang.Object r5 = r1.get(r0)
            if (r5 == 0) goto L_0x0062
            X.RFs r5 = (X.C8924RFs) r5
            r0 = 48
            X.TVy r8 = new X.TVy
            r8.<init>(r12, r0)
            r7 = 0
            X.TV5 r9 = X.TV5.A00
            r10 = 0
            X.C9656Rea.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = -729183365(0xffffffffd4898b7b, float:-4.7260049E12)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        L_0x0062:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8133QhR.onResume():void");
    }
}
