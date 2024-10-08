package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.instagram.android.R;
import java.io.File;

/* renamed from: X.UZx  reason: case insensitive filesystem */
public final class C15292UZx extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "ArCameraMediaShareFragment";
    public 28D A00;
    public AnonymousClass80Q A01;
    public AnonymousClass80C A02;
    public File A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07 = true;
    public final C41837B2s A08 = new WUP(this, 0);
    public final AnonymousClass0eM A09 = C227642jf.A02(this);

    public final String getModuleName() {
        return "AR_COMMERCE_CAMERA_SHARE";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup A0I = DbX.A0I(view, R.id.media_share_container);
        AnonymousClass80C r0 = new AnonymousClass80C();
        this.A02 = r0;
        registerLifecycleListener(r0);
        AnonymousClass7TF.A17(this, new C20185Wmj(A0I, this));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A09);
    }

    public final boolean onBackPressed() {
        AnonymousClass80Q r0 = this.A01;
        if (r0 == null || !r0.A06()) {
            return false;
        }
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1448506131);
        C15292UZx.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A03 = new File(C320236s2.A01(requireArguments, "preset_medium_file_path"));
        this.A00 = AnonymousClass7TH.A07(requireArguments, "camera_entry_point");
        this.A06 = JTP.A0m(requireArguments, "media_type");
        this.A05 = JTP.A0m(requireArguments, "effect_id");
        this.A07 = requireArguments.getBoolean("use_effect_attribution");
        this.A04 = requireArguments.getString("ads_client_token");
        AnonymousClass0fD.A09(1528834868, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(880188566);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.media_share_layout, viewGroup, false);
        AnonymousClass0fD.A09(2119675686, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-650693094);
        super.onDestroyView();
        AnonymousClass80Q r0 = this.A01;
        if (r0 != null) {
            r0.A00();
        }
        this.A01 = null;
        unregisterLifecycleListener(this.A02);
        AnonymousClass80C r02 = this.A02;
        if (r02 != null) {
            r02.onDestroyView();
        }
        this.A02 = null;
        AnonymousClass0fD.A09(-418977121, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(458308995);
        super.onResume();
        C13991Tnr.A1C(this, 8);
        Activity A032 = DbT.A03(this);
        this.A09.getValue();
        C357628Yy.A00(A032);
        AnonymousClass0fD.A09(-1267719355, A022);
    }

    public final void onStop() {
        Window window;
        int A022 = AnonymousClass0fD.A02(223622185);
        C15292UZx.super.onStop();
        C13991Tnr.A1C(this, 0);
        Activity rootActivity = getRootActivity();
        if (!(rootActivity == null || (window = rootActivity.getWindow()) == null)) {
            2db.A07(window.getDecorView(), window, true);
        }
        AnonymousClass0fD.A09(1283360824, A022);
    }
}
