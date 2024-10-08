package X;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicDataSource;
import java.util.List;

/* renamed from: X.6oC  reason: invalid class name and case insensitive filesystem */
public final class C318006oC extends AnonymousClass4M2 implements C234502xy, C232732uM {
    public float A00;
    public int A01;
    public C357838Zw A02;
    public MusicDataSource A03;
    public C315536k3 A04;
    public AnonymousClass4MM A05;
    public boolean A06;
    public int A07;
    public C252323ov A08;
    public boolean A09;
    public boolean A0A;
    public final int A0B;
    public final Handler A0C;
    public final UserSession A0D;
    public final AnonymousClass4DU A0E;
    public final C234482xw A0F;
    public final Integer A0G;
    public final Context A0H;
    public final AudioManager.OnAudioFocusChangeListener A0I;
    public final C234462xu A0J;
    public final Runnable A0K;
    public final AnonymousClass0eK A0L;
    public final boolean A0M;

    private final void A01(int i) {
        this.A09 = true;
        this.A0F.A03();
        C315536k3 r0 = this.A04;
        if (r0 != null) {
            r0.onCurrentTrackPrepared(i);
        }
        int i2 = this.A07;
        if (i2 != -1) {
            AnonymousClass4MM r02 = this.A05;
            if (r02 != null) {
                r02.seekTo(i2);
            }
            this.A07 = -1;
        }
        if (this.A0A) {
            A00();
            this.A0A = false;
        }
    }

    public static final void A02(C318006oC r13) {
        AnonymousClass4MM r0;
        C234482xw r1 = r13.A0F;
        if (r13.A06 && ((r0 = r13.A05) == null || !r0.A09.A0I.A0J())) {
            r1.A01.A0D("pause_started", r1.A00, (String) null, (String) null, (String) null, (String) null);
        }
        AnonymousClass4MM r12 = r13.A05;
        if (r12 != null) {
            r13.A0A = false;
            if (r13.A09) {
                r12.pause();
            }
            r13.A03(true);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A03(boolean z) {
        C234462xu r0;
        this.A06 = false;
        this.A0C.removeCallbacks(this.A0K);
        if (z && (r0 = this.A0J) != null) {
            r0.A00();
        }
        this.A0F.A00();
        C315536k3 r02 = this.A04;
        if (r02 != null) {
            r02.onCurrentTrackStopped();
        }
    }

    public final void AHY() {
        this.A03 = null;
    }

    public final int AzN() {
        AnonymousClass4MM r1 = this.A05;
        if (r1 != null) {
            return (int) r1.A09.A0I.A09();
        }
        return -1;
    }

    public final void D5H(AnonymousClass4MN r2) {
        A03(true);
        C315536k3 r0 = this.A04;
        if (r0 != null) {
            r0.onCurrentTrackCompleted();
        }
    }

    public final void DCm(AnonymousClass4MN r2, String str, String str2, String str3) {
        0qQ.A0B(str3, 3);
        this.A0F.A05(str3);
    }

    public final void DZ2(AnonymousClass4MN r4, long j) {
        0qQ.A0B(r4, 0);
        A01((int) ((AnonymousClass4MM) r4).A09.A0I.A09());
    }

    public final void DiU(AnonymousClass4MN r2, long j) {
        this.A01 = -1;
        C315536k3 r0 = this.A04;
        if (r0 != null) {
            r0.onCurrentTrackSeekComplete();
        }
    }

    public final int getCurrentPositionMs() {
        AnonymousClass4MM r0 = this.A05;
        if (r0 != null) {
            return r0.getCurrentPosition();
        }
        return -1;
    }

    public final void onCompletion() {
        A03(true);
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

    public final void onVideoPlayerError(C263754Nf r1, String str) {
    }

    public final void onVideoPrepared(C263754Nf r2, boolean z) {
        A01(0);
    }

    public final void onVideoSwitchToWarmupPlayer(C263754Nf r1) {
    }

    public final void onVideoViewPrepared(C263754Nf r1) {
    }

    private final void A00() {
        if (!this.A09) {
            throw new IllegalStateException("Check failed.");
        } else if (!this.A06) {
            C234482xw r4 = this.A0F;
            r4.A01.A0D("play_on_prepared_requested", r4.A00, (String) null, (String) null, (String) null, (String) null);
            AnonymousClass4MM r0 = this.A05;
            if (r0 != null) {
                r0.start();
            } else {
                r4.A05("Null video player while playOnPrepared()");
            }
            C234462xu r1 = this.A0J;
            if (r1 != null) {
                r1.A01(this.A0I);
            }
            this.A06 = true;
            this.A0C.postDelayed(this.A0K, (long) this.A0B);
            r4.A01();
            C315536k3 r02 = this.A04;
            if (r02 != null) {
                r02.onCurrentTrackPlaybackStarted();
            }
        }
    }

    public final MusicDataSource AvO() {
        return this.A03;
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

    public final void DTt(byte[] bArr, long j) {
        C357838Zw r0 = this.A02;
        if (r0 != null) {
            r0.A03.add(new C40723Ahx(bArr, j));
        }
    }

    public final void DyS(long j) {
        this.A0F.A02();
        C315536k3 r0 = this.A04;
        if (r0 != null) {
            r0.onCurrentTrackStartedPlaying();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r4.A0A != false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E2p() {
        /*
            r4 = this;
            X.2xw r3 = r4.A0F
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
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = "Null data source during play()"
        L_0x0016:
            r3.A05(r0)
            return
        L_0x001a:
            java.lang.Integer r0 = r4.C9D(r0)
            int r1 = r0.intValue()
            if (r1 == r2) goto L_0x0037
            r0 = 2
            if (r1 == r0) goto L_0x0033
            r0 = 0
            if (r1 != r0) goto L_0x002d
            java.lang.String r0 = "UNSET TrackState during play()"
            goto L_0x0016
        L_0x002d:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0033:
            r4.A00()
            return
        L_0x0037:
            r4.A0A = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C318006oC.E2p():void");
    }

    public final void EHu(boolean z) {
        AnonymousClass4MM r3 = this.A05;
        if (r3 != null) {
            C234482xw r2 = this.A0F;
            if (this.A06 && !r3.A09.A0I.A0J()) {
                r2.A01.A0D("reset_started", r2.A00, (String) null, (String) null, (String) null, (String) null);
            }
            AnonymousClass4MM r0 = this.A05;
            if (r0 != null) {
                r0.reset();
            }
            A03(!z);
            this.A01 = -1;
            this.A0A = false;
            this.A07 = -1;
            this.A09 = false;
            this.A03 = null;
            this.A04 = null;
        }
    }

    /* JADX WARNING: type inference failed for: r10v1, types: [java.lang.Object, X.4MB] */
    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, X.4Np] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.4Nt, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0182 A[Catch:{ IOException -> 0x01c4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ETw(com.instagram.music.common.model.MusicDataSource r42, X.C315536k3 r43, java.lang.String r44, int r45, int r46, int r47, boolean r48, boolean r49) {
        /*
            r41 = this;
            java.lang.String r22 = "MP3_OR_MP4"
            r1 = 0
            r4 = r42
            X.0qQ.A0B(r4, r1)
            r0 = 2
            r9 = r43
            X.0qQ.A0B(r9, r0)
            r0 = r41
            if (r48 != 0) goto L_0x001d
            com.instagram.music.common.model.MusicDataSource r2 = r0.A03
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x001d
            r0.A04 = r9
            return
        L_0x001d:
            X.2xw r6 = r0.A0F
            X.4DU r2 = r0.A0E
            java.lang.String r5 = "MusicPlayer"
            if (r2 == 0) goto L_0x002b
            java.lang.String r10 = r2.getModuleName()
            if (r10 != 0) goto L_0x002c
        L_0x002b:
            r10 = r5
        L_0x002c:
            r39 = 0
            r7 = 1
            X.4MM r2 = r0.A05     // Catch:{ IOException -> 0x01c4 }
            if (r2 != 0) goto L_0x0073
            android.content.Context r8 = r0.A0H     // Catch:{ IOException -> 0x01c4 }
            com.instagram.common.session.UserSession r2 = r0.A0D     // Catch:{ IOException -> 0x01c4 }
            X.4MM r3 = new X.4MM     // Catch:{ IOException -> 0x01c4 }
            r3.<init>(r8, r2, r10)     // Catch:{ IOException -> 0x01c4 }
            float r2 = r0.A00     // Catch:{ IOException -> 0x01c4 }
            r3.Eqq(r2)     // Catch:{ IOException -> 0x01c4 }
            r3.A0M = r0     // Catch:{ IOException -> 0x01c4 }
            r0.A05 = r3     // Catch:{ IOException -> 0x01c4 }
        L_0x0045:
            X.4MB r10 = new X.4MB     // Catch:{ IOException -> 0x01c4 }
            r10.<init>()     // Catch:{ IOException -> 0x01c4 }
            X.4Np r8 = new X.4Np     // Catch:{ IOException -> 0x01c4 }
            r8.<init>()     // Catch:{ IOException -> 0x01c4 }
            r2 = r44
            r8.A01 = r2     // Catch:{ IOException -> 0x01c4 }
            X.3ov r3 = r0.A08     // Catch:{ IOException -> 0x01c4 }
            X.4Nq r2 = new X.4Nq     // Catch:{ IOException -> 0x01c4 }
            r2.<init>(r10, r8, r3, r4)     // Catch:{ IOException -> 0x01c4 }
            X.4Nt r3 = new X.4Nt     // Catch:{ IOException -> 0x01c4 }
            r3.<init>()     // Catch:{ IOException -> 0x01c4 }
            r3.A01 = r2     // Catch:{ IOException -> 0x01c4 }
            X.4MM r2 = r0.A05     // Catch:{ IOException -> 0x01c4 }
            if (r2 == 0) goto L_0x0068
            r2.Ecb(r3)     // Catch:{ IOException -> 0x01c4 }
        L_0x0068:
            r0.A04 = r9     // Catch:{ IOException -> 0x01c4 }
            r0.A03 = r4     // Catch:{ IOException -> 0x01c4 }
            android.net.Uri r9 = r4.A00     // Catch:{ IOException -> 0x01c4 }
            java.lang.String r3 = r4.A05     // Catch:{ IOException -> 0x01c4 }
            java.lang.String r4 = r4.A04     // Catch:{ IOException -> 0x01c4 }
            goto L_0x0077
        L_0x0073:
            r0.EHu(r7)     // Catch:{ IOException -> 0x01c4 }
            goto L_0x0045
        L_0x0077:
            if (r9 == 0) goto L_0x007e
            int r2 = r9.hashCode()     // Catch:{ IOException -> 0x01c4 }
            goto L_0x0087
        L_0x007e:
            if (r3 == 0) goto L_0x0081
            goto L_0x0083
        L_0x0081:
            r2 = 0
            goto L_0x0087
        L_0x0083:
            int r2 = r3.hashCode()     // Catch:{ IOException -> 0x01c4 }
        L_0x0087:
            java.lang.String r8 = java.lang.Integer.toHexString(r2)     // Catch:{ IOException -> 0x01c4 }
            X.0qQ.A07(r8)     // Catch:{ IOException -> 0x01c4 }
            X.4MM r2 = r0.A05     // Catch:{ IOException -> 0x01c4 }
            if (r2 == 0) goto L_0x0196
            if (r9 == 0) goto L_0x009d
            java.lang.Integer r4 = r0.A0G     // Catch:{ IOException -> 0x01c4 }
            X.8Zw r3 = r0.A02     // Catch:{ IOException -> 0x01c4 }
            if (r3 != 0) goto L_0x01a1
            r7 = 0
            goto L_0x01a1
        L_0x009d:
            if (r4 == 0) goto L_0x00c2
            if (r3 == 0) goto L_0x0164
            java.lang.Integer r15 = r0.A0G     // Catch:{ IOException -> 0x01c4 }
            r10 = 0
            X.0qQ.A0B(r15, r7)     // Catch:{ IOException -> 0x01c4 }
            X.8Zw r9 = r0.A02     // Catch:{ IOException -> 0x01c4 }
            r38 = 0
            if (r9 == 0) goto L_0x00af
            r38 = 1
        L_0x00af:
            java.lang.Integer r16 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x01c4 }
            int r7 = r4.length()     // Catch:{ IOException -> 0x01c4 }
            if (r7 > 0) goto L_0x00bf
            int r7 = r3.length()     // Catch:{ IOException -> 0x01c4 }
            if (r7 <= 0) goto L_0x0126
        L_0x00bf:
            r39 = 1
            goto L_0x0126
        L_0x00c2:
            if (r3 == 0) goto L_0x0164
            if (r49 != 0) goto L_0x00ca
            boolean r4 = r0.A0M     // Catch:{ IOException -> 0x01c4 }
            if (r4 == 0) goto L_0x00cc
        L_0x00ca:
            r2.A0T = r7     // Catch:{ IOException -> 0x01c4 }
        L_0x00cc:
            java.lang.Integer r15 = r0.A0G     // Catch:{ IOException -> 0x01c4 }
            r10 = 0
            X.0qQ.A0B(r15, r7)     // Catch:{ IOException -> 0x01c4 }
            r29 = -1
            r30 = -1
            X.8Zw r4 = r0.A02     // Catch:{ IOException -> 0x01c4 }
            r38 = 0
            if (r4 == 0) goto L_0x00de
            r38 = 1
        L_0x00de:
            if (r49 == 0) goto L_0x00e4
            r29 = 0
            r30 = r47
        L_0x00e4:
            java.util.List r27 = java.util.Collections.singletonList(r22)     // Catch:{ IOException -> 0x01c4 }
            X.0qQ.A07(r27)     // Catch:{ IOException -> 0x01c4 }
            int r4 = r3.length()     // Catch:{ IOException -> 0x01c4 }
            if (r4 <= 0) goto L_0x00f3
            r39 = 1
        L_0x00f3:
            X.3WR r9 = new X.3WR     // Catch:{ IOException -> 0x01c4 }
            r31 = -1
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r16 = r10
            r18 = r10
            r20 = r10
            r21 = r10
            r23 = r10
            r24 = r10
            r25 = r10
            r26 = r10
            r28 = r10
            r33 = r1
            r34 = r1
            r35 = r1
            r36 = r1
            r37 = r1
            r40 = r1
            r19 = r3
            r17 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38, r39, r40)     // Catch:{ IOException -> 0x01c4 }
            X.4Lx r3 = new X.4Lx     // Catch:{ IOException -> 0x01c4 }
            r3.<init>(r1, r1, r1, r1)     // Catch:{ IOException -> 0x01c4 }
            goto L_0x015e
        L_0x0126:
            X.3WR r9 = new X.3WR     // Catch:{ IOException -> 0x01c4 }
            r31 = -1
            r29 = -1
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r18 = r10
            r21 = r10
            r22 = r10
            r23 = r10
            r24 = r10
            r25 = r10
            r26 = r10
            r27 = r10
            r28 = r10
            r30 = r29
            r33 = r1
            r34 = r1
            r35 = r1
            r36 = r1
            r37 = r1
            r40 = r1
            r19 = r3
            r20 = r4
            r17 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38, r39, r40)     // Catch:{ IOException -> 0x01c4 }
            X.4Lx r3 = new X.4Lx     // Catch:{ IOException -> 0x01c4 }
            r3.<init>(r1, r1, r1, r1)     // Catch:{ IOException -> 0x01c4 }
        L_0x015e:
            r1 = r45
            r2.ETx(r3, r9, r5, r1)     // Catch:{ IOException -> 0x01c4 }
            goto L_0x01ac
        L_0x0164:
            java.lang.String r3 = "Invalid dataSource during setDataSource"
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x01c4 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x01c4 }
            r6.A04(r2)     // Catch:{ IOException -> 0x01c4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01c4 }
            r3.<init>()     // Catch:{ IOException -> 0x01c4 }
            java.lang.String r2 = "Invalid dataSource mediaId:"
            r3.append(r2)     // Catch:{ IOException -> 0x01c4 }
            r3.append(r8)     // Catch:{ IOException -> 0x01c4 }
            java.lang.String r2 = ", dashAvailable:"
            r3.append(r2)     // Catch:{ IOException -> 0x01c4 }
            if (r4 != 0) goto L_0x0183
            r7 = 0
        L_0x0183:
            r3.append(r7)     // Catch:{ IOException -> 0x01c4 }
            java.lang.String r2 = ", progressiveAvailable:"
            r3.append(r2)     // Catch:{ IOException -> 0x01c4 }
            r3.append(r1)     // Catch:{ IOException -> 0x01c4 }
            java.lang.String r1 = r3.toString()     // Catch:{ IOException -> 0x01c4 }
            X.0wb.A03(r5, r1)     // Catch:{ IOException -> 0x01c4 }
            goto L_0x01ac
        L_0x0196:
            java.lang.String r2 = "Null igGrootPlayer during setDataSource"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x01c4 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x01c4 }
            r6.A04(r1)     // Catch:{ IOException -> 0x01c4 }
            goto L_0x01ac
        L_0x01a1:
            r10 = r2
            r11 = r9
            r12 = r4
            r13 = r8
            r14 = r5
            r15 = r1
            r16 = r7
            r10.ETv(r11, r12, r13, r14, r15, r16)     // Catch:{ IOException -> 0x01c4 }
        L_0x01ac:
            X.4MM r2 = r0.A05     // Catch:{ IOException -> 0x01c4 }
            if (r2 == 0) goto L_0x01b4
            r1 = 0
            r2.E3n(r1, r1)     // Catch:{ IOException -> 0x01c4 }
        L_0x01b4:
            X.2xu r1 = r0.A0J
            if (r1 != 0) goto L_0x01be
            java.lang.String r0 = "Failed to request audio focus"
            X.0wb.A03(r5, r0)
            return
        L_0x01be:
            android.media.AudioManager$OnAudioFocusChangeListener r0 = r0.A0I
            r1.A01(r0)
            return
        L_0x01c4:
            r1 = move-exception
            r6.A04(r1)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C318006oC.ETw(com.instagram.music.common.model.MusicDataSource, X.6k3, java.lang.String, int, int, int, boolean, boolean):void");
    }

    public final void Eqq(float f) {
        AnonymousClass4MM r0 = this.A05;
        if (r0 != null) {
            r0.Eqq(f);
        }
        this.A00 = f;
    }

    public final boolean isPlaying() {
        int intValue = C9D(this.A03).intValue();
        if ((intValue == 1 || intValue == 2) && (this.A0A || this.A06)) {
            return true;
        }
        return false;
    }

    public final void onVideoStartedPlaying(C263754Nf r2) {
        this.A0F.A02();
        C315536k3 r0 = this.A04;
        if (r0 != null) {
            r0.onCurrentTrackStartedPlaying();
        }
    }

    public final void release() {
        if (this.A05 != null) {
            EHu(false);
            AnonymousClass4MM r0 = this.A05;
            if (r0 != null) {
                r0.ECQ(false);
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
                AnonymousClass4MM r0 = this.A05;
                if (r0 != null) {
                    r0.seekTo(i);
                }
            } else if (intValue != 0) {
                throw new RuntimeException();
            }
        }
    }

    public C318006oC(Context context, UserSession userSession, AnonymousClass4DU r6, C234462xu r7, C234482xw r8, boolean z) {
        this.A0D = userSession;
        this.A0J = r7;
        this.A0F = r8;
        this.A0E = r6;
        this.A0M = z;
        if (182.A06(0Tu.A05, userSession, 36326017345926610L)) {
            context = context.getApplicationContext();
            0qQ.A0A(context);
        }
        this.A0H = context;
        C318016oD r2 = new C318016oD(this);
        this.A0L = r2;
        this.A0C = new Handler(Looper.getMainLooper());
        this.A07 = -1;
        this.A0B = 16;
        this.A01 = -1;
        this.A0G = AnonymousClass05K.A15;
        this.A0I = new C318026oE(this);
        this.A00 = 1.0f;
        this.A0K = new C318036oF(this);
        if (r6 != null) {
            this.A08 = new AnonymousClass2y2(r6, r2);
        }
    }

    public final void pause() {
        A02(this);
    }

    public final void EP6(C357838Zw r1) {
        this.A02 = r1;
    }
}
