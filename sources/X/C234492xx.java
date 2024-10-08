package X;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicDataSource;
import java.io.IOException;
import java.util.List;

/* renamed from: X.2xx  reason: invalid class name and case insensitive filesystem */
public final class C234492xx implements C234502xy, C232732uM {
    public float A00;
    public int A01;
    public C357838Zw A02;
    public MusicDataSource A03;
    public C315536k3 A04;
    public AnonymousClass4M3 A05;
    public boolean A06;
    public int A07;
    public C252323ov A08;
    public boolean A09;
    public boolean A0A;
    public final Handler A0B;
    public final UserSession A0C;
    public final AnonymousClass4DU A0D;
    public final Context A0E;
    public final AudioManager.OnAudioFocusChangeListener A0F;
    public final C234462xu A0G;
    public final C234482xw A0H;
    public final Runnable A0I;
    public final AnonymousClass0eK A0J;
    public final boolean A0K;
    public final boolean A0L;

    public static final void A01(C234492xx r12) {
        AnonymousClass4M3 r0;
        C234482xw r1 = r12.A0H;
        if (r12.A06 && ((r0 = r12.A05) == null || !r0.isPlaying())) {
            r1.A01.A0D(C273654mx.A00(3118), r1.A00, (String) null, (String) null, (String) null, (String) null);
        }
        AnonymousClass4M3 r13 = r12.A05;
        if (r13 != null) {
            r12.A0A = false;
            if (r12.A09) {
                r13.E21(C66579MXk.A00(1186));
            }
            r12.A02(true);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A02(boolean z) {
        C234462xu r0;
        this.A06 = false;
        this.A0B.removeCallbacks(this.A0I);
        if (z && (r0 = this.A0G) != null) {
            r0.A00();
        }
        this.A0H.A00();
        C315536k3 r02 = this.A04;
        if (r02 != null) {
            r02.onCurrentTrackStopped();
        }
    }

    public final void AHY() {
        this.A03 = null;
    }

    public final void ETw(MusicDataSource musicDataSource, C315536k3 r20, String str, int i, int i2, int i3, boolean z, boolean z2) {
        String str2;
        String str3;
        MusicDataSource musicDataSource2 = musicDataSource;
        0qQ.A0B(musicDataSource2, 0);
        C315536k3 r6 = r20;
        0qQ.A0B(r6, 2);
        if (z || !musicDataSource2.equals(this.A03)) {
            C234482xw r3 = this.A0H;
            if (this.A05 == null) {
                Context context = this.A0E;
                UserSession userSession = this.A0C;
                C252323ov r1 = this.A08;
                AnonymousClass4DU r0 = this.A0D;
                if (r0 == null || (str3 = r0.getModuleName()) == null) {
                    str3 = "MusicPlayer";
                }
                AnonymousClass4M1 A002 = AnonymousClass4M0.A00(context, userSession, r1, this, str3);
                A002.Eqr(this.A00, 0);
                A002.ERk(this.A0K);
                A002.Ech(this.A0L);
                this.A05 = A002;
            } else {
                EHu(true);
            }
            this.A04 = r6;
            this.A03 = musicDataSource2;
            try {
                Uri uri = musicDataSource2.A00;
                String str4 = musicDataSource2.A05;
                if (uri == null || (str2 = uri.toString()) == null) {
                    str2 = str4;
                }
                String str5 = musicDataSource2.A04;
                AnonymousClass4M3 r10 = this.A05;
                if (r10 != null) {
                    11Z.A02(new C14173TrB(uri, musicDataSource2, this, r10, str5, str2, str4, str, i2, i3, i));
                } else {
                    r3.A04(new IllegalArgumentException("Null igVideoPlayer during setDataSource"));
                }
                C234462xu r12 = this.A0G;
                if (r12 == null) {
                    0wb.A03("MusicPlayer", "Failed to request audio focus");
                } else {
                    r12.A01(this.A0F);
                }
            } catch (IOException e) {
                r3.A04(e);
                throw new RuntimeException(e);
            }
        } else {
            this.A04 = r6;
        }
    }

    public final void onCompletion() {
        A02(true);
        C315536k3 r0 = this.A04;
        if (r0 != null) {
            r0.onCurrentTrackCompleted();
        }
    }

    public final void onCues(List list) {
    }

    public final void onDrawnToSurface() {
    }

    public final void onLoop(int i) {
    }

    public final void onPrepare(C263754Nf r1) {
    }

    public final void onProgressStateChanged(boolean z) {
    }

    public final void onProgressUpdate(int i, int i2, boolean z) {
    }

    public final void onSeeking(long j) {
        this.A01 = -1;
        C315536k3 r0 = this.A04;
        if (r0 != null) {
            r0.onCurrentTrackSeekComplete();
        }
    }

    public final void onStopVideo(String str, boolean z) {
    }

    public final void onStopped(C263754Nf r1, int i) {
    }

    public final void onSurfaceTextureDestroyed() {
    }

    public final void onSurfaceTextureUpdated(C263754Nf r1) {
    }

    public final void onVideoDownloading(C263754Nf r1) {
    }

    public final void onVideoPrepared(C263754Nf r6, boolean z) {
        int i;
        this.A09 = true;
        this.A0H.A03();
        C315536k3 r1 = this.A04;
        if (r1 != null) {
            AnonymousClass4M3 r0 = this.A05;
            if (r0 != null) {
                i = r0.AzN();
            } else {
                i = 0;
            }
            r1.onCurrentTrackPrepared(i);
        }
        int i2 = this.A07;
        if (i2 != -1) {
            AnonymousClass4M3 r02 = this.A05;
            if (r02 != null) {
                r02.EKy(i2, true);
            }
            this.A07 = -1;
        }
        if (this.A0A) {
            A00();
            this.A0A = false;
        }
    }

    public final void onVideoSwitchToWarmupPlayer(C263754Nf r1) {
    }

    public final void onVideoViewPrepared(C263754Nf r1) {
    }

    private final void A00() {
        if (!this.A09) {
            throw new IllegalStateException("Check failed.");
        } else if (!this.A06) {
            C234482xw r4 = this.A0H;
            r4.A01.A0D("play_on_prepared_requested", r4.A00, (String) null, (String) null, (String) null, (String) null);
            AnonymousClass4M3 r2 = this.A05;
            if (r2 != null) {
                r2.E2q("resume", false);
            } else {
                r4.A05(C273654mx.A00(1321));
            }
            C234462xu r1 = this.A0G;
            if (r1 != null) {
                r1.A01(this.A0F);
            }
            this.A06 = true;
            this.A0B.postDelayed(this.A0I, 16);
            r4.A01();
            C315536k3 r0 = this.A04;
            if (r0 != null) {
                r0.onCurrentTrackPlaybackStarted();
            }
        }
    }

    public final MusicDataSource AvO() {
        return this.A03;
    }

    public final int AzN() {
        AnonymousClass4M3 r0 = this.A05;
        if (r0 != null) {
            return r0.AzN();
        }
        return -1;
    }

    public final Integer C9D(MusicDataSource musicDataSource) {
        if (musicDataSource == null || this.A05 == null || !0qQ.A0K(this.A03, musicDataSource)) {
            return AnonymousClass05K.A00;
        }
        if (this.A09) {
            return AnonymousClass05K.A0C;
        }
        return AnonymousClass05K.A01;
    }

    public final float CFv() {
        return this.A00;
    }

    public final boolean CKF() {
        if (this.A03 != null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r4.A0A != false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E2p() {
        /*
            r4 = this;
            X.2xw r3 = r4.A0H
            boolean r0 = r4.A06
            r2 = 1
            if (r0 != 0) goto L_0x000c
            boolean r1 = r4.A0A
            r0 = 0
            if (r1 == 0) goto L_0x000d
        L_0x000c:
            r0 = 1
        L_0x000d:
            r3.A06(r0)
            com.instagram.music.common.model.MusicDataSource r0 = r4.A03
            if (r0 != 0) goto L_0x001e
            r0 = 1320(0x528, float:1.85E-42)
        L_0x0016:
            java.lang.String r0 = X.C273654mx.A00(r0)
            r3.A05(r0)
            return
        L_0x001e:
            java.lang.Integer r0 = r4.C9D(r0)
            int r1 = r0.intValue()
            if (r1 == r2) goto L_0x003b
            r0 = 2
            if (r1 == r0) goto L_0x0037
            r0 = 0
            if (r1 != r0) goto L_0x0031
            r0 = 1403(0x57b, float:1.966E-42)
            goto L_0x0016
        L_0x0031:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0037:
            r4.A00()
            return
        L_0x003b:
            r4.A0A = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C234492xx.E2p():void");
    }

    public final void EHu(boolean z) {
        AnonymousClass4M3 r3 = this.A05;
        if (r3 != null) {
            C234482xw r1 = this.A0H;
            if (this.A06 && !r3.isPlaying()) {
                r1.A01.A0D("reset_started", r1.A00, (String) null, (String) null, (String) null, (String) null);
            }
            AnonymousClass4M3 r12 = this.A05;
            if (r12 != null) {
                r12.EyP("finished", false);
            }
            A02(!z);
            this.A01 = -1;
            this.A0A = false;
            this.A07 = -1;
            this.A09 = false;
            this.A03 = null;
            this.A04 = null;
        }
    }

    public final void Eqq(float f) {
        AnonymousClass4M3 r1 = this.A05;
        if (r1 != null) {
            r1.Eqr(f, 0);
        }
        this.A00 = f;
    }

    public final int getCurrentPositionMs() {
        AnonymousClass4M3 r0 = this.A05;
        if (r0 != null) {
            return r0.getCurrentPositionMs();
        }
        return -1;
    }

    public final boolean isPlaying() {
        int intValue = C9D(this.A03).intValue();
        if ((intValue == 1 || intValue == 2) && (this.A0A || this.A06)) {
            return true;
        }
        return false;
    }

    public final void onVideoPlayerError(C263754Nf r2, String str) {
        C234482xw r0 = this.A0H;
        if (str == null) {
            str = "Video Player Error";
        }
        r0.A05(str);
    }

    public final void onVideoStartedPlaying(C263754Nf r2) {
        this.A0H.A02();
        C315536k3 r0 = this.A04;
        if (r0 != null) {
            r0.onCurrentTrackStartedPlaying();
        }
    }

    public final void release() {
        if (this.A05 != null) {
            EHu(false);
            AnonymousClass4M3 r1 = this.A05;
            if (r1 != null) {
                r1.ECP("finished");
            }
            this.A05 = null;
        }
    }

    public final void seekTo(int i) {
        MusicDataSource musicDataSource = this.A03;
        if (musicDataSource != null) {
            int intValue = C9D(musicDataSource).intValue();
            if (intValue == 1) {
                this.A07 = i;
            } else if (intValue == 2) {
                AnonymousClass4M3 r1 = this.A05;
                if (r1 != null) {
                    r1.EKy(i, true);
                }
            } else if (intValue != 0) {
                throw new RuntimeException();
            }
        }
    }

    public C234492xx(Context context, UserSession userSession, AnonymousClass4DU r6, C234462xu r7, C234482xw r8, boolean z, boolean z2) {
        this.A0C = userSession;
        this.A0G = r7;
        this.A0H = r8;
        this.A0D = r6;
        this.A0K = z;
        this.A0L = z2;
        if (182.A06(0Tu.A05, userSession, 36326017345926610L)) {
            context = context.getApplicationContext();
            0qQ.A0A(context);
        }
        this.A0E = context;
        this.A0B = new Handler(Looper.getMainLooper());
        C234512xz r1 = new C234512xz(this);
        this.A0J = r1;
        this.A07 = -1;
        this.A01 = -1;
        this.A0F = new AnonymousClass2y0(this);
        this.A00 = 1.0f;
        this.A0I = new AnonymousClass2y1(this);
        if (r6 != null) {
            this.A08 = new AnonymousClass2y2(r6, r1);
        }
    }

    public final void pause() {
        A01(this);
    }

    public final void EP6(C357838Zw r1) {
        this.A02 = r1;
    }
}
