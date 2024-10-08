package X;

/* renamed from: X.Pln  reason: case insensitive filesystem */
public final class C73912Pln extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    public static OVH A00(0lg r2) {
        0qQ.A0B(r2, 0);
        return (OVH) r2.A01(OVH.class, new C73912Pln(r2, 0));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73912Pln(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ca, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x022d, code lost:
        X.C12411Sto.A03(r4, r6, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x0235;
                case 1: goto L_0x023f;
                case 2: goto L_0x0250;
                case 3: goto L_0x027e;
                case 4: goto L_0x0289;
                case 5: goto L_0x0294;
                case 6: goto L_0x02a0;
                case 7: goto L_0x02be;
                case 8: goto L_0x02ce;
                case 9: goto L_0x02d7;
                case 10: goto L_0x002d;
                case 11: goto L_0x02e5;
                case 12: goto L_0x02ef;
                case 13: goto L_0x0041;
                case 14: goto L_0x0066;
                case 15: goto L_0x005e;
                case 16: goto L_0x003f;
                case 17: goto L_0x0080;
                case 18: goto L_0x02f9;
                case 19: goto L_0x0090;
                case 20: goto L_0x00c6;
                case 21: goto L_0x0304;
                case 22: goto L_0x0316;
                case 23: goto L_0x00cf;
                case 24: goto L_0x00f3;
                case 25: goto L_0x0324;
                case 26: goto L_0x0336;
                case 27: goto L_0x0347;
                case 28: goto L_0x03ed;
                case 29: goto L_0x0350;
                case 30: goto L_0x035a;
                case 31: goto L_0x0364;
                case 32: goto L_0x0144;
                case 33: goto L_0x0153;
                case 34: goto L_0x036e;
                case 35: goto L_0x037c;
                case 36: goto L_0x0232;
                case 37: goto L_0x0385;
                case 38: goto L_0x0398;
                case 39: goto L_0x03a2;
                case 40: goto L_0x03bf;
                case 41: goto L_0x03cf;
                case 42: goto L_0x03e0;
                case 43: goto L_0x0162;
                case 44: goto L_0x018b;
                case 45: goto L_0x01af;
                case 46: goto L_0x01ba;
                case 47: goto L_0x01e1;
                case 48: goto L_0x01f6;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.Sto r4 = X.C51965G9l.A0g()
            java.lang.Object r1 = r14.A01
            X.QDN r1 = (X.QDN) r1
            com.facebookpay.logging.LoggingContext r3 = r1.A1P
            X.SUj r0 = r1.A0S
            java.lang.Object r0 = r0.A01
            com.facebookpay.expresscheckout.models.TransactionInfo r0 = (com.facebookpay.expresscheckout.models.TransactionInfo) r0
            if (r0 == 0) goto L_0x001f
            com.facebookpay.expresscheckout.models.ShippingOptions r0 = r0.A03
            if (r0 == 0) goto L_0x001f
            java.lang.String r2 = r0.A00
            if (r2 != 0) goto L_0x0021
        L_0x001f:
            java.lang.String r2 = ""
        L_0x0021:
            java.util.LinkedHashMap r1 = X.C66584MXp.A0f(r1)
            java.lang.String r0 = "selected_shipping_option"
            r4.A0Q(r3, r2, r0, r1)
        L_0x002a:
            X.0gF r3 = X.C60340gF.A00
        L_0x002c:
            return r3
        L_0x002d:
            java.lang.Object r0 = r14.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.Context r1 = r0.getApplicationContext()
            java.lang.String r0 = "bluetooth"
            java.lang.Object r3 = r1.getSystemService(r0)
            boolean r0 = r3 instanceof android.bluetooth.BluetoothManager
            if (r0 != 0) goto L_0x002c
        L_0x003f:
            r3 = 0
            return r3
        L_0x0041:
            java.lang.Object r3 = r14.A01
            X.OdK r3 = (X.C71125OdK) r3
            androidx.media.AudioAttributesCompat r0 = X.C71125OdK.A0M
            java.lang.String r2 = "Required value was null."
            java.util.Queue r1 = r3.A09
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0062
            java.lang.Object r1 = r1.remove()
            if (r1 == 0) goto L_0x03f2
            X.ONa r1 = (X.C70828ONa) r1
            r0 = 0
            r3.A05(r1, r0)
            goto L_0x002a
        L_0x005e:
            java.lang.Object r3 = r14.A01
            X.OdK r3 = (X.C71125OdK) r3
        L_0x0062:
            r3.A04()
            goto L_0x002a
        L_0x0066:
            java.lang.Object r3 = r14.A01
            X.OdK r3 = (X.C71125OdK) r3
            androidx.media.AudioAttributesCompat r0 = X.C71125OdK.A0M
            X.OUV r2 = r3.A07
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "MediaPlayer prepared"
            r2.A00(r0, r1)
            X.ONa r1 = r3.A00
            if (r1 == 0) goto L_0x002a
            X.Pw4 r0 = r3.A06
            r0.EwM(r1)
            goto L_0x002a
        L_0x0080:
            java.lang.Object r2 = r14.A01
            X.OdA r2 = (X.C71116OdA) r2
            X.C71116OdA.A01(r2)
            X.Npk r1 = r2.A02
            if (r1 == 0) goto L_0x002a
            r0 = 0
            X.C71116OdA.A00(r1, r2, r0, r0)
            goto L_0x002a
        L_0x0090:
            X.OWb r2 = X.C71004OWb.A00
            java.lang.String r1 = "RtcNotificationForegroundService"
            java.lang.String r0 = "Now safe to start foreground"
            r3 = 0
            r2.A00(r1, r0)
            java.lang.Object r2 = r14.A01
            com.facebook.rtc.notification.RtcNotificationForegroundService r2 = (com.facebook.rtc.notification.RtcNotificationForegroundService) r2
            X.PsK r0 = r2.A00
            if (r0 == 0) goto L_0x00a5
            r0.cancel()
        L_0x00a5:
            r2.A00 = r3
            java.lang.Integer r1 = r2.A03
            if (r1 == 0) goto L_0x00bd
            java.lang.Integer r0 = r2.A02
            if (r0 != 0) goto L_0x00bd
            X.1Fs r0 = new X.1Fs
            r0.<init>(r2)
            int r1 = r1.intValue()
            android.app.NotificationManager r0 = r0.A00
            r0.cancel(r3, r1)
        L_0x00bd:
            X.0sa r0 = r2.A04
            if (r0 != 0) goto L_0x00ca
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00c6:
            java.lang.Object r0 = r14.A01
            X.0sa r0 = (X.C62320sa) r0
        L_0x00ca:
            r0.invoke()
            goto L_0x002a
        L_0x00cf:
            java.util.LinkedHashSet r3 = X.DbS.A0y()
            java.lang.Object r0 = r14.A01
            X.JwM r0 = (X.C61084JwM) r0
            java.lang.Object r0 = r0.A02
            java.util.Iterator r2 = X.C51966G9m.A1H(r0)
        L_0x00dd:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = r2.next()
            X.N3g r0 = (X.C68166N3g) r0
            long r0 = r0.A02
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.add(r0)
            goto L_0x00dd
        L_0x00f3:
            java.lang.Object r6 = r14.A01
            X.MtW r6 = (X.C67717MtW) r6
            X.NEQ r6 = (X.NEQ) r6
            X.0cC r0 = X.C59940cC.A00()
            X.0cT r5 = r6.A00
            r4 = 0
            X.0Pr r9 = X.AnonymousClass0cT.A00(r6)
            int r8 = r0.A00
            r7 = 0
            int r0 = android.os.Process.myUid()
            if (r0 != r8) goto L_0x0132
            java.util.concurrent.atomic.AtomicReference r3 = r9.A02
            java.lang.Object r2 = r3.get()
            X.0cA r2 = (X.AnonymousClass0cA) r2
            if (r2 != 0) goto L_0x012b
            java.util.concurrent.atomic.AtomicInteger r0 = r9.A01
            int r1 = r0.getAndIncrement()
            android.content.Context r0 = r9.A00
            X.0RJ r0 = X.0RJ.A00(r0, r8, r7)
            X.0cA r2 = new X.0cA
            r2.<init>(r0, r1)
            r3.set(r2)
        L_0x012b:
            X.0RJ r0 = r2.A00
            X.AnonymousClass0cT.A01(r6, r4, r0, r5)
            goto L_0x002a
        L_0x0132:
            java.util.concurrent.atomic.AtomicInteger r0 = r9.A01
            int r1 = r0.getAndIncrement()
            android.content.Context r0 = r9.A00
            X.0RJ r0 = X.0RJ.A00(r0, r8, r7)
            X.0cA r2 = new X.0cA
            r2.<init>(r0, r1)
            goto L_0x012b
        L_0x0144:
            X.Pxm r0 = X.Pxm.A08
            X.0h9 r1 = r0.A05
            java.lang.Object r0 = r14.A01
            X.OMN r0 = (X.OMN) r0
            X.Olm r0 = r0.A00
            r1.A09(r0)
            goto L_0x002a
        L_0x0153:
            X.Pxm r0 = X.Pxm.A08
            X.0h9 r1 = r0.A05
            java.lang.Object r0 = r14.A01
            X.OMN r0 = (X.OMN) r0
            X.Olm r0 = r0.A00
            r1.A0A(r0)
            goto L_0x002a
        L_0x0162:
            X.Sto r1 = X.C51965G9l.A0g()
            java.lang.Object r0 = r14.A01
            X.QDN r0 = (X.QDN) r0
            com.facebookpay.logging.LoggingContext r6 = r0.A1P
            r0 = 210(0xd2, float:2.94E-43)
            java.lang.String r3 = X.Pxd.A00(r0)
            r2 = 0
            X.0Ae r1 = r1.A00
            java.lang.String r0 = "client_load_ecpemailoptin_fail"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 66
            X.1Ln r4 = new X.1Ln
            r4.<init>(r1, r0)
            r0 = 28
            X.TY3 r5 = new X.TY3
            r5.<init>(r2, r6, r3, r0)
            goto L_0x022d
        L_0x018b:
            X.Sto r4 = X.C51965G9l.A0g()
            java.lang.Object r0 = r14.A01
            X.QDN r0 = (X.QDN) r0
            com.facebookpay.logging.LoggingContext r3 = r0.A1P
            X.SUj r0 = r0.A0S
            java.lang.Throwable r0 = r0.A02
            java.util.LinkedHashMap r2 = X.AnonymousClass7TE.A1H()
            java.lang.String r1 = "error_message"
            if (r0 == 0) goto L_0x01a8
            java.lang.String r0 = X.2Og.A00(r0)
            r2.put(r1, r0)
        L_0x01a8:
            java.lang.String r0 = "pux_checkout"
            r4.A0c(r3, r0, r2)
            goto L_0x002a
        L_0x01af:
            java.lang.Object r0 = r14.A01
            X.QDN r0 = (X.QDN) r0
            X.QDT r0 = r0.A1R
            r0.A0K()
            goto L_0x002a
        L_0x01ba:
            X.Sto r1 = X.C51965G9l.A0g()
            java.lang.Object r0 = r14.A01
            X.QDN r0 = (X.QDN) r0
            com.facebookpay.logging.LoggingContext r6 = r0.A1P
            java.util.LinkedHashMap r3 = X.C66584MXp.A0f(r0)
            java.lang.String r2 = "pux_checkout"
            X.0Ae r1 = r1.A00
            java.lang.String r0 = "client_load_pricetable_init"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 92
            X.1Ln r4 = new X.1Ln
            r4.<init>(r1, r0)
            r0 = 44
            X.TY3 r5 = new X.TY3
            r5.<init>(r3, r6, r2, r0)
            goto L_0x022d
        L_0x01e1:
            X.Sto r3 = X.C51965G9l.A0g()
            java.lang.Object r0 = r14.A01
            X.QDN r0 = (X.QDN) r0
            com.facebookpay.logging.LoggingContext r2 = r0.A1P
            java.util.LinkedHashMap r1 = X.C66584MXp.A0f(r0)
            java.lang.String r0 = "selected_shipping_address"
            r3.A0e(r2, r0, r1)
            goto L_0x002a
        L_0x01f6:
            X.Sto r2 = X.C51965G9l.A0g()
            java.lang.Object r1 = r14.A01
            X.QDN r1 = (X.QDN) r1
            com.facebookpay.logging.LoggingContext r6 = r1.A1P
            X.SUj r0 = r1.A0S
            java.lang.Object r0 = r0.A01
            com.facebookpay.expresscheckout.models.TransactionInfo r0 = (com.facebookpay.expresscheckout.models.TransactionInfo) r0
            if (r0 == 0) goto L_0x0210
            com.facebookpay.expresscheckout.models.FulfillmentOptions r0 = r0.A00
            if (r0 == 0) goto L_0x0210
            java.lang.String r8 = r0.A00
            if (r8 != 0) goto L_0x0212
        L_0x0210:
            java.lang.String r8 = ""
        L_0x0212:
            java.util.LinkedHashMap r7 = X.C66584MXp.A0f(r1)
            java.lang.String r9 = "selected_fulfillment_option"
            X.0Ae r1 = r2.A00
            java.lang.String r0 = "client_load_fulfillmentoption_init"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 77
            X.1Ln r4 = new X.1Ln
            r4.<init>(r1, r0)
            r10 = 7
            X.PqY r5 = new X.PqY
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.String) r8, (java.lang.String) r9, (int) r10)
        L_0x022d:
            X.C12411Sto.A03(r4, r6, r5)
            goto L_0x002a
        L_0x0232:
            X.02m r3 = X.02m.A0p
            return r3
        L_0x0235:
            java.lang.Object r0 = r14.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.OVH r3 = new X.OVH
            r3.<init>(r0)
            return r3
        L_0x023f:
            java.lang.Object r0 = r14.A01
            X.OVH r0 = (X.OVH) r0
            com.instagram.common.session.UserSession r1 = r0.A00
            android.content.Context r0 = X.C60960kU.A00
            X.0qQ.A07(r0)
            X.OL3 r3 = new X.OL3
            r3.<init>(r1, r0)
            return r3
        L_0x0250:
            X.0eE r1 = X.AnonymousClass0t1.A01
            java.lang.Object r3 = r14.A01
            X.OVH r3 = (X.OVH) r3
            com.instagram.common.session.UserSession r0 = r3.A00
            java.lang.Long r0 = X.C66581MXm.A0r(r0, r1)
            if (r0 == 0) goto L_0x0279
            java.lang.String r4 = X.C66581MXm.A0x(r0)
            X.12T r2 = X.AnonymousClass12T.A00
            r1 = -18
            r0 = 3
            X.0nV r1 = r2.AOJ(r1, r0)
            X.0eM r0 = r3.A01
            java.lang.Object r0 = r0.getValue()
            X.OL3 r0 = (X.OL3) r0
            com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk r3 = new com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk
            r3.<init>(r0, r4, r1)
            return r3
        L_0x0279:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x027e:
            java.lang.Object r0 = r14.A01
            X.OL3 r0 = (X.OL3) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            com.instagram.realtimeclient.RealtimeClientManager r3 = com.instagram.realtimeclient.RealtimeClientManager.getInstance(r0)
            return r3
        L_0x0289:
            java.lang.Object r0 = r14.A01
            X.NCY r0 = (X.NCY) r0
            X.0sa r0 = r0.A07
            java.lang.Object r3 = r0.invoke()
            return r3
        L_0x0294:
            java.lang.Object r1 = r14.A01
            com.facebook.rp.platform.metaai.rsys.pregeneratesdp.PregenerateSdpWrapper r1 = (com.facebook.rp.platform.metaai.rsys.pregeneratesdp.PregenerateSdpWrapper) r1
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.rp.platform.metaai.rsys.pregeneratesdp.PregenerateSdpWrapper"
            X.0qQ.A0C(r1, r0)
            com.facebook.rp.platform.metaai.rsys.pregeneratesdp.gen.PregenerateSdp r3 = r1.A00
            return r3
        L_0x02a0:
            java.lang.Object r0 = r14.A01
            com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk r0 = (com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk) r0
            java.lang.String r0 = r0.A03
            r3 = 0
            X.0qQ.A0B(r0, r3)
            r1 = 0
            r12 = 1
            r2 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r11 = r1
            r13 = r1
            com.facebook.rsys.callcontext.gen.CallContext r3 = com.facebook.rsys.roomtypecalling.gen.CallingAppContextUtils.CProxy.createCallContext(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.0qQ.A07(r3)
            return r3
        L_0x02be:
            java.lang.Object r0 = r14.A01
            com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession r0 = (com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession) r0
            X.NCY r0 = r0.A01
            java.lang.String r1 = r0.A05
            X.OEm r0 = new X.OEm
            r0.<init>(r1)
            X.0Ud r3 = r0.A02
            return r3
        L_0x02ce:
            java.lang.Object r0 = r14.A01
            com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession r0 = (com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession) r0
            X.NDK r0 = r0.A02
            X.0Ud r3 = r0.A00
            return r3
        L_0x02d7:
            java.lang.Object r0 = r14.A01
            com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession r0 = (com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession) r0
            X.NCY r0 = r0.A01
            java.lang.String r0 = r0.A05
            X.LAB r3 = new X.LAB
            r3.<init>(r0)
            return r3
        L_0x02e5:
            java.lang.Object r1 = r14.A01
            android.content.Context r1 = (android.content.Context) r1
            r0 = 0
            X.1DF r3 = X.AnonymousClass1DA.A00(r1, r0)
            return r3
        L_0x02ef:
            java.lang.Object r0 = r14.A01
            X.OdK r0 = (X.C71125OdK) r0
            X.Mrj r3 = new X.Mrj
            r3.<init>(r0)
            return r3
        L_0x02f9:
            java.lang.Object r0 = r14.A01
            X.OdA r0 = (X.C71116OdA) r0
            X.0sa r0 = r0.A0K
            java.lang.Object r3 = r0.invoke()
            return r3
        L_0x0304:
            java.lang.Object r0 = r14.A01
            X.OZt r0 = (X.C71032OZt) r0
            com.instagram.common.session.UserSession r3 = r0.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325252841747226(0x810da00002331a, double:3.0355743949491326E-306)
            java.lang.Boolean r3 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            return r3
        L_0x0316:
            java.lang.Object r0 = r14.A01
            X.OZt r0 = (X.C71032OZt) r0
            android.content.Context r1 = r0.A00
            X.PiB r0 = X.C73688PiB.A00
            X.OTq r3 = new X.OTq
            r3.<init>(r1, r0)
            return r3
        L_0x0324:
            java.lang.Object r0 = r14.A01
            java.lang.String r2 = X.0KF.A00(r0)
            X.0qQ.A07(r2)
            java.lang.String r1 = "View hash: "
            java.lang.String r0 = " - size: 0 (cards cleared)"
            java.lang.String r3 = X.002.A0g(r1, r2, r0)
            return r3
        L_0x0336:
            java.lang.Object r0 = r14.A01
            com.facebook.smartcapture.view.IdCaptureBaseActivity r0 = (com.facebook.smartcapture.view.IdCaptureBaseActivity) r0
            com.facebook.smartcapture.flow.IdCaptureConfig r0 = r0.A01()
            com.facebook.smartcapture.resources.stringoverride.StringOverrideFactory r0 = r0.A02()
            X.Td8 r3 = r0.AL3()
            return r3
        L_0x0347:
            java.lang.Object r0 = r14.A01
            X.WKl r0 = (X.C19081WKl) r0
            android.view.Surface r3 = X.C19081WKl.A00(r0)
            return r3
        L_0x0350:
            java.lang.Object r1 = r14.A01
            X.LGd r1 = (X.C63973LGd) r1
            r0 = 0
            java.util.List r3 = r1.A06(r0)
            return r3
        L_0x035a:
            java.lang.Object r0 = r14.A01
            X.LNB r0 = (X.LNB) r0
            X.UUV r3 = new X.UUV
            r3.<init>(r0)
            return r3
        L_0x0364:
            java.lang.Object r0 = r14.A01
            X.LNB r0 = (X.LNB) r0
            X.UUW r3 = new X.UUW
            r3.<init>(r0)
            return r3
        L_0x036e:
            java.lang.Object r2 = r14.A01
            r1 = 0
            X.WKu r0 = new X.WKu
            r0.<init>(r2, r1)
            X.OMN r3 = new X.OMN
            r3.<init>(r0)
            return r3
        L_0x037c:
            java.lang.Object r0 = r14.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1vn r3 = X.1vm.A01(r0)
            return r3
        L_0x0385:
            java.lang.Object r0 = r14.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r0 = r0.getValue()
            X.02m r0 = (X.02m) r0
            X.0qQ.A07(r0)
            X.95H r3 = new X.95H
            r3.<init>(r0)
            return r3
        L_0x0398:
            java.lang.Object r0 = r14.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.95F r3 = new X.95F
            r3.<init>(r0)
            return r3
        L_0x03a2:
            java.lang.Object r2 = r14.A01
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r1 = 41
            X.Pln r0 = new X.Pln
            r0.<init>(r2, r1)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            java.lang.Object r0 = r0.getValue()
            X.0xa r0 = (X.0xa) r0
            X.95I r3 = new X.95I
            r3.<init>(r0)
            return r3
        L_0x03bf:
            java.lang.Object r0 = r14.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r0 = r0.getValue()
            X.1vn r0 = (X.1vn) r0
            X.95G r3 = new X.95G
            r3.<init>(r0)
            return r3
        L_0x03cf:
            java.lang.Object r0 = r14.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Am r2 = X.1Al.A01(r0)
            X.1An r1 = X.1An.A3b
            java.lang.Class<X.95I> r0 = X.AnonymousClass95I.class
            X.0xa r3 = r2.A04(r1, r0)
            return r3
        L_0x03e0:
            java.lang.Object r0 = r14.A01
            X.Qxp r0 = (X.C8608Qxp) r0
            boolean r0 = r0.D68()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x03ed:
            java.lang.Object r0 = r14.A01
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x03f2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73912Pln.invoke():java.lang.Object");
    }
}
