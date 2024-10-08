package X;

import android.app.Activity;
import android.content.res.Resources;
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

public final class PMV implements C74361Ptb, C347477ws {
    public int A00;
    public C70520O9t A01;
    public C68291N9e A02 = new C68291N9e((CameraAREffect) null, 0.0f, false, false);
    public final int A03;
    public final int A04;
    public final Activity A05;
    public final View A06;
    public final ViewGroup A07;
    public final UserSession A08;
    public final C70753OJz A09;
    public final OLF A0A;
    public final AnonymousClass0eM A0B = AnonymousClass0eN.A01(new C73906Plh(this, 24));
    public final AnonymousClass0eM A0C = C73906Plh.A00(this, 25);

    public final void D49() {
    }

    public /* synthetic */ PMV(Activity activity, View view, UserSession userSession, OLF olf) {
        C70753OJz oJz = new C70753OJz(userSession);
        this.A06 = view;
        this.A05 = activity;
        this.A08 = userSession;
        this.A0A = olf;
        this.A09 = oJz;
        this.A07 = (ViewGroup) AnonymousClass7TE.A0b(view, R.id.effect_footer_container);
        Resources resources = view.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.action_bar_plus_shadow_height);
        this.A03 = dimensionPixelSize;
        this.A04 = resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
        this.A00 = dimensionPixelSize;
    }

    private final void A00(CameraAREffect cameraAREffect) {
        boolean z;
        String str;
        AnonymousClass0eM r4 = this.A0C;
        if (!((C347487wt) r4.getValue()).A01 || cameraAREffect != null) {
            C347487wt r1 = (C347487wt) r4.getValue();
            boolean z2 = false;
            if (cameraAREffect != null) {
                z = cameraAREffect.CbC();
            } else {
                z = false;
            }
            r1.setBookmarkIconExpanded(z);
            C347487wt r3 = (C347487wt) r4.getValue();
            String str2 = null;
            if (cameraAREffect != null) {
                str = cameraAREffect.A0S;
                str2 = DbW.A0h(this.A06.getContext(), cameraAREffect.A0C, 2131953212);
            } else {
                str = null;
            }
            if (cameraAREffect != null) {
                z2 = cameraAREffect.CbC();
            }
            r3.setCurrentTitle(new C342507oi(str, str2, true, z2, ((C347487wt) r4.getValue()).A01, false, false));
            return;
        }
        ((C347487wt) r4.getValue()).A0F();
    }

    public final /* bridge */ /* synthetic */ void ADN(C74270Pry pry) {
        int i;
        C68291N9e n9e = (C68291N9e) pry;
        0qQ.A0B(n9e, 0);
        boolean z = this.A02.A03;
        boolean z2 = n9e.A03;
        if (z != z2) {
            AnonymousClass86D r1 = ((C357358Xo) this.A0B.getValue()).A02;
            if (r1.A0B != z2) {
                r1.A0B = z2;
                AnonymousClass86D.A01(r1);
            }
        }
        C68291N9e n9e2 = this.A02;
        boolean z3 = n9e2.A02;
        boolean z4 = n9e.A02;
        if (z3 != z4) {
            if (z4) {
                CameraAREffect cameraAREffect = n9e.A01;
                this.A07.setVisibility(0);
                AnonymousClass0eM r2 = this.A0C;
                boolean z5 = false;
                ((C347487wt) r2.getValue()).setHorizontalMargin(0);
                C347487wt r0 = (C347487wt) r2.getValue();
                if (cameraAREffect != null) {
                    z5 = cameraAREffect.CbC();
                }
                r0.setBookmarkIconExpanded(z5);
                ((C347487wt) r2.getValue()).A0E();
                A00(cameraAREffect);
                i = this.A03;
            } else {
                this.A07.setVisibility(8);
                i = this.A04;
            }
            this.A00 = i;
        } else {
            CameraAREffect cameraAREffect2 = n9e2.A01;
            CameraAREffect cameraAREffect3 = n9e.A01;
            if (!0qQ.A0K(cameraAREffect2, cameraAREffect3)) {
                A00(cameraAREffect3);
            }
        }
        float f = n9e.A00;
        float measuredHeight = 0.7f * ((float) this.A06.getMeasuredHeight());
        float min = Math.min(f, measuredHeight);
        ViewGroup viewGroup = this.A07;
        viewGroup.setAlpha(Math.min(f / measuredHeight, 1.0f));
        viewGroup.setTranslationY(-min);
        this.A02 = n9e;
    }

    public final void DBX() {
        CameraAREffect cameraAREffect = this.A02.A01;
        if (cameraAREffect != null) {
            C70520O9t o9t = this.A01;
            if (o9t == null) {
                0qQ.A0F("delegate");
                throw AnonymousClass00P.createAndThrow();
            } else if (cameraAREffect.A0D()) {
                String A0j = AnonymousClass7TG.A0j();
                C69101Neg neg = o9t.A00;
                UserSession userSession = neg.A07;
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
                C391589tK r20 = C391589tK.EFFECT_FOOTER;
                Bundle A002 = EffectsPageFragment.A00(r20, (AnonymousClass8ZN) null, effectsPageModel, (MusicAttributionConfig) null, (String) null, A0j, (String) null, (String) null, (String) null);
                Activity activity = neg.A03;
                String moduleName = neg.A06.getModuleName();
                C391589tK r5 = r20;
                HUG.A00(activity, A002, C279294yP.RTC, r5, 28D.A5J, C59725JVj.VIDEO_CHAT, userSession, AnonymousClass05K.A01, moduleName);
            }
        }
    }

    public final void Dgc() {
        CameraAREffect cameraAREffect = this.A02.A01;
        if (cameraAREffect != null) {
            AnonymousClass0eM r1 = this.A0C;
            if (r1.getValue() != null) {
                C70520O9t o9t = this.A01;
                if (o9t != null) {
                    boolean CbC = cameraAREffect.CbC();
                    C69101Neg neg = o9t.A00;
                    AnonymousClass7TE.A1Z(new C59673JTe(cameraAREffect, neg, (AnonymousClass4D7) null, 28, CbC), neg.A0D);
                    boolean CbC2 = cameraAREffect.CbC();
                    boolean z = ((C347487wt) r1.getValue()).A01;
                    C347487wt r12 = (C347487wt) r1.getValue();
                    boolean z2 = !CbC2;
                    if (z) {
                        r12.setBookmarkIconExpanded(z2);
                    } else {
                        r12.setBookmarkIcon(z2);
                    }
                } else {
                    0qQ.A0F("delegate");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
    }
}
