package X;

/* renamed from: X.8S6  reason: invalid class name */
public final class AnonymousClass8S6 implements C3493580b {
    public final /* synthetic */ AnonymousClass8S5 A00;

    public AnonymousClass8S6(AnonymousClass8S5 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void Dmx(java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            r10 = this;
            X.80V r11 = (X.AnonymousClass80V) r11
            X.80V r12 = (X.AnonymousClass80V) r12
            r8 = 0
            X.0qQ.A0B(r11, r8)
            r6 = 1
            r9 = 2
            X.0qQ.A0B(r12, r6)
            X.0qQ.A0B(r13, r9)
            X.8S5 r4 = r10.A00
            X.80U r5 = r4.A0Z
            boolean r0 = r5.CZe()
            java.lang.String r7 = "Required value was null."
            if (r0 == 0) goto L_0x002b
            boolean r0 = r13 instanceof X.AnonymousClass8ZU
            if (r0 == 0) goto L_0x0103
            X.1Wr r2 = X.1Wr.A00
            if (r2 == 0) goto L_0x01eb
            com.instagram.common.session.UserSession r1 = r4.A09
            X.4cM r0 = r4.A0h
            r2.removeLocationUpdates(r1, r0)
        L_0x002b:
            int r0 = r11.ordinal()
            if (r0 != r9) goto L_0x0036
            X.84j r0 = r4.A0Q
            r0.A07(r6)
        L_0x0036:
            int r1 = r12.ordinal()
            if (r1 == r9) goto L_0x0187
            if (r1 == r8) goto L_0x0161
            r0 = 45
            if (r1 == r0) goto L_0x0181
            r0 = 11
            if (r1 == r0) goto L_0x008e
            r0 = 7
            if (r1 != r0) goto L_0x008d
            boolean r0 = r13 instanceof X.AnonymousClass8SQ
            if (r0 == 0) goto L_0x008d
            boolean r0 = r5.CZU()
            if (r0 == 0) goto L_0x008d
            java.util.List r3 = X.C365788ng.A00(r13)
            X.82p r0 = r4.A0M
            X.82o r2 = r0.A02
            X.8nd r1 = r2.A01()
            X.8nd r0 = X.C365758nd.A04
            if (r1 != r0) goto L_0x0116
            X.8K4 r1 = r4.A0G
            X.AnonymousClass8K4.A06(r1)
            X.0eM r0 = r1.A0k
            java.lang.Object r0 = r0.getValue()
            X.2nK r0 = (X.C229402nK) r0
            r0.onPause()
            X.AnonymousClass8K4.A07(r1)
            java.lang.Object r0 = r3.get(r8)
            X.8nh r0 = (X.C365798nh) r0
            r2.A07(r0)
            java.lang.Object r0 = r3.get(r8)
            X.8nh r0 = (X.C365798nh) r0
            X.7zv r0 = r0.A03
            X.AnonymousClass8S5.A01(r4, r0)
            X.AnonymousClass8S5.A03(r4, r6)
        L_0x008d:
            return
        L_0x008e:
            boolean r0 = r13 instanceof X.C356718Uy
            if (r0 != 0) goto L_0x00b7
            X.87h r1 = r4.A0c
            X.8Jc r0 = r1.A00()
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L_0x00b7
            boolean r0 = r13 instanceof X.AnonymousClass8SN
            if (r0 != 0) goto L_0x01b5
            boolean r0 = r13 instanceof X.AnonymousClass8SO
            if (r0 != 0) goto L_0x013e
            boolean r0 = r13 instanceof X.AnonymousClass8SP
            if (r0 != 0) goto L_0x013e
            X.8Jc r1 = r1.A00()
            X.Abo r0 = new X.Abo
            r0.<init>(r4)
            r1.A0M(r0)
            return
        L_0x00b7:
            boolean r3 = r13 instanceof X.AnonymousClass8SN
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r4.A0b
            X.2gB r0 = r0.A0G
            java.lang.Object r1 = r0.A02()
            X.831 r1 = (X.AnonymousClass831) r1
            if (r1 == 0) goto L_0x00d0
            java.util.List r0 = r1.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00d0
            r1.A03(r8)
        L_0x00d0:
            boolean r2 = r13 instanceof X.AnonymousClass8SO
            if (r2 == 0) goto L_0x0140
            boolean r0 = r5.CZU()
            if (r0 == 0) goto L_0x0140
            java.util.List r2 = X.C365788ng.A00(r13)
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x008d
            boolean r0 = r13 instanceof X.AnonymousClass8SP
            r1 = 0
            if (r0 == 0) goto L_0x00f3
            X.8SP r13 = (X.AnonymousClass8SP) r13
            java.util.List r1 = r13.A01
        L_0x00ef:
            X.AnonymousClass8S5.A02(r4, r2, r1, r6)
            return
        L_0x00f3:
            if (r3 == 0) goto L_0x00ef
            X.8SN r13 = (X.AnonymousClass8SN) r13
            X.802 r0 = r13.A00
            if (r0 == 0) goto L_0x00ef
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r1)
            goto L_0x00ef
        L_0x0103:
            boolean r0 = r13 instanceof X.AnonymousClass8SB
            if (r0 == 0) goto L_0x002b
            X.1Wr r3 = X.1Wr.A00
            if (r3 == 0) goto L_0x01f1
            com.instagram.common.session.UserSession r2 = r4.A09
            X.4cM r1 = r4.A0h
            java.lang.String r0 = "CaptureStateCoordinator"
            r3.requestLocationUpdates(r2, r1, r0)
            goto L_0x002b
        L_0x0116:
            java.lang.Object r0 = r3.get(r8)
            X.8nh r0 = (X.C365798nh) r0
            r2.A07(r0)
            java.lang.Object r0 = r3.get(r8)
            X.8nh r0 = (X.C365798nh) r0
            X.7zv r0 = r0.A03
            X.AnonymousClass8S5.A01(r4, r0)
            X.8LU r1 = r4.A0J
            X.82Y r0 = r2.A01
            X.7zv r0 = r0.A04()
            if (r0 == 0) goto L_0x0138
            r1.A0Q(r0, r8, r6)
            return
        L_0x0138:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x013e:
            r0 = 0
            goto L_0x01bc
        L_0x0140:
            java.util.List r4 = X.C365788ng.A00(r13)
            boolean r0 = r13 instanceof X.AnonymousClass8SP
            r1 = 0
            if (r0 == 0) goto L_0x0150
            r0 = r13
            X.8SP r0 = (X.AnonymousClass8SP) r0
            java.util.List r1 = r0.A01
            goto L_0x01d5
        L_0x0150:
            if (r3 == 0) goto L_0x01d5
            r0 = r13
            X.8SN r0 = (X.AnonymousClass8SN) r0
            X.802 r0 = r0.A00
            if (r0 == 0) goto L_0x01d5
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r1)
            goto L_0x01d5
        L_0x0161:
            X.80V r0 = X.AnonymousClass80V.MEDIA_EDIT
            if (r11 != r0) goto L_0x0181
            com.instagram.common.session.UserSession r3 = r4.A09
            X.27r r0 = X.27p.A01(r3)
            X.4yP r1 = r0.A0J()
            X.4yP r0 = X.C279294yP.CLIPS
            if (r1 != r0) goto L_0x0181
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316735922311796(0x8105e1000d1274, double:3.030188260803285E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0181
            return
        L_0x0181:
            X.8VO r3 = new X.8VO
            r3.<init>()
            goto L_0x01e0
        L_0x0187:
            boolean r2 = r13 instanceof X.AnonymousClass8SD
            boolean r0 = r13 instanceof X.AnonymousClass8SC
            r1 = 0
            if (r0 == 0) goto L_0x0194
            X.8SC r13 = (X.AnonymousClass8SC) r13
            if (r13 == 0) goto L_0x0194
            java.lang.Object r1 = r13.A00
        L_0x0194:
            boolean r0 = r1 instanceof X.C355978Sc
            if (r0 == 0) goto L_0x01a2
            X.8Sc r1 = (X.C355978Sc) r1
            X.8bo r0 = r1.A00
        L_0x019c:
            X.8VN r3 = new X.8VN
            r3.<init>(r0, r2)
            goto L_0x01e0
        L_0x01a2:
            boolean r0 = r1 instanceof X.AnonymousClass8TI
            if (r0 == 0) goto L_0x01ab
            X.Aac r0 = X.C40343Aac.A00
        L_0x01a8:
            X.8bo r0 = (X.C358998bo) r0
            goto L_0x019c
        L_0x01ab:
            boolean r0 = r1 instanceof X.AnonymousClass8TJ
            if (r0 == 0) goto L_0x01b2
            X.Aad r0 = X.C40344Aad.A00
            goto L_0x01a8
        L_0x01b2:
            X.8bn r0 = X.C358988bn.A00
            goto L_0x01a8
        L_0x01b5:
            r0 = r13
            X.8SN r0 = (X.AnonymousClass8SN) r0
            X.8Cl r0 = r0.A01
            boolean r0 = r0.A0y
        L_0x01bc:
            java.util.List r4 = X.C365788ng.A00(r13)
            X.8Jc r1 = r1.A00()
            X.ADn r0 = r1.A0J(r6, r0)
            X.802 r0 = r0.A01()
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r1)
            boolean r2 = r13 instanceof X.AnonymousClass8SO
        L_0x01d5:
            if (r2 == 0) goto L_0x01e8
            X.8SO r13 = (X.AnonymousClass8SO) r13
            X.8Ia r0 = r13.A00
        L_0x01db:
            X.8VP r3 = new X.8VP
            r3.<init>(r0, r4, r1)
        L_0x01e0:
            X.80T r5 = (X.AnonymousClass80T) r5
            X.80W r0 = r5.A02
            r0.A04(r3)
            return
        L_0x01e8:
            X.8ni r0 = X.C365808ni.A00
            goto L_0x01db
        L_0x01eb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x01f1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8S6.Dmx(java.lang.Object, java.lang.Object, java.lang.Object):void");
    }
}
