package X;

import android.os.Handler;

public final class Y33 implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C22146XwA A01;
    public final /* synthetic */ C341737nR A02;

    public Y33(Handler handler, C22146XwA xwA, C341737nR r3) {
        this.A01 = xwA;
        this.A02 = r3;
        this.A00 = handler;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r7 = r5.A04;
        r2 = android.media.MediaFormat.createAudioFormat("audio/mp4a-latm", r7.A08, r7.A03);
        r2.setInteger("aac-profile", 1);
        r2.setInteger(com.facebook.proxygen.TraceFieldType.Bitrate, r7.A01);
        r2.setInteger("max-input-size", 0);
        r2.setInteger("pcm-encoding", r7.A07);
        r5.A01 = X.C9269RVu.A00((android.media.MediaCodec.Callback) null, r2, "audio/mp4a-latm");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007c, code lost:
        r0 = (X.XIJ) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0095, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0096, code lost:
        X.C18091VlL.A01(r3, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0099, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x004d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            X.XwA r5 = r8.A01
            X.7nR r4 = r8.A02
            android.os.Handler r3 = r8.A00
            java.lang.String r6 = "audio/mp4a-latm"
            java.lang.Integer r1 = r5.A08
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x001e
            java.lang.String r1 = "Must only call prepare() on a stopped AudioEncoder. Current state is: "
            java.lang.Integer r0 = r5.A08
            java.lang.String r0 = X.XUR.A00(r0)
            java.lang.IllegalStateException r0 = X.DbW.A0c(r1, r0)
            X.C18091VlL.A01(r3, r4, r0)
            return
        L_0x001e:
            X.7qK r7 = r5.A04     // Catch:{ Exception -> 0x004d }
            int r1 = r7.A08     // Catch:{ Exception -> 0x004d }
            int r0 = r7.A03     // Catch:{ Exception -> 0x004d }
            android.media.MediaFormat r2 = android.media.MediaFormat.createAudioFormat(r6, r1, r0)     // Catch:{ Exception -> 0x004d }
            java.lang.String r1 = "aac-profile"
            r0 = 1
            r2.setInteger(r1, r0)     // Catch:{ Exception -> 0x004d }
            int r1 = r7.A01     // Catch:{ Exception -> 0x004d }
            java.lang.String r0 = "bitrate"
            r2.setInteger(r0, r1)     // Catch:{ Exception -> 0x004d }
            java.lang.String r1 = "max-input-size"
            int r0 = r7.A02     // Catch:{ Exception -> 0x004d }
            if (r0 <= 0) goto L_0x003e
            r2.setInteger(r1, r0)     // Catch:{ Exception -> 0x004d }
        L_0x003e:
            int r1 = r7.A07     // Catch:{ Exception -> 0x004d }
            java.lang.String r0 = "pcm-encoding"
            r2.setInteger(r0, r1)     // Catch:{ Exception -> 0x004d }
            r0 = 0
            android.media.MediaCodec r0 = X.C9269RVu.A00(r0, r2, r6)     // Catch:{ Exception -> 0x004d }
            r5.A01 = r0     // Catch:{ Exception -> 0x004d }
            goto L_0x0078
        L_0x004d:
            X.7qK r7 = r5.A04     // Catch:{ Exception -> 0x0095 }
            int r1 = r7.A08     // Catch:{ Exception -> 0x0095 }
            int r0 = r7.A03     // Catch:{ Exception -> 0x0095 }
            android.media.MediaFormat r2 = android.media.MediaFormat.createAudioFormat(r6, r1, r0)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r1 = "aac-profile"
            r0 = 1
            r2.setInteger(r1, r0)     // Catch:{ Exception -> 0x0095 }
            int r1 = r7.A01     // Catch:{ Exception -> 0x0095 }
            java.lang.String r0 = "bitrate"
            r2.setInteger(r0, r1)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r1 = "max-input-size"
            r0 = 0
            r2.setInteger(r1, r0)     // Catch:{ Exception -> 0x0095 }
            int r1 = r7.A07     // Catch:{ Exception -> 0x0095 }
            java.lang.String r0 = "pcm-encoding"
            r2.setInteger(r0, r1)     // Catch:{ Exception -> 0x0095 }
            r0 = 0
            android.media.MediaCodec r0 = X.C9269RVu.A00(r0, r2, r6)     // Catch:{ Exception -> 0x0095 }
            r5.A01 = r0     // Catch:{ Exception -> 0x0095 }
        L_0x0078:
            boolean r0 = r5 instanceof X.XIK
            if (r0 != 0) goto L_0x008d
            r0 = r5
            X.XIJ r0 = (X.XIJ) r0
            android.media.MediaCodec r2 = r0.A01
            if (r2 == 0) goto L_0x008d
            X.XFv r1 = new X.XFv
            r1.<init>(r0)
            android.os.Handler r0 = r0.A03
            r2.setCallback(r1, r0)
        L_0x008d:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r5.A08 = r0
            X.C18091VlL.A00(r3, r4)
            return
        L_0x0095:
            r0 = move-exception
            X.C18091VlL.A01(r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y33.run():void");
    }
}
