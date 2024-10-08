package com.instagram.closefriends.audiencelists.api;

import X.002;
import X.0qQ;
import X.1Fa;
import X.1NY;
import X.1OC;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C334247ax;
import X.C334257ay;
import X.C45608CzK;
import X.CDI;
import X.DbT;
import X.DbU;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.Iterator;

public final class AudienceListsApiUtil {
    public static final AudienceListsApiUtil A00 = new Object();

    public static final 1OC A01(UserSession userSession, String str, String str2) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(str, 1);
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0A("friendships/followers_you_follow_back/");
        A0b.A0G("query", str2);
        A0b.A0G("module", str);
        return DbU.A0S(A0b, C334247ax.class, C334257ay.class);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.JUG, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(com.instagram.common.session.UserSession r7, java.lang.Integer r8, java.lang.String r9, java.lang.String r10, X.AnonymousClass4D7 r11, boolean r12) {
        /*
            r6 = this;
            r4 = 33
            boolean r0 = X.JUG.A03(r4, r11)
            if (r0 == 0) goto L_0x0086
            r2 = r11
            X.JUG r2 = (X.JUG) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0086
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0016:
            java.lang.Object r1 = r2.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r2.A00
            r4 = 1
            if (r0 == 0) goto L_0x0044
            if (r0 != r4) goto L_0x0090
            X.0eS.A00(r1)
        L_0x0024:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x003b
            X.3Ih r1 = X.Dbb.A0R(r1)
        L_0x002e:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x003a
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x008b
            X.5sO r1 = X.DbU.A0f()
        L_0x003a:
            return r1
        L_0x003b:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x002e
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0044:
            X.0eS.A00(r1)
            X.Dba.A0j(r4, r7, r9)
            X.1NY r5 = X.AnonymousClass7TG.A0b(r7)
            r5.A02()
            java.lang.Object[] r1 = new java.lang.Object[]{r9}
            java.lang.String r0 = "api/v1/stories/private_stories/%s/members/"
            X.DbU.A1P(r5, r0, r1)
            r0 = 374(0x176, float:5.24E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.A0G(r0, r10)
            java.lang.String r0 = "page_size"
            r5.A09(r8, r0)
            java.lang.String r0 = "pagination_enabled"
            r5.A0H(r0, r12)
            java.lang.Class<X.CEb> r1 = X.C43809CEb.class
            java.lang.Class<X.CzL> r0 = X.C45609CzL.class
            X.1OC r1 = X.DbU.A0S(r5, r1, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.PrivateStoriesMembersResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.PrivateStoriesMembersResponse>>"
            X.0qQ.A0C(r1, r0)
            r2.A00 = r4
            r0 = 266936970(0xfe9228a, float:2.2988878E-29)
            java.lang.Object r1 = r1.A00(r0, r2)
            if (r1 != r3) goto L_0x0024
            return r3
        L_0x0086:
            X.JUG r2 = X.JUG.A00(r6, r11, r4)
            goto L_0x0016
        L_0x008b:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0090:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil.A04(com.instagram.common.session.UserSession, java.lang.Integer, java.lang.String, java.lang.String, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDg, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(com.instagram.common.session.UserSession r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.util.List r16, java.util.List r17, X.AnonymousClass4D7 r18) {
        /*
            r11 = this;
            r3 = 23
            r5 = r18
            boolean r0 = X.C66128MDg.A01(r3, r5)
            if (r0 == 0) goto L_0x00ed
            r4 = r5
            X.MDg r4 = (X.C66128MDg) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ed
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0018:
            java.lang.Object r0 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r1 = r4.A00
            r2 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0073
            if (r1 != r5) goto L_0x011d
            java.lang.Object r12 = r4.A01
            com.instagram.common.session.UserSession r12 = (com.instagram.common.session.UserSession) r12
            X.0eS.A00(r0)
        L_0x002b:
            r3 = r0
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00f4
            java.lang.Object r3 = X.C51972G9s.A0m(r3)
            X.0qQ.A07(r3)
            X.PwO r3 = (X.C74529PwO) r3
            X.7vZ r4 = X.C346667vY.A00(r12)
            r0 = r3
            X.JxQ r0 = (X.C61114JxQ) r0
            java.util.List r1 = r0.A00
            int r0 = r1.size()
            r4.A01(r0)
            java.lang.Object r2 = X.00k.A0O(r1, r2)
            X.MWK r2 = (X.MWK) r2
            if (r2 == 0) goto L_0x0107
            X.JxP r2 = (X.C61113JxP) r2
            long r0 = r2.A01
            java.lang.String r5 = java.lang.String.valueOf(r0)
            java.lang.String r6 = r2.A04
            int r8 = r2.A00
            java.util.List r0 = r2.A05
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0069:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00fd
            A03(r7, r1)
            goto L_0x0069
        L_0x0073:
            X.0eS.A00(r0)
            r1 = 0
            if (r16 == 0) goto L_0x008c
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.util.Iterator r6 = r16.iterator()
        L_0x0082:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x008c
            X.DbT.A1W(r6, r1)
            goto L_0x0082
        L_0x008c:
            r7 = 0
            if (r17 == 0) goto L_0x00a2
            org.json.JSONArray r7 = new org.json.JSONArray
            r7.<init>()
            java.util.Iterator r6 = r17.iterator()
        L_0x0098:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00a2
            X.DbT.A1W(r6, r7)
            goto L_0x0098
        L_0x00a2:
            X.1NY r6 = X.DbU.A0M(r12)
            java.lang.String r0 = "api/v1/stories/private_stories/friend_lists/create/"
            A02(r6, r0)
            java.lang.String r0 = "name"
            r6.A9m(r0, r13)
            java.lang.Class<X.CDI> r8 = X.CDI.class
            java.lang.Class<X.CzK> r0 = X.C45608CzK.class
            r6.A0Q(r8, r0)
            if (r14 == 0) goto L_0x00be
            java.lang.String r0 = "icon"
            r6.A9m(r0, r14)
        L_0x00be:
            if (r15 == 0) goto L_0x00c5
            java.lang.String r0 = "list_type"
            r6.A9m(r0, r15)
        L_0x00c5:
            if (r1 == 0) goto L_0x00d0
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "member_ids"
            r6.AA0(r0, r1)
        L_0x00d0:
            if (r7 == 0) goto L_0x00db
            java.lang.String r1 = r7.toString()
            java.lang.String r0 = "thread_ids"
            r6.AA0(r0, r1)
        L_0x00db:
            X.1OC r1 = X.DbT.A0U(r6, r5)
            r4.A01 = r12
            r4.A00 = r5
            r0 = 337464989(0x141d4e9d, float:7.941978E-27)
            java.lang.Object r0 = r1.A00(r0, r4)
            if (r0 != r3) goto L_0x002b
            return r3
        L_0x00ed:
            X.MDg r4 = new X.MDg
            r4.<init>(r11, r5, r3)
            goto L_0x0018
        L_0x00f4:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x010b
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00fd:
            boolean r9 = r2.A07
            boolean r10 = r2.A08
            r4.A03(r5, r6, r7, r8, r9, r10)
            r4.A00()
        L_0x0107:
            X.3Ih r3 = X.C41845B3m.A0d(r3)
        L_0x010b:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0117
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0118
            X.5sO r3 = X.DbU.A0f()
        L_0x0117:
            return r3
        L_0x0118:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x011d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil.A05(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.JUG, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A06(com.instagram.common.session.UserSession r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.util.List r13, java.util.List r14, X.AnonymousClass4D7 r15) {
        /*
            r8 = this;
            r3 = 32
            boolean r0 = X.JUG.A03(r3, r15)
            if (r0 == 0) goto L_0x00c8
            r4 = r15
            X.JUG r4 = (X.JUG) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c8
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A01
            X.1Hj r5 = X.1Hj.A02
            int r0 = r4.A00
            r6 = 1
            if (r0 == 0) goto L_0x0044
            if (r0 != r6) goto L_0x00d3
            X.0eS.A00(r1)
        L_0x0024:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x003b
            X.3Ih r1 = X.Dbb.A0R(r1)
        L_0x002e:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x003a
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00ce
            X.5sO r1 = X.DbU.A0f()
        L_0x003a:
            return r1
        L_0x003b:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x002e
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0044:
            X.0eS.A00(r1)
            r2 = 0
            if (r13 == 0) goto L_0x0063
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0063
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            java.util.Iterator r1 = r13.iterator()
        L_0x0059:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0063
            X.DbT.A1W(r1, r2)
            goto L_0x0059
        L_0x0063:
            r3 = 0
            if (r14 == 0) goto L_0x007f
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x007f
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            java.util.Iterator r1 = r14.iterator()
        L_0x0075:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x007f
            X.DbT.A1W(r1, r3)
            goto L_0x0075
        L_0x007f:
            X.1NY r7 = X.DbU.A0M(r9)
            java.lang.String r0 = "api/v1/stories/private_stories/friend_lists/edit/"
            A02(r7, r0)
            java.lang.String r0 = "friend_list_id"
            r7.A9m(r0, r10)
            java.lang.Class<X.CDI> r1 = X.CDI.class
            java.lang.Class<X.CzK> r0 = X.C45608CzK.class
            r7.A0Q(r1, r0)
            if (r11 == 0) goto L_0x009b
            java.lang.String r0 = "name"
            r7.A9m(r0, r11)
        L_0x009b:
            if (r13 == 0) goto L_0x00a6
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "edited_member_ids"
            r7.AA0(r0, r1)
        L_0x00a6:
            if (r14 == 0) goto L_0x00b1
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "edited_thread_ids"
            r7.AA0(r0, r1)
        L_0x00b1:
            if (r12 == 0) goto L_0x00b8
            java.lang.String r0 = "icon"
            r7.A9m(r0, r12)
        L_0x00b8:
            X.1OC r1 = X.DbT.A0U(r7, r6)
            r4.A00 = r6
            r0 = 1382921735(0x526db607, float:2.5524029E11)
            java.lang.Object r1 = r1.A00(r0, r4)
            if (r1 != r5) goto L_0x0024
            return r5
        L_0x00c8:
            X.JUG r4 = X.JUG.A00(r8, r15, r3)
            goto L_0x0016
        L_0x00ce:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00d3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil.A06(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDg, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A07(com.instagram.common.session.UserSession r15, java.lang.String r16, java.lang.String r17, X.AnonymousClass4D7 r18) {
        /*
            r14 = this;
            r3 = 25
            r4 = r18
            boolean r0 = X.C66128MDg.A01(r3, r4)
            if (r0 == 0) goto L_0x00e0
            r7 = r4
            X.MDg r7 = (X.C66128MDg) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00e0
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0018:
            java.lang.Object r0 = r7.A02
            X.1Hj r5 = X.1Hj.A02
            int r1 = r7.A00
            r2 = 0
            r6 = 1
            if (r1 == 0) goto L_0x00aa
            if (r1 != r6) goto L_0x0106
            java.lang.Object r15 = r7.A01
            com.instagram.common.session.UserSession r15 = (com.instagram.common.session.UserSession) r15
            X.0eS.A00(r0)
        L_0x002b:
            r5 = r0
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00e7
            java.lang.Object r3 = X.C51972G9s.A0m(r5)
            X.0qQ.A07(r3)
            X.PwO r3 = (X.C74529PwO) r3
            X.7vZ r7 = X.C346667vY.A00(r15)
            r0 = r3
            X.JxQ r0 = (X.C61114JxQ) r0
            java.util.List r1 = r0.A00
            int r0 = r1.size()
            r7.A01(r0)
            X.7va r4 = r7.A02
            java.util.Iterator r6 = r1.iterator()
        L_0x0051:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00f0
            java.lang.Object r5 = r6.next()
            X.MWK r5 = (X.MWK) r5
            X.JxP r5 = (X.C61113JxP) r5
            long r0 = r5.A01
            java.lang.String r1 = java.lang.String.valueOf(r0)
            if (r4 == 0) goto L_0x00a8
            java.lang.String r0 = r4.A01
        L_0x0069:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0051
            java.lang.Boolean r1 = r5.A02
            boolean r0 = r4.A05
            boolean r0 = X.AnonymousClass7TF.A1Y(r1, r0)
            if (r0 == 0) goto L_0x0083
            java.lang.String r1 = r5.A04
            java.lang.String r0 = r4.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0051
        L_0x0083:
            java.lang.String r8 = r4.A01
            java.lang.String r9 = r5.A04
            int r11 = r4.A00
            java.util.List r0 = r5.A05
            java.util.ArrayList r10 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0093:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x009d
            A03(r10, r1)
            goto L_0x0093
        L_0x009d:
            boolean r12 = r4.A04
            boolean r13 = r5.A08
            r7.A03(r8, r9, r10, r11, r12, r13)
            r7.A00()
            goto L_0x0051
        L_0x00a8:
            r0 = r2
            goto L_0x0069
        L_0x00aa:
            X.0eS.A00(r0)
            X.1NY r4 = X.DbU.A0M(r15)
            java.lang.String r0 = "api/v1/stories/private_stories/friend_lists/edit/"
            A02(r4, r0)
            java.lang.String r0 = "friend_list_id"
            r1 = r16
            r4.A9m(r0, r1)
            java.lang.Class<X.CDI> r3 = X.CDI.class
            java.lang.Class<X.CzK> r1 = X.C45608CzK.class
            r0 = 0
            r4.A0O(r2, r3, r1, r0)
            r1 = r17
            if (r17 == 0) goto L_0x00ce
            java.lang.String r0 = "name"
            r4.A9m(r0, r1)
        L_0x00ce:
            X.1OC r1 = X.DbT.A0U(r4, r6)
            r7.A01 = r15
            r7.A00 = r6
            r0 = 1382921735(0x526db607, float:2.5524029E11)
            java.lang.Object r0 = r1.A00(r0, r7)
            if (r0 != r5) goto L_0x002b
            return r5
        L_0x00e0:
            X.MDg r7 = new X.MDg
            r7.<init>(r14, r4, r3)
            goto L_0x0018
        L_0x00e7:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00f4
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00f0:
            X.3Ih r5 = X.C41845B3m.A0d(r3)
        L_0x00f4:
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0100
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0101
            X.5sO r5 = X.DbU.A0f()
        L_0x0100:
            return r5
        L_0x0101:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0106:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil.A07(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDg, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A08(com.instagram.common.session.UserSession r14, java.lang.String r15, java.util.List r16, java.util.List r17, X.AnonymousClass4D7 r18) {
        /*
            r13 = this;
            r3 = 27
            r4 = r18
            boolean r0 = X.C66128MDg.A01(r3, r4)
            if (r0 == 0) goto L_0x00c5
            r6 = r4
            X.MDg r6 = (X.C66128MDg) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c5
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0018:
            java.lang.Object r0 = r6.A02
            X.1Hj r5 = X.1Hj.A02
            int r1 = r6.A00
            r4 = 0
            r7 = 1
            if (r1 == 0) goto L_0x0044
            if (r1 != r7) goto L_0x0129
            java.lang.Object r14 = r6.A01
            com.instagram.common.session.UserSession r14 = (com.instagram.common.session.UserSession) r14
            X.0eS.A00(r0)
        L_0x002b:
            r5 = r0
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0100
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r0 = r5.A00
            X.CEb r0 = (X.C43809CEb) r0
            X.JxR r2 = r0.A01
            if (r2 != 0) goto L_0x00cc
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0044:
            X.0eS.A00(r0)
            r2 = 0
            if (r16 == 0) goto L_0x0063
            boolean r0 = r16.isEmpty()
            if (r0 != 0) goto L_0x0063
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            java.util.Iterator r1 = r16.iterator()
        L_0x0059:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0063
            X.DbT.A1W(r1, r2)
            goto L_0x0059
        L_0x0063:
            r3 = 0
            if (r17 == 0) goto L_0x007f
            boolean r0 = r17.isEmpty()
            if (r0 != 0) goto L_0x007f
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            java.util.Iterator r1 = r17.iterator()
        L_0x0075:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x007f
            X.DbT.A1W(r1, r3)
            goto L_0x0075
        L_0x007f:
            X.1NY r8 = X.DbU.A0M(r14)
            java.lang.String r0 = "api/v1/stories/private_stories/bulk_update_members/"
            A02(r8, r0)
            java.lang.String r0 = "friend_list_id"
            r8.A9m(r0, r15)
            java.lang.Class<X.CEb> r9 = X.C43809CEb.class
            java.lang.Class<X.CzL> r1 = X.C45609CzL.class
            r0 = 0
            r8.A0O(r4, r9, r1, r0)
            if (r2 == 0) goto L_0x00a4
            java.lang.String r1 = r2.toString()
            r0 = 1078(0x436, float:1.51E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.AA0(r0, r1)
        L_0x00a4:
            if (r3 == 0) goto L_0x00b3
            java.lang.String r1 = r3.toString()
            r0 = 1759(0x6df, float:2.465E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.AA0(r0, r1)
        L_0x00b3:
            X.1OC r1 = X.DbT.A0U(r8, r7)
            r6.A01 = r14
            r6.A00 = r7
            r0 = 1452721282(0x5696c482, float:8.2885369E13)
            java.lang.Object r0 = r1.A00(r0, r6)
            if (r0 != r5) goto L_0x002b
            return r5
        L_0x00c5:
            X.MDg r6 = new X.MDg
            r6.<init>(r13, r4, r3)
            goto L_0x0018
        L_0x00cc:
            X.JxP r5 = r2.A00
            if (r5 == 0) goto L_0x0113
            X.7vZ r6 = X.C346667vY.A00(r14)
            X.7va r3 = r6.A02
            long r0 = r5.A01
            java.lang.String r0 = java.lang.String.valueOf(r0)
            if (r3 == 0) goto L_0x00e0
            java.lang.String r4 = r3.A01
        L_0x00e0:
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 == 0) goto L_0x0113
            java.lang.String r7 = r3.A01
            java.lang.String r8 = r3.A02
            int r10 = r5.A00
            java.util.List r0 = r5.A05
            java.util.ArrayList r9 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00f6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0109
            A03(r9, r1)
            goto L_0x00f6
        L_0x0100:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0117
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0109:
            boolean r11 = r3.A04
            boolean r12 = r3.A05
            r6.A03(r7, r8, r9, r10, r11, r12)
            r6.A00()
        L_0x0113:
            X.3Ih r5 = X.C41845B3m.A0d(r2)
        L_0x0117:
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0123
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0124
            X.5sO r5 = X.DbU.A0f()
        L_0x0123:
            return r5
        L_0x0124:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0129:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil.A08(com.instagram.common.session.UserSession, java.lang.String, java.util.List, java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDg, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ac, code lost:
        if (r0 == r2) goto L_0x00ae;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(com.instagram.common.session.UserSession r14, java.lang.String r15, X.AnonymousClass4D7 r16) {
        /*
            r13 = this;
            r3 = 24
            r5 = r16
            boolean r0 = X.C66128MDg.A01(r3, r5)
            if (r0 == 0) goto L_0x00af
            r4 = r5
            X.MDg r4 = (X.C66128MDg) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00af
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0018:
            java.lang.Object r0 = r4.A02
            X.1Hj r2 = X.1Hj.A02
            int r1 = r4.A00
            r3 = 1
            if (r1 == 0) goto L_0x009a
            if (r1 != r3) goto L_0x00bb
            java.lang.Object r14 = r4.A01
            com.instagram.common.session.UserSession r14 = (com.instagram.common.session.UserSession) r14
            X.0eS.A00(r0)
        L_0x002a:
            r2 = r0
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0072
            java.lang.Object r4 = X.C51972G9s.A0m(r2)
            X.0qQ.A07(r4)
            X.PwO r4 = (X.C74529PwO) r4
            X.7vZ r6 = X.C346667vY.A00(r14)
            r0 = r4
            X.JxQ r0 = (X.C61114JxQ) r0
            java.util.List r1 = r0.A00
            int r0 = r1.size()
            r6.A01(r0)
            X.7va r5 = r6.A02
            java.util.Iterator r2 = r1.iterator()
        L_0x0050:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x007b
            java.lang.Object r0 = r2.next()
            X.MWK r0 = (X.MWK) r0
            X.JxP r0 = (X.C61113JxP) r0
            long r0 = r0.A01
            java.lang.String r1 = java.lang.String.valueOf(r0)
            if (r5 == 0) goto L_0x0070
            java.lang.String r0 = r5.A01
        L_0x0068:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0050
            r3 = 0
            goto L_0x0050
        L_0x0070:
            r0 = 0
            goto L_0x0068
        L_0x0072:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x008d
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x007b:
            if (r3 == 0) goto L_0x0089
            r7 = 0
            r10 = 0
            r11 = 1
            r8 = r7
            r9 = r7
            r12 = r10
            r6.A03(r7, r8, r9, r10, r11, r12)
            r6.A00()
        L_0x0089:
            X.3Ih r2 = X.C41845B3m.A0d(r4)
        L_0x008d:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00ae
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00b6
            X.5sO r2 = X.DbU.A0f()
            return r2
        L_0x009a:
            X.0eS.A00(r0)
            X.1OC r1 = A00(r14, r15)
            r4.A01 = r14
            r4.A00 = r3
            r0 = 1480484788(0x583e67b4, float:8.3741044E14)
            java.lang.Object r0 = r1.A00(r0, r4)
            if (r0 != r2) goto L_0x002a
        L_0x00ae:
            return r2
        L_0x00af:
            X.MDg r4 = new X.MDg
            r4.<init>(r13, r5, r3)
            goto L_0x0018
        L_0x00b6:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00bb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil.A09(com.instagram.common.session.UserSession, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDg, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0A(com.instagram.common.session.UserSession r14, X.AnonymousClass4D7 r15) {
        /*
            r13 = this;
            r3 = 26
            boolean r0 = X.C66128MDg.A01(r3, r15)
            if (r0 == 0) goto L_0x00ca
            r5 = r15
            X.MDg r5 = (X.C66128MDg) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ca
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r5.A02
            X.1Hj r6 = X.1Hj.A02
            int r1 = r5.A00
            r7 = 1
            if (r1 == 0) goto L_0x008b
            if (r1 != r7) goto L_0x00f3
            java.lang.Object r14 = r5.A01
            com.instagram.common.session.UserSession r14 = (com.instagram.common.session.UserSession) r14
            X.0eS.A00(r0)
        L_0x0028:
            r6 = r0
            X.3Ii r6 = (X.C239803Ii) r6
            boolean r0 = r6 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00d1
            java.lang.Object r2 = X.C51972G9s.A0m(r6)
            X.0qQ.A07(r2)
            X.JxS r2 = (X.C61116JxS) r2
            X.7vZ r6 = X.C346667vY.A00(r14)
            java.util.List r1 = r2.A00
            int r0 = r1.size()
            r6.A01(r0)
            X.7va r3 = r6.A02
            java.util.Iterator r5 = r1.iterator()
        L_0x004b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00da
            java.lang.Object r4 = r5.next()
            X.JxP r4 = (X.C61113JxP) r4
            long r0 = r4.A01
            java.lang.String r1 = java.lang.String.valueOf(r0)
            if (r3 == 0) goto L_0x0089
            java.lang.String r0 = r3.A01
        L_0x0061:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x004b
            java.lang.String r7 = r3.A01
            java.lang.String r8 = r3.A02
            int r10 = r4.A00
            java.util.List r0 = r4.A05
            java.util.ArrayList r9 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0077:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0081
            A03(r9, r1)
            goto L_0x0077
        L_0x0081:
            boolean r11 = r3.A04
            boolean r12 = r3.A05
            r6.A03(r7, r8, r9, r10, r11, r12)
            goto L_0x004b
        L_0x0089:
            r0 = 0
            goto L_0x0061
        L_0x008b:
            X.0eS.A00(r0)
            r0 = 0
            X.0qQ.A0B(r14, r0)
            X.1NY r8 = X.DbU.A0M(r14)
            java.lang.String r4 = "api/"
            java.lang.String r3 = "v1/"
            java.lang.String r2 = "stories/"
            java.lang.String r1 = "private_stories/"
            java.lang.String r0 = "share_info/"
            r8.A05()
            r8.A02()
            java.lang.String r0 = X.002.A11(r4, r3, r2, r1, r0)
            X.0qQ.A07(r0)
            r8.A0E = r0
            java.lang.Class<X.CEI> r1 = X.CEI.class
            java.lang.Class<X.CzM> r0 = X.C45610CzM.class
            X.1OC r1 = X.DbU.A0S(r8, r1, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.PrivateStoriesShareInfoResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.PrivateStoriesShareInfoResponse>>"
            X.0qQ.A0C(r1, r0)
            r5.A01 = r14
            r5.A00 = r7
            r0 = 276586395(0x107c5f9b, float:4.977189E-29)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r6) goto L_0x0028
            return r6
        L_0x00ca:
            X.MDg r5 = new X.MDg
            r5.<init>(r13, r15, r3)
            goto L_0x0016
        L_0x00d1:
            boolean r0 = r6 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00e1
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00da:
            r6.A00()
            X.3Ih r6 = X.C41845B3m.A0d(r2)
        L_0x00e1:
            boolean r0 = r6 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00ed
            boolean r0 = r6 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00ee
            X.5sO r6 = X.DbU.A0f()
        L_0x00ed:
            return r6
        L_0x00ee:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00f3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil.A0A(com.instagram.common.session.UserSession, X.4D7):java.lang.Object");
    }

    public static final 1OC A00(UserSession userSession, String str) {
        boolean A1Z = AnonymousClass7TG.A1Z(userSession, str);
        1NY A0M = DbU.A0M(userSession);
        A02(A0M, "api/v1/stories/private_stories/friend_lists/delete/");
        A0M.A0Q(CDI.class, C45608CzK.class);
        Long A10 = AnonymousClass7TE.A10(str);
        if (A10 != null) {
            A0M.A0D("friend_list_id", A10.longValue());
        }
        return DbT.A0U(A0M, A1Z);
    }

    public static void A02(1Fa r1, String str) {
        r1.A04();
        r1.A02();
        String A0B = 002.A0B(str);
        0qQ.A07(A0B);
        r1.A0E = A0B;
    }

    public static void A03(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((User) it.next()).Bh3().getUrl());
    }
}
