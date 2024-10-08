package com.instagram.user.follow;

import X.C320136rp;
import X.C41846B3n;
import X.C5W;
import X.C8N;

public abstract class GraphQLFollowRequestApiKt {
    public static final C320136rp A00(C8N c8n) {
        boolean z;
        boolean z2;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        if (c8n == null) {
            return new C320136rp((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, false, false);
        }
        C5W A0E = c8n.A0E();
        if (A0E != null) {
            z = A0E.getCoercedBooleanField(10, "outgoing_request");
        } else {
            z = false;
        }
        C5W A0E2 = c8n.A0E();
        if (A0E2 != null) {
            z2 = A0E2.getCoercedBooleanField(2, "following");
        } else {
            z2 = false;
        }
        C5W A0E3 = c8n.A0E();
        Boolean bool7 = null;
        if (A0E3 != null) {
            bool = C41846B3n.A0d(A0E3, "followed_by", 1);
        } else {
            bool = null;
        }
        C5W A0E4 = c8n.A0E();
        if (A0E4 != null) {
            bool2 = C41846B3n.A0d(A0E4, "incoming_request", 3);
        } else {
            bool2 = null;
        }
        C5W A0E5 = c8n.A0E();
        if (A0E5 != null) {
            bool3 = C41846B3n.A0d(A0E5, "blocking", 0);
        } else {
            bool3 = null;
        }
        C5W A0E6 = c8n.A0E();
        if (A0E6 != null) {
            bool4 = C41846B3n.A0d(A0E6, "muting", 9);
        } else {
            bool4 = null;
        }
        C5W A0E7 = c8n.A0E();
        if (A0E7 != null) {
            bool5 = C41846B3n.A0d(A0E7, "is_private", 7);
        } else {
            bool5 = null;
        }
        C5W A0E8 = c8n.A0E();
        if (A0E8 != null) {
            bool6 = C41846B3n.A0d(A0E8, "subscribed", 12);
        } else {
            bool6 = null;
        }
        C5W A0E9 = c8n.A0E();
        if (A0E9 != null) {
            bool7 = C41846B3n.A0d(A0E9, "is_eligible_to_subscribe", 5);
        }
        return new C320136rp(bool, bool2, bool3, bool4, bool5, bool6, bool7, z, z2);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.Il6, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.common.session.UserSession r21, java.lang.String r22, java.lang.String r23, X.AnonymousClass4D7 r24) {
        /*
            r4 = 30
            r5 = r24
            boolean r0 = X.C58074Il6.A02(r4, r5)
            if (r0 == 0) goto L_0x0135
            r3 = r5
            X.Il6 r3 = (X.C58074Il6) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0135
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0018:
            java.lang.Object r1 = r3.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r15 = 1
            if (r0 == 0) goto L_0x00a2
            if (r0 != r15) goto L_0x0141
            X.0eS.A00(r1)
        L_0x0026:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0099
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            X.DwR r5 = new X.DwR
            r5.<init>()
            java.lang.Object r3 = r0.A01
            X.3lr r3 = (X.C250663lr) r3
            if (r3 == 0) goto L_0x0097
            java.lang.Class<X.C5U> r2 = X.C5U.class
            r4 = 0
            java.lang.String r1 = "xdt_friendships_approve_user(radio_type:$radio_type,target_user_id:$user_id)"
            r0 = 1045991454(0x3e58901e, float:0.21148726)
            X.3lr r3 = r3.getRequiredTreeField(r4, r1, r2, r0)
            if (r3 == 0) goto L_0x0097
            java.lang.Class<X.C5T> r2 = X.C5T.class
            java.lang.String r1 = "user"
            r0 = 311273198(0x128da6ee, float:8.939502E-28)
            X.3lr r2 = r3.getOptionalTreeField(r4, r1, r2, r0)
            if (r2 == 0) goto L_0x0097
            java.lang.Class<X.C8N> r1 = X.C8N.class
            r0 = 173507200(0xa578280, float:1.0376418E-32)
            X.3lr r0 = r2.reinterpretRequired(r4, r1, r0)
            X.C8N r0 = (X.C8N) r0
        L_0x0063:
            X.6rp r1 = A00(r0)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r5.A01 = r1
            X.3Ih r1 = X.C41845B3m.A0d(r5)
        L_0x0071:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0096
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x013c
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r0 = r1.A00
            X.4dm r0 = (X.C268654dm) r0
            if (r0 == 0) goto L_0x0087
            java.lang.Throwable r1 = r0.A01()
            if (r1 != 0) goto L_0x008d
        L_0x0087:
            java.lang.String r0 = "Unknown GraphQL Error"
            java.lang.RuntimeException r1 = X.AnonymousClass7TE.A15(r0)
        L_0x008d:
            X.4dn r0 = new X.4dn
            r0.<init>(r1)
            X.5sO r1 = X.C41845B3m.A0c(r0)
        L_0x0096:
            return r1
        L_0x0097:
            r0 = 0
            goto L_0x0063
        L_0x0099:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0071
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00a2:
            X.0eS.A00(r1)
            r3.A00 = r15
            r16 = 0
            X.2IS r6 = X.C41845B3m.A04()
            X.2IS r5 = X.C41845B3m.A04()
            java.lang.String r0 = "user_id"
            r4 = r22
            boolean r1 = X.C41848B3p.A1Z(r6, r0, r4)
            java.lang.String r0 = "radio_type"
            r7 = r23
            r6.A04(r0, r7)
            X.1vR r10 = X.C41845B3m.A06(r1)
            java.util.Map r12 = r6.getParamsCopy()
            java.util.Map r13 = r5.getParamsCopy()
            java.lang.Class<X.C5V> r14 = X.C5V.class
            java.util.ArrayList r20 = X.AnonymousClass7TE.A1C()
            java.lang.String r11 = "ApproveFollowRequest"
            r17 = 0
            java.lang.String r19 = "xdt_friendships_approve_user"
            com.facebook.pando.PandoGraphQLRequest r9 = new com.facebook.pando.PandoGraphQLRequest
            r18 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.0Tu r6 = X.0Tu.A05
            r0 = 36330819119301401(0x8112b000014319, double:3.0390945312879936E-306)
            r5 = r21
            boolean r0 = X.182.A06(r6, r5, r0)
            if (r0 == 0) goto L_0x012a
            X.3sh r0 = X.C250663lr.Companion
            X.DEn r7 = new X.DEn
            r7.<init>()
            java.util.Map r6 = r7.A00
            java.lang.String r0 = "strong_id__"
            r6.put(r0, r4)
            java.lang.String r8 = "XDTRelationshipInfoDict"
            java.lang.String r0 = "__typename"
            X.0eP r0 = X.AnonymousClass7TE.A1L(r0, r8)
            X.0eP[] r0 = new X.0eP[]{r0}
            java.util.LinkedHashMap r4 = X.0Yt.A07(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r15)
            java.lang.String r0 = "followed_by"
            r4.put(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r17)
            java.lang.String r0 = "incoming_request"
            r4.put(r0, r1)
            java.lang.String r1 = "friendship_status"
            com.facebook.pando.TreeUpdaterJNI r0 = X.C41845B3m.A0T(r8, r4)
            r6.put(r1, r0)
            r9.setOptimisticBuilder(r7)
        L_0x012a:
            X.1vn r0 = X.1vm.A01(r5)
            java.lang.Object r1 = r0.A04(r9, r3)
            if (r1 != r2) goto L_0x0026
            return r2
        L_0x0135:
            X.Il6 r3 = new X.Il6
            r3.<init>(r4, r5)
            goto L_0x0018
        L_0x013c:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0141:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.user.follow.GraphQLFollowRequestApiKt.A01(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.Il6, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.instagram.common.session.UserSession r21, java.lang.String r22, java.lang.String r23, X.AnonymousClass4D7 r24) {
        /*
            r4 = 31
            r5 = r24
            boolean r0 = X.C58074Il6.A02(r4, r5)
            if (r0 == 0) goto L_0x0131
            r3 = r5
            X.Il6 r3 = (X.C58074Il6) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0131
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0018:
            java.lang.Object r1 = r3.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r15 = 1
            if (r0 == 0) goto L_0x00a2
            if (r0 != r15) goto L_0x013d
            X.0eS.A00(r1)
        L_0x0026:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0099
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            X.DwR r5 = new X.DwR
            r5.<init>()
            java.lang.Object r3 = r0.A01
            X.3lr r3 = (X.C250663lr) r3
            if (r3 == 0) goto L_0x0097
            java.lang.Class<X.C5Y> r2 = X.C5Y.class
            r4 = 0
            java.lang.String r1 = "xdt_friendships_ignore_user_v2(radio_type:$radio_type,target_user_id:$user_id)"
            r0 = 118706907(0x71352db, float:1.10834E-34)
            X.3lr r3 = r3.getRequiredTreeField(r4, r1, r2, r0)
            if (r3 == 0) goto L_0x0097
            java.lang.Class<X.C5X> r2 = X.C5X.class
            java.lang.String r1 = "user"
            r0 = -1505579659(0xffffffffa642ad75, float:-6.754235E-16)
            X.3lr r2 = r3.getOptionalTreeField(r4, r1, r2, r0)
            if (r2 == 0) goto L_0x0097
            java.lang.Class<X.C8N> r1 = X.C8N.class
            r0 = 173507200(0xa578280, float:1.0376418E-32)
            X.3lr r0 = r2.reinterpretRequired(r4, r1, r0)
            X.C8N r0 = (X.C8N) r0
        L_0x0063:
            X.6rp r1 = A00(r0)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r5.A01 = r1
            X.3Ih r1 = X.C41845B3m.A0d(r5)
        L_0x0071:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0096
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0138
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r0 = r1.A00
            X.4dm r0 = (X.C268654dm) r0
            if (r0 == 0) goto L_0x0087
            java.lang.Throwable r1 = r0.A01()
            if (r1 != 0) goto L_0x008d
        L_0x0087:
            java.lang.String r0 = "Unknown GraphQL Error"
            java.lang.RuntimeException r1 = X.AnonymousClass7TE.A15(r0)
        L_0x008d:
            X.4dn r0 = new X.4dn
            r0.<init>(r1)
            X.5sO r1 = X.C41845B3m.A0c(r0)
        L_0x0096:
            return r1
        L_0x0097:
            r0 = 0
            goto L_0x0063
        L_0x0099:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0071
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00a2:
            X.0eS.A00(r1)
            r3.A00 = r15
            r16 = 0
            X.2IS r6 = X.C41845B3m.A04()
            X.2IS r5 = X.C41845B3m.A04()
            java.lang.String r0 = "user_id"
            r4 = r22
            boolean r1 = X.C41848B3p.A1Z(r6, r0, r4)
            java.lang.String r0 = "radio_type"
            r7 = r23
            r6.A04(r0, r7)
            X.1vR r10 = X.C41845B3m.A06(r1)
            java.util.Map r12 = r6.getParamsCopy()
            java.util.Map r13 = r5.getParamsCopy()
            java.lang.Class<X.C5Z> r14 = X.C5Z.class
            java.util.ArrayList r20 = X.AnonymousClass7TE.A1C()
            java.lang.String r11 = "IgnoreFollowRequest"
            r17 = 0
            java.lang.String r19 = "xdt_friendships_ignore_user_v2"
            com.facebook.pando.PandoGraphQLRequest r9 = new com.facebook.pando.PandoGraphQLRequest
            r18 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.0Tu r6 = X.0Tu.A05
            r0 = 36330819119301401(0x8112b000014319, double:3.0390945312879936E-306)
            r5 = r21
            boolean r0 = X.182.A06(r6, r5, r0)
            if (r0 == 0) goto L_0x0126
            X.3sh r0 = X.C250663lr.Companion
            X.DEn r7 = new X.DEn
            r7.<init>()
            java.util.Map r6 = r7.A00
            java.lang.String r0 = "strong_id__"
            r6.put(r0, r4)
            java.lang.String r8 = "XDTRelationshipInfoDict"
            java.lang.String r0 = "__typename"
            X.0eP r0 = X.AnonymousClass7TE.A1L(r0, r8)
            X.0eP[] r0 = new X.0eP[]{r0}
            java.util.LinkedHashMap r4 = X.0Yt.A07(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r17)
            java.lang.String r0 = "followed_by"
            r4.put(r0, r1)
            java.lang.String r0 = "incoming_request"
            r4.put(r0, r1)
            java.lang.String r1 = "friendship_status"
            com.facebook.pando.TreeUpdaterJNI r0 = X.C41845B3m.A0T(r8, r4)
            r6.put(r1, r0)
            r9.setOptimisticBuilder(r7)
        L_0x0126:
            X.1vn r0 = X.1vm.A01(r5)
            java.lang.Object r1 = r0.A04(r9, r3)
            if (r1 != r2) goto L_0x0026
            return r2
        L_0x0131:
            X.Il6 r3 = new X.Il6
            r3.<init>(r4, r5)
            goto L_0x0018
        L_0x0138:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x013d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.user.follow.GraphQLFollowRequestApiKt.A02(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }
}
