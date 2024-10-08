package X;

import android.util.Pair;
import com.facebook.mediastreaming.opt.source.audio.AndroidAudioRecorder;

/* renamed from: X.Wly  reason: case insensitive filesystem */
public final class C20138Wly implements Runnable {
    public final /* synthetic */ Pair A00;
    public final /* synthetic */ AndroidAudioRecorder A01;

    public C20138Wly(Pair pair, AndroidAudioRecorder androidAudioRecorder) {
        this.A01 = androidAudioRecorder;
        this.A00 = pair;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009c, code lost:
        if (r3 < 0) goto L_0x009e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r24 = this;
            java.lang.String r6 = "mss:AndroidAudioRecorder"
            r1 = r24
            com.facebook.mediastreaming.opt.source.audio.AndroidAudioRecorder r5 = r1.A01
            X.V65 r0 = com.facebook.mediastreaming.opt.source.audio.AndroidAudioRecorder.Companion
            int r0 = r5.audioThreadPriority
            android.os.Process.setThreadPriority(r0)
            X.0JR r11 = r5.monotonicClock     // Catch:{ Exception -> 0x0147 }
            r12 = 0
            r10 = 1
            X.0qQ.A0B(r11, r10)     // Catch:{ Exception -> 0x0147 }
            long r22 = r11.now()     // Catch:{ Exception -> 0x0147 }
            r13 = 0
            android.util.Pair r9 = r1.A00     // Catch:{ Exception -> 0x0147 }
            java.lang.Object r0 = r9.second     // Catch:{ Exception -> 0x0147 }
            X.0qQ.A06(r0)     // Catch:{ Exception -> 0x0147 }
            int r0 = X.AnonymousClass7TE.A0M(r0)     // Catch:{ Exception -> 0x0147 }
            r8 = 2048(0x800, float:2.87E-42)
            if (r8 <= r0) goto L_0x002a
            r8 = r0
        L_0x002a:
            boolean r0 = r5.enableStereo     // Catch:{ Exception -> 0x0147 }
            r1 = 1
            if (r0 == 0) goto L_0x0030
            r1 = 2
        L_0x0030:
            int r0 = r5.sampleRate     // Catch:{ Exception -> 0x0147 }
            int r7 = r8 * 1000
            int r0 = r0 * 2
            int r0 = r0 * r1
            int r7 = r7 / r0
            java.nio.ByteBuffer r21 = java.nio.ByteBuffer.allocateDirect(r8)     // Catch:{ Exception -> 0x0147 }
        L_0x003c:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.isRecordingAudioData     // Catch:{ Exception -> 0x0147 }
            boolean r0 = r0.get()     // Catch:{ Exception -> 0x0147 }
            if (r0 == 0) goto L_0x013e
            com.facebook.mediastreaming.opt.source.audio.AndroidAudioInputHost r4 = r5.host     // Catch:{ Exception -> 0x0147 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.isStreamingAudioData     // Catch:{ Exception -> 0x0147 }
            boolean r15 = r0.get()     // Catch:{ Exception -> 0x0147 }
            if (r4 == 0) goto L_0x0056
            if (r15 == 0) goto L_0x0056
            java.nio.ByteBuffer r1 = r4.acquireAudioSampleBuffer()     // Catch:{ Exception -> 0x0147 }
            if (r1 != 0) goto L_0x0058
        L_0x0056:
            r1 = r21
        L_0x0058:
            X.0qQ.A0A(r1)     // Catch:{ Exception -> 0x0147 }
            X.0JR r0 = r5.monotonicClock     // Catch:{ Exception -> 0x0147 }
            long r19 = r0.now()     // Catch:{ Exception -> 0x0147 }
            java.lang.Object r3 = r9.first     // Catch:{ Exception -> 0x0147 }
            android.media.AudioRecord r3 = (android.media.AudioRecord) r3     // Catch:{ Exception -> 0x0147 }
            int r2 = r1.remaining()     // Catch:{ Exception -> 0x0147 }
            r0 = r8
            if (r8 <= r2) goto L_0x006d
            r0 = r2
        L_0x006d:
            int r3 = r3.read(r1, r0)     // Catch:{ Exception -> 0x0147 }
            if (r15 != 0) goto L_0x007a
            long r22 = r11.now()     // Catch:{ Exception -> 0x0147 }
            r13 = 0
            goto L_0x003c
        L_0x007a:
            long r15 = r11.now()     // Catch:{ Exception -> 0x0147 }
            if (r3 <= 0) goto L_0x0082
            r22 = r15
        L_0x0082:
            r17 = 3000(0xbb8, double:1.482E-320)
            long r15 = r11.now()     // Catch:{ Exception -> 0x0147 }
            long r15 = r15 - r22
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            boolean r16 = X.AnonymousClass7TF.A1R(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.muteOn     // Catch:{ Exception -> 0x0147 }
            boolean r0 = r0.get()     // Catch:{ Exception -> 0x0147 }
            if (r0 != 0) goto L_0x009e
            if (r16 != 0) goto L_0x009e
            r17 = 0
            if (r3 >= 0) goto L_0x00dd
        L_0x009e:
            r17 = 1
            java.nio.ByteBuffer r0 = r5.muteData     // Catch:{ Exception -> 0x0147 }
            if (r0 != 0) goto L_0x00ac
            r0 = 2048(0x800, float:2.87E-42)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)     // Catch:{ Exception -> 0x0147 }
            r5.muteData = r0     // Catch:{ Exception -> 0x0147 }
        L_0x00ac:
            r1.clear()     // Catch:{ Exception -> 0x0147 }
        L_0x00af:
            boolean r0 = r1.hasRemaining()     // Catch:{ Exception -> 0x0147 }
            if (r0 == 0) goto L_0x00da
            java.nio.ByteBuffer r15 = r5.muteData     // Catch:{ Exception -> 0x0147 }
            if (r15 == 0) goto L_0x00cd
            int r2 = r1.remaining()     // Catch:{ Exception -> 0x0147 }
            java.nio.ByteBuffer r0 = r5.muteData     // Catch:{ Exception -> 0x0147 }
            if (r0 == 0) goto L_0x00c6
            int r0 = r0.capacity()     // Catch:{ Exception -> 0x0147 }
            goto L_0x00c7
        L_0x00c6:
            r0 = 0
        L_0x00c7:
            if (r2 <= r0) goto L_0x00ca
            r2 = r0
        L_0x00ca:
            r15.limit(r2)     // Catch:{ Exception -> 0x0147 }
        L_0x00cd:
            java.nio.ByteBuffer r0 = r5.muteData     // Catch:{ Exception -> 0x0147 }
            r1.put(r0)     // Catch:{ Exception -> 0x0147 }
            java.nio.ByteBuffer r0 = r5.muteData     // Catch:{ Exception -> 0x0147 }
            if (r0 == 0) goto L_0x00af
            r0.clear()     // Catch:{ Exception -> 0x0147 }
            goto L_0x00af
        L_0x00da:
            r1.flip()     // Catch:{ Exception -> 0x0147 }
        L_0x00dd:
            if (r4 == 0) goto L_0x00e5
            r0 = -1
            r2 = 0
            r4.audioSampleBufferFilled(r3, r2, r0)     // Catch:{ Exception -> 0x0147 }
        L_0x00e5:
            if (r16 == 0) goto L_0x011e
            java.lang.Object r2 = r9.first     // Catch:{ Exception -> 0x0147 }
            X.0qQ.A06(r2)     // Catch:{ Exception -> 0x0147 }
            android.media.AudioRecord r2 = (android.media.AudioRecord) r2     // Catch:{ Exception -> 0x0147 }
            r1 = 0
            r3 = 0
            int r0 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0101
            long r15 = r11.now()     // Catch:{ IllegalStateException -> 0x0116 }
            long r15 = r15 - r13
            r3 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0101
            goto L_0x011e
        L_0x0101:
            int r0 = r2.getRecordingState()     // Catch:{ IllegalStateException -> 0x0116 }
            if (r0 != r10) goto L_0x011e
            long r13 = r11.now()     // Catch:{ IllegalStateException -> 0x0116 }
            r12 = r12 ^ 1
            r0 = r12 ^ 1
            if (r0 == 0) goto L_0x0112
            goto L_0x0133
        L_0x0112:
            r2.startRecording()     // Catch:{ IllegalStateException -> 0x0116 }
            goto L_0x011e
        L_0x0116:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0147 }
            java.lang.String r0 = "startRecording while recorder is in use"
            X.W3b.A01(r6, r0, r2, r1)     // Catch:{ Exception -> 0x0147 }
        L_0x011e:
            if (r17 == 0) goto L_0x003c
            X.0JR r0 = r5.monotonicClock     // Catch:{ Exception -> 0x0147 }
            long r3 = r0.now()     // Catch:{ Exception -> 0x0147 }
            long r3 = r3 - r19
            long r1 = (long) r7     // Catch:{ Exception -> 0x0147 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x003c
            long r1 = r1 - r3
            java.lang.Thread.sleep(r1)     // Catch:{ Exception -> 0x0147 }
            goto L_0x003c
        L_0x0133:
            java.util.concurrent.Executor r1 = r5.executor     // Catch:{ Exception -> 0x0147 }
            X.WiF r0 = new X.WiF     // Catch:{ Exception -> 0x0147 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x0147 }
            r1.execute(r0)     // Catch:{ Exception -> 0x0147 }
            return
        L_0x013e:
            java.lang.String r1 = "AudioThread stopping"
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0147 }
            X.W3b.A05(r6, r1, r0)     // Catch:{ Exception -> 0x0147 }
            return
        L_0x0147:
            r3 = move-exception
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "AudioThread error"
            X.W3b.A01(r6, r0, r3, r1)
            com.facebook.mediastreaming.opt.source.audio.AndroidAudioInputHost r2 = r5.host
            if (r2 == 0) goto L_0x015b
            X.Uxl r1 = X.C16591Uxl.AudioSourceError
            java.lang.String r0 = "Audio recording failed"
            r2.fireError(r1, r0, r3)
        L_0x015b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20138Wly.run():void");
    }
}
