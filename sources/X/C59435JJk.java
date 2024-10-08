package X;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import androidx.compose.ui.Modifier;

/* renamed from: X.JJk  reason: case insensitive filesystem */
public final class C59435JJk extends 0Yg implements 0sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59435JJk(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z) {
        super(4);
        this.A00 = i;
        this.A03 = obj;
        this.A06 = z;
        this.A01 = obj2;
        this.A05 = obj3;
        this.A02 = obj4;
        this.A04 = obj5;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        Modifier A002;
        0sP r1;
        C286565Wx A0H;
        J0O j0o;
        int i3;
        C286565Wx r12;
        Object obj5 = obj3;
        if (this.A00 != 0) {
            int A0M = AnonymousClass7TE.A0M(obj2);
            C286575Wy r10 = (C286575Wy) obj5;
            if (G9w.A1a(obj4)) {
                0fL.A01(-921346009, "com.instagram.friendmap.view.compose.FriendMapPagerBottomSheet.<anonymous>.<anonymous>.<anonymous> (FriendMapPagerBottomSheet.kt:97)");
            }
            int ordinal = ((HNM) C51966G9m.A19(this.A03, A0M)).ordinal();
            if (ordinal == 0) {
                r10.ExS(-2045309773);
                AnonymousClass62P r4 = ((C53544GqF) C51966G9m.A18(this.A04)).A01;
                r10.ExS(-2045308223);
                Object obj6 = this.A05;
                boolean AGw = r10.AGw(obj6);
                Object ECw = r10.ECw();
                if (AGw || ECw == AnonymousClass5XT.A00) {
                    ECw = new C58179Inj(obj6, 30);
                    r10.FLL(ECw);
                }
                r12 = C51965G9l.A0H(r10, false);
                C55021Has.A00(r10, (C62320sa) ECw, r4, 0);
            } else if (ordinal == 1) {
                r10.ExS(1020118147);
                r10.ExS(-2045301473);
                Object obj7 = this.A02;
                boolean AGw2 = r10.AGw(obj7);
                Object obj8 = this.A05;
                boolean A1U = C51966G9m.A1U(r10, obj8, AGw2);
                Object ECw2 = r10.ECw();
                if (A1U || ECw2 == AnonymousClass5XT.A00) {
                    ECw2 = new C58185Inp(9, obj7, obj8);
                    r10.FLL(ECw2);
                }
                r12 = C51965G9l.A0H(r10, false);
                C55022Hat.A00((C62320sa) ECw2, r10, 0);
            } else if (ordinal == 2) {
                r10.ExS(-2045291993);
                boolean z = this.A06;
                r10.ExS(-2045290350);
                Object obj9 = this.A02;
                boolean A1V = C51966G9m.A1V(r10, z, r10.AGw(obj9));
                Object obj10 = this.A01;
                boolean A1Z = C51965G9l.A1Z(r10, obj10, A1V);
                Object ECw3 = r10.ECw();
                if (A1Z || ECw3 == AnonymousClass5XT.A00) {
                    ECw3 = new GL3(17, obj10, obj9, z);
                    r10.FLL(ECw3);
                }
                r12 = C51965G9l.A0H(r10, false);
                C56318HwV.A00(r10, (C62320sa) ECw3, 0, 0, z);
            } else if (ordinal == 3 || ordinal == 4) {
                r10.ExS(-2045280091);
                boolean z2 = this.A06;
                r10.ExS(-2045278510);
                Object obj11 = this.A02;
                boolean A1V2 = C51966G9m.A1V(r10, z2, r10.AGw(obj11));
                Object obj12 = this.A01;
                boolean A1Z2 = C51965G9l.A1Z(r10, obj12, A1V2);
                Object ECw4 = r10.ECw();
                if (A1Z2 || ECw4 == AnonymousClass5XT.A00) {
                    ECw4 = new GL3(18, obj12, obj11, z2);
                    r10.FLL(ECw4);
                }
                r12 = C51965G9l.A0H(r10, false);
                C56318HwV.A01(r10, (C62320sa) ECw4, 0, 0, z2);
            } else {
                throw C51973G9u.A0n(r10, -2045311666);
            }
            if (C51967G9n.A1b(r12, false)) {
                i = -1399688162;
            }
            return C60340gF.A00;
        }
        int A0M2 = AnonymousClass7TE.A0M(obj2);
        C286575Wy r102 = (C286575Wy) obj5;
        int A0M3 = AnonymousClass7TE.A0M(obj4);
        if ((A0M3 & 6) == 0) {
            i2 = A0M3 | G9t.A0O(r102, obj);
        } else {
            i2 = A0M3;
        }
        int i4 = 48;
        if ((A0M3 & 48) == 0) {
            i2 |= G9t.A06(r102, A0M2);
        }
        if ((i2 & 147) != 146 || !r102.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(226798441, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)");
            }
            Object A19 = C51966G9m.A19(this.A03, A0M2);
            int A022 = C51965G9l.A02(i2);
            r102.ExS(-1286480116);
            boolean z3 = false;
            if (A19 instanceof C319916rR) {
                C285245Qk A0K = C51965G9l.A0K(r102, -1286506250);
                if (!this.A06) {
                    i4 = 24;
                }
                C289585dr.A00(r102, C51966G9m.A0X(C287205Zk.A08(C287205Zk.A0D(C287195Zj.A09(A0K, 8.0f, (float) i4), 1.0f), 28.0f), C51966G9m.A0K(r102)).Ezh(new LazyLayoutAnimateItemElement(C51976G9y.A0A())));
            } else if (A19 instanceof C319926rS) {
                r102.ExS(-1285996889);
                if (this.A06) {
                    r102.ExS(-1285989263);
                    A002 = ((Modifier) this.A01).Ezh(new LazyLayoutAnimateItemElement(C51976G9y.A0A()));
                    r1 = J0N.A00;
                    r102.ExS(1759640376);
                    Object obj13 = this.A05;
                    boolean AGu = r102.AGu(obj13);
                    Object obj14 = this.A02;
                    boolean A1U2 = C51966G9m.A1U(r102, obj14, AGu);
                    Object ECw5 = r102.ECw();
                    if (A1U2 || ECw5 == AnonymousClass5XT.A00) {
                        ECw5 = C59103J6l.A00(r102, obj14, obj13, 28);
                    }
                    j0o = (0sP) ECw5;
                    A0H = C51965G9l.A0H(r102, false);
                    i3 = 6;
                } else {
                    A002 = C51965G9l.A0K(r102, -1285279456).Ezh(new LazyLayoutAnimateItemElement(C51976G9y.A0A()));
                    r102.ExS(1759657973);
                    Object obj15 = this.A02;
                    boolean AGw3 = r102.AGw(obj15);
                    Object ECw6 = r102.ECw();
                    if (AGw3 || ECw6 == AnonymousClass5XT.A00) {
                        ECw6 = C51975G9x.A0w(r102, obj15, 45);
                    }
                    r1 = (0sP) ECw6;
                    A0H = C51965G9l.A0H(r102, false);
                    j0o = J0O.A00;
                    i3 = 384;
                }
                I63.A02(r102, A002, r1, j0o, i3, 0);
                C286565Wx.A0L(A0H, false);
            } else if (A19 instanceof C318826pb) {
                r102.ExS(-1284387462);
                boolean z4 = this.A06;
                C322946wf r13 = (C322946wf) this.A02;
                Modifier modifier = Modifier.A00;
                if (z4) {
                    modifier = (Modifier) this.A01;
                }
                I2K.A01(r102, modifier.Ezh(new LazyLayoutAnimateItemElement(C51976G9y.A0A())), r13, 0, z4);
            } else if (A19 instanceof C318806pZ) {
                Modifier A0K2 = C51965G9l.A0K(r102, -1284052817);
                Modifier modifier2 = A0K2;
                boolean z5 = this.A06;
                if (z5) {
                    A0K2 = (Modifier) this.A01;
                }
                r102.ExS(1759705481);
                Object obj16 = this.A04;
                boolean AGu2 = r102.AGu(obj16);
                int i5 = A022 & 112;
                if (((i5 ^ 48) > 32 && r102.AGs(A0M2)) || (A022 & 48) == 32) {
                    z3 = true;
                }
                boolean z6 = AGu2 | z3;
                Object ECw7 = r102.ECw();
                if (z6 || ECw7 == AnonymousClass5XT.A00) {
                    ECw7 = new C58735Iwi(A0M2, 6, obj16);
                    r102.FLL(ECw7);
                }
                C286565Wx A0G = C51965G9l.A0G(r102);
                Modifier A0W = C51970G9q.A0W(A0K2, (0sP) ECw7);
                Modifier A003 = modifier2.Ezh(new LazyLayoutAnimateItemElement(C51976G9y.A0A()));
                boolean A1Z3 = C51967G9n.A1Z(r102, A19, 1759697378);
                Object ECw8 = r102.ECw();
                if (A1Z3 || ECw8 == AnonymousClass5XT.A00) {
                    ECw8 = new MME(A19, 14);
                    r102.FLL(ECw8);
                }
                C286565Wx.A0I(A0G);
                I2K.A00(r102, A0W, A003, (C322946wf) this.A02, (C62320sa) ECw8, A0M2, i5, z5);
            } else {
                r102.ExS(1759712884);
            }
            if (C51967G9n.A1a(C51965G9l.A0G(r102))) {
                i = -2029317849;
            }
            return C60340gF.A00;
        }
        r102.Evl();
        return C60340gF.A00;
        0fL.A00(i);
        return C60340gF.A00;
    }
}
