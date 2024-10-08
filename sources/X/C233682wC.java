package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.2wC  reason: invalid class name and case insensitive filesystem */
public enum C233682wC {
    ;

    public final C251373n0 A02(UserSession userSession, C228812mN r6, C233402vf r7, Map map) {
        Object BTb;
        C271754jX r1;
        0qQ.A0B(r7, 0);
        0qQ.A0B(map, 1);
        0qQ.A0B(r6, 2);
        C251373n0 Coa = r7.Coa();
        if (!(Coa == null || (BTb = Coa.BTb()) == null || !A00(userSession, r6, BTb))) {
            C271744jW r0 = (C271744jW) map.get(r6.BEZ(BTb));
            if (r0 != null) {
                r1 = r0.Bz6();
            } else {
                r1 = null;
            }
            if (r1 == C271754jX.INSERTED_SUCCESSFULLY) {
                return Coa;
            }
        }
        return null;
    }

    /* access modifiers changed from: public */
    static {
        C233682wC[] r0;
        A00 = 0oU.A00(r0);
    }

    public static final boolean A00(UserSession userSession, C228812mN r4, Object obj) {
        if (r4.BUT(obj) != AnonymousClass05K.A00 || userSession == null) {
            return true;
        }
        return !182.A06(0Tu.A06, userSession, 36317818253809215L);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fa, code lost:
        if (r14.A00().Bxj() != X.AnonymousClass05K.A01) goto L_0x0053;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A01(com.instagram.common.session.UserSession r21, X.C228812mN r22, X.C233012uo r23, X.C233402vf r24, X.AnonymousClass2vG r25, X.C249863kU r26, X.C233432vi r27, java.util.Map r28, int r29, boolean r30, boolean r31, boolean r32) {
        /*
            r20 = this;
            r0 = 1
            r7 = r25
            X.0qQ.A0B(r7, r0)
            r0 = 2
            r14 = r26
            X.0qQ.A0B(r14, r0)
            r0 = 5
            r6 = r28
            X.0qQ.A0B(r6, r0)
            r0 = 6
            r8 = r22
            X.0qQ.A0B(r8, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3 = r24
            X.3n0 r0 = r3.Coa()
            if (r0 == 0) goto L_0x00fe
            java.lang.Object r5 = r0.BTb()
        L_0x0029:
            if (r32 == 0) goto L_0x0053
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x00e4
            java.util.Set r0 = r6.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L_0x0039:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00e4
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            X.4jW r0 = (X.C271744jW) r0
            X.4jX r2 = r0.Bz6()
            X.4jX r0 = X.C271754jX.SEEN
            if (r2 != r0) goto L_0x0039
        L_0x0053:
            r13 = 0
            r12 = r29
        L_0x0056:
            r9 = r21
            if (r5 == 0) goto L_0x00e2
            boolean r0 = A00(r9, r8, r5)
            if (r0 == 0) goto L_0x00e2
            java.lang.String r0 = r8.BEZ(r5)
            java.lang.Object r0 = r6.get(r0)
            X.4jW r0 = (X.C271744jW) r0
            if (r0 == 0) goto L_0x00e0
            X.4jX r2 = r0.Bz6()
        L_0x0070:
            X.4jX r0 = X.C271754jX.INSERTED_SUCCESSFULLY
            if (r2 != r0) goto L_0x00e2
            if (r30 == 0) goto L_0x0079
            r3.E5F(r5)
        L_0x0079:
            r30 = 0
            r1.add(r5)
            int r12 = r12 + -1
        L_0x0080:
            java.util.List r0 = r3.BYj()
            java.util.ArrayList r0 = X.00k.A0U(r0)
            r2 = r27
            X.1PW r6 = r2.AGd(r0)
            java.util.LinkedList r0 = r14.A04()
            java.util.Iterator r11 = r0.iterator()
            r10 = 0
        L_0x0097:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0101
            java.lang.Object r4 = r11.next()
            X.3n0 r4 = (X.C251373n0) r4
            java.lang.Object r2 = r4.BTb()
            boolean r0 = A00(r9, r8, r2)
            if (r0 == 0) goto L_0x0097
            if (r12 <= 0) goto L_0x00c0
            if (r30 == 0) goto L_0x00b7
            r3.E5F(r2)
            r5 = r2
            r30 = 0
        L_0x00b7:
            if (r31 == 0) goto L_0x00ba
            r5 = r2
        L_0x00ba:
            r1.add(r2)
        L_0x00bd:
            int r12 = r12 + -1
            goto L_0x0097
        L_0x00c0:
            if (r12 != 0) goto L_0x00db
            if (r31 == 0) goto L_0x00db
            if (r5 != 0) goto L_0x00d0
            java.lang.String r0 = "recentlyCarriedOverModel"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00d0:
            boolean r0 = r8.ACN(r5, r2)
            if (r0 == 0) goto L_0x00db
            r1.add(r2)
            r10 = 1
            goto L_0x00bd
        L_0x00db:
            r0 = 0
            r7.Chf(r4, r6, r0)
            goto L_0x00bd
        L_0x00e0:
            r2 = 0
            goto L_0x0070
        L_0x00e2:
            r5 = 0
            goto L_0x0080
        L_0x00e4:
            java.util.LinkedList r0 = r14.A02
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0053
            X.3n0 r0 = r14.A00()
            java.lang.Integer r2 = r0.Bxj()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r13 = 1
            r12 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r0) goto L_0x0056
            goto L_0x0053
        L_0x00fe:
            r5 = 0
            goto L_0x0029
        L_0x0101:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0140
            r0 = r13 ^ 1
            r2 = r23
            r2.Cmj(r0)
            java.util.Collection r17 = X.0u4.A00(r1)
            if (r13 != 0) goto L_0x0135
            java.lang.Integer r15 = X.AnonymousClass05K.A0C
            java.lang.Integer r16 = X.AnonymousClass05K.A00
            r18 = 0
            r19 = 1
            r14.A07(r15, r16, r17, r18, r19)
            if (r10 != 0) goto L_0x0140
            java.util.Iterator r2 = r1.iterator()
        L_0x0127:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0140
            java.lang.Object r0 = r2.next()
            r3.AHP(r0)
            goto L_0x0127
        L_0x0135:
            java.lang.Integer r15 = X.AnonymousClass05K.A01
            java.lang.Integer r16 = X.AnonymousClass05K.A00
            r18 = 0
            r19 = 1
            r14.A07(r15, r16, r17, r18, r19)
        L_0x0140:
            int r0 = r1.size()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233682wC.A01(com.instagram.common.session.UserSession, X.2mN, X.2uo, X.2vf, X.2vG, X.3kU, X.2vi, java.util.Map, int, boolean, boolean, boolean):int");
    }
}
