package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.8X4  reason: invalid class name */
public final class AnonymousClass8X4 implements C3493580b {
    public final Activity A00;
    public final UserSession A01;
    public final C3499482o A02;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r9v2, types: [java.util.Map] */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x030e, code lost:
        if (r2 > 2013) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0320, code lost:
        if (r3 >= r14) goto L_0x0322;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0486  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0498  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0522  */
    /* JADX WARNING: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void Dmx(java.lang.Object r31, java.lang.Object r32, java.lang.Object r33) {
        /*
            r30 = this;
            r10 = r32
            r2 = r31
            X.80X r2 = (X.AnonymousClass80X) r2
            X.80X r10 = (X.AnonymousClass80X) r10
            r6 = 0
            X.0qQ.A0B(r2, r6)
            r8 = 1
            X.0qQ.A0B(r10, r8)
            r9 = 2
            r0 = r33
            X.0qQ.A0B(r0, r9)
            r4 = r30
            com.instagram.common.session.UserSession r1 = r4.A01
            X.27r r0 = X.27p.A01(r1)
            int r3 = r2.ordinal()
            if (r3 == r8) goto L_0x0530
            if (r3 != r9) goto L_0x0053
            X.82o r12 = r4.A02
            X.82Y r7 = r12.A01
            X.50r r5 = r7.A0g
            X.50r r3 = X.C2801950r.FEED_POST
            if (r5 != r3) goto L_0x052d
            X.4yP r11 = X.C279294yP.FEED
        L_0x0032:
            java.lang.Integer r3 = r7.A0C
            if (r3 == 0) goto L_0x052a
            int r3 = r3.intValue()
            if (r3 == r6) goto L_0x0526
            if (r3 != r8) goto L_0x052a
            java.lang.Integer r5 = X.AnonymousClass05K.A01
        L_0x0040:
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            if (r5 != r3) goto L_0x0522
            java.lang.String r5 = "swipe"
        L_0x0046:
            X.8nd r3 = r12.A01()
            X.28t r3 = r3.A00
            r0.A0z(r11, r3, r5)
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            r7.A0C = r3
        L_0x0053:
            int r3 = r10.ordinal()
            if (r3 == r8) goto L_0x04b4
            if (r3 == r9) goto L_0x00ba
            if (r3 != r6) goto L_0x00b7
            X.27r r3 = X.27p.A01(r1)
            r3.A0W()
            X.27p.A02(r1)
            java.lang.Class<X.LGV> r3 = X.LGV.class
            r1.A03(r3)
            java.lang.Class<X.LBr> r3 = X.C63908LBr.class
            r1.A03(r3)
            X.82o r5 = r4.A02
            boolean r3 = r5.A0H()
            if (r3 == 0) goto L_0x009b
            X.80X r3 = X.AnonymousClass80X.PRE_CAPTURE
            if (r2 != r3) goto L_0x009b
            X.AXc r4 = new X.AXc
            r4.<init>(r0)
            X.82Y r3 = r5.A01
            X.82i r3 = r3.A0h
            if (r3 == 0) goto L_0x00b8
            X.1Xj r3 = r3.A04
            java.lang.String r12 = r3.getId()
        L_0x008e:
            r8 = 0
            java.lang.String r9 = "remix_reply_back"
            java.lang.String r10 = "tap"
            java.lang.String r11 = "remix_reply_pre_capture"
            r6 = r4
            r7 = r1
            r13 = r8
            X.C67000MgY.A00(r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x009b:
            X.82Y r3 = r5.A01
            boolean r3 = r3.A0S
            if (r3 == 0) goto L_0x00b7
            X.80X r3 = X.AnonymousClass80X.PRE_CAPTURE
            if (r2 != r3) goto L_0x00b7
            X.AXc r2 = new X.AXc
            r2.<init>(r0)
            r4 = 0
            java.lang.String r5 = "selfie_reply_back"
            java.lang.String r6 = "tap"
        L_0x00af:
            java.lang.String r7 = "selfie_reply_pre_capture"
        L_0x00b1:
            r3 = r1
            r8 = r4
            r9 = r4
            X.C67000MgY.A00(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x00b7:
            return
        L_0x00b8:
            r12 = 0
            goto L_0x008e
        L_0x00ba:
            X.82o r2 = r4.A02
            r29 = r2
            boolean r2 = r29.A0B()
            if (r2 == 0) goto L_0x00e1
            X.28t r20 = X.28t.A06
        L_0x00c6:
            r2 = r29
            X.82Y r5 = r2.A01
            X.8Yz r3 = r5.A0X
            if (r3 == 0) goto L_0x00df
            X.80m r2 = r3.A08
            java.lang.Object r2 = r2.A00
        L_0x00d2:
            boolean r2 = r2 instanceof X.AnonymousClass80O
            r7 = 10
            if (r2 == 0) goto L_0x01e9
            android.app.Activity r2 = r4.A00
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r2 = X.C226132fh.A00(r2, r1)
            goto L_0x00ea
        L_0x00df:
            r2 = 0
            goto L_0x00d2
        L_0x00e1:
            X.8nd r2 = r29.A01()
            X.28t r2 = r2.A00
            r20 = r2
            goto L_0x00c6
        L_0x00ea:
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r2 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r2     // Catch:{ all -> 0x0110 }
            X.81W r9 = r2.A0K     // Catch:{ all -> 0x0110 }
            int r2 = r9.getHeight()     // Catch:{ all -> 0x0110 }
            long r2 = (long) r2     // Catch:{ all -> 0x0110 }
            java.lang.Long r4 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0110 }
            int r2 = r9.getWidth()     // Catch:{ all -> 0x0110 }
            long r2 = (long) r2     // Catch:{ all -> 0x0110 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0110 }
            java.lang.Long[] r2 = new java.lang.Long[]{r4, r2}     // Catch:{ all -> 0x0110 }
            java.util.List r2 = X.0sr.A1P(r2)     // Catch:{ all -> 0x0110 }
            java.util.List r22 = java.util.Collections.singletonList(r2)     // Catch:{ all -> 0x0110 }
            X.0qQ.A07(r22)     // Catch:{ all -> 0x0110 }
            goto L_0x011a
        L_0x0110:
            r4 = move-exception
            java.lang.String r3 = "CaptureStateLogger"
            java.lang.String r2 = "Failed to get display height widths for Reels post-capture"
            X.0kD.A08(r3, r2, r4)
            r22 = 0
        L_0x011a:
            java.util.List r9 = r5.A0n
            java.util.List r2 = java.util.Collections.unmodifiableList(r9)
            X.0qQ.A07(r2)
            java.lang.Object r2 = X.00k.A0O(r2, r6)
            com.instagram.common.gallery.Medium r2 = (com.instagram.common.gallery.Medium) r2
            if (r2 == 0) goto L_0x0194
            int r2 = r2.A04
            long r2 = (long) r2
        L_0x012e:
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            java.util.List r2 = java.util.Collections.unmodifiableList(r9)
            X.0qQ.A07(r2)
            java.lang.Object r2 = X.00k.A0O(r2, r6)
            com.instagram.common.gallery.Medium r2 = (com.instagram.common.gallery.Medium) r2
            if (r2 == 0) goto L_0x0191
            int r2 = r2.A0B
            long r2 = (long) r2
        L_0x0144:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Long[] r2 = new java.lang.Long[]{r4, r2}
            java.util.List r2 = X.0sr.A1P(r2)
            java.util.List r10 = java.util.Collections.singletonList(r2)
            X.0qQ.A07(r10)
            java.util.List r3 = java.util.Collections.unmodifiableList(r9)
            X.0qQ.A07(r3)
            int r2 = X.0Yv.A1E(r3, r7)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r2)
            java.util.Iterator r13 = r3.iterator()
        L_0x016b:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x0197
            java.lang.Object r12 = r13.next()
            com.instagram.common.gallery.Medium r12 = (com.instagram.common.gallery.Medium) r12
            int r2 = r12.A04
            long r2 = (long) r2
            java.lang.Long r11 = java.lang.Long.valueOf(r2)
            int r2 = r12.A0B
            long r2 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Long[] r2 = new java.lang.Long[]{r11, r2}
            java.util.List r2 = X.0sr.A1P(r2)
            r4.add(r2)
            goto L_0x016b
        L_0x0191:
            r2 = 0
            goto L_0x0144
        L_0x0194:
            r2 = 0
            goto L_0x012e
        L_0x0197:
            java.util.List r11 = java.util.Collections.unmodifiableList(r9)
            X.0qQ.A07(r11)
            int r2 = X.0Yv.A1E(r11, r7)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            java.util.Iterator r13 = r11.iterator()
        L_0x01ab:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x01c3
            java.lang.Object r2 = r13.next()
            com.instagram.common.gallery.Medium r2 = (com.instagram.common.gallery.Medium) r2
            long r11 = r2.A01()
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            r3.add(r2)
            goto L_0x01ab
        L_0x01c3:
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)
            X.0qQ.A07(r9)
            int r2 = X.0Yv.A1E(r9, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r2)
            java.util.Iterator r9 = r9.iterator()
        L_0x01d7:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x043b
            java.lang.Object r2 = r9.next()
            com.instagram.common.gallery.Medium r2 = (com.instagram.common.gallery.Medium) r2
            java.lang.String r2 = r2.A0X
            r7.add(r2)
            goto L_0x01d7
        L_0x01e9:
            if (r3 == 0) goto L_0x01fc
            X.80m r2 = r3.A08
            java.lang.Object r2 = r2.A00
        L_0x01ef:
            boolean r2 = r2 instanceof X.AnonymousClass9QA
            if (r2 == 0) goto L_0x0435
            android.app.Activity r2 = r4.A00
            r23 = r2
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r19 = X.C226132fh.A00(r2, r1)
            goto L_0x01fe
        L_0x01fc:
            r2 = 0
            goto L_0x01ef
        L_0x01fe:
            r2 = r19
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r2 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r2     // Catch:{ all -> 0x0226 }
            X.81W r10 = r2.A0K     // Catch:{ all -> 0x0226 }
            int r2 = r10.getHeight()     // Catch:{ all -> 0x0226 }
            long r2 = (long) r2     // Catch:{ all -> 0x0226 }
            java.lang.Long r4 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0226 }
            int r2 = r10.getWidth()     // Catch:{ all -> 0x0226 }
            long r2 = (long) r2     // Catch:{ all -> 0x0226 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0226 }
            java.lang.Long[] r2 = new java.lang.Long[]{r4, r2}     // Catch:{ all -> 0x0226 }
            java.util.List r2 = X.0sr.A1P(r2)     // Catch:{ all -> 0x0226 }
            java.util.List r22 = java.util.Collections.singletonList(r2)     // Catch:{ all -> 0x0226 }
            X.0qQ.A07(r22)     // Catch:{ all -> 0x0226 }
            goto L_0x0230
        L_0x0226:
            r4 = move-exception
            java.lang.String r3 = "CaptureStateLogger"
            java.lang.String r2 = "Failed to get display height widths for Story post-capture"
            X.0kD.A08(r3, r2, r4)
            r22 = 0
        L_0x0230:
            java.util.List r2 = r5.A0m
            r21 = r2
            java.util.List r3 = java.util.Collections.unmodifiableList(r21)
            X.0qQ.A07(r3)
            int r2 = X.0Yv.A1E(r3, r7)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r2)
            java.util.Iterator r12 = r3.iterator()
        L_0x0248:
            boolean r2 = r12.hasNext()
            r17 = -1
            if (r2 == 0) goto L_0x02a6
            java.lang.Object r11 = r12.next()
            X.8nh r11 = (X.C365798nh) r11
            X.8nd r3 = r11.A05
            X.8nd r2 = X.C365758nd.A07
            if (r3 != r2) goto L_0x0281
            java.lang.Long[] r10 = new java.lang.Long[r9]
            X.7zv r11 = r11.A03
            if (r11 == 0) goto L_0x027e
            int r2 = r11.A08
            long r2 = (long) r2
        L_0x0265:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r10[r6] = r2
            if (r11 == 0) goto L_0x029c
            int r2 = r11.A0K
        L_0x026f:
            long r2 = (long) r2
        L_0x0270:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
        L_0x0274:
            r10[r8] = r2
            java.util.List r2 = X.0sr.A1P(r10)
            r4.add(r2)
            goto L_0x0248
        L_0x027e:
            r2 = 0
            goto L_0x0265
        L_0x0281:
            X.8nd r2 = X.C365758nd.A04
            java.lang.Long[] r10 = new java.lang.Long[r9]
            if (r3 != r2) goto L_0x029f
            X.8Cl r11 = r11.A02
            if (r11 == 0) goto L_0x0299
            int r2 = r11.A06
            long r2 = (long) r2
        L_0x028e:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r10[r6] = r2
            if (r11 == 0) goto L_0x029c
            int r2 = r11.A09
            goto L_0x026f
        L_0x0299:
            r2 = 0
            goto L_0x028e
        L_0x029c:
            r2 = 0
            goto L_0x0270
        L_0x029f:
            java.lang.Long r2 = java.lang.Long.valueOf(r17)
            r10[r6] = r2
            goto L_0x0274
        L_0x02a6:
            java.util.List r3 = java.util.Collections.unmodifiableList(r21)
            X.0qQ.A07(r3)
            int r2 = X.0Yv.A1E(r3, r7)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r2)
            java.util.Iterator r16 = r3.iterator()
        L_0x02ba:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x03c2
            java.lang.Object r11 = r16.next()
            X.8nh r11 = (X.C365798nh) r11
            X.8nd r3 = r11.A05
            X.8nd r2 = X.C365758nd.A07
            if (r3 != r2) goto L_0x0350
            X.7zv r3 = r11.A03
            if (r3 == 0) goto L_0x034d
            int r2 = r3.A0K
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            int r2 = r3.A08
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
        L_0x02dc:
            r2 = r19
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r2 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r2
            X.81W r2 = r2.A0K
            int r15 = r2.getWidth()
            int r14 = r2.getHeight()
            android.content.Context r13 = r23.getApplicationContext()
            X.0qQ.A07(r13)
            if (r11 == 0) goto L_0x03b1
            if (r3 == 0) goto L_0x03b1
            int r12 = r11.intValue()
            float r11 = (float) r12
            int r3 = r3.intValue()
            float r2 = (float) r3
            float r11 = r11 / r2
            int r2 = X.AnonymousClass0Ke.A00(r13)
            int[] r15 = X.C367168qI.A00(r11, r15, r14)
            r11 = -1
            if (r2 == r11) goto L_0x0310
            r14 = 2013(0x7dd, float:2.821E-42)
            r11 = 2
            if (r2 <= r14) goto L_0x0311
        L_0x0310:
            r11 = 1
        L_0x0311:
            r2 = r15[r6]
            int r2 = r2 / r11
            r14 = r15[r8]
            int r14 = r14 / r11
            int[] r15 = new int[]{r2, r14}
            r2 = r15[r6]
            if (r12 >= r2) goto L_0x0322
            r11 = 1
            if (r3 < r14) goto L_0x0323
        L_0x0322:
            r11 = 0
        L_0x0323:
            java.lang.Integer r2 = X.AnonymousClass9TI.A00(r13, r1, r6)
            if (r2 == 0) goto L_0x039e
            if (r11 == 0) goto L_0x039e
            android.graphics.Point r11 = new android.graphics.Point
            r11.<init>(r12, r3)
        L_0x0330:
            java.lang.Long[] r12 = new java.lang.Long[r9]
            int r2 = r11.y
            long r2 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12[r6] = r2
            int r2 = r11.x
            long r2 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
        L_0x0342:
            r12[r8] = r2
            java.util.List r2 = X.0sr.A1P(r12)
            r10.add(r2)
            goto L_0x02ba
        L_0x034d:
            r11 = 0
            r3 = 0
            goto L_0x02dc
        L_0x0350:
            X.8nd r2 = X.C365758nd.A04
            if (r3 != r2) goto L_0x03b9
            X.8Cl r3 = r11.A02
            if (r3 == 0) goto L_0x03ad
            int r2 = r3.A09
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            int r2 = r3.A06
            java.lang.Integer r15 = java.lang.Integer.valueOf(r2)
            int r13 = r3.A07
        L_0x0366:
            r2 = r19
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r2 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r2
            X.81W r2 = r2.A0K
            int r11 = r2.getWidth()
            int r3 = r2.getHeight()
            android.content.Context r14 = r23.getApplicationContext()
            X.0qQ.A07(r14)
            if (r12 == 0) goto L_0x03b1
            if (r15 == 0) goto L_0x03b1
            int r2 = r12.intValue()
            float r12 = (float) r2
            int r2 = r15.intValue()
            float r2 = (float) r2
            float r12 = r12 / r2
            int r2 = X.AnonymousClass0Ke.A00(r14)
            int[] r2 = X.C367168qI.A01(r11, r3, r2)
            r11 = r2[r6]
            r3 = r2[r8]
            int r2 = r13 % 180
            if (r2 != 0) goto L_0x03a8
            int[] r15 = X.C367168qI.A00(r12, r11, r3)
        L_0x039e:
            r3 = r15[r6]
            r2 = r15[r8]
            android.graphics.Point r11 = new android.graphics.Point
            r11.<init>(r3, r2)
            goto L_0x0330
        L_0x03a8:
            int[] r15 = X.C367168qI.A00(r12, r3, r11)
            goto L_0x039e
        L_0x03ad:
            r12 = 0
            r15 = 0
            r13 = 0
            goto L_0x0366
        L_0x03b1:
            r2 = -1
            android.graphics.Point r11 = new android.graphics.Point
            r11.<init>(r2, r2)
            goto L_0x0330
        L_0x03b9:
            java.lang.Long[] r12 = new java.lang.Long[r9]
            java.lang.Long r2 = java.lang.Long.valueOf(r17)
            r12[r6] = r2
            goto L_0x0342
        L_0x03c2:
            java.util.List r9 = java.util.Collections.unmodifiableList(r21)
            X.0qQ.A07(r9)
            int r2 = X.0Yv.A1E(r9, r7)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            java.util.Iterator r9 = r9.iterator()
        L_0x03d6:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x03f5
            java.lang.Object r2 = r9.next()
            X.8nh r2 = (X.C365798nh) r2
            X.7zv r2 = r2.A03
            if (r2 == 0) goto L_0x03f2
            long r11 = r2.A00()
        L_0x03ea:
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            r3.add(r2)
            goto L_0x03d6
        L_0x03f2:
            r11 = 0
            goto L_0x03ea
        L_0x03f5:
            java.util.List r9 = java.util.Collections.unmodifiableList(r21)
            X.0qQ.A07(r9)
            int r2 = X.0Yv.A1E(r9, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r2)
            java.util.Iterator r13 = r9.iterator()
        L_0x0409:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x043b
            java.lang.Object r12 = r13.next()
            X.8nh r12 = (X.C365798nh) r12
            X.8nd r11 = r12.A05
            X.8nd r2 = X.C365758nd.A07
            java.lang.String r9 = ""
            if (r11 != r2) goto L_0x042a
            X.7zv r2 = r12.A03
            if (r2 == 0) goto L_0x0426
            java.lang.String r2 = r2.A0k
        L_0x0423:
            if (r2 == 0) goto L_0x0426
            r9 = r2
        L_0x0426:
            r7.add(r9)
            goto L_0x0409
        L_0x042a:
            X.8Cl r2 = r12.A02
            if (r2 == 0) goto L_0x0426
            com.instagram.common.gallery.Medium r2 = r2.A0F
            if (r2 == 0) goto L_0x0426
            java.lang.String r2 = r2.A0X
            goto L_0x0423
        L_0x0435:
            r4 = 0
            r22 = 0
            r10 = 0
            r3 = 0
            r7 = 0
        L_0x043b:
            X.8nd r2 = r29.A01()
            int r2 = r2.ordinal()
            if (r2 == r6) goto L_0x04a9
            if (r2 != r8) goto L_0x0480
            X.8nh r2 = r29.A00()
            X.7zv r2 = r2.A03
            if (r2 == 0) goto L_0x0480
            int r2 = r2.A0F
        L_0x0451:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            if (r2 == 0) goto L_0x0480
            int r27 = r2.intValue()
            X.29f r8 = r0.A0A
            java.lang.String r21 = r5.A05()
            boolean r2 = r29.A0D()
            if (r2 == 0) goto L_0x04a6
            X.8fP r17 = X.C360948fP.LAYOUT
        L_0x0469:
            r18 = 0
            com.instagram.reels.prompt.model.PromptStickerModel r2 = r5.A09
            r16 = r8
            r19 = r20
            r20 = r2
            r23 = r10
            r24 = r4
            r25 = r3
            r26 = r7
            r28 = r6
            r16.A0Z(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x0480:
            boolean r2 = r29.A0H()
            if (r2 == 0) goto L_0x0494
            X.AXc r6 = new X.AXc
            r6.<init>(r0)
            java.lang.String r4 = "remix_compose"
            java.lang.String r3 = "impression"
            java.lang.String r2 = "remix_reply_post_capture"
            X.C67000MgY.A01(r6, r1, r4, r3, r2)
        L_0x0494:
            boolean r2 = r5.A0S
            if (r2 == 0) goto L_0x00b7
            X.AXc r2 = new X.AXc
            r2.<init>(r0)
            r4 = 0
            java.lang.String r5 = "selfie_reply_compose"
            java.lang.String r6 = "impression"
            java.lang.String r7 = "selfie_reply_post_capture"
            goto L_0x00b1
        L_0x04a6:
            r17 = 0
            goto L_0x0469
        L_0x04a9:
            X.8nh r2 = r29.A00()
            X.8Cl r2 = r2.A02
            if (r2 == 0) goto L_0x0480
            int r2 = r2.A08
            goto L_0x0451
        L_0x04b4:
            X.82o r4 = r4.A02
            X.82Y r8 = r4.A01
            java.lang.String r3 = r8.A05()
            r0.A1r(r3)
            java.util.List r3 = r8.A0n
            r3.clear()
            X.80X r7 = X.AnonymousClass80X.POST_CAPTURE
            if (r2 == r7) goto L_0x04cd
            X.29f r3 = r0.A0A
            r3.A0f(r6)
        L_0x04cd:
            boolean r3 = r4.A0H()
            if (r3 == 0) goto L_0x0500
            if (r2 != r7) goto L_0x04f2
            X.AXc r4 = new X.AXc
            r4.<init>(r0)
            X.82i r3 = r8.A0h
            if (r3 == 0) goto L_0x0520
            X.1Xj r3 = r3.A04
            java.lang.String r15 = r3.getId()
        L_0x04e4:
            r11 = 0
            java.lang.String r12 = "remix_reply_back"
            java.lang.String r13 = "tap"
            java.lang.String r14 = "remix_reply_post_capture"
            r9 = r4
            r10 = r1
            r16 = r11
            X.C67000MgY.A00(r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x04f2:
            X.AXc r6 = new X.AXc
            r6.<init>(r0)
            java.lang.String r5 = "remix_compose"
            java.lang.String r4 = "impression"
            java.lang.String r3 = "remix_reply_pre_capture"
            X.C67000MgY.A01(r6, r1, r5, r4, r3)
        L_0x0500:
            boolean r3 = r8.A0S
            if (r3 == 0) goto L_0x00b7
            if (r2 != r7) goto L_0x0514
            X.AXc r5 = new X.AXc
            r5.<init>(r0)
            java.lang.String r4 = "selfie_reply_back"
            java.lang.String r3 = "tap"
            java.lang.String r2 = "selfie_reply_post_capture"
            X.C67000MgY.A01(r5, r1, r4, r3, r2)
        L_0x0514:
            X.AXc r2 = new X.AXc
            r2.<init>(r0)
            r4 = 0
            java.lang.String r5 = "selfie_reply_compose"
            java.lang.String r6 = "impression"
            goto L_0x00af
        L_0x0520:
            r15 = 0
            goto L_0x04e4
        L_0x0522:
            java.lang.String r5 = "tap"
            goto L_0x0046
        L_0x0526:
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            goto L_0x0040
        L_0x052a:
            r5 = 0
            goto L_0x0040
        L_0x052d:
            r11 = 0
            goto L_0x0032
        L_0x0530:
            r0.A0Z()
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8X4.Dmx(java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    public AnonymousClass8X4(Activity activity, UserSession userSession, C3499482o r3) {
        this.A00 = activity;
        this.A01 = userSession;
        this.A02 = r3;
    }
}
