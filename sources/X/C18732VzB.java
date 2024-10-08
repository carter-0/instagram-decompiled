package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.adsdatapreferences.consentgrowth.controller.IGAdsPreferencesIsOptedOutFromThirdPartyMutationResponseImpl;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.VzB  reason: case insensitive filesystem */
public final class C18732VzB {
    public final C2356630s A00;
    public final AnonymousClass4DH A01;
    public final Map A02;
    public final UserSession A03;

    public static final void A00(C18732VzB vzB, String str) {
        C46649DiU A04 = C46649DiU.A04("com.instagram.ads.cad_data_preferences.helpers.ads_personalization_screen_wrapper", DbY.A0m(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str));
        AnonymousClass4DH r1 = vzB.A01;
        FragmentActivity requireActivity = r1.requireActivity();
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) vzB.A03);
        igBloksScreenConfig.A0U = r1.requireActivity().getString(2131957396);
        A04.A0D(requireActivity, igBloksScreenConfig);
    }

    public static final void A01(C18732VzB vzB, boolean z) {
        1vn A012 = 1vm.A01(vzB.A03);
        2IS r4 = new 2IS();
        2IS r3 = new 2IS();
        r4.A02(AnonymousClass000.A00(3411), Boolean.valueOf(z));
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A05(), "IGAdsPreferencesIsOptedOutFromThirdPartyMutation", r4.getParamsCopy(), r3.getParamsCopy(), IGAdsPreferencesIsOptedOutFromThirdPartyMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "update_ig_opt_out_from_third_party", new ArrayList());
        A012.ATL(C19032WHj.A00, C19047WHz.A00, pandoGraphQLRequest);
    }

    public C18732VzB(C2356630s r1, AnonymousClass4DH r2, UserSession userSession, Map map) {
        C51974G9v.A1M(userSession, r1, map);
        this.A01 = r2;
        this.A03 = userSession;
        this.A00 = r1;
        this.A02 = map;
    }
}
