package com.instagram.comments.mvvm.data.network;

public abstract class MediaChildCommentNetworkFetcherKt {
    /* JADX WARNING: type inference failed for: r10v1, types: [X.Avm, X.4D7] */
    /* JADX WARNING: type inference failed for: r10v8 */
    /* JADX WARNING: type inference failed for: r10v9 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0119 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C53401GnY r14, com.instagram.common.session.UserSession r15, java.lang.String r16, java.util.Set r17, X.AnonymousClass4D7 r18, boolean r19, boolean r20) {
        /*
            r2 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r19
            r19 = r20
            r4 = 0
            r9 = r18
            boolean r0 = r9 instanceof X.C41544Avm
            if (r0 == 0) goto L_0x012a
            r10 = r9
            X.Avm r10 = (X.C41544Avm) r10
            int r0 = r10.A08
            if (r0 != r4) goto L_0x012a
            int r3 = r10.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x012a
            int r3 = r3 - r1
            r10.A00 = r3
        L_0x0023:
            java.lang.Object r1 = r10.A05
            X.1Hj r9 = X.1Hj.A02
            int r0 = r10.A00
            r3 = 1
            if (r0 == 0) goto L_0x007a
            if (r0 != r3) goto L_0x01f3
            boolean r0 = r10.A07
            r19 = r0
            boolean r8 = r10.A06
            java.lang.Object r7 = r10.A04
            java.util.Set r7 = (java.util.Set) r7
            java.lang.Object r6 = r10.A03
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r10.A02
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r2 = r10.A01
            X.GnY r2 = (X.C53401GnY) r2
            X.0eS.A00(r1)
        L_0x0047:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x01e7
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r9 = r1.A00
            X.9hf r9 = (X.C384649hf) r9
            java.util.List r0 = r9.A05
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r10 = r0.iterator()
        L_0x005d:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0131
            java.lang.Object r1 = r10.next()
            r0 = r1
            X.1bK r0 = (X.1bK) r0
            java.lang.String r0 = r0.A0r
            if (r0 != 0) goto L_0x0070
            java.lang.String r0 = ""
        L_0x0070:
            boolean r0 = r7.contains(r0)
            if (r0 != 0) goto L_0x005d
            r11.add(r1)
            goto L_0x005d
        L_0x007a:
            X.0eS.A00(r1)
            java.lang.Object r0 = r14.A00
            int r0 = X.AnonymousClass7TE.A0M(r0)
            if (r0 == r4) goto L_0x0122
            if (r0 != r3) goto L_0x01fb
            java.lang.Object r0 = r14.A02
            X.7dk r0 = (X.C335917dk) r0
            boolean r0 = r0.A08
        L_0x008d:
            if (r0 == 0) goto L_0x01f8
            X.1NY r11 = X.AnonymousClass7TG.A0b(r15)
            java.lang.String r13 = r14.A03
            java.lang.String r12 = r14.A04
            java.lang.Object[] r1 = new java.lang.Object[]{r13, r12}
            java.lang.String r0 = "media/%s/comments/%s/inline_child_comments/"
            r11.A0K(r0, r1)
            java.lang.Class<X.9hf> r1 = X.C384649hf.class
            java.lang.Class<X.AAR> r0 = X.AAR.class
            r11.A0Q(r1, r0)
            r11.A03()
            r0 = 1500(0x5dc, double:7.41E-321)
            r11.A00 = r0
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            r11.A01 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "child_comments_media/%s/comments/%s/inline_child_comments/_"
            r1.append(r0)
            r1.append(r13)
            r14 = 95
            r1.append(r14)
            r1.append(r12)
            r1.append(r14)
            java.lang.Object r15 = r2.A02
            X.7dk r15 = (X.C335917dk) r15
            java.lang.String r13 = r15.A04
            r1.append(r13)
            r1.append(r14)
            java.lang.String r12 = r15.A05
            r1.append(r12)
            r1.append(r14)
            boolean r0 = r15.A07
            r1.append(r0)
            r1.append(r14)
            boolean r0 = r15.A08
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r11.A0A = r0
            java.lang.Object r1 = r2.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x011a
            java.lang.String r0 = "max_id"
        L_0x00f9:
            r11.A0G(r0, r13)
        L_0x00fc:
            X.1OC r1 = r11.A0M()
            r10.A01 = r2
            r10.A02 = r5
            r10.A03 = r6
            r10.A04 = r7
            r10.A06 = r8
            r0 = r19
            r10.A07 = r0
            r10.A00 = r3
            r0 = 722993640(0x2b1801e8, float:5.4003893E-13)
            java.lang.Object r1 = r1.A02(r10, r0, r3, r4)
            if (r1 != r9) goto L_0x0047
            return r9
        L_0x011a:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x00fc
            r13 = r12
            java.lang.String r0 = "min_id"
            goto L_0x00f9
        L_0x0122:
            java.lang.Object r0 = r14.A02
            X.7dk r0 = (X.C335917dk) r0
            boolean r0 = r0.A07
            goto L_0x008d
        L_0x012a:
            X.Avm r10 = new X.Avm
            r10.<init>(r9)
            goto L_0x0023
        L_0x0131:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r11 = r11.iterator()
        L_0x0139:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0164
            java.lang.Object r10 = r11.next()
            X.1bK r10 = (X.1bK) r10
            java.lang.String r0 = r10.A0r
            if (r0 == 0) goto L_0x014c
            r7.add(r0)
        L_0x014c:
            java.lang.String r0 = r2.A04
            r16 = 0
            r12 = r5
            r13 = r10
            r14 = r0
            r15 = r6
            r17 = r8
            r18 = r4
            r20 = r4
            X.7dj r0 = X.C335837dc.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r0 == 0) goto L_0x0139
            r1.add(r0)
            goto L_0x0139
        L_0x0164:
            boolean r7 = r9.A07
            java.lang.String r13 = r9.A03
            int r15 = r9.A01
            boolean r6 = r9.A06
            java.lang.String r14 = r9.A04
            int r0 = r9.A00
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            X.7dk r10 = new X.7dk
            r12 = r11
            r19 = r3
            r16 = r0
            r17 = r7
            r18 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r0 = r2.A01
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x01e1
            int r8 = r0.intValue()
            r0 = 9
            if (r8 >= r0) goto L_0x01e1
            java.lang.String r6 = r2.A03
            int r7 = r1.size()
            X.0qQ.A0B(r5, r4)
            X.0qQ.A0B(r6, r3)
            X.0wc r2 = X.AnonymousClass0kN.A02(r5)
            java.lang.String r0 = "instagram_wellbeing_comment_count_accuracy"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r2, r0)
            java.lang.String r2 = "INLINE_CHILD_COMMENT_COUNT"
            java.lang.String r0 = "source_of_action"
            r4.AAJ(r0, r2)
            boolean r0 = X.AnonymousClass7TF.A1S(r8, r7)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_accurate"
            r4.A7p(r0, r2)
            long r2 = (long) r8
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "expected_count"
            r4.A9F(r0, r2)
            long r2 = (long) r7
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "actual_count"
            r4.A9F(r0, r2)
            java.util.concurrent.atomic.AtomicBoolean r0 = X.1Xj.A0i
            java.lang.String r2 = X.1Xv.A06(r6)
            java.lang.String r0 = "media_id"
            r4.AAJ(r0, r2)
            java.lang.String r2 = "DATA_COLLECTION"
            java.lang.String r0 = "step"
            r4.AAJ(r0, r2)
            r4.Cgf()
        L_0x01e1:
            X.9bi r9 = new X.9bi
            r9.<init>(r10, r1)
            return r9
        L_0x01e7:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x01ee
            X.ACO r9 = X.ACO.A00
            return r9
        L_0x01ee:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01f3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01f8:
            X.ACP r9 = X.ACP.A00
            return r9
        L_0x01fb:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.network.MediaChildCommentNetworkFetcherKt.A00(X.GnY, com.instagram.common.session.UserSession, java.lang.String, java.util.Set, X.4D7, boolean, boolean):java.lang.Object");
    }
}
