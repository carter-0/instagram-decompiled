package X;

/* renamed from: X.9PR  reason: invalid class name */
public final class AnonymousClass9PR extends AnonymousClass1Ek implements 0sP {
    public int A00;
    public int A01;
    public final int A02 = 0;
    public final Object A03;
    public final String A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9PR(C62027KWb kWb, String str, AnonymousClass4D7 r4, int i, boolean z) {
        super(1, r4);
        this.A03 = kWb;
        this.A05 = z;
        this.A04 = str;
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.9PR, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.9PR, X.4D7] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r10) {
        AnonymousClass4D7 r6 = r10;
        if (this.A02 != 0) {
            return new AnonymousClass9PR((C62027KWb) this.A03, this.A04, r6, this.A00, this.A05);
        }
        return new AnonymousClass9PR((AnonymousClass89T) this.A03, this.A04, r10, this.A05);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((AnonymousClass9PR) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.9PR, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0597, code lost:
        if (r6.isEmpty() != false) goto L_0x0599;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0599, code lost:
        r24 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x059b, code lost:
        if (r2 == false) goto L_0x06bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x05a1, code lost:
        if (r6.isEmpty() == false) goto L_0x06bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x05a3, code lost:
        r25 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x05a5, code lost:
        r8 = r6.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x05ad, code lost:
        if (r8.hasNext() == false) goto L_0x06b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x05af, code lost:
        r2 = r8.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x05bc, code lost:
        if (((X.C371388yC) r2).A0F() != X.C371398yD.MEDIA_ATTACHMENT) goto L_0x05a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x05be, code lost:
        r2 = (X.C371388yC) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x05c0, code lost:
        if (r2 == null) goto L_0x06b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x05c2, code lost:
        r2 = r2.A0E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x05c6, code lost:
        if (r2 == null) goto L_0x06b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x05c8, code lost:
        r8 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x05d0, code lost:
        if (r8.hasNext() == false) goto L_0x06b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x05d2, code lost:
        r2 = r8.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x05df, code lost:
        if (((X.C371408yE) r2).A0E() != X.C371418yF.VIDEO_MIN_LENGTH_IN_MS) goto L_0x05cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x05e1, code lost:
        r2 = (X.C371408yE) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x05e3, code lost:
        if (r2 == null) goto L_0x06b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x05e5, code lost:
        r2 = r2.A0F();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x05e9, code lost:
        if (r2 == null) goto L_0x06b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x05eb, code lost:
        r2 = r2.getOptionalStringField(0, "property_string_value");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x05f1, code lost:
        if (r2 == null) goto L_0x06b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x05f3, code lost:
        r11 = X.00y.A0l(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x05f7, code lost:
        r6 = r6.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x05ff, code lost:
        if (r6.hasNext() == false) goto L_0x06b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0601, code lost:
        r2 = r6.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x060e, code lost:
        if (((X.C371388yC) r2).A0F() != X.C371398yD.MEDIA_ATTACHMENT) goto L_0x05fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0610, code lost:
        r2 = (X.C371388yC) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0612, code lost:
        if (r2 == null) goto L_0x0649;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0614, code lost:
        r2 = r2.A0E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0618, code lost:
        if (r2 == null) goto L_0x0649;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x061a, code lost:
        r6 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0622, code lost:
        if (r6.hasNext() == false) goto L_0x06ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0624, code lost:
        r2 = r6.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0631, code lost:
        if (((X.C371408yE) r2).A0E() != X.C371418yF.VIDEO_MAX_LENGTH_IN_MS) goto L_0x061e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0633, code lost:
        r2 = (X.C371408yE) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0635, code lost:
        if (r2 == null) goto L_0x0649;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0637, code lost:
        r2 = r2.A0F();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x063b, code lost:
        if (r2 == null) goto L_0x0649;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x063d, code lost:
        r2 = r2.getOptionalStringField(0, "property_string_value");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0643, code lost:
        if (r2 == null) goto L_0x0649;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0645, code lost:
        r12 = X.00y.A0l(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0649, code lost:
        r9 = new X.C347577x2(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r0, r24, r25, false, false);
        X.C347207wR.A02(r5, 2);
        r3 = r1.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0667, code lost:
        if (r3.AIY(r3.getValue(), new X.C239793Ih(r9)) == false) goto L_0x065a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x06ae, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x06b0, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x06b3, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x06b6, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x06b9, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x06bc, code lost:
        r4 = r6.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x06c4, code lost:
        if (r4.hasNext() == false) goto L_0x05a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x06d2, code lost:
        if (((X.C371388yC) r4.next()).A0F() != X.C371398yD.COMMUNITY_POST) goto L_0x06c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x06d4, code lost:
        r25 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x06f1, code lost:
        if (r2 == false) goto L_0x06f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x06f5, code lost:
        r8 = r6.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x06fd, code lost:
        if (r8.hasNext() == false) goto L_0x0599;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x070b, code lost:
        if (((X.C371388yC) r8.next()).A0F() != X.C371398yD.AUDIENCE_CONTROL_SELECTED) goto L_0x06f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x070d, code lost:
        r24 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0430  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0453  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0492  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x04b5  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x04f4  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0517  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x06e2  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x071b  */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x0737  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x0753  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x076f  */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x078b  */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x07a7  */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x07c3  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x07ed  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0815  */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x0830 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x082a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:469:0x0808 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:472:0x0802 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:474:0x07e0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:476:0x07d9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:489:0x06f1 A[EDGE_INSN: B:489:0x06f1->B:339:0x06f1 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:494:0x0589 A[EDGE_INSN: B:494:0x0589->B:256:0x0589 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:496:0x057f A[EDGE_INSN: B:496:0x057f->B:252:0x057f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:497:0x0575 A[EDGE_INSN: B:497:0x0575->B:248:0x0575 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:500:0x056b A[EDGE_INSN: B:500:0x056b->B:244:0x056b ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:502:0x0561 A[EDGE_INSN: B:502:0x0561->B:240:0x0561 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:504:0x0557 A[EDGE_INSN: B:504:0x0557->B:236:0x0557 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:505:0x054b A[EDGE_INSN: B:505:0x054b->B:231:0x054b ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:507:0x04e9 A[EDGE_INSN: B:507:0x04e9->B:204:0x04e9 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:509:0x0487 A[EDGE_INSN: B:509:0x0487->B:177:0x0487 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            r28 = this;
            r1 = r28
            r4 = r29
            int r0 = r1.A02
            if (r0 == 0) goto L_0x021c
            X.1Hj r0 = X.1Hj.A02
            int r3 = r1.A01
            java.lang.String r17 = ""
            r2 = 1
            if (r3 == 0) goto L_0x0162
            X.0eS.A00(r4)
        L_0x0014:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r5 = r1.A05
            java.lang.Object r9 = r1.A03
            X.KWb r9 = (X.C62027KWb) r9
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0213
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r0 = r4.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r4 = r0.A01
            X.3lr r4 = (X.C250663lr) r4
            if (r4 == 0) goto L_0x0210
            java.lang.Class<X.Bxz> r3 = X.C43423Bxz.class
            java.lang.String r1 = "xdt_get_potato_containers_for_user(request_data:$request_data,user_id:$user_id)"
            r0 = 1285937497(0x4ca5d959, float:8.6952648E7)
            X.3lr r8 = r4.A05(r3, r1, r0)
            if (r8 == 0) goto L_0x0210
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            if (r5 != 0) goto L_0x004e
            X.0Ud r0 = r9.A06
            java.lang.Object r0 = r0.getValue()
            X.JwF r0 = (X.C61077JwF) r0
            java.lang.Object r0 = r0.A00
            java.util.Collection r0 = (java.util.Collection) r0
            r14.addAll(r0)
        L_0x004e:
            java.lang.Class<X.Bxy> r3 = X.C43422Bxy.class
            r7 = 3
            java.lang.String r1 = "items"
            r0 = 1696180207(0x6519a7ef, float:4.5351244E22)
            com.google.common.collect.ImmutableList r1 = r8.getOptionalCompactedTreeListField(r7, r1, r3, r0)
            if (r1 == 0) goto L_0x0860
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r16 = r1.iterator()
        L_0x0064:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x0862
            java.lang.Object r4 = r16.next()
            X.3lr r4 = (X.C250663lr) r4
            java.lang.Class<X.ByH> r3 = X.C43441ByH.class
            r1 = -1918862694(0xffffffff8da07a9a, float:-9.890277E-31)
            X.3lr r10 = r4.A01(r3, r1)
            X.0qQ.A07(r10)
            com.instagram.common.session.UserSession r15 = r9.A01
            java.lang.Class<X.ByF> r5 = X.C43439ByF.class
            r3 = 4
            r1 = 5124(0x1404, float:7.18E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r1)
            r1 = 1777497398(0x69f27536, float:3.6639195E25)
            X.3lr r5 = r10.getOptionalTreeField(r3, r4, r5, r1)
            r24 = 0
            if (r5 == 0) goto L_0x0064
            java.lang.Class<X.ByB> r4 = X.C43435ByB.class
            r1 = -81993116(0xfffffffffb1ce264, float:-8.1459006E35)
            X.3lr r6 = r5.A01(r4, r1)
            if (r6 == 0) goto L_0x0064
            r5 = 2
            java.lang.String r1 = "strong_id__"
            java.lang.String r20 = r10.getRequiredStringField(r5, r1)
            X.0qQ.A07(r20)
            r1 = 272(0x110, float:3.81E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            com.google.common.collect.ImmutableList r23 = r6.getOptionalCompactedStringListField(r3, r1)
            java.lang.String r1 = "media_count"
            int r25 = r6.getRequiredIntField(r2, r1)
            java.lang.Class<X.ByA> r4 = X.C43434ByA.class
            r1 = 1726(0x6be, float:2.419E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r1)
            r1 = 1849325990(0x6e3a79a6, float:1.4427819E28)
            X.3lr r4 = r6.getOptionalTreeField(r7, r3, r4, r1)
            if (r4 == 0) goto L_0x015e
            java.lang.Class<X.ByN> r3 = X.C43447ByN.class
            r1 = 726945048(0x2b544d18, float:7.542452E-13)
            X.3lr r12 = r4.A01(r3, r1)
            X.ByN r12 = (X.C43447ByN) r12
        L_0x00d3:
            java.lang.Class<X.ByG> r4 = X.C43440ByG.class
            java.lang.String r3 = "user"
            r1 = -1612124554(0xffffffff9fe8ee76, float:-9.865032E-20)
            X.3lr r11 = r10.getOptionalTreeField(r7, r3, r4, r1)
            if (r11 == 0) goto L_0x015b
            java.lang.String r13 = X.Dbm.A01()
            java.lang.String r21 = r11.getOptionalStringField(r2, r13)
        L_0x00e8:
            X.3lr r3 = r10.getOptionalTreeField(r7, r3, r4, r1)
            if (r3 == 0) goto L_0x0158
            java.lang.String r1 = "profile_pic_url"
            java.lang.String r22 = r3.getOptionalStringField(r5, r1)
        L_0x00f4:
            java.lang.Class<X.By9> r5 = X.C43433By9.class
            r4 = 5
            r1 = 740(0x2e4, float:1.037E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r1)
            r1 = 797337962(0x2f86696a, float:2.444936E-10)
            com.google.common.collect.ImmutableList r1 = r6.getRequiredCompactedTreeListField(r4, r3, r5, r1)
            if (r1 == 0) goto L_0x014a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r10 = r1.iterator()
        L_0x010f:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0146
            java.lang.Object r5 = r10.next()
            X.3lr r5 = (X.C250663lr) r5
            java.lang.Class<X.By6> r4 = X.C43430By6.class
            java.lang.String r3 = "image_versions2"
            r1 = 602474432(0x23e907c0, float:2.5265193E-17)
            X.3lr r4 = r5.getOptionalTreeField(r2, r3, r4, r1)
            if (r4 == 0) goto L_0x010f
            java.lang.Class<X.ByE> r3 = X.C43438ByE.class
            r1 = -1674870526(0xffffffff9c2b8102, float:-5.6745893E-22)
            X.3lr r4 = r4.A01(r3, r1)
            if (r4 == 0) goto L_0x010f
            X.1E5 r3 = X.1E4.A00(r15)
            java.lang.Class<com.instagram.model.mediasize.ImmutablePandoImageInfo> r1 = com.instagram.model.mediasize.ImmutablePandoImageInfo.class
            com.facebook.pando.TreeJNI r1 = r4.reinterpret(r1)
            X.0qQ.A0B(r3, r2)
            if (r1 == 0) goto L_0x010f
            r6.add(r1)
            goto L_0x010f
        L_0x0146:
            X.62P r24 = X.AnonymousClass62Q.A00(r6)
        L_0x014a:
            X.Glj r1 = new X.Glj
            r18 = r1
            r19 = r12
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r0.add(r1)
            goto L_0x0064
        L_0x0158:
            r22 = r24
            goto L_0x00f4
        L_0x015b:
            r21 = r24
            goto L_0x00e8
        L_0x015e:
            r12 = r24
            goto L_0x00d3
        L_0x0162:
            X.0eS.A00(r4)
            java.lang.Object r5 = r1.A03
            X.KWb r5 = (X.C62027KWb) r5
            X.0Ud r7 = r5.A06
            java.lang.Object r3 = r7.getValue()
            X.JwF r3 = (X.C61077JwF) r3
            boolean r3 = r3.A02
            r4 = 0
            if (r3 == 0) goto L_0x0185
            java.lang.Object r3 = r7.getValue()
            X.JwF r3 = (X.C61077JwF) r3
            java.lang.String r3 = r3.A01
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x0185
            r4 = 1
        L_0x0185:
            boolean r6 = r1.A05
            if (r6 != 0) goto L_0x018d
            if (r4 != 0) goto L_0x018d
            goto L_0x08a7
        L_0x018d:
            X.05G r4 = r5.A03
            X.9s0 r3 = X.C390889s0.LOADING
            r4.Epw(r3)
            X.L29 r4 = r5.A02
            java.lang.String r10 = r1.A04
            int r5 = r1.A00
            if (r6 == 0) goto L_0x0207
            r3 = r17
        L_0x019e:
            r1.A01 = r2
            X.0K0 r7 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r12 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.String r5 = "count"
            X.0Df r9 = r7.A02()
            X.0Df.A00(r9, r6, r5)
            java.lang.String r5 = "max_id"
            X.0Df.A00(r9, r3, r5)
            X.2IS r8 = new X.2IS
            r8.<init>()
            X.2IS r7 = new X.2IS
            r7.<init>()
            java.lang.String r3 = "user_id"
            r8.A04(r3, r10)
            boolean r6 = X.AnonymousClass7TF.A1V(r10)
            r3 = 384(0x180, float:5.38E-43)
            java.lang.String r5 = X.C273654mx.A00(r3)
            X.2IV r3 = r8.A00
            X.0Df r3 = r3.A02()
            r3.A0E(r9, r5)
            X.17k.A0E(r6)
            X.2IY r3 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r6 = X.AnonymousClass1vS.A00()
            java.util.Map r8 = r8.getParamsCopy()
            java.util.Map r9 = r7.getParamsCopy()
            java.lang.Class<X.9f1> r10 = X.C383099f1.class
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()
            java.lang.String r7 = "GetPotatoContainersForUser"
            r11 = 0
            java.lang.String r15 = "xdt_get_potato_containers_for_user"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r13 = r11
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.instagram.common.session.UserSession r3 = r4.A00
            X.1vn r3 = X.1vm.A01(r3)
            java.lang.Object r4 = r3.A04(r5, r1)
            if (r4 != r0) goto L_0x0014
            return r0
        L_0x0207:
            java.lang.Object r3 = r7.getValue()
            X.JwF r3 = (X.C61077JwF) r3
            java.lang.String r3 = r3.A01
            goto L_0x019e
        L_0x0210:
            r0 = 0
            goto L_0x0893
        L_0x0213:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0898
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x021c:
            X.1Hj r0 = X.1Hj.A02
            int r3 = r1.A01
            r2 = 1
            if (r3 == 0) goto L_0x02f0
            int r5 = r1.A00
            X.0eS.A00(r4)
        L_0x0228:
            r0 = r4
            X.3Ii r0 = (X.C239803Ii) r0
            java.lang.Object r1 = r1.A03
            X.89T r1 = (X.AnonymousClass89T) r1
            boolean r3 = r0 instanceof X.C239793Ih
            if (r3 == 0) goto L_0x03b9
            X.3Ih r0 = (X.C239793Ih) r0
            java.lang.Object r8 = r0.A00
            X.3JC r8 = (X.AnonymousClass3JC) r8
            com.instagram.common.session.UserSession r3 = r1.A03
            boolean r7 = r8.CPt()
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.02m r6 = X.02m.A0p
            r4 = 383656871(0x16de23a7, float:3.5888534E-25)
            java.lang.String r3 = "is_cached_response"
            r6.markerAnnotate(r4, r5, r3, r7)
            java.lang.Object r9 = r8.A01
            X.3lr r9 = (X.C250663lr) r9
            if (r9 == 0) goto L_0x039f
            r7 = 0
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.lang.Class<X.8y6> r8 = X.AnonymousClass8y6.class
            java.lang.String r4 = "xcxp_unified_crossposting_configs_root(configs_request:$configs_request)"
            r3 = 176516370(0xa856d12, float:1.2848462E-32)
            X.3lr r9 = r9.getOptionalTreeField(r0, r4, r8, r3)
            r12 = 0
            if (r9 == 0) goto L_0x039f
            java.lang.Class<X.8y7> r8 = X.C371348y7.class
            java.lang.String r4 = "content_compatibility_configs"
            r3 = 1265161169(0x4b68d3d1, float:1.5258577E7)
            com.google.common.collect.ImmutableList r3 = r9.getRequiredCompactedTreeListField(r0, r4, r8, r3)
            if (r3 == 0) goto L_0x039f
            java.lang.Object r9 = X.00k.A0J(r3)
            X.3lr r9 = (X.C250663lr) r9
            if (r9 == 0) goto L_0x039f
            java.lang.Class<X.8y8> r8 = X.AnonymousClass8y8.class
            java.lang.String r4 = "feature_lists"
            r3 = 1408197373(0x53ef62fd, float:2.05631586E12)
            com.google.common.collect.ImmutableList r3 = r9.getRequiredCompactedTreeListField(r2, r4, r8, r3)
            if (r3 == 0) goto L_0x039f
            java.util.Iterator r10 = r3.iterator()
        L_0x028c:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x02ee
            java.lang.Object r9 = r10.next()
            r8 = r9
            X.3lr r8 = (X.C250663lr) r8
            if (r8 == 0) goto L_0x028c
            X.8yA r4 = X.C371368yA.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r3 = "post_content_types"
            com.google.common.collect.ImmutableList r4 = r8.getRequiredCompactedEnumListField(r0, r3, r4)
            if (r4 == 0) goto L_0x028c
            X.8yA r3 = X.C371368yA.SINGLE_VIDEO
            boolean r3 = r4.contains(r3)
            if (r3 != r2) goto L_0x028c
        L_0x02ad:
            X.3lr r9 = (X.C250663lr) r9
            if (r9 == 0) goto L_0x039f
            java.lang.Class<X.8yB> r8 = X.C371378yB.class
            java.lang.String r4 = "feature_list"
            r3 = 18627726(0x11c3c8e, float:2.869612E-38)
            com.google.common.collect.ImmutableList r2 = r9.getRequiredCompactedTreeListField(r2, r4, r8, r3)
            if (r2 == 0) goto L_0x039f
            java.util.Iterator r10 = r2.iterator()
        L_0x02c2:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x03c2
            java.lang.Object r9 = r10.next()
            X.3lr r9 = (X.C250663lr) r9
            if (r9 == 0) goto L_0x02c2
            java.lang.Class<X.8yC> r8 = X.C371388yC.class
            r3 = 523040434(0x1f2cf6b2, float:3.6626478E-20)
            X.3lr r2 = r9.reinterpretRequired(r0, r8, r3)
            X.8yC r2 = (X.C371388yC) r2
            if (r2 == 0) goto L_0x02c2
            X.8yD r2 = r2.A0F()
            if (r2 == 0) goto L_0x02c2
            X.3lr r2 = r9.reinterpretRequired(r0, r8, r3)
            X.0qQ.A07(r2)
            r6.add(r2)
            goto L_0x02c2
        L_0x02ee:
            r9 = r12
            goto L_0x02ad
        L_0x02f0:
            X.0eS.A00(r4)
            boolean r3 = r1.A05
            if (r3 != 0) goto L_0x039b
            java.lang.Object r3 = r1.A03
            X.89T r3 = (X.AnonymousClass89T) r3
            X.05G r3 = r3.A05
            java.lang.Object r3 = r3.getValue()
            boolean r3 = r3 instanceof X.C297815sO
            if (r3 != 0) goto L_0x039b
            r3 = 432000000(0x19bfcc00, double:2.13436359E-315)
        L_0x0308:
            java.lang.Object r5 = r1.A03
            X.89T r5 = (X.AnonymousClass89T) r5
            com.instagram.common.session.UserSession r7 = r5.A03
            java.lang.String r6 = r1.A04
            java.lang.String r5 = "xar_v1"
            int r5 = X.C347207wR.A00(r7, r5, r6)
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r3)
            r1.A00 = r5
            r1.A01 = r2
            java.lang.String r11 = "RECOMMEND"
            r15 = 0
            X.2IS r8 = new X.2IS
            r8.<init>()
            X.2IS r12 = new X.2IS
            r12.<init>()
            X.2IV r9 = new X.2IV
            r9.<init>()
            java.lang.String r4 = "IG"
            java.lang.String r3 = "source_app"
            r9.A09(r4, r3)
            X.2IV r10 = new X.2IV
            r10.<init>()
            java.lang.String r4 = "FB"
            java.lang.String r3 = "destination_app"
            r10.A09(r4, r3)
            java.lang.String r4 = "REELS"
            java.lang.String r3 = "destination_surface"
            r10.A09(r4, r3)
            java.lang.String r3 = "source_surface"
            r10.A09(r4, r3)
            java.lang.String r3 = "cross_app_share_type"
            r10.A09(r11, r3)
            java.util.List r4 = X.AnonymousClass7TE.A1I(r10)
            java.lang.String r3 = "crosspost_app_surface_list"
            r9.A05(r3, r4)
            java.lang.String r3 = "configs_request"
            r8.A00(r9, r3)
            X.2IY r3 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r9 = X.AnonymousClass1vS.A00()
            java.util.Map r11 = r8.getParamsCopy()
            java.util.Map r12 = r12.getParamsCopy()
            java.lang.Class<X.7wW> r13 = X.C347257wW.class
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
            java.lang.String r10 = "CrossPostingContentCompatibilityConfig"
            r14 = 0
            java.lang.String r18 = "xcxp_unified_crossposting_configs_root"
            com.facebook.pando.PandoGraphQLRequest r8 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r17 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            long r3 = r6.longValue()
            X.1Ef r6 = r8.setMaxToleratedCacheAgeMs(r3)
            r6.setFreshCacheAgeMs(r3)
            X.1vn r3 = X.1vm.A01(r7)
            java.lang.Object r4 = r3.A04(r8, r1)
            if (r4 != r0) goto L_0x0228
            return r0
        L_0x039b:
            r3 = 0
            goto L_0x0308
        L_0x039f:
            r0 = 433(0x1b1, float:6.07E-43)
            X.C347207wR.A02(r5, r0)
            X.05G r4 = r1.A05
        L_0x03a6:
            java.lang.Object r3 = r4.getValue()
            X.0gF r2 = X.C60340gF.A00
            X.5sO r0 = new X.5sO
            r0.<init>(r2)
            boolean r0 = r4.AIY(r3, r0)
            if (r0 == 0) goto L_0x03a6
            goto L_0x0669
        L_0x03b9:
            boolean r2 = r0 instanceof X.C297815sO
            if (r2 != 0) goto L_0x0670
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x03c2:
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            java.util.Iterator r9 = r6.iterator()
        L_0x03c8:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x0858
            java.lang.Object r8 = r9.next()
            r2 = r8
            X.8yC r2 = (X.C371388yC) r2
            X.8yD r3 = r2.A0F()
            X.8yD r2 = X.C371398yD.MEDIA_ATTACHMENT
            if (r3 != r2) goto L_0x03c8
        L_0x03dd:
            X.8yC r8 = (X.C371388yC) r8
            if (r8 == 0) goto L_0x0855
            com.google.common.collect.ImmutableList r2 = r8.A0E()
            if (r2 == 0) goto L_0x0855
            java.util.Iterator r9 = r2.iterator()
        L_0x03eb:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x0852
            java.lang.Object r8 = r9.next()
            r2 = r8
            X.8yE r2 = (X.C371408yE) r2
            X.8yF r3 = r2.A0E()
            X.8yF r2 = X.C371418yF.SUB_FEATURES
            if (r3 != r2) goto L_0x03eb
        L_0x0400:
            X.8yE r8 = (X.C371408yE) r8
            if (r8 == 0) goto L_0x0855
            X.8yG r2 = r8.A0F()
            if (r2 == 0) goto L_0x0855
            X.8yH r8 = r2.A0E()
            if (r8 == 0) goto L_0x0855
            java.lang.Class<X.8yI> r3 = X.C371448yI.class
            r2 = -16115282(0xffffffffff0a19ae, float:-1.835668E38)
            com.google.common.collect.ImmutableList r3 = r8.getRequiredCompactedTreeListField(r0, r4, r3, r2)
            if (r3 == 0) goto L_0x0855
            boolean r2 = r3 instanceof java.util.Collection
            if (r2 == 0) goto L_0x0833
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L_0x0833
        L_0x0425:
            r13 = 0
        L_0x0426:
            java.util.Iterator r9 = r6.iterator()
        L_0x042a:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x0830
            java.lang.Object r8 = r9.next()
            r2 = r8
            X.8yC r2 = (X.C371388yC) r2
            X.8yD r3 = r2.A0F()
            X.8yD r2 = X.C371398yD.MEDIA_ATTACHMENT
            if (r3 != r2) goto L_0x042a
        L_0x043f:
            X.8yC r8 = (X.C371388yC) r8
            if (r8 == 0) goto L_0x082d
            com.google.common.collect.ImmutableList r2 = r8.A0E()
            if (r2 == 0) goto L_0x082d
            java.util.Iterator r9 = r2.iterator()
        L_0x044d:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x082a
            java.lang.Object r8 = r9.next()
            r2 = r8
            X.8yE r2 = (X.C371408yE) r2
            X.8yF r3 = r2.A0E()
            X.8yF r2 = X.C371418yF.SUB_FEATURES
            if (r3 != r2) goto L_0x044d
        L_0x0462:
            X.8yE r8 = (X.C371408yE) r8
            if (r8 == 0) goto L_0x082d
            X.8yG r2 = r8.A0F()
            if (r2 == 0) goto L_0x082d
            X.8yH r8 = r2.A0E()
            if (r8 == 0) goto L_0x082d
            java.lang.Class<X.8yI> r3 = X.C371448yI.class
            r2 = -16115282(0xffffffffff0a19ae, float:-1.835668E38)
            com.google.common.collect.ImmutableList r3 = r8.getRequiredCompactedTreeListField(r0, r4, r3, r2)
            if (r3 == 0) goto L_0x082d
            boolean r2 = r3 instanceof java.util.Collection
            if (r2 == 0) goto L_0x080b
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L_0x080b
        L_0x0487:
            r14 = 0
        L_0x0488:
            java.util.Iterator r9 = r6.iterator()
        L_0x048c:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x0808
            java.lang.Object r8 = r9.next()
            r2 = r8
            X.8yC r2 = (X.C371388yC) r2
            X.8yD r3 = r2.A0F()
            X.8yD r2 = X.C371398yD.MEDIA_ATTACHMENT
            if (r3 != r2) goto L_0x048c
        L_0x04a1:
            X.8yC r8 = (X.C371388yC) r8
            if (r8 == 0) goto L_0x0805
            com.google.common.collect.ImmutableList r2 = r8.A0E()
            if (r2 == 0) goto L_0x0805
            java.util.Iterator r9 = r2.iterator()
        L_0x04af:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x0802
            java.lang.Object r8 = r9.next()
            r2 = r8
            X.8yE r2 = (X.C371408yE) r2
            X.8yF r3 = r2.A0E()
            X.8yF r2 = X.C371418yF.SUB_FEATURES
            if (r3 != r2) goto L_0x04af
        L_0x04c4:
            X.8yE r8 = (X.C371408yE) r8
            if (r8 == 0) goto L_0x0805
            X.8yG r2 = r8.A0F()
            if (r2 == 0) goto L_0x0805
            X.8yH r8 = r2.A0E()
            if (r8 == 0) goto L_0x0805
            java.lang.Class<X.8yI> r3 = X.C371448yI.class
            r2 = -16115282(0xffffffffff0a19ae, float:-1.835668E38)
            com.google.common.collect.ImmutableList r3 = r8.getRequiredCompactedTreeListField(r0, r4, r3, r2)
            if (r3 == 0) goto L_0x0805
            boolean r2 = r3 instanceof java.util.Collection
            if (r2 == 0) goto L_0x07e3
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L_0x07e3
        L_0x04e9:
            r15 = 0
        L_0x04ea:
            java.util.Iterator r9 = r6.iterator()
        L_0x04ee:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x07e0
            java.lang.Object r8 = r9.next()
            r2 = r8
            X.8yC r2 = (X.C371388yC) r2
            X.8yD r3 = r2.A0F()
            X.8yD r2 = X.C371398yD.MEDIA_ATTACHMENT
            if (r3 != r2) goto L_0x04ee
        L_0x0503:
            X.8yC r8 = (X.C371388yC) r8
            if (r8 == 0) goto L_0x07dc
            com.google.common.collect.ImmutableList r2 = r8.A0E()
            if (r2 == 0) goto L_0x07dc
            java.util.Iterator r9 = r2.iterator()
        L_0x0511:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x07d9
            java.lang.Object r8 = r9.next()
            r2 = r8
            X.8yE r2 = (X.C371408yE) r2
            X.8yF r3 = r2.A0E()
            X.8yF r2 = X.C371418yF.SUB_FEATURES
            if (r3 != r2) goto L_0x0511
        L_0x0526:
            X.8yE r8 = (X.C371408yE) r8
            if (r8 == 0) goto L_0x07dc
            X.8yG r2 = r8.A0F()
            if (r2 == 0) goto L_0x07dc
            X.8yH r8 = r2.A0E()
            if (r8 == 0) goto L_0x07dc
            java.lang.Class<X.8yI> r3 = X.C371448yI.class
            r2 = -16115282(0xffffffffff0a19ae, float:-1.835668E38)
            com.google.common.collect.ImmutableList r3 = r8.getRequiredCompactedTreeListField(r0, r4, r3, r2)
            if (r3 == 0) goto L_0x07dc
            boolean r2 = r3 instanceof java.util.Collection
            if (r2 == 0) goto L_0x07b9
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L_0x07b9
        L_0x054b:
            r16 = 0
        L_0x054d:
            boolean r2 = r6 instanceof java.util.Collection
            if (r2 == 0) goto L_0x079d
            boolean r3 = r6.isEmpty()
            if (r3 == 0) goto L_0x079d
        L_0x0557:
            r17 = 0
        L_0x0559:
            if (r2 == 0) goto L_0x0781
            boolean r3 = r6.isEmpty()
            if (r3 == 0) goto L_0x0781
        L_0x0561:
            r18 = 0
        L_0x0563:
            if (r2 == 0) goto L_0x0765
            boolean r3 = r6.isEmpty()
            if (r3 == 0) goto L_0x0765
        L_0x056b:
            r19 = 0
        L_0x056d:
            if (r2 == 0) goto L_0x0749
            boolean r3 = r6.isEmpty()
            if (r3 == 0) goto L_0x0749
        L_0x0575:
            r20 = 0
        L_0x0577:
            if (r2 == 0) goto L_0x072d
            boolean r3 = r6.isEmpty()
            if (r3 == 0) goto L_0x072d
        L_0x057f:
            r21 = 0
        L_0x0581:
            if (r2 == 0) goto L_0x0711
            boolean r3 = r6.isEmpty()
            if (r3 == 0) goto L_0x0711
        L_0x0589:
            r22 = 0
        L_0x058b:
            if (r2 == 0) goto L_0x06d8
            boolean r3 = r6.isEmpty()
            if (r3 == 0) goto L_0x06d8
        L_0x0593:
            boolean r3 = r6.isEmpty()
            if (r3 == 0) goto L_0x06f5
        L_0x0599:
            r24 = 0
        L_0x059b:
            if (r2 == 0) goto L_0x06bc
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L_0x06bc
        L_0x05a3:
            r25 = 0
        L_0x05a5:
            java.util.Iterator r8 = r6.iterator()
        L_0x05a9:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x06b9
            java.lang.Object r2 = r8.next()
            r3 = r2
            X.8yC r3 = (X.C371388yC) r3
            X.8yD r4 = r3.A0F()
            X.8yD r3 = X.C371398yD.MEDIA_ATTACHMENT
            if (r4 != r3) goto L_0x05a9
        L_0x05be:
            X.8yC r2 = (X.C371388yC) r2
            if (r2 == 0) goto L_0x06b6
            com.google.common.collect.ImmutableList r2 = r2.A0E()
            if (r2 == 0) goto L_0x06b6
            java.util.Iterator r8 = r2.iterator()
        L_0x05cc:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x06b3
            java.lang.Object r2 = r8.next()
            r3 = r2
            X.8yE r3 = (X.C371408yE) r3
            X.8yF r4 = r3.A0E()
            X.8yF r3 = X.C371418yF.VIDEO_MIN_LENGTH_IN_MS
            if (r4 != r3) goto L_0x05cc
        L_0x05e1:
            X.8yE r2 = (X.C371408yE) r2
            if (r2 == 0) goto L_0x06b6
            X.8yG r2 = r2.A0F()
            if (r2 == 0) goto L_0x06b6
            java.lang.String r3 = "property_string_value"
            java.lang.String r2 = r2.getOptionalStringField(r7, r3)
            if (r2 == 0) goto L_0x06b6
            java.lang.Integer r11 = X.00y.A0l(r2)
        L_0x05f7:
            java.util.Iterator r6 = r6.iterator()
        L_0x05fb:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x06b0
            java.lang.Object r2 = r6.next()
            r3 = r2
            X.8yC r3 = (X.C371388yC) r3
            X.8yD r4 = r3.A0F()
            X.8yD r3 = X.C371398yD.MEDIA_ATTACHMENT
            if (r4 != r3) goto L_0x05fb
        L_0x0610:
            X.8yC r2 = (X.C371388yC) r2
            if (r2 == 0) goto L_0x0649
            com.google.common.collect.ImmutableList r2 = r2.A0E()
            if (r2 == 0) goto L_0x0649
            java.util.Iterator r6 = r2.iterator()
        L_0x061e:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x06ae
            java.lang.Object r2 = r6.next()
            r3 = r2
            X.8yE r3 = (X.C371408yE) r3
            X.8yF r4 = r3.A0E()
            X.8yF r3 = X.C371418yF.VIDEO_MAX_LENGTH_IN_MS
            if (r4 != r3) goto L_0x061e
        L_0x0633:
            X.8yE r2 = (X.C371408yE) r2
            if (r2 == 0) goto L_0x0649
            X.8yG r2 = r2.A0F()
            if (r2 == 0) goto L_0x0649
            java.lang.String r3 = "property_string_value"
            java.lang.String r2 = r2.getOptionalStringField(r7, r3)
            if (r2 == 0) goto L_0x0649
            java.lang.Integer r12 = X.00y.A0l(r2)
        L_0x0649:
            X.7x2 r9 = new X.7x2
            r23 = r0
            r26 = r7
            r27 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r0 = 2
            X.C347207wR.A02(r5, r0)
            X.05G r3 = r1.A05
        L_0x065a:
            java.lang.Object r2 = r3.getValue()
            X.3Ih r0 = new X.3Ih
            r0.<init>(r9)
            boolean r0 = r3.AIY(r2, r0)
            if (r0 == 0) goto L_0x065a
        L_0x0669:
            X.0gF r2 = X.C60340gF.A00
            X.3Ih r0 = new X.3Ih
            r0.<init>(r2)
        L_0x0670:
            boolean r2 = r0 instanceof X.C239793Ih
            if (r2 != 0) goto L_0x08a9
            boolean r2 = r0 instanceof X.C297815sO
            if (r2 == 0) goto L_0x085b
            X.5sO r0 = (X.C297815sO) r0
            java.lang.Object r0 = r0.A00
            com.instagram.common.session.UserSession r2 = r1.A03
            java.lang.String r4 = r0.toString()
            r0 = 0
            X.AnonymousClass7TF.A1B(r2, r0, r4)
            X.02m r3 = X.02m.A0p
            r2 = 383656871(0x16de23a7, float:3.5888534E-25)
            java.lang.String r0 = "error_reason"
            r3.markerAnnotate(r2, r5, r0, r4)
            r0 = 97
            X.C347207wR.A02(r5, r0)
            X.05G r3 = r1.A05
        L_0x0697:
            java.lang.Object r2 = r3.getValue()
            X.0gF r1 = X.C60340gF.A00
            X.5sO r0 = new X.5sO
            r0.<init>(r1)
            boolean r0 = r3.AIY(r2, r0)
            if (r0 == 0) goto L_0x0697
            X.5sO r0 = new X.5sO
            r0.<init>(r1)
            return r0
        L_0x06ae:
            r2 = r12
            goto L_0x0633
        L_0x06b0:
            r2 = r12
            goto L_0x0610
        L_0x06b3:
            r2 = r12
            goto L_0x05e1
        L_0x06b6:
            r11 = r12
            goto L_0x05f7
        L_0x06b9:
            r2 = r12
            goto L_0x05be
        L_0x06bc:
            java.util.Iterator r4 = r6.iterator()
        L_0x06c0:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x05a3
            java.lang.Object r2 = r4.next()
            X.8yC r2 = (X.C371388yC) r2
            X.8yD r3 = r2.A0F()
            X.8yD r2 = X.C371398yD.COMMUNITY_POST
            if (r3 != r2) goto L_0x06c0
            r25 = 1
            goto L_0x05a5
        L_0x06d8:
            java.util.Iterator r8 = r6.iterator()
        L_0x06dc:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x06f1
            java.lang.Object r3 = r8.next()
            X.8yC r3 = (X.C371388yC) r3
            X.8yD r4 = r3.A0F()
            X.8yD r3 = X.C371398yD.AUDIENCE_CONTROL_SELECTED
            if (r4 != r3) goto L_0x06dc
            r0 = 1
        L_0x06f1:
            if (r2 == 0) goto L_0x06f5
            goto L_0x0593
        L_0x06f5:
            java.util.Iterator r8 = r6.iterator()
        L_0x06f9:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0599
            java.lang.Object r3 = r8.next()
            X.8yC r3 = (X.C371388yC) r3
            X.8yD r4 = r3.A0F()
            X.8yD r3 = X.C371398yD.AUDIENCE_CONTROL_SELECTED
            if (r4 != r3) goto L_0x06f9
            r24 = 1
            goto L_0x059b
        L_0x0711:
            java.util.Iterator r8 = r6.iterator()
        L_0x0715:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0589
            java.lang.Object r3 = r8.next()
            X.8yC r3 = (X.C371388yC) r3
            X.8yD r4 = r3.A0F()
            X.8yD r3 = X.C371398yD.COLLAB
            if (r4 != r3) goto L_0x0715
            r22 = 1
            goto L_0x058b
        L_0x072d:
            java.util.Iterator r8 = r6.iterator()
        L_0x0731:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x057f
            java.lang.Object r3 = r8.next()
            X.8yC r3 = (X.C371388yC) r3
            X.8yD r4 = r3.A0F()
            X.8yD r3 = X.C371398yD.BRANDED_CONTENT
            if (r4 != r3) goto L_0x0731
            r21 = 1
            goto L_0x0581
        L_0x0749:
            java.util.Iterator r8 = r6.iterator()
        L_0x074d:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0575
            java.lang.Object r3 = r8.next()
            X.8yC r3 = (X.C371388yC) r3
            X.8yD r4 = r3.A0F()
            X.8yD r3 = X.C371398yD.QUESTION_STICKER
            if (r4 != r3) goto L_0x074d
            r20 = 1
            goto L_0x0577
        L_0x0765:
            java.util.Iterator r8 = r6.iterator()
        L_0x0769:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x056b
            java.lang.Object r3 = r8.next()
            X.8yC r3 = (X.C371388yC) r3
            X.8yD r4 = r3.A0F()
            X.8yD r3 = X.C371398yD.QUIZ_STICKER
            if (r4 != r3) goto L_0x0769
            r19 = 1
            goto L_0x056d
        L_0x0781:
            java.util.Iterator r8 = r6.iterator()
        L_0x0785:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0561
            java.lang.Object r3 = r8.next()
            X.8yC r3 = (X.C371388yC) r3
            X.8yD r4 = r3.A0F()
            X.8yD r3 = X.C371398yD.POLL_STICKER
            if (r4 != r3) goto L_0x0785
            r18 = 1
            goto L_0x0563
        L_0x079d:
            java.util.Iterator r8 = r6.iterator()
        L_0x07a1:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0557
            java.lang.Object r3 = r8.next()
            X.8yC r3 = (X.C371388yC) r3
            X.8yD r4 = r3.A0F()
            X.8yD r3 = X.C371398yD.SLIDER_POLL_STICKER
            if (r4 != r3) goto L_0x07a1
            r17 = 1
            goto L_0x0559
        L_0x07b9:
            java.util.Iterator r8 = r3.iterator()
        L_0x07bd:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x054b
            java.lang.Object r4 = r8.next()
            X.3lr r4 = (X.C250663lr) r4
            X.8yD r3 = X.C371398yD.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r2 = "feature_name"
            java.lang.Enum r3 = r4.getOptionalEnumField(r0, r2, r3)
            X.8yD r2 = X.C371398yD.ADD_YOURS_STICKER
            if (r3 != r2) goto L_0x07bd
            r16 = 1
            goto L_0x054d
        L_0x07d9:
            r8 = r12
            goto L_0x0526
        L_0x07dc:
            r16 = 0
            goto L_0x054d
        L_0x07e0:
            r8 = r12
            goto L_0x0503
        L_0x07e3:
            java.util.Iterator r9 = r3.iterator()
        L_0x07e7:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x04e9
            java.lang.Object r8 = r9.next()
            X.3lr r8 = (X.C250663lr) r8
            X.8yD r3 = X.C371398yD.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r2 = "feature_name"
            java.lang.Enum r3 = r8.getOptionalEnumField(r0, r2, r3)
            X.8yD r2 = X.C371398yD.CUSTOM_AUDIO_ASSETS
            if (r3 != r2) goto L_0x07e7
            r15 = 1
            goto L_0x04ea
        L_0x0802:
            r8 = r12
            goto L_0x04c4
        L_0x0805:
            r15 = 0
            goto L_0x04ea
        L_0x0808:
            r8 = r12
            goto L_0x04a1
        L_0x080b:
            java.util.Iterator r9 = r3.iterator()
        L_0x080f:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x0487
            java.lang.Object r8 = r9.next()
            X.3lr r8 = (X.C250663lr) r8
            X.8yD r3 = X.C371398yD.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r2 = "feature_name"
            java.lang.Enum r3 = r8.getOptionalEnumField(r0, r2, r3)
            X.8yD r2 = X.C371398yD.REMIX_V2
            if (r3 != r2) goto L_0x080f
            r14 = 1
            goto L_0x0488
        L_0x082a:
            r8 = r12
            goto L_0x0462
        L_0x082d:
            r14 = 0
            goto L_0x0488
        L_0x0830:
            r8 = r12
            goto L_0x043f
        L_0x0833:
            java.util.Iterator r9 = r3.iterator()
        L_0x0837:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x0425
            java.lang.Object r8 = r9.next()
            X.3lr r8 = (X.C250663lr) r8
            X.8yD r3 = X.C371398yD.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r2 = "feature_name"
            java.lang.Enum r3 = r8.getOptionalEnumField(r0, r2, r3)
            X.8yD r2 = X.C371398yD.REMIX
            if (r3 != r2) goto L_0x0837
            r13 = 1
            goto L_0x0426
        L_0x0852:
            r8 = r12
            goto L_0x0400
        L_0x0855:
            r13 = 0
            goto L_0x0426
        L_0x0858:
            r8 = r12
            goto L_0x03dd
        L_0x085b:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0860:
            X.0sn r0 = X.0sn.A00
        L_0x0862:
            r14.addAll(r0)
            X.05G r6 = r9.A04
        L_0x0867:
            java.lang.Object r5 = r6.getValue()
            X.62P r4 = X.AnonymousClass62Q.A00(r14)
            java.lang.String r0 = "more_available"
            boolean r3 = r8.hasFieldValue(r0)
            java.lang.String r0 = "next_max_id"
            java.lang.String r1 = r8.getOptionalStringField(r2, r0)
            if (r1 != 0) goto L_0x087f
            r1 = r17
        L_0x087f:
            X.JwF r0 = new X.JwF
            r0.<init>((java.lang.String) r1, (X.AnonymousClass62P) r4, (boolean) r3)
            boolean r0 = r6.AIY(r5, r0)
            if (r0 == 0) goto L_0x0867
            X.05G r1 = r9.A03
            X.9s0 r0 = X.C390889s0.LOADED
            r1.Epw(r0)
            X.0gF r0 = X.C60340gF.A00
        L_0x0893:
            X.3Ih r4 = new X.3Ih
            r4.<init>(r0)
        L_0x0898:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x08a7
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x08aa
            X.05G r1 = r9.A03
            X.9s0 r0 = X.C390889s0.ERROR
            r1.Epw(r0)
        L_0x08a7:
            X.0gF r0 = X.C60340gF.A00
        L_0x08a9:
            return r0
        L_0x08aa:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9PR.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9PR(AnonymousClass89T r2, String str, AnonymousClass4D7 r4, boolean z) {
        super(1, r4);
        this.A05 = z;
        this.A03 = r2;
        this.A04 = str;
    }
}
