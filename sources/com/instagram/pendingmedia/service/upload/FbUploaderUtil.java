package com.instagram.pendingmedia.service.upload;

import X.002;
import X.0KC;
import X.0mf;
import X.0qQ;
import X.1iA;
import X.2ZL;
import X.AnonymousClass3Q2;
import X.AnonymousClass4MS;
import X.AnonymousClass55S;
import X.AnonymousClass55U;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C63374Kvv;
import X.C64386Lb3;
import X.LP8;
import X.Q0Y;
import X.SAS;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.stringformat.StringFormatUtil;
import java.io.File;
import java.io.IOException;
import org.webrtc.EglBase14Impl;

public final class FbUploaderUtil {
    public static final FbUploaderUtil A00 = new Object();

    public static AnonymousClass4MS A00(C64386Lb3 lb3, long j) {
        lb3.A01 = 0;
        lb3.A03 = j;
        lb3.A00++;
        lb3.A02 = (j - 1) + 1;
        lb3.A04 = "i.instagram.com/rupload_igvideo";
        lb3.A05.A02();
        return new AnonymousClass4MS();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        if (r2 != false) goto L_0x002f;
     */
    @kotlin.Deprecated(message = "Use awaitUpload instead", replaceWith = @kotlin.ReplaceWith(expression = "awaitUpload", imports = {}))
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C62846KnM A03(X.C66498MUb r10, X.C64386Lb3 r11, X.C63740L4y r12, java.lang.String r13, java.lang.String r14, int r15) {
        /*
            java.lang.String r5 = ""
            r0 = 4
            X.0qQ.A0B(r14, r0)
            if (r13 != 0) goto L_0x0010
            java.lang.String r0 = "media file path null"
            X.KVt r2 = new X.KVt     // Catch:{ Exception -> 0x00a3 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x00a3 }
            return r2
        L_0x0010:
            java.io.File r4 = X.AnonymousClass7TE.A0t(r13)     // Catch:{ Exception -> 0x00a3 }
            long r0 = r4.length()     // Catch:{ Exception -> 0x00a3 }
            boolean r2 = r4.exists()     // Catch:{ Exception -> 0x00a3 }
            r3 = r2 ^ 1
            long r8 = r4.length()     // Catch:{ Exception -> 0x00a3 }
            r6 = 0
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            boolean r2 = X.Dba.A1U(r2)
            if (r3 != 0) goto L_0x002f
            r7 = 0
            if (r2 == 0) goto L_0x004b
        L_0x002f:
            r7 = 1
            java.lang.String r6 = r4.getParent()     // Catch:{ Exception -> 0x00a3 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x00a3 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x00a3 }
            java.lang.Object[] r3 = new java.lang.Object[]{r6, r3, r2}     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r2 = "path %s, non-existing %s, invalid len %s"
            java.lang.String r3 = X.0mp.A06(r2, r3)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r2 = "upload_media_file_invalid"
            X.0wb.A03(r2, r3)     // Catch:{ Exception -> 0x00a3 }
        L_0x004b:
            java.lang.String r2 = "FbUploaderUtil"
            if (r7 == 0) goto L_0x0068
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r0 = "file does not exist: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r4, r0, r1)     // Catch:{ Exception -> 0x00a3 }
            X.0KC.A0C(r2, r0)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r0 = "Media file doesn't exist: "
            java.lang.String r0 = X.002.A0R(r0, r13)     // Catch:{ Exception -> 0x00a3 }
            X.KVt r2 = new X.KVt     // Catch:{ Exception -> 0x00a3 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x00a3 }
            return r2
        L_0x0068:
            X.4MS r3 = A00(r11, r0)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r2 = X.C9842RiE.A00(r13, r14, r15)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r0 = r4.getPath()     // Catch:{ Exception -> 0x00a3 }
            if (r0 == 0) goto L_0x009c
            X.1iA r0 = r12.A01     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r0 = A04(r0, r4, r5)     // Catch:{ Exception -> 0x00a3 }
            X.SSw r1 = new X.SSw     // Catch:{ Exception -> 0x00a3 }
            r1.<init>((java.io.File) r4, (java.lang.String) r0, (java.lang.String) r2)     // Catch:{ Exception -> 0x00a3 }
            X.SFy r0 = r12.A00     // Catch:{ Exception -> 0x00a3 }
            X.MPe r0 = r10.Ewf(r0, r1, r11)     // Catch:{ Exception -> 0x00a3 }
            r3.A01()     // Catch:{ Exception -> 0x00a3 }
            r3.A02()     // Catch:{ Exception -> 0x00a3 }
            X.SJe r1 = r10.FNE(r0)     // Catch:{ Exception -> 0x00a3 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x00a3 }
            r3.A00(r0)     // Catch:{ Exception -> 0x00a3 }
            X.KVv r2 = new X.KVv     // Catch:{ Exception -> 0x00a3 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x00a3 }
            return r2
        L_0x009c:
            java.lang.String r0 = "rendered video file path null"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ Exception -> 0x00a3 }
            throw r0     // Catch:{ Exception -> 0x00a3 }
        L_0x00a3:
            r0 = move-exception
            X.KVu r2 = new X.KVu
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.upload.FbUploaderUtil.A03(X.MUb, X.Lb3, X.L4y, java.lang.String, java.lang.String, int):X.KnM");
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        if (r6 != false) goto L_0x005c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(X.C66498MUb r12, X.C64386Lb3 r13, X.C63740L4y r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, X.AnonymousClass4D7 r18, int r19) {
        /*
            r11 = this;
            r3 = 25
            r4 = r18
            boolean r0 = X.C66138MDq.A02(r3, r4)
            if (r0 == 0) goto L_0x0029
            r7 = r4
            X.MDq r7 = (X.C66138MDq) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0029
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0018:
            java.lang.Object r2 = r7.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L_0x0034
            if (r0 != r5) goto L_0x002f
            java.lang.Object r4 = r7.A01
            X.4MS r4 = (X.AnonymousClass4MS) r4
            goto L_0x00e6
        L_0x0029:
            X.MDq r7 = new X.MDq
            r7.<init>(r11, r4, r3)
            goto L_0x0018
        L_0x002f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0034:
            X.0eS.A00(r2)
            if (r15 != 0) goto L_0x0041
            java.lang.String r0 = "media file path null"
            X.KVt r1 = new X.KVt     // Catch:{ all -> 0x00f6 }
            r1.<init>(r0)     // Catch:{ all -> 0x00f6 }
            return r1
        L_0x0041:
            java.io.File r2 = X.AnonymousClass7TE.A0t(r15)     // Catch:{ all -> 0x00f6 }
            long r0 = r2.length()     // Catch:{ all -> 0x00f6 }
            boolean r4 = r2.exists()     // Catch:{ all -> 0x00f6 }
            r10 = r4 ^ 1
            r8 = 0
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            boolean r6 = X.Dba.A1U(r4)
            if (r10 != 0) goto L_0x005c
            r4 = 0
            if (r6 == 0) goto L_0x005d
        L_0x005c:
            r4 = 1
        L_0x005d:
            java.lang.String r6 = "FbUploaderUtil"
            if (r4 == 0) goto L_0x008f
            java.lang.StringBuilder r4 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x00f6 }
            java.lang.String r3 = "file does not exist: "
            java.lang.String r2 = X.AnonymousClass7TG.A0m(r2, r3, r4)     // Catch:{ all -> 0x00f6 }
            X.0KC.A0C(r6, r2)     // Catch:{ all -> 0x00f6 }
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x00f6 }
            java.lang.String r2 = "Media file doesn't exist, nonExisting:"
            r3.append(r2)     // Catch:{ all -> 0x00f6 }
            if (r10 != 0) goto L_0x007a
            r5 = 0
        L_0x007a:
            r3.append(r5)     // Catch:{ all -> 0x00f6 }
            java.lang.String r2 = ", length:"
            r3.append(r2)     // Catch:{ all -> 0x00f6 }
            r3.append(r0)     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x00f6 }
            X.KVt r1 = new X.KVt     // Catch:{ all -> 0x00f6 }
            r1.<init>(r0)     // Catch:{ all -> 0x00f6 }
            return r1
        L_0x008f:
            X.4MS r4 = A00(r13, r0)     // Catch:{ all -> 0x00f6 }
            r0 = r19
            r1 = r16
            java.lang.String r8 = X.C9842RiE.A00(r15, r1, r0)     // Catch:{ all -> 0x00f6 }
            r7.A01 = r4     // Catch:{ all -> 0x00f6 }
            r7.A00 = r5     // Catch:{ all -> 0x00f6 }
            X.1IW r7 = X.JTS.A0s(r7)     // Catch:{ all -> 0x00f6 }
            X.0rm r6 = X.C51965G9l.A11()     // Catch:{ all -> 0x00f6 }
            r0 = 0
            X.Lb1 r1 = new X.Lb1     // Catch:{ all -> 0x00f6 }
            r1.<init>(r12, r6, r7, r0)     // Catch:{ all -> 0x00f6 }
            X.1iA r0 = r14.A01     // Catch:{ all -> 0x00f6 }
            r5 = r17
            java.lang.String r0 = A04(r0, r2, r5)     // Catch:{ all -> 0x00f6 }
            X.SSw r5 = new X.SSw     // Catch:{ all -> 0x00f6 }
            r5.<init>((java.io.File) r2, (java.lang.String) r0, (java.lang.String) r8)     // Catch:{ all -> 0x00f6 }
            X.SFy r2 = r14.A00     // Catch:{ all -> 0x00f6 }
            X.Thj[] r0 = new X.C13816Thj[]{r13, r1}     // Catch:{ all -> 0x00f6 }
            java.util.ArrayList r1 = X.0sr.A1M(r0)     // Catch:{ all -> 0x00f6 }
            X.SmY r0 = new X.SmY     // Catch:{ all -> 0x00f6 }
            r0.<init>(r1)     // Catch:{ all -> 0x00f6 }
            X.MPe r0 = r12.Ewf(r2, r5, r0)     // Catch:{ all -> 0x00f6 }
            r6.A00 = r0     // Catch:{ all -> 0x00f6 }
            r4.A01()     // Catch:{ all -> 0x00f6 }
            r4.A02()     // Catch:{ all -> 0x00f6 }
            r1 = 45
            X.MPB r0 = new X.MPB     // Catch:{ all -> 0x00f6 }
            r0.<init>((int) r1, (java.lang.Object) r6, (java.lang.Object) r12)     // Catch:{ all -> 0x00f6 }
            r7.CO0(r0)     // Catch:{ all -> 0x00f6 }
            java.lang.Object r2 = r7.A0E()     // Catch:{ all -> 0x00f6 }
            if (r2 != r3) goto L_0x00e9
            return r3
        L_0x00e6:
            X.0eS.A00(r2)     // Catch:{ all -> 0x00f6 }
        L_0x00e9:
            X.SJe r2 = (X.C11286SJe) r2     // Catch:{ all -> 0x00f6 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00f6 }
            r4.A00(r0)     // Catch:{ all -> 0x00f6 }
            X.KVv r1 = new X.KVv     // Catch:{ all -> 0x00f6 }
            r1.<init>(r2)     // Catch:{ all -> 0x00f6 }
            goto L_0x00fb
        L_0x00f6:
            r0 = move-exception
            X.0eQ r1 = X.JTO.A1B(r0)
        L_0x00fb:
            java.lang.Throwable r0 = X.0eR.A00(r1)
            if (r0 == 0) goto L_0x0106
            X.KVu r1 = new X.KVu
            r1.<init>(r0)
        L_0x0106:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.upload.FbUploaderUtil.A05(X.MUb, X.Lb3, X.L4y, java.lang.String, java.lang.String, java.lang.String, X.4D7, int):java.lang.Object");
    }

    public static final AnonymousClass55U A01(LP8 lp8, String str) {
        AnonymousClass55S r0;
        AnonymousClass7TG.A1N(str, lp8);
        0KC.A0C("FbUploaderUtil", str);
        AnonymousClass3Q2 r02 = lp8.A0D;
        if (C63374Kvv.A00(lp8.A0C, r02.A0E(), r02.A12())) {
            r0 = AnonymousClass55S.A0G;
        } else {
            r0 = AnonymousClass55S.A0F;
        }
        return lp8.A02(r0, str);
    }

    public static final AnonymousClass55U A02(LP8 lp8, String str, Throwable th) {
        AnonymousClass7TG.A1N(th, lp8);
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("fbuploader error (%s)", str);
        String A0T = 002.A0T(formatStrLocaleSafe, th.getMessage(), ':');
        int A002 = SAS.A00(th);
        if (400 <= A002 && A002 < 500) {
            return lp8.A02(AnonymousClass55S.A05.A00(A002), A0T);
        }
        0qQ.A0A(formatStrLocaleSafe);
        IOException iOException = new IOException(A0T, th.getCause());
        0qQ.A0B(formatStrLocaleSafe, 0);
        AnonymousClass55U A02 = AnonymousClass55U.A09.A02((2ZL) null, lp8.A0H, formatStrLocaleSafe, iOException);
        lp8.A04 = A02;
        return A02;
    }

    public static final String A04(1iA r3, File file, String str) {
        switch (r3.ordinal()) {
            case 0:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                String A002 = 0mf.A00(file.getPath());
                if (A002 == null) {
                    return "unknown";
                }
                return A002;
            case 1:
            case EglBase14Impl.EGLExt_SDK_VERSION:
            case 25:
                try {
                    String str2 = Q0Y.A01(file).A03;
                    if (str2 != null) {
                        return str2;
                    }
                    return "video/mp4";
                } catch (IllegalArgumentException e) {
                    0KC.A0G("FbUploaderUtil", 002.A0R("Error reading mimeType from file ", file.getPath()), e);
                    return "video/mp4";
                }
            case 7:
                return "audio/mp4";
            case 17:
                return str;
            default:
                throw AnonymousClass7TE.A15(AnonymousClass7TG.A0m(r3, "Unsupported media type: ", AnonymousClass7TE.A1A()));
        }
    }
}
