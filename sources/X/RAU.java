package X;

import com.instagram.common.gallery.Medium;

public final class RAU extends 0ng {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Medium A02;
    public final /* synthetic */ AnonymousClass8ME A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RAU(Medium medium, AnonymousClass8ME r5, long j, long j2) {
        super(469, 3, false, false);
        this.A03 = r5;
        this.A02 = medium;
        this.A01 = j;
        this.A00 = j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012b, code lost:
        throw X.JTO.A0u("Invalid track index!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r27 = this;
            r10 = r27
            X.8ME r0 = r10.A03
            r22 = r0
            android.content.Context r3 = r0.A0f
            java.lang.String r1 = "tmp_video_"
            java.lang.String r0 = X.AnonymousClass7TF.A0b()     // Catch:{ IOException -> 0x001e }
            java.lang.String r2 = X.002.A0R(r1, r0)     // Catch:{ IOException -> 0x001e }
            java.lang.String r1 = ".mp4"
            java.io.File r0 = r3.getCacheDir()     // Catch:{ IOException -> 0x001e }
            java.io.File r21 = java.io.File.createTempFile(r2, r1, r0)     // Catch:{ IOException -> 0x001e }
            goto L_0x002c
        L_0x001e:
            r2 = move-exception
            java.lang.String r1 = "FileUtil"
            java.lang.String r0 = "failed to create temp file"
            X.0KC.A0F(r1, r0, r2)
            java.lang.String r0 = ""
            java.io.File r21 = X.AnonymousClass7TE.A0t(r0)
        L_0x002c:
            java.lang.String r0 = r21.getAbsolutePath()
            int r0 = X.C66580MXl.A06(r0)
            if (r0 <= 0) goto L_0x012c
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            X.RDp r18 = X.C8873RDp.VIDEO
            r0 = r18
            r11.add(r0)
            com.instagram.common.gallery.Medium r0 = r10.A02
            java.lang.String r1 = r0.A0X
            java.lang.String r0 = r21.getAbsolutePath()
            X.0qQ.A07(r0)
            long r2 = r10.A01
            long r14 = r10.A00
            r9 = 0
            X.0qQ.A0B(r1, r9)
            r8 = 1
            android.media.MediaExtractor r7 = new android.media.MediaExtractor     // Catch:{ IOException | IllegalStateException -> 0x012f }
            r7.<init>()     // Catch:{ IOException | IllegalStateException -> 0x012f }
            r7.setDataSource(r1)     // Catch:{ IOException | IllegalStateException -> 0x012f }
            android.media.MediaMuxer r6 = new android.media.MediaMuxer     // Catch:{ IOException | IllegalStateException -> 0x012f }
            r6.<init>(r0, r9)     // Catch:{ IOException | IllegalStateException -> 0x012f }
            int r17 = r7.getTrackCount()     // Catch:{ IOException | IllegalStateException -> 0x012f }
            r20 = -1
            r13 = 0
            r16 = -1
            r5 = -1
            r4 = -1
        L_0x006d:
            r1 = 2
            r0 = r17
            if (r13 >= r0) goto L_0x00b6
            android.media.MediaFormat r12 = r7.getTrackFormat(r13)     // Catch:{ IOException | IllegalStateException -> 0x012f }
            java.lang.String r1 = X.Pxf.A0a(r12)     // Catch:{ IOException | IllegalStateException -> 0x012f }
            if (r1 == 0) goto L_0x00b3
            java.lang.String r0 = "video/"
            boolean r0 = X.C66580MXl.A1a(r0, r8, r1)     // Catch:{ IOException | IllegalStateException -> 0x012f }
            if (r0 == 0) goto L_0x009c
            r0 = r18
            boolean r0 = r11.contains(r0)     // Catch:{ IOException | IllegalStateException -> 0x012f }
            if (r0 == 0) goto L_0x009c
            java.lang.String r0 = "max-input-size"
            int r16 = r12.getInteger(r0)     // Catch:{ IOException | IllegalStateException -> 0x012f }
            r7.selectTrack(r13)     // Catch:{ IOException | IllegalStateException -> 0x012f }
            int r5 = r6.addTrack(r12)     // Catch:{ IOException | IllegalStateException -> 0x012f }
            goto L_0x00b3
        L_0x009c:
            java.lang.String r0 = "audio/"
            boolean r0 = X.C66580MXl.A1a(r0, r8, r1)     // Catch:{ IOException | IllegalStateException -> 0x012f }
            if (r0 == 0) goto L_0x00b3
            X.RDp r0 = X.C8873RDp.AUDIO     // Catch:{ IOException | IllegalStateException -> 0x012f }
            boolean r0 = r11.contains(r0)     // Catch:{ IOException | IllegalStateException -> 0x012f }
            if (r0 == 0) goto L_0x00b3
            r7.selectTrack(r13)     // Catch:{ IOException | IllegalStateException -> 0x012f }
            int r4 = r6.addTrack(r12)     // Catch:{ IOException | IllegalStateException -> 0x012f }
        L_0x00b3:
            int r13 = r13 + 1
            goto L_0x006d
        L_0x00b6:
            if (r16 >= 0) goto L_0x00ba
            r16 = 1048576(0x100000, float:1.469368E-39)
        L_0x00ba:
            r18 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r18
            r7.seekTo(r2, r1)     // Catch:{ IOException | IllegalStateException -> 0x012f }
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r16)     // Catch:{ IOException | IllegalStateException -> 0x012f }
            android.media.MediaCodec$BufferInfo r2 = new android.media.MediaCodec$BufferInfo     // Catch:{ IOException | IllegalStateException -> 0x012f }
            r2.<init>()     // Catch:{ IOException | IllegalStateException -> 0x012f }
            r6.start()     // Catch:{ IOException | IllegalStateException -> 0x012f }
        L_0x00cd:
            r2.offset = r9     // Catch:{ IOException | IllegalStateException -> 0x012f }
            int r0 = r7.readSampleData(r3, r9)     // Catch:{ IOException | IllegalStateException -> 0x012f }
            r2.size = r0     // Catch:{ IOException | IllegalStateException -> 0x012f }
            if (r0 >= 0) goto L_0x00d8
            goto L_0x0117
        L_0x00d8:
            long r0 = r7.getSampleTime()     // Catch:{ IOException | IllegalStateException -> 0x012f }
            r2.presentationTimeUs = r0     // Catch:{ IOException | IllegalStateException -> 0x012f }
            r16 = 0
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 <= 0) goto L_0x00eb
            long r16 = r14 * r18
            int r12 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r12 <= 0) goto L_0x00eb
            goto L_0x0119
        L_0x00eb:
            int r0 = r7.getSampleFlags()     // Catch:{ IOException | IllegalStateException -> 0x012f }
            r2.flags = r0     // Catch:{ IOException | IllegalStateException -> 0x012f }
            int r0 = r11.size()     // Catch:{ IOException | IllegalStateException -> 0x012f }
            if (r0 != r8) goto L_0x00f9
            r0 = 0
            goto L_0x0110
        L_0x00f9:
            int r0 = r7.getSampleTrackIndex()     // Catch:{ IOException | IllegalStateException -> 0x012f }
            if (r0 != r5) goto L_0x0105
            r0 = r20
            if (r5 == r0) goto L_0x0105
            r0 = r5
            goto L_0x0110
        L_0x0105:
            int r0 = r7.getSampleTrackIndex()     // Catch:{ IOException | IllegalStateException -> 0x012f }
            if (r0 != r4) goto L_0x0125
            r0 = r20
            if (r4 == r0) goto L_0x0125
            r0 = r4
        L_0x0110:
            r6.writeSampleData(r0, r3, r2)     // Catch:{ IOException | IllegalStateException -> 0x012f }
            r7.advance()     // Catch:{ IOException | IllegalStateException -> 0x012f }
            goto L_0x00cd
        L_0x0117:
            r2.size = r9     // Catch:{ IOException | IllegalStateException -> 0x012f }
        L_0x0119:
            r6.stop()     // Catch:{ IOException | IllegalStateException -> 0x012f }
            r6.release()     // Catch:{ IOException | IllegalStateException -> 0x012f }
            r7.release()     // Catch:{ IOException | IllegalStateException -> 0x012f }
            r26 = 1
            goto L_0x0131
        L_0x0125:
            java.lang.String r0 = "Invalid track index!"
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ IOException | IllegalStateException -> 0x012f }
            throw r0     // Catch:{ IOException | IllegalStateException -> 0x012f }
        L_0x012c:
            r26 = 0
            goto L_0x0131
        L_0x012f:
            r26 = 0
        L_0x0131:
            com.instagram.common.gallery.Medium r4 = r10.A02
            long r2 = r10.A00
            long r0 = r10.A01
            X.Aqi r18 = new X.Aqi
            r19 = r4
            r20 = r22
            r22 = r2
            r24 = r0
            r18.<init>(r19, r20, r21, r22, r24, r26)
            X.11Z.A02(r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RAU.run():void");
    }
}
