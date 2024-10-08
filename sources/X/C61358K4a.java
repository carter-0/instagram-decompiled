package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.List;

/* renamed from: X.K4a  reason: case insensitive filesystem */
public final class C61358K4a extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ClipsTrialBottomSheetFragment";
    public IgdsBottomButtonLayout A00;
    public IgdsHeadline A01;
    public SpinnerImageView A02;
    public C62320sa A03;
    public C62320sa A04;
    public final String A05 = __redex_internal_original_name;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);
    public final AnonymousClass0eM A07 = AnonymousClass1YB.A00(new C20698WxU((Object) this, 1));
    public final AnonymousClass0eM A08;

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = (SpinnerImageView) view.requireViewById(R.id.loading_indicator);
        this.A01 = (IgdsHeadline) view.requireViewById(R.id.headline);
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
        C59845JaL jaL = new C59845JaL(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 24);
        19B r42 = 19B.A00;
        1Eo.A05(r42, jaL, A002);
        2YL A0H = DbS.A0H(this.A08);
        1Eo.A05(r42, new MG5(A0H, (AnonymousClass4D7) null, 44), C318116oQ.A00(A0H));
    }

    public static final void A01(C61358K4a k4a) {
        C61358K4a k4a2 = k4a;
        ClipsTrialBottomSheetViewModel clipsTrialBottomSheetViewModel = (ClipsTrialBottomSheetViewModel) k4a2.A08.getValue();
        LSk.A02(LSk.A00(clipsTrialBottomSheetViewModel.A00, Boolean.valueOf(clipsTrialBottomSheetViewModel.A0D), (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, AppStateModule.APP_STATE_ACTIVE, clipsTrialBottomSheetViewModel.A07, (List) null), clipsTrialBottomSheetViewModel.A03, PublicKeyCredentialControllerUtility.JSON_KEY_USER, "trial_result", C273654mx.A00(407), clipsTrialBottomSheetViewModel.A06);
        C62320sa r0 = k4a2.A03;
        if (r0 != null) {
            r0.invoke();
        }
    }

    public final String getModuleName() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public C61358K4a() {
        C20698WxU wxU = new C20698WxU((Object) this, 5);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20698WxU((Object) new C20698WxU((Object) this, 2), 3));
        this.A08 = DbS.A0I(new C20698WxU((Object) A002, 4), wxU, new C20614Wvv(20, (Object) null, A002), DbS.A0z(ClipsTrialBottomSheetViewModel.class));
    }

    public static final void A00(View view, C61358K4a k4a, int i, int i2) {
        DbU.A0F(view, R.id.trial_metric_icon).setImageResource(i);
        DbU.A0G(view, R.id.trial_metric_value).setText(C253673rC.A04(JTR.A0R(k4a), Integer.valueOf(i2), IgNetworkConsentStorage.MAX_ENTRIES, false, false));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1275698970);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_viewer_trial_bottom_sheet_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-74514689, A022);
        return inflate;
    }
}
