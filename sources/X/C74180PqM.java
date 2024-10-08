package X;

/* renamed from: X.PqM  reason: case insensitive filesystem */
public final class C74180PqM extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;

    public static Object A00(Object obj, C74180PqM pqM) {
        0qQ.A0B(obj, 0);
        return pqM.A01;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74180PqM(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0319, code lost:
        if (r0.A0A() != false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x045d, code lost:
        if (r5.A01 != X.AnonymousClass86R.OPEN) goto L_0x0466;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x045f, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0464, code lost:
        if (r5.A00 == X.AnonymousClass86S.CLOSED) goto L_0x0467;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0466, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0467, code lost:
        r0 = (X.C68291N9e) r5.A01;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x046b, code lost:
        if (r0 == null) goto L_0x047d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x046d, code lost:
        r4 = new X.C68291N9e(r0.A01, r0.A00, r0.A03, r3);
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0478, code lost:
        r5.A0J(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x047d, code lost:
        r4 = null;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0559, code lost:
        if (X.C51966G9m.A1W(r3.A02(), r3.requireArguments().getString("profile_user_id")) == false) goto L_0x055b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0575, code lost:
        if (X.C51966G9m.A1W(r3.A02(), r3.requireArguments().getString("profile_user_id")) != false) goto L_0x0577;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0a24, code lost:
        if (r0 != null) goto L_0x0a2b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0b2c, code lost:
        r5.A0O(r3, r2, r1, r4);
        X.C18242Vo9.A01(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0b32, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01df, code lost:
        r1.A02(new X.C72786PKa(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01eb, code lost:
        X.C69131NfC.A00(r4, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r27) {
        /*
            r26 = this;
            r2 = r26
            r0 = r27
            int r1 = r2.A00
            switch(r1) {
                case 0: goto L_0x0054;
                case 1: goto L_0x0014;
                case 2: goto L_0x01bb;
                case 3: goto L_0x01f0;
                case 4: goto L_0x0203;
                case 5: goto L_0x026d;
                case 6: goto L_0x0287;
                case 7: goto L_0x0a5f;
                case 8: goto L_0x02a4;
                case 9: goto L_0x02ad;
                case 10: goto L_0x02c4;
                case 11: goto L_0x02d3;
                case 12: goto L_0x02f8;
                case 13: goto L_0x0a6a;
                case 14: goto L_0x030f;
                case 15: goto L_0x031d;
                case 16: goto L_0x03b4;
                case 17: goto L_0x03c2;
                case 18: goto L_0x0a7f;
                case 19: goto L_0x0ab3;
                case 20: goto L_0x03e2;
                case 21: goto L_0x03ed;
                case 22: goto L_0x0434;
                case 23: goto L_0x044f;
                case 24: goto L_0x047f;
                case 25: goto L_0x04a2;
                case 26: goto L_0x04b1;
                case 27: goto L_0x04b1;
                case 28: goto L_0x000c;
                case 29: goto L_0x04fb;
                case 30: goto L_0x0702;
                case 31: goto L_0x077b;
                case 32: goto L_0x0009;
                case 33: goto L_0x0009;
                case 34: goto L_0x0009;
                case 35: goto L_0x07d1;
                case 36: goto L_0x084d;
                case 37: goto L_0x000c;
                case 38: goto L_0x0009;
                case 39: goto L_0x08ce;
                case 40: goto L_0x0901;
                case 41: goto L_0x0983;
                case 42: goto L_0x0a16;
                case 43: goto L_0x0a27;
                case 44: goto L_0x0a32;
                case 45: goto L_0x0ad3;
                case 46: goto L_0x0ae7;
                case 47: goto L_0x0afb;
                case 48: goto L_0x0b19;
                case 49: goto L_0x0b33;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.C51965G9l.A1U(r0)
        L_0x000c:
            java.lang.Object r0 = r2.A01
            X.DbS.A1U(r0)
        L_0x0011:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x0014:
            com.facebook.common.util.TriState r0 = (com.facebook.common.util.TriState) r0
            r3 = 0
            X.0qQ.A0B(r0, r3)
            java.lang.Object r4 = r2.A01
            X.NfC r4 = (X.C69131NfC) r4
            int r2 = r0.ordinal()
            r0 = 1
            r1 = 0
            if (r2 == r0) goto L_0x0047
            r0 = 2
            if (r2 == r0) goto L_0x002f
            if (r2 != r3) goto L_0x0b4a
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            goto L_0x01eb
        L_0x002f:
            r4.A01 = r1
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            X.C69131NfC.A00(r4, r0)
            java.lang.Integer r5 = X.AnonymousClass05K.A0Y
            X.NfF r3 = r4.A06
            java.lang.Integer r2 = X.AnonymousClass05K.A02
            long r0 = java.lang.System.currentTimeMillis()
            X.C69134NfF.A01(r3, r2, r0)
            X.OWA r1 = r4.A07
            goto L_0x01df
        L_0x0047:
            r4.A01 = r1
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.C69131NfC.A00(r4, r0)
            com.instagram.arp.api.AvatarEffectsApiController r0 = r4.A04
            r0.A02()
            goto L_0x0011
        L_0x0054:
            X.Prx r0 = (X.C74269Prx) r0
            java.lang.Object r1 = A00(r0, r2)
            X.ONx r1 = (X.C70845ONx) r1
            X.OLU r1 = r1.A05
            X.0eM r1 = r1.A04
            java.lang.Object r2 = r1.getValue()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Class r1 = r0.getClass()
            X.0Yh r1 = X.DbS.A0z(r1)
            java.lang.Object r1 = X.0Yt.A01(r1, r2)
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            java.util.Iterator r7 = r1.iterator()
        L_0x0078:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0011
            java.lang.Object r3 = r7.next()
            X.OdY r3 = (X.C71135OdY) r3
            boolean r1 = r3 instanceof X.C69097Nec
            if (r1 == 0) goto L_0x00af
            r6 = r3
            X.Nec r6 = (X.C69097Nec) r6
            r1 = r0
            X.N9J r1 = (X.N9J) r1
            r5 = 0
            X.0qQ.A0B(r1, r5)
            java.lang.Integer r1 = r1.A01
            int r4 = r1.intValue()
            r2 = 1
            r1 = 2
            if (r4 == r1) goto L_0x00a1
            if (r4 == r5) goto L_0x00a1
            if (r4 == r2) goto L_0x00a1
            r2 = 0
        L_0x00a1:
            boolean r1 = r6.A01
            boolean r1 = X.JTQ.A1O(r2, r1)
        L_0x00a7:
            if (r1 == 0) goto L_0x0078
        L_0x00a9:
            r3.A00 = r0
            r3.A0I(r0)
            goto L_0x0078
        L_0x00af:
            boolean r1 = r3 instanceof X.C69112Ner
            if (r1 == 0) goto L_0x01b1
            r2 = r3
            X.Ner r2 = (X.C69112Ner) r2
            r5 = r0
            X.N9P r5 = (X.N9P) r5
            r1 = 0
            X.0qQ.A0B(r5, r1)
            X.N9P r4 = r2.A03
            java.util.List r2 = r5.A0G
            java.util.List r1 = r4.A0G
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x00a9
            java.util.List r2 = r5.A0I
            java.util.List r1 = r4.A0I
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x00a9
            com.instagram.camera.effect.models.CameraAREffect r2 = r5.A04
            com.instagram.camera.effect.models.CameraAREffect r1 = r4.A04
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x00a9
            java.lang.Integer r2 = r5.A09
            java.lang.Integer r1 = r4.A09
            if (r2 != r1) goto L_0x00a9
            java.lang.Integer r2 = r5.A0B
            java.lang.Integer r1 = r4.A0B
            if (r2 != r1) goto L_0x00a9
            java.util.List r2 = r5.A0H
            java.util.List r1 = r4.A0H
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x00a9
            java.util.List r2 = r5.A0F
            java.util.List r1 = r4.A0F
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x00a9
            boolean r2 = r5.A00
            boolean r1 = r4.A00
            if (r2 != r1) goto L_0x00a9
            java.util.List r2 = r5.A0J
            java.util.List r1 = r4.A0J
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x00a9
            com.instagram.camera.effect.models.CameraAREffect r2 = r5.A05
            com.instagram.camera.effect.models.CameraAREffect r1 = r4.A05
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x00a9
            com.instagram.camera.effect.models.CameraAREffect r2 = r5.A06
            com.instagram.camera.effect.models.CameraAREffect r1 = r4.A06
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x00a9
            java.lang.String r2 = r5.A0D
            java.lang.String r1 = r4.A0D
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x00a9
            java.lang.String r2 = r5.A0C
            java.lang.String r1 = r4.A0C
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x00a9
            boolean r2 = r5.A0L
            boolean r1 = r4.A0L
            if (r2 != r1) goto L_0x00a9
            boolean r2 = r5.A0M
            boolean r1 = r4.A0M
            if (r2 != r1) goto L_0x00a9
            X.NkI r2 = r5.A07
            X.NkI r1 = r4.A07
            if (r2 != r1) goto L_0x00a9
            com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration r2 = r5.A03
            com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration r1 = r4.A03
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x00a9
            boolean r2 = r5.A0U
            boolean r1 = r4.A0U
            if (r2 != r1) goto L_0x00a9
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution r2 = r5.A02
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution r1 = r4.A02
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x00a9
            float r2 = r5.A01
            float r1 = r4.A01
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00a9
            boolean r2 = r5.A0K
            boolean r1 = r4.A0K
            if (r2 != r1) goto L_0x00a9
            boolean r2 = r5.A0T
            boolean r1 = r4.A0T
            if (r2 != r1) goto L_0x00a9
            boolean r2 = r5.A0S
            boolean r1 = r4.A0S
            if (r2 != r1) goto L_0x00a9
            java.lang.String r2 = r5.A0E
            java.lang.String r1 = r4.A0E
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x00a9
            boolean r2 = r5.A0R
            boolean r1 = r4.A0R
            if (r2 != r1) goto L_0x00a9
            boolean r2 = r5.A0Q
            boolean r1 = r4.A0Q
            if (r2 != r1) goto L_0x00a9
            java.lang.Integer r2 = r5.A0A
            java.lang.Integer r1 = r4.A0A
            if (r2 != r1) goto L_0x00a9
            boolean r2 = r5.A0N
            boolean r1 = r4.A0N
            if (r2 != r1) goto L_0x00a9
            boolean r2 = r5.A0V
            boolean r1 = r4.A0V
            if (r2 != r1) goto L_0x00a9
            boolean r2 = r5.A0P
            boolean r1 = r4.A0P
            if (r2 != r1) goto L_0x00a9
            boolean r2 = r5.A0O
            boolean r1 = r4.A0O
            if (r2 != r1) goto L_0x00a9
            goto L_0x0078
        L_0x01b1:
            X.Prx r1 = r3.A00
            boolean r1 = r0.equals(r1)
            r1 = r1 ^ 1
            goto L_0x00a7
        L_0x01bb:
            com.instagram.camera.effect.models.CameraAREffect r0 = (com.instagram.camera.effect.models.CameraAREffect) r0
            java.lang.Object r4 = r2.A01
            X.NfC r4 = (X.C69131NfC) r4
            r4.A01 = r0
            if (r0 != 0) goto L_0x01e9
            java.lang.Integer r1 = r4.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 != r0) goto L_0x0011
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            X.C69131NfC.A00(r4, r0)
            java.lang.Integer r5 = X.AnonymousClass05K.A0j
            X.NfF r3 = r4.A06
            java.lang.Integer r2 = X.AnonymousClass05K.A02
            long r0 = java.lang.System.currentTimeMillis()
            X.C69134NfF.A01(r3, r2, r0)
            X.OWA r1 = r4.A07
        L_0x01df:
            X.PKa r0 = new X.PKa
            r0.<init>(r5)
            r1.A02(r0)
            goto L_0x0011
        L_0x01e9:
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
        L_0x01eb:
            X.C69131NfC.A00(r4, r0)
            goto L_0x0011
        L_0x01f0:
            java.lang.Object r1 = A00(r0, r2)
            X.NfE r1 = (X.C69133NfE) r1
            X.O9Z r1 = r1.A0C
            X.OVd r1 = r1.A00
            X.Odx r2 = r1.A0Z
            r1 = 11
            X.C71143Odx.A02(r2, r0, r1)
            goto L_0x0011
        L_0x0203:
            X.OCm r0 = (X.C70589OCm) r0
            java.lang.Object r2 = A00(r0, r2)
            X.OU3 r2 = (X.OU3) r2
            org.webrtc.EglBase$Context r1 = X.OU3.A0m
            X.O9Y r3 = r2.A0W
            boolean r2 = r0.A01
            int r1 = r0.A00
            X.OVd r0 = r3.A00
            X.Nf8 r3 = r0.A0F
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x0011
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x0011
            r0 = 5
            if (r1 > r0) goto L_0x0011
            if (r2 != 0) goto L_0x0011
            java.lang.Integer r1 = r3.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r10 = 1
            if (r1 != r0) goto L_0x0250
            X.NfF r2 = r3.A06
            java.lang.Integer r5 = X.AnonymousClass05K.A0P
            android.content.Context r1 = r3.A05
            r0 = 2131965633(0x7f1336c1, float:1.9568081E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "5000"
            java.lang.String[] r7 = new java.lang.String[]{r1, r0}
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            long r8 = java.lang.System.currentTimeMillis()
            X.N9C r4 = new X.N9C
            r4.<init>(r5, r6, r7, r8, r10)
            r2.A02(r4)
        L_0x024c:
            r3.A04 = r10
            goto L_0x0011
        L_0x0250:
            boolean r0 = X.14i.A08()
            if (r0 != 0) goto L_0x024c
            X.6ap r2 = X.DbS.A0a()
            android.content.Context r1 = r3.A05
            r0 = 2131965633(0x7f1336c1, float:1.9568081E38)
            X.DbS.A19(r1, r2, r0)
            r2.A00()
            r0 = 5000(0x1388, float:7.006E-42)
            r2.A01 = r0
            X.Dbb.A1Q(r2)
            goto L_0x024c
        L_0x026d:
            X.NCZ r0 = (X.NCZ) r0
            r3 = 0
            X.0qQ.A0B(r0, r3)
            java.lang.Object r1 = r2.A01
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            X.0qQ.A0B(r1, r3)
            X.OU3 r0 = r0.A01
            X.NCs r0 = r0.A0H
            com.facebook.rsys.crypto.gen.CryptoApi r0 = r0.A00
            if (r0 == 0) goto L_0x0b4f
            r0.ackNewDeviceNotifications(r1)
            goto L_0x0011
        L_0x0287:
            X.N4R r0 = (X.N4R) r0
            java.lang.Object r2 = A00(r0, r2)
            X.0rm r2 = (X.0rm) r2
            java.lang.Object r0 = r0.A00
            X.OEP r0 = (X.OEP) r0
            com.facebook.rsys.callmanager.callclient.gen.CallManagerCallClient r0 = r0.A00
            com.facebook.rsys.devxcallagent.gen.DevXAgentCallApi r1 = r0.getDevXAgentCallApi()
            r0 = 0
            if (r1 == 0) goto L_0x02a0
            com.facebook.rsys.devxcallagent.gen.DevXAgentCallConfig r0 = r1.copyCallConfig(r0)
        L_0x02a0:
            r2.A00 = r0
            goto L_0x0011
        L_0x02a4:
            java.lang.Object r0 = r2.A01
            java.util.concurrent.CountDownLatch r0 = (java.util.concurrent.CountDownLatch) r0
            r0.countDown()
            goto L_0x0011
        L_0x02ad:
            X.NCZ r0 = X.C66581MXm.A0j(r0)
            X.OU3 r0 = r0.A01
            com.facebook.rsys.callmanager.gen.CallApi r1 = r0.A02
            if (r1 == 0) goto L_0x0011
            java.lang.Object r0 = r2.A01
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r0)
            r1.removeUsers(r0)
            goto L_0x0011
        L_0x02c4:
            X.NCZ r0 = X.C66581MXm.A0j(r0)
            X.NCR r1 = r0.A00
            java.lang.Object r0 = r2.A01
            com.facebook.rsys.audio.gen.AudioOutputRoute r0 = (com.facebook.rsys.audio.gen.AudioOutputRoute) r0
            r1.A00(r0)
            goto L_0x0011
        L_0x02d3:
            X.NCZ r0 = X.C66581MXm.A0j(r0)
            X.NDI r0 = r0.A04
            com.facebook.rsys.mediasync.gen.MediaSyncApi r1 = r0.A00
            if (r1 == 0) goto L_0x0011
            java.lang.Object r0 = r2.A01
            X.N32 r0 = (X.N32) r0
            int r2 = r0.A00
            java.lang.String r3 = r0.A06
            int r4 = r0.A02
            java.lang.Long r5 = r0.A05
            com.facebook.rsys.mediasync.gen.MediaSyncContent r6 = r0.A03
            int r7 = r0.A01
            java.lang.String r8 = r0.A07
            java.lang.Integer r9 = r0.A04
            r10 = 0
            r11 = r10
            r1.update(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0011
        L_0x02f8:
            X.NCZ r0 = X.C66581MXm.A0j(r0)
            X.OU3 r0 = r0.A01
            X.NDx r0 = r0.A0T
            if (r0 == 0) goto L_0x0011
            java.lang.Object r1 = r2.A01
            com.facebook.rsys.videosubscriptions.gen.VideoSubscriptions r1 = (com.facebook.rsys.videosubscriptions.gen.VideoSubscriptions) r1
            com.facebook.rsys.videosubscriptions.gen.VideoSubscriptionsApi r0 = r0.A00
            if (r0 == 0) goto L_0x0011
            r0.updateSubscriptions(r1)
            goto L_0x0011
        L_0x030f:
            X.62f r0 = (X.C3022462f) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x0011
            goto L_0x000c
        L_0x031d:
            boolean r1 = X.AnonymousClass7TE.A1a(r0)
            java.lang.Object r0 = r2.A01
            X.Nen r0 = (X.C69108Nen) r0
            X.PMU r5 = r0.A0M
            if (r1 == 0) goto L_0x037e
            X.Pry r0 = r0.A01
            X.N9g r0 = (X.C68293N9g) r0
            r6 = 1
            if (r0 == 0) goto L_0x037c
            boolean r0 = r0.A0F
            if (r0 != r6) goto L_0x037c
        L_0x0334:
            X.0eM r4 = r5.A0X
            java.lang.Object r0 = r4.getValue()
            android.app.Dialog r0 = (android.app.Dialog) r0
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L_0x0011
            android.content.Context r3 = r5.A0C
            r2 = 2131972464(0x7f135170, float:1.9581936E38)
            r1 = 1
            java.lang.String r0 = X.2Yu.A0K(r3)
            java.lang.String r0 = X.DbW.A0h(r3, r0, r2)
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r1)
            r0.show()
            boolean r0 = r3 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0011
            android.app.Activity r3 = (android.app.Activity) r3
            if (r3 == 0) goto L_0x0011
            boolean r0 = r3.isFinishing()
            if (r0 != 0) goto L_0x0011
            if (r6 == 0) goto L_0x0377
            java.lang.Object r2 = r4.getValue()
            android.app.Dialog r2 = (android.app.Dialog) r2
            r1 = 13
            X.OgJ r0 = new X.OgJ
            r0.<init>(r5, r1)
            r2.setOnShowListener(r0)
        L_0x0377:
            X.G9w.A1Y(r4)
            goto L_0x0011
        L_0x037c:
            r6 = 0
            goto L_0x0334
        L_0x037e:
            X.0eM r4 = r5.A0X
            java.lang.Object r0 = r4.getValue()
            android.app.Dialog r0 = (android.app.Dialog) r0
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0011
            android.content.Context r3 = r5.A0C
            r2 = 2131972465(0x7f135171, float:1.9581938E38)
            r1 = 1
            java.lang.String r0 = X.2Yu.A0K(r3)
            java.lang.String r0 = X.DbW.A0h(r3, r0, r2)
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r1)
            r0.show()
            boolean r0 = r3 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0011
            android.app.Activity r3 = (android.app.Activity) r3
            if (r3 == 0) goto L_0x0011
            boolean r0 = r3.isFinishing()
            if (r0 != 0) goto L_0x0011
            X.AnonymousClass7TF.A1N(r4)
            goto L_0x0011
        L_0x03b4:
            com.instagram.igds.components.search.IgdsInlineSearchBox r0 = (com.instagram.igds.components.search.IgdsInlineSearchBox) r0
            java.lang.Object r1 = A00(r0, r2)
            X.PMC r1 = (X.PMC) r1
            X.PHe r1 = r1.A00
            r0.A02 = r1
            goto L_0x0011
        L_0x03c2:
            java.lang.String r1 = X.C41847B3o.A1E(r0)
            java.lang.Object r0 = r2.A01
            X.PMC r0 = (X.PMC) r0
            X.0eM r0 = r0.A04
            java.lang.Object r2 = r0.getValue()
            com.instagram.igds.components.search.IgdsInlineSearchBox r2 = (com.instagram.igds.components.search.IgdsInlineSearchBox) r2
            java.lang.String r0 = "="
            java.lang.String r1 = X.00l.A0L(r1, r0, r1)
            com.instagram.ui.text.backinterceptedittext.BackInterceptEditText r0 = r2.A0E
            r0.setText(r1)
            r0.requestFocus()
            goto L_0x0011
        L_0x03e2:
            X.86R r0 = (X.AnonymousClass86R) r0
            java.lang.Object r5 = A00(r0, r2)
            X.Neg r5 = (X.C69101Neg) r5
            r5.A01 = r0
            goto L_0x0459
        L_0x03ed:
            com.instagram.camera.effect.models.CameraAREffect r0 = (com.instagram.camera.effect.models.CameraAREffect) r0
            java.lang.Object r5 = r2.A01
            X.Neg r5 = (X.C69101Neg) r5
            r2 = 1
            if (r0 == 0) goto L_0x042f
            boolean r1 = r0.A0M()
            if (r1 != r2) goto L_0x042f
            X.0eM r4 = r5.A0C
            java.lang.Object r1 = r4.getValue()
            X.OKZ r1 = (X.OKZ) r1
            r3 = 0
            java.lang.String r2 = "rtc_multipeer_effect_permission_dialog_shown"
            X.0xa r1 = r1.A01
            boolean r1 = r1.getBoolean(r2, r3)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x042f
            java.lang.Object r3 = r4.getValue()
            X.OKZ r3 = (X.OKZ) r3
            r2 = 4
            X.Iw0 r1 = new X.Iw0
            r1.<init>(r2, r0, r5)
            android.app.Dialog r3 = r3.A00(r1)
            X.Ocu r2 = r5.A08
            java.lang.Integer r1 = X.AnonymousClass05K.A15
            X.PNW r0 = new X.PNW
            r0.<init>(r3, r1)
            r2.A05(r0)
            goto L_0x0011
        L_0x042f:
            X.C69101Neg.A00(r0, r5)
            goto L_0x0011
        L_0x0434:
            int r1 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r5 = r2.A01
            X.OdY r5 = (X.C71135OdY) r5
            X.Pry r0 = r5.A01
            X.N9e r0 = (X.C68291N9e) r0
            if (r0 == 0) goto L_0x047d
            float r3 = (float) r1
            com.instagram.camera.effect.models.CameraAREffect r2 = r0.A01
            boolean r1 = r0.A03
            boolean r0 = r0.A02
            X.N9e r4 = new X.N9e
            r4.<init>(r2, r3, r1, r0)
            goto L_0x0478
        L_0x044f:
            X.86S r0 = (X.AnonymousClass86S) r0
            java.lang.Object r5 = A00(r0, r2)
            X.Neg r5 = (X.C69101Neg) r5
            r5.A00 = r0
        L_0x0459:
            X.86R r1 = r5.A01
            X.86R r0 = X.AnonymousClass86R.OPEN
            if (r1 != r0) goto L_0x0466
            X.86S r1 = r5.A00
            X.86S r0 = X.AnonymousClass86S.CLOSED
            r3 = 1
            if (r1 == r0) goto L_0x0467
        L_0x0466:
            r3 = 0
        L_0x0467:
            X.Pry r0 = r5.A01
            X.N9e r0 = (X.C68291N9e) r0
            if (r0 == 0) goto L_0x047d
            com.instagram.camera.effect.models.CameraAREffect r2 = r0.A01
            boolean r1 = r0.A03
            float r0 = r0.A00
            X.N9e r4 = new X.N9e
            r4.<init>(r2, r0, r1, r3)
        L_0x0478:
            r5.A0J(r4)
            goto L_0x0011
        L_0x047d:
            r4 = 0
            goto L_0x0478
        L_0x047f:
            android.view.MotionEvent r0 = (android.view.MotionEvent) r0
            r4 = 0
            X.0qQ.A0B(r0, r4)
            java.lang.Object r3 = r2.A01
            android.view.View r3 = (android.view.View) r3
            android.graphics.RectF r1 = X.0nA.A01
            X.0qQ.A0B(r3, r4)
            r2 = 0
        L_0x048f:
            android.view.ViewParent r1 = r3.getParent()
            boolean r1 = r1 instanceof android.view.View
            if (r1 == 0) goto L_0x0011
            if (r2 != 0) goto L_0x0011
            android.view.View r3 = X.JTR.A0U(r3)
            boolean r2 = r3.onTouchEvent(r0)
            goto L_0x048f
        L_0x04a2:
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x0011
            java.lang.Object r0 = r2.A01
            X.NgG r0 = (X.NgG) r0
            r0.A01()
            goto L_0x0011
        L_0x04b1:
            com.instagram.rtc.statemodel.RtcSettingsParticipant r0 = (com.instagram.rtc.statemodel.RtcSettingsParticipant) r0
            java.lang.Object r1 = A00(r0, r2)
            X.PM9 r1 = (X.PM9) r1
            X.OA7 r1 = r1.A01
            java.lang.String r6 = r0.A05
            int r0 = r0.A00
            if (r0 != 0) goto L_0x0011
            if (r6 == 0) goto L_0x0011
            X.NeS r5 = r1.A00
            X.Ocu r1 = r5.A03
            X.PNz r0 = X.C72889PNz.A00
            r1.A05(r0)
            com.instagram.common.session.UserSession r4 = r5.A02
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            X.1a0 r0 = X.C46447Df9.A03()
            X.1a1 r2 = r0.A01
            X.0iw r0 = r5.A01
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "cowatch"
            X.Dfc r0 = X.C46548Dgp.A01(r4, r6, r0, r1)
            com.instagram.profile.intf.UserDetailLaunchConfig r0 = r0.A04()
            android.os.Bundle r1 = r2.A01(r4, r0)
            android.app.Activity r2 = r5.A00
            java.lang.String r0 = "profile"
            X.6W8 r1 = X.DbS.A0b(r2, r1, r4, r3, r0)
            android.content.Context r0 = r2.getApplicationContext()
            r1.A0C(r0)
            goto L_0x0011
        L_0x04fb:
            X.HPh r0 = (X.C54702HPh) r0
            boolean r1 = r0 instanceof X.HE7
            if (r1 == 0) goto L_0x0517
            java.lang.Object r2 = r2.A01
            X.H1x r2 = (X.C54177H1x) r2
            X.HE7 r0 = (X.HE7) r0
            boolean r1 = r0.A00
            X.H3x r0 = r2.A02
            if (r0 != 0) goto L_0x0621
            java.lang.String r11 = "adapter"
        L_0x050f:
            X.0qQ.A0F(r11)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0517:
            boolean r1 = r0 instanceof X.HE6
            if (r1 == 0) goto L_0x0011
            java.lang.Object r3 = r2.A01
            X.H1x r3 = (X.C54177H1x) r3
            X.HE6 r0 = (X.HE6) r0
            boolean r5 = r0.A01
            java.util.List r8 = r0.A00
            java.util.ArrayList r2 = X.00k.A0U(r8)
            X.H3x r0 = r3.A02
            java.lang.String r11 = "adapter"
            if (r0 == 0) goto L_0x050f
            r7 = 0
            r0.A02 = r7
            boolean r0 = r3.A07
            r6 = 1
            if (r0 == 0) goto L_0x0585
            boolean r0 = X.AnonymousClass7TE.A1b(r8)
            if (r0 == 0) goto L_0x0585
            com.instagram.common.session.UserSession r0 = r3.A02()
            boolean r0 = X.I31.A01(r0)
            java.lang.String r4 = "profile_user_id"
            if (r0 == 0) goto L_0x055b
            android.os.Bundle r0 = r3.requireArguments()
            java.lang.String r1 = r0.getString(r4)
            com.instagram.common.session.UserSession r0 = r3.A02()
            boolean r0 = X.C51966G9m.A1W(r0, r1)
            if (r0 != 0) goto L_0x0585
        L_0x055b:
            com.instagram.common.session.UserSession r0 = r3.A02()
            boolean r0 = X.I31.A00(r0)
            if (r0 == 0) goto L_0x0577
            android.os.Bundle r0 = r3.requireArguments()
            java.lang.String r1 = r0.getString(r4)
            com.instagram.common.session.UserSession r0 = r3.A02()
            boolean r0 = X.C51966G9m.A1W(r0, r1)
            if (r0 == 0) goto L_0x0585
        L_0x0577:
            X.HMw r9 = X.C54665HMw.NEW_COLLECTION
            java.lang.String r4 = "new_collection"
            java.lang.String r1 = "New collection"
            com.instagram.save.model.SavedCollection r0 = new com.instagram.save.model.SavedCollection
            r0.<init>(r9, r4, r1)
            r2.add(r0)
        L_0x0585:
            com.instagram.common.session.UserSession r9 = r3.A02()
            X.0Tu r4 = X.0Tu.A05
            r0 = 36324024481230519(0x810c8200042eb7, double:3.0347975748121563E-306)
            boolean r0 = X.182.A06(r4, r9, r0)
            if (r0 == 0) goto L_0x05fc
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.lang.String r9 = X.C54177H1x.A00(r3)
            com.instagram.common.session.UserSession r0 = r3.A02()
            boolean r10 = X.C51966G9m.A1W(r0, r9)
            java.util.Iterator r9 = r2.iterator()
        L_0x05aa:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x05fb
            java.lang.Object r2 = r9.next()
            com.instagram.save.model.SavedCollection r2 = (com.instagram.save.model.SavedCollection) r2
            boolean r0 = r3.A07
            if (r0 != 0) goto L_0x05d1
            boolean r0 = r3.A05
            if (r0 != 0) goto L_0x05d1
            boolean r0 = r2.A06()
            if (r0 == 0) goto L_0x05d1
            com.instagram.common.session.UserSession r0 = r3.A02()
            java.lang.String r0 = r0.A06
            boolean r0 = r2.A07(r0)
            if (r0 != 0) goto L_0x05d1
            goto L_0x05aa
        L_0x05d1:
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x05e4
            if (r10 == 0) goto L_0x05e4
            com.instagram.common.session.UserSession r0 = r3.A02()
            java.lang.String r0 = r0.A06
            boolean r0 = r2.A07(r0)
            if (r0 != 0) goto L_0x05e4
            goto L_0x05aa
        L_0x05e4:
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x05f7
            if (r10 != 0) goto L_0x05f7
            com.instagram.common.session.UserSession r0 = r3.A02()
            java.lang.String r0 = r0.A06
            boolean r0 = r2.A07(r0)
            if (r0 == 0) goto L_0x05f7
            goto L_0x05aa
        L_0x05f7:
            r1.add(r2)
            goto L_0x05aa
        L_0x05fb:
            r2 = r1
        L_0x05fc:
            X.H3x r1 = r3.A02
            if (r1 == 0) goto L_0x050f
            X.HAi r0 = r1.A04
            r0.A04()
            r0.A0A(r2)
            X.C54228H3x.A00(r1)
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x0614
            r3.A03 = r6
            X.Dbb.A0u(r3)
        L_0x0614:
            if (r5 == 0) goto L_0x0619
            X.C54177H1x.A01(r3)
        L_0x0619:
            X.2qi r0 = r3.A00
            if (r0 != 0) goto L_0x0652
            java.lang.String r11 = "quickPromotionDelegate"
            goto L_0x050f
        L_0x0621:
            r3 = 0
            r0.A02 = r3
            X.3Ar r0 = r2.getScrollingViewProxy()
            X.3As r0 = (X.C238143As) r0
            boolean r0 = r0.CaY()
            if (r0 == 0) goto L_0x0639
            X.3Ar r0 = r2.getScrollingViewProxy()
            X.3As r0 = (X.C238143As) r0
            r0.setIsLoading(r3)
        L_0x0639:
            if (r1 == 0) goto L_0x063e
            X.C54177H1x.A01(r2)
        L_0x063e:
            boolean r0 = r2.isResumed()
            if (r0 == 0) goto L_0x0011
            androidx.fragment.app.FragmentActivity r2 = r2.getActivity()
            r1 = 2131956760(0x7f131418, float:1.9550085E38)
            java.lang.String r0 = "save_home_fetch_request_failed"
            X.C59689JTv.A01(r2, r0, r1, r3)
            goto L_0x0011
        L_0x0652:
            r0.Dh3()
            java.util.Iterator r8 = r8.iterator()
        L_0x0659:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x066d
            java.lang.Object r0 = r8.next()
            com.instagram.save.model.SavedCollection r0 = (com.instagram.save.model.SavedCollection) r0
            X.HMw r1 = r0.A07
            X.HMw r0 = X.C54665HMw.ALL_MEDIA_AUTO_COLLECTION
            if (r1 != r0) goto L_0x0659
            r3.A04 = r6
        L_0x066d:
            X.3Ar r0 = r3.getScrollingViewProxy()
            X.3As r0 = (X.C238143As) r0
            boolean r0 = r0.CaY()
            if (r0 == 0) goto L_0x0682
            X.3Ar r0 = r3.getScrollingViewProxy()
            X.3As r0 = (X.C238143As) r0
            r0.setIsLoading(r7)
        L_0x0682:
            boolean r0 = r3.A07
            if (r0 != 0) goto L_0x06cd
            boolean r0 = r3.A06
            if (r0 != 0) goto L_0x06cd
            com.instagram.common.session.UserSession r0 = r3.A02()
            X.0xa r1 = X.AnonymousClass7TE.A0q(r0)
            java.lang.String r0 = "has_seen_public_collections_modal_nux"
            boolean r0 = r1.getBoolean(r0, r7)
            if (r0 != 0) goto L_0x06cd
            com.instagram.common.session.UserSession r0 = r3.A02()
            boolean r0 = X.I31.A01(r0)
            if (r0 == 0) goto L_0x06cd
            X.8ab r1 = X.Dba.A0I(r3)
            r0 = 2131972627(0x7f135213, float:1.9582267E38)
            r1.A09(r0)
            r0 = 2131972626(0x7f135212, float:1.9582265E38)
            r1.A08(r0)
            r0 = 2131237556(0x7f081ab4, float:1.8091366E38)
            r1.A07(r0)
            X.OgA r0 = X.C71245OgA.A00
            r1.A0E(r0)
            r1.A0r(r6)
            r1.A0s(r6)
            r0 = 14
            X.C71252OgJ.A00(r1, r3, r0)
            X.DbT.A1V(r1)
        L_0x06cd:
            if (r5 == 0) goto L_0x0011
            java.lang.String r1 = r3.getModuleName()
            r0 = 3918(0xf4e, float:5.49E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0011
            boolean r0 = X.DbT.A1b(r2)
            if (r0 == 0) goto L_0x0011
            com.instagram.common.session.UserSession r2 = r3.A02()
            r0 = 36321185508172957(0x8109ed0009249d, double:3.033002196818927E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            if (r0 == 0) goto L_0x0011
            androidx.recyclerview.widget.RecyclerView r1 = r3.getRecyclerView()
            X.PXe r0 = new X.PXe
            r0.<init>(r3)
            r1.post(r0)
            goto L_0x0011
        L_0x0702:
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r1 = r2.A01
            X.H0q r1 = (X.C54146H0q) r1
            X.0eM r1 = r1.A03
            java.lang.Object r1 = r1.getValue()
            X.Ggb r1 = (X.C52984Ggb) r1
            X.05G r9 = r1.A01
        L_0x0716:
            java.lang.Object r10 = r9.getValue()
            r1 = r10
            X.JwG r1 = (X.C61078JwG) r1
            java.lang.Object r14 = r1.A00
            X.JwL r14 = (X.C61083JwL) r14
            if (r14 == 0) goto L_0x0779
            java.lang.Object r1 = r14.A01
            X.Gm0 r1 = (X.C53314Gm0) r1
            if (r1 == 0) goto L_0x0779
            java.lang.String r13 = r1.A04
            com.instagram.schools.management.data.SchoolAddress r12 = r1.A02
            int r11 = r1.A00
            int r8 = r1.A01
            X.62P r7 = r1.A06
            boolean r6 = r1.A09
            boolean r5 = r1.A08
            java.lang.String r3 = r1.A03
            X.62P r2 = r1.A07
            X.AnonymousClass7TF.A1H(r13, r12)
            r1 = 8
            X.0qQ.A0B(r3, r1)
            X.Gm0 r4 = new X.Gm0
            r24 = r6
            r25 = r5
            r15 = r4
            r16 = r12
            r17 = r13
            r18 = r0
            r19 = r3
            r20 = r7
            r21 = r2
            r22 = r11
            r23 = r8
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
        L_0x075d:
            java.lang.Object r2 = r14.A00
            java.lang.Integer r2 = (java.lang.Integer) r2
            r1 = 1
            X.0qQ.A0B(r2, r1)
            X.JwL r3 = new X.JwL
            r3.<init>((X.C53314Gm0) r4, (java.lang.Integer) r2)
            r2 = 39
            X.JwG r1 = new X.JwG
            r1.<init>((X.C61083JwL) r3, (int) r2)
            boolean r1 = r9.AIY(r10, r1)
            if (r1 == 0) goto L_0x0716
            goto L_0x0011
        L_0x0779:
            r4 = 0
            goto L_0x075d
        L_0x077b:
            X.3lr r0 = (X.C250663lr) r0
            r5 = 0
            X.0qQ.A0B(r0, r5)
            java.lang.Object r1 = r2.A01
            X.Hrd r1 = (X.C56031Hrd) r1
            X.05G r4 = r1.A01
        L_0x0787:
            java.lang.Object r6 = r4.getValue()
            r7 = r6
            X.GnQ r7 = (X.C53393GnQ) r7
            java.lang.String r1 = "student_email"
            java.lang.String r10 = r0.getOptionalStringField(r5, r1)
            r2 = 3
            java.lang.String r1 = "graduation_month"
            java.lang.Integer r8 = X.C41846B3n.A0g(r0, r1, r2)
            r1 = 1393(0x571, float:1.952E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            int r1 = r0.A00(r1)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            java.lang.Class<com.instagram.schools.management.data.UserSchoolEligibilityResponseImpl$XdtUserSchoolEligibility$PreviousRegistrationAttemptInfo$School> r3 = com.instagram.schools.management.data.UserSchoolEligibilityResponseImpl.XdtUserSchoolEligibility.PreviousRegistrationAttemptInfo.School.class
            r2 = -2022516561(0xffffffff8772d8af, float:-1.8269734E-34)
            java.lang.String r1 = "school"
            X.3lr r2 = r0.A02(r3, r1, r2)
            if (r2 == 0) goto L_0x07cf
            java.lang.String r1 = "strong_id__"
            java.lang.String r11 = r2.getRequiredStringField(r5, r1)
            X.DbS.A1Y(r11)
        L_0x07bf:
            r12 = 130917(0x1ff65, float:1.83454E-40)
            r13 = r5
            X.GnQ r1 = X.C53393GnQ.A00((com.google.common.collect.ImmutableList) null, (com.google.common.collect.ImmutableList) null, (com.google.common.collect.ImmutableList) null, (X.HM5) null, (X.HM6) null, (X.C54635HLs) null, r7, r8, r9, (java.lang.String) null, r10, r11, (java.lang.String) null, (java.lang.String) null, r12, r13)
            boolean r1 = r4.AIY(r6, r1)
            if (r1 == 0) goto L_0x0787
            goto L_0x0011
        L_0x07cf:
            r11 = 0
            goto L_0x07bf
        L_0x07d1:
            java.lang.String r0 = (java.lang.String) r0
            r7 = 0
            X.0qQ.A0B(r0, r7)
            java.lang.Object r6 = r2.A01
            X.H0x r6 = (X.C54153H0x) r6
            X.GhR r1 = r6.A05()
            X.05G r5 = r1.A01
        L_0x07e1:
            java.lang.Object r4 = r5.getValue()
            r3 = r4
            X.JwL r3 = (X.C61083JwL) r3
            java.lang.Object r1 = r3.A00
            X.GnQ r1 = (X.C53393GnQ) r1
            r9 = 0
            r13 = 130943(0x1ff7f, float:1.8349E-40)
            r10 = r9
            r11 = r9
            r8 = r1
            r12 = r0
            r14 = r7
            X.GnQ r2 = X.C53393GnQ.A00((com.google.common.collect.ImmutableList) null, (com.google.common.collect.ImmutableList) null, (com.google.common.collect.ImmutableList) null, (X.HM5) null, (X.HM6) null, (X.C54635HLs) null, r8, r9, r10, (java.lang.String) null, r11, r12, (java.lang.String) null, (java.lang.String) null, r13, r14)
            java.lang.Object r1 = r3.A01
            java.lang.Integer r1 = (java.lang.Integer) r1
            X.JwL r1 = X.C61083JwL.A00(r2, r1)
            boolean r1 = r5.AIY(r4, r1)
            if (r1 == 0) goto L_0x07e1
            X.0eM r1 = r6.A01
            java.lang.Object r2 = r1.getValue()
            X.INA r2 = (X.INA) r2
            X.GnQ r1 = X.C53035GhR.A00(r6)
            X.HOd r5 = r1.A00
            X.HOp r4 = X.C54153H0x.A00(r6)
            X.GnQ r1 = X.C53035GhR.A00(r6)
            java.lang.String r3 = r1.A0E
            X.C51973G9u.A1E(r5, r4, r3)
            com.instagram.common.session.UserSession r1 = r2.A00
            X.0wc r2 = X.AnonymousClass0kN.A01(r2, r1)
            java.lang.String r1 = "ig_school_registration_multi_school_selected"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r2.isSampled()
            if (r1 == 0) goto L_0x0011
            java.lang.String r1 = "entrypoint"
            r2.A8M(r5, r1)
            java.lang.String r1 = "surface"
            r2.A8M(r4, r1)
            java.lang.String r1 = "waterfall_id"
            r2.AAJ(r1, r3)
            java.lang.String r1 = "school_selected"
            r2.AAJ(r1, r0)
            X.DbX.A1L(r2)
            goto L_0x0011
        L_0x084d:
            java.lang.String r0 = (java.lang.String) r0
            r5 = 0
            X.0qQ.A0B(r0, r5)
            java.lang.Object r1 = r2.A01
            X.H0x r1 = (X.C54153H0x) r1
            X.GhR r1 = r1.A05()
            X.05G r4 = r1.A01
            java.lang.Object r1 = r4.getValue()
            X.JwL r1 = (X.C61083JwL) r1
            java.lang.Object r1 = r1.A00
            X.GnQ r1 = (X.C53393GnQ) r1
            com.google.common.collect.ImmutableList r1 = r1.A02
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r6 = r1.iterator()
        L_0x0871:
            boolean r1 = r6.hasNext()
            r8 = 0
            if (r1 == 0) goto L_0x0895
            java.lang.Object r3 = r6.next()
            r1 = r3
            com.instagram.schools.management.data.SchoolInfo r1 = (com.instagram.schools.management.data.SchoolInfo) r1
            java.lang.String r2 = r1.A02
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r2 = X.DbT.A12(r1, r2)
            java.lang.String r1 = X.DbT.A12(r1, r0)
            boolean r1 = X.00l.A0d(r2, r1, r5)
            if (r1 == 0) goto L_0x0871
            r7.add(r3)
            goto L_0x0871
        L_0x0895:
            com.google.common.collect.ImmutableList r9 = X.O2U.A00(r7)
        L_0x0899:
            java.lang.Object r3 = r4.getValue()
            r1 = r3
            X.JwL r1 = (X.C61083JwL) r1
            java.lang.Object r14 = r1.A00
            X.GnQ r14 = (X.C53393GnQ) r14
            r22 = 130751(0x1febf, float:1.83221E-40)
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r15 = r8
            r16 = r8
            r17 = r8
            r18 = r8
            r19 = r8
            r20 = r0
            r21 = r8
            r23 = r5
            X.GnQ r2 = X.C53393GnQ.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r1 = r1.A01
            java.lang.Integer r1 = (java.lang.Integer) r1
            X.JwL r1 = X.C61083JwL.A00(r2, r1)
            boolean r1 = r4.AIY(r3, r1)
            if (r1 == 0) goto L_0x0899
            goto L_0x0011
        L_0x08ce:
            java.lang.String r0 = (java.lang.String) r0
            r5 = 0
            X.0qQ.A0B(r0, r5)
            java.lang.Object r1 = r2.A01
            X.H0x r1 = (X.C54153H0x) r1
            X.GhR r1 = r1.A05()
            X.Hrd r4 = r1.A00
            X.05G r3 = r4.A01
        L_0x08e0:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.GnQ r1 = (X.C53393GnQ) r1
            r7 = 0
            r11 = 131069(0x1fffd, float:1.83667E-40)
            r8 = r7
            r10 = r7
            r6 = r1
            r9 = r0
            r12 = r5
            X.GnQ r1 = X.C53393GnQ.A00((com.google.common.collect.ImmutableList) null, (com.google.common.collect.ImmutableList) null, (com.google.common.collect.ImmutableList) null, (X.HM5) null, (X.HM6) null, (X.C54635HLs) null, r6, r7, r8, (java.lang.String) null, r9, r10, (java.lang.String) null, (java.lang.String) null, r11, r12)
            boolean r1 = r3.AIY(r2, r1)
            if (r1 == 0) goto L_0x08e0
            X.HM6 r0 = X.HM6.VALID
            r4.A01(r0)
            goto L_0x0011
        L_0x0901:
            X.HNJ r0 = (X.HNJ) r0
            java.lang.Object r5 = A00(r0, r2)
            X.H0x r5 = (X.C54153H0x) r5
            X.0eM r1 = r5.A00
            X.AnonymousClass7TF.A1N(r1)
            int r3 = r0.ordinal()
            r1 = 11
            if (r3 == r1) goto L_0x0959
            r1 = 7
            if (r3 == r1) goto L_0x094f
            r1 = 10
            if (r3 == r1) goto L_0x094f
        L_0x091d:
            switch(r3) {
                case 1: goto L_0x0937;
                case 2: goto L_0x093a;
                case 3: goto L_0x093d;
                case 4: goto L_0x0940;
                case 5: goto L_0x0943;
                case 6: goto L_0x0946;
                case 7: goto L_0x0949;
                case 8: goto L_0x0920;
                case 9: goto L_0x094c;
                default: goto L_0x0920;
            }
        L_0x0920:
            X.HOm r2 = X.C54681HOm.UNKNOWN
        L_0x0922:
            X.HOm r1 = X.C54681HOm.UNKNOWN
            if (r2 != r1) goto L_0x0935
            java.lang.String r1 = "Unmapped GraphQLXDTStartValidationError: "
            java.lang.String r0 = r0.name()
            java.lang.String r0 = X.002.A0R(r1, r0)
        L_0x0930:
            r5.A0A(r2, r0)
            goto L_0x0011
        L_0x0935:
            r0 = 0
            goto L_0x0930
        L_0x0937:
            X.HOm r2 = X.C54681HOm.EMAIL_ALREADY_REGISTERED
            goto L_0x0922
        L_0x093a:
            X.HOm r2 = X.C54681HOm.EXPIRED_OTP_CODE
            goto L_0x0922
        L_0x093d:
            X.HOm r2 = X.C54681HOm.INVALID_AFFILIATION_ID
            goto L_0x0922
        L_0x0940:
            X.HOm r2 = X.C54681HOm.INVALID_EMAIL
            goto L_0x0922
        L_0x0943:
            X.HOm r2 = X.C54681HOm.INVALID_EMAIL_FORMAT
            goto L_0x0922
        L_0x0946:
            X.HOm r2 = X.C54681HOm.INVALID_OTP_CODE
            goto L_0x0922
        L_0x0949:
            X.HOm r2 = X.C54681HOm.NETWORK_ERROR
            goto L_0x0922
        L_0x094c:
            X.HOm r2 = X.C54681HOm.RATE_LIMIT_REACHED
            goto L_0x0922
        L_0x094f:
            android.content.Context r2 = r5.requireContext()
            java.lang.String r1 = "network_error"
            X.C59689JTv.A0B(r2, r1)
            goto L_0x091d
        L_0x0959:
            X.8ab r4 = X.DbW.A0U(r5)
            r1 = 2131954750(0x7f130c3e, float:1.9546008E38)
            r4.A09(r1)
            r1 = 2131954751(0x7f130c3f, float:1.954601E38)
            r4.A08(r1)
            r3 = 2131961848(0x7f1327f8, float:1.9560404E38)
            r2 = 7
            X.Oey r1 = new X.Oey
            r1.<init>(r5, r2)
            r4.A0I(r1, r3)
            r2 = 2131963104(0x7f132ce0, float:1.9562952E38)
            X.OgB r1 = X.C71246OgB.A00
            r4.A0G(r1, r2)
            X.DbT.A1V(r4)
            X.HOm r2 = X.C54681HOm.USER_NOT_QUALIFIED
            goto L_0x0922
        L_0x0983:
            com.instagram.schools.management.data.BadgeVisibilitySettingItem r0 = (com.instagram.schools.management.data.BadgeVisibilitySettingItem) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r1 = r2.A01
            X.H0p r1 = (X.C54145H0p) r1
            X.0eM r1 = r1.A01
            java.lang.Object r1 = r1.getValue()
            X.Ggc r1 = (X.C52985Ggc) r1
            com.instagram.schools.management.data.SchoolSettingsRepository r1 = r1.A00
            X.05G r5 = r1.A03
        L_0x0999:
            java.lang.Object r6 = r5.getValue()
            r9 = r6
            X.JwL r9 = (X.C61083JwL) r9
            java.lang.Object r10 = r9.A01
            X.Gm0 r10 = (X.C53314Gm0) r10
            r11 = 0
            if (r10 == 0) goto L_0x0a01
            X.62P r1 = r10.A07
            if (r1 == 0) goto L_0x09d2
            java.util.ArrayList r8 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r7 = r1.iterator()
        L_0x09b3:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x09d5
            java.lang.Object r2 = r7.next()
            com.instagram.schools.management.data.BadgeVisibilitySettingItem r2 = (com.instagram.schools.management.data.BadgeVisibilitySettingItem) r2
            X.Uya r4 = r2.A00
            X.Uya r1 = r0.A00
            boolean r3 = X.AnonymousClass7TF.A1W(r4, r1)
            java.lang.String r2 = r2.A01
            com.instagram.schools.management.data.BadgeVisibilitySettingItem r1 = new com.instagram.schools.management.data.BadgeVisibilitySettingItem
            r1.<init>(r4, r2, r3)
            r8.add(r1)
            goto L_0x09b3
        L_0x09d2:
            r17 = r11
            goto L_0x09d9
        L_0x09d5:
            X.62O r17 = X.AnonymousClass62Q.A03(r8)
        L_0x09d9:
            java.lang.String r13 = r10.A04
            com.instagram.schools.management.data.SchoolAddress r12 = r10.A02
            int r8 = r10.A00
            int r7 = r10.A01
            X.62P r4 = r10.A06
            java.lang.String r14 = r10.A05
            boolean r3 = r10.A09
            boolean r2 = r10.A08
            java.lang.String r15 = r10.A03
            X.AnonymousClass7TF.A1H(r13, r12)
            r1 = 5
            X.AnonymousClass7TF.A1F(r14, r1, r15)
            X.Gm0 r11 = new X.Gm0
            r16 = r4
            r18 = r8
            r19 = r7
            r20 = r3
            r21 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x0a01:
            java.lang.Object r2 = r9.A00
            java.lang.Integer r2 = (java.lang.Integer) r2
            r1 = 1
            X.0qQ.A0B(r2, r1)
            X.JwL r1 = new X.JwL
            r1.<init>((X.C53314Gm0) r11, (java.lang.Integer) r2)
            boolean r1 = r5.AIY(r6, r1)
            if (r1 == 0) goto L_0x0999
            goto L_0x0011
        L_0x0a16:
            X.JPI r0 = (X.JPI) r0
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Object r0 = r0.getKey()
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x0011
            if (r0 == 0) goto L_0x0011
            goto L_0x0a2b
        L_0x0a27:
            r1 = 0
            X.0qQ.A0B(r0, r1)
        L_0x0a2b:
            java.lang.Object r1 = r2.A01
            X.C51965G9l.A1W(r1, r0)
            goto L_0x0011
        L_0x0a32:
            r8 = 0
            X.0qQ.A0B(r0, r8)
            java.lang.Object r2 = r2.A01
            X.H0z r2 = (X.C54155H0z) r2
            X.0eM r1 = r2.A0F
            java.lang.Object r1 = r1.getValue()
            X.GhG r1 = (X.C53025GhG) r1
            java.util.Map r1 = r1.A04
            java.lang.Object r5 = r1.get(r0)
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            if (r5 == 0) goto L_0x0011
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            X.0eM r0 = r2.A0B
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            r7 = 0
            java.lang.String r6 = "school_directory_message_button"
            r3 = r2
            X.F7B.A00(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0011
        L_0x0a5f:
            java.lang.Object r1 = r2.A01
            X.Odx r1 = (X.C71143Odx) r1
            X.0sP r1 = r1.A0W
            java.lang.Object r5 = r1.invoke(r0)
            return r5
        L_0x0a6a:
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x0a7d
            X.1X9 r0 = X.AnonymousClass38W.A00()
            X.1X8 r0 = (X.1X8) r0
            X.0eM r0 = r0.A07
            java.lang.Object r5 = r0.getValue()
            return r5
        L_0x0a7d:
            r5 = 0
            return r5
        L_0x0a7f:
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r6 = 0
            X.0qQ.A0B(r0, r6)
            java.lang.Object r5 = r2.A01
            X.PMC r5 = (X.PMC) r5
            android.content.Context r4 = r5.A01
            X.2tC r3 = X.AnonymousClass2t9.A00(r4)
            r1 = 17
            X.PqM r2 = new X.PqM
            r2.<init>(r5, r1)
            X.NNt r1 = new X.NNt
            r1.<init>(r2)
            X.2t9 r5 = X.DbU.A0U(r3, r1)
            int r3 = X.AnonymousClass7TH.A01(r4)
            int r2 = X.AnonymousClass7TG.A03(r4)
            X.GiO r1 = new X.GiO
            r1.<init>(r3, r2, r6, r6)
            r0.A11(r1)
            r0.setAdapter(r5)
            return r5
        L_0x0ab3:
            android.widget.AbsSpinner r0 = (android.widget.AbsSpinner) r0
            r4 = 0
            X.0qQ.A0B(r0, r4)
            java.lang.Object r3 = r2.A01
            X.PMC r3 = (X.PMC) r3
            android.content.Context r2 = r3.A01
            r1 = 17367043(0x1090003, float:2.5162934E-38)
            android.widget.ArrayAdapter r5 = new android.widget.ArrayAdapter
            r5.<init>(r2, r1)
            r0.setSelection(r4)
            X.PHe r1 = r3.A00
            r0.setOnItemSelectedListener(r1)
            r0.setAdapter(r5)
            return r5
        L_0x0ad3:
            X.Vd2 r0 = (X.C17733Vd2) r0
            r4 = 0
            X.0qQ.A0B(r0, r4)
            java.lang.Object r1 = r2.A01
            X.0lg r1 = (X.0lg) r1
            r3 = 0
            X.1NY r5 = X.DbU.A0M(r1)
            java.lang.Class<X.Nfc> r2 = X.C69153Nfc.class
            java.lang.Class<X.OR3> r1 = X.OR3.class
            goto L_0x0b2c
        L_0x0ae7:
            X.Vd2 r0 = (X.C17733Vd2) r0
            r4 = 0
            X.0qQ.A0B(r0, r4)
            java.lang.Object r1 = r2.A01
            X.0lg r1 = (X.0lg) r1
            r3 = 0
            X.1NY r5 = X.DbU.A0M(r1)
            java.lang.Class<X.Nfb> r2 = X.C69152Nfb.class
            java.lang.Class<X.OR6> r1 = X.OR6.class
            goto L_0x0b2c
        L_0x0afb:
            X.Vd2 r0 = (X.C17733Vd2) r0
            java.lang.Object r1 = A00(r0, r2)
            X.0lg r1 = (X.0lg) r1
            X.1NY r5 = X.DbU.A0M(r1)
            java.lang.Class<X.NfZ> r2 = X.C69150NfZ.class
            java.lang.Class<X.OR4> r1 = X.OR4.class
            r5.A0Q(r2, r1)
            X.C18242Vo9.A01(r5, r0)
            java.lang.String r1 = r0.A0B
            java.lang.String r0 = "q"
            r5.A9m(r0, r1)
            return r5
        L_0x0b19:
            X.Vd2 r0 = (X.C17733Vd2) r0
            r4 = 0
            X.0qQ.A0B(r0, r4)
            java.lang.Object r1 = r2.A01
            X.0lg r1 = (X.0lg) r1
            r3 = 0
            X.1NY r5 = X.DbU.A0M(r1)
            java.lang.Class<X.Nfa> r2 = X.C69151Nfa.class
            java.lang.Class<X.OR5> r1 = X.OR5.class
        L_0x0b2c:
            r5.A0O(r3, r2, r1, r4)
            X.C18242Vo9.A01(r5, r0)
            return r5
        L_0x0b33:
            X.Vd2 r0 = (X.C17733Vd2) r0
            java.lang.Object r1 = A00(r0, r2)
            X.0lg r1 = (X.0lg) r1
            X.1NY r5 = X.DbU.A0M(r1)
            java.lang.Class<X.Nfd> r2 = X.C69154Nfd.class
            java.lang.Class<X.OR7> r1 = X.OR7.class
            r5.A0Q(r2, r1)
            X.C18242Vo9.A01(r5, r0)
            return r5
        L_0x0b4a:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0b4f:
            java.lang.String r0 = "Crypto api is used before proxy is ready"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74180PqM.invoke(java.lang.Object):java.lang.Object");
    }
}
