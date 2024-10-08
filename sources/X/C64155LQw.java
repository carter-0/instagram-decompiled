package X;

import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.LQw  reason: case insensitive filesystem */
public final class C64155LQw {
    public static final C64155LQw A00 = new Object();

    public static final 0eP A00(C63790L6w l6w) {
        IOException iOException;
        String str;
        0qQ.A0B(l6w, 0);
        2ZL r4 = l6w.A00;
        1XR r3 = l6w.A01;
        if (r4 == null || r3 == null) {
            Locale locale = Locale.US;
            IOException iOException2 = l6w.A02;
            if (iOException2 == null || (str = iOException2.getMessage()) == null) {
                str = "null";
            }
            String format = String.format(locale, "httpResponse=%s parsedResponse=%s errorMsg=%s", Arrays.copyOf(new Object[]{r4, r3, str}, 3));
            0qQ.A07(format);
            iOException = JTO.A0u(format);
        } else {
            iOException = l6w.A02;
            if (iOException == null) {
                return AnonymousClass7TE.A1L(r4, r3);
            }
        }
        throw iOException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0230, code lost:
        if (X.JTQ.A1R(r10, r1) == false) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x023e, code lost:
        if (X.JTQ.A1Q(r10, r1) != false) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0249, code lost:
        if (X.182.A06(r10, r1, 36323002279078636L) == false) goto L_0x02d7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass1XT r27, X.AnonymousClass0iw r28, X.1ut r29, X.1us r30, X.LP8 r31, java.lang.String r32, boolean r33) {
        /*
            r26 = this;
            r5 = 0
            r11 = r28
            r9 = r31
            boolean r8 = X.AnonymousClass7TF.A1U(r5, r11, r9)
            r7 = 3
            r4 = r29
            X.0qQ.A0B(r4, r7)
            X.3Q2 r0 = r9.A0D
            java.lang.String r2 = r9.A0I
            r6 = r30
            if (r30 == 0) goto L_0x001a
            r6.ESc(r8)
        L_0x001a:
            boolean r1 = r0.A4w
            if (r1 == 0) goto L_0x0028
            boolean r1 = r0.A0s()
            if (r1 != 0) goto L_0x01f7
            boolean r1 = r0.A5Q
            if (r1 == 0) goto L_0x01f7
        L_0x0028:
            X.3QD r1 = X.AnonymousClass3QD.CONFIGURED
        L_0x002a:
            r0.A0b(r1)
            r10 = r27
            boolean r1 = r10 instanceof X.K1X
            if (r1 == 0) goto L_0x0040
            r1 = r10
            X.K1X r1 = (X.K1X) r1
            X.1Xj r1 = r1.A00
            if (r1 == 0) goto L_0x0040
            java.lang.String r1 = r1.A30()
            r0.A32 = r1
        L_0x0040:
            X.37k r3 = r9.A0E
            r3.EFl(r0, r6, r2, r5)
            boolean r1 = r6 instanceof X.1vG
            if (r1 != 0) goto L_0x005b
            java.lang.String r2 = "ConfigureResponseHelper"
            java.lang.String r1 = "not firing publish_success event for UploadFinishShareTarget"
            X.0KC.A0C(r2, r1)
            X.37j r3 = (X.C2373737j) r3
            r1 = 0
            r2 = r33
            r3.EFe(r1, r0, r2)
            r0.A0P()
        L_0x005b:
            com.instagram.common.session.UserSession r1 = r9.A0C
            android.content.Context r9 = r9.A0B
            X.1Xj r2 = r4.Dou(r9, r10, r1, r0)
            java.lang.String r12 = r0.A2g
            if (r2 == 0) goto L_0x0118
            X.1Xy r3 = r2.A0C
            java.lang.String r19 = r3.B4l()
            if (r19 == 0) goto L_0x00fe
            if (r12 == 0) goto L_0x00fe
            X.1iA r4 = r0.A1G
            X.1iA r3 = X.1iA.A0Q
            if (r4 != r3) goto L_0x00fe
            X.0Tu r10 = X.0Tu.A05
            r3 = 36329659478130931(0x8111a2000140f3, double:3.038361169542288E-306)
            boolean r3 = X.182.A06(r10, r1, r3)
            if (r3 == 0) goto L_0x00fe
            java.lang.String r3 = r0.A3t
            java.util.LinkedHashMap r3 = X.C64193LTa.A0G(r1, r0, r3)
            java.util.HashMap r10 = X.AnonymousClass7TE.A1E()
            java.lang.String r4 = X.JTQ.A0c(r3)
            java.lang.String r3 = "X-Instagram-Rupload-Params"
            r10.put(r3, r4)
            X.KjI r3 = X.C62637KjI.A0h
            X.SOh r4 = new X.SOh
            r4.<init>(r3)
            r4.A07 = r10
            java.lang.String r3 = "i.instagram.com"
            r4.A06 = r3
            X.SFy r13 = new X.SFy
            r13.<init>(r4)
            java.io.File r3 = r9.getCacheDir()
            X.0qQ.A07(r3)
            r10 = 0
            X.RuQ r9 = new X.RuQ
            r9.<init>(r3, r12, r10)
            X.Q1Q r12 = new X.Q1Q
            r12.<init>(r1)
            java.lang.String r3 = r0.A3t
            X.S5Y r4 = new X.S5Y
            r4.<init>(r12, r3)
            com.instagram.pendingmedia.model.constants.ShareType r3 = r0.A0E()
            java.lang.String r24 = r3.toString()
            X.S2n r3 = new X.S2n
            r25 = r10
            r20 = r3
            r21 = r4
            r22 = r9
            r23 = r10
            r20.<init>(r21, r22, r23, r24, r25)
            java.lang.String r9 = r0.A0I()
            X.SmU r14 = X.JTR.A0e(r1)
            java.lang.Integer r17 = X.AnonymousClass05K.A01
            X.0qQ.A0B(r9, r5)
            X.RuQ r10 = r3.A01
            X.S5Y r15 = r3.A00
            java.util.Collection r4 = r3.A04
            java.lang.String r3 = r3.A03
            X.SOM r12 = new X.SOM
            r18 = r9
            r20 = r3
            r21 = r4
            r16 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r12.A02()
        L_0x00fe:
            boolean r3 = r0.A5e
            if (r3 == 0) goto L_0x0118
            X.1Ng r9 = X.AnonymousClass1Nd.A00(r1)
            java.lang.String r4 = r0.A39
            r15 = 0
            X.INp r3 = new X.INp
            r12 = r3
            r13 = r2
            r14 = r4
            r16 = r15
            r17 = r8
            r12.<init>(r13, r14, r15, r16, r17)
            r9.A00(r3)
        L_0x0118:
            r9 = 2
            boolean r3 = X.AnonymousClass8PU.A0C(r0, r6)
            if (r3 == 0) goto L_0x015c
            com.instagram.pendingmedia.model.constants.ShareType r12 = r0.A0E()
            java.lang.String r10 = r0.A3z
            java.lang.String r4 = X.C2373637i.A01(r0)
            java.lang.String r3 = r0.A0I()
            X.C64189LSw.A04(r1, r12, r10, r4, r3)
            java.lang.String r3 = r0.A3z
            java.lang.String r15 = X.C2373637i.A01(r0)
            java.lang.String r16 = r0.A0I()
            r17 = 0
            java.lang.String r13 = "success"
            r12 = r1
            r14 = r3
            X.C63394KwF.A00(r12, r13, r14, r15, r16, r17)
            X.1Xj r3 = r0.A1C
            if (r3 == 0) goto L_0x014d
            java.lang.String r13 = r3.A30()
            if (r13 != 0) goto L_0x014f
        L_0x014d:
            java.lang.String r13 = ""
        L_0x014f:
            X.1iA r3 = r0.A1G
            int r3 = r3.A00
            java.lang.String r14 = "share_sheet"
            r12 = r32
            r10 = r1
            r15 = r3
            X.LT0.A03(r10, r11, r12, r13, r14, r15)
        L_0x015c:
            java.lang.String r4 = "id: "
            if (r2 == 0) goto L_0x03aa
            boolean r3 = r0.A12()
            if (r3 == 0) goto L_0x0189
            boolean r3 = r2.A52()
            if (r3 != 0) goto L_0x0189
            java.lang.StringBuilder r4 = X.AnonymousClass7TF.A0n(r4)
            java.lang.String r3 = r2.getId()
            r4.append(r3)
            java.lang.String r3 = " type: "
            r4.append(r3)
            X.1iA r3 = r2.BR7()
            java.lang.String r4 = X.AnonymousClass7TF.A0i(r3, r4)
            java.lang.String r3 = "invalidVideoMediaAfterConfigure"
            X.0wb.A03(r3, r4)
        L_0x0189:
            X.1Xy r3 = r2.A0C
            java.lang.String r3 = r3.BIl()
            boolean r3 = X.0mp.A0B(r3)
            if (r3 == 0) goto L_0x019c
            java.lang.String r4 = "media_or_ad"
            X.1Xy r3 = r2.A0C
            r3.Ea7(r4)
        L_0x019c:
            com.instagram.pendingmedia.model.constants.ShareType r4 = r0.A0E()
            com.instagram.pendingmedia.model.constants.ShareType r3 = com.instagram.pendingmedia.model.constants.ShareType.CLIPS
            if (r4 != r3) goto L_0x024b
            X.1Ng r4 = X.AnonymousClass1Nd.A00(r1)
            X.2OF r3 = new X.2OF
            r3.<init>(r2, r0)
            r4.A00(r3)
            X.Jw4 r11 = r0.A0m
            if (r11 == 0) goto L_0x024b
            java.lang.Object r3 = r11.A00
            boolean r3 = X.G9w.A1b(r3)
            if (r3 == 0) goto L_0x024b
            boolean r3 = r0.A5p
            if (r3 != 0) goto L_0x024b
            boolean r3 = r0.A6B
            if (r3 == 0) goto L_0x02d7
            java.util.List r3 = r0.A4o
            if (r3 == 0) goto L_0x01fb
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r14 = r3.iterator()
        L_0x01d0:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x01fd
            java.lang.Object r4 = r14.next()
            r10 = r4
            X.5JJ r10 = (X.AnonymousClass5JJ) r10
            java.lang.String r13 = r10.A0I
            X.6oG r3 = X.C318046oG.TEXT
            boolean r3 = X.Dba.A1X(r3, r13)
            if (r3 == 0) goto L_0x01d0
            X.3ik r3 = r10.A02
            if (r3 == 0) goto L_0x01d0
            int r3 = r3.A09
            if (r3 != 0) goto L_0x01d0
            java.lang.String r3 = r10.A0F
            if (r3 != 0) goto L_0x01d0
            r12.add(r4)
            goto L_0x01d0
        L_0x01f7:
            X.3QD r1 = X.AnonymousClass3QD.CONFIGURING_MULTIPLE_TARGETS
            goto L_0x002a
        L_0x01fb:
            X.0sn r12 = X.0sn.A00
        L_0x01fd:
            java.util.List r3 = r0.A4o
            if (r3 == 0) goto L_0x02c9
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r14 = r3.iterator()
        L_0x0209:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x02cb
            java.lang.Object r13 = r14.next()
            r3 = r13
            X.5JJ r3 = (X.AnonymousClass5JJ) r3
            java.lang.String r10 = r3.A0I
            X.6oG r3 = X.C318046oG.KARAOKE_CAPTION
            boolean r3 = X.Dba.A1X(r3, r10)
            if (r3 == 0) goto L_0x0209
            r4.add(r13)
            goto L_0x0209
        L_0x0224:
            boolean r3 = X.AnonymousClass7TE.A1b(r12)
            if (r3 == 0) goto L_0x0232
            X.0Tu r10 = X.0Tu.A05
            boolean r3 = X.JTQ.A1R(r10, r1)
            if (r3 != 0) goto L_0x0240
        L_0x0232:
            boolean r3 = X.AnonymousClass7TE.A1b(r4)
            if (r3 == 0) goto L_0x02d7
            X.0Tu r10 = X.0Tu.A05
            boolean r3 = X.JTQ.A1Q(r10, r1)
            if (r3 == 0) goto L_0x02d7
        L_0x0240:
            r3 = 36323002279078636(0x810b9400052aec, double:3.034151130055228E-306)
            boolean r3 = X.182.A06(r10, r1, r3)
            if (r3 == 0) goto L_0x02d7
        L_0x024b:
            r0.A1C = r2
            boolean r3 = r0.A4w
            if (r3 == 0) goto L_0x0260
            if (r30 == 0) goto L_0x0260
            int r3 = r6.C2A()
            java.util.HashMap r4 = r0.A45
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r4.put(r3, r2)
        L_0x0260:
            java.lang.String r11 = r0.A3V
            if (r11 == 0) goto L_0x03d3
            com.instagram.model.mediatype.ProductType r4 = r2.A1v()
            if (r4 == 0) goto L_0x03d3
            boolean r3 = X.C59911Jba.A02(r0)
            if (r3 != 0) goto L_0x03d3
            X.0eM r3 = X.AnonymousClass45D.A00
            r3 = 9
            int r4 = r4.ordinal()
            if (r4 == r3) goto L_0x02c1
            r3 = 13
            if (r4 != r3) goto L_0x03d3
            X.0Tu r6 = X.0Tu.A05
            r3 = 36331115472110497(0x8112f5000243a1, double:3.039281945997783E-306)
        L_0x0285:
            boolean r3 = X.182.A06(r6, r1, r3)
            if (r3 == 0) goto L_0x03d3
            java.lang.String r10 = r2.getId()
            if (r10 == 0) goto L_0x03a5
            X.0qQ.A0B(r11, r5)
            X.OOC r3 = new X.OOC
            r3.<init>()
            X.RDK r7 = X.RDK.A01
            android.content.Context r2 = X.C60960kU.A00
            X.QcM r2 = r7.A00(r2)
            r3.A05(r2, r11)
            X.Ni4 r4 = r3.A00()
            boolean r2 = r4.exists()
            if (r2 == 0) goto L_0x03d3
            boolean r2 = r4.isFile()
            if (r2 == 0) goto L_0x03d3
            long r13 = r4.length()
            r11 = 50000(0xc350, double:2.47033E-319)
            int r2 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r2 < 0) goto L_0x03d3
            goto L_0x035a
        L_0x02c1:
            X.0Tu r6 = X.0Tu.A05
            r3 = 36331115472044960(0x8112f5000143a0, double:3.039281945956337E-306)
            goto L_0x0285
        L_0x02c9:
            X.0sn r4 = X.0sn.A00
        L_0x02cb:
            boolean r3 = r12.isEmpty()
            if (r3 == 0) goto L_0x0224
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L_0x0224
        L_0x02d7:
            java.lang.Object r3 = r11.A00
            java.util.List r3 = (java.util.List) r3
            boolean r11 = r11.A02
            java.util.ArrayList r10 = X.AnonymousClass7TF.A0q(r3, r7)
            java.util.Iterator r12 = r3.iterator()
        L_0x02e5:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x0307
            java.lang.Object r3 = r12.next()
            X.JtT r3 = (X.C60909JtT) r3
            java.lang.String r4 = r3.A01
            java.lang.String r3 = "language"
            X.0eP r7 = X.AnonymousClass7TE.A1L(r3, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r11)
            java.lang.String r3 = "is_lipsync"
            java.util.LinkedHashMap r3 = X.DbY.A0p(r3, r4, r7)
            r10.add(r3)
            goto L_0x02e5
        L_0x0307:
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            X.S5Q r7 = new X.S5Q
            r7.<init>(r11, r10)
            X.RRN r10 = X.C62959KpB.A00()
            r3 = 360(0x168, double:1.78E-321)
            r10.A03 = r3
            r3 = 30
            r10.A02 = r3
            r3 = 4642648265865560064(0x406e000000000000, double:240.0)
            r10.A00 = r3
            r3 = 30
            r10.A01 = r3
            X.QGH r13 = new X.QGH
            r13.<init>(r10, r1)
            r13.A05 = r0
            X.SgG r12 = new X.SgG
            r12.<init>(r10, r13, r11)
            java.util.Map r4 = X.C63554Kz3.A00
            java.lang.String r3 = r0.A3t
            r4.put(r3, r12)
            java.util.Map r4 = X.C63554Kz3.A01
            java.lang.String r3 = r0.A3t
            r4.put(r3, r13)
            r14 = 0
            r15 = 0
            r13 = r0
            r17 = r15
            r19 = r5
            r12.A01(r13, r14, r15, r17, r19)
            r3 = 14
            X.MMt r10 = new X.MMt
            r10.<init>(r0, r3)
            r4 = 15
            X.MMt r3 = new X.MMt
            r3.<init>(r0, r4)
            r12.A00(r7, r10, r3)
            goto L_0x024b
        L_0x035a:
            X.OOC r6 = new X.OOC     // Catch:{ Exception -> 0x0394 }
            r6.<init>()     // Catch:{ Exception -> 0x0394 }
            X.0eM r2 = X.AnonymousClass45D.A00     // Catch:{ Exception -> 0x0394 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ Exception -> 0x0394 }
            java.io.File r2 = (java.io.File) r2     // Catch:{ Exception -> 0x0394 }
            java.lang.String r2 = X.JTP.A0u(r2)     // Catch:{ Exception -> 0x0394 }
            java.lang.StringBuilder r3 = X.AnonymousClass7TF.A0n(r2)     // Catch:{ Exception -> 0x0394 }
            r2 = 47
            r3.append(r2)     // Catch:{ Exception -> 0x0394 }
            r3.append(r10)     // Catch:{ Exception -> 0x0394 }
            java.lang.String r2 = ".mp4"
            java.lang.String r3 = X.AnonymousClass7TF.A0l(r2, r3)     // Catch:{ Exception -> 0x0394 }
            android.content.Context r2 = X.C60960kU.A00     // Catch:{ Exception -> 0x0394 }
            X.QcM r2 = r7.A00(r2)     // Catch:{ Exception -> 0x0394 }
            r6.A05(r2, r3)     // Catch:{ Exception -> 0x0394 }
            X.Ni4 r3 = r6.A00()     // Catch:{ Exception -> 0x0394 }
            boolean r2 = r4.renameTo(r3)     // Catch:{ Exception -> 0x0394 }
            if (r2 == 0) goto L_0x03d3
            X.AnonymousClass45D.A00()     // Catch:{ Exception -> 0x0394 }
            goto L_0x03cc
        L_0x0394:
            r6 = move-exception
            java.lang.String r4 = "VideoOutputLocalFileUtil::updateRenderedVideoFileNameWithMediaId"
            X.0kg r3 = X.0kg.A03
            java.lang.String r2 = r6.getMessage()
            if (r2 != 0) goto L_0x03a1
            java.lang.String r2 = "null"
        L_0x03a1:
            X.0wb.A02(r3, r4, r2, r6)
            goto L_0x03d3
        L_0x03a5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x03aa:
            com.instagram.pendingmedia.model.constants.ShareType r3 = r0.A0E()
            com.instagram.pendingmedia.model.constants.ShareType r2 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE
            if (r3 != r2) goto L_0x03d3
            if (r30 == 0) goto L_0x03d3
            java.lang.String r3 = r6.getTypeName()
            java.lang.String r2 = "UploadFinishShareTarget"
            boolean r2 = X.0qQ.A0K(r3, r2)
            if (r2 != 0) goto L_0x03d3
            java.lang.String r2 = r0.A3t
            java.lang.String r3 = X.002.A0R(r4, r2)
            java.lang.String r2 = "media_uploader_null_media"
            X.0wb.A03(r2, r3)
            goto L_0x03d3
        L_0x03cc:
            java.lang.String r2 = r3.getPath()
            r0.A0i(r2)
        L_0x03d3:
            boolean r2 = r0.A4w
            if (r2 == 0) goto L_0x03da
            X.JTP.A1M(r1)
        L_0x03da:
            boolean r2 = r0.A5S
            if (r2 != 0) goto L_0x03e6
            boolean r2 = r0.A5U
            if (r2 != 0) goto L_0x03e6
            boolean r2 = r0.A5W
            if (r2 == 0) goto L_0x044f
        L_0x03e6:
            X.1iA r3 = r0.A1G
            X.Kw1 r2 = X.C63380Kw1.$redex_init_class
            int r3 = r3.ordinal()
            if (r3 == r5) goto L_0x045f
            if (r3 == r8) goto L_0x045c
            r2 = 4
            if (r3 == r2) goto L_0x0459
            X.28t r7 = X.28t.A04
        L_0x03f7:
            com.instagram.pendingmedia.model.constants.ShareType r2 = r0.A0E()
            int r3 = r2.ordinal()
            if (r3 == r5) goto L_0x0456
            if (r3 == r9) goto L_0x0453
            r2 = 9
            if (r3 == r2) goto L_0x0450
            X.4yP r6 = X.C279294yP.NONE
        L_0x0409:
            X.55Q r2 = r0.A1O
            if (r2 == 0) goto L_0x0411
            java.lang.String r5 = r2.A03
            if (r5 != 0) goto L_0x0413
        L_0x0411:
            java.lang.String r5 = r0.A2e
        L_0x0413:
            X.27r r1 = X.27p.A01(r1)
            java.lang.String r4 = r0.A2X
            X.28D r3 = r0.A0i
            java.lang.String r2 = r0.A3C
            X.0wc r1 = r1.A01
            java.lang.String r0 = "ig_camera_publish_media_success"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x044f
            if (r4 != 0) goto L_0x042f
            java.lang.String r4 = ""
        L_0x042f:
            X.JTO.A1S(r1, r4)
            if (r3 != 0) goto L_0x0436
            X.28D r3 = X.28D.A5J
        L_0x0436:
            X.JTS.A15(r3, r1, r8)
            X.JTO.A1P(r7, r1)
            X.AnonymousClass7TH.A0U(r1)
            java.lang.String r0 = "composition_str_id"
            r1.AAJ(r0, r5)
            X.C51965G9l.A1K(r1, r2)
            java.lang.String r0 = "camera_destination"
            r1.A8M(r6, r0)
            r1.Cgf()
        L_0x044f:
            return
        L_0x0450:
            X.4yP r6 = X.C279294yP.CLIPS
            goto L_0x0409
        L_0x0453:
            X.4yP r6 = X.C279294yP.STORY
            goto L_0x0409
        L_0x0456:
            X.4yP r6 = X.C279294yP.FEED
            goto L_0x0409
        L_0x0459:
            X.28t r7 = X.28t.A02
            goto L_0x03f7
        L_0x045c:
            X.28t r7 = X.28t.A06
            goto L_0x03f7
        L_0x045f:
            X.28t r7 = X.28t.A05
            goto L_0x03f7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64155LQw.A01(X.1XT, X.0iw, X.1ut, X.1us, X.LP8, java.lang.String, boolean):void");
    }
}
