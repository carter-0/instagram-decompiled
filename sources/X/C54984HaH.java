package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import com.instagram.ar.features.effectspage.models.EffectsPageModel;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.music.common.config.MusicAttributionConfig;
import instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment;

/* renamed from: X.HaH  reason: case insensitive filesystem */
public abstract class C54984HaH {
    public static final void A00(FragmentActivity fragmentActivity, AnonymousClass0iw r37, UserSession userSession, EffectPreviewIntf effectPreviewIntf, 1Xj r40, AnonymousClass4DU r41, AnonymousClass3W1 r42) {
        boolean A1Y = DbW.A1Y(effectPreviewIntf);
        String A0j = AnonymousClass7TG.A0j();
        C54689HOu hOu = C54689HOu.A0U;
        String id = effectPreviewIntf.getId();
        0qQ.A0B(id, 0);
        UserSession userSession2 = userSession;
        1Xj r27 = r40;
        C52086GEg.A0L(hOu, (AnonymousClass8ZN) null, userSession2, r27, r41, A0j, "null", (String) null, DbZ.A07(id), (long) r42.getPosition());
        EffectsPageModel effectsPageModel = new EffectsPageModel((EffectAttribution) null, DDx.A00(effectPreviewIntf), (Integer) null, (Integer) null, (Integer) null, (Integer) null, DDx.A02(effectPreviewIntf), DDx.A03(effectPreviewIntf), effectPreviewIntf.getId(), (String) null, "", effectPreviewIntf.getName(), "", (String) null, DDx.A05(effectPreviewIntf), !DDx.A04(effectPreviewIntf), "SAVED".equals(effectPreviewIntf.getSaveStatus()), !MessageAvailabilityResponseId$Companion.NOT_SUPPORTED.equals(effectPreviewIntf.getSaveStatus()), A1Y, A1Y, A1Y, false);
        String id2 = r27.getId();
        C391589tK r1 = C391589tK.FEED_ATTRIBUTION;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        C391589tK r5 = r1;
        UserSession userSession3 = userSession2;
        HUG.A00(fragmentActivity2, EffectsPageFragment.A00(r1, (AnonymousClass8ZN) null, effectsPageModel, (MusicAttributionConfig) null, id2, A0j, (String) null, (String) null, (String) null), (C279294yP) null, r5, (28D) null, C59725JVj.NO_CAMERA_SESSION, userSession3, AnonymousClass05K.A00, r37.getModuleName());
    }
}
