package X;

import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.MHk  reason: case insensitive filesystem */
public final class C66194MHk extends AnonymousClass1Ek implements 0sK {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66194MHk(AnonymousClass4D7 r2, 0sP r3, 0sP r4) {
        super(3, r2);
        this.A04 = 6;
        this.A02 = r3;
        this.A01 = r4;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.MHk, X.4D7] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A01(java.lang.Object r0, X.C66194MHk r1, X.02o r2, int r3) {
        /*
            r1.A00 = r3
            java.lang.Object r0 = r2.emit(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66194MHk.A01(java.lang.Object, X.MHk, X.02o, int):java.lang.Object");
    }

    public static void A03(Object obj, AbstractCollection abstractCollection, int i, int i2) {
        abstractCollection.add(new C65488LuC(new LYE(obj, i), i2));
    }

    public static boolean A04(Boolean[] boolArr, int i) {
        Boolean bool = boolArr[i];
        0qQ.A0C(bool, "null cannot be cast to non-null type kotlin.Boolean");
        return bool.booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r2 = new X.C66194MHk(r6, r1, r0);
        r2.A02 = r4;
        r2.A03 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011e, code lost:
        r2 = new X.C66194MHk(r1, r6, r0);
        r2.A01 = r4;
        r2.A02 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        return r2.invokeSuspend(X.C60340gF.A00);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
        /*
            r3 = this;
            int r0 = r3.A04
            X.4D7 r6 = (X.AnonymousClass4D7) r6
            switch(r0) {
                case 0: goto L_0x001b;
                case 1: goto L_0x001f;
                case 2: goto L_0x0024;
                case 3: goto L_0x0029;
                case 4: goto L_0x002e;
                case 5: goto L_0x0033;
                case 6: goto L_0x0038;
                case 7: goto L_0x0048;
                case 8: goto L_0x004d;
                case 9: goto L_0x0053;
                case 10: goto L_0x0058;
                case 11: goto L_0x005e;
                case 12: goto L_0x0064;
                case 13: goto L_0x0069;
                case 14: goto L_0x006f;
                case 15: goto L_0x0075;
                case 16: goto L_0x007b;
                case 17: goto L_0x0081;
                case 18: goto L_0x0086;
                case 19: goto L_0x008c;
                case 20: goto L_0x0092;
                case 21: goto L_0x0098;
                case 22: goto L_0x009e;
                case 23: goto L_0x00a3;
                case 24: goto L_0x00a8;
                case 25: goto L_0x00ad;
                case 26: goto L_0x00b2;
                case 27: goto L_0x00b7;
                case 28: goto L_0x00bc;
                case 29: goto L_0x00c1;
                case 30: goto L_0x00c6;
                case 31: goto L_0x00cb;
                case 32: goto L_0x00d1;
                case 33: goto L_0x00d7;
                case 34: goto L_0x00dd;
                case 35: goto L_0x00e2;
                case 36: goto L_0x00e7;
                case 37: goto L_0x00ec;
                case 38: goto L_0x00f1;
                case 39: goto L_0x00f6;
                case 40: goto L_0x00fb;
                case 41: goto L_0x0100;
                case 42: goto L_0x0105;
                case 43: goto L_0x010a;
                case 44: goto L_0x010f;
                case 45: goto L_0x0115;
                case 46: goto L_0x011a;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r3.A01
            r0 = 47
        L_0x000b:
            X.MHk r2 = new X.MHk
            r2.<init>((X.AnonymousClass4D7) r6, (java.lang.Object) r1, (int) r0)
            r2.A02 = r4
            r2.A03 = r5
        L_0x0014:
            X.0gF r0 = X.C60340gF.A00
            java.lang.Object r0 = r2.invokeSuspend(r0)
            return r0
        L_0x001b:
            java.lang.Object r1 = r3.A01
            r0 = 0
            goto L_0x000b
        L_0x001f:
            java.lang.Object r1 = r3.A03
            r0 = 1
            goto L_0x011e
        L_0x0024:
            java.lang.Object r1 = r3.A03
            r0 = 2
            goto L_0x011e
        L_0x0029:
            java.lang.Object r1 = r3.A03
            r0 = 3
            goto L_0x011e
        L_0x002e:
            java.lang.Object r1 = r3.A03
            r0 = 4
            goto L_0x011e
        L_0x0033:
            java.lang.Object r1 = r3.A03
            r0 = 5
            goto L_0x011e
        L_0x0038:
            java.lang.Object r1 = r3.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r3.A01
            X.0sP r0 = (X.0sP) r0
            X.MHk r2 = new X.MHk
            r2.<init>((X.AnonymousClass4D7) r6, (X.0sP) r1, (X.0sP) r0)
            r2.A03 = r4
            goto L_0x0014
        L_0x0048:
            java.lang.Object r1 = r3.A03
            r0 = 7
            goto L_0x011e
        L_0x004d:
            java.lang.Object r1 = r3.A03
            r0 = 8
            goto L_0x011e
        L_0x0053:
            java.lang.Object r1 = r3.A01
            r0 = 9
            goto L_0x000b
        L_0x0058:
            java.lang.Object r1 = r3.A03
            r0 = 10
            goto L_0x011e
        L_0x005e:
            java.lang.Object r1 = r3.A03
            r0 = 11
            goto L_0x011e
        L_0x0064:
            java.lang.Object r1 = r3.A01
            r0 = 12
            goto L_0x000b
        L_0x0069:
            java.lang.Object r1 = r3.A03
            r0 = 13
            goto L_0x011e
        L_0x006f:
            java.lang.Object r1 = r3.A03
            r0 = 14
            goto L_0x011e
        L_0x0075:
            java.lang.Object r1 = r3.A03
            r0 = 15
            goto L_0x011e
        L_0x007b:
            java.lang.Object r1 = r3.A03
            r0 = 16
            goto L_0x011e
        L_0x0081:
            java.lang.Object r1 = r3.A01
            r0 = 17
            goto L_0x000b
        L_0x0086:
            java.lang.Object r1 = r3.A03
            r0 = 18
            goto L_0x011e
        L_0x008c:
            java.lang.Object r1 = r3.A03
            r0 = 19
            goto L_0x011e
        L_0x0092:
            java.lang.Object r1 = r3.A03
            r0 = 20
            goto L_0x011e
        L_0x0098:
            java.lang.Object r1 = r3.A03
            r0 = 21
            goto L_0x011e
        L_0x009e:
            java.lang.Object r1 = r3.A03
            r0 = 22
            goto L_0x011e
        L_0x00a3:
            java.lang.Object r1 = r3.A03
            r0 = 23
            goto L_0x011e
        L_0x00a8:
            java.lang.Object r1 = r3.A03
            r0 = 24
            goto L_0x011e
        L_0x00ad:
            java.lang.Object r1 = r3.A03
            r0 = 25
            goto L_0x011e
        L_0x00b2:
            java.lang.Object r1 = r3.A03
            r0 = 26
            goto L_0x011e
        L_0x00b7:
            java.lang.Object r1 = r3.A03
            r0 = 27
            goto L_0x011e
        L_0x00bc:
            java.lang.Object r1 = r3.A03
            r0 = 28
            goto L_0x011e
        L_0x00c1:
            java.lang.Object r1 = r3.A03
            r0 = 29
            goto L_0x011e
        L_0x00c6:
            java.lang.Object r1 = r3.A03
            r0 = 30
            goto L_0x011e
        L_0x00cb:
            java.lang.Object r1 = r3.A01
            r0 = 31
            goto L_0x000b
        L_0x00d1:
            java.lang.Object r1 = r3.A01
            r0 = 32
            goto L_0x000b
        L_0x00d7:
            java.lang.Object r1 = r3.A01
            r0 = 33
            goto L_0x000b
        L_0x00dd:
            java.lang.Object r1 = r3.A03
            r0 = 34
            goto L_0x011e
        L_0x00e2:
            java.lang.Object r1 = r3.A03
            r0 = 35
            goto L_0x011e
        L_0x00e7:
            java.lang.Object r1 = r3.A03
            r0 = 36
            goto L_0x011e
        L_0x00ec:
            java.lang.Object r1 = r3.A03
            r0 = 37
            goto L_0x011e
        L_0x00f1:
            java.lang.Object r1 = r3.A03
            r0 = 38
            goto L_0x011e
        L_0x00f6:
            java.lang.Object r1 = r3.A03
            r0 = 39
            goto L_0x011e
        L_0x00fb:
            java.lang.Object r1 = r3.A03
            r0 = 40
            goto L_0x011e
        L_0x0100:
            java.lang.Object r1 = r3.A03
            r0 = 41
            goto L_0x011e
        L_0x0105:
            java.lang.Object r1 = r3.A03
            r0 = 42
            goto L_0x011e
        L_0x010a:
            java.lang.Object r1 = r3.A03
            r0 = 43
            goto L_0x011e
        L_0x010f:
            java.lang.Object r1 = r3.A01
            r0 = 44
            goto L_0x000b
        L_0x0115:
            java.lang.Object r1 = r3.A03
            r0 = 45
            goto L_0x011e
        L_0x011a:
            java.lang.Object r1 = r3.A03
            r0 = 46
        L_0x011e:
            X.MHk r2 = new X.MHk
            r2.<init>((java.lang.Object) r1, (X.AnonymousClass4D7) r6, (int) r0)
            r2.A01 = r4
            r2.A02 = r5
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66194MHk.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v38, resolved type: X.LuC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v43, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v340, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v342, resolved type: X.PDf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v964, resolved type: X.7cu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v973, resolved type: X.9ck} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v976, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v977, resolved type: X.GpT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v980, resolved type: X.GpT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v27, resolved type: X.7aX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v28, resolved type: X.7d7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v43, resolved type: X.LuC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v96, resolved type: X.LuC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v514, resolved type: X.N8g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v16, resolved type: X.N8g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v183, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v184, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v185, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v186, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v187, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v188, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v189, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1060, resolved type: X.7cv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v21, resolved type: X.7cv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1061, resolved type: X.7cv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1062, resolved type: X.7cv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1063, resolved type: X.7cv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v29, resolved type: X.7d7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v127, resolved type: X.7d7} */
    /* JADX WARNING: type inference failed for: r2v0, types: [X.MHk, java.lang.Object, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v330, types: [X.KRS] */
    /* JADX WARNING: type inference failed for: r1v333, types: [X.EKL] */
    /* JADX WARNING: type inference failed for: r5v119, types: [X.9cl] */
    /* JADX WARNING: type inference failed for: r5v125, types: [X.Le6] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:1003:0x165c, code lost:
        if (X.182.A06(r15, r46, 36325961511286164L) == false) goto L_0x165e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1029:0x1743, code lost:
        if (X.182.A06(r15, r46, 36327825527028448L) == false) goto L_0x1745;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1112:0x195f, code lost:
        if (X.182.A06(r15, r46, 36320850500264850L) == false) goto L_0x1961;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x026a, code lost:
        if (r32 != false) goto L_0x026c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1287:0x1df1, code lost:
        if (r18 != false) goto L_0x1df3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0280, code lost:
        if (r1 == false) goto L_0x0282;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02a3, code lost:
        if (r25 != null) goto L_0x02a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1417:0x2187, code lost:
        if (X.182.A06(X.0Tu.A05, r12, 36316186165645331L) == false) goto L_0x2189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1502:0x24ac, code lost:
        X.0sr.A1T();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1503:0x24b3, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1537:0x25c1, code lost:
        if (r1 == null) goto L_0x25c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02e8, code lost:
        if (X.182.A06(X.0Tu.A05, r4, 36329470499504273L) != false) goto L_0x02ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1599:0x26d8, code lost:
        if (r7 != false) goto L_0x26da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0067, code lost:
        if (r6 != r16) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1601:0x26dc, code lost:
        if (r12 != false) goto L_0x26de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1602:0x26de, code lost:
        if (r13 == false) goto L_0x26e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1604:0x26e6, code lost:
        if (((X.C60171Jgq) r2.A03).A04 == false) goto L_0x26fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1605:0x26e8, code lost:
        if (r9 == false) goto L_0x26f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1607:0x26f0, code lost:
        if (((X.C60171Jgq) r2.A03).A03 != false) goto L_0x26fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1608:0x26f2, code lost:
        if (r11 == false) goto L_0x26f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1609:0x26f4, code lost:
        if (r10 != false) goto L_0x26fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1610:0x26f6, code lost:
        if (r6 != false) goto L_0x26fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1611:0x26f8, code lost:
        if (r8 != false) goto L_0x26fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1612:0x26fa, code lost:
        r21 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1613:0x26fc, code lost:
        if (r7 == false) goto L_0x2702;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1614:0x26fe, code lost:
        r21 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1615:0x2700, code lost:
        if (r12 == false) goto L_0x2722;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1616:0x2702, code lost:
        if (r13 == false) goto L_0x270c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1618:0x270a, code lost:
        if (((X.C60171Jgq) r2.A03).A04 == false) goto L_0x2722;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1619:0x270c, code lost:
        if (r9 == false) goto L_0x2716;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1621:0x2714, code lost:
        if (((X.C60171Jgq) r2.A03).A03 != false) goto L_0x2722;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1622:0x2716, code lost:
        if (r11 == false) goto L_0x271a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1623:0x2718, code lost:
        if (r10 != false) goto L_0x2722;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1624:0x271a, code lost:
        if (r6 != false) goto L_0x2722;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1625:0x271c, code lost:
        if (r8 != false) goto L_0x2722;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1626:0x271e, code lost:
        r22 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1627:0x2720, code lost:
        if (r7 == false) goto L_0x2726;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1628:0x2722, code lost:
        r22 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1629:0x2724, code lost:
        if (r12 == false) goto L_0x2742;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x030f, code lost:
        if (X.182.A06(r15, r4, 36330634435642061L) == false) goto L_0x0311;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1630:0x2726, code lost:
        if (r13 == false) goto L_0x2730;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1632:0x272e, code lost:
        if (((X.C60171Jgq) r2.A03).A04 == false) goto L_0x2742;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1633:0x2730, code lost:
        if (r9 == false) goto L_0x273a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1635:0x2738, code lost:
        if (((X.C60171Jgq) r2.A03).A03 != false) goto L_0x2742;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1636:0x273a, code lost:
        if (r6 != false) goto L_0x2742;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1637:0x273c, code lost:
        if (r8 != false) goto L_0x2742;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1638:0x273e, code lost:
        r23 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1639:0x2740, code lost:
        if (r7 == false) goto L_0x2748;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1640:0x2742, code lost:
        r23 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1641:0x2744, code lost:
        if (r12 == false) goto L_0x275f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1642:0x2746, code lost:
        if (r6 != false) goto L_0x275f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1643:0x2748, code lost:
        r24 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1644:0x274a, code lost:
        if (r8 != false) goto L_0x2750;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1645:0x274c, code lost:
        r25 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1646:0x274e, code lost:
        if (r7 == false) goto L_0x2752;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1647:0x2750, code lost:
        r25 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1648:0x2752, code lost:
        r1 = A01(new X.C60893JtD(r18, r19, r20, r21, r22, r23, r24, r25), r2, r3, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1649:0x275f, code lost:
        r24 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1650:0x2761, code lost:
        if (r12 == false) goto L_0x2750;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1651:0x2763, code lost:
        if (r6 != false) goto L_0x2750;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1654:0x276c, code lost:
        if (r12 != false) goto L_0x2696;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1656:0x2772, code lost:
        if (r12 != false) goto L_0x26c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1665:0x27c6, code lost:
        if (r6.A02 != false) goto L_0x27c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1671:0x27da, code lost:
        if (r5.A0G != false) goto L_0x27dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1681:0x27f6, code lost:
        if (r1.A01 != false) goto L_0x27f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1686:0x2804, code lost:
        if (r8 != r0) goto L_0x2806;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1696:0x2822, code lost:
        if (r1.A01 != false) goto L_0x2824;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0069, code lost:
        return r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006a, code lost:
        X.0eS.A00(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1833:0x2aa5, code lost:
        if (r18 != false) goto L_0x2aa7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1851:0x2aff, code lost:
        if (r0 != null) goto L_0x2ab1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1864:0x2b7b, code lost:
        if (r0.A0I() != false) goto L_0x2b7d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1880:0x2baf, code lost:
        if (r1 != false) goto L_0x2bb1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1884:0x2bb7, code lost:
        if (r1 == false) goto L_0x2bb9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006d, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1979:0x2d62, code lost:
        if ((r1 instanceof X.K0S) != false) goto L_0x2d64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1994:0x2daf, code lost:
        if (r14 != false) goto L_0x2db1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2002:0x2dc8, code lost:
        if (r14 != false) goto L_0x2dca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2010:0x2de2, code lost:
        if (r14 != false) goto L_0x2de4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2015:0x2df5, code lost:
        if (r4.A0H == false) goto L_0x2df7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2019:0x2dfb, code lost:
        if (r14 != false) goto L_0x2dfd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2024:0x2e0b, code lost:
        if (r0 == false) goto L_0x2e0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2028:0x2e11, code lost:
        if (r14 != false) goto L_0x2e13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2072:0x2f29, code lost:
        if (r1 != r16) goto L_0x2f8e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2073:0x2f2b, code lost:
        return r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2099:0x2f90, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2103:0x2f96, code lost:
        if (r5 == null) goto L_0x2f56;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2141:0x3028, code lost:
        if (r5 == null) goto L_0x2fee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x03f1, code lost:
        if (r27 != false) goto L_0x03f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0415, code lost:
        if (r14 == false) goto L_0x0419;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x05a4, code lost:
        if (r0.A0f != true) goto L_0x05a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x05a8, code lost:
        if (r0 != null) goto L_0x05aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x05aa, code lost:
        r7 = r0.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x05ac, code lost:
        if (r7 == null) goto L_0x060e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x05ae, code lost:
        r7 = r7.A03.B3v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x05b4, code lost:
        if (r7 == null) goto L_0x060e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x05ba, code lost:
        if (r7.getFanClubId() == null) goto L_0x060e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x05bc, code lost:
        r12 = X.AnonymousClass7TE.A1C();
        r11 = X.HN2.A05;
        r12.add(r11);
        r10 = X.HN2.A07;
        r12.add(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x05d3, code lost:
        if (X.182.A06(r15, r4, 36320395233927559L) == false) goto L_0x05da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x05d5, code lost:
        r12.add(X.HN2.A06);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x05da, code lost:
        if (r26 == false) goto L_0x05e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x05dc, code lost:
        if (r27 == false) goto L_0x05e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x05de, code lost:
        r12.add(X.HN2.A0A);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x05e3, code lost:
        X.Dba.A0j(1, r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x05ea, code lost:
        if (r14 != X.C333797aA.NOT_SET) goto L_0x0603;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x05ee, code lost:
        if (r13 == r20) goto L_0x05f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x05f2, code lost:
        if (r13 != r31) goto L_0x05fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x05f4, code lost:
        r11 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x05f5, code lost:
        r4 = new X.C54214H3j(r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x05fe, code lost:
        if (r13 != X.AnonymousClass05K.A0C) goto L_0x0603;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0600, code lost:
        r11 = X.HN2.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0605, code lost:
        if (r14 != X.C333797aA.SUBSCRIBERS_ONLY) goto L_0x05f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0609, code lost:
        if (r13 != r20) goto L_0x05f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x060b, code lost:
        r11 = X.HN2.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x060e, code lost:
        r27 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x061c, code lost:
        if (r7 <= 2200) goto L_0x061e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0622, code lost:
        if (r0 != null) goto L_0x049d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0638, code lost:
        if (X.182.A06(r15, r4, 36318840456026620L) == false) goto L_0x0403;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0644, code lost:
        if (r26.length() > 2200) goto L_0x0403;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0905, code lost:
        if (X.182.A06(X.0Tu.A05, r10.A0E, 36323032343784187L) != false) goto L_0x0907;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0969, code lost:
        if (X.AnonymousClass7TF.A1Y(r5.A0C.CQK(), true) != false) goto L_0x096f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x096d, code lost:
        if (r1 == false) goto L_0x096f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0973, code lost:
        if (X.C334457bI.A00(r0) != false) goto L_0x0982;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0980, code lost:
        if (X.182.A06(X.0Tu.A05, r0, 36320356579221853L) == false) goto L_0x09fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0982, code lost:
        r32 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0984, code lost:
        r33 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x0991, code lost:
        if (X.182.A06(X.0Tu.A05, r0, 36323053818358562L) != false) goto L_0x0995;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0993, code lost:
        r33 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0995, code lost:
        if (r3 == null) goto L_0x09a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x0997, code lost:
        r31 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x09a5, code lost:
        if (X.C393889xC.A00(r3, (X.C333777a7) r6.A03.getValue(), r0) != false) goto L_0x09a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x09a7, code lost:
        r31 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x09a9, code lost:
        r11 = r6.A00;
        r10 = r7.A09;
        r8 = r7.A03;
        r7 = r7.A0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x09b1, code lost:
        if (r5 == null) goto L_0x09f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x09b3, code lost:
        r25 = r5.A1e(r0).A2n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x09bf, code lost:
        if (r14.A01() == false) goto L_0x09c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x09c1, code lost:
        r35 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x09c7, code lost:
        if (r14.A02(r5) != false) goto L_0x09cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x09c9, code lost:
        r35 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x09cb, code lost:
        if (r1 != false) goto L_0x09dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x09cd, code lost:
        r36 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x09da, code lost:
        if (X.182.A06(X.0Tu.A05, r0, 36322048796272558L) != false) goto L_0x09de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x09dc, code lost:
        r36 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x09de, code lost:
        r17 = new X.C335417cv(r3, r13, r12, r11, r8, r23, r10, r25, r9, r27, r28, r29, r30, r31, r32, r33, r7, r35, r36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x09f7, code lost:
        r25 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x09fa, code lost:
        r32 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x09fc, code lost:
        if (r1 != false) goto L_0x0993;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:718:0x0f58, code lost:
        if (X.AnonymousClass7TE.A1b(r10) != false) goto L_0x0f5a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0161, code lost:
        r0 = r1.A01((X.C61071Jw9) ((X.C59678JTj) r3).A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x016b, code lost:
        r2.A00 = r5;
        r1 = X.AnonymousClass11O.A02(r2, r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:746:0x1047, code lost:
        if (r14 > java.lang.System.currentTimeMillis()) goto L_0x1049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:751:0x1061, code lost:
        if (r14 > java.lang.System.currentTimeMillis()) goto L_0x1063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:778:0x1120, code lost:
        if (r10 != false) goto L_0x1122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0183, code lost:
        r0 = new X.0rr(new X.C61131Jxh((java.lang.String) ((X.C59678JTj) r3).A01, (java.lang.String) null, (java.lang.String) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:810:0x1204, code lost:
        if (r1 != null) goto L_0x1206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:825:0x1237, code lost:
        if (r3.A0B != false) goto L_0x123d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:827:0x123b, code lost:
        if (r19 != false) goto L_0x123d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:828:0x123d, code lost:
        r39 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:829:0x1241, code lost:
        if (r3.A0A != false) goto L_0x1245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:830:0x1243, code lost:
        r39 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:831:0x1245, code lost:
        r12.add(new X.C71979OuB(r14, r1, r22, r30, r7, r15, r21, r34, r35, r36, r37, r38, r39, false, r3.A09));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:870:0x1379, code lost:
        if (X.182.A06(X.0Tu.A06, r3.A03, 36320850500133776L) == false) goto L_0x137b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:886:0x13d2, code lost:
        if (X.182.A06(X.0Tu.A05, r3.A03, 36320682996409107L) == false) goto L_0x13d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:955:0x157e, code lost:
        if (X.182.A06(X.0Tu.A05, r3.A03, 36319617844518437L) == false) goto L_0x1580;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:989:0x1611, code lost:
        if (X.182.A06(r15, r46, 36320850500199313L) == false) goto L_0x1613;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1072:0x186d  */
    /* JADX WARNING: Removed duplicated region for block: B:1077:0x1888  */
    /* JADX WARNING: Removed duplicated region for block: B:1082:0x18a5  */
    /* JADX WARNING: Removed duplicated region for block: B:1085:0x18bb  */
    /* JADX WARNING: Removed duplicated region for block: B:1088:0x18d3  */
    /* JADX WARNING: Removed duplicated region for block: B:1102:0x1920  */
    /* JADX WARNING: Removed duplicated region for block: B:1105:0x1928  */
    /* JADX WARNING: Removed duplicated region for block: B:1108:0x193a  */
    /* JADX WARNING: Removed duplicated region for block: B:1111:0x1952  */
    /* JADX WARNING: Removed duplicated region for block: B:1124:0x19a1  */
    /* JADX WARNING: Removed duplicated region for block: B:1129:0x19e7  */
    /* JADX WARNING: Removed duplicated region for block: B:1132:0x19f5  */
    /* JADX WARNING: Removed duplicated region for block: B:1135:0x1a03  */
    /* JADX WARNING: Removed duplicated region for block: B:1139:0x1a2d  */
    /* JADX WARNING: Removed duplicated region for block: B:1141:0x1a44  */
    /* JADX WARNING: Removed duplicated region for block: B:1143:0x1a5b  */
    /* JADX WARNING: Removed duplicated region for block: B:1147:0x1a8b  */
    /* JADX WARNING: Removed duplicated region for block: B:1149:0x1a91  */
    /* JADX WARNING: Removed duplicated region for block: B:1150:0x1a95  */
    /* JADX WARNING: Removed duplicated region for block: B:1156:0x1b0c  */
    /* JADX WARNING: Removed duplicated region for block: B:1157:0x1b10  */
    /* JADX WARNING: Removed duplicated region for block: B:1158:0x1b13  */
    /* JADX WARNING: Removed duplicated region for block: B:1159:0x1b17  */
    /* JADX WARNING: Removed duplicated region for block: B:1160:0x1b1b  */
    /* JADX WARNING: Removed duplicated region for block: B:1844:0x2abb  */
    /* JADX WARNING: Removed duplicated region for block: B:1849:0x2afb  */
    /* JADX WARNING: Removed duplicated region for block: B:2001:0x2dc7  */
    /* JADX WARNING: Removed duplicated region for block: B:2006:0x2dd0  */
    /* JADX WARNING: Removed duplicated region for block: B:2009:0x2de1  */
    /* JADX WARNING: Removed duplicated region for block: B:2014:0x2df2  */
    /* JADX WARNING: Removed duplicated region for block: B:2018:0x2dfa  */
    /* JADX WARNING: Removed duplicated region for block: B:2023:0x2e08  */
    /* JADX WARNING: Removed duplicated region for block: B:2027:0x2e10  */
    /* JADX WARNING: Removed duplicated region for block: B:2032:0x2e20  */
    /* JADX WARNING: Removed duplicated region for block: B:2122:0x2fe2  */
    /* JADX WARNING: Removed duplicated region for block: B:2128:0x2ffc  */
    /* JADX WARNING: Removed duplicated region for block: B:2133:0x300d  */
    /* JADX WARNING: Removed duplicated region for block: B:2136:0x3016  */
    /* JADX WARNING: Removed duplicated region for block: B:2138:0x3023  */
    /* JADX WARNING: Removed duplicated region for block: B:2139:0x3026  */
    /* JADX WARNING: Removed duplicated region for block: B:2163:0x067a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:2164:0x0686 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x04e6  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0523  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x054e  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x069a  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x06b3  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x06c9 A[LOOP:7: B:399:0x06c7->B:400:0x06c9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x06fb A[LOOP:10: B:409:0x06f5->B:411:0x06fb, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:414:0x070d  */
    /* JADX WARNING: Removed duplicated region for block: B:442:0x07a9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:454:0x07ce  */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x07dc  */
    /* JADX WARNING: Removed duplicated region for block: B:460:0x07f2  */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x084e  */
    /* JADX WARNING: Removed duplicated region for block: B:820:0x1223  */
    /* JADX WARNING: Removed duplicated region for block: B:832:0x1261  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r65) {
        /*
            r64 = this;
            r2 = r64
            r6 = r65
            int r0 = r2.A04
            switch(r0) {
                case 0: goto L_0x0017;
                case 1: goto L_0x006e;
                case 2: goto L_0x00a1;
                case 3: goto L_0x00cf;
                case 4: goto L_0x0107;
                case 5: goto L_0x013f;
                case 6: goto L_0x019a;
                case 7: goto L_0x01d7;
                case 8: goto L_0x0851;
                case 9: goto L_0x0a0d;
                case 10: goto L_0x0a51;
                case 11: goto L_0x0ac6;
                case 12: goto L_0x0009;
                case 13: goto L_0x0ae8;
                case 14: goto L_0x0b88;
                case 15: goto L_0x0be7;
                case 16: goto L_0x0e5a;
                case 17: goto L_0x0f82;
                case 18: goto L_0x0fc9;
                case 19: goto L_0x1091;
                case 20: goto L_0x1292;
                case 21: goto L_0x1b94;
                case 22: goto L_0x1bfb;
                case 23: goto L_0x1c2b;
                case 24: goto L_0x1c76;
                case 25: goto L_0x1cf4;
                case 26: goto L_0x1f1f;
                case 27: goto L_0x1f59;
                case 28: goto L_0x1fcd;
                case 29: goto L_0x2374;
                case 30: goto L_0x2413;
                case 31: goto L_0x24ba;
                case 32: goto L_0x24f2;
                case 33: goto L_0x2530;
                case 34: goto L_0x2572;
                case 35: goto L_0x259e;
                case 36: goto L_0x25ce;
                case 37: goto L_0x2634;
                case 38: goto L_0x2776;
                case 39: goto L_0x2862;
                case 40: goto L_0x2b06;
                case 41: goto L_0x2c2a;
                case 42: goto L_0x2ce9;
                case 43: goto L_0x2f2c;
                case 44: goto L_0x0009;
                case 45: goto L_0x2e63;
                case 46: goto L_0x2e94;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r9 = 1
            if (r0 == 0) goto L_0x003a
            if (r0 == r9) goto L_0x006a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0017:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r5 = 1
            if (r0 == 0) goto L_0x0025
            if (r0 == r5) goto L_0x006a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0025:
            X.0eS.A00(r6)
            java.lang.Object r4 = r2.A02
            java.lang.Object r3 = r2.A03
            java.lang.Object r1 = r2.A01
            X.0sK r1 = (X.0sK) r1
            r0 = 0
            r2.A02 = r0
            r2.A00 = r5
            java.lang.Object r6 = r1.invoke(r4, r3, r2)
            goto L_0x0065
        L_0x003a:
            X.0eS.A00(r6)
            java.lang.Object r1 = r2.A02
            X.59G r1 = (X.AnonymousClass59G) r1
            java.lang.Object r0 = r2.A03
            X.59G r0 = (X.AnonymousClass59G) r0
            java.lang.Object r8 = r2.A01
            X.0sG r8 = (X.0sG) r8
            java.lang.Object r7 = r1.A00
            java.lang.Object r6 = r1.A01
            java.lang.Object r5 = r1.A02
            java.lang.Object r4 = r0.A00
            java.lang.Object r3 = r0.A01
            java.lang.Object r1 = r0.A02
            r0 = 0
            r2.A02 = r0
            r2.A00 = r9
            r9 = r7
            r10 = r6
            r11 = r5
            r12 = r4
            r13 = r3
            r14 = r1
            r15 = r2
            java.lang.Object r6 = r8.invoke(r9, r10, r11, r12, r13, r14, r15)
        L_0x0065:
            r0 = r16
            if (r6 != r0) goto L_0x006d
            return r16
        L_0x006a:
            X.0eS.A00(r6)
        L_0x006d:
            return r6
        L_0x006e:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r5 = 1
            if (r0 == 0) goto L_0x007c
            if (r0 == r5) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x007c:
            X.02o r4 = A02(r6, r2)
            java.lang.Object r3 = r2.A02
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r0 = r2.A03
            X.LAs r0 = (X.C63889LAs) r0
            X.Tfa r1 = r0.A00
            r0 = 160(0xa0, float:2.24E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            r1.Ew3(r0, r3)
            X.SoM r1 = new X.SoM
            r1.<init>()
            r0 = 0
            r2.A01 = r0
            java.lang.Object r1 = A01(r1, r2, r4, r5)
            goto L_0x2f27
        L_0x00a1:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r5 = 1
            if (r0 == 0) goto L_0x00af
            if (r0 == r5) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00af:
            X.02o r4 = A02(r6, r2)
            java.lang.Object r3 = r2.A02
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r0 = r2.A03
            X.Jfk r0 = (X.C60104Jfk) r0
            X.Tfa r1 = r0.A09
            r0 = 160(0xa0, float:2.24E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            r1.Ew3(r0, r3)
            r0 = 0
            r2.A01 = r0
            java.lang.Object r1 = A01(r0, r2, r4, r5)
            goto L_0x2f27
        L_0x00cf:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r5 = 1
            if (r0 == 0) goto L_0x00dd
            if (r0 == r5) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00dd:
            X.02o r4 = A02(r6, r2)
            java.lang.Object r3 = r2.A02
            X.MQ0 r3 = (X.MQ0) r3
            boolean r0 = X.C59678JTj.A01(r5, r3)
            if (r0 == 0) goto L_0x00f2
            java.lang.Object r0 = r2.A03
            X.Lin r0 = (X.C64827Lin) r0
            X.LFO r1 = r0.A00
            goto L_0x0161
        L_0x00f2:
            boolean r0 = X.C59678JTj.A02(r3)
            if (r0 != 0) goto L_0x0183
            boolean r0 = r3 instanceof X.C59702JUj
            if (r0 == 0) goto L_0x0102
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L_0x0102:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0107:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r5 = 1
            if (r0 == 0) goto L_0x0115
            if (r0 == r5) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0115:
            X.02o r4 = A02(r6, r2)
            java.lang.Object r3 = r2.A02
            X.MQ0 r3 = (X.MQ0) r3
            boolean r0 = X.C59678JTj.A01(r5, r3)
            if (r0 == 0) goto L_0x012a
            java.lang.Object r0 = r2.A03
            X.Lim r0 = (X.C64826Lim) r0
            X.LFO r1 = r0.A00
            goto L_0x0161
        L_0x012a:
            boolean r0 = X.C59678JTj.A02(r3)
            if (r0 != 0) goto L_0x0183
            boolean r0 = r3 instanceof X.C59702JUj
            if (r0 == 0) goto L_0x013a
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L_0x013a:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x013f:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r5 = 1
            if (r0 == 0) goto L_0x014d
            if (r0 == r5) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x014d:
            X.02o r4 = A02(r6, r2)
            java.lang.Object r3 = r2.A02
            X.MQ0 r3 = (X.MQ0) r3
            boolean r0 = X.C59678JTj.A01(r5, r3)
            if (r0 == 0) goto L_0x0173
            java.lang.Object r0 = r2.A03
            X.Lij r0 = (X.C64823Lij) r0
            X.LFO r1 = r0.A00
        L_0x0161:
            X.JTj r3 = (X.C59678JTj) r3
            java.lang.Object r0 = r3.A01
            X.Jw9 r0 = (X.C61071Jw9) r0
            X.0r6 r0 = r1.A01(r0)
        L_0x016b:
            r2.A00 = r5
            java.lang.Object r1 = X.AnonymousClass11O.A02(r2, r0, r4)
            goto L_0x2f27
        L_0x0173:
            boolean r0 = X.C59678JTj.A02(r3)
            if (r0 != 0) goto L_0x0183
            boolean r0 = r3 instanceof X.C59702JUj
            if (r0 == 0) goto L_0x0195
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L_0x0183:
            X.JTj r3 = (X.C59678JTj) r3
            java.lang.Object r3 = r3.A01
            java.lang.String r3 = (java.lang.String) r3
            r0 = 0
            X.Jxh r1 = new X.Jxh
            r1.<init>(r3, r0, r0)
            X.0rr r0 = new X.0rr
            r0.<init>(r1)
            goto L_0x016b
        L_0x0195:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x019a:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r3 = 1
            if (r0 == 0) goto L_0x01b9
            if (r0 != r3) goto L_0x01d2
            X.0eS.A00(r6)
        L_0x01a6:
            java.lang.Object r0 = r2.A02
            X.0sP r0 = (X.0sP) r0
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0u()
            r0.invoke(r1)
            java.lang.Object r0 = r2.A01
            X.C51965G9l.A1W(r0, r1)
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x01b9:
            X.0eS.A00(r6)
            java.lang.Object r1 = r2.A03
            X.MX4 r1 = (X.MX4) r1
            java.lang.Object r0 = r2.A02
            X.0sP r0 = (X.0sP) r0
            X.C51968G9o.A1O(r0, r3)
            r2.A00 = r3
            java.lang.Object r1 = r1.FI7(r2)
            r0 = r16
            if (r1 != r0) goto L_0x01a6
            return r16
        L_0x01d2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01d7:
            X.1Hj r16 = X.1Hj.A02
            int r1 = r2.A00
            r19 = 1
            if (r1 == 0) goto L_0x01e8
            r0 = r19
            if (r1 == r0) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01e8:
            X.02o r17 = A02(r6, r2)
            java.lang.Object r4 = r2.A02
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r9 = r2.A03
            X.GgO r9 = (X.C52971GgO) r9
            r0 = 0
            r3 = r4[r0]
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.comments.mvvm.data.model.ParentCommentListModel"
            X.0qQ.A0C(r3, r0)
            X.7aH r3 = (X.C333867aH) r3
            r0 = r4[r19]
            X.7a7 r0 = (X.C333777a7) r0
            r1 = 2
            r8 = r4[r1]
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.comments.mvvm.data.model.CaptionRowTranslationState"
            X.0qQ.A0C(r8, r1)
            X.9Iu r8 = (X.C376649Iu) r8
            r1 = 3
            r7 = r4[r1]
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.comments.mvvm.data.model.CaptionRowFollowState"
            X.0qQ.A0C(r7, r1)
            X.9IE r7 = (X.AnonymousClass9IE) r7
            r1 = 4
            r18 = r4[r1]
            r1 = r18
            X.JwI r1 = (X.C61080JwI) r1
            r18 = r1
            r33 = 5
            r1 = r4[r33]
            boolean r39 = X.JTQ.A1W(r1)
            X.7aC r1 = r3.A03
            r59 = r1
            boolean r1 = r1.A05
            if (r1 == 0) goto L_0x023b
            X.Le6 r5 = X.C64565Le6.A00
        L_0x0231:
            r1 = r17
            r0 = r19
            java.lang.Object r1 = A01(r5, r2, r1, r0)
            goto L_0x2f27
        L_0x023b:
            com.instagram.common.session.UserSession r4 = r9.A0E
            r5 = 0
            if (r0 == 0) goto L_0x0249
            X.4jz r1 = r0.A08
            if (r1 != 0) goto L_0x0248
            X.4jz r1 = r0.A09
            if (r1 == 0) goto L_0x0249
        L_0x0248:
            r5 = r1
        L_0x0249:
            r32 = 0
            if (r5 == 0) goto L_0x0262
            if (r0 == 0) goto L_0x0353
            boolean r1 = r0.A0W
            if (r1 == 0) goto L_0x0353
            X.0Tu r1 = X.0Tu.A05
            r5 = 36318840455830009(0x8107cb000619f9, double:3.031519176274479E-306)
        L_0x025a:
            boolean r1 = X.182.A06(r1, r4, r5)
            if (r1 == 0) goto L_0x0262
            r32 = 1
        L_0x0262:
            X.GmL r5 = r9.A08
            boolean r1 = r5.A0g
            if (r1 != 0) goto L_0x026c
            r58 = 0
            if (r32 == 0) goto L_0x026e
        L_0x026c:
            r58 = 1
        L_0x026e:
            boolean r1 = r5.A0j
            r21 = r1
            if (r0 == 0) goto L_0x0282
            boolean r10 = r0.A0S
            boolean r6 = r0.A0W
            boolean r1 = r0.A0a
            if (r10 != 0) goto L_0x0282
            if (r6 == 0) goto L_0x0282
            r26 = 1
            if (r1 != 0) goto L_0x0284
        L_0x0282:
            r26 = 0
        L_0x0284:
            X.7a5 r1 = r9.A0B
            r38 = r1
            X.1Xl r1 = r1.A00
            if (r1 == 0) goto L_0x0350
            X.1Xj r10 = r1.BPf()
        L_0x0290:
            java.lang.Integer r20 = X.AnonymousClass05K.A00
            java.lang.Integer r31 = X.AnonymousClass05K.A01
            r6 = r20
            r1 = r31
            X.F3m r30 = X.C335997dt.A00(r4, r10, r6, r1)
            X.F3m r25 = X.C335997dt.A00(r4, r10, r1, r1)
            if (r30 != 0) goto L_0x02a5
            r13 = 0
            if (r25 == 0) goto L_0x02a6
        L_0x02a5:
            r13 = 1
        L_0x02a6:
            if (r10 == 0) goto L_0x034e
            boolean r1 = X.2R8.A02(r4, r10)
            if (r1 == 0) goto L_0x034e
            boolean r1 = r10.A5T()
            if (r1 == 0) goto L_0x034e
            java.lang.String r12 = r10.A30()
            if (r12 == 0) goto L_0x034e
            java.lang.Integer r1 = r10.A0H
            if (r1 == 0) goto L_0x034e
            int r11 = r1.intValue()
            boolean r1 = r10.A5T()
            X.1Xy r6 = r10.A0C
            X.DTf r6 = r6.At2()
            if (r6 == 0) goto L_0x034e
            java.lang.String r10 = r6.C5t()
            if (r10 == 0) goto L_0x034e
            X.H3m r6 = new X.H3m
            r6.<init>(r12, r10, r11, r1)
            int r1 = r6.A00
            if (r1 <= 0) goto L_0x034e
            X.0Tu r1 = X.0Tu.A05
            r10 = 36329470499504273(0x81117600004091, double:3.038241658697834E-306)
            boolean r1 = X.182.A06(r1, r4, r10)
            if (r1 == 0) goto L_0x034e
        L_0x02ea:
            X.0Tu r15 = X.0Tu.A05
            r10 = 36328246434020482(0x81105900033c82, double:3.037467554756968E-306)
            boolean r28 = X.182.A06(r15, r4, r10)
            r10 = 36328246434086019(0x81105900043c83, double:3.037467554798414E-306)
            boolean r29 = X.182.A06(r15, r4, r10)
            if (r0 == 0) goto L_0x0311
            com.instagram.api.schemas.TestimonialDict r1 = r0.A02
            if (r1 == 0) goto L_0x0311
            r10 = 36330634435642061(0x811285000042cd, double:3.0389777365981656E-306)
            boolean r1 = X.182.A06(r15, r4, r10)
            r27 = 1
            if (r1 != 0) goto L_0x0313
        L_0x0311:
            r27 = 0
        L_0x0313:
            r1 = r59
            boolean r1 = r1.A04
            if (r1 != 0) goto L_0x035c
            r1 = r59
            boolean r1 = r1.A03
            if (r1 != 0) goto L_0x035c
            java.util.List r1 = r3.A06
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x035c
            java.util.List r1 = r3.A07
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x035c
            if (r58 != 0) goto L_0x035c
            if (r21 == 0) goto L_0x033f
            if (r0 == 0) goto L_0x033f
            com.instagram.api.schemas.IGCommentSheetMoreInfo r1 = r0.A01
            if (r1 == 0) goto L_0x033f
            java.lang.String r1 = r1.getText()
            if (r1 != 0) goto L_0x035c
        L_0x033f:
            if (r26 != 0) goto L_0x035c
            if (r13 != 0) goto L_0x035c
            if (r6 != 0) goto L_0x035c
            if (r27 != 0) goto L_0x035c
            X.9cl r5 = new X.9cl
            r5.<init>(r0)
            goto L_0x0231
        L_0x034e:
            r6 = 0
            goto L_0x02ea
        L_0x0350:
            r10 = 0
            goto L_0x0290
        L_0x0353:
            X.0Tu r1 = X.0Tu.A05
            r5 = 36318840455764472(0x8107cb000519f8, double:3.031519176233033E-306)
            goto L_0x025a
        L_0x035c:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.lang.String r10 = r3.A05
            r24 = r10
            java.lang.Integer r10 = r3.A04
            r23 = r10
            if (r0 == 0) goto L_0x0660
            com.instagram.common.typedurl.ImageUrl r13 = r0.A03
        L_0x036c:
            boolean r14 = r5.A0h
            boolean r10 = r3.A0B
            r22 = r10
            if (r10 == 0) goto L_0x0391
            if (r24 == 0) goto L_0x0391
            if (r23 == 0) goto L_0x0388
            if (r13 == 0) goto L_0x0388
            int r12 = r23.intValue()
            X.H3k r11 = new X.H3k
            r10 = r24
            r11.<init>(r13, r10, r12)
            r1.add(r11)
        L_0x0388:
            boolean r10 = r3.A0A
            if (r10 == 0) goto L_0x0391
            X.K8y r10 = X.K8y.A00
            r1.add(r10)
        L_0x0391:
            if (r0 == 0) goto L_0x03a1
            if (r26 == 0) goto L_0x03a1
            java.lang.String r12 = r0.A0I
            boolean r11 = r0.A0W
            X.7ez r10 = new X.7ez
            r10.<init>(r12, r11)
            r1.add(r10)
        L_0x03a1:
            java.lang.String r12 = ""
            if (r0 == 0) goto L_0x044f
            X.3QO r13 = r0.A04
            X.3QO r10 = X.AnonymousClass3QO.CLOSE_FRIENDS
            if (r13 != r10) goto L_0x064a
            r10 = 36316087382839231(0x81054a00160fbf, double:3.029778121829376E-306)
            boolean r10 = X.182.A06(r15, r4, r10)
            if (r10 == 0) goto L_0x064a
        L_0x03b6:
            boolean r11 = r0.A0f
            com.instagram.user.model.User r10 = r0.A0A
            if (r10 == 0) goto L_0x03c0
            java.lang.String r12 = r10.getUsername()
        L_0x03c0:
            X.9iU r10 = new X.9iU
            r10.<init>(r13, r12, r11)
            r1.add(r10)
        L_0x03c8:
            if (r58 == 0) goto L_0x044f
            X.2f1 r13 = r9.A0G
            r10 = r33
            X.DbW.A1O(r8, r10, r7)
            com.instagram.user.model.User r12 = r0.A0A
            java.lang.String r10 = r0.A0E
            r26 = r10
            if (r12 == 0) goto L_0x044f
            if (r10 == 0) goto L_0x044f
            java.lang.String r10 = r0.A0F
            r37 = r10
            java.lang.String r10 = r0.A0I
            r36 = r10
            java.lang.Long r10 = r0.A0C
            r35 = r10
            boolean r10 = r0.A0V
            r34 = r10
            if (r32 != 0) goto L_0x03f3
            if (r14 != 0) goto L_0x03f3
            r51 = 0
            if (r27 == 0) goto L_0x063a
        L_0x03f3:
            r51 = 1
            if (r14 == 0) goto L_0x062d
            int r10 = r0.A00
            int r11 = r26.length()
            if (r10 <= 0) goto L_0x0626
            r10 = 160(0xa0, float:2.24E-43)
            if (r11 > r10) goto L_0x0646
        L_0x0403:
            r52 = 0
        L_0x0405:
            com.instagram.user.model.FollowStatus r11 = r13.A0N(r12)
            com.instagram.user.model.FollowStatus r10 = com.instagram.user.model.FollowStatus.A06
            if (r11 != r10) goto L_0x0417
            boolean r10 = r12.A2Q()
            if (r10 != 0) goto L_0x0417
            r53 = 1
            if (r14 == 0) goto L_0x0419
        L_0x0417:
            r53 = 0
        L_0x0419:
            boolean r10 = r0.A0R
            r33 = r10
            java.lang.Object r10 = r8.A00
            X.7aK r10 = (X.C333897aK) r10
            java.lang.String r13 = r8.A01
            java.util.Map r11 = r0.A0Q
            java.lang.Object r7 = r7.A00
            com.instagram.user.model.FollowStatus r7 = (com.instagram.user.model.FollowStatus) r7
            r56 = 0
            X.9iT r8 = new X.9iT
            r40 = r8
            r41 = r10
            r42 = r7
            r43 = r12
            r44 = r35
            r45 = r26
            r46 = r37
            r47 = r36
            r48 = r13
            r49 = r11
            r50 = r34
            r54 = r33
            r55 = r14
            r57 = r56
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57)
            r1.add(r8)
        L_0x044f:
            if (r27 == 0) goto L_0x0622
            if (r0 == 0) goto L_0x04aa
            com.instagram.api.schemas.TestimonialDict r7 = r0.A02
            if (r7 == 0) goto L_0x049d
            int r8 = r0.A00
            r51 = 0
            com.instagram.user.model.User r44 = r7.Adx()
            java.lang.String r46 = r7.getText()
            java.lang.String r48 = r7.BQH()
            if (r44 == 0) goto L_0x049d
            if (r46 == 0) goto L_0x049d
            if (r48 == 0) goto L_0x049d
            r47 = 0
            java.lang.Long r45 = r7.AsC()
            int r7 = r46.length()
            if (r14 == 0) goto L_0x0618
            if (r8 <= 0) goto L_0x0611
            r8 = 160(0xa0, float:2.24E-43)
            if (r7 > r8) goto L_0x061e
        L_0x047f:
            r53 = 0
        L_0x0481:
            X.7aK r42 = X.C333897aK.SHOW_ORIGINAL
            com.instagram.user.model.FollowStatus r43 = com.instagram.user.model.FollowStatus.A08
            X.9iT r7 = new X.9iT
            r41 = r7
            r49 = r47
            r50 = r47
            r52 = r51
            r54 = r51
            r55 = r51
            r56 = r14
            r57 = r19
            r41.<init>(r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            r1.add(r7)
        L_0x049d:
            if (r21 == 0) goto L_0x04aa
            if (r28 != 0) goto L_0x04aa
            if (r29 == 0) goto L_0x04a7
            int r7 = r0.A00
            if (r7 != 0) goto L_0x04aa
        L_0x04a7:
            X.C335047cI.A02(r0, r1)
        L_0x04aa:
            if (r32 == 0) goto L_0x04e2
            if (r0 == 0) goto L_0x04e2
            X.4jz r12 = r0.A08
            r7 = r12
            if (r12 != 0) goto L_0x04b7
            X.4jz r12 = r0.A09
            if (r12 == 0) goto L_0x04e2
        L_0x04b7:
            r11 = 0
            if (r7 != 0) goto L_0x04bf
            java.lang.String r7 = r0.A0E
            if (r7 != 0) goto L_0x04bf
            r11 = 1
        L_0x04bf:
            X.0xa r8 = X.AnonymousClass7TE.A0q(r4)
            r7 = 2903(0xb57, float:4.068E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r7)
            int r8 = X.DbT.A00(r8, r7)
            r7 = 3
            boolean r10 = X.AnonymousClass7TF.A1T(r8, r7)
            X.3yf r7 = r12.BxM()
            boolean r8 = X.AnonymousClass7TF.A1V(r7)
            X.H3l r7 = new X.H3l
            r7.<init>(r12, r11, r10, r8)
            r1.add(r7)
        L_0x04e2:
            boolean r7 = r5.A0d
            if (r7 != 0) goto L_0x0521
            r7 = r59
            X.7aB r7 = r7.A00
            X.7aA r14 = r7.A02
            java.lang.Integer r13 = r7.A03
            if (r0 == 0) goto L_0x0596
            X.1iA r8 = r0.A05
            X.1iA r7 = X.1iA.A0D
            if (r8 == r7) goto L_0x0596
            boolean r7 = r0.A0f
            if (r7 == 0) goto L_0x0596
            com.instagram.user.model.User r7 = r0.A0A
            if (r7 == 0) goto L_0x0596
            X.4Cl r7 = r7.A03
            com.instagram.api.schemas.FanClubInfoDict r7 = r7.B3v()
            if (r7 == 0) goto L_0x0596
            java.lang.String r7 = r7.getFanClubId()
            if (r7 == 0) goto L_0x0596
            r4 = 0
            int r8 = X.C51967G9n.A03(r13, r4)
            r7 = 0
            if (r8 == r4) goto L_0x0519
            r4 = r19
            if (r8 != r4) goto L_0x0519
            r7 = 1
        L_0x0519:
            X.H3i r4 = new X.H3i
            r4.<init>(r14, r7)
        L_0x051e:
            r1.add(r4)
        L_0x0521:
            if (r30 == 0) goto L_0x052d
            X.H3h r7 = new X.H3h
            r4 = r30
            r7.<init>(r4)
            r1.add(r7)
        L_0x052d:
            if (r6 == 0) goto L_0x0532
            r1.add(r6)
        L_0x0532:
            com.instagram.comments.mvvm.data.MediaCommentListRepository r4 = r9.A0A
            X.0Ud r4 = r4.A0M
            java.lang.Object r4 = r4.getValue()
            X.7aJ r4 = (X.C333887aJ) r4
            X.7aI r8 = r4.A00
            boolean r7 = r5.A0e
            r4 = 2
            X.0qQ.A0B(r8, r4)
            r4 = r59
            X.7aB r4 = r4.A00
            java.lang.Integer r6 = r4.A03
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
            if (r6 != r4) goto L_0x066e
            java.util.List r4 = r3.A06
            boolean r6 = X.AnonymousClass7TE.A1b(r4)
            if (r6 == 0) goto L_0x066e
            java.util.Iterator r13 = r4.iterator()
            r12 = 0
            r11 = 0
        L_0x055c:
            boolean r6 = r13.hasNext()
            r10 = -1
            if (r6 == 0) goto L_0x0663
            java.lang.Object r6 = r13.next()
            X.9IV r6 = (X.AnonymousClass9IV) r6
            java.lang.Object r6 = r6.A01
            X.7dj r6 = (X.C335907dj) r6
            boolean r6 = r6.A0h
            r6 = r6 ^ 1
            if (r6 == 0) goto L_0x0593
            if (r11 == r10) goto L_0x0663
            if (r11 != 0) goto L_0x058c
            X.7ey r6 = X.C336657ey.A00
            r1.add(r6)
        L_0x057c:
            X.7ex r6 = X.C336647ex.A00
            r1.add(r6)
            int r6 = r4.size()
        L_0x0585:
            if (r11 >= r6) goto L_0x0707
            int r11 = A00(r4, r1, r11)
            goto L_0x0585
        L_0x058c:
            if (r12 >= r11) goto L_0x057c
            int r12 = A00(r4, r1, r12)
            goto L_0x058c
        L_0x0593:
            int r11 = r11 + 1
            goto L_0x055c
        L_0x0596:
            java.lang.Integer r7 = X.AnonymousClass05K.A0u
            if (r13 == r7) goto L_0x0521
            r27 = 1
            if (r0 == 0) goto L_0x05a6
            boolean r8 = r0.A0f
            r26 = 1
            r7 = r19
            if (r8 == r7) goto L_0x05aa
        L_0x05a6:
            r26 = 0
            if (r0 == 0) goto L_0x060e
        L_0x05aa:
            com.instagram.user.model.User r7 = r0.A0A
            if (r7 == 0) goto L_0x060e
            X.4Cl r7 = r7.A03
            com.instagram.api.schemas.FanClubInfoDict r7 = r7.B3v()
            if (r7 == 0) goto L_0x060e
            java.lang.String r7 = r7.getFanClubId()
            if (r7 == 0) goto L_0x060e
        L_0x05bc:
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            X.HN2 r11 = X.HN2.A05
            r12.add(r11)
            X.HN2 r10 = X.HN2.A07
            r12.add(r10)
            r7 = 36320395233927559(0x81093500052187, double:3.0325024242039585E-306)
            boolean r4 = X.182.A06(r15, r4, r7)
            if (r4 == 0) goto L_0x05da
            X.HN2 r4 = X.HN2.A06
            r12.add(r4)
        L_0x05da:
            if (r26 == 0) goto L_0x05e3
            if (r27 == 0) goto L_0x05e3
            X.HN2 r4 = X.HN2.A0A
            r12.add(r4)
        L_0x05e3:
            r4 = r19
            X.Dba.A0j(r4, r13, r14)
            X.7aA r4 = X.C333797aA.NOT_SET
            if (r14 != r4) goto L_0x0603
            r4 = r20
            if (r13 == r4) goto L_0x05f5
            r4 = r31
            if (r13 != r4) goto L_0x05fc
            r11 = r10
        L_0x05f5:
            X.H3j r4 = new X.H3j
            r4.<init>(r11, r12)
            goto L_0x051e
        L_0x05fc:
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
            if (r13 != r4) goto L_0x0603
            X.HN2 r11 = X.HN2.A06
            goto L_0x05f5
        L_0x0603:
            X.7aA r4 = X.C333797aA.SUBSCRIBERS_ONLY
            if (r14 != r4) goto L_0x05f5
            r4 = r20
            if (r13 != r4) goto L_0x05f5
            X.HN2 r11 = X.HN2.A0A
            goto L_0x05f5
        L_0x060e:
            r27 = 0
            goto L_0x05bc
        L_0x0611:
            if (r8 != 0) goto L_0x047f
            r8 = 400(0x190, float:5.6E-43)
            if (r7 <= r8) goto L_0x047f
            goto L_0x061e
        L_0x0618:
            r8 = 2200(0x898, float:3.083E-42)
            r53 = 0
            if (r7 > r8) goto L_0x0481
        L_0x061e:
            r53 = 1
            goto L_0x0481
        L_0x0622:
            if (r0 == 0) goto L_0x04aa
            goto L_0x049d
        L_0x0626:
            if (r10 != 0) goto L_0x0403
            r10 = 400(0x190, float:5.6E-43)
            if (r11 <= r10) goto L_0x0403
            goto L_0x0646
        L_0x062d:
            if (r32 == 0) goto L_0x063a
            r10 = 36318840456026620(0x8107cb000919fc, double:3.0315191763988166E-306)
            boolean r10 = X.182.A06(r15, r4, r10)
            if (r10 == 0) goto L_0x0403
        L_0x063a:
            boolean r10 = r0.A0c
            if (r10 == 0) goto L_0x0646
            int r11 = r26.length()
            r10 = 2200(0x898, float:3.083E-42)
            if (r11 > r10) goto L_0x0403
        L_0x0646:
            r52 = 1
            goto L_0x0405
        L_0x064a:
            X.3QO r10 = X.AnonymousClass3QO.OPAL
            if (r13 != r10) goto L_0x03c8
            boolean r10 = X.C318996ps.A01()
            if (r10 == 0) goto L_0x03c8
            X.1q7 r10 = X.C318996ps.A00()
            boolean r10 = r10.A04(r4)
            if (r10 == 0) goto L_0x03c8
            goto L_0x03b6
        L_0x0660:
            r13 = 0
            goto L_0x036c
        L_0x0663:
            int r6 = r4.size()
        L_0x0667:
            if (r12 >= r6) goto L_0x0707
            int r12 = A00(r4, r1, r12)
            goto L_0x0667
        L_0x066e:
            java.util.List r4 = r3.A06
            boolean r6 = r4 instanceof java.util.Collection
            if (r6 == 0) goto L_0x0690
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L_0x0690
        L_0x067a:
            java.util.List r10 = r3.A07
            boolean r6 = r10 instanceof java.util.Collection
            if (r6 == 0) goto L_0x06a9
            boolean r6 = r10.isEmpty()
            if (r6 == 0) goto L_0x06a9
        L_0x0686:
            int r11 = r3.A00
            r6 = 0
        L_0x0689:
            if (r6 >= r11) goto L_0x06ce
            int r6 = A00(r4, r1, r6)
            goto L_0x0689
        L_0x0690:
            java.util.Iterator r10 = r4.iterator()
        L_0x0694:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L_0x067a
            java.lang.Object r6 = r10.next()
            X.9IV r6 = (X.AnonymousClass9IV) r6
            java.lang.Object r6 = r6.A01
            X.7dj r6 = (X.C335907dj) r6
            boolean r6 = r6.A0f
            if (r6 == 0) goto L_0x0694
            goto L_0x06c1
        L_0x06a9:
            java.util.Iterator r11 = r10.iterator()
        L_0x06ad:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L_0x0686
            java.lang.Object r6 = r11.next()
            X.9IV r6 = (X.AnonymousClass9IV) r6
            java.lang.Object r6 = r6.A01
            X.7dj r6 = (X.C335907dj) r6
            boolean r6 = r6.A0f
            if (r6 == 0) goto L_0x06ad
        L_0x06c1:
            int r10 = r3.A00
            int r6 = r4.size()
        L_0x06c7:
            if (r10 >= r6) goto L_0x06ef
            int r10 = A00(r4, r1, r10)
            goto L_0x06c7
        L_0x06ce:
            java.util.Iterator r12 = r10.iterator()
        L_0x06d2:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto L_0x06e4
            java.lang.Object r10 = r12.next()
            X.9IV r10 = (X.AnonymousClass9IV) r10
            X.7de r6 = X.C335857de.A04
            X.C335047cI.A01(r10, r6, r1)
            goto L_0x06d2
        L_0x06e4:
            int r6 = r4.size()
        L_0x06e8:
            if (r11 >= r6) goto L_0x0707
            int r11 = A00(r4, r1, r11)
            goto L_0x06e8
        L_0x06ef:
            java.util.List r6 = r3.A07
            java.util.Iterator r11 = r6.iterator()
        L_0x06f5:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L_0x0707
            java.lang.Object r10 = r11.next()
            X.9IV r10 = (X.AnonymousClass9IV) r10
            X.7de r6 = X.C335857de.A04
            X.C335047cI.A01(r10, r6, r1)
            goto L_0x06f5
        L_0x0707:
            boolean r6 = X.C335047cI.A03(r3)
            if (r6 == 0) goto L_0x07a7
            boolean r6 = r3.A09
            if (r6 == 0) goto L_0x079f
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r11 = r4.iterator()
        L_0x0719:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L_0x0734
            java.lang.Object r8 = r11.next()
            r6 = r8
            X.9IV r6 = (X.AnonymousClass9IV) r6
            java.lang.Object r6 = r6.A01
            X.7dj r6 = (X.C335907dj) r6
            X.7de r7 = r6.A05
            X.7de r6 = X.C335857de.COVERED_COMMENT
            if (r7 != r6) goto L_0x0719
            r10.add(r8)
            goto L_0x0719
        L_0x0734:
            boolean r6 = X.AnonymousClass7TE.A1b(r10)
            if (r6 == 0) goto L_0x0758
            X.7de r8 = X.C335857de.COVERED_COMMENT
            X.7ev r6 = new X.7ev
            r6.<init>(r8)
            r1.add(r6)
            java.util.Iterator r7 = r10.iterator()
        L_0x0748:
            boolean r6 = r7.hasNext()
            if (r6 == 0) goto L_0x0758
            java.lang.Object r6 = r7.next()
            X.9IV r6 = (X.AnonymousClass9IV) r6
            X.C335047cI.A01(r6, r8, r1)
            goto L_0x0748
        L_0x0758:
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r11 = r4.iterator()
        L_0x0760:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L_0x077b
            java.lang.Object r8 = r11.next()
            r6 = r8
            X.9IV r6 = (X.AnonymousClass9IV) r6
            java.lang.Object r6 = r6.A01
            X.7dj r6 = (X.C335907dj) r6
            X.7de r7 = r6.A05
            X.7de r6 = X.C335857de.HIDDEN_COMMENT
            if (r7 != r6) goto L_0x0760
            r10.add(r8)
            goto L_0x0760
        L_0x077b:
            boolean r6 = X.AnonymousClass7TE.A1b(r10)
            if (r6 == 0) goto L_0x07a7
            X.7de r8 = X.C335857de.HIDDEN_COMMENT
            X.7ev r6 = new X.7ev
            r6.<init>(r8)
            r1.add(r6)
            java.util.Iterator r7 = r10.iterator()
        L_0x078f:
            boolean r6 = r7.hasNext()
            if (r6 == 0) goto L_0x07a7
            java.lang.Object r6 = r7.next()
            X.9IV r6 = (X.AnonymousClass9IV) r6
            X.C335047cI.A01(r6, r8, r1)
            goto L_0x078f
        L_0x079f:
            X.7ew r6 = new X.7ew
            r6.<init>(r8, r7)
            r1.add(r6)
        L_0x07a7:
            if (r0 == 0) goto L_0x07cc
            if (r21 == 0) goto L_0x07b6
            if (r28 == 0) goto L_0x07b6
            r6 = r59
            boolean r6 = r6.A03
            if (r6 != 0) goto L_0x07b6
            X.C335047cI.A02(r0, r1)
        L_0x07b6:
            boolean r6 = r0.A0c
            if (r6 == 0) goto L_0x07cc
            if (r21 == 0) goto L_0x07cc
            r6 = r59
            boolean r6 = r6.A03
            if (r6 != 0) goto L_0x07cc
            java.lang.String r7 = r0.A0I
            X.K8x r6 = new X.K8x
            r6.<init>(r7)
            r1.add(r6)
        L_0x07cc:
            if (r25 == 0) goto L_0x07d8
            X.H3h r7 = new X.H3h
            r6 = r25
            r7.<init>(r6)
            r1.add(r7)
        L_0x07d8:
            X.JwJ r6 = r3.A01
            if (r6 == 0) goto L_0x084e
            java.lang.String r7 = r6.A01
            java.lang.Object r6 = r6.A00
            java.util.UUID r6 = (java.util.UUID) r6
            r15 = 0
            r13 = 0
            X.7d7 r30 = new X.7d7
            r10 = r30
            r11 = r7
            r12 = r6
            r10.<init>(r11, r12, r13, r15)
        L_0x07ee:
            boolean r6 = r9.A04
            if (r6 == 0) goto L_0x0806
            r6 = 0
            r9.A04 = r6
            r10 = 0
            r12 = 15
            X.PqY r7 = new X.PqY
            r8 = r9
            r9 = r20
            r11 = r10
            r7.<init>((java.lang.Object) r8, (java.lang.Object) r9, (java.lang.String) r10, (java.lang.String) r11, (int) r12)
            r6 = r38
            r6.A00(r7)
        L_0x0806:
            X.7cJ r6 = X.C335057cJ.A00
            java.util.ArrayList r36 = X.C335067cK.A0A(r3, r6)
            boolean r7 = r4.isEmpty()
            int r6 = r5.A00
            X.MfE r9 = new X.MfE
            r4 = r19
            r9.<init>((int) r6, (boolean) r7, (int) r4)
            boolean r10 = r3.A0A
            java.lang.String r8 = r5.A0J
            boolean r7 = r5.A0Q
            boolean r6 = r5.A0T
            boolean r4 = r5.A0f
            java.lang.String r3 = r5.A0B
            boolean r11 = r5.A0L
            X.7c8 r5 = new X.7c8
            r25 = r5
            r26 = r9
            r27 = r18
            r28 = r59
            r29 = r0
            r31 = r23
            r32 = r24
            r33 = r8
            r34 = r3
            r35 = r1
            r37 = r22
            r38 = r10
            r40 = r7
            r41 = r6
            r42 = r4
            r43 = r11
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            goto L_0x0231
        L_0x084e:
            X.7aX r30 = X.C334017aX.A00
            goto L_0x07ee
        L_0x0851:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r4 = 1
            if (r0 == 0) goto L_0x085f
            if (r0 == r4) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x085f:
            X.02o r15 = A02(r6, r2)
            java.lang.Object r7 = r2.A02
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            java.lang.Object r10 = r2.A03
            X.GgO r10 = (X.C52971GgO) r10
            r0 = 0
            r1 = r7[r0]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.comments.mvvm.data.model.CommentListRowModel.CommentRowModel>"
            X.0qQ.A0C(r1, r0)
            java.util.List r1 = (java.util.List) r1
            r8 = r7[r4]
            X.DbS.A1Y(r8)
            java.lang.String r8 = (java.lang.String) r8
            r0 = 2
            r9 = r7[r0]
            r0 = 5
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r9, r0)
            java.util.List r9 = (java.util.List) r9
            r0 = 3
            r3 = r7[r0]
            X.7cr r3 = (X.C335377cr) r3
            r0 = 4
            r13 = r7[r0]
            X.7ct r13 = (X.C335397ct) r13
            r0 = 5
            r5 = r7[r0]
            X.7a7 r5 = (X.C333777a7) r5
            r0 = 6
            r0 = r7[r0]
            boolean r6 = X.JTQ.A1W(r0)
            r0 = 7
            r12 = r7[r0]
            X.6o8 r12 = (X.C317966o8) r12
            r23 = 0
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r6 == 0) goto L_0x08f6
            if (r0 == 0) goto L_0x08f0
            X.7cz r6 = X.C335457cz.A00
            com.instagram.common.session.UserSession r3 = r10.A0E
            X.GmL r0 = r10.A08
            boolean r0 = r0.A0e
            boolean r6 = r6.A03(r3, r1, r0)
            if (r5 == 0) goto L_0x08cb
            java.lang.String r5 = r5.A0G
            r3 = 0
            if (r5 == 0) goto L_0x08cb
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x08d7
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x08d7
        L_0x08cb:
            r3 = 1
        L_0x08cc:
            X.GpT r0 = new X.GpT
            r0.<init>(r6, r3)
        L_0x08d1:
            java.lang.Object r1 = A01(r0, r2, r15, r4)
            goto L_0x2f27
        L_0x08d7:
            java.util.Iterator r1 = r1.iterator()
        L_0x08db:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x08cb
            java.lang.Object r0 = r1.next()
            X.7dj r0 = (X.C335907dj) r0
            java.lang.String r0 = r0.A0K
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 == 0) goto L_0x08db
            goto L_0x08cc
        L_0x08f0:
            X.GpT r0 = new X.GpT
            r0.<init>(r4, r4)
            goto L_0x08d1
        L_0x08f6:
            if (r0 == 0) goto L_0x0907
            com.instagram.common.session.UserSession r7 = r10.A0E
            X.0Tu r6 = X.0Tu.A05
            r0 = 36323032343784187(0x810b9b00042afb, double:3.034170143096079E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x0a09
        L_0x0907:
            X.GmL r7 = r10.A08
            boolean r0 = r7.A0P
            if (r0 != 0) goto L_0x0a09
            if (r5 == 0) goto L_0x0927
            boolean r0 = r5.A0Y
            if (r0 != r4) goto L_0x0927
            boolean r0 = r5.A0f
            if (r0 != 0) goto L_0x0927
            boolean r0 = r7.A0d
            r1 = 2131956410(0x7f1312ba, float:1.9549375E38)
            if (r0 == 0) goto L_0x0921
            r1 = 2131974389(0x7f1358f5, float:1.958584E38)
        L_0x0921:
            X.9ck r0 = new X.9ck
            r0.<init>(r1)
            goto L_0x08d1
        L_0x0927:
            X.7a5 r6 = r10.A0B
            X.1Xl r0 = r6.A00
            if (r0 == 0) goto L_0x0a05
            X.1Xj r5 = r0.BPf()
        L_0x0931:
            boolean r1 = r7.A0d
            com.instagram.common.session.UserSession r0 = r10.A0E
            X.0Rd r14 = X.AnonymousClass4CM.A00(r0)
            java.lang.String r8 = X.DbV.A12(r8)
            int r8 = r8.length()
            boolean r28 = X.AnonymousClass7TF.A1R(r8)
            boolean r8 = r7.A0S
            r29 = r8 ^ 1
            if (r5 == 0) goto L_0x09ff
            com.instagram.user.model.User r8 = X.C51966G9m.A11(r5)
            if (r8 == 0) goto L_0x09ff
            java.lang.String r23 = r8.getUsername()
        L_0x0955:
            java.util.ArrayList r27 = X.AnonymousClass3VO.A04(r5)
        L_0x0959:
            if (r1 != 0) goto L_0x096b
            if (r5 == 0) goto L_0x096b
            X.1Xy r8 = r5.A0C
            java.lang.Boolean r8 = r8.CQK()
            boolean r8 = X.AnonymousClass7TF.A1Y(r8, r4)
            r30 = 1
            if (r8 != 0) goto L_0x096f
        L_0x096b:
            r30 = 0
            if (r1 != 0) goto L_0x09fa
        L_0x096f:
            boolean r8 = X.C334457bI.A00(r0)
            if (r8 != 0) goto L_0x0982
            X.0Tu r8 = X.0Tu.A05
            r10 = 36320356579221853(0x81092c0005215d, double:3.03247797881242E-306)
            boolean r8 = X.182.A06(r8, r0, r10)
            if (r8 == 0) goto L_0x09fa
        L_0x0982:
            r32 = 1
        L_0x0984:
            X.0Tu r8 = X.0Tu.A05
            r10 = 36323053818358562(0x810ba000002b22, double:3.034183723703385E-306)
            boolean r8 = X.182.A06(r8, r0, r10)
            r33 = 1
            if (r8 != 0) goto L_0x0995
        L_0x0993:
            r33 = 0
        L_0x0995:
            if (r3 == 0) goto L_0x09a7
            X.0Ud r8 = r6.A03
            java.lang.Object r8 = r8.getValue()
            X.7a7 r8 = (X.C333777a7) r8
            boolean r8 = X.C393889xC.A00(r3, r8, r0)
            r31 = 1
            if (r8 != 0) goto L_0x09a9
        L_0x09a7:
            r31 = 0
        L_0x09a9:
            X.1Xl r11 = r6.A00
            java.lang.String r10 = r7.A09
            java.lang.Integer r8 = r7.A03
            boolean r7 = r7.A0b
            if (r5 == 0) goto L_0x09f7
            X.1Xj r6 = r5.A1e(r0)
            java.lang.String r25 = r6.A2n()
        L_0x09bb:
            boolean r6 = r14.A01()
            if (r6 == 0) goto L_0x09c9
            boolean r5 = r14.A02(r5)
            r35 = 1
            if (r5 != 0) goto L_0x09cb
        L_0x09c9:
            r35 = 0
        L_0x09cb:
            if (r1 != 0) goto L_0x09dc
            X.0Tu r1 = X.0Tu.A05
            r5 = 36322048796272558(0x810ab6000427ae, double:3.033548143689297E-306)
            boolean r0 = X.182.A06(r1, r0, r5)
            r36 = 1
            if (r0 != 0) goto L_0x09de
        L_0x09dc:
            r36 = 0
        L_0x09de:
            X.7cv r0 = new X.7cv
            r18 = r3
            r19 = r13
            r20 = r12
            r21 = r11
            r22 = r8
            r24 = r10
            r26 = r9
            r34 = r7
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            goto L_0x08d1
        L_0x09f7:
            r25 = 0
            goto L_0x09bb
        L_0x09fa:
            r32 = 0
            if (r1 != 0) goto L_0x0993
            goto L_0x0984
        L_0x09ff:
            if (r5 != 0) goto L_0x0955
            X.0sn r27 = X.0sn.A00
            goto L_0x0959
        L_0x0a05:
            r5 = r23
            goto L_0x0931
        L_0x0a09:
            X.7cu r0 = X.C335407cu.A00
            goto L_0x08d1
        L_0x0a0d:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r4 = 1
            if (r0 == 0) goto L_0x0a1b
            if (r0 == r4) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0a1b:
            X.0eS.A00(r6)
            java.lang.Object r3 = r2.A02
            X.02o r3 = (X.02o) r3
            java.lang.Object r1 = r2.A03
            boolean r0 = r1 instanceof X.C59702JUj
            if (r0 != 0) goto L_0x0a46
            boolean r0 = X.C59678JTj.A01(r4, r1)
            if (r0 != 0) goto L_0x0a46
            boolean r0 = X.C59678JTj.A02(r1)
            if (r0 == 0) goto L_0x0a4c
            java.lang.Object r0 = r2.A01
            X.0sP r0 = (X.0sP) r0
            java.lang.Object r0 = r0.invoke(r1)
            X.0r6 r0 = (X.AnonymousClass0r6) r0
        L_0x0a3e:
            r2.A00 = r4
            java.lang.Object r1 = X.AnonymousClass11O.A02(r2, r0, r3)
            goto L_0x2f27
        L_0x0a46:
            X.0rr r0 = new X.0rr
            r0.<init>(r1)
            goto L_0x0a3e
        L_0x0a4c:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0a51:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r7 = 2
            r10 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0a92
            if (r0 != r10) goto L_0x2ea2
            java.lang.Object r9 = r2.A02
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r2.A01
            X.0eS.A00(r6)
        L_0x0a65:
            java.lang.Object r4 = r2.A03
            com.instagram.common.uigraph.UiGraph r4 = (com.instagram.common.uigraph.UiGraph) r4
            java.util.Map r0 = r4.A04
            java.lang.Object r0 = r0.get(r9)
            X.3Vc r0 = (X.C242593Vc) r0
            if (r0 == 0) goto L_0x2f8e
            X.0Ud r3 = r0.A07
            X.0Ud r1 = r0.A08
            com.instagram.common.uigraph.UiGraph$createStateFlow$1$3$1 r0 = new com.instagram.common.uigraph.UiGraph$createStateFlow$1$3$1
            r0.<init>(r4, r9, r5)
            X.0pm r1 = X.AnonymousClass10H.A03(r0, r3, r1)
            r0 = 44
            X.MCj r0 = X.C66119MCj.A00(r8, r0)
            r2.A01 = r5
            r2.A02 = r5
            r2.A00 = r7
            java.lang.Object r1 = r1.collect(r0, r2)
            goto L_0x2f27
        L_0x0a92:
            X.0eS.A00(r6)
            java.lang.Object r8 = r2.A01
            java.lang.Object r9 = r2.A02
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r4 = r2.A03
            com.instagram.common.uigraph.UiGraph r4 = (com.instagram.common.uigraph.UiGraph) r4
            java.util.Map r0 = r4.A04
            java.lang.Object r0 = r0.get(r9)
            if (r0 != 0) goto L_0x0a65
            X.0V2 r3 = r4.A09
            r1 = 14
            X.MGy r0 = new X.MGy
            r0.<init>(r4, r9, r5, r1)
            X.0fv r1 = new X.0fv
            r1.<init>(r0, r3, r10)
            X.MCc r0 = X.MCc.A00
            r2.A01 = r8
            r2.A02 = r9
            r2.A00 = r10
            java.lang.Object r1 = r1.collect(r0, r2)
            r0 = r16
            if (r1 != r0) goto L_0x0a65
            return r16
        L_0x0ac6:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r3 = 1
            if (r0 == 0) goto L_0x0ad4
            if (r0 == r3) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0ad4:
            X.02o r1 = A02(r6, r2)
            java.lang.Object r0 = r2.A02
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            X.8fx[] r0 = (X.C361278fx[]) r0
            X.8fx r0 = X.AnonymousClass83I.A00(r0)
            java.lang.Object r1 = A01(r0, r2, r1, r3)
            goto L_0x2f27
        L_0x0ae8:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r9 = 1
            if (r0 == 0) goto L_0x0af6
            if (r0 == r9) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0af6:
            X.02o r10 = A02(r6, r2)
            java.lang.Object r0 = r2.A02
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            if (r0 == 0) goto L_0x0b76
            java.util.Iterator r14 = r0.iterator()
        L_0x0b08:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0b76
            java.lang.Object r4 = r14.next()
            X.8fx r4 = (X.C361278fx) r4
            java.lang.Object r12 = r4.A01
            if (r12 == 0) goto L_0x0b08
            java.lang.Object r0 = r4.A00()
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0
            float r13 = r0.A00
            boolean r0 = r4 instanceof X.AnonymousClass8Y4
            r3 = 0
            if (r0 == 0) goto L_0x0b08
            java.lang.Object r0 = r4.A00()
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0
            com.instagram.music.common.model.MusicAssetModel r1 = r0.A08
            if (r1 == 0) goto L_0x0b71
            java.lang.String r11 = r1.A0D
            if (r11 == 0) goto L_0x0b08
            java.lang.Object r0 = r4.A00()
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0
            java.lang.String r7 = r0.A0A
            java.lang.Object r0 = r4.A00()
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0
            java.lang.String r6 = r0.A0B
            java.lang.String r5 = r1.A0I
            com.instagram.common.typedurl.ImageUrl r4 = r1.A03
            float r25 = X.LIF.A01(r13)
            com.instagram.music.common.model.AudioOverlayTrack r12 = (com.instagram.music.common.model.AudioOverlayTrack) r12
            if (r12 == 0) goto L_0x0b51
            java.lang.String r3 = r12.A0D
        L_0x0b51:
            X.KMd r1 = new X.KMd
            r1.<init>(r3)
            X.JuM r0 = new X.JuM
            r18 = r4
            r19 = r1
            r20 = r7
            r21 = r6
            r22 = r5
            r23 = r11
            r24 = r3
            r26 = r9
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r8.add(r0)
            goto L_0x0b08
        L_0x0b71:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0b76:
            boolean r1 = r8.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0b80
            r8.add(r0)
        L_0x0b80:
            r2.A01 = r0
            java.lang.Object r1 = A01(r8, r2, r10, r9)
            goto L_0x2f27
        L_0x0b88:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r4 = 1
            if (r0 == 0) goto L_0x0b96
            if (r0 == r4) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0b96:
            X.02o r5 = A02(r6, r2)
            java.lang.Object r3 = r2.A02
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r0 = 0
            r9 = r3[r0]
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            X.0qQ.A0C(r9, r1)
            java.lang.String r9 = (java.lang.String) r9
            r10 = r3[r4]
            X.0qQ.A0C(r10, r1)
            java.lang.String r10 = (java.lang.String) r10
            r0 = 2
            r11 = r3[r0]
            X.0qQ.A0C(r11, r1)
            java.lang.String r11 = (java.lang.String) r11
            r0 = 3
            r12 = r3[r0]
            java.lang.String r12 = (java.lang.String) r12
            r0 = 4
            r8 = r3[r0]
            X.Khl r8 = (X.C62555Khl) r8
            r0 = 5
            r0 = r3[r0]
            boolean r13 = X.JTQ.A1W(r0)
            java.lang.Object r6 = r2.A03
            r0 = 0
            X.MIK r3 = new X.MIK
            r3.<init>(r6, r0)
            X.MIX r1 = new X.MIX
            r1.<init>(r6, r4)
            r0 = 37
            X.JVf r7 = new X.JVf
            r7.<init>((int) r0, (java.lang.Object) r3, (java.lang.Object) r1)
            X.Ja7 r6 = new X.Ja7
            r6.<init>((X.C59721JVf) r7, (X.C62555Khl) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12, (boolean) r13)
            java.lang.Object r1 = A01(r6, r2, r5, r4)
            goto L_0x2f27
        L_0x0be7:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r11 = 1
            if (r0 == 0) goto L_0x0bf5
            if (r0 == r11) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0bf5:
            X.02o r17 = A02(r6, r2)
            java.lang.Object r1 = r2.A02
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            java.lang.Object r4 = r2.A03
            X.LBH r4 = (X.LBH) r4
            boolean r0 = r4.A03
            if (r0 != 0) goto L_0x0c0f
            X.LqF r1 = X.C65260LqF.A00
        L_0x0c07:
            r0 = r17
            java.lang.Object r1 = A01(r1, r2, r0, r11)
            goto L_0x2f27
        L_0x0c0f:
            r10 = 0
            r12 = r1[r10]
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.channels.participationhub.constants.DrawerState"
            X.0qQ.A0C(r12, r0)
            X.Kgq r12 = (X.C62500Kgq) r12
            r13 = r1[r11]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.direct.channels.participationhub.constants.ActivityType>"
            X.0qQ.A0C(r13, r0)
            java.util.List r13 = (java.util.List) r13
            r9 = 2
            r8 = r1[r9]
            X.7L0 r8 = (X.AnonymousClass7L0) r8
            r18 = 3
            X.KiK r3 = X.C62587KiK.LIVE
            boolean r0 = r13.contains(r3)
            r7 = 0
            if (r0 != 0) goto L_0x0c6c
            X.2Er r6 = r4.A06
            X.N49 r5 = r6.BYB()
            if (r5 == 0) goto L_0x0c6c
            java.lang.String r1 = r5.A01
            if (r1 == 0) goto L_0x0c44
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0c57
        L_0x0c44:
            com.instagram.user.model.User r0 = r6.Ash()
            if (r0 == 0) goto L_0x0e4a
            java.lang.String r6 = r0.B8Q()
            android.content.Context r1 = r4.A04
            r0 = 2131965391(0x7f1335cf, float:1.956759E38)
            java.lang.String r1 = X.DbW.A0h(r1, r6, r0)
        L_0x0c57:
            java.lang.String r0 = r5.A00
            r23 = 0
            X.JyK r7 = new X.JyK
            r19 = r7
            r20 = r3
            r21 = r8
            r22 = r0
            r24 = r1
            r25 = r11
            r19.<init>(r20, r21, r22, r23, r24, r25)
        L_0x0c6c:
            X.KiK r5 = X.C62587KiK.DAILY_PROMPT
            boolean r0 = r13.contains(r5)
            r6 = 0
            if (r0 != 0) goto L_0x0c9e
            X.2Er r1 = r4.A06
            X.914 r14 = r1.Amp()
            if (r14 == 0) goto L_0x0c9e
            com.instagram.common.session.UserSession r0 = r4.A05
            boolean r0 = X.C3269478t.A00(r0, r1)
            if (r0 == 0) goto L_0x0c9e
            java.lang.String r3 = r14.A03
            java.lang.String r1 = r14.A02
            java.lang.String r0 = r14.A04
            X.JyK r6 = new X.JyK
            r19 = r6
            r20 = r5
            r21 = r8
            r22 = r3
            r23 = r1
            r24 = r0
            r25 = r11
            r19.<init>(r20, r21, r22, r23, r24, r25)
        L_0x0c9e:
            X.KiK r14 = X.C62587KiK.SPOTLIGHT
            boolean r0 = r13.contains(r14)
            r5 = 0
            if (r0 != 0) goto L_0x0cd8
            X.2Er r0 = r4.A06
            X.Ja7 r3 = r0.BKp()
            if (r3 == 0) goto L_0x0cd8
            X.78w r15 = X.C3269778w.A00
            com.instagram.common.session.UserSession r1 = r4.A05
            X.3sy r0 = r0.BJz()
            com.instagram.model.direct.DirectThreadKey r0 = X.C66647MaG.A03(r0)
            boolean r0 = r15.A02(r3, r1, r0)
            if (r0 == 0) goto L_0x0cd8
            java.lang.String r0 = r3.A03
            r23 = 0
            java.lang.String r1 = r3.A05
            X.JyK r5 = new X.JyK
            r19 = r5
            r20 = r14
            r21 = r8
            r22 = r0
            r24 = r1
            r25 = r11
            r19.<init>(r20, r21, r22, r23, r24, r25)
        L_0x0cd8:
            X.KiK r3 = X.C62587KiK.POLL
            boolean r0 = r13.contains(r3)
            r13 = 0
            if (r0 != 0) goto L_0x0d0c
            X.2Er r0 = r4.A06
            java.util.List r0 = r0.Bk5()
            if (r0 == 0) goto L_0x0d0c
            java.lang.Object r0 = X.00k.A0J(r0)
            X.Jvt r0 = (X.C61055Jvt) r0
            if (r0 == 0) goto L_0x0d0c
            boolean r1 = r0.A03
            if (r1 != 0) goto L_0x0d0c
            java.lang.String r1 = r0.A01
            r23 = 0
            java.lang.String r0 = r0.A02
            X.JyK r13 = new X.JyK
            r19 = r13
            r20 = r3
            r21 = r8
            r22 = r1
            r24 = r0
            r25 = r11
            r19.<init>(r20, r21, r22, r23, r24, r25)
        L_0x0d0c:
            X.JyK[] r0 = new X.C61168JyK[]{r7, r6, r5, r13}
            X.0qQ.A0B(r0, r10)
            java.util.List r5 = X.03t.A0I(r0)
            int r1 = r12.ordinal()
            if (r1 == r11) goto L_0x0e12
            if (r1 == r10) goto L_0x0d2f
            if (r1 == r9) goto L_0x0d2f
            r0 = r18
            if (r1 != r0) goto L_0x0e55
            r3 = r5
        L_0x0d26:
            r4.A00 = r3
            X.Jyz r1 = new X.Jyz
            r1.<init>(r3)
            goto L_0x0c07
        L_0x0d2f:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r5.iterator()
            r1 = 0
        L_0x0d38:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0d77
            java.lang.Object r0 = r13.next()
            int r12 = r1 + 1
            if (r1 >= 0) goto L_0x0d4e
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0d4e:
            X.JyK r0 = (X.C61168JyK) r0
            boolean r24 = X.AnonymousClass7TF.A1Q(r1)
            X.KiK r8 = r0.A00
            X.7L0 r7 = r0.A01
            java.lang.String r6 = r0.A02
            java.lang.String r5 = r0.A03
            java.lang.String r1 = r0.A04
            X.0qQ.A0B(r8, r10)
            X.JyK r0 = new X.JyK
            r19 = r8
            r20 = r7
            r21 = r6
            r22 = r5
            r23 = r1
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r3.add(r0)
            r1 = r12
            goto L_0x0d38
        L_0x0d77:
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x0d26
            r12 = 0
            java.lang.Object r8 = X.00k.A0O(r3, r10)
            X.JyK r8 = (X.C61168JyK) r8
            r0 = 0
            if (r8 == 0) goto L_0x0d26
            java.lang.String r7 = r8.A02
            if (r7 == 0) goto L_0x0d26
            java.util.List r1 = r4.A00
            java.lang.Object r1 = X.00k.A0O(r1, r10)
            X.JyK r1 = (X.C61168JyK) r1
            if (r1 == 0) goto L_0x0d95
            java.lang.String r0 = r1.A02
        L_0x0d95:
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0d26
            X.KiK[] r10 = X.C62587KiK.values()
            int r6 = r10.length
            int r0 = X.AnonymousClass7TG.A01(r6)
            java.util.LinkedHashMap r5 = X.DbS.A0x(r0)
        L_0x0da8:
            if (r12 >= r6) goto L_0x0db6
            r0 = r10[r12]
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "null"
            r5.put(r1, r0)
            int r12 = r12 + 1
            goto L_0x0da8
        L_0x0db6:
            java.util.LinkedHashMap r6 = X.0Yt.A03(r5)
            X.KiK r0 = r8.A00
            java.lang.String r0 = r0.A01
            r6.put(r0, r7)
            X.0eM r0 = r4.A07
            X.6gx r12 = X.DbZ.A0R(r0)
            X.2Er r0 = r4.A06
            java.lang.String r7 = r0.C6C()
            java.lang.String r10 = r0.C6k()
            int r8 = r0.AdN()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            X.1Ln r1 = X.DbT.A0J(r12)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x0d26
            X.DbW.A17(r1, r12)
            java.lang.String r0 = "member_participation_hub_active_participation_rendered"
            r1.A0l(r0)
            java.lang.String r0 = "impression"
            r1.A0k(r0)
            java.lang.String r0 = "member_participation_hub"
            r1.A0p(r0)
            java.lang.String r0 = "thread_view"
            r1.A0q(r0)
            if (r5 == 0) goto L_0x0e0f
            if (r8 != r9) goto L_0x0e0f
            java.lang.String r0 = "subscriber_broadcast"
        L_0x0e00:
            r1.A0o(r0)
            r1.A0s(r7)
            java.lang.Long r0 = X.DbZ.A0d(r10)
            X.JTQ.A1C(r1, r0, r6)
            goto L_0x0d26
        L_0x0e0f:
            java.lang.String r0 = "broadcast"
            goto L_0x0e00
        L_0x0e12:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r5.iterator()
        L_0x0e1a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0d26
            java.lang.Object r0 = r9.next()
            X.JyK r0 = (X.C61168JyK) r0
            X.KiK r8 = r0.A00
            X.7L0 r7 = r0.A01
            java.lang.String r6 = r0.A02
            java.lang.String r5 = r0.A03
            java.lang.String r1 = r0.A04
            X.0qQ.A0B(r8, r10)
            X.JyK r0 = new X.JyK
            r18 = r0
            r19 = r8
            r20 = r7
            r21 = r6
            r22 = r5
            r23 = r1
            r24 = r10
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r3.add(r0)
            goto L_0x0e1a
        L_0x0e4a:
            android.content.Context r1 = r4.A04
            r0 = 2131965390(0x7f1335ce, float:1.9567589E38)
            java.lang.String r1 = r1.getString(r0)
            goto L_0x0c57
        L_0x0e55:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0e5a:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r9 = 1
            if (r0 == 0) goto L_0x0e68
            if (r0 == r9) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0e68:
            X.02o r25 = A02(r6, r2)
            java.lang.Object r1 = r2.A02
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r0 = 0
            r12 = r1[r0]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.direct.fragment.cardgallery.api.DirectCardGalleryCollectionGridItemModel>"
            X.0qQ.A0C(r12, r0)
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            r24 = r1[r9]
            r0 = r24
            java.lang.String r0 = (java.lang.String) r0
            r24 = r0
            r0 = 2
            r23 = r1[r0]
            r0 = r23
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r23 = r0
            r0 = 3
            r22 = r1[r0]
            r0 = r22
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r22 = r0
            r0 = 4
            r21 = r1[r0]
            r0 = r21
            X.GMQ r0 = (X.GMQ) r0
            r21 = r0
            r0 = 5
            r20 = r1[r0]
            r0 = r20
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r20 = r0
            r0 = 6
            r8 = r1[r0]
            X.Nil r8 = (X.C69285Nil) r8
            r0 = 7
            r3 = r1[r0]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            int r19 = X.DbW.A04(r3, r0)
            r0 = 8
            r7 = r1[r0]
            java.lang.String r7 = (java.lang.String) r7
            r0 = 9
            r6 = r1[r0]
            java.lang.String r6 = (java.lang.String) r6
            r0 = 10
            r10 = r1[r0]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.direct.fragment.cardgallery.pendingstore.intf.CollectionResponsePendingStoreItem>"
            X.0qQ.A0C(r10, r0)
            java.util.List r10 = (java.util.List) r10
            r0 = 11
            r5 = r1[r0]
            java.lang.String r5 = (java.lang.String) r5
            r0 = 12
            r4 = r1[r0]
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r0 = 13
            r3 = r1[r0]
            r0 = 52
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r3, r0)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r0 = 14
            r0 = r1[r0]
            boolean r18 = X.JTQ.A1W(r0)
            r0 = 15
            r1 = r1[r0]
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            java.lang.Object r0 = r2.A03
            X.MuF r0 = (X.C67759MuF) r0
            java.util.ArrayList r11 = X.AnonymousClass7TG.A0r(r10)
            java.util.Iterator r17 = r10.iterator()
        L_0x0f00:
            boolean r13 = r17.hasNext()
            if (r13 == 0) goto L_0x0f46
            java.lang.Object r13 = r17.next()
            X.Jtu r13 = (X.C60936Jtu) r13
            X.0eE r15 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r14 = r0.A04
            com.instagram.user.model.User r29 = r15.A01(r14)
            r15 = 0
            X.0qQ.A0B(r13, r15)
            java.lang.String r14 = r13.A03
            r32 = r14
            X.5yB r14 = r13.A01
            r28 = r14
            java.lang.String r14 = r13.A04
            r33 = r14
            int r14 = r13.A00
            java.lang.Integer r30 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r13 = r13.A02
            r14 = r13
            r27 = 0
            X.N3F r13 = new X.N3F
            r26 = r13
            r31 = r14
            r34 = r27
            r35 = r27
            r36 = r15
            r37 = r15
            r38 = r15
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r11.add(r13)
            goto L_0x0f00
        L_0x0f46:
            java.util.ArrayList r39 = X.00k.A0S(r12, r11)
            r11 = r19
            int r40 = X.DbT.A01(r10, r11)
            if (r18 != 0) goto L_0x0f5a
            boolean r10 = X.AnonymousClass7TE.A1b(r10)
            r41 = 0
            if (r10 == 0) goto L_0x0f5c
        L_0x0f5a:
            r41 = 1
        L_0x0f5c:
            r27 = r21
            r28 = r8
            r29 = r23
            r30 = r22
            r31 = r20
            r32 = r4
            r33 = r1
            r34 = r24
            r35 = r5
            r36 = r7
            r37 = r6
            r38 = r3
            r26 = r0
            X.N3R r1 = r26.A04(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r0 = r25
            java.lang.Object r1 = A01(r1, r2, r0, r9)
            goto L_0x2f27
        L_0x0f82:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r1 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0f9b
            if (r0 != r4) goto L_0x2ea2
            java.lang.Object r0 = r2.A02
            X.02o r3 = X.JTO.A1H(r0, r6)
        L_0x0f92:
            r0 = 0
            r2.A02 = r0
            java.lang.Object r1 = A01(r6, r2, r3, r1)
            goto L_0x2f27
        L_0x0f9b:
            X.0eS.A00(r6)
            java.lang.Object r3 = r2.A02
            X.02o r3 = (X.02o) r3
            java.lang.Object r6 = r2.A03
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            java.lang.Object r5 = r2.A01
            X.0sG r5 = (X.0sG) r5
            r0 = 0
            r7 = r6[r0]
            r8 = r6[r4]
            r9 = r6[r1]
            r0 = 3
            r10 = r6[r0]
            r0 = 4
            r11 = r6[r0]
            r0 = 5
            r12 = r6[r0]
            r2.A02 = r3
            r2.A00 = r4
            r6 = r5
            r13 = r2
            java.lang.Object r6 = r6.invoke(r7, r8, r9, r10, r11, r12, r13)
            r0 = r16
            if (r6 != r0) goto L_0x0f92
            return r16
        L_0x0fc9:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r7 = 1
            if (r0 == 0) goto L_0x0fd7
            if (r0 == r7) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0fd7:
            X.02o r8 = A02(r6, r2)
            java.lang.Object r1 = r2.A02
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r10 = 0
            r11 = r1[r10]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.direct.fragment.cardgallery.api.DirectCardGalleryCollectionGridItemModel>"
            X.0qQ.A0C(r11, r0)
            java.util.List r11 = (java.util.List) r11
            r1 = r1[r7]
            r0 = 17
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            long r14 = X.AnonymousClass7TE.A0R(r1)
            java.util.Iterator r4 = r11.iterator()
        L_0x0ffc:
            boolean r0 = r4.hasNext()
            r9 = 0
            if (r0 == 0) goto L_0x108f
            java.lang.Object r1 = r4.next()
            r0 = r1
            X.N3F r0 = (X.N3F) r0
            java.lang.String r3 = r0.A05
            java.lang.Object r0 = r2.A03
            X.Mtk r0 = (X.C67731Mtk) r0
            java.lang.String r0 = r0.A02
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 == 0) goto L_0x0ffc
        L_0x1018:
            X.N3F r1 = (X.N3F) r1
            if (r1 == 0) goto L_0x1082
            java.lang.String r6 = r1.A05
            if (r6 == 0) goto L_0x1082
            com.instagram.user.model.User r5 = r1.A02
            java.lang.String r4 = r1.A06
            X.N37 r3 = r1.A00
            r18 = 0
            r0 = 1071877689(0x3fe38e39, float:1.7777778)
            java.lang.Float r21 = X.C51965G9l.A0q(r0)
            java.lang.Integer r1 = r1.A04
            java.lang.Object r0 = r11.get(r10)
            X.N3F r0 = (X.N3F) r0
            java.lang.String r0 = r0.A05
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 == 0) goto L_0x1049
            long r12 = java.lang.System.currentTimeMillis()
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            r29 = 1
            if (r0 <= 0) goto L_0x104b
        L_0x1049:
            r29 = 0
        L_0x104b:
            java.lang.Object r0 = r11.get(r10)
            X.N3F r0 = (X.N3F) r0
            java.lang.String r0 = r0.A05
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 == 0) goto L_0x1063
            long r11 = java.lang.System.currentTimeMillis()
            int r0 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            r30 = 1
            if (r0 <= 0) goto L_0x1065
        L_0x1063:
            r30 = 0
        L_0x1065:
            X.OuB r9 = new X.OuB
            r19 = r3
            r20 = r5
            r22 = r1
            r23 = r6
            r24 = r4
            r25 = r10
            r26 = r10
            r27 = r10
            r28 = r10
            r31 = r10
            r32 = r10
            r17 = r9
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
        L_0x1082:
            r1 = 13
            X.JwG r0 = new X.JwG
            r0.<init>((java.lang.Object) r9, (int) r1)
            java.lang.Object r1 = A01(r0, r2, r8, r7)
            goto L_0x2f27
        L_0x108f:
            r1 = r9
            goto L_0x1018
        L_0x1091:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r5 = 1
            if (r0 == 0) goto L_0x109f
            if (r0 == r5) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x109f:
            X.02o r20 = A02(r6, r2)
            java.lang.Object r8 = r2.A02
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            r0 = 0
            r7 = r8[r0]
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.prompts.dailyprompts.repository.DirectDailyPromptsResponseListRepository.LoadingState"
            X.0qQ.A0C(r7, r0)
            X.Nib r7 = (X.C69275Nib) r7
            r4 = r8[r5]
            java.lang.String r4 = (java.lang.String) r4
            r0 = 2
            r13 = r8[r0]
            com.instagram.user.model.User r13 = (com.instagram.user.model.User) r13
            r0 = 3
            r1 = r8[r0]
            r0 = 17
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            long r42 = X.AnonymousClass7TE.A0R(r1)
            r0 = 4
            r0 = r8[r0]
            boolean r10 = X.JTQ.A1W(r0)
            r0 = 5
            r3 = r8[r0]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.direct.fragment.cardgallery.api.DirectCardGalleryCollectionGridItemModel>"
            X.0qQ.A0C(r3, r0)
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r0 = r2.A03
            X.Mtw r0 = (X.C67743Mtw) r0
            com.instagram.common.session.UserSession r11 = r0.A01
            java.lang.String r6 = r11.A06
            if (r13 == 0) goto L_0x1112
            java.lang.String r1 = X.AnonymousClass3ZA.A00(r13)
        L_0x10e9:
            boolean r37 = X.0qQ.A0K(r6, r1)
            r1 = 6
            r6 = r8[r1]
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.direct.fragment.cardgallery.pendingstore.intf.CollectionResponsePendingStoreItem>"
            X.0qQ.A0C(r6, r1)
            java.util.List r6 = (java.util.List) r6
            long r8 = java.lang.System.currentTimeMillis()
            int r1 = (r42 > r8 ? 1 : (r42 == r8 ? 0 : -1))
            boolean r19 = X.Dba.A1U(r1)
            int r8 = r7.ordinal()
            if (r8 == r5) goto L_0x1288
            r1 = 2
            if (r8 == r1) goto L_0x1114
            r1 = 0
            if (r8 == r1) goto L_0x1114
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x1112:
            r1 = 0
            goto L_0x10e9
        L_0x1114:
            if (r4 != 0) goto L_0x1118
            java.lang.String r4 = ""
        L_0x1118:
            boolean r1 = X.AnonymousClass7TE.A1b(r6)
            if (r1 != 0) goto L_0x1122
            r44 = 0
            if (r10 == 0) goto L_0x1124
        L_0x1122:
            r44 = 1
        L_0x1124:
            X.Nib r1 = X.C69275Nib.PAGINATING
            boolean r46 = X.AnonymousClass7TF.A1W(r7, r1)
            java.util.ArrayList r18 = X.AnonymousClass7TG.A0r(r6)
            java.util.Iterator r15 = r6.iterator()
        L_0x1132:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x11aa
            java.lang.Object r7 = r15.next()
            X.Jtu r7 = (X.C60936Jtu) r7
            com.instagram.user.model.User r24 = X.AnonymousClass7TF.A0Q(r11)
            com.instagram.common.session.UserSession r1 = r0.A01
            com.instagram.pendingmedia.store.PendingMediaStore r8 = X.28K.A00(r1)
            X.5yB r1 = r7.A01
            r6 = 0
            if (r1 == 0) goto L_0x11a8
            java.lang.String r1 = r1.A06
        L_0x114f:
            X.3Q2 r1 = r8.A03(r1)
            java.lang.String r14 = r7.A03
            java.lang.String r12 = r7.A04
            r23 = 0
            if (r1 == 0) goto L_0x11a5
            java.lang.String r6 = r1.A33
            com.instagram.common.typedurl.SimpleImageUrl r9 = X.JTQ.A0G(r6)
            int r8 = r1.A0H
            int r6 = r1.A0G
            r1 = 9
            X.Jw3 r10 = new X.Jw3
            r10.<init>((java.lang.Object) r9, (int) r6, (int) r8, (int) r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
        L_0x1174:
            float r1 = X.C70138Nxs.A00(r1, r6)
            java.lang.Float r25 = java.lang.Float.valueOf(r1)
            int r1 = r7.A00
            java.lang.Integer r26 = java.lang.Integer.valueOf(r1)
            r29 = 0
            X.OuB r1 = new X.OuB
            r22 = r10
            r27 = r14
            r28 = r12
            r30 = r29
            r31 = r29
            r32 = r29
            r33 = r29
            r34 = r29
            r35 = r5
            r36 = r29
            r21 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r6 = r18
            r6.add(r1)
            goto L_0x1132
        L_0x11a5:
            r10 = r6
            r1 = r6
            goto L_0x1174
        L_0x11a8:
            r1 = r6
            goto L_0x114f
        L_0x11aa:
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r17 = r3.iterator()
        L_0x11b2:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x1274
            java.lang.Object r3 = r17.next()
            X.N3F r3 = (X.N3F) r3
            com.instagram.common.session.UserSession r1 = r0.A01
            com.instagram.pendingmedia.store.PendingMediaStore r6 = X.28K.A00(r1)
            X.5yB r1 = r3.A01
            r9 = 0
            if (r1 == 0) goto L_0x1271
            java.lang.String r1 = r1.A06
        L_0x11cb:
            X.3Q2 r8 = r6.A03(r1)
            java.lang.String r15 = r3.A05
            if (r15 == 0) goto L_0x11b2
            com.instagram.user.model.User r1 = r3.A02
            r22 = r1
            java.lang.String r1 = r3.A06
            r21 = r1
            X.N37 r1 = r3.A00
            r40 = 0
            if (r8 == 0) goto L_0x126f
            java.lang.String r6 = r8.A33
            com.instagram.common.typedurl.SimpleImageUrl r11 = X.JTQ.A0G(r6)
            int r10 = r8.A0H
            int r7 = r8.A0G
            r6 = 9
            X.Jw3 r14 = new X.Jw3
            r14.<init>((java.lang.Object) r11, (int) r7, (int) r10, (int) r6)
        L_0x11f2:
            if (r1 == 0) goto L_0x11fc
            X.N2w r6 = r1.A00
            if (r6 == 0) goto L_0x11fc
            java.lang.Integer r7 = r6.A02
            if (r7 != 0) goto L_0x1206
        L_0x11fc:
            if (r8 == 0) goto L_0x126d
            int r6 = r8.A0H
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
        L_0x1204:
            if (r1 == 0) goto L_0x1264
        L_0x1206:
            X.N2w r6 = r1.A00
            if (r6 == 0) goto L_0x1264
            java.lang.Integer r6 = r6.A00
            if (r6 == 0) goto L_0x1264
            r9 = r6
        L_0x120f:
            float r6 = X.C70138Nxs.A00(r7, r9)
            java.lang.Float r30 = java.lang.Float.valueOf(r6)
            java.lang.Integer r7 = r3.A04
            java.util.HashMap r6 = r3.A08
            if (r6 == 0) goto L_0x1261
            java.util.Collection r6 = r6.values()
            if (r6 == 0) goto L_0x1261
            int r34 = X.00k.A02(r6)
        L_0x1227:
            r35 = r19 ^ 1
            java.lang.String r6 = r3.A07
            boolean r36 = X.AnonymousClass7TF.A1V(r6)
            if (r37 != 0) goto L_0x1239
            if (r19 == 0) goto L_0x1239
            boolean r6 = r3.A0B
            r38 = 1
            if (r6 != 0) goto L_0x123d
        L_0x1239:
            r38 = 0
            if (r19 == 0) goto L_0x1243
        L_0x123d:
            boolean r6 = r3.A0A
            r39 = 1
            if (r6 != 0) goto L_0x1245
        L_0x1243:
            r39 = 0
        L_0x1245:
            boolean r6 = r3.A09
            X.OuB r3 = new X.OuB
            r27 = r14
            r28 = r1
            r29 = r22
            r31 = r7
            r32 = r15
            r33 = r21
            r41 = r6
            r26 = r3
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r12.add(r3)
            goto L_0x11b2
        L_0x1261:
            r34 = 0
            goto L_0x1227
        L_0x1264:
            if (r8 == 0) goto L_0x120f
            int r6 = r8.A0G
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            goto L_0x120f
        L_0x126d:
            r7 = r9
            goto L_0x1204
        L_0x126f:
            r14 = r9
            goto L_0x11f2
        L_0x1271:
            r1 = r9
            goto L_0x11cb
        L_0x1274:
            r0 = r18
            java.util.ArrayList r41 = X.00k.A0S(r12, r0)
            X.N8g r1 = new X.N8g
            r38 = r1
            r39 = r13
            r40 = r4
            r45 = r37
            r38.<init>(r39, r40, r41, r42, r44, r45, r46)
            goto L_0x128a
        L_0x1288:
            X.PDf r1 = X.C72626PDf.A00
        L_0x128a:
            r0 = r20
            java.lang.Object r1 = A01(r1, r2, r0, r5)
            goto L_0x2f27
        L_0x1292:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r14 = 1
            if (r0 == 0) goto L_0x12a0
            if (r0 == r14) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x12a0:
            X.02o r17 = A02(r6, r2)
            java.lang.Object r5 = r2.A02
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            java.lang.Object r3 = r2.A03
            com.instagram.fanclub.consideration.FanClubConsiderationViewModel r3 = (com.instagram.fanclub.consideration.FanClubConsiderationViewModel) r3
            r0 = 0
            r22 = r5[r0]
            r0 = r22
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r22 = r0
            r1 = r5[r14]
            X.L4W r1 = (X.L4W) r1
            r0 = 2
            r21 = r5[r0]
            r0 = 21
            java.lang.String r4 = X.Pxd.A00(r0)
            r0 = r21
            X.0qQ.A0C(r0, r4)
            r0 = r21
            java.util.Map r0 = (java.util.Map) r0
            r21 = r0
            r19 = 3
            r0 = r5[r19]
            boolean r9 = X.JTQ.A1W(r0)
            r20 = 4
            r4 = r5[r20]
            java.lang.Number r4 = (java.lang.Number) r4
            r6 = 5
            r23 = r5[r6]
            java.lang.String r7 = "null cannot be cast to non-null type com.instagram.fanclub.consideration.ConsiderationPurchaseState"
            r0 = r23
            X.0qQ.A0C(r0, r7)
            r0 = r23
            X.EVA r0 = (X.EVA) r0
            r23 = r0
            r7 = 6
            r25 = r5[r7]
            java.lang.String r8 = "null cannot be cast to non-null type com.instagram.fanclub.consideration.ConsiderationDialogType"
            r0 = r25
            X.0qQ.A0C(r0, r8)
            r0 = r25
            X.EVK r0 = (X.EVK) r0
            r25 = r0
            r32 = 7
            r18 = r5[r32]
            java.lang.String r5 = "null cannot be cast to non-null type com.instagram.fanclub.consideration.FanClubConsiderationViewModel.FanClubWelcomeVideoState"
            r0 = r18
            X.0qQ.A0C(r0, r5)
            r0 = r18
            X.MQZ r0 = (X.MQZ) r0
            r18 = r0
            if (r4 == 0) goto L_0x131e
            int r0 = r4.intValue()
        L_0x1312:
            X.EKL r1 = com.instagram.fanclub.consideration.FanClubConsiderationViewModel.A02(r3, r0)
        L_0x1316:
            r0 = r17
            java.lang.Object r1 = A01(r1, r2, r0, r14)
            goto L_0x2f27
        L_0x131e:
            if (r9 == 0) goto L_0x1323
            X.KRS r1 = X.KRS.A00
            goto L_0x1316
        L_0x1323:
            if (r22 == 0) goto L_0x1b8d
            if (r1 == 0) goto L_0x1b86
            boolean r0 = r1 instanceof X.KRT
            if (r0 == 0) goto L_0x1546
            X.KRT r1 = (X.KRT) r1
            X.C7i r5 = r1.A00
            android.app.Application r0 = r3.A01
            android.content.Context r0 = r0.getApplicationContext()
            boolean r0 = X.FGM.A05(r0)
            if (r0 != 0) goto L_0x1b5f
            X.C7h r4 = r5.A0E()
            if (r4 == 0) goto L_0x1b5c
            java.lang.String r1 = "sku"
            r0 = r19
            java.lang.String r29 = r4.getOptionalStringField(r0, r1)
            if (r29 == 0) goto L_0x1b5c
            X.C7h r9 = r5.A0E()
            r8 = 0
            if (r9 == 0) goto L_0x14ea
            java.lang.Class<X.Bjs> r4 = X.C42846Bjs.class
            java.lang.String r1 = "custom_benefits_payload"
            r0 = -1567080926(0xffffffffa2983e22, float:-4.126547E-18)
            X.3lr r1 = r9.getOptionalTreeField(r6, r1, r4, r0)
            if (r1 == 0) goto L_0x14ea
            r0 = 155(0x9b, float:2.17E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r4 = r1.getCoercedBooleanField(r8, r0)
            if (r4 == 0) goto L_0x137b
            com.instagram.common.session.UserSession r10 = r3.A03
            X.0Tu r9 = X.0Tu.A06
            r0 = 36320850500133776(0x81099f00002390, double:3.03279033638598E-306)
            boolean r0 = X.182.A06(r9, r10, r0)
            r12 = 1
            if (r0 != 0) goto L_0x137c
        L_0x137b:
            r12 = 0
        L_0x137c:
            X.C7h r10 = r5.A0E()
            r13 = 0
            if (r10 == 0) goto L_0x139e
            java.lang.Class<X.Bjs> r9 = X.C42846Bjs.class
            java.lang.String r1 = "custom_benefits_payload"
            r0 = -1567080926(0xffffffffa2983e22, float:-4.126547E-18)
            X.3lr r11 = r10.getOptionalTreeField(r6, r1, r9, r0)
            if (r11 == 0) goto L_0x139e
            java.lang.Class<X.Bjr> r10 = X.C42845Bjr.class
            r9 = 2
            java.lang.String r1 = "custom_benefits_data"
            r0 = -33880756(0xfffffffffdfb054c, float:-4.1707966E37)
            com.google.common.collect.ImmutableList r0 = r11.getRequiredCompactedTreeListField(r9, r1, r10, r0)
            if (r0 != 0) goto L_0x13a0
        L_0x139e:
            X.0sn r0 = X.0sn.A00
        L_0x13a0:
            java.util.List r15 = com.instagram.fanclub.consideration.FanClubConsiderationViewModel.A09(r0, r12)
            java.util.List r35 = com.instagram.fanclub.consideration.FanClubConsiderationViewModel.A08(r15)
            boolean r10 = r3.A0M
            if (r10 != 0) goto L_0x13d4
            java.lang.Class<X.Bjq> r11 = X.C42844Bjq.class
            java.lang.String r9 = "content_preview_media"
            r1 = -296981529(0xffffffffee4c6be7, float:-1.5816347E28)
            r0 = r20
            com.google.common.collect.ImmutableList r0 = r5.getOptionalCompactedTreeListField(r0, r9, r11, r1)
            if (r0 == 0) goto L_0x13c3
            int r1 = r0.size()
            r0 = r19
            if (r1 >= r0) goto L_0x13d4
        L_0x13c3:
            com.instagram.common.session.UserSession r11 = r3.A03
            X.0Tu r9 = X.0Tu.A05
            r0 = 36320682996409107(0x81097800002313, double:3.032684406356016E-306)
            boolean r0 = X.182.A06(r9, r11, r0)
            r43 = 1
            if (r0 != 0) goto L_0x13d6
        L_0x13d4:
            r43 = 0
        L_0x13d6:
            java.lang.String r0 = "strong_id__"
            java.lang.String r30 = r5.getOptionalStringField(r8, r0)
            if (r30 == 0) goto L_0x1b56
            X.C7h r11 = r5.A0E()
            if (r11 == 0) goto L_0x1b59
            X.KiX r9 = X.C62600KiX.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r0 = 598(0x256, float:8.38E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = r20
            com.google.common.collect.ImmutableList r1 = r11.getOptionalCompactedEnumListField(r0, r1, r9)
            if (r1 == 0) goto L_0x1b59
            r0 = r22
            java.util.List r34 = com.instagram.fanclub.consideration.FanClubConsiderationViewModel.A07(r3, r0, r1, r4)
            X.C7h r0 = r5.A0E()
            if (r0 == 0) goto L_0x1543
            X.Bju r0 = r0.A0E()
            if (r0 == 0) goto L_0x1543
            java.lang.String r1 = "count"
            int r11 = r0.getCoercedIntField(r8, r1)
            X.C7h r0 = r5.A0E()
            if (r0 == 0) goto L_0x141c
            X.Bju r0 = r0.A0E()
            if (r0 == 0) goto L_0x141c
            int r8 = r0.getCoercedIntField(r8, r1)
        L_0x141c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r27 = 0
            r0 = r23
            X.Jw5 r22 = com.instagram.fanclub.consideration.FanClubConsiderationViewModel.A00(r0, r3, r13, r13, r1)
            X.C7h r8 = r5.A0E()
            if (r8 == 0) goto L_0x1441
            java.lang.Class<X.Bjt> r9 = X.C42847Bjt.class
            java.lang.String r1 = "early_pricing"
            r0 = 781114396(0x2e8edc1c, float:6.496512E-11)
            X.3lr r0 = r8.getOptionalTreeField(r7, r1, r9, r0)
            if (r0 == 0) goto L_0x1441
            java.lang.String r1 = "original_sku"
            java.lang.String r27 = r0.A07(r1)
        L_0x1441:
            X.C7h r8 = r5.A0E()
            if (r8 == 0) goto L_0x14e6
            java.lang.Class<X.Bjt> r9 = X.C42847Bjt.class
            java.lang.String r1 = "early_pricing"
            r0 = 781114396(0x2e8edc1c, float:6.496512E-11)
            X.3lr r1 = r8.getOptionalTreeField(r7, r1, r9, r0)
            if (r1 == 0) goto L_0x14e6
            r0 = 763(0x2fb, float:1.069E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.Integer r24 = X.C41846B3n.A0g(r1, r0, r14)
        L_0x145e:
            r23 = r3
            r25 = r13
            r26 = r29
            r28 = r21
            X.4Yx r24 = com.instagram.fanclub.consideration.FanClubConsiderationViewModel.A01(r23, r24, r25, r26, r27, r28)
            X.C7h r8 = r5.A0E()
            if (r8 == 0) goto L_0x14e3
            java.lang.Class<X.Bjs> r7 = X.C42846Bjs.class
            java.lang.String r1 = "custom_benefits_payload"
            r0 = -1567080926(0xffffffffa2983e22, float:-4.126547E-18)
            X.3lr r1 = r8.getOptionalTreeField(r6, r1, r7, r0)
            if (r1 == 0) goto L_0x14e3
            java.lang.String r0 = "custom_benefits"
            com.google.common.collect.ImmutableList r38 = r1.getRequiredCompactedStringListField(r14, r0)
            if (r38 == 0) goto L_0x14e3
        L_0x1485:
            if (r4 != 0) goto L_0x1489
            X.0sn r38 = X.0sn.A00
        L_0x1489:
            r40 = r10 ^ 1
            boolean r41 = com.instagram.fanclub.consideration.FanClubConsiderationViewModel.A0C(r3, r13)
            if (r43 == 0) goto L_0x150f
            java.lang.Class<X.Bjq> r4 = X.C42844Bjq.class
            java.lang.String r3 = "content_preview_media"
            r1 = -296981529(0xffffffffee4c6be7, float:-1.5816347E28)
            r0 = r20
            com.google.common.collect.ImmutableList r0 = r5.getOptionalCompactedTreeListField(r0, r3, r4, r1)
            int r6 = X.C51971G9r.A0H(r0)
            r0 = r19
            int r6 = java.lang.Math.min(r6, r0)
            r0 = r20
            com.google.common.collect.ImmutableList r0 = r5.getOptionalCompactedTreeListField(r0, r3, r4, r1)
            if (r0 == 0) goto L_0x14ed
            java.util.List r1 = X.00k.A0d(r0, r6)
            if (r1 == 0) goto L_0x14ed
            java.util.ArrayList r0 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r5 = r1.iterator()
        L_0x14be:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x14ef
            X.3lr r3 = X.C41845B3m.A0V(r5)
            java.lang.String r1 = "instagram_media_id"
            java.lang.String r4 = r3.A09(r1)
            if (r4 == 0) goto L_0x1b63
            java.lang.String r1 = "display_url"
            java.lang.String r1 = r3.getOptionalStringField(r14, r1)
            com.instagram.common.typedurl.SimpleImageUrl r3 = X.DbS.A0V(r1)
            X.JwF r1 = new X.JwF
            r1.<init>((com.instagram.common.typedurl.ImageUrl) r3, (java.lang.String) r4)
            r0.add(r1)
            goto L_0x14be
        L_0x14e3:
            X.0sn r38 = X.0sn.A00
            goto L_0x1485
        L_0x14e6:
            r24 = r13
            goto L_0x145e
        L_0x14ea:
            r4 = 0
            goto L_0x137b
        L_0x14ed:
            X.0sn r0 = X.0sn.A00
        L_0x14ef:
            java.util.ArrayList r0 = X.00k.A0U(r0)
            X.MKv r1 = X.C66260MKv.A00
            X.2U8 r1 = X.2YX.A01(r1)
            int r19 = r19 - r6
            r3 = r19
            X.2U7 r1 = X.C242173Sx.A0C(r1, r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x1505:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x1511
            X.JTT.A1U(r0, r1)
            goto L_0x1505
        L_0x150f:
            X.0sn r0 = X.0sn.A00
        L_0x1511:
            java.lang.Integer r28 = com.instagram.fanclub.consideration.FanClubConsiderationViewModel.A03(r15, r12)
            java.lang.Integer r27 = java.lang.Integer.valueOf(r11)
            X.0sn r37 = X.0sn.A00
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.N4R r3 = new X.N4R
            r3.<init>((java.lang.Integer) r1)
            X.LrA r26 = X.C65312LrA.A00
            r42 = 0
            X.EKM r1 = new X.EKM
            r21 = r3
            r23 = r13
            r31 = r13
            r32 = r13
            r33 = r13
            r36 = r0
            r39 = r37
            r44 = r42
            r45 = r42
            r46 = r42
            r20 = r1
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            goto L_0x1316
        L_0x1543:
            r0 = 7
            goto L_0x1312
        L_0x1546:
            boolean r0 = r1 instanceof X.KRU
            if (r0 == 0) goto L_0x1b81
            X.KRU r1 = (X.KRU) r1
            X.C7m r5 = r1.A00
            android.app.Application r0 = r3.A01
            android.content.Context r0 = r0.getApplicationContext()
            boolean r0 = X.FGM.A05(r0)
            if (r0 != 0) goto L_0x1b5f
            java.lang.Integer r1 = r3.A00
            java.lang.Integer r31 = X.AnonymousClass05K.A00
            r0 = r31
            if (r1 != r0) goto L_0x1580
            X.C7l r1 = r5.A0E()
            if (r1 == 0) goto L_0x1580
            java.lang.String r0 = "purchased_sku"
            java.lang.String r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x1580
            com.instagram.common.session.UserSession r8 = r3.A03
            X.0Tu r4 = X.0Tu.A05
            r0 = 36319617844518437(0x81088000001e25, double:3.032010800011334E-306)
            boolean r1 = X.182.A06(r4, r8, r0)
            r0 = 1
            if (r1 != 0) goto L_0x1581
        L_0x1580:
            r0 = 0
        L_0x1581:
            X.C7l r4 = r5.A0E()
            if (r0 == 0) goto L_0x16e3
            if (r4 == 0) goto L_0x1b5c
            r1 = 2
            java.lang.String r0 = "purchased_sku"
        L_0x158c:
            java.lang.String r38 = r4.getOptionalStringField(r1, r0)
            if (r38 == 0) goto L_0x1b5c
            com.instagram.common.session.UserSession r0 = r3.A03
            r46 = r0
            r8 = 0
            X.0Tu r15 = X.0Tu.A05
            r0 = 36317736649168371(0x8106ca000515f3, double:3.0308211244969865E-306)
            r4 = r46
            boolean r0 = X.182.A06(r15, r4, r0)
            if (r0 != 0) goto L_0x16df
            X.C7l r0 = r5.A0E()
            if (r0 == 0) goto L_0x16df
            X.Bjz r1 = r0.A0E()
            if (r1 == 0) goto L_0x16df
            r0 = 155(0x9b, float:2.17E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r27 = r1.getCoercedBooleanField(r8, r0)
        L_0x15bc:
            X.C7l r0 = r5.A0E()
            if (r0 == 0) goto L_0x1613
            X.Bjz r1 = r0.A0E()
            if (r1 == 0) goto L_0x1613
            r0 = 155(0x9b, float:2.17E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getCoercedBooleanField(r8, r0)
            if (r0 == 0) goto L_0x1613
            X.C7l r0 = r5.A0E()
            if (r0 == 0) goto L_0x1613
            X.Bjz r9 = r0.A0E()
            if (r9 == 0) goto L_0x1613
            java.lang.Class<X.Bjy> r8 = X.C42852Bjy.class
            r4 = 2
            java.lang.String r1 = "custom_benefits_data"
            r0 = 179516880(0xab335d0, float:1.7257315E-32)
            com.google.common.collect.ImmutableList r0 = r9.getRequiredCompactedTreeListField(r4, r1, r8, r0)
            if (r0 == 0) goto L_0x1613
            java.lang.Object r1 = X.00k.A0J(r0)
            X.3lr r1 = (X.C250663lr) r1
            if (r1 == 0) goto L_0x1613
            java.lang.String r0 = "description"
            java.lang.String r0 = r1.getOptionalStringField(r14, r0)
            if (r0 == 0) goto L_0x1613
            int r0 = r0.length()
            if (r0 == 0) goto L_0x1613
            r0 = 36320850500199313(0x81099f00012391, double:3.032790336427426E-306)
            r4 = r46
            boolean r0 = X.182.A06(r15, r4, r0)
            r28 = 1
            if (r0 != 0) goto L_0x1615
        L_0x1613:
            r28 = 0
        L_0x1615:
            X.C7l r0 = r5.A0E()
            if (r0 == 0) goto L_0x162f
            X.Bjz r9 = r0.A0E()
            if (r9 == 0) goto L_0x162f
            java.lang.Class<X.Bjy> r8 = X.C42852Bjy.class
            r4 = 2
            java.lang.String r1 = "custom_benefits_data"
            r0 = 179516880(0xab335d0, float:1.7257315E-32)
            com.google.common.collect.ImmutableList r1 = r9.getRequiredCompactedTreeListField(r4, r1, r8, r0)
            if (r1 != 0) goto L_0x1631
        L_0x162f:
            X.0sn r1 = X.0sn.A00
        L_0x1631:
            r0 = r28
            java.util.List r30 = com.instagram.fanclub.consideration.FanClubConsiderationViewModel.A09(r1, r0)
            java.util.List r44 = com.instagram.fanclub.consideration.FanClubConsiderationViewModel.A08(r30)
            X.C7l r4 = r5.A0E()
            if (r4 == 0) goto L_0x165e
            r1 = 10
            r0 = 3431(0xd67, float:4.808E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r4.getCoercedBooleanField(r1, r0)
            if (r0 != r14) goto L_0x165e
            r0 = 36325961511286164(0x810e4500013594, double:3.03602256041914E-306)
            r4 = r46
            boolean r0 = X.182.A06(r15, r4, r0)
            r29 = 1
            if (r0 != 0) goto L_0x1660
        L_0x165e:
            r29 = 0
        L_0x1660:
            java.lang.Class<X.Bjw> r11 = X.C42850Bjw.class
            r0 = 3075(0xc03, float:4.309E-42)
            java.lang.String r10 = X.AnonymousClass000.A00(r0)
            r0 = -1987990321(0xffffffff8981accf, float:-3.121813E-33)
            com.google.common.collect.ImmutableList r0 = X.C41845B3m.A0X(r5, r11, r10, r7, r0)
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != 0) goto L_0x1686
            java.lang.Class<X.Bjv> r4 = X.C42849Bjv.class
            java.lang.String r1 = "content_preview_media"
            r0 = -1752049598(0xffffffff9791d842, float:-9.424997E-25)
            com.google.common.collect.ImmutableList r0 = X.C41845B3m.A0X(r5, r4, r1, r6, r0)
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x1726
        L_0x1686:
            java.lang.Integer r1 = r3.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x1726
            r0 = 36327825527028448(0x810ff700003ae0, double:3.0372013714803496E-306)
            r4 = r46
            boolean r0 = X.182.A06(r15, r4, r0)
            if (r0 == 0) goto L_0x1726
            java.lang.Class<X.Bjv> r4 = X.C42849Bjv.class
            java.lang.String r1 = "content_preview_media"
            r0 = -1752049598(0xffffffff9791d842, float:-9.424997E-25)
            com.google.common.collect.ImmutableList r0 = X.C41845B3m.A0X(r5, r4, r1, r6, r0)
            java.util.ArrayList r13 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r24 = r0.iterator()
        L_0x16ac:
            boolean r0 = r24.hasNext()
            if (r0 == 0) goto L_0x16ea
            X.3lr r12 = X.C41845B3m.A0V(r24)
            java.lang.String r0 = "display_url"
            java.lang.String r0 = r12.getOptionalStringField(r14, r0)
            com.instagram.common.typedurl.SimpleImageUrl r9 = X.DbS.A0V(r0)
            java.lang.String r0 = "instagram_media_id"
            java.lang.String r8 = r12.A09(r0)
            X.Uyk r4 = X.C16648Uyk.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r0 = 309(0x135, float:4.33E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = r19
            java.lang.Enum r1 = r12.getOptionalEnumField(r0, r1, r4)
            X.Uyk r1 = (X.C16648Uyk) r1
            X.Dta r0 = new X.Dta
            r0.<init>(r9, r1, r8)
            r13.add(r0)
            goto L_0x16ac
        L_0x16df:
            r27 = 0
            goto L_0x15bc
        L_0x16e3:
            if (r4 == 0) goto L_0x1b5c
            r1 = 1
            java.lang.String r0 = "sku"
            goto L_0x158c
        L_0x16ea:
            r0 = -1987990321(0xffffffff8981accf, float:-3.121813E-33)
            com.google.common.collect.ImmutableList r0 = X.C41845B3m.A0X(r5, r11, r10, r7, r0)
            java.util.ArrayList r9 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r10 = r0.iterator()
        L_0x16f9:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x1721
            X.3lr r8 = X.C41845B3m.A0V(r10)
            java.lang.String r0 = "display_url"
            java.lang.String r0 = r8.A07(r0)
            com.instagram.common.typedurl.SimpleImageUrl r7 = X.DbS.A0V(r0)
            r4 = 0
            X.Uyk r1 = X.C16648Uyk.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "media_type"
            java.lang.Enum r1 = r8.getOptionalEnumField(r14, r0, r1)
            X.Uyk r1 = (X.C16648Uyk) r1
            X.Dta r0 = new X.Dta
            r0.<init>(r7, r1, r4)
            r9.add(r0)
            goto L_0x16f9
        L_0x1721:
            java.util.ArrayList r48 = X.00k.A0S(r9, r13)
            goto L_0x1728
        L_0x1726:
            X.0sn r48 = X.0sn.A00
        L_0x1728:
            r11 = 8
            r0 = 3212(0xc8c, float:4.501E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r5.getCoercedBooleanField(r11, r0)
            if (r0 == 0) goto L_0x1745
            r0 = 36327825527028448(0x810ff700003ae0, double:3.0372013714803496E-306)
            r4 = r46
            boolean r0 = X.182.A06(r15, r4, r0)
            r55 = 1
            if (r0 != 0) goto L_0x1747
        L_0x1745:
            r55 = 0
        L_0x1747:
            X.C7l r4 = r5.A0E()
            if (r4 == 0) goto L_0x1b59
            X.KiX r1 = X.C62600KiX.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r0 = 598(0x256, float:8.38E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            com.google.common.collect.ImmutableList r4 = r4.getRequiredCompactedEnumListField(r6, r0, r1)
            if (r4 == 0) goto L_0x1b59
            r1 = r22
            r0 = r27
            java.util.List r43 = com.instagram.fanclub.consideration.FanClubConsiderationViewModel.A07(r3, r1, r4, r0)
            java.lang.String r0 = "name"
            java.lang.String r40 = r5.getOptionalStringField(r14, r0)
            X.C7l r1 = r5.A0E()
            if (r1 == 0) goto L_0x17b8
            java.lang.String r0 = "tier_id"
            java.lang.String r41 = r1.A0A(r0)
        L_0x1775:
            r4 = 0
            java.lang.String r10 = "strong_id__"
            java.lang.String r39 = r5.getOptionalStringField(r4, r10)
            if (r39 == 0) goto L_0x1b56
            java.lang.Class<X.Bjv> r7 = X.C42849Bjv.class
            java.lang.String r1 = "content_preview_media"
            r0 = -1752049598(0xffffffff9791d842, float:-9.424997E-25)
            com.google.common.collect.ImmutableList r0 = X.C41845B3m.A0X(r5, r7, r1, r6, r0)
            r26 = 10
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r8 = r0.iterator()
        L_0x1793:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x17bb
            X.3lr r1 = X.C41845B3m.A0V(r8)
            java.lang.String r0 = "instagram_media_id"
            java.lang.String r6 = r1.A09(r0)
            if (r6 == 0) goto L_0x1b68
            java.lang.String r0 = "display_url"
            java.lang.String r0 = r1.getOptionalStringField(r14, r0)
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.DbS.A0V(r0)
            X.JwF r0 = new X.JwF
            r0.<init>((com.instagram.common.typedurl.ImageUrl) r1, (java.lang.String) r6)
            r7.add(r0)
            goto L_0x1793
        L_0x17b8:
            r41 = 0
            goto L_0x1775
        L_0x17bb:
            r0 = r19
            java.util.List r45 = X.00k.A0d(r7, r0)
            java.lang.Class<X.Bk3> r7 = X.Bk3.class
            r0 = 4019(0xfb3, float:5.632E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r0)
            r1 = -606884441(0xffffffffdbd3ada7, float:-1.19164306E17)
            r0 = r20
            com.google.common.collect.ImmutableList r0 = X.C41845B3m.A0X(r5, r7, r6, r0, r1)
            java.util.ArrayList r24 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r13 = r0.iterator()
        L_0x17da:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x1818
            X.3lr r0 = X.C41845B3m.A0V(r13)
            java.lang.String r7 = r0.getOptionalStringField(r4, r10)
            java.lang.String r12 = "Required value was null."
            if (r7 == 0) goto L_0x1b77
            java.lang.String r1 = X.AnonymousClass9NF.A00()
            java.lang.String r6 = r0.getOptionalStringField(r14, r1)
            if (r6 == 0) goto L_0x1b72
            java.lang.Class<X.Bk2> r9 = X.Bk2.class
            java.lang.String r8 = "profile_picture"
            r1 = 1961335470(0x74e79aae, float:1.4679661E32)
            X.3lr r0 = r0.A04(r9, r8, r1)
            if (r0 == 0) goto L_0x1b6d
            java.lang.String r1 = "uri"
            java.lang.String r1 = r0.getOptionalStringField(r4, r1)
            if (r1 == 0) goto L_0x1b6d
            r8 = 15
            X.Jvb r0 = new X.Jvb
            r0.<init>(r7, r6, r1, r8)
            r1 = r24
            r1.add(r0)
            goto L_0x17da
        L_0x1818:
            X.C7l r6 = r5.A0E()
            if (r6 == 0) goto L_0x1b53
            r1 = 9
            java.lang.String r0 = "is_waitlisted"
            java.lang.Boolean r1 = X.C41846B3n.A0d(r6, r0, r1)
        L_0x1826:
            r6 = 36322598551890213(0x810b3600012925, double:3.03389581135559E-306)
            r0 = r46
            boolean r8 = X.182.A06(r15, r0, r6)
            r6 = 36322598551824676(0x810b3600002924, double:3.0338958113141444E-306)
            boolean r6 = X.182.A06(r15, r0, r6)
            java.lang.Integer r0 = r3.A00
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            r10 = 2
            r13 = 0
            if (r0 != r9) goto L_0x1b4a
            boolean r0 = X.AnonymousClass7TF.A1Y(r1, r14)
            if (r0 == 0) goto L_0x1b1f
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
            r0 = 2131961960(0x7f132868, float:1.9560632E38)
        L_0x184d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 22
            X.N4R r12 = new X.N4R
            r12.<init>((java.lang.Integer) r6, (java.lang.Integer) r1, (int) r0)
        L_0x1858:
            X.C7l r6 = r5.A0E()
            if (r6 == 0) goto L_0x1b1b
            java.lang.Class<X.Bk0> r8 = X.Bk0.class
            java.lang.String r7 = "early_pricing"
            r1 = 212732223(0xcae093f, float:2.681451E-31)
            r0 = r32
            X.3lr r1 = r6.getOptionalTreeField(r0, r7, r8, r1)
            if (r1 == 0) goto L_0x1b1b
            java.lang.String r0 = "original_sku"
            java.lang.String r35 = r1.getOptionalStringField(r4, r0)
        L_0x1873:
            X.C7l r1 = r5.A0E()
            if (r1 == 0) goto L_0x1b17
            java.lang.Class<X.Bk0> r8 = X.Bk0.class
            java.lang.String r7 = "early_pricing"
            r6 = 212732223(0xcae093f, float:2.681451E-31)
            r0 = r32
            X.3lr r1 = r1.getOptionalTreeField(r0, r7, r8, r6)
            if (r1 == 0) goto L_0x1b17
            r0 = 763(0x2fb, float:1.069E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.Integer r32 = X.C41846B3n.A0g(r1, r0, r14)
        L_0x1892:
            X.C7l r0 = r5.A0E()
            if (r0 == 0) goto L_0x1b13
            java.lang.Class<X.Bk1> r7 = X.Bk1.class
            java.lang.String r6 = "members"
            r1 = -1307878652(0xffffffffb20b5b04, float:-8.111559E-9)
            X.3lr r0 = r0.getOptionalTreeField(r11, r6, r7, r1)
            if (r0 == 0) goto L_0x1b13
            java.lang.String r1 = "count"
            java.lang.Integer r33 = X.C41846B3n.A0g(r0, r1, r4)
        L_0x18ab:
            r31 = r3
            r34 = r38
            r36 = r21
            X.4Yx r33 = com.instagram.fanclub.consideration.FanClubConsiderationViewModel.A01(r31, r32, r33, r34, r35, r36)
            X.C7l r1 = r5.A0E()
            if (r1 == 0) goto L_0x1b10
            r6 = 9
            java.lang.String r0 = "is_waitlisted"
            java.lang.Boolean r6 = X.C41846B3n.A0d(r1, r0, r6)
        L_0x18c3:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r29)
            r1 = r23
            X.Jw5 r31 = com.instagram.fanclub.consideration.FanClubConsiderationViewModel.A00(r1, r3, r6, r7, r13)
            int r1 = r25.ordinal()
            if (r1 == r4) goto L_0x1b0c
            if (r1 == r14) goto L_0x1ae2
            if (r1 == r10) goto L_0x1ad5
            r0 = r19
            if (r1 == r0) goto L_0x1a9c
            r0 = r20
            if (r1 != r0) goto L_0x1b7c
            java.lang.String r0 = "Are you sure you want to get dogfooding entitlement?"
            X.GKw r57 = X.JUH.A00(r0)
            java.lang.String r0 = "Dogfooding entitlement should only be used for testing."
            X.GKw r58 = X.JUH.A00(r0)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 2131954722(0x7f130c22, float:1.9545951E38)
            X.GKO r61 = X.DbS.A0Q(r1, r0)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 2131956706(0x7f1313e2, float:1.9549975E38)
            X.GKO r60 = X.DbS.A0Q(r1, r0)
            X.Jvx r32 = new X.Jvx
            r56 = r32
            r59 = r13
            r62 = r25
            r63 = r11
            r56.<init>((X.C266444Yx) r57, (X.C266444Yx) r58, (X.C266444Yx) r59, (X.C266444Yx) r60, (X.C266444Yx) r61, (X.EVK) r62, (int) r63)
        L_0x190a:
            X.C7l r0 = r5.A0E()
            if (r0 == 0) goto L_0x1a98
            X.Bjz r0 = r0.A0E()
            if (r0 == 0) goto L_0x1a98
            java.lang.String r1 = "custom_benefits"
            com.google.common.collect.ImmutableList r47 = r0.getRequiredCompactedStringListField(r14, r1)
            if (r47 == 0) goto L_0x1a98
        L_0x191e:
            if (r27 != 0) goto L_0x1922
            X.0sn r47 = X.0sn.A00
        L_0x1922:
            X.C7l r0 = r5.A0E()
            if (r0 == 0) goto L_0x1a95
            r6 = 9
            java.lang.String r1 = "is_waitlisted"
            java.lang.Boolean r0 = X.C41846B3n.A0d(r0, r1, r6)
        L_0x1930:
            boolean r50 = com.instagram.fanclub.consideration.FanClubConsiderationViewModel.A0C(r3, r0)
            X.C7l r0 = r5.A0E()
            if (r0 == 0) goto L_0x1a91
            r6 = 11
            r1 = 3047(0xbe7, float:4.27E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r51 = r0.getCoercedBooleanField(r6, r1)
        L_0x1946:
            r1 = r30
            r0 = r28
            java.lang.Integer r37 = com.instagram.fanclub.consideration.FanClubConsiderationViewModel.A03(r1, r0)
            java.lang.Integer r0 = r3.A00
            if (r0 != r9) goto L_0x1961
            r6 = 36320850500264850(0x81099f00022392, double:3.032790336468872E-306)
            r0 = r46
            boolean r0 = X.182.A06(r15, r0, r6)
            r53 = 1
            if (r0 != 0) goto L_0x1963
        L_0x1961:
            r53 = 0
        L_0x1963:
            r3 = 9
            r0 = 3836(0xefc, float:5.375E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r5.getOptionalStringField(r3, r1)
            if (r0 == 0) goto L_0x1a8d
            boolean r0 = r48.isEmpty()
            if (r0 == 0) goto L_0x1a8d
            if (r55 != 0) goto L_0x1a8d
            r6 = 36320850500330387(0x81099f00032393, double:3.0327903365103176E-306)
            r0 = r46
            boolean r0 = X.182.A06(r15, r0, r6)
            if (r0 == 0) goto L_0x1a8d
            java.lang.String r42 = r5.getOptionalStringField(r3, r1)
        L_0x198a:
            r0 = 3221(0xc95, float:4.514E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r54 = r5.hasFieldValue(r0)
            r6 = 36329144081989461(0x81112a00003f55, double:3.038035230947089E-306)
            r0 = r46
            boolean r0 = X.182.A06(r15, r0, r6)
            if (r0 == 0) goto L_0x1a8b
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            r3 = 12
            r0 = 3564(0xdec, float:4.994E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r6 = r5.getCoercedIntField(r3, r0)
            r3 = 11
            r0 = 3562(0xdea, float:4.991E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r8 = r5.getCoercedIntField(r3, r0)
            r0 = 3561(0xde9, float:4.99E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            r0 = r26
            int r7 = r5.getCoercedIntField(r0, r3)
            r3 = 13
            r0 = 3563(0xdeb, float:4.993E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r5 = r5.getCoercedIntField(r3, r0)
            r0 = 10000(0x2710, float:1.4013E-41)
            if (r6 < r0) goto L_0x1a73
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r3 = 2131962057(0x7f1328c9, float:1.9560828E38)
            X.GKO r3 = X.DbS.A0Q(r6, r3)
        L_0x19e2:
            r1.add(r3)
        L_0x19e5:
            if (r8 < r0) goto L_0x1a5b
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r3 = 2131962055(0x7f1328c7, float:1.9560824E38)
            X.GKO r3 = X.DbS.A0Q(r6, r3)
        L_0x19f0:
            r1.add(r3)
        L_0x19f3:
            if (r7 < r0) goto L_0x1a44
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r3 = 2131962056(0x7f1328c8, float:1.9560826E38)
            X.GKO r3 = X.DbS.A0Q(r6, r3)
        L_0x19fe:
            r1.add(r3)
        L_0x1a01:
            if (r5 < r0) goto L_0x1a2d
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r0 = 2131962054(0x7f1328c6, float:1.9560822E38)
            X.GKO r0 = X.DbS.A0Q(r3, r0)
        L_0x1a0c:
            r1.add(r0)
        L_0x1a0f:
            java.lang.String r3 = " · "
            X.Uhc r0 = new X.Uhc
            r0.<init>(r3, r1)
        L_0x1a16:
            X.EKM r1 = new X.EKM
            r30 = r12
            r34 = r0
            r35 = r18
            r36 = r13
            r46 = r24
            r49 = r4
            r52 = r4
            r29 = r1
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
            goto L_0x1316
        L_0x1a2d:
            if (r5 <= 0) goto L_0x1a0f
            java.lang.String r0 = java.lang.String.valueOf(r5)
            X.GKw r0 = X.JUH.A00(r0)
            java.lang.Object[] r6 = new java.lang.Object[]{r0}
            r3 = 2131820707(0x7f1100a3, float:1.9274137E38)
            X.H6w r0 = new X.H6w
            r0.<init>(r6, r3, r5)
            goto L_0x1a0c
        L_0x1a44:
            if (r7 <= 0) goto L_0x1a01
            java.lang.String r3 = java.lang.String.valueOf(r7)
            X.GKw r3 = X.JUH.A00(r3)
            java.lang.Object[] r8 = new java.lang.Object[]{r3}
            r6 = 2131820709(0x7f1100a5, float:1.927414E38)
            X.H6w r3 = new X.H6w
            r3.<init>(r8, r6, r7)
            goto L_0x19fe
        L_0x1a5b:
            if (r8 <= 0) goto L_0x19f3
            java.lang.String r3 = java.lang.String.valueOf(r8)
            X.GKw r3 = X.JUH.A00(r3)
            java.lang.Object[] r9 = new java.lang.Object[]{r3}
            r6 = 2131820708(0x7f1100a4, float:1.9274139E38)
            X.H6w r3 = new X.H6w
            r3.<init>(r9, r6, r8)
            goto L_0x19f0
        L_0x1a73:
            if (r6 <= 0) goto L_0x19e5
            java.lang.String r3 = java.lang.String.valueOf(r6)
            X.GKw r3 = X.JUH.A00(r3)
            java.lang.Object[] r10 = new java.lang.Object[]{r3}
            r9 = 2131820710(0x7f1100a6, float:1.9274143E38)
            X.H6w r3 = new X.H6w
            r3.<init>(r10, r9, r6)
            goto L_0x19e2
        L_0x1a8b:
            r0 = 0
            goto L_0x1a16
        L_0x1a8d:
            r42 = 0
            goto L_0x198a
        L_0x1a91:
            r51 = 0
            goto L_0x1946
        L_0x1a95:
            r0 = 0
            goto L_0x1930
        L_0x1a98:
            X.0sn r47 = X.0sn.A00
            goto L_0x191e
        L_0x1a9c:
            java.lang.String r0 = r22.getUsername()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            r0 = 2131961959(0x7f132867, float:1.956063E38)
            X.GKO r57 = X.DbS.A0Q(r1, r0)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 2131961958(0x7f132866, float:1.9560628E38)
            X.GKO r58 = X.DbS.A0Q(r1, r0)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 2131968772(0x7f134304, float:1.9574448E38)
            X.GKO r59 = X.DbS.A0Q(r1, r0)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 2131961957(0x7f132865, float:1.9560626E38)
            X.GKO r60 = X.DbS.A0Q(r1, r0)
            r63 = 32
            X.Jvx r32 = new X.Jvx
            r56 = r32
            r61 = r13
            r62 = r25
            r56.<init>((X.C266444Yx) r57, (X.C266444Yx) r58, (X.C266444Yx) r59, (X.C266444Yx) r60, (X.C266444Yx) r61, (X.EVK) r62, (int) r63)
            goto L_0x190a
        L_0x1ad5:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 2131974095(0x7f1357cf, float:1.9585244E38)
            X.GKO r57 = X.DbS.A0Q(r1, r0)
            r0 = 2131962019(0x7f1328a3, float:1.9560751E38)
            goto L_0x1aee
        L_0x1ae2:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 2131962021(0x7f1328a5, float:1.9560755E38)
            X.GKO r57 = X.DbS.A0Q(r1, r0)
            r0 = 2131962020(0x7f1328a4, float:1.9560753E38)
        L_0x1aee:
            X.GKO r58 = X.JTP.A0Q(r0)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 2131968772(0x7f134304, float:1.9574448E38)
            X.GKO r59 = X.DbS.A0Q(r1, r0)
            r63 = 48
            X.Jvx r32 = new X.Jvx
            r56 = r32
            r60 = r13
            r61 = r13
            r62 = r25
            r56.<init>((X.C266444Yx) r57, (X.C266444Yx) r58, (X.C266444Yx) r59, (X.C266444Yx) r60, (X.C266444Yx) r61, (X.EVK) r62, (int) r63)
            goto L_0x190a
        L_0x1b0c:
            r32 = 0
            goto L_0x190a
        L_0x1b10:
            r6 = 0
            goto L_0x18c3
        L_0x1b13:
            r33 = 0
            goto L_0x18ab
        L_0x1b17:
            r32 = 0
            goto L_0x1892
        L_0x1b1b:
            r35 = 0
            goto L_0x1873
        L_0x1b1f:
            if (r8 == 0) goto L_0x1b2d
            java.lang.Integer r6 = X.AnonymousClass05K.A0N
            r0 = 2131962064(0x7f1328d0, float:1.9560843E38)
            if (r29 == 0) goto L_0x184d
            r0 = 2131962065(0x7f1328d1, float:1.9560845E38)
            goto L_0x184d
        L_0x1b2d:
            if (r6 == 0) goto L_0x1b3b
            java.lang.Integer r6 = X.AnonymousClass05K.A0Y
            r0 = 2131962062(0x7f1328ce, float:1.9560839E38)
            if (r29 == 0) goto L_0x184d
            r0 = 2131962061(0x7f1328cd, float:1.9560837E38)
            goto L_0x184d
        L_0x1b3b:
            java.lang.Integer r0 = r3.A00
            if (r0 != r9) goto L_0x1b4a
            r6 = r9
            r0 = 2131962059(0x7f1328cb, float:1.9560832E38)
            if (r29 == 0) goto L_0x184d
            r0 = 2131962060(0x7f1328cc, float:1.9560834E38)
            goto L_0x184d
        L_0x1b4a:
            X.N4R r12 = new X.N4R
            r0 = r31
            r12.<init>((java.lang.Integer) r0)
            goto L_0x1858
        L_0x1b53:
            r1 = 0
            goto L_0x1826
        L_0x1b56:
            r0 = 6
            goto L_0x1312
        L_0x1b59:
            r0 = 5
            goto L_0x1312
        L_0x1b5c:
            r0 = 2
            goto L_0x1312
        L_0x1b5f:
            r0 = 9
            goto L_0x1312
        L_0x1b63:
            java.lang.IllegalArgumentException r0 = X.DbU.A0h()
            throw r0
        L_0x1b68:
            java.lang.IllegalArgumentException r0 = X.DbU.A0h()
            throw r0
        L_0x1b6d:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r12)
            throw r0
        L_0x1b72:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r12)
            throw r0
        L_0x1b77:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r12)
            throw r0
        L_0x1b7c:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x1b81:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x1b86:
            java.lang.String r0 = "fanClub should be loaded"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x1b8d:
            java.lang.String r0 = "creator should be loaded"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x1b94:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r5 = 1
            if (r0 == 0) goto L_0x1ba2
            if (r0 == r5) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x1ba2:
            X.02o r6 = A02(r6, r2)
            java.lang.Object r1 = r2.A02
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            java.lang.Object r7 = r2.A03
            X.Jfm r7 = (X.C60106Jfm) r7
            r4 = 0
            r3 = r1[r4]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.fanclub.consideration.CustomizedBenefitSelectionDefinition.CustomizedBenefitSelectionViewModel>"
            X.0qQ.A0C(r3, r0)
            java.util.List r3 = (java.util.List) r3
            r0 = r1[r5]
            boolean r0 = X.JTQ.A1W(r0)
            if (r0 == 0) goto L_0x1bc8
            X.KRY r0 = X.KRY.A00
        L_0x1bc2:
            java.lang.Object r1 = A01(r0, r2, r6, r5)
            goto L_0x2f27
        L_0x1bc8:
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L_0x1bdb
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x1bdb
        L_0x1bd2:
            X.C60106Jfm.A00(r7, r4)
            X.KRX r0 = new X.KRX
            r0.<init>(r3)
            goto L_0x1bc2
        L_0x1bdb:
            java.util.Iterator r1 = r3.iterator()
        L_0x1bdf:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1bd2
            java.lang.Object r0 = r1.next()
            X.JyH r0 = (X.C61165JyH) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x1bdf
            int r4 = r4 + 1
            if (r4 >= 0) goto L_0x1bdf
            X.0sr.A1S()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x1bfb:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r8 = 1
            if (r0 == 0) goto L_0x1c09
            if (r0 == r8) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x1c09:
            X.02o r7 = A02(r6, r2)
            java.lang.Object r6 = r2.A03
            X.DlY r6 = (X.C46797DlY) r6
            com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository r0 = r6.A03
            X.0Ud r5 = r0.A0F
            X.0Ud r4 = r0.A0E
            X.0Ud r3 = r0.A0G
            r1 = 0
            X.FyB r0 = new X.FyB
            r0.<init>(r6, r1)
            X.0pt r0 = X.AnonymousClass10H.A00(r0, r5, r4, r3)
            r2.A00 = r8
            java.lang.Object r1 = X.AnonymousClass11O.A02(r2, r0, r7)
            goto L_0x2f27
        L_0x1c2b:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r5 = 1
            if (r0 == 0) goto L_0x1c39
            if (r0 == r5) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x1c39:
            X.02o r6 = A02(r6, r2)
            java.lang.Object r4 = r2.A02
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r1 = r2.A03
            X.JfZ r1 = (X.C60093JfZ) r1
            X.05G r0 = r1.A06
            boolean r0 = X.DbX.A1b(r0)
            if (r0 == 0) goto L_0x1c5d
            X.05G r0 = r1.A07
            boolean r0 = X.DbX.A1b(r0)
            if (r0 == 0) goto L_0x1c5d
            X.HAb r0 = X.C54361HAb.A00
        L_0x1c57:
            java.lang.Object r1 = A01(r0, r2, r6, r5)
            goto L_0x2f27
        L_0x1c5d:
            r0 = 0
            r3 = r4[r0]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.fanclub.settings.viewmodel.FanClubMainRecommendationViewModel>"
            X.0qQ.A0C(r3, r0)
            java.util.List r3 = (java.util.List) r3
            r1 = r4[r5]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.fanclub.guidance.FanClubInspirationUserDataModel>"
            X.0qQ.A0C(r1, r0)
            java.util.List r1 = (java.util.List) r1
            X.HAa r0 = new X.HAa
            r0.<init>(r3, r1)
            goto L_0x1c57
        L_0x1c76:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r7 = 1
            if (r0 == 0) goto L_0x1c84
            if (r0 == r7) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x1c84:
            X.02o r6 = A02(r6, r2)
            java.lang.Object r3 = r2.A02
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r0 = 0
            r9 = r3[r0]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            X.0qQ.A0C(r9, r0)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            r5 = r3[r7]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.monetization.productsettings.viewmodel.ProductSettingsItemViewModel>"
            X.0qQ.A0C(r5, r0)
            java.util.List r5 = (java.util.List) r5
            r0 = 2
            r0 = r3[r0]
            boolean r1 = X.JTQ.A1W(r0)
            r0 = 3
            boolean r0 = X.JTR.A1b(r3, r0)
            if (r0 == 0) goto L_0x1cb9
            X.EKc r3 = X.C47856EKc.A00
        L_0x1cb3:
            java.lang.Object r1 = A01(r3, r2, r6, r7)
            goto L_0x2f27
        L_0x1cb9:
            if (r1 == 0) goto L_0x1cbe
            X.EKb r3 = X.C47855EKb.A00
            goto L_0x1cb3
        L_0x1cbe:
            r3 = 0
            if (r8 <= 0) goto L_0x1ce0
            java.lang.Object[] r1 = new java.lang.Object[]{r9}
            r0 = 2131820705(0x7f1100a1, float:1.9274132E38)
            X.H6w r4 = new X.H6w
            r4.<init>(r1, r0, r8)
            java.lang.Object[] r3 = new java.lang.Object[]{r9}
            r0 = 2131820704(0x7f1100a0, float:1.927413E38)
            X.H6w r1 = new X.H6w
            r1.<init>(r3, r0, r8)
            r0 = 1
        L_0x1cda:
            X.EKa r3 = new X.EKa
            r3.<init>(r4, r1, r5, r0)
            goto L_0x1cb3
        L_0x1ce0:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0 = 2131962016(0x7f1328a0, float:1.9560745E38)
            X.GKO r4 = X.DbS.A0Q(r1, r0)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0 = 2131962015(0x7f13289f, float:1.9560743E38)
            X.GKO r1 = X.DbS.A0Q(r1, r0)
            r0 = 0
            goto L_0x1cda
        L_0x1cf4:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r7 = 1
            if (r0 == 0) goto L_0x1d02
            if (r0 == r7) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x1d02:
            X.02o r20 = A02(r6, r2)
            java.lang.Object r4 = r2.A02
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r6 = 0
            r12 = r4[r6]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.api.schemas.FanClubCategoryMetadata>"
            X.0qQ.A0C(r12, r0)
            java.util.List r12 = (java.util.List) r12
            r11 = r4[r7]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            X.0qQ.A0C(r11, r0)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r0 = 2
            r0 = r4[r0]
            boolean r19 = X.JTQ.A1W(r0)
            r0 = 3
            r5 = r4[r0]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.api.schemas.FanClubMember>"
            X.0qQ.A0C(r5, r0)
            java.util.List r5 = (java.util.List) r5
            r0 = 4
            boolean r18 = X.JTR.A1b(r4, r0)
            r0 = 5
            boolean r1 = X.JTR.A1b(r4, r0)
            r0 = 6
            r3 = r4[r0]
            r0 = 3676(0xe5c, float:5.151E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r3, r0)
            java.util.Set r3 = (java.util.Set) r3
            r0 = 7
            r8 = r4[r0]
            X.DbS.A1Y(r8)
            java.lang.String r8 = (java.lang.String) r8
            if (r1 == 0) goto L_0x1d64
            boolean r0 = X.AnonymousClass7TE.A1b(r12)
            if (r0 == 0) goto L_0x1d64
            X.LrC r1 = X.C65314LrC.A00
        L_0x1d5c:
            r0 = r20
            java.lang.Object r1 = A01(r1, r2, r0, r7)
            goto L_0x2f27
        L_0x1d64:
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r5.iterator()
        L_0x1d6c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x1d87
            java.lang.Object r1 = r4.next()
            r0 = r1
            X.PwM r0 = (X.C74527PwM) r0
            X.JxE r0 = (X.C61103JxE) r0
            com.instagram.user.model.User r0 = r0.A00
            boolean r0 = X.DbV.A1a(r0, r3)
            if (r0 != 0) goto L_0x1d6c
            r9.add(r1)
            goto L_0x1d6c
        L_0x1d87:
            java.lang.Object r4 = r2.A03
            com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel r4 = (com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel) r4
            X.01N r3 = X.0jo.A1H()
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x1f06
            X.05G r0 = r4.A0G
            java.lang.Object r0 = r0.getValue()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            boolean r0 = X.AnonymousClass7TF.A1R(r0)
            if (r0 != 0) goto L_0x1f06
        L_0x1da7:
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x1e04
            X.05G r0 = r4.A0G
            java.lang.Object r0 = r0.getValue()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            boolean r0 = X.AnonymousClass7TF.A1R(r0)
            if (r0 == 0) goto L_0x1e04
            if (r18 != 0) goto L_0x1e04
            java.lang.Object[] r1 = new java.lang.Object[]{r8}
            r0 = 2131976286(0x7f13605e, float:1.9589688E38)
            X.GKO r1 = X.DbS.A0Q(r1, r0)
            X.EGW r0 = new X.EGW
            r0.<init>(r1)
            r3.add(r0)
        L_0x1dd4:
            X.01N r8 = X.0jo.A1I(r3)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x1df3
            X.05G r0 = r4.A0G
            java.lang.Object r0 = r0.getValue()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            boolean r0 = X.AnonymousClass7TF.A1R(r0)
            if (r0 != 0) goto L_0x1df3
            r3 = 1
            if (r18 == 0) goto L_0x1df4
        L_0x1df3:
            r3 = 0
        L_0x1df4:
            boolean r0 = r4.A0I
            if (r0 == 0) goto L_0x1dfb
            if (r3 != 0) goto L_0x1dfb
            r6 = 1
        L_0x1dfb:
            X.Dtm r1 = new X.Dtm
            r0 = r19
            r1.<init>(r8, r0, r3, r6)
            goto L_0x1d5c
        L_0x1e04:
            com.instagram.common.session.UserSession r8 = r4.A00
            boolean r0 = X.C375479Ds.A01(r8)
            if (r0 == 0) goto L_0x1e98
            java.lang.String r1 = r4.A08
            java.lang.String r0 = "EXCLUSIVE_STORY"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x1e98
            X.05G r0 = r4.A0G
            java.lang.Object r0 = r0.getValue()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            boolean r0 = X.AnonymousClass7TF.A1R(r0)
            if (r0 != 0) goto L_0x1e98
            boolean r0 = X.AnonymousClass7TE.A1b(r9)
            if (r0 == 0) goto L_0x1e98
            boolean r0 = X.AnonymousClass7TE.A1b(r12)
            if (r0 == 0) goto L_0x1e86
            boolean r0 = X.AnonymousClass7TE.A1b(r9)
            if (r0 == 0) goto L_0x1e86
            X.01N r15 = X.0jo.A1H()
            X.Dte r0 = r4.A05
            r15.add(r0)
            java.util.ArrayList r14 = X.AnonymousClass7TG.A0r(r12)
            java.util.Iterator r17 = r12.iterator()
        L_0x1e4b:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x1e7c
            java.lang.Object r0 = r17.next()
            X.GnY r0 = (X.C53401GnY) r0
            java.lang.Object r13 = r0.A01
            com.instagram.api.schemas.FanClubCategoryType r13 = (com.instagram.api.schemas.FanClubCategoryType) r13
            java.lang.String r1 = r0.A04
            r25 = r1
            java.lang.String r1 = r0.A03
            r26 = r1
            java.lang.Object r12 = r0.A02
            com.instagram.user.model.User r12 = (com.instagram.user.model.User) r12
            java.lang.Object r1 = r0.A00
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            X.FYJ r0 = new X.FYJ
            r21 = r0
            r22 = r13
            r23 = r12
            r24 = r1
            r21.<init>(r22, r23, r24, r25, r26)
            r14.add(r0)
            goto L_0x1e4b
        L_0x1e7c:
            r15.addAll(r14)
            X.01N r0 = X.0jo.A1I(r15)
            r3.addAll(r0)
        L_0x1e86:
            X.0Tu r12 = X.0Tu.A05
            r0 = 36314631388465899(0x8103f7000f0aeb, double:3.028857345124862E-306)
            boolean r0 = X.182.A06(r12, r8, r0)
            if (r0 == 0) goto L_0x1eee
            X.KGH r0 = r4.A04
        L_0x1e95:
            r3.add(r0)
        L_0x1e98:
            java.util.ArrayList r10 = X.AnonymousClass7TG.A0r(r9)
            java.util.Iterator r13 = r9.iterator()
        L_0x1ea0:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x1f01
            java.lang.Object r11 = r13.next()
            X.PwM r11 = (X.C74527PwM) r11
            X.JxE r11 = (X.C61103JxE) r11
            com.instagram.user.model.User r9 = r11.A00
            java.lang.Integer r26 = X.AnonymousClass05K.A0C
            r22 = 0
            java.lang.Boolean r0 = r11.A01
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r7)
            if (r0 == 0) goto L_0x1ecc
            X.0Tu r12 = X.0Tu.A05
            r0 = 36325961511220627(0x810e4500003593, double:3.0360225603776944E-306)
            boolean r0 = X.182.A06(r12, r8, r0)
            r1 = 2131976313(0x7f136079, float:1.9589743E38)
            if (r0 != 0) goto L_0x1ecf
        L_0x1ecc:
            r1 = 2131976314(0x7f13607a, float:1.9589745E38)
        L_0x1ecf:
            java.lang.String r0 = r11.A02
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            X.GKO r23 = X.DbS.A0Q(r0, r1)
            r27 = 764(0x2fc, float:1.07E-42)
            X.N5z r0 = new X.N5z
            r21 = r0
            r24 = r22
            r25 = r9
            r28 = r6
            r29 = r7
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29)
            r10.add(r0)
            goto L_0x1ea0
        L_0x1eee:
            java.lang.Object[] r1 = new java.lang.Object[]{r11}
            r0 = 2131821001(0x7f1101c9, float:1.9274733E38)
            X.H6w r11 = new X.H6w
            r11.<init>(r1, r0, r10)
            r1 = 0
            X.Dte r0 = new X.Dte
            r0.<init>(r1, r11, r1)
            goto L_0x1e95
        L_0x1f01:
            r3.addAll(r10)
            goto L_0x1dd4
        L_0x1f06:
            com.instagram.common.session.UserSession r14 = r4.A00
            X.0Tu r13 = X.0Tu.A05
            r0 = 36312973530826309(0x810275000b0645, double:3.0278089092779284E-306)
            boolean r0 = X.182.A06(r13, r14, r0)
            if (r0 == 0) goto L_0x1da7
            X.EGd r0 = new X.EGd
            r0.<init>(r8)
            r3.add(r0)
            goto L_0x1da7
        L_0x1f1f:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r5 = 1
            if (r0 == 0) goto L_0x1f2d
            if (r0 == r5) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x1f2d:
            X.02o r4 = A02(r6, r2)
            java.lang.Object r3 = r2.A02
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r0 = 0
            r1 = r3[r0]
            r0 = 3675(0xe5b, float:5.15E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = r3[r5]
            boolean r0 = X.JTQ.A1W(r0)
            if (r0 == 0) goto L_0x1f53
            X.KRc r0 = X.KRc.A00
        L_0x1f4d:
            java.lang.Object r1 = A01(r0, r2, r4, r5)
            goto L_0x2f27
        L_0x1f53:
            X.KRb r0 = new X.KRb
            r0.<init>(r1)
            goto L_0x1f4d
        L_0x1f59:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r5 = 1
            if (r0 == 0) goto L_0x1f67
            if (r0 == r5) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x1f67:
            X.02o r6 = A02(r6, r2)
            java.lang.Object r9 = r2.A02
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            r0 = 0
            r4 = r9[r0]
            java.util.List r4 = (java.util.List) r4
            r8 = r9[r5]
            java.util.List r8 = (java.util.List) r8
            r0 = 2
            r7 = r9[r0]
            X.4Yx r7 = (X.C266444Yx) r7
            r0 = 3
            r0 = r9[r0]
            boolean r3 = X.JTQ.A1W(r0)
            r0 = 4
            boolean r1 = X.JTR.A1b(r9, r0)
            r0 = 5
            boolean r0 = X.JTR.A1b(r9, r0)
            if (r1 == 0) goto L_0x1f98
            X.KRh r1 = X.C61912KRh.A00
        L_0x1f92:
            java.lang.Object r1 = A01(r1, r2, r6, r5)
            goto L_0x2f27
        L_0x1f98:
            if (r3 == 0) goto L_0x1f9d
            X.KRi r1 = X.C61913KRi.A00
            goto L_0x1f92
        L_0x1f9d:
            if (r7 == 0) goto L_0x1fa5
            X.KRj r1 = new X.KRj
            r1.<init>(r7)
            goto L_0x1f92
        L_0x1fa5:
            if (r0 == 0) goto L_0x1faa
            X.KRg r1 = X.C61911KRg.A00
            goto L_0x1f92
        L_0x1faa:
            if (r4 != 0) goto L_0x1fb9
            if (r8 != 0) goto L_0x1fb7
            X.0sn r4 = X.0sn.A00
        L_0x1fb0:
            r0 = 0
        L_0x1fb1:
            X.KRk r1 = new X.KRk
            r1.<init>(r4, r0)
            goto L_0x1f92
        L_0x1fb7:
            r4 = r8
            goto L_0x1fb0
        L_0x1fb9:
            if (r8 == 0) goto L_0x1fb0
            int r1 = r4.size()
            int r0 = r8.size()
            if (r1 != r0) goto L_0x1fcb
            boolean r0 = r4.containsAll(r8)
            if (r0 != 0) goto L_0x1fb0
        L_0x1fcb:
            r0 = 1
            goto L_0x1fb1
        L_0x1fcd:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r1 = 1
            if (r0 == 0) goto L_0x1fdb
            if (r0 == r1) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x1fdb:
            X.02o r20 = A02(r6, r2)
            java.lang.Object r6 = r2.A02
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            r0 = 0
            r0 = r6[r0]
            boolean r0 = X.JTQ.A1W(r0)
            if (r0 == 0) goto L_0x1ffd
            X.Lu3 r0 = new X.Lu3
            r0.<init>()
            java.util.List r3 = X.AnonymousClass7TE.A1I(r0)
        L_0x1ff5:
            r0 = r20
            java.lang.Object r1 = A01(r3, r2, r0, r1)
            goto L_0x2f27
        L_0x1ffd:
            java.lang.Object r0 = r2.A03
            X.JiU r0 = (X.C60273JiU) r0
            r9 = r6[r1]
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.monetization.constants.MonetizationProductEligibilityDecision"
            X.0qQ.A0C(r9, r3)
            X.2o7 r9 = (X.AnonymousClass2o7) r9
            r3 = 2
            r4 = r6[r3]
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Int"
            int r17 = X.DbW.A04(r4, r3)
            r3 = 3
            boolean r19 = X.JTR.A1b(r6, r3)
            r3 = 4
            r5 = r6[r3]
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.api.schemas.FanClubNextStepsRecommendation>"
            X.0qQ.A0C(r5, r3)
            java.util.List r5 = (java.util.List) r5
            r12 = 5
            r8 = r6[r12]
            java.lang.Number r8 = (java.lang.Number) r8
            X.01N r3 = X.0jo.A1H()
            X.01N r6 = X.0jo.A1H()
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r5.iterator()
        L_0x2037:
            boolean r4 = r13.hasNext()
            r10 = 0
            if (r4 == 0) goto L_0x204f
            java.lang.Object r10 = r13.next()
            r4 = r10
            X.JxF r4 = (X.C61104JxF) r4
            com.instagram.api.schemas.FanClubNextStepsCompletionState r7 = r4.A00
            com.instagram.api.schemas.FanClubNextStepsCompletionState r4 = com.instagram.api.schemas.FanClubNextStepsCompletionState.COMPLETED
            if (r7 == r4) goto L_0x2037
            r11.add(r10)
            goto L_0x2037
        L_0x204f:
            boolean r4 = X.AnonymousClass7TE.A1b(r11)
            if (r4 == 0) goto L_0x20e3
            int r4 = r5.size()
            r7 = 2
            if (r4 > r7) goto L_0x235c
            int r5 = r5.size()
            int r4 = r11.size()
            if (r5 > r4) goto L_0x235c
            r13 = 0
            r5 = 2131962038(0x7f1328b6, float:1.956079E38)
            X.FOl r4 = X.C50095FOl.A00
            X.Lu9 r14 = new X.Lu9
            r14.<init>(r4, r13, r5, r10)
        L_0x2071:
            r6.add(r14)
            com.instagram.common.session.UserSession r14 = r0.A00
            X.0Tu r13 = X.0Tu.A05
            r4 = 36322156170192867(0x810acf000027e3, double:3.0336160473888605E-306)
            boolean r4 = X.182.A06(r13, r14, r4)
            if (r4 == 0) goto L_0x232c
            java.lang.Object r13 = X.00k.A0I(r11)
            X.JxF r13 = (X.C61104JxF) r13
            X.LNy r14 = r0.A03
            java.lang.Integer r7 = X.AnonymousClass05K.A0D
            r4 = 14
            X.J6S r5 = new X.J6S
            r5.<init>(r4, r13, r0)
            X.0qQ.A0B(r13, r10)
            com.instagram.api.schemas.FanClubNextStepsRecommendationsType r11 = r13.A01
            com.instagram.api.schemas.FanClubNextStepsRecommendationsType r4 = com.instagram.api.schemas.FanClubNextStepsRecommendationsType.UNRECOGNIZED
            r24 = 0
            if (r11 == r4) goto L_0x20e3
            java.lang.String r11 = r11.toString()
            X.LNy.A00(r14, r7, r11)
            com.instagram.common.session.UserSession r4 = r14.A00
            boolean r4 = X.AnonymousClass2o2.A02(r4)
            if (r4 == 0) goto L_0x22fb
            java.lang.String r7 = r13.A05
            if (r7 == 0) goto L_0x20e3
            java.lang.String r4 = r13.A06
            r30 = r4
            java.lang.String r4 = r13.A02
            r18 = r4
            java.lang.String r15 = r13.A03
            java.lang.String r14 = r13.A04
            X.LY7 r4 = new X.LY7
            r4.<init>((int) r12, (java.lang.Object) r5, (java.lang.Object) r13)
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r10)
            X.GqK r5 = new X.GqK
            r21 = r5
            r22 = r4
            r25 = r24
            r26 = r24
            r27 = r24
            r28 = r7
            r29 = r18
            r31 = r14
            r32 = r15
            r33 = r11
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
        L_0x20e0:
            r6.add(r5)
        L_0x20e3:
            X.01N r4 = X.0jo.A1I(r6)
            r3.addAll(r4)
            boolean r11 = X.DbT.A1b(r3)
            X.01N r5 = X.0jo.A1H()
            r7 = 0
            r4 = 2131969171(0x7f134493, float:1.9575257E38)
            X.FOl r6 = X.C50095FOl.A00
            X.DbV.A1E(r6, r7, r5, r4, r11)
            int r9 = r9.ordinal()
            if (r9 == r10) goto L_0x22a1
            r4 = 2
            if (r9 == r4) goto L_0x2284
            if (r9 == r1) goto L_0x22be
            X.Lu3 r9 = new X.Lu3
            r9.<init>()
        L_0x210b:
            r5.add(r9)
            X.01N r4 = X.0jo.A1I(r5)
            r3.addAll(r4)
            X.01N r9 = X.0jo.A1H()
            r4 = 2131976292(0x7f136064, float:1.95897E38)
            X.DbV.A1E(r6, r7, r9, r4, r1)
            r5 = 2131976318(0x7f13607e, float:1.9589753E38)
            r4 = 46
            A03(r0, r9, r4, r5)
            com.instagram.common.session.UserSession r12 = r0.A00
            boolean r4 = X.AnonymousClass2o2.A01(r12)
            r11 = 0
            if (r4 == 0) goto L_0x2154
            r13 = 2131961990(0x7f132886, float:1.9560693E38)
            if (r8 == 0) goto L_0x2281
            int r14 = r8.intValue()
            java.lang.Object[] r5 = X.AnonymousClass7TF.A1b(r14)
            r4 = 2131820702(0x7f11009e, float:1.9274126E38)
            X.H6w r8 = new X.H6w
            r8.<init>(r5, r4, r14)
        L_0x2145:
            r4 = 47
            X.LYE r5 = new X.LYE
            r5.<init>((java.lang.Object) r0, (int) r4)
            X.LuC r4 = new X.LuC
            r4.<init>((android.view.View.OnClickListener) r5, (X.C266444Yx) r8, (int) r13)
            r9.add(r4)
        L_0x2154:
            if (r17 <= 0) goto L_0x215e
            r5 = 2131976311(0x7f136077, float:1.9589739E38)
            r4 = 48
            A03(r0, r9, r4, r5)
        L_0x215e:
            boolean r4 = X.AnonymousClass2o2.A00(r12)
            if (r4 == 0) goto L_0x21d1
            com.instagram.fanclub.settings.repository.FanClubSettingsRepository r4 = r0.A02
            X.6jB r4 = r4.A04
            X.0xa r5 = r4.A01
            r4 = 3790(0xece, float:5.311E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            long r17 = X.DbW.A06(r5, r4)
            r13 = 1
            int r4 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r4 >= 0) goto L_0x2189
            X.0Tu r8 = X.0Tu.A05
            r4 = 36316186165645331(0x81056100001013, double:3.02984059247372E-306)
            boolean r4 = X.182.A06(r8, r12, r4)
            r35 = 1
            if (r4 != 0) goto L_0x218b
        L_0x2189:
            r35 = 0
        L_0x218b:
            r4 = 30
            X.Ing r8 = new X.Ing
            r8.<init>(r0, r4)
            r4 = 49
            X.LYE r5 = new X.LYE
            r5.<init>((java.lang.Object) r0, (int) r4)
            r13 = 2131976294(0x7f136066, float:1.9589704E38)
            r4 = 2131976300(0x7f13606c, float:1.9589717E38)
            java.lang.Integer r26 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r29 = java.lang.Integer.valueOf(r4)
            X.LuC r4 = new X.LuC
            r21 = r4
            r22 = r5
            r23 = r7
            r24 = r7
            r25 = r7
            r27 = r7
            r28 = r7
            r30 = r7
            r31 = r7
            r32 = r8
            r33 = r10
            r34 = r10
            r36 = r10
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r9.add(r4)
            r5 = 2131976326(0x7f136086, float:1.958977E38)
            r4 = 50
            A03(r0, r9, r4, r5)
        L_0x21d1:
            r5 = 2131976324(0x7f136084, float:1.9589765E38)
            r4 = 51
            A03(r0, r9, r4, r5)
            r4 = 52
            X.LYE r5 = new X.LYE
            r5.<init>((java.lang.Object) r0, (int) r4)
            X.MLA r32 = X.MLA.A00
            r8 = 2131962076(0x7f1328dc, float:1.9560867E38)
            r4 = 2131962077(0x7f1328dd, float:1.9560869E38)
            java.lang.Integer r26 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r29 = java.lang.Integer.valueOf(r4)
            X.LuC r4 = new X.LuC
            r21 = r4
            r22 = r5
            r23 = r7
            r24 = r7
            r25 = r7
            r27 = r7
            r28 = r7
            r30 = r7
            r31 = r7
            r33 = r10
            r34 = r10
            r35 = r10
            r36 = r10
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r9.add(r4)
            r8 = 2131976293(0x7f136065, float:1.9589702E38)
            if (r19 == 0) goto L_0x221e
            r4 = 2131969167(0x7f13448f, float:1.957525E38)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
        L_0x221e:
            r4 = 45
            X.LYE r5 = new X.LYE
            r5.<init>((java.lang.Object) r0, (int) r4)
            X.LuC r4 = new X.LuC
            r4.<init>((android.view.View.OnClickListener) r5, (java.lang.Integer) r11, (int) r8)
            r9.add(r4)
            X.01N r4 = X.0jo.A1I(r9)
            r3.addAll(r4)
            X.01N r8 = X.0jo.A1H()
            r4 = 2131976289(0x7f136061, float:1.9589694E38)
            X.DbV.A1E(r6, r7, r8, r4, r1)
            r5 = 2131976285(0x7f13605d, float:1.9589686E38)
            r4 = 43
            A03(r0, r8, r4, r5)
            r5 = 2131976315(0x7f13607b, float:1.9589747E38)
            r4 = 44
            A03(r0, r8, r4, r5)
            X.01N r4 = X.0jo.A1I(r8)
            r3.addAll(r4)
            X.01N r9 = X.0jo.A1H()
            X.0Tu r8 = X.0Tu.A05
            r4 = 36312973530760772(0x810275000a0644, double:3.0278089092364825E-306)
            boolean r4 = X.182.A06(r8, r12, r4)
            if (r4 == 0) goto L_0x2274
            r4 = 2131976319(0x7f13607f, float:1.9589755E38)
            X.DbV.A1E(r6, r7, r9, r4, r1)
            r5 = 2131969165(0x7f13448d, float:1.9575245E38)
            r4 = 54
            A03(r0, r9, r4, r5)
        L_0x2274:
            X.01N r0 = X.0jo.A1I(r9)
            r3.addAll(r0)
            X.01N r3 = X.0jo.A1I(r3)
            goto L_0x1ff5
        L_0x2281:
            r8 = r7
            goto L_0x2145
        L_0x2284:
            r4 = 2131239007(0x7f08205f, float:1.8094309E38)
            java.lang.Integer r24 = java.lang.Integer.valueOf(r4)
            r4 = 2130970228(0x7f040674, float:1.754916E38)
            java.lang.Integer r25 = java.lang.Integer.valueOf(r4)
            r4 = 2131969162(0x7f13448a, float:1.957524E38)
            java.lang.Integer r26 = java.lang.Integer.valueOf(r4)
            r9 = 41
            X.LYE r4 = new X.LYE
            r4.<init>((java.lang.Object) r0, (int) r9)
            goto L_0x22da
        L_0x22a1:
            r4 = 2131238110(0x7f081cde, float:1.809249E38)
            java.lang.Integer r24 = java.lang.Integer.valueOf(r4)
            r4 = 2130970331(0x7f0406db, float:1.754937E38)
            java.lang.Integer r25 = java.lang.Integer.valueOf(r4)
            r4 = 2131969163(0x7f13448b, float:1.9575241E38)
            java.lang.Integer r26 = java.lang.Integer.valueOf(r4)
            r9 = 40
            X.LYE r4 = new X.LYE
            r4.<init>((java.lang.Object) r0, (int) r9)
            goto L_0x22da
        L_0x22be:
            r4 = 2131238125(0x7f081ced, float:1.809252E38)
            java.lang.Integer r24 = java.lang.Integer.valueOf(r4)
            r4 = 2130970215(0x7f040667, float:1.7549134E38)
            java.lang.Integer r25 = java.lang.Integer.valueOf(r4)
            r4 = 2131969164(0x7f13448c, float:1.9575243E38)
            java.lang.Integer r26 = java.lang.Integer.valueOf(r4)
            r9 = 42
            X.LYE r4 = new X.LYE
            r4.<init>((java.lang.Object) r0, (int) r9)
        L_0x22da:
            X.ML9 r32 = X.ML9.A00
            X.LuC r9 = new X.LuC
            r21 = r9
            r22 = r4
            r23 = r7
            r27 = r7
            r28 = r7
            r29 = r7
            r30 = r7
            r31 = r7
            r33 = r10
            r34 = r10
            r35 = r10
            r36 = r10
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            goto L_0x210b
        L_0x22fb:
            java.lang.String r11 = r13.A08
            if (r11 == 0) goto L_0x20e3
            java.lang.String r14 = r13.A06
            java.lang.String r7 = r13.A07
            r12 = 6
            X.LY7 r4 = new X.LY7
            r4.<init>((int) r12, (java.lang.Object) r5, (java.lang.Object) r13)
            java.lang.Boolean r27 = java.lang.Boolean.valueOf(r10)
            X.GqK r5 = new X.GqK
            r25 = r5
            r26 = r4
            r28 = r11
            r29 = r14
            r30 = r14
            r31 = r7
            r32 = r24
            r33 = r24
            r34 = r24
            r35 = r24
            r36 = r24
            r37 = r24
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            goto L_0x20e0
        L_0x232c:
            java.util.List r4 = X.00k.A0d(r11, r7)
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r14 = r4.iterator()
        L_0x2338:
            boolean r4 = r14.hasNext()
            if (r4 == 0) goto L_0x2357
            java.lang.Object r12 = r14.next()
            X.JxF r12 = (X.C61104JxF) r12
            X.LNy r11 = r0.A03
            java.lang.Integer r5 = X.AnonymousClass05K.A0D
            X.J6H r4 = new X.J6H
            r4.<init>(r0, r7)
            X.LuA r4 = r11.A01(r12, r5, r4)
            if (r4 == 0) goto L_0x2338
            r13.add(r4)
            goto L_0x2338
        L_0x2357:
            r6.addAll(r13)
            goto L_0x20e3
        L_0x235c:
            r13 = 2131962038(0x7f1328b6, float:1.956079E38)
            r4 = 2131962037(0x7f1328b5, float:1.9560788E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r14 = 53
            X.LYE r4 = new X.LYE
            r4.<init>((java.lang.Object) r0, (int) r14)
            X.Lu9 r14 = new X.Lu9
            r14.<init>(r4, r5, r13, r10)
            goto L_0x2071
        L_0x2374:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r8 = 1
            if (r0 == 0) goto L_0x2382
            if (r0 == r8) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x2382:
            X.02o r9 = A02(r6, r2)
            java.lang.Object r7 = r2.A02
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            java.lang.String[] r7 = (java.lang.String[]) r7
            int r6 = r7.length
            r5 = 0
            r4 = 0
        L_0x238f:
            if (r5 >= r6) goto L_0x240d
            r0 = r7[r5]
            int r14 = r4 + 1
            int r0 = r0.length()
            if (r0 != 0) goto L_0x23b3
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x239d:
            r0 = 20
            X.JwA r10 = new X.JwA
            r10.<init>((int) r0, (java.lang.Integer) r1)
        L_0x23a4:
            java.lang.Object r0 = r2.A03
            X.U8i r0 = (X.C14772U8i) r0
            X.05G[] r0 = r0.A0B
            r0 = r0[r4]
            r0.Epw(r10)
            int r5 = r5 + 1
            r4 = r14
            goto L_0x238f
        L_0x23b3:
            java.lang.Object r0 = r2.A03
            X.U8i r0 = (X.C14772U8i) r0
            X.05G[] r11 = r0.A0A
            r0 = r11[r4]
            java.lang.Object r13 = r0.getValue()
            int r10 = r11.length
            java.util.ArrayList r3 = X.DbS.A0v(r10)
            r1 = 0
        L_0x23c5:
            if (r1 >= r10) goto L_0x23d3
            r0 = r11[r1]
            java.lang.Object r0 = r0.getValue()
            r3.add(r0)
            int r1 = r1 + 1
            goto L_0x23c5
        L_0x23d3:
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r11 = r3.iterator()
            r10 = 0
        L_0x23dc:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x23f7
            java.lang.Object r3 = r11.next()
            int r1 = r10 + 1
            if (r10 < 0) goto L_0x24ac
            if (r10 == r4) goto L_0x23f5
            boolean r0 = X.0qQ.A0K(r3, r13)
            if (r0 == 0) goto L_0x23f5
            r12.add(r3)
        L_0x23f5:
            r10 = r1
            goto L_0x23dc
        L_0x23f7:
            boolean r0 = X.AnonymousClass7TE.A1b(r12)
            if (r0 == 0) goto L_0x240a
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            r1 = 2131964802(0x7f133382, float:1.9566396E38)
            r0 = 20
            X.JwA r10 = new X.JwA
            r10.<init>((java.lang.Integer) r3, (int) r1, (int) r0)
            goto L_0x23a4
        L_0x240a:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x239d
        L_0x240d:
            java.lang.Object r1 = A01(r7, r2, r9, r8)
            goto L_0x2f27
        L_0x2413:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r8 = 1
            if (r0 == 0) goto L_0x2421
            if (r0 == r8) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x2421:
            X.02o r9 = A02(r6, r2)
            java.lang.Object r7 = r2.A02
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            java.lang.String[] r7 = (java.lang.String[]) r7
            int r6 = r7.length
            r5 = 0
            r4 = 0
        L_0x242e:
            if (r5 >= r6) goto L_0x24b4
            r0 = r7[r5]
            int r14 = r4 + 1
            int r0 = r0.length()
            if (r0 != 0) goto L_0x2452
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x243c:
            r0 = 21
            X.JwA r10 = new X.JwA
            r10.<init>((int) r0, (java.lang.Integer) r1)
        L_0x2443:
            java.lang.Object r0 = r2.A03
            X.U8s r0 = (X.C14782U8s) r0
            X.05G[] r0 = r0.A0G
            r0 = r0[r4]
            r0.Epw(r10)
            int r5 = r5 + 1
            r4 = r14
            goto L_0x242e
        L_0x2452:
            java.lang.Object r0 = r2.A03
            X.U8s r0 = (X.C14782U8s) r0
            X.05G[] r11 = r0.A0F
            r0 = r11[r4]
            java.lang.Object r13 = r0.getValue()
            int r10 = r11.length
            java.util.ArrayList r3 = X.DbS.A0v(r10)
            r1 = 0
        L_0x2464:
            if (r1 >= r10) goto L_0x2472
            r0 = r11[r1]
            java.lang.Object r0 = r0.getValue()
            r3.add(r0)
            int r1 = r1 + 1
            goto L_0x2464
        L_0x2472:
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r11 = r3.iterator()
            r10 = 0
        L_0x247b:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x2496
            java.lang.Object r3 = r11.next()
            int r1 = r10 + 1
            if (r10 < 0) goto L_0x24ac
            if (r10 == r4) goto L_0x2494
            boolean r0 = X.0qQ.A0K(r3, r13)
            if (r0 == 0) goto L_0x2494
            r12.add(r3)
        L_0x2494:
            r10 = r1
            goto L_0x247b
        L_0x2496:
            boolean r0 = X.AnonymousClass7TE.A1b(r12)
            if (r0 == 0) goto L_0x24a9
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            r1 = 2131964802(0x7f133382, float:1.9566396E38)
            r0 = 21
            X.JwA r10 = new X.JwA
            r10.<init>((java.lang.Integer) r3, (int) r1, (int) r0)
            goto L_0x2443
        L_0x24a9:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x243c
        L_0x24ac:
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x24b4:
            java.lang.Object r1 = A01(r7, r2, r9, r8)
            goto L_0x2f27
        L_0x24ba:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r1 = 1
            if (r0 == 0) goto L_0x24c8
            if (r0 == r1) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x24c8:
            X.0eS.A00(r6)
            java.lang.Object r3 = r2.A02
            X.02o r3 = (X.02o) r3
            java.lang.Object r4 = r2.A03
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r0 = 0
            r5 = r4[r0]
            r6 = r4[r1]
            r0 = 2
            r7 = r4[r0]
            r0 = 3
            r8 = r4[r0]
            r0 = 4
            r9 = r4[r0]
            r0 = 5
            r10 = r4[r0]
            java.lang.Object r4 = r2.A01
            X.0sH r4 = (X.0sH) r4
            java.lang.Object r0 = r4.invoke(r5, r6, r7, r8, r9, r10)
            java.lang.Object r1 = A01(r0, r2, r3, r1)
            goto L_0x2f27
        L_0x24f2:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r1 = 1
            if (r0 == 0) goto L_0x2500
            if (r0 == r1) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x2500:
            X.0eS.A00(r6)
            java.lang.Object r3 = r2.A02
            X.02o r3 = (X.02o) r3
            java.lang.Object r4 = r2.A03
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r0 = 0
            r5 = r4[r0]
            r6 = r4[r1]
            r0 = 2
            r7 = r4[r0]
            r0 = 3
            r8 = r4[r0]
            r0 = 4
            r9 = r4[r0]
            r0 = 5
            r10 = r4[r0]
            r0 = 6
            r11 = r4[r0]
            r0 = 7
            r12 = r4[r0]
            java.lang.Object r4 = r2.A01
            X.0sF r4 = (X.0sF) r4
            java.lang.Object r0 = r4.invoke(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r1 = A01(r0, r2, r3, r1)
            goto L_0x2f27
        L_0x2530:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r1 = 1
            if (r0 == 0) goto L_0x253e
            if (r0 == r1) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x253e:
            X.0eS.A00(r6)
            java.lang.Object r3 = r2.A02
            X.02o r3 = (X.02o) r3
            java.lang.Object r4 = r2.A03
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r0 = 0
            r5 = r4[r0]
            r6 = r4[r1]
            r0 = 2
            r7 = r4[r0]
            r0 = 3
            r8 = r4[r0]
            r0 = 4
            r9 = r4[r0]
            r0 = 5
            r10 = r4[r0]
            r0 = 6
            r11 = r4[r0]
            r0 = 7
            r12 = r4[r0]
            r0 = 8
            r13 = r4[r0]
            java.lang.Object r4 = r2.A01
            X.0sE r4 = (X.0sE) r4
            java.lang.Object r0 = r4.invoke(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r1 = A01(r0, r2, r3, r1)
            goto L_0x2f27
        L_0x2572:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r5 = 1
            if (r0 == 0) goto L_0x2580
            if (r0 == r5) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x2580:
            X.02o r4 = A02(r6, r2)
            java.lang.Object r3 = r2.A02
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r2.A03
            X.Jhq r0 = (X.C60233Jhq) r0
            X.LQd r1 = r0.A01
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.05G r0 = X.C64141LQd.A00(r1, r3)
            r2.A00 = r5
            java.lang.Object r1 = X.AnonymousClass11O.A02(r2, r0, r4)
            goto L_0x2f27
        L_0x259e:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r4 = 1
            if (r0 == 0) goto L_0x25ac
            if (r0 == r4) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x25ac:
            X.02o r3 = A02(r6, r2)
            java.lang.Object r0 = r2.A03
            X.JhD r0 = (X.C60194JhD) r0
            X.05G r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            X.LR6 r0 = (X.LR6) r0
            if (r0 == 0) goto L_0x25c3
            java.lang.String r1 = r0.A00
            r0 = 1
            if (r1 != 0) goto L_0x25c4
        L_0x25c3:
            r0 = 0
        L_0x25c4:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object r1 = A01(r0, r2, r3, r4)
            goto L_0x2f27
        L_0x25ce:
            int r0 = r2.A00
            r5 = 1
            if (r0 == 0) goto L_0x25da
            if (r0 == r5) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x25da:
            X.0eS.A00(r6)
            java.lang.Object r0 = r2.A01
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Object r6 = r2.A02
            java.util.Set r6 = (java.util.Set) r6
            if (r0 == 0) goto L_0x2f8e
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r0.iterator()
        L_0x25ef:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x25f9
            X.C61064Jw2.A00(r3, r1)
            goto L_0x25ef
        L_0x25f9:
            boolean r0 = X.DbT.A1b(r3)
            if (r0 != r5) goto L_0x2f8e
            java.lang.Object r0 = r2.A03
            X.Jj0 r0 = (X.C60302Jj0) r0
            com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository r4 = r0.A05
            X.L9O r0 = r0.A08
            X.0Ud r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x2623
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r0.iterator()
        L_0x2619:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x2626
            X.C61064Jw2.A00(r3, r1)
            goto L_0x2619
        L_0x2623:
            X.0sl r1 = X.0sl.A00
            goto L_0x262a
        L_0x2626:
            java.util.Set r1 = X.00k.A0k(r3)
        L_0x262a:
            r0 = 0
            r2.A01 = r0
            r2.A00 = r5
            r4.A06(r1, r6, r2)
            goto L_0x2f8e
        L_0x2634:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r1 = 1
            if (r0 == 0) goto L_0x2642
            if (r0 == r1) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x2642:
            X.02o r3 = A02(r6, r2)
            java.lang.Object r4 = r2.A02
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Boolean[] r4 = (java.lang.Boolean[]) r4
            r0 = 0
            r5 = r4[r0]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Boolean"
            X.0qQ.A0C(r5, r0)
            boolean r13 = r5.booleanValue()
            boolean r12 = A04(r4, r1)
            r0 = 2
            boolean r11 = A04(r4, r0)
            r0 = 3
            boolean r10 = A04(r4, r0)
            r0 = 4
            boolean r9 = A04(r4, r0)
            r0 = 5
            boolean r8 = A04(r4, r0)
            r0 = 6
            boolean r7 = A04(r4, r0)
            r0 = 7
            boolean r6 = A04(r4, r0)
            r0 = 8
            boolean r5 = A04(r4, r0)
            if (r12 == 0) goto L_0x276a
            if (r6 != 0) goto L_0x276a
            if (r13 == 0) goto L_0x268e
            java.lang.Object r0 = r2.A03
            X.Jgq r0 = (X.C60171Jgq) r0
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x276a
        L_0x268e:
            if (r8 != 0) goto L_0x276a
            if (r7 != 0) goto L_0x276a
            if (r9 == 0) goto L_0x2766
            java.lang.Integer r18 = X.AnonymousClass05K.A01
        L_0x2696:
            if (r13 == 0) goto L_0x26a0
            java.lang.Object r0 = r2.A03
            X.Jgq r0 = (X.C60171Jgq) r0
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x2770
        L_0x26a0:
            if (r9 == 0) goto L_0x26aa
            java.lang.Object r0 = r2.A03
            X.Jgq r0 = (X.C60171Jgq) r0
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x2770
        L_0x26aa:
            if (r8 != 0) goto L_0x2770
            if (r7 != 0) goto L_0x2770
            java.lang.Object r0 = r2.A03
            X.Jgq r0 = (X.C60171Jgq) r0
            X.6go r4 = r0.A01
            X.6go r0 = X.C313666go.VIEWER
            if (r4 == r0) goto L_0x2770
            X.6go r0 = X.C313666go.GUEST
            if (r4 != r0) goto L_0x26be
            if (r5 == 0) goto L_0x2770
        L_0x26be:
            r19 = 1
        L_0x26c0:
            if (r13 == 0) goto L_0x26ca
            java.lang.Object r0 = r2.A03
            X.Jgq r0 = (X.C60171Jgq) r0
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x26da
        L_0x26ca:
            if (r9 == 0) goto L_0x26d4
            java.lang.Object r0 = r2.A03
            X.Jgq r0 = (X.C60171Jgq) r0
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x26da
        L_0x26d4:
            if (r8 != 0) goto L_0x26da
            r20 = 1
            if (r7 == 0) goto L_0x26de
        L_0x26da:
            r20 = 0
            if (r12 == 0) goto L_0x26fe
        L_0x26de:
            if (r13 == 0) goto L_0x26e8
            java.lang.Object r0 = r2.A03
            X.Jgq r0 = (X.C60171Jgq) r0
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x26fe
        L_0x26e8:
            if (r9 == 0) goto L_0x26f2
            java.lang.Object r0 = r2.A03
            X.Jgq r0 = (X.C60171Jgq) r0
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x26fe
        L_0x26f2:
            if (r11 == 0) goto L_0x26f6
            if (r10 != 0) goto L_0x26fe
        L_0x26f6:
            if (r6 != 0) goto L_0x26fe
            if (r8 != 0) goto L_0x26fe
            r21 = 1
            if (r7 == 0) goto L_0x2702
        L_0x26fe:
            r21 = 0
            if (r12 == 0) goto L_0x2722
        L_0x2702:
            if (r13 == 0) goto L_0x270c
            java.lang.Object r0 = r2.A03
            X.Jgq r0 = (X.C60171Jgq) r0
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x2722
        L_0x270c:
            if (r9 == 0) goto L_0x2716
            java.lang.Object r0 = r2.A03
            X.Jgq r0 = (X.C60171Jgq) r0
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x2722
        L_0x2716:
            if (r11 == 0) goto L_0x271a
            if (r10 != 0) goto L_0x2722
        L_0x271a:
            if (r6 != 0) goto L_0x2722
            if (r8 != 0) goto L_0x2722
            r22 = 1
            if (r7 == 0) goto L_0x2726
        L_0x2722:
            r22 = 0
            if (r12 == 0) goto L_0x2742
        L_0x2726:
            if (r13 == 0) goto L_0x2730
            java.lang.Object r0 = r2.A03
            X.Jgq r0 = (X.C60171Jgq) r0
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x2742
        L_0x2730:
            if (r9 == 0) goto L_0x273a
            java.lang.Object r0 = r2.A03
            X.Jgq r0 = (X.C60171Jgq) r0
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x2742
        L_0x273a:
            if (r6 != 0) goto L_0x2742
            if (r8 != 0) goto L_0x2742
            r23 = 1
            if (r7 == 0) goto L_0x2748
        L_0x2742:
            r23 = 0
            if (r12 == 0) goto L_0x275f
            if (r6 != 0) goto L_0x275f
        L_0x2748:
            r24 = 1
        L_0x274a:
            if (r8 != 0) goto L_0x2750
            r25 = 1
            if (r7 == 0) goto L_0x2752
        L_0x2750:
            r25 = 0
        L_0x2752:
            X.JtD r0 = new X.JtD
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r1 = A01(r0, r2, r3, r1)
            goto L_0x2f27
        L_0x275f:
            r24 = 0
            if (r12 == 0) goto L_0x2750
            if (r6 != 0) goto L_0x2750
            goto L_0x274a
        L_0x2766:
            java.lang.Integer r18 = X.AnonymousClass05K.A0C
            goto L_0x2696
        L_0x276a:
            java.lang.Integer r18 = X.AnonymousClass05K.A00
            if (r12 == 0) goto L_0x2770
            goto L_0x2696
        L_0x2770:
            r19 = 0
            if (r12 == 0) goto L_0x26da
            goto L_0x26c0
        L_0x2776:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r3 = 1
            if (r0 == 0) goto L_0x2784
            if (r0 == r3) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x2784:
            X.02o r10 = A02(r6, r2)
            java.lang.Object r4 = r2.A02
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r14 = 0
            r8 = r4[r14]
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.video.live.mvvm.model.repository.core.IgLiveStateRepository.IgLiveStreamingState"
            X.0qQ.A0C(r8, r0)
            r0 = r4[r3]
            boolean r13 = X.JTQ.A1W(r0)
            r0 = 2
            boolean r5 = X.JTR.A1b(r4, r0)
            r0 = 4
            r1 = r4[r0]
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.video.live.mvvm.model.domainmodel.IgLiveCommentsState"
            X.0qQ.A0C(r1, r0)
            X.Jvg r1 = (X.C61042Jvg) r1
            r0 = 5
            r6 = r4[r0]
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.video.live.mvvm.viewmodel.composer.IgLiveComposerViewModel.ComposerState"
            X.0qQ.A0C(r6, r0)
            X.Jv6 r6 = (X.C61007Jv6) r6
            r0 = 6
            r4 = r4[r0]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            float r12 = X.C51970G9q.A04(r4, r0)
            r24 = r5 ^ 1
            boolean r7 = r6.A03
            if (r7 == 0) goto L_0x27c8
            boolean r0 = r6.A02
            r25 = 0
            if (r0 == 0) goto L_0x27ca
        L_0x27c8:
            r25 = 1
        L_0x27ca:
            java.lang.Object r5 = r2.A03
            X.Jio r5 = (X.C60291Jio) r5
            X.6go r9 = r5.A05
            X.6go r4 = X.C313666go.BROADCASTER
            if (r9 != r4) goto L_0x27dc
            if (r7 != 0) goto L_0x27dc
            boolean r0 = r5.A0G
            r26 = 1
            if (r0 == 0) goto L_0x27de
        L_0x27dc:
            r26 = 0
        L_0x27de:
            boolean r11 = r5.A0G
            r0 = 2131965290(0x7f13356a, float:1.9567386E38)
            if (r11 == 0) goto L_0x27e8
            r0 = 2131965364(0x7f1335b4, float:1.9567536E38)
        L_0x27e8:
            X.GKO r18 = X.JTP.A0Q(r0)
            if (r13 == 0) goto L_0x27f8
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x27f8
            boolean r0 = r1.A01
            r28 = 1
            if (r0 == 0) goto L_0x27fa
        L_0x27f8:
            r28 = 0
        L_0x27fa:
            X.Kh5 r0 = X.C62515Kh5.INTERRUPTED
            boolean r29 = X.C51969G9p.A1a(r8, r0)
            if (r9 != r4) goto L_0x2806
            r30 = 0
            if (r8 == r0) goto L_0x2808
        L_0x2806:
            r30 = 1
        L_0x2808:
            java.lang.String r4 = r6.A01
            if (r4 == 0) goto L_0x2812
            int r0 = r4.length()
            if (r0 != 0) goto L_0x2813
        L_0x2812:
            r14 = 1
        L_0x2813:
            r31 = r14 ^ 1
            boolean r11 = r6.A02
            boolean r9 = r6.A04
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x2824
            boolean r8 = r1.A01
            r22 = 2131965217(0x7f133521, float:1.9567238E38)
            if (r8 == 0) goto L_0x2827
        L_0x2824:
            r22 = 2131956419(0x7f1312c3, float:1.9549393E38)
        L_0x2827:
            java.lang.Object r6 = r6.A00
            X.M0V r6 = (X.M0V) r6
            if (r6 == 0) goto L_0x285f
            com.instagram.user.model.User r6 = r6.A08
            if (r6 == 0) goto L_0x285f
            java.lang.String r19 = r6.getUsername()
        L_0x2835:
            android.content.Context r5 = r5.A00
            int r23 = X.2Yu.A0A(r5)
            r21 = 1065353216(0x3f800000, float:1.0)
            float r21 = r21 - r12
            if (r0 != 0) goto L_0x285c
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x285c
        L_0x2845:
            X.GmG r0 = new X.GmG
            r20 = r4
            r27 = r7
            r32 = r7
            r33 = r11
            r34 = r9
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            java.lang.Object r1 = A01(r0, r2, r10, r3)
            goto L_0x2f27
        L_0x285c:
            java.lang.String r4 = ""
            goto L_0x2845
        L_0x285f:
            r19 = 0
            goto L_0x2835
        L_0x2862:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r11 = 1
            if (r0 == 0) goto L_0x2870
            if (r0 == r11) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x2870:
            X.02o r15 = A02(r6, r2)
            java.lang.Object r6 = r2.A02
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            r0 = 0
            r3 = r6[r0]
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.video.live.mvvm.viewmodel.header.bottomsheet.IgLiveUnifiedHeaderFragmentViewModel.ViewerListState"
            X.0qQ.A0C(r3, r0)
            X.Jv0 r3 = (X.Jv0) r3
            r5 = r6[r11]
            X.JvD r5 = (X.C61013JvD) r5
            r0 = 2
            r0 = r6[r0]
            X.Juh r0 = (X.C60985Juh) r0
            r1 = 3
            r4 = r6[r1]
            java.util.Set r4 = (java.util.Set) r4
            r1 = 4
            r7 = r6[r1]
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.Set<com.instagram.user.model.User>"
            X.0qQ.A0C(r7, r1)
            java.util.Set r7 = (java.util.Set) r7
            r1 = 5
            r1 = r6[r1]
            boolean r19 = X.JTQ.A1W(r1)
            r1 = 6
            boolean r18 = X.JTR.A1b(r6, r1)
            if (r4 == 0) goto L_0x28eb
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r4.iterator()
        L_0x28b0:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x28d1
            java.lang.Object r6 = r9.next()
            r1 = r6
            X.Jw2 r1 = (X.C61064Jw2) r1
            java.lang.Object r4 = r1.A01
            if (r4 == 0) goto L_0x28b0
            if (r5 == 0) goto L_0x28b0
            com.instagram.user.model.User r1 = r5.A05
            if (r1 == 0) goto L_0x28b0
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x28b0
            r8.add(r6)
            goto L_0x28b0
        L_0x28d1:
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0p(r8)
            java.util.Iterator r4 = r8.iterator()
        L_0x28d9:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x28f5
            java.lang.Object r1 = r4.next()
            X.Jw2 r1 = (X.C61064Jw2) r1
            java.lang.Object r1 = r1.A01
            r6.add(r1)
            goto L_0x28d9
        L_0x28eb:
            if (r0 == 0) goto L_0x28f2
            java.util.Set r6 = r0.A0A
            if (r6 == 0) goto L_0x28f2
            goto L_0x28f9
        L_0x28f2:
            X.0sl r6 = X.0sl.A00
            goto L_0x28f9
        L_0x28f5:
            java.util.Set r6 = X.00k.A0k(r6)
        L_0x28f9:
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r12 = r6.iterator()
        L_0x2901:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x2938
            java.lang.Object r8 = r12.next()
            r9 = r8
            com.instagram.user.model.User r9 = (com.instagram.user.model.User) r9
            if (r5 == 0) goto L_0x2901
            java.util.List r1 = r5.A0E
            if (r1 == 0) goto L_0x2901
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r1)
            java.util.Iterator r10 = r1.iterator()
        L_0x291c:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x292e
            java.lang.Object r1 = r10.next()
            X.L7H r1 = (X.L7H) r1
            java.lang.String r1 = r1.A01
            r4.add(r1)
            goto L_0x291c
        L_0x292e:
            boolean r1 = X.JTQ.A1T(r9, r4)
            if (r1 != r11) goto L_0x2901
            r14.add(r8)
            goto L_0x2901
        L_0x2938:
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r12 = r6.iterator()
        L_0x2940:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x2977
            java.lang.Object r8 = r12.next()
            r9 = r8
            com.instagram.user.model.User r9 = (com.instagram.user.model.User) r9
            if (r5 == 0) goto L_0x2940
            java.util.List r1 = r5.A0E
            if (r1 == 0) goto L_0x2940
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r1)
            java.util.Iterator r10 = r1.iterator()
        L_0x295b:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x296d
            java.lang.Object r1 = r10.next()
            X.L7H r1 = (X.L7H) r1
            java.lang.String r1 = r1.A01
            r4.add(r1)
            goto L_0x295b
        L_0x296d:
            boolean r1 = X.JTQ.A1T(r9, r4)
            if (r1 != 0) goto L_0x2940
            r13.add(r8)
            goto L_0x2940
        L_0x2977:
            if (r5 == 0) goto L_0x29ae
            java.util.List r1 = r5.A0E
            if (r1 == 0) goto L_0x29ae
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r17 = r1.iterator()
        L_0x2985:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x29b0
            java.lang.Object r4 = r17.next()
            r9 = r4
            X.L7H r9 = (X.L7H) r9
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r6)
            java.util.Iterator r1 = r6.iterator()
        L_0x299a:
            boolean r12 = r1.hasNext()
            if (r12 == 0) goto L_0x29a4
            X.DbY.A1W(r8, r1)
            goto L_0x299a
        L_0x29a4:
            java.lang.String r1 = r9.A01
            boolean r1 = X.00k.A0u(r8, r1)
            X.DbV.A1U(r4, r10, r1)
            goto L_0x2985
        L_0x29ae:
            X.0sn r10 = X.0sn.A00
        L_0x29b0:
            java.util.List r1 = r3.A00
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r17 = r1.iterator()
        L_0x29ba:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x2a33
            java.lang.Object r8 = r17.next()
            r9 = r8
            com.instagram.user.model.User r9 = (com.instagram.user.model.User) r9
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0p(r14)
            java.util.Iterator r1 = r14.iterator()
        L_0x29cf:
            boolean r12 = r1.hasNext()
            if (r12 == 0) goto L_0x29d9
            X.DbY.A1W(r6, r1)
            goto L_0x29cf
        L_0x29d9:
            boolean r1 = X.JTQ.A1T(r9, r6)
            if (r1 != 0) goto L_0x29ba
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0p(r13)
            java.util.Iterator r1 = r13.iterator()
        L_0x29e7:
            boolean r12 = r1.hasNext()
            if (r12 == 0) goto L_0x29f1
            X.DbY.A1W(r6, r1)
            goto L_0x29e7
        L_0x29f1:
            boolean r1 = X.JTQ.A1T(r9, r6)
            if (r1 != 0) goto L_0x29ba
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0p(r7)
            java.util.Iterator r1 = r7.iterator()
        L_0x29ff:
            boolean r12 = r1.hasNext()
            if (r12 == 0) goto L_0x2a09
            X.DbY.A1W(r6, r1)
            goto L_0x29ff
        L_0x2a09:
            boolean r1 = X.JTQ.A1T(r9, r6)
            if (r1 != 0) goto L_0x29ba
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0p(r10)
            java.util.Iterator r12 = r10.iterator()
        L_0x2a17:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x2a29
            java.lang.Object r1 = r12.next()
            X.L7H r1 = (X.L7H) r1
            java.lang.String r1 = r1.A01
            r6.add(r1)
            goto L_0x2a17
        L_0x2a29:
            boolean r1 = X.JTQ.A1T(r9, r6)
            if (r1 != 0) goto L_0x29ba
            r4.add(r8)
            goto L_0x29ba
        L_0x2a33:
            if (r5 == 0) goto L_0x2a6e
            com.instagram.user.model.User r9 = r5.A05
        L_0x2a37:
            java.util.List r28 = X.00k.A0a(r7)
            boolean r1 = r3.A02
            if (r1 == 0) goto L_0x2a64
            X.JXP r20 = X.JXP.LOADING
        L_0x2a41:
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r4.iterator()
        L_0x2a49:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x2a70
            java.lang.Object r6 = r7.next()
            r1 = r6
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            X.4Cl r1 = r1.A03
            com.instagram.api.schemas.IGLiveModeratorStatus r3 = r1.BNL()
            com.instagram.api.schemas.IGLiveModeratorStatus r1 = com.instagram.api.schemas.IGLiveModeratorStatus.ACTIVE
            if (r3 == r1) goto L_0x2a49
            r8.add(r6)
            goto L_0x2a49
        L_0x2a64:
            boolean r1 = r3.A01
            if (r1 == 0) goto L_0x2a6b
            X.JXP r20 = X.JXP.ERROR
            goto L_0x2a41
        L_0x2a6b:
            X.JXP r20 = X.JXP.LOADED
            goto L_0x2a41
        L_0x2a6e:
            r9 = 0
            goto L_0x2a37
        L_0x2a70:
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r6 = r4.iterator()
        L_0x2a78:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x2a93
            java.lang.Object r4 = r6.next()
            r1 = r4
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            X.4Cl r1 = r1.A03
            com.instagram.api.schemas.IGLiveModeratorStatus r3 = r1.BNL()
            com.instagram.api.schemas.IGLiveModeratorStatus r1 = com.instagram.api.schemas.IGLiveModeratorStatus.ACTIVE
            if (r3 != r1) goto L_0x2a78
            r7.add(r4)
            goto L_0x2a78
        L_0x2a93:
            if (r5 == 0) goto L_0x2b04
            java.lang.String r6 = r5.A07
        L_0x2a97:
            java.lang.Object r3 = r2.A03
            X.JiE r3 = (X.C60257JiE) r3
            X.6go r1 = r3.A03
            X.6go r4 = X.C313666go.BROADCASTER
            if (r1 != r4) goto L_0x2aa7
            if (r19 != 0) goto L_0x2aa7
            r32 = 1
            if (r18 == 0) goto L_0x2aa9
        L_0x2aa7:
            r32 = 0
        L_0x2aa9:
            if (r0 == 0) goto L_0x2afe
            X.L7F r4 = r0.A05
            if (r4 == 0) goto L_0x2afe
            java.lang.String r5 = r4.A00
        L_0x2ab1:
            X.L7F r0 = r0.A05
            if (r0 == 0) goto L_0x2b02
            java.lang.String r4 = r0.A02
        L_0x2ab7:
            X.6go r0 = X.C313666go.VIEWER
            if (r1 != r0) goto L_0x2afb
            com.instagram.common.session.UserSession r12 = r3.A01
            X.0Tu r3 = X.0Tu.A05
            r0 = 36325699518215316(0x810e0800003494, double:3.0358568749461745E-306)
            boolean r1 = X.182.A06(r3, r12, r0)
            r0 = 2131963908(0x7f133004, float:1.9564583E38)
            if (r1 == 0) goto L_0x2ad0
            r0 = 2131963909(0x7f133005, float:1.9564585E38)
        L_0x2ad0:
            java.lang.Integer r0 = X.JTO.A0w(r0)
            int r0 = r0.intValue()
            X.GKO r21 = X.JTP.A0Q(r0)
        L_0x2adc:
            X.Jua r0 = new X.Jua
            r22 = r9
            r23 = r6
            r24 = r5
            r25 = r4
            r26 = r14
            r27 = r13
            r29 = r10
            r30 = r8
            r31 = r7
            r19 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            java.lang.Object r1 = A01(r0, r2, r15, r11)
            goto L_0x2f27
        L_0x2afb:
            r21 = 0
            goto L_0x2adc
        L_0x2afe:
            r5 = 0
            if (r0 == 0) goto L_0x2b02
            goto L_0x2ab1
        L_0x2b02:
            r4 = 0
            goto L_0x2ab7
        L_0x2b04:
            r6 = 0
            goto L_0x2a97
        L_0x2b06:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r4 = 1
            if (r0 == 0) goto L_0x2b14
            if (r0 == r4) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x2b14:
            X.02o r7 = A02(r6, r2)
            java.lang.Object r3 = r2.A02
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r0 = 0
            r8 = r3[r0]
            X.JvD r8 = (X.C61013JvD) r8
            r1 = r3[r4]
            r0 = 17
            java.lang.String r9 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r9)
            r0 = 2
            r5 = r3[r0]
            X.Juh r5 = (X.C60985Juh) r5
            r0 = 3
            r1 = r3[r0]
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.video.live.mvvm.model.repository.core.IgLiveStateRepository.IgLiveStreamingState"
            X.0qQ.A0C(r1, r0)
            r0 = 4
            r6 = r3[r0]
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.video.live.mvvm.model.enums.IgLiveBroadcastState"
            X.0qQ.A0C(r6, r0)
            r0 = 5
            r0 = r3[r0]
            boolean r22 = X.JTQ.A1W(r0)
            r0 = 6
            boolean r24 = X.JTR.A1b(r3, r0)
            r0 = 7
            boolean r25 = X.JTR.A1b(r3, r0)
            r0 = 8
            boolean r28 = X.JTR.A1b(r3, r0)
            r0 = 9
            r0 = r3[r0]
            X.0qQ.A0C(r0, r9)
            long r10 = X.AnonymousClass7TE.A0R(r0)
            r0 = 10
            boolean r9 = X.JTR.A1b(r3, r0)
            X.Kh5 r0 = X.C62515Kh5.INTERRUPTED
            if (r1 != r0) goto L_0x2b7d
            java.lang.Object r0 = r2.A03
            X.Ji6 r0 = (X.C60249Ji6) r0
            X.W0T r0 = r0.A02
            if (r0 == 0) goto L_0x2b7d
            boolean r0 = r0.A0I()
            r23 = 1
            if (r0 == 0) goto L_0x2b7f
        L_0x2b7d:
            r23 = 0
        L_0x2b7f:
            X.Kj6 r3 = X.C62635Kj6.CONNECTING
            r0 = 0
            if (r6 == r3) goto L_0x2bee
            X.Kj6 r1 = X.C62635Kj6.CONNECTED_WAITING_FOR_COUNTDOWN
            if (r6 == r1) goto L_0x2bee
            if (r8 == 0) goto L_0x2bec
            X.3NV r9 = r8.A06
        L_0x2b8c:
            X.3NV r1 = X.AnonymousClass3NV.A07
            r8 = 0
            java.lang.Object[] r8 = new java.lang.Object[r8]
            if (r9 != r1) goto L_0x2be4
            r1 = 2131965369(0x7f1335b9, float:1.9567546E38)
            X.GKO r18 = X.DbS.A0Q(r8, r1)
        L_0x2b9a:
            java.lang.Object r1 = r2.A03
            X.Ji6 r1 = (X.C60249Ji6) r1
            boolean r1 = r1.A0C
            if (r1 == 0) goto L_0x2bda
            r20 = 2131165333(0x7f070095, float:1.794488E38)
            r8 = 3904(0xf40, float:5.47E-42)
            java.lang.String r19 = X.AnonymousClass000.A00(r8)
        L_0x2bab:
            if (r6 != r3) goto L_0x2bb1
            r26 = 1
            if (r1 == 0) goto L_0x2bb9
        L_0x2bb1:
            r26 = 0
            if (r6 != r3) goto L_0x2bb9
            r27 = 1
            if (r1 != 0) goto L_0x2bbb
        L_0x2bb9:
            r27 = 0
        L_0x2bbb:
            if (r5 == 0) goto L_0x2bbf
            java.lang.String r0 = r5.A07
        L_0x2bbf:
            java.lang.String r1 = "copyrighted_music_matched"
            boolean r0 = X.0qQ.A0K(r0, r1)
            r21 = 2131963943(0x7f133027, float:1.9564654E38)
            if (r0 == 0) goto L_0x2bcd
            r21 = 2131963918(0x7f13300e, float:1.9564603E38)
        L_0x2bcd:
            X.Gm5 r0 = new X.Gm5
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.Object r1 = A01(r0, r2, r7, r4)
            goto L_0x2f27
        L_0x2bda:
            r20 = 2131165504(0x7f070140, float:1.7945227E38)
            r8 = 5198(0x144e, float:7.284E-42)
            java.lang.String r19 = X.AnonymousClass000.A00(r8)
            goto L_0x2bab
        L_0x2be4:
            r1 = 2131965368(0x7f1335b8, float:1.9567544E38)
            X.GKO r18 = X.DbS.A0Q(r8, r1)
            goto L_0x2b9a
        L_0x2bec:
            r9 = r0
            goto L_0x2b8c
        L_0x2bee:
            java.lang.Object r8 = r2.A03
            X.Ji6 r8 = (X.C60249Ji6) r8
            boolean r1 = r8.A0C
            if (r1 == 0) goto L_0x2c08
            if (r9 == 0) goto L_0x2c05
            if (r6 != r3) goto L_0x2c05
            r1 = 0
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r1 = 2131965195(0x7f13350b, float:1.9567193E38)
            X.GKO r18 = X.DbS.A0Q(r8, r1)
            goto L_0x2b9a
        L_0x2c05:
            r18 = r0
            goto L_0x2b9a
        L_0x2c08:
            boolean r1 = r8.A0D
            if (r1 == 0) goto L_0x2c1e
            r8 = 1
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x2c14
            r10 = 1
        L_0x2c14:
            java.lang.String r1 = java.lang.String.valueOf(r10)
            X.GKw r18 = X.JUH.A00(r1)
            goto L_0x2b9a
        L_0x2c1e:
            r1 = 0
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r1 = 2131965195(0x7f13350b, float:1.9567193E38)
            X.GKO r18 = X.DbS.A0Q(r8, r1)
            goto L_0x2b9a
        L_0x2c2a:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r3 = 1
            if (r0 == 0) goto L_0x2c38
            if (r0 == r3) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x2c38:
            X.02o r4 = A02(r6, r2)
            java.lang.Object r8 = r2.A02
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            r12 = 0
            r0 = r8[r12]
            boolean r13 = X.JTQ.A1W(r0)
            r1 = r8[r3]
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.collections.Set<com.instagram.user.model.User>"
            X.0qQ.A0C(r1, r6)
            java.util.Set r1 = (java.util.Set) r1
            r0 = 2
            r5 = r8[r0]
            X.0qQ.A0C(r5, r6)
            java.util.Set r5 = (java.util.Set) r5
            r0 = 3
            boolean r10 = X.JTR.A1b(r8, r0)
            r0 = 4
            boolean r9 = X.JTR.A1b(r8, r0)
            r0 = 5
            r6 = r8[r0]
            java.lang.String r7 = "null cannot be cast to non-null type com.instagram.common.api.result.LoadingResult<com.instagram.user.userlist.api.user.UserListResponse, com.instagram.common.api.base.ApiError<com.instagram.user.userlist.api.user.UserListResponse>>"
            X.0qQ.A0C(r6, r7)
            X.MQ0 r6 = (X.MQ0) r6
            r0 = 6
            r8 = r8[r0]
            X.0qQ.A0C(r8, r7)
            X.MQ0 r8 = (X.MQ0) r8
            if (r10 != 0) goto L_0x2c79
            if (r9 != 0) goto L_0x2c79
            r12 = 1
        L_0x2c79:
            r7 = r6
            if (r13 == 0) goto L_0x2c7d
            r7 = r8
        L_0x2c7d:
            boolean r0 = X.C59678JTj.A01(r3, r7)
            if (r0 == 0) goto L_0x2cbd
            java.lang.Integer r7 = X.AnonymousClass05K.A0C
        L_0x2c85:
            boolean r0 = X.C59678JTj.A01(r3, r8)
            if (r0 == 0) goto L_0x2cba
            X.JTj r8 = (X.C59678JTj) r8
            java.lang.Object r0 = r8.A01
            X.7ax r0 = (X.C334247ax) r0
            java.util.List r8 = r0.getItems()
        L_0x2c95:
            boolean r0 = X.C59678JTj.A01(r3, r6)
            if (r0 == 0) goto L_0x2cb7
            X.JTj r6 = (X.C59678JTj) r6
            java.lang.Object r0 = r6.A01
            X.7ax r0 = (X.C334247ax) r0
            java.util.List r9 = r0.getItems()
        L_0x2ca5:
            java.util.ArrayList r10 = X.AnonymousClass7TF.A0p(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x2cad:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x2cc6
            X.DbY.A1W(r10, r1)
            goto L_0x2cad
        L_0x2cb7:
            X.0sn r9 = X.0sn.A00
            goto L_0x2ca5
        L_0x2cba:
            X.0sn r8 = X.0sn.A00
            goto L_0x2c95
        L_0x2cbd:
            boolean r0 = X.C59678JTj.A02(r7)
            java.lang.Integer r7 = X.JTP.A0j(r0)
            goto L_0x2c85
        L_0x2cc6:
            java.util.ArrayList r11 = X.AnonymousClass7TF.A0p(r5)
            java.util.Iterator r1 = r5.iterator()
        L_0x2cce:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x2cd8
            X.DbY.A1W(r11, r1)
            goto L_0x2cce
        L_0x2cd8:
            java.lang.Object r0 = r2.A03
            X.Kdb r0 = (X.C62303Kdb) r0
            boolean r14 = r0.A06
            X.LAq r6 = new X.LAq
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r1 = A01(r6, r2, r4, r3)
            goto L_0x2f27
        L_0x2ce9:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r10 = 1
            r5 = 0
            if (r0 == 0) goto L_0x2cf8
            if (r0 == r10) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x2cf8:
            X.02o r13 = A02(r6, r2)
            java.lang.Object r4 = r2.A02
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r28 = 0
            r1 = r4[r5]
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x2e5f
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x2e5f
            boolean r27 = r1.booleanValue()
        L_0x2d10:
            r1 = r4[r10]
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x2e5c
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x2e5c
            boolean r6 = r1.booleanValue()
        L_0x2d1e:
            r0 = 2
            r1 = r4[r0]
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x2e58
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x2e58
            boolean r17 = r1.booleanValue()
        L_0x2d2d:
            r0 = 3
            r1 = r4[r0]
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x2e55
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x2e55
            boolean r15 = r1.booleanValue()
        L_0x2d3c:
            r0 = 4
            r1 = r4[r0]
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x2e52
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x2e52
            boolean r3 = r1.booleanValue()
        L_0x2d4b:
            r0 = 5
            r1 = r4[r0]
            boolean r0 = r1 instanceof X.V4Y
            if (r0 == 0) goto L_0x2e4f
            X.V4Y r1 = (X.V4Y) r1
        L_0x2d54:
            boolean r0 = r1 instanceof X.K0R
            if (r0 == 0) goto L_0x2d5f
            r0 = r1
            X.K0R r0 = (X.K0R) r0
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x2d64
        L_0x2d5f:
            boolean r0 = r1 instanceof X.K0S
            r14 = 0
            if (r0 == 0) goto L_0x2d65
        L_0x2d64:
            r14 = 1
        L_0x2d65:
            java.lang.Object r4 = r2.A03
            X.Jiy r4 = (X.C60300Jiy) r4
            X.05G r12 = r4.A08
            X.6go r1 = r4.A02
            int r0 = r1.ordinal()
            if (r0 != r5) goto L_0x2e4b
            r0 = 2131165236(0x7f070034, float:1.7944683E38)
            java.lang.Integer r24 = X.JTO.A0w(r0)
        L_0x2d7a:
            if (r27 == 0) goto L_0x2e47
            r0 = 2131165207(0x7f070017, float:1.7944625E38)
            java.lang.Integer r25 = X.JTO.A0w(r0)
            X.6go r0 = X.C313666go.BROADCASTER
            if (r1 != r0) goto L_0x2d89
            r28 = 1
        L_0x2d89:
            X.05G r0 = r4.A0D
            boolean r0 = X.DbX.A1b(r0)
            r5 = r0 ^ 1
            r1 = 2131238549(0x7f081e95, float:1.809338E38)
            r0 = 2131967903(0x7f133f9f, float:1.9572685E38)
            if (r6 == 0) goto L_0x2d9f
            r1 = 2131238547(0x7f081e93, float:1.8093376E38)
            r0 = 2131975956(0x7f135f14, float:1.9589019E38)
        L_0x2d9f:
            java.lang.Integer r0 = X.JTO.A0w(r0)
            X.Jto r9 = new X.Jto
            r9.<init>(r0, r1, r10, r5)
            r5 = r14 ^ 1
            if (r17 != 0) goto L_0x2db1
            r1 = 2131238980(0x7f082044, float:1.8094254E38)
            if (r14 == 0) goto L_0x2e42
        L_0x2db1:
            r1 = 2131238976(0x7f082040, float:1.8094246E38)
            if (r17 != 0) goto L_0x2db8
            if (r14 == 0) goto L_0x2e42
        L_0x2db8:
            r0 = 2131973875(0x7f1356f3, float:1.9584798E38)
        L_0x2dbb:
            java.lang.Integer r0 = X.JTO.A0w(r0)
            r11 = 0
            X.Jto r8 = new X.Jto
            r8.<init>(r0, r1, r10, r5)
            if (r17 != 0) goto L_0x2dca
            r5 = 1
            if (r14 == 0) goto L_0x2dcb
        L_0x2dca:
            r5 = 0
        L_0x2dcb:
            r0 = 2131974863(0x7f135acf, float:1.9586802E38)
            if (r15 == 0) goto L_0x2dd3
            r0 = 2131974847(0x7f135abf, float:1.958677E38)
        L_0x2dd3:
            java.lang.Integer r1 = X.JTO.A0w(r0)
            r0 = 2131238726(0x7f081f46, float:1.8093739E38)
            X.Jto r7 = new X.Jto
            r7.<init>(r1, r0, r10, r5)
            if (r17 != 0) goto L_0x2de4
            r1 = 1
            if (r14 == 0) goto L_0x2de5
        L_0x2de4:
            r1 = 0
        L_0x2de5:
            com.instagram.common.session.UserSession r0 = r4.A00
            int r0 = X.C338887ih.A00(r0)
            X.Jto r6 = new X.Jto
            r6.<init>(r11, r0, r3, r1)
            if (r27 != 0) goto L_0x2df7
            boolean r0 = r4.A0H
            r3 = 1
            if (r0 != 0) goto L_0x2df8
        L_0x2df7:
            r3 = 0
        L_0x2df8:
            if (r17 != 0) goto L_0x2dfd
            r1 = 1
            if (r14 == 0) goto L_0x2dfe
        L_0x2dfd:
            r1 = 0
        L_0x2dfe:
            r0 = 2131238896(0x7f081ff0, float:1.8094084E38)
            X.Jto r5 = new X.Jto
            r5.<init>(r11, r0, r3, r1)
            if (r27 != 0) goto L_0x2e0d
            boolean r0 = r4.A0G
            r4 = 1
            if (r0 != 0) goto L_0x2e0e
        L_0x2e0d:
            r4 = 0
        L_0x2e0e:
            if (r17 != 0) goto L_0x2e13
            r3 = 1
            if (r14 == 0) goto L_0x2e14
        L_0x2e13:
            r3 = 0
        L_0x2e14:
            r1 = 2131238229(0x7f081d55, float:1.809273E38)
            X.Jto r0 = new X.Jto
            r0.<init>(r11, r1, r4, r3)
            r26 = -1020002304(0xffffffffc3340000, float:-180.0)
            if (r15 == 0) goto L_0x2e22
            r26 = 0
        L_0x2e22:
            X.JuZ r1 = new X.JuZ
            r18 = r9
            r19 = r8
            r20 = r7
            r21 = r6
            r22 = r5
            r23 = r0
            r29 = r27
            r17 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r12.Epw(r1)
            X.0gF r0 = X.C60340gF.A00
            java.lang.Object r1 = A01(r0, r2, r13, r10)
            goto L_0x2f27
        L_0x2e42:
            r0 = 2131963395(0x7f132e03, float:1.9563542E38)
            goto L_0x2dbb
        L_0x2e47:
            r25 = 0
            goto L_0x2d89
        L_0x2e4b:
            r24 = 0
            goto L_0x2d7a
        L_0x2e4f:
            r1 = 0
            goto L_0x2d54
        L_0x2e52:
            r3 = 0
            goto L_0x2d4b
        L_0x2e55:
            r15 = 0
            goto L_0x2d3c
        L_0x2e58:
            r17 = 0
            goto L_0x2d2d
        L_0x2e5c:
            r6 = 0
            goto L_0x2d1e
        L_0x2e5f:
            r27 = 0
            goto L_0x2d10
        L_0x2e63:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r3 = 1
            if (r0 == 0) goto L_0x2e71
            if (r0 == r3) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x2e71:
            X.02o r1 = A02(r6, r2)
            java.lang.Object r5 = r2.A02
            if (r5 != 0) goto L_0x2e83
            X.0rs r0 = X.C62190rs.A00
        L_0x2e7b:
            r2.A00 = r3
            java.lang.Object r1 = X.AnonymousClass11O.A02(r2, r0, r1)
            goto L_0x2f27
        L_0x2e83:
            java.lang.Object r6 = r2.A03
            r7 = 0
            r8 = 46
            r9 = 42
            X.MHK r4 = new X.MHK
            r4.<init>((java.lang.Object) r5, (java.lang.Object) r6, (X.AnonymousClass4D7) r7, (int) r8, (int) r9)
            X.032 r0 = X.AnonymousClass0Zq.A00(r4)
            goto L_0x2e7b
        L_0x2e94:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r9 = 1
            if (r0 == 0) goto L_0x2ea7
            if (r0 == r9) goto L_0x2ea2
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x2ea2:
            X.0eS.A00(r6)
            goto L_0x2f8e
        L_0x2ea7:
            X.02o r10 = A02(r6, r2)
            java.lang.Object r4 = r2.A02
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r0 = 0
            r1 = r4[r0]
            X.GVR r1 = (X.GVR) r1
            r8 = r4[r9]
            java.lang.Integer r8 = (java.lang.Integer) r8
            r0 = 2
            r7 = r4[r0]
            com.instagram.music.common.model.MusicDataSource r7 = (com.instagram.music.common.model.MusicDataSource) r7
            r0 = 3
            r0 = r4[r0]
            boolean r24 = X.JTQ.A1W(r0)
            r0 = 4
            r3 = r4[r0]
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            float r23 = X.C51970G9q.A04(r3, r0)
            r0 = 5
            boolean r25 = X.JTR.A1b(r4, r0)
            if (r1 == 0) goto L_0x2eda
            X.46i r6 = r1.A01()
            if (r6 != 0) goto L_0x2ee6
        L_0x2eda:
            java.lang.Object r0 = r2.A03
            X.Ghc r0 = (X.C53044Ghc) r0
            X.0eM r0 = r0.A0F
            java.lang.Object r6 = r0.getValue()
            X.46i r6 = (X.C2606046i) r6
        L_0x2ee6:
            if (r1 == 0) goto L_0x2f0f
            java.lang.String r5 = r1.A09
            java.util.List r0 = r1.A0B
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r12 = r0.iterator()
        L_0x2ef4:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x2f12
            java.lang.Object r0 = r12.next()
            X.N4G r0 = (X.N4G) r0
            int r11 = r0.A00
            java.lang.String r3 = r0.A01
            r1 = 19
            X.N4G r0 = new X.N4G
            r0.<init>((int) r11, (java.lang.String) r3, (int) r1)
            r4.add(r0)
            goto L_0x2ef4
        L_0x2f0f:
            r5 = 0
            X.0sn r4 = X.0sn.A00
        L_0x2f12:
            X.Glr r0 = new X.Glr
            r18 = r6
            r19 = r7
            r20 = r8
            r21 = r5
            r22 = r4
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r1 = A01(r0, r2, r10, r9)
        L_0x2f27:
            r0 = r16
            if (r1 != r0) goto L_0x2f8e
            return r16
        L_0x2f2c:
            X.1Hj r16 = X.1Hj.A02
            int r0 = r2.A00
            r9 = 2
            r4 = 0
            r8 = 1
            if (r0 == 0) goto L_0x2f99
            java.lang.Object r5 = r2.A02
            X.JvD r5 = (X.C61013JvD) r5
            java.lang.Object r7 = r2.A01
            X.Juh r7 = (X.C60985Juh) r7
            if (r0 == r8) goto L_0x2fd7
            X.0eS.A00(r6)
        L_0x2f42:
            java.lang.Object r0 = r2.A03
            X.JhX r0 = (X.C60214JhX) r0
            X.LF6 r8 = r0.A02
            if (r5 == 0) goto L_0x2f94
            java.lang.String r6 = r5.A08
            com.instagram.user.model.User r0 = r5.A05
            if (r0 == 0) goto L_0x2f95
            java.lang.String r3 = r0.getId()
        L_0x2f54:
            java.lang.String r4 = r5.A09
        L_0x2f56:
            java.util.Set r7 = r7.A09
            X.0wc r1 = r8.A01
            java.lang.String r0 = "ig_live_moderator_inform_user"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r2 = "0"
            if (r3 != 0) goto L_0x2f65
            r3 = r2
        L_0x2f65:
            X.JTQ.A14(r5, r3)
            if (r6 == 0) goto L_0x2f91
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r6)
            if (r0 == 0) goto L_0x2f91
            long r0 = r0.longValue()
        L_0x2f74:
            X.JTQ.A10(r5, r0)
            if (r4 != 0) goto L_0x2f7a
            r4 = r2
        L_0x2f7a:
            X.C51965G9l.A1I(r5, r4)
            X.0iw r0 = r8.A00
            X.C51969G9p.A1A(r5, r0)
            java.lang.String r0 = "viewer"
        L_0x2f84:
            X.JTO.A1R(r5, r0)
            java.util.List r0 = X.JTT.A0t(r7)
            X.JTQ.A16(r5, r0)
        L_0x2f8e:
            X.0gF r16 = X.C60340gF.A00
            return r16
        L_0x2f91:
            r0 = 0
            goto L_0x2f74
        L_0x2f94:
            r6 = r4
        L_0x2f95:
            r3 = r4
            if (r5 == 0) goto L_0x2f56
            goto L_0x2f54
        L_0x2f99:
            X.0eS.A00(r6)
            java.lang.Object r7 = r2.A01
            X.Juh r7 = (X.C60985Juh) r7
            java.lang.Object r5 = r2.A02
            X.JvD r5 = (X.C61013JvD) r5
            if (r7 == 0) goto L_0x2f8e
            boolean r0 = r7.A0D
            if (r0 != r8) goto L_0x302b
            java.lang.Object r1 = r2.A03
            X.JhX r1 = (X.C60214JhX) r1
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x2f8e
            r1.A01 = r8
            X.3ju r3 = r1.A03
            if (r5 == 0) goto L_0x2fd4
            com.instagram.user.model.User r0 = r5.A05
            if (r0 == 0) goto L_0x2fd4
            java.lang.String r1 = r0.getUsername()
        L_0x2fc0:
            X.KeG r0 = new X.KeG
            r0.<init>(r1)
            r2.A01 = r7
            r2.A02 = r5
            r2.A00 = r8
            java.lang.Object r1 = r3.ELH(r0, r2)
            r0 = r16
            if (r1 != r0) goto L_0x2fda
            return r16
        L_0x2fd4:
            java.lang.String r1 = "Host"
            goto L_0x2fc0
        L_0x2fd7:
            X.0eS.A00(r6)
        L_0x2fda:
            java.lang.Object r0 = r2.A03
            X.JhX r0 = (X.C60214JhX) r0
            X.LF6 r8 = r0.A02
            if (r5 == 0) goto L_0x3026
            java.lang.String r6 = r5.A08
            com.instagram.user.model.User r0 = r5.A05
            if (r0 == 0) goto L_0x3027
            java.lang.String r3 = r0.getId()
        L_0x2fec:
            java.lang.String r4 = r5.A09
        L_0x2fee:
            java.util.Set r7 = r7.A09
            X.0wc r1 = r8.A01
            java.lang.String r0 = "ig_live_moderator_notification"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r2 = "0"
            if (r3 != 0) goto L_0x2ffd
            r3 = r2
        L_0x2ffd:
            X.JTQ.A14(r5, r3)
            java.lang.String r0 = "impression"
            X.DbS.A1H(r5, r0)
            if (r6 == 0) goto L_0x3023
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r6)
            if (r0 == 0) goto L_0x3023
            long r0 = r0.longValue()
        L_0x3011:
            X.JTQ.A10(r5, r0)
            if (r4 != 0) goto L_0x3017
            r4 = r2
        L_0x3017:
            X.C51965G9l.A1I(r5, r4)
            X.0iw r0 = r8.A00
            X.C51969G9p.A1A(r5, r0)
            java.lang.String r0 = "moderator"
            goto L_0x2f84
        L_0x3023:
            r0 = 0
            goto L_0x3011
        L_0x3026:
            r6 = r4
        L_0x3027:
            r3 = r4
            if (r5 == 0) goto L_0x2fee
            goto L_0x2fec
        L_0x302b:
            if (r0 != 0) goto L_0x2f8e
            boolean r0 = r7.A0C
            if (r0 == 0) goto L_0x2f8e
            java.lang.Object r1 = r2.A03
            X.JhX r1 = (X.C60214JhX) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x2f8e
            r1.A00 = r8
            X.3ju r3 = r1.A03
            if (r5 == 0) goto L_0x305b
            com.instagram.user.model.User r0 = r5.A05
            if (r0 == 0) goto L_0x305b
            java.lang.String r1 = r0.getId()
        L_0x3047:
            X.KeF r0 = new X.KeF
            r0.<init>(r1)
            r2.A01 = r7
            r2.A02 = r5
            r2.A00 = r9
            java.lang.Object r1 = r3.ELH(r0, r2)
            r0 = r16
            if (r1 != r0) goto L_0x2f42
            return r16
        L_0x305b:
            r1 = r4
            goto L_0x3047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66194MHk.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static int A00(List list, List list2, int i) {
        C335047cI.A01((AnonymousClass9IV) list.get(i), C335857de.A04, list2);
        return i + 1;
    }

    public static 02o A02(Object obj, C66194MHk mHk) {
        0eS.A00(obj);
        return (02o) mHk.A01;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66194MHk(AnonymousClass4D7 r2, Object obj, int i) {
        super(3, r2);
        this.A04 = i;
        this.A01 = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66194MHk(Object obj, AnonymousClass4D7 r3, int i) {
        super(3, r3);
        this.A04 = i;
        this.A03 = obj;
    }
}
