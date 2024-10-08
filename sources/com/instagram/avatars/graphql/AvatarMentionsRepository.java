package com.instagram.avatars.graphql;

import X.00k;
import X.0qQ;
import X.2IS;
import X.AnonymousClass43D;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C252733pa;
import X.C41845B3m;
import X.C42908Bmc;
import X.JTQ;
import X.JTS;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.List;

public final class AvatarMentionsRepository extends C252733pa {
    public final UserSession A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarMentionsRepository(UserSession userSession) {
        super("Stories", AnonymousClass43D.A00(921052282));
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final Object A02(List list, AnonymousClass4D7 r14) {
        2IS A04 = C41845B3m.A04();
        2IS A042 = C41845B3m.A04();
        ImmutableList copyOf = ImmutableList.copyOf((Collection) 00k.A0X(list));
        A04.A05("user_ids", copyOf);
        return JTQ.A0W(JTS.A0G(new PandoGraphQLRequest(C41845B3m.A06(AnonymousClass7TF.A1V(copyOf)), "AvatarsMentionsUsersInfo", A04.getParamsCopy(), A042.getParamsCopy(), C42908Bmc.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xig_users_by_igid_v2", AnonymousClass7TE.A1C())), this.A00, r14);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME4, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.avatars.graphql.AvatarMentionsRepository r13, java.util.List r14, X.AnonymousClass4D7 r15) {
        /*
            r3 = 23
            boolean r0 = X.ME4.A03(r3, r15)
            if (r0 == 0) goto L_0x00be
            r4 = r15
            X.ME4 r4 = (X.ME4) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00be
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r4.A01
            X.1Hj r1 = X.1Hj.A02
            int r0 = r4.A00
            r3 = 1
            if (r0 == 0) goto L_0x00aa
            if (r0 != r3) goto L_0x00cd
            X.0eS.A00(r2)
        L_0x0024:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00c4
            X.3lr r4 = X.C41846B3n.A0R(r2)
            if (r4 == 0) goto L_0x00d2
            java.lang.Class<X.Bmb> r2 = X.C42907Bmb.class
            r0 = 1973(0x7b5, float:2.765E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -1488942796(0xffffffffa7408934, float:-2.671973E-15)
            com.google.common.collect.ImmutableList r0 = r4.A06(r2, r1, r0)
            if (r0 == 0) goto L_0x00d2
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r9 = r0.iterator()
        L_0x0049:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00d3
            X.3lr r5 = X.C41845B3m.A0V(r9)
            java.lang.String r0 = "instagram_user_id"
            java.lang.String r12 = r5.A07(r0)
            java.lang.Class<X.Bma> r6 = X.C42906Bma.class
            r1 = 7
            java.lang.String r2 = "user_avatar"
            r0 = 1934184079(0x73494e8f, float:1.5949173E31)
            X.3lr r8 = r5.getOptionalTreeField(r1, r2, r6, r0)
            r11 = 0
            if (r8 == 0) goto L_0x00a8
            java.lang.Class<X.BmZ> r7 = X.BmZ.class
            java.lang.String r1 = "avatar_pog"
            r0 = 1586910313(0x5e965469, float:5.4161992E18)
            X.3lr r1 = r8.getOptionalTreeField(r3, r1, r7, r0)
            if (r1 == 0) goto L_0x00a8
            java.lang.String r0 = "cdn_url"
            java.lang.String r13 = r1.getOptionalStringField(r3, r0)
        L_0x007b:
            java.lang.String r0 = X.Dbg.A01()
            java.lang.String r14 = r5.A0B(r0)
            r1 = 7
            r0 = 1934184079(0x73494e8f, float:1.5949173E31)
            X.3lr r2 = r5.getOptionalTreeField(r1, r2, r6, r0)
            if (r2 == 0) goto L_0x0098
            r1 = 0
            r0 = 165(0xa5, float:2.31E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.Boolean r11 = X.C41846B3n.A0d(r2, r0, r1)
        L_0x0098:
            r1 = 6
            java.lang.String r0 = "is_mentionable"
            boolean r15 = r5.getCoercedBooleanField(r1, r0)
            X.Jvc r10 = new X.Jvc
            r10.<init>((java.lang.Boolean) r11, (java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14, (boolean) r15)
            r4.add(r10)
            goto L_0x0049
        L_0x00a8:
            r13 = r11
            goto L_0x007b
        L_0x00aa:
            X.0eS.A00(r2)
            if (r14 == 0) goto L_0x00e1
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x00e1
            r4.A00 = r3
            java.lang.Object r2 = r13.A02(r14, r4)
            if (r2 != r1) goto L_0x0024
            return r1
        L_0x00be:
            X.ME4 r4 = X.ME4.A00(r13, r15, r3)
            goto L_0x0016
        L_0x00c4:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00d7
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00cd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00d2:
            r4 = 0
        L_0x00d3:
            X.3Ih r2 = X.C41845B3m.A0d(r4)
        L_0x00d7:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00e4
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r0 = r2.A00
        L_0x00df:
            if (r0 != 0) goto L_0x00e3
        L_0x00e1:
            X.0sn r0 = X.0sn.A00
        L_0x00e3:
            return r0
        L_0x00e4:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00eb
            X.0sn r0 = X.0sn.A00
            goto L_0x00df
        L_0x00eb:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.graphql.AvatarMentionsRepository.A00(com.instagram.avatars.graphql.AvatarMentionsRepository, java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME4, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.avatars.graphql.AvatarMentionsRepository r16, X.AnonymousClass4D7 r17, int r18) {
        /*
            r3 = 24
            r6 = r17
            boolean r0 = X.ME4.A03(r3, r6)
            r5 = r16
            if (r0 == 0) goto L_0x00f1
            r4 = r6
            X.ME4 r4 = (X.ME4) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00f1
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001a:
            java.lang.Object r2 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x00ae
            if (r1 != r0) goto L_0x011e
            X.0eS.A00(r2)
        L_0x0028:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r1 = r2 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x00f7
            X.3lr r4 = X.C41846B3n.A0R(r2)
            if (r4 == 0) goto L_0x0100
            java.lang.Class<X.BmT> r3 = X.BmT.class
            r1 = 4284(0x10bc, float:6.003E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            r1 = -902929768(0xffffffffca2e6298, float:-2857126.0)
            com.google.common.collect.ImmutableList r1 = r4.A06(r3, r2, r1)
            if (r1 == 0) goto L_0x0100
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r9 = r1.iterator()
        L_0x004d:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0101
            X.3lr r5 = X.C41845B3m.A0V(r9)
            java.lang.String r1 = "instagram_user_id"
            java.lang.String r12 = r5.A07(r1)
            java.lang.Class<X.BmS> r6 = X.BmS.class
            r2 = 3
            java.lang.String r3 = "user_avatar"
            r1 = -1824683569(0xffffffff933d89cf, float:-2.3923099E-27)
            X.3lr r8 = r5.getOptionalTreeField(r2, r3, r6, r1)
            r11 = 0
            if (r8 == 0) goto L_0x00ac
            java.lang.Class<X.BmR> r7 = X.BmR.class
            java.lang.String r2 = "avatar_pog"
            r1 = 1280362775(0x4c50c917, float:5.4731868E7)
            X.3lr r2 = r8.getOptionalTreeField(r0, r2, r7, r1)
            if (r2 == 0) goto L_0x00ac
            java.lang.String r1 = "cdn_url"
            java.lang.String r13 = r2.A07(r1)
        L_0x007f:
            java.lang.String r1 = X.Dbg.A01()
            java.lang.String r14 = r5.getOptionalStringField(r0, r1)
            r2 = 3
            r1 = -1824683569(0xffffffff933d89cf, float:-2.3923099E-27)
            X.3lr r3 = r5.getOptionalTreeField(r2, r3, r6, r1)
            if (r3 == 0) goto L_0x009c
            r2 = 0
            r1 = 165(0xa5, float:2.31E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.Boolean r11 = X.C41846B3n.A0d(r3, r1, r2)
        L_0x009c:
            r2 = 2
            java.lang.String r1 = "is_mentionable"
            boolean r15 = r5.getCoercedBooleanField(r2, r1)
            X.Jvc r10 = new X.Jvc
            r10.<init>((java.lang.Boolean) r11, (java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14, (boolean) r15)
            r4.add(r10)
            goto L_0x004d
        L_0x00ac:
            r13 = r11
            goto L_0x007f
        L_0x00ae:
            X.0eS.A00(r2)
            r4.A00 = r0
            r14 = 0
            X.2IS r7 = X.C41845B3m.A04()
            X.2IS r6 = X.C41845B3m.A04()
            java.lang.Integer r2 = X.JTO.A0w(r18)
            java.lang.String r1 = "limit"
            r7.A03(r1, r2)
            X.1vR r8 = X.C41845B3m.A05()
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<X.BmU> r12 = X.BmU.class
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            java.lang.String r9 = "AvatarsMentionableFriends"
            r13 = 0
            java.lang.String r17 = "xig_top_bffs"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.1Ef r2 = X.JTS.A0G(r7)
            com.instagram.common.session.UserSession r1 = r5.A00
            java.lang.Object r2 = X.JTQ.A0W(r2, r1, r4)
            if (r2 != r3) goto L_0x0028
            return r3
        L_0x00f1:
            X.ME4 r4 = X.ME4.A00(r5, r6, r3)
            goto L_0x001a
        L_0x00f7:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0105
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0100:
            r4 = 0
        L_0x0101:
            X.3Ih r2 = X.C41845B3m.A0d(r4)
        L_0x0105:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0112
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r0 = r2.A00
        L_0x010d:
            if (r0 != 0) goto L_0x0111
            X.0sn r0 = X.0sn.A00
        L_0x0111:
            return r0
        L_0x0112:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0119
            X.0sn r0 = X.0sn.A00
            goto L_0x010d
        L_0x0119:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x011e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.graphql.AvatarMentionsRepository.A01(com.instagram.avatars.graphql.AvatarMentionsRepository, X.4D7, int):java.lang.Object");
    }
}
