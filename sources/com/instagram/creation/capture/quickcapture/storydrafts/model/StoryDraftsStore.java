package com.instagram.creation.capture.quickcapture.storydrafts.model;

import X.00k;
import X.0Yv;
import X.0qQ;
import X.0u9;
import X.0xY;
import X.1Au;
import X.1Av;
import X.1HR;
import X.AnonymousClass0Zq;
import X.AnonymousClass0lh;
import X.AnonymousClass0r6;
import X.AnonymousClass12T;
import X.AnonymousClass12V;
import X.AnonymousClass4D7;
import X.AnonymousClass9K3;
import X.C249513ju;
import X.C351758Ag;
import X.C362908ih;
import X.C369978vd;
import X.C369988ve;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class StoryDraftsStore implements AnonymousClass0lh {
    public static final C351758Ag A08 = new Object();
    public final AnonymousClass12V A00;
    public final UserSession A01;
    public final 1Av A02;
    public final List A03 = new ArrayList();
    public final List A04 = new ArrayList();
    public final C249513ju A05;
    public final AnonymousClass0r6 A06;
    public final AnonymousClass0r6 A07 = AnonymousClass0Zq.A00(new AnonymousClass9K3(this, (AnonymousClass4D7) null, 41));

    /* JADX WARNING: Code restructure failed: missing block: B:175:0x043a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x043b, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x043e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0503, code lost:
        r2 = (X.C317966o8) r13.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0245, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        X.1zE.A00(r6, r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0404  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x056d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r40, android.graphics.Bitmap r41, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r42, com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec r43, X.C363928ka r44, X.C366678pU r45, X.B22 r46, com.instagram.creation.capture.quickcapture.storydrafts.model.StoryDraftsStore r47, java.lang.String r48, java.lang.String r49, boolean r50) {
        /*
            r10 = r42
            r9 = r49
            if (r49 != 0) goto L_0x0011
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r9 = r0.toString()
            X.0qQ.A07(r9)
        L_0x0011:
            r39 = r47
            r0 = r39
            com.instagram.common.session.UserSession r6 = r0.A01
            r7 = 0
            r12 = r40
            X.0qQ.A0B(r12, r7)
            r5 = 1
            X.MMa r1 = new X.MMa
            r1.<init>(r5, r12, r6)
            java.lang.Class<X.8w4> r0 = X.C370248w4.class
            java.lang.Object r4 = r6.A01(r0, r1)
            X.8w4 r4 = (X.C370248w4) r4
            r0 = r39
            java.util.List r0 = r0.A03
            java.util.Iterator r1 = r0.iterator()
        L_0x0033:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b9
            java.lang.Object r8 = r1.next()
            r0 = r8
            X.8ve r0 = (X.C369988ve) r0
            java.lang.String r0 = r0.A07
            boolean r0 = X.0qQ.A0K(r0, r9)
            if (r0 == 0) goto L_0x0033
        L_0x0048:
            X.8ve r8 = (X.C369988ve) r8
            r3 = r44
            if (r8 != 0) goto L_0x03f9
            X.8nd r0 = r3.A02
            int r0 = r0.ordinal()
            r2 = 0
            if (r0 == r7) goto L_0x00af
            if (r0 != r5) goto L_0x03f1
            X.7zv r0 = r3.A04
            r0.getClass()
            java.lang.String r0 = r0.A0k
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
        L_0x0065:
            X.0qQ.A0B(r4, r7)
            r0 = 6
            X.0qQ.A0B(r10, r0)
            java.io.File r13 = r4.A00
            java.io.File r11 = new java.io.File
            r11.<init>(r13, r9)
            X.0mb.A07(r11)
            r7 = 46
            java.lang.String r0 = X.AnonymousClass5Kg.A05(r1)
            java.lang.String r7 = X.002.A0D(r0, r7)
            r0 = 5102(0x13ee, float:7.15E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.io.File r7 = java.io.File.createTempFile(r0, r7, r11)
            X.0qQ.A07(r7)
            X.8nd r0 = r3.A02
            int r0 = r0.ordinal()
            if (r0 == r2) goto L_0x00a7
            if (r0 != r5) goto L_0x03e9
            X.7zv r0 = r3.A04
            r0.getClass()
            boolean r0 = r0.A18
        L_0x009e:
            if (r0 == 0) goto L_0x0250
            com.instagram.common.gallery.Medium r0 = r3.A01()
            if (r0 == 0) goto L_0x0250
            goto L_0x00bb
        L_0x00a7:
            X.8Cl r0 = r3.A03
            r0.getClass()
            boolean r0 = r0.A12
            goto L_0x009e
        L_0x00af:
            X.8Cl r0 = r3.A03
            r0.getClass()
            java.io.File r1 = r0.A03()
            goto L_0x0065
        L_0x00b9:
            r8 = 0
            goto L_0x0048
        L_0x00bb:
            X.8nd r0 = r3.A02     // Catch:{ Exception -> 0x0256 }
            int r0 = r0.ordinal()     // Catch:{ Exception -> 0x0256 }
            if (r0 == r2) goto L_0x01ac
            if (r0 == r5) goto L_0x00cc
            X.9nb r14 = new X.9nb     // Catch:{ Exception -> 0x0256 }
            r14.<init>(r1)     // Catch:{ Exception -> 0x0256 }
            goto L_0x0270
        L_0x00cc:
            X.7zv r14 = r3.A04     // Catch:{ Exception -> 0x0256 }
            if (r14 == 0) goto L_0x01a3
            r10 = r43
            if (r43 != 0) goto L_0x00db
            X.9nb r14 = new X.9nb     // Catch:{ Exception -> 0x0256 }
            r14.<init>(r1)     // Catch:{ Exception -> 0x0256 }
            goto L_0x0270
        L_0x00db:
            r13 = 627828155(0x256be5bb, float:2.0460837E-16)
            r11 = 3
            X.0na r17 = new X.0na     // Catch:{ Exception -> 0x0256 }
            r0 = r17
            r0.<init>(r13, r11, r2, r5)     // Catch:{ Exception -> 0x0256 }
            int r13 = r14.A0K     // Catch:{ Exception -> 0x0256 }
            int r11 = r14.A08     // Catch:{ Exception -> 0x0256 }
            int r0 = r14.A09     // Catch:{ Exception -> 0x0256 }
            X.0eP r11 = X.C394619yP.findTargetVideoDimensions(r13, r11, r0, r10)     // Catch:{ Exception -> 0x0256 }
            java.lang.Object r0 = r11.A00     // Catch:{ Exception -> 0x0256 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ Exception -> 0x0256 }
            int r16 = r0.intValue()     // Catch:{ Exception -> 0x0256 }
            java.lang.Object r0 = r11.A01     // Catch:{ Exception -> 0x0256 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ Exception -> 0x0256 }
            int r15 = r0.intValue()     // Catch:{ Exception -> 0x0256 }
            java.lang.String r0 = r10.A04     // Catch:{ Exception -> 0x0256 }
            r18 = 0
            X.SOn r19 = X.C9606Rdk.A00(r12, r1, r2)     // Catch:{ Exception -> 0x0256 }
            if (r19 != 0) goto L_0x010d
            r19 = 0
            goto L_0x011a
        L_0x010d:
            r20 = r0
            r21 = r18
            r22 = r16
            r23 = r15
            r24 = r5
            X.SRj.A03(r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x0256 }
        L_0x011a:
            int r11 = r10.A00     // Catch:{ Exception -> 0x0256 }
            int r10 = r10.A01     // Catch:{ Exception -> 0x0256 }
            r0 = 64000(0xfa00, float:8.9683E-41)
            X.SFQ r14 = new X.SFQ     // Catch:{ Exception -> 0x0256 }
            r14.<init>(r0, r11, r10)     // Catch:{ Exception -> 0x0256 }
            java.lang.String r0 = r1.getPath()     // Catch:{ 8Af -> 0x0193 }
            X.0qQ.A07(r0)     // Catch:{ 8Af -> 0x0193 }
            int r26 = X.AIF.A00(r0)     // Catch:{ 8Af -> 0x0193 }
            X.AVd r13 = new X.AVd     // Catch:{ 8Af -> 0x0193 }
            r13.<init>(r4)     // Catch:{ 8Af -> 0x0193 }
            X.0Tu r0 = X.0Tu.A05     // Catch:{ 8Af -> 0x0193 }
            r10 = 36324179100249954(0x810ca600072f62, double:3.034895356502648E-306)
            boolean r34 = X.182.A06(r0, r6, r10)     // Catch:{ 8Af -> 0x0193 }
            r10 = 36324179100839784(0x810ca600102f68, double:3.034895356875659E-306)
            boolean r35 = X.182.A06(r0, r6, r10)     // Catch:{ 8Af -> 0x0193 }
            r10 = 36324179101298542(0x810ca600172f6e, double:3.034895357165779E-306)
            boolean r36 = X.182.A06(r0, r6, r10)     // Catch:{ 8Af -> 0x0193 }
            r10 = 36324179101364079(0x810ca600182f6f, double:3.034895357207225E-306)
            boolean r37 = X.182.A06(r0, r6, r10)     // Catch:{ 8Af -> 0x0193 }
            r10 = 36605654077281570(0x820ca6000c1522, double:3.2129012653862004E-306)
            long r28 = X.182.A01(r0, r6, r10)     // Catch:{ 8Af -> 0x0193 }
            r10 = 36324179101953912(0x810ca600212f78, double:3.034895357580238E-306)
            boolean r38 = X.182.A06(r0, r6, r10)     // Catch:{ 8Af -> 0x0193 }
            r21 = r18
            r24 = r17
            r25 = r2
            r27 = r5
            r30 = r2
            r31 = r2
            r32 = r2
            r33 = r2
            r20 = r13
            r22 = r14
            r23 = r1
            r17 = r12
            java.io.File r6 = X.C9598Rdc.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38)     // Catch:{ 8Af -> 0x0193 }
            X.9nd r14 = new X.9nd     // Catch:{ 8Af -> 0x0193 }
            r0 = r16
            r14.<init>(r6, r0, r15)     // Catch:{ 8Af -> 0x0193 }
            goto L_0x0270
        L_0x0193:
            r6 = move-exception
            X.AkB r0 = new X.AkB     // Catch:{ Exception -> 0x0256 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x0256 }
            X.11Z.A02(r0)     // Catch:{ Exception -> 0x0256 }
            X.9nb r14 = new X.9nb     // Catch:{ Exception -> 0x0256 }
            r14.<init>(r1)     // Catch:{ Exception -> 0x0256 }
            goto L_0x0270
        L_0x01a3:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0256 }
            r10.<init>(r0)     // Catch:{ Exception -> 0x0256 }
            goto L_0x0249
        L_0x01ac:
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0256 }
            r6.<init>()     // Catch:{ Exception -> 0x0256 }
            java.lang.String r0 = r1.getPath()     // Catch:{ Exception -> 0x0256 }
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeFile(r0, r6)     // Catch:{ Exception -> 0x0256 }
            if (r11 == 0) goto L_0x024a
            java.lang.String r15 = "photo"
            java.lang.String r14 = ".jpeg"
            java.lang.String r6 = "temp"
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0256 }
            r0.<init>(r13, r6)     // Catch:{ Exception -> 0x0256 }
            X.0mb.A07(r0)     // Catch:{ Exception -> 0x0256 }
            java.io.File r13 = java.io.File.createTempFile(r15, r14, r0)     // Catch:{ Exception -> 0x0256 }
            X.0qQ.A07(r13)     // Catch:{ Exception -> 0x0256 }
            android.content.ContentResolver r6 = r12.getContentResolver()     // Catch:{ Exception -> 0x0256 }
            android.net.Uri r0 = android.net.Uri.fromFile(r13)     // Catch:{ Exception -> 0x0256 }
            java.io.OutputStream r6 = r6.openOutputStream(r0)     // Catch:{ Exception -> 0x0256 }
            if (r6 == 0) goto L_0x024a
            int r15 = r11.getWidth()     // Catch:{ Exception -> 0x0256 }
            int r14 = r11.getHeight()     // Catch:{ Exception -> 0x0256 }
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r10 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r10     // Catch:{ Exception -> 0x0256 }
            X.81W r0 = r10.A0K     // Catch:{ Exception -> 0x0256 }
            int r10 = r0.getWidth()     // Catch:{ Exception -> 0x0256 }
            int r0 = r0.getHeight()     // Catch:{ Exception -> 0x0256 }
            int r10 = java.lang.Math.min(r15, r10)     // Catch:{ Exception -> 0x0256 }
            int r0 = java.lang.Math.min(r14, r0)     // Catch:{ Exception -> 0x0256 }
            android.graphics.Bitmap r14 = X.1MF.A0A(r11, r10, r0, r5)     // Catch:{ Exception -> 0x0256 }
            int r11 = r14.getWidth()     // Catch:{ Exception -> 0x0256 }
            int r10 = r14.getHeight()     // Catch:{ Exception -> 0x0256 }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0243 }
            boolean r0 = X.JZK.A00(r0, r14, r6)     // Catch:{ all -> 0x0243 }
            r14.recycle()     // Catch:{ all -> 0x0243 }
            if (r0 != 0) goto L_0x021a
            X.9nb r14 = new X.9nb     // Catch:{ all -> 0x0243 }
            r14.<init>(r1)     // Catch:{ all -> 0x0243 }
            r6.close()     // Catch:{ Exception -> 0x0256 }
            goto L_0x0270
        L_0x021a:
            r6.close()     // Catch:{ Exception -> 0x0256 }
            boolean r0 = X.C227922kK.A0N     // Catch:{ Exception -> 0x0256 }
            java.lang.String r0 = r13.getPath()     // Catch:{ Exception -> 0x0256 }
            X.2kK r14 = new X.2kK     // Catch:{ Exception -> 0x0256 }
            r14.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x0256 }
            java.lang.String r6 = r1.getPath()     // Catch:{ Exception -> 0x0256 }
            X.2kK r0 = new X.2kK     // Catch:{ Exception -> 0x0256 }
            r0.<init>((java.lang.String) r6)     // Catch:{ Exception -> 0x0256 }
            java.lang.String r6 = "Orientation"
            java.lang.String r0 = r0.A0N(r6)     // Catch:{ Exception -> 0x0256 }
            r14.A0P(r6, r0)     // Catch:{ Exception -> 0x0256 }
            r14.A0O()     // Catch:{ Exception -> 0x0256 }
            X.9nd r14 = new X.9nd     // Catch:{ Exception -> 0x0256 }
            r14.<init>(r13, r11, r10)     // Catch:{ Exception -> 0x0256 }
            goto L_0x0270
        L_0x0243:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0245 }
        L_0x0245:
            r10 = move-exception
            X.1zE.A00(r6, r0)     // Catch:{ Exception -> 0x0256 }
        L_0x0249:
            throw r10     // Catch:{ Exception -> 0x0256 }
        L_0x024a:
            X.9nb r14 = new X.9nb     // Catch:{ Exception -> 0x0256 }
            r14.<init>(r1)     // Catch:{ Exception -> 0x0256 }
            goto L_0x0270
        L_0x0250:
            X.9nc r14 = new X.9nc
            r14.<init>(r1)
            goto L_0x0270
        L_0x0256:
            r6 = move-exception
            boolean r0 = r6 instanceof java.io.IOException
            if (r0 != 0) goto L_0x026b
            boolean r0 = r6 instanceof java.io.FileNotFoundException
            if (r0 != 0) goto L_0x026b
            boolean r0 = r6 instanceof java.lang.IllegalArgumentException
            if (r0 != 0) goto L_0x026b
            X.AkA r0 = new X.AkA
            r0.<init>(r6)
            X.11Z.A02(r0)
        L_0x026b:
            X.9nb r14 = new X.9nb
            r14.<init>(r1)
        L_0x0270:
            boolean r6 = r14 instanceof X.C388319nd
            if (r6 == 0) goto L_0x033f
            r0 = r14
            X.9nd r0 = (X.C388319nd) r0
            java.io.File r10 = r0.A02
        L_0x0279:
            boolean r0 = X.0qQ.A0K(r10, r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x033a
            com.google.common.io.Files.A02(r10, r7)
        L_0x0284:
            X.8nd r0 = r3.A02
            int r0 = r0.ordinal()
            if (r0 == r2) goto L_0x02f9
            if (r0 != r5) goto L_0x03c5
            java.lang.String r10 = "Required value was null."
            if (r6 == 0) goto L_0x02e2
            X.7zv r13 = r3.A04
            if (r13 == 0) goto L_0x03b9
            X.9nd r14 = (X.C388319nd) r14
            int r11 = r14.A01
            int r6 = r14.A00
            com.instagram.common.gallery.Medium r0 = r3.A01()
            if (r0 == 0) goto L_0x03b3
            com.instagram.common.gallery.Medium r1 = X.C282665Eg.A02(r0, r7)
            X.7zv r0 = r13.A03()
            r0.A0K = r11
            r0.A08 = r6
            r0.A09 = r2
            r0.A0R = r1
        L_0x02b2:
            r0.A17 = r5
            X.8ka r6 = new X.8ka
            r6.<init>((X.C349307zv) r0)
        L_0x02b9:
            X.8nd r0 = r6.A02
            int r0 = r0.ordinal()
            if (r0 == r2) goto L_0x0375
            if (r0 != r5) goto L_0x0402
            X.7zv r0 = r6.A04
            r0.getClass()
            com.instagram.common.gallery.Medium r0 = r0.A0R
            if (r0 == 0) goto L_0x02d6
            X.7zv r0 = r6.A04
            r0.getClass()
            com.instagram.common.gallery.Medium r0 = r0.A0R
            r0.A04(r7)
        L_0x02d6:
            X.7zv r1 = r6.A04
            java.lang.String r0 = r7.getAbsolutePath()
            X.0qQ.A0B(r0, r2)
            r1.A0k = r0
            goto L_0x0355
        L_0x02e2:
            boolean r0 = r14 instanceof X.C388299nb
            if (r0 != 0) goto L_0x02f0
            boolean r0 = r14 instanceof X.C388309nc
            if (r0 != 0) goto L_0x02f0
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x02f0:
            X.7zv r0 = r3.A04
            if (r0 == 0) goto L_0x03bf
            X.7zv r0 = r0.A03()
            goto L_0x02b2
        L_0x02f9:
            java.lang.String r10 = "Required value was null."
            if (r6 == 0) goto L_0x0323
            X.8Cl r13 = r3.A03
            if (r13 == 0) goto L_0x03d7
            X.9nd r14 = (X.C388319nd) r14
            int r11 = r14.A01
            int r6 = r14.A00
            com.instagram.common.gallery.Medium r0 = r3.A01()
            if (r0 == 0) goto L_0x03d1
            com.instagram.common.gallery.Medium r1 = X.C282665Eg.A02(r0, r7)
            X.8Cl r0 = r13.A02()
            r0.A09 = r11
            r0.A06 = r6
            r0.A0F = r1
        L_0x031b:
            r0.A11 = r5
            X.8ka r6 = new X.8ka
            r6.<init>((X.C352218Cl) r0)
            goto L_0x02b9
        L_0x0323:
            boolean r0 = r14 instanceof X.C388299nb
            if (r0 != 0) goto L_0x0331
            boolean r0 = r14 instanceof X.C388309nc
            if (r0 != 0) goto L_0x0331
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x0331:
            X.8Cl r0 = r3.A03
            if (r0 == 0) goto L_0x03dd
            X.8Cl r0 = r0.A02()
            goto L_0x031b
        L_0x033a:
            com.google.common.io.Files.A01(r10, r7)
            goto L_0x0284
        L_0x033f:
            boolean r0 = r14 instanceof X.C388299nb
            if (r0 == 0) goto L_0x034a
            r0 = r14
            X.9nb r0 = (X.C388299nb) r0
            java.io.File r10 = r0.A00
            goto L_0x0279
        L_0x034a:
            boolean r0 = r14 instanceof X.C388309nc
            if (r0 == 0) goto L_0x03e3
            r0 = r14
            X.9nc r0 = (X.C388309nc) r0
            java.io.File r10 = r0.A00
            goto L_0x0279
        L_0x0355:
            X.7zv r2 = r6.A04     // Catch:{ IOException -> 0x0370 }
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch:{ IOException -> 0x0370 }
            r1.<init>()     // Catch:{ IOException -> 0x0370 }
            X.15p r0 = X.AnonymousClass15o.A00     // Catch:{ IOException -> 0x0370 }
            X.17W r0 = r0.A0A(r1)     // Catch:{ IOException -> 0x0370 }
            X.C369998vf.A00(r0, r2)     // Catch:{ IOException -> 0x0370 }
            r0.close()     // Catch:{ IOException -> 0x0370 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0370 }
            r6.A05 = r0     // Catch:{ IOException -> 0x0370 }
            goto L_0x0402
        L_0x0370:
            r1 = move-exception
            java.lang.String r0 = "Failed to process video in setMediaFile"
            goto L_0x03ff
        L_0x0375:
            X.8Cl r0 = r6.A03
            r0.getClass()
            com.instagram.common.gallery.Medium r0 = r0.A0F
            if (r0 == 0) goto L_0x0388
            X.8Cl r0 = r6.A03
            r0.getClass()
            com.instagram.common.gallery.Medium r0 = r0.A0F
            r0.A04(r7)
        L_0x0388:
            X.8Cl r1 = r6.A03
            java.lang.String r0 = r7.getAbsolutePath()
            r1.A0D(r0)
            X.8Cl r1 = r6.A03
            java.lang.String r0 = r7.getAbsolutePath()
            r1.A0k = r0
            X.8Cl r2 = r6.A03     // Catch:{ IOException -> 0x03fc }
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch:{ IOException -> 0x03fc }
            r1.<init>()     // Catch:{ IOException -> 0x03fc }
            X.15p r0 = X.AnonymousClass15o.A00     // Catch:{ IOException -> 0x03fc }
            X.17W r0 = r0.A0A(r1)     // Catch:{ IOException -> 0x03fc }
            X.C363938kb.A00(r0, r2)     // Catch:{ IOException -> 0x03fc }
            r0.close()     // Catch:{ IOException -> 0x03fc }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x03fc }
            r6.A05 = r0     // Catch:{ IOException -> 0x03fc }
            goto L_0x0402
        L_0x03b3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r10)
            throw r1
        L_0x03b9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r10)
            throw r1
        L_0x03bf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r10)
            throw r1
        L_0x03c5:
            r0 = 631(0x277, float:8.84E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x03d1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r10)
            throw r1
        L_0x03d7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r10)
            throw r1
        L_0x03dd:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r10)
            throw r1
        L_0x03e3:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x03e9:
            java.lang.String r0 = "Invalid media type."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x03f1:
            java.lang.String r0 = "Invalid media type."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x03f9:
            X.8ka r6 = r8.A03
            goto L_0x0402
        L_0x03fc:
            r1 = move-exception
            java.lang.String r0 = "Failed to process photo in setMediaFile"
        L_0x03ff:
            X.C363928ka.A00(r1, r0)
        L_0x0402:
            if (r6 == 0) goto L_0x056d
            r7 = r41
            if (r41 == 0) goto L_0x043f
            r2 = 0
            r0 = 2
            X.0qQ.A0B(r4, r0)
            java.io.File r0 = r4.A00
            java.io.File r1 = new java.io.File
            r1.<init>(r0, r9)
            X.0mb.A07(r1)
            java.lang.String r0 = "cover.jpg"
            java.io.File r5 = new java.io.File
            r5.<init>(r1, r0)
            int r1 = X.AnonymousClass8XE.A01(r12)
            int r0 = X.AnonymousClass8XE.A00(r12)
            android.graphics.Bitmap r1 = X.1MF.A0A(r7, r1, r0, r2)
            X.0qQ.A07(r1)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r5)
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0438 }
            X.JZK.A00(r0, r1, r2)     // Catch:{ all -> 0x0438 }
            goto L_0x0442
        L_0x0438:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x043a }
        L_0x043a:
            r0 = move-exception
            X.1zE.A00(r2, r1)
            throw r0
        L_0x043f:
            r17 = 0
            goto L_0x0449
        L_0x0442:
            r2.close()
            java.lang.String r17 = r5.getPath()
        L_0x0449:
            r10 = 0
            r0 = r45
            X.0qQ.A0B(r0, r10)
            X.8vh r7 = new X.8vh
            r7.<init>(r0)
            X.8vj r0 = r7.A02
            if (r0 == 0) goto L_0x047b
            X.8vl r0 = r0.A04
            if (r0 == 0) goto L_0x047b
            java.util.List r0 = r0.A03
        L_0x045e:
            java.lang.String r2 = "Required value was null."
            if (r0 == 0) goto L_0x0567
            java.util.Iterator r5 = r0.iterator()
        L_0x0466:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0483
            java.lang.Object r0 = r5.next()
            X.A6D r0 = (X.A6D) r0
            X.6b1 r1 = r0.A01
            if (r1 == 0) goto L_0x047d
            java.lang.String r0 = "StoryDraftsTag"
            r1.A0C = r0
            goto L_0x0466
        L_0x047b:
            r0 = 0
            goto L_0x045e
        L_0x047d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r2)
            throw r1
        L_0x0483:
            X.0qQ.A0B(r4, r10)
            X.8vj r0 = r7.A02
            if (r0 == 0) goto L_0x0561
            X.8vl r0 = r0.A04
            if (r0 == 0) goto L_0x0561
            java.util.List r1 = r0.A03
            if (r1 == 0) goto L_0x0561
            r5 = 10
            int r0 = X.0Yv.A1E(r1, r5)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x04a1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x04bf
            java.lang.Object r0 = r1.next()
            X.A6D r0 = (X.A6D) r0
            X.513 r0 = r0.A00
            if (r0 == 0) goto L_0x04b9
            X.50v r0 = r0.A00()
            r11.add(r0)
            goto L_0x04a1
        L_0x04b9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r2)
            throw r1
        L_0x04bf:
            java.util.Iterator r14 = r11.iterator()
        L_0x04c3:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x054a
            java.lang.Object r2 = r14.next()
            X.50v r2 = (X.C2802350v) r2
            boolean r0 = r2 instanceof X.C19473WaL
            if (r0 == 0) goto L_0x04ed
            X.WaL r2 = (X.C19473WaL) r2
            java.lang.String r0 = r2.A05
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            java.io.File r0 = X.C394609yO.A00(r4, r1, r9)
            com.google.common.io.Files.A01(r1, r0)
            java.lang.String r0 = r0.getPath()
            X.0qQ.A0B(r0, r10)
            r2.A05 = r0
            goto L_0x04c3
        L_0x04ed:
            boolean r0 = r2 instanceof X.C387329m2
            if (r0 == 0) goto L_0x04c3
            X.9m2 r2 = (X.C387329m2) r2
            X.6nz r0 = r2.A00()
            java.util.List r0 = r0.A0O
            java.util.Iterator r13 = r0.iterator()
        L_0x04fd:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x04c3
            java.lang.Object r2 = r13.next()
            X.6o8 r2 = (X.C317966o8) r2
            com.google.common.collect.ImmutableList r1 = r2.A03()
            if (r1 == 0) goto L_0x04c3
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x04c3
            int r0 = X.0Yv.A1E(r1, r5)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r0)
            java.util.Iterator r12 = r1.iterator()
        L_0x0522:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0542
            java.lang.Object r0 = r12.next()
            java.lang.String r0 = (java.lang.String) r0
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            java.io.File r0 = X.C394609yO.A00(r4, r1, r9)
            com.google.common.io.Files.A01(r1, r0)
            java.lang.String r0 = r0.getPath()
            r11.add(r0)
            goto L_0x0522
        L_0x0542:
            java.util.List r0 = X.00k.A0a(r11)
            r2.A05(r0)
            goto L_0x04fd
        L_0x054a:
            X.Ar1 r10 = new X.Ar1
            r15 = r46
            r19 = r48
            r20 = r50
            r11 = r3
            r12 = r6
            r13 = r7
            r14 = r8
            r16 = r39
            r18 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.11Z.A02(r10)
            return
        L_0x0561:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r2)
            throw r1
        L_0x0567:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r2)
            throw r1
        L_0x056d:
            java.lang.String r0 = "Couldn't create persisted media info"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.storydrafts.model.StoryDraftsStore.A00(android.content.Context, android.graphics.Bitmap, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec, X.8ka, X.8pU, X.B22, com.instagram.creation.capture.quickcapture.storydrafts.model.StoryDraftsStore, java.lang.String, java.lang.String, boolean):void");
    }

    public static final void A01(StoryDraftsStore storyDraftsStore) {
        List<C369988ve> list = storyDraftsStore.A03;
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        for (C369988ve A002 : list) {
            arrayList.add(C369978vd.A00(A002));
        }
        Set A0k = 00k.A0k(arrayList);
        0xY AR4 = storyDraftsStore.A02.A01.AR4();
        AR4.E5h("story_drafts", A0k);
        AR4.apply();
    }

    public static final void A02(StoryDraftsStore storyDraftsStore, List list) {
        for (C362908ih r1 : storyDraftsStore.A04) {
            0qQ.A0B(list, 0);
            r1.A01.FIG(new ArrayList(list));
        }
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.9Ja, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054 A[Catch:{ IOException -> 0x0065 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(java.lang.String r7, X.AnonymousClass4D7 r8) {
        /*
            r6 = this;
            r3 = 19
            boolean r0 = X.C376709Ja.A00(r3, r8)
            if (r0 == 0) goto L_0x0027
            r5 = r8
            X.9Ja r5 = (X.C376709Ja) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0027
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r5.A03
            X.1Hj r2 = X.1Hj.A02
            int r1 = r5.A00
            r3 = 0
            r0 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 != r0) goto L_0x002d
            java.lang.Object r7 = r5.A02
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x0045
        L_0x0027:
            X.9Ja r5 = new X.9Ja
            r5.<init>(r6, r8, r3)
            goto L_0x0016
        L_0x002d:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0035:
            X.0eS.A00(r4)
            r5.A01 = r6     // Catch:{ IOException -> 0x0065 }
            r5.A02 = r7     // Catch:{ IOException -> 0x0065 }
            r5.A00 = r0     // Catch:{ IOException -> 0x0065 }
            java.lang.Object r4 = r6.A04(r5)     // Catch:{ IOException -> 0x0065 }
            if (r4 != r2) goto L_0x0048
            return r2
        L_0x0045:
            X.0eS.A00(r4)     // Catch:{ IOException -> 0x0065 }
        L_0x0048:
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch:{ IOException -> 0x0065 }
            java.util.Iterator r2 = r4.iterator()     // Catch:{ IOException -> 0x0065 }
        L_0x004e:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x0065 }
            if (r0 == 0) goto L_0x0064
            java.lang.Object r1 = r2.next()     // Catch:{ IOException -> 0x0065 }
            r0 = r1
            X.8ve r0 = (X.C369988ve) r0     // Catch:{ IOException -> 0x0065 }
            java.lang.String r0 = r0.A07     // Catch:{ IOException -> 0x0065 }
            boolean r0 = X.0qQ.A0K(r0, r7)     // Catch:{ IOException -> 0x0065 }
            if (r0 == 0) goto L_0x004e
            return r1
        L_0x0064:
            return r3
        L_0x0065:
            r2 = move-exception
            java.lang.String r1 = "StoryDraftsStore"
            java.lang.String r0 = "Failed to de-serialise story draft "
            java.lang.String r0 = X.002.A0R(r0, r7)
            X.0kD.A0F(r1, r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.storydrafts.model.StoryDraftsStore.A03(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.9JX, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.AnonymousClass4D7 r8) {
        /*
            r7 = this;
            r3 = 27
            boolean r0 = X.AnonymousClass9JX.A00(r3, r8)
            if (r0 == 0) goto L_0x0022
            r6 = r8
            X.9JX r6 = (X.AnonymousClass9JX) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r6.A02
            X.1Hj r5 = X.1Hj.A02
            int r1 = r6.A00
            r4 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 != r4) goto L_0x002c
            goto L_0x0028
        L_0x0022:
            X.9JX r6 = new X.9JX
            r6.<init>(r7, r8, r3)
            goto L_0x0016
        L_0x0028:
            X.0eS.A00(r0)     // Catch:{ IOException -> 0x0053 }
            return r0
        L_0x002c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0034:
            X.0eS.A00(r0)
            X.12V r2 = r7.A00     // Catch:{ IOException -> 0x0053 }
            r3 = 0
            r1 = 825(0x339, float:1.156E-42)
            r0 = 3
            X.0nV r2 = r2.AOJ(r1, r0)     // Catch:{ IOException -> 0x0053 }
            r1 = 15
            X.9Jr r0 = new X.9Jr     // Catch:{ IOException -> 0x0053 }
            r0.<init>(r7, r3, r1)     // Catch:{ IOException -> 0x0053 }
            r6.A01 = r7     // Catch:{ IOException -> 0x0053 }
            r6.A00 = r4     // Catch:{ IOException -> 0x0053 }
            java.lang.Object r0 = X.1Eo.A00(r6, r2, r0)     // Catch:{ IOException -> 0x0053 }
            if (r0 != r5) goto L_0x005d
            return r5
        L_0x0053:
            r2 = move-exception
            java.lang.String r1 = "StoryDraftsStore"
            java.lang.String r0 = "Failed to de-serialise story drafts"
            X.0kD.A0F(r1, r0, r2)
            X.0sn r0 = X.0sn.A00
        L_0x005d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.storydrafts.model.StoryDraftsStore.A04(X.4D7):java.lang.Object");
    }

    public final void onSessionWillEnd() {
        this.A04.clear();
    }

    public /* synthetic */ StoryDraftsStore(UserSession userSession) {
        1Av A002 = 1Au.A00(userSession);
        AnonymousClass12T r1 = AnonymousClass12T.A00;
        0qQ.A0B(userSession, 1);
        0qQ.A0B(A002, 2);
        0qQ.A0B(r1, 3);
        this.A01 = userSession;
        this.A02 = A002;
        this.A00 = r1;
        1HR r0 = new 1HR(Integer.MAX_VALUE);
        this.A05 = r0;
        this.A06 = 0u9.A04(r0);
    }
}
