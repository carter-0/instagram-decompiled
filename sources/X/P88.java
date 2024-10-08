package X;

public final class P88 implements AnonymousClass7DS {
    public final int A00;
    public final Object A01;

    public P88(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01b6, code lost:
        if (r3.A0P() == null) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01f0, code lost:
        if (X.C331057Pi.A02(r9.AiM()) != false) goto L_0x01f2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0377  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0387  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0327 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x022b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean DRa(android.view.MotionEvent r59, java.lang.Object r60, java.lang.Object r61) {
        /*
            r58 = this;
            r1 = r58
            r2 = r61
            r3 = r60
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x03ab;
                case 1: goto L_0x00c5;
                case 2: goto L_0x00a9;
                default: goto L_0x000b;
            }
        L_0x000b:
            X.OuB r3 = (X.C71979OuB) r3
            X.MzE r2 = (X.C68047MzE) r2
            X.N37 r6 = r3.A02
            if (r6 != 0) goto L_0x0017
            X.Jw3 r0 = r3.A01
            if (r0 == 0) goto L_0x006b
        L_0x0017:
            com.instagram.user.model.User r7 = r3.A03
            if (r7 == 0) goto L_0x006b
            java.lang.Object r0 = r1.A01
            X.OE1 r0 = (X.OE1) r0
            X.Mtw r4 = r0.A02
            java.lang.String r10 = r3.A06
            X.Jw3 r5 = r3.A01
            java.lang.Integer r8 = r3.A05
            com.instagram.common.session.UserSession r0 = r0.A00
            boolean r0 = X.AnonymousClass7K4.A01(r0)
            if (r0 == 0) goto L_0x0095
            X.3oV r1 = r2.A06
            boolean r0 = r1.CVM()
            if (r0 == 0) goto L_0x00c0
            android.view.View r0 = r1.getView()
        L_0x003b:
            if (r0 == 0) goto L_0x00c0
            boolean r14 = X.C66581MXm.A1Z(r7)
            r13 = 0
            if (r6 == 0) goto L_0x006d
            r9 = 0
            java.lang.String r12 = r4.A06
            X.0Ud r1 = r4.A09
            java.lang.Object r2 = r1.getValue()
            boolean r1 = r2 instanceof X.C68269N8g
            if (r1 == 0) goto L_0x0057
            X.N8g r2 = (X.C68269N8g) r2
            if (r2 == 0) goto L_0x0057
            java.lang.String r13 = r2.A02
        L_0x0057:
            r11 = r9
            r15 = r14
            r16 = r14
            r17 = r14
            X.Oa5 r3 = X.C71127OdQ.A02(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x0061:
            X.05G r2 = r4.A07
            X.N8d r1 = new X.N8d
            r1.<init>(r0, r3)
            r2.Epw(r1)
        L_0x006b:
            r0 = 0
            return r0
        L_0x006d:
            if (r5 == 0) goto L_0x006b
            java.lang.Object r15 = r5.A02
            com.instagram.common.typedurl.ImageUrl r15 = (com.instagram.common.typedurl.ImageUrl) r15
            int r6 = r5.A01
            int r3 = r5.A00
            java.lang.String r2 = r4.A06
            X.0Ud r1 = r4.A09
            r1.getValue()
            r16 = r7
            r17 = r8
            r18 = r10
            r19 = r2
            r20 = r6
            r21 = r3
            r22 = r14
            r23 = r14
            r24 = r14
            X.Oa5 r3 = X.C71127OdQ.A03(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0061
        L_0x0095:
            X.3oV r1 = r2.A08
            boolean r0 = r1.CVM()
            if (r0 == 0) goto L_0x00c0
            android.view.View r1 = r1.getView()
            r0 = 2131435878(0x7f0b2166, float:1.849361E38)
            android.view.View r0 = r1.requireViewById(r0)
            goto L_0x003b
        L_0x00a9:
            java.lang.Object r2 = r1.A01
            X.7XA r2 = (X.AnonymousClass7XA) r2
            X.NYe r3 = (X.C68820NYe) r3
            java.lang.Integer r1 = r3.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x006b
            X.7Xp r2 = (X.C333087Xp) r2
            com.instagram.model.direct.messageid.MessageIdentifier r0 = r3.BSG()
            r2.EJM(r0)
            goto L_0x03fb
        L_0x00c0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00c5:
            X.NVY r3 = (X.NVY) r3
            java.lang.Object r0 = r1.A01
            X.OIQ r0 = (X.OIQ) r0
            X.NKm r5 = r0.A06
            X.3su r6 = r3.A00
            r2 = 0
            X.3tC r0 = X.C3266377o.A01(r6)
            r4 = 0
            if (r0 == 0) goto L_0x038d
            java.lang.String r1 = r0.A0u
            r8 = 1
            if (r1 == 0) goto L_0x038d
            int r0 = r1.length()
            if (r0 == 0) goto L_0x038d
            android.net.Uri r9 = X.DbT.A09(r1)
            java.util.List r7 = r9.getPathSegments()
            int r1 = r7.size()
            r0 = 2
            if (r1 < r0) goto L_0x038d
            java.lang.String r1 = X.AnonymousClass7TE.A19(r7, r2)
            java.lang.String r0 = "reel"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x038d
            java.lang.String r3 = r9.getHost()
            if (r3 == 0) goto L_0x038d
            java.lang.String r1 = ".*instagram.*"
            X.11S r0 = new X.11S
            r0.<init>(r1)
            boolean r0 = r0.A08(r3)
            if (r0 != r8) goto L_0x038d
            java.lang.String r0 = "id"
            java.lang.String r1 = r9.getQueryParameter(r0)
            java.lang.Object r0 = r7.get(r8)
            X.0eP r1 = X.AnonymousClass7TE.A1L(r1, r0)
        L_0x011e:
            java.lang.Object r0 = r1.A00
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r1.A01
            java.lang.String r1 = (java.lang.String) r1
            if (r0 != 0) goto L_0x0130
            X.1Xj r0 = r6.A0s
            if (r0 == 0) goto L_0x038a
            java.lang.String r0 = r0.getId()
        L_0x0130:
            if (r1 != 0) goto L_0x0387
            X.1Xj r1 = r6.A0s
            if (r1 == 0) goto L_0x013a
            java.lang.String r4 = r1.A2Z()
        L_0x013a:
            if (r0 != 0) goto L_0x013e
            if (r4 == 0) goto L_0x03fb
        L_0x013e:
            X.ODb r7 = r5.A01
            if (r7 == 0) goto L_0x03fb
            r20 = 0
            com.instagram.model.direct.messageid.DirectMessageIdentifier r8 = r6.A0V()
            X.0eM r1 = r5.A0I
            java.lang.String r1 = X.DbU.A0u(r1)
            boolean r46 = X.AnonymousClass7F3.A01(r6, r1)
            if (r0 != 0) goto L_0x015a
            if (r4 == 0) goto L_0x03a4
            java.lang.String r0 = X.C70282O0m.A00(r4)
        L_0x015a:
            X.4DH r1 = r7.A00
            r57 = r1
            androidx.fragment.app.FragmentActivity r1 = r57.getActivity()
            if (r1 == 0) goto L_0x0167
            X.0nA.A0J(r1)
        L_0x0167:
            com.instagram.common.session.UserSession r1 = r7.A01
            r21 = r1
            com.instagram.clips.intf.ClipsViewerSource r4 = com.instagram.clips.intf.ClipsViewerSource.DIRECT
            X.4h3 r1 = new X.4h3
            r3 = r21
            r1.<init>(r4, r3)
            r31 = 0
            r1.A1C = r0
            X.7Zg r4 = r7.A02
            X.7S7 r19 = r4.C6l()
            X.3sy r7 = r19.B8S()
            X.0qQ.A07(r7)
            com.instagram.model.direct.DirectThreadKey r3 = X.C66647MaG.A04(r7)
            if (r3 == 0) goto L_0x0377
            com.instagram.model.direct.DirectThreadKey r18 = X.C66647MaG.A03(r7)
            r3 = r18
            java.lang.String r3 = r3.A00
            r17 = r3
            r7 = r31
        L_0x0197:
            X.7ZY r5 = r4.BSN()
            boolean r14 = r5 instanceof X.AnonymousClass7ZX
            if (r14 == 0) goto L_0x0373
            r4 = r5
            X.7ZX r4 = (X.AnonymousClass7ZX) r4
            if (r4 == 0) goto L_0x0373
            java.lang.String r3 = r8.A01
            X.7LQ r4 = r4.BSO(r3)
            if (r4 == 0) goto L_0x01b8
            X.3su r3 = r4.A0e
            if (r3 == 0) goto L_0x01b8
            X.3tI r3 = r3.A0P()
            r41 = 1
            if (r3 != 0) goto L_0x01ba
        L_0x01b8:
            r41 = 0
        L_0x01ba:
            if (r18 == 0) goto L_0x036f
            X.2Dm r3 = X.1bJ.A00(r21)
            java.util.HashSet r6 = r3.Bk6()
            r3 = r18
            boolean r54 = r6.contains(r3)
        L_0x01ca:
            android.content.Context r6 = r57.getContext()
            if (r6 == 0) goto L_0x036a
            r3 = r19
            com.instagram.model.direct.DirectShareTarget r6 = r3.C6Z(r6)
            if (r6 == 0) goto L_0x036b
            X.2Dm r3 = X.1bJ.A00(r21)
            X.3U9 r9 = r3.BYf(r6)
            boolean r3 = r9.Axj()
            if (r3 != 0) goto L_0x01f2
            X.3Tu r3 = r9.AiM()
            boolean r3 = X.C331057Pi.A02(r3)
            r55 = 0
            if (r3 == 0) goto L_0x01f4
        L_0x01f2:
            r55 = 1
        L_0x01f4:
            java.lang.String r3 = r8.A01
            java.lang.String r16 = r8.A00()
            boolean r47 = r19.CdK()
            boolean r48 = r19.CYS()
            boolean r49 = r19.CV8()
            boolean r50 = X.AnonymousClass7TF.A1V(r7)
            X.7SD r9 = r19.C6Q()
            boolean r10 = r9.A16
            boolean r56 = r19.COb()
            com.instagram.clips.intf.ClipsViewerDirectData r9 = new com.instagram.clips.intf.ClipsViewerDirectData
            r42 = r9
            r43 = r3
            r44 = r16
            r45 = r17
            r51 = r10
            r52 = r41
            r53 = r2
            r42.<init>(r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)
            r1.A0G = r9
            if (r14 == 0) goto L_0x029c
            r1.A1c = r2
            java.lang.String r9 = "null cannot be cast to non-null type com.instagram.direct.messagethread.DirectMessageStoreImpl"
            X.0qQ.A0C(r5, r9)
            r9 = r5
            X.7ZX r9 = (X.AnonymousClass7ZX) r9
            X.7YU r13 = r9.A0l
            if (r13 == 0) goto L_0x0365
            r13.A08(r3, r2)
            com.google.common.collect.ImmutableList r9 = r13.A04()
            java.util.List r11 = r13.A06
            boolean r10 = r11.contains(r3)
            if (r10 == 0) goto L_0x035f
            int r10 = r11.indexOf(r3)
            if (r10 < 0) goto L_0x035c
            java.lang.String r10 = X.AnonymousClass7TE.A19(r11, r10)
            int r11 = r13.A03(r10)
        L_0x0256:
            X.GMD r12 = X.GNS.A00(r21)
            X.0qQ.A07(r12)
            r12.A00 = r11
            if (r13 == 0) goto L_0x0263
            r13.A01 = r11
        L_0x0263:
            if (r11 < 0) goto L_0x0332
            int r10 = r9.size()
            if (r11 >= r10) goto L_0x0332
            java.lang.Object r10 = r9.get(r11)
            X.4bN r10 = (X.C267324bN) r10
            X.1Xj r10 = r10.A02
            if (r10 == 0) goto L_0x032e
            java.lang.String r10 = r10.getId()
        L_0x0279:
            boolean r10 = X.0qQ.A0K(r10, r0)
            if (r10 == 0) goto L_0x0332
            java.lang.Object r9 = r9.get(r11)
            X.4bN r9 = (X.C267324bN) r9
            X.1Xj r9 = r9.A02
            if (r9 == 0) goto L_0x0332
            com.instagram.model.mediasize.ImageInfo r9 = r9.A1p()
            if (r9 == 0) goto L_0x0332
            if (r13 == 0) goto L_0x032a
            com.google.common.collect.ImmutableList r4 = r13.A05(r2)
            int r11 = r13.A01
        L_0x0297:
            r1.A04 = r11
            r12.A05(r4)
        L_0x029c:
            java.lang.String r9 = r5.BsP(r8)
            X.OJc r4 = new X.OJc
            r5 = r21
            r4.<init>(r5)
            if (r6 == 0) goto L_0x0318
            if (r16 == 0) goto L_0x0318
            if (r14 == 0) goto L_0x0318
            java.util.List r5 = r19.BRZ()
            java.util.ListIterator r10 = X.C51968G9o.A18(r5)
        L_0x02b5:
            boolean r5 = r10.hasPrevious()
            if (r5 == 0) goto L_0x0327
            java.lang.Object r8 = r10.previous()
            java.lang.String r5 = X.DbS.A0q(r8)
            boolean r5 = X.0qQ.A0K(r5, r9)
            if (r5 == 0) goto L_0x02b5
        L_0x02c9:
            com.instagram.user.model.User r8 = (com.instagram.user.model.User) r8
            if (r8 == 0) goto L_0x02d1
            java.lang.String r31 = X.AnonymousClass50n.A08(r8)
        L_0x02d1:
            r5 = r21
            boolean r37 = X.C66580MXl.A1X(r5, r9)
            java.lang.String r29 = r19.C6f()
            boolean r35 = r19.CVE()
            boolean r36 = r19.CUO()
            X.3t0 r5 = r19.BN3()
            boolean r39 = X.AnonymousClass7TF.A1V(r5)
            int r8 = r6.A01
            int r34 = r19.AdN()
            java.lang.String r28 = "clips_reply_direct"
            com.instagram.clips.model.ClipsReplyBarData r5 = new com.instagram.clips.model.ClipsReplyBarData
            r23 = r18
            r24 = r7
            r25 = r0
            r26 = r3
            r27 = r16
            r30 = r17
            r32 = r20
            r33 = r8
            r38 = r2
            r40 = r2
            r42 = r2
            r43 = r2
            r44 = r2
            r22 = r6
            r21 = r5
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            r1.A0I = r5
        L_0x0318:
            com.instagram.clips.intf.ClipsViewerConfig r2 = r1.A00()
            androidx.fragment.app.FragmentActivity r1 = r57.requireActivity()
            r0 = r20
            r4.A00(r1, r2, r0)
            goto L_0x03fb
        L_0x0327:
            r8 = r31
            goto L_0x02c9
        L_0x032a:
            X.0sn r4 = X.0sn.A00
            goto L_0x0297
        L_0x032e:
            r10 = r31
            goto L_0x0279
        L_0x0332:
            if (r41 != 0) goto L_0x029c
            if (r4 == 0) goto L_0x029c
            com.instagram.user.model.User r15 = r4.A0K
            long r9 = r4.C7Z()
            r13 = 1
            X.9IL r11 = new X.9IL
            r11.<init>(r9, r15, r13)
            if (r16 == 0) goto L_0x0394
            java.util.ArrayList r10 = r4.A04()
            X.9JD r9 = new X.9JD
            r4 = r16
            r9.<init>((X.AnonymousClass9IL) r11, (java.lang.String) r3, (java.lang.String) r4, (java.util.List) r10)
            r1.A04 = r2
            r12.A00 = r2
            java.util.List r4 = X.AnonymousClass7TE.A1I(r9)
            r12.A05(r4)
            goto L_0x029c
        L_0x035c:
            r11 = -1
            goto L_0x0256
        L_0x035f:
            int r11 = r13.A03(r3)
            goto L_0x0256
        L_0x0365:
            X.0sn r9 = X.0sn.A00
            r11 = 0
            goto L_0x0256
        L_0x036a:
            r6 = 0
        L_0x036b:
            r55 = 0
            goto L_0x01f4
        L_0x036f:
            r54 = 0
            goto L_0x01ca
        L_0x0373:
            r4 = r31
            goto L_0x01b8
        L_0x0377:
            boolean r3 = r7 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r3 == 0) goto L_0x0399
            com.instagram.model.direct.threadkey.impl.MsysThreadId r7 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r7
            java.lang.Long r3 = r7.A02
            java.lang.String r17 = java.lang.String.valueOf(r3)
            r18 = r31
            goto L_0x0197
        L_0x0387:
            r4 = r1
            goto L_0x013a
        L_0x038a:
            r0 = r4
            goto L_0x0130
        L_0x038d:
            X.0eP r1 = new X.0eP
            r1.<init>(r4, r4)
            goto L_0x011e
        L_0x0394:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0399:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Expected DirectThreadKey or MsysThreadKey, instead found: "
            java.lang.IllegalStateException r0 = X.C66582MXn.A0k(r7, r0, r1)
            throw r0
        L_0x03a4:
            java.lang.String r0 = "Must pass either mediaId or mediaCode"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x03ab:
            X.NVH r3 = (X.NVH) r3
            X.3kE r2 = (X.C249703kE) r2
            java.lang.Object r6 = r1.A01
            X.OIT r6 = (X.OIT) r6
            java.lang.String r5 = r6.A0K
            r4 = 1
            if (r5 == 0) goto L_0x03e2
            int r1 = r5.hashCode()
            r0 = -76391525(0xfffffffffb725b9b, float:-1.2583938E36)
            if (r1 == r0) goto L_0x0402
            r0 = 531959920(0x1fb51070, float:7.6683675E-20)
            if (r1 == r0) goto L_0x03ff
            r0 = 535918816(0x1ff178e0, float:1.0226744E-19)
            if (r1 != r0) goto L_0x03e2
            java.lang.String r0 = "roll_call"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x03e2
            X.ONz r5 = r6.A0A
            X.Nmf r4 = X.C69497Nmf.TAP
            X.MuF r0 = r6.A0D
            java.lang.String r1 = r0.A0B
            com.instagram.model.direct.DirectThreadKey r0 = r6.A0J
            java.lang.String r0 = r0.A00
            r5.A02(r4, r1, r0)
        L_0x03e2:
            boolean r0 = r3.BCL()
            if (r0 != 0) goto L_0x03fb
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r0 = r3.A06
            if (r0 == 0) goto L_0x03fd
            java.lang.Integer r1 = r0.A02
        L_0x03ee:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x03fb
            X.0sP r1 = r3.A00
            android.view.View r0 = X.JTO.A0F(r2)
            r1.invoke(r0)
        L_0x03fb:
            r0 = 1
            return r0
        L_0x03fd:
            r1 = 0
            goto L_0x03ee
        L_0x03ff:
            java.lang.String r0 = "challenges"
            goto L_0x0404
        L_0x0402:
            java.lang.String r0 = "challenge_winner"
        L_0x0404:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x03e2
            com.instagram.common.session.UserSession r0 = r6.A09
            X.2Dm r1 = X.1bJ.A00(r0)
            com.instagram.model.direct.DirectThreadKey r0 = r6.A0J
            X.3U9 r0 = r1.B33(r0)
            if (r0 == 0) goto L_0x03fb
            X.3S9 r0 = r0.A01
            X.3Te r0 = r0.A0s
            if (r0 == 0) goto L_0x03fb
            boolean r0 = r0.A0I
            if (r0 != r4) goto L_0x03fb
            goto L_0x03e2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P88.DRa(android.view.MotionEvent, java.lang.Object, java.lang.Object):boolean");
    }
}
