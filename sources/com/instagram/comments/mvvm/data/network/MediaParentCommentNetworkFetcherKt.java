package com.instagram.comments.mvvm.data.network;

import X.0qQ;
import X.1Fa;
import X.AnonymousClass000;
import X.AnonymousClass05K;
import X.C333797aA;
import X.C333807aB;
import X.C333817aC;
import X.C333837aE;
import X.C334157al;

public abstract class MediaParentCommentNetworkFetcherKt {
    /* JADX WARNING: type inference failed for: r9v1, types: [X.9Jh, X.4D7] */
    /* JADX WARNING: type inference failed for: r9v8 */
    /* JADX WARNING: type inference failed for: r9v9 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C46255DSk r14, X.C333817aC r15, com.instagram.common.session.UserSession r16, java.lang.String r17, java.lang.String r18, X.AnonymousClass4D7 r19, X.0sP r20, boolean r21) {
        /*
            r5 = r15
            r3 = r16
            r4 = r17
            r6 = r18
            r8 = r20
            r18 = r21
            r7 = 0
            r10 = r19
            boolean r0 = r10 instanceof X.C376779Jh
            if (r0 == 0) goto L_0x00ff
            r9 = r10
            X.9Jh r9 = (X.C376779Jh) r9
            int r0 = r9.A08
            if (r0 != r7) goto L_0x00ff
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ff
            int r2 = r2 - r1
            r9.A00 = r2
        L_0x0024:
            java.lang.Object r1 = r9.A06
            X.1Hj r10 = X.1Hj.A02
            int r0 = r9.A00
            r2 = 1
            if (r0 == 0) goto L_0x0080
            if (r0 != r2) goto L_0x01f8
            boolean r0 = r9.A07
            r18 = r0
            java.lang.Object r8 = r9.A05
            X.0sP r8 = (X.0sP) r8
            java.lang.Object r6 = r9.A04
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r4 = r9.A03
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r9.A02
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r5 = r9.A01
            X.7aC r5 = (X.C333817aC) r5
            X.0eS.A00(r1)
        L_0x004a:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0163
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r2 = r1.A00
            X.7dW r2 = (X.C335777dW) r2
            java.util.List r0 = r2.A0D
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r0.iterator()
        L_0x0061:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0106
            java.lang.Object r9 = r10.next()
            r0 = r9
            X.1bK r0 = (X.1bK) r0
            java.util.Set r1 = r5.A02
            java.lang.String r0 = r0.A0r
            if (r0 != 0) goto L_0x0076
            java.lang.String r0 = ""
        L_0x0076:
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0061
            r11.add(r9)
            goto L_0x0061
        L_0x0080:
            X.0eS.A00(r1)
            boolean r0 = r15.A03
            if (r0 == 0) goto L_0x0200
            X.7aB r13 = r15.A00
            java.lang.String r0 = r15.A01
            if (r0 != 0) goto L_0x00fc
            X.7al r12 = X.C334157al.INITIAL_LOADING
        L_0x008f:
            X.0qQ.A0B(r3, r2)
            r11 = r14
            if (r14 == 0) goto L_0x00a8
            X.0Tu r14 = X.0Tu.A05
            r0 = 36321078133400641(0x8109d400002441, double:3.032934292580551E-306)
            boolean r0 = X.182.A06(r14, r3, r0)
            if (r0 == 0) goto L_0x00a8
            java.lang.String r15 = r11.getMediaId()
            if (r15 != 0) goto L_0x00aa
        L_0x00a8:
            java.lang.String r15 = r13.A04
        L_0x00aa:
            java.lang.String r1 = X.C334217ar.A00(r11, r3)
            if (r1 == 0) goto L_0x00f9
            java.lang.String r11 = "media/%s/comments_for_pac_ad/"
        L_0x00b2:
            r16 = 0
            r0 = -2
            X.1NY r14 = new X.1NY
            r14.<init>(r3, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r14.A08(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r15}
            r14.A0K(r11, r0)
            r0 = 1666(0x682, float:2.335E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r14.A0G(r0, r1)
            java.lang.Class<X.7dW> r11 = X.C335777dW.class
            java.lang.Class<X.7at> r1 = X.C334227at.class
            r0 = r16
            r14.A0O(r0, r11, r1, r7)
            A03(r14, r5, r13, r12)
            X.1OC r1 = r14.A0M()
            r9.A01 = r5
            r9.A02 = r3
            r9.A03 = r4
            r9.A04 = r6
            r9.A05 = r8
            r0 = r18
            r9.A07 = r0
            r9.A00 = r2
            r0 = 722993640(0x2b1801e8, float:5.4003893E-13)
            java.lang.Object r1 = r1.A02(r9, r0, r2, r7)
            if (r1 != r10) goto L_0x004a
            return r10
        L_0x00f9:
            java.lang.String r11 = "media/%s/comments/"
            goto L_0x00b2
        L_0x00fc:
            X.7al r12 = X.C334157al.HEAD_LOADING
            goto L_0x008f
        L_0x00ff:
            X.9Jh r9 = new X.9Jh
            r9.<init>(r10)
            goto L_0x0024
        L_0x0106:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r10 = r11.iterator()
        L_0x010f:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0140
            java.lang.Object r9 = r10.next()
            X.1bK r9 = (X.1bK) r9
            java.lang.String r1 = r9.A0r
            if (r1 == 0) goto L_0x0124
            java.util.Set r0 = r5.A02
            r0.add(r1)
        L_0x0124:
            r8.invoke(r2)
            boolean r1 = r2.A0K
            java.util.Set r0 = r5.A02
            r19 = r7
            r20 = r1
            r14 = r9
            r15 = r4
            r16 = r6
            r17 = r0
            r13 = r3
            X.9IV r0 = X.C335837dc.A00(r13, r14, r15, r16, r17, r18, r19, r20)
            if (r0 == 0) goto L_0x010f
            r12.add(r0)
            goto L_0x010f
        L_0x0140:
            java.lang.Integer r1 = r2.A07
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r14 = 0
            if (r1 != r0) goto L_0x0148
            r14 = 1
        L_0x0148:
            java.util.List r13 = r2.A0F
            boolean r15 = r2.A0K
            java.lang.String r11 = r2.A0C
            boolean r1 = r2.A0I
            java.lang.Integer r10 = r2.A08
            X.7aA r9 = r2.A05
            boolean r0 = r2.A0G
            X.7aI r8 = r2.A04
            r7 = 0
            X.7dl r6 = new X.7dl
            r17 = r0
            r16 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r6
        L_0x0163:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x01f2
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r3 = r1.A00
            X.4dm r3 = (X.C268654dm) r3
            java.lang.Object r4 = r3.A00()
            X.1XP r4 = (X.1XP) r4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "commentFetchType = "
            r2.append(r0)
            java.lang.String r0 = r5.A01
            if (r0 != 0) goto L_0x01ef
            X.7al r0 = X.C334157al.INITIAL_LOADING
        L_0x0183:
            r2.append(r0)
            if (r4 == 0) goto L_0x01ec
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "|| Error Title: "
            r1.append(r0)
            java.lang.String r0 = r4.mErrorTitle
            r1.append(r0)
            java.lang.String r0 = "|| Error Type: "
            r1.append(r0)
            java.lang.String r0 = r4.mErrorType
            r1.append(r0)
            java.lang.String r0 = "|| Error Message: "
            r1.append(r0)
            java.lang.String r0 = r4.getErrorMessage()
            r1.append(r0)
            java.lang.String r0 = "|| Status: "
            r1.append(r0)
            java.lang.String r0 = r4.getStatus()
            r1.append(r0)
            java.lang.String r0 = "|| Status Code: "
            r1.append(r0)
            int r0 = r4.mStatusCode
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x01c7:
            r2.append(r0)
            java.lang.String r0 = " || Throwable = "
            r2.append(r0)
            java.lang.Throwable r0 = r3.A01()
            if (r0 == 0) goto L_0x01db
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L_0x01dd
        L_0x01db:
            java.lang.String r0 = "null"
        L_0x01dd:
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = "CommentsFetcher#Comments Fetch Error"
            X.0wb.A03(r0, r1)
            X.7do r0 = X.C335957do.A00
            return r0
        L_0x01ec:
            java.lang.String r0 = "FetchCommentPageResponse = null || Error = null"
            goto L_0x01c7
        L_0x01ef:
            X.7al r0 = X.C334157al.HEAD_LOADING
            goto L_0x0183
        L_0x01f2:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x01f8:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0200:
            X.7dn r0 = X.C335947dn.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.network.MediaParentCommentNetworkFetcherKt.A00(X.DSk, X.7aC, com.instagram.common.session.UserSession, java.lang.String, java.lang.String, X.4D7, X.0sP, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.4D7, X.9Jj] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C333817aC r12, com.instagram.common.session.UserSession r13, X.1Xj r14, java.lang.String r15, java.lang.String r16, X.AnonymousClass4D7 r17, X.C62320sa r18, boolean r19) {
        /*
            r4 = r12
            r12 = r13
            r5 = r14
            r14 = r15
            r15 = r16
            r6 = r18
            r7 = r19
            r11 = 0
            r8 = r17
            boolean r0 = r8 instanceof X.C376799Jj
            if (r0 == 0) goto L_0x00ef
            r3 = r8
            X.9Jj r3 = (X.C376799Jj) r3
            int r0 = r3.A09
            if (r0 != r11) goto L_0x00ef
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ef
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0023:
            java.lang.Object r1 = r3.A07
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r8 = 1
            if (r0 == 0) goto L_0x008a
            if (r0 != r8) goto L_0x0225
            boolean r7 = r3.A08
            java.lang.Object r6 = r3.A06
            X.0sa r6 = (X.C62320sa) r6
            java.lang.Object r15 = r3.A05
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r14 = r3.A04
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r5 = r3.A03
            X.1Xj r5 = (X.1Xj) r5
            java.lang.Object r12 = r3.A02
            com.instagram.common.session.UserSession r12 = (com.instagram.common.session.UserSession) r12
            java.lang.Object r4 = r3.A01
            X.7aC r4 = (X.C333817aC) r4
            X.0eS.A00(r1)
        L_0x004b:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0178
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r2 = r1.A00
            X.CEp r2 = (X.C43823CEp) r2
            X.Jte r0 = r2.FH3()
            java.util.List r3 = r0.A01
            X.1E5 r9 = X.1E4.A00(r12)
            X.0qQ.A0B(r3, r11)
            X.0qQ.A0B(r9, r8)
            r0 = 10
            int r0 = X.0Yv.A1E(r3, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            java.util.Iterator r8 = r3.iterator()
        L_0x0076:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00f6
            java.lang.Object r0 = r8.next()
            X.1bM r0 = (X.C65211bM) r0
            X.1bK r0 = r0.FDw(r9)
            r1.add(r0)
            goto L_0x0076
        L_0x008a:
            X.0eS.A00(r1)
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x022d
            r1 = 0
            r0 = -2
            X.1NY r9 = new X.1NY
            r9.<init>(r13, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r9.A08(r0)
            java.lang.Object[] r10 = new java.lang.Object[r11]
            r0 = 1571(0x623, float:2.201E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.0mp.A06(r0, r10)
            r9.A0A(r0)
            java.lang.Class<X.CEp> r10 = X.C43823CEp.class
            java.lang.Class<X.D2A> r0 = X.D2A.class
            r9.A0O(r1, r10, r0, r11)
            X.7aB r0 = r4.A00
            java.lang.String r10 = r0.A04
            java.lang.String r0 = "media_id"
            r9.A9m(r0, r10)
            java.lang.String r0 = "min_id"
            r9.A9m(r0, r1)
            java.lang.String r0 = "max_id"
            r9.A9m(r0, r1)
            r0 = 3053(0xbed, float:4.278E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "true"
            r9.A9m(r1, r0)
            X.1OC r1 = r9.A0M()
            r3.A01 = r4
            r3.A02 = r13
            r3.A03 = r5
            r3.A04 = r14
            r3.A05 = r15
            r3.A06 = r6
            r3.A08 = r7
            r3.A00 = r8
            r0 = 722993640(0x2b1801e8, float:5.4003893E-13)
            java.lang.Object r1 = r1.A02(r3, r0, r8, r11)
            if (r1 != r2) goto L_0x004b
            return r2
        L_0x00ef:
            X.9Jj r3 = new X.9Jj
            r3.<init>(r8)
            goto L_0x0023
        L_0x00f6:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r10 = r1.iterator()
        L_0x00ff:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x011e
            java.lang.Object r9 = r10.next()
            r0 = r9
            X.1bK r0 = (X.1bK) r0
            java.util.Set r1 = r4.A02
            java.lang.String r0 = r0.A0r
            if (r0 != 0) goto L_0x0114
            java.lang.String r0 = ""
        L_0x0114:
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x00ff
            r8.add(r9)
            goto L_0x00ff
        L_0x011e:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x0127:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0150
            java.lang.Object r13 = r8.next()
            X.1bK r13 = (X.1bK) r13
            java.lang.String r1 = r13.A0r
            if (r1 == 0) goto L_0x013c
            java.util.Set r0 = r4.A02
            r0.add(r1)
        L_0x013c:
            java.util.Set r0 = r4.A02
            r18 = r11
            r19 = r11
            r17 = r7
            r16 = r0
            X.9IV r0 = X.C335837dc.A00(r12, r13, r14, r15, r16, r17, r18, r19)
            if (r0 == 0) goto L_0x0127
            r9.add(r0)
            goto L_0x0127
        L_0x0150:
            if (r5 == 0) goto L_0x0159
            r5.A0W = r3
            X.1Xy r0 = r5.A0C
            r0.EmH(r3)
        L_0x0159:
            r6.invoke()
            r4 = 0
            X.Jte r0 = r2.FH3()
            java.lang.String r8 = r0.A00
            X.Jte r0 = r2.FH3()
            boolean r13 = r0.A02
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            X.7aA r6 = X.C333797aA.NOT_SET
            X.7aI r5 = X.C333877aI.NOT_SET
            X.7dl r3 = new X.7dl
            r10 = r4
            r12 = r11
            r14 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r3
        L_0x0178:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x021f
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r3 = r1.A00
            X.4dm r3 = (X.C268654dm) r3
            java.lang.Object r5 = r3.A00()
            X.1XT r5 = (X.AnonymousClass1XT) r5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "commentFetchType = "
            r2.append(r0)
            java.lang.String r0 = r4.A01
            if (r0 != 0) goto L_0x021b
            X.7al r0 = X.C334157al.INITIAL_LOADING
        L_0x0198:
            r2.append(r0)
            java.lang.String r1 = "null"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            if (r5 == 0) goto L_0x0208
            r4.<init>()
            java.lang.String r0 = "|| Error Title: "
            r4.append(r0)
            java.lang.String r0 = r5.getErrorTitle()
            r4.append(r0)
            java.lang.String r0 = "|| Error Type: "
            r4.append(r0)
            java.lang.String r0 = r5.getErrorType()
            r4.append(r0)
            java.lang.String r0 = "|| Error Message: "
            r4.append(r0)
            java.lang.String r0 = r5.getErrorMessage()
            r4.append(r0)
            java.lang.String r0 = "|| Status: "
            r4.append(r0)
            java.lang.String r0 = r5.getStatus()
            r4.append(r0)
            java.lang.String r0 = "|| Status Code: "
            r4.append(r0)
            int r0 = r5.getStatusCode()
            r4.append(r0)
        L_0x01e0:
            java.lang.String r0 = r4.toString()
            r2.append(r0)
            java.lang.String r0 = " || Throwable = "
            r2.append(r0)
            java.lang.Throwable r0 = r3.A01()
            if (r0 == 0) goto L_0x01f9
            java.lang.String r0 = r0.getMessage()
            if (r0 == 0) goto L_0x01f9
            r1 = r0
        L_0x01f9:
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = "CommentsFetcher#Comments Fetch Error"
            X.0wb.A03(r0, r1)
            X.7do r0 = X.C335957do.A00
            return r0
        L_0x0208:
            r4.<init>()
            java.lang.String r0 = "FetchStoryCommentsResponse = null || Error = "
            r4.append(r0)
            java.lang.Throwable r0 = r3.A01()
            if (r0 != 0) goto L_0x0217
            r0 = r1
        L_0x0217:
            r4.append(r0)
            goto L_0x01e0
        L_0x021b:
            X.7al r0 = X.C334157al.HEAD_LOADING
            goto L_0x0198
        L_0x021f:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x0225:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x022d:
            X.7dn r0 = X.C335947dn.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.network.MediaParentCommentNetworkFetcherKt.A01(X.7aC, com.instagram.common.session.UserSession, X.1Xj, java.lang.String, java.lang.String, X.4D7, X.0sa, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.Il6, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.instagram.common.session.UserSession r5, java.lang.String r6, X.AnonymousClass4D7 r7) {
        /*
            r3 = 9
            boolean r0 = X.C58074Il6.A02(r3, r7)
            if (r0 == 0) goto L_0x0061
            r4 = r7
            X.Il6 r4 = (X.C58074Il6) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0061
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0051
            if (r0 != r1) goto L_0x006d
            X.0eS.A00(r3)
        L_0x0024:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0047
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r0 = r3.A00
            X.CFL r0 = (X.CFL) r0
            X.Cto r0 = r0.A00
            X.3Ih r3 = new X.3Ih
            r3.<init>(r0)
        L_0x0037:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0046
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0067
            X.0gF r0 = X.C60340gF.A00
            X.5sO r3 = new X.5sO
            r3.<init>(r0)
        L_0x0046:
            return r3
        L_0x0047:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0037
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0051:
            X.0eS.A00(r3)
            X.1OC r0 = X.C3724090s.A02(r5, r6)
            r4.A00 = r1
            java.lang.Object r3 = r0.A01(r4)
            if (r3 != r2) goto L_0x0024
            return r2
        L_0x0061:
            X.Il6 r4 = new X.Il6
            r4.<init>(r3, r7)
            goto L_0x0016
        L_0x0067:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x006d:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.network.MediaParentCommentNetworkFetcherKt.A02(com.instagram.common.session.UserSession, java.lang.String, X.4D7):java.lang.Object");
    }

    public static final void A03(1Fa r4, C333817aC r5, C333807aB r6, C334157al r7) {
        String str;
        C334157al r3 = C334157al.HEAD_LOADING;
        if (r7 == r3) {
            r4.A0G("min_id", r5.A01);
        }
        String str2 = r6.A05;
        if (!(str2 == null || str2.length() == 0)) {
            if (r5.A01 == null) {
                r3 = C334157al.INITIAL_LOADING;
            }
            if (r3 == C334157al.INITIAL_LOADING) {
                r4.A9m("target_comment_id", str2);
            }
        }
        Integer num = r6.A03;
        if (num != AnonymousClass05K.A0u) {
            r4.A9m("sort_order", C333837aE.A00(num));
        }
        C333797aA r1 = r6.A02;
        if (r1 != C333797aA.NOT_SET) {
            0qQ.A0B(r1, 0);
            r4.A9m("comment_filter_param", r1.A00);
        }
        if (r7 == C334157al.INITIAL_LOADING && r6.A07) {
            r4.A9m("permalink_enabled", "true");
        }
        r4.A9m("can_support_threading", "true");
        r4.A9m(AnonymousClass000.A00(603), String.valueOf(r6.A01));
        r4.A0H(AnonymousClass000.A00(669), r6.A06);
        int i = r6.A00;
        if (i != -1) {
            r4.A9m("carousel_index", String.valueOf(i));
        }
        if (r6.A08) {
            r4.A9m("include_preview_comments", "false");
        }
        if (r6.A09) {
            r4.A9m("can_support_carousel_mentions", "true");
        }
        r4.A07(AnonymousClass05K.A0N);
        r4.A01 = 3000;
        StringBuilder sb = new StringBuilder();
        sb.append("comments__");
        C333807aB r2 = r5.A00;
        sb.append(r2.A04);
        sb.append('_');
        sb.append(r2.A05);
        sb.append('_');
        sb.append(r5.A01);
        sb.append('_');
        Integer num2 = r2.A03;
        if (num2 != null) {
            str = C333837aE.A01(num2);
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append('_');
        sb.append(r2.A02);
        r4.A0A = sb.toString();
    }
}
