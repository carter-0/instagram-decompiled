package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import com.instagram.android.R;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;
import java.util.LinkedHashMap;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.2xq  reason: invalid class name and case insensitive filesystem */
public final class C234422xq implements C252243on, C234252xV, C234432xr, View.OnKeyListener {
    public static final C232822uV A0C = new C232822uV(C232812uU.SLIDE_OUT, 0, -1, true);
    public 1Xj A00;
    public C2364833x A01;
    public final Context A02;
    public final AudioManager A03;
    public final 0wj A04;
    public final AnonymousClass4DM A05;
    public final UserSession A06;
    public final AnonymousClass2xP A07;
    public final C234502xy A08;
    public final Map A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;

    public C234422xq(Context context, UserSession userSession, AnonymousClass4DU r13, AnonymousClass2xP r14) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r14, 4);
        Context context2 = context;
        this.A02 = context;
        this.A06 = userSession;
        this.A07 = r14;
        Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (systemService != null) {
            this.A03 = (AudioManager) systemService;
            this.A04 = 0wj.A01;
            this.A0A = AnonymousClass0eN.A01(C234442xs.A00);
            this.A0B = AnonymousClass0eN.A01(C234452xt.A00);
            this.A09 = new LinkedHashMap();
            this.A08 = C234472xv.A01(context2, userSession2, r13, new C234462xu(context, userSession), "FeedMusicController", false, true, true, true);
            this.A05 = new C234522y3(this);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final void EyU() {
    }

    public final void FHF(1Xj r5, AnonymousClass3W1 r6) {
        0qQ.A0B(r5, 0);
        AnonymousClass4P2 r0 = (AnonymousClass4P2) this.A09.get(r5);
        if (r0 == null) {
            0f9 AEf = this.A04.AEf("FeedMusicController", 817905066);
            AEf.ABQ("toggleAudio", "media was not in musicMediaMap");
            AEf.report();
            return;
        }
        int intValue = r0.A01.intValue();
        if (intValue == 0) {
            A04(r5, this);
        } else if (intValue == 1) {
            A05(r5, this);
        } else if (intValue == 2) {
            C59689JTv.A00(this.A02, AnonymousClass3ZJ.A05(this.A06, r5), "FeedMusicController song muted", 0);
        } else {
            throw new RuntimeException();
        }
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

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final 1Xj A00(C234422xq r6) {
        1Xj r4 = null;
        float f = 0.0f;
        for (Map.Entry entry : r6.A09.entrySet()) {
            1Xj r2 = (1Xj) entry.getKey();
            float f2 = ((AnonymousClass4P2) entry.getValue()).A00;
            if (f2 > r6.A07.A00 && f2 > f) {
                f = f2;
                r4 = r2;
            }
        }
        return r4;
    }

    public static final void A01(1Xj r2, AnonymousClass3W1 r3, C234422xq r4) {
        SlideInAndOutIconView slideInAndOutIconView;
        Map map = r4.A09;
        AnonymousClass4P2 r0 = (AnonymousClass4P2) map.get(r2);
        if (r0 == null || r0.A02) {
            AnonymousClass4P2 r1 = (AnonymousClass4P2) map.get(r2);
            if (r1 != null) {
                r1.A02 = false;
            }
            if (r3 != null && (slideInAndOutIconView = r3.A0v) != null) {
                slideInAndOutIconView.A01();
            }
        }
    }

    private final void A03(1Xj r9, AnonymousClass3W1 r10, Integer num, boolean z) {
        int i;
        Map map = this.A09;
        AnonymousClass4P2 r0 = (AnonymousClass4P2) map.get(r9);
        if (r0 == null || !r0.A02 || z) {
            AnonymousClass4P2 r02 = (AnonymousClass4P2) map.get(r9);
            if (r02 != null) {
                r02.A02 = true;
            }
            if (r10 != null) {
                int intValue = num.intValue();
                if (intValue != 0) {
                    i = R.drawable.instagram_volume_off_pano_filled_24;
                    if (intValue != 1) {
                        i = R.drawable.instagram_volume_none_pano_filled_24;
                    }
                } else {
                    i = R.drawable.instagram_volume_pano_filled_24;
                }
                C232822uV r3 = A0C;
                0qQ.A0B(r3, 1);
                SlideInAndOutIconView slideInAndOutIconView = r10.A0v;
                if (slideInAndOutIconView != null) {
                    Context context = slideInAndOutIconView.getContext();
                    int lineHeight = slideInAndOutIconView.A0C.getLineHeight() + (context.getResources().getDimensionPixelSize(R.dimen.media_tag_indicator_padding) * 2);
                    int lineHeight2 = (slideInAndOutIconView.A0C.getLineHeight() - context.getResources().getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size)) / 2;
                    slideInAndOutIconView.A03(context.getDrawable(i), lineHeight, lineHeight);
                    slideInAndOutIconView.A0B.setPadding(lineHeight2, lineHeight2, lineHeight2, lineHeight2);
                    slideInAndOutIconView.setIconColor(context.getColor(R.color.design_dark_default_color_on_background));
                    slideInAndOutIconView.setIconScale(0.5f);
                    r10.A0H((C266444Yx) null, r3, i);
                }
            }
        }
    }

    public static final void A04(1Xj r4, C234422xq r5) {
        AnonymousClass3W1 r2;
        Map map = r5.A09;
        AnonymousClass4P2 r1 = (AnonymousClass4P2) map.get(r4);
        if (r1 != null) {
            r1.A01 = AnonymousClass05K.A01;
        }
        1GE.A00(r5.A06).A00(false);
        AnonymousClass4P2 r0 = (AnonymousClass4P2) map.get(r4);
        if (r0 != null) {
            r2 = r0.A03;
        } else {
            r2 = null;
        }
        r5.A03(r4, r2, AnonymousClass05K.A01, true);
        if (r4.equals(r5.A00)) {
            C234502xy r12 = r5.A08;
            if (r12.isPlaying()) {
                r12.pause();
            }
        }
        C2364833x r13 = r5.A01;
        if (r13 != null) {
            r13.A02 = false;
            r13.A00 = null;
        }
    }

    public static final void A05(1Xj r18, C234422xq r19) {
        AnonymousClass3W1 r3;
        MusicDataSource musicDataSource;
        C234422xq r0 = r19;
        Map map = r0.A09;
        1Xj r1 = r18;
        AnonymousClass4P2 r32 = (AnonymousClass4P2) map.get(r1);
        if (r32 != null) {
            r32.A01 = AnonymousClass05K.A00;
        }
        UserSession userSession = r0.A06;
        1GE.A00(userSession).A00(true);
        AnonymousClass4P2 r2 = (AnonymousClass4P2) map.get(r1);
        if (r2 != null) {
            r3 = r2.A03;
        } else {
            r3 = null;
        }
        r0.A03(r1, r3, AnonymousClass05K.A00, true);
        if (!r1.equals(r0.A00) || !r0.A08.isPlaying()) {
            C234502xy r5 = r0.A08;
            if (r5.isPlaying()) {
                r5.EHu(false);
            }
            if (!r1.equals(r0.A00)) {
                C2605946h A1O = r1.A1O();
                OriginalSoundDataIntf A1J = r1.A1J();
                if (A1O != null) {
                    musicDataSource = A1O.BUq();
                } else if (A1J == null || !AnonymousClass30D.A0G(userSession)) {
                    0f9 AEf = r0.A04.AEf("FeedMusicController", 817905066);
                    AEf.ABQ("play", "musicDataSource was null for media");
                    AEf.report();
                    return;
                } else {
                    musicDataSource = new MusicDataSource((Uri) null, AudioType.ORIGINAL_AUDIO, A1J.getProgressiveDownloadUrl(), A1J.getDashManifest(), A1J.getAudioAssetId(), A1J.BEv().getId());
                }
                r5.ETw(musicDataSource, new C65503LuR(), (String) null, 0, r1.CEL().A01, r1.CEL().A00, true, false);
                r0.A00 = r1;
            }
            r5.E2p();
            C2364833x r22 = r0.A01;
            if (r22 != null) {
                r22.A02 = true;
                r22.A00 = r1;
                if (!r1.equals(r22.A01)) {
                    for (C234252xV EyU : r22.A07) {
                        EyU.EyU();
                    }
                }
            }
        }
    }

    public static final void A06(C234422xq r3) {
        AnonymousClass3W1 r0;
        Map map = r3.A09;
        AnonymousClass4P2 r1 = (AnonymousClass4P2) map.get(r3.A00);
        if (r1 != null) {
            r1.A01 = AnonymousClass05K.A01;
        }
        1Xj r12 = r3.A00;
        if (r12 != null) {
            AnonymousClass4P2 r02 = (AnonymousClass4P2) map.get(r12);
            if (r02 != null) {
                r0 = r02.A03;
            } else {
                r0 = null;
            }
            A01(r12, r0, r3);
        }
        C2364833x r13 = r3.A01;
        if (r13 != null) {
            r13.A02 = false;
            r13.A00 = null;
        }
        r3.A08.EHu(false);
        r3.A00 = null;
    }

    public static final boolean A07(C234422xq r3, float f) {
        C2364833x r2;
        if (r3.A08.isPlaying() || (((r2 = r3.A01) != null && (r2.A05 || (r2.A03 && r2.A04))) || f <= r3.A07.A00)) {
            return false;
        }
        return true;
    }

    public final void onDestroyView() {
        C234502xy r2 = this.A08;
        r2.release();
        r2.EHu(false);
        this.A00 = null;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if ((i != 25 && i != 24) || A00(this) == null) {
            return false;
        }
        ((Handler) this.A0A.getValue()).post(new C57849IhS(this, i));
        return true;
    }

    public final void onPause() {
        this.A08.EHu(false);
        this.A00 = null;
    }

    public static final void A02(1Xj r2, AnonymousClass3W1 r3, C234422xq r4, float f) {
        Integer num;
        Boolean bool;
        if (A07(r4, f)) {
            UserSession userSession = r4.A06;
            if (AnonymousClass3ZJ.A0D(userSession, r2) || (bool = 1GE.A00(userSession).A01) == null || !bool.booleanValue()) {
                if (AnonymousClass3ZJ.A0D(userSession, r2)) {
                    num = AnonymousClass05K.A0C;
                } else if (!r2.equals(r4.A00) || !r4.A08.isPlaying()) {
                    num = AnonymousClass05K.A01;
                } else {
                    num = AnonymousClass05K.A00;
                }
                r4.A03(r2, r3, num, false);
                return;
            }
            A05(r2, r4);
        }
    }

    public final void EyF() {
        A06(this);
    }
}
