package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5PJ  reason: invalid class name */
public final class AnonymousClass5PJ implements 0sL, 0sK, 0sJ, 0sI, 0sH, 0sG, 0sF, 0sE, 0sZ, 0sS, AnonymousClass0sY, AnonymousClass0sW, C62310sV, C62300sU, AnonymousClass0sT, AnonymousClass0sR, AnonymousClass0sQ, C62290sO, C62280sN {
    public C286635Xe A00;
    public Object A01;
    public List A02;
    public final int A03;
    public final boolean A04;

    public final Object A02(C286575Wy r9, Object obj, Object obj2, int i) {
        r9.ExV(this.A03);
        A00(r9);
        int i2 = 1;
        if (r9.AGu(this)) {
            i2 = 2;
        }
        int i3 = i;
        Object obj3 = this.A01;
        0qQ.A0C(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        0u4.A05(obj3, 4);
        Object obj4 = obj;
        Object obj5 = obj2;
        Object invoke = ((0sJ) obj3).invoke(obj, obj2, r9, Integer.valueOf((i2 << 7) | i));
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new AnonymousClass9MK(i3, 1, this, obj5, obj4);
        }
        return invoke;
    }

    public final Object A03(C286575Wy r15, Object obj, Object obj2, Object obj3, int i) {
        C286575Wy r12 = r15;
        r15.ExV(this.A03);
        A00(r15);
        int i2 = 1;
        if (r15.AGu(this)) {
            i2 = 2;
        }
        int i3 = i;
        Object obj4 = this.A01;
        0qQ.A0C(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        0u4.A05(obj4, 5);
        Object obj5 = obj;
        Object obj6 = obj2;
        Object obj7 = obj3;
        Object invoke = ((0sI) obj4).invoke(obj5, obj6, obj7, r12, Integer.valueOf((i2 << 10) | i));
        C286625Xd ASQ = r15.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new AnonymousClass9MV(this, obj5, obj6, obj7, i3, 0);
        }
        return invoke;
    }

    public final Object A04(C286575Wy r16, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        C286575Wy r7 = r16;
        r7.ExV(this.A03);
        A00(r7);
        int i2 = 1;
        if (r7.AGu(this)) {
            i2 = 2;
        }
        int i3 = i;
        Object obj5 = this.A01;
        0qQ.A0C(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        0u4.A05(obj5, 6);
        Object obj6 = obj;
        Object obj7 = obj2;
        Object obj8 = obj3;
        Object obj9 = obj4;
        Object invoke = ((0sH) obj5).invoke(obj6, obj7, obj8, obj9, r7, Integer.valueOf((i2 << 13) | i));
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J81(this, obj6, obj7, obj8, obj9, i3);
        }
        return invoke;
    }

    private final void A00(C286575Wy r6) {
        C286625Xd A0O;
        if (this.A04 && (A0O = ((C286565Wx) r6).A0O()) != null) {
            A0O.A01 |= 1;
            if (AnonymousClass5PI.A05(this.A00, A0O)) {
                this.A00 = A0O;
                return;
            }
            List list = this.A02;
            if (list == null) {
                list = new ArrayList();
                this.A02 = list;
            } else {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (AnonymousClass5PI.A05((C286635Xe) list.get(i), A0O)) {
                        list.set(i, A0O);
                        return;
                    }
                }
            }
            list.add(A0O);
        }
    }

    public final Object A01(C286575Wy r5, Object obj, int i) {
        r5.ExV(this.A03);
        A00(r5);
        int i2 = 1;
        if (r5.AGu(this)) {
            i2 = 2;
        }
        Object obj2 = this.A01;
        0qQ.A0C(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        0u4.A05(obj2, 3);
        Object invoke = ((0sK) obj2).invoke(obj, r5, Integer.valueOf((i2 << 4) | i));
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new AnonymousClass9M7(i, 1, obj, this);
        }
        return invoke;
    }

    public final Object A05(C286575Wy r19, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        C286575Wy r2 = r19;
        r2.ExV(this.A03);
        A00(r2);
        int i2 = 1;
        if (r2.AGu(this)) {
            i2 = 2;
        }
        int i3 = i;
        Object obj6 = this.A01;
        0qQ.A0C(obj6, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        0u4.A05(obj6, 7);
        Object obj7 = obj;
        Object obj8 = obj2;
        Object obj9 = obj3;
        Object obj10 = obj4;
        Object obj11 = obj5;
        Object invoke = ((0sG) obj6).invoke(obj7, obj8, obj9, obj10, obj11, r2, Integer.valueOf(i | (i2 << 16)));
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JA2(obj11, this, obj10, obj8, obj9, obj7, i3, 1);
        }
        return invoke;
    }

    public final Object A06(C286575Wy r22, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        C286575Wy r2 = r22;
        r2.ExV(this.A03);
        A00(r2);
        int i2 = 1;
        if (r2.AGu(this)) {
            i2 = 2;
        }
        int i3 = i;
        Object obj7 = this.A01;
        0qQ.A0C(obj7, "null cannot be cast to non-null type kotlin.Function8<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        0u4.A05(obj7, 8);
        Object obj8 = obj;
        Object obj9 = obj2;
        Object obj10 = obj3;
        Object obj11 = obj4;
        Object obj12 = obj5;
        Object obj13 = obj6;
        Object invoke = ((0sF) obj7).invoke(obj8, obj9, obj10, obj11, obj12, obj13, r2, Integer.valueOf(i | (i2 << 19)));
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59205JAj(i3, 0, this, obj8, obj9, obj10, obj11, obj13, obj12);
        }
        return invoke;
    }

    public final Object A07(C286575Wy r23, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        C286575Wy r2 = r23;
        r2.ExV(this.A03);
        A00(r2);
        int i2 = 1;
        if (r2.AGu(this)) {
            i2 = 2;
        }
        int i3 = i;
        Object obj8 = this.A01;
        0qQ.A0C(obj8, "null cannot be cast to non-null type kotlin.Function9<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        0u4.A05(obj8, 9);
        Object obj9 = obj;
        Object obj10 = obj2;
        Object obj11 = obj3;
        Object obj12 = obj4;
        Object obj13 = obj5;
        Object obj14 = obj6;
        Object obj15 = obj7;
        Object invoke = ((0sE) obj8).invoke(obj9, obj10, obj11, obj12, obj13, obj14, obj15, r2, Integer.valueOf(i | (i2 << 22)));
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JBG(obj9, obj10, this, obj15, obj13, obj14, obj12, obj11, i3, 0);
        }
        return invoke;
    }

    public final Object A08(C286575Wy r25, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i) {
        C286575Wy r2 = r25;
        r2.ExV(this.A03);
        A00(r2);
        int i2 = 1;
        if (r2.AGu(this)) {
            i2 = 2;
        }
        int i3 = i;
        Object obj9 = this.A01;
        0qQ.A0C(obj9, "null cannot be cast to non-null type kotlin.Function10<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        0u4.A05(obj9, 10);
        Object obj10 = obj;
        Object obj11 = obj2;
        Object obj12 = obj3;
        Object obj13 = obj4;
        Object obj14 = obj5;
        Object obj15 = obj6;
        Object obj16 = obj7;
        Object obj17 = obj8;
        Object CNr = ((0sZ) obj9).CNr(obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, r2, Integer.valueOf(i | (i2 << 25)));
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59235JBn(this, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, i3, 0);
        }
        return CNr;
    }

    public final Object A09(C286575Wy r39, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, int i, int i2) {
        C286575Wy r3 = r39;
        r3.ExV(this.A03);
        A00(r3);
        int i3 = 1;
        if (r3.AGu(this)) {
            i3 = 2;
        }
        int i4 = i2;
        Object obj15 = this.A01;
        0qQ.A0C(obj15, "null cannot be cast to non-null type kotlin.Function17<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'p13')] kotlin.Any?, @[ParameterName(name = 'p14')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        0u4.A05(obj15, 17);
        int i5 = i;
        Object obj16 = obj11;
        Object obj17 = obj10;
        Object obj18 = obj9;
        Object obj19 = obj8;
        Object obj20 = obj7;
        Object obj21 = obj3;
        Object obj22 = obj2;
        Object obj23 = obj14;
        Object obj24 = obj;
        Object obj25 = obj13;
        Object obj26 = obj12;
        Object obj27 = obj4;
        Object obj28 = obj5;
        Object obj29 = obj6;
        Object CNs = ((0sS) obj15).CNs(obj24, obj22, obj21, obj27, obj28, obj29, obj20, obj19, obj18, obj17, obj16, obj26, obj25, obj23, r3, Integer.valueOf(i5), Integer.valueOf(i2 | (i3 << 13)));
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JD3(this, obj24, obj22, obj21, obj27, obj28, obj29, obj20, obj19, obj18, obj17, obj16, obj26, obj25, obj23, i5, i4);
        }
        return CNs;
    }

    public final void A0A(Object obj) {
        if (!0qQ.A0K(this.A01, obj)) {
            boolean z = false;
            if (this.A01 == null) {
                z = true;
            }
            this.A01 = obj;
            if (!z && this.A04) {
                C286635Xe r2 = this.A00;
                if (r2 != null) {
                    C286625Xd r22 = (C286625Xd) r2;
                    C286485Wo r1 = r22.A05;
                    if (r1 != null) {
                        r1.CNl(r22, (Object) null);
                    }
                    this.A00 = null;
                }
                List list = this.A02;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        C286625Xd r23 = (C286625Xd) ((C286635Xe) list.get(i));
                        C286485Wo r12 = r23.A05;
                        if (r12 != null) {
                            r12.CNl(r23, (Object) null);
                        }
                    }
                    list.clear();
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object CNr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return A08((C286575Wy) obj9, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, ((Number) obj10).intValue());
    }

    public final /* bridge */ /* synthetic */ Object CNs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17) {
        return A09((C286575Wy) obj15, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, ((Number) obj16).intValue(), ((Number) obj17).intValue());
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy r5 = (C286575Wy) obj;
        int intValue = ((Number) obj2).intValue();
        r5.ExV(this.A03);
        A00(r5);
        int i = 1 << 1;
        if (r5.AGu(this)) {
            i = 2 << 1;
        }
        Object obj3 = this.A01;
        0qQ.A0C(obj3, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        0u4.A05(obj3, 2);
        Object invoke = ((0sL) obj3).invoke(r5, Integer.valueOf(intValue | i));
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            0u4.A05(this, 2);
            ASQ.A06 = this;
        }
        return invoke;
    }

    public AnonymousClass5PJ(int i, boolean z, Object obj) {
        this.A03 = i;
        this.A04 = z;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return A01((C286575Wy) obj2, obj, ((Number) obj3).intValue());
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return A02((C286575Wy) obj3, obj, obj2, ((Number) obj4).intValue());
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return A06((C286575Wy) obj7, obj, obj2, obj3, obj4, obj5, obj6, ((Number) obj8).intValue());
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return A03((C286575Wy) obj4, obj, obj2, obj3, ((Number) obj5).intValue());
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return A07((C286575Wy) obj8, obj, obj2, obj3, obj4, obj5, obj6, obj7, ((Number) obj9).intValue());
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return A05((C286575Wy) obj6, obj, obj2, obj3, obj4, obj5, ((Number) obj7).intValue());
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return A04((C286575Wy) obj5, obj, obj2, obj3, obj4, ((Number) obj6).intValue());
    }
}
