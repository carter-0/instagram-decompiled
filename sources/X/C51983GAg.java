package X;

import com.facebook.pando.TreeJNI;
import com.instagram.api.schemas.AdFormatType;
import com.instagram.api.schemas.UserTagInfoDictIntf;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.model.people.PeopleTag;
import com.instagram.user.model.FollowStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.GAg  reason: case insensitive filesystem */
public class C51983GAg extends C54575HJk {
    public int A00;
    public C61042Jvg A01 = new C61042Jvg(3, 4, false);
    public final ClipsViewerSource A02;
    public final List A03 = AnonymousClass7TE.A1C();
    public final Set A04 = DbS.A0y();
    public final C52058GDe A05;
    public final 1wn A06;
    public final 1wn A07;
    public final UserSession A08;
    public final Map A09 = AnonymousClass7TE.A1H();
    public final Set A0A;
    public final boolean A0B;

    public C51983GAg(ClipsViewerSource clipsViewerSource, UserSession userSession, boolean z) {
        ClipsViewerSource clipsViewerSource2 = clipsViewerSource;
        UserSession userSession2 = userSession;
        AnonymousClass7TF.A1B(userSession2, 1, clipsViewerSource2);
        this.A08 = userSession2;
        this.A02 = clipsViewerSource2;
        this.A0B = z;
        IO4 io4 = new IO4((Object) this, 22);
        this.A07 = io4;
        IO4 io42 = new IO4((Object) this, 21);
        this.A06 = io42;
        1Ng A002 = AnonymousClass1Nd.A00(userSession2);
        A002.A01(io4, 1qJ.class);
        A002.A01(io42, AnonymousClass3KA.class);
        FollowStatus followStatus = FollowStatus.A08;
        HLU hlu = HLU.A03;
        AnonymousClass3WA r11 = AnonymousClass3WA.A0F;
        C53368Gms gms = new C53368Gms(6);
        Float A0g = C51967G9n.A0g();
        this.A05 = new C52058GDe(gms, (C61081JwJ) null, (HMA) null, hlu, r11, (AnonymousClass3W1) null, (C52054GDa) null, followStatus, (Integer) null, (Integer) null, (Integer) null, (String) null, new 0eP(A0g, A0g), 0, 0, false, false, true, false, false, false, false, false, false, true, true, true, false, true, false, false, false, false, false, false);
        this.A0A = C51967G9n.A0t(new Object[]{C59463JKn.A00, C59464JKo.A00, C59465JKp.A00, C59466JKq.A00, C59467JKr.A00, C59468JKs.A00, C59469JKt.A00, C59470JKu.A00, C59471JKv.A00, C59454JKe.A00, C59455JKf.A00, C59456JKg.A00, C58160InQ.A00, C59457JKh.A00, C59458JKi.A00, C59459JKj.A00, C59460JKk.A00, C59461JKl.A00, C59462JKm.A00}, 0);
    }

    public int A0B(C267324bN r5) {
        0qQ.A0B(r5, 0);
        A06("getIndexOfItem", 0Yt.A0E());
        int i = 0;
        for (C267324bN A0B2 : this.A03) {
            if (0qQ.A0K(A0B2.A0B(), r5.A0B())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public List A0K(C295365o2 r5) {
        0qQ.A0B(r5, 0);
        List A002 = A00(this, "getItemsOfType()");
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A002) {
            if (((C267324bN) next).A01 == r5) {
                A1C.add(next);
            }
        }
        return A1C;
    }

    public void A0R(C267324bN r3, C267324bN r4) {
        0qQ.A0B(r3, 0);
        List A002 = A00(this, "swapItem()");
        int indexOf = A002.indexOf(r3);
        if (indexOf >= 0) {
            A002.set(indexOf, r4);
            A0P(r4, indexOf);
        }
    }

    public void A0S(C267324bN r56, PeopleTag peopleTag) {
        ArrayList arrayList;
        C256193vN CD9;
        Object obj;
        C267324bN r7 = r56;
        1Xj r2 = r7.A02;
        PeopleTag peopleTag2 = peopleTag;
        if (!(r2 == null || (CD9 = r2.A0C.CD9()) == null)) {
            ArrayList A0U = 00k.A0U(CD9.CHj());
            C58010Ik3.A00(A0U, new J6K(peopleTag2, 28), 0);
            1Xy r4 = r2.A0C;
            CD9.CHj();
            new 1E9(new 1hu((UserSession) null), 6, false);
            if (CD9 instanceof B6V) {
                ArrayList A1C = AnonymousClass7TE.A1C();
                Iterator it = A0U.iterator();
                while (it.hasNext()) {
                    UserTagInfoDictIntf userTagInfoDictIntf = (UserTagInfoDictIntf) it.next();
                    if (userTagInfoDictIntf != null) {
                        A1C.add(userTagInfoDictIntf.FHC());
                    }
                }
                TreeJNI treeJNI = (TreeJNI) CD9;
                obj = C41845B3m.A0S(treeJNI, AnonymousClass7TF.A0w("in", A1C)).applyToTree(treeJNI);
                0qQ.A07(obj);
            } else {
                obj = C44570Ch4.A00(A0U);
            }
            r4.Epu((C256193vN) obj);
        }
        List list = r7.A0S;
        if (list != null) {
            arrayList = AnonymousClass7TE.A1D(list);
            arrayList.remove(peopleTag2);
        } else {
            arrayList = null;
        }
        C267334bO r42 = r7.A0G;
        String str = r7.A0P;
        String str2 = r7.A0M;
        boolean z = r7.A0Y;
        boolean z2 = r7.A0W;
        C295365o2 r3 = r7.A01;
        1Xj r52 = r7.A02;
        1iA r30 = r7.A0J;
        AdFormatType adFormatType = r7.A0E;
        List list2 = r7.A0R;
        C258043yN r27 = r7.A0F;
        String str3 = r7.A0Q;
        String str4 = r7.A0O;
        long j = r7.A0D;
        AnonymousClass3QO r8 = r7.A0I;
        String str5 = r7.A0N;
        String str6 = r7.A0L;
        boolean z3 = r7.A0V;
        boolean z4 = r7.A0a;
        boolean z5 = r7.A0Z;
        int i = r7.A0C;
        C270584gy r21 = r7.A0H;
        boolean z6 = r7.A0U;
        List list3 = r7.A0T;
        List list4 = r7.A08;
        Integer num = r7.A04;
        Integer num2 = r7.A05;
        Long l = r7.A06;
        String str7 = r7.A07;
        boolean z7 = r7.A0A;
        int i2 = r7.A00;
        Integer num3 = r7.A03;
        boolean z8 = r7.A09;
        DbW.A1N(r42, 0, r3);
        0qQ.A0B(r8, 14);
        0qQ.A0B(num3, 32);
        A0R(r7, new C267324bN(adFormatType, r27, r42, r3, r21, r52, r8, r30, num, num2, num3, l, str, str2, str3, str4, str5, str6, str7, list2, arrayList, list3, list4, i, i2, j, z, z2, z3, z4, z5, z6, z7, z8));
    }

    public void A0T(C267324bN r5, boolean z) {
        0qQ.A0B(r5, 0);
        List A002 = A00(this, "removeItem()");
        int indexOf = A002.indexOf(r5);
        if (indexOf >= 0) {
            this.A04.remove(r5.A0B());
            A002.remove(indexOf);
            A01(indexOf);
        }
        A0M();
    }

    public void A0V(List list) {
        1Xj r0;
        if (this.A03.isEmpty() && this.A02 == ClipsViewerSource.DIRECT) {
            UserSession userSession = this.A08;
            if (C328447Ev.A01(userSession) || C328447Ev.A00(userSession)) {
                Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    C267324bN r2 = (C267324bN) it.next();
                    boolean z = true;
                    if (i != list.size() - 1) {
                        z = false;
                    }
                    A03(r2, this, z);
                    i++;
                }
                return;
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C267324bN r22 = (C267324bN) it2.next();
            A03(r22, this, false);
            if (r22.A01 == C295365o2.ORGANIC && (r0 = r22.A02) != null) {
                r0.A3p();
            }
        }
        A0M();
    }

    public boolean A0a(C267324bN r3) {
        0qQ.A0B(r3, 0);
        return this.A04.contains(r3.A0B());
    }

    public boolean A0b(C267324bN r5, int i) {
        if (!this.A04.add(r5.A0B()) && r5.A08 == null) {
            return false;
        }
        A06("insertItem()", DbY.A0p("size", String.valueOf(A0A()), AnonymousClass7TE.A1L("pos", String.valueOf(i))));
        this.A03.add(i, r5);
        A01(i);
        A0M();
        return true;
    }

    public void A0f(C267324bN r6, boolean z) {
        A04(r6, true, new GL4(true, 36), JKR.A00);
    }

    public void A0g(C267324bN r6, boolean z) {
        A04(r6, true, new GL4(true, 37), JKS.A00);
    }

    public AnonymousClass3W1 BQr(1Xj r2) {
        0qQ.A0B(r2, 0);
        AnonymousClass3W1 r0 = BzC(C267324bN.A0d.A04(r2)).A0E;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass7TE.A0y();
    }

    public C52058GDe BzC(C267324bN r9) {
        0qQ.A0B(r9, 0);
        Map map = this.A09;
        Object obj = map.get(r9);
        if (obj == null) {
            UserSession userSession = this.A08;
            obj = C52057GDd.A01(r9, userSession, 1sd.A00(userSession), (AnonymousClass3W1) null, new C52054GDa(new JMF[]{GJU.SHOW_CTA, GJU.HIGHLIGHT_CTA, GJU.SHOW_AND_HIDE_PREVIEW_COMMENT, GJU.MID_SCENE, GJU.ANIMATE_PE_COLLECTION}));
            map.put(r9, obj);
        }
        return (C52058GDe) obj;
    }

    public List BzD(C267324bN r4) {
        0qQ.A0B(r4, 0);
        if (r4.A0F()) {
            List<AnonymousClass3OA> A022 = C57031ILx.A02(r4);
            ArrayList A0r = AnonymousClass7TG.A0r(A022);
            for (AnonymousClass3OA A032 : A022) {
                A0r.add(BzC(C295375o3.A03(A032)));
            }
            return A0r;
        }
        throw AnonymousClass7TE.A0w("expecting clipsItem type MULTI_ADS");
    }

    public void ESN(C267324bN r5, boolean z) {
        0qQ.A0B(r5, 0);
        A04(r5, Boolean.valueOf(z), new GL4(z, 28), JKH.A00);
    }

    public void EXx(C267324bN r6, boolean z) {
        A04(r6, true, new GL4(true, 29), JKL.A00);
    }

    public void Ea9(C267324bN r6, boolean z) {
        A04(r6, true, new GL4(true, 30), JKM.A00);
    }

    public void EaG(C267324bN r5, boolean z) {
        0qQ.A0B(r5, 0);
        A04(r5, Boolean.valueOf(z), new GL4(z, 33), GYR.A00);
    }

    public void EaH(C267324bN r5, boolean z) {
        0qQ.A0B(r5, 0);
        A04(r5, Boolean.valueOf(z), new GL4(z, 34), JKP.A00);
    }

    public void Ear(C267324bN r3, Integer num) {
        0qQ.A0B(r3, 0);
        A04(r3, num, C59097J6f.A01(num, 48), GI1.A00);
    }

    public void Eec(C267324bN r6, boolean z) {
        A04(r6, true, new GL4(true, 41), JKU.A00);
    }

    public void EiN(C267324bN r3, HMA hma) {
        0qQ.A0B(r3, 0);
        if (hma != null) {
            A04(r3, hma, C59097J6f.A01(hma, 49), JKV.A00);
        }
    }

    public void Ek5(C267324bN r3, HLU hlu) {
        0qQ.A0B(hlu, 1);
        A04(r3, hlu, J6E.A00(hlu, 1), JKX.A00);
    }

    public void Ekk(C267324bN r6, boolean z) {
        A04(r6, false, new GL4(false, 45), C59451JKb.A00);
    }

    public static void A02(C267324bN r1, C51983GAg gAg, int i, int i2) {
        gAg.A05(r1, new GLV(i, i2));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.0rk] */
    public static final void A03(C267324bN r3, C51983GAg gAg, boolean z) {
        if (gAg.A04.add(r3.A0B()) || r3.A08 != null) {
            ? obj = new Object();
            obj.A00 = gAg.A0A();
            if (gAg.A0B) {
                obj.A00 = 0;
            }
            A06("addItemInternal()", 0Yt.A0E());
            gAg.A05(r3, C59097J6f.A01(obj, 43));
            gAg.A03.add(obj.A00, r3);
            if (z) {
                gAg.A0M();
            }
        }
    }

    public int A0A() {
        A06("size()", 0Yt.A0E());
        return this.A03.size();
    }

    public int A0C(1Xj r4) {
        int i = 0;
        for (C267324bN r0 : A00(this, "getIndexOdMedia()")) {
            if (0qQ.A0K(r0.A02, r4)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public List A0I() {
        A06("getItems", 0Yt.A0E());
        return this.A03;
    }

    public void A0N() {
        A00(this, "clear()").clear();
        this.A04.clear();
        this.A09.clear();
        A0M();
    }

    public void A0Q(C267324bN r2, int i) {
        1Xj r0 = r2.A02;
        if (r0 != null) {
            r0.A03 = i;
        }
        r2.A00 = i;
    }

    public void A0U(String str, int i) {
        C53328GmE A022;
        List list = this.A03;
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            String str2 = null;
            if (it.hasNext()) {
                C267324bN A0m = C51966G9m.A0m(it);
                if (A0m.A0G()) {
                    C53328GmE A023 = A0m.A02();
                    if (A023 != null) {
                        str2 = A023.A09;
                    }
                    if (0qQ.A0K(str2, str)) {
                        if (i2 != -1 && (A022 = ((C267324bN) list.get(i2)).A02()) != null) {
                            C267324bN r11 = (C267324bN) list.get(i2);
                            Integer valueOf = Integer.valueOf(i);
                            String str3 = A022.A09;
                            String str4 = A022.A0B;
                            Integer num = A022.A03;
                            String str5 = A022.A0E;
                            1Xj r34 = A022.A01;
                            String str6 = A022.A0D;
                            String str7 = A022.A0A;
                            String str8 = A022.A07;
                            String str9 = A022.A05;
                            String str10 = A022.A06;
                            boolean z = A022.A0H;
                            Long l = A022.A04;
                            String str11 = A022.A08;
                            DSL dsl = A022.A00;
                            List list2 = A022.A0F;
                            List list3 = A022.A0G;
                            String str12 = A022.A0C;
                            AnonymousClass7TG.A1P(str4, str5);
                            String str13 = str6;
                            String str14 = str7;
                            String str15 = str8;
                            DSL dsl2 = dsl;
                            1Xj r17 = r34;
                            Integer num2 = num;
                            GYO gyo = new GYO(new C53328GmE(dsl2, r17, num2, valueOf, l, str3, str4, str5, str13, str14, str15, str9, str10, str11, str12, list2, list3, z));
                            String str16 = r11.A0P;
                            String str17 = r11.A0M;
                            boolean z2 = r11.A0Y;
                            boolean z3 = r11.A0W;
                            C295365o2 r4 = r11.A01;
                            1Xj r55 = r11.A02;
                            1iA r54 = r11.A0J;
                            AdFormatType adFormatType = r11.A0E;
                            List list4 = r11.A0R;
                            C258043yN r52 = r11.A0F;
                            String str18 = r11.A0Q;
                            String str19 = r11.A0O;
                            long j = r11.A0D;
                            AnonymousClass3QO r5 = r11.A0I;
                            String str20 = r11.A0N;
                            String str21 = r11.A0L;
                            boolean z4 = r11.A0V;
                            boolean z5 = r11.A0a;
                            boolean z6 = r11.A0Z;
                            int i3 = r11.A0C;
                            C270584gy r21 = r11.A0H;
                            List list5 = r11.A0S;
                            boolean z7 = r11.A0U;
                            List list6 = r11.A0T;
                            List list7 = r11.A08;
                            Integer num3 = r11.A05;
                            Long l2 = r11.A06;
                            String str22 = r11.A07;
                            boolean z8 = r11.A0A;
                            int i4 = r11.A00;
                            Integer num4 = r11.A03;
                            boolean z9 = r11.A09;
                            C51969G9p.A1P(r4, 5, r5);
                            0qQ.A0B(num4, 32);
                            C267324bN r16 = new C267324bN(adFormatType, r52, gyo, r4, r21, r55, r5, r54, r11.A04, num3, num4, l2, str16, str17, str18, str19, str20, str21, str22, list4, list5, list6, list7, i3, i4, j, z2, z3, z4, z5, z6, z7, z8, z9);
                            list.set(i2, r16);
                            A0P(r16, i2);
                            return;
                        }
                        return;
                    }
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public void A0W(List list) {
        A00(this, "updateItems()").clear();
        this.A04.clear();
        this.A09.clear();
        A0V(list);
    }

    public void A0X(boolean z) {
        C61042Jvg jvg = this.A01;
        C61042Jvg jvg2 = new C61042Jvg(z, jvg.A00, 4);
        this.A01 = jvg2;
        if (!jvg.equals(jvg2)) {
            11Z.A03(new C57773IgE(this));
        }
    }

    public boolean A0Z() {
        List<C267324bN> A002 = A00(this, "hasContent()");
        if ((A002 instanceof Collection) && A002.isEmpty()) {
            return false;
        }
        for (C267324bN r0 : A002) {
            C295365o2 r1 = r0.A01;
            if (r1 != C295365o2.UNAVAILABLE && r1 != C295365o2.GHOST) {
                return true;
            }
        }
        return false;
    }

    public List A0d(Set set) {
        List A002 = A00(this, "getItemsOfTypes()");
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A002) {
            if (set.contains(((C267324bN) next).A01)) {
                A1C.add(next);
            }
        }
        return A1C;
    }

    public void CM6(C267324bN r4) {
        A04(r4, (Object) null, GZH.A00, GZI.A00);
    }

    public void ER9(C267324bN r3, Integer num) {
        A04(r3, num, C59097J6f.A01(num, 44), JKF.A00);
    }

    public void ESM(C61081JwJ jwJ, C267324bN r4) {
        A04(r4, jwJ, C59097J6f.A01(jwJ, 45), JKG.A00);
    }

    public void EUB(C267324bN r4, String str) {
        A04(r4, str, new C58729Iwc(str, 19), JKI.A00);
    }

    public final void EW1(C267324bN r5, int i) {
        A04(r5, Integer.valueOf(i), new GLV(i, 18), JKJ.A00);
    }

    public void EW2(C267324bN r3, 0eP r4) {
        A04(r3, r4, C59097J6f.A01(r4, 46), JKK.A00);
    }

    public void EXM(C267324bN r2, int i) {
        A02(r2, this, i, 19);
    }

    public void EXN(C267324bN r2, int i) {
        A02(r2, this, i, 20);
    }

    public final void EXO(C267324bN r2, int i) {
        A02(r2, this, i, 21);
    }

    public void EXP(C267324bN r2, int i) {
        A02(r2, this, i, 22);
    }

    public void EXQ(C267324bN r2, int i) {
        A02(r2, this, i, 23);
    }

    public void EXR(C267324bN r2, int i) {
        A02(r2, this, i, 24);
    }

    public void EaB(C267324bN r5, boolean z) {
        A04(r5, Boolean.valueOf(z), new GL4(z, 31), JKN.A00);
    }

    public void EaD(C267324bN r5, boolean z) {
        A04(r5, Boolean.valueOf(z), new GL4(z, 32), JKO.A00);
    }

    public void EaO(C267324bN r5, boolean z) {
        A04(r5, Boolean.valueOf(z), new GL4(z, 35), JKQ.A00);
    }

    public void EaR(C267324bN r5, boolean z) {
        A04(r5, Boolean.valueOf(z), new GL4(z, 38), JKT.A00);
    }

    public void EaS(C267324bN r5, boolean z) {
        A04(r5, Boolean.valueOf(z), new GL4(z, 39), C52176GHs.A00);
    }

    public void EaW(C267324bN r5, boolean z) {
        A04(r5, Boolean.valueOf(z), new GL4(z, 40), GI4.A00);
    }

    public final void Eam(C267324bN r2, int i) {
        A02(r2, this, i, 25);
    }

    public void Eap(C267324bN r3, Integer num) {
        A04(r3, num, C59097J6f.A01(num, 47), GP7.A00);
    }

    public void Ekh(C267324bN r5, boolean z) {
        A04(r5, Boolean.valueOf(z), new GL4(z, 42), JKY.A00);
    }

    public void Eki(C267324bN r5, boolean z) {
        A04(r5, Boolean.valueOf(z), new GL4(z, 43), JKZ.A00);
    }

    public void Ekj(C267324bN r5, boolean z) {
        A04(r5, Boolean.valueOf(z), new GL4(z, 44), C59450JKa.A00);
    }

    public void Ekl(C267324bN r5, boolean z) {
        A04(r5, Boolean.valueOf(z), new GL4(z, 46), C59452JKc.A00);
    }

    public void Ekn(C267324bN r5, boolean z) {
        A04(r5, Boolean.valueOf(z), new GL4(z, 47), C59453JKd.A00);
    }

    public static List A00(C51983GAg gAg, String str) {
        A06(str, 0Yt.A0E());
        return gAg.A03;
    }

    private final void A01(int i) {
        int A0A2 = A0A();
        while (i < A0A2) {
            A05((C267324bN) this.A03.get(i), new GLV(i, 26));
            i++;
        }
    }

    private final void A04(C267324bN r3, Object obj, 0sP r5, 06n r6) {
        C52058GDe BzC = BzC(r3);
        if (!0qQ.A0K(obj, r6.get(BzC))) {
            this.A09.put(r3, r5.invoke(BzC));
            if (this.A0A.contains(r6)) {
                A0P(r3, A0B(r3));
            }
        }
    }

    private final void A05(C267324bN r3, 0sP r4) {
        boolean A0F = r3.A0F();
        C52058GDe BzC = BzC(r3);
        if (A0F) {
            r4.invoke(BzC);
            for (Object invoke : BzD(r3)) {
                r4.invoke(invoke);
            }
            return;
        }
        r4.invoke(BzC);
    }

    public static final void A06(String str, Map map) {
        if (!11Z.A07()) {
            0kD.A0J("CLIPS_ADAPTER_DATA_SOURCE_UPDATE_FROM_BG_THREAD", new Throwable(), 0Yt.A04(0se.A0M(new 0eP("operation", str)), map), 817895045);
        }
    }

    public C267324bN A0E(int i) {
        A06("getItem()", 0Yt.A06(new 0eP[]{new 0eP("pos", String.valueOf(i)), new 0eP("size", String.valueOf(A0A()))}));
        return (C267324bN) this.A03.get(i);
    }

    public C267324bN A0F(int i) {
        A06("getItemOrNull()", 0Yt.A06(new 0eP[]{new 0eP("pos", String.valueOf(i)), new 0eP("size", String.valueOf(A0A()))}));
        return (C267324bN) 00k.A0O(this.A03, i);
    }

    public List A0J(int i, int i2) {
        A06("removeItems()", DbY.A0q("size", String.valueOf(A0A()), AnonymousClass7TE.A1L("startIndex", String.valueOf(i)), AnonymousClass7TE.A1L("endIndex", String.valueOf(i2))));
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (i <= i2) {
            while (true) {
                if (i2 >= 0) {
                    List list = this.A03;
                    if (i2 < list.size()) {
                        this.A04.remove(A0E(i2).A0B());
                        A1C.add(list.remove(i2));
                        A01(i2);
                    }
                }
                if (i2 == i) {
                    break;
                }
                i2--;
            }
        }
        A0M();
        return A1C;
    }

    public void A0L() {
        super.A0L();
        1Ng A002 = AnonymousClass1Nd.A00(this.A08);
        A002.A02(this.A07, 1qJ.class);
        A002.A02(this.A06, AnonymousClass3KA.class);
    }

    public void A0O(int i, List list) {
        A06("insertItems()", DbY.A0p("size", String.valueOf(A0A()), AnonymousClass7TE.A1L("pos", String.valueOf(i))));
        Iterator it = new 097(list).iterator();
        while (it.hasNext()) {
            C267324bN r2 = (C267324bN) it.next();
            this.A04.add(r2.A0B());
            this.A03.add(i, r2);
        }
        A01(i);
        A0M();
    }

    public void Eie(C267324bN r3, AnonymousClass3WA r4) {
        boolean A1X = DbW.A1X(r4);
        A04(r3, r4, J6E.A00(r4, A1X ? 1 : 0), JKW.A00);
    }
}
