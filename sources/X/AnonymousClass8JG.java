package X;

/* renamed from: X.8JG  reason: invalid class name */
public final class AnonymousClass8JG implements AnonymousClass2gO {
    public final /* synthetic */ C353498Hw A00;

    public AnonymousClass8JG(C353498Hw r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0261  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onChanged(java.lang.Object r28) {
        /*
            r27 = this;
            r11 = r28
            X.8fx r11 = (X.C361278fx) r11
            r2 = 0
            X.0qQ.A0B(r11, r2)
            int r1 = r11.A00
            r3 = r27
            if (r1 == 0) goto L_0x0287
            r0 = 1
            if (r1 == r0) goto L_0x0292
            r0 = 3
            if (r1 == r0) goto L_0x0059
            r0 = 4
            if (r1 != r0) goto L_0x0058
            X.8Hw r4 = r3.A00
            X.85M r0 = r4.A1d
            r0.A00()
            X.8A2 r1 = r4.A1h
            X.50r r3 = r4.A1t
            java.lang.String r6 = "stitch video failed"
            X.50r r0 = X.C2801950r.CLIPS
            if (r3 != r0) goto L_0x003c
            java.util.concurrent.atomic.AtomicLong r2 = r1.A0F
            X.29E r5 = r1.A0K
            long r9 = r2.get()
            r8 = 838607486(0x31fc227e, float:7.3380866E-9)
            java.lang.String r7 = ""
            long r0 = r5.A07(r6, r7, r8, r9)
            r2.set(r0)
        L_0x003c:
            com.instagram.common.session.UserSession r0 = r4.A1D
            X.27r r0 = X.27p.A01(r0)
            X.29L r1 = r0.A0J
            r0 = 0
            r1.A07(r3, r6, r0, r0)
            android.content.Context r3 = r4.A11
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            r0 = 936(0x3a8, float:1.312E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 2131955553(0x7f130f61, float:1.9547637E38)
            X.C64169LRs.A02(r3, r2, r1, r0)
        L_0x0058:
            return
        L_0x0059:
            X.8Hw r1 = r3.A00
            androidx.fragment.app.FragmentActivity r10 = r1.A15
            X.8Ia r0 = r1.A0D
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r9 = r1.A1n
            X.2Fk r8 = r9.A0C
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            X.831 r3 = r1.A0J
            java.util.List r3 = r3.A01
            int r7 = r3.size()
            r6 = 0
        L_0x0071:
            r16 = 0
            if (r6 >= r7) goto L_0x0093
            X.831 r3 = r1.A0J
            X.51O r4 = r3.A04(r6)
            X.51N r4 = (X.AnonymousClass51N) r4
            boolean r3 = r4 instanceof X.AnonymousClass51M
            if (r3 == 0) goto L_0x0090
            X.51M r4 = (X.AnonymousClass51M) r4
            X.51S r3 = r4.A0E
            java.util.List r3 = r3.A02
            if (r3 == 0) goto L_0x0090
            java.util.List r3 = X.00k.A0X(r3)
            r5.addAll(r3)
        L_0x0090:
            int r6 = r6 + 1
            goto L_0x0071
        L_0x0093:
            java.util.ArrayList r20 = X.C353498Hw.A0B(r1)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r12 = r5.iterator()
        L_0x00a5:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x00e1
            java.lang.Object r4 = r12.next()
            com.instagram.camera.effect.models.CameraAREffect r4 = (com.instagram.camera.effect.models.CameraAREffect) r4
            if (r4 == 0) goto L_0x00d7
            java.lang.String r3 = r4.A0M
            X.0qQ.A07(r3)
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x00d7
            java.lang.String r3 = r4.A0K
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            X.0qQ.A07(r3)
            r7.add(r3)
            java.lang.String r3 = r4.A0M
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            X.0qQ.A07(r3)
            r6.add(r3)
            goto L_0x00a5
        L_0x00d7:
            java.lang.String r5 = "ClipsCaptureControllerImpl"
            java.lang.String r4 = "Fail to get effect package id"
            r3 = r16
            X.0kD.A07(r5, r4, r3)
            goto L_0x00a5
        L_0x00e1:
            com.instagram.common.session.UserSession r5 = r1.A1D
            X.27r r3 = X.27p.A01(r5)
            X.29f r3 = r3.A0A
            r17 = r3
            X.831 r3 = r1.A0J
            java.util.List r3 = r3.A01
            int r23 = r3.size()
            int r3 = X.C353498Hw.A00(r1)
            int r3 = r3 / 1000
            long r14 = (long) r3
            X.831 r3 = r1.A0J
            int r3 = r3.A00
            double r12 = (double) r3
            X.50r r4 = r1.A1t
            X.50r r3 = X.C2801950r.FEED_POST
            r26 = 0
            if (r4 != r3) goto L_0x0109
            r26 = 1
        L_0x0109:
            r18 = r7
            r19 = r6
            r21 = r12
            r24 = r14
            r17.A0d(r18, r19, r20, r21, r23, r24, r26)
            X.2YN r4 = new X.2YN
            r4.<init>(r10)
            java.lang.Class<X.860> r3 = X.AnonymousClass860.class
            X.2YL r4 = r4.A00(r3)
            X.860 r4 = (X.AnonymousClass860) r4
            java.lang.String r3 = "post_capture"
            X.861 r6 = r4.A00(r3)
            r6.A09(r8)
            X.2Fj r3 = r9.A0I
            java.lang.Object r8 = r3.A02()
            X.8pU r8 = (X.C366678pU) r8
            java.lang.Object r4 = r11.A00()
            X.7zv r4 = (X.C349307zv) r4
            boolean r3 = r0 instanceof X.C366388oq
            if (r3 == 0) goto L_0x0224
            r3 = r0
            X.8oq r3 = (X.C366388oq) r3
            boolean r3 = r3.A00
            if (r3 == 0) goto L_0x0240
            int r7 = r6.A00()
        L_0x0147:
            r4.A0G = r7
        L_0x0149:
            X.83H r3 = r9.A0L
            X.8J0 r10 = r3.A00
            X.831 r3 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.A00(r9)
            int r7 = r3.A00
            java.lang.Integer r6 = r9.A0I(r2)
            android.content.Context r3 = r1.A11
            X.C52345GOp.A08(r3, r10, r5, r6, r7)
            X.8Ht r5 = r1.A1Q
            boolean r3 = r1.A0a
            if (r3 == 0) goto L_0x0220
            r10 = 0
        L_0x0163:
            X.80R r6 = r5.A00
            X.8QA r3 = r6.A0a
            if (r3 == 0) goto L_0x018f
            X.8VZ r7 = r6.A14
            if (r7 == 0) goto L_0x018f
            X.82p r5 = r6.A0o
            X.82o r13 = r5.A02
            boolean r5 = r4.A18
            if (r5 == 0) goto L_0x021c
            java.lang.Integer r5 = X.AnonymousClass05K.A01
        L_0x0177:
            r13.A08(r5)
            if (r8 == 0) goto L_0x01a0
            X.8nh r5 = new X.8nh
            r5.<init>((X.C349307zv) r4)
            X.8pU r5 = r3.A06(r8, r5)
        L_0x0185:
            java.lang.String r6 = r4.A07()
        L_0x0189:
            r3.A0C(r5, r6)
        L_0x018c:
            r7.A01(r0, r4, r2)
        L_0x018f:
            r0 = 1
            r1.A0a = r0
            X.8WX r0 = r1.A0B
            if (r0 == 0) goto L_0x0058
            X.8XA r0 = r0.A00()
            if (r0 == 0) goto L_0x0058
            r0.A0Q()
            return
        L_0x01a0:
            if (r10 == 0) goto L_0x018c
            boolean r5 = r13.A0A()
            if (r5 == 0) goto L_0x01fb
            X.7zy r15 = r3.A08()
            X.8nh r9 = new X.8nh
            r9.<init>((X.C349307zv) r4)
            X.8vh r8 = r10.A0C
            java.util.List r5 = r10.A0s
            r22 = 1
            r17 = r3
            r18 = r8
            r19 = r9
            r20 = r16
            r21 = r5
            X.34S r5 = r17.A03(r18, r19, r20, r21, r22)
            java.lang.Object r5 = r5.A00
            r5.getClass()
            X.8pU r5 = (X.C366678pU) r5
            X.8pR r8 = r5.A01
            X.8pN r14 = r8.A04
            android.app.Activity r10 = r6.A09
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r8 = r6.A0i
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r8 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r8
            X.81W r8 = r8.A0K
            int r18 = r8.getWidth()
            int r19 = r8.getHeight()
            com.instagram.common.session.UserSession r11 = r6.A0R
            X.8Yz r8 = r6.A0W
            X.80m r8 = r8.A08
            java.lang.Object r12 = r8.A00
            X.4yO r12 = (X.C279284yO) r12
            X.81T r6 = r6.A11
            java.lang.String r17 = r6.getModuleName()
            X.8pR r6 = r15.A00
            X.8pN r6 = r6.A04
            X.C366608pN.A02(r14, r6)
            X.C366608pN.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0185
        L_0x01fb:
            X.8nh r8 = new X.8nh
            r8.<init>((X.C349307zv) r4)
            X.8vh r6 = r10.A0C
            java.util.List r5 = r10.A0s
            r14 = 1
            r9 = r3
            r10 = r6
            r11 = r8
            r12 = r16
            r13 = r5
            X.34S r5 = r9.A03(r10, r11, r12, r13, r14)
            java.lang.String r6 = r4.A07()
            java.lang.Object r5 = r5.A00
            r5.getClass()
            X.8pU r5 = (X.C366678pU) r5
            goto L_0x0189
        L_0x021c:
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            goto L_0x0177
        L_0x0220:
            X.5kq r10 = r1.A0H
            goto L_0x0163
        L_0x0224:
            boolean r3 = r0 instanceof X.C379279Tf
            if (r3 != 0) goto L_0x0240
            boolean r3 = r0 instanceof X.C366378op
            if (r3 == 0) goto L_0x0149
            int r7 = r6.A00()
            r3 = r0
            X.8op r3 = (X.C366378op) r3
            boolean r3 = r3.A00
            if (r3 != 0) goto L_0x0147
            X.831 r3 = r1.A0J
            int r3 = r3.A00
            if (r7 <= r3) goto L_0x0147
            r7 = 0
            goto L_0x0147
        L_0x0240:
            java.lang.Integer r3 = X.C353498Hw.A09(r1)
            if (r3 == 0) goto L_0x0261
            int r7 = r3.intValue()
            X.831 r3 = r1.A0J
            java.util.List r6 = r3.A01
            int r3 = r6.size()
            int r3 = r3 + -1
            if (r7 <= r3) goto L_0x0257
            r7 = r3
        L_0x0257:
            java.lang.Object r3 = r6.get(r7)
            X.9IM r3 = (X.AnonymousClass9IM) r3
            int r7 = r3.A00
            goto L_0x0147
        L_0x0261:
            X.831 r3 = r1.A0J
            java.util.List r3 = r3.A01
            int r3 = r3.size()
            r7 = 0
            r10 = 1
            if (r3 <= r10) goto L_0x0147
            X.831 r6 = r1.A0J
            java.util.List r3 = r6.A01
            int r3 = r3.size()
            int r3 = r3 - r10
            X.51O r3 = r6.A04(r3)
            if (r3 == 0) goto L_0x0147
            int r6 = r3.BrP()
            X.831 r3 = r1.A0J
            int r7 = r3.A00
            int r7 = r7 - r6
            goto L_0x0147
        L_0x0287:
            X.8Hw r1 = r3.A00
            boolean r0 = r1.CKX()
            if (r0 == 0) goto L_0x0058
            X.85M r0 = r1.A1d
            goto L_0x0296
        L_0x0292:
            X.8Hw r0 = r3.A00
            X.85M r0 = r0.A1d
        L_0x0296:
            r0.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8JG.onChanged(java.lang.Object):void");
    }
}
