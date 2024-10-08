package X;

import android.content.Context;
import android.media.AudioManager;
import com.instagram.common.session.UserSession;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Uu3  reason: case insensitive filesystem */
public final class C16386Uu3 extends AnonymousClass2uL implements AudioManager.OnAudioFocusChangeListener {
    public C305866Jw A00;
    public OI0 A01;
    public AnonymousClass4M3 A02;
    public boolean A03 = false;
    public boolean A04 = false;
    public final Context A05;
    public final 1vq A06;
    public final UserSession A07;
    public final AnonymousClass4DU A08;
    public final C252323ov A09;

    public final void A00(boolean z) {
        String str;
        C245983dn.A02((String) null);
        AnonymousClass4M3 r0 = this.A02;
        if (r0 != null && r0.getCurrentPositionMs() < r0.AzN()) {
            AnonymousClass4M3 r2 = this.A02;
            AnonymousClass3OB r1 = ((AnonymousClass4M1) r2).A0M;
            if (r1 != AnonymousClass3OB.PAUSED && r1 != AnonymousClass3OB.IDLE && r1 != AnonymousClass3OB.PREPARED) {
                if (z) {
                    str = "user_paused_video";
                } else {
                    str = "fragment_paused";
                }
                this.A04 = z;
                r2.E21(str);
                C305866Jw r12 = this.A00;
                if (r12 != null) {
                    r12.A01("paused");
                }
                this.A06.A03(this);
            }
        }
    }

    public final void A01(boolean z) {
        OI0 oi0;
        AnonymousClass3OB r4;
        C245983dn.A02((String) null);
        AnonymousClass4M3 r2 = this.A02;
        if (r2 != null && (oi0 = this.A01) != null && (r4 = ((AnonymousClass4M1) r2).A0M) != AnonymousClass3OB.PREPARING) {
            if (r4 == AnonymousClass3OB.PLAYING) {
                if (!oi0.A02 && r2.getCurrentPositionMs() >= r2.AzN()) {
                    AnonymousClass4M3 r1 = this.A02;
                    if (!(r1 == null || this.A01 == null)) {
                        this.A02.EKy(0mi.A03(0, 0, r1.AzN()), true);
                    }
                    this.A03 = false;
                } else {
                    return;
                }
            }
            if (!z) {
                if (r4 == AnonymousClass3OB.PREPARED) {
                    return;
                }
                if (r4 == AnonymousClass3OB.PAUSED && this.A04) {
                    return;
                }
            }
            this.A02.E2q("resume", false);
            C305866Jw r12 = this.A00;
            if (r12 != null) {
                r12.A01("playing");
            }
            this.A06.A04(this);
        }
    }

    public final void onAudioFocusChange(int i) {
        float f;
        if (i != -3) {
            if (i != -2) {
                if (i == -1) {
                    this.A06.A03(this);
                } else if (i == 1 || i == 2 || i == 3 || i == 4) {
                    f = 1.0f;
                } else {
                    return;
                }
            }
            f = 0.0f;
        } else {
            f = 0.5f;
        }
        AnonymousClass4M3 r0 = this.A02;
        if (r0 != null) {
            r0.Eqr(f, 0);
        }
    }

    public final void onStopVideo(String str, boolean z) {
        this.A01 = null;
        this.A00 = null;
    }

    public final void onCompletion() {
        C305866Jw r1;
        OI0 oi0 = this.A01;
        if (oi0 != null && !oi0.A02 && (r1 = this.A00) != null) {
            r1.A01("playback_complete");
        }
    }

    public final void onCues(List list) {
        C256003v4 r1;
        C305866Jw r0 = this.A00;
        if (r0 != null && (r1 = r0.A00) != null) {
            C263164Jj.A02(r1, list, true);
        }
    }

    public final void onPrepare(C263754Nf r3) {
        C305866Jw r1 = this.A00;
        if (r1 != null) {
            r1.A01("attempt_to_play");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        r3 = r4.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onProgressUpdate(int r6, int r7, boolean r8) {
        /*
            r5 = this;
            X.4M3 r3 = r5.A02
            if (r3 == 0) goto L_0x0046
            X.OI0 r1 = r5.A01
            if (r1 == 0) goto L_0x0046
            boolean r0 = r5.A03
            if (r0 != 0) goto L_0x0020
            boolean r0 = r1.A02
            r2 = 1
            if (r0 == 0) goto L_0x0020
            int r1 = r3.getCurrentPositionMs()
            int r0 = r3.AzN()
            if (r1 < r0) goto L_0x0020
            r5.onCompletion()
            r5.A03 = r2
        L_0x0020:
            X.6Jw r4 = r5.A00
            if (r4 == 0) goto L_0x0046
            boolean r0 = r5.A03
            if (r0 != 0) goto L_0x0046
            X.4tV r3 = r4.A04
            r0 = 54
            X.4uI r2 = r3.A0A(r0)
            if (r2 == 0) goto L_0x0046
            X.6Tl r1 = new X.6Tl
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r1.A01(r0)
            X.6Rm r0 = r4.A03
            r1.A02(r0)
            X.DbT.A1R(r0, r3, r1, r2)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16386Uu3.onProgressUpdate(int, int, boolean):void");
    }

    public final void onSeeking(long j) {
        C305866Jw r1 = this.A00;
        if (r1 != null) {
            r1.A01("seeking");
        }
    }

    public final void onVideoPlayerError(C263754Nf r3, String str) {
        C305866Jw r1 = this.A00;
        if (r1 != null) {
            r1.A01("error");
        }
    }

    public final void onVideoPrepared(C263754Nf r3, boolean z) {
        C305866Jw r1 = this.A00;
        if (r1 != null) {
            r1.A01("prepared");
        }
    }

    public final void onVideoStartedPlaying(C263754Nf r3) {
        C305866Jw r1 = this.A00;
        if (r1 != null) {
            r1.A01("playing");
        }
    }

    public C16386Uu3(Context context, UserSession userSession, AnonymousClass4DU r5) {
        this.A07 = userSession;
        this.A05 = context;
        this.A08 = r5;
        this.A09 = new C69219NhZ(userSession, r5);
        this.A06 = new 1vq((AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND), userSession);
    }
}
