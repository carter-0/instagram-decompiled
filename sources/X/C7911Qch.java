package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.instagram.android.R;

/* renamed from: X.Qch  reason: case insensitive filesystem */
public final class C7911Qch extends C68376NEc implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "IdVerificationPermissionsFragment";
    public String A00;
    public String A01;
    public String A02;
    public boolean A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final String getModuleName() {
        return "selfie_permissions";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C11408SSf.A05((Button) SKW.A00(view, R.id.btn_camera_access_allow));
        if (this.A03) {
            STD.A06(this, AnonymousClass7TE.A0l(this.A04), this.A00, "av_idv", "camera_permission_granting", this.A02);
        }
    }

    public final CharSequence A01() {
        CharSequence text = getText(2131974026);
        0qQ.A07(text);
        return text;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2089666137);
        C7911Qch.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = requireArguments.getString("challenge_use_case");
        this.A00 = requireArguments.getString("av_session_id");
        this.A02 = requireArguments.getString("flow_id");
        this.A03 = "ig_age_verification_idv".equals(this.A01);
        AnonymousClass0fD.A09(-1896244941, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(826065864);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.id_verification_permission_layout, viewGroup, false);
        AnonymousClass0fD.A09(1559980761, A022);
        return inflate;
    }
}
