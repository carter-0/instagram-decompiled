package X;

public final class MJ3 extends 0Yg implements C62320sa {
    public final int A00;
    public final int A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MJ3(int i, int i2, Object obj) {
        super(0);
        this.A00 = i2;
        this.A01 = i;
        this.A02 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:211:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f2, code lost:
        r2.addPointData(r1, X.AnonymousClass000.A00(r0)).addPointData("icebreaker_index_tapped", r14.A01).pointEditingCompleted();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01b1, code lost:
        if (r1 == 0) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01b8, code lost:
        if (((r3 - r1) - 1) > r14.A01) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01ba, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01bb, code lost:
        r1 = java.lang.Integer.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01c6, code lost:
        return new X.C61082JwK(r2, r1, 12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01c7, code lost:
        r1 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x0043;
                case 1: goto L_0x0005;
                case 2: goto L_0x0005;
                case 3: goto L_0x0056;
                case 4: goto L_0x0068;
                case 5: goto L_0x007d;
                case 6: goto L_0x0092;
                case 7: goto L_0x00a8;
                case 8: goto L_0x00b5;
                case 9: goto L_0x00c5;
                case 10: goto L_0x00dc;
                case 11: goto L_0x0107;
                case 12: goto L_0x011c;
                case 13: goto L_0x012c;
                case 14: goto L_0x013a;
                case 15: goto L_0x015e;
                case 16: goto L_0x0188;
                case 17: goto L_0x01c9;
                case 18: goto L_0x01e8;
                case 19: goto L_0x025f;
                case 20: goto L_0x0282;
                case 21: goto L_0x029d;
                case 22: goto L_0x02b1;
                case 23: goto L_0x02bc;
                case 24: goto L_0x02d3;
                case 25: goto L_0x02e7;
                case 26: goto L_0x0335;
                case 27: goto L_0x0371;
                case 28: goto L_0x03ab;
                case 29: goto L_0x03c0;
                case 30: goto L_0x03cd;
                case 31: goto L_0x03ee;
                case 32: goto L_0x03fb;
                case 33: goto L_0x0410;
                case 34: goto L_0x041d;
                case 35: goto L_0x0446;
                case 36: goto L_0x0453;
                case 37: goto L_0x045e;
                case 38: goto L_0x0469;
                case 39: goto L_0x047f;
                case 40: goto L_0x04a8;
                case 41: goto L_0x04bb;
                case 42: goto L_0x04c6;
                case 43: goto L_0x04d1;
                case 44: goto L_0x04dc;
                case 45: goto L_0x04e7;
                case 46: goto L_0x04f2;
                case 47: goto L_0x04fd;
                case 48: goto L_0x0572;
                case 49: goto L_0x0585;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r14.A02
            com.facebook.mqtt.service.ipc.IMqttPublishListener r2 = (com.facebook.mqtt.service.ipc.IMqttPublishListener) r2
            if (r2 == 0) goto L_0x0598
            int r1 = r14.A01
            com.facebook.mqtt.service.ipc.IMqttPublishListener$Stub$Proxy r2 = (com.facebook.mqtt.service.ipc.IMqttPublishListener.Stub.Proxy) r2
            r0 = 1125519222(0x43160f76, float:150.0604)
            int r4 = X.AnonymousClass0fD.A03(r0)
            android.os.Parcel r3 = android.os.Parcel.obtain()
            r0 = 277(0x115, float:3.88E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ all -> 0x0038 }
            r3.writeInterfaceToken(r0)     // Catch:{ all -> 0x0038 }
            r3.writeInt(r1)     // Catch:{ all -> 0x0038 }
            android.os.IBinder r2 = r2.A00     // Catch:{ all -> 0x0038 }
            r1 = 0
            r0 = 1
            r2.transact(r0, r3, r1, r0)     // Catch:{ all -> 0x0038 }
            r3.recycle()
            r0 = -537665931(0xffffffffdff3de75, float:-3.5145223E19)
            X.AnonymousClass0fD.A0A(r0, r4)
            goto L_0x0598
        L_0x0038:
            r1 = move-exception
            r3.recycle()
            r0 = -1449871879(0xffffffffa994b5f9, float:-6.6040875E-14)
            X.AnonymousClass0fD.A0A(r0, r4)
            throw r1
        L_0x0043:
            java.lang.Object r0 = r14.A02
            X.Hrg r0 = (X.C56033Hrg) r0
            X.62f r0 = r0.A03
            int r1 = r14.A01
            X.62d r0 = r0.A03
            int r0 = r0.A06(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x0056:
            java.lang.Object r2 = r14.A02
            android.view.View r2 = (android.view.View) r2
            int r0 = r2.getLayerType()
            int r1 = r14.A01
            if (r0 == r1) goto L_0x0598
            r0 = 0
            r2.setLayerType(r1, r0)
            goto L_0x0598
        L_0x0068:
            int r3 = r14.A01
            java.lang.Object[] r2 = X.AnonymousClass7TF.A1b(r3)
            java.lang.String r1 = "proxy_service"
            java.lang.String r0 = "onListeningHttpProxyPort %d"
            X.0KC.A0P(r1, r0, r2)
            java.lang.Object r0 = r14.A02
            X.SgE r0 = (X.C11768SgE) r0
            r0.A00 = r3
            goto L_0x0598
        L_0x007d:
            int r3 = r14.A01
            java.lang.Object[] r2 = X.AnonymousClass7TF.A1b(r3)
            java.lang.String r1 = "proxy_service"
            java.lang.String r0 = "onListeningSocksProxyPort %d"
            X.0KC.A0P(r1, r0, r2)
            java.lang.Object r0 = r14.A02
            X.SgE r0 = (X.C11768SgE) r0
            r0.A01 = r3
            goto L_0x0598
        L_0x0092:
            java.lang.Object r0 = r14.A02
            java.lang.String r4 = X.0KF.A00(r0)
            X.0qQ.A07(r4)
            java.lang.String r3 = "View hash: "
            java.lang.String r2 = " - size: "
            int r1 = r14.A01
            java.lang.String r0 = " (card added)"
            java.lang.String r4 = X.002.A09(r1, r3, r4, r2, r0)
            return r4
        L_0x00a8:
            java.lang.Object r0 = r14.A02
            X.Q6K r0 = (X.Q6K) r0
            android.content.res.Resources r1 = r0.A01
            int r0 = r14.A01
            java.lang.String r4 = X.AnonymousClass7TF.A0d(r1, r0)
            return r4
        L_0x00b5:
            java.lang.Object r0 = r14.A02
            X.Q6K r0 = (X.Q6K) r0
            android.content.res.Resources r1 = r0.A01
            int r0 = r14.A01
            java.lang.CharSequence r4 = r1.getText(r0)
            X.0qQ.A07(r4)
            return r4
        L_0x00c5:
            java.lang.Object r0 = r14.A02
            X.7TN r0 = (X.AnonymousClass7TN) r0
            X.1QP r3 = r0.A02
            long r1 = r0.A00
            r0 = 143(0x8f, float:2.0E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            com.facebook.quicklog.PointEditor r2 = r3.markPointWithEditor(r1, r0)
            java.lang.String r1 = "message_send_source"
            r0 = 3268(0xcc4, float:4.58E-42)
            goto L_0x00f2
        L_0x00dc:
            java.lang.Object r0 = r14.A02
            X.7TN r0 = (X.AnonymousClass7TN) r0
            X.1QP r3 = r0.A02
            long r1 = r0.A00
            r0 = 143(0x8f, float:2.0E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            com.facebook.quicklog.PointEditor r2 = r3.markPointWithEditor(r1, r0)
            java.lang.String r1 = "message_send_source"
            r0 = 5301(0x14b5, float:7.428E-42)
        L_0x00f2:
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            com.facebook.quicklog.PointEditor r2 = r2.addPointData(r1, r0)
            int r1 = r14.A01
            java.lang.String r0 = "icebreaker_index_tapped"
            com.facebook.quicklog.PointEditor r0 = r2.addPointData(r0, r1)
            r0.pointEditingCompleted()
            goto L_0x0598
        L_0x0107:
            int r1 = r14.A01
            java.lang.Object r0 = r14.A02
            X.GZn r0 = (X.C52614GZn) r0
            X.GZF r0 = r0.A00
            int r0 = r0.A03()
            boolean r0 = X.AnonymousClass7TF.A1S(r1, r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x011c:
            java.lang.Object r0 = r14.A02
            android.view.View r1 = X.JTO.A0G(r0)
            int r0 = r14.A01
            android.view.View r4 = r1.findViewById(r0)
            X.0qQ.A0A(r4)
            return r4
        L_0x012c:
            java.lang.Object r1 = r14.A02
            X.0sP r1 = (X.0sP) r1
            int r0 = r14.A01
            X.C51967G9n.A0w(r0, r1)
            java.lang.Boolean r4 = X.AnonymousClass7TE.A0v()
            return r4
        L_0x013a:
            java.lang.Object r2 = r14.A02
            androidx.compose.foundation.lazy.LazyListState r2 = (androidx.compose.foundation.lazy.LazyListState) r2
            X.6Gl r0 = r2.A02()
            X.6Gk r0 = (X.C305076Gk) r0
            java.util.List r0 = r0.A0D
            java.lang.Object r1 = X.00k.A0L(r0)
            X.6JM r1 = (X.AnonymousClass6JM) r1
            X.6Gl r0 = r2.A02()
            X.6Gk r0 = (X.C305076Gk) r0
            int r3 = r0.A06
            r2 = 0
            if (r3 == 0) goto L_0x01c7
            if (r1 == 0) goto L_0x01c7
            X.6JK r1 = (X.AnonymousClass6JK) r1
            int r1 = r1.A07
            goto L_0x01b1
        L_0x015e:
            java.lang.Object r0 = r14.A02
            androidx.compose.foundation.lazy.grid.LazyGridState r0 = (androidx.compose.foundation.lazy.grid.LazyGridState) r0
            X.5Oz r2 = r0.A0H
            java.lang.Object r0 = r2.getValue()
            X.JL7 r0 = (X.JL7) r0
            X.IGW r0 = (X.IGW) r0
            java.util.List r0 = r0.A0C
            java.lang.Object r1 = X.00k.A0L(r0)
            X.MW2 r1 = (X.MW2) r1
            java.lang.Object r0 = r2.getValue()
            X.JL7 r0 = (X.JL7) r0
            X.IGW r0 = (X.IGW) r0
            int r3 = r0.A06
            r2 = 0
            if (r3 == 0) goto L_0x01c7
            if (r1 == 0) goto L_0x01c7
            X.IFG r1 = (X.IFG) r1
            int r1 = r1.A08
            goto L_0x01b1
        L_0x0188:
            java.lang.Object r0 = r14.A02
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r0 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState) r0
            X.5Oz r2 = r0.A0G
            java.lang.Object r0 = r2.getValue()
            X.JLE r0 = (X.JLE) r0
            X.IGX r0 = (X.IGX) r0
            java.util.List r0 = r0.A0D
            java.lang.Object r1 = X.00k.A0L(r0)
            X.JLD r1 = (X.JLD) r1
            java.lang.Object r0 = r2.getValue()
            X.JLE r0 = (X.JLE) r0
            X.IGX r0 = (X.IGX) r0
            int r3 = r0.A06
            r2 = 0
            if (r3 == 0) goto L_0x01c7
            if (r1 == 0) goto L_0x01c7
            X.IFH r1 = (X.IFH) r1
            int r1 = r1.A07
        L_0x01b1:
            if (r1 == 0) goto L_0x01c7
            int r3 = r3 - r1
            r0 = 1
            int r3 = r3 - r0
            int r0 = r14.A01
            if (r3 > r0) goto L_0x01bb
            r2 = 1
        L_0x01bb:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x01bf:
            r0 = 12
            X.JwK r4 = new X.JwK
            r4.<init>((boolean) r2, (java.lang.Integer) r1, (int) r0)
            return r4
        L_0x01c7:
            r1 = 0
            goto L_0x01bf
        L_0x01c9:
            java.lang.Object r1 = r14.A02
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r1 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r1
            int r0 = r14.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A0D(r1, r0)
            r0 = -1
            r1.A01 = r0
            X.Jfo r1 = r1.A0h
            if (r1 != 0) goto L_0x01e3
            java.lang.String r0 = "stackedTimelineViewModel"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01e3:
            r0 = 0
            r1.A06 = r0
            goto L_0x0598
        L_0x01e8:
            java.lang.Object r5 = r14.A02
            X.KMS r5 = (X.KMS) r5
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineVideoTrackController$scrollingLinearLayoutManager$1 r0 = r5.A0E
            r6 = 0
            r0.A01 = r6
            X.Jfo r2 = r5.A0K
            int r1 = r14.A01
            r4 = 1
            int r0 = r1 + -1
            int r0 = r0 / 2
            int r8 = r0 + -1
            X.861 r3 = r2.A0K
            if (r1 <= 0) goto L_0x0233
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r2.A0E
            boolean r0 = r1.A0s()
            if (r0 == 0) goto L_0x0223
            X.0sn r1 = X.0sn.A00
            X.831 r0 = new X.831
            r0.<init>(r1, r6)
        L_0x020f:
            r7 = 0
            if (r8 < 0) goto L_0x0237
            r2 = 0
        L_0x0213:
            X.51M r1 = X.JTO.A0f(r0, r2)
            if (r1 == 0) goto L_0x021e
            int r1 = X.JTP.A08(r1)
            int r7 = r7 + r1
        L_0x021e:
            if (r2 == r8) goto L_0x0237
            int r2 = r2 + 1
            goto L_0x0213
        L_0x0223:
            X.2gB r0 = r1.A0G
            java.lang.Object r0 = r0.A02()
            if (r0 == 0) goto L_0x022e
            X.831 r0 = (X.AnonymousClass831) r0
            goto L_0x020f
        L_0x022e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0233:
            r2 = 750(0x2ee, float:1.051E-42)
            r1 = 0
            goto L_0x0243
        L_0x0237:
            int r0 = r7 + -250
            int r0 = r0 + -500
            int r1 = java.lang.Math.max(r6, r0)
            int r0 = r7 + 250
            int r2 = r0 + 500
        L_0x0243:
            r3.A05()
            X.2Fj r0 = r3.A0C
            X.JTP.A19(r0, r6)
            r3.A08(r1, r2)
            X.2Fj r0 = r3.A08
            X.JTP.A1B(r0, r6)
            r3.A02()
            X.2Fj r0 = r3.A05
            X.JTP.A1B(r0, r4)
            r5.A02 = r4
            goto L_0x0598
        L_0x025f:
            java.lang.Object r3 = r14.A02
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            int r2 = r14.A01
            X.3kE r1 = r3.A0W(r2)
            boolean r0 = r1 instanceof X.C60691Jpc
            if (r0 == 0) goto L_0x0276
            X.Jpc r1 = (X.C60691Jpc) r1
            if (r1 == 0) goto L_0x0276
            X.Juv r0 = r1.A01
            X.C60691Jpc.A00(r0, r1)
        L_0x0276:
            com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView r1 = X.LTA.A01(r3, r2)
            if (r1 == 0) goto L_0x0598
            r0 = 0
            r1.setActivated(r0)
            goto L_0x0598
        L_0x0282:
            java.lang.Object r1 = r14.A02
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            int r0 = r14.A01
            com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView r1 = X.LTA.A01(r1, r0)
            if (r1 == 0) goto L_0x0598
            r0 = 0
            r1.setActivated(r0)
            r1.setShowTrimmer(r0)
            r1.setShowSeekbar(r0)
            r1.A03(r0, r0, r0)
            goto L_0x0598
        L_0x029d:
            java.lang.Object r0 = r14.A02
            X.Lga r0 = (X.C64704Lga) r0
            int r3 = r14.A01
            X.8RF r2 = r0.A06
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            X.KM6 r0 = new X.KM6
            r0.<init>(r3, r1)
            r2.A0G(r0)
            goto L_0x0598
        L_0x02b1:
            java.lang.Object r1 = r14.A02
            X.0sP r1 = (X.0sP) r1
            int r0 = r14.A01
            X.C51967G9n.A0w(r0, r1)
            goto L_0x0598
        L_0x02bc:
            java.lang.Object r0 = r14.A02
            X.3kE r0 = (X.C249703kE) r0
            android.content.Context r5 = X.JTQ.A06(r0)
            int r7 = r14.A01
            r6 = 0
            r8 = 0
            r12 = -1
            X.GIH r4 = new X.GIH
            r9 = r8
            r10 = r8
            r11 = r8
            r13 = r8
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r4
        L_0x02d3:
            java.lang.Object r0 = r14.A02
            X.EIn r0 = (X.C47816EIn) r0
            com.instagram.model.direct.DirectAddToSpotlightShareTarget r1 = com.instagram.model.direct.DirectAddToSpotlightShareTarget.A00
            int r5 = r14.A01
            r2 = 0
            r3 = r2
            r4 = r2
            boolean r0 = r0.A0J(r1, r2, r3, r4, r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x02e7:
            int r6 = r14.A01
            java.lang.String r3 = "tap_gallery_send"
            java.lang.Object r5 = r14.A02
            X.OYk r5 = (X.C71012OYk) r5
            java.lang.Long r0 = r5.A00
            if (r0 == 0) goto L_0x0318
            long r1 = r0.longValue()
            com.facebook.quicklog.reliability.UserFlowLogger r4 = r5.A03
            com.facebook.quicklog.PointEditor r3 = r4.markPointWithEditor(r1, r3)
            r0 = 1175(0x497, float:1.647E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            com.facebook.quicklog.PointEditor r0 = r3.addPointData(r0, r6)
            r0.markerEditingCompleted()
            r4.flowEndSuccess(r1)
            r0 = 0
            r5.A00 = r0
            r0 = 0
            r5.A02 = r0
            r0 = 1
            r5.A01 = r0
            goto L_0x0598
        L_0x0318:
            X.0wj r2 = X.0wj.A01
            r1 = 817899801(0x30c02919, float:1.3981519E-9)
            r0 = 353(0x161, float:4.95E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0f9 r1 = r2.AEf(r0, r1)
            r0 = 349(0x15d, float:4.89E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r1.ABQ(r0, r3)
            r1.report()
            goto L_0x0598
        L_0x0335:
            java.lang.Object r3 = r14.A02
            X.P2h r3 = (X.C72342P2h) r3
            com.instagram.common.session.UserSession r2 = r3.A03
            X.0iw r1 = r3.A02
            int r5 = r14.A01
            X.N4P r0 = r3.A04
            boolean r4 = r0.A0n
            java.lang.Integer r3 = r3.A05
            X.0wc r1 = X.AnonymousClass0kN.A01(r1, r2)
            java.lang.String r0 = "direct_thread_move"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.Long r1 = X.DbS.A0j(r5)
            java.lang.String r0 = "folder"
            r2.A9F(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            java.lang.String r0 = "is_interop"
            r2.A7p(r0, r1)
            if (r3 == 0) goto L_0x036c
            java.lang.Long r1 = X.C51969G9p.A0r(r3)
            java.lang.String r0 = "position"
            r2.A9F(r0, r1)
        L_0x036c:
            r2.Cgf()
            goto L_0x0598
        L_0x0371:
            java.lang.Object r2 = r14.A02
            androidx.compose.foundation.lazy.LazyListState r2 = (androidx.compose.foundation.lazy.LazyListState) r2
            X.6Gl r0 = r2.A02()
            X.6Gk r0 = (X.C305076Gk) r0
            java.util.List r0 = r0.A0D
            java.lang.Object r1 = X.00k.A0L(r0)
            X.6JM r1 = (X.AnonymousClass6JM) r1
            X.6Gl r0 = r2.A02()
            X.6Gk r0 = (X.C305076Gk) r0
            int r3 = r0.A06
            r2 = 1
            if (r3 == 0) goto L_0x03a9
            if (r1 == 0) goto L_0x03a9
            X.6JK r1 = (X.AnonymousClass6JK) r1
            int r1 = r1.A07
            if (r1 == 0) goto L_0x03a9
            int r3 = r3 - r1
            int r3 = r3 - r2
            int r0 = r14.A01
            if (r3 <= r0) goto L_0x039d
            r2 = 0
        L_0x039d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x03a1:
            r0 = 23
            X.JwK r4 = new X.JwK
            r4.<init>((boolean) r2, (java.lang.Integer) r1, (int) r0)
            return r4
        L_0x03a9:
            r1 = 0
            goto L_0x03a1
        L_0x03ab:
            java.lang.Object r0 = r14.A02
            X.Mdr r0 = (X.C66858Mdr) r0
            android.content.Context r1 = r0.A00
            int r0 = r14.A01
            android.graphics.drawable.Drawable r4 = r1.getDrawable(r0)
            if (r4 != 0) goto L_0x059a
            java.lang.String r0 = "Failed to get video call icon drawable"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x03c0:
            java.lang.Object r0 = r14.A02
            X.Mdq r0 = (X.C66857Mdq) r0
            android.content.Context r1 = r0.A00
            int r0 = r14.A01
            java.lang.String r4 = r1.getString(r0)
            return r4
        L_0x03cd:
            java.lang.Object r5 = r14.A02
            X.GvW r5 = (X.C53865GvW) r5
            X.HiZ r0 = r5.A02
            int r4 = r14.A01
            java.util.HashMap r1 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Object r3 = r1.get(r0)
            X.IUL r3 = (X.IUL) r3
            if (r3 == 0) goto L_0x0598
            X.4Fy r2 = r5.A00
            X.3TA r1 = r5.A03
            X.4Fw r0 = r5.A01
            r2.A04(r0, r1, r3, r4)
            goto L_0x0598
        L_0x03ee:
            java.lang.Object r2 = r14.A02
            com.instagram.igds.components.button.IgdsButton r2 = (com.instagram.igds.components.button.IgdsButton) r2
            int r1 = r14.A01
            X.4lx r0 = X.C273084lx.END
            r2.A02(r0, r1)
            goto L_0x0598
        L_0x03fb:
            java.lang.Object r1 = r14.A02
            X.Jpd r1 = (X.C60692Jpd) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.0eM r0 = r1.A09
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            if (r1 == 0) goto L_0x04b9
            int r0 = r14.A01
            android.view.View r4 = r1.requireViewById(r0)
            return r4
        L_0x0410:
            java.lang.Object r0 = r14.A02
            android.view.View r1 = X.JTO.A0G(r0)
            int r0 = r14.A01
            android.view.View r4 = r1.requireViewById(r0)
            return r4
        L_0x041d:
            java.lang.Object r2 = r14.A02
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            int r1 = r14.A01
            com.facebook.pando.TreeJNI r0 = com.facebook.pando.TreeJNI.$redex_init_class
            com.google.common.collect.ImmutableList r0 = r2.getDoubleListByHashCode(r1)
            if (r0 == 0) goto L_0x04b9
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0433:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x059a
            java.lang.Object r0 = r3.next()
            double r1 = X.JTO.A00(r0)
            float r0 = (float) r1
            X.JTP.A1V(r4, r0)
            goto L_0x0433
        L_0x0446:
            java.lang.Object r2 = r14.A02
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            int r1 = r14.A01
            com.facebook.pando.TreeJNI r0 = com.facebook.pando.TreeJNI.$redex_init_class
            java.lang.Boolean r4 = r2.getOptionalBooleanValueByHashCode(r1)
            return r4
        L_0x0453:
            java.lang.Object r1 = r14.A02
            com.instagram.pando.livetree.LiveTreeJNI r1 = (com.instagram.pando.livetree.LiveTreeJNI) r1
            int r0 = r14.A01
            java.lang.Boolean r4 = r1.getOptionalBooleanValueNative(r0)
            return r4
        L_0x045e:
            java.lang.Object r1 = r14.A02
            com.instagram.pando.livetree.LiveTreeJNI r1 = (com.instagram.pando.livetree.LiveTreeJNI) r1
            int r0 = r14.A01
            java.lang.Double r4 = r1.getOptionalDoubleValueNative(r0)
            return r4
        L_0x0469:
            java.lang.Object r1 = r14.A02
            com.instagram.pando.livetree.LiveTreeJNI r1 = (com.instagram.pando.livetree.LiveTreeJNI) r1
            int r0 = r14.A01
            java.lang.Double r0 = r1.getOptionalDoubleValueNative(r0)
            if (r0 == 0) goto L_0x04b9
            double r1 = r0.doubleValue()
            float r0 = (float) r1
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            return r4
        L_0x047f:
            java.lang.Object r1 = r14.A02
            com.instagram.pando.livetree.LiveTreeJNI r1 = (com.instagram.pando.livetree.LiveTreeJNI) r1
            int r0 = r14.A01
            java.lang.Object r1 = r1.getOptionalUntypedIDFieldNative(r0)
            boolean r0 = r1 instanceof java.util.List
            r4 = 0
            if (r0 == 0) goto L_0x059a
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x059a
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x049a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x059a
            java.lang.Object r0 = r1.next()
            X.DbU.A1X(r0, r4)
            goto L_0x049a
        L_0x04a8:
            java.lang.Object r1 = r14.A02
            com.instagram.pando.livetree.LiveTreeJNI r1 = (com.instagram.pando.livetree.LiveTreeJNI) r1
            int r0 = r14.A01
            java.lang.Object r0 = r1.getOptionalUntypedIDFieldNative(r0)
            if (r0 == 0) goto L_0x04b9
            java.lang.String r4 = r0.toString()
            return r4
        L_0x04b9:
            r4 = 0
            return r4
        L_0x04bb:
            java.lang.Object r1 = r14.A02
            com.instagram.pando.livetree.LiveTreeJNI r1 = (com.instagram.pando.livetree.LiveTreeJNI) r1
            int r0 = r14.A01
            java.util.List r4 = r1.getOptionalIntListNative(r0)
            return r4
        L_0x04c6:
            java.lang.Object r1 = r14.A02
            com.instagram.pando.livetree.LiveTreeJNI r1 = (com.instagram.pando.livetree.LiveTreeJNI) r1
            int r0 = r14.A01
            java.lang.Integer r4 = r1.getOptionalIntValueNative(r0)
            return r4
        L_0x04d1:
            java.lang.Object r1 = r14.A02
            com.instagram.pando.livetree.LiveTreeJNI r1 = (com.instagram.pando.livetree.LiveTreeJNI) r1
            int r0 = r14.A01
            java.util.List r4 = r1.getOptionalLongListNative(r0)
            return r4
        L_0x04dc:
            java.lang.Object r1 = r14.A02
            com.instagram.pando.livetree.LiveTreeJNI r1 = (com.instagram.pando.livetree.LiveTreeJNI) r1
            int r0 = r14.A01
            java.lang.Long r4 = r1.getOptionalLongValueNative(r0)
            return r4
        L_0x04e7:
            java.lang.Object r1 = r14.A02
            com.instagram.pando.livetree.LiveTreeJNI r1 = (com.instagram.pando.livetree.LiveTreeJNI) r1
            int r0 = r14.A01
            java.util.List r4 = r1.getOptionalStringListNative(r0)
            return r4
        L_0x04f2:
            java.lang.Object r1 = r14.A02
            com.instagram.pando.livetree.LiveTreeJNI r1 = (com.instagram.pando.livetree.LiveTreeJNI) r1
            int r0 = r14.A01
            java.lang.String r4 = r1.getOptionalStringValueNative(r0)
            return r4
        L_0x04fd:
            java.lang.Object r5 = r14.A02
            com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel r5 = (com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel) r5
            int r8 = r14.A01
            X.05G r0 = r5.A0G
            java.lang.Object r0 = r0.getValue()
            X.JwK r0 = (X.C61082JwK) r0
            java.lang.Object r0 = r0.A00
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r0.iterator()
        L_0x0517:
            boolean r0 = r4.hasNext()
            r7 = 0
            if (r0 == 0) goto L_0x0560
            java.lang.Object r3 = r4.next()
            X.0Ud r0 = r5.A0H
            java.lang.Object r0 = r0.getValue()
            X.Drs r0 = (X.C47177Drs) r0
            java.util.List r0 = r0.A01
            java.util.Iterator r1 = r0.iterator()
        L_0x0530:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x055e
            java.lang.Object r2 = r1.next()
            r0 = r2
            X.L9x r0 = (X.C63868L9x) r0
            java.lang.String r0 = r0.A04
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 == 0) goto L_0x0530
        L_0x0545:
            X.L9x r2 = (X.C63868L9x) r2
            if (r2 == 0) goto L_0x0517
            com.instagram.model.mediasize.ImageInfo r1 = r2.A02
            if (r1 == 0) goto L_0x0559
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            com.instagram.model.mediasize.ExtendedImageUrl r0 = X.1iI.A05(r1, r0, r8)
            if (r0 == 0) goto L_0x0559
        L_0x0555:
            r6.add(r0)
            goto L_0x0517
        L_0x0559:
            com.instagram.common.typedurl.ImageUrl r0 = r2.A01
            if (r0 == 0) goto L_0x0517
            goto L_0x0555
        L_0x055e:
            r2 = r7
            goto L_0x0545
        L_0x0560:
            com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel.A02(r5)
            X.6oS r0 = X.C318116oQ.A00(r5)
            r9 = 20
            X.JTZ r4 = new X.JTZ
            r4.<init>(r5, r6, r7, r8, r9)
            X.AnonymousClass7TE.A1Z(r4, r0)
            goto L_0x0598
        L_0x0572:
            java.lang.Object r1 = r14.A02
            android.content.Context r1 = (android.content.Context) r1
            int r0 = r14.A01
            android.graphics.drawable.Drawable r4 = r1.getDrawable(r0)
            if (r4 != 0) goto L_0x059a
            java.lang.String r0 = "Failed to get drawable"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0585:
            java.lang.Object r0 = r14.A02
            X.Ner r0 = (X.C69112Ner) r0
            X.0eM r0 = r0.A0U
            java.lang.Object r3 = r0.getValue()
            X.8DM r3 = (X.AnonymousClass8DM) r3
            int r2 = r14.A01
            r1 = 1
            r0 = 0
            r3.ELA(r0, r2, r1)
        L_0x0598:
            X.0gF r4 = X.C60340gF.A00
        L_0x059a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MJ3.invoke():java.lang.Object");
    }
}
