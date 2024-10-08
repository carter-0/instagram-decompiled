package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.creation.capture.opencarousel.configuration.OpenCarouselCaptureConfig;

/* renamed from: X.UZv  reason: case insensitive filesystem */
public final class C15290UZv extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "OpenCarouselCameraFragment";
    public OpenCarouselCaptureConfig A00;
    public AnonymousClass80Q A01;
    public AnonymousClass80C A02;
    public final C41837B2s A03 = new WUP(this, 8);
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final String getModuleName() {
        return C273654mx.A00(863);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass80C r0 = new AnonymousClass80C();
        this.A02 = r0;
        registerLifecycleListener(r0);
        ViewGroup A0E = DbS.A0E(view, R.id.camera_container);
        0qQ.A0A(A0E);
        AnonymousClass80D r4 = new AnonymousClass80D();
        C41837B2s b2s = this.A03;
        b2s.getClass();
        r4.A0l = b2s;
        AnonymousClass0eM r02 = this.A04;
        C13992Tns.A0u(this, r4, r02);
        AnonymousClass80D.A08(AnonymousClass7TE.A0l(r02), AnonymousClass80H.A02, C363138jC.A00, r4);
        r4.A3h = true;
        r4.A0R = this.volumeKeyPressController;
        C13991Tnr.A0v(A0E, r4, this.A02);
        r4.A0B = 28D.A3j;
        r4.A0O = this;
        r4.A3H = true;
        r4.A3Q = false;
        r4.A3G = false;
        r4.A3i = true;
        r4.A3t = false;
        r4.A3s = false;
        r4.A44 = false;
        r4.A47 = true;
        r4.A3L = false;
        r4.A28 = AnonymousClass05K.A1F;
        r4.A0b = this.A00;
        r4.A3J = true;
        0qQ.A07(r4);
        AnonymousClass7TF.A17(this, new C20217WnH(r4, this));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final boolean onBackPressed() {
        AnonymousClass80Q r0 = this.A01;
        if (r0 == null || !r0.A06()) {
            return false;
        }
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1924332934);
        C15290UZv.super.onCreate(bundle);
        this.A00 = (OpenCarouselCaptureConfig) requireArguments().getParcelable(AnonymousClass000.A00(3699));
        AnonymousClass0fD.A09(392891048, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1340028374);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.open_carousel_camera_fragment_layout, viewGroup, false);
        AnonymousClass0fD.A09(1035225685, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1179465257);
        super.onDestroyView();
        this.A01 = null;
        unregisterLifecycleListener(this.A02);
        AnonymousClass80C r0 = this.A02;
        if (r0 != null) {
            r0.onDestroyView();
        }
        this.A02 = null;
        AnonymousClass0fD.A09(116018960, A022);
    }
}
