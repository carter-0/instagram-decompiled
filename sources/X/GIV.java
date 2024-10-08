package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GIV implements C233402vf {
    public final C229352nF A00;
    public final JSx A01;
    public final C228812mN A02;
    public final AnonymousClass2vK A03;
    public final GD6 A04;
    public final C54575HJk A05;
    public final String A06;
    public final HashSet A07 = AnonymousClass7TE.A1F();
    public final HashSet A08 = AnonymousClass7TE.A1F();
    public final Map A09 = AnonymousClass7TE.A1E();
    public final boolean A0A;
    public final UserSession A0B;
    public final C233372vc A0C;
    public final C57336IXt A0D;
    public final boolean A0E;

    public final Integer A01(C267324bN r8, 1PW r9) {
        1Xj r2;
        String str = r8.A06().A0f;
        if (str == null) {
            return null;
        }
        Iterator A072 = C52009GBg.A07(this.A05);
        int i = 0;
        while (true) {
            if (!A072.hasNext()) {
                break;
            } else if (!0qQ.A0K(C51971G9r.A0u(A072), str)) {
                i++;
            } else if (i != -1) {
                if (r9.A02 >= i) {
                    return AnonymousClass05K.A0u;
                }
                if (C233832wY.A03(this.A0B, true)) {
                    return AnonymousClass05K.A03;
                }
                GD6 gd6 = this.A04;
                C295365o2 r1 = r8.A01;
                if (r1 != C295365o2.AD && r1 != C295365o2.AD_PREVIEW) {
                    return null;
                }
                C52009GBg gBg = gd6.A0A;
                List A0I = gBg.A0I();
                int i2 = 0;
                int size = A0I.size();
                while (i2 < size) {
                    if (!0qQ.A0K(((C267324bN) A0I.get(i2)).getId(), str)) {
                        i2++;
                    } else if (((C267324bN) A0I.get(i2)).A02 == null || (r2 = ((C267324bN) A0I.get(i2)).A02) == null) {
                        return null;
                    } else {
                        gBg.A0R((C267324bN) A0I.get(i2), new C267324bN((C267334bO) new C295355o1(r2, r8.A06())));
                        return null;
                    }
                }
                return null;
            }
        }
        return AnonymousClass05K.A15;
    }

    public final float AuH() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final C251373n0 FIa() {
        return null;
    }

    private final String A00() {
        StringBuilder A1A;
        char c;
        Iterator A072 = C52009GBg.A07(this.A05);
        int i = 0;
        String str = "";
        while (A072.hasNext()) {
            C267324bN A0m = C51966G9m.A0m(A072);
            if (i >= 50) {
                break;
            }
            if (GDZ.A00(A0m)) {
                A1A = AnonymousClass7TF.A0n(str);
                c = 'A';
            } else {
                boolean A0G = A0m.A0G();
                A1A = AnonymousClass7TE.A1A();
                if (A0G) {
                    A1A.append(str);
                    c = 'N';
                } else {
                    A1A.append(str);
                    c = 'O';
                }
            }
            str = C51967G9n.A0r(A1A, c);
            i++;
        }
        return str;
    }

    public final List AGf() {
        return 0sn.A00;
    }

    public final /* bridge */ /* synthetic */ void AHP(Object obj) {
        0f9 AEf = 0wj.A01.AEf("ClipsSponsoredContentInjector", 817903741);
        AEf.ABQ(DialogModule.KEY_MESSAGE, "Ad Pod is not supported for Reels Ads");
        AEf.report();
        throw AnonymousClass7TE.A1B("Ad Pod is not supported for Reels Ads");
    }

    public final /* bridge */ /* synthetic */ Object BTe(int i) {
        return this.A09.get(Integer.valueOf(i));
    }

    public final List BYj() {
        List<C267324bN> A0I = this.A05.A0I();
        ArrayList arrayList = new ArrayList(0Yv.A1E(A0I, 10));
        for (C267324bN id : A0I) {
            arrayList.add(id.getId());
        }
        return arrayList;
    }

    public final List BYp() {
        List A0K = this.A05.A0K(C295365o2.ORGANIC);
        ArrayList A0r = AnonymousClass7TG.A0r(A0K);
        Iterator it = A0K.iterator();
        while (it.hasNext()) {
            A0r.add(C51971G9r.A0u(it));
        }
        return A0r;
    }

    public final Integer CNL(C251373n0 r27, 1PW r28, int i) {
        HashSet hashSet;
        String id;
        int i2;
        int i3;
        String str;
        HashSet hashSet2;
        String id2;
        String str2;
        boolean z = this instanceof C54564HIz;
        C251373n0 r1 = r27;
        1PW r7 = r28;
        DbY.A1S(r1, r7);
        int i4 = i;
        if (z) {
            C376489Ie r8 = (C376489Ie) r1.BTb();
            C267324bN r3 = (C267324bN) r8.A03;
            C295365o2 r6 = r3.A01;
            if (!GDZ.A01(r6) || !r3.A06().A0x) {
                GD6 gd6 = this.A04;
                boolean z2 = r8.A01;
                Integer num = (Integer) r8.A00;
                if (num != null) {
                    str2 = AnonymousClass93b.A01(num);
                } else {
                    str2 = null;
                }
                gd6.A08(r3, str2, i4, z2);
            } else {
                Integer A012 = A01(r3, r7);
                if (A012 != null) {
                    return A012;
                }
            }
            if (GDZ.A01(r6)) {
                hashSet2 = this.A07;
                id2 = C51966G9m.A1B(r3);
            } else {
                if (r3.A0G()) {
                    hashSet2 = this.A08;
                } else if (r3.A01 == C295365o2.BRAND_SURVEY) {
                    hashSet2 = this.A07;
                }
                id2 = r3.getId();
            }
            hashSet2.add(id2);
        } else {
            Object BTb = r1.BTb();
            C376489Ie r9 = (C376489Ie) BTb;
            C267324bN r2 = (C267324bN) r9.A03;
            C295365o2 r62 = r2.A01;
            AnonymousClass3W1 r10 = null;
            if (!GDZ.A01(r62) || !r2.A06().A0x) {
                UserSession userSession = this.A0B;
                boolean A062 = 182.A06(0Tu.A05, userSession, 36318509746624712L);
                C54575HJk hJk = this.A05;
                if (!A062 || (hJk.A0A() - 1 >= 0 && hJk.A0E(hJk.A0A() - 1).A01 != C295365o2.GHOST)) {
                    i3 = hJk.A0A();
                } else {
                    i3 = hJk.A0A() - 1;
                }
                if (i < 0 || i4 > i3) {
                    return AnonymousClass05K.A0C;
                }
                if (r7.A02 >= i4) {
                    return AnonymousClass05K.A0u;
                }
                if (C233832wY.A03(userSession, GDZ.A01(r62))) {
                    return AnonymousClass05K.A03;
                }
                GD6 gd62 = this.A04;
                boolean z3 = r9.A01;
                Integer num2 = (Integer) r9.A00;
                if (num2 != null) {
                    str = AnonymousClass93b.A01(num2);
                } else {
                    str = null;
                }
                gd62.A08(r2, str, i4, z3);
            } else {
                Integer A013 = A01(r2, r7);
                if (A013 != null) {
                    return A013;
                }
            }
            if (this.A0E && r7.A00().contains("pushdown_rule_met")) {
                String BEZ = this.A02.BEZ(BTb);
                1Xj r92 = r2.A02;
                if (!(r92 == null || (r10 = this.A01.BQr(r92)) == null)) {
                    r10.A1P = "pushdown_rule_met";
                }
                AnonymousClass2vK r93 = this.A03;
                List A1I = AnonymousClass7TE.A1I(BEZ);
                if (r10 != null) {
                    i2 = r10.A0V;
                } else {
                    i2 = 0;
                }
                String str3 = "pushdown_rule_met";
                r93.Cgy(r2.A02, (Integer) null, (Integer) null, (Integer) null, (Integer) null, str3, "", A00(), (String) null, (String) null, DbY.A0m(BEZ, String.valueOf(r2.ByO(this.A0B))), A1I, AnonymousClass7TE.A1I(String.valueOf(i - i2)), AnonymousClass7TE.A1I(String.valueOf(i4)), -1.0f, r7.A02);
            }
            if (GDZ.A01(r62)) {
                hashSet = this.A07;
                id = C51966G9m.A1B(r2);
            } else {
                if (r2.A0G()) {
                    hashSet = this.A08;
                } else {
                    if (r2.A01 == C295365o2.BRAND_SURVEY) {
                        hashSet = this.A07;
                    }
                    this.A09.put(Integer.valueOf(i4), BTb);
                }
                id = r2.getId();
            }
            hashSet.add(id);
            this.A09.put(Integer.valueOf(i4), BTb);
        }
        this.A04.A06(this.A00, this.A06);
        return AnonymousClass05K.A00;
    }

    public final C251373n0 Coa() {
        return null;
    }

    public final void Dpi() {
        this.A07.clear();
        this.A08.clear();
    }

    public final /* bridge */ /* synthetic */ void E5F(Object obj) {
        0f9 AEf = 0wj.A01.AEf("ClipsSponsoredContentInjector", 817903741);
        AEf.ABQ(DialogModule.KEY_MESSAGE, "HP Push-Up is not supported for Reels Ads");
        AEf.report();
        throw AnonymousClass7TE.A1B("HP Push-Up is not supported for Reels Ads");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0052, code lost:
        r9 = r2.A0E(r3).A01.toString();
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0154  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E5G(java.lang.String r36, java.util.List r37, int r38, int r39, int r40, int r41) {
        /*
            r35 = this;
            r22 = r36
            r15 = r37
            r0 = r22
            X.C51972G9s.A1D(r15, r0)
            r11 = r35
            java.util.Map r0 = r11.A09
            java.util.Collection r0 = r0.values()
            java.util.List r0 = X.00k.A0W(r0)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1D(r0)
            r1 = 9
            X.ArV r0 = new X.ArV
            r0.<init>((java.lang.Object) r11, (int) r1)
            java.util.List r4 = X.00k.A0g(r2, r0)
            java.util.ArrayList r20 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.util.HashMap r17 = X.AnonymousClass7TE.A1E()
            r12 = r38
            r3 = r12
        L_0x0039:
            int r3 = r3 + -1
            r0 = -1
            if (r0 >= r3) goto L_0x0157
            X.HJk r2 = r11.A05
            X.4bN r1 = r2.A0E(r3)
            if (r1 == 0) goto L_0x0039
            boolean r0 = X.GDZ.A00(r1)
            if (r0 != 0) goto L_0x0052
            boolean r0 = r1.A0G()
            if (r0 == 0) goto L_0x0039
        L_0x0052:
            X.4bN r0 = r2.A0E(r3)
            X.5o2 r0 = r0.A01
            java.lang.String r9 = r0.toString()
        L_0x005c:
            java.util.Iterator r16 = r4.iterator()
            r4 = 0
            r21 = 0
            r3 = 0
        L_0x0064:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x015b
            java.lang.Object r8 = r16.next()
            X.9Ie r8 = (X.C376489Ie) r8
            X.HJk r7 = r11.A05
            java.lang.Object r6 = r8.A03
            X.4bN r6 = (X.C267324bN) r6
            int r5 = r7.A0B(r6)
            if (r5 < r12) goto L_0x0064
            if (r5 != r12) goto L_0x00ad
            java.lang.Object r2 = r8.A04
            X.2vl r2 = (X.C233462vl) r2
            if (r2 == 0) goto L_0x014b
            X.1sS r0 = r2.A01
            if (r0 == 0) goto L_0x014b
            java.lang.Double r0 = r0.C7G()
            if (r0 == 0) goto L_0x014b
            double r0 = r0.doubleValue()
            float r10 = (float) r0
        L_0x0093:
            X.9Iz r0 = r2.A07
            java.lang.Object r4 = r0.A01
            java.lang.Integer r4 = (java.lang.Integer) r4
            X.1sS r0 = r2.A01
            if (r0 == 0) goto L_0x0150
            java.lang.String r0 = r0.BiN()
            if (r0 == 0) goto L_0x0150
            java.lang.Integer r21 = X.00y.A0l(r0)
        L_0x00a7:
            X.9Iz r0 = r2.A07
            java.lang.Object r3 = r0.A00
            java.lang.Integer r3 = (java.lang.Integer) r3
        L_0x00ad:
            X.2vc r1 = r11.A0C
            java.util.List r0 = r7.A0I()
            r14 = r39
            int r13 = r5 - r39
            boolean r0 = r1.Cd4(r6, r0, r13)
            if (r0 == 0) goto L_0x015b
            X.GD6 r2 = r11.A04
            r2.A07(r6)
            boolean r1 = r8.A01
            java.lang.Object r0 = r8.A00
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x0149
            java.lang.String r0 = X.AnonymousClass93b.A01(r0)
        L_0x00ce:
            r2.A08(r6, r0, r13, r1)
            X.IXt r0 = r11.A0D
            if (r0 == 0) goto L_0x00e6
            X.3VX r2 = r0.A03
            r0 = 2327(0x917, float:3.261E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = " to"
            java.lang.String r0 = X.002.A0c(r1, r0, r5)
            r2.A04(r15, r13, r0)
        L_0x00e6:
            java.lang.Object r0 = r8.A04
            X.2vl r0 = (X.C233462vl) r0
            if (r0 == 0) goto L_0x00ee
            r0.A00 = r14
        L_0x00ee:
            X.2mN r0 = r11.A02
            java.lang.String r1 = r0.BEZ(r8)
            r0 = r20
            r0.add(r1)
            java.lang.String r2 = java.lang.String.valueOf(r5)
            r0 = r19
            r0.add(r2)
            java.lang.String r2 = java.lang.String.valueOf(r13)
            r0 = r18
            r0.add(r2)
            com.instagram.common.session.UserSession r0 = r11.A0B
            java.lang.String r0 = r6.ByO(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            r0 = r17
            r0.put(r1, r2)
            X.1Xj r1 = r6.A02
            if (r1 == 0) goto L_0x0147
            X.JSx r0 = r11.A01
            X.3W1 r2 = r0.BQr(r1)
        L_0x0124:
            int r0 = r13 + -1
            X.4bN r1 = r7.A0E(r0)
            int r0 = r13 + 1
            X.4bN r0 = r7.A0E(r0)
            if (r1 == 0) goto L_0x0145
            java.lang.Integer r1 = X.C52192GIj.A00(r1)
        L_0x0136:
            if (r0 == 0) goto L_0x0143
            java.lang.Integer r0 = X.C52192GIj.A00(r0)
        L_0x013c:
            if (r2 == 0) goto L_0x0064
            r2.A0a(r1, r0)
            goto L_0x0064
        L_0x0143:
            r0 = 0
            goto L_0x013c
        L_0x0145:
            r1 = 0
            goto L_0x0136
        L_0x0147:
            r2 = 0
            goto L_0x0124
        L_0x0149:
            r0 = 0
            goto L_0x00ce
        L_0x014b:
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 != 0) goto L_0x0093
            r4 = 0
        L_0x0150:
            r21 = 0
            if (r2 != 0) goto L_0x00a7
            r3 = 0
            goto L_0x00ad
        L_0x0157:
            java.lang.String r9 = ""
            goto L_0x005c
        L_0x015b:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r41)
            r0 = 4090(0xffa, float:5.731E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.DbT.A1b(r20)
            if (r0 == 0) goto L_0x0203
            X.HJk r7 = r11.A05
            int r0 = r38 + -1
            X.4bN r6 = r7.A0E(r0)
            boolean r0 = r11.A0A
            if (r0 == 0) goto L_0x01b2
            r12 = 0
            java.util.Iterator r8 = r18.iterator()
        L_0x017c:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01b2
            java.lang.String r0 = X.AnonymousClass7TE.A18(r8)
            java.lang.Integer r0 = X.00y.A0l(r0)
            if (r0 == 0) goto L_0x01ae
            int r1 = r0.intValue()
            if (r1 < 0) goto L_0x01ae
            int r0 = r7.A0A()
            if (r1 >= r0) goto L_0x01ae
            X.4bN r0 = r7.A0E(r1)
            X.1Xj r1 = r0.A02
            if (r1 == 0) goto L_0x01ae
            X.JSx r0 = r11.A01
            X.3W1 r1 = r0.BQr(r1)
            if (r1 == 0) goto L_0x01ae
            if (r12 == 0) goto L_0x01b0
            java.lang.String r0 = "tbi_push_up_indirect"
        L_0x01ac:
            r1.A1P = r0
        L_0x01ae:
            r12 = 1
            goto L_0x017c
        L_0x01b0:
            r0 = r2
            goto L_0x01ac
        L_0x01b2:
            X.JSx r1 = r11.A01
            X.GDe r0 = r1.BzC(r6)
            X.3W1 r0 = r0.A0E
            if (r0 == 0) goto L_0x01be
            r0.A1P = r2
        L_0x01be:
            if (r5 == 0) goto L_0x01ca
            X.GDe r0 = r1.BzC(r6)
            X.3W1 r0 = r0.A0E
            if (r0 == 0) goto L_0x01ca
            r0.A19 = r5
        L_0x01ca:
            if (r9 == 0) goto L_0x01d6
            X.GDe r0 = r1.BzC(r6)
            X.3W1 r0 = r0.A0E
            if (r0 == 0) goto L_0x01d6
            r0.A1T = r9
        L_0x01d6:
            X.2vK r1 = r11.A03
            X.2mN r0 = r11.A02
            java.lang.String r25 = r0.BEb(r6)
            java.lang.String r26 = r11.A00()
            X.1Xj r0 = r6.A02
            r27 = r22
            r28 = r9
            r29 = r17
            r30 = r20
            r31 = r19
            r32 = r18
            r33 = r10
            r34 = r40
            r18 = r1
            r19 = r0
            r20 = r4
            r22 = r3
            r23 = r5
            r24 = r2
            r18.Cgy(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
        L_0x0203:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GIV.E5G(java.lang.String, java.util.List, int, int, int, int):void");
    }

    public final /* bridge */ /* synthetic */ boolean FIZ(Object obj, String str, Map map) {
        C376489Ie r4 = (C376489Ie) obj;
        0qQ.A0B(r4, 0);
        C267324bN r1 = (C267324bN) r4.A03;
        if (!this.A05.A0a(r1)) {
            return false;
        }
        this.A04.A07(r1);
        Iterator A0u = AnonymousClass7TF.A0u(this.A09);
        while (A0u.hasNext()) {
            if (0qQ.A0K(C51971G9r.A0p(A0u), r4)) {
                A0u.remove();
            }
        }
        return true;
    }

    public GIV(C229352nF r4, JSx jSx, UserSession userSession, C233372vc r7, C228812mN r8, AnonymousClass2vK r9, C57336IXt iXt, GD6 gd6, C54575HJk hJk, String str) {
        this.A0B = userSession;
        this.A04 = gd6;
        this.A05 = hJk;
        this.A00 = r4;
        this.A06 = str;
        this.A02 = r8;
        this.A0C = r7;
        this.A0D = iXt;
        this.A01 = jSx;
        this.A03 = r9;
        0Tu r2 = 0Tu.A05;
        this.A0A = 182.A06(r2, userSession, 36318556989430017L);
        this.A0E = 182.A06(r2, userSession, 36318556989888776L);
    }

    public final int Bdq() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final int Bdr() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ boolean CVS(Object obj) {
        HashSet hashSet;
        String id;
        C267324bN A0Y = C51972G9s.A0Y(obj);
        if (GDZ.A00(A0Y)) {
            A0Y.A06();
            hashSet = this.A07;
            id = C51966G9m.A1B(A0Y);
        } else {
            if (A0Y.A01 == C295365o2.BRAND_SURVEY) {
                hashSet = this.A07;
            } else if (!A0Y.A0G()) {
                return false;
            } else {
                hashSet = this.A08;
            }
            id = A0Y.getId();
        }
        return hashSet.contains(id);
    }
}
