package X;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.LinkedList;

public final class LO5 {
    public final Context A00;
    public final UserSession A01;
    public final MV7 A02;
    public final Integer A03;
    public final LinkedList A04 = new LinkedList();

    public static final void A00(LO5 lo5, LOX lox) {
        String str;
        String str2;
        String str3 = lox.A02.A04;
        File A0t = AnonymousClass7TE.A0t(str3);
        String name = A0t.getName();
        0qQ.A0A(name);
        0qQ.A0B(name, 0);
        String substring = TextUtils.substring(name, 0, 00l.A05(name, '.', name.length() - 1));
        ContentValues contentValues = new ContentValues();
        contentValues.put(DialogModule.KEY_TITLE, substring);
        contentValues.put("_display_name", name);
        contentValues.put("datetaken", C51968G9o.A0u());
        String A002 = 0mf.A00(name);
        if (A002 == null) {
            A002 = "unknown";
        }
        contentValues.put("mime_type", A002);
        contentValues.put("_size", Long.valueOf(A0t.length()));
        lox.A02(lo5.A01);
        Context context = lo5.A00;
        ContentResolver contentResolver = context.getContentResolver();
        if (Build.VERSION.SDK_INT <= 29) {
            contentValues.put("_data", str3);
            try {
                contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            } catch (Exception e) {
                e = e;
                str = "ImageRendererSaveHelper";
                str2 = "Save photo failed (legacy)";
                0kD.A0D(str, str2, e);
            }
        } else {
            contentValues.put("relative_path", 0qc.A03(context));
            try {
                Uri insert = contentResolver.insert(MediaStore.Images.Media.getContentUri("external"), contentValues);
                if (insert != null) {
                    contentResolver.update(insert, contentValues, (String) null, (String[]) null);
                } else {
                    0kD.A0D("ImageRendererSaveHelper", "Save photo failed (11+): could not update file metadata", (Throwable) null);
                }
            } catch (Exception e2) {
                e = e2;
                str = "ImageRendererSaveHelper";
                str2 = "Save photo failed (11+)";
                0kD.A0D(str, str2, e);
            }
        }
    }

    public LO5(Context context, UserSession userSession, MV7 mv7, Integer num) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = mv7;
        this.A03 = num;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0092, code lost:
        if (r14 == r11) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x017d, code lost:
        if (r6.intValue() > 0) goto L_0x017f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03a6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.L6R A01(android.graphics.Bitmap r29, X.L6Q r30, X.L4D r31, X.LAM r32, int r33, int r34, int r35, int r36, int r37, boolean r38, boolean r39) {
        /*
            r28 = this;
            r19 = r29
            r7 = 0
            r13 = r32
            X.0qQ.A0B(r13, r7)
            X.4MS r18 = new X.4MS
            r18.<init>()
            X.KgB r14 = r13.A02
            X.KgB r0 = X.C62461KgB.GALLERY
            r5 = r28
            r15 = r30
            r26 = r33
            r9 = r36
            r12 = r37
            if (r14 != r0) goto L_0x0121
            com.instagram.common.session.UserSession r0 = r5.A01
            X.0Tu r1 = X.0Tu.A05
            r2 = 36592447052120568(0x8200a3000101f8, double:3.204549089493961E-306)
            java.lang.Long r2 = X.AnonymousClass7TF.A0Y(r1, r0, r2)
            int r2 = r2.intValue()
            java.lang.String r8 = r13.A04
            if (r29 == 0) goto L_0x00f0
            java.lang.String r21 = "image/jpeg"
        L_0x0034:
            r25 = -1
            X.LOX r3 = new X.LOX
            r24 = r2
            r18 = r3
            r20 = r13
            r22 = r9
            r23 = r12
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
        L_0x0045:
            java.util.LinkedList r4 = r5.A04
            r4.add(r3)
        L_0x004a:
            java.lang.String r3 = "ImageRendererSaveHelper"
            java.lang.Integer r15 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r34)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r35)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r12)
            java.lang.String r20 = X.LTE.A03(r0)
            java.lang.Object[] r5 = new java.lang.Object[]{r14, r15, r16, r17, r18, r19, r20}
            java.lang.String r4 = "Rendered %s quality %s %dx%d to %dx%d, %s"
            X.0KC.A0P(r3, r4, r5)
            r3 = 0
            if (r39 == 0) goto L_0x00ee
            X.KgB r11 = X.C62461KgB.UPLOAD
            if (r14 != r11) goto L_0x0091
            int r4 = r13.A01
            long r6 = (long) r4
            X.0Tu r10 = X.0Tu.A06
            r4 = 36604623284474949(0x820bb600021445, double:3.212249387864624E-306)
            long r15 = X.182.A01(r10, r0, r4)
            int r4 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r4 < 0) goto L_0x00d2
            r4 = 36323148307704736(0x810bb600012ba0, double:3.0342434791463836E-306)
            boolean r4 = X.182.A06(r1, r0, r4)
            if (r4 == 0) goto L_0x00d2
        L_0x0091:
            r10 = r3
            if (r14 != r11) goto L_0x00b1
        L_0x0094:
            int r4 = r13.A01
            long r6 = (long) r4
            X.0Tu r11 = X.0Tu.A06
            r4 = 36604623284474949(0x820bb600021445, double:3.212249387864624E-306)
            long r13 = X.182.A01(r11, r0, r4)
            int r4 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r4 < 0) goto L_0x00b7
            r4 = 36323148307704736(0x810bb600012ba0, double:3.0342434791463836E-306)
            boolean r0 = X.182.A06(r1, r0, r4)
            if (r0 == 0) goto L_0x00b7
        L_0x00b1:
            X.L6R r0 = new X.L6R
            r0.<init>(r3, r10, r2)
            return r0
        L_0x00b7:
            int r1 = X.C63114Kri.A00()
            r0 = 40
            if (r1 >= r0) goto L_0x00c7
            java.lang.String r1 = "high memory pressure, will not calculate ssim"
            java.lang.String r0 = "image_ssim_skip"
            X.0kD.A0D(r0, r1, r3)
            goto L_0x00b1
        L_0x00c7:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            double r0 = X.C64000LIc.A00(r0, r8, r9, r12)
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            goto L_0x00b1
        L_0x00d2:
            int r5 = X.C63114Kri.A00()
            r4 = 40
            if (r5 >= r4) goto L_0x00e3
            java.lang.String r5 = "high memory pressure, will not calculate ms-ssim"
            java.lang.String r4 = "image_msssim_skip"
            X.0kD.A0D(r4, r5, r3)
            r10 = r3
            goto L_0x0094
        L_0x00e3:
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            double r4 = X.C64000LIc.A00(r4, r8, r9, r12)
            java.lang.Double r10 = java.lang.Double.valueOf(r4)
            goto L_0x0094
        L_0x00ee:
            r10 = r3
            goto L_0x00b1
        L_0x00f0:
            com.instagram.common.session.UserSession r6 = r15.A00
            boolean r3 = r15.A02
            if (r3 != 0) goto L_0x010b
            r3 = 36313025069712998(0x81028100000666, double:3.027841502677401E-306)
            boolean r3 = X.182.A06(r1, r6, r3)
            if (r3 == 0) goto L_0x010b
            r3 = r26
            android.graphics.Bitmap r19 = X.C64001LId.A00(r3, r9, r12)
            java.lang.String r21 = "image/webp"
            goto L_0x0034
        L_0x010b:
            r16 = 0
            java.lang.String r18 = "image/jpeg"
            X.LOX r3 = new X.LOX
            r21 = r2
            r22 = r26
            r15 = r3
            r17 = r13
            r19 = r9
            r20 = r12
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0045
        L_0x0121:
            if (r39 == 0) goto L_0x013f
            boolean r0 = r13.A06
            if (r0 != 0) goto L_0x013f
            float r1 = (float) r9
            float r0 = (float) r12
            float r1 = r1 / r0
            r0 = r38
            boolean r0 = X.C64138LPn.A02(r7, r1, r0)
            if (r0 != 0) goto L_0x013f
            java.lang.String r1 = "Output aspect ratio error: "
            r0 = 120(0x78, float:1.68E-43)
            java.lang.String r0 = X.002.A0J(r1, r0, r9, r12)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x013f:
            com.instagram.common.session.UserSession r0 = r5.A01
            java.lang.Integer r4 = r5.A03
            X.0Tu r1 = X.0Tu.A05
            r2 = 36329096837349165(0x81111f00003f2d, double:3.038005353246327E-306)
            boolean r2 = X.182.A06(r1, r0, r2)
            if (r2 == 0) goto L_0x0294
            r2 = 36610571814311995(0x82111f0004183b, double:3.216011262086379E-306)
            int r6 = X.DbS.A04(r1, r0, r2)
            r2 = 36610571814246458(0x82111f0003183a, double:3.216011262044933E-306)
            int r5 = X.DbS.A04(r1, r0, r2)
            if (r6 < r5) goto L_0x0294
            java.util.Random r3 = X.C63519KyU.A00
            int r6 = r6 - r5
            int r2 = r6 + 1
            int r2 = r3.nextInt(r2)
            int r5 = r5 + r2
            r2 = 100
            if (r5 >= r7) goto L_0x028e
            r5 = 0
        L_0x0173:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            if (r6 == 0) goto L_0x0294
            int r2 = r6.intValue()
            if (r2 <= 0) goto L_0x0294
        L_0x017f:
            if (r6 == 0) goto L_0x0288
            int r2 = r6.intValue()
            if (r2 <= 0) goto L_0x0288
        L_0x0187:
            r18.A02()
            if (r29 == 0) goto L_0x01b1
            java.lang.String r23 = "image/jpeg"
            r27 = -1
            X.LOX r3 = new X.LOX
            r26 = r2
            r20 = r3
            r21 = r19
            r22 = r13
            r24 = r9
            r25 = r12
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
        L_0x01a1:
            boolean r3 = r3.A02(r0)
        L_0x01a5:
            r18.A03()
            if (r3 == 0) goto L_0x03a6
            java.lang.String r8 = r13.A04
            X.0mb.A03(r8)
            goto L_0x004a
        L_0x01b1:
            r3 = 512(0x200, float:7.175E-43)
            if (r9 > r3) goto L_0x01f8
            if (r12 > r3) goto L_0x01f8
            r3 = 2342172952159601027(0x208111e400004183, double:4.074016654930149E-152)
            boolean r3 = X.182.A06(r1, r0, r3)
            if (r3 == 0) goto L_0x01f8
        L_0x01c2:
            boolean r3 = r15.A01
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x0273
            if (r6 == 0) goto L_0x01eb
            int r4 = r6.intValue()
            if (r4 <= 0) goto L_0x01eb
        L_0x01d0:
            r2 = r4
            r3 = r26
            android.graphics.Bitmap r20 = X.C64001LId.A00(r3, r9, r12)
            java.lang.String r22 = "image/webp"
            r26 = -1
            X.LOX r3 = new X.LOX
            r25 = r4
            r19 = r3
            r21 = r13
            r23 = r9
            r24 = r12
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            goto L_0x01a1
        L_0x01eb:
            int r4 = r2 + 6
            r2 = 100
            if (r4 >= r7) goto L_0x01f3
            r4 = 0
            goto L_0x01d0
        L_0x01f3:
            if (r4 <= r2) goto L_0x01d0
            r4 = 100
            goto L_0x01d0
        L_0x01f8:
            r4 = r31
            boolean r3 = r4.A01
            if (r3 != 0) goto L_0x01c2
            com.instagram.common.session.UserSession r5 = r4.A00
            boolean r3 = X.C11103SAe.A01(r5)
            if (r3 == 0) goto L_0x01c2
            r3 = 36317723764397528(0x8106c7000715d8, double:3.0308129761160226E-306)
            boolean r3 = X.DbY.A1Z(r1, r5, r3)
            if (r3 == 0) goto L_0x01c2
            if (r6 == 0) goto L_0x0244
            int r25 = r6.intValue()
            if (r25 <= 0) goto L_0x0244
        L_0x0219:
            r2 = 36317723764659676(0x8106c7000b15dc, double:3.030812976281806E-306)
            boolean r2 = X.182.A06(r1, r0, r2)
            if (r2 == 0) goto L_0x023d
            r20 = 0
        L_0x0226:
            java.lang.String r22 = "image/heic"
            X.LOX r2 = new X.LOX
            r19 = r2
            r21 = r13
            r23 = r9
            r24 = r12
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            boolean r3 = r2.A02(r0)
            r2 = r25
            goto L_0x01a5
        L_0x023d:
            r2 = r26
            android.graphics.Bitmap r20 = X.C64001LId.A00(r2, r9, r12)
            goto L_0x0226
        L_0x0244:
            X.0Tu r5 = X.0Tu.A06
            r3 = 36317723764135380(0x8106c7000315d4, double:3.030812975950239E-306)
            boolean r3 = X.182.A06(r5, r0, r3)
            if (r3 == 0) goto L_0x0262
            r3 = 36599198740778443(0x8206c700020dcb, double:3.208818884588069E-306)
            int r3 = X.DbS.A04(r5, r0, r3)
            int r2 = r2 + r3
        L_0x025b:
            r3 = 100
            if (r2 >= r7) goto L_0x026c
            r25 = 0
            goto L_0x0219
        L_0x0262:
            r2 = 36599198740712906(0x8206c700010dca, double:3.208818884546623E-306)
            int r2 = X.DbS.A04(r5, r0, r2)
            goto L_0x025b
        L_0x026c:
            r25 = r2
            if (r2 <= r3) goto L_0x0219
            r25 = 100
            goto L_0x0219
        L_0x0273:
            r20 = 0
            java.lang.String r22 = "image/jpeg"
            X.LOX r3 = new X.LOX
            r19 = r3
            r21 = r13
            r23 = r9
            r24 = r12
            r25 = r2
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            goto L_0x01a1
        L_0x0288:
            int r2 = X.LTE.A02(r0, r9)
            goto L_0x0187
        L_0x028e:
            if (r5 <= r2) goto L_0x0173
            r5 = 100
            goto L_0x0173
        L_0x0294:
            r2 = 36329096837938990(0x81111f00093f2e, double:3.0380053536193345E-306)
            boolean r2 = X.182.A06(r1, r0, r2)
            if (r2 == 0) goto L_0x0379
            r2 = 36610571814705216(0x82111f000a1840, double:3.216011262335053E-306)
            int r4 = X.DbS.A04(r1, r0, r2)
            r2 = 36610571814770753(0x82111f000b1841, double:3.216011262376499E-306)
            int r5 = X.DbS.A04(r1, r0, r2)
            r2 = 36610571814311995(0x82111f0004183b, double:3.216011262086379E-306)
            int r8 = X.DbS.A04(r1, r0, r2)
            r2 = 36610571814246458(0x82111f0003183a, double:3.216011262044933E-306)
            int r6 = X.DbS.A04(r1, r0, r2)
            if (r9 >= r4) goto L_0x02c8
            if (r9 > r5) goto L_0x0367
            r6 = r8
        L_0x02c8:
            r2 = 36329096838463279(0x81111f00113f2f, double:3.038005353950897E-306)
            boolean r2 = X.182.A06(r1, r0, r2)
            if (r2 != 0) goto L_0x02de
            r2 = 36329096838528816(0x81111f00123f30, double:3.038005353992343E-306)
            boolean r2 = X.182.A06(r1, r0, r2)
            if (r2 == 0) goto L_0x0330
        L_0x02de:
            X.1Bh r2 = X.1Bh.A00()
            double r24 = r2.A01()
            r3 = 0
            int r2 = (r24 > r3 ? 1 : (r24 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0330
            r2 = 36610571815032901(0x82111f000f1845, double:3.2160112625422826E-306)
            int r2 = X.DbS.A04(r1, r0, r2)
            double r4 = (double) r2
            r16 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r24 > r4 ? 1 : (r24 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x0336
            r2 = 36329096838463279(0x81111f00113f2f, double:3.038005353950897E-306)
            boolean r2 = X.182.A06(r1, r0, r2)
            if (r2 == 0) goto L_0x0336
            r2 = 36610571815098438(0x82111f00101846, double:3.2160112625837284E-306)
            int r2 = X.DbS.A04(r1, r0, r2)
            double r10 = (double) r2
            r2 = 36610571814836290(0x82111f000c1842, double:3.216011262417945E-306)
            int r8 = X.DbS.A04(r1, r0, r2)
            r20 = r4
            r22 = r10
            double r2 = X.C18393Vqt.A00(r20, r22, r24)
            double r2 = r2 - r16
            double r4 = (double) r8
            double r2 = r2 * r4
            int r4 = (int) r2
            int r6 = r6 + r4
        L_0x0328:
            r2 = 100
            if (r6 < r7) goto L_0x03a4
            if (r6 <= r2) goto L_0x0330
            r6 = 100
        L_0x0330:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x017f
        L_0x0336:
            int r2 = (r24 > r4 ? 1 : (r24 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0330
            r2 = 36329096838528816(0x81111f00123f30, double:3.038005353992343E-306)
            boolean r2 = X.182.A06(r1, r0, r2)
            if (r2 == 0) goto L_0x0330
            r2 = 36610571814901827(0x82111f000d1843, double:3.216011262459391E-306)
            int r2 = X.DbS.A04(r1, r0, r2)
            double r10 = (double) r2
            r2 = 36610571814967364(0x82111f000e1844, double:3.216011262500837E-306)
            int r2 = X.DbS.A04(r1, r0, r2)
            r20 = r4
            r22 = r10
            double r4 = X.C18393Vqt.A00(r20, r22, r24)
            double r4 = r4 - r16
            double r2 = (double) r2
            double r4 = r4 * r2
            int r2 = (int) r4
            int r6 = r6 - r2
            goto L_0x0328
        L_0x0367:
            int r2 = r8 - r6
            float r3 = (float) r2
            int r4 = r4 - r5
            float r2 = (float) r4
            float r3 = r3 / r2
            float r4 = (float) r8
            int r2 = r36 - r5
            float r2 = (float) r2
            float r3 = r3 * r2
            float r4 = r4 - r3
            int r6 = java.lang.Math.round(r4)
            goto L_0x02c8
        L_0x0379:
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r9 < r2) goto L_0x03a4
            r2 = -1
            if (r4 == 0) goto L_0x03a4
            int r3 = r4.intValue()
            if (r3 == r2) goto L_0x03a4
            if (r3 == r7) goto L_0x039e
            r2 = 1
            if (r3 == r2) goto L_0x0398
            r2 = 2
            if (r3 != r2) goto L_0x03bd
            r2 = 36610571814574143(0x82111f0008183f, double:3.216011262252162E-306)
        L_0x0393:
            int r6 = X.DbS.A04(r1, r0, r2)
            goto L_0x0330
        L_0x0398:
            r2 = 36610571814508606(0x82111f0007183e, double:3.216011262210716E-306)
            goto L_0x0393
        L_0x039e:
            r2 = 36610571814443069(0x82111f0006183d, double:3.2160112621692704E-306)
            goto L_0x0393
        L_0x03a4:
            r6 = 0
            goto L_0x0330
        L_0x03a6:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Failure writing "
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = " image to file"
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)
            java.io.IOException r0 = X.JTO.A0u(r0)
            throw r0
        L_0x03bd:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LO5.A01(android.graphics.Bitmap, X.L6Q, X.L4D, X.LAM, int, int, int, int, int, boolean, boolean):X.L6R");
    }
}
