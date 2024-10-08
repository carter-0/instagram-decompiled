package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.89q  reason: invalid class name and case insensitive filesystem */
public final class C3516389q implements AnonymousClass2gO {
    public final /* synthetic */ C3515789k A00;

    public C3516389q(C3515789k r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C273494mf k6m;
        String str;
        Fragment k6r;
        C331157Pu r1;
        C331127Pr A01;
        C66569MWx mWx;
        int i;
        C3515789k r6 = this.A00;
        Object obj2 = obj;
        0qQ.A0A(obj2);
        if (obj2 instanceof C61809KMy) {
            C3515189e r0 = r6.A00;
            if (r0 != null) {
                ClipsAudioMixingDrawerController clipsAudioMixingDrawerController = r0.A01;
                clipsAudioMixingDrawerController.A09 = true;
                27r.A08(C59725JVj.POST_CAPTURE, 27p.A01(clipsAudioMixingDrawerController.A0F), "AUDIO_CONTROLS_ADD_VOICEOVER", ClipsAudioMixingDrawerController.A02(clipsAudioMixingDrawerController));
            }
        } else if (obj2 instanceof C61810KMz) {
            C3515189e r02 = r6.A00;
            if (r02 != null) {
                r02.A01.A0A = true;
            }
        } else {
            if (obj2 instanceof C388419nn) {
                k6m = new K6O();
                Bundle bundle = new Bundle();
                bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r6.A0D.A05);
                if (0qQ.A0K(obj2, C388409nm.A00)) {
                    i = 2131953283;
                } else {
                    boolean A0K = 0qQ.A0K(obj2, C388399nl.A00);
                    i = 2131953285;
                    if (A0K) {
                        i = 2131953282;
                    }
                }
                bundle.putInt(AnonymousClass000.A00(2632), i);
                k6m.setArguments(bundle);
            } else if (obj2 instanceof C388429no) {
                AudioOverlayTrack audioOverlayTrack = r6.A03;
                if (audioOverlayTrack == null) {
                    0kD.A05("ClipsMusicSelectionController", "selectedTrack not initialized in handleControlBarEvent()", (Throwable) null);
                    return;
                }
                ClipsCreationViewModel clipsCreationViewModel = r6.A0K;
                C3515489h r12 = r6.A0H;
                MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
                if (musicAssetModel != null) {
                    mWx = JVW.A00(musicAssetModel);
                } else {
                    mWx = null;
                }
                r12.DT7(mWx);
                C349337zz r2 = (C349337zz) clipsCreationViewModel.A0Z.getValue();
                if (r2 != null) {
                    r2.BV4();
                    AudioOverlayTrack audioOverlayTrack2 = r6.A03;
                    if (audioOverlayTrack2 != null) {
                        MusicAssetModel musicAssetModel2 = audioOverlayTrack2.A08;
                        int BzW = r2.BzW();
                        AnonymousClass6KJ BV4 = r2.BV4();
                        AudioOverlayTrack audioOverlayTrack3 = r6.A03;
                        if (audioOverlayTrack3 != null) {
                            int i2 = audioOverlayTrack3.A03;
                            r6.A02 = null;
                            r6.A07 = null;
                            C3515789k.A07(r6, (AnonymousClass8IJ) null, musicAssetModel2, BV4, Integer.valueOf(BzW), (String) null, 1.0f, i2, true, true, false, false);
                            return;
                        }
                    }
                } else {
                    AudioOverlayTrack audioOverlayTrack4 = r6.A03;
                    if (audioOverlayTrack4 != null) {
                        C3515789k.A08(r6, audioOverlayTrack4, true, false, false);
                        return;
                    }
                }
                0qQ.A0F("selectedTrack");
                throw AnonymousClass00P.createAndThrow();
            } else if (obj2 instanceof C61808KMx) {
                C3499982t r03 = r6.A0K.A0L.A01;
                if (r03 != null) {
                    str = r03.BUn();
                } else {
                    str = null;
                }
                UserSession userSession = r6.A0D;
                k6r = new K6R();
                Bundle bundle2 = new Bundle();
                bundle2.putString(AnonymousClass000.A00(2623), str);
                bundle2.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
                k6r.setArguments(bundle2);
                r1 = r6.A01;
                if (r1 != null) {
                    A01 = C3515789k.A01(r6, k6r);
                    r1.A0F(k6r, A01);
                    return;
                }
                return;
            } else if (obj2 instanceof C61807KMw) {
                UserSession userSession2 = r6.A0D;
                27r A012 = 27p.A01(userSession2);
                A012.A1Q(A012.A04.A0C, "AUDIO_ENHANCE_ENTER");
                k6m = new K6M();
                Bundle bundle3 = new Bundle();
                bundle3.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession2.A05);
                k6m.setArguments(bundle3);
            } else {
                throw new RuntimeException();
            }
            r1 = r6.A01;
            if (r1 != null) {
                A01 = C3515789k.A01(r6, k6m);
                k6r = (Fragment) k6m;
                r1.A0F(k6r, A01);
                return;
            }
            return;
        }
        C331157Pu r04 = r6.A01;
        if (r04 != null) {
            r04.A07();
        }
    }
}
