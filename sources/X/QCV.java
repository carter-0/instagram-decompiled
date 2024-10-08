package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class QCV extends Fragment implements C13613Tdf, C13610Tdc {
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean DGj(android.os.Bundle r11, int r12, boolean r13) {
        /*
            r10 = this;
            r9 = 0
            r0 = 1111(0x457, float:1.557E-42)
            if (r12 != r0) goto L_0x006b
            X.0hq r1 = r10.getChildFragmentManager()
            java.lang.String r0 = "THREE_DS_WEBVIEW_FRAGMENT_TAG"
            androidx.fragment.app.Fragment r1 = r1.A0R(r0)
            if (r1 == 0) goto L_0x001b
            X.0s1 r0 = X.DbW.A0C(r10)
            r0.A03(r1)
            r0.A01()
        L_0x001b:
            r5 = 0
            if (r11 == 0) goto L_0x006e
            java.lang.String r0 = "WEB_VIEW_RESULT_INTERCEPT_URL"
            java.lang.String r2 = r11.getString(r0)
            java.lang.String r0 = "WEB_VIEW_RESULT_ERROR_ENCOUNTERED"
            boolean r1 = r11.getBoolean(r0)
            if (r2 == 0) goto L_0x006c
            int r0 = r2.length()
            if (r0 == 0) goto L_0x006c
            android.net.UrlQuerySanitizer r4 = new android.net.UrlQuerySanitizer
            r4.<init>(r2)
        L_0x0037:
            if (r1 != 0) goto L_0x006e
            if (r4 == 0) goto L_0x006e
            java.lang.String r0 = "auth_result"
            java.lang.String r1 = r4.getValue(r0)
            java.lang.String r0 = "Success"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x009d
            java.lang.String r0 = "step_up_complete_token"
            java.lang.String r3 = r4.getValue(r0)
            java.lang.String r1 = "client_load_threeds_success"
            java.lang.String r0 = "complete_redirect_3ds"
            r10.A00(r1, r0, r5, r5)
            android.os.Bundle r2 = X.Pxe.A0J(r11)
            java.lang.String r0 = "3ds_token_token"
            r2.putString(r0, r3)
            androidx.fragment.app.Fragment r1 = r10.mParentFragment
            boolean r0 = r1 instanceof X.C13783Tgy
            if (r0 == 0) goto L_0x006b
            X.Tgy r1 = (X.C13783Tgy) r1
            r1.DG8(r2, r5)
        L_0x006b:
            return r9
        L_0x006c:
            r4 = r5
            goto L_0x0037
        L_0x006e:
            android.content.Context r1 = r10.requireContext()
            r0 = 2131975356(0x7f135cbc, float:1.9587802E38)
            java.lang.String r7 = X.AnonymousClass7TE.A16(r1, r0)
            android.content.Context r1 = r10.requireContext()
            r0 = 2131975355(0x7f135cbb, float:1.95878E38)
            java.lang.String r8 = X.AnonymousClass7TE.A16(r1, r0)
            android.content.Context r1 = r10.requireContext()
            r0 = 2131975354(0x7f135cba, float:1.9587798E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r1, r0)
            X.RGf r0 = X.C8937RGf.DISMISS
            X.RuV r4 = new X.RuV
            r4.<init>(r0, r1, r5)
            X.QnR r3 = new X.QnR
            r6 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9)
            goto L_0x00f2
        L_0x009d:
            java.lang.String r0 = "error_title"
            java.lang.String r3 = r4.getValue(r0)
            X.0qQ.A07(r3)
            java.lang.String r2 = "_"
            X.11S r0 = new X.11S
            r0.<init>(r2)
            java.lang.String r1 = " "
            java.lang.String r0 = r0.A00(r3, r1)
            java.lang.String r7 = X.DbV.A12(r0)
            java.lang.String r0 = "error_message"
            java.lang.String r0 = r4.getValue(r0)
            X.0qQ.A07(r0)
            java.lang.String r0 = X.Pxf.A0d(r0, r2, r1)
            java.lang.String r8 = X.DbV.A12(r0)
            java.lang.String r0 = "cta_type"
            java.lang.String r2 = r4.getValue(r0)
            android.content.Context r1 = r10.requireContext()
            r0 = 2131975354(0x7f135cba, float:1.9587798E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r1, r0)
            X.RGf r0 = X.C8937RGf.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.Enum r0 = com.facebook.graphql.enums.EnumHelper.A00(r2, r0)
            X.RGf r0 = (X.C8937RGf) r0
            X.0qQ.A07(r0)
            X.AnonymousClass7TG.A1Q(r7, r8)
            X.RuV r4 = new X.RuV
            r4.<init>(r0, r1, r5)
            X.QnR r3 = new X.QnR
            r6 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9)
        L_0x00f2:
            androidx.fragment.app.Fragment r1 = r10.mParentFragment
            boolean r0 = r1 instanceof X.C13783Tgy
            if (r0 == 0) goto L_0x00fd
            X.Tgy r1 = (X.C13783Tgy) r1
            r1.DG9(r3)
        L_0x00fd:
            java.lang.String r1 = "client_load_threeds_fail"
            java.lang.String r0 = "complete_redirect_3ds"
            r10.A00(r1, r0, r5, r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QCV.DGj(android.os.Bundle, int, boolean):boolean");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        A00("client_render_threeds_display", "load_3ds_init_url", (String) null, (Throwable) null);
        S7M A03 = AnonymousClass2E0.A03();
        Fragment A01 = A03.A04.A01(requireArguments(), "AUTH_THREE_DS_WEB_VIEW");
        0qQ.A07(A01);
        A01.setTargetFragment((Fragment) null, 1111);
        0s1 A0C = DbW.A0C(this);
        A0C.A0C(A01, "THREE_DS_WEBVIEW_FRAGMENT_TAG", R.id.webview_container);
        A0C.A00();
    }

    private final void A00(String str, String str2, String str3, Throwable th) {
        Map A1E;
        HashMap A00 = S9s.A00(requireArguments());
        if (!(str2 == null || str2.length() == 0)) {
            A00.put("auth_view_name_key", str2);
        }
        if (!(str3 == null || str3.length() == 0)) {
            A00.put("auth_target_name_key", str3);
        }
        if (th != null) {
            String A01 = C11302SKm.A01(th);
            if (A00.containsKey("AUTH_LOGGING_EXTRA_KEY")) {
                Object obj = A00.get("AUTH_LOGGING_EXTRA_KEY");
                obj.getClass();
                A1E = (Map) obj;
            } else {
                A1E = AnonymousClass7TE.A1E();
                A00.put("AUTH_LOGGING_EXTRA_KEY", A1E);
            }
            A1E.put("error_message", A01);
        }
        AnonymousClass2E0.A03().A01.Cgl(str, Collections.unmodifiableMap(A00));
    }

    public final boolean onBackPressed() {
        A00("user_click_threeds_exit", (String) null, "cancel_3ds", (Throwable) null);
        RuntimeException runtimeException = new RuntimeException();
        C13734Tg6 tg6 = this.mParentFragment;
        if (!(tg6 instanceof C13734Tg6)) {
            return false;
        }
        tg6.AVU((Bundle) null, (C11330SNj) null, runtimeException);
        return false;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-659800980);
        View inflate = layoutInflater.cloneInContext(Pxj.A0K(this, layoutInflater)).inflate(R.layout.auth_three_ds_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1737338465, A02);
        return inflate;
    }
}
