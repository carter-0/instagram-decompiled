package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.AAv  reason: case insensitive filesystem */
public abstract class C39824AAv {
    public static final void A01(C333867aH r6, List list) {
        Integer num = r6.A03.A00.A03;
        if (num == AnonymousClass05K.A0u) {
            List<AnonymousClass9IV> list2 = r6.A06;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (AnonymousClass9IV r0 : list2) {
                    if (((C335907dj) r0.A01).A0c) {
                    }
                }
                return;
            }
            return;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        HN2 hn2 = HN2.A05;
        A1C.add(hn2);
        HN2 hn22 = HN2.A07;
        A1C.add(hn22);
        if (num.intValue() == 1) {
            hn2 = hn22;
        }
        list.add(new C54214H3j(hn2, A1C));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        if (r6 != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        if (r10.A06 == false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass9IV r21, X.C335857de r22, java.util.List r23) {
        /*
            r12 = r21
            java.lang.Object r14 = r12.A01
            X.7dj r14 = (X.C335907dj) r14
            java.lang.Integer r0 = r14.A0H
            boolean r0 = X.C335047cI.A04(r0)
            if (r0 == 0) goto L_0x0109
            X.7de r0 = r14.A05
            r1 = r22
            if (r0 != r1) goto L_0x0109
            java.lang.Object r4 = r12.A00
            X.9Ib r4 = (X.C376459Ib) r4
            java.lang.Object r10 = r4.A00
            X.7dk r10 = (X.C335917dk) r10
            boolean r13 = r10.A08
            r16 = 0
            r9 = 1
            if (r13 != 0) goto L_0x002c
            boolean r0 = r10.A07
            if (r0 != 0) goto L_0x002c
            boolean r0 = r10.A06
            r8 = 1
            if (r0 != 0) goto L_0x002d
        L_0x002c:
            r8 = 0
        L_0x002d:
            java.lang.Object r3 = r4.A01
            java.util.List r3 = (java.util.List) r3
            boolean r0 = X.AnonymousClass7TE.A1b(r3)
            if (r0 == 0) goto L_0x0043
            if (r8 == 0) goto L_0x0043
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0073
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0073
        L_0x0043:
            r7 = 0
        L_0x0044:
            boolean r6 = r10.A07
            if (r7 != 0) goto L_0x004d
            if (r8 != 0) goto L_0x004d
            r15 = 0
            if (r6 == 0) goto L_0x004e
        L_0x004d:
            r15 = 1
        L_0x004e:
            java.lang.Object r5 = r4.A02
            java.util.List r5 = (java.util.List) r5
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r3.iterator()
        L_0x005a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x008b
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.7dj r0 = (X.C335907dj) r0
            java.lang.Integer r0 = r0.A0H
            boolean r0 = X.C335047cI.A04(r0)
            if (r0 == 0) goto L_0x005a
            r4.add(r1)
            goto L_0x005a
        L_0x0073:
            java.util.Iterator r2 = r3.iterator()
        L_0x0077:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0043
            java.lang.Object r0 = r2.next()
            X.7dj r0 = (X.C335907dj) r0
            java.lang.Integer r1 = r0.A0H
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            if (r1 != r0) goto L_0x0077
            r7 = 1
            goto L_0x0044
        L_0x008b:
            int r3 = r4.size()
            int r3 = r3 + r13
            int r0 = r5.size()
            int r3 = r3 + r0
            int r3 = r3 + r15
            if (r3 <= 0) goto L_0x00a4
            r2 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            r0 = 64511(0xfbff, float:9.0399E-41)
            X.7dj r14 = X.C335907dj.A00((X.C335867df) null, r14, r2, (X.C335857de) null, (X.C333897aK) null, (X.C337207ft) null, (X.C337217fu) null, r1, r2, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, -1, r0, false, false, false, false, false, false, false, false)
        L_0x00a4:
            r11 = r23
            r11.add(r14)
            if (r3 != r9) goto L_0x00ad
            r16 = 1
        L_0x00ad:
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r16)
            if (r13 == 0) goto L_0x00d5
            java.lang.Object r0 = r12.A01
            X.7dj r0 = (X.C335907dj) r0
            java.lang.String r13 = r0.A0K
            java.lang.Integer r18 = X.AnonymousClass05K.A01
            java.lang.String r3 = r10.A04
            int r2 = r10.A01
            java.lang.Integer r1 = r10.A03
            java.lang.Integer r20 = X.AnonymousClass05K.A00
            X.7eu r0 = new X.7eu
            r19 = r1
            r21 = r13
            r22 = r3
            r23 = r2
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r11.add(r0)
        L_0x00d5:
            java.util.ArrayList r0 = X.00k.A0S(r5, r4)
            java.util.ArrayList r4 = X.00k.A0U(r0)
            java.lang.Object r3 = X.00k.A0L(r4)
            X.7dj r3 = (X.C335907dj) r3
            if (r3 == 0) goto L_0x00fd
            r2 = 0
            boolean r0 = X.AnonymousClass7TF.A1Q(r15)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 63487(0xf7ff, float:8.8964E-41)
            X.7dj r1 = X.C335907dj.A00((X.C335867df) null, r3, r2, (X.C335857de) null, (X.C333897aK) null, (X.C337207ft) null, (X.C337217fu) null, r2, r1, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, -1, r0, false, false, false, false, false, false, false, false)
            int r0 = r4.size()
            int r0 = r0 - r9
            r4.set(r0, r1)
        L_0x00fd:
            r11.addAll(r4)
            X.7eu r0 = X.C335047cI.A00(r12, r10, r7, r8, r6)
            if (r0 == 0) goto L_0x0109
            r11.add(r0)
        L_0x0109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39824AAv.A00(X.9IV, X.7de, java.util.List):void");
    }
}
