package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ClientDisplayMethod;
import com.instagram.api.schemas.CommentGiphyMediaInfoIntf;
import com.instagram.api.schemas.CommentRestrictStatus;
import com.instagram.api.schemas.ImmutablePandoCommentGiphyMediaInfo;
import com.instagram.api.schemas.PrivateReplyStatus;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.B5q  reason: case insensitive filesystem */
public final class C41895B5q extends 17P implements C65211bM {
    public Map A00;
    public C269874fp A01;
    public User A02;
    public List A03;
    public List A04;
    public List A05;

    public final C269804fi AeJ() {
        return (C269804fi) A05(1870032591, CJ7.class);
    }

    public final C269824fk AlN() {
        return (C269824fk) A05(-1077203130, C44030CRq.class);
    }

    public final List Aln() {
        return A08(-621740981, CIS.class);
    }

    public final List ApM() {
        return this.A03;
    }

    public final List Azi() {
        return this.A04;
    }

    public final List B4I() {
        return A08(1100400847, CK0.class);
    }

    public final CommentGiphyMediaInfoIntf B9K() {
        return (CommentGiphyMediaInfoIntf) A05(-1436406007, ImmutablePandoCommentGiphyMediaInfo.class);
    }

    public final C269834fl BGS() {
        return (C269834fl) A05(132339363, CJB.class);
    }

    public final ClientDisplayMethod BHF() {
        return (ClientDisplayMethod) A0N(-2006428187, B6L.A00);
    }

    public final C269854fn BKF() {
        return (C269854fn) A05(50528879, C44033CRt.class);
    }

    public final C269874fp BQL() {
        C269874fp r0 = this.A01;
        if (r0 == null) {
            return (C269874fp) A05(1939536937, CR7.class);
        }
        return r0;
    }

    public final Map BRh() {
        Map map = this.A00;
        if (map == null) {
            return null;
        }
        return map;
    }

    public final List Bev() {
        List list = this.A05;
        if (list == null) {
            return A08(-795108594, C41895B5q.class);
        }
        return list;
    }

    public final PrivateReplyStatus Bfr() {
        return (PrivateReplyStatus) A0N(-1482485725, C41897B5s.A00);
    }

    public final CommentRestrictStatus Bnw() {
        return (CommentRestrictStatus) A0N(-1016940458, B6M.A00);
    }

    public final User CCd() {
        return this.A02;
    }

    public final C65211bM E9d(1E9 r5) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Class<ImmutablePandoUserDict> cls = ImmutablePandoUserDict.class;
        ImmutableList A08 = A08(-1095989798, cls);
        if (A08 != null) {
            arrayList = AnonymousClass7TG.A0r(A08);
            Iterator it = A08.iterator();
            while (it.hasNext()) {
                C41847B3o.A1P(r5, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A03 = arrayList;
        ImmutableList A082 = A08(486741610, cls);
        if (A082 != null) {
            arrayList2 = AnonymousClass7TG.A0r(A082);
            Iterator it2 = A082.iterator();
            while (it2.hasNext()) {
                C41847B3o.A1P(r5, arrayList2, it2);
            }
        } else {
            arrayList2 = null;
        }
        this.A04 = arrayList2;
        C269874fp BQL = BQL();
        ArrayList arrayList3 = null;
        if (BQL != null) {
            BQL.E9e(r5);
        } else {
            BQL = null;
        }
        this.A01 = BQL;
        Map map = this.A00;
        if (map == null) {
            map = null;
        }
        this.A00 = map;
        List<C65211bM> Bev = Bev();
        if (Bev != null) {
            arrayList3 = AnonymousClass7TG.A0r(Bev);
            for (C65211bM r0 : Bev) {
                r0.E9d(r5);
                arrayList3.add(r0);
            }
        }
        this.A05 = arrayList3;
        this.A02 = C41847B3o.A0y(r5, this);
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: X.17P} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.1bK FDv(X.1E9 r77) {
        /*
            r76 = this;
            r0 = r76
            X.4fi r1 = r0.AeJ()
            if (r1 == 0) goto L_0x005e
            X.BEL r13 = r1.F1u()
        L_0x000c:
            r1 = 2036780306(0x7966cd12, float:7.4899225E34)
            java.lang.String r56 = r0.A0i(r1)
            r1 = 305089521(0x122f4bf1, float:5.531387E-28)
            java.lang.String r57 = r0.A0i(r1)
            r1 = -283409056(0xffffffffef1b8560, float:-4.8131417E28)
            java.lang.Boolean r22 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1396240391(0xffffffffacc70ff9, float:-5.6576935E-12)
            java.lang.Boolean r23 = r0.getOptionalBooleanValueByHashCode(r1)
            X.4fk r1 = r0.AlN()
            if (r1 == 0) goto L_0x005b
            X.4fj r19 = r1.FF8()
        L_0x0032:
            java.util.List r2 = r0.Aln()
            r4 = 10
            if (r2 == 0) goto L_0x0060
            int r1 = X.0Yv.A1E(r2, r4)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L_0x0047:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0061
            java.lang.Object r1 = r2.next()
            X.DT9 r1 = (X.DT9) r1
            X.BE2 r1 = r1.F1E()
            r10.add(r1)
            goto L_0x0047
        L_0x005b:
            r19 = 0
            goto L_0x0032
        L_0x005e:
            r13 = 0
            goto L_0x000c
        L_0x0060:
            r10 = 0
        L_0x0061:
            r1 = 1267713356(0x4b8fc54c, float:1.8844312E7)
            java.lang.Integer r44 = r0.getOptionalIntValueByHashCode(r1)
            r1 = 1273208079(0x4be39d0f, float:2.9833758E7)
            java.lang.Integer r45 = r0.getOptionalIntValueByHashCode(r1)
            r1 = 24600275(0x1775ed3, float:4.5434768E-38)
            java.lang.Boolean r24 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1115490574(0xffffffffbd82f6f2, float:-0.06394757)
            java.lang.Integer r46 = r0.getOptionalIntValueByHashCode(r1)
            r1 = 1921522759(0x72881c47, float:5.391891E30)
            java.lang.Integer r47 = r0.getOptionalIntValueByHashCode(r1)
            java.lang.Class<com.instagram.user.model.ImmutablePandoUserDict> r8 = com.instagram.user.model.ImmutablePandoUserDict.class
            r1 = -1095989798(0xffffffffbeac85da, float:-0.3369587)
            com.google.common.collect.ImmutableList r1 = r0.A08(r1, r8)
            r2 = r77
            if (r1 == 0) goto L_0x00c6
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x0099:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x00a3
            X.C41847B3o.A1P(r2, r3, r1)
            goto L_0x0099
        L_0x00a3:
            if (r3 == 0) goto L_0x00c6
            int r1 = X.0Yv.A1E(r3, r4)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L_0x00b2:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x00c7
            java.lang.Object r1 = r3.next()
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            X.17K r1 = r2.A00(r1)
            r9.add(r1)
            goto L_0x00b2
        L_0x00c6:
            r9 = 0
        L_0x00c7:
            r1 = 1369680106(0x51a3a8ea, float:8.7864197E10)
            java.lang.Long r54 = r0.A0L(r1)
            r1 = 345905359(0x149e18cf, float:1.5963708E-26)
            java.lang.Long r55 = r0.A0L(r1)
            r1 = 549275112(0x20bd45e8, float:3.2064105E-19)
            java.lang.String r58 = r0.A0i(r1)
            r1 = 1217885931(0x489776eb, float:310199.34)
            java.lang.Boolean r25 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1555260660(0xffffffffa34c9b0c, float:-1.1091695E-17)
            com.google.common.collect.ImmutableList r72 = r0.getOptionalStringListByHashCode(r1)
            r1 = 486741610(0x1d03166a, float:1.7349293E-21)
            com.google.common.collect.ImmutableList r3 = r0.A08(r1, r8)
            if (r3 == 0) goto L_0x0128
            java.util.ArrayList r1 = X.AnonymousClass7TG.A0r(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x00fb:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0105
            X.C41847B3o.A1P(r2, r1, r3)
            goto L_0x00fb
        L_0x0105:
            if (r1 == 0) goto L_0x0128
            int r3 = X.0Yv.A1E(r1, r4)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r3)
            java.util.Iterator r3 = r1.iterator()
        L_0x0114:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0129
            java.lang.Object r1 = r3.next()
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            X.17K r1 = r2.A00(r1)
            r7.add(r1)
            goto L_0x0114
        L_0x0128:
            r7 = 0
        L_0x0129:
            java.util.List r1 = r0.B4I()
            if (r1 == 0) goto L_0x0150
            int r3 = X.0Yv.A1E(r1, r4)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r3)
            java.util.Iterator r3 = r1.iterator()
        L_0x013c:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0151
            java.lang.Object r1 = r3.next()
            X.DTg r1 = (X.C46277DTg) r1
            X.BEl r1 = r1.F30()
            r6.add(r1)
            goto L_0x013c
        L_0x0150:
            r6 = 0
        L_0x0151:
            r1 = 105301171(0x646c4b3, float:3.7384173E-35)
            java.lang.Integer r48 = r0.getOptionalIntValueByHashCode(r1)
            com.instagram.api.schemas.CommentGiphyMediaInfoIntf r1 = r0.B9K()
            if (r1 == 0) goto L_0x02aa
            com.instagram.api.schemas.CommentGiphyMediaInfo r14 = r1.F1x()
        L_0x0162:
            r1 = 2143988456(0x7fcaaae8, float:NaN)
            java.lang.Boolean r26 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 1633569809(0x615e4c11, float:2.5629115E20)
            java.lang.Boolean r27 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -2064566367(0xffffffff84f137a1, float:-5.6709915E-36)
            java.lang.Boolean r28 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1472279412(0xffffffffa83ecc8c, float:-1.0591473E-14)
            java.lang.Boolean r29 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1930057933(0xffffffff8cf5a733, float:-3.7848856E-31)
            java.lang.Boolean r30 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1029753481(0xffffffffc29f3577, float:-79.60442)
            java.lang.String r59 = r0.A0i(r1)
            X.4fl r1 = r0.BGS()
            if (r1 == 0) goto L_0x02a7
            X.BEN r15 = r1.F1y()
        L_0x0196:
            com.instagram.api.schemas.ClientDisplayMethod r12 = r0.BHF()
            r1 = -1836173183(0xffffffff928e3881, float:-8.975389E-28)
            java.lang.Boolean r31 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 1334628252(0x4f8ccf9c, float:4.7248323E9)
            java.lang.Boolean r32 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1601470495(0xffffffffa08b7fe1, float:-2.363214E-19)
            java.lang.Boolean r33 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1992631607(0xffffffff893adac9, float:-2.2491808E-33)
            java.lang.Boolean r34 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 463106423(0x1b9a7177, float:2.5550488E-22)
            java.lang.Boolean r35 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 1676427141(0x63ec3f85, float:8.7160173E21)
            java.lang.Boolean r36 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1179762421(0xffffffffb9ae410b, float:-3.3236327E-4)
            java.lang.Boolean r37 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -524107635(0xffffffffe0c2c08d, float:-1.1226697E20)
            java.lang.Boolean r38 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1900900517(0xffffffff8eb28f5b, float:-4.4018434E-30)
            java.lang.Boolean r39 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 1373552544(0x51debfa0, float:1.19587209E11)
            java.lang.Boolean r40 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 249420380(0xeddda5c, float:5.469098E-30)
            java.lang.Boolean r41 = r0.getOptionalBooleanValueByHashCode(r1)
            X.4fn r1 = r0.BKF()
            if (r1 == 0) goto L_0x02a3
            X.4fm r20 = r1.FFB()
        L_0x01f1:
            r1 = 1939359080(0x73984568, float:2.4128322E31)
            java.lang.String r60 = r0.A0i(r1)
            r1 = -900774058(0xffffffffca4f4756, float:-3396053.5)
            java.lang.String r61 = r0.A0j(r1)
            X.4fp r1 = r0.BQL()
            if (r1 == 0) goto L_0x029f
            X.4fo r18 = r1.FDx(r2)
        L_0x0209:
            java.util.Map r5 = r0.A00
            if (r5 != 0) goto L_0x0265
            r5 = 0
        L_0x020e:
            r1 = -906049888(0xffffffffc9fec6a0, float:-2087124.0)
            java.lang.String r62 = r0.A0i(r1)
            r1 = -969918350(0xffffffffc6303872, float:-11278.111)
            java.lang.String r63 = r0.A0i(r1)
            r1 = 1403811773(0x53ac77bd, float:1.4814865E12)
            java.lang.Integer r49 = r0.getOptionalIntValueByHashCode(r1)
            r1 = 2000642893(0x773f634d, float:3.8818077E33)
            java.lang.Integer r50 = r0.getOptionalIntValueByHashCode(r1)
            r1 = 1376653744(0x520e11b0, float:1.52545526E11)
            java.lang.String r64 = r0.A0j(r1)
            r1 = -750624739(0xffffffffd342601d, float:-8.3483617E11)
            java.lang.Integer r51 = r0.getOptionalIntValueByHashCode(r1)
            r1 = 3579(0xdfb, float:5.015E-42)
            java.lang.String r65 = r0.A0j(r1)
            java.util.List r1 = r0.Bev()
            if (r1 == 0) goto L_0x02ad
            int r4 = X.0Yv.A1E(r1, r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r4)
            java.util.Iterator r4 = r1.iterator()
        L_0x0251:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x02ae
            java.lang.Object r1 = r4.next()
            X.1bM r1 = (X.C65211bM) r1
            X.1bK r1 = r1.FDv(r2)
            r3.add(r1)
            goto L_0x0251
        L_0x0265:
            int r1 = r5.size()
            int r1 = X.0se.A0L(r1)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r1)
            java.util.Set r1 = r5.entrySet()
            java.util.Iterator r11 = r1.iterator()
        L_0x027a:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0298
            java.lang.Object r1 = r11.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r5 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            X.17K r1 = (X.AnonymousClass17K) r1
            X.17K r1 = r2.A00(r1)
            r3.put(r5, r1)
            goto L_0x027a
        L_0x0298:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>(r3)
            goto L_0x020e
        L_0x029f:
            r18 = 0
            goto L_0x0209
        L_0x02a3:
            r20 = 0
            goto L_0x01f1
        L_0x02a7:
            r15 = 0
            goto L_0x0196
        L_0x02aa:
            r14 = 0
            goto L_0x0162
        L_0x02ad:
            r3 = 0
        L_0x02ae:
            com.instagram.api.schemas.PrivateReplyStatus r17 = r0.Bfr()
            r1 = -970659207(0xffffffffc624ea79, float:-10554.618)
            java.lang.String r66 = r0.A0j(r1)
            com.instagram.api.schemas.CommentRestrictStatus r16 = r0.Bnw()
            r1 = -891289493(0xffffffffcae0006b, float:-7340085.5)
            java.lang.Boolean r42 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -830329114(0xffffffffce822ee6, float:-1.09205581E9)
            java.lang.Boolean r43 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 3556653(0x36452d, float:4.983932E-39)
            java.lang.String r67 = r0.A0i(r1)
            r1 = -2115337775(0xffffffff81ea81d1, float:-8.61443E-38)
            java.lang.String r68 = r0.A0i(r1)
            r1 = -1037596717(0xffffffffc22787d3, float:-41.88264)
            java.lang.Integer r52 = r0.getOptionalIntValueByHashCode(r1)
            r1 = 3575610(0x368f3a, float:5.010497E-39)
            java.lang.Integer r53 = r0.getOptionalIntValueByHashCode(r1)
            r1 = 3599307(0x36ebcb, float:5.043703E-39)
            com.facebook.pando.TreeJNI r0 = r0.A05(r1, r8)
            com.instagram.user.model.ImmutablePandoUserDict r0 = (com.instagram.user.model.ImmutablePandoUserDict) r0
            if (r0 == 0) goto L_0x0316
            android.os.Parcelable$Creator r1 = com.instagram.user.model.User.CREATOR
            com.instagram.user.model.User r0 = X.1aC.A01(r2, r0)
            if (r0 == 0) goto L_0x0316
            X.1E6 r1 = r2.A00
            X.17K r0 = r1.E5d(r2, r0)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
        L_0x0302:
            X.1bK r11 = new X.1bK
            r69 = r5
            r70 = r10
            r71 = r9
            r73 = r7
            r74 = r6
            r75 = r3
            r21 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75)
            return r11
        L_0x0316:
            r0 = 0
            goto L_0x0302
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41895B5q.FDv(X.1E9):X.1bK");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q, X.1bM] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, B4F.A01(this));
    }

    public final String Aei() {
        return A0i(305089521);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final Boolean Akw() {
        return getOptionalBooleanValueByHashCode(-283409056);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final Boolean Al5() {
        return getOptionalBooleanValueByHashCode(-1396240391);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final Integer AnF() {
        return getOptionalIntValueByHashCode(1267713356);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final Integer AnG() {
        return getOptionalIntValueByHashCode(1273208079);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final Boolean ApE() {
        return getOptionalBooleanValueByHashCode(24600275);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final Integer ApF() {
        return getOptionalIntValueByHashCode(-1115490574);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final Integer ApI() {
        return getOptionalIntValueByHashCode(1921522759);
    }

    public final Long AsC() {
        return A0L(1369680106);
    }

    public final Long AsE() {
        return A0L(345905359);
    }

    public final String Avm() {
        return A0i(549275112);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final Boolean Awx() {
        return getOptionalBooleanValueByHashCode(1217885931);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final List AyN() {
        return getOptionalStringListByHashCode(-1555260660);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final Integer B6C() {
        return getOptionalIntValueByHashCode(105301171);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final Boolean BBU() {
        return getOptionalBooleanValueByHashCode(2143988456);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final Boolean BBa() {
        return getOptionalBooleanValueByHashCode(1633569809);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final Boolean BBc() {
        return getOptionalBooleanValueByHashCode(-2064566367);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final Boolean BCJ() {
        return getOptionalBooleanValueByHashCode(-1472279412);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final Boolean BDL() {
        return getOptionalBooleanValueByHashCode(-1930057933);
    }

    public final String BEd() {
        return A0i(-1029753481);
    }

    public final String BPo() {
        return A0i(1939359080);
    }

    public final String BWE() {
        return A0i(-906049888);
    }

    public final String BWF() {
        return A0i(-969918350);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final Integer BWu() {
        return getOptionalIntValueByHashCode(1403811773);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final Integer BXJ() {
        return getOptionalIntValueByHashCode(2000642893);
    }

    public final String BaV() {
        return A0j(1376653744);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final Integer BaW() {
        return getOptionalIntValueByHashCode(-750624739);
    }

    public final String Bm8() {
        return A0j(-970659207);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final Boolean BvL() {
        return getOptionalBooleanValueByHashCode(-891289493);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final Boolean Bvr() {
        return getOptionalBooleanValueByHashCode(-830329114);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final Integer C5c() {
        return getOptionalIntValueByHashCode(-1037596717);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final Integer CAf() {
        return getOptionalIntValueByHashCode(3575610);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final Boolean CQf() {
        return getOptionalBooleanValueByHashCode(-1836173183);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final Boolean CQg() {
        return getOptionalBooleanValueByHashCode(1334628252);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final Boolean CUE() {
        return getOptionalBooleanValueByHashCode(-1601470495);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final Boolean CUi() {
        return getOptionalBooleanValueByHashCode(-1992631607);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final Boolean CWH() {
        return getOptionalBooleanValueByHashCode(463106423);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final Boolean CWI() {
        return getOptionalBooleanValueByHashCode(1676427141);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final Boolean CYC() {
        return getOptionalBooleanValueByHashCode(-1179762421);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final Boolean CZ8() {
        return getOptionalBooleanValueByHashCode(-524107635);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final Boolean CaE() {
        return getOptionalBooleanValueByHashCode(-1900900517);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final Boolean CaL() {
        return getOptionalBooleanValueByHashCode(1373552544);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5q] */
    public final Boolean Cef() {
        return getOptionalBooleanValueByHashCode(249420380);
    }

    public final 1bK FDw(1E6 r2) {
        return FDv(C41846B3n.A0S(r2));
    }

    public final String getBackgroundColor() {
        return C41845B3m.A0r(this);
    }

    public final String getMediaId() {
        return A0f();
    }

    public final String getPk() {
        return C41845B3m.A0o(this);
    }

    public final String getText() {
        return A0X();
    }

    public final String getTextColor() {
        return C41845B3m.A0p(this);
    }
}
