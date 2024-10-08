package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LRe  reason: case insensitive filesystem */
public final class C64163LRe {
    public 0eP A00;
    public List A01 = AnonymousClass7TE.A1C();
    public final Integer[] A02 = {0, 0};
    public final UserSession A03;
    public final C60108Jfo A04;
    public final C62320sa A05;
    public final C62320sa A06;
    public final C62320sa A07;
    public final Boolean[] A08 = {false, false};
    public final Integer[] A09 = {0, 0};

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d5, code lost:
        if (X.JTO.A0A(r10.A09, r14) != r4) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d7, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Boolean A00(java.util.List r11, java.lang.Integer[] r12, float r13, int r14) {
        /*
            r10 = this;
            X.0sa r0 = r10.A06
            int r6 = X.JTR.A0H(r0)
            java.lang.Boolean[] r5 = r10.A08
            r0 = r5[r14]
            boolean r0 = r0.booleanValue()
            r2 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0070
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r11.iterator()
        L_0x001a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x003f
            java.lang.Object r7 = r9.next()
            int r3 = X.AnonymousClass7TE.A0M(r7)
            int r1 = X.JTO.A0A(r12, r14)
            java.lang.Integer[] r0 = r10.A09
            int r0 = X.JTO.A0A(r0, r14)
            if (r1 <= r0) goto L_0x003a
            if (r3 <= r0) goto L_0x001a
        L_0x0036:
            r8.add(r7)
            goto L_0x001a
        L_0x003a:
            if (r1 >= r0) goto L_0x001a
            if (r3 >= r0) goto L_0x001a
            goto L_0x0036
        L_0x003f:
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r8)
            java.util.Iterator r3 = r8.iterator()
        L_0x0047:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0060
            int r1 = X.AnonymousClass7TG.A0F(r3)
            java.lang.Integer[] r0 = r10.A09
            int r0 = X.JTO.A0A(r0, r14)
            int r1 = r1 - r0
            int r0 = java.lang.Math.abs(r1)
            X.AnonymousClass7TF.A1M(r7, r0)
            goto L_0x0047
        L_0x0060:
            java.lang.Comparable r0 = X.00k.A06(r7)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x009e
            int r0 = r0.intValue()
        L_0x006c:
            int r6 = java.lang.Math.min(r6, r0)
        L_0x0070:
            r0 = r5[r14]
            boolean r0 = r0.booleanValue()
            r7 = 0
            if (r0 == 0) goto L_0x00a1
            int r1 = X.JTO.A0A(r12, r14)
            java.lang.Integer[] r0 = r10.A09
            r3 = r0[r14]
            int r0 = r3.intValue()
            int r1 = r1 - r0
            int r0 = java.lang.Math.abs(r1)
            if (r0 >= r6) goto L_0x00a1
            int r0 = X.JTO.A0A(r12, r4)
            int r1 = X.JTO.A0A(r12, r2)
            int r1 = r1 - r0
            r0 = 100
            if (r1 <= r0) goto L_0x00a1
            java.lang.Integer[] r0 = r10.A02
            r0[r14] = r3
            return r7
        L_0x009e:
            int r0 = r6 + -1
            goto L_0x006c
        L_0x00a1:
            java.util.Iterator r5 = r11.iterator()
        L_0x00a5:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00d8
            int r4 = X.AnonymousClass7TG.A0F(r5)
            int r3 = X.JTO.A0A(r12, r14)
            int r0 = r3 - r4
            int r0 = java.lang.Math.abs(r0)
            if (r2 > r0) goto L_0x00a5
            if (r0 >= r6) goto L_0x00a5
            r1 = 0
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c4
            if (r4 > r3) goto L_0x00ca
        L_0x00c4:
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a5
            if (r4 >= r3) goto L_0x00a5
        L_0x00ca:
            java.lang.Integer[] r0 = r10.A02
            X.G9w.A1Z(r0, r4, r14)
            java.lang.Integer[] r0 = r10.A09
            int r0 = X.JTO.A0A(r0, r14)
            if (r0 != r4) goto L_0x00d8
            return r7
        L_0x00d8:
            java.lang.Integer[] r0 = r10.A02
            int r1 = X.JTO.A0A(r0, r14)
            int r0 = X.JTO.A0A(r12, r14)
            if (r1 != r0) goto L_0x00e5
            r2 = 0
        L_0x00e5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64163LRe.A00(java.util.List, java.lang.Integer[], float, int):java.lang.Boolean");
    }

    private final void A01() {
        List list;
        Integer num;
        Boolean[] boolArr = this.A08;
        if (boolArr[0].booleanValue() || boolArr[1].booleanValue()) {
            this.A05.invoke();
        }
        C60108Jfo jfo = this.A04;
        boolean booleanValue = boolArr[0].booleanValue();
        if (!booleanValue || !boolArr[1].booleanValue()) {
            if (boolArr[1].booleanValue()) {
                num = this.A02[1];
            } else if (booleanValue) {
                num = this.A02[0];
            } else {
                list = 0sn.A00;
            }
            list = AnonymousClass7TE.A1I(num);
        } else {
            Integer[] numArr = this.A02;
            list = 0sr.A1P(new Integer[]{numArr[0], numArr[1]});
        }
        jfo.A0W(list);
    }

    public final void A02() {
        Integer[] numArr = this.A09;
        Integer A0j = C51967G9n.A0j();
        numArr[0] = A0j;
        numArr[1] = A0j;
        Boolean[] boolArr = this.A08;
        boolArr[0] = false;
        boolArr[1] = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(java.lang.Integer r10, X.C62320sa r11, X.C62320sa r12, float r13, int r14, int r15, boolean r16) {
        /*
            r9 = this;
            X.0sa r0 = r9.A07
            int r2 = X.JTR.A0H(r0)
            X.Jfo r0 = r9.A04
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r0.A0E
            int r6 = X.JTO.A07(r0)
            X.0sa r0 = r9.A06
            int r1 = X.JTR.A0H(r0)
            r0 = 2
            r3 = 1
            r4 = 0
            if (r16 == 0) goto L_0x0043
            int r1 = r1 / r0
            int r6 = r6 - r1
            if (r2 <= r6) goto L_0x0043
            java.util.List r1 = r9.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.util.ArrayList r0 = X.00k.A0T(r0, r1)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r0.iterator()
        L_0x002f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x004d
            java.lang.Object r1 = r5.next()
            int r0 = X.AnonymousClass7TE.A0M(r1)
            if (r0 >= r6) goto L_0x002f
            r2.add(r1)
            goto L_0x002f
        L_0x0043:
            java.util.List r1 = r9.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.util.ArrayList r2 = X.00k.A0T(r0, r1)
        L_0x004d:
            java.lang.Integer[] r6 = r9.A02
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r6[r4] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r6[r3] = r0
            java.lang.Integer[] r5 = new java.lang.Integer[]{r1, r0}
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r10 != r0) goto L_0x0085
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r2.iterator()
        L_0x006b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00ea
            java.lang.Object r2 = r7.next()
            int r0 = X.AnonymousClass7TE.A0M(r2)
            int r1 = r0 + 100
            int r0 = X.JTO.A0A(r5, r3)
            if (r1 > r0) goto L_0x006b
            r8.add(r2)
            goto L_0x006b
        L_0x0085:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r10 != r0) goto L_0x00b1
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r2.iterator()
        L_0x0091:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00ac
            java.lang.Object r2 = r7.next()
            int r1 = X.AnonymousClass7TE.A0M(r2)
            r0 = 100
            int r1 = r1 - r0
            int r0 = X.JTO.A0A(r5, r4)
            if (r1 < r0) goto L_0x0091
            r8.add(r2)
            goto L_0x0091
        L_0x00ac:
            java.lang.Boolean r0 = r9.A00(r8, r5, r13, r3)
            goto L_0x00ee
        L_0x00b1:
            boolean r0 = X.C51971G9r.A1b(r12)
            if (r0 == 0) goto L_0x00f3
            java.lang.Integer[] r1 = r9.A09
            r0 = r6[r4]
            r1[r4] = r0
            r0 = r6[r3]
            r1[r3] = r0
            java.lang.Boolean[] r2 = r9.A08
            int r1 = X.JTO.A0A(r6, r4)
            int r0 = X.JTO.A0A(r5, r4)
            boolean r0 = X.JTQ.A1O(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2[r4] = r0
            int r1 = X.JTO.A0A(r6, r3)
            int r0 = X.JTO.A0A(r5, r3)
            if (r1 == r0) goto L_0x00e0
            r4 = 1
        L_0x00e0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r2[r3] = r0
            r9.A01()
            return
        L_0x00ea:
            java.lang.Boolean r0 = r9.A00(r8, r5, r13, r4)
        L_0x00ee:
            if (r0 != 0) goto L_0x00b1
            r11.invoke()
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64163LRe.A03(java.lang.Integer, X.0sa, X.0sa, float, int, int, boolean):void");
    }

    public final void A04(List list, List list2) {
        this.A01.clear();
        this.A01.addAll(list);
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                int A0F = AnonymousClass7TG.A0F(it);
                List list3 = this.A01;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it2 = list3.iterator();
                    int i = 0;
                    while (it2.hasNext()) {
                        if (AnonymousClass7TG.A0F(it2) == A0F && (i = i + 1) < 0) {
                            0sr.A1S();
                            throw AnonymousClass00P.createAndThrow();
                        }
                    }
                    if (i == 1) {
                        this.A01.remove(Integer.valueOf(A0F));
                    }
                }
            }
        }
        this.A01 = 00k.A0U(00k.A0W(this.A01));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.C62320sa r14, X.C62320sa r15, float r16, int r17, int r18) {
        /*
            r13 = this;
            java.util.List r1 = r13.A01
            X.0sa r0 = r13.A07
            java.lang.Object r0 = r0.invoke()
            java.util.ArrayList r12 = X.00k.A0T(r0, r1)
            java.lang.Integer[] r4 = r13.A02
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r3 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            r4[r3] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            r2 = 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            r4[r2] = r0
            r5 = 2
            java.lang.Integer[] r10 = new java.lang.Integer[]{r1, r0}
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r11 = r12.iterator()
        L_0x0031:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x004b
            java.lang.Object r7 = r11.next()
            int r0 = X.AnonymousClass7TE.A0M(r7)
            int r1 = r0 + 100
            int r0 = X.JTO.A0A(r10, r2)
            if (r1 > r0) goto L_0x0031
            r8.add(r7)
            goto L_0x0031
        L_0x004b:
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r12 = r12.iterator()
        L_0x0053:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x006e
            java.lang.Object r11 = r12.next()
            int r1 = X.AnonymousClass7TE.A0M(r11)
            r0 = 100
            int r1 = r1 - r0
            int r0 = X.JTO.A0A(r10, r3)
            if (r1 < r0) goto L_0x0053
            r7.add(r11)
            goto L_0x0053
        L_0x006e:
            r1 = r16
            java.lang.Boolean r0 = r13.A00(r8, r10, r1, r3)
            java.lang.Boolean r1 = r13.A00(r7, r10, r1, r2)
            if (r0 == 0) goto L_0x00e0
            if (r1 == 0) goto L_0x00e0
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00bb
            int r0 = X.JTO.A0A(r4, r3)
            int r0 = r0 + r18
            int r0 = r0 - r17
            X.G9w.A1Z(r4, r0, r2)
            java.lang.Boolean[] r5 = new java.lang.Boolean[r5]
            r5[r3] = r6
            r0 = r4[r2]
            boolean r0 = r7.contains(r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
        L_0x009b:
            r5[r2] = r6
        L_0x009d:
            boolean r0 = X.C51971G9r.A1b(r15)
            if (r0 == 0) goto L_0x00ba
            java.lang.Integer[] r1 = r13.A09
            r0 = r4[r3]
            r1[r3] = r0
            r0 = r4[r2]
            r1[r2] = r0
            java.lang.Boolean[] r1 = r13.A08
            r0 = r5[r3]
            r1[r3] = r0
            r0 = r5[r2]
            r1[r2] = r0
            r13.A01()
        L_0x00ba:
            return
        L_0x00bb:
            boolean r0 = r1.equals(r6)
            if (r0 == 0) goto L_0x00db
            int r0 = X.JTO.A0A(r4, r2)
            int r0 = r0 - r18
            int r0 = r0 + r17
            X.G9w.A1Z(r4, r0, r3)
            java.lang.Boolean[] r5 = new java.lang.Boolean[r5]
            r0 = r4[r3]
            boolean r0 = r8.contains(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5[r3] = r0
            goto L_0x009b
        L_0x00db:
            java.lang.Boolean[] r5 = new java.lang.Boolean[]{r9, r9}
            goto L_0x009d
        L_0x00e0:
            r14.invoke()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64163LRe.A05(X.0sa, X.0sa, float, int, int):void");
    }

    public C64163LRe(UserSession userSession, C60108Jfo jfo, C62320sa r6, C62320sa r7, C62320sa r8) {
        this.A03 = userSession;
        this.A04 = jfo;
        this.A06 = r6;
        this.A07 = r7;
        this.A05 = r8;
    }
}
