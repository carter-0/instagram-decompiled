package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.IGLiveGameStatus;
import com.instagram.api.schemas.IGLiveGames;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CIG extends 17P implements C239663Hm {
    public C278064wB A00;
    public User A01;
    public List A02;
    public List A03;
    public List A04;

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.CIG] */
    public final AnonymousClass3ZV AaD() {
        return (AnonymousClass3ZV) getTreeValueByHashCode(-1521819552, C43898CHr.class);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.CIG] */
    public final C277964w1 Ai1() {
        return (C277964w1) getTreeValueByHashCode(837538200, CLC.class);
    }

    public final User Ai5() {
        return this.A01;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.CIG] */
    public final C278064wB Amw() {
        C278064wB r0 = this.A00;
        if (r0 == null) {
            return (C278064wB) getTreeValueByHashCode(1954389749, CKG.class);
        }
        return r0;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.CIG] */
    public final List An0() {
        return getOptionalTreeListByHashCode(1619779893, C43950CLu.class);
    }

    public final List AoU() {
        return this.A02;
    }

    public final IGLiveGames Au1() {
        return (IGLiveGames) A0N(1468517112, DKA.A00);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.CIG] */
    public final C277454vC Ax5() {
        return (C277454vC) getTreeValueByHashCode(-119788168, C43942CLi.class);
    }

    public final IGLiveGameStatus B8u() {
        return (IGLiveGameStatus) A0N(17796319, DKB.A00);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.CIG] */
    public final C278084wF B8w() {
        return (C278084wF) getTreeValueByHashCode(-1253023032, CKI.class);
    }

    public final Long BEY() {
        return A0L(3355);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.CIG] */
    public final C277994w4 BQf() {
        return (C277994w4) getTreeValueByHashCode(-1513490504, CM7.class);
    }

    public final List CBq() {
        return A0p(1853545970, new MP6(this, 14));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.CIG] */
    public final C278104wH CCt() {
        return (C278104wH) getTreeValueByHashCode(-1847653564, KVY.class);
    }

    public final List CF0() {
        return this.A04;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.facebook.pando.TreeJNI, X.CIG, X.3Hm] */
    public final C239663Hm E76(1E9 r6) {
        User user;
        ArrayList arrayList;
        ArrayList arrayList2;
        Class<ImmutablePandoUserDict> cls = ImmutablePandoUserDict.class;
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) getTreeValueByHashCode(1786177973, cls);
        if (immutablePandoUserDict != null) {
            user = C41845B3m.A0b(r6, immutablePandoUserDict);
        } else {
            user = null;
        }
        this.A01 = user;
        C278064wB Amw = Amw();
        ArrayList arrayList3 = null;
        if (Amw != null) {
            Amw.E7R(r6);
        } else {
            Amw = null;
        }
        this.A00 = Amw;
        ImmutableList optionalTreeListByHashCode = getOptionalTreeListByHashCode(-767350927, cls);
        if (optionalTreeListByHashCode != null) {
            arrayList = AnonymousClass7TG.A0r(optionalTreeListByHashCode);
            Iterator it = optionalTreeListByHashCode.iterator();
            while (it.hasNext()) {
                C41847B3o.A1P(r6, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A02 = arrayList;
        List<AnonymousClass536> sponsorTags = getSponsorTags();
        if (sponsorTags != null) {
            arrayList3 = AnonymousClass7TG.A0r(sponsorTags);
            for (AnonymousClass536 r0 : sponsorTags) {
                r0.E8F(r6);
                arrayList3.add(r0);
            }
        }
        this.A03 = arrayList3;
        ImmutableList optionalTreeListByHashCode2 = getOptionalTreeListByHashCode(739041181, cls);
        if (optionalTreeListByHashCode2 != null) {
            arrayList2 = AnonymousClass7TG.A0r(optionalTreeListByHashCode2);
            Iterator it2 = optionalTreeListByHashCode2.iterator();
            while (it2.hasNext()) {
                C41847B3o.A1P(r6, arrayList2, it2);
            }
        } else {
            arrayList2 = null;
        }
        this.A04 = arrayList2;
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: X.17P} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x024a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C239653Hl F0z(X.1E9 r70) {
        /*
            r69 = this;
            r0 = r69
            X.3ZV r1 = r0.AaD()
            if (r1 == 0) goto L_0x007e
            X.4w9 r8 = r1.F0J()
        L_0x000c:
            X.4w1 r1 = r0.Ai1()
            if (r1 == 0) goto L_0x007c
            X.4w0 r11 = r1.F4Q()
        L_0x0016:
            r1 = 246302041(0xeae4559, float:4.296109E-30)
            java.lang.Long r44 = r0.A0L(r1)
            r1 = 539770505(0x202c3e89, float:1.4589658E-19)
            java.lang.String r50 = r0.getStringValueByHashCode(r1)
            java.lang.Class<com.instagram.user.model.ImmutablePandoUserDict> r3 = com.instagram.user.model.ImmutablePandoUserDict.class
            r1 = 1786177973(0x6a76e9b5, float:7.462485E25)
            com.facebook.pando.TreeJNI r2 = r0.getTreeValueByHashCode(r1, r3)
            com.instagram.user.model.ImmutablePandoUserDict r2 = (com.instagram.user.model.ImmutablePandoUserDict) r2
            r1 = r70
            if (r2 == 0) goto L_0x0079
            com.instagram.user.model.User r2 = X.C41845B3m.A0b(r1, r2)
            if (r2 == 0) goto L_0x0079
            com.instagram.user.model.User r17 = X.C41846B3n.A0b(r1, r2)
        L_0x003d:
            r2 = -439008606(0xffffffffe5d542a2, float:-1.2588665E23)
            java.lang.String r51 = r0.getStringValueByHashCode(r2)
            r2 = -351684304(0xffffffffeb09b930, float:-1.6649736E26)
            java.lang.String r52 = r0.getStringValueByHashCode(r2)
            X.4wB r2 = r0.Amw()
            if (r2 == 0) goto L_0x0077
            X.4wA r9 = r2.F3G(r1)
        L_0x0055:
            java.util.List r2 = r0.An0()
            if (r2 == 0) goto L_0x0080
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0p(r2)
            java.util.Iterator r4 = r2.iterator()
        L_0x0063:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0081
            java.lang.Object r2 = r4.next()
            X.DTG r2 = (X.DTG) r2
            X.BFL r2 = r2.F5V()
            r6.add(r2)
            goto L_0x0063
        L_0x0077:
            r9 = 0
            goto L_0x0055
        L_0x0079:
            r17 = 0
            goto L_0x003d
        L_0x007c:
            r11 = 0
            goto L_0x0016
        L_0x007e:
            r8 = 0
            goto L_0x000c
        L_0x0080:
            r6 = 0
        L_0x0081:
            r2 = -767350927(0xffffffffd2432771, float:-2.09545085E11)
            com.google.common.collect.ImmutableList r2 = r0.getOptionalTreeListByHashCode(r2, r3)
            if (r2 == 0) goto L_0x00b0
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r2)
            java.util.Iterator r4 = r2.iterator()
        L_0x0092:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x009c
            X.C41847B3o.A1P(r1, r7, r4)
            goto L_0x0092
        L_0x009c:
            if (r7 == 0) goto L_0x00b0
            java.util.ArrayList r5 = X.AnonymousClass7TF.A0p(r7)
            java.util.Iterator r4 = r7.iterator()
        L_0x00a6:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x00b1
            X.C41847B3o.A1Q(r1, r5, r4)
            goto L_0x00a6
        L_0x00b0:
            r5 = 0
        L_0x00b1:
            r2 = 711754413(0x2a6c82ad, float:2.1006348E-13)
            java.lang.Boolean r18 = r0.A0B(r2)
            r2 = -1105496811(0xffffffffbe1b7515, float:-0.15181382)
            java.lang.String r53 = r0.getStringValueByHashCode(r2)
            com.instagram.api.schemas.IGLiveGames r13 = r0.Au1()
            r2 = 610303846(0x24607f66, float:4.8680168E-17)
            java.lang.String r54 = r0.getStringValueByHashCode(r2)
            r2 = 1128191036(0x433ed43c, float:190.82904)
            java.lang.String r55 = r0.getStringValueByHashCode(r2)
            r2 = -306570024(0xffffffffedba1cd8, float:-7.199885E27)
            java.lang.String r56 = r0.getStringValueByHashCode(r2)
            X.4vC r2 = r0.Ax5()
            if (r2 == 0) goto L_0x01fa
            X.4vB r14 = r2.F5A()
        L_0x00e2:
            r2 = -849397074(0xffffffffcd5f3aae, float:-2.340728E8)
            java.lang.String r57 = r0.getStringValueByHashCode(r2)
            r2 = 250178387(0xee96b53, float:5.7542284E-30)
            java.lang.Integer r35 = r0.getOptionalIntValueByHashCode(r2)
            r2 = -1603026769(0xffffffffa073c0af, float:-2.0646654E-19)
            java.lang.Boolean r19 = r0.A0B(r2)
            com.instagram.api.schemas.IGLiveGameStatus r12 = r0.B8u()
            X.4wF r2 = r0.B8w()
            if (r2 == 0) goto L_0x01f7
            X.4wE r10 = r2.F3K()
        L_0x0105:
            r2 = 1002875341(0x3bc6a9cd, float:0.0060627223)
            java.lang.Boolean r20 = r0.A0B(r2)
            r2 = 3355(0xd1b, float:4.701E-42)
            java.lang.Long r45 = r0.A0L(r2)
            r2 = -1913559045(0xffffffff8df167fb, float:-1.4877804E-30)
            java.lang.Long r46 = r0.A0L(r2)
            r2 = 962182482(0x3959bd52, float:2.076526E-4)
            java.lang.Integer r36 = r0.getOptionalIntValueByHashCode(r2)
            r2 = 1826537454(0x6cdebfee, float:2.1543032E27)
            java.lang.Boolean r21 = r0.A0B(r2)
            r2 = 1716077986(0x664945a2, float:2.3762004E23)
            java.lang.Boolean r22 = r0.A0B(r2)
            r2 = 13224064(0xc9c880, float:1.853086E-38)
            java.lang.Boolean r23 = r0.A0B(r2)
            r2 = -326622034(0xffffffffec8824ae, float:-1.316697E27)
            java.lang.Boolean r24 = r0.A0B(r2)
            r2 = -1480468020(0xffffffffa7c1d9cc, float:-5.3804397E-15)
            java.lang.Boolean r25 = r0.A0B(r2)
            r2 = -155996292(0xfffffffff6b3af7c, float:-1.8222273E33)
            java.lang.Boolean r26 = r0.A0B(r2)
            r2 = -843726979(0xffffffffcdb5bf7d, float:-3.81153184E8)
            java.lang.Integer r37 = r0.getOptionalIntValueByHashCode(r2)
            r2 = -433113869(0xffffffffe62f34f3, float:-2.0684772E23)
            java.lang.Boolean r27 = r0.A0B(r2)
            r2 = 187141712(0xb278e50, float:3.2270094E-32)
            java.lang.Boolean r28 = r0.A0B(r2)
            r2 = -556318521(0xffffffffded740c7, float:-7.755308E18)
            java.lang.Long r47 = r0.A0L(r2)
            r2 = -900774058(0xffffffffca4f4756, float:-3396053.5)
            java.lang.String r58 = r0.getStringValueByHashCode(r2)
            X.4w4 r2 = r0.BQf()
            if (r2 == 0) goto L_0x01f4
            X.4w3 r16 = r2.F5w()
        L_0x0177:
            r2 = 104264043(0x636f16b, float:3.440776E-35)
            java.lang.Boolean r29 = r0.A0B(r2)
            r2 = 2030838443(0x790c22ab, float:4.5476544E34)
            java.lang.Integer r38 = r0.getOptionalIntValueByHashCode(r2)
            r2 = -1133964731(0xffffffffbc691245, float:-0.014225547)
            java.lang.String r59 = r0.getStringValueByHashCode(r2)
            r2 = 1879474642(0x700681d2, float:1.6651174E29)
            java.lang.String r60 = r0.getStringValueByHashCode(r2)
            r2 = -318184504(0xffffffffed08e3c8, float:-2.6478332E27)
            java.lang.String r61 = r0.getStringValueByHashCode(r2)
            r2 = 1683225983(0x6453fd7f, float:1.5642117E22)
            java.lang.String r62 = r0.getStringValueByHashCode(r2)
            r2 = 615083646(0x24a96e7e, float:7.347925E-17)
            java.lang.Integer r39 = r0.getOptionalIntValueByHashCode(r2)
            r2 = 964289780(0x3979e4f4, float:2.3831782E-4)
            java.lang.String r63 = r0.A0j(r2)
            r2 = -1456594659(0xffffffffa92e211d, float:-3.8664482E-14)
            java.lang.Integer r40 = r0.getOptionalIntValueByHashCode(r2)
            r2 = 1233754776(0x49899a98, float:1127251.0)
            java.lang.Long r48 = r0.A0L(r2)
            r2 = -960041127(0xffffffffc6c6ef59, float:-25463.674)
            java.lang.Integer r41 = r0.getOptionalIntValueByHashCode(r2)
            r2 = -914544340(0xffffffffc97d292c, float:-1036946.75)
            java.lang.Boolean r30 = r0.A0B(r2)
            r2 = 126023082(0x782f5aa, float:1.9704614E-34)
            java.lang.Long r49 = r0.A0L(r2)
            java.util.List r2 = r0.getSponsorTags()
            if (r2 == 0) goto L_0x01fd
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r2)
            java.util.Iterator r7 = r2.iterator()
        L_0x01e0:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x01fe
            java.lang.Object r2 = r7.next()
            X.536 r2 = (X.AnonymousClass536) r2
            X.535 r2 = r2.F9G(r1)
            r4.add(r2)
            goto L_0x01e0
        L_0x01f4:
            r16 = 0
            goto L_0x0177
        L_0x01f7:
            r10 = 0
            goto L_0x0105
        L_0x01fa:
            r14 = 0
            goto L_0x00e2
        L_0x01fd:
            r4 = 0
        L_0x01fe:
            r2 = -1005449935(0xffffffffc4120d31, float:-584.2061)
            java.lang.Boolean r31 = r0.A0B(r2)
            r2 = 1063758359(0x3f67aa17, float:0.9049391)
            java.lang.Boolean r32 = r0.A0B(r2)
            r2 = -253163307(0xfffffffff0e908d5, float:-5.7696548E29)
            java.lang.Integer r42 = r0.getOptionalIntValueByHashCode(r2)
            java.util.List r67 = r0.CBq()
            X.4wH r2 = r0.CCt()
            if (r2 == 0) goto L_0x024a
            X.4wG r15 = r2.F5a()
        L_0x0221:
            r2 = 706299096(0x2a1944d8, float:1.3613015E-13)
            java.lang.Float r33 = r0.A0K(r2)
            r2 = 479826082(0x1c9990a2, float:1.0162077E-21)
            java.lang.Float r34 = r0.A0K(r2)
            r2 = 739041181(0x2c0cdf9d, float:2.0019327E-12)
            com.google.common.collect.ImmutableList r3 = r0.getOptionalTreeListByHashCode(r2, r3)
            if (r3 == 0) goto L_0x0260
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x0240:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x024c
            X.C41847B3o.A1P(r1, r2, r3)
            goto L_0x0240
        L_0x024a:
            r15 = 0
            goto L_0x0221
        L_0x024c:
            if (r2 == 0) goto L_0x0260
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x0256:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0261
            X.C41847B3o.A1Q(r1, r3, r2)
            goto L_0x0256
        L_0x0260:
            r3 = 0
        L_0x0261:
            r1 = 1941332754(0x73b66312, float:2.8900373E31)
            java.lang.Integer r43 = r0.getOptionalIntValueByHashCode(r1)
            X.3Hl r7 = new X.3Hl
            r64 = r6
            r65 = r5
            r66 = r4
            r68 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CIG.F0z(X.1E9):X.3Hl");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CIG, X.3Hm] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CV9.A00(this));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.CIG] */
    public final List getSponsorTags() {
        List list = this.A03;
        if (list == null) {
            return getOptionalTreeListByHashCode(-1676707298, COS.class);
        }
        return list;
    }

    public final Long Ai2() {
        return A0L(246302041);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CIG] */
    public final String Ai4() {
        return getStringValueByHashCode(539770505);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CIG] */
    public final String Ai6() {
        return getStringValueByHashCode(-439008606);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CIG] */
    public final String Ai7() {
        return getStringValueByHashCode(-351684304);
    }

    public final Boolean ArQ() {
        return A0B(711754413);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CIG] */
    public final String Ars() {
        return getStringValueByHashCode(-1105496811);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CIG] */
    public final String Av7() {
        return getStringValueByHashCode(610303846);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CIG] */
    public final String Av9() {
        return getStringValueByHashCode(-306570024);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CIG] */
    public final String B1P() {
        return getStringValueByHashCode(-849397074);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CIG] */
    public final Integer B2j() {
        return getOptionalIntValueByHashCode(250178387);
    }

    public final Boolean B3y() {
        return A0B(-1603026769);
    }

    public final Boolean BDA() {
        return A0B(1002875341);
    }

    public final Long BFo() {
        return A0L(-1913559045);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CIG] */
    public final Integer BGv() {
        return getOptionalIntValueByHashCode(962182482);
    }

    public final Boolean BIT() {
        return A0B(1826537454);
    }

    public final Long BNN() {
        return A0L(-556318521);
    }

    public final Boolean BVB() {
        return A0B(104264043);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CIG] */
    public final Integer BXW() {
        return getOptionalIntValueByHashCode(2030838443);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CIG] */
    public final String BdK() {
        return getStringValueByHashCode(1879474642);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CIG] */
    public final String Bhb() {
        return getStringValueByHashCode(1683225983);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CIG] */
    public final Integer BiJ() {
        return getOptionalIntValueByHashCode(615083646);
    }

    public final String Bif() {
        return A0j(964289780);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CIG] */
    public final Integer BjH() {
        return getOptionalIntValueByHashCode(-1456594659);
    }

    public final Long Bnq() {
        return A0L(1233754776);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CIG] */
    public final Integer BrI() {
        return getOptionalIntValueByHashCode(-960041127);
    }

    public final Boolean Bv7() {
        return A0B(-914544340);
    }

    public final Long BwZ() {
        return A0L(126023082);
    }

    public final Boolean C1b() {
        return A0B(-1005449935);
    }

    public final Boolean C2x() {
        return A0B(1063758359);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CIG] */
    public final Integer C8s() {
        return getOptionalIntValueByHashCode(-253163307);
    }

    public final Float CE0() {
        return A0K(706299096);
    }

    public final Float CEy() {
        return A0K(479826082);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CIG] */
    public final Integer CFW() {
        return getOptionalIntValueByHashCode(1941332754);
    }

    public final Boolean CSr() {
        return A0B(1716077986);
    }

    public final Boolean CTl() {
        return A0B(13224064);
    }

    public final Boolean CWS() {
        return A0B(-326622034);
    }

    public final Boolean CWT() {
        return A0B(-1480468020);
    }

    public final Boolean CYW() {
        return A0B(-155996292);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CIG] */
    public final Integer CZM() {
        return getOptionalIntValueByHashCode(-843726979);
    }

    public final Boolean CbE() {
        return A0B(-433113869);
    }

    public final Boolean Ced() {
        return A0B(187141712);
    }

    public final C239653Hl F10(1E6 r2) {
        return F0z(C41847B3o.A0q(r2));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CIG] */
    public final String getDashManifest() {
        return getStringValueByHashCode(1128191036);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CIG] */
    public final String getMediaId() {
        return getStringValueByHashCode(-900774058);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CIG] */
    public final String getOrganicTrackingToken() {
        return getStringValueByHashCode(-1133964731);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CIG] */
    public final String getPreview() {
        return getStringValueByHashCode(-318184504);
    }
}
