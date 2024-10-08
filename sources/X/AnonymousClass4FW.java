package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4FW  reason: invalid class name */
public final class AnonymousClass4FW implements C242643Vh {
    public AnonymousClass4FW A00;
    public AnonymousClass4FW A01;
    public final int A02;
    public final Object A03;
    public final /* synthetic */ AnonymousClass4FU A04;

    public final /* synthetic */ void DPe(Object obj) {
    }

    public AnonymousClass4FW(AnonymousClass4FU r1, Object obj, int i) {
        this.A04 = r1;
        this.A02 = i;
        this.A03 = obj;
    }

    public final Object AvB() {
        return this.A03;
    }

    public final Iterable BVk(C376459Ib r8, AnonymousClass34Q r9, int i) {
        int i2;
        AnonymousClass34P r4;
        0sP r1;
        int i3;
        int i4 = Integer.MAX_VALUE;
        int i5 = AnonymousClass972.MUTABLE_FLAG_MASK;
        for (0eP r0 : AnonymousClass4FU.A00(this.A04)) {
            Object obj = r0.A00;
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.common.uigraph.ListCarouselNode.CarouselItemNode<DataType of com.instagram.common.uigraph.ListCarouselNode.CarouselItemNode.getDistanceFromScreen$lambda$4, OnScreenKeyType of com.instagram.common.uigraph.ListCarouselNode.CarouselItemNode.getDistanceFromScreen$lambda$4>");
            int i6 = ((AnonymousClass4FW) obj).A02;
            if (i6 < i4) {
                i4 = i6;
            }
            if (i6 > i5) {
                i5 = i6;
            }
        }
        int i7 = this.A02;
        if (i7 < i4) {
            i2 = i7 - i4;
        } else {
            i2 = 0;
            if (i7 > i5) {
                i2 = i7 - i5;
            }
        }
        if (r9 == null || (r4 = r9.A01) == null) {
            r4 = AnonymousClass4FU.A07;
        }
        AnonymousClass4FW[] r12 = {this.A00, this.A01};
        0qQ.A0B(r12, 0);
        List A0I = 03t.A0I(r12);
        ArrayList arrayList = new ArrayList(0Yv.A1E(A0I, 10));
        for (Object next : A0I) {
            if (0qQ.A0K(next, this.A00)) {
                r1 = r4.A00;
                i3 = i2 - 1;
            } else if (0qQ.A0K(next, this.A01)) {
                r1 = r4.A00;
                i3 = i2 + 1;
            } else {
                throw new IllegalArgumentException();
            }
            arrayList.add(new 0eP(next, r1.invoke(Integer.valueOf(i3))));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : arrayList) {
            if (((Number) ((0eP) next2).A01).intValue() > -1) {
                arrayList2.add(next2);
            }
        }
        return arrayList2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[CarouselItemNode] data = ");
        sb.append(this.A03);
        return sb.toString();
    }

    public final /* synthetic */ boolean DPd(Object obj) {
        return true;
    }
}
