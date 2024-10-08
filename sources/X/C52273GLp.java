package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.ar.features.effectspage.models.EffectsPageModel;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.clips.model.metadata.AudioPageMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.modal.ModalActivity;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.sponsored.analytics.SourceModelInfoParams;
import instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment;

/* renamed from: X.GLp  reason: case insensitive filesystem */
public abstract class C52273GLp {
    public static final void A05(FragmentActivity fragmentActivity, UserSession userSession, Venue venue) {
        String A05 = venue.A05();
        Venue venue2 = new Venue();
        venue2.A06(A05);
        C16923VBa.A00(fragmentActivity, (C267664bz) null, (AnonymousClass0iw) null, userSession, venue2, (String) null, "", (double[]) null, false);
    }

    public static final boolean A07(ClipsViewerSource clipsViewerSource, boolean z) {
        int A02 = DbU.A02(clipsViewerSource, 0);
        if (A02 == 15 || A02 == 17 || A02 == 18 || A02 == 20) {
            return z;
        }
        if (A02 != 87) {
            return true;
        }
        return false;
    }

    public static final void A00(FragmentActivity fragmentActivity, AnonymousClass8ZN r22, C267324bN r23, UserSession userSession, 1Xj r25, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        String str7;
        ImageUrl imageUrl;
        String str8;
        C2606046i r12;
        AudioPageMetadata A01;
        AnonymousClass8ZN r2 = r22;
        boolean A1Y = DbW.A1Y(r25);
        String A08 = I7J.A08(r23);
        String A07 = I7J.A07(r23);
        Boolean A06 = I7J.A06(r23);
        if (A08 != null) {
            str7 = I7J.A09(r23);
            imageUrl = I7J.A01(r23);
        } else {
            str7 = null;
            imageUrl = null;
        }
        C67231sQ A0n = C51966G9m.A0n(r25);
        if (A0n != null) {
            str8 = A0n.getMusicCanonicalId();
        } else {
            str8 = null;
        }
        C67231sQ A0n2 = C51966G9m.A0n(r25);
        if (A0n2 == null || (r12 = C291335gz.A01(A0n2)) == null) {
            r12 = r25.A1O();
        }
        OriginalSoundDataIntf A1J = r25.A1J();
        AudioFilterType A012 = C263304Kd.A01(C51966G9m.A0n(r25));
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (r12 != null) {
            A01 = LT9.A00(fragmentActivity2, A012, r12, r25.getId(), str, str2, str3, str4, str5, (String) null, str8, z, A1Y);
        } else if (A1J != null) {
            A01 = LT9.A01(A012, A1J, false);
        } else {
            return;
        }
        Class<ModalActivity> cls = ModalActivity.class;
        if (r2 == null) {
            r2 = AnonymousClass8ZN.CLIPS_VIEWER_ATTRIBUTION_LINE;
        }
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putParcelable("args_audio_model", A01);
        A0a.putString(AnonymousClass000.A00(510), str6);
        if (A08 != null) {
            A0a.putString("args_preloaded_effect_id", A08);
        }
        if (A07 != null) {
            A0a.putString("args_preloaded_effect_attribution_user_id", A07);
        }
        if (A06 != null) {
            A0a.putBoolean("args_preloaded_effect_supported", A06.booleanValue());
        }
        if (str7 != null) {
            A0a.putString("args_preloaded_effect_name", str7);
        }
        if (imageUrl != null) {
            A0a.putParcelable("args_preloaded_effect_thumbnail_url", imageUrl);
        }
        A0a.putSerializable(C273654mx.A00(234), r2);
        DbU.A0w(fragmentActivity2, A0a, userSession, cls, "audio_page");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002a, code lost:
        if (X.DDx.A04(r2) != false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(androidx.fragment.app.FragmentActivity r25, X.AnonymousClass8ZN r26, X.AnonymousClass0iw r27, com.instagram.common.session.UserSession r28, com.instagram.feed.media.EffectPreviewIntf r29, X.1Xj r30, com.instagram.music.common.config.MusicAttributionConfig r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, boolean r36) {
        /*
            r24 = 0
            r21 = 1
            r0 = 4
            r2 = r29
            X.0qQ.A0B(r2, r0)
            java.lang.String r9 = X.DDx.A02(r2)
            java.lang.String r10 = X.DDx.A03(r2)
            com.instagram.common.typedurl.ImageUrl r4 = X.DDx.A00(r2)
            java.lang.String r11 = r2.getId()
            java.lang.String r14 = r2.getName()
            boolean r17 = X.DDx.A05(r2)
            if (r36 == 0) goto L_0x002c
            boolean r0 = X.DDx.A04(r2)
            r18 = 1
            if (r0 == 0) goto L_0x002e
        L_0x002c:
            r18 = 0
        L_0x002e:
            r3 = 0
            java.lang.String r1 = r2.getSaveStatus()
            java.lang.String r0 = "SAVED"
            boolean r19 = r0.equals(r1)
            java.lang.String r1 = r2.getSaveStatus()
            java.lang.String r0 = "NOT_SUPPORTED"
            boolean r0 = r0.equals(r1)
            r20 = r0 ^ 1
            java.lang.String r13 = ""
            com.instagram.ar.features.effectspage.models.EffectsPageModel r2 = new com.instagram.ar.features.effectspage.models.EffectsPageModel
            r5 = r3
            r6 = r3
            r7 = r3
            r8 = r3
            r12 = r3
            r15 = r13
            r16 = r3
            r22 = r21
            r23 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.String r8 = r30.getId()
            X.9tK r4 = X.C391589tK.REELS_ATTRIBUTION
            r5 = r26
            r7 = r31
            r9 = r32
            r10 = r33
            r11 = r34
            r12 = r35
            r6 = r2
            android.os.Bundle r2 = instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r9 = r27.getModuleName()
            X.JVj r6 = X.C59725JVj.NO_CAMERA_SESSION
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            r1 = r25
            r5 = r3
            r7 = r28
            X.HUG.A00(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52273GLp.A01(androidx.fragment.app.FragmentActivity, X.8ZN, X.0iw, com.instagram.common.session.UserSession, com.instagram.feed.media.EffectPreviewIntf, X.1Xj, com.instagram.music.common.config.MusicAttributionConfig, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public static final void A02(FragmentActivity fragmentActivity, AnonymousClass0iw r37, UserSession userSession, GNW gnw, 1Xj r40, MusicAttributionConfig musicAttributionConfig) {
        GNW gnw2 = gnw;
        0qQ.A0B(gnw2, 5);
        String id = r40.getId();
        C391589tK r23 = C391589tK.REELS_ATTRIBUTION;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        Context applicationContext = fragmentActivity2.getApplicationContext();
        0qQ.A0B(applicationContext, 5);
        String str = "";
        String str2 = "";
        C391589tK r35 = r23;
        HUG.A00(fragmentActivity2, EffectsPageFragment.A00(r23, (AnonymousClass8ZN) null, new EffectsPageModel((EffectAttribution) null, (ImageUrl) null, Integer.valueOf(gnw2.A00), Integer.valueOf(gnw2.A02), 2131956923, (Integer) null, "", str, (String) null, gnw2.A03, str2, AnonymousClass7TE.A16(applicationContext, gnw2.A01), (String) null, gnw2.A04, false, true, false, true, false, false, false, false), musicAttributionConfig, id, "-1", (String) null, (String) null, (String) null), (C279294yP) null, r35, (28D) null, C59725JVj.NO_CAMERA_SESSION, userSession, AnonymousClass05K.A01, r37.getModuleName());
    }

    public static final void A03(FragmentActivity fragmentActivity, AnonymousClass0iw r4, UserSession userSession, String str, String str2, String str3, int[] iArr) {
        boolean A1Y = C51970G9q.A1Y(userSession);
        C46474Dfc A01 = C46548Dgp.A01(userSession, str, str2, r4.getModuleName());
        if (str3 != null) {
            A01.A04 = new SourceModelInfoParams(str3, A1Y ? 1 : 0, A1Y);
        }
        AnonymousClass6W8 A0b = DbS.A0b(fragmentActivity, C51973G9u.A0A(userSession, A01), userSession, ModalActivity.class, "profile");
        A0b.A02 = r4;
        if (iArr != null) {
            A0b.A0J = iArr;
        }
        A0b.A0C(fragmentActivity);
    }

    public static final void A04(FragmentActivity fragmentActivity, UserSession userSession, ImageUrl imageUrl, ImageUrl imageUrl2, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        AnonymousClass7TG.A1U(userSession, str, str2);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("attribution_app_id", str);
        A0a.putString(AnonymousClass000.A00(2660), str2);
        A0a.putString(AnonymousClass000.A00(273), str3);
        A0a.putParcelable(AnonymousClass000.A00(2995), imageUrl);
        A0a.putString(AnonymousClass000.A00(1720), str4);
        A0a.putBoolean("profile_verified", z);
        A0a.putParcelable(AnonymousClass000.A00(40), imageUrl2);
        A0a.putString("profile_id", str5);
        A0a.putString("media_count", str6);
        A0a.putString("media_id", str7);
        DbU.A0w(fragmentActivity, A0a, userSession, ModalActivity.class, C273654mx.A00(3418));
    }

    public static final void A06(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        AnonymousClass7TG.A1T(fragmentActivity, userSession, str);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("arg_media_id", str);
        DbU.A0w(fragmentActivity, A0a, userSession, ModalActivity.class, "template_pivot_page");
    }
}
