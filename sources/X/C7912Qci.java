package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Qci  reason: case insensitive filesystem */
public final class C7912Qci extends C68376NEc implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "IgSelfiePermissionsFragment";
    public UserSession A00;
    public String A01;
    public String A02;
    public String A03;
    public 0lg A04;
    public String A05;
    public String A06;
    public boolean A07;

    public final String getModuleName() {
        return "selfie_permissions";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A002 = SKW.A00(view, R.id.divider);
        Context A0S = AnonymousClass7TE.A0S(view);
        Pxf.A1B(A002, C11408SSf.A01(A0S, R.attr.sc_divider));
        C11408SSf.A04(A0S, SKW.A02(view, R.id.tv_permissions_title), R.attr.sc_primary_text);
        C11408SSf.A05((Button) SKW.A00(view, R.id.btn_camera_access_allow));
        C13857Tic tic = this.A00;
        if (tic != null) {
            SKW.A01(view, R.id.iv_image).setImageDrawable(tic.Bbk(A0S));
        }
        09i.A0A.A04(requireArguments());
        if (this.A07) {
            UserSession userSession = this.A00;
            if (userSession != null) {
                STD.A06(this, userSession, this.A01, "av_fbap", "camera_permission_granting", this.A02);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final CharSequence A01() {
        CharSequence text = getText(2131972642);
        0qQ.A07(text);
        return text;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0058, code lost:
        if (r4.A00 == null) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            r0 = -1405372627(0xffffffffac3bb72d, float:-2.6675981E-12)
            int r3 = X.AnonymousClass0fD.A02(r0)
            X.C7912Qci.super.onCreate(r5)
            android.os.Bundle r2 = r4.requireArguments()
            X.08y r0 = X.09i.A0A
            X.0wW r1 = r0.A04(r2)
            r4.A04 = r1
            boolean r0 = r1 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0077
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
        L_0x001c:
            r4.A00 = r1
            java.lang.String r0 = "challenge_id"
            java.lang.String r0 = r2.getString(r0)
            r4.A05 = r0
            java.lang.String r0 = "challenge_use_case"
            java.lang.String r0 = r2.getString(r0)
            r4.A06 = r0
            java.lang.String r0 = "av_session_id"
            java.lang.String r0 = r2.getString(r0)
            r4.A01 = r0
            java.lang.String r0 = "flow_id"
            java.lang.String r0 = r2.getString(r0)
            r4.A02 = r0
            java.lang.String r0 = "product_surface"
            java.lang.String r0 = r2.getString(r0)
            r4.A03 = r0
            java.lang.String r1 = r4.A06
            java.lang.String r0 = "ig_age_verification"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = r4.A05
            if (r0 == 0) goto L_0x005a
            com.instagram.common.session.UserSession r1 = r4.A00
            r0 = 1
            if (r1 != 0) goto L_0x005b
        L_0x005a:
            r0 = 0
        L_0x005b:
            r4.A07 = r0
            if (r0 == 0) goto L_0x0070
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            X.00N r2 = r0.getOnBackPressedDispatcher()
            r1 = 1
            X.QAH r0 = new X.QAH
            r0.<init>((java.lang.Object) r4, (int) r1)
            r2.A03(r0)
        L_0x0070:
            r0 = -279001294(0xffffffffef5ec732, float:-6.8946485E28)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        L_0x0077:
            r1 = 0
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7912Qci.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-112205976);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.sc_ig_permission_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-492767129, A022);
        return inflate;
    }
}
