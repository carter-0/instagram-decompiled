package X;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.debughead.util.MemoryUtil;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public final class S3Z {
    public long A00;
    public MediaCodec A01;
    public Surface A02;
    public C13808ThX A03;
    public boolean A04;
    public boolean A05;
    public final long A06;
    public final MediaFormat A07;
    public final Handler A08;
    public final UserSession A09;
    public final C10812RyY A0A;
    public final S4f A0B = new S4f();
    public final S70 A0C;
    public final List A0D;
    public final List A0E = AnonymousClass7TE.A1C();
    public final CountDownLatch A0F = new CountDownLatch(1);
    public final C262224Cq A0G = 19E.A02(19B.A00);

    public S3Z(Handler handler, UserSession userSession, C10812RyY ryY, List list) {
        this.A0D = list;
        this.A0A = ryY;
        this.A08 = handler;
        this.A09 = userSession;
        this.A0C = new S70(userSession, 90000);
        int i = 30;
        try {
            int i2 = 0;
            for (C10641Rva rva : this.A0D) {
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(rva.A02.A0k);
                int trackCount = mediaExtractor.getTrackCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= trackCount) {
                        break;
                    }
                    MediaFormat trackFormat = mediaExtractor.getTrackFormat(i3);
                    String A0a = Pxf.A0a(trackFormat);
                    if (A0a == null || !C66580MXl.A1a("video/", 1, A0a)) {
                        i3++;
                    } else if (trackFormat.containsKey("frame-rate")) {
                        i2 = Math.max(i2, trackFormat.getInteger("frame-rate"));
                    }
                }
                mediaExtractor.release();
            }
            i = Math.min(30, i2 == 0 ? 30 : i2);
        } catch (NullPointerException e) {
            Pxj.A1P(e);
        }
        this.A06 = 1000000 / ((long) i);
        C10812RyY ryY2 = this.A0A;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", ryY2.A05, ryY2.A02);
        0qQ.A07(createVideoFormat);
        createVideoFormat.setInteger(TraceFieldType.Bitrate, MemoryUtil.MAX_ALLOC_SIZE);
        createVideoFormat.setInteger("frame-rate", i);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("i-frame-interval", 5);
        createVideoFormat.setInteger("profile", ryY2.A04);
        createVideoFormat.setInteger("level", ryY2.A03);
        this.A07 = createVideoFormat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        r1 = r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
        r3 = "videoEncoder";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        if (r1 == null) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.0fX.A06(r1, -123315308);
        r1 = r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        if (r1 == null) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
        X.0fX.A03(r1, 735221758);
        r1 = r7.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        if (r1.A03 == false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007d, code lost:
        r1.A03 = false;
        r1.A02.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0085, code lost:
        r7.A0B.A00();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r7 = this;
            java.util.concurrent.CountDownLatch r2 = r7.A0F
            long r5 = r2.getCount()
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0011
            boolean r0 = r7.A05
            if (r0 != 0) goto L_0x0011
            return
        L_0x0011:
            X.ThX r0 = r7.A03     // Catch:{ Exception -> 0x008b }
            if (r0 != 0) goto L_0x001f
            java.lang.String r3 = "audioMerger"
        L_0x0017:
            X.0qQ.A0F(r3)     // Catch:{ Exception -> 0x008b }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ Exception -> 0x008b }
            throw r0     // Catch:{ Exception -> 0x008b }
        L_0x001f:
            r0.cancel()     // Catch:{ Exception -> 0x008b }
            java.util.List r0 = r7.A0E     // Catch:{ Exception -> 0x008b }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ Exception -> 0x008b }
        L_0x0028:
            boolean r0 = r5.hasNext()     // Catch:{ Exception -> 0x008b }
            if (r0 == 0) goto L_0x0060
            java.lang.Object r4 = r5.next()     // Catch:{ Exception -> 0x008b }
            X.Ryh r4 = (X.C10821Ryh) r4     // Catch:{ Exception -> 0x008b }
            android.media.MediaCodec r1 = r4.A04     // Catch:{ Exception -> 0x008b }
            r0 = 1321035835(0x4ebd683b, float:1.58886234E9)
            X.0fX.A06(r1, r0)     // Catch:{ Exception -> 0x008b }
            r0 = 65546416(0x3e828b0, float:1.3645076E-36)
            X.0fX.A03(r1, r0)     // Catch:{ Exception -> 0x008b }
            X.RzB r1 = r4.A06     // Catch:{ Exception -> 0x008b }
            int r0 = r1.A02     // Catch:{ Exception -> 0x008b }
            android.opengl.GLES20.glDeleteProgram(r0)     // Catch:{ Exception -> 0x008b }
            int[] r3 = r1.A07     // Catch:{ Exception -> 0x008b }
            if (r3 != 0) goto L_0x0051
            java.lang.String r3 = "vertexBuffers"
            goto L_0x0017
        L_0x0051:
            r1 = 0
            r0 = 2
            android.opengl.GLES20.glDeleteBuffers(r0, r3, r1)     // Catch:{ Exception -> 0x008b }
            android.os.Handler r0 = r4.A05     // Catch:{ Exception -> 0x008b }
            android.os.Looper r0 = r0.getLooper()     // Catch:{ Exception -> 0x008b }
            r0.quitSafely()     // Catch:{ Exception -> 0x008b }
            goto L_0x0028
        L_0x0060:
            android.media.MediaCodec r1 = r7.A01     // Catch:{ Exception -> 0x008b }
            java.lang.String r3 = "videoEncoder"
            if (r1 == 0) goto L_0x0017
            r0 = -123315308(0xfffffffff8a65b94, float:-2.6993084E34)
            X.0fX.A06(r1, r0)     // Catch:{ Exception -> 0x008b }
            android.media.MediaCodec r1 = r7.A01     // Catch:{ Exception -> 0x008b }
            if (r1 == 0) goto L_0x0017
            r0 = 735221758(0x2bd297fe, float:1.4963584E-12)
            X.0fX.A03(r1, r0)     // Catch:{ Exception -> 0x008b }
            X.S70 r1 = r7.A0C     // Catch:{ Exception -> 0x008b }
            boolean r0 = r1.A03     // Catch:{ Exception -> 0x008b }
            if (r0 == 0) goto L_0x0085
            r0 = 0
            r1.A03 = r0     // Catch:{ Exception -> 0x008b }
            com.facebook.ffmpeg.FFMpegMediaMuxer r0 = r1.A02     // Catch:{ Exception -> 0x008b }
            r0.A01()     // Catch:{ Exception -> 0x008b }
        L_0x0085:
            X.S4f r0 = r7.A0B     // Catch:{ Exception -> 0x008b }
            r0.A00()     // Catch:{ Exception -> 0x008b }
            goto L_0x008f
        L_0x008b:
            r0 = move-exception
            X.Pxj.A1P(r0)
        L_0x008f:
            r2.countDown()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S3Z.A00():void");
    }
}
