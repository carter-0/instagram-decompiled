package X;

import com.facebook.msys.mci.VideoSizeEstimatorCompletionCallback;
import com.facebook.msys.mci.transcoder.DefaultMediaTranscoder;

public final class QQK extends AnonymousClass45Y {
    public final /* synthetic */ long A00;
    public final /* synthetic */ VideoSizeEstimatorCompletionCallback A01;
    public final /* synthetic */ DefaultMediaTranscoder A02;
    public final /* synthetic */ Double A03;
    public final /* synthetic */ Double A04;
    public final /* synthetic */ String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QQK(VideoSizeEstimatorCompletionCallback videoSizeEstimatorCompletionCallback, DefaultMediaTranscoder defaultMediaTranscoder, Double d, Double d2, String str, long j) {
        super("estimateVideoSize");
        this.A02 = defaultMediaTranscoder;
        this.A00 = j;
        this.A05 = str;
        this.A04 = d;
        this.A03 = d2;
        this.A01 = videoSizeEstimatorCompletionCallback;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a9, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00aa, code lost:
        r15.A01.failure(r15.A00, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b1, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a9 A[ExcHandler: IOException | IllegalArgumentException | SecurityException (r3v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            java.lang.String r6 = r15.A05     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            com.facebook.msys.mci.transcoder.DefaultMediaTranscoder r3 = r15.A02     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            X.3xV r0 = r3.A03     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            if (r0 != 0) goto L_0x000a
            r4 = 0
            goto L_0x0015
        L_0x000a:
            android.util.Pair r2 = r0.A02     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            android.util.Pair r1 = r0.A00     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            android.util.Pair r0 = r0.A01     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            X.RuP r4 = new X.RuP     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            r4.<init>(r2, r1, r0)     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
        L_0x0015:
            android.content.Context r1 = r3.A00     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            java.lang.Double r5 = r15.A04     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            java.lang.Double r2 = r15.A03     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            java.lang.String r0 = "transcodeVideo: Error with source Uri"
            java.lang.String r3 = "VideoEstimator"
            r12 = 0
            X.AnonymousClass7TF.A1B(r6, r12, r1)     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            android.net.Uri r0 = X.SKY.A01(r6)     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a4, IOException | IllegalArgumentException | SecurityException -> 0x00a9, IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            X.Q0d r6 = X.SRj.A01(r1, r0, r12)     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            if (r6 == 0) goto L_0x0098
            android.util.Pair r3 = X.SKY.A02(r6, r4)     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            java.lang.Object r0 = r3.first     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            X.0qQ.A06(r0)     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            int r1 = X.AnonymousClass7TE.A0M(r0)     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            java.lang.Object r0 = r3.second     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            X.0qQ.A06(r0)     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            int r0 = X.AnonymousClass7TE.A0M(r0)     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            X.SNc r8 = new X.SNc     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            r8.<init>(r1, r0)     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            r7 = 0
            r10 = 1
            r9 = r7
            r11 = r10
            r13 = r12
            r14 = r12
            X.SOn r11 = X.SSg.A02(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            long r3 = r6.A07     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            long r9 = X.SKY.A00(r5)     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            long r5 = X.SKY.A00(r2)     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0066
            r4 = 0
            goto L_0x007b
        L_0x0066:
            r7 = -1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0070
            long r3 = java.lang.Math.min(r3, r5)     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
        L_0x0070:
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0076
            r9 = 0
        L_0x0076:
            long r3 = r3 - r9
            long r4 = java.lang.Math.max(r1, r3)     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
        L_0x007b:
            int r1 = r11.A01()     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            r0 = 64000(0xfa00, float:8.9683E-41)
            int r1 = r1 + r0
            long r2 = (long) r1     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            float r1 = (float) r2     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            r0 = 1090519040(0x41000000, float:8.0)
            float r1 = r1 / r0
            float r0 = (float) r4     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            float r1 = r1 * r0
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r0
            int r0 = java.lang.Math.round(r1)     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            long r1 = (long) r0     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            com.facebook.msys.mci.VideoSizeEstimatorCompletionCallback r0 = r15.A01     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            r0.success(r1)     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            return
        L_0x0098:
            java.lang.String r0 = "Extract media metadata is null"
            java.io.IOException r1 = X.JTO.A0u(r0)     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            java.lang.String r0 = "estimateVideoSize: input video file not found"
            X.0KC.A0F(r3, r0, r1)     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
            goto L_0x00a8
        L_0x00a4:
            r1 = move-exception
            X.0KC.A0F(r3, r0, r1)     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
        L_0x00a8:
            throw r1     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00a9 }
        L_0x00a9:
            r3 = move-exception
            com.facebook.msys.mci.VideoSizeEstimatorCompletionCallback r2 = r15.A01
            long r0 = r15.A00
            r2.failure(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QQK.run():void");
    }
}
