package X;

import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.4Nk  reason: invalid class name and case insensitive filesystem */
public final class C263804Nk implements 29o, AnonymousClass0lh, C242843Wf {
    public WeakReference A00 = new WeakReference((Object) null);
    public C45264CtT A01;
    public final UserSession A02;
    public final String A03;

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0087, code lost:
        if (r6 == null) goto L_0x0097;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0084 A[SYNTHETIC, Splitter:B:43:0x0084] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map B3P(com.instagram.common.session.UserSession r12, java.io.File r13) {
        /*
            r11 = this;
            r0 = 0
            X.0qQ.A0B(r12, r0)
            r0 = 1
            X.0qQ.A0B(r13, r0)
            X.CtT r1 = r11.A01     // Catch:{ IOException -> 0x009c }
            com.instagram.common.session.UserSession r0 = r11.A02     // Catch:{ IOException -> 0x009c }
            if (r12 != r0) goto L_0x00a4
            if (r1 == 0) goto L_0x00a4
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ IOException -> 0x009c }
            r8.<init>()     // Catch:{ IOException -> 0x009c }
            java.util.List r0 = r1.A00     // Catch:{ IOException -> 0x009c }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ IOException -> 0x009c }
        L_0x001b:
            boolean r0 = r10.hasNext()     // Catch:{ IOException -> 0x009c }
            if (r0 == 0) goto L_0x0098
            java.lang.Object r1 = r10.next()     // Catch:{ IOException -> 0x009c }
            X.S0T r1 = (X.S0T) r1     // Catch:{ IOException -> 0x009c }
            java.lang.String r4 = "Exception closing stream %s"
            java.lang.String r3 = "FileAttachmentEntry"
            r9 = 0
            java.lang.String r7 = "video_stack_snapshot"
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0070, all -> 0x006e }
            r0.<init>(r13, r7)     // Catch:{ IOException -> 0x0070, all -> 0x006e }
            android.net.Uri r2 = android.net.Uri.fromFile(r0)     // Catch:{ IOException -> 0x0070, all -> 0x006e }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0070, all -> 0x006e }
            r6.<init>(r0)     // Catch:{ IOException -> 0x0070, all -> 0x006e }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            r0.<init>(r6)     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.io.PrintWriter r5 = new java.io.PrintWriter     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.lang.String r1 = r1.A00     // Catch:{ IOException -> 0x006b, all -> 0x0081 }
            int r0 = r1.length()     // Catch:{ IOException -> 0x006b, all -> 0x0081 }
            if (r0 == 0) goto L_0x0051
            r5.print(r1)     // Catch:{ IOException -> 0x006b, all -> 0x0081 }
        L_0x0051:
            r5.close()     // Catch:{ IOException -> 0x009c }
            r6.close()     // Catch:{ IOException -> 0x0058 }
            goto L_0x0060
        L_0x0058:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r7, r0}     // Catch:{ IOException -> 0x009c }
            X.0KC.A0O(r3, r4, r0)     // Catch:{ IOException -> 0x009c }
        L_0x0060:
            if (r2 == 0) goto L_0x001b
            r8.put(r7, r2)     // Catch:{ IOException -> 0x009c }
            goto L_0x001b
        L_0x0066:
            r2 = move-exception
            goto L_0x0089
        L_0x0068:
            r2 = move-exception
            r5 = r9
            goto L_0x006c
        L_0x006b:
            r2 = move-exception
        L_0x006c:
            r9 = r6
            goto L_0x0072
        L_0x006e:
            r2 = move-exception
            goto L_0x0097
        L_0x0070:
            r2 = move-exception
            r5 = r9
        L_0x0072:
            java.lang.String r1 = "Exception saving trace %s"
            java.lang.String r0 = "video_stack_snapshot"
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}     // Catch:{ all -> 0x007e }
            X.0KC.A0O(r3, r1, r0)     // Catch:{ all -> 0x007e }
            throw r2     // Catch:{ all -> 0x007e }
        L_0x007e:
            r2 = move-exception
            r6 = r9
            goto L_0x0082
        L_0x0081:
            r2 = move-exception
        L_0x0082:
            if (r5 == 0) goto L_0x0087
            r5.close()     // Catch:{ IOException -> 0x009c }
        L_0x0087:
            if (r6 == 0) goto L_0x0097
        L_0x0089:
            r6.close()     // Catch:{ IOException -> 0x008d }
            goto L_0x0097
        L_0x008d:
            r1 = move-exception
            java.lang.String r0 = "video_stack_snapshot"
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}     // Catch:{ IOException -> 0x009c }
            X.0KC.A0O(r3, r4, r0)     // Catch:{ IOException -> 0x009c }
        L_0x0097:
            throw r2     // Catch:{ IOException -> 0x009c }
        L_0x0098:
            r0 = 0
            r11.A01 = r0     // Catch:{ IOException -> 0x009c }
            return r8
        L_0x009c:
            r2 = move-exception
            java.lang.String r1 = "VideoPlayerFlytrapExtrasProvider"
            java.lang.String r0 = "Failed to create video snapshot files to be included in bug report!"
            X.0KC.A0F(r1, r0, r2)
        L_0x00a4:
            X.0sm r8 = X.0Yt.A0E()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C263804Nk.B3P(com.instagram.common.session.UserSession, java.io.File):java.util.Map");
    }

    public final boolean CK5(UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        if (userSession != this.A02 || this.A01 == null) {
            return false;
        }
        return true;
    }

    public final void Epo(long j) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: X.5f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: X.5f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: X.5f0} */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x04a7, code lost:
        if (r1 == false) goto L_0x04a9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map B3T() {
        /*
            r17 = this;
            r12 = r17
            java.lang.ref.WeakReference r0 = r12.A00
            java.lang.Object r8 = r0.get()
            X.4M3 r8 = (X.AnonymousClass4M3) r8
            if (r8 == 0) goto L_0x07f4
            X.5f2 r7 = new X.5f2
            r7.<init>()
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.lang.String r5 = r8.CE4()
            r16 = 0
            X.4M1 r8 = (X.AnonymousClass4M1) r8
            X.5f0 r10 = r8.A0H
            if (r10 != 0) goto L_0x0027
            X.DGH r10 = new X.DGH
            r10.<init>()
        L_0x0027:
            com.instagram.common.session.UserSession r3 = r8.A0m
            X.0Tu r2 = X.0Tu.A05
            r0 = 36312251975599121(0x8101cd00000411, double:3.027352594846785E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0548
            X.5f0 r0 = r8.A0H
            if (r0 == 0) goto L_0x0548
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            java.lang.String r0 = r8.A0Q
            r7.A00(r1, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0I
            X.1wD r0 = X.1w8.A00()
            int r0 = r0.A0C
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.A00(r1, r0)
            java.lang.Integer r3 = X.AnonymousClass05K.A19
            android.content.Context r2 = r8.A0k
            android.content.res.Resources r0 = r2.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.orientation
            r0 = 1
            if (r1 == r0) goto L_0x00cf
            r0 = 2
            if (r1 == r0) goto L_0x00cc
            r0 = 0
        L_0x0065:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.A00(r3, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A14
            int r0 = r8.A0B
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.A00(r1, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A16
            int r0 = r8.A07
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.A00(r1, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A17
            int r0 = X.0nA.A09(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.A00(r1, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A18
            int r0 = X.0nA.A08(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.A00(r1, r0)
            float r0 = r8.A02
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r4 = "VideoPlayerImpl"
            java.lang.String r0 = "AudioVolume"
            r7.A01(r4, r0, r1)
            X.4MM r0 = r8.A0K
            if (r0 == 0) goto L_0x0306
            X.4Ms r11 = r0.A09
            java.lang.Integer r1 = X.AnonymousClass05K.A0T
            X.OMz r0 = r11.A07
            if (r0 == 0) goto L_0x00c9
            java.util.concurrent.atomic.AtomicReference r0 = r0.A06
            java.lang.Object r0 = r0.get()
            X.0qQ.A07(r0)
            X.Nj9 r0 = (X.C69308Nj9) r0
        L_0x00c0:
            java.lang.String r0 = r0.name()
            r7.A00(r1, r0)
            monitor-enter(r11)
            goto L_0x00d2
        L_0x00c9:
            X.Nj9 r0 = X.C69308Nj9.UNSET
            goto L_0x00c0
        L_0x00cc:
            java.lang.String r0 = "landscape"
            goto L_0x0065
        L_0x00cf:
            java.lang.String r0 = "portrait"
            goto L_0x0065
        L_0x00d2:
            java.lang.Integer r2 = X.AnonymousClass05K.A0n     // Catch:{ all -> 0x025c }
            r0 = -1
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x025c }
            r7.A00(r2, r0)     // Catch:{ all -> 0x025c }
            java.lang.Integer r1 = X.AnonymousClass05K.A0o     // Catch:{ all -> 0x025c }
            r14 = 0
            java.lang.String r0 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x025c }
            r7.A00(r1, r0)     // Catch:{ all -> 0x025c }
            monitor-exit(r11)
            android.view.View r0 = r11.A04
            r2 = 0
            if (r0 == 0) goto L_0x010d
            android.view.ViewParent r9 = r0.getParent()
            r3 = r2
        L_0x00f2:
            if (r9 == 0) goto L_0x0107
            boolean r0 = r9 instanceof android.view.View
            if (r0 == 0) goto L_0x0107
            r1 = r9
            android.view.View r1 = (android.view.View) r1
            int r0 = r1.getVisibility()
            if (r0 == 0) goto L_0x0102
            r3 = r9
        L_0x0102:
            android.view.ViewParent r9 = r1.getParent()
            goto L_0x00f2
        L_0x0107:
            if (r3 == 0) goto L_0x010d
            java.lang.String r2 = r3.toString()
        L_0x010d:
            java.lang.Integer r1 = X.AnonymousClass05K.A0e
            r0 = 0
            if (r2 == 0) goto L_0x0113
            r0 = 1
        L_0x0113:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.A00(r1, r0)
            if (r2 == 0) goto L_0x0123
            java.lang.String r1 = "GrootPlayer"
            java.lang.String r0 = "InvisibleParentView"
            r7.A01(r1, r0, r2)
        L_0x0123:
            java.lang.Integer r1 = X.AnonymousClass05K.A0f
            java.lang.String r0 = "unknown"
            r7.A00(r1, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0g
            android.view.View r0 = r11.A04
            if (r0 != 0) goto L_0x01e4
            java.lang.String r0 = "Unknown"
        L_0x0132:
            r7.A00(r1, r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A0h
            X.4Mk r0 = r11.A09
            android.view.Surface r0 = r0.B9s()
            r1 = 1
            if (r0 == 0) goto L_0x01e1
            boolean r0 = r0.isValid()
            if (r0 != r1) goto L_0x01e1
        L_0x0146:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            r7.A00(r2, r0)
            java.lang.String r3 = "BlackScreenDuration"
            java.lang.String r2 = "durationMs"
            long r0 = r11.A01
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.A01(r3, r2, r0)
            X.4Mt r3 = r11.A0I
            java.util.List r0 = r7.A02
            X.Vil r2 = new X.Vil
            r2.<init>(r0)
            java.lang.String r9 = "HeroPlayer"
            java.lang.String r11 = "mPlayerId"
            long r0 = r3.A0S
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.A01(r9, r11, r0)
            java.lang.String r11 = "mRecentTwoPlayerIds0"
            long[] r13 = r3.A0O
            r0 = r13[r14]
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.A01(r9, r11, r0)
            java.lang.String r11 = "mRecentTwoPlayerIds1"
            r0 = 1
            r0 = r13[r0]
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.A01(r9, r11, r0)
            java.lang.String r11 = "mSeekRequestPositionMs"
            long r0 = r3.A0T
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.A01(r9, r11, r0)
            java.lang.String r11 = "mSeekRequestSeqNum"
            long r0 = r3.A0U
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.A01(r9, r11, r0)
            java.lang.String r1 = "mVolume"
            float r0 = r3.A0Q
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.A01(r9, r1, r0)
            java.lang.String r1 = "mPlaybackSpeed"
            float r0 = r3.A0P
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.A01(r9, r1, r0)
            java.lang.String r1 = "mLooping"
            boolean r0 = r3.A0X
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.A01(r9, r1, r0)
            java.lang.String r1 = "mWarmedVideoId"
            java.lang.String r0 = r3.A0W
            r2.A01(r9, r1, r0)
            java.lang.String r1 = "mWarmedStartPositionMs"
            int r0 = r3.A0R
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.A01(r9, r1, r0)
            java.lang.String r1 = "mIsVisuallyPlaying"
            boolean r0 = r3.A0D
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.A01(r9, r1, r0)
            java.lang.Class<X.274> r11 = X.274.class
            monitor-enter(r11)
            goto L_0x01f8
        L_0x01e1:
            r1 = 0
            goto L_0x0146
        L_0x01e4:
            boolean r0 = r0 instanceof android.view.TextureView
            if (r0 == 0) goto L_0x01f0
            r0 = 2512(0x9d0, float:3.52E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x0132
        L_0x01f0:
            r0 = 2505(0x9c9, float:3.51E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x0132
        L_0x01f8:
            X.274 r0 = X.274.A0e     // Catch:{ all -> 0x025c }
            monitor-exit(r11)
            if (r0 == 0) goto L_0x0218
            java.lang.String r1 = "HeroplayerPoolSize"
            monitor-enter(r11)
            X.274 r0 = X.274.A0e     // Catch:{ all -> 0x025c }
            monitor-exit(r11)
            X.29n r0 = r0.A0c
            if (r0 == 0) goto L_0x021c
            android.util.LruCache r0 = r0.A00
            java.util.Map r0 = r0.snapshot()
            int r0 = r0.size()
        L_0x0211:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.A01(r9, r1, r0)
        L_0x0218:
            java.util.List r11 = r3.A0L
            monitor-enter(r11)
            goto L_0x021e
        L_0x021c:
            r0 = 3
            goto L_0x0211
        L_0x021e:
            java.lang.String r13 = "mFirstStallVideoPosition"
            long r0 = r3.A00     // Catch:{ all -> 0x0259 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0259 }
            r2.A01(r9, r13, r0)     // Catch:{ all -> 0x0259 }
            java.util.Iterator r15 = r11.iterator()     // Catch:{ all -> 0x0259 }
        L_0x022d:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0259 }
            if (r0 == 0) goto L_0x0257
            java.lang.Object r14 = r15.next()     // Catch:{ all -> 0x0259 }
            X.4Yu r14 = (X.C266414Yu) r14     // Catch:{ all -> 0x0259 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0259 }
            r13.<init>()     // Catch:{ all -> 0x0259 }
            long r0 = r14.A01     // Catch:{ all -> 0x0259 }
            r13.append(r0)     // Catch:{ all -> 0x0259 }
            java.lang.String r0 = ","
            r13.append(r0)     // Catch:{ all -> 0x0259 }
            long r0 = r14.A00     // Catch:{ all -> 0x0259 }
            r13.append(r0)     // Catch:{ all -> 0x0259 }
            java.lang.String r1 = r13.toString()     // Catch:{ all -> 0x0259 }
            java.lang.String r0 = "Stall"
            r2.A01(r9, r0, r1)     // Catch:{ all -> 0x0259 }
            goto L_0x022d
        L_0x0257:
            monitor-exit(r11)     // Catch:{ all -> 0x0259 }
            goto L_0x025f
        L_0x0259:
            r1 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0259 }
            throw r1
        L_0x025c:
            r1 = move-exception
            monitor-exit(r11)
            throw r1
        L_0x025f:
            X.4Mw r11 = r3.A0F
            X.274 r13 = r11.A08
            java.lang.String r14 = ""
            java.lang.String r9 = "HeroPlayerInternal"
            if (r13 != 0) goto L_0x0351
            java.lang.String r0 = "HeroServiceDisconnected"
            r2.A01(r9, r0, r14)
        L_0x026e:
            android.view.Surface r0 = r11.A0C
            if (r0 != 0) goto L_0x0345
            r1 = r14
        L_0x0273:
            java.lang.String r0 = "mSurface"
            r2.A01(r9, r0, r1)
            android.view.Surface r0 = r11.A0C
            java.lang.String r1 = "false"
            if (r0 != 0) goto L_0x0339
            r13 = r1
        L_0x027f:
            java.lang.String r0 = "mSurfaceValid"
            r2.A01(r9, r0, r13)
            android.view.Surface r0 = r11.A06
            if (r0 == 0) goto L_0x0290
            int r0 = r0.hashCode()
            java.lang.String r14 = java.lang.String.valueOf(r0)
        L_0x0290:
            java.lang.String r0 = "mLastSentSurface"
            r2.A01(r9, r0, r14)
            android.view.Surface r0 = r11.A06
            if (r0 == 0) goto L_0x02a1
            boolean r0 = r0.isValid()
            java.lang.String r1 = java.lang.String.valueOf(r0)
        L_0x02a1:
            java.lang.String r0 = "mLastSentSurfaceValid"
            r2.A01(r9, r0, r1)
            boolean r0 = r11.A0A
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "mShouldPlay"
            r2.A01(r9, r0, r1)
            int r0 = r11.A01
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "mSeekTimeMs"
            r2.A01(r9, r0, r1)
            int r0 = r11.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "mRelativePositionMs"
            r2.A01(r9, r0, r1)
            long r0 = r11.A04
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "mAbsolutePositionBeforeCrash"
            r2.A01(r9, r0, r1)
            long r0 = r11.A05
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "mRelativePositionBeforeCrash"
            r2.A01(r9, r0, r1)
            boolean r0 = r11.A09
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "mEnsureAndRecoverServicePlayerNeeded"
            r2.A01(r9, r0, r1)
            X.4OI r0 = r11.A07
            if (r0 == 0) goto L_0x0331
            r2.A00(r0)
            X.3uU r0 = r0.A0K
            r2.A00(r0)
        L_0x02f4:
            java.util.concurrent.atomic.AtomicReference r0 = r3.A0B
            java.lang.Object r0 = r0.get()
            r2.A00(r0)
            java.util.concurrent.atomic.AtomicReference r0 = r3.A0N
            java.lang.Object r0 = r0.get()
            r2.A00(r0)
        L_0x0306:
            X.5f3 r2 = r8.A0F
            if (r2 == 0) goto L_0x03b0
            X.4Mt r0 = r2.A00
            if (r0 == 0) goto L_0x03b0
            java.lang.Integer r9 = X.AnonymousClass05K.A0k
            java.util.Set r1 = X.C263634Mt.A0Z
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            java.util.Iterator r3 = r0.iterator()
            r1 = 0
        L_0x031c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x037b
            java.lang.Object r0 = r3.next()
            X.4Mt r0 = (X.C263634Mt) r0
            boolean r0 = r0.A0J()
            if (r0 == 0) goto L_0x031c
            int r1 = r1 + 1
            goto L_0x031c
        L_0x0331:
            java.lang.String r1 = "Error"
            java.lang.String r0 = "PlayerRequestNotExist"
            r2.A01(r9, r1, r0)
            goto L_0x02f4
        L_0x0339:
            android.view.Surface r0 = r11.A0C
            boolean r0 = r0.isValid()
            java.lang.String r13 = java.lang.String.valueOf(r0)
            goto L_0x027f
        L_0x0345:
            android.view.Surface r0 = r11.A0C
            int r0 = r0.hashCode()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            goto L_0x0273
        L_0x0351:
            int r0 = r13.hashCode()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "ServiceApi"
            r2.A01(r9, r0, r1)
            X.29t r0 = r13.A06
            if (r0 == 0) goto L_0x0371
            X.2OG r0 = r0.A02
            if (r0 == 0) goto L_0x0373
            java.lang.Object r13 = r0.A01
            monitor-enter(r13)
            X.3mY r0 = r0.A00     // Catch:{ all -> 0x04e0 }
            java.lang.String r1 = r0.A07()     // Catch:{ all -> 0x04e0 }
            monitor-exit(r13)     // Catch:{ all -> 0x04e0 }
            goto L_0x0374
        L_0x0371:
            r1 = r14
            goto L_0x0374
        L_0x0373:
            r1 = r14
        L_0x0374:
            java.lang.String r0 = "LockedSpanStatus"
            r2.A01(r9, r0, r1)
            goto L_0x026e
        L_0x037b:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            r7.A00(r9, r0)
            java.lang.Integer r3 = X.AnonymousClass05K.A0J
            X.4Mt r0 = r2.A00
            r1 = 0
            if (r0 == 0) goto L_0x04d7
            float r0 = r0.A0Q
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x038f:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.A00(r3, r0)
            X.4Mt r0 = r2.A00
            if (r0 == 0) goto L_0x03a0
            float r0 = r0.A0Q
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
        L_0x03a0:
            r0 = 0
            boolean r0 = X.0qQ.A0I(r1, r0)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "VideoFlytrapLogger"
            java.lang.String r0 = "Muted"
            r7.A01(r1, r0, r3)
        L_0x03b0:
            java.lang.Integer r1 = X.AnonymousClass05K.A0m
            java.lang.String r0 = "PostCollect"
            r7.A00(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            r7.A00(r0, r4)
            java.lang.Integer r1 = X.AnonymousClass05K.A0j
            java.lang.String r0 = r8.CE4()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = X.2Bs.A00(r0)
            r7.A00(r1, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A15
            X.4Nl r0 = r8.A0O
            if (r0 == 0) goto L_0x04d4
            boolean r0 = r0.A05
        L_0x03d5:
            r0 = r0 ^ 1
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.A00(r1, r0)
            X.4MM r0 = r8.A0K
            if (r0 == 0) goto L_0x0434
            X.3uU r9 = r0.A0I
            if (r9 == 0) goto L_0x0434
            java.lang.Integer r1 = X.AnonymousClass05K.A04
            X.3uR r0 = r9.A07
            java.lang.String r8 = "null"
            if (r0 != 0) goto L_0x04ce
            r0 = r8
        L_0x03ef:
            r7.A00(r1, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A05
            java.lang.String r0 = r9.A0B
            if (r0 != 0) goto L_0x04c8
            r0 = r8
        L_0x03f9:
            r7.A00(r1, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0B
            boolean r0 = r9.A0N
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.A00(r1, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0D
            r4 = 0
            java.lang.String r0 = java.lang.String.valueOf(r4)
            r7.A00(r1, r0)
            java.lang.Integer r3 = X.AnonymousClass05K.A0E
            java.lang.String r1 = r9.A09
            if (r1 == 0) goto L_0x0420
            java.lang.String r0 = "ContentProtection"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0420
            r4 = 1
        L_0x0420:
            java.lang.String r0 = java.lang.String.valueOf(r4)
            r7.A00(r3, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0G
            X.3uT r0 = r9.A06
            if (r0 == 0) goto L_0x0431
            java.lang.String r8 = r0.name()
        L_0x0431:
            r7.A00(r1, r8)
        L_0x0434:
            if (r2 == 0) goto L_0x0548
            X.5f0 r0 = r2.A04
            X.0KF.A00(r0)
            X.4Mt r0 = r2.A00
            X.0KF.A00(r0)
            r2.hashCode()
            X.4Mt r0 = r2.A00
            if (r0 == 0) goto L_0x04eb
            java.lang.Integer r3 = X.AnonymousClass05K.A0Z
            long r0 = r0.A0S
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.A00(r3, r0)
            java.lang.Integer r3 = X.AnonymousClass05K.A0M
            X.4Mt r0 = r2.A00
            if (r0 == 0) goto L_0x04c5
            long r0 = r0.A09()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0464:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.A00(r3, r0)
            java.lang.Integer r4 = X.AnonymousClass05K.A0O
            X.4Mt r0 = r2.A00
            if (r0 == 0) goto L_0x04c2
            java.util.concurrent.atomic.AtomicReference r0 = r0.A0B
            java.lang.Object r0 = r0.get()
            X.4Mx r0 = (X.C263674Mx) r0
            long r0 = r0.A09
            r8 = 0
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x0483
            r0 = -1
        L_0x0483:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0487:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.A00(r4, r0)
            java.lang.Integer r3 = X.AnonymousClass05K.A12
            X.4Mt r0 = r2.A00
            if (r0 == 0) goto L_0x04bf
            java.lang.String r1 = r0.A0W
            if (r1 == 0) goto L_0x04a9
            X.4Mw r0 = r0.A0F
            X.4OI r0 = r0.A07
            if (r0 == 0) goto L_0x04a9
            X.3uU r0 = r0.A0K
            java.lang.String r0 = r0.A0G
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 != 0) goto L_0x04aa
        L_0x04a9:
            r0 = 0
        L_0x04aa:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x04ae:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.A00(r3, r0)
            java.lang.Integer r3 = X.AnonymousClass05K.A0X
            X.4Mt r0 = r2.A00
            if (r0 == 0) goto L_0x04e4
            X.4N7 r1 = r0.A05
            monitor-enter(r1)
            goto L_0x04da
        L_0x04bf:
            r0 = r16
            goto L_0x04ae
        L_0x04c2:
            r0 = r16
            goto L_0x0487
        L_0x04c5:
            r0 = r16
            goto L_0x0464
        L_0x04c8:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L_0x03f9
        L_0x04ce:
            java.lang.String r0 = r0.name()
            goto L_0x03ef
        L_0x04d4:
            r0 = 0
            goto L_0x03d5
        L_0x04d7:
            r0 = r1
            goto L_0x038f
        L_0x04da:
            java.lang.String r16 = ""
            goto L_0x04e3
        L_0x04dd:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x04e0:
            r1 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x04e0 }
            throw r1
        L_0x04e3:
            monitor-exit(r1)
        L_0x04e4:
            java.lang.String r0 = java.lang.String.valueOf(r16)
            r7.A00(r3, r0)
        L_0x04eb:
            java.lang.Integer r1 = X.AnonymousClass05K.A02
            java.util.concurrent.atomic.AtomicReference r0 = r2.A06
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            r7.A00(r1, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A03
            java.util.concurrent.atomic.AtomicReference r0 = r2.A05
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            r7.A00(r1, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0R
            X.4Yf r0 = r2.A02
            java.lang.String r3 = "Unset"
            if (r0 != 0) goto L_0x05ef
            r0 = r3
        L_0x050e:
            r7.A00(r1, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0S
            X.4Yf r0 = r2.A01
            if (r0 != 0) goto L_0x05e7
            r0 = r3
        L_0x0518:
            r7.A00(r1, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0P
            X.4Yf r0 = r2.A02
            if (r0 != 0) goto L_0x05df
            r0 = r3
        L_0x0522:
            r7.A00(r1, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0Q
            X.4Yf r0 = r2.A01
            if (r0 != 0) goto L_0x05d7
            r0 = r3
        L_0x052c:
            r7.A00(r1, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A07
            X.4Yf r0 = r2.A02
            if (r0 != 0) goto L_0x05cf
            r0 = r3
        L_0x0536:
            r7.A00(r1, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A08
            X.4Yf r0 = r2.A01
            if (r0 == 0) goto L_0x0545
            java.lang.String r0 = r0.A06
            java.lang.String r3 = java.lang.String.valueOf(r0)
        L_0x0545:
            r7.A00(r1, r3)
        L_0x0548:
            java.util.List r0 = r10.Bd9()
            java.util.ArrayList r3 = X.FFB.A00(r5, r0)
            java.util.List r0 = r10.BdD()
            java.util.ArrayList r8 = X.FFB.A00(r5, r0)
            java.util.List r0 = r10.Bxa()
            java.util.ArrayList r4 = X.FFB.A00(r5, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            boolean r0 = r10.CJy()
            if (r0 == 0) goto L_0x058b
            java.lang.String r0 = "flytrap timestamp:"
            r2.append(r0)
            long r0 = r10.Aua()
            r2.append(r0)
            java.lang.String r0 = "\n\n"
            r2.append(r0)
            java.lang.String r0 = "PLAYBACK ERRORS"
            X.FFB.A01(r0, r2, r3)
            java.lang.String r0 = "PLAYBACK WARNINGS"
            X.FFB.A01(r0, r2, r8)
            java.lang.String r0 = "SOFT ERRORS"
            X.FFB.A01(r0, r2, r4)
        L_0x058b:
            java.lang.String r9 = r2.toString()
            X.0qQ.A07(r9)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r1 = r9.length()
            r0 = 0
            if (r1 != 0) goto L_0x059f
            r0 = 1
        L_0x059f:
            java.lang.String r2 = "\n"
            if (r0 != 0) goto L_0x05a9
            r5.append(r9)
            r5.append(r2)
        L_0x05a9:
            java.util.List r1 = r7.A02
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x05f7
            java.lang.String r0 = "VIDEO COMPONENT SNAPSHOTS\n\n"
            r5.append(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x05ba:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x05f7
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = r0.toString()
            r5.append(r0)
            r5.append(r2)
            goto L_0x05ba
        L_0x05cf:
            java.lang.String r0 = r0.A06
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L_0x0536
        L_0x05d7:
            java.lang.String r0 = r0.A0D
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L_0x052c
        L_0x05df:
            java.lang.String r0 = r0.A0D
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L_0x0522
        L_0x05e7:
            java.lang.String r0 = r0.A07
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L_0x0518
        L_0x05ef:
            java.lang.String r0 = r0.A07
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L_0x050e
        L_0x05f7:
            int r0 = r5.length()
            if (r0 <= 0) goto L_0x060e
            java.lang.String r2 = r5.toString()
            X.0qQ.A07(r2)
            java.util.List r1 = r7.A03
            X.S0T r0 = new X.S0T
            r0.<init>(r2)
            r1.add(r0)
        L_0x060e:
            java.util.List r0 = r7.A01
            java.util.List r5 = r7.A00
            java.util.Iterator r9 = r0.iterator()
        L_0x0616:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x073e
            java.lang.Object r2 = r9.next()
            X.Rrz r2 = (X.C10423Rrz) r2
            java.lang.Integer r0 = r2.A00
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x0635;
                case 1: goto L_0x073a;
                case 2: goto L_0x0736;
                case 3: goto L_0x0732;
                case 4: goto L_0x072e;
                case 5: goto L_0x072a;
                case 6: goto L_0x0726;
                case 7: goto L_0x0722;
                case 8: goto L_0x071e;
                case 9: goto L_0x071a;
                case 10: goto L_0x0716;
                case 11: goto L_0x0712;
                case 12: goto L_0x070e;
                case 13: goto L_0x070a;
                case 14: goto L_0x0706;
                case 15: goto L_0x0702;
                case 16: goto L_0x06fe;
                case 17: goto L_0x06fa;
                case 18: goto L_0x06f6;
                case 19: goto L_0x06f2;
                case 20: goto L_0x06ee;
                case 21: goto L_0x06ea;
                case 22: goto L_0x06e6;
                case 23: goto L_0x06e2;
                case 24: goto L_0x06de;
                case 25: goto L_0x06d6;
                case 26: goto L_0x06d2;
                case 27: goto L_0x06ce;
                case 28: goto L_0x06ca;
                case 29: goto L_0x06c6;
                case 30: goto L_0x06be;
                case 31: goto L_0x06ba;
                case 32: goto L_0x06b6;
                case 33: goto L_0x06b2;
                case 34: goto L_0x06ae;
                case 35: goto L_0x06ab;
                case 36: goto L_0x06a8;
                case 37: goto L_0x06a5;
                case 38: goto L_0x06a2;
                case 39: goto L_0x069f;
                case 40: goto L_0x069c;
                case 41: goto L_0x0699;
                case 42: goto L_0x0696;
                case 43: goto L_0x0693;
                case 44: goto L_0x0690;
                case 45: goto L_0x068d;
                case 46: goto L_0x068a;
                case 47: goto L_0x0687;
                case 48: goto L_0x0684;
                case 49: goto L_0x0681;
                case 50: goto L_0x067e;
                case 51: goto L_0x067b;
                case 52: goto L_0x0678;
                case 53: goto L_0x0675;
                case 54: goto L_0x0672;
                case 55: goto L_0x066f;
                case 56: goto L_0x066c;
                case 57: goto L_0x0669;
                case 58: goto L_0x0666;
                case 59: goto L_0x0663;
                case 60: goto L_0x0660;
                case 61: goto L_0x065d;
                case 62: goto L_0x065a;
                case 63: goto L_0x0657;
                case 64: goto L_0x0654;
                case 65: goto L_0x0651;
                case 66: goto L_0x064e;
                case 67: goto L_0x064b;
                case 68: goto L_0x0648;
                case 69: goto L_0x0645;
                case 70: goto L_0x0642;
                case 71: goto L_0x063f;
                case 72: goto L_0x0638;
                default: goto L_0x062b;
            }
        L_0x062b:
            java.lang.String r1 = "orientation"
        L_0x062d:
            java.lang.String r0 = r2.A01
            if (r0 == 0) goto L_0x0616
            r6.put(r1, r0)
            goto L_0x0616
        L_0x0635:
            java.lang.String r1 = "playerOrigin"
            goto L_0x062d
        L_0x0638:
            r0 = 5201(0x1451, float:7.288E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            goto L_0x062d
        L_0x063f:
            java.lang.String r1 = "screenWidth"
            goto L_0x062d
        L_0x0642:
            java.lang.String r1 = "playerHeight"
            goto L_0x062d
        L_0x0645:
            java.lang.String r1 = "playerWidth"
            goto L_0x062d
        L_0x0648:
            java.lang.String r1 = "isApiBroadcast"
            goto L_0x062d
        L_0x064b:
            java.lang.String r1 = "wasWarmedUp"
            goto L_0x062d
        L_0x064e:
            java.lang.String r1 = "playbackErrorMessages"
            goto L_0x062d
        L_0x0651:
            java.lang.String r1 = "playbackSoftErrorMessages"
            goto L_0x062d
        L_0x0654:
            java.lang.String r1 = "playbackWarningMessages"
            goto L_0x062d
        L_0x0657:
            java.lang.String r1 = "lastPlaybackError"
            goto L_0x062d
        L_0x065a:
            java.lang.String r1 = "playbackErrors"
            goto L_0x062d
        L_0x065d:
            java.lang.String r1 = "playbackWarnings"
            goto L_0x062d
        L_0x0660:
            java.lang.String r1 = "audioShorterThanVideoEventFired"
            goto L_0x062d
        L_0x0663:
            java.lang.String r1 = "audioTrackInitFailedEventFired"
            goto L_0x062d
        L_0x0666:
            java.lang.String r1 = "audioTrackInitFailedVideoOnlyFallback"
            goto L_0x062d
        L_0x0669:
            java.lang.String r1 = "noAudioMessageVisibility"
            goto L_0x062d
        L_0x066c:
            java.lang.String r1 = "noAudioMessageShown"
            goto L_0x062d
        L_0x066f:
            java.lang.String r1 = "videoAspectRatio"
            goto L_0x062d
        L_0x0672:
            java.lang.String r1 = "numOfAudioSamples"
            goto L_0x062d
        L_0x0675:
            java.lang.String r1 = "audioAvgValue"
            goto L_0x062d
        L_0x0678:
            java.lang.String r1 = "flytrapEntryCollectType"
            goto L_0x062d
        L_0x067b:
            java.lang.String r1 = "playerReuseState"
            goto L_0x062d
        L_0x067e:
            java.lang.String r1 = "numOfPlayingPlayers"
            goto L_0x062d
        L_0x0681:
            java.lang.String r1 = "playerViewIsInvalid"
            goto L_0x062d
        L_0x0684:
            java.lang.String r1 = "surfaceIsValid"
            goto L_0x062d
        L_0x0687:
            java.lang.String r1 = "surfaceType"
            goto L_0x062d
        L_0x068a:
            java.lang.String r1 = "surfaceState"
            goto L_0x062d
        L_0x068d:
            java.lang.String r1 = "surfaceHasInvisibleParent"
            goto L_0x062d
        L_0x0690:
            java.lang.String r1 = "fbvpSessionId"
            goto L_0x062d
        L_0x0693:
            java.lang.String r1 = "fbGrootPlayerIsReleased"
            goto L_0x062d
        L_0x0696:
            java.lang.String r1 = "fbGrootPlayerHashCode"
            goto L_0x062d
        L_0x0699:
            java.lang.String r1 = "richVideoPlayerHashCode"
            goto L_0x062d
        L_0x069c:
            java.lang.String r1 = "heroPlayerId"
            goto L_0x062d
        L_0x069f:
            java.lang.String r1 = "playerActions"
            goto L_0x062d
        L_0x06a2:
            java.lang.String r1 = "surfaceActions"
            goto L_0x062d
        L_0x06a5:
            java.lang.String r1 = "vpsConnectionStatus"
            goto L_0x062d
        L_0x06a8:
            java.lang.String r1 = "soundToggleContainerState"
            goto L_0x062d
        L_0x06ab:
            java.lang.String r1 = "audioFocusStatus"
            goto L_0x062d
        L_0x06ae:
            java.lang.String r1 = "audioEncodingTag"
            goto L_0x062d
        L_0x06b2:
            java.lang.String r1 = "videoEncodingTag"
            goto L_0x062d
        L_0x06b6:
            java.lang.String r1 = "audioRepresentationId"
            goto L_0x062d
        L_0x06ba:
            java.lang.String r1 = "videoRepresentationId"
            goto L_0x062d
        L_0x06be:
            r0 = 644(0x284, float:9.02E-43)
            java.lang.String r1 = X.Pxd.A00(r0)
            goto L_0x062d
        L_0x06c6:
            java.lang.String r1 = "videoDuration"
            goto L_0x062d
        L_0x06ca:
            java.lang.String r1 = "mutedSegments"
            goto L_0x062d
        L_0x06ce:
            java.lang.String r1 = "hasMutedSegments"
            goto L_0x062d
        L_0x06d2:
            java.lang.String r1 = "playerVolume"
            goto L_0x062d
        L_0x06d6:
            r0 = 751(0x2ef, float:1.052E-42)
            java.lang.String r1 = X.C66579MXk.A00(r0)
            goto L_0x062d
        L_0x06de:
            java.lang.String r1 = "streamingFormat"
            goto L_0x062d
        L_0x06e2:
            java.lang.String r1 = "contentType"
            goto L_0x062d
        L_0x06e6:
            java.lang.String r1 = "videoCreatorId"
            goto L_0x062d
        L_0x06ea:
            java.lang.String r1 = "isProtected"
            goto L_0x062d
        L_0x06ee:
            java.lang.String r1 = "isAdBreak"
            goto L_0x062d
        L_0x06f2:
            java.lang.String r1 = "isSponsored"
            goto L_0x062d
        L_0x06f6:
            java.lang.String r1 = "isPredictiveDash"
            goto L_0x062d
        L_0x06fa:
            java.lang.String r1 = "isLowLatency"
            goto L_0x062d
        L_0x06fe:
            java.lang.String r1 = "audioCodec"
            goto L_0x062d
        L_0x0702:
            java.lang.String r1 = "videoCodec"
            goto L_0x062d
        L_0x0706:
            java.lang.String r1 = "videoChainingDepthLevel"
            goto L_0x062d
        L_0x070a:
            java.lang.String r1 = "playerSubOrigin"
            goto L_0x062d
        L_0x070e:
            java.lang.String r1 = "videoType"
            goto L_0x062d
        L_0x0712:
            java.lang.String r1 = "audioDecoderName"
            goto L_0x062d
        L_0x0716:
            java.lang.String r1 = "videoDecoderName"
            goto L_0x062d
        L_0x071a:
            java.lang.String r1 = "audioTrackAvailable"
            goto L_0x062d
        L_0x071e:
            java.lang.String r1 = "audioAvailability"
            goto L_0x062d
        L_0x0722:
            java.lang.String r1 = "isNoAudio"
            goto L_0x062d
        L_0x0726:
            java.lang.String r1 = "playerVersion"
            goto L_0x062d
        L_0x072a:
            java.lang.String r1 = "playingVideoId"
            goto L_0x062d
        L_0x072e:
            java.lang.String r1 = "isVideoBroadcast"
            goto L_0x062d
        L_0x0732:
            java.lang.String r1 = "isLiveStreaming"
            goto L_0x062d
        L_0x0736:
            java.lang.String r1 = "playReason"
            goto L_0x062d
        L_0x073a:
            java.lang.String r1 = "playerType"
            goto L_0x062d
        L_0x073e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.util.Iterator r1 = r5.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x075b
            r1.next()
            r2.length()
            java.lang.String r0 = "getKey"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L_0x075b:
            X.FFB.A03(r2, r8)
            X.FFB.A03(r2, r4)
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0770
            java.lang.String r1 = "playbackWarnings"
            java.lang.String r0 = r2.toString()
            r6.put(r1, r0)
        L_0x0770:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            X.FFB.A03(r2, r3)
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0787
            java.lang.String r1 = "playbackErrors"
            java.lang.String r0 = r2.toString()
            r6.put(r1, r0)
        L_0x0787:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x07a0
            java.lang.String r1 = "lastPlaybackError"
            int r0 = r3.size()
            int r0 = r0 + -1
            java.lang.Object r0 = r3.get(r0)
            X.F2B r0 = (X.F2B) r0
            java.lang.String r0 = r0.A02
            r6.put(r1, r0)
        L_0x07a0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            X.FFB.A02(r2, r8)
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x07b7
            java.lang.String r1 = "playbackWarningMessages"
            java.lang.String r0 = r2.toString()
            r6.put(r1, r0)
        L_0x07b7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            X.FFB.A02(r2, r4)
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x07ce
            java.lang.String r1 = "playbackSoftErrorMessages"
            java.lang.String r0 = r2.toString()
            r6.put(r1, r0)
        L_0x07ce:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            X.FFB.A02(r2, r3)
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x07e5
            java.lang.String r1 = "playbackErrorMessages"
            java.lang.String r0 = r2.toString()
            r6.put(r1, r0)
        L_0x07e5:
            java.util.List r1 = r7.A03
            X.CtT r0 = new X.CtT
            r0.<init>(r1, r6)
            r12.A01 = r0
            java.util.Map r0 = r0.A01
            r0.toString()
            return r0
        L_0x07f4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C263804Nk.B3T():java.util.Map");
    }

    public final String getTag() {
        return this.A03;
    }

    public final void onSessionWillEnd() {
        C242853Wg.A00(this.A02).A00(this);
        this.A01 = null;
    }

    public C263804Nk(UserSession userSession) {
        this.A02 = userSession;
        C242863Wh A002 = C242853Wg.A00(userSession);
        A002.A00.add(new WeakReference(this));
        28c.A00(userSession).A00(this);
        this.A03 = "VideoPlayerFlytrapExtrasProvider";
    }
}
