package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.2g2  reason: invalid class name */
public final class AnonymousClass2g2 extends AnonymousClass2g3 {
    public final 2aT A00;
    public final 2aV A01;
    public final AnonymousClass2g1 A02;
    public final boolean A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2g2(X.2aT r17, X.2aV r18, X.C226252fx r19, X.C226252fx r20, X.C226252fx r21, X.C226252fx r22, X.AnonymousClass2g1 r23, X.C71062aE r24, X.2ah r25, X.C71112ao r26, X.C62320sa r27, X.C262224Cq r28, int r29, int r30, boolean r31, boolean r32, boolean r33, boolean r34) {
        /*
            r16 = this;
            r0 = r25
            r6 = r24
            X.0r6 r10 = r0.A00(r6)
            r9 = r28
            r8 = r27
            r7 = r26
            r15 = r34
            r4 = r21
            r3 = r20
            r14 = r32
            r2 = r19
            r13 = r31
            r12 = r30
            r11 = r29
            r1 = r16
            r5 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = r33
            r1.A03 = r0
            r0 = r23
            r1.A02 = r0
            r0 = r17
            r1.A00 = r0
            r0 = r18
            r1.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2g2.<init>(X.2aT, X.2aV, X.2fx, X.2fx, X.2fx, X.2fx, X.2g1, X.2aE, X.2ah, X.2ao, X.0sa, X.4Cq, int, int, boolean, boolean, boolean, boolean):void");
    }

    public static final LinkedHashMap A00(2aX r5) {
        List list = r5.A04;
        if (list == null) {
            return null;
        }
        ArrayList<2aX> arrayList = new ArrayList<>();
        for (Object next : list) {
            2aX r0 = (2aX) next;
            if (r0.A01 + r0.A00 > 0) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(0Yv.A1E(arrayList, 10));
        for (2aX r3 : arrayList) {
            arrayList2.add(new 0eP(r3.A03.toString(), String.valueOf(r3.A01 + r3.A00)));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        0Yt.A0F(arrayList2, linkedHashMap);
        return linkedHashMap;
    }

    public final void A03() {
        2aX r5 = this.A01;
        if (r5 != null) {
            2aT r0 = this.A00;
            AnonymousClass2g1 r4 = this.A02;
            C226252fx r3 = C226252fx.DOT;
            r0.A02(r3, r4, r5);
            2aV r2 = this.A01;
            0qQ.A0B(r4, 0);
            r2.A02(new C239993Jd(r3, r4, (C71062aE) null, (Set) null), r5);
        }
    }
}
