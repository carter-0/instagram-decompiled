package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public final class I5U {
    public static final AnonymousClass4DU A00 = new ITQ();
    public static final I5U A01 = new Object();

    public static final ArrayList A00(UserSession userSession, C67251sV r16, List list, List list2, boolean z) {
        int i;
        Integer num;
        int size;
        UserSession userSession2 = userSession;
        ArrayList A0q = AnonymousClass7TF.A0q(userSession, 0);
        Integer num2 = AnonymousClass05K.A0C;
        List list3 = list2;
        boolean z2 = z;
        if (!z) {
            ListIterator A18 = C51968G9o.A18(list3);
            while (true) {
                if (!A18.hasPrevious()) {
                    break;
                } else if (AnonymousClass3VP.A01((1Xg) A18.previous())) {
                    int nextIndex = A18.nextIndex();
                    if (nextIndex >= 0) {
                        i = C51966G9m.A06(list3) - nextIndex;
                        if (AnonymousClass3VP.A00((1Xg) 00k.A0O(list3, nextIndex))) {
                            num2 = AnonymousClass05K.A00;
                        } else {
                            num2 = AnonymousClass05K.A01;
                        }
                    }
                }
            }
        }
        i = 0;
        int i2 = (-i) - 1;
        Iterator it = list.iterator();
        int i3 = -1;
        int i4 = -1;
        while (it.hasNext()) {
            1Xg r7 = (1Xg) it.next();
            AnonymousClass1Xn r3 = r7.A05;
            1Xj A02 = 1Xi.A02(r3);
            if (A02 != null) {
                A02.A01 = i4;
            }
            1Xj A022 = 1Xi.A02(r3);
            if (A022 != null) {
                A022.A02 = i3;
            }
            C67251sV r8 = r16;
            if (AnonymousClass3VP.A00(r7)) {
                I5U i5u = A01;
                Integer num3 = AnonymousClass05K.A00;
                if (i5u.A01(userSession2, r7, r8, num3, num, list3, A0q, i, i2, z2)) {
                    if (z) {
                        i2 = A0q.size();
                    } else {
                        i2 = list3.size() + A0q.size();
                    }
                    A0q.add(r7);
                    num = num3;
                    i4 = i2;
                }
            } else if (AnonymousClass3VP.A03(r7)) {
                I5U i5u2 = A01;
                Integer num4 = AnonymousClass05K.A01;
                if (i5u2.A01(userSession2, r7, r8, num4, num, list3, A0q, i, i2, z2)) {
                    if (z) {
                        size = A0q.size();
                    } else {
                        size = list3.size() + A0q.size();
                    }
                    A0q.add(r7);
                    num = num4;
                    i3 = i2;
                }
            } else {
                A0q.add(r7);
                i++;
            }
            i = 0;
        }
        return A0q;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x018c, code lost:
        if (r7 == r5) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c9, code lost:
        if (r7 != r14) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01f0, code lost:
        if (r7 == r5) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01f2, code lost:
        r5 = r2.A01;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01f8 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A01(com.instagram.common.session.UserSession r22, X.1Xg r23, X.C67251sV r24, java.lang.Integer r25, java.lang.Integer r26, java.util.List r27, java.util.List r28, int r29, int r30, boolean r31) {
        /*
            r21 = this;
            r2 = r23
            X.1Xn r0 = r2.A05
            java.lang.String r10 = r0.C9L()
            r11 = r27
            r9 = r28
            if (r31 == 0) goto L_0x0202
            int r3 = r9.size()
        L_0x0012:
            X.1Xj r6 = X.1Xi.A02(r0)
            X.1UQ r4 = r2.A06
            X.1UQ r2 = X.1UQ.A0Y
            r8 = 1
            r5 = 0
            r1 = r22
            if (r4 != r2) goto L_0x0094
            if (r6 == 0) goto L_0x0094
            boolean r2 = X.C231122qu.A0R(r1, r6)
            if (r2 == 0) goto L_0x0094
        L_0x0028:
            X.0Tu r2 = X.0Tu.A05
            r4 = 36315331467152523(0x81049a00000c8b, double:3.0293000777052736E-306)
            boolean r2 = X.182.A06(r2, r1, r4)
            if (r2 == 0) goto L_0x0091
            r2 = 4885(0x1315, float:6.845E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
        L_0x003b:
            X.4DU r6 = A00
            X.3sc r5 = X.C51965G9l.A0n(r6, r2)
            r5.A7J = r10
            java.lang.String r2 = "timeline_request"
            r5.A4T = r2
            r5.A0B = r3
            X.3VK r4 = X.AnonymousClass3VI.A00(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r4.A05(r6, r2)
            X.1Xj r2 = X.1Xi.A02(r0)
            if (r2 == 0) goto L_0x007d
            boolean r0 = r2.CcK()
            if (r0 == 0) goto L_0x0069
            r5.A0G(r1, r2)
        L_0x0063:
            X.G9w.A1M(r1, r5)
            X.C51965G9l.A1T(r1, r5)
        L_0x0069:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            boolean r0 = X.C271764jY.A00(r1, r5, r6, r0)
            if (r0 != 0) goto L_0x007c
            X.0xI r2 = r5.A00()
            X.0xN r0 = X.C60510iO.A00(r1)
            r0.EHF(r2)
        L_0x007c:
            return r8
        L_0x007d:
            boolean r2 = r0 instanceof X.AnonymousClass3OA
            if (r2 == 0) goto L_0x0069
            r2 = 178(0xb2, float:2.5E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            X.0qQ.A0C(r0, r2)
            X.3OA r0 = (X.AnonymousClass3OA) r0
            java.lang.String r0 = r0.A0S
            r5.A4N = r0
            goto L_0x0063
        L_0x0091:
            java.lang.String r2 = "instagram_ad_async_ad_controller_action_success"
            goto L_0x003b
        L_0x0094:
            int r4 = r26.intValue()
            r2 = r24
            if (r4 == r5) goto L_0x017c
            if (r4 == r8) goto L_0x0179
            if (r31 == 0) goto L_0x0028
            boolean r4 = r9 instanceof java.util.Collection
            if (r4 == 0) goto L_0x0161
            boolean r4 = r9.isEmpty()
            if (r4 == 0) goto L_0x0161
        L_0x00aa:
            r8 = 9
        L_0x00ac:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            r4.addAll(r11)
            r4.addAll(r9)
            java.lang.String r7 = X.C271054hp.A00(r4)
            X.0Tu r6 = X.0Tu.A05
            r4 = 36315331467152523(0x81049a00000c8b, double:3.0293000777052736E-306)
            boolean r4 = X.182.A06(r6, r1, r4)
            if (r4 == 0) goto L_0x015d
            r4 = 1474(0x5c2, float:2.066E-42)
        L_0x00c9:
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            X.4DU r5 = A00
            X.3sc r4 = X.C51965G9l.A0n(r5, r4)
            r4.A7J = r10
            java.lang.String r6 = "timeline_request"
            r4.A4T = r6
            r4.A0A = r8
            r4.A0B = r3
            int r6 = r2.A00
            java.lang.Long r6 = X.DbS.A0j(r6)
            r4.A3g = r6
            int r2 = r2.A01
            java.lang.Long r2 = X.DbS.A0j(r2)
            r4.A3h = r2
            if (r7 == 0) goto L_0x00f1
            r4.A77 = r7
        L_0x00f1:
            X.1Xj r2 = X.1Xi.A02(r0)
            if (r2 == 0) goto L_0x0149
            boolean r0 = r2.CcK()
            if (r0 == 0) goto L_0x013e
            r4.A0G(r1, r2)
            boolean r0 = X.C231122qu.A0R(r1, r2)
            r4.A8B = r0
        L_0x0106:
            X.G9w.A1M(r1, r4)
            X.C51965G9l.A1T(r1, r4)
        L_0x010c:
            X.3VK r2 = X.AnonymousClass3VI.A00(r1)
            X.G9t.A1O(r5, r4, r2)
            java.lang.Integer r0 = r2.A01(r5)
            r4.A2v = r0
            java.lang.Integer r0 = r2.A02(r5)
            r4.A2w = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.A06(r5, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            boolean r0 = X.C271764jY.A00(r1, r4, r5, r0)
            if (r0 != 0) goto L_0x013c
            r4.A0F(r1)
            X.0xI r2 = r4.A00()
            X.0xN r0 = X.C60510iO.A00(r1)
            r0.EHF(r2)
        L_0x013c:
            r8 = 0
            return r8
        L_0x013e:
            java.util.List r0 = r2.A0e
            java.lang.String r0 = X.C243413Yr.A00(r0)
            if (r0 == 0) goto L_0x010c
            r4.A50 = r0
            goto L_0x010c
        L_0x0149:
            boolean r2 = r0 instanceof X.AnonymousClass3OA
            if (r2 == 0) goto L_0x010c
            r2 = 178(0xb2, float:2.5E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            X.0qQ.A0C(r0, r2)
            X.3OA r0 = (X.AnonymousClass3OA) r0
            java.lang.String r0 = r0.A0S
            r4.A4N = r0
            goto L_0x0106
        L_0x015d:
            r4 = 4883(0x1313, float:6.843E-42)
            goto L_0x00c9
        L_0x0161:
            java.util.Iterator r5 = r9.iterator()
        L_0x0165:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x00aa
            java.lang.Object r4 = r5.next()
            X.1Xg r4 = (X.1Xg) r4
            boolean r4 = X.AnonymousClass3VP.A04(r4)
            if (r4 == 0) goto L_0x0165
            goto L_0x0028
        L_0x0179:
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            goto L_0x017e
        L_0x017c:
            java.lang.Integer r6 = X.AnonymousClass05K.A00
        L_0x017e:
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            r7 = r25
            if (r6 != r5) goto L_0x0188
            java.lang.Integer r14 = X.AnonymousClass05K.A01
            if (r7 == r14) goto L_0x018e
        L_0x0188:
            java.lang.Integer r14 = X.AnonymousClass05K.A01
            if (r6 != r14) goto L_0x01f8
            if (r7 != r5) goto L_0x01ff
        L_0x018e:
            int r4 = r2.A01
        L_0x0190:
            r12 = r29
            if (r12 >= r4) goto L_0x0028
            X.4DU r4 = A00
            X.3VL r13 = X.C271924jo.A00(r4)
            if (r13 == 0) goto L_0x01eb
            int r4 = r3 - r30
            int r4 = r4 + -1
            X.1Xj r8 = X.1Xi.A02(r0)
            java.lang.String r20 = X.C51971G9r.A0s(r8)
            X.3VK r8 = X.AnonymousClass3VI.A00(r1)
            if (r30 >= 0) goto L_0x01c7
            r12 = 2
            if (r4 >= r12) goto L_0x01c7
            r16 = 0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r4)
            X.GXs r12 = new X.GXs
            r17 = r16
            r19 = r16
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r8.A07(r12)
        L_0x01c7:
            if (r6 != r5) goto L_0x01ee
            if (r7 == r14) goto L_0x01f2
        L_0x01cb:
            if (r6 != r5) goto L_0x01f5
            if (r7 != r5) goto L_0x01f5
            int r5 = r2.A00
        L_0x01d1:
            if (r4 < r5) goto L_0x01eb
            java.lang.Integer r14 = X.AnonymousClass05K.A0j
            r16 = 0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r4)
            X.GXs r12 = new X.GXs
            r17 = r16
            r19 = r16
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r8.A07(r12)
        L_0x01eb:
            r8 = 6
            goto L_0x00ac
        L_0x01ee:
            if (r6 != r14) goto L_0x01cb
            if (r7 != r5) goto L_0x01f5
        L_0x01f2:
            int r5 = r2.A01
            goto L_0x01d1
        L_0x01f5:
            int r5 = r2.A02
            goto L_0x01d1
        L_0x01f8:
            if (r6 != r5) goto L_0x01ff
            if (r7 != r5) goto L_0x01ff
            int r4 = r2.A00
            goto L_0x0190
        L_0x01ff:
            int r4 = r2.A02
            goto L_0x0190
        L_0x0202:
            int r1 = r11.size()
            int r3 = X.DbT.A01(r9, r1)
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I5U.A01(com.instagram.common.session.UserSession, X.1Xg, X.1sV, java.lang.Integer, java.lang.Integer, java.util.List, java.util.List, int, int, boolean):boolean");
    }
}
