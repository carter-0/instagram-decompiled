package X;

/* renamed from: X.9MC  reason: invalid class name */
public final class AnonymousClass9MC extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9MC(int i, Object obj, Object obj2, Object obj3) {
        super(1);
        this.A00 = i;
        this.A03 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v60, resolved type: X.4cc} */
    /* JADX WARNING: type inference failed for: r7v6, types: [java.lang.Object, X.5kr] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x064f, code lost:
        if (X.182.A06(X.0Tu.A05, r1.A00, 36318277814786116L) == false) goto L_0x0668;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0666, code lost:
        if (r2 == false) goto L_0x0668;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0676, code lost:
        if (X.C231512rn.A00(r5).A03(r6, r4.getModuleName()) == X.AnonymousClass4K5.ENDCARD_AUTOPLAY) goto L_0x0678;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0678, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x072f, code lost:
        if (X.182.A06(X.0Tu.A05, r3.A00, 2342159079416008604L) != false) goto L_0x0731;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0827, code lost:
        return java.lang.Boolean.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x090d, code lost:
        r2.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0c9f, code lost:
        r1.A07(r5, r2, r4.EJS(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0ca8, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0cb5, code lost:
        r1.A05(r5, 0.0f, r4, r6.EJS(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02c0, code lost:
        if (((X.AnonymousClass3Q2) r1.getValue()).A5g == false) goto L_0x0678;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0429, code lost:
        r1.A02(r3, r4);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0765  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0773  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x088f  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x08a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r45) {
        /*
            r44 = this;
            r0 = r44
            r1 = r45
            int r2 = r0.A00
            switch(r2) {
                case 0: goto L_0x0c85;
                case 1: goto L_0x0c5d;
                case 2: goto L_0x0c37;
                case 3: goto L_0x0bfa;
                case 4: goto L_0x067b;
                case 5: goto L_0x0bd6;
                case 6: goto L_0x0b9e;
                case 7: goto L_0x0ac5;
                case 8: goto L_0x09f8;
                case 9: goto L_0x09b9;
                case 10: goto L_0x098e;
                case 11: goto L_0x0978;
                case 12: goto L_0x095d;
                case 13: goto L_0x0940;
                case 14: goto L_0x084f;
                case 15: goto L_0x0828;
                case 16: goto L_0x080d;
                case 17: goto L_0x07e0;
                case 18: goto L_0x07ab;
                case 19: goto L_0x078b;
                case 20: goto L_0x00ff;
                case 21: goto L_0x06fe;
                case 22: goto L_0x06dd;
                case 23: goto L_0x06aa;
                case 24: goto L_0x0652;
                case 25: goto L_0x061e;
                case 26: goto L_0x05bf;
                case 27: goto L_0x05ac;
                case 28: goto L_0x0583;
                case 29: goto L_0x0570;
                case 30: goto L_0x0537;
                case 31: goto L_0x051a;
                case 32: goto L_0x04f5;
                case 33: goto L_0x04d2;
                case 34: goto L_0x04ad;
                case 35: goto L_0x0486;
                case 36: goto L_0x0468;
                case 37: goto L_0x0455;
                case 38: goto L_0x042e;
                case 39: goto L_0x036f;
                case 40: goto L_0x02c4;
                case 41: goto L_0x026a;
                case 42: goto L_0x01e1;
                case 43: goto L_0x0195;
                case 44: goto L_0x0109;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.5u7 r1 = (X.C298835u7) r1
            r5 = 0
            X.0qQ.A0B(r1, r5)
            java.lang.Object r7 = r0.A02
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            X.4hI r10 = X.C270774hH.A00(r7)
            java.util.List r2 = r1.Ao4()
            java.util.Iterator r6 = r2.iterator()
        L_0x001f:
            boolean r2 = r6.hasNext()
            r4 = 1
            if (r2 == 0) goto L_0x00ab
            java.lang.Object r3 = r6.next()
            r2 = r3
            X.4bN r2 = (X.C267324bN) r2
            X.1Xj r2 = r2.A02
            if (r2 == 0) goto L_0x001f
        L_0x0031:
            X.4bN r3 = (X.C267324bN) r3
            if (r3 == 0) goto L_0x0052
            X.1Xj r9 = r3.A02
            if (r9 == 0) goto L_0x0052
            X.1Gd r8 = X.1Gc.A00(r7)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = r9.A19()
            long r2 = r6.toMillis(r2)
            r8.A01(r2)
            r10.A01 = r9
            long r2 = android.os.SystemClock.elapsedRealtime()
            r10.A00 = r2
        L_0x0052:
            java.util.HashSet r3 = r10.A03
            r3.clear()
            java.util.List r2 = X.C270734hD.A01(r1)
            r3.addAll(r2)
            X.5o6 r6 = X.C295395o5.A00(r7)
            java.util.List r3 = X.C270734hD.A00(r1)
            X.5o7 r2 = X.C295415o7.PREFETCH_CACHE
            r6.A01(r2, r3)
            X.0qQ.A0B(r7, r5)
            X.0Tu r6 = X.0Tu.A05
            r2 = 36328250729381000(0x81105a00093c88, double:3.037470271160256E-306)
            boolean r2 = X.182.A06(r6, r7, r2)
            if (r2 != 0) goto L_0x0ca6
            r2 = 36323174077967321(0x810bbc00082bd9, double:3.034259776364211E-306)
            boolean r9 = X.182.A06(r6, r7, r2)
            java.lang.Object r6 = r0.A01
            X.93F r6 = (X.AnonymousClass93F) r6
            X.93C r3 = X.AnonymousClass93C.A04
            java.util.List r0 = r1.Ao4()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L_0x0097:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ad
            java.lang.Object r0 = r1.next()
            X.4bN r0 = (X.C267324bN) r0
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x0097
            r2.add(r0)
            goto L_0x0097
        L_0x00ab:
            r3 = 0
            goto L_0x0031
        L_0x00ad:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r2.iterator()
        L_0x00b6:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00fa
            java.lang.Object r2 = r8.next()
            r1 = r2
            X.1Xj r1 = (X.1Xj) r1
            boolean r0 = r1.CcK()
            if (r0 != 0) goto L_0x00b6
            boolean r0 = r1.CcK()
            if (r0 != 0) goto L_0x00b6
            java.util.List r0 = r1.A3b()
            if (r0 == 0) goto L_0x00de
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r4) goto L_0x00de
            goto L_0x00b6
        L_0x00de:
            if (r9 == 0) goto L_0x00f6
            X.1Xy r0 = r1.A0C
            X.1sQ r0 = r0.getClipsMetadata()
            if (r0 == 0) goto L_0x00f6
            java.lang.Boolean r1 = r0.Axb()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00b6
        L_0x00f6:
            r7.add(r2)
            goto L_0x00b6
        L_0x00fa:
            r6.A9J(r3, r7, r5)
            goto L_0x0ca6
        L_0x00ff:
            r1 = 0
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0109:
            java.lang.String r1 = (java.lang.String) r1
            r3 = 0
            X.0qQ.A0B(r1, r3)
            java.lang.Object r6 = r0.A02
            X.0iw r6 = (X.AnonymousClass0iw) r6
            java.lang.Object r2 = r0.A03
            X.0lg r2 = (X.0lg) r2
            java.lang.Object r0 = r0.A01
            X.1Xj r0 = (X.1Xj) r0
            java.lang.String r5 = r0.getId()
            if (r5 == 0) goto L_0x018d
            X.GKd r4 = X.C52236GKd.A1U
            X.0qQ.A0B(r6, r3)
            r0 = 1
            X.0qQ.A0B(r2, r0)
            X.0wc r3 = X.AnonymousClass0kN.A01(r6, r2)
            r0 = 2876(0xb3c, float:4.03E-42)
            java.lang.String r2 = X.C273654mx.A00(r0)
            X.0kJ r0 = r3.A00
            X.0Aj r2 = r3.A00(r0, r2)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0ca6
            java.lang.String r3 = r6.getModuleName()
            java.lang.String r0 = "containermodule"
            r2.AAJ(r0, r3)
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r5)
            if (r0 == 0) goto L_0x018a
            long r5 = r0.longValue()
        L_0x0155:
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            java.lang.String r0 = "media_id"
            r2.A9F(r0, r3)
            r0 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = 322(0x142, float:4.51E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A8k(r0, r3)
            java.lang.String r0 = "viewer_session_id"
            r2.AAJ(r0, r1)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "nav_chain"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "action"
            r2.A8M(r4, r0)
            X.5OC r1 = X.AnonymousClass5OC.FEED_PREVIEW
            java.lang.String r0 = "action_source"
            r2.A8M(r1, r0)
            goto L_0x090d
        L_0x018a:
            r5 = 0
            goto L_0x0155
        L_0x018d:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0195:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r5 = r1.booleanValue()
            java.lang.Object r4 = r0.A01
            com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallConnectionEntity r4 = (com.instagram.rtc.signaling.models.RtcConnectionEntity.RtcCallConnectionEntity) r4
            X.Nid r3 = r4.A01
            X.Nid r2 = X.C69277Nid.NO_E2EE
            r1 = 0
            if (r3 == r2) goto L_0x01a7
            r1 = 1
        L_0x01a7:
            r14 = 0
            if (r1 != 0) goto L_0x01dd
            java.lang.String r13 = r4.A0J
        L_0x01ac:
            java.lang.Object r1 = r0.A03
            X.1XE r1 = (X.1XE) r1
            X.1XB r7 = r1.A04
            X.7Rj r6 = X.C331537Rj.MQTT_RING_NOTIFICATION
            java.lang.Object r0 = r0.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            java.lang.String r9 = r0.A06
            java.lang.String r12 = r4.A00()
            r10 = 0
            java.lang.String r11 = r4.A0H
            if (r5 == 0) goto L_0x01da
            java.lang.Integer r8 = X.AnonymousClass05K.A0j
        L_0x01c5:
            r15 = r10
            X.0xI r2 = X.1XB.A01(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r1 = "mqtt"
            r0 = 3825(0xef1, float:5.36E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0C(r0, r1)
            X.1XC.A00(r2, r9)
            goto L_0x0ca6
        L_0x01da:
            java.lang.Integer r8 = X.AnonymousClass05K.A0u
            goto L_0x01c5
        L_0x01dd:
            r13 = r14
            java.lang.String r14 = r4.A0E
            goto L_0x01ac
        L_0x01e1:
            X.9Yo r1 = (X.C380539Yo) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r5 = r0.A03
            X.6iU r5 = (X.C314576iU) r5
            java.lang.Object r4 = r0.A02
            X.6n9 r4 = (X.C317366n9) r4
            java.lang.Object r7 = r0.A01
            X.0iw r7 = (X.AnonymousClass0iw) r7
            X.2kA r0 = r5.A02
            java.lang.Object r6 = r0.getValue()
            X.6iS r6 = (X.C314556iS) r6
            X.05G r3 = r6.A0D
            java.lang.Object r0 = r3.getValue()
            X.6n9 r0 = (X.C317366n9) r0
            boolean r0 = r0.A0H
            if (r0 == 0) goto L_0x021c
            java.lang.Object r2 = r3.getValue()
            X.6n9 r2 = (X.C317366n9) r2
            r0 = 268435455(0xfffffff, float:2.5243547E-29)
            X.6n9 r0 = X.C317366n9.A00((X.AnonymousClass9JK) null, (X.AnonymousClass9JK) null, (X.C247733gp) null, (X.C317376nA) null, r2, (java.lang.CharSequence) null, (java.util.List) null, (java.util.List) null, 0, 0, 0, r0, false, false, false, false, false, false, false, false, false, false, false, false)
            r3.Epw(r0)
            X.Aed r0 = X.C40589Aed.A00
            X.C314556iS.A01(r0, r6)
        L_0x021c:
            X.9JK r0 = r4.A03
            if (r0 == 0) goto L_0x0ca6
            java.lang.String r6 = r0.A05
            java.lang.Object r3 = r0.A01
            com.instagram.common.typedurl.ImageUrl r3 = (com.instagram.common.typedurl.ImageUrl) r3
            java.lang.String r2 = r0.A03
            r0 = 3
            X.0qQ.A0B(r7, r0)
            X.0eM r0 = r1.A01
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r2)
            if (r6 == 0) goto L_0x0244
            X.0eM r0 = r1.A03
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r6)
        L_0x0244:
            if (r3 == 0) goto L_0x0251
            X.0eM r0 = r1.A02
            java.lang.Object r0 = r0.getValue()
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            r0.setUrl(r3, r7)
        L_0x0251:
            android.view.View r2 = r1.A00
            r1 = 35
            X.AOX r0 = new X.AOX
            r0.<init>((java.lang.Object) r5, (int) r1)
            X.AnonymousClass0fU.A00(r0, r2)
            X.3gp r1 = r4.A06
            if (r1 == 0) goto L_0x0ca6
            X.6nA r0 = r4.A07
            if (r0 == 0) goto L_0x0ca6
            r0.A00(r2, r1)
            goto L_0x0ca6
        L_0x026a:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r3 = r0.A01
            java.util.Set r3 = (java.util.Set) r3
            java.lang.Object r2 = r1.getValue()
            X.3Q2 r2 = (X.AnonymousClass3Q2) r2
            java.lang.String r2 = r2.A35
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L_0x06a7
            java.lang.Object r2 = r0.A03
            com.instagram.pendingmedia.store.PendingMediaStore r2 = (com.instagram.pendingmedia.store.PendingMediaStore) r2
            java.util.Set r3 = r2.A07
            java.lang.Object r2 = r1.getValue()
            X.3Q2 r2 = (X.AnonymousClass3Q2) r2
            java.lang.String r2 = r2.A35
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L_0x06a7
            java.lang.Object r2 = r1.getValue()
            X.3Q2 r2 = (X.AnonymousClass3Q2) r2
            X.1iA r2 = r2.A1G
            java.lang.Object r0 = r0.A02
            if (r2 != r0) goto L_0x06a7
            java.lang.Object r0 = r1.getValue()
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0
            X.3QD r2 = r0.A6J
            X.3QD r0 = X.AnonymousClass3QD.CONFIGURED
            if (r2 == r0) goto L_0x06a7
            java.lang.Object r0 = r1.getValue()
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0
            boolean r0 = r0.A5S
            if (r0 != 0) goto L_0x06a7
            java.lang.Object r0 = r1.getValue()
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0
            boolean r0 = r0.A5g
            if (r0 != 0) goto L_0x06a7
            goto L_0x0678
        L_0x02c4:
            X.2WE r1 = (X.2WE) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r5 = r0.A03
            X.3bF r5 = (X.C244473bF) r5
            java.lang.Integer r2 = r5.A09
            java.lang.Object[] r4 = new java.lang.Object[]{r2}
            r3 = 12
            X.JFx r2 = new X.JFx
            r2.<init>(r5, r3)
            r1.A02(r2, r4)
            java.lang.Boolean r2 = r5.A05
            java.lang.Object[] r4 = new java.lang.Object[]{r2}
            r3 = 13
            X.JFx r2 = new X.JFx
            r2.<init>(r5, r3)
            r1.A02(r2, r4)
            java.lang.Integer r2 = r5.A08
            java.lang.Object[] r6 = new java.lang.Object[]{r2}
            java.lang.Object r4 = r0.A01
            r3 = 37
            X.JG2 r2 = new X.JG2
            r2.<init>(r3, r4, r5)
            r1.A02(r2, r6)
            java.lang.CharSequence r2 = r5.A06
            java.lang.Object[] r4 = new java.lang.Object[]{r2}
            r3 = 14
            X.JFx r2 = new X.JFx
            r2.<init>(r5, r3)
            r1.A02(r2, r4)
            android.text.method.MovementMethod r2 = r5.A01
            java.lang.Object[] r4 = new java.lang.Object[]{r2}
            r3 = 15
            X.JFx r2 = new X.JFx
            r2.<init>(r5, r3)
            r1.A02(r2, r4)
            java.lang.Integer r2 = r5.A0B
            java.lang.Object[] r4 = new java.lang.Object[]{r2}
            r3 = 16
            X.JFx r2 = new X.JFx
            r2.<init>(r5, r3)
            r1.A02(r2, r4)
            java.lang.Integer r2 = r5.A0A
            java.lang.Object[] r4 = new java.lang.Object[]{r2}
            r3 = 17
            X.JFx r2 = new X.JFx
            r2.<init>(r5, r3)
            r1.A02(r2, r4)
            java.lang.Object r4 = r0.A02
            java.lang.Object[] r3 = new java.lang.Object[]{r4}
            r2 = 18
            X.JFx r0 = new X.JFx
            r0.<init>(r4, r2)
            r1.A02(r0, r3)
            android.text.TextUtils$TruncateAt r0 = r5.A00
            java.lang.Object[] r3 = new java.lang.Object[]{r0}
            r2 = 19
            X.JFx r0 = new X.JFx
            r0.<init>(r5, r2)
            r1.A02(r0, r3)
            java.lang.Float r0 = r5.A07
            java.lang.Object[] r4 = new java.lang.Object[]{r0}
            r0 = 11
            X.JFx r3 = new X.JFx
            r3.<init>(r5, r0)
            goto L_0x0429
        L_0x036f:
            X.2WE r1 = (X.2WE) r1
            r3 = 0
            X.0qQ.A0B(r1, r3)
            r2 = 28
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.Object r2 = r0.A03
            X.3aP r2 = (X.C243953aP) r2
            com.instagram.common.session.UserSession r5 = r2.A08
            r43 = r5
            com.instagram.user.model.User r5 = r2.A0H
            r42 = r5
            boolean r5 = r2.A0S
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r5)
            X.1Xj r5 = r2.A09
            r41 = r5
            X.0xF r5 = r2.A07
            r18 = r5
            java.lang.Integer r5 = r2.A0I
            r19 = r5
            com.instagram.search.common.analytics.SearchContext r5 = r2.A0A
            r17 = r5
            X.3aD r15 = r2.A0D
            X.3aF r14 = r2.A0C
            X.3aH r13 = r2.A0F
            X.3aJ r12 = r2.A0E
            boolean r5 = r2.A0N
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r5)
            boolean r5 = r2.A0U
            java.lang.Boolean r26 = java.lang.Boolean.valueOf(r5)
            boolean r5 = r2.A0T
            java.lang.Boolean r27 = java.lang.Boolean.valueOf(r5)
            boolean r5 = r2.A0R
            java.lang.Boolean r28 = java.lang.Boolean.valueOf(r5)
            X.0iw r11 = r2.A06
            X.3aT r10 = r2.A05
            java.lang.String r9 = r2.A0L
            X.3aO r8 = r2.A0G
            java.lang.Object r5 = r0.A01
            X.2Wa r5 = (X.2Wa) r5
            java.lang.Object r7 = r5.A03
            java.lang.Object r5 = r0.A02
            X.2Wa r5 = (X.2Wa) r5
            java.lang.Object r6 = r5.A03
            boolean r0 = r2.A0O
            java.lang.Boolean r35 = java.lang.Boolean.valueOf(r0)
            float r0 = r2.A01
            java.lang.Float r36 = java.lang.Float.valueOf(r0)
            int r0 = r2.A03
            java.lang.Integer r37 = java.lang.Integer.valueOf(r0)
            float r0 = r2.A00
            java.lang.Float r38 = java.lang.Float.valueOf(r0)
            int r0 = r2.A02
            java.lang.Integer r39 = java.lang.Integer.valueOf(r0)
            java.lang.Long r0 = r2.A0J
            r29 = r11
            r30 = r10
            r31 = r9
            r32 = r8
            r33 = r7
            r34 = r6
            r40 = r0
            r20 = r17
            r21 = r15
            r22 = r14
            r23 = r13
            r24 = r12
            r14 = r43
            r15 = r42
            r17 = r41
            java.lang.Object[] r6 = new java.lang.Object[]{r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40}
            r0 = 27
            java.lang.System.arraycopy(r6, r3, r4, r3, r0)
            java.lang.String r0 = r2.A0K
            java.lang.Object[] r7 = new java.lang.Object[]{r0}
            r6 = 27
            r0 = 1
            java.lang.System.arraycopy(r7, r3, r4, r6, r0)
            r0 = 33
            X.JG2 r3 = new X.JG2
            r3.<init>(r0, r5, r2)
        L_0x0429:
            r1.A02(r3, r4)
            goto L_0x0ca6
        L_0x042e:
            com.facebook.msys.mca.Mailbox r1 = (com.facebook.msys.mca.Mailbox) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r6 = r0.A03
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            java.lang.Object r5 = r0.A01
            X.0qQ.A0B(r6, r2)
            r2 = 1
            X.0qQ.A0B(r5, r2)
            X.5ob r4 = X.C295615oa.A01
            r3 = 5
            X.9LT r2 = new X.9LT
            r2.<init>(r5, r3)
            r4.A02(r2, r6)
            java.lang.Object r0 = r0.A02
            X.1xN r0 = (X.1xN) r0
            r1.addStoredProcedureChangedListener(r0)
            goto L_0x0ca6
        L_0x0455:
            android.location.Location r1 = (android.location.Location) r1
            java.lang.Object r3 = r0.A03
            X.1q5 r3 = (X.1q5) r3
            java.lang.Object r2 = r0.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r0 = r0.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            X.1q5.A00(r1, r2, r3, r0)
            goto L_0x0ca6
        L_0x0468:
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r2 = r0.A03
            X.3eL r2 = (X.C246293eL) r2
            com.instagram.common.session.UserSession r7 = r2.A00
            java.lang.Object r3 = r0.A02
            java.lang.Object r2 = r0.A01
            r0 = 43
            X.PqU r10 = new X.PqU
            r10.<init>((int) r0, (java.lang.Object) r3, (java.lang.Object) r1, (java.lang.Object) r2)
            r8 = 0
            r11 = 1
            X.3aW r6 = new X.3aW
            r9 = r8
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x0486:
            java.lang.Object r2 = r0.A01
            X.3Zt r2 = (X.C243673Zt) r2
            java.util.Timer r1 = new java.util.Timer
            r1.<init>()
            r2.A00(r1)
            X.AnonymousClass2VL.A00()
            java.lang.Object r3 = r2.A00
            java.util.Timer r3 = (java.util.Timer) r3
            java.lang.Object r1 = r0.A02
            X.2Wa r1 = (X.2Wa) r1
            X.Avg r2 = new X.Avg
            r2.<init>(r1)
            java.lang.Object r0 = r0.A03
            X.58W r0 = (X.AnonymousClass58W) r0
            long r0 = r0.A00
            r3.schedule(r2, r0)
            goto L_0x0ca6
        L_0x04ad:
            X.3ey r1 = (X.C246663ey) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r2 = r0.A03
            X.3dW r2 = (X.C245813dW) r2
            X.3Xd r2 = r2.A01
            X.3rX r8 = r2.BNF()
            java.lang.Object r2 = r0.A01
            X.1Xj r2 = (X.1Xj) r2
            java.lang.Object r0 = r0.A02
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            int r11 = r0.getPosition()
            X.4E0 r6 = new X.4E0
            r7 = r2
            r9 = r1
            r10 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x04d2:
            android.view.View r1 = (android.view.View) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r2 = r0.A03
            X.3dW r2 = (X.C245813dW) r2
            X.3Xd r2 = r2.A01
            X.4Gh r4 = r2.BR1()
            java.lang.Object r3 = r0.A01
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r2 = r0.A02
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            X.1Xy r0 = r3.A0C
            com.instagram.user.model.User r0 = r0.CCd()
            r4.DJK(r1, r3, r2, r0)
            goto L_0x0ca6
        L_0x04f5:
            X.8ZN r1 = (X.AnonymousClass8ZN) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r5 = r0.A01
            X.1Xj r5 = (X.1Xj) r5
            X.1Xy r2 = r5.A0C
            X.1sQ r4 = r2.getClipsMetadata()
            if (r4 == 0) goto L_0x0ca6
            java.lang.Object r3 = r0.A03
            X.3dW r3 = (X.C245813dW) r3
            java.lang.Object r2 = r0.A02
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            X.3Xd r0 = r3.A01
            X.3fJ r0 = r0.B5P()
            r0.D3b(r1, r4, r5, r2)
            goto L_0x0ca6
        L_0x051a:
            X.3Nk r1 = (X.C240983Nk) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r2 = r0.A03
            X.3dW r2 = (X.C245813dW) r2
            X.3Xd r2 = r2.A01
            X.3fB r3 = r2.BRN()
            java.lang.Object r2 = r0.A01
            X.1Xj r2 = (X.1Xj) r2
            java.lang.Object r0 = r0.A02
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            r3.DKC(r1, r2, r0)
            goto L_0x0ca6
        L_0x0537:
            java.lang.Object r5 = r0.A01
            X.0sa r5 = (X.C62320sa) r5
            if (r5 == 0) goto L_0x0565
            java.lang.Object r1 = r0.A03
            X.3qM r1 = (X.C253193qM) r1
            X.3Zt r4 = r1.A02
            if (r4 == 0) goto L_0x0565
            X.AnonymousClass2VL.A00()
            java.lang.Object r3 = r4.A00
            java.util.Set r3 = (java.util.Set) r3
            int r1 = r1.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            boolean r1 = r3.contains(r2)
            if (r1 != 0) goto L_0x0565
            X.AnonymousClass2VL.A00()
            java.lang.Object r1 = r4.A00
            java.util.Set r1 = (java.util.Set) r1
            r1.add(r2)
            r5.invoke()
        L_0x0565:
            java.lang.Object r0 = r0.A02
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0ca6
            r0.invoke()
            goto L_0x0ca6
        L_0x0570:
            java.lang.Object r1 = r0.A03
            X.3Zf r1 = (X.C243553Zf) r1
            X.3Wa r2 = r1.A02
            java.lang.Object r1 = r0.A02
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Object r0 = r0.A01
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            r2.D2U(r1, r0)
            goto L_0x0ca6
        L_0x0583:
            android.view.View r1 = (android.view.View) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r2 = r0.A03
            X.3Zn r2 = (X.C243613Zn) r2
            X.0eM r2 = r2.A07
            java.lang.Object r3 = r2.getValue()
            X.Htf r3 = (X.C56153Htf) r3
            java.lang.Object r2 = r0.A01
            X.3ZE r2 = (X.AnonymousClass3ZE) r2
            X.9IU r2 = (X.AnonymousClass9IU) r2
            java.lang.Object r2 = r2.A02
            X.GlT r2 = (X.C53281GlT) r2
            java.lang.Object r0 = r0.A02
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            int r0 = r0.getPosition()
            r3.A03(r1, r2, r0)
            goto L_0x0ca6
        L_0x05ac:
            java.lang.Object r1 = r0.A03
            X.3Zf r1 = (X.C243553Zf) r1
            X.3Wa r2 = r1.A02
            java.lang.Object r1 = r0.A01
            X.9cQ r1 = (X.C381829cQ) r1
            java.lang.Object r0 = r0.A02
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            X.C253153qI.A0C(r1, r2, r0)
            goto L_0x0ca6
        L_0x05bf:
            android.content.Context r1 = (android.content.Context) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r8 = r0.A01
            X.1Xj r8 = (X.1Xj) r8
            java.lang.Object r0 = r0.A02
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r7 = r0.getUsername()
            boolean r6 = X.AnonymousClass3ZI.A06(r8)
            long r4 = r8.A1A()
            double r2 = (double) r4
            java.lang.String r4 = X.1G0.A03(r1, r2)
            X.1iA r0 = r8.BR7()
            java.lang.String r2 = r0.name()
            java.util.Locale r0 = X.AnonymousClass1Q2.A02()
            java.lang.String r3 = r2.toLowerCase(r0)
            X.0qQ.A07(r3)
            if (r6 == 0) goto L_0x060e
            r2 = 2131969586(0x7f134632, float:1.95761E38)
            X.1Xy r0 = r8.A0C
            com.instagram.model.venue.LocationDictIntf r0 = r0.BNh()
            if (r0 == 0) goto L_0x0616
            java.lang.String r0 = r0.getName()
            java.lang.Object[] r0 = new java.lang.Object[]{r7, r3, r0, r4}
        L_0x0606:
            java.lang.String r6 = r1.getString(r2, r0)
            X.0qQ.A0A(r6)
            return r6
        L_0x060e:
            r2 = 2131969587(0x7f134633, float:1.9576101E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r7, r3, r4}
            goto L_0x0606
        L_0x0616:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x061e:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r2 = r1.booleanValue()
            java.lang.Object r1 = r0.A03
            X.3Xr r1 = (X.C243173Xr) r1
            java.lang.Object r6 = r0.A02
            X.1Xj r6 = (X.1Xj) r6
            com.instagram.common.session.UserSession r5 = r1.A00
            java.lang.Object r4 = r0.A01
            X.0iw r4 = (X.AnonymousClass0iw) r4
            if (r2 != 0) goto L_0x06a7
            X.0rQ r1 = X.C231512rn.A00(r5)
            r0 = 0
            X.0qQ.A0B(r6, r0)
            boolean r0 = r6.A55()
            if (r0 != 0) goto L_0x0668
            com.instagram.common.session.UserSession r3 = r1.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318277814786116(0x81074800011844, double:3.0311633598127475E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0678
            goto L_0x0668
        L_0x0652:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r2 = r1.booleanValue()
            java.lang.Object r1 = r0.A03
            X.3Xr r1 = (X.C243173Xr) r1
            java.lang.Object r6 = r0.A02
            X.1Xj r6 = (X.1Xj) r6
            com.instagram.common.session.UserSession r5 = r1.A00
            java.lang.Object r4 = r0.A01
            X.0iw r4 = (X.AnonymousClass0iw) r4
            if (r2 != 0) goto L_0x06a7
        L_0x0668:
            X.0rQ r1 = X.C231512rn.A00(r5)
            java.lang.String r0 = r4.getModuleName()
            X.4K5 r1 = r1.A03(r6, r0)
            X.4K5 r0 = X.AnonymousClass4K5.ENDCARD_AUTOPLAY
            if (r1 != r0) goto L_0x06a7
        L_0x0678:
            r3 = 1
            goto L_0x0823
        L_0x067b:
            java.lang.Object r2 = r0.A02
            boolean r2 = X.0qQ.A0K(r1, r2)
            if (r2 != 0) goto L_0x06a7
            java.lang.Object r2 = r0.A03
            X.5QY r2 = (X.AnonymousClass5QY) r2
            X.4e0 r2 = r2.A01
            boolean r2 = X.0qQ.A0K(r1, r2)
            if (r2 != 0) goto L_0x069f
            java.lang.Object r0 = r0.A01
            X.0sP r0 = (X.0sP) r0
            java.lang.Object r0 = r0.invoke(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r3 = r0.booleanValue()
            goto L_0x0823
        L_0x069f:
            java.lang.String r1 = "Focus search landed at the root."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x06a7:
            r3 = 0
            goto L_0x0823
        L_0x06aa:
            java.lang.String r1 = (java.lang.String) r1
            r3 = 0
            X.0qQ.A0B(r1, r3)
            java.lang.Object r8 = r0.A02
            com.instagram.feed.tifu.TifuViewModel r8 = (com.instagram.feed.tifu.TifuViewModel) r8
            java.lang.Object r2 = r0.A03
            X.33r r2 = (X.C2364233r) r2
            androidx.fragment.app.FragmentActivity r7 = r2.A00
            java.lang.Object r2 = r0.A01
            X.JFt r0 = new X.JFt
            r0.<init>(r2, r3)
            r6 = 1
            com.instagram.common.session.UserSession r5 = r8.A04
            X.0iw r4 = r8.A03
            X.JFt r3 = new X.JFt
            r3.<init>(r0, r6)
            r2 = 44
            X.PmN r0 = new X.PmN
            r0.<init>(r1, r8, r2)
            r8 = r4
            r9 = r5
            r10 = r1
            r11 = r0
            r12 = r3
            r13 = r6
            X.C56242Hv9.A00(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0ca6
        L_0x06dd:
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r4 = r0.A01
            X.4Cq r4 = (X.C262224Cq) r4
            java.lang.Object r3 = r0.A02
            java.lang.Object r0 = r0.A03
            r9 = 0
            r10 = 47
            X.MGl r2 = new X.MGl
            r5 = r2
            r6 = r0
            r7 = r3
            r8 = r1
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.String) r8, (X.AnonymousClass4D7) r9, (int) r10)
            X.19B r0 = X.19B.A00
            X.1Eo.A05(r0, r2, r4)
            goto L_0x0ca6
        L_0x06fe:
            java.lang.Object r1 = r0.A03
            X.3gm r1 = (X.C247703gm) r1
            com.instagram.common.session.UserSession r8 = r1.A00
            java.lang.Object r6 = r0.A01
            X.1Xj r6 = (X.1Xj) r6
            boolean r1 = X.AnonymousClass3YF.A00(r8, r6)
            X.32g r3 = X.C2360432f.A00(r8)
            r5 = 1
            if (r1 == 0) goto L_0x0731
            X.32g r2 = X.C2360432f.A00(r8)
            java.lang.Object r1 = r0.A02
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            boolean r1 = r2.A02(r6, r1)
            if (r1 != 0) goto L_0x0731
            com.instagram.common.session.UserSession r4 = r3.A00
            X.0Tu r3 = X.0Tu.A05
            r1 = 2342159079416008604(0x20810546000c0f9c, double:4.0622537451555894E-152)
            boolean r1 = X.182.A06(r3, r4, r1)
            r7 = 1
            if (r1 == 0) goto L_0x0732
        L_0x0731:
            r7 = 0
        L_0x0732:
            r4 = 0
            X.0qQ.A0B(r6, r5)
            boolean r1 = r6.A5n()
            if (r1 != 0) goto L_0x0789
            boolean r1 = r6.A5e()
            if (r1 != 0) goto L_0x0789
            X.0Tu r3 = X.0Tu.A05
            r1 = 36327563534023172(0x810fba00003a04, double:3.037035686048852E-306)
            boolean r1 = X.182.A06(r3, r8, r1)
            if (r1 != 0) goto L_0x075a
            r1 = 36327563534219783(0x810fba00033a07, double:3.0370356861731895E-306)
            boolean r1 = X.182.A06(r3, r8, r1)
            if (r1 == 0) goto L_0x0789
        L_0x075a:
            r2 = 1
            java.lang.Object r1 = r0.A02
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            r1.A3D = r4
            r1.A2C = r5
        L_0x0763:
            if (r7 == 0) goto L_0x076d
            java.lang.Object r1 = r0.A02
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            r1.A3D = r4
            r1.A2D = r5
        L_0x076d:
            boolean r1 = r6.A4c()
            if (r1 == 0) goto L_0x0779
            java.lang.Object r0 = r0.A02
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            r0.A3D = r4
        L_0x0779:
            if (r7 != 0) goto L_0x0784
            boolean r0 = r6.A4c()
            if (r0 != 0) goto L_0x0784
            if (r2 != 0) goto L_0x0784
            r5 = 0
        L_0x0784:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            return r6
        L_0x0789:
            r2 = 0
            goto L_0x0763
        L_0x078b:
            android.view.MotionEvent r1 = (android.view.MotionEvent) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r2 = r0.A03
            X.5bj r2 = (X.C288325bj) r2
            r3 = 1
            X.5bk r2 = r2.A00
            if (r2 == 0) goto L_0x079c
            r2.A02 = r3
        L_0x079c:
            java.lang.Object r2 = r0.A01
            android.view.GestureDetector r2 = (android.view.GestureDetector) r2
            r2.onTouchEvent(r1)
            java.lang.Object r0 = r0.A02
            X.0sP r0 = (X.0sP) r0
            r0.invoke(r1)
            goto L_0x0823
        L_0x07ab:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0ca6
            java.lang.Object r6 = r0.A01
            X.2Wa r6 = (X.2Wa) r6
            java.lang.Object r5 = r0.A03
            X.3hz r5 = (X.C248453hz) r5
            com.instagram.common.session.UserSession r1 = r5.A00
            X.5rt r4 = X.C297495rq.A00(r1)
            java.lang.Object r0 = r0.A02
            X.3gM r0 = (X.C247453gM) r0
            X.3ZH r0 = r0.A07
            X.1Xj r3 = r0.A01
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            com.instagram.api.schemas.MediaNoteMimicryTrigger r1 = com.instagram.api.schemas.MediaNoteMimicryTrigger.LIKE_TRIGGER
            X.4DU r0 = r5.A02
            java.lang.String r0 = r0.getModuleName()
            boolean r0 = r4.A00(r1, r3, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A01(r0)
            goto L_0x0ca6
        L_0x07e0:
            X.1Xj r1 = (X.1Xj) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r3 = r0.A03
            X.3yv r3 = (X.C258383yv) r3
            com.instagram.common.session.UserSession r7 = r3.A01
            X.3Dp r6 = X.C238833Dp.A00(r7)
            java.lang.Object r2 = r0.A01
            X.3rt r2 = (X.C254073rt) r2
            android.view.ViewGroup r5 = r2.A0J
            X.4DU r4 = r3.A04
            android.content.Context r3 = r3.A00
            java.lang.Object r0 = r0.A02
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            X.4HH r2 = new X.4HH
            r2.<init>(r3, r0, r7, r1)
            X.3e7 r0 = new X.3e7
            r0.<init>(r2, r7, r1, r4)
            r6.A0A(r5, r0)
            goto L_0x0ca6
        L_0x080d:
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            java.lang.Object r2 = r0.A01
            X.3YT r2 = (X.AnonymousClass3YT) r2
            java.lang.Object r1 = r0.A02
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Object r0 = r0.A03
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            boolean r3 = r2.Et3(r1, r0, r3)
        L_0x0823:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L_0x0828:
            android.view.View r1 = (android.view.View) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r2 = r0.A03
            X.3Yd r2 = (X.C243283Yd) r2
            java.lang.Object r5 = r0.A01
            X.1Xj r5 = (X.1Xj) r5
            java.lang.Object r4 = r0.A02
            X.4DU r4 = (X.AnonymousClass4DU) r4
            com.instagram.common.session.UserSession r3 = r2.A01
            X.3Dp r6 = X.C238833Dp.A00(r3)
            X.3Ds r0 = X.C238863Ds.USER_MESSAGE
            r6.A05(r1, r0)
            r2 = 0
            X.3e7 r0 = new X.3e7
            r0.<init>(r2, r3, r5, r4)
            r6.A0A(r1, r0)
            return r6
        L_0x084f:
            java.lang.Object r1 = r0.A03
            X.3gf r1 = (X.C247633gf) r1
            com.instagram.common.session.UserSession r6 = r1.A00
            java.lang.Object r5 = r0.A02
            X.1Xj r5 = (X.1Xj) r5
            java.lang.Object r1 = r0.A01
            X.0iw r1 = (X.AnonymousClass0iw) r1
            X.XSH r0 = X.XSH.PAGE_INSTAGRAM_STREAM
            X.Gal r4 = new X.Gal
            r4.<init>(r0, r1, r6)
            r0 = 0
            X.0qQ.A0B(r5, r0)
            r3 = 1
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r7 = X.C231122qu.A00(r6, r5)
            r11 = 0
            if (r7 == 0) goto L_0x0925
            com.instagram.api.schemas.OnFeedMessagesIntf r2 = r7.BTY()
            if (r2 == 0) goto L_0x0925
            int r1 = X.AnonymousClass3ZO.A00(r2)
            r0 = 3
            if (r1 != r0) goto L_0x0918
            java.lang.String r3 = "INSTAGRAM"
        L_0x087f:
            long r0 = X.C16947VBz.A00(r7)
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
        L_0x0887:
            java.lang.String r9 = X.C231122qu.A07(r6, r5)
            java.lang.Integer r0 = r5.A0I
            if (r0 == 0) goto L_0x0898
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
        L_0x0898:
            X.0wc r2 = r4.A01
            java.lang.String r1 = "ctx_ad_social_proof_tap"
            X.0kJ r0 = r2.A00
            X.0Aj r2 = r2.A00(r0, r1)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0ca6
            r7 = 0
            if (r9 == 0) goto L_0x0915
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r9)
            if (r0 == 0) goto L_0x0915
            long r0 = r0.longValue()
        L_0x08b8:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "ad_id"
            r2.A9F(r0, r1)
            if (r10 == 0) goto L_0x0912
            long r0 = r10.longValue()
        L_0x08c7:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "page_id"
            r2.A9F(r0, r1)
            java.lang.String r1 = X.C52673Gal.A00(r6, r5)
            r0 = 70
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.AAJ(r0, r1)
            java.lang.String r1 = r4.A02
            java.lang.String r0 = X.AnonymousClass9NF.A01()
            r2.AAJ(r0, r1)
            X.XSH r1 = r4.A00
            r0 = 357(0x165, float:5.0E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.A8M(r1, r0)
            r0 = 341(0x155, float:4.78E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.AAJ(r0, r3)
            if (r11 == 0) goto L_0x0900
            long r7 = r11.longValue()
        L_0x0900:
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            r0 = 342(0x156, float:4.79E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.A9F(r0, r1)
        L_0x090d:
            r2.Cgf()
            goto L_0x0ca6
        L_0x0912:
            r0 = 0
            goto L_0x08c7
        L_0x0915:
            r0 = 0
            goto L_0x08b8
        L_0x0918:
            if (r1 != r3) goto L_0x091e
            java.lang.String r3 = "MESSENGER"
            goto L_0x087f
        L_0x091e:
            r0 = 2
            if (r1 != r0) goto L_0x092c
            java.lang.String r3 = "WHATSAPP"
            goto L_0x087f
        L_0x0925:
            java.lang.String r3 = ""
            if (r7 != 0) goto L_0x087f
            r10 = r11
            goto L_0x0887
        L_0x092c:
            r0 = 968(0x3c8, float:1.356E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            int r0 = X.AnonymousClass3ZO.A00(r2)
            java.lang.String r1 = X.002.A0O(r1, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0940:
            X.4y1 r1 = (X.C279064y1) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r2 = r0.A03
            X.4y4 r2 = (X.C279094y4) r2
            X.4GD r4 = r2.A01
            java.lang.Object r3 = r0.A01
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r2 = r0.A02
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            int r0 = r2.getPosition()
            r4.DWW(r3, r1, r2, r0)
            goto L_0x0ca6
        L_0x095d:
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            X.4jJ r4 = X.C271614jJ.A00
            java.lang.Object r2 = r0.A03
            X.4nl r2 = (X.C274134nl) r2
            com.instagram.common.session.UserSession r3 = r2.A00
            java.lang.Object r2 = r0.A01
            X.1Xj r2 = (X.1Xj) r2
            java.lang.Object r0 = r0.A02
            X.4DU r0 = (X.AnonymousClass4DU) r0
            X.50X r6 = r4.A00(r3, r2, r0, r1)
            return r6
        L_0x0978:
            java.lang.Object r4 = r0.A02
            X.6AW r4 = (X.AnonymousClass6AW) r4
            java.lang.Object r1 = r0.A03
            X.6AU r1 = (X.AnonymousClass6AU) r1
            long r2 = r1.A00
            java.lang.Object r0 = r0.A01
            X.6AT r0 = (X.AnonymousClass6AT) r0
            boolean r1 = r0.A04
            r0 = 0
            com.facebook.msys.mca.MailboxFutureImpl r6 = r4.A00(r0, r2, r1)
            return r6
        L_0x098e:
            X.5kr r7 = new X.5kr
            r7.<init>()
            java.lang.Object r8 = r0.A02
            X.6AW r8 = (X.AnonymousClass6AW) r8
            java.lang.Object r1 = r0.A03
            X.6AU r1 = (X.AnonymousClass6AU) r1
            long r12 = r1.A00
            java.lang.Object r0 = r0.A01
            X.6AT r0 = (X.AnonymousClass6AT) r0
            int r11 = r0.A00
            com.instagram.common.session.UserSession r9 = r1.A04
            r0 = 0
            X.0qQ.A0B(r8, r0)
            com.google.common.util.concurrent.SettableFuture r6 = new com.google.common.util.concurrent.SettableFuture
            r6.<init>()
            r0 = 36
            X.9Km r10 = new X.9Km
            r10.<init>(r6, r0)
            r7.A00(r8, r9, r10, r11, r12)
            return r6
        L_0x09b9:
            X.2WA r1 = (X.AnonymousClass2WA) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r6 = r0.A03
            X.7fG r6 = (X.C336837fG) r6
            com.instagram.user.model.User r3 = r6.A02
            boolean r2 = r3.A2Q()
            if (r2 != 0) goto L_0x0ca6
            java.lang.Object r5 = r0.A01
            com.instagram.model.reels.Reel r5 = (com.instagram.model.reels.Reel) r5
            if (r5 == 0) goto L_0x09ed
            X.GgO r4 = r6.A00
            java.lang.String r3 = r6.A03
            android.view.View r2 = r1.A00
            X.0qQ.A06(r2)
            android.graphics.RectF r1 = X.0nA.A01
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            X.0nA.A0L(r1, r2)
            java.lang.Object r0 = r0.A02
            X.0sa r0 = (X.C62320sa) r0
            r4.A0H(r1, r5, r3, r0)
            goto L_0x0ca6
        L_0x09ed:
            X.GgO r2 = r6.A00
            java.lang.String r1 = r6.A03
            boolean r0 = r6.A04
            r2.A0W(r3, r1, r0)
            goto L_0x0ca6
        L_0x09f8:
            X.7aH r1 = (X.C333867aH) r1
            r9 = 0
            X.0qQ.A0B(r1, r9)
            java.lang.Object r11 = r0.A02
            X.7dl r11 = (X.C335927dl) r11
            r2 = 1
            X.7aH r18 = X.C335067cK.A04(r1, r11, r2)
            java.lang.Object r2 = r0.A01
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r12 = r0.A03
            com.instagram.comments.mvvm.data.MediaCommentListRepository r12 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r12
            java.util.Iterator r16 = r2.iterator()
        L_0x0a13:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0a75
            java.lang.Object r2 = r16.next()
            X.3gp r2 = (X.C247733gp) r2
            com.instagram.common.session.UserSession r15 = r12.A0B
            java.lang.String r14 = r2.A0G
            java.lang.String r13 = r2.A0d
            java.lang.String r10 = r2.A0F
            com.instagram.api.schemas.CommentGiphyMediaInfoIntf r0 = r2.A0T
            if (r0 == 0) goto L_0x0a72
            X.7fs r17 = X.C335837dc.A02(r0)
        L_0x0a2f:
            X.571 r8 = r2.A05
            X.572 r7 = r2.A0V
            X.GmL r0 = r12.A04
            java.lang.String r6 = r0.A0E
            java.util.List r5 = r2.A0I
            boolean r4 = r2.A0i
            boolean r3 = r0.A0d
            X.7a5 r0 = r12.A05
            X.0Ud r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            X.7a7 r0 = (X.C333777a7) r0
            if (r0 == 0) goto L_0x0a70
            com.instagram.user.model.User r0 = r0.A0A
            if (r0 == 0) goto L_0x0a70
            X.17M r2 = r0.A02
        L_0x0a4f:
            X.17M r0 = X.17M.A06
            r29 = 0
            if (r2 != r0) goto L_0x0a57
            r29 = 1
        L_0x0a57:
            r28 = r3
            r25 = r6
            r26 = r5
            r27 = r4
            r22 = r14
            r23 = r13
            r24 = r10
            r19 = r15
            r20 = r8
            r21 = r7
            X.7aH r18 = X.C335067cK.A03(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x0a13
        L_0x0a70:
            r2 = 0
            goto L_0x0a4f
        L_0x0a72:
            r17 = 0
            goto L_0x0a2f
        L_0x0a75:
            int r3 = r1.A00
            java.util.List r1 = r11.A05
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0aa0
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0aa0
            r2 = 0
        L_0x0a84:
            int r3 = r3 + r2
            X.9IV r1 = r11.A00
            r0 = 0
            if (r1 == 0) goto L_0x0a8b
            r0 = 1
        L_0x0a8b:
            int r3 = r3 + r0
            r10 = 0
            r17 = 8063(0x1f7f, float:1.1299E-41)
            r11 = r10
            r12 = r10
            r13 = r18
            r14 = r10
            r15 = r10
            r16 = r3
            r18 = r9
            r19 = r9
            X.7aH r6 = X.C333867aH.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r6
        L_0x0aa0:
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L_0x0aa5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0a84
            java.lang.Object r0 = r1.next()
            X.9IV r0 = (X.AnonymousClass9IV) r0
            java.lang.Object r0 = r0.A01
            X.7dj r0 = (X.C335907dj) r0
            boolean r0 = r0.A0b
            if (r0 == 0) goto L_0x0aa5
            int r2 = r2 + 1
            if (r2 >= 0) goto L_0x0aa5
            X.0sr.A1S()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0ac5:
            X.7aH r1 = (X.C333867aH) r1
            r10 = 0
            X.0qQ.A0B(r1, r10)
            java.lang.Object r3 = r0.A03
            java.util.Set r3 = (java.util.Set) r3
            java.lang.Object r2 = r0.A02
            java.util.Set r2 = (java.util.Set) r2
            X.7aH r3 = X.C335067cK.A09(r1, r3, r2)
            java.lang.Object r4 = r0.A01
            X.7dj r4 = (X.C335907dj) r4
            r0 = 1
            X.0qQ.A0B(r4, r0)
            boolean r0 = r4.A0V
            if (r0 == 0) goto L_0x0b40
            java.util.List r1 = r3.A06
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            java.util.Iterator r8 = r1.iterator()
        L_0x0af4:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0b39
            java.lang.Object r7 = r8.next()
            X.9IV r7 = (X.AnonymousClass9IV) r7
            java.lang.Object r0 = r7.A01
            X.7dj r0 = (X.C335907dj) r0
            java.lang.String r1 = r0.A0K
            java.lang.String r0 = r4.A0N
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0b35
            java.lang.Object r5 = r7.A00
            X.9Ib r5 = (X.C376459Ib) r5
            java.lang.Object r1 = r5.A01
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.List r0 = java.util.Collections.singletonList(r4)
            X.0qQ.A07(r0)
            java.util.ArrayList r2 = X.00k.A0S(r0, r1)
            java.lang.Object r1 = r5.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r5.A00
            X.7dk r0 = (X.C335917dk) r0
            X.9Ib r1 = X.C376459Ib.A00(r0, r2, r1)
            java.lang.Object r0 = r7.A01
            X.7dj r0 = (X.C335907dj) r0
            X.9IV r7 = X.AnonymousClass9IV.A00(r1, r0)
        L_0x0b35:
            r6.add(r7)
            goto L_0x0af4
        L_0x0b39:
            r0 = 8158(0x1fde, float:1.1432E-41)
            X.7aH r6 = X.C333867aH.A00((X.C61081JwJ) null, (X.C333847aF) null, (X.C333817aC) null, r3, r6, (java.util.List) null, 0, r0, false, false)
            return r6
        L_0x0b40:
            X.0sn r1 = X.0sn.A00
            r8 = 0
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            X.7dk r5 = new X.7dk
            r7 = r6
            r9 = r8
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.9Ib r0 = new X.9Ib
            r0.<init>((X.C335917dk) r5, (java.util.List) r1, (java.util.List) r1)
            X.9IV r5 = new X.9IV
            r5.<init>((X.C376459Ib) r0, (X.C335907dj) r4)
            java.lang.Object r0 = r5.A01
            X.7dj r0 = (X.C335907dj) r0
            boolean r0 = r0.A0f
            if (r0 == 0) goto L_0x0b89
            java.util.List r4 = r3.A06
            int r0 = r4.size()
            int r2 = r3.A00
            int r0 = r0 - r2
            java.util.List r1 = X.00k.A0h(r4, r0)
            java.util.List r0 = java.util.Collections.singletonList(r5)
            X.0qQ.A07(r0)
        L_0x0b76:
            java.util.ArrayList r1 = X.00k.A0S(r0, r1)
            java.util.List r0 = X.00k.A0d(r4, r2)
            java.util.ArrayList r1 = X.00k.A0S(r1, r0)
            r0 = 8190(0x1ffe, float:1.1477E-41)
            X.7aH r6 = X.C333867aH.A00((X.C61081JwJ) null, (X.C333847aF) null, (X.C333817aC) null, r3, r1, (java.util.List) null, 0, r0, false, false)
            return r6
        L_0x0b89:
            java.util.List r1 = java.util.Collections.singletonList(r5)
            X.0qQ.A07(r1)
            java.util.List r4 = r3.A06
            int r0 = r4.size()
            int r2 = r3.A00
            int r0 = r0 - r2
            java.util.List r0 = X.00k.A0h(r4, r0)
            goto L_0x0b76
        L_0x0b9e:
            android.content.Intent r1 = (android.content.Intent) r1
            r4 = 0
            X.0qQ.A0B(r1, r4)
            java.lang.String r3 = r1.getAction()
            r2 = 129(0x81, float:1.81E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0ca6
            r2 = 503(0x1f7, float:7.05E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            boolean r1 = r1.hasCategory(r2)
            if (r1 == 0) goto L_0x0ca6
            java.lang.Object r3 = r0.A01
            X.1Cj r3 = (X.1Cj) r3
            java.lang.Object r1 = r0.A03
            X.12L r1 = (X.AnonymousClass12L) r1
            android.content.Context r2 = r1.A00
            java.lang.Object r1 = r0.A02
            X.0lg r1 = (X.0lg) r1
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            r0 = 0
            r3.A04(r2, r1, r0, r4)
            goto L_0x0ca6
        L_0x0bd6:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.A01
            X.0sP r2 = (X.0sP) r2
            r2.invoke(r1)
            java.lang.Object r2 = r0.A03
            X.5KX r2 = (X.AnonymousClass5KX) r2
            X.3ju r4 = r2.A03
            r4.AI3(r1)
        L_0x0be8:
            java.lang.Object r2 = r4.FIE()
            java.lang.Object r3 = X.1Wq.A00(r2)
            if (r3 == 0) goto L_0x0ca6
            java.lang.Object r2 = r0.A02
            X.0sL r2 = (X.0sL) r2
            r2.invoke(r3, r1)
            goto L_0x0be8
        L_0x0bfa:
            java.lang.Object r4 = r0.A03
            X.6I1 r4 = (X.AnonymousClass6I1) r4
            java.util.Map r3 = r4.A01
            java.lang.Object r2 = r0.A01
            boolean r1 = r3.containsKey(r2)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0c1b
            java.util.Map r1 = r4.A02
            r1.remove(r2)
            java.lang.Object r1 = r0.A02
            r3.put(r2, r1)
            r0 = 1
            X.GPy r6 = new X.GPy
            r6.<init>(r0, r1, r2, r4)
            return r6
        L_0x0c1b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Key "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " was used multiple times "
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0c37:
            X.4cl r1 = (X.C268104cl) r1
            java.lang.Object r5 = r0.A01
            X.4cY r5 = (X.C267974cY) r5
            java.lang.Object r6 = r0.A02
            X.4cc r6 = (X.C268014cc) r6
            java.lang.Object r0 = r0.A03
            X.6Dh r0 = (X.C304396Dh) r0
            X.6Fk r3 = r0.A00
            X.5Q8 r2 = r6.getLayoutDirection()
            X.6Fj r3 = (X.C304826Fj) r3
            X.5Q8 r0 = X.AnonymousClass5Q8.Ltr
            if (r2 != r0) goto L_0x0c5a
            float r0 = r3.A02
        L_0x0c53:
            int r4 = r6.EJS(r0)
            float r0 = r3.A03
            goto L_0x0cb5
        L_0x0c5a:
            float r0 = r3.A01
            goto L_0x0c53
        L_0x0c5d:
            X.4cl r1 = (X.C268104cl) r1
            java.lang.Object r3 = r0.A03
            X.5cB r3 = (X.C288605cB) r3
            boolean r2 = r3.A04
            java.lang.Object r5 = r0.A01
            X.4cY r5 = (X.C267974cY) r5
            if (r2 == 0) goto L_0x0c78
            java.lang.Object r4 = r0.A02
            X.4cd r4 = (X.C268024cd) r4
            float r0 = r3.A02
            int r2 = r4.EJS(r0)
            float r0 = r3.A03
            goto L_0x0c9f
        L_0x0c78:
            java.lang.Object r6 = r0.A02
            X.4cd r6 = (X.C268024cd) r6
            float r0 = r3.A02
            int r4 = r6.EJS(r0)
            float r0 = r3.A03
            goto L_0x0cb5
        L_0x0c85:
            X.4cl r1 = (X.C268104cl) r1
            java.lang.Object r3 = r0.A03
            X.64y r3 = (X.C3027064y) r3
            boolean r2 = r3.A02
            java.lang.Object r5 = r0.A01
            X.4cY r5 = (X.C267974cY) r5
            if (r2 == 0) goto L_0x0ca9
            java.lang.Object r4 = r0.A02
            X.4cd r4 = (X.C268024cd) r4
            float r0 = r3.A00
            int r2 = r4.EJS(r0)
            float r0 = r3.A01
        L_0x0c9f:
            int r0 = r4.EJS(r0)
            r1.A07(r5, r2, r0)
        L_0x0ca6:
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x0ca9:
            java.lang.Object r6 = r0.A02
            X.4cd r6 = (X.C268024cd) r6
            float r0 = r3.A00
            int r4 = r6.EJS(r0)
            float r0 = r3.A01
        L_0x0cb5:
            int r2 = r6.EJS(r0)
            r0 = 0
            r1.A05(r5, r0, r4, r2)
            goto L_0x0ca6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9MC.invoke(java.lang.Object):java.lang.Object");
    }
}
