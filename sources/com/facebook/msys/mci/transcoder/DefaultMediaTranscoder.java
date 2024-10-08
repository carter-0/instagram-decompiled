package com.facebook.msys.mci.transcoder;

import X.0KC;
import X.0fO;
import X.AnonymousClass7TE;
import X.C10213RoU;
import X.C10734RxD;
import X.C10775Rxu;
import X.C10830Ryq;
import X.C11259SHt;
import X.C12326SrY;
import X.C12882TBw;
import X.C13589TdH;
import X.C257503xV;
import X.C8706R1x;
import X.C9261RVm;
import X.DbS;
import X.DbT;
import X.G9t;
import X.Pxf;
import X.QQJ;
import X.QQK;
import X.QQL;
import X.SKY;
import X.SNT;
import X.SSJ;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Pair;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.MediaTranscoder;
import com.facebook.msys.mci.TranscodeImageCompletionCallback;
import com.facebook.msys.mci.TranscodeVideoCompletionCallback;
import com.facebook.msys.mci.VideoSizeEstimatorCompletionCallback;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public class DefaultMediaTranscoder implements MediaTranscoder {
    public static MediaTranscoder A06;
    public final Context A00;
    public final SSJ A01;
    public final C10213RoU A02;
    public final C257503xV A03;
    public final C13589TdH A04 = new C12326SrY();
    public final ExecutorService A05;

    public static C10734RxD A00(Map map) {
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        if (map != null) {
            if (map.containsKey("TARGET_IMAGE_SIZE_LIMIT")) {
                try {
                    Integer.parseInt(DbT.A11("TARGET_IMAGE_SIZE_LIMIT", map));
                } catch (NumberFormatException unused) {
                }
            }
            if (map.containsKey("REMOVE_PII")) {
                map.get("REMOVE_PII");
            }
            if (map.containsKey("ENABLE_RESCALE_ON_ROTATE")) {
                z = AnonymousClass7TE.A1a(map.get("ENABLE_RESCALE_ON_ROTATE"));
            }
            if (map.containsKey("IS_PREVIEW")) {
                z2 = AnonymousClass7TE.A1a(map.get("IS_PREVIEW"));
            }
            if (map.containsKey("ENABLE_IMAGE_TRANSCODER_IN_MEMORY_CACHE")) {
                map.get("ENABLE_IMAGE_TRANSCODER_IN_MEMORY_CACHE");
            }
            if (map.containsKey("IS_HD")) {
                z3 = AnonymousClass7TE.A1a(map.get("IS_HD"));
            }
            if (map.containsKey("TRACE_ID")) {
                str = DbT.A11("TRACE_ID", map);
            }
            if (map.containsKey("IS_ARMADILLO")) {
                z4 = AnonymousClass7TE.A1a(map.get("IS_ARMADILLO"));
            }
        }
        return new C10734RxD(str, z4, z3, z2, z);
    }

    public Bitmap decodeBitmap(String str, double d, double d2) {
        String str2;
        Integer valueOf;
        Integer valueOf2;
        Bitmap bitmap = null;
        if (str != null) {
            try {
                str2 = SKY.A01(str).getPath();
            } catch (IOException | IllegalArgumentException | SecurityException e) {
                0KC.A0O("DefaultMediaTranscoder", "decodeBitmap: Error parsing inputFileURL: %s, Exception %s", new Object[]{str, e});
                return null;
            }
        } else {
            str2 = null;
        }
        int min = Math.min((int) d, Integer.MAX_VALUE);
        int min2 = Math.min((int) d2, Integer.MAX_VALUE);
        if (str2 != null) {
            try {
                int A002 = C9261RVm.A00(str2);
                Bitmap decodeFile = BitmapFactory.decodeFile(str2);
                if (decodeFile != null) {
                    Bitmap A012 = SSJ.A01(decodeFile, A002);
                    int width = A012.getWidth();
                    int height = A012.getHeight();
                    if (height > min2 || width > min) {
                        int i = min * height;
                        int i2 = min2 * width;
                        if (i < i2) {
                            min2 = i / width;
                        } else {
                            min = i2 / height;
                        }
                        valueOf = Integer.valueOf(min);
                        valueOf2 = Integer.valueOf(min2);
                    } else {
                        valueOf = Integer.valueOf(width);
                        valueOf2 = Integer.valueOf(height);
                    }
                    Pair create = Pair.create(valueOf, valueOf2);
                    try {
                        bitmap = 0fO.A00(A012, Pxf.A05(create), Pxf.A04(create), true);
                        if (bitmap == null) {
                            0KC.A0C("DefaultMediaTranscoder", "decodeBitmap: bitmap scaling returned null");
                            return bitmap;
                        }
                    } catch (IllegalArgumentException e2) {
                        0KC.A0F("DefaultMediaTranscoder", "decodeBitmap: invalid dimensions passed to bitmap scaling - ", e2);
                    }
                    return bitmap;
                }
                0KC.A0O("DefaultMediaTranscoder", "decodeBitmap: Error converting to bitmap: %s.", new Object[]{str});
                throw AnonymousClass7TE.A0z("decodeBitmap: Bitmap decoding fail");
            } catch (IOException e3) {
                0KC.A0O("DefaultMediaTranscoder", "decodeBitmap: Error getting rotation: %s, Exception %s", new Object[]{str, e3});
                return null;
            }
        } else {
            throw AnonymousClass7TE.A0z("decodeBitmap: At least one of input params should be not null");
        }
    }

    public static void A02(TranscodeVideoCompletionCallback transcodeVideoCompletionCallback, DefaultMediaTranscoder defaultMediaTranscoder, Throwable th, int i, int i2) {
        Execution.executeAsync(new QQJ(transcodeVideoCompletionCallback, defaultMediaTranscoder, th, i, i2), (AccountSession) null, 4);
    }

    public static boolean A03(C10775Rxu rxu) {
        Double d = rxu.A02;
        if (d != null && d.doubleValue() >= 0.0d) {
            return true;
        }
        Double d2 = rxu.A01;
        if (d2 == null || d2.doubleValue() < 0.0d) {
            return false;
        }
        return true;
    }

    public void estimateVideoSize(String str, long j, Double d, Double d2, VideoSizeEstimatorCompletionCallback videoSizeEstimatorCompletionCallback) {
        VideoSizeEstimatorCompletionCallback videoSizeEstimatorCompletionCallback2 = videoSizeEstimatorCompletionCallback;
        Execution.executeAsync(new QQK(videoSizeEstimatorCompletionCallback2, this, d, d2, str, j), (AccountSession) null, 4);
    }

    public int getImageTranscodeQuality(Bitmap bitmap, Map map) {
        if (bitmap == null) {
            0KC.A0C("DefaultMediaTranscoder", "getImageTranscodeQuality: Image bitmap is null");
            return 0;
        }
        C10734RxD A002 = A00(map);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        boolean z = A002.A02;
        int A003 = SSJ.A00(Boolean.valueOf(z), height, width);
        if (z) {
            return Math.max(A003, 45);
        }
        return A003;
    }

    public void reportTranscodeFailure(int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0044, code lost:
        if (r5 == X.AnonymousClass05K.A0C) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        if (r5 == X.AnonymousClass05K.A0C) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] transcodeImage(java.lang.String r23, double r24, double r26, java.lang.String r28, java.util.Map r29) {
        /*
            r22 = this;
            r1 = r24
            int r0 = (int) r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r12 = java.lang.Math.min(r0, r1)
            r2 = r26
            int r0 = (int) r2
            int r13 = java.lang.Math.min(r0, r1)
            X.RxD r2 = A00(r29)
            r20 = 0
            java.lang.String r6 = "DefaultMediaTranscoder"
            r7 = 0
            r1 = r23
            if (r23 == 0) goto L_0x0027
            android.net.Uri r0 = X.SKY.A01(r1)     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00d9 }
            java.lang.String r11 = r0.getPath()     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x00d9 }
            goto L_0x0028
        L_0x0027:
            r11 = r7
        L_0x0028:
            java.io.ByteArrayOutputStream r10 = X.Pxe.A0b()
            java.lang.String r0 = "transcodeImage: inputFileURL must be provided"
            if (r11 == 0) goto L_0x00cf
            r0 = r22
            X.SSJ r0 = r0.A01
            r8 = r0
            r9 = r2
            X.SHt r3 = r8.A03(r9, r10, r11, r12, r13)
        L_0x003b:
            java.lang.Integer r5 = r3.A0A
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            if (r5 == r4) goto L_0x0046
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r0 = 0
            if (r5 != r1) goto L_0x0047
        L_0x0046:
            r0 = 1
        L_0x0047:
            java.lang.String r1 = "transcodeImage: TranscodeResult from %s: %s"
            if (r0 != 0) goto L_0x0055
            java.lang.String r0 = "BitmapImageTranscoder"
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r3}
            X.0KC.A0O(r6, r1, r0)
        L_0x0055:
            if (r5 == r4) goto L_0x005c
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r0 = 0
            if (r5 != r1) goto L_0x005d
        L_0x005c:
            r0 = 1
        L_0x005d:
            if (r0 == 0) goto L_0x0063
            byte[] r7 = r10.toByteArray()
        L_0x0063:
            java.lang.String r4 = r2.A00
            if (r4 == 0) goto L_0x00e4
            int r0 = r3.A03
            java.lang.Long r8 = X.DbS.A0j(r0)
            int r0 = r3.A01
            java.lang.Long r9 = X.DbS.A0j(r0)
            int r0 = r3.A06
            java.lang.Long r10 = X.DbS.A0j(r0)
            int r0 = r3.A04
            java.lang.Long r11 = X.DbS.A0j(r0)
            r5 = 0
            java.lang.Long r12 = java.lang.Long.valueOf(r5)
            int r0 = r3.A05
            java.lang.Long r15 = X.DbS.A0j(r0)
            long r0 = r3.A07
            java.lang.Long r16 = java.lang.Long.valueOf(r0)
            long r0 = r3.A08
            java.lang.Long r17 = java.lang.Long.valueOf(r0)
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x009d
            r5 = 1
        L_0x009d:
            java.lang.Long r18 = java.lang.Long.valueOf(r5)
            double r0 = r3.A00
            r5 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 * r5
            long r5 = (long) r0
            java.lang.Long r19 = java.lang.Long.valueOf(r5)
            r13 = r12
            r14 = r12
            java.lang.Long[] r0 = new java.lang.Long[]{r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19}
            java.util.List r21 = java.util.Arrays.asList(r0)
            r14 = 0
            boolean r0 = r2.A01
            r15 = 4
            if (r0 == 0) goto L_0x00bd
            r15 = 15
        L_0x00bd:
            boolean r0 = r2.A03
            r17 = 1148(0x47c, float:1.609E-42)
            if (r0 == 0) goto L_0x00c5
            r17 = 1156(0x484, float:1.62E-42)
        L_0x00c5:
            r16 = r14
            r18 = r4
            r19 = r14
            com.facebook.msys.mci.TraceLogger.log(r14, r15, r16, r17, r18, r19, r20, r21)
            return r7
        L_0x00cf:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            X.SHt r3 = X.C11259SHt.A00(r0)
            goto L_0x003b
        L_0x00d9:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "transcodeImage: Error parsing inputFileURL: %s, Exception %s"
            X.0KC.A0O(r6, r0, r1)
        L_0x00e4:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.transcoder.DefaultMediaTranscoder.transcodeImage(java.lang.String, double, double, java.lang.String, java.util.Map):byte[]");
    }

    public void transcodeImageV2(String str, double d, double d2, double d3, double d4, String str2, Map map, TranscodeImageCompletionCallback transcodeImageCompletionCallback) {
        String str3;
        String str4 = str;
        TranscodeImageCompletionCallback transcodeImageCompletionCallback2 = transcodeImageCompletionCallback;
        if (str != null) {
            try {
                str3 = SKY.A01(str4).getPath();
            } catch (IOException | IllegalArgumentException | SecurityException e) {
                0KC.A0O("DefaultMediaTranscoder", "transcodeImageV2: Error parsing inputFileURL: %s, Exception %s", new Object[]{str4, e});
                Execution.executeAsync(new QQL(transcodeImageCompletionCallback2, this, e, 0.0d, 0.0d, 0.0d, 0.0d), (AccountSession) null, 4);
                return;
            }
        } else {
            str3 = null;
        }
        SSJ ssj = this.A01;
        C10213RoU roU = this.A02;
        int min = Math.min((int) d, Integer.MAX_VALUE);
        int min2 = Math.min((int) d2, Integer.MAX_VALUE);
        int min3 = Math.min((int) d3, 600);
        int min4 = Math.min((int) d4, 600);
        C10734RxD A002 = A00(map);
        String str5 = str2;
        this.A05.execute(new C12882TBw(new C10830Ryq(ssj, A002, new SNT(transcodeImageCompletionCallback2, A002, this, str5), roU, str3, str5, new C8706R1x(), min2, min, min4, min3)));
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [X.SHv, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v17, types: [X.ThT, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v19, types: [X.Tgv, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0142  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void transcodeVideo(java.lang.String r32, com.facebook.msys.mci.VideoEdits r33, long r34, long r36, com.facebook.msys.mci.TranscodeVideoCompletionCallback r38) {
        /*
            r31 = this;
            java.lang.String r8 = "DefaultMediaTranscoder"
            r3 = r31
            r22 = r32
            r30 = r38
            android.net.Uri r21 = X.SKY.A01(r22)     // Catch:{ IOException | IllegalArgumentException | SecurityException -> 0x0323 }
            java.lang.String r1 = r21.getPath()     // Catch:{ RuntimeException -> 0x001b }
            if (r1 == 0) goto L_0x001b
            r0 = 867(0x363, float:1.215E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ RuntimeException -> 0x001b }
            r1.contains(r0)     // Catch:{ RuntimeException -> 0x001b }
        L_0x001b:
            r0 = 0
            r10 = 1
            android.content.Context r9 = r3.A00
            r1 = r21
            X.Q0d r2 = X.SRj.A01(r9, r1, r0)
            if (r2 != 0) goto L_0x0033
            java.lang.String r1 = "MediaMetadata is null"
            java.io.IOException r2 = X.JTO.A0u(r1)
            r1 = r30
            A02(r1, r3, r2, r0, r0)
            return
        L_0x0033:
            X.3xV r1 = r3.A03
            if (r1 != 0) goto L_0x00fa
            r6 = 0
        L_0x0038:
            android.util.Pair r4 = X.SKY.A02(r2, r6)
            int r1 = X.Pxf.A05(r4)
            int r5 = X.Pxf.A04(r4)
            int r4 = r2.A05
            r29 = r4
            r28 = r4
            int r4 = r2.A03
            r24 = r4
            int r11 = r2.A04
            long r6 = r2.A06
            r26 = r6
            if (r33 != 0) goto L_0x00c1
            r13 = 0
            X.Rxu r4 = new X.Rxu
            r12 = r4
            r14 = r13
            r15 = r13
            r16 = r0
            r17 = r0
            r18 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)
        L_0x0065:
            r6 = 90
            if (r11 == r6) goto L_0x00bc
            r6 = 270(0x10e, float:3.78E-43)
            if (r11 == r6) goto L_0x00bc
            r20 = 0
            r25 = r29
            r29 = r24
        L_0x0073:
            r6 = r25
            if (r6 < r10) goto L_0x0317
            r6 = r29
            if (r6 < r10) goto L_0x0317
            java.lang.String r12 = r4.A03
            r6 = 0
            if (r12 == 0) goto L_0x0099
            boolean r7 = r12.isEmpty()
            if (r7 != 0) goto L_0x0099
            java.io.File r12 = X.AnonymousClass7TE.A0t(r12)
            boolean r7 = r12.exists()
            if (r7 != 0) goto L_0x00b7
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.String r7 = "Overlay file path for video edits does not point to a valid file (%s)"
            X.0KC.A0O(r8, r7, r12)
        L_0x0099:
            int r13 = r4.A00
            if (r6 == 0) goto L_0x013f
            java.lang.String r7 = r6.getPath()
            if (r7 == 0) goto L_0x013f
            if (r13 == 0) goto L_0x013f
            java.lang.String r6 = r6.getPath()
            android.graphics.Bitmap r12 = android.graphics.BitmapFactory.decodeFile(r6)
            r6 = 0
            if (r12 == 0) goto L_0x013f
            int r7 = r13 % 180
            android.graphics.Bitmap r15 = X.SSJ.A01(r12, r7)
            goto L_0x0107
        L_0x00b7:
            android.net.Uri r6 = android.net.Uri.fromFile(r12)
            goto L_0x0099
        L_0x00bc:
            r20 = 1
            r25 = r24
            goto L_0x0073
        L_0x00c1:
            java.lang.Integer r4 = r33.getOverlayImageRotationInDegrees()
            java.lang.String r15 = r33.getOverlayImageUrl()
            if (r4 != 0) goto L_0x00f5
            r16 = 0
        L_0x00cd:
            boolean r17 = r33.getIsMuted()
            java.lang.Double r13 = r33.getTrimStartTimeInSeconds()
            java.lang.Double r14 = r33.getTrimEndTimeInSeconds()
            boolean r18 = r33.getWasTranscoded()
            X.Rxu r4 = new X.Rxu
            r12 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18)
            boolean r6 = A03(r4)
            if (r6 == 0) goto L_0x0065
            java.lang.Double r6 = r4.A02
            X.SKY.A00(r6)
            java.lang.Double r6 = r4.A01
            X.SKY.A00(r6)
            goto L_0x0065
        L_0x00f5:
            int r16 = r4.intValue()
            goto L_0x00cd
        L_0x00fa:
            android.util.Pair r5 = r1.A02
            android.util.Pair r4 = r1.A00
            android.util.Pair r1 = r1.A01
            X.RuP r6 = new X.RuP
            r6.<init>(r5, r4, r1)
            goto L_0x0038
        L_0x0107:
            X.TdH r13 = r3.A04     // Catch:{ IOException -> 0x0133 }
            java.lang.String r12 = "overlay_"
            java.lang.String r7 = ".rotated"
            java.io.File r14 = r13.createTempFile(r12, r7)     // Catch:{ IOException -> 0x0133 }
            X.0Sd.A00(r14)
            java.io.FileOutputStream r13 = X.JTO.A0t(r14)     // Catch:{ IOException -> 0x012e }
            android.graphics.Bitmap$CompressFormat r12 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x0124 }
            r7 = 100
            X.0fO.A02(r12, r15, r13, r7)     // Catch:{ all -> 0x0124 }
            r13.close()     // Catch:{ IOException -> 0x012e }
            goto L_0x013b
        L_0x0124:
            r12 = move-exception
            r13.close()     // Catch:{ all -> 0x0129 }
            goto L_0x012d
        L_0x0129:
            r7 = move-exception
            X.C9153RRe.A00(r12, r7)     // Catch:{ IOException -> 0x012e }
        L_0x012d:
            throw r12     // Catch:{ IOException -> 0x012e }
        L_0x012e:
            r12 = move-exception
            java.lang.String r7 = "transcodeVideo: Error while writing rotated overlay"
            goto L_0x0137
        L_0x0133:
            r12 = move-exception
            java.lang.String r7 = "transcodeVideo: Unable to create a temp file for rotated overlay"
        L_0x0137:
            X.0KC.A0F(r8, r7, r12)
            goto L_0x013f
        L_0x013b:
            android.net.Uri r6 = android.net.Uri.fromFile(r14)
        L_0x013f:
            r8 = 0
            if (r6 == 0) goto L_0x020c
            r19 = 0
            r16 = 1065353216(0x3f800000, float:1.0)
            X.Rs0 r15 = new X.Rs0
            r15.<init>(r6)
            X.Tfu r14 = X.C9935Rjo.A00
            X.0qQ.A0B(r9, r0)
            r13 = 5
            X.0qQ.A0B(r14, r13)
            r7 = r28
            float r12 = (float) r7
            r7 = r24
            float r7 = (float) r7
            float r12 = r12 / r7
            int r7 = r11 % 180
            if (r7 == 0) goto L_0x0161
            float r12 = r16 / r12
        L_0x0161:
            java.util.List r7 = java.util.Collections.singletonList(r15)
            java.util.ArrayList r18 = X.DbV.A15(r7)
            java.util.Iterator r17 = r7.iterator()
        L_0x016d:
            boolean r7 = r17.hasNext()
            if (r7 == 0) goto L_0x01c8
            java.lang.Object r7 = r17.next()
            X.Rs0 r7 = (X.C10424Rs0) r7
            android.net.Uri r7 = r7.A01
            r23 = r7
            X.3kY r16 = r14.CgE(r9, r7)
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r16 == 0) goto L_0x01a2
            java.lang.Object r7 = r16.A05()     // Catch:{ all -> 0x0194 }
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7     // Catch:{ all -> 0x0194 }
            int r15 = r7.getHeight()     // Catch:{ all -> 0x0194 }
            int r7 = r7.getWidth()     // Catch:{ all -> 0x0194 }
            goto L_0x0198
        L_0x0194:
            r16.close()
            goto L_0x01a2
        L_0x0198:
            r16.close()
            if (r7 <= 0) goto L_0x01a2
            if (r15 <= 0) goto L_0x01a2
            float r11 = (float) r7
            float r7 = (float) r15
            float r11 = r11 / r7
        L_0x01a2:
            java.lang.String r7 = r23.toString()
            r16 = 1065353216(0x3f800000, float:1.0)
            int r15 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r15 <= 0) goto L_0x01c3
            float r16 = r16 * r12
            float r16 = r16 / r11
            java.lang.Float r11 = java.lang.Float.valueOf(r16)
        L_0x01b4:
            float r15 = X.AnonymousClass7TE.A04(r11)
            X.RwM r11 = new X.RwM
            r11.<init>(r7, r15)
            r7 = r18
            r7.add(r11)
            goto L_0x016d
        L_0x01c3:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            goto L_0x01b4
        L_0x01c8:
            X.Sr1 r7 = new X.Sr1
            r7.<init>(r10)
            X.8gx[] r7 = new X.C361868gx[]{r7}
            java.util.ArrayList r12 = X.0sr.A1M(r7)
            java.util.ArrayList r15 = X.AnonymousClass7TG.A0r(r18)
            java.util.Iterator r16 = r18.iterator()
        L_0x01dd:
            boolean r7 = r16.hasNext()
            if (r7 == 0) goto L_0x01f2
            java.lang.Object r11 = r16.next()
            X.RwM r11 = (X.C10682RwM) r11
            X.Sr0 r7 = new X.Sr0
            r7.<init>(r14, r11)
            r15.add(r7)
            goto L_0x01dd
        L_0x01f2:
            r12.addAll(r15)
            X.SNc r7 = new X.SNc
            r7.<init>(r1, r5)
            X.SOn r7 = X.SSg.A03(r2, r7, r12)
            X.0qQ.A07(r7)
            r7.A0B = r0
            r7.A0O = r10
            r7.A03 = r13
            r7.A01 = r5
            r7.A04 = r5
            goto L_0x0215
        L_0x020c:
            X.SNc r0 = new X.SNc
            r0.<init>(r1, r5)
            X.SOn r7 = X.SSg.A03(r2, r0, r8)
        L_0x0215:
            if (r20 == 0) goto L_0x02f2
            int r13 = r7.A0A
            int r11 = r7.A0C
        L_0x021b:
            boolean r0 = r4.A05
            if (r0 != 0) goto L_0x02f8
            r0 = r28
            if (r0 > r1) goto L_0x023c
            r0 = r24
            if (r0 > r1) goto L_0x023c
            r0 = r26
            int r12 = (int) r0
            if (r12 > r5) goto L_0x023c
            if (r6 != 0) goto L_0x023c
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x0236
            boolean r0 = r2.A0K
            if (r0 != 0) goto L_0x023c
        L_0x0236:
            boolean r0 = A03(r4)
            if (r0 == 0) goto L_0x02f8
        L_0x023c:
            X.Qe0 r12 = new X.Qe0
            r20 = r12
            r22 = r30
            r23 = r3
            r24 = r25
            r25 = r29
            r26 = r13
            r27 = r11
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            java.lang.String r0 = r21.getPath()
            r0.getClass()
            java.io.File r11 = X.AnonymousClass7TE.A0t(r0)
            boolean r0 = A03(r4)
            if (r0 == 0) goto L_0x02e0
            java.lang.Double r0 = r4.A02
            long r5 = X.SKY.A00(r0)
            java.lang.Double r0 = r4.A01
            long r0 = X.SKY.A00(r0)
            java.util.List r14 = java.util.Collections.EMPTY_LIST
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.4aF r0 = X.Pxe.A0V(r13, r5, r0)
            com.facebook.videolite.transcoder.base.composition.MediaComposition r0 = X.C9601Rdf.A00(r9, r0, r11, r14, r14)
        L_0x0278:
            X.SQv r5 = new X.SQv
            r5.<init>()
            r5.A06 = r7
            r5.A08 = r0
            r5.A07 = r12
            r5.A0B = r8
            boolean r0 = r2.A0K
            if (r0 == 0) goto L_0x028f
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x02c4
            r5.A0H = r10
        L_0x028f:
            X.SHv r1 = new X.SHv
            r1.<init>()
            X.RzN r0 = new X.RzN
            r0.<init>(r5)
            r1.A0C = r0
            r1.A00 = r9
            X.TdH r0 = r3.A04
            r1.A07 = r0
            java.util.concurrent.ExecutorService r0 = r3.A05
            r1.A0E = r0
            X.Sru r0 = new X.Sru
            r0.<init>()
            r1.A0A = r0
            X.Srk r0 = new X.Srk
            r0.<init>()
            r1.A08 = r0
            X.Q4U r0 = new X.Q4U
            r0.<init>()
            r1.A09 = r0
            r1.A01 = r8
            X.Rz8 r0 = r1.A01()
            X.SRj.A00(r0)
            return
        L_0x02c4:
            X.SF8 r1 = new X.SF8
            r1.<init>()
            r0 = 44100(0xac44, float:6.1797E-41)
            r1.A02 = r0
            r0 = 2
            r1.A01 = r0
            r0 = 64000(0xfa00, float:8.9683E-41)
            r1.A00 = r0
            X.SFQ r0 = new X.SFQ
            r0.<init>(r1)
            r5.A0Q = r10
            r5.A0C = r0
            goto L_0x028f
        L_0x02e0:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.MILLISECONDS
            r15 = -1
            X.4aF r13 = new X.4aF
            r17 = r15
            r13.<init>(r14, r15, r17)
            com.facebook.videolite.transcoder.base.composition.MediaComposition r0 = X.C9601Rdf.A00(r9, r13, r11, r0, r0)
            goto L_0x0278
        L_0x02f2:
            int r13 = r7.A0C
            int r11 = r7.A0A
            goto L_0x021b
        L_0x02f8:
            long r0 = r2.A07
            double r4 = (double) r0
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r4 = r4 / r0
            X.QQM r1 = new X.QQM
            r18 = r1
            r19 = r30
            r20 = r3
            r21 = r2
            r23 = r4
            r26 = r29
            r18.<init>(r19, r20, r21, r22, r23, r25, r26)
            r0 = 4
            com.facebook.msys.mci.Execution.executeAsync(r1, r8, r0)
            return
        L_0x0317:
            java.lang.String r1 = "Unable to read video metadata"
            java.io.IOException r2 = X.JTO.A0u(r1)
            r1 = r30
            A02(r1, r3, r2, r0, r0)
            return
        L_0x0323:
            r2 = move-exception
            java.lang.String r0 = "transcodeVideo: Error with source Uri"
            X.0KC.A0F(r8, r0, r2)
            r1 = 0
            r0 = r30
            A02(r0, r3, r2, r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.transcoder.DefaultMediaTranscoder.transcodeVideo(java.lang.String, com.facebook.msys.mci.VideoEdits, long, long, com.facebook.msys.mci.TranscodeVideoCompletionCallback):void");
    }

    public DefaultMediaTranscoder(Context context, SSJ ssj, C10213RoU roU, C257503xV r5, ExecutorService executorService) {
        this.A05 = executorService;
        this.A00 = context;
        this.A03 = r5;
        this.A02 = roU;
        this.A01 = ssj;
    }

    public static HashMap A01(C10734RxD rxD, C11259SHt sHt) {
        HashMap A1E = AnonymousClass7TE.A1E();
        if (sHt != null) {
            A1E.put("ORIGINAL_WIDTH", DbS.A0j(sHt.A03));
            A1E.put("ORIGINAL_HEIGHT", DbS.A0j(sHt.A01));
            A1E.put("ORIGINAL_FILE_SIZE", Long.valueOf(sHt.A07));
            A1E.put("TRANSCODED_WIDTH", DbS.A0j(sHt.A06));
            A1E.put("TRANSCODED_HEIGHT", DbS.A0j(sHt.A04));
            A1E.put("TRANSCODED_FILE_SIZE", Long.valueOf(sHt.A08));
            A1E.put("COMPRESSION_QUALITY", DbS.A0j(sHt.A05));
            A1E.put("IS_HD", Long.valueOf(G9t.A0k(rxD.A02 ? 1 : 0)));
        }
        return A1E;
    }
}
