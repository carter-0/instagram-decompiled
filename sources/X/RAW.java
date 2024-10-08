package X;

import com.instagram.common.session.UserSession;

public final class RAW extends 0ng {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass8IU A01;
    public final /* synthetic */ Long A02;
    public final /* synthetic */ Long A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RAW(UserSession userSession, AnonymousClass8IU r5, Long l, Long l2, String str) {
        super(639, 3, false, false);
        this.A01 = r5;
        this.A04 = str;
        this.A03 = l;
        this.A02 = l2;
        this.A00 = userSession;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c6, code lost:
        if (r4.presentationTimeUs > (r11 * 1000)) goto L_0x00dc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r0 = r18
            X.8IU r7 = r0.A01
            java.lang.String r2 = r0.A04
            java.lang.Long r11 = r0.A03
            java.lang.Long r10 = r0.A02
            java.lang.String r17 = "muxer has already been released"
            android.media.MediaExtractor r9 = new android.media.MediaExtractor
            r9.<init>()
            r8 = 0
            r9.setDataSource(r2)     // Catch:{ IOException -> 0x0017 }
            goto L_0x0020
        L_0x0017:
            java.lang.String r1 = "audio extractor failed to set "
            java.lang.String r0 = " as data source"
            java.lang.String r0 = X.002.A0g(r1, r2, r0)
            goto L_0x005c
        L_0x0020:
            int r6 = r9.getTrackCount()
            r5 = 0
        L_0x0025:
            if (r5 >= r6) goto L_0x005f
            android.media.MediaFormat r0 = r9.getTrackFormat(r5)
            java.lang.String r4 = "mime"
            java.lang.String r3 = r0.getString(r4)
            r2 = 1
            if (r3 == 0) goto L_0x010e
            java.lang.String r0 = "audio/"
            r1 = 0
            boolean r0 = X.C66580MXl.A1a(r0, r2, r3)
            if (r0 != r2) goto L_0x010e
            r9.selectTrack(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            if (r0 == 0) goto L_0x005f
            int r0 = r0.intValue()
            android.media.MediaFormat r3 = r9.getTrackFormat(r0)
            X.0qQ.A07(r3)
            java.lang.String r0 = "durationUs"
            boolean r0 = r3.containsKey(r0)
            if (r0 != 0) goto L_0x0067
            java.lang.String r0 = "audio track does not have duration"
        L_0x005c:
            X.AnonymousClass8IU.A00(r0)
        L_0x005f:
            X.Tef r0 = r7.A00
            if (r0 == 0) goto L_0x0066
            r0.Cwc(r8)
        L_0x0066:
            return
        L_0x0067:
            java.lang.String r2 = "-karaoke"
            java.lang.String r0 = ".mp4"
            java.lang.String r6 = X.AnonymousClass457.A0D(r2, r0)
            X.0qQ.A07(r6)
            android.media.MediaMuxer r5 = new android.media.MediaMuxer
            r5.<init>(r6, r1)
            r5.addTrack(r3)     // Catch:{ IllegalStateException -> 0x00f8 }
            r5.start()     // Catch:{ IllegalStateException -> 0x007e }
            goto L_0x0082
        L_0x007e:
            java.lang.String r0 = "muxer has already started or has been released"
            goto L_0x005c
        L_0x0082:
            r15 = 1000(0x3e8, double:4.94E-321)
            r13 = 0
            if (r11 == 0) goto L_0x00d9
            long r2 = r11.longValue()
            long r2 = r2 * r15
        L_0x008d:
            r9.seekTo(r2, r1)
            r0 = 2048(0x800, float:2.87E-42)
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r0)
            android.media.MediaCodec$BufferInfo r4 = new android.media.MediaCodec$BufferInfo
            r4.<init>()
        L_0x009b:
            boolean r0 = r9.advance()
            if (r0 == 0) goto L_0x00dc
            int r0 = r9.readSampleData(r8, r1)
            r4.size = r0
            long r2 = r9.getSampleTime()
            r4.presentationTimeUs = r2
            int r0 = r9.getSampleFlags()
            r4.flags = r0
            int r0 = r4.size
            if (r0 < 0) goto L_0x00dc
            if (r10 == 0) goto L_0x00c9
            long r11 = r10.longValue()
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c9
            long r2 = r4.presentationTimeUs
            long r11 = r11 * r15
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c9
            goto L_0x00dc
        L_0x00c9:
            r5.writeSampleData(r1, r8, r4)     // Catch:{ IllegalStateException -> 0x00cd }
            goto L_0x009b
        L_0x00cd:
            r2 = move-exception
            java.lang.String r0 = "muxer write sample data exception: "
            java.lang.String r0 = X.AnonymousClass7TF.A0m(r0, r2)
            X.AnonymousClass8IU.A00(r0)
            goto L_0x009b
        L_0x00d9:
            r2 = 0
            goto L_0x008d
        L_0x00dc:
            r5.stop()     // Catch:{ IllegalStateException -> 0x00e0 }
            goto L_0x00e6
        L_0x00e0:
            java.lang.String r0 = "muxer is in the wrong state"
            X.AnonymousClass8IU.A00(r0)     // Catch:{ all -> 0x0112 }
        L_0x00e6:
            r5.release()     // Catch:{ IllegalStateException -> 0x00ea }
            goto L_0x00ed
        L_0x00ea:
            X.AnonymousClass8IU.A00(r17)
        L_0x00ed:
            r9.release()
            X.Tef r0 = r7.A00
            if (r0 == 0) goto L_0x0066
            r0.Cwc(r6)
            return
        L_0x00f8:
            boolean r0 = r3.containsKey(r4)
            if (r0 == 0) goto L_0x010a
            java.lang.String r1 = r3.getString(r4)
        L_0x0102:
            java.lang.String r0 = "audio extractor failed to add track mime type is "
            java.lang.String r0 = X.002.A0R(r0, r1)
            goto L_0x005c
        L_0x010a:
            java.lang.String r1 = "null"
            goto L_0x0102
        L_0x010e:
            int r5 = r5 + 1
            goto L_0x0025
        L_0x0112:
            r0 = move-exception
            r5.release()     // Catch:{ IllegalStateException -> 0x0117 }
            goto L_0x011a
        L_0x0117:
            X.AnonymousClass8IU.A00(r17)
        L_0x011a:
            r9.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RAW.run():void");
    }
}
