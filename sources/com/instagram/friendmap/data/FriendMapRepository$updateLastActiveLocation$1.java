package com.instagram.friendmap.data;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.friendmap.data.FriendMapRepository$updateLastActiveLocation$1", f = "FriendMapRepository.kt", i = {}, l = {390, 393}, m = "invokeSuspend", n = {}, s = {})
public final class FriendMapRepository$updateLastActiveLocation$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ double A01;
    public final /* synthetic */ double A02;
    public final /* synthetic */ FriendMapRepository A03;
    public final /* synthetic */ Integer A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FriendMapRepository$updateLastActiveLocation$1(FriendMapRepository friendMapRepository, Integer num, AnonymousClass4D7 r4, double d, double d2) {
        super(2, r4);
        this.A03 = friendMapRepository;
        this.A04 = num;
        this.A01 = d;
        this.A02 = d2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.friendmap.data.FriendMapRepository$updateLastActiveLocation$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        return new FriendMapRepository$updateLastActiveLocation$1(this.A03, this.A04, r10, this.A01, this.A02);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FriendMapRepository$updateLastActiveLocation$1) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.friendmap.data.FriendMapRepository$updateLastActiveLocation$1, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b1 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r3 = r21
            X.1Hj r5 = X.1Hj.A02
            r4 = r20
            int r0 = r4.A00
            r7 = 2
            r14 = 1
            if (r0 == 0) goto L_0x0014
            if (r0 == r14) goto L_0x0026
            X.0eS.A00(r3)
        L_0x0011:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x0014:
            X.0eS.A00(r3)
            com.instagram.friendmap.data.FriendMapRepository r0 = r4.A03
            X.4A4 r0 = r0.A09
            r4.A00 = r14
            com.instagram.friendmap.data.FriendMapGraphQLImpl r0 = r0.A00
            java.lang.Object r3 = r0.A09(r4)
            if (r3 != r5) goto L_0x0029
            return r5
        L_0x0026:
            X.0eS.A00(r3)
        L_0x0029:
            X.4A6 r3 = (X.AnonymousClass4A6) r3
            com.instagram.friendmap.data.FriendMapRepository r2 = r4.A03
            X.05G r1 = r2.A0I
        L_0x002f:
            java.lang.Object r0 = r1.getValue()
            boolean r0 = r1.AIY(r0, r3)
            if (r0 == 0) goto L_0x002f
            java.lang.Integer r1 = r4.A04
            com.instagram.common.session.UserSession r0 = r2.A06
            boolean r0 = X.AnonymousClass56C.A00(r0, r1)
            if (r0 == 0) goto L_0x0011
            X.4A5 r1 = r3.A04
            X.4A5 r0 = X.AnonymousClass4A5.UNSET
            if (r1 == r0) goto L_0x0011
            X.4A5 r0 = X.AnonymousClass4A5.PRIVATE
            if (r1 == r0) goto L_0x0011
            X.4A4 r6 = r2.A09
            double r2 = r4.A01
            double r0 = r4.A02
            r4.A00 = r7
            com.instagram.friendmap.data.FriendMapGraphQLImpl r6 = r6.A00
            X.1vn r6 = r6.A00
            r15 = 0
            X.2IS r7 = new X.2IS
            r7.<init>()
            X.2IS r10 = new X.2IS
            r10.<init>()
            X.0K0 r9 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.Double r8 = new java.lang.Double
            r8.<init>(r2)
            java.lang.String r2 = "latitude"
            X.0Df r3 = r9.A02()
            X.0Df.A00(r3, r8, r2)
            java.lang.Double r2 = new java.lang.Double
            r2.<init>(r0)
            java.lang.String r0 = "longitude"
            X.0Df.A00(r3, r2, r0)
            java.lang.String r1 = "data"
            X.2IV r0 = r7.A00
            X.0Df r0 = r0.A02()
            r0.A0E(r3, r1)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r9 = X.AnonymousClass1vS.A00()
            java.util.Map r11 = r7.getParamsCopy()
            java.util.Map r12 = r10.getParamsCopy()
            java.lang.Class<X.BmM> r13 = X.BmM.class
            java.util.ArrayList r19 = new java.util.ArrayList
            r19.<init>()
            java.lang.String r10 = "UpdateLastActiveLocationMutation"
            r16 = 0
            java.lang.String r18 = "xdt_update_last_active_location"
            com.facebook.pando.PandoGraphQLRequest r8 = new com.facebook.pando.PandoGraphQLRequest
            r17 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r0 = r6.A04(r8, r4)
            if (r0 != r5) goto L_0x0011
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.friendmap.data.FriendMapRepository$updateLastActiveLocation$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
