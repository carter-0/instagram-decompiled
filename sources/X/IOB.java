package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioType;
import instagram.features.clips.audio.ui.SegmentsMusicPlayerView;

public final class IOB implements C252243on, C289875eN, C66560MWo {
    public SegmentsMusicPlayerView A00;
    public boolean A01;
    public C234462xu A02;
    public 0xa A03;
    public final AnonymousClass4DH A04;
    public final long A05;
    public final C54191H2l A06;
    public final C320506sU A07;
    public final UserSession A08;
    public final AnonymousClass4DU A09;
    public final C53044Ghc A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final boolean A0E;

    public IOB(AnonymousClass4DH r2, C54191H2l h2l, C320506sU r4, UserSession userSession, AnonymousClass4DU r6, C53044Ghc ghc, String str, String str2, String str3, long j, boolean z) {
        0qQ.A0B(userSession, 3);
        this.A0A = ghc;
        this.A04 = r2;
        this.A08 = userSession;
        this.A09 = r6;
        this.A05 = j;
        this.A0C = str;
        this.A0B = str2;
        this.A0D = str3;
        this.A0E = z;
        this.A07 = r4;
        this.A06 = h2l;
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final void DSv() {
        C2606046i r2;
        AudioType audioType;
        OriginalAudioSubtype Ads;
        this.A01 = true;
        C54191H2l.A01(this.A06, "play_pause");
        GVW A002 = C53044Ghc.A00(this.A0A);
        String str = null;
        if (A002 != null) {
            r2 = A002.A03;
        } else {
            r2 = null;
        }
        AnonymousClass4DH r4 = this.A04;
        UserSession userSession = this.A08;
        Long valueOf = Long.valueOf(this.A05);
        String str2 = this.A0D;
        String str3 = this.A0B;
        if (r2 != null) {
            audioType = r2.Adv();
        } else {
            audioType = null;
        }
        HOL A003 = C55059HbU.A00(audioType);
        if (!(r2 == null || (Ads = r2.Ads()) == null)) {
            str = C55060HbV.A00(Ads);
        }
        C52086GEg.A0G(A003, (AnonymousClass8ZN) null, this.A07, r4, userSession, valueOf, str2, str3, str, (String) null);
    }

    public final void DSy() {
        C2606046i r2;
        AudioType audioType;
        OriginalAudioSubtype Ads;
        this.A01 = false;
        C54191H2l.A01(this.A06, "play_pause");
        GVW A002 = C53044Ghc.A00(this.A0A);
        String str = null;
        if (A002 != null) {
            r2 = A002.A03;
        } else {
            r2 = null;
        }
        UserSession userSession = this.A08;
        Long valueOf = Long.valueOf(this.A05);
        String str2 = this.A0C;
        String str3 = this.A0B;
        String str4 = this.A0D;
        AnonymousClass4DH r4 = this.A04;
        if (r2 != null) {
            audioType = r2.Adv();
        } else {
            audioType = null;
        }
        HOL A003 = C55059HbU.A00(audioType);
        if (!(r2 == null || (Ads = r2.Ads()) == null)) {
            str = C55060HbV.A00(Ads);
        }
        C52086GEg.A0H(A003, (AnonymousClass8ZN) null, this.A07, r4, userSession, valueOf, str2, str3, str4, str, (String) null);
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        Context requireContext = this.A04.requireContext();
        UserSession userSession = this.A08;
        this.A02 = new C234462xu(requireContext, userSession);
        View A0F = DbY.A0F(view, R.id.segments_music_player);
        0qQ.A0C(A0F, "null cannot be cast to non-null type instagram.features.clips.audio.ui.SegmentsMusicPlayerView");
        SegmentsMusicPlayerView segmentsMusicPlayerView = (SegmentsMusicPlayerView) A0F;
        this.A00 = segmentsMusicPlayerView;
        if (segmentsMusicPlayerView == null) {
            str = "musicPlayerView";
        } else {
            AnonymousClass4DU r7 = this.A09;
            C234462xu r8 = this.A02;
            if (r8 == null) {
                str = "musicAudioFocusController";
            } else {
                segmentsMusicPlayerView.A05 = 182.A06(0Tu.A05, userSession, 36327456159840714L);
                segmentsMusicPlayerView.A02 = C234472xv.A00(AnonymousClass7TE.A0S(segmentsMusicPlayerView), userSession, r7, r8, "SegmentsMusicPlayerView", C234472xv.A02(userSession));
                segmentsMusicPlayerView.A01 = 60000;
                segmentsMusicPlayerView.A03 = this;
                this.A03 = 1Al.A01(userSession).A03(1An.A0I);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final void A00(IOB iob) {
        if (!iob.A0E && !iob.A01 && iob.A04.mLifecycleRegistry.A07().compareTo(07U.A04) >= 0) {
            SegmentsMusicPlayerView segmentsMusicPlayerView = iob.A00;
            if (segmentsMusicPlayerView == null) {
                0qQ.A0F("musicPlayerView");
                throw AnonymousClass00P.createAndThrow();
            } else {
                segmentsMusicPlayerView.A0D();
            }
        }
    }

    public final void DWX() {
        String str;
        SegmentsMusicPlayerView segmentsMusicPlayerView = this.A00;
        if (segmentsMusicPlayerView == null) {
            str = "musicPlayerView";
        } else {
            C234502xy r0 = segmentsMusicPlayerView.A02;
            str = "musicPlayer";
            if (r0 != null) {
                if (r0.isPlaying()) {
                    C234502xy r02 = segmentsMusicPlayerView.A02;
                    if (r02 != null) {
                        r02.pause();
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroyView() {
        String str;
        SegmentsMusicPlayerView segmentsMusicPlayerView = this.A00;
        if (segmentsMusicPlayerView == null) {
            str = "musicPlayerView";
        } else {
            C234502xy r0 = segmentsMusicPlayerView.A02;
            if (r0 == null) {
                str = "musicPlayer";
            } else {
                r0.release();
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onPause() {
        String str;
        SegmentsMusicPlayerView segmentsMusicPlayerView = this.A00;
        if (segmentsMusicPlayerView == null) {
            str = "musicPlayerView";
        } else {
            C234502xy r1 = segmentsMusicPlayerView.A02;
            if (r1 == null) {
                str = "musicPlayer";
            } else {
                r1.EHu(false);
                C234462xu r0 = this.A02;
                if (r0 == null) {
                    str = "musicAudioFocusController";
                } else {
                    r0.A00();
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DWZ() {
        A00(this);
    }
}
