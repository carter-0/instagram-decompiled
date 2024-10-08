package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.instagram.android.R;
import com.instagram.ar.features.effectspage.models.EffectsPageModel;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.config.MusicAttributionConfig;
import instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment;

/* renamed from: X.LlX  reason: case insensitive filesystem */
public final class C64994LlX implements C347477ws {
    public final View A00;
    public final ViewGroup A01;
    public final AnonymousClass0eM A02 = C66300MMj.A00(this, 43);
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final UserSession A05;
    public final L0H A06;

    public final void A00(CameraAREffect cameraAREffect) {
        AnonymousClass0eM r2 = this.A02;
        ((C347487wt) r2.getValue()).A0E();
        ((C347487wt) r2.getValue()).setHorizontalMargin(0);
        ((C347487wt) r2.getValue()).setBookmarkIconExpanded(cameraAREffect.CbC());
        ((C347487wt) r2.getValue()).setCurrentTitle(new C342507oi(cameraAREffect.A0S, DbW.A0h(this.A00.getContext(), cameraAREffect.A0C, 2131953212), false, cameraAREffect.CbC(), true, true, true));
    }

    public final void D49() {
    }

    public final void DBX() {
        L0H l0h = this.A06;
        CameraAREffect cameraAREffect = (CameraAREffect) AnonymousClass8d4.A03.getValue();
        if (cameraAREffect != null && cameraAREffect.A0D()) {
            C39903AIl aIl = l0h.A00;
            AnonymousClass9YG r0 = aIl.A00;
            Activity activity = aIl.A01;
            String A0j = AnonymousClass7TG.A0j();
            UserSession userSession = r0.A07;
            String str = cameraAREffect.A0B;
            if (str == null) {
                str = "";
            }
            String str2 = cameraAREffect.A0C;
            if (str2 == null) {
                str2 = "";
            }
            ImageUrl imageUrl = cameraAREffect.A07;
            String str3 = cameraAREffect.A0K;
            String str4 = cameraAREffect.A0M;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = cameraAREffect.A0S;
            0qQ.A07(str5);
            EffectsPageModel effectsPageModel = new EffectsPageModel((EffectAttribution) null, imageUrl, (Integer) null, (Integer) null, (Integer) null, (Integer) null, str, str2, str3, (String) null, str4, str5, "", (String) null, false, false, cameraAREffect.CbC(), true, true, true, true, false);
            C391589tK r21 = C391589tK.EFFECT_FOOTER;
            Bundle A002 = EffectsPageFragment.A00(r21, (AnonymousClass8ZN) null, effectsPageModel, (MusicAttributionConfig) null, (String) null, A0j, (String) null, (String) null, (String) null);
            String moduleName = C17169VKy.A04.getModuleName();
            Activity activity2 = activity;
            HUG.A00(activity2, A002, C279294yP.CLIPS, r21, r0.A01, C59725JVj.POST_CAPTURE, userSession, AnonymousClass05K.A01, moduleName);
        }
    }

    public final void Dgc() {
        int i;
        L0H l0h = this.A06;
        CameraAREffect cameraAREffect = (CameraAREffect) AnonymousClass8d4.A03.getValue();
        if (cameraAREffect != null) {
            boolean CbC = cameraAREffect.CbC();
            AnonymousClass9YG r4 = l0h.A00.A00;
            C318136oS A002 = C318116oQ.A00(r4);
            if (CbC) {
                i = 9;
            } else {
                i = 8;
            }
            AnonymousClass7TE.A1Z(new MH1(cameraAREffect, r4, (AnonymousClass4D7) null, i), A002);
            ((C347487wt) this.A02.getValue()).setBookmarkIconExpanded(!CbC);
        }
    }

    public C64994LlX(View view, UserSession userSession, L0H l0h) {
        this.A05 = userSession;
        this.A00 = view;
        this.A06 = l0h;
        0eO r1 = 0eO.A02;
        this.A04 = C66300MMj.A01(this, r1, 45);
        AnonymousClass0eM A012 = C66300MMj.A01(this, r1, 44);
        this.A03 = A012;
        this.A01 = DbX.A0I(AnonymousClass7TE.A0c(A012), R.id.post_capture_effect_mini_gallery_footer);
    }
}
