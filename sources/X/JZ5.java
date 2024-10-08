package X;

import android.content.Context;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.util.concurrent.Callable;

public final class JZ5 implements Callable {
    public final Context A00;
    public final Medium A01;
    public final UserSession A02;
    public final boolean A03;

    /* JADX WARNING: Can't wrap try/catch for region: R(28:16|(8:18|19|20|24|(1:26)|27|(1:29)|31)(1:30)|32|33|(5:35|36|(1:38)|40|(1:42))|44|(2:45|46)|65|(2:67|68)|69|71|72|(2:74|75)|76|78|79|(2:81|82)|83|84|(3:86|(1:91)(1:90)|92)|93|(2:95|(1:103)(1:99))(1:104)|100|(1:106)|107|(1:109)|110|111) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x018b */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01ed A[Catch:{ IllegalArgumentException -> 0x022c }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0210 A[Catch:{ IllegalArgumentException -> 0x022c }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x018f A[Catch:{ IllegalArgumentException -> 0x022c }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01be A[Catch:{ IllegalArgumentException -> 0x022c }] */
    /* renamed from: A00 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C349307zv call() {
        /*
            r22 = this;
            java.lang.String r21 = "true"
            java.lang.String r20 = "false"
            java.lang.String r12 = "3pEnabled"
            r13 = r22
            com.instagram.common.gallery.Medium r11 = r13.A01
            java.lang.String r0 = r11.A0X
            java.io.File r4 = X.AnonymousClass7TE.A0t(r0)
            com.instagram.common.gallery.metadata.MediaUploadMetadata r2 = r11.A0G
            int r1 = r11.A08     // Catch:{ IOException -> 0x002c }
            r0 = 1
            if (r1 != r0) goto L_0x0022
            java.lang.String r1 = r11.A0X     // Catch:{ IOException -> 0x002c }
            r0 = 0
            X.0qQ.A0B(r1, r0)     // Catch:{ IOException -> 0x002c }
            java.lang.String r0 = X.C364678lo.A05(r1)     // Catch:{ IOException -> 0x002c }
            goto L_0x002e
        L_0x0022:
            r0 = 3
            if (r1 != r0) goto L_0x002c
            java.lang.String r0 = r11.A0X     // Catch:{ IOException -> 0x002c }
            java.lang.String r0 = X.C59737JVv.A03(r0)     // Catch:{ IOException -> 0x002c }
            goto L_0x002e
        L_0x002c:
            java.lang.String r0 = ""
        L_0x002e:
            r2.A0A = r0
            com.instagram.common.session.UserSession r10 = r13.A02
            X.0Tu r2 = X.0Tu.A06
            r0 = 36317972872173265(0x810701000216d1, double:3.030970512876475E-306)
            boolean r19 = X.182.A06(r2, r10, r0)
            java.lang.String r9 = r4.getPath()     // Catch:{ IllegalArgumentException -> 0x022c }
            if (r9 == 0) goto L_0x00cb
            int r0 = r9.length()     // Catch:{ IllegalArgumentException -> 0x022c }
            if (r0 == 0) goto L_0x00cb
            X.0Tu r8 = X.0Tu.A05     // Catch:{ IllegalArgumentException -> 0x022c }
            r0 = 36329530629111979(0x811184000140ab, double:3.0382796849038696E-306)
            boolean r0 = X.182.A06(r8, r10, r0)     // Catch:{ IllegalArgumentException -> 0x022c }
            if (r0 == 0) goto L_0x0091
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0069 }
            java.nio.file.Path r0 = java.nio.file.Paths.get(r9, r0)     // Catch:{ all -> 0x0069 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x0069 }
            long r0 = java.nio.file.Files.size(r0)     // Catch:{ all -> 0x0069 }
            java.lang.Long r3 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0069 }
            goto L_0x006e
        L_0x0069:
            r0 = move-exception
            X.0eQ r3 = X.JTO.A1B(r0)     // Catch:{ IllegalArgumentException -> 0x022c }
        L_0x006e:
            java.lang.Throwable r2 = X.0eR.A00(r3)     // Catch:{ IllegalArgumentException -> 0x022c }
            if (r2 == 0) goto L_0x0087
            java.lang.String r1 = "VideoImportCallable"
            java.lang.String r0 = "Failed to get file size"
            X.0KC.A0F(r1, r0, r2)     // Catch:{ IllegalArgumentException -> 0x022c }
            java.io.File r0 = X.AnonymousClass7TE.A0t(r9)     // Catch:{ IllegalArgumentException -> 0x022c }
            long r0 = r0.length()     // Catch:{ IllegalArgumentException -> 0x022c }
            java.lang.Long r3 = java.lang.Long.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x022c }
        L_0x0087:
            java.lang.Long r1 = X.C51971G9r.A0m()     // Catch:{ IllegalArgumentException -> 0x022c }
            boolean r0 = r3 instanceof X.0eQ     // Catch:{ IllegalArgumentException -> 0x022c }
            if (r0 == 0) goto L_0x0096
            r3 = r1
            goto L_0x0096
        L_0x0091:
            long r5 = r4.length()     // Catch:{ IllegalArgumentException -> 0x022c }
            goto L_0x009a
        L_0x0096:
            long r5 = X.AnonymousClass7TE.A0R(r3)     // Catch:{ IllegalArgumentException -> 0x022c }
        L_0x009a:
            boolean r14 = r4.exists()     // Catch:{ IllegalArgumentException -> 0x022c }
            r15 = 0
            java.lang.String r7 = "length"
            java.lang.String r4 = "fileExists"
            java.lang.String r3 = "path="
            java.lang.String r2 = "message"
            int r0 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x00f0
            X.0wj r15 = X.0wj.A01     // Catch:{ IllegalArgumentException -> 0x022c }
            java.lang.String r1 = "VideoImportCallable_invalid_file_length"
            r0 = 817902409(0x30c03349, float:1.3984415E-9)
            X.0f9 r1 = r15.AEf(r1, r0)     // Catch:{ IllegalArgumentException -> 0x022c }
            java.lang.String r0 = X.002.A0R(r3, r9)     // Catch:{ IllegalArgumentException -> 0x022c }
            r1.ABQ(r2, r0)     // Catch:{ IllegalArgumentException -> 0x022c }
            r1.ABR(r4, r14)     // Catch:{ IllegalArgumentException -> 0x022c }
            r1.ABP(r7, r5)     // Catch:{ IllegalArgumentException -> 0x022c }
            r0 = r20
            if (r19 == 0) goto L_0x00d7
            r0 = r21
            goto L_0x00d7
        L_0x00cb:
            java.lang.String r0 = "Path is null or empty "
            java.lang.String r0 = X.002.A0R(r0, r9)     // Catch:{ IllegalArgumentException -> 0x022c }
            X.Kkf r1 = new X.Kkf     // Catch:{ IllegalArgumentException -> 0x022c }
            r1.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x022c }
            goto L_0x00ef
        L_0x00d7:
            r1.ABQ(r12, r0)     // Catch:{ IllegalArgumentException -> 0x022c }
            r1.report()     // Catch:{ IllegalArgumentException -> 0x022c }
            r0 = 36329530629046442(0x811184000040aa, double:3.038279684862424E-306)
            boolean r0 = X.182.A06(r8, r10, r0)     // Catch:{ IllegalArgumentException -> 0x022c }
            if (r0 != 0) goto L_0x00f0
            java.lang.String r0 = "File is empty"
            X.Kkf r1 = new X.Kkf     // Catch:{ IllegalArgumentException -> 0x022c }
            r1.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x022c }
        L_0x00ef:
            throw r1     // Catch:{ IllegalArgumentException -> 0x022c }
        L_0x00f0:
            android.media.MediaMetadataRetriever r15 = new android.media.MediaMetadataRetriever     // Catch:{ IllegalArgumentException -> 0x022c }
            r15.<init>()     // Catch:{ IllegalArgumentException -> 0x022c }
            r15.setDataSource(r9)     // Catch:{ RuntimeException -> 0x00f9 }
            goto L_0x0164
        L_0x00f9:
            r18 = move-exception
            r16 = 36323831207570993(0x810c5500022e31, double:3.0346753477716215E-306)
            r0 = r16
            boolean r0 = X.182.A06(r8, r10, r0)     // Catch:{ IllegalArgumentException -> 0x022c }
            java.lang.String r1 = "retried"
            java.lang.String r8 = "VideoImportCallable_setDataSource"
            if (r0 == 0) goto L_0x0139
            r15.setDataSource(r9)     // Catch:{ RuntimeException -> 0x010f }
            goto L_0x0164
        L_0x010f:
            r10 = move-exception
            X.0wj r11 = X.0wj.A01     // Catch:{ IllegalArgumentException -> 0x022c }
            r0 = 817902409(0x30c03349, float:1.3984415E-9)
            X.0f9 r8 = r11.AEf(r8, r0)     // Catch:{ IllegalArgumentException -> 0x022c }
            java.lang.String r0 = X.002.A0R(r3, r9)     // Catch:{ IllegalArgumentException -> 0x022c }
            r8.ABQ(r2, r0)     // Catch:{ IllegalArgumentException -> 0x022c }
            r8.ABR(r4, r14)     // Catch:{ IllegalArgumentException -> 0x022c }
            r8.ABP(r7, r5)     // Catch:{ IllegalArgumentException -> 0x022c }
            r0 = 1
            r8.ABR(r1, r0)     // Catch:{ IllegalArgumentException -> 0x022c }
            r0 = r20
            if (r19 == 0) goto L_0x0130
            r0 = r21
        L_0x0130:
            X.AnonymousClass7TF.A19(r8, r12, r0, r10)     // Catch:{ IllegalArgumentException -> 0x022c }
            X.Kkf r1 = new X.Kkf     // Catch:{ IllegalArgumentException -> 0x022c }
            r1.<init>(r10)     // Catch:{ IllegalArgumentException -> 0x022c }
            goto L_0x00ef
        L_0x0139:
            X.0wj r10 = X.0wj.A01     // Catch:{ IllegalArgumentException -> 0x022c }
            r0 = 817902409(0x30c03349, float:1.3984415E-9)
            X.0f9 r8 = r10.AEf(r8, r0)     // Catch:{ IllegalArgumentException -> 0x022c }
            java.lang.String r0 = X.002.A0R(r3, r9)     // Catch:{ IllegalArgumentException -> 0x022c }
            r8.ABQ(r2, r0)     // Catch:{ IllegalArgumentException -> 0x022c }
            r8.ABR(r4, r14)     // Catch:{ IllegalArgumentException -> 0x022c }
            r8.ABP(r7, r5)     // Catch:{ IllegalArgumentException -> 0x022c }
            r0 = 0
            r8.ABR(r1, r0)     // Catch:{ IllegalArgumentException -> 0x022c }
            r1 = r20
            if (r19 == 0) goto L_0x0159
            r1 = r21
        L_0x0159:
            r0 = r18
            X.AnonymousClass7TF.A19(r8, r12, r1, r0)     // Catch:{ IllegalArgumentException -> 0x022c }
            X.Kkf r1 = new X.Kkf     // Catch:{ IllegalArgumentException -> 0x022c }
            r1.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x022c }
            goto L_0x00ef
        L_0x0164:
            r0 = 24
            r6 = 0
            java.lang.String r0 = r15.extractMetadata(r0)     // Catch:{ IllegalArgumentException -> 0x022c }
            if (r0 == 0) goto L_0x0171
            int r6 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0171 }
        L_0x0171:
            r0 = 18
            r5 = 0
            java.lang.String r0 = r15.extractMetadata(r0)     // Catch:{ IllegalArgumentException -> 0x022c }
            if (r0 == 0) goto L_0x017e
            int r5 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x017e }
        L_0x017e:
            r0 = 19
            r4 = 0
            java.lang.String r0 = r15.extractMetadata(r0)     // Catch:{ IllegalArgumentException -> 0x022c }
            if (r0 == 0) goto L_0x018b
            int r4 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x018b }
        L_0x018b:
            int r2 = r11.A03     // Catch:{ IllegalArgumentException -> 0x022c }
            if (r2 > 0) goto L_0x01a5
            r0 = 9
            java.lang.String r0 = r15.extractMetadata(r0)     // Catch:{ IllegalArgumentException -> 0x022c }
            if (r0 == 0) goto L_0x01a2
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)     // Catch:{ IllegalArgumentException -> 0x022c }
            if (r0 == 0) goto L_0x01a2
            long r0 = r0.longValue()     // Catch:{ IllegalArgumentException -> 0x022c }
            goto L_0x01a4
        L_0x01a2:
            r0 = 0
        L_0x01a4:
            int r2 = (int) r0     // Catch:{ IllegalArgumentException -> 0x022c }
        L_0x01a5:
            X.7zv r3 = new X.7zv     // Catch:{ IllegalArgumentException -> 0x022c }
            r3.<init>(r11, r5, r4, r6)     // Catch:{ IllegalArgumentException -> 0x022c }
            r3.A07 = r2     // Catch:{ IllegalArgumentException -> 0x022c }
            android.content.Context r4 = r13.A00     // Catch:{ IllegalArgumentException -> 0x022c }
            android.net.Uri r0 = r11.A02()     // Catch:{ IllegalArgumentException -> 0x022c }
            java.lang.String r0 = X.C59805JYz.A00(r4, r0)     // Catch:{ IllegalArgumentException -> 0x022c }
            r3.A0i = r0     // Catch:{ IllegalArgumentException -> 0x022c }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalArgumentException -> 0x022c }
            r0 = 30
            if (r1 < r0) goto L_0x01ed
            r0 = 36
            java.lang.String r0 = r15.extractMetadata(r0)     // Catch:{ IllegalArgumentException -> 0x022c }
            if (r0 == 0) goto L_0x01eb
            java.lang.Integer r0 = X.00y.A0l(r0)     // Catch:{ IllegalArgumentException -> 0x022c }
            if (r0 == 0) goto L_0x01eb
            int r0 = r0.intValue()     // Catch:{ IllegalArgumentException -> 0x022c }
        L_0x01d0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x022c }
            r3.A0b = r0     // Catch:{ IllegalArgumentException -> 0x022c }
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x022c }
            r3.A0Z = r0     // Catch:{ IllegalArgumentException -> 0x022c }
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x022c }
            r3.A0a = r0     // Catch:{ IllegalArgumentException -> 0x022c }
            boolean r0 = r13.A03     // Catch:{ IllegalArgumentException -> 0x022c }
            if (r0 == 0) goto L_0x0208
            X.0v6 r0 = r3.A0U     // Catch:{ IllegalArgumentException -> 0x022c }
            goto L_0x01f4
        L_0x01eb:
            r0 = 3
            goto L_0x01d0
        L_0x01ed:
            java.lang.String r0 = r3.A0k     // Catch:{ IllegalArgumentException -> 0x022c }
            int r0 = X.C7324Q4a.A00(r0)     // Catch:{ IllegalArgumentException -> 0x022c }
            goto L_0x01d0
        L_0x01f4:
            if (r0 != 0) goto L_0x0208
            java.lang.String r0 = r3.A0k     // Catch:{ IllegalArgumentException -> 0x022c }
            java.io.File r0 = X.AnonymousClass7TE.A0t(r0)     // Catch:{ IllegalArgumentException -> 0x022c }
            com.instagram.common.util.gradient.BackgroundGradientColors r1 = X.C39908AIz.A02(r0)     // Catch:{ IllegalArgumentException -> 0x022c }
            int r0 = r3.A09     // Catch:{ IllegalArgumentException -> 0x022c }
            X.0v6 r0 = X.0oY.A01(r1, r0)     // Catch:{ IllegalArgumentException -> 0x022c }
            r3.A0U = r0     // Catch:{ IllegalArgumentException -> 0x022c }
        L_0x0208:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r3.A02()     // Catch:{ IllegalArgumentException -> 0x022c }
            java.lang.String r0 = r0.A08     // Catch:{ IllegalArgumentException -> 0x022c }
            if (r0 != 0) goto L_0x021a
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r3.A02()     // Catch:{ IllegalArgumentException -> 0x022c }
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r11.A0G     // Catch:{ IllegalArgumentException -> 0x022c }
            java.lang.String r0 = r0.A08     // Catch:{ IllegalArgumentException -> 0x022c }
            r1.A08 = r0     // Catch:{ IllegalArgumentException -> 0x022c }
        L_0x021a:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r2 = r3.A02()     // Catch:{ IllegalArgumentException -> 0x022c }
            java.lang.String r1 = r11.A0X     // Catch:{ IllegalArgumentException -> 0x022c }
            android.net.Uri r0 = r11.A02()     // Catch:{ IllegalArgumentException -> 0x022c }
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = X.C59778JXx.A00(r4, r0, r10, r1)     // Catch:{ IllegalArgumentException -> 0x022c }
            r2.A00(r0)     // Catch:{ IllegalArgumentException -> 0x022c }
            return r3
        L_0x022c:
            r3 = move-exception
            X.0wj r2 = X.0wj.A01
            java.lang.String r1 = "VideoImportCallable_IllegalArgumentException"
            r0 = 817902409(0x30c03349, float:1.3984415E-9)
            X.0f9 r1 = r2.AEf(r1, r0)
            if (r19 == 0) goto L_0x023c
            r20 = r21
        L_0x023c:
            r0 = r20
            X.AnonymousClass7TF.A19(r1, r12, r0, r3)
            java.lang.String r1 = "Error importing video"
            X.Kkf r0 = new X.Kkf
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JZ5.call():X.7zv");
    }

    public JZ5(Context context, Medium medium, UserSession userSession, boolean z) {
        AnonymousClass7TG.A1U(context, medium, userSession);
        this.A00 = context;
        this.A01 = medium;
        this.A02 = userSession;
        this.A03 = z;
    }
}
