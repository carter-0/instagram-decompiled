package X;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration;
import com.instagram.model.effect.AREffect;
import java.util.List;

public final class K79 extends AnonymousClass4DH implements C273434mZ {
    public static final String __redex_internal_original_name = "EffectInfoBottomSheetFragment";
    public TouchInterceptorFrameLayout A00;
    public EffectInfoBottomSheetConfiguration A01;
    public C312266e6 A02;
    public boolean A03;
    public C19199WPf A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);

    public final void EIL() {
    }

    public final String getModuleName() {
        return AnonymousClass000.A00(3287);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.07g, androidx.fragment.app.Fragment, X.K79, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        String id;
        boolean isDeviceLocked;
        View view2 = view;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = view.requireViewById(R.id.effect_info_bottom_sheet_root);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null) {
            0kD.A07("EffectInfoBottomSheetFragment::onViewCreated", "No configuration arguments for the bottom sheet.", (Throwable) null);
            return;
        }
        this.A01 = (EffectInfoBottomSheetConfiguration) C320236s2.A00(bundle2, EffectInfoBottomSheetConfiguration.class, "ar_effect_bottom_sheet_info");
        if (bundle2.containsKey("ar_effect_is_e2ee_mandated")) {
            this.A03 = bundle2.getBoolean("ar_effect_is_e2ee_mandated");
        }
        Context A052 = DbT.A05(requireContext());
        AnonymousClass0eM r3 = this.A05;
        EffectInfoBottomSheetConfiguration effectInfoBottomSheetConfiguration = this.A01;
        0qQ.A0A(effectInfoBottomSheetConfiguration);
        this.A04 = new C19199WPf(bundle2, view2, effectInfoBottomSheetConfiguration, this, this.A02, JTO.A0L(new KCX(A052, AnonymousClass7TE.A0l(r3)), this).A00(C60121Jg2.class));
        C59725JVj jVj = (C59725JVj) bundle2.getSerializable("ar_effect_surface");
        if (jVj != null) {
            EffectInfoBottomSheetConfiguration effectInfoBottomSheetConfiguration2 = this.A01;
            0qQ.A0A(effectInfoBottomSheetConfiguration2);
            EffectInfoAttributionConfiguration effectInfoAttributionConfiguration = (EffectInfoAttributionConfiguration) effectInfoBottomSheetConfiguration2.A02.get(0);
            0qQ.A07(effectInfoAttributionConfiguration);
            27r A0g = C51971G9r.A0g(r3);
            String str = null;
            if (this.A03) {
                id = null;
            } else {
                AREffect aREffect = effectInfoAttributionConfiguration.A04;
                id = aREffect.getId();
                str = aREffect.A06();
            }
            KeyguardManager keyguardManager = (KeyguardManager) requireContext().getSystemService("keyguard");
            if (keyguardManager == null) {
                isDeviceLocked = false;
            } else {
                isDeviceLocked = keyguardManager.isDeviceLocked();
            }
            AnonymousClass29X r32 = A0g.A0D;
            0Aj A0e = AnonymousClass7TE.A0e(r32.A01, "ig_camera_start_session");
            if (A0e.isSampled()) {
                List A1I = AnonymousClass7TE.A1I(2AL.A08(id));
                List A1I2 = AnonymousClass7TE.A1I(2AL.A08(str));
                JTO.A1T(A0e, "IG_CAMERA_START_EFFECT_INFO_SHEET_SESSION");
                JTO.A1Q(A0e, "EFFECT_INFO_SHEET");
                AnonymousClass283 r4 = r32.A04;
                JTO.A1S(A0e, JTP.A0p(r4));
                A0e.AAe("applied_effect_ids", A1I);
                A0e.AAe(AnonymousClass000.A00(67), A1I2);
                AnonymousClass7TE.A1W(A0e, "camera_position", JTR.A0D(r4));
                AnonymousClass7TH.A0X(A0e, r32);
                AnonymousClass7TE.A1V(A0e, r4);
                AnonymousClass7TE.A1W(A0e, "event_type", 1);
                JTP.A1J(A0e, r4);
                AnonymousClass7TH.A0U(A0e);
                C51965G9l.A1A(jVj, A0e);
                A0e.A7p("is_device_locked", Boolean.valueOf(isDeviceLocked));
                A0e.AAJ("discovery_session_id", r4.A0O);
                C51973G9u.A14(A0e, "search_session_id", r4.A0P);
                JTS.A1A(A0e, r32);
                A0e.AAJ("device_fold_orientation", C254483sY.A00);
                A0e.AAJ("device_fold_state", C254493sZ.A00);
                A0e.A7p("device_is_in_multi_window_mode", C254503sa.A00);
                A0e.AAJ("device_aspect_ratio_category", C254473sX.A00);
                A0e.Cgf();
            }
        }
    }

    public final AnonymousClass4DJ B7u() {
        return this;
    }

    public final TouchInterceptorFrameLayout C8v() {
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A00;
        0qQ.A0A(touchInterceptorFrameLayout);
        return touchInterceptorFrameLayout;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1239366370);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.effect_info_bottom_sheet_fragment_layout, viewGroup, false);
        AnonymousClass0fD.A09(-949016469, A022);
        return inflate;
    }

    public final void onDestroy() {
        EffectInfoBottomSheetConfiguration effectInfoBottomSheetConfiguration;
        String id;
        int A022 = AnonymousClass0fD.A02(1301193694);
        super.onDestroy();
        Bundle bundle = this.mArguments;
        if (!(bundle == null || (effectInfoBottomSheetConfiguration = this.A01) == null)) {
            EffectInfoAttributionConfiguration effectInfoAttributionConfiguration = (EffectInfoAttributionConfiguration) AnonymousClass7TE.A13(effectInfoBottomSheetConfiguration.A02);
            0qQ.A07(effectInfoAttributionConfiguration);
            C59725JVj jVj = (C59725JVj) bundle.getSerializable("ar_effect_surface");
            if (jVj != null) {
                27r A0g = C51971G9r.A0g(this.A05);
                String str = null;
                if (this.A03) {
                    id = null;
                } else {
                    AREffect aREffect = effectInfoAttributionConfiguration.A04;
                    id = aREffect.getId();
                    str = aREffect.A06();
                }
                AnonymousClass29Q r6 = A0g.A07;
                0Aj A0e = AnonymousClass7TE.A0e(r6.A01, "ig_camera_end_session");
                if (A0e.isSampled()) {
                    JTO.A1Q(A0e, "EFFECT_INFO_SHEET");
                    JTO.A1T(A0e, "IG_CAMERA_END_EFFECT_INFO_SHEET_SESSION");
                    AnonymousClass283 r4 = r6.A04;
                    JTO.A1S(A0e, JTP.A0p(r4));
                    A0e.AAe("applied_effect_ids", AnonymousClass7TE.A1I(2AL.A08(id)));
                    A0e.AAe(AnonymousClass000.A00(67), AnonymousClass7TE.A1I(2AL.A08(str)));
                    AnonymousClass7TE.A1W(A0e, "camera_position", JTR.A0D(r4));
                    AnonymousClass7TH.A0X(A0e, r6);
                    AnonymousClass7TE.A1V(A0e, r4);
                    AnonymousClass7TE.A1W(A0e, "event_type", 1);
                    JTP.A1J(A0e, r4);
                    AnonymousClass7TH.A0U(A0e);
                    C51965G9l.A1A(jVj, A0e);
                    DbY.A1C(A0e);
                    JTS.A1A(A0e, r6);
                    String str2 = r4.A0O;
                    if (str2 != null) {
                        A0e.AAJ("discovery_session_id", str2);
                    }
                    String str3 = r4.A0P;
                    if (!(str3 == null || str3.length() == 0)) {
                        A0e.AAJ("search_session_id", str3);
                    }
                    JTT.A18(A0e);
                }
            }
        }
        AnonymousClass0fD.A09(-1927053105, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-915205086);
        K79.super.onPause();
        this.A02 = null;
        AnonymousClass0fD.A09(-637755109, A022);
    }
}
