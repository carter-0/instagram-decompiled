package X;

import com.facebook.ffmpeg.FFMpegMediaDemuxer;
import com.facebook.ffmpeg.FFMpegMediaFormat;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class STf {
    public static final STf A00 = new Object();
    public static final C13589TdH A01 = C12325SrX.A00;

    public static final FFMpegMediaDemuxer A00(C7235Q0h q0h, File file) {
        FFMpegMediaDemuxer fFMpegMediaDemuxer;
        0qQ.A0B(q0h, 0);
        String path = file.getPath();
        int i = 0;
        do {
            fFMpegMediaDemuxer = new FFMpegMediaDemuxer(q0h, path, new FFMpegMediaDemuxer.Options());
            try {
                fFMpegMediaDemuxer.initialize();
                return fFMpegMediaDemuxer;
            } catch (IOException e) {
                if (i != 4) {
                    File A0t = AnonymousClass7TE.A0t(path);
                    if (!A0t.exists()) {
                        throw Pxe.A0c("Cannot find a concat file", e);
                    } else if (A0t.canRead()) {
                        i++;
                        if (i >= 5) {
                            return fFMpegMediaDemuxer;
                        }
                    } else {
                        throw Pxe.A0c("Cannot read a concat file", e);
                    }
                } else {
                    throw e;
                }
            }
        } while (i >= 5);
        return fFMpegMediaDemuxer;
    }

    public static final FFMpegMediaFormat A01(FFMpegMediaDemuxer fFMpegMediaDemuxer, String str) {
        int trackCount = fFMpegMediaDemuxer.getTrackCount();
        int i = 0;
        while (i < trackCount) {
            FFMpegMediaFormat trackFormat = fFMpegMediaDemuxer.getTrackFormat(i);
            String A11 = DbT.A11("mime", trackFormat.mMap);
            if (A11 == null || !A11.startsWith(str)) {
                i++;
            } else {
                trackFormat.setInteger("track_id", i);
                return trackFormat;
            }
        }
        return null;
    }

    public static final File A02(C13589TdH tdH, String str) {
        File createTempFile = tdH.createTempFile("ffconcat", (String) null);
        if (createTempFile != null) {
            try {
                FileOutputStream A0t = JTO.A0t(createTempFile);
                Charset A17 = Pxe.A17();
                0qQ.A07(A17);
                A0t.write(Pxf.A1V(str, A17));
                A0t.close();
                return createTempFile;
            } catch (Exception e) {
                createTempFile.delete();
                throw e;
            }
        } else {
            throw AnonymousClass7TE.A0z("file cannot be null");
        }
    }

    /* JADX WARNING: type inference failed for: r0v36, types: [X.RQS, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        if (r2.length() == 0) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String A03(java.util.ArrayList r24, java.util.List r25, long r26) {
        /*
            r23 = this;
            java.lang.String r0 = "ffconcat version 1.0\n"
            java.lang.StringBuilder r6 = X.Pxe.A16(r0)
            java.util.Iterator r22 = r25.iterator()
            r20 = -1
            r18 = 0
            r16 = -1
        L_0x0010:
            boolean r0 = r22.hasNext()
            if (r0 == 0) goto L_0x0114
            java.lang.Object r9 = r22.next()
            X.SE7 r9 = (X.SE7) r9
            java.io.File r0 = r9.A01
            java.lang.String r3 = r0.getPath()
            java.io.File r1 = X.AnonymousClass7TE.A0t(r3)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x010d
            boolean r0 = r1.canRead()
            if (r0 == 0) goto L_0x0106
            r1 = 0
            android.media.MediaMetadataRetriever r5 = new android.media.MediaMetadataRetriever     // Catch:{ all -> 0x00ff }
            r5.<init>()     // Catch:{ all -> 0x00ff }
            r5.setDataSource(r3)     // Catch:{ all -> 0x00fc }
            r0 = 9
            java.lang.String r2 = r5.extractMetadata(r0)     // Catch:{ all -> 0x00fc }
            if (r2 == 0) goto L_0x004a
            int r1 = r2.length()     // Catch:{ all -> 0x00fc }
            r0 = 0
            if (r1 != 0) goto L_0x004b
        L_0x004a:
            r0 = 1
        L_0x004b:
            if (r0 != 0) goto L_0x00ec
            long r14 = java.lang.Long.parseLong(r2)     // Catch:{ all -> 0x00fc }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 * r0
            int r0 = (r26 > r20 ? 1 : (r26 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x0068
            long r7 = r26 - r18
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0062
            r7 = 0
        L_0x0062:
            int r0 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0067
            r7 = r14
        L_0x0067:
            r14 = r7
        L_0x0068:
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x00fc }
            int r0 = r9.A00     // Catch:{ all -> 0x00fc }
            long r1 = (long) r0     // Catch:{ all -> 0x00fc }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00fc }
            long r12 = r4.convert(r1, r0)     // Catch:{ all -> 0x00fc }
            X.0qQ.A0A(r3)     // Catch:{ all -> 0x00fc }
            long r10 = r14 + r12
            java.lang.String r0 = "file '"
            r6.append(r0)     // Catch:{ all -> 0x00fc }
            r6.append(r3)     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = "'\ninpoint "
            r6.append(r0)     // Catch:{ all -> 0x00fc }
            r8 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r12 / r8
            r6.append(r0)     // Catch:{ all -> 0x00fc }
            java.lang.String r7 = "."
            r6.append(r7)     // Catch:{ all -> 0x00fc }
            java.util.Locale r4 = java.util.Locale.ROOT     // Catch:{ all -> 0x00fc }
            r3 = 1
            long r12 = r12 % r8
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x00fc }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x00fc }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)     // Catch:{ all -> 0x00fc }
            java.lang.String r2 = "%06d"
            java.lang.String r0 = X.Pxe.A12(r4, r2, r0)     // Catch:{ all -> 0x00fc }
            r6.append(r0)     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = "\noutpoint "
            r6.append(r0)     // Catch:{ all -> 0x00fc }
            long r0 = r10 / r8
            r6.append(r0)     // Catch:{ all -> 0x00fc }
            r6.append(r7)     // Catch:{ all -> 0x00fc }
            long r10 = r10 % r8
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x00fc }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = X.Pxg.A0v(r2, r4, r0, r3)     // Catch:{ all -> 0x00fc }
            r6.append(r0)     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = "\n"
            r6.append(r0)     // Catch:{ all -> 0x00fc }
            r0 = 1
            long r3 = r14 + r0
            long r3 = r3 + r16
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            X.RQS r0 = new X.RQS     // Catch:{ all -> 0x00fc }
            r0.<init>()     // Catch:{ all -> 0x00fc }
            r0.A01 = r3     // Catch:{ all -> 0x00fc }
            r0.A00 = r1     // Catch:{ all -> 0x00fc }
            r1 = r24
            r1.add(r0)     // Catch:{ all -> 0x00fc }
            long r18 = r18 + r14
            r5.release()
            r16 = r3
            goto L_0x0010
        L_0x00ec:
            java.lang.String r0 = "Unable to extract duration metadata from "
            java.lang.String r1 = X.002.A0R(r0, r3)     // Catch:{ all -> 0x00fc }
            r0 = 1
            X.0qQ.A0B(r1, r0)     // Catch:{ all -> 0x00fc }
            X.8Af r0 = new X.8Af     // Catch:{ all -> 0x00fc }
            r0.<init>(r1)     // Catch:{ all -> 0x00fc }
            throw r0     // Catch:{ all -> 0x00fc }
        L_0x00fc:
            r0 = move-exception
            r1 = r5
            goto L_0x0100
        L_0x00ff:
            r0 = move-exception
        L_0x0100:
            if (r1 == 0) goto L_0x0105
            r1.release()
        L_0x0105:
            throw r0
        L_0x0106:
            java.lang.String r0 = "Cannot read an asset file: "
            java.io.IOException r0 = X.Pxg.A0Z(r0, r3)
            throw r0
        L_0x010d:
            java.lang.String r0 = "Cannot find an asset file: "
            java.io.IOException r0 = X.Pxg.A0Z(r0, r3)
            throw r0
        L_0x0114:
            java.lang.String r0 = X.DbT.A10(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.STf.A03(java.util.ArrayList, java.util.List, long):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: com.facebook.ffmpeg.FFMpegAVStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.facebook.ffmpeg.FFMpegMediaMuxer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.facebook.ffmpeg.FFMpegAVStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.facebook.ffmpeg.FFMpegMediaMuxer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.facebook.ffmpeg.FFMpegMediaMuxer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.facebook.ffmpeg.FFMpegAVStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.facebook.ffmpeg.FFMpegAVStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: com.facebook.ffmpeg.FFMpegMediaMuxer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: com.facebook.ffmpeg.FFMpegAVStream} */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0135, code lost:
        if (r0 == null) goto L_0x013d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:43:0x0102=Splitter:B:43:0x0102, B:54:0x0118=Splitter:B:54:0x0118} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.STf r19, X.C13589TdH r20, java.io.File r21, java.util.List r22, java.util.List r23, int r24) {
        /*
            r1 = -1
            java.lang.String r11 = "track_id"
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            X.Q0h r9 = X.C9955RkA.A00
            r0 = 0
            r14 = r19
            r3 = r22
            java.lang.String r3 = r14.A03(r10, r3, r1)     // Catch:{ Exception -> 0x012c }
            r13 = r20
            java.io.File r8 = A02(r13, r3)     // Catch:{ Exception -> 0x012c }
            r12 = r23
            if (r23 == 0) goto L_0x0050
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()     // Catch:{ Exception -> 0x012c }
            boolean r3 = r10.isEmpty()     // Catch:{ Exception -> 0x012c }
            if (r3 != 0) goto L_0x0052
            r5 = 0
            r19 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.util.Iterator r18 = X.AnonymousClass7TE.A1G(r10)     // Catch:{ Exception -> 0x012c }
        L_0x0030:
            boolean r1 = r18.hasNext()     // Catch:{ Exception -> 0x012c }
            if (r1 == 0) goto L_0x004e
            java.lang.Object r15 = X.AnonymousClass7TF.A0a(r18)     // Catch:{ Exception -> 0x012c }
            X.RQS r15 = (X.RQS) r15     // Catch:{ Exception -> 0x012c }
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r19 = r19 + r1
            long r1 = r15.A01     // Catch:{ Exception -> 0x012c }
            double r3 = (double) r1     // Catch:{ Exception -> 0x012c }
            double r16 = r3 - r19
            double r1 = r15.A00     // Catch:{ Exception -> 0x012c }
            double r16 = r16 / r1
            double r5 = r5 + r16
            r19 = r3
            goto L_0x0030
        L_0x004e:
            long r1 = (long) r5     // Catch:{ Exception -> 0x012c }
            goto L_0x0052
        L_0x0050:
            r6 = r0
            goto L_0x005a
        L_0x0052:
            java.lang.String r1 = r14.A03(r7, r12, r1)     // Catch:{ Exception -> 0x012c }
            java.io.File r6 = A02(r13, r1)     // Catch:{ Exception -> 0x012c }
        L_0x005a:
            java.lang.String r2 = r21.getPath()     // Catch:{ Exception -> 0x012c }
            r1 = 0
            com.facebook.ffmpeg.FFMpegMediaMuxer r4 = new com.facebook.ffmpeg.FFMpegMediaMuxer     // Catch:{ Exception -> 0x012c }
            r4.<init>(r9, r2, r1)     // Catch:{ Exception -> 0x012c }
            r4.initialize()     // Catch:{ Exception -> 0x0129, all -> 0x0138 }
            com.facebook.ffmpeg.FFMpegMediaDemuxer r5 = A00(r9, r8)     // Catch:{ all -> 0x011c }
            if (r6 == 0) goto L_0x0076
            com.facebook.ffmpeg.FFMpegMediaDemuxer r7 = A00(r9, r6)     // Catch:{ all -> 0x0072 }
            goto L_0x0077
        L_0x0072:
            r1 = move-exception
            r7 = r0
            goto L_0x0118
        L_0x0076:
            r7 = r5
        L_0x0077:
            java.lang.String r1 = "video/"
            com.facebook.ffmpeg.FFMpegMediaFormat r2 = A01(r5, r1)     // Catch:{ all -> 0x0117 }
            if (r2 == 0) goto L_0x0111
            java.util.Map r1 = r2.mMap     // Catch:{ all -> 0x0117 }
            int r1 = X.Pxg.A06(r11, r1)     // Catch:{ all -> 0x0117 }
            r5.selectTrack(r1)     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = "rotation"
            java.util.Map r1 = r2.mMap     // Catch:{ all -> 0x0117 }
            int r13 = X.Pxg.A06(r3, r1)     // Catch:{ all -> 0x0117 }
            r12 = 15
            com.facebook.ffmpeg.FFMpegMediaMuxer$NativeWrapper r3 = r4.mNativeWrapper     // Catch:{ all -> 0x0117 }
            int r1 = r4.A02     // Catch:{ all -> 0x0117 }
            com.facebook.ffmpeg.FFMpegAVStream r9 = r3.nativeAddStream(r2, r12, r1)     // Catch:{ all -> 0x0117 }
            r9.setOrientationHint(r13)     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = "audio/"
            com.facebook.ffmpeg.FFMpegMediaFormat r3 = A01(r7, r3)     // Catch:{ all -> 0x0117 }
            if (r3 == 0) goto L_0x00b6
            java.util.Map r0 = r3.mMap     // Catch:{ all -> 0x0117 }
            int r0 = X.Pxg.A06(r11, r0)     // Catch:{ all -> 0x0117 }
            r7.selectTrack(r0)     // Catch:{ all -> 0x0117 }
            com.facebook.ffmpeg.FFMpegMediaMuxer$NativeWrapper r0 = r4.mNativeWrapper     // Catch:{ all -> 0x0117 }
            com.facebook.ffmpeg.FFMpegAVStream r0 = r0.nativeAddStream(r3, r12, r1)     // Catch:{ all -> 0x0117 }
        L_0x00b6:
            r4.A00()     // Catch:{ all -> 0x0117 }
            r11 = r24
            if (r6 != 0) goto L_0x00d7
            if (r0 == 0) goto L_0x00c2
            if (r3 == 0) goto L_0x00c2
            goto L_0x00cb
        L_0x00c2:
            com.facebook.ffmpeg.FFMpegMediaFormat[] r1 = new com.facebook.ffmpeg.FFMpegMediaFormat[]{r2}     // Catch:{ all -> 0x0117 }
            com.facebook.ffmpeg.FFMpegAVStream[] r0 = new com.facebook.ffmpeg.FFMpegAVStream[]{r9}     // Catch:{ all -> 0x0117 }
            goto L_0x00d3
        L_0x00cb:
            com.facebook.ffmpeg.FFMpegMediaFormat[] r1 = new com.facebook.ffmpeg.FFMpegMediaFormat[]{r2, r3}     // Catch:{ all -> 0x0117 }
            com.facebook.ffmpeg.FFMpegAVStream[] r0 = new com.facebook.ffmpeg.FFMpegAVStream[]{r9, r0}     // Catch:{ all -> 0x0117 }
        L_0x00d3:
            X.C9597Rdb.A00(r5, r10, r0, r1, r11)     // Catch:{ all -> 0x0117 }
            goto L_0x0102
        L_0x00d7:
            com.facebook.ffmpeg.FFMpegMediaFormat[] r2 = new com.facebook.ffmpeg.FFMpegMediaFormat[]{r2}     // Catch:{ all -> 0x0117 }
            com.facebook.ffmpeg.FFMpegAVStream[] r1 = new com.facebook.ffmpeg.FFMpegAVStream[]{r9}     // Catch:{ all -> 0x0117 }
            X.Rs2 r9 = X.C9597Rdb.A00(r5, r10, r1, r2, r11)     // Catch:{ all -> 0x0117 }
            if (r0 == 0) goto L_0x0102
            if (r3 == 0) goto L_0x0102
            com.facebook.ffmpeg.FFMpegMediaFormat[] r1 = new com.facebook.ffmpeg.FFMpegMediaFormat[]{r3}     // Catch:{ all -> 0x0117 }
            com.facebook.ffmpeg.FFMpegAVStream[] r0 = new com.facebook.ffmpeg.FFMpegAVStream[]{r0}     // Catch:{ all -> 0x0117 }
            X.Rs2 r3 = X.C9597Rdb.A00(r7, r10, r0, r1, r11)     // Catch:{ all -> 0x0117 }
            int r2 = r9.A01     // Catch:{ all -> 0x0117 }
            int r0 = r3.A01     // Catch:{ all -> 0x0117 }
            int r2 = r2 + r0
            int r1 = r9.A00     // Catch:{ all -> 0x0117 }
            int r0 = r3.A00     // Catch:{ all -> 0x0117 }
            int r1 = r1 + r0
            X.Rs2 r0 = new X.Rs2     // Catch:{ all -> 0x0117 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0117 }
        L_0x0102:
            r5.release()     // Catch:{ Exception -> 0x0129, all -> 0x0138 }
            if (r6 == 0) goto L_0x010a
            r7.release()     // Catch:{ Exception -> 0x0129, all -> 0x0138 }
        L_0x010a:
            r8.delete()     // Catch:{ Exception -> 0x0129, all -> 0x0138 }
            r4.A01()
            return
        L_0x0111:
            X.Qe5 r0 = new X.Qe5     // Catch:{ all -> 0x0117 }
            r0.<init>()     // Catch:{ all -> 0x0117 }
            throw r0     // Catch:{ all -> 0x0117 }
        L_0x0117:
            r1 = move-exception
        L_0x0118:
            r5.release()     // Catch:{ Exception -> 0x0129, all -> 0x0138 }
            goto L_0x011e
        L_0x011c:
            r1 = move-exception
            r7 = r0
        L_0x011e:
            if (r6 == 0) goto L_0x0125
            if (r7 == 0) goto L_0x0125
            r7.release()     // Catch:{ Exception -> 0x0129, all -> 0x0138 }
        L_0x0125:
            r8.delete()     // Catch:{ Exception -> 0x0129, all -> 0x0138 }
            throw r1     // Catch:{ Exception -> 0x0129, all -> 0x0138 }
        L_0x0129:
            r2 = move-exception
            r0 = r4
            goto L_0x012d
        L_0x012c:
            r2 = move-exception
        L_0x012d:
            java.lang.String r1 = "Unable to create stitched files"
            X.8Af r1 = X.Pxi.A0H(r1, r2)     // Catch:{ all -> 0x0134 }
            throw r1     // Catch:{ all -> 0x0134 }
        L_0x0134:
            r1 = move-exception
            if (r0 == 0) goto L_0x013d
            goto L_0x013a
        L_0x0138:
            r1 = move-exception
            r0 = r4
        L_0x013a:
            r0.A01()
        L_0x013d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.STf.A04(X.STf, X.TdH, java.io.File, java.util.List, java.util.List, int):void");
    }

    public static final void A05(List list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
