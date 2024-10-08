package X;

import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Uc6  reason: case insensitive filesystem */
public final class C15400Uc6 extends C273374mT implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "DirectQuickPromotionCameraFragment";
    public AnonymousClass80Q A00;
    public RectF A01;
    public AnonymousClass80C A02;
    public final C41837B2s A03 = new WUP(this, 3);

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup A0I = DbX.A0I(view, R.id.direct_quick_camera_container);
        AnonymousClass80C r0 = new AnonymousClass80C();
        this.A02 = r0;
        registerLifecycleListener(r0);
        AnonymousClass80D r3 = new AnonymousClass80D();
        C41837B2s b2s = this.A03;
        b2s.getClass();
        r3.A0l = b2s;
        UserSession session = getSession();
        session.getClass();
        r3.A0S = session;
        r3.A05 = requireActivity();
        r3.A0M = this;
        AnonymousClass80D.A08(getSession(), AnonymousClass80H.A02, AnonymousClass9QA.A00, r3);
        r3.A3h = true;
        r3.A0R = this.volumeKeyPressController;
        C13991Tnr.A0v(A0I, r3, this.A02);
        r3.A0B = 28D.A2L;
        r3.A0O = this;
        RectF rectF = this.A01;
        if (rectF == null) {
            0qQ.A0F("animationBounds");
            throw AnonymousClass00P.createAndThrow();
        }
        r3.A06 = rectF;
        r3.A07 = rectF;
        r3.A3r = false;
        r3.A3v = false;
        r3.A33 = false;
        r3.A04 = 0;
        r3.A3H = true;
        r3.A47 = true;
        r3.A17 = new AnonymousClass80F(2131960439, 2131960439, true, true, true);
        r3.A3N = true;
        r3.A3M = true;
        r3.A3L = true;
        r3.A3Q = true;
        r3.A0y = AnonymousClass80E.ALL;
        this.A00 = new AnonymousClass80Q(r3);
    }

    public final String getModuleName() {
        return C273654mx.A00(662);
    }

    public final boolean onBackPressed() {
        AnonymousClass80Q r0 = this.A00;
        if (r0 == null || !r0.A06()) {
            return false;
        }
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2029259934);
        C15400Uc6.super.onCreate(bundle);
        Parcelable parcelable = requireArguments().getParcelable(AnonymousClass000.A00(24));
        if (parcelable != null) {
            this.A01 = (RectF) parcelable;
            AnonymousClass0fD.A09(1011949400, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(568809842, A022);
        throw A0y;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(420692833);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_quick_camera_fragment_layout, viewGroup, false);
        AnonymousClass0fD.A09(105810072, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(678150476);
        super.onDestroyView();
        AnonymousClass80Q r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
        this.A00 = null;
        unregisterLifecycleListener(this.A02);
        AnonymousClass80C r02 = this.A02;
        0qQ.A0A(r02);
        r02.onDestroyView();
        this.A02 = null;
        AnonymousClass0fD.A09(-1777327650, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1448068959);
        super.onResume();
        Activity rootActivity = getRootActivity();
        if (rootActivity != null) {
            getSession();
            C357628Yy.A00(rootActivity);
            AnonymousClass0fD.A09(-1963634292, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(-879061971, A022);
        throw A0y;
    }
}
