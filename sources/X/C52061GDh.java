package X;

/* renamed from: X.GDh  reason: case insensitive filesystem */
public final class C52061GDh extends 0Yg implements C62320sa {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52061GDh(C52003GBa gBa, int i, int i2, int i3) {
        super(0);
        this.A00 = i3;
        this.A03 = gBa;
        switch (i3) {
            case 4:
            case 6:
                this.A02 = i;
                this.A01 = i2;
                break;
            default:
                this.A01 = i;
                this.A02 = i2;
                break;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:31:0x0101, B:75:0x01cb] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x010f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x01cb */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[ExcHandler: 3cy | IkX (unused java.lang.Throwable), FALL_THROUGH, SYNTHETIC, Splitter:B:31:0x0101] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:71:0x01c4=Splitter:B:71:0x01c4, B:59:0x0165=Splitter:B:59:0x0165, B:35:0x0108=Splitter:B:35:0x0108, B:75:0x01cb=Splitter:B:75:0x01cb, B:39:0x010f=Splitter:B:39:0x010f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 2: goto L_0x016d;
                case 3: goto L_0x0114;
                case 4: goto L_0x00c9;
                case 5: goto L_0x00ae;
                case 6: goto L_0x01b5;
                case 7: goto L_0x0071;
                case 8: goto L_0x0040;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r12.A03
            com.facebook.mqtt.service.ipc.IMqttPublishListener r3 = (com.facebook.mqtt.service.ipc.IMqttPublishListener) r3
            if (r3 == 0) goto L_0x01d8
            int r2 = r12.A02
            int r1 = r12.A01
            com.facebook.mqtt.service.ipc.IMqttPublishListener$Stub$Proxy r3 = (com.facebook.mqtt.service.ipc.IMqttPublishListener.Stub.Proxy) r3
            r0 = 832597463(0x31a06dd7, float:4.6691E-9)
            int r5 = X.AnonymousClass0fD.A03(r0)
            android.os.Parcel r4 = android.os.Parcel.obtain()
            r0 = 277(0x115, float:3.88E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ all -> 0x0035 }
            r4.writeInterfaceToken(r0)     // Catch:{ all -> 0x0035 }
            r4.writeInt(r2)     // Catch:{ all -> 0x0035 }
            r4.writeInt(r1)     // Catch:{ all -> 0x0035 }
            android.os.IBinder r3 = r3.A00     // Catch:{ all -> 0x0035 }
            r2 = 2
            r1 = 0
            r0 = 1
            r3.transact(r2, r4, r1, r0)     // Catch:{ all -> 0x0035 }
            goto L_0x01cf
        L_0x0035:
            r1 = move-exception
            r4.recycle()
            r0 = 1987710904(0x767a0fb8, float:1.26796194E33)
            X.AnonymousClass0fD.A0A(r0, r5)
            throw r1
        L_0x0040:
            X.0kg r3 = X.0kg.A06
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "simpleVideoViewHolders["
            r2.append(r0)
            java.lang.Object r1 = r12.A03
            X.GxT r1 = (X.C53985GxT) r1
            java.lang.String r0 = r1.A06
            r2.append(r0)
            java.lang.String r0 = "] size is "
            r2.append(r0)
            int r0 = r12.A01
            r2.append(r0)
            java.lang.String r0 = ", required "
            r2.append(r0)
            int r0 = r12.A02
            r2.append(r0)
            java.lang.String r0 = ", mediaId: "
            java.lang.String r1 = X.G9w.A0i(r1, r0, r2)
            java.lang.String r0 = "MidcardVideoLayoutClipsComponent"
            goto L_0x00a9
        L_0x0071:
            X.0kg r3 = X.0kg.A06
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "simpleVirtualVideoViewHolders["
            r2.append(r0)
            java.lang.Object r1 = r12.A03
            X.GxM r1 = (X.C53978GxM) r1
            java.lang.String r0 = r1.A04
            r2.append(r0)
            java.lang.String r0 = "] size is "
            r2.append(r0)
            int r0 = r12.A01
            r2.append(r0)
            java.lang.String r0 = ", required "
            r2.append(r0)
            int r0 = r12.A02
            r2.append(r0)
            java.lang.String r0 = ", videoIndex: "
            r2.append(r0)
            int r0 = r1.A01
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = "MidcardVirtualVideoLayoutClipsComponent"
        L_0x00a9:
            X.0wb.A01(r3, r0, r1)
            goto L_0x01d8
        L_0x00ae:
            java.lang.Object r3 = r12.A03
            X.GBa r3 = (X.C52003GBa) r3
            X.2We r2 = r3.A00
            if (r2 == 0) goto L_0x00bd
            int r1 = r12.A01
            int r0 = r12.A02
            r2.A0Y(r1, r0)
        L_0x00bd:
            X.2We r0 = r3.A00     // Catch:{ 3cy | IkX -> 0x00c4 }
            if (r0 == 0) goto L_0x00c4
            r0.A0h(r3)     // Catch:{ 3cy | IkX -> 0x00c4 }
        L_0x00c4:
            X.C52003GBa.A01(r3)
            goto L_0x01d8
        L_0x00c9:
            java.lang.Object r4 = r12.A03
            X.GBa r4 = (X.C52003GBa) r4
            boolean r2 = r4.A0G
            int r3 = r12.A02
            int r0 = r12.A01
            int r1 = r3 + r0
            if (r2 == 0) goto L_0x00e0
            X.GBg r0 = r4.A07
            int r0 = r0.A0A()
            if (r1 <= r0) goto L_0x00e0
            r1 = r0
        L_0x00e0:
            X.2HY r0 = X.C229632nm.A0C(r3, r1)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r0.iterator()
        L_0x00ec:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0101
            r0 = r1
            X.0sh r0 = (X.0sh) r0
            int r0 = r0.A00()
            X.7hp r0 = X.C52003GBa.A00(r4, r0)
            r2.add(r0)
            goto L_0x00ec
        L_0x0101:
            X.2We r0 = r4.A00     // Catch:{ 3cy | IkX -> 0x01d8 }
            if (r0 == 0) goto L_0x0108
            r0.A0b(r3, r2)     // Catch:{ 3cy | IkX -> 0x01d8 }
        L_0x0108:
            X.2We r0 = r4.A00     // Catch:{ 3cy | IkX -> 0x010f, 3cy | IkX -> 0x01d8 }
            if (r0 == 0) goto L_0x010f
            r0.A0h(r4)     // Catch:{ 3cy | IkX -> 0x010f, 3cy | IkX -> 0x01d8 }
        L_0x010f:
            X.C52003GBa.A01(r4)     // Catch:{ 3cy | IkX -> 0x01d8 }
            goto L_0x01d8
        L_0x0114:
            int r4 = r12.A02
            int r0 = r12.A01
            int r2 = r4 + r0
            java.lang.Object r3 = r12.A03
            X.GBa r3 = (X.C52003GBa) r3
            X.GBg r1 = r3.A07
            int r0 = r1.A0A()
            int r0 = r0 + -1
            if (r2 <= r0) goto L_0x0129
            r2 = r0
        L_0x0129:
            X.4bN r0 = r1.A0F(r2)
            if (r0 == 0) goto L_0x015c
            X.5o2 r1 = r0.A01
        L_0x0131:
            X.5o2 r0 = X.C295365o2.GHOST
            if (r1 != r0) goto L_0x0156
            X.2HY r0 = X.C229632nm.A0C(r4, r2)
        L_0x0139:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r0.iterator()
        L_0x0141:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x015e
            r0 = r1
            X.0sh r0 = (X.0sh) r0
            int r0 = r0.A00()
            X.7hp r0 = X.C52003GBa.A00(r3, r0)
            r2.add(r0)
            goto L_0x0141
        L_0x0156:
            X.2HY r0 = new X.2HY
            r0.<init>(r4, r2)
            goto L_0x0139
        L_0x015c:
            r1 = 0
            goto L_0x0131
        L_0x015e:
            X.2We r0 = r3.A00
            if (r0 == 0) goto L_0x0165
            r0.A0d(r4, r2)
        L_0x0165:
            X.2We r0 = r3.A00     // Catch:{ 3cy | IkX -> 0x01d8 }
            if (r0 == 0) goto L_0x01d8
            r0.A0h(r3)     // Catch:{ 3cy | IkX -> 0x01d8 }
            goto L_0x01d8
        L_0x016d:
            java.lang.Object r3 = r12.A03
            X.H0s r3 = (X.C54148H0s) r3
            int r5 = r12.A01
            int r4 = r12.A02
            X.0eM r0 = r3.A03
            X.INA r0 = X.C51966G9m.A0z(r0)
            X.HOd r2 = r3.A00
            X.0wc r1 = X.INA.A01(r0, r2)
            java.lang.String r0 = "ig_school_reliability_grad_date_picker_impression"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0195
            X.C51965G9l.A1B(r2, r1)
            X.HOp r0 = X.C54684HOp.UPDATE_GRADUATION
            X.C51974G9v.A0j(r0, r1)
        L_0x0195:
            X.Vtr r6 = X.C18539Vtr.A01
            android.content.Context r7 = r3.requireContext()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            r0 = 35
            X.JFv r11 = new X.JFv
            r11.<init>(r3, r0)
            r0 = 41
            X.Ivu r10 = new X.Ivu
            r10.<init>(r3, r0)
            r6.A00(r7, r8, r9, r10, r11)
            goto L_0x01d8
        L_0x01b5:
            java.lang.Object r3 = r12.A03     // Catch:{ 3cy | IkX -> 0x01d8 }
            X.GBa r3 = (X.C52003GBa) r3     // Catch:{ 3cy | IkX -> 0x01d8 }
            X.2We r2 = r3.A00     // Catch:{ 3cy | IkX -> 0x01d8 }
            if (r2 == 0) goto L_0x01c4
            int r1 = r12.A02     // Catch:{ 3cy | IkX -> 0x01d8 }
            int r0 = r12.A01     // Catch:{ 3cy | IkX -> 0x01d8 }
            r2.A0a(r1, r0)     // Catch:{ 3cy | IkX -> 0x01d8 }
        L_0x01c4:
            X.2We r0 = r3.A00     // Catch:{ 3cy | IkX -> 0x01cb, 3cy | IkX -> 0x01d8 }
            if (r0 == 0) goto L_0x01cb
            r0.A0h(r3)     // Catch:{ 3cy | IkX -> 0x01cb, 3cy | IkX -> 0x01d8 }
        L_0x01cb:
            X.C52003GBa.A01(r3)     // Catch:{ 3cy | IkX -> 0x01d8 }
            goto L_0x01d8
        L_0x01cf:
            r4.recycle()
            r0 = 1193649070(0x4725a3ae, float:42403.68)
            X.AnonymousClass0fD.A0A(r0, r5)
        L_0x01d8:
            X.0gF r0 = X.C60340gF.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52061GDh.invoke():java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52061GDh(Object obj, int i, int i2, int i3) {
        super(0);
        this.A00 = i3;
        this.A02 = i;
        this.A01 = i2;
        this.A03 = obj;
    }
}
