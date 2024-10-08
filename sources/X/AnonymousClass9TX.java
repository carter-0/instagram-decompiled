package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9TX  reason: invalid class name */
public final class AnonymousClass9TX implements C13824Thu {
    public int A00;
    public long A01;
    public final long A02;
    public final AnonymousClass8L6 A03;
    public final ArrayList A04;
    public final List A05;
    public final List A06;
    public final List A07;
    public final List A08;
    public final AtomicBoolean A09;
    public final Integer[] A0A;

    public AnonymousClass9TX(AnonymousClass8L6 r2, ArrayList arrayList, List list, List list2, List list3, List list4, AtomicBoolean atomicBoolean, Integer[] numArr, long j) {
        AnonymousClass7TF.A1F(r2, 1, arrayList);
        this.A03 = r2;
        this.A0A = numArr;
        this.A08 = list;
        this.A07 = list2;
        this.A05 = list3;
        this.A06 = list4;
        this.A02 = j;
        this.A04 = arrayList;
        this.A09 = atomicBoolean;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [java.lang.Object, X.A5a] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b6 A[LOOP:1: B:19:0x00b0->B:21:0x00b6, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CyD(long r11, int r13, android.graphics.Bitmap r14) {
        /*
            r10 = this;
            r3 = 0
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.A09
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x00ca
            java.lang.Integer[] r2 = r10.A0A
            r0 = r2[r3]
            int r0 = r0.intValue()
            r1 = 1
            r5 = r14
            if (r0 != 0) goto L_0x0029
            int r0 = r14.getWidth()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r3] = r0
            int r0 = r14.getHeight()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r1] = r0
        L_0x0029:
            X.8L6 r6 = r10.A03
            java.util.List r7 = r10.A07
            java.util.List r8 = r10.A05
            java.util.List r9 = r10.A06
            X.0qQ.A0B(r7, r1)
            r0 = 2
            X.0qQ.A0B(r8, r0)
            r0 = 3
            X.0qQ.A0B(r9, r0)
            X.8L7 r3 = r6.A01
            X.9Tq r4 = new X.9Tq
            r4.<init>(r5, r6, r7, r8, r9)
            r3.A00 = r4
            X.84M r2 = r3.A01
            X.9Tr r0 = new X.9Tr
            r0.<init>(r3)
            r2.A02 = r0
            int r0 = r14.getWidth()
            r2.A00 = r0
            X.8wA r0 = new X.8wA
            r0.<init>(r14)
            r2.A01 = r0
            r2.A00()
            int r0 = r10.A00
            if (r13 >= r0) goto L_0x00a7
            if (r13 == 0) goto L_0x00a7
            int r0 = r13 % 4
            if (r0 != 0) goto L_0x00a7
            int r0 = r9.size()
            int r0 = r0 - r1
            java.lang.Object r6 = r9.get(r0)
            X.A5a r6 = (X.C39684A5a) r6
            int r0 = r9.size()
            int r0 = r0 + -2
            java.lang.Object r5 = r9.get(r0)
            X.A5a r5 = (X.C39684A5a) r5
            r4 = 1
        L_0x0080:
            if (r6 == 0) goto L_0x00a5
            if (r5 == 0) goto L_0x00a3
            X.A5a r3 = new X.A5a
            r3.<init>()
            float r2 = r5.A00
            float r0 = r6.A00
            float r2 = r2 + r0
            r0 = 1082130432(0x40800000, float:4.0)
            float r2 = r2 / r0
            float r0 = (float) r4
            float r2 = r2 * r0
            r3.A00 = r2
        L_0x0095:
            int r0 = r9.size()
            int r0 = r0 - r1
            r9.add(r0, r3)
            int r4 = r4 + 1
            r0 = 4
            if (r4 >= r0) goto L_0x00a7
            goto L_0x0080
        L_0x00a3:
            r3 = r6
            goto L_0x0095
        L_0x00a5:
            r3 = r5
            goto L_0x0095
        L_0x00a7:
            java.util.ArrayList r0 = r10.A04
            java.util.Iterator r5 = r0.iterator()
            X.0qQ.A07(r5)
        L_0x00b0:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r4 = r5.next()
            X.0qQ.A07(r4)
            X.8LA r4 = (X.AnonymousClass8LA) r4
            r2 = 100
            long r2 = r2 * r11
            long r0 = r10.A02
            long r2 = r2 / r0
            int r0 = (int) r2
            r4.DtD(r0)
            goto L_0x00b0
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9TX.CyD(long, int, android.graphics.Bitmap):void");
    }

    public final void DKn(long j) {
    }

    public final boolean Cqr() {
        return !this.A09.get();
    }

    public final boolean ErY(int i, long j) {
        this.A08.add(Integer.valueOf((int) j));
        if (i != 0) {
            if (i == 1) {
                this.A00 = ((((int) ((this.A02 / (j - this.A01)) - 1)) - 4) / 4) * 4;
            }
            if (i >= this.A00 || (i % 4 == 0 && !this.A09.get())) {
                return true;
            }
            return false;
        }
        this.A01 = j;
        return true;
    }

    public final /* synthetic */ Long AVQ(List list) {
        return null;
    }
}
