package X;

import android.app.Activity;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.instagram.android.R;
import com.instagram.ar.features.effectspage.models.EffectsPageModel;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.config.MusicAttributionConfig;
import instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment;

/* renamed from: X.HpQ  reason: case insensitive filesystem */
public final class C55903HpQ {
    public final void A00(Activity activity, C391589tK r30, AnonymousClass8ZN r31, UserSession userSession, String str, String str2) {
        UserSession userSession2 = userSession;
        String str3 = str2;
        AnonymousClass7TG.A1P(userSession2, str3);
        Activity activity2 = activity;
        EffectsPageModel effectsPageModel = new EffectsPageModel((EffectAttribution) null, (ImageUrl) null, Integer.valueOf(R.drawable.horizon_worlds_foa_horizonlogo), 2131963486, 2131963489, 2131963485, "", "", "43", "43", "", AnonymousClass7TE.A16(activity2, 2131963488), "", "HORIZON", false, 182.A06(0Tu.A05, userSession2, 36319952851967831L), false, true, false, false, true, false);
        String A0b = AnonymousClass7TF.A0b();
        0qQ.A0B(A0b, 2);
        C391589tK r7 = r30;
        UserSession userSession3 = userSession2;
        HUG.A00(activity2, EffectsPageFragment.A00(r7, r31, effectsPageModel, (MusicAttributionConfig) null, str, A0b, (String) null, (String) null, (String) null), (C279294yP) null, r7, (28D) null, C59725JVj.NO_CAMERA_SESSION, userSession3, AnonymousClass05K.A01, str3);
    }
}
