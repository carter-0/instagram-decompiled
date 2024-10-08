package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicBrowseCategory;

/* renamed from: X.LuW  reason: case insensitive filesystem */
public final class C65508LuW implements C3515989m {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ K6I A02;
    public final /* synthetic */ boolean A03;

    public final void DSm(C66569MWx mWx, MusicBrowseCategory musicBrowseCategory, String str, String str2) {
        Bundle bundle;
        int i;
        String str3;
        String id;
        AudioOverlayTrack A002 = C63347KvU.A00(mWx, 30000);
        1Xj r0 = C64080LLy.A01;
        if (r0 == null || (id = r0.getId()) == null) {
            bundle = null;
        } else {
            bundle = JTU.A07(A002, id, false);
        }
        boolean z = this.A03;
        UserSession userSession = this.A01;
        WGU A003 = WGU.A00(userSession);
        if (z) {
            A003.A0R(C16678UzE.AUDIO_SELECTION_MUSIC_BROWSER.toString(), "track_selected");
        } else {
            A003.A0R(C16678UzE.AUDIO_SWAP_MUSIC_BROWSER.toString(), "track_selected");
            WGU.A00(userSession).A0Q(C16678UzE.AUDIO_SWAP_MUSIC_PREVIEW.toString());
        }
        Activity activity = this.A00;
        K6I k6i = this.A02;
        if (bundle == null) {
            bundle = AnonymousClass7TE.A0a();
        }
        if (z) {
            i = 1018;
            str3 = C273654mx.A00(696);
        } else {
            i = 1017;
            str3 = "clips_edit_music_editor";
        }
        DbV.A0Y(activity, bundle, userSession, ModalActivity.class, str3).A0D(k6i, i);
    }

    public C65508LuW(Activity activity, UserSession userSession, K6I k6i, boolean z) {
        this.A03 = z;
        this.A01 = userSession;
        this.A00 = activity;
        this.A02 = k6i;
    }

    public final void CI8(int i, int i2, Intent intent) {
        AudioOverlayTrack audioOverlayTrack;
        L3O l3o;
        C16678UzE uzE;
        if (i == 1017 || i == 1018) {
            UserSession userSession = this.A01;
            Activity activity = this.A00;
            if (intent != null) {
                audioOverlayTrack = (AudioOverlayTrack) intent.getParcelableExtra("extra_audio_track");
            } else {
                audioOverlayTrack = null;
            }
            boolean A1S = AnonymousClass7TF.A1S(i, 1018);
            String str = C64080LLy.A04;
            if (audioOverlayTrack == null || str == null) {
                1Xj r6 = C64080LLy.A01;
                if (r6 != null) {
                    C64080LLy.A01(activity, C64080LLy.A00, userSession, r6, str, A1S);
                    return;
                }
                return;
            }
            String A002 = C64080LLy.A00(audioOverlayTrack, str);
            if (A002 != null) {
                WGU A003 = WGU.A00(userSession);
                if (A1S) {
                    uzE = C16678UzE.AUDIO_SELECTION_MUSIC_PREVIEW;
                } else {
                    uzE = C16678UzE.AUDIO_SWAP_MUSIC_PREVIEW;
                }
                A003.A0R(uzE.toString(), "proceed_to_boost");
                C64080LLy.A03 = A002;
                L3O l3o2 = C64080LLy.A00;
                if (l3o2 != null) {
                    1Yh r2 = l3o2.A00;
                    C17945Via via = l3o2.A01;
                    via.A0A = A002;
                    via.A04 = audioOverlayTrack;
                    1Yh.A03(r2, new C17744VdD(via));
                }
            }
            DbW.A1K(C64080LLy.A02);
            C64080LLy.A02 = null;
            if (C64080LLy.A03 == null && (l3o = C64080LLy.A00) != null) {
                1Yh.A01(l3o.A00);
            }
        }
    }

    public final void DSk() {
        L3O l3o;
        DbW.A1K(C64080LLy.A02);
        C64080LLy.A02 = null;
        if (C64080LLy.A03 == null && (l3o = C64080LLy.A00) != null) {
            1Yh.A01(l3o.A00);
        }
    }
}
