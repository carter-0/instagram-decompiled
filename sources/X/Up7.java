package X;

import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ImmutablePandoTextAppSearchDiscussionTopic;
import com.instagram.api.schemas.ReplyControlStr;
import com.instagram.api.schemas.TextAppSearchDiscussionTopic;
import com.instagram.api.schemas.TextPostAppHeaderFollowVariant;
import com.instagram.api.schemas.TextPostAppPostUnavailableReason;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Up7 extends 17P implements C274354oA {
    public C274454oN A00;
    public 1Xj A01;
    public C274334o8 A02;
    public User A03;
    public User A04;
    public List A05;

    private final List A01(1E9 r5) {
        ImmutableList A08 = A08(1759540429, ImmutablePandoUserDict.class);
        if (A08 == null) {
            return null;
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A08);
        Iterator it = A08.iterator();
        while (it.hasNext()) {
            ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) it.next();
            Parcelable.Creator creator = User.CREATOR;
            0qQ.A0A(immutablePandoUserDict);
            A0r.add(1aC.A01(r5, immutablePandoUserDict));
        }
        return A0r;
    }

    public final /* synthetic */ C21494Xcl AKa() {
        return new C21494Xcl(this);
    }

    public final C274364oB AvV() {
        return (C274364oB) A05(-1840544998, Up3.class);
    }

    public final C274374oC B51() {
        return (C274374oC) A05(-74191364, C54411HCd.class);
    }

    public final TextPostAppHeaderFollowVariant BCf() {
        return (TextPostAppHeaderFollowVariant) A0N(-1059180055, C20741WyE.A00);
    }

    public final C274384oE BDr() {
        return (C274384oE) A05(805787307, C54413HCg.class);
    }

    public final C274404oG BMo() {
        return (C274404oG) A05(2023272031, C54414HCi.class);
    }

    public final 1Xj BN0() {
        return this.A01;
    }

    public final C274414oH BOe() {
        return (C274414oH) A05(858554943, C16099UoY.class);
    }

    public final C274434oJ BcX() {
        return (C274434oJ) A05(1702103366, Up4.class);
    }

    public final TextPostAppPostUnavailableReason BeL() {
        return (TextPostAppPostUnavailableReason) A0N(-1511037166, C20742WyF.A00);
    }

    public final User Bfp() {
        return this.A03;
    }

    public final C274444oL BlH() {
        return (C274444oL) A05(1393759939, C16121Uoz.class);
    }

    public final ReplyControlStr BmH() {
        return (ReplyControlStr) A0N(1276679432, C20743WyG.A00);
    }

    public final List BmJ() {
        return this.A05;
    }

    public final User BmX() {
        return this.A04;
    }

    public final TextAppSearchDiscussionTopic BqP() {
        return (TextAppSearchDiscussionTopic) A05(1890351552, ImmutablePandoTextAppSearchDiscussionTopic.class);
    }

    public final C274334o8 BtE() {
        C274334o8 r0 = this.A02;
        if (r0 == null) {
            return (C274334o8) A05(-1788288754, CRJ.class);
        }
        return r0;
    }

    public final C274454oN C5E() {
        C274454oN r0 = this.A00;
        if (r0 == null) {
            return (C274454oN) A05(1125241745, Up2.class);
        }
        return r0;
    }

    public final C274354oA E9r(1E9 r3) {
        1Xj r0;
        ImmutablePandoMediaDict immutablePandoMediaDict = (ImmutablePandoMediaDict) A05(-1332702428, ImmutablePandoMediaDict.class);
        if (immutablePandoMediaDict != null) {
            1Xv r02 = 1Xj.A0h;
            r0 = 1Xv.A00(r3, immutablePandoMediaDict);
        } else {
            r0 = null;
        }
        this.A01 = r0;
        this.A03 = C41848B3p.A1B(r3, this, -1903189321);
        this.A05 = A01(r3);
        this.A04 = C41848B3p.A1B(r3, this, 1192612026);
        C274334o8 BtE = BtE();
        C274454oN r1 = null;
        if (BtE != null) {
            BtE.E9o(r3);
        } else {
            BtE = null;
        }
        this.A02 = BtE;
        C274454oN C5E = C5E();
        if (C5E != null) {
            C5E.E9P(r3);
            r1 = C5E;
        }
        this.A00 = r1;
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.Up7, X.4oA] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C21519Xdl.A01(this), this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.Up7] */
    public final Boolean AkK() {
        return getOptionalBooleanValueByHashCode(1358926591);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.Up7] */
    public final Boolean AkR() {
        return getOptionalBooleanValueByHashCode(373873083);
    }

    public final Long AwG() {
        return A0L(-653144190);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.Up7] */
    public final Integer AxC() {
        return getOptionalIntValueByHashCode(345297956);
    }

    public final Long B2p() {
        return A0L(971668746);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.Up7] */
    public final Integer BGY() {
        return getOptionalIntValueByHashCode(-1260987559);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.Up7] */
    public final Integer BRd() {
        return getOptionalIntValueByHashCode(2144418426);
    }

    public final String BeG() {
        return A0i(-1447261488);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.Up7] */
    public final Integer Biy() {
        return getOptionalIntValueByHashCode(1087448460);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.Up7] */
    public final List BlM() {
        return getOptionalStringListByHashCode(1829773748);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.Up7] */
    public final Integer BmI() {
        return getOptionalIntValueByHashCode(139882362);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.Up7] */
    public final Integer BmM() {
        return getOptionalIntValueByHashCode(147896815);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.Up7] */
    public final Integer Bmv() {
        return getOptionalIntValueByHashCode(-1621000413);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.Up7] */
    public final Integer BnU() {
        return getOptionalIntValueByHashCode(1456374940);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.Up7] */
    public final Integer Bs4() {
        return getOptionalIntValueByHashCode(-1819645779);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.Up7] */
    public final Boolean BuL() {
        return getOptionalBooleanValueByHashCode(-1275976529);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.Up7] */
    public final Boolean BvV() {
        return getOptionalBooleanValueByHashCode(1406270433);
    }

    public final String By8() {
        return A0i(847875056);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.Up7] */
    public final Boolean CF7() {
        return getOptionalBooleanValueByHashCode(285376571);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.Up7] */
    public final Boolean CGc() {
        return getOptionalBooleanValueByHashCode(-356477449);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.Up7] */
    public final Boolean COr() {
        return getOptionalBooleanValueByHashCode(1843628887);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.Up7] */
    public final Boolean CTh() {
        return getOptionalBooleanValueByHashCode(2144466692);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.Up7] */
    public final Boolean CYr() {
        return getOptionalBooleanValueByHashCode(-1055756535);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.Up7] */
    public final Boolean CZb() {
        return getOptionalBooleanValueByHashCode(2058022310);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.Up7] */
    public final Boolean Cah() {
        return getOptionalBooleanValueByHashCode(123370389);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.Up7] */
    public final Boolean Cbk() {
        return getOptionalBooleanValueByHashCode(141295674);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: X.17P} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C274344o9 FEN(X.1E9 r52) {
        /*
            r51 = this;
            r1 = 1358926591(0x50ff92ff, float:3.43025889E10)
            r0 = r51
            java.lang.Boolean r24 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 373873083(0x1648d9bb, float:1.6224575E-25)
            java.lang.Boolean r25 = r0.getOptionalBooleanValueByHashCode(r1)
            X.4oB r1 = r0.AvV()
            if (r1 == 0) goto L_0x0139
            X.UNk r16 = r1.FCe()
        L_0x001a:
            r1 = -653144190(0xffffffffd911cf82, float:-2.5651268E15)
            java.lang.Long r45 = r0.A0L(r1)
            r1 = 345297956(0x1494d424, float:1.5027856E-26)
            java.lang.Integer r36 = r0.getOptionalIntValueByHashCode(r1)
            r1 = 971668746(0x39ea7d0a, float:4.472512E-4)
            java.lang.Long r46 = r0.A0L(r1)
            X.4oC r1 = r0.B51()
            if (r1 == 0) goto L_0x0136
            X.4q1 r8 = r1.F31()
        L_0x0039:
            com.instagram.api.schemas.TextPostAppHeaderFollowVariant r17 = r0.BCf()
            X.4oE r1 = r0.BDr()
            if (r1 == 0) goto L_0x0133
            X.God r9 = r1.F3k()
        L_0x0047:
            r1 = -1260987559(0xffffffffb4d6db59, float:-4.0020203E-7)
            java.lang.Integer r37 = r0.getOptionalIntValueByHashCode(r1)
            r1 = 1843628887(0x6de38b57, float:8.8026936E27)
            java.lang.Boolean r26 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 2144466692(0x7fd1f704, float:NaN)
            java.lang.Boolean r27 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1055756535(0xffffffffc1126f09, float:-9.152108)
            java.lang.Boolean r28 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 2058022310(0x7aaaeda6, float:4.4375527E35)
            java.lang.Boolean r29 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 123370389(0x75a7b95, float:1.6436815E-34)
            java.lang.Boolean r30 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 141295674(0x86c003a, float:7.1018933E-34)
            java.lang.Boolean r31 = r0.getOptionalBooleanValueByHashCode(r1)
            X.4oG r1 = r0.BMo()
            if (r1 == 0) goto L_0x0130
            X.4oF r10 = r1.F5O()
        L_0x0082:
            java.lang.Class<com.instagram.feed.media.ImmutablePandoMediaDict> r2 = com.instagram.feed.media.ImmutablePandoMediaDict.class
            r1 = -1332702428(0xffffffffb0909324, float:-1.0519199E-9)
            com.facebook.pando.TreeJNI r1 = r0.A05(r1, r2)
            com.instagram.feed.media.ImmutablePandoMediaDict r1 = (com.instagram.feed.media.ImmutablePandoMediaDict) r1
            r2 = r52
            if (r1 == 0) goto L_0x012d
            X.1Xv r3 = X.1Xj.A0h
            X.1Xj r1 = X.1Xv.A00(r2, r1)
            if (r1 == 0) goto L_0x012d
            X.17K r5 = r2.A00(r1)
            X.1Xj r5 = (X.1Xj) r5
        L_0x009f:
            X.4oH r1 = r0.BOe()
            if (r1 == 0) goto L_0x012a
            X.UND r11 = r1.F5e()
        L_0x00a9:
            r1 = 2144418426(0x7fd13a7a, float:NaN)
            java.lang.Integer r38 = r0.getOptionalIntValueByHashCode(r1)
            X.4oJ r1 = r0.BcX()
            if (r1 == 0) goto L_0x0127
            X.4oI r18 = r1.FCf()
        L_0x00ba:
            r1 = -1447261488(0xffffffffa9bc8ad0, float:-8.372957E-14)
            java.lang.String r47 = r0.A0i(r1)
            com.instagram.api.schemas.TextPostAppPostUnavailableReason r19 = r0.BeL()
            java.lang.Class<com.instagram.user.model.ImmutablePandoUserDict> r3 = com.instagram.user.model.ImmutablePandoUserDict.class
            r1 = -1903189321(0xffffffff8e8fa2b7, float:-3.540891E-30)
            com.facebook.pando.TreeJNI r1 = r0.A05(r1, r3)
            com.instagram.user.model.ImmutablePandoUserDict r1 = (com.instagram.user.model.ImmutablePandoUserDict) r1
            if (r1 == 0) goto L_0x0125
            android.os.Parcelable$Creator r4 = com.instagram.user.model.User.CREATOR
            com.instagram.user.model.User r1 = X.1aC.A01(r2, r1)
            if (r1 == 0) goto L_0x0125
            X.17K r4 = r2.A00(r1)
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
        L_0x00e0:
            r1 = 1087448460(0x40d1258c, float:6.5358334)
            java.lang.Integer r39 = r0.getOptionalIntValueByHashCode(r1)
            X.4oL r1 = r0.BlH()
            if (r1 == 0) goto L_0x0123
            X.UNg r13 = r1.FCT()
        L_0x00f1:
            r1 = 1829773748(0x6d1021b4, float:2.7879116E27)
            com.google.common.collect.ImmutableList r49 = r0.getOptionalStringListByHashCode(r1)
            com.instagram.api.schemas.ReplyControlStr r12 = r0.BmH()
            r1 = 139882362(0x8566f7a, float:6.4529323E-34)
            java.lang.Integer r40 = r0.getOptionalIntValueByHashCode(r1)
            java.util.List r1 = r0.A01(r2)
            if (r1 == 0) goto L_0x013d
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r7 = r1.iterator()
        L_0x0111:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x013e
            com.instagram.user.model.User r1 = X.DbT.A0k(r7)
            X.17K r1 = r2.A00(r1)
            r6.add(r1)
            goto L_0x0111
        L_0x0123:
            r13 = 0
            goto L_0x00f1
        L_0x0125:
            r4 = 0
            goto L_0x00e0
        L_0x0127:
            r18 = 0
            goto L_0x00ba
        L_0x012a:
            r11 = 0
            goto L_0x00a9
        L_0x012d:
            r5 = 0
            goto L_0x009f
        L_0x0130:
            r10 = 0
            goto L_0x0082
        L_0x0133:
            r9 = 0
            goto L_0x0047
        L_0x0136:
            r8 = 0
            goto L_0x0039
        L_0x0139:
            r16 = 0
            goto L_0x001a
        L_0x013d:
            r6 = 0
        L_0x013e:
            r1 = 147896815(0x8d0b9ef, float:1.2562257E-33)
            java.lang.Integer r41 = r0.getOptionalIntValueByHashCode(r1)
            r1 = 1192612026(0x4715d0ba, float:38352.727)
            com.facebook.pando.TreeJNI r1 = r0.A05(r1, r3)
            com.instagram.user.model.ImmutablePandoUserDict r1 = (com.instagram.user.model.ImmutablePandoUserDict) r1
            if (r1 == 0) goto L_0x01c9
            android.os.Parcelable$Creator r3 = com.instagram.user.model.User.CREATOR
            com.instagram.user.model.User r1 = X.1aC.A01(r2, r1)
            if (r1 == 0) goto L_0x01c9
            X.17K r1 = r2.A00(r1)
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
        L_0x015e:
            r3 = -1621000413(0xffffffff9f617f23, float:-4.7750768E-20)
            java.lang.Integer r42 = r0.getOptionalIntValueByHashCode(r3)
            r3 = 1456374940(0x56ce849c, float:1.13534474E14)
            java.lang.Integer r43 = r0.getOptionalIntValueByHashCode(r3)
            com.instagram.api.schemas.TextAppSearchDiscussionTopic r3 = r0.BqP()
            if (r3 == 0) goto L_0x01c7
            com.instagram.api.schemas.TextAppSearchDiscussionTopicImpl r14 = r3.FCU()
        L_0x0176:
            r3 = -1819645779(0xffffffff938a68ad, float:-3.4939316E-27)
            java.lang.Integer r44 = r0.getOptionalIntValueByHashCode(r3)
            X.4o8 r3 = r0.BtE()
            if (r3 == 0) goto L_0x01c4
            X.4o7 r21 = r3.FEI(r2)
        L_0x0187:
            r3 = -1275976529(0xffffffffb3f224af, float:-1.1275676E-7)
            java.lang.Boolean r32 = r0.getOptionalBooleanValueByHashCode(r3)
            r3 = 1406270433(0x53d1fbe1, float:1.80374798E12)
            java.lang.Boolean r33 = r0.getOptionalBooleanValueByHashCode(r3)
            r3 = 847875056(0x32898bf0, float:1.6012535E-8)
            java.lang.String r48 = r0.A0i(r3)
            X.4oN r3 = r0.C5E()
            if (r3 == 0) goto L_0x01c2
            X.UNj r15 = r3.FCY(r2)
        L_0x01a6:
            r2 = 285376571(0x1102803b, float:1.0294706E-28)
            java.lang.Boolean r34 = r0.getOptionalBooleanValueByHashCode(r2)
            r2 = -356477449(0xffffffffeac095f7, float:-1.1641097E26)
            java.lang.Boolean r35 = r0.getOptionalBooleanValueByHashCode(r2)
            X.4o9 r7 = new X.4o9
            r22 = r4
            r23 = r1
            r50 = r6
            r20 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            return r7
        L_0x01c2:
            r15 = 0
            goto L_0x01a6
        L_0x01c4:
            r21 = 0
            goto L_0x0187
        L_0x01c7:
            r14 = 0
            goto L_0x0176
        L_0x01c9:
            r1 = 0
            goto L_0x015e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Up7.FEN(X.1E9):X.4o9");
    }

    public final C274344o9 FEO(1E6 r2) {
        return FEN(C41846B3n.A0S(r2));
    }
}
