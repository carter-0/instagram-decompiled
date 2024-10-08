package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.5qo  reason: invalid class name and case insensitive filesystem */
public final class C296885qo {
    public static final C296885qo A00 = new Object();

    /* JADX WARNING: type inference failed for: r9v5, types: [X.5u2, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02e7, code lost:
        X.0wb.A03("DiscoveryRecyclerSectionTransformer", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02ec, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0656, code lost:
        X.0sr.A1T();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x065d, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0156, code lost:
        if (r11 == false) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01e5, code lost:
        if (r10 == false) goto L_0x01e7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:317:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A05(com.instagram.common.session.UserSession r20, X.C295795ov r21, X.C295745oq r22, boolean r23) {
        /*
            r2 = 0
            r1 = r22
            X.0qQ.A0B(r1, r2)
            r3 = 1
            X.5or r5 = r1.A02
            int r0 = r5.ordinal()
            r7 = r20
            r4 = r21
            r17 = r23
            switch(r0) {
                case 0: goto L_0x034c;
                case 1: goto L_0x02d9;
                case 2: goto L_0x0228;
                case 3: goto L_0x0228;
                case 4: goto L_0x0591;
                case 5: goto L_0x0525;
                case 6: goto L_0x0591;
                case 7: goto L_0x0525;
                case 8: goto L_0x0519;
                case 9: goto L_0x017f;
                case 10: goto L_0x00f6;
                case 11: goto L_0x0073;
                case 12: goto L_0x0511;
                case 13: goto L_0x050a;
                case 14: goto L_0x04b2;
                case 15: goto L_0x045a;
                case 16: goto L_0x0531;
                case 17: goto L_0x0531;
                case 18: goto L_0x0025;
                case 19: goto L_0x0016;
                case 20: goto L_0x0440;
                case 21: goto L_0x0016;
                case 22: goto L_0x0418;
                default: goto L_0x0016;
            }
        L_0x0016:
            java.lang.String r1 = "Unsupported DiscoverySection layout_type: "
            java.lang.String r0 = r5.A00
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "DiscoveryRecyclerSectionTransformer"
            X.0wb.A03(r0, r1)
            r0 = 0
        L_0x0024:
            return r0
        L_0x0025:
            X.5qo r7 = A00
            X.5ot r0 = r1.A01
            X.0qQ.A0A(r0)
            X.5ov r10 = r0.A05
            r0 = 0
            if (r10 != 0) goto L_0x0039
            java.lang.String r2 = "Cannot make threeByFourSection with null 3x4 item"
            java.lang.String r1 = "DiscoveryRecyclerSectionTransformer"
            X.0wb.A03(r1, r2)
            return r0
        L_0x0039:
            X.5tr r9 = r1.A00
            X.0qQ.A0A(r9)
            float r5 = r9.A00
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0048
            r5 = 1062956471(0x3f5b6db7, float:0.85714287)
        L_0x0048:
            r6 = 4
            r1 = 3
            X.5qq r8 = X.C296895qp.A01(r5, r6, r1)
            r13 = r0
            r14 = r3
            r12 = r0
            r11 = r4
            X.5qt r5 = r7.A08(r8, r9, r10, r11, r12, r13, r14)
            if (r5 == 0) goto L_0x0024
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            X.5qz r0 = new X.5qz
            r0.<init>(r2, r2)
            r3.add(r5)
            r1.put(r5, r0)
            X.5r0 r0 = new X.5r0
            r0.<init>(r4, r3, r1, r6)
            return r0
        L_0x0073:
            X.5qo r12 = A00
            X.5ot r0 = r1.A01
            X.0qQ.A0A(r0)
            X.5ov r6 = r0.A07
            r0 = 0
            if (r6 != 0) goto L_0x0083
            java.lang.String r2 = "Cannot make TwoByThreeSection with null 2x3 item"
            goto L_0x02e7
        L_0x0083:
            X.5ot r5 = r1.A01
            X.0qQ.A0A(r5)
            java.util.List r11 = r5.A0D
            if (r11 != 0) goto L_0x0090
            java.lang.String r2 = "Cannot make TwoByThreeSection with null fill items"
            goto L_0x02e7
        L_0x0090:
            int r5 = r11.size()
            r10 = 3
            if (r5 >= r10) goto L_0x00a5
            java.lang.String r3 = "Cannot make TwoByThreeSection with "
            int r2 = r11.size()
            java.lang.String r1 = " fill_items"
            java.lang.String r2 = X.002.A0c(r3, r1, r2)
            goto L_0x02e7
        L_0x00a5:
            X.5tr r5 = r1.A00
            X.0qQ.A0A(r5)
            r1 = 2
            X.5qq r13 = X.C296895qp.A02(r10, r1)
            r14 = r5
            r15 = r6
            r16 = r4
            r17 = r0
            r18 = r0
            r19 = r3
            X.5qt r9 = r12.A08(r13, r14, r15, r16, r17, r18, r19)
            if (r9 == 0) goto L_0x0024
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            r6 = 0
        L_0x00ca:
            java.lang.Object r1 = r11.get(r6)
            X.5ov r1 = (X.C295795ov) r1
            X.5qt r5 = r12.A03(r1, r4, r0)
            if (r5 == 0) goto L_0x0024
            X.5qz r1 = new X.5qz
            r1.<init>(r6, r2)
            r8.add(r5)
            r7.put(r5, r1)
            int r6 = r6 + 1
            if (r6 < r10) goto L_0x00ca
            X.5qz r0 = new X.5qz
            r0.<init>(r2, r3)
            r8.add(r3, r9)
            r7.put(r9, r0)
            X.5r0 r0 = new X.5r0
            r0.<init>(r4, r8, r7, r10)
            return r0
        L_0x00f6:
            X.5qo r14 = A00
            X.5ot r0 = r1.A01
            X.0qQ.A0A(r0)
            java.util.List r12 = r0.A0G
            r0 = 0
            if (r12 != 0) goto L_0x010a
            java.lang.String r2 = "Cannot make OneByTwoRowSection with null clips items"
            java.lang.String r1 = "DiscoveryRecyclerSectionTransformer"
            X.0wb.A03(r1, r2)
            return r0
        L_0x010a:
            int r6 = r12.size()
            r5 = 3
            if (r6 == r5) goto L_0x0123
            java.lang.String r3 = "Cannot make OneByTwoRowSection with "
            int r2 = r12.size()
            java.lang.String r1 = " clips"
            java.lang.String r2 = X.002.A0c(r3, r1, r2)
            java.lang.String r1 = "DiscoveryRecyclerSectionTransformer"
            X.0wb.A03(r1, r2)
            return r0
        L_0x0123:
            X.5tr r5 = r1.A00
            X.0qQ.A0A(r5)
            boolean r11 = r5.A01
            r6 = 0
            r5 = 0
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            int r8 = r12.size()
            r7 = 0
        L_0x013b:
            if (r7 >= r8) goto L_0x059d
            java.lang.Object r6 = r12.get(r7)
            X.5ov r6 = (X.C295795ov) r6
            if (r6 != 0) goto L_0x014d
            java.lang.String r2 = "Cannot make OneByTwoRowSection with a null clip"
            java.lang.String r1 = "DiscoveryRecyclerSectionTransformer"
            X.0wb.A03(r1, r2)
            return r0
        L_0x014d:
            X.5tr r5 = r1.A00
            X.0qQ.A0A(r5)
            if (r7 != 0) goto L_0x0158
            r21 = 1
            if (r11 != 0) goto L_0x015a
        L_0x0158:
            r21 = 0
        L_0x015a:
            r13 = 2
            X.5qq r15 = X.C296895qp.A02(r13, r3)
            r16 = r5
            r17 = r6
            r18 = r4
            r19 = r0
            r20 = r0
            X.5qt r6 = r14.A08(r15, r16, r17, r18, r19, r20, r21)
            if (r6 == 0) goto L_0x0024
            X.5qz r5 = new X.5qz
            r5.<init>(r2, r7)
            r10.add(r6)
            r9.put(r6, r5)
            r5 = 2
            r6 = r4
            int r7 = r7 + 1
            goto L_0x013b
        L_0x017f:
            X.5qo r14 = A00
            X.5ot r0 = r1.A01
            X.0qQ.A0A(r0)
            java.util.List r13 = r0.A0G
            r0 = 0
            if (r13 != 0) goto L_0x018f
            java.lang.String r2 = "Cannot make OneByTwoLeftRightSection with null 1x2 item"
            goto L_0x02e7
        L_0x018f:
            int r5 = r13.size()
            java.lang.String r6 = "Cannot make OneByTwoLeftRightSection with "
            r12 = 2
            if (r5 == r12) goto L_0x01a4
            int r2 = r13.size()
            java.lang.String r1 = " items"
            java.lang.String r2 = X.002.A0c(r6, r1, r2)
            goto L_0x02e7
        L_0x01a4:
            X.5ot r5 = r1.A01
            X.0qQ.A0A(r5)
            java.util.List r11 = r5.A0D
            if (r11 != 0) goto L_0x01b1
            java.lang.String r2 = "Cannot make OneByTwoLeftRightSection with null fill items"
            goto L_0x02e7
        L_0x01b1:
            int r5 = r11.size()
            if (r5 == r12) goto L_0x01c3
            int r2 = r11.size()
            java.lang.String r1 = " fill_items"
            java.lang.String r2 = X.002.A0c(r6, r1, r2)
            goto L_0x02e7
        L_0x01c3:
            X.5tr r5 = r1.A00
            X.0qQ.A0A(r5)
            boolean r10 = r5.A01
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            r7 = 0
        L_0x01d5:
            r6 = 0
        L_0x01d6:
            java.lang.Object r5 = r13.get(r7)
            X.5ov r5 = (X.C295795ov) r5
            X.5tr r15 = r1.A00
            X.0qQ.A0A(r15)
            if (r7 != r3) goto L_0x01e7
            r22 = 1
            if (r10 != 0) goto L_0x01e9
        L_0x01e7:
            r22 = 0
        L_0x01e9:
            X.5qq r16 = X.C296895qp.A02(r12, r3)
            r17 = r15
            r18 = r5
            r19 = r4
            r20 = r0
            r21 = r0
            r15 = r14
            X.5qt r15 = r15.A08(r16, r17, r18, r19, r20, r21, r22)
            if (r15 == 0) goto L_0x0024
            X.5qz r5 = new X.5qz
            r5.<init>(r2, r6)
            r9.add(r15)
            r8.put(r15, r5)
            java.lang.Object r5 = r11.get(r7)
            X.5ov r5 = (X.C295795ov) r5
            X.5qt r6 = r14.A03(r5, r4, r0)
            if (r6 == 0) goto L_0x0024
            X.5qz r5 = new X.5qz
            r5.<init>(r7, r3)
            r9.add(r6)
            r8.put(r6, r5)
            int r7 = r7 + 1
            if (r7 >= r12) goto L_0x05a3
            r6 = 2
            if (r7 != 0) goto L_0x01d6
            goto L_0x01d5
        L_0x0228:
            X.5qo r18 = A00
            X.5ot r0 = r1.A01
            X.0qQ.A0A(r0)
            java.util.List r6 = r0.A0E
            r0 = 0
            if (r6 != 0) goto L_0x023c
            java.lang.String r2 = "Cannot make SingleRowSection with null media"
            java.lang.String r1 = "DiscoveryRecyclerSectionTransformer"
            X.0wb.A03(r1, r2)
            return r0
        L_0x023c:
            X.5tr r5 = r1.A00
            X.0qQ.A0A(r5)
            float r13 = r5.A00
            r5 = 0
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x02d5
            r5 = 1077936128(0x40400000, float:3.0)
            float r13 = r13 / r5
        L_0x024b:
            X.5tr r5 = r1.A00
            X.0qQ.A0A(r5)
            boolean r14 = r5.A01
            X.5ot r5 = r1.A01
            X.0qQ.A0A(r5)
            X.9IE r5 = r5.A00
            if (r5 == 0) goto L_0x02d3
            java.lang.Object r7 = r5.A00
            X.1Xj r7 = (X.1Xj) r7
            if (r7 == 0) goto L_0x02d3
            X.5ow r5 = X.C295805ow.UNKNOWN
            X.5ov r12 = new X.5ov
            r12.<init>(r5, r0, r0, r7)
            r12.A01()
        L_0x026b:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            X.5ot r5 = r1.A01
            X.0qQ.A0A(r5)
            java.lang.Integer r5 = r5.A0C
            if (r5 == 0) goto L_0x02d1
            int r5 = r5.intValue()
            java.lang.Object r9 = X.00k.A0O(r6, r5)
            X.5ov r9 = (X.C295795ov) r9
        L_0x0288:
            r5 = 10
            int r5 = X.0Yv.A1E(r6, r5)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r5)
            java.util.Iterator r16 = r6.iterator()
            r7 = 0
        L_0x0298:
            boolean r5 = r16.hasNext()
            if (r5 == 0) goto L_0x05a9
            java.lang.Object r6 = r16.next()
            int r15 = r7 + 1
            if (r7 < 0) goto L_0x0656
            X.5ov r6 = (X.C295795ov) r6
            X.5ot r5 = r1.A01
            X.0qQ.A0A(r5)
            java.lang.Integer r5 = r5.A0C
            if (r5 == 0) goto L_0x02bc
            int r5 = r5.intValue()
            if (r7 != r5) goto L_0x02bc
            if (r17 == 0) goto L_0x02bc
            if (r12 == 0) goto L_0x02bc
            r6 = r12
        L_0x02bc:
            r19 = r6
            r20 = r4
            r21 = r9
            r22 = r13
            r23 = r14
            X.5qt r5 = r18.A04(r19, r20, r21, r22, r23)
            if (r5 == 0) goto L_0x0024
            r8.add(r5)
            r7 = r15
            goto L_0x0298
        L_0x02d1:
            r9 = r0
            goto L_0x0288
        L_0x02d3:
            r12 = r0
            goto L_0x026b
        L_0x02d5:
            r13 = 1065353216(0x3f800000, float:1.0)
            goto L_0x024b
        L_0x02d9:
            X.5qo r14 = A00
            X.5ot r0 = r1.A01
            X.0qQ.A0A(r0)
            java.util.List r12 = r0.A0E
            r0 = 0
            if (r12 != 0) goto L_0x02ed
            java.lang.String r2 = "Cannot make MediaGridSection with null media"
        L_0x02e7:
            java.lang.String r1 = "DiscoveryRecyclerSectionTransformer"
            X.0wb.A03(r1, r2)
            return r0
        L_0x02ed:
            int r3 = r12.size()
            r2 = 3
            if (r3 >= r2) goto L_0x02f7
            java.lang.String r2 = "Cannot make MediaGridSection with an incomplete row."
            goto L_0x02e7
        L_0x02f7:
            int r2 = r12.size()
            int r11 = r2 / 3
            X.5tr r2 = r1.A00
            X.0qQ.A0A(r2)
            float r10 = r2.A00
            r2 = 0
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0349
            r2 = 1077936128(0x40400000, float:3.0)
            float r10 = r10 / r2
        L_0x030c:
            X.5tr r1 = r1.A00
            X.0qQ.A0A(r1)
            boolean r13 = r1.A01
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            int r7 = r11 * 3
            r6 = 0
        L_0x0320:
            if (r6 >= r7) goto L_0x05d2
            java.lang.Object r1 = r12.get(r6)
            X.5ov r1 = (X.C295795ov) r1
            r15 = r1
            r16 = r4
            r17 = r0
            r18 = r10
            r19 = r13
            X.5qt r5 = r14.A04(r15, r16, r17, r18, r19)
            if (r5 == 0) goto L_0x0024
            int r3 = r6 / 3
            int r2 = r6 % 3
            X.5qz r1 = new X.5qz
            r1.<init>(r3, r2)
            r9.add(r5)
            r8.put(r5, r1)
            int r6 = r6 + 1
            goto L_0x0320
        L_0x0349:
            r10 = 1065353216(0x3f800000, float:1.0)
            goto L_0x030c
        L_0x034c:
            X.5qo r12 = A00
            X.5ot r0 = r1.A01
            X.0qQ.A0A(r0)
            X.5ov r9 = r0.A03
            r0 = 0
            if (r9 != 0) goto L_0x0360
            java.lang.String r2 = "Cannot make FullWidthSection without full_item"
            java.lang.String r1 = "DiscoveryRecyclerSectionTransformer"
            X.0wb.A03(r1, r2)
            return r0
        L_0x0360:
            X.5ow r11 = r9.A00
            int r6 = r11.ordinal()
            r5 = 29
            if (r6 == r5) goto L_0x03ef
            r5 = 30
            if (r6 == r5) goto L_0x05e0
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            X.5or r6 = r1.A02
            X.5or r5 = X.C295755or.FULL_WIDTH
            if (r6 != r5) goto L_0x05d8
            X.5ow r5 = X.C295805ow.BLOKS
            r10 = 3
            if (r11 == r5) goto L_0x03e7
            X.5ow r5 = X.C295805ow.MEDIA_LOCATION_MAP
            if (r11 != r5) goto L_0x03c9
            android.content.Context r11 = X.C60960kU.A00
            X.0qQ.A07(r11)
            int r5 = X.0nA.A09(r11)
            float r6 = (float) r5
            r5 = 187(0xbb, float:2.62E-43)
            float r5 = X.0nA.A04(r11, r5)
            float r6 = r6 / r5
        L_0x0398:
            X.5qq r13 = X.C296895qp.A01(r6, r3, r10)
        L_0x039c:
            X.5tr r1 = r1.A00
            X.0qQ.A0A(r1)
            r18 = r0
            r14 = r1
            r15 = r9
            r16 = r4
            r17 = r0
            r19 = r3
            X.5qt r1 = r12.A08(r13, r14, r15, r16, r17, r18, r19)
            if (r1 == 0) goto L_0x0024
            X.5qz r0 = new X.5qz
            r0.<init>(r2, r2)
            r8.add(r1)
            r7.put(r1, r0)
            X.5r0 r1 = new X.5r0
            r1.<init>(r4, r8, r7, r3)
        L_0x03c1:
            java.util.List r0 = java.util.Collections.singletonList(r1)
            X.0qQ.A07(r0)
            return r0
        L_0x03c9:
            X.5tr r5 = r1.A00
            X.0qQ.A0A(r5)
            float r6 = r5.A00
            r5 = 0
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x0398
            X.5ow r5 = r9.A00
            int r6 = r5.ordinal()
            if (r6 == r3) goto L_0x03ec
            r5 = 2
            if (r6 == r5) goto L_0x03ec
            r5 = 4
            if (r6 == r5) goto L_0x03ec
            r5 = 17
            if (r6 == r5) goto L_0x03ec
        L_0x03e7:
            X.5qq r13 = X.C296895qp.A00()
            goto L_0x039c
        L_0x03ec:
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0398
        L_0x03ef:
            X.5u2 r7 = r9.A06
            X.0qQ.A0A(r7)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            X.5qq r1 = X.C296895qp.A00()
            X.HAU r4 = new X.HAU
            r4.<init>(r1, r7)
            X.5qz r1 = new X.5qz
            r1.<init>(r2, r2)
            r6.add(r4)
            r5.put(r4, r1)
            X.5r0 r1 = new X.5r0
            r1.<init>(r0, r6, r5, r3)
            goto L_0x03c1
        L_0x0418:
            X.5ot r0 = r1.A01
            X.0qQ.A0A(r0)
            X.5ov r3 = r0.A02
            X.5ot r0 = r1.A01
            X.0qQ.A0A(r0)
            java.util.List r2 = r0.A0F
            if (r2 == 0) goto L_0x043e
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x043e
            X.01N r1 = X.0jo.A1H()
            java.util.ArrayList r0 = A06(r7, r3, r2)
            r1.addAll(r0)
            X.01N r0 = X.0jo.A1I(r1)
            return r0
        L_0x043e:
            r0 = 0
            return r0
        L_0x0440:
            X.5ot r0 = r1.A01
            X.0qQ.A0A(r0)
            X.5ts r0 = r0.A01
            if (r0 != 0) goto L_0x0452
            java.lang.String r1 = "Cannot make DiscoveryTabsInfo with null tabs_info"
            java.lang.String r0 = "DiscoveryRecyclerSectionTransformer"
            X.0wb.A03(r0, r1)
            r0 = 0
            return r0
        L_0x0452:
            X.5ot r0 = r1.A01
            X.0qQ.A0A(r0)
            X.5ts r0 = r0.A01
            return r0
        L_0x045a:
            X.5qo r8 = A00
            r0 = 0
            X.5ot r5 = r1.A01     // Catch:{ Exception -> 0x049e }
            X.0qQ.A0A(r5)     // Catch:{ Exception -> 0x049e }
            X.5ov r5 = r5.A08     // Catch:{ Exception -> 0x049e }
            if (r5 == 0) goto L_0x0481
            X.1Xj r5 = r5.A0B     // Catch:{ Exception -> 0x049e }
            if (r5 == 0) goto L_0x0481
            java.lang.String r6 = X.C231122qu.A07(r7, r5)     // Catch:{ Exception -> 0x049e }
        L_0x046e:
            X.5ot r5 = r1.A01     // Catch:{ Exception -> 0x049e }
            X.0qQ.A0A(r5)     // Catch:{ Exception -> 0x049e }
            X.5oq r5 = r5.A0A     // Catch:{ Exception -> 0x049e }
            if (r23 == 0) goto L_0x0483
            r9 = r4
            r10 = r1
            r11 = r5
            r12 = r3
            r13 = r2
            X.5r0 r0 = r8.A01(r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x049e }
            return r0
        L_0x0481:
            r6 = r0
            goto L_0x046e
        L_0x0483:
            if (r5 == 0) goto L_0x0492
            X.5ot r3 = r5.A01     // Catch:{ Exception -> 0x049e }
            r1 = 0
            if (r3 == 0) goto L_0x048b
            r1 = 1
        L_0x048b:
            if (r1 == 0) goto L_0x0492
            java.lang.Object r0 = A05(r7, r4, r5, r2)     // Catch:{ Exception -> 0x049e }
            return r0
        L_0x0492:
            java.lang.String r1 = "Explore grid ad missing fallback for "
            java.lang.String r2 = X.002.A0R(r1, r6)     // Catch:{ Exception -> 0x049e }
            java.lang.String r1 = "DiscoveryRecyclerSectionTransformer"
            X.0wb.A03(r1, r2)     // Catch:{ Exception -> 0x049e }
            return r0
        L_0x049e:
            r1 = move-exception
            java.lang.String r2 = android.util.Log.getStackTraceString(r1)
            X.0qQ.A07(r2)
            java.lang.String r1 = "Exception when rendering Ad Section: "
            java.lang.String r2 = X.002.A0R(r1, r2)
            java.lang.String r1 = "DiscoveryRecyclerSectionTransformer"
            X.0wb.A03(r1, r2)
            return r0
        L_0x04b2:
            X.5qo r8 = A00
            r0 = 0
            X.5ot r3 = r1.A01     // Catch:{ Exception -> 0x04f6 }
            X.0qQ.A0A(r3)     // Catch:{ Exception -> 0x04f6 }
            X.5ov r3 = r3.A08     // Catch:{ Exception -> 0x04f6 }
            if (r3 == 0) goto L_0x04d9
            X.1Xj r3 = r3.A0B     // Catch:{ Exception -> 0x04f6 }
            if (r3 == 0) goto L_0x04d9
            java.lang.String r6 = X.C231122qu.A07(r7, r3)     // Catch:{ Exception -> 0x04f6 }
        L_0x04c6:
            X.5ot r3 = r1.A01     // Catch:{ Exception -> 0x04f6 }
            X.0qQ.A0A(r3)     // Catch:{ Exception -> 0x04f6 }
            X.5oq r5 = r3.A0A     // Catch:{ Exception -> 0x04f6 }
            if (r23 == 0) goto L_0x04db
            r13 = 2
            r9 = r4
            r10 = r1
            r11 = r5
            r12 = r2
            X.5r0 r0 = r8.A01(r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x04f6 }
            return r0
        L_0x04d9:
            r6 = r0
            goto L_0x04c6
        L_0x04db:
            if (r5 == 0) goto L_0x04ea
            X.5ot r3 = r5.A01     // Catch:{ Exception -> 0x04f6 }
            r1 = 0
            if (r3 == 0) goto L_0x04e3
            r1 = 1
        L_0x04e3:
            if (r1 == 0) goto L_0x04ea
            java.lang.Object r0 = A05(r7, r4, r5, r2)     // Catch:{ Exception -> 0x04f6 }
            return r0
        L_0x04ea:
            java.lang.String r1 = "Explore grid ad missing fallback for "
            java.lang.String r2 = X.002.A0R(r1, r6)     // Catch:{ Exception -> 0x04f6 }
            java.lang.String r1 = "DiscoveryRecyclerSectionTransformer"
            X.0wb.A03(r1, r2)     // Catch:{ Exception -> 0x04f6 }
            return r0
        L_0x04f6:
            r1 = move-exception
            java.lang.String r2 = android.util.Log.getStackTraceString(r1)
            X.0qQ.A07(r2)
            java.lang.String r1 = "Exception when rendering Ad Section: "
            java.lang.String r2 = X.002.A0R(r1, r2)
            java.lang.String r1 = "DiscoveryRecyclerSectionTransformer"
            X.0wb.A03(r1, r2)
            return r0
        L_0x050a:
            X.5qo r0 = A00
            X.5r0 r0 = r0.A00(r4, r1, r3, r2)
            return r0
        L_0x0511:
            X.5qo r3 = A00
            r0 = 2
            X.5r0 r0 = r3.A00(r4, r1, r2, r0)
            return r0
        L_0x0519:
            X.5qo r5 = A00
            r8 = 0
            r6 = r4
            r7 = r1
            r9 = r3
            r10 = r2
            X.5r0 r0 = r5.A02(r6, r7, r8, r9, r10)
            return r0
        L_0x0525:
            X.5qo r12 = A00
            r15 = 0
            r16 = 2
            r13 = r4
            r14 = r1
            X.5r0 r0 = r12.A02(r13, r14, r15, r16, r17)
            return r0
        L_0x0531:
            X.5qo r9 = A00
            r0 = 0
            X.5ot r3 = r1.A01     // Catch:{ Exception -> 0x057d }
            X.0qQ.A0A(r3)     // Catch:{ Exception -> 0x057d }
            X.5ov r3 = r3.A04     // Catch:{ Exception -> 0x057d }
            if (r3 == 0) goto L_0x0554
            X.1Xj r3 = r3.A0B     // Catch:{ Exception -> 0x057d }
            if (r3 == 0) goto L_0x0554
            java.lang.String r8 = X.C231122qu.A07(r7, r3)     // Catch:{ Exception -> 0x057d }
        L_0x0545:
            X.5ot r3 = r1.A01     // Catch:{ Exception -> 0x057d }
            X.0qQ.A0A(r3)     // Catch:{ Exception -> 0x057d }
            X.5oq r6 = r3.A0A     // Catch:{ Exception -> 0x057d }
            X.5or r5 = r1.A02     // Catch:{ Exception -> 0x057d }
            X.5or r3 = X.C295755or.ONE_BY_TWO_LEFT_WITH_FALLBACK     // Catch:{ Exception -> 0x057d }
            r13 = 2
            if (r5 != r3) goto L_0x0557
            goto L_0x0556
        L_0x0554:
            r8 = r0
            goto L_0x0545
        L_0x0556:
            r13 = 0
        L_0x0557:
            if (r23 == 0) goto L_0x0562
            r10 = r4
            r11 = r1
            r12 = r6
            r14 = r2
            X.5r0 r0 = r9.A02(r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x057d }
            return r0
        L_0x0562:
            if (r6 == 0) goto L_0x0571
            X.5ot r3 = r6.A01     // Catch:{ Exception -> 0x057d }
            r1 = 0
            if (r3 == 0) goto L_0x056a
            r1 = 1
        L_0x056a:
            if (r1 == 0) goto L_0x0571
            java.lang.Object r0 = A05(r7, r4, r6, r2)     // Catch:{ Exception -> 0x057d }
            return r0
        L_0x0571:
            java.lang.String r1 = "Explore grid ad missing fallback for "
            java.lang.String r2 = X.002.A0R(r1, r8)     // Catch:{ Exception -> 0x057d }
            java.lang.String r1 = "DiscoveryRecyclerSectionTransformer"
            X.0wb.A03(r1, r2)     // Catch:{ Exception -> 0x057d }
            return r0
        L_0x057d:
            r1 = move-exception
            java.lang.String r2 = android.util.Log.getStackTraceString(r1)
            X.0qQ.A07(r2)
            java.lang.String r1 = "Exception when rendering Ad Section: "
            java.lang.String r2 = X.002.A0R(r1, r2)
            java.lang.String r1 = "DiscoveryRecyclerSectionTransformer"
            X.0wb.A03(r1, r2)
            return r0
        L_0x0591:
            X.5qo r12 = A00
            r15 = 0
            r13 = r4
            r14 = r1
            r16 = r2
            X.5r0 r0 = r12.A02(r13, r14, r15, r16, r17)
            return r0
        L_0x059d:
            X.5r0 r0 = new X.5r0
            r0.<init>(r6, r10, r9, r5)
            return r0
        L_0x05a3:
            X.5r0 r0 = new X.5r0
            r0.<init>(r4, r9, r8, r12)
            return r0
        L_0x05a9:
            java.util.Iterator r7 = r8.iterator()
            r6 = 0
        L_0x05ae:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x05cc
            java.lang.Object r5 = r7.next()
            int r1 = r6 + 1
            if (r6 < 0) goto L_0x0656
            X.5qz r0 = new X.5qz
            r0.<init>(r2, r6)
            X.0qQ.A0B(r5, r2)
            r11.add(r5)
            r10.put(r5, r0)
            r6 = r1
            goto L_0x05ae
        L_0x05cc:
            X.5r0 r0 = new X.5r0
            r0.<init>(r4, r11, r10, r3)
            return r0
        L_0x05d2:
            X.5r0 r0 = new X.5r0
            r0.<init>(r4, r9, r8, r11)
            return r0
        L_0x05d8:
            java.lang.String r1 = "Check failed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x05e0:
            com.instagram.model.keyword.KeywordRecommendations r11 = r9.A0E
            X.0qQ.A0A(r11)
            X.01N r10 = X.0jo.A1H()
            java.util.List r1 = r11.A02
            java.util.Iterator r14 = r1.iterator()
            r12 = 0
        L_0x05f0:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x065e
            java.lang.Object r7 = r14.next()
            int r13 = r12 + 1
            if (r12 < 0) goto L_0x0656
            com.instagram.model.keyword.Keyword r7 = (com.instagram.model.keyword.Keyword) r7
            java.lang.String r6 = r7.A03
            X.0qQ.A0A(r6)
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            X.5qm r4 = X.C296865qm.NOT_A_TOPIC
            java.lang.String r1 = "midscroll_pivot"
            X.0qQ.A0B(r6, r3)
            X.5u2 r9 = new X.5u2
            r9.<init>()
            r9.A03 = r6
            r9.A05 = r0
            r9.A02 = r5
            r9.A00 = r4
            r9.A04 = r1
            r9.A01 = r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            r6 = 0
            if (r12 != 0) goto L_0x062d
            r6 = 1
        L_0x062d:
            java.util.List r1 = r11.A02
            int r1 = r1.size()
            int r1 = r1 - r3
            r5 = 0
            if (r12 != r1) goto L_0x0638
            r5 = 1
        L_0x0638:
            X.5qq r1 = X.C296895qp.A00()
            X.Ncl r4 = new X.Ncl
            r4.<init>(r1, r9, r6, r5)
            X.5qz r1 = new X.5qz
            r1.<init>(r2, r2)
            r8.add(r4)
            r7.put(r4, r1)
            X.5r0 r1 = new X.5r0
            r1.<init>(r0, r8, r7, r3)
            r10.add(r1)
            r12 = r13
            goto L_0x05f0
        L_0x0656:
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x065e:
            X.01N r0 = X.0jo.A1I(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C296885qo.A05(com.instagram.common.session.UserSession, X.5ov, X.5oq, boolean):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0183  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C296935qt A08(X.C296905qq r21, X.C298685tr r22, X.C295795ov r23, X.C295795ov r24, X.C295745oq r25, X.C295755or r26, boolean r27) {
        /*
            r20 = this;
            r6 = 0
            r7 = r23
            X.0qQ.A0B(r7, r6)
            r4 = 1
            r2 = r22
            X.0qQ.A0B(r2, r4)
            X.5ow r5 = r7.A00
            int r1 = r5.ordinal()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.media.Media"
            java.lang.String r3 = "Required value was null."
            r8 = 0
            r9 = r21
            r10 = r24
            switch(r1) {
                case 1: goto L_0x0066;
                case 2: goto L_0x009e;
                case 17: goto L_0x00c7;
                case 18: goto L_0x00db;
                case 24: goto L_0x00ed;
                case 25: goto L_0x00ff;
                case 27: goto L_0x0113;
                case 32: goto L_0x0125;
                case 33: goto L_0x0049;
                default: goto L_0x001e;
            }
        L_0x001e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Cannot make "
            r1.append(r0)
            int r0 = r9.A04
            r1.append(r0)
            java.lang.String r0 = " x "
            r1.append(r0)
            int r0 = r9.A02
            r1.append(r0)
            java.lang.String r0 = " item with type "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
        L_0x0043:
            java.lang.String r0 = "DiscoveryRecyclerSectionTransformer"
            X.0wb.A03(r0, r1)
            return r8
        L_0x0049:
            java.lang.Object r2 = r7.A0F
            X.0qQ.A0A(r2)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.discovery.interests.model.TopicTile"
            X.0qQ.A0C(r2, r0)
            X.5u4 r2 = (X.C298805u4) r2
            X.1Xj r1 = r2.A01
            if (r1 == 0) goto L_0x0063
            X.CsU r0 = r2.A00
            if (r0 == 0) goto L_0x0063
            X.HAV r8 = new X.HAV
            r8.<init>(r9, r0, r10, r1)
            return r8
        L_0x0063:
            java.lang.String r1 = "Topic tile parameters are null"
            goto L_0x0043
        L_0x0066:
            java.lang.Object r1 = r7.A0F
            X.0qQ.A0A(r1)
            X.0qQ.A0C(r1, r0)
            X.1Xj r1 = (X.1Xj) r1
            boolean r0 = r1.CeS()
            if (r0 == 0) goto L_0x0092
            java.lang.String r16 = r1.getId()
            if (r16 == 0) goto L_0x0098
            java.lang.Integer r15 = X.AnonymousClass05K.A00
            boolean r0 = r2.A01
            java.lang.String r17 = "video_chaining"
            X.HAS r11 = new X.HAS
            r12 = r9
            r13 = r10
            r14 = r1
            r18 = r8
            r19 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x008e:
            r8 = r11
            X.5qt r8 = (X.C296935qt) r8
            return r8
        L_0x0092:
            X.5qy r11 = new X.5qy
            r11.<init>(r9, r10, r1)
            goto L_0x008e
        L_0x0098:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x009e:
            java.lang.Object r1 = r7.A0F
            X.0qQ.A0A(r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.discovery.channel.model.Channel"
            X.0qQ.A0C(r1, r0)
            X.5tu r1 = (X.C298715tu) r1
            java.lang.String r13 = r1.A01
            X.0qQ.A07(r13)
            X.1Xj r11 = r1.A00
            X.0qQ.A07(r11)
            java.lang.Integer r12 = X.AnonymousClass05K.A01
            java.lang.String r14 = r1.A03
            X.0qQ.A07(r14)
            java.lang.String r15 = r1.A02
            boolean r0 = r2.A01
            X.HAS r8 = new X.HAS
            r16 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            return r8
        L_0x00c7:
            java.lang.Object r1 = r7.A0F
            X.0qQ.A0A(r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.discovery.igtv.model.IGTVMedia"
            X.0qQ.A0C(r1, r0)
            X.5tx r1 = (X.C298745tx) r1
            boolean r0 = r2.A01
            X.HAR r8 = new X.HAR
            r8.<init>(r9, r1, r0)
            return r8
        L_0x00db:
            java.lang.Object r1 = r7.A0F
            X.0qQ.A0A(r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.discovery.shopping.model.ShoppingDestination"
            X.0qQ.A0C(r1, r0)
            X.5ty r1 = (X.C298755ty) r1
            X.HAT r8 = new X.HAT
            r8.<init>(r9, r1)
            return r8
        L_0x00ed:
            java.lang.Object r1 = r7.A0F
            X.0qQ.A0A(r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.discovery.mediamap.model.MapTileWithPins"
            X.0qQ.A0C(r1, r0)
            X.5u0 r1 = (X.C298775u0) r1
            X.UlG r8 = new X.UlG
            r8.<init>(r9, r1)
            return r8
        L_0x00ff:
            java.lang.Object r1 = r7.A0F
            X.0qQ.A0A(r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.discovery.clips.model.ClipsUnit"
            X.0qQ.A0C(r1, r0)
            X.5oy r1 = (X.C295825oy) r1
            X.5qs r8 = new X.5qs
            r0 = r27
            r8.<init>(r1, r9, r0)
            return r8
        L_0x0113:
            java.lang.Object r1 = r7.A0F
            X.0qQ.A0A(r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.guides.model.GuideSummary"
            X.0qQ.A0C(r1, r0)
            X.5u1 r1 = (X.C298785u1) r1
            X.5r4 r8 = new X.5r4
            r8.<init>(r9, r1)
            return r8
        L_0x0125:
            java.lang.Object r2 = r7.A0F
            X.0qQ.A0A(r2)
            X.0qQ.A0C(r2, r0)
            X.1Xj r2 = (X.1Xj) r2
            r0 = r25
            if (r25 == 0) goto L_0x0173
            X.5ot r0 = r0.A01
            X.0qQ.A0A(r0)
            if (r0 == 0) goto L_0x0173
            java.util.List r0 = r0.A0D
            if (r0 == 0) goto L_0x0173
            java.lang.Object r1 = X.00k.A0O(r0, r6)
            X.5ov r1 = (X.C295795ov) r1
        L_0x0144:
            boolean r0 = r2.CeS()
            if (r0 != 0) goto L_0x015c
            boolean r0 = r2.A5D()
            if (r0 == 0) goto L_0x0183
            X.1Xj r0 = r2.A1c(r6)
            if (r0 == 0) goto L_0x0183
            boolean r0 = r0.CeS()
            if (r0 != r4) goto L_0x0183
        L_0x015c:
            X.5or r0 = X.C295755or.ONE_BY_TWO_LEFT_WITH_FALLBACK
            r3 = r26
            if (r3 == r0) goto L_0x0175
            X.5or r0 = X.C295755or.ONE_BY_TWO_RIGHT_WITH_FALLBACK
            if (r3 == r0) goto L_0x0175
            if (r1 != 0) goto L_0x016d
            java.lang.String r0 = "two by two grid video ad fallback item is null"
            A07(r0)
        L_0x016d:
            X.TuX r8 = new X.TuX
            r8.<init>(r9, r10, r1, r2)
            return r8
        L_0x0173:
            r1 = r8
            goto L_0x0144
        L_0x0175:
            if (r1 != 0) goto L_0x017c
            java.lang.String r0 = "reels grid ad fallback item is null"
            A07(r0)
        L_0x017c:
            r0 = 0
            X.UlF r8 = new X.UlF
            r8.<init>(r9, r10, r0, r2)
            return r8
        L_0x0183:
            if (r1 != 0) goto L_0x018a
            java.lang.String r0 = "two by two grid ad fallback item is null"
            A07(r0)
        L_0x018a:
            X.GSn r8 = new X.GSn
            r8.<init>(r9, r10, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C296885qo.A08(X.5qq, X.5tr, X.5ov, X.5ov, X.5oq, X.5or, boolean):X.5qt");
    }

    private final C297005r0 A00(C295795ov r19, C295745oq r20, int i, int i2) {
        String A0c;
        C295745oq r1 = r20;
        C295775ot r0 = r1.A01;
        0qQ.A0A(r0);
        C295795ov r13 = r0.A09;
        if (r13 == null) {
            A0c = "Cannot make TwoByTwoSection with null 2x2 item";
        } else {
            C295775ot r02 = r1.A01;
            0qQ.A0A(r02);
            List list = r02.A0D;
            if (list == null) {
                A0c = "Cannot make TwoByTwoSection with null fill items";
            } else if (list.size() != 2) {
                A0c = 002.A0c("Cannot make TwoByTwoSection with ", " fill_items", list.size());
            } else {
                C298685tr r12 = r1.A00;
                0qQ.A0A(r12);
                C295795ov r14 = r19;
                C296935qt A08 = A08(C296895qp.A02(2, 2), r12, r13, r14, (C295745oq) null, r1.A02, true);
                if (A08 != null) {
                    ArrayList arrayList = new ArrayList();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int size = list.size();
                    int i3 = 0;
                    while (i3 < size) {
                        C296935qt A03 = A03((C295795ov) list.get(i3), r14, (C295795ov) null);
                        if (A03 != null) {
                            C296995qz r03 = new C296995qz(i3, i2);
                            arrayList.add(A03);
                            linkedHashMap.put(A03, r03);
                            i3++;
                        }
                    }
                    int i4 = i;
                    C296995qz r04 = new C296995qz(0, i4);
                    arrayList.add(i4, A08);
                    linkedHashMap.put(A08, r04);
                    return new C297005r0(r14, arrayList, linkedHashMap, 2);
                }
                return null;
            }
        }
        0wb.A03("DiscoveryRecyclerSectionTransformer", A0c);
        return null;
    }

    private final C297005r0 A01(C295795ov r20, C295745oq r21, C295745oq r22, int i, int i2) {
        String A0c;
        C295745oq r1 = r21;
        C295775ot r0 = r1.A01;
        0qQ.A0A(r0);
        C295795ov r14 = r0.A08;
        if (r14 == null) {
            A0c = "Cannot make TwoByTwoSection with null 2x2 item";
        } else {
            C295775ot r02 = r1.A01;
            0qQ.A0A(r02);
            List list = r02.A0D;
            if (list == null) {
                A0c = "Cannot make TwoByTwoSection with null fill items";
            } else if (list.size() != 2) {
                A0c = 002.A0c("Cannot make TwoByTwoSection with ", " fill_items", list.size());
            } else {
                C298685tr r13 = r1.A00;
                0qQ.A0A(r13);
                C295795ov r15 = r20;
                C296935qt A08 = A08(C296895qp.A02(2, 2), r13, r14, r15, r22, r1.A02, true);
                if (A08 != null) {
                    ArrayList arrayList = new ArrayList();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int size = list.size();
                    int i3 = 0;
                    while (i3 < size) {
                        C296935qt A03 = A03((C295795ov) list.get(i3), r15, (C295795ov) null);
                        if (A03 != null) {
                            C296995qz r03 = new C296995qz(i3, i2);
                            arrayList.add(A03);
                            linkedHashMap.put(A03, r03);
                            i3++;
                        }
                    }
                    int i4 = i;
                    C296995qz r04 = new C296995qz(0, i4);
                    arrayList.add(i4, A08);
                    linkedHashMap.put(A08, r04);
                    return new C297005r0(r15, arrayList, linkedHashMap, 2);
                }
                return null;
            }
        }
        0wb.A03("DiscoveryRecyclerSectionTransformer", A0c);
        return null;
    }

    private final C297005r0 A02(C295795ov r25, C295745oq r26, C295745oq r27, int i, boolean z) {
        int i2;
        C295795ov r5;
        C295795ov r4;
        1Xj r2;
        String A0c;
        C295745oq r13 = r26;
        C295775ot r0 = r13.A01;
        0qQ.A0A(r0);
        C295795ov r42 = r0.A04;
        if (r42 == null) {
            A0c = "Cannot make OneByTwoSection with null 1x2 item";
        } else {
            C295775ot r02 = r13.A01;
            0qQ.A0A(r02);
            List list = r02.A0D;
            if (list == null) {
                A0c = "Cannot make OneByTwoSection with null fill items";
            } else if (list.size() != 4) {
                A0c = 002.A0c("Cannot make OneByTwoSection with ", " fill_items", list.size());
            } else {
                C298685tr r3 = r13.A00;
                0qQ.A0A(r3);
                C295795ov r15 = r25;
                C296935qt A08 = A08(C296895qp.A02(2, 1), r3, r42, r15, r27, r13.A02, true);
                if (A08 == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                2HY r1 = new 2HY(0, 2);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = r1.iterator();
                while (true) {
                    i2 = i;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((Number) next).intValue() != i2) {
                        arrayList2.add(next);
                    }
                }
                C295775ot r12 = r13.A01;
                0qQ.A0A(r12);
                AnonymousClass9IE r14 = r12.A00;
                if (r14 == null || (r2 = (1Xj) r14.A00) == null) {
                    r5 = null;
                } else {
                    r5 = new C295795ov(C295805ow.UNKNOWN, (C295825oy) null, (C298795u2) null, r2);
                    r5.A01();
                }
                C295775ot r16 = r13.A01;
                0qQ.A0A(r16);
                Integer num = r16.A0C;
                if (num != null) {
                    r4 = (C295795ov) 00k.A0O(list, num.intValue());
                } else {
                    r4 = null;
                }
                ArrayList arrayList3 = new ArrayList(0Yv.A1E(list, 10));
                Iterator it2 = list.iterator();
                int i3 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            break;
                        }
                        C295795ov r17 = (C295795ov) next2;
                        C295775ot r03 = r13.A01;
                        0qQ.A0A(r03);
                        Integer num2 = r03.A0C;
                        if (num2 != null && i3 == num2.intValue() && z && r5 != null) {
                            r17 = r5;
                        }
                        C296935qt A03 = A00.A03(r17, r15, r4);
                        if (A03 == null) {
                            return null;
                        }
                        arrayList3.add(A03);
                        i3 = i4;
                    } else {
                        int i5 = 0;
                        for (Object next3 : arrayList3) {
                            int i6 = i5 + 1;
                            if (i5 >= 0) {
                                int i7 = 1;
                                if (i5 < 2) {
                                    i7 = 0;
                                }
                                C296995qz r04 = new C296995qz(i7, ((Number) arrayList2.get(i5 % 2)).intValue());
                                0qQ.A0B(next3, 0);
                                arrayList.add(next3);
                                linkedHashMap.put(next3, r04);
                                i5 = i6;
                            }
                        }
                        C296995qz r05 = new C296995qz(0, i2);
                        arrayList.add(i2, A08);
                        linkedHashMap.put(A08, r05);
                        return new C297005r0(r15, arrayList, linkedHashMap, 2);
                    }
                }
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0wb.A03("DiscoveryRecyclerSectionTransformer", A0c);
        return null;
    }

    private final C296935qt A03(C295795ov r6, C295795ov r7, C295795ov r8) {
        C296935qt r0;
        C295805ow r4 = r6.A00;
        int ordinal = r4.ordinal();
        if (ordinal == 1) {
            C296905qq A02 = C296895qp.A02(1, 1);
            Object obj = r6.A0F;
            0qQ.A0A(obj);
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.feed.media.Media");
            r0 = new C296985qy(A02, r7, (1Xj) obj);
        } else if (ordinal != 32) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot make 1x1 item with type ");
            sb.append(r4);
            0wb.A03("DiscoveryRecyclerSectionTransformer", sb.toString());
            return null;
        } else {
            if (r8 == null) {
                A07("one by one grid ad fallback item is null");
            }
            C296905qq A022 = C296895qp.A02(1, 1);
            Object obj2 = r6.A0F;
            0qQ.A0A(obj2);
            0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.feed.media.Media");
            1Xj r1 = (1Xj) obj2;
            0qQ.A0B(r1, 2);
            r0 = new C52435GSn(A022, r7, r8, r1);
        }
        return r0;
    }

    private final C296935qt A04(C295795ov r10, C295795ov r11, C295795ov r12, float f, boolean z) {
        C296935qt r2;
        C295805ow r3 = r10.A00;
        int ordinal = r3.ordinal();
        float f2 = f;
        if (ordinal == 1) {
            C296905qq r32 = new C296905qq(1, 1, 1, 1, f2);
            Object obj = r10.A0F;
            0qQ.A0A(obj);
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.feed.media.Media");
            r2 = new C296985qy(r32, r11, (1Xj) obj);
        } else if (ordinal == 32) {
            if (r12 == null) {
                A07("one by one grid ad fallback item is null");
            }
            C296905qq r33 = new C296905qq(1, 1, 1, 1, f2);
            Object obj2 = r10.A0F;
            0qQ.A0A(obj2);
            0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.feed.media.Media");
            1Xj r1 = (1Xj) obj2;
            0qQ.A0B(r1, 2);
            r2 = new C52435GSn(r33, r11, r12, r1);
        } else if (ordinal != 25) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot make dynamic 1x1 item with type ");
            sb.append(r3);
            0wb.A03("DiscoveryRecyclerSectionTransformer", sb.toString());
            return null;
        } else {
            C296905qq r34 = new C296905qq(1, 1, 1, 1, f2);
            Object obj3 = r10.A0F;
            0qQ.A0A(obj3);
            0qQ.A0C(obj3, "null cannot be cast to non-null type com.instagram.discovery.clips.model.ClipsUnit");
            r2 = new C296925qs((C295825oy) obj3, r34, z);
        }
        return r2;
    }

    public static final ArrayList A06(UserSession userSession, C295795ov r5, List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object A05 = A05(userSession, r5, (C295745oq) it.next(), false);
                if (A05 != null) {
                    if (A05 instanceof Collection) {
                        for (Object next : (Iterable) A05) {
                            if (next != null) {
                                arrayList.add(next);
                            }
                        }
                    } else {
                        arrayList.add(A05);
                    }
                }
            }
        }
        return arrayList;
    }

    public static final void A07(String str) {
        0wj.A01.AEf(str, 817903268).report();
    }
}
