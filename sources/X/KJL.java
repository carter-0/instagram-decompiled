package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class KJL extends 0ng {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass3Q2 A02;
    public final C2373837k A03;
    public final C63382Kw3 A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KJL(Context context, UserSession userSession, AnonymousClass3Q2 r6, C2373837k r7, C63382Kw3 kw3) {
        super(442, 3, false, false);
        0qQ.A0B(kw3, 5);
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = r7;
        this.A02 = r6;
        this.A04 = kw3;
    }

    private final void A01(AnonymousClass3QP r6) {
        List<C60895JtF> list = r6.A06;
        C63040xi r3 = 0tS.A4E;
        if (!r3.A00().A0Z()) {
            for (C60895JtF jtF : list) {
                String str = jtF.A06;
                if (str != null && JTQ.A1Z(str)) {
                    0mb.A08(str);
                }
            }
        }
        if (!r3.A00().A0Z()) {
            for (C60895JtF jtF2 : list) {
                String str2 = jtF2.A05;
                if (str2 != null && JTQ.A1Z(str2)) {
                    0mb.A08(str2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0198, code lost:
        if (r1 == null) goto L_0x0245;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r42 = this;
            java.lang.String r19 = "ssim_report_error"
            java.lang.String r20 = "ssim report error"
            java.lang.String r14 = "SSIMCalcTask"
            r6 = r42
            X.37k r5 = r6.A03     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.3Q2 r4 = r6.A02     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.37j r5 = (X.C2373737j) r5     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r2 = 0
            android.content.Context r0 = r5.A00     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r41 = r0
            com.instagram.common.session.UserSession r0 = r5.A02     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r40 = r0
            X.JbW r3 = new X.JbW     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r1 = r41
            r3.<init>(r1, r0, r4)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.0wc r0 = r5.A01     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r39 = r0
            java.lang.String r7 = "measure_quality_attempt"
            X.0kJ r0 = r0.A00     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r38 = r0
            r1 = r39
            X.0Aj r9 = r1.A00(r0, r7)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            boolean r0 = r9.isSampled()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            if (r0 == 0) goto L_0x00af
            X.3Q2 r7 = r3.A02     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.4nB r0 = r7.A1W     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r8 = 0
            if (r0 == 0) goto L_0x0045
            int r1 = r0.A00     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r0 = -1
            if (r1 == r0) goto L_0x0045
            double r0 = (double) r1     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.Double r8 = java.lang.Double.valueOf(r0)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
        L_0x0045:
            java.lang.String r0 = r7.A3t     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.Long r1 = X.DbV.A0q(r0)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r0 = "upload_id"
            r9.A9F(r0, r1)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.C59908JbX.A06(r9, r3)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.3QD r0 = r7.A1f     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r1 = r0.toString()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r0 = "from"
            X.C59908JbX.A05(r9, r3, r0, r1)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            com.instagram.pendingmedia.model.constants.ShareType r0 = r7.A0E()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r1 = r0.toString()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r0 = "share_type"
            r9.AAJ(r0, r1)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r1 = r7.A0F()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            int r0 = r1.length()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            if (r0 != 0) goto L_0x0076
            r1 = 0
        L_0x0076:
            java.lang.String r0 = "waterfall_id"
            r9.AAJ(r0, r1)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            A00(r9, r3)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.Long r1 = r3.A08()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r0 = "video_duration"
            r9.A9F(r0, r1)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            boolean r0 = r3.A0J()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            long r0 = X.G9t.A0k(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r0 = "is_carousel_child"
            r9.A9F(r0, r1)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            if (r8 == 0) goto L_0x009b
            goto L_0x009e
        L_0x009b:
            r7 = -1
            goto L_0x00a3
        L_0x009e:
            double r0 = r8.doubleValue()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            long r7 = (long) r0     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
        L_0x00a3:
            java.lang.Long r1 = java.lang.Long.valueOf(r7)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r0 = "target_bitrate_bps"
            r9.A9F(r0, r1)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r9.Cgf()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
        L_0x00af:
            X.3QP r8 = r4.A1j     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            com.instagram.common.session.UserSession r0 = r6.A01     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r24 = r0
            android.content.Context r1 = r6.A00     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.0qQ.A0B(r8, r2)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.util.List r3 = r8.A06     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            boolean r0 = X.AnonymousClass7TE.A1b(r3)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            if (r0 == 0) goto L_0x014c
            java.lang.Object r0 = r3.get(r2)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.JtF r0 = (X.C60895JtF) r0     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r0 = r0.A05     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            if (r0 != 0) goto L_0x014c
            java.util.List r3 = r8.A06     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            int r7 = r3.size()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r0 = 1
            int r7 = r7 - r0
            java.lang.Object r0 = r3.get(r7)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.JtF r0 = (X.C60895JtF) r0     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            long r10 = r0.A04     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r9 = r8.A04     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            if (r9 == 0) goto L_0x0518
            X.0mb.A03(r9)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.Ml0 r25 = X.JYY.A00(r24)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            com.instagram.util.creation.ShaderBridge.ensureShaderBridgeLoaded()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.3QP r0 = r4.A1j     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            int r8 = r0.A02     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            int r0 = r0.A01     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            android.graphics.Point r7 = new android.graphics.Point     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r7.<init>(r8, r0)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            int r0 = r7.x     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            if (r0 <= 0) goto L_0x0511
            int r0 = r7.y     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            if (r0 <= 0) goto L_0x051f
            X.JYc r31 = X.C59784JYd.A01(r7, r4)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r0 = r24
            com.instagram.filterkit.filter.VideoFilter r29 = X.AnonymousClass9SY.A00(r1, r0)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.TtC r30 = X.C14279TtC.A01     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.Q0g r0 = new X.Q0g     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r26 = r0
            r27 = r1
            r28 = r24
            r26.<init>(r27, r28, r29, r30, r31)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            boolean r7 = r3 instanceof java.util.Collection     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            if (r7 == 0) goto L_0x025d
            boolean r7 = r3.isEmpty()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            if (r7 == 0) goto L_0x025d
        L_0x011e:
            X.M0o r8 = new X.M0o     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r8.<init>(r3)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            int r7 = r0.A08     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            int r3 = r0.A07     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.io.File r27 = X.AnonymousClass7TE.A0t(r9)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.0sn r28 = X.0sn.A00     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r31 = 0
            X.Q0j r21 = new X.Q0j     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r22 = r1
            r23 = r0
            r26 = r8
            r29 = r7
            r30 = r3
            r33 = r10
            r35 = r2
            r36 = r2
            r37 = r2
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r35, r36, r37)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r21.A01()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.JTP.A1M(r24)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
        L_0x014c:
            java.lang.String r9 = "frame_skip_ssim_calc"
            java.lang.String r8 = "skip ssim calc at %s ms"
            java.util.ArrayList r21 = X.AnonymousClass7TE.A1C()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.3QP r0 = r4.A1j     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.util.List r0 = r0.A06     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.util.Iterator r18 = r0.iterator()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
        L_0x015c:
            boolean r0 = r18.hasNext()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            if (r0 == 0) goto L_0x0273
            java.lang.Object r11 = r18.next()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.JtF r11 = (X.C60895JtF) r11     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r17 = 0
            java.lang.String r0 = r11.A05     // Catch:{ all -> 0x023d }
            java.lang.String r3 = "Required value was null."
            if (r0 == 0) goto L_0x0238
            android.graphics.Bitmap r12 = android.graphics.BitmapFactory.decodeFile(r0)     // Catch:{ all -> 0x023d }
            if (r12 == 0) goto L_0x0233
            r12.getConfig()     // Catch:{ all -> 0x022f }
            android.graphics.Bitmap$Config r0 = r12.getConfig()     // Catch:{ all -> 0x022f }
            android.graphics.Bitmap$Config r15 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x022f }
            if (r0 == r15) goto L_0x019c
            r12.getConfig()     // Catch:{ all -> 0x022f }
            android.graphics.Bitmap r1 = r12.copy(r15, r2)     // Catch:{ all -> 0x022f }
            r12.recycle()     // Catch:{ all -> 0x0196 }
            if (r1 == 0) goto L_0x018f
            r12 = r1
            goto L_0x019c
        L_0x018f:
            java.lang.String r0 = "compare image reconfig failed"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x0196 }
            throw r0     // Catch:{ all -> 0x0196 }
        L_0x0196:
            r0 = move-exception
            r12 = r1
            if (r1 == 0) goto L_0x0245
            goto L_0x0242
        L_0x019c:
            java.lang.String r0 = r11.A06     // Catch:{ all -> 0x022f }
            if (r0 == 0) goto L_0x020f
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeFile(r0)     // Catch:{ all -> 0x022f }
            if (r10 == 0) goto L_0x020a
            r17 = r10
            int r13 = r12.getWidth()     // Catch:{ all -> 0x022f }
            int r7 = r12.getHeight()     // Catch:{ all -> 0x022f }
            int r3 = r10.getWidth()     // Catch:{ all -> 0x022f }
            int r1 = r10.getHeight()     // Catch:{ all -> 0x022f }
            boolean r16 = X.AnonymousClass7TF.A1S(r13, r3)
            java.lang.String r0 = " vs "
            if (r16 == 0) goto L_0x01ff
            if (r7 != r1) goto L_0x01f4
            r10.getConfig()     // Catch:{ all -> 0x022f }
            android.graphics.Bitmap$Config r0 = r10.getConfig()     // Catch:{ all -> 0x022f }
            if (r0 != r15) goto L_0x0214
            com.facebook.photos.upload.mediaqualitykit.imagequalityutils.ImageQualityUtils r0 = new com.facebook.photos.upload.mediaqualitykit.imagequalityutils.ImageQualityUtils     // Catch:{ all -> 0x022f }
            r0.<init>()     // Catch:{ all -> 0x022f }
            float r3 = r0.calculateSSIM(r10, r12)     // Catch:{ all -> 0x022f }
            r11.A00 = r3     // Catch:{ all -> 0x022f }
            double r0 = (double) r3     // Catch:{ all -> 0x022f }
            r15 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r7 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r7 < 0) goto L_0x01ed
            r10.recycle()     // Catch:{ IllegalStateException | NullPointerException -> 0x0246 }
            r12.recycle()     // Catch:{ IllegalStateException | NullPointerException -> 0x0246 }
            r0 = r21
            X.JTP.A1V(r0, r3)     // Catch:{ IllegalStateException | NullPointerException -> 0x0246 }
            goto L_0x015c
        L_0x01ed:
            java.lang.String r0 = "unified filter temp workaround"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)     // Catch:{ all -> 0x022f }
            goto L_0x022e
        L_0x01f4:
            java.lang.String r3 = "height differs "
            java.lang.String r0 = X.002.A02(r1, r7, r3, r0)     // Catch:{ all -> 0x022f }
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x022f }
            goto L_0x022e
        L_0x01ff:
            java.lang.String r1 = "width differs "
            java.lang.String r0 = X.002.A02(r3, r13, r1, r0)     // Catch:{ all -> 0x022f }
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x022f }
            goto L_0x022e
        L_0x020a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)     // Catch:{ all -> 0x022f }
            goto L_0x022e
        L_0x020f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)     // Catch:{ all -> 0x022f }
            goto L_0x022e
        L_0x0214:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x022f }
            java.lang.String r0 = "reference config "
            r1.append(r0)     // Catch:{ all -> 0x022f }
            android.graphics.Bitmap$Config r0 = r10.getConfig()     // Catch:{ all -> 0x022f }
            r1.append(r0)     // Catch:{ all -> 0x022f }
            java.lang.String r0 = " is not ARGB8888"
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)     // Catch:{ all -> 0x022f }
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x022f }
        L_0x022e:
            throw r0     // Catch:{ all -> 0x022f }
        L_0x022f:
            r0 = move-exception
            if (r17 == 0) goto L_0x0242
            goto L_0x023f
        L_0x0233:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)     // Catch:{ all -> 0x023d }
            goto L_0x023c
        L_0x0238:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)     // Catch:{ all -> 0x023d }
        L_0x023c:
            throw r0     // Catch:{ all -> 0x023d }
        L_0x023d:
            r0 = move-exception
            goto L_0x0245
        L_0x023f:
            r17.recycle()     // Catch:{ IllegalStateException | NullPointerException -> 0x0246 }
        L_0x0242:
            r12.recycle()     // Catch:{ IllegalStateException | NullPointerException -> 0x0246 }
        L_0x0245:
            throw r0     // Catch:{ IllegalStateException | NullPointerException -> 0x0246 }
        L_0x0246:
            r3 = move-exception
            long r0 = r11.A04     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            long r0 = X.AnonymousClass7TE.A0P(r0)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.0KC.A0L(r14, r8, r3, r0)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.0wb.A07(r9, r3)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            goto L_0x015c
        L_0x025d:
            java.util.Iterator r8 = r3.iterator()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
        L_0x0261:
            boolean r7 = r8.hasNext()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            if (r7 == 0) goto L_0x011e
            java.lang.Object r7 = r8.next()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.JtF r7 = (X.C60895JtF) r7     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            int r7 = r7.A02     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            if (r7 >= 0) goto L_0x0261
            goto L_0x011e
        L_0x0273:
            X.S2o r1 = new X.S2o     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r1.<init>()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r0 = r21
            r1.A00(r0)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            long r0 = r1.A04     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r15 = 0
            int r2 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            boolean r2 = X.AnonymousClass7TF.A1P(r2)
            X.17k.A0F(r2)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            int r2 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1R(r2)
            X.17k.A0F(r0)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.JbW r2 = new X.JbW     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r1 = r41
            r0 = r40
            r2.<init>(r1, r0, r4)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r3 = "measure_quality_success"
            r1 = r39
            r0 = r38
            X.0Aj r7 = r1.A00(r0, r3)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            boolean r0 = r7.isSampled()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            if (r0 == 0) goto L_0x0327
            X.3Q2 r3 = r2.A02     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.4nB r0 = r3.A1W     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r8 = 0
            if (r0 == 0) goto L_0x02bd
            int r1 = r0.A00     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r0 = -1
            if (r1 == r0) goto L_0x02bd
            double r0 = (double) r1     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.Double r8 = java.lang.Double.valueOf(r0)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
        L_0x02bd:
            java.lang.String r0 = r3.A3t     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.Long r1 = X.DbV.A0q(r0)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r0 = "upload_id"
            r7.A9F(r0, r1)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.C59908JbX.A06(r7, r2)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            A00(r7, r2)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.3QD r0 = r3.A1f     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r1 = r0.toString()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r0 = "from"
            X.C59908JbX.A05(r7, r2, r0, r1)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            com.instagram.pendingmedia.model.constants.ShareType r0 = r3.A0E()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r1 = r0.toString()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r0 = "share_type"
            r7.AAJ(r0, r1)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.Long r1 = r2.A08()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r0 = "video_duration"
            r7.A9F(r0, r1)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r1 = r3.A0F()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            int r0 = r1.length()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            if (r0 != 0) goto L_0x02fa
            r1 = 0
        L_0x02fa:
            java.lang.String r0 = "waterfall_id"
            r7.AAJ(r0, r1)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            boolean r0 = r2.A0J()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            long r0 = X.G9t.A0k(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r0 = "is_carousel_child"
            r7.A9F(r0, r1)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            if (r8 == 0) goto L_0x0313
            goto L_0x0316
        L_0x0313:
            r2 = -1
            goto L_0x031b
        L_0x0316:
            double r0 = r8.doubleValue()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            long r2 = (long) r0     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
        L_0x031b:
            java.lang.Long r1 = java.lang.Long.valueOf(r2)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r0 = "target_bitrate_bps"
            r7.A9F(r0, r1)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r7.Cgf()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
        L_0x0327:
            java.lang.String r7 = r4.A3t     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.3QP r10 = r4.A1j     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            long r2 = r4.A0d     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            com.instagram.pendingmedia.model.ClipInfo r12 = r4.A1N     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.C51974G9v.A1L(r7, r10, r12)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.1NY r11 = X.AnonymousClass7TG.A0a(r24)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r18 = 1
            r0 = r18
            r11.A0R = r0     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.StringBuilder r8 = X.AnonymousClass7TE.A1A()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.UzA r1 = X.C16674UzA.QUALITY_REPORT     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r0 = r24
            r1.A00(r11, r0, r8)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r0 = X.DbT.A10(r8)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r11.A0E = r0     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r17 = "upload_id"
            r0 = r17
            r11.A9m(r0, r7)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            org.json.JSONObject r7 = X.DbS.A11()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            int r1 = r12.A09     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r0 = "original_width"
            r7.put(r0, r1)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            int r1 = r12.A06     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r0 = "original_height"
            r7.put(r0, r1)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            long r0 = r12.A0A     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            int r8 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r8 <= 0) goto L_0x03f0
            long r0 = r12.A00()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r8 = 8000(0x1f40, double:3.9525E-320)
            long r0 = r0 * r8
            long r8 = r12.A0A     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            long r0 = r0 / r8
            int r8 = (int) r0     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
        L_0x0377:
            java.lang.String r0 = "original_bit_rate"
            r7.put(r0, r8)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            int r1 = r10.A02     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r0 = 1307(0x51b, float:1.831E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r7.put(r0, r1)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            int r1 = r10.A01     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r0 = 1306(0x51a, float:1.83E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r7.put(r0, r1)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r0 = 3
            long r2 = r2 << r0
            float r8 = (float) r2     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            int r0 = X.JTO.A09(r12)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            float r12 = (float) r0     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r2 = 1
            long r0 = r13.toMillis(r2)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            float r9 = (float) r0     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            float r12 = r12 / r9
            float r8 = r8 / r12
            double r0 = (double) r8     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r8 = "encoded_bit_rate"
            r7.put(r8, r0)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            org.json.JSONArray r12 = new org.json.JSONArray     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r12.<init>()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.util.List r0 = r10.A06     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
        L_0x03b6:
            boolean r0 = r16.hasNext()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            if (r0 == 0) goto L_0x03f2
            java.lang.Object r9 = r16.next()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.JtF r9 = (X.C60895JtF) r9     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            float r1 = r9.A00     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x03b6
            org.json.JSONObject r8 = X.DbS.A11()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            long r0 = r9.A04     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            float r10 = (float) r0     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            long r0 = r13.toMicros(r2)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            float r15 = (float) r0     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            float r10 = r10 / r15
            double r0 = (double) r10     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r10 = "timestamp"
            r8.put(r10, r0)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            float r0 = r9.A00     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            double r0 = (double) r0     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r10 = "ssim"
            r8.put(r10, r0)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            int r1 = r9.A02     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r0 = "index"
            r8.put(r0, r1)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r12.put(r8)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            goto L_0x03b6
        L_0x03f0:
            r8 = -1
            goto L_0x0377
        L_0x03f2:
            java.lang.String r0 = "measured_frames"
            r7.put(r0, r12)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r1 = r7.toString()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r0 = "quality_info"
            r11.A9m(r0, r1)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.1QX r8 = r11.A0N()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r1 = "upload_quality_attempt"
            r10 = 0
            X.Kvy r0 = new X.Kvy     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r0.<init>()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.0xI r0 = X.C2373737j.A00(r10, r4, r5, r1)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.C2373737j.A07(r0, r5)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r0 = 2
            X.Lel r7 = new X.Lel     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r7.<init>(r0)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.9Fq r1 = X.C375889Fq.A00     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.Lj4 r0 = new X.Lj4     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r0.<init>(r1, r7)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.L6w r0 = com.instagram.pendingmedia.service.common.ParsingSyncHttpService.A00(r0, r8)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.2ZL r0 = r0.A00     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            if (r0 == 0) goto L_0x049a
            int r1 = r0.A02     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x049a
            java.lang.String r9 = r21.toString()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.util.Iterator r13 = r21.iterator()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            boolean r0 = r13.hasNext()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.17k.A0E(r0)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.Object r0 = r13.next()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            double r15 = X.JTO.A00(r0)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r7 = 1
        L_0x0447:
            boolean r0 = r13.hasNext()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            if (r0 == 0) goto L_0x0478
            java.lang.Object r0 = r13.next()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            double r11 = X.JTO.A00(r0)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            long r7 = r7 + r2
            boolean r1 = X.SC3.A00(r11)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            if (r1 == 0) goto L_0x0467
            boolean r0 = X.SC3.A00(r15)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            if (r0 == 0) goto L_0x0467
            double r11 = r11 - r15
            double r0 = (double) r7     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            double r11 = r11 / r0
            double r15 = r15 + r11
            goto L_0x0447
        L_0x0467:
            boolean r0 = X.SC3.A00(r15)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            if (r0 == 0) goto L_0x046f
            r15 = r11
            goto L_0x0447
        L_0x046f:
            if (r1 != 0) goto L_0x0447
            int r0 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0447
            r15 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            goto L_0x0447
        L_0x0478:
            r0 = r18
            X.0qQ.A0B(r9, r0)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r1 = "upload_quality_success"
            X.Kvy r0 = new X.Kvy     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r0.<init>()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.0xI r2 = X.C2373737j.A00(r10, r4, r5, r1)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.Double r1 = java.lang.Double.valueOf(r15)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r0 = "quality"
            r2.A0A(r0, r1)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r0 = "reason"
            r2.A0C(r0, r9)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.C2373737j.A07(r2, r5)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            goto L_0x050b
        L_0x049a:
            X.JbW r3 = new X.JbW     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r1 = r41
            r0 = r40
            r3.<init>(r1, r0, r4)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r2 = "upload_quality_failure"
            r1 = r39
            r0 = r38
            X.0Aj r2 = r1.A00(r0, r2)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            boolean r0 = r2.isSampled()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            if (r0 == 0) goto L_0x050b
            X.3Q2 r5 = r3.A02     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r0 = r5.A3t     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.Long r1 = X.DbV.A0q(r0)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r0 = r17
            r2.A9F(r0, r1)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.C59908JbX.A06(r2, r3)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            A00(r2, r3)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            X.3QD r0 = r5.A1f     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r1 = r0.toString()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r0 = "from"
            X.C59908JbX.A05(r2, r3, r0, r1)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            com.instagram.pendingmedia.model.constants.ShareType r0 = r5.A0E()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r1 = r0.toString()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r0 = "share_type"
            r2.AAJ(r0, r1)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.Long r1 = r3.A08()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r0 = "video_duration"
            r2.A9F(r0, r1)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r1 = r5.A0F()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            int r0 = r1.length()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            if (r0 != 0) goto L_0x04f2
            r1 = 0
        L_0x04f2:
            java.lang.String r0 = "waterfall_id"
            r2.AAJ(r0, r1)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            boolean r0 = r3.A0J()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            long r0 = X.G9t.A0k(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            java.lang.String r0 = "is_carousel_child"
            r2.A9F(r0, r1)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            r2.Cgf()     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
        L_0x050b:
            X.3QP r0 = r4.A1j     // Catch:{ IOException | OutOfMemoryError | RuntimeException | JSONException -> 0x0568 }
            r6.A01(r0)     // Catch:{ IOException | OutOfMemoryError | RuntimeException | JSONException -> 0x0568 }
            return
        L_0x0511:
            java.lang.String r0 = "invalid width in render size"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            goto L_0x0525
        L_0x0518:
            java.lang.String r0 = "video path for compare extraction is null"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
            goto L_0x0525
        L_0x051f:
            java.lang.String r0 = "invalid height in render size"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
        L_0x0525:
            throw r0     // Catch:{ OutOfMemoryError -> 0x0544, RuntimeException -> 0x0536, IOException -> 0x0528, JSONException -> 0x0526 }
        L_0x0526:
            r2 = move-exception
            goto L_0x0552
        L_0x0528:
            r2 = move-exception
            r0 = r20
            X.0KC.A0F(r14, r0, r2)     // Catch:{ all -> 0x055f }
            X.37k r1 = r6.A03     // Catch:{ all -> 0x055f }
            X.3Q2 r0 = r6.A02     // Catch:{ all -> 0x055f }
            r1.EG9(r0, r2)     // Catch:{ all -> 0x055f }
            goto L_0x055e
        L_0x0536:
            r2 = move-exception
            r0 = r20
            X.0KC.A0F(r14, r0, r2)     // Catch:{ all -> 0x055f }
            X.37k r1 = r6.A03     // Catch:{ all -> 0x055f }
            X.3Q2 r0 = r6.A02     // Catch:{ all -> 0x055f }
            r1.EG9(r0, r2)     // Catch:{ all -> 0x055f }
            goto L_0x055e
        L_0x0544:
            r2 = move-exception
            r0 = r20
            X.0KC.A0F(r14, r0, r2)     // Catch:{ all -> 0x055f }
            X.37k r1 = r6.A03     // Catch:{ all -> 0x055f }
            X.3Q2 r0 = r6.A02     // Catch:{ all -> 0x055f }
            r1.EG9(r0, r2)     // Catch:{ all -> 0x055f }
            goto L_0x055e
        L_0x0552:
            r0 = r20
            X.0KC.A0F(r14, r0, r2)     // Catch:{ all -> 0x055f }
            X.37k r1 = r6.A03     // Catch:{ all -> 0x055f }
            X.3Q2 r0 = r6.A02     // Catch:{ all -> 0x055f }
            r1.EG9(r0, r2)     // Catch:{ all -> 0x055f }
        L_0x055e:
            throw r2     // Catch:{ all -> 0x055f }
        L_0x055f:
            r1 = move-exception
            X.3Q2 r0 = r6.A02     // Catch:{ IOException | OutOfMemoryError | RuntimeException | JSONException -> 0x0568 }
            X.3QP r0 = r0.A1j     // Catch:{ IOException | OutOfMemoryError | RuntimeException | JSONException -> 0x0568 }
            r6.A01(r0)     // Catch:{ IOException | OutOfMemoryError | RuntimeException | JSONException -> 0x0568 }
            throw r1     // Catch:{ IOException | OutOfMemoryError | RuntimeException | JSONException -> 0x0568 }
        L_0x0568:
            r1 = move-exception
            r0 = r19
            X.0wb.A07(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KJL.run():void");
    }

    public static void A00(0Aj r2, C59907JbW jbW) {
        r2.A9F("dimension", jbW.A0D());
        r2.A9F("dimension_height", jbW.A0B());
    }
}
