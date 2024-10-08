package com.instagram.fanclub.api;

import X.0qQ;
import X.0sP;
import X.1vm;
import X.1vn;
import X.2IS;
import X.AnonymousClass1vS;
import X.AnonymousClass2IY;
import X.AnonymousClass4D7;
import X.C43740C7k;
import X.C45914DEu;
import X.C62320sa;
import X.C64396LbD;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.ArrayList;

public final class FanClubApi {
    public final UserSession A00;

    public FanClubApi(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final PandoGraphQLRequest A00(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        0qQ.A0B(str, 0);
        2IS r2 = new 2IS();
        2IS r10 = new 2IS();
        r2.A02("should_fetch_blocked_member_count", false);
        r2.A02("should_fetch_member_count", false);
        r2.A02("should_fetch_sku", false);
        r2.A02("should_fetch_early_pricing", false);
        r2.A02("should_fetch_enabled_benefits", false);
        r2.A02("should_fetch_seconds_until_notification", false);
        r2.A02("should_fetch_customized_benefits", false);
        r2.A02("should_fetch_content_preview", false);
        r2.A04(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
        r2.A02("should_fetch_blocked_member_count", Boolean.valueOf(z));
        r2.A02("should_fetch_member_count", Boolean.valueOf(z2));
        r2.A02("should_fetch_sku", Boolean.valueOf(z3));
        r2.A02("should_fetch_enabled_benefits", Boolean.valueOf(z4));
        r2.A02("should_fetch_early_pricing", Boolean.valueOf(z5));
        r2.A02("should_fetch_seconds_until_notification", Boolean.valueOf(z6));
        r2.A02("should_fetch_customized_benefits", Boolean.valueOf(z7));
        r2.A02("should_fetch_content_preview", Boolean.valueOf(z8));
        AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
        return new PandoGraphQLRequest(AnonymousClass1vS.A00(), "FanClubInfoForCreator", r2.getParamsCopy(), r10.getParamsCopy(), C43740C7k.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xig_user_by_igid_v2", new ArrayList());
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(java.lang.String r18, java.lang.String r19, X.AnonymousClass4D7 r20) {
        /*
            r17 = this;
            r5 = 4
            r6 = r20
            boolean r0 = X.C66136MDo.A01(r5, r6)
            r3 = r17
            if (r0 == 0) goto L_0x00cd
            r1 = r6
            X.MDo r1 = (X.C66136MDo) r1
            int r4 = r1.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r2
            if (r0 == 0) goto L_0x00cd
            int r4 = r4 - r2
            r1.A00 = r4
        L_0x0019:
            java.lang.Object r4 = r1.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r1.A00
            r11 = 1
            if (r0 == 0) goto L_0x0060
            if (r0 != r11) goto L_0x00dc
            X.0eS.A00(r4)
        L_0x0027:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0056
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r0 = r4.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r0 = r0.A01
            X.3Ih r4 = new X.3Ih
            r4.<init>(r0)
        L_0x003a:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0055
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00d6
            X.5sO r4 = (X.C297815sO) r4
            java.lang.Object r0 = r4.A00
            X.4dm r0 = (X.C268654dm) r0
            java.lang.Throwable r0 = r0.A01()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.5sO r4 = new X.5sO
            r4.<init>(r0)
        L_0x0055:
            return r4
        L_0x0056:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x003a
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0060:
            X.0eS.A00(r4)
            X.0K0 r5 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r12 = 0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "client_mutation_id"
            X.0Df r6 = r5.A02()
            X.0Df.A00(r6, r4, r0)
            java.lang.String r0 = "ssc_id"
            r4 = r18
            X.0Df.A00(r6, r4, r0)
            r0 = 401(0x191, float:5.62E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r4 = r19
            X.0Df.A00(r6, r4, r0)
            X.2IS r5 = new X.2IS
            r5.<init>()
            X.2IS r4 = new X.2IS
            r4.<init>()
            java.lang.String r14 = "input"
            X.2IV r0 = r5.A00
            X.0Df r0 = r0.A02()
            r0.A0E(r6, r14)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r6 = X.AnonymousClass1vS.A00()
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r4.getParamsCopy()
            java.lang.Class<X.Bkp> r10 = X.C42869Bkp.class
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            java.lang.String r7 = "ShareSscXmaMutation"
            r13 = 8
            java.lang.String r15 = "xig_share_ssc_xma"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.instagram.common.session.UserSession r0 = r3.A00
            X.1vn r0 = X.1vm.A01(r0)
            r1.A00 = r11
            java.lang.Object r4 = r0.A04(r5, r1)
            if (r4 != r2) goto L_0x0027
            return r2
        L_0x00cd:
            r0 = 42
            X.MDo r1 = new X.MDo
            r1.<init>(r3, r6, r5, r0)
            goto L_0x0019
        L_0x00d6:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00dc:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A04(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(java.lang.String r8, java.lang.String r9, X.AnonymousClass4D7 r10) {
        /*
            r7 = this;
            r4 = 5
            boolean r0 = X.C66136MDo.A01(r4, r10)
            if (r0 == 0) goto L_0x008e
            r3 = r10
            X.MDo r3 = (X.C66136MDo) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008e
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0015:
            java.lang.Object r0 = r3.A01
            X.1Hj r5 = X.1Hj.A02
            int r1 = r3.A00
            r6 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 != r6) goto L_0x009c
            X.0eS.A00(r0)
        L_0x0023:
            r5 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0033
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0096
            X.0gF r0 = X.C60340gF.A00
            X.5sO r5 = new X.5sO
            r5.<init>(r0)
        L_0x0033:
            return r5
        L_0x0034:
            X.0eS.A00(r0)
            X.QNI r2 = new X.QNI
            r2.<init>()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "client_mutation_id"
            r2.A07(r1, r0)
            java.lang.String r0 = "fan_club_id"
            r2.A07(r8, r0)
            java.util.List r1 = java.util.Collections.singletonList(r9)
            X.0qQ.A07(r1)
            java.lang.String r0 = "users"
            r2.A05(r0, r1)
            X.2IS r4 = new X.2IS
            r4.<init>()
            java.lang.String r0 = "input"
            r4.A00(r2, r0)
            java.lang.Class<X.B9M> r1 = X.B9M.class
            java.lang.String r0 = "FanClubUnBlockMember"
            X.3Fa r2 = new X.3Fa
            r2.<init>(r4, r1, r0, r6)
            com.instagram.common.session.UserSession r0 = r7.A00
            X.3Fb r1 = X.C46479Dfi.A01(r0)
            r1.A08(r2)
            r0 = 65
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.A08 = r0
            X.1OC r1 = r1.A05()
            r3.A00 = r6
            r0 = 1620689189(0x6099c125, float:8.863342E19)
            java.lang.Object r0 = r1.A00(r0, r3)
            if (r0 != r5) goto L_0x0023
            return r5
        L_0x008e:
            r0 = 42
            X.MDo r3 = new X.MDo
            r3.<init>(r7, r10, r4, r0)
            goto L_0x0015
        L_0x0096:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x009c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A05(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A07(java.lang.String r10, java.lang.String r11, X.AnonymousClass4D7 r12, boolean r13) {
        /*
            r9 = this;
            r4 = 0
            boolean r0 = X.C66136MDo.A01(r4, r12)
            if (r0 == 0) goto L_0x0096
            r2 = r12
            X.MDo r2 = (X.C66136MDo) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0096
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0015:
            java.lang.Object r0 = r2.A01
            X.1Hj r3 = X.1Hj.A02
            int r1 = r2.A00
            r4 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 != r4) goto L_0x00a5
            X.0eS.A00(r0)
        L_0x0023:
            r3 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0033
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x009f
            X.0gF r0 = X.C60340gF.A00
            X.5sO r3 = new X.5sO
            r3.<init>(r0)
        L_0x0033:
            return r3
        L_0x0034:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r1 = r9.A00
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r13)
            r0 = -2
            X.1NY r5 = new X.1NY
            r5.<init>(r1, r0)
            java.lang.String r7 = "api/"
            java.lang.String r6 = "v1/"
            java.lang.String r1 = "fan_club/"
            java.lang.String r0 = "members/"
            r5.A05()
            r5.A02()
            java.lang.String r0 = X.002.A0u(r7, r6, r1, r0)
            X.0qQ.A07(r0)
            r5.A0E = r0
            java.lang.Class<X.CEO> r1 = X.CEO.class
            java.lang.Class<X.CyS> r0 = X.C45554CyS.class
            r5.A0Q(r1, r0)
            if (r10 == 0) goto L_0x0068
            java.lang.String r0 = "max_id"
            r5.A9m(r0, r10)
        L_0x0068:
            if (r11 == 0) goto L_0x006f
            java.lang.String r0 = "query"
            r5.A9m(r0, r11)
        L_0x006f:
            java.lang.String r1 = "should_include_unconnected"
            java.lang.String r0 = "false"
            r5.A9m(r1, r0)
            if (r8 == 0) goto L_0x0081
            boolean r1 = r8.booleanValue()
            java.lang.String r0 = "should_include_restricted_countries"
            r5.A0H(r0, r1)
        L_0x0081:
            X.1OC r1 = r5.A0M()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubMembersResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubMembersResponse>>"
            X.0qQ.A0C(r1, r0)
            r2.A00 = r4
            r0 = 1240235265(0x49ec7d01, float:1937312.1)
            java.lang.Object r0 = r1.A00(r0, r2)
            if (r0 != r3) goto L_0x0023
            return r3
        L_0x0096:
            r0 = 42
            X.MDo r2 = new X.MDo
            r2.<init>(r9, r12, r4, r0)
            goto L_0x0015
        L_0x009f:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x00a5:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A07(java.lang.String, java.lang.String, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0088, code lost:
        if (r0 == r3) goto L_0x008a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0D(java.lang.String r7, X.AnonymousClass4D7 r8) {
        /*
            r6 = this;
            r5 = 1
            boolean r0 = X.C66136MDo.A01(r5, r8)
            if (r0 == 0) goto L_0x008b
            r4 = r8
            X.MDo r4 = (X.C66136MDo) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008b
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r0 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r1 = r4.A00
            if (r1 == 0) goto L_0x005c
            if (r1 != r5) goto L_0x0099
            X.0eS.A00(r0)
        L_0x0022:
            r3 = r0
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x003d
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r0 = r3.A00
            X.DuU r0 = (X.C47301DuU) r0
            X.JxG r0 = r0.A00
            if (r0 != 0) goto L_0x0047
            java.lang.String r0 = "response"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003d:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x004c
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0047:
            X.3Ih r3 = new X.3Ih
            r3.<init>(r0)
        L_0x004c:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x008a
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0093
            X.0gF r0 = X.C60340gF.A00
            X.5sO r3 = new X.5sO
            r3.<init>(r0)
            return r3
        L_0x005c:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r1 = r6.A00
            r0 = -2
            X.1NY r2 = new X.1NY
            r2.<init>(r1, r0)
            r2.A05()
            java.lang.String r0 = "fan_club/subscription_next_steps_recommendations/"
            r2.A0A(r0)
            java.lang.String r0 = "entrypoint"
            r2.A9m(r0, r7)
            java.lang.Class<X.DuU> r1 = X.C47301DuU.class
            java.lang.Class<X.F4F> r0 = X.F4F.class
            r2.A0Q(r1, r0)
            X.1OC r1 = r2.A0M()
            r4.A00 = r5
            r0 = 1269204293(0x4ba68545, float:2.1826186E7)
            java.lang.Object r0 = r1.A00(r0, r4)
            if (r0 != r3) goto L_0x0022
        L_0x008a:
            return r3
        L_0x008b:
            r0 = 42
            X.MDo r4 = new X.MDo
            r4.<init>(r6, r8, r5, r0)
            goto L_0x0015
        L_0x0093:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0099:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0D(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0E(java.lang.String r19, X.AnonymousClass4D7 r20) {
        /*
            r18 = this;
            r5 = 7
            r6 = r20
            boolean r0 = X.C66136MDo.A01(r5, r6)
            r4 = r18
            if (r0 == 0) goto L_0x00a0
            r2 = r6
            X.MDo r2 = (X.C66136MDo) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00a0
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0019:
            java.lang.Object r5 = r2.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r2.A00
            r1 = 1
            if (r0 == 0) goto L_0x0054
            if (r0 != r1) goto L_0x00af
            X.0eS.A00(r5)
        L_0x0027:
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x004a
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r0 = r5.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r0 = r0.A01
            X.3Ih r5 = new X.3Ih
            r5.<init>(r0)
        L_0x003a:
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0049
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00a9
            X.0gF r0 = X.C60340gF.A00
            X.5sO r5 = new X.5sO
            r5.<init>(r0)
        L_0x0049:
            return r5
        L_0x004a:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 != 0) goto L_0x003a
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0054:
            X.0eS.A00(r5)
            r13 = 0
            X.2IS r6 = new X.2IS
            r6.<init>()
            X.2IS r5 = new X.2IS
            r5.<init>()
            java.lang.String r0 = "id"
            r7 = r19
            r6.A04(r0, r7)
            r0 = 0
            if (r19 == 0) goto L_0x006d
            r0 = 1
        L_0x006d:
            X.17k.A0E(r0)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r7 = X.AnonymousClass1vS.A00()
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<X.BkP> r11 = X.BkP.class
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            java.lang.String r8 = "FetchCustomBenefits"
            r12 = 0
            java.lang.String r16 = "xig_user_by_igid_v2"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.instagram.common.session.UserSession r0 = r4.A00
            X.1vn r0 = X.1vm.A01(r0)
            r2.A00 = r1
            java.lang.Object r5 = r0.A04(r6, r2)
            if (r5 != r3) goto L_0x0027
            return r3
        L_0x00a0:
            r0 = 42
            X.MDo r2 = new X.MDo
            r2.<init>(r4, r6, r5, r0)
            goto L_0x0019
        L_0x00a9:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00af:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0E(java.lang.String, X.4D7):java.lang.Object");
    }

    public final Object A0F(String str, AnonymousClass4D7 r12) {
        return A0J(str, r12, false, false, false, false, false, false, false);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0H(java.lang.String r17, X.AnonymousClass4D7 r18, boolean r19) {
        /*
            r16 = this;
            r3 = 2
            r6 = r18
            boolean r0 = X.C66136MDo.A01(r3, r6)
            r5 = r16
            if (r0 == 0) goto L_0x00c7
            r1 = r6
            X.MDo r1 = (X.C66136MDo) r1
            int r4 = r1.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r2
            if (r0 == 0) goto L_0x00c7
            int r4 = r4 - r2
            r1.A00 = r4
        L_0x0019:
            java.lang.Object r4 = r1.A01
            X.1Hj r0 = X.1Hj.A02
            int r2 = r1.A00
            r10 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 == r10) goto L_0x00d8
            if (r2 != r3) goto L_0x00d0
            X.0eS.A00(r4)
        L_0x0029:
            r0 = r4
            X.3Ii r0 = (X.C239803Ii) r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x004b
            X.3Ih r0 = (X.C239793Ih) r0
            java.lang.Object r0 = r0.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r1 = r0.A01
            X.3Ih r0 = new X.3Ih
            r0.<init>(r1)
        L_0x003d:
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x010e
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0107
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x004b:
            boolean r1 = r0 instanceof X.C297815sO
            if (r1 != 0) goto L_0x003d
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0055:
            X.0eS.A00(r4)
            X.0K0 r4 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r11 = 0
            java.lang.String r2 = "creator_id"
            X.0Df r8 = r4.A02()
            r4 = r17
            X.0Df.A00(r8, r4, r2)
            com.instagram.common.session.UserSession r2 = r5.A00
            X.1vn r2 = X.1vm.A01(r2)
            X.2IS r7 = new X.2IS
            r7.<init>()
            X.2IS r6 = new X.2IS
            r6.<init>()
            java.lang.String r5 = "input"
            X.2IV r4 = r7.A00
            X.0Df r4 = r4.A02()
            r4.A0E(r8, r5)
            X.2IY r4 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r5 = X.AnonymousClass1vS.A00()
            java.util.Map r7 = r7.getParamsCopy()
            java.util.Map r8 = r6.getParamsCopy()
            if (r19 == 0) goto L_0x00ac
            java.lang.Class<X.Bka> r9 = X.C42854Bka.class
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.lang.String r6 = "IGSubscriptionsMuteStoriesTeaser"
            r12 = 0
            java.lang.String r14 = "xdt_mute_stories_teaser_mutation"
            com.facebook.pando.PandoGraphQLRequest r4 = new com.facebook.pando.PandoGraphQLRequest
            r13 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.A00 = r10
            java.lang.Object r4 = r2.A04(r4, r1)
            if (r4 != r0) goto L_0x00db
            return r0
        L_0x00ac:
            java.lang.Class<X.Bkc> r9 = X.C42856Bkc.class
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.lang.String r6 = "IGSubscriptionsUnmuteStoriesTeaser"
            r12 = 0
            java.lang.String r14 = "xdt_unmute_stories_teaser_mutation"
            com.facebook.pando.PandoGraphQLRequest r4 = new com.facebook.pando.PandoGraphQLRequest
            r13 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.A00 = r3
            java.lang.Object r4 = r2.A04(r4, r1)
            if (r4 != r0) goto L_0x0029
            return r0
        L_0x00c7:
            r0 = 42
            X.MDo r1 = new X.MDo
            r1.<init>(r5, r6, r3, r0)
            goto L_0x0019
        L_0x00d0:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00d8:
            X.0eS.A00(r4)
        L_0x00db:
            r0 = r4
            X.3Ii r0 = (X.C239803Ii) r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x00fd
            X.3Ih r0 = (X.C239793Ih) r0
            java.lang.Object r0 = r0.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r1 = r0.A01
            X.3Ih r0 = new X.3Ih
            r0.<init>(r1)
        L_0x00ef:
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x010e
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0107
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00fd:
            boolean r1 = r0 instanceof X.C297815sO
            if (r1 != 0) goto L_0x00ef
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0107:
            X.0gF r1 = X.C60340gF.A00
            X.5sO r0 = new X.5sO
            r0.<init>(r1)
        L_0x010e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0H(java.lang.String, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0L(java.util.List r9, X.AnonymousClass4D7 r10) {
        /*
            r8 = this;
            r4 = 3
            boolean r0 = X.C66136MDo.A01(r4, r10)
            if (r0 == 0) goto L_0x006d
            r3 = r10
            X.MDo r3 = (X.C66136MDo) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006d
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0015:
            java.lang.Object r0 = r3.A01
            X.1Hj r6 = X.1Hj.A02
            int r1 = r3.A00
            r7 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 != r7) goto L_0x007b
            X.0eS.A00(r0)
        L_0x0023:
            r6 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0033
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0075
            X.0gF r0 = X.C60340gF.A00
            X.5sO r6 = new X.5sO
            r6.<init>(r0)
        L_0x0033:
            return r6
        L_0x0034:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r1 = r8.A00
            r0 = -2
            X.1NY r5 = new X.1NY
            r5.<init>(r1, r0)
            r5.A04()
            java.lang.String r0 = "fan_club/replace_previews/"
            r5.A0A(r0)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>(r9)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "media_ids"
            r5.A9m(r0, r1)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            r2 = 0
            r5.A0Q(r1, r0)
            X.1OC r1 = r5.A0M()
            r3.A00 = r7
            r0 = 210647125(0xc8e3855, float:2.1912468E-31)
            java.lang.Object r0 = r1.A02(r3, r0, r4, r2)
            if (r0 != r6) goto L_0x0023
            return r6
        L_0x006d:
            r0 = 42
            X.MDo r3 = new X.MDo
            r3.<init>(r8, r10, r4, r0)
            goto L_0x0015
        L_0x0075:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x007b:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0L(java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0R(X.AnonymousClass4D7 r20) {
        /*
            r19 = this;
            r5 = 6
            r6 = r20
            boolean r0 = X.C66136MDo.A01(r5, r6)
            r4 = r19
            if (r0 == 0) goto L_0x00d6
            r2 = r6
            X.MDo r2 = (X.C66136MDo) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00d6
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0019:
            java.lang.Object r5 = r2.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r2.A00
            r1 = 1
            if (r0 == 0) goto L_0x0090
            if (r0 != r1) goto L_0x00e5
            X.0eS.A00(r5)
        L_0x0027:
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0086
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r0 = r5.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r4 = r0.A01
            X.3lr r4 = (X.C250663lr) r4
            r5 = 0
            if (r4 == 0) goto L_0x0084
            java.lang.Class<X.Bji> r3 = X.C42836Bji.class
            java.lang.String r2 = "deferred_onboarding_msm_bloks(bloks_versioning_id:$bloks_versioning_id)"
            r0 = -1188465640(0xffffffffb9297418, float:-1.6160344E-4)
            X.3lr r3 = r4.A03(r3, r2, r0)
            if (r3 == 0) goto L_0x0084
            java.lang.Class<X.Bje> r2 = X.C42832Bje.class
            r0 = 2116965024(0x7e2e52a0, float:5.792867E37)
            X.3lr r4 = r3.A01(r2, r0)
            if (r4 == 0) goto L_0x0084
            java.lang.Class<X.Bjc> r3 = X.C42830Bjc.class
            java.lang.String r2 = "bundle"
            r0 = -1078848092(0xffffffffbfb215a4, float:-1.3912854)
            X.3lr r1 = r4.getOptionalTreeField(r1, r2, r3, r0)
            if (r1 == 0) goto L_0x0084
            r0 = 653(0x28d, float:9.15E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.String r1 = r1.A07(r0)
        L_0x0069:
            X.6Qn r0 = X.C307546Qn.A01
            X.68u r0 = X.C360998fV.A00(r0, r1, r5)
            X.3Ih r5 = new X.3Ih
            r5.<init>(r0)
        L_0x0074:
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0083
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00df
            X.0gF r0 = X.C60340gF.A00
            X.5sO r5 = new X.5sO
            r5.<init>(r0)
        L_0x0083:
            return r5
        L_0x0084:
            r1 = r5
            goto L_0x0069
        L_0x0086:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0074
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0090:
            X.0eS.A00(r5)
            r14 = 0
            X.2IS r7 = new X.2IS
            r7.<init>()
            X.2IS r6 = new X.2IS
            r6.<init>()
            java.lang.String r5 = "62c196cc283670265c8243af7482f62f8856499ba6f7f01c5067e75d05225969"
            java.lang.String r0 = "bloks_versioning_id"
            r7.A04(r0, r5)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r8 = X.AnonymousClass1vS.A00()
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<X.Bjj> r12 = X.C42837Bjj.class
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            java.lang.String r9 = "DeferredOnboardingEmbeddedMSM"
            r13 = 0
            java.lang.String r17 = "deferred_onboarding_msm_bloks"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.instagram.common.session.UserSession r0 = r4.A00
            X.1vn r0 = X.1vm.A01(r0)
            r2.A00 = r1
            java.lang.Object r5 = r0.A04(r7, r2)
            if (r5 != r3) goto L_0x0027
            return r3
        L_0x00d6:
            r0 = 42
            X.MDo r2 = new X.MDo
            r2.<init>(r4, r6, r5, r0)
            goto L_0x0019
        L_0x00df:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00e5:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0R(X.4D7):java.lang.Object");
    }

    public final void A0U(C62320sa r14, 0sP r15) {
        UserSession userSession = this.A00;
        1vn A01 = 1vm.A01(userSession);
        PandoGraphQLRequest A002 = A00(userSession.A06, false, false, false, false, false, true, false, false);
        A01.ATL(new C45914DEu(r14), new C64396LbD(r15), A002);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.ME7, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(com.instagram.api.schemas.FanClubCategoryType r13, X.AnonymousClass4D7 r14, boolean r15, boolean r16) {
        /*
            r12 = this;
            r4 = 49
            boolean r0 = X.ME7.A02(r4, r14)
            if (r0 == 0) goto L_0x00b5
            r2 = r14
            X.ME7 r2 = (X.ME7) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00b5
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0016:
            java.lang.Object r0 = r2.A01
            X.1Hj r3 = X.1Hj.A02
            int r1 = r2.A00
            r4 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 != r4) goto L_0x00c4
            X.0eS.A00(r0)
        L_0x0024:
            r3 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0034
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00be
            X.0gF r0 = X.C60340gF.A00
            X.5sO r3 = new X.5sO
            r3.<init>(r0)
        L_0x0034:
            return r3
        L_0x0035:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r6 = r12.A00
            X.0Tu r5 = X.0Tu.A05
            r0 = 36596106364782907(0x8203f70009093b, double:3.2068632535564935E-306)
            long r0 = X.182.A01(r5, r6, r0)
            int r5 = (int) r0
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r5)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r15)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r16)
            X.0qQ.A0B(r13, r4)
            r0 = -2
            X.1NY r5 = new X.1NY
            r5.<init>(r6, r0)
            java.lang.String r8 = "category"
            java.lang.String r7 = "api/"
            java.lang.String r6 = "v1/"
            java.lang.String r1 = "fan_club/"
            java.lang.String r0 = "category_members/"
            r5.A05()
            r5.A02()
            java.lang.String r0 = X.002.A0u(r7, r6, r1, r0)
            X.0qQ.A07(r0)
            r5.A0E = r0
            java.lang.Class<X.CEN> r1 = X.CEN.class
            java.lang.Class<X.CyN> r0 = X.C45549CyN.class
            r5.A0Q(r1, r0)
            java.lang.String r0 = r13.A00
            r5.A9m(r8, r0)
            int r1 = r9.intValue()
            java.lang.String r0 = "limit"
            r5.A0C(r0, r1)
            if (r11 == 0) goto L_0x0095
            boolean r1 = r11.booleanValue()
            java.lang.String r0 = "should_include_unconnected"
            r5.A0H(r0, r1)
        L_0x0095:
            if (r10 == 0) goto L_0x00a0
            boolean r1 = r10.booleanValue()
            java.lang.String r0 = "should_include_restricted_countries"
            r5.A0H(r0, r1)
        L_0x00a0:
            X.1OC r1 = r5.A0M()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubCategoryMembersResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubCategoryMembersResponse>>"
            X.0qQ.A0C(r1, r0)
            r2.A00 = r4
            r0 = 1037542755(0x3dd7a563, float:0.10529592)
            java.lang.Object r0 = r1.A00(r0, r2)
            if (r0 != r3) goto L_0x0024
            return r3
        L_0x00b5:
            r0 = 42
            X.ME7 r2 = new X.ME7
            r2.<init>(r12, r14, r4, r0)
            goto L_0x0016
        L_0x00be:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x00c4:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A01(com.instagram.api.schemas.FanClubCategoryType, X.4D7, boolean, boolean):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.3Ih} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: X.3Ih} */
    /* JADX WARNING: type inference failed for: r5v1, types: [X.9JT, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.C46401DeO r10, java.lang.String r11, X.AnonymousClass4D7 r12) {
        /*
            r9 = this;
            r3 = 20
            boolean r0 = X.AnonymousClass9JT.A00(r3, r12)
            if (r0 == 0) goto L_0x009d
            r5 = r12
            X.9JT r5 = (X.AnonymousClass9JT) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009d
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            r2 = 0
            r8 = 2
            r4 = 1
            r7 = 0
            if (r0 == 0) goto L_0x005b
            if (r0 == r4) goto L_0x00ee
            if (r0 != r8) goto L_0x00ac
            X.0eS.A00(r1)
        L_0x0029:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0055
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.371 r0 = (X.AnonymousClass371) r0
            java.lang.Object r0 = r0.FH3()
            X.BAc r0 = (X.C42002BAc) r0
            X.4sL r0 = r0.A00
            if (r0 == 0) goto L_0x0041
            X.1Xj r2 = r0.A00
        L_0x0041:
            X.3Ih r0 = new X.3Ih
            r0.<init>(r2)
            r2 = r0
        L_0x0047:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x012a
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0123
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0055:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00a6
            r2 = r1
            goto L_0x0047
        L_0x005b:
            X.0eS.A00(r1)
            int r0 = r10.ordinal()
            if (r0 == r7) goto L_0x00b4
            if (r0 != r4) goto L_0x012a
            com.instagram.common.session.UserSession r1 = r9.A00
            X.0qQ.A0B(r11, r4)
            r0 = -2
            X.1NY r4 = new X.1NY
            r4.<init>(r1, r0)
            java.lang.String r3 = "fan_club_id"
            r4.A05()
            r4.A02()
            java.lang.String r0 = "api/v1/fan_club/welcome_video/"
            r4.A0A(r0)
            java.lang.Class<X.CD7> r1 = X.CD7.class
            java.lang.Class<X.CyU> r0 = X.C45556CyU.class
            r4.A0O(r2, r1, r0, r7)
            r4.A9m(r3, r11)
            X.1OC r1 = r4.A0M()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubWelcomeVideoInfoResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubWelcomeVideoInfoResponse>>"
            X.0qQ.A0C(r1, r0)
            r5.A00 = r8
            r0 = 876706038(0x344178f6, float:1.8018531E-7)
            java.lang.Object r1 = r1.A00(r0, r5)
            if (r1 != r6) goto L_0x0029
            return r6
        L_0x009d:
            r0 = 42
            X.9JT r5 = new X.9JT
            r5.<init>(r9, r12, r3, r0)
            goto L_0x0016
        L_0x00a6:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00ac:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00b4:
            com.instagram.common.session.UserSession r1 = r9.A00
            X.0qQ.A0B(r11, r4)
            r0 = -2
            X.1NY r8 = new X.1NY
            r8.<init>(r1, r0)
            java.lang.String r3 = "fan_club_id"
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r8.A08(r0)
            r8.A02()
            java.lang.String r0 = "api/v1/fan_club/promotional_video/"
            r8.A0A(r0)
            java.lang.Class<X.B6E> r1 = X.B6E.class
            java.lang.Class<X.B5t> r0 = X.C41898B5t.class
            r8.A0O(r2, r1, r0, r7)
            r8.A9m(r3, r11)
            X.1OC r3 = r8.A0M()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubPromoVideoInfoResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubPromoVideoInfoResponse>>"
            X.0qQ.A0C(r3, r0)
            r5.A00 = r4
            r1 = 876706038(0x344178f6, float:1.8018531E-7)
            r0 = 3
            java.lang.Object r1 = r3.A02(r5, r1, r0, r7)
            if (r1 != r6) goto L_0x00f1
            return r6
        L_0x00ee:
            X.0eS.A00(r1)
        L_0x00f1:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x011d
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.371 r0 = (X.AnonymousClass371) r0
            java.lang.Object r0 = r0.FH3()
            X.B5u r0 = (X.C41899B5u) r0
            X.4sL r0 = r0.A00
            if (r0 == 0) goto L_0x0109
            X.1Xj r2 = r0.A00
        L_0x0109:
            X.3Ih r0 = new X.3Ih
            r0.<init>(r2)
            r2 = r0
        L_0x010f:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x012a
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0123
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x011d:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x012b
            r2 = r1
            goto L_0x010f
        L_0x0123:
            X.0gF r0 = X.C60340gF.A00
            X.5sO r2 = new X.5sO
            r2.<init>(r0)
        L_0x012a:
            return r2
        L_0x012b:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A02(X.DeO, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.ME7, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(java.lang.String r9, java.lang.String r10, X.AnonymousClass4D7 r11) {
        /*
            r8 = this;
            r4 = 41
            boolean r0 = X.ME7.A02(r4, r11)
            if (r0 == 0) goto L_0x00a0
            r3 = r11
            X.ME7 r3 = (X.ME7) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a0
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r3.A01
            X.1Hj r4 = X.1Hj.A02
            int r1 = r3.A00
            r5 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 != r5) goto L_0x00af
            X.0eS.A00(r0)
        L_0x0024:
            r4 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0034
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00a9
            X.0gF r0 = X.C60340gF.A00
            X.5sO r4 = new X.5sO
            r4.<init>(r0)
        L_0x0034:
            return r4
        L_0x0035:
            X.0eS.A00(r0)
            X.QNI r7 = new X.QNI
            r7.<init>()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "client_mutation_id"
            r7.A07(r1, r0)
            java.lang.String r0 = "fan_club_id"
            r7.A07(r9, r0)
            X.2IV r2 = new X.2IV
            r2.<init>()
            java.lang.String r0 = "user_id"
            r2.A09(r10, r0)
            java.lang.String r1 = "BLOCK"
            java.lang.String r0 = "block_action_type"
            r2.A09(r1, r0)
            java.util.List r1 = java.util.Collections.singletonList(r2)
            X.0qQ.A07(r1)
            java.lang.String r0 = "user_args"
            r7.A05(r0, r1)
            X.2IS r6 = new X.2IS
            r6.<init>()
            java.lang.String r0 = "input"
            r6.A00(r7, r0)
            java.lang.Class<X.B9L> r1 = X.B9L.class
            java.lang.String r0 = "FanClubBlockMember"
            X.3Fa r2 = new X.3Fa
            r2.<init>(r6, r1, r0, r5)
            com.instagram.common.session.UserSession r0 = r8.A00
            X.3Fb r1 = X.C46479Dfi.A01(r0)
            r1.A08(r2)
            r0 = 65
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.A08 = r0
            X.1OC r1 = r1.A05()
            r3.A00 = r5
            r0 = 338680868(0x142fdc24, float:8.878657E-27)
            java.lang.Object r0 = r1.A00(r0, r3)
            if (r0 != r4) goto L_0x0024
            return r4
        L_0x00a0:
            r0 = 42
            X.ME7 r3 = new X.ME7
            r3.<init>(r8, r11, r4, r0)
            goto L_0x0016
        L_0x00a9:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x00af:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A03(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A06(java.lang.String r18, java.lang.String r19, X.AnonymousClass4D7 r20) {
        /*
            r17 = this;
            r5 = 12
            r6 = r20
            boolean r0 = X.C66136MDo.A01(r5, r6)
            r3 = r17
            if (r0 == 0) goto L_0x009f
            r1 = r6
            X.MDo r1 = (X.C66136MDo) r1
            int r4 = r1.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r2
            if (r0 == 0) goto L_0x009f
            int r4 = r4 - r2
            r1.A00 = r4
        L_0x001a:
            java.lang.Object r4 = r1.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r1.A00
            r11 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 != r11) goto L_0x00ab
            X.0eS.A00(r4)
        L_0x0028:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00a8
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00a8
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x0036:
            X.0eS.A00(r4)
            X.0K0 r5 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r12 = 0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "client_mutation_id"
            X.0Df r6 = r5.A02()
            X.0Df.A00(r6, r4, r0)
            java.lang.String r0 = "creator_igid"
            r4 = r18
            X.0Df.A00(r6, r4, r0)
            java.lang.String r0 = "entry_point"
            r4 = r19
            X.0Df.A00(r6, r4, r0)
            X.2IS r5 = new X.2IS
            r5.<init>()
            X.2IS r4 = new X.2IS
            r4.<init>()
            java.lang.String r14 = "input"
            X.2IV r0 = r5.A00
            X.0Df r0 = r0.A02()
            r0.A0E(r6, r14)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r6 = X.AnonymousClass1vS.A00()
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r4.getParamsCopy()
            java.lang.Class<X.BkJ> r10 = X.BkJ.class
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            java.lang.String r7 = "FanClubSetFanOnboardingEntryPoint"
            r13 = 8
            java.lang.String r15 = "xig_ig_fan_club_set_join_entry_point"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.instagram.common.session.UserSession r0 = r3.A00
            X.1vn r0 = X.1vm.A01(r0)
            r1.A00 = r11
            java.lang.Object r4 = r0.A04(r5, r1)
            if (r4 != r2) goto L_0x0028
            return r2
        L_0x009f:
            r0 = 42
            X.MDo r1 = new X.MDo
            r1.<init>(r3, r6, r5, r0)
            goto L_0x001a
        L_0x00a8:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x00ab:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A06(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.ME7, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A08(java.lang.String r18, X.AnonymousClass4D7 r19) {
        /*
            r17 = this;
            r5 = 44
            r6 = r19
            boolean r0 = X.ME7.A02(r5, r6)
            r3 = r17
            if (r0 == 0) goto L_0x00af
            r1 = r6
            X.ME7 r1 = (X.ME7) r1
            int r4 = r1.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r2
            if (r0 == 0) goto L_0x00af
            int r4 = r4 - r2
            r1.A00 = r4
        L_0x001a:
            java.lang.Object r4 = r1.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r1.A00
            r11 = 1
            if (r0 == 0) goto L_0x004d
            if (r0 != r11) goto L_0x00be
            X.0eS.A00(r4)
        L_0x0028:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0043
            X.0gF r0 = X.C60340gF.A00
            X.3Ih r4 = new X.3Ih
            r4.<init>(r0)
        L_0x0033:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0042
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00b8
            X.0gF r0 = X.C60340gF.A00
            X.5sO r4 = new X.5sO
            r4.<init>(r0)
        L_0x0042:
            return r4
        L_0x0043:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0033
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x004d:
            X.0eS.A00(r4)
            X.0K0 r5 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r12 = 0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "client_mutation_id"
            X.0Df r6 = r5.A02()
            X.0Df.A00(r6, r4, r0)
            java.lang.String r0 = "fan_club_id"
            r4 = r18
            X.0Df.A00(r6, r4, r0)
            X.2IS r5 = new X.2IS
            r5.<init>()
            X.2IS r4 = new X.2IS
            r4.<init>()
            java.lang.String r14 = "input"
            X.2IV r0 = r5.A00
            X.0Df r0 = r0.A02()
            r0.A0E(r6, r14)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r6 = X.AnonymousClass1vS.A00()
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r4.getParamsCopy()
            java.lang.Class<X.BkR> r10 = X.BkR.class
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            java.lang.String r7 = "GrantDogfoodingAccess"
            r13 = 8
            java.lang.String r15 = "xig_fan_club_grant_dogfooding_access"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.instagram.common.session.UserSession r0 = r3.A00
            X.1vn r0 = X.1vm.A01(r0)
            r1.A00 = r11
            java.lang.Object r4 = r0.A04(r5, r1)
            if (r4 != r2) goto L_0x0028
            return r2
        L_0x00af:
            r0 = 42
            X.ME7 r1 = new X.ME7
            r1.<init>(r3, r6, r5, r0)
            goto L_0x001a
        L_0x00b8:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00be:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A08(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.ME7, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.String r19, X.AnonymousClass4D7 r20) {
        /*
            r18 = this;
            r5 = 45
            r6 = r20
            boolean r0 = X.ME7.A02(r5, r6)
            r4 = r18
            if (r0 == 0) goto L_0x00a1
            r2 = r6
            X.ME7 r2 = (X.ME7) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00a1
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x001a:
            java.lang.Object r5 = r2.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r2.A00
            r1 = 1
            if (r0 == 0) goto L_0x0055
            if (r0 != r1) goto L_0x00b0
            X.0eS.A00(r5)
        L_0x0028:
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x004b
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r0 = r5.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r0 = r0.A01
            X.3Ih r5 = new X.3Ih
            r5.<init>(r0)
        L_0x003b:
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x004a
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00aa
            X.0gF r0 = X.C60340gF.A00
            X.5sO r5 = new X.5sO
            r5.<init>(r0)
        L_0x004a:
            return r5
        L_0x004b:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 != 0) goto L_0x003b
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0055:
            X.0eS.A00(r5)
            r13 = 0
            X.2IS r6 = new X.2IS
            r6.<init>()
            X.2IS r5 = new X.2IS
            r5.<init>()
            java.lang.String r0 = "user_id"
            r7 = r19
            r6.A04(r0, r7)
            r0 = 0
            if (r19 == 0) goto L_0x006e
            r0 = 1
        L_0x006e:
            X.17k.A0E(r0)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r7 = X.AnonymousClass1vS.A00()
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<X.BkY> r11 = X.BkY.class
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            java.lang.String r8 = "IGFanClubGuidanceInspirationUsersQuery"
            r12 = 0
            java.lang.String r16 = "xig_user_by_igid_v2"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.instagram.common.session.UserSession r0 = r4.A00
            X.1vn r0 = X.1vm.A01(r0)
            r2.A00 = r1
            java.lang.Object r5 = r0.A04(r6, r2)
            if (r5 != r3) goto L_0x0028
            return r3
        L_0x00a1:
            r0 = 42
            X.ME7 r2 = new X.ME7
            r2.<init>(r4, r6, r5, r0)
            goto L_0x001a
        L_0x00aa:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00b0:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A09(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.ME7, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0A(java.lang.String r7, X.AnonymousClass4D7 r8) {
        /*
            r6 = this;
            r4 = 47
            boolean r0 = X.ME7.A02(r4, r8)
            if (r0 == 0) goto L_0x006e
            r3 = r8
            X.ME7 r3 = (X.ME7) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006e
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r3.A01
            X.1Hj r4 = X.1Hj.A02
            int r1 = r3.A00
            r5 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 != r5) goto L_0x007c
            X.0eS.A00(r0)
        L_0x0024:
            r4 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0034
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0076
            X.0gF r0 = X.C60340gF.A00
            X.5sO r4 = new X.5sO
            r4.<init>(r0)
        L_0x0034:
            return r4
        L_0x0035:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r1 = r6.A00
            r0 = -2
            X.1NY r2 = new X.1NY
            r2.<init>(r1, r0)
            r2.A05()
            r2.A02()
            java.lang.String r0 = "api/v1/fan_club/blocked_members/"
            r2.A0A(r0)
            java.lang.Class<X.CEA> r1 = X.CEA.class
            java.lang.Class<X.CyL> r0 = X.C45547CyL.class
            r2.A0Q(r1, r0)
            if (r7 == 0) goto L_0x0059
            java.lang.String r0 = "next_cursor"
            r2.A9m(r0, r7)
        L_0x0059:
            X.1OC r1 = r2.A0M()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubBlockedMembersResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubBlockedMembersResponse>>"
            X.0qQ.A0C(r1, r0)
            r3.A00 = r5
            r0 = 1264748884(0x4b628954, float:1.4846292E7)
            java.lang.Object r0 = r1.A00(r0, r3)
            if (r0 != r4) goto L_0x0024
            return r4
        L_0x006e:
            r0 = 42
            X.ME7 r3 = new X.ME7
            r3.<init>(r6, r8, r4, r0)
            goto L_0x0016
        L_0x0076:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x007c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0A(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.9JT, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0B(java.lang.String r9, X.AnonymousClass4D7 r10) {
        /*
            r8 = this;
            r4 = 18
            boolean r0 = X.AnonymousClass9JT.A00(r4, r10)
            if (r0 == 0) goto L_0x0073
            r3 = r10
            X.9JT r3 = (X.AnonymousClass9JT) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0073
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r3.A01
            X.1Hj r5 = X.1Hj.A02
            int r1 = r3.A00
            r7 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 != r7) goto L_0x0081
            X.0eS.A00(r0)
        L_0x0024:
            r5 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0034
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x007b
            X.0gF r0 = X.C60340gF.A00
            X.5sO r5 = new X.5sO
            r5.<init>(r0)
        L_0x0034:
            return r5
        L_0x0035:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r1 = r8.A00
            r6 = 0
            r0 = -2
            X.1NY r4 = new X.1NY
            r4.<init>(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r4.A08(r0)
            r4.A02()
            java.lang.String r0 = "api/v1/fan_club/creators_subscribed_to/"
            r4.A0A(r0)
            java.lang.Class<X.CEB> r2 = X.CEB.class
            java.lang.Class<X.CyP> r1 = X.C45551CyP.class
            r0 = 0
            r4.A0O(r0, r2, r1, r6)
            if (r9 == 0) goto L_0x005d
            java.lang.String r0 = "max_id"
            r4.A9m(r0, r9)
        L_0x005d:
            X.1OC r2 = r4.A0M()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubCreatorsSubscribedToResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubCreatorsSubscribedToResponse>>"
            X.0qQ.A0C(r2, r0)
            r3.A00 = r7
            r1 = 1561350127(0x5d104fef, float:6.4992455E17)
            r0 = 3
            java.lang.Object r0 = r2.A02(r3, r1, r0, r6)
            if (r0 != r5) goto L_0x0024
            return r5
        L_0x0073:
            r0 = 42
            X.9JT r3 = new X.9JT
            r3.<init>(r8, r10, r4, r0)
            goto L_0x0016
        L_0x007b:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x0081:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0B(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.9JT, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0C(java.lang.String r9, X.AnonymousClass4D7 r10) {
        /*
            r8 = this;
            r4 = 19
            boolean r0 = X.AnonymousClass9JT.A00(r4, r10)
            if (r0 == 0) goto L_0x0073
            r3 = r10
            X.9JT r3 = (X.AnonymousClass9JT) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0073
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r3.A01
            X.1Hj r5 = X.1Hj.A02
            int r1 = r3.A00
            r7 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 != r7) goto L_0x0081
            X.0eS.A00(r0)
        L_0x0024:
            r5 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0034
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x007b
            X.0gF r0 = X.C60340gF.A00
            X.5sO r5 = new X.5sO
            r5.<init>(r0)
        L_0x0034:
            return r5
        L_0x0035:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r1 = r8.A00
            r6 = 0
            r0 = -2
            X.1NY r4 = new X.1NY
            r4.<init>(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r4.A08(r0)
            r4.A02()
            java.lang.String r0 = "api/v1/fan_club/followed_creators_to_susbcribe_to/"
            r4.A0A(r0)
            java.lang.Class<X.CEC> r2 = X.CEC.class
            java.lang.Class<X.CyR> r1 = X.C45553CyR.class
            r0 = 0
            r4.A0O(r0, r2, r1, r6)
            if (r9 == 0) goto L_0x005d
            java.lang.String r0 = "max_id"
            r4.A9m(r0, r9)
        L_0x005d:
            X.1OC r2 = r4.A0M()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubFollowedCreatorsToSubscribeToResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubFollowedCreatorsToSubscribeToResponse>>"
            X.0qQ.A0C(r2, r0)
            r3.A00 = r7
            r1 = 1327216684(0x4f1bb82c, float:2.61253837E9)
            r0 = 3
            java.lang.Object r0 = r2.A02(r3, r1, r0, r6)
            if (r0 != r5) goto L_0x0024
            return r5
        L_0x0073:
            r0 = 42
            X.9JT r3 = new X.9JT
            r3.<init>(r8, r10, r4, r0)
            goto L_0x0016
        L_0x007b:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x0081:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0C(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0G(java.lang.String r18, X.AnonymousClass4D7 r19) {
        /*
            r17 = this;
            r13 = 8
            r5 = r19
            boolean r0 = X.C66136MDo.A01(r13, r5)
            r3 = r17
            if (r0 == 0) goto L_0x00ad
            r1 = r5
            X.MDo r1 = (X.C66136MDo) r1
            int r4 = r1.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r2
            if (r0 == 0) goto L_0x00ad
            int r4 = r4 - r2
            r1.A00 = r4
        L_0x001a:
            java.lang.Object r4 = r1.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r1.A00
            r11 = 1
            if (r0 == 0) goto L_0x004d
            if (r0 != r11) goto L_0x00bc
            X.0eS.A00(r4)
        L_0x0028:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0043
            X.0gF r0 = X.C60340gF.A00
            X.3Ih r4 = new X.3Ih
            r4.<init>(r0)
        L_0x0033:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0042
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00b6
            X.0gF r0 = X.C60340gF.A00
            X.5sO r4 = new X.5sO
            r4.<init>(r0)
        L_0x0042:
            return r4
        L_0x0043:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0033
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x004d:
            X.0eS.A00(r4)
            X.0K0 r5 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r12 = 0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "client_mutation_id"
            X.0Df r6 = r5.A02()
            X.0Df.A00(r6, r4, r0)
            java.lang.String r0 = "fan_club_id"
            r4 = r18
            X.0Df.A00(r6, r4, r0)
            X.2IS r5 = new X.2IS
            r5.<init>()
            X.2IS r4 = new X.2IS
            r4.<init>()
            java.lang.String r14 = "input"
            X.2IV r0 = r5.A00
            X.0Df r0 = r0.A02()
            r0.A0E(r6, r14)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r6 = X.AnonymousClass1vS.A00()
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r4.getParamsCopy()
            java.lang.Class<X.Bkh> r10 = X.C42861Bkh.class
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            java.lang.String r7 = "JoinWaitlistMutation"
            java.lang.String r15 = "xig_ig_fan_club_join_waitlist"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.instagram.common.session.UserSession r0 = r3.A00
            X.1vn r0 = X.1vm.A01(r0)
            r1.A00 = r11
            java.lang.Object r4 = r0.A04(r5, r1)
            if (r4 != r2) goto L_0x0028
            return r2
        L_0x00ad:
            r0 = 42
            X.MDo r1 = new X.MDo
            r1.<init>(r3, r5, r13, r0)
            goto L_0x001a
        L_0x00b6:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00bc:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0G(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.9JT, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0I(java.lang.String r19, X.AnonymousClass4D7 r20, boolean r21, boolean r22, boolean r23) {
        /*
            r18 = this;
            r5 = 22
            r6 = r20
            boolean r0 = X.AnonymousClass9JT.A00(r5, r6)
            r4 = r18
            if (r0 == 0) goto L_0x00c9
            r2 = r6
            X.9JT r2 = (X.AnonymousClass9JT) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00c9
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x001a:
            java.lang.Object r5 = r2.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r2.A00
            r1 = 1
            if (r0 == 0) goto L_0x0055
            if (r0 != r1) goto L_0x00d8
            X.0eS.A00(r5)
        L_0x0028:
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x004b
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r0 = r5.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r0 = r0.A01
            X.3Ih r5 = new X.3Ih
            r5.<init>(r0)
        L_0x003b:
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x004a
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00d2
            X.0gF r0 = X.C60340gF.A00
            X.5sO r5 = new X.5sO
            r5.<init>(r0)
        L_0x004a:
            return r5
        L_0x004b:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 != 0) goto L_0x003b
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0055:
            X.0eS.A00(r5)
            r13 = 0
            X.2IS r8 = new X.2IS
            r8.<init>()
            X.2IS r10 = new X.2IS
            r10.<init>()
            r12 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            java.lang.String r9 = "should_fetch_early_pricing"
            r8.A02(r9, r0)
            java.lang.String r7 = "should_fetch_member_count"
            r8.A02(r7, r0)
            java.lang.String r6 = "fetch_exclusive_metrics"
            r8.A02(r6, r0)
            java.lang.String r0 = "user_id"
            r11 = r19
            r8.A04(r0, r11)
            r5 = 0
            if (r19 == 0) goto L_0x0082
            r5 = 1
        L_0x0082:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r21)
            r8.A02(r9, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r22)
            r8.A02(r7, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r23)
            r8.A02(r6, r0)
            X.17k.A0E(r5)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r7 = X.AnonymousClass1vS.A00()
            java.util.Map r9 = r8.getParamsCopy()
            java.util.Map r10 = r10.getParamsCopy()
            java.lang.Class<X.Bk5> r11 = X.Bk5.class
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            java.lang.String r8 = "FanClubInfo"
            java.lang.String r16 = "xig_user_by_igid_v2"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.instagram.common.session.UserSession r0 = r4.A00
            X.1vn r0 = X.1vm.A01(r0)
            r2.A00 = r1
            java.lang.Object r5 = r0.A04(r6, r2)
            if (r5 != r3) goto L_0x0028
            return r3
        L_0x00c9:
            r0 = 42
            X.9JT r2 = new X.9JT
            r2.<init>(r4, r6, r5, r0)
            goto L_0x001a
        L_0x00d2:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00d8:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0I(java.lang.String, X.4D7, boolean, boolean, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0J(java.lang.String r16, X.AnonymousClass4D7 r17, boolean r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, boolean r24) {
        /*
            r15 = this;
            r6 = r16
            r12 = 0
            r3 = 27
            r4 = r17
            boolean r0 = X.C66145MDx.A02(r3, r4)
            if (r0 == 0) goto L_0x0125
            r5 = r4
            X.MDx r5 = (X.C66145MDx) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0125
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x001b:
            java.lang.Object r4 = r5.A03
            X.1Hj r3 = X.1Hj.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L_0x00fa
            if (r0 != r2) goto L_0x0132
            java.lang.Object r6 = r5.A02
            java.lang.Object r1 = r5.A01
            com.instagram.fanclub.api.FanClubApi r1 = (com.instagram.fanclub.api.FanClubApi) r1
            X.0eS.A00(r4)
        L_0x002f:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00f0
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r0 = r4.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            com.instagram.common.session.UserSession r1 = r1.A00
            java.lang.String r2 = r1.A06
            boolean r2 = X.0qQ.A0K(r6, r2)
            if (r2 == 0) goto L_0x00c7
            java.lang.Object r2 = r0.A01
            X.C7k r2 = (X.C43740C7k) r2
            if (r2 == 0) goto L_0x00ed
            X.C7j r2 = r2.A0E()
            if (r2 == 0) goto L_0x00ed
            X.C7i r5 = r2.A0E()
        L_0x0055:
            X.0Tu r4 = X.0Tu.A05
            r2 = 36314790301469480(0x81041c00030b28, double:3.028957842348218E-306)
            boolean r2 = X.182.A06(r4, r1, r2)
            if (r2 == 0) goto L_0x00c7
            if (r5 == 0) goto L_0x00c7
            X.C7h r2 = r5.A0E()
            if (r2 == 0) goto L_0x0088
            X.Bju r3 = r2.A0E()
            if (r3 == 0) goto L_0x0088
            java.lang.String r2 = "count"
            int r4 = r3.getCoercedIntField(r12, r2)
            X.6jB r2 = X.C314986jA.A00(r1)
            X.0xa r2 = r2.A01
            X.0xY r3 = r2.AR4()
            java.lang.String r2 = "fan_club_member_count"
            r3.E5Z(r2, r4)
            r3.apply()
        L_0x0088:
            java.lang.String r2 = "strong_id__"
            java.lang.String r12 = r5.A07(r2)
            if (r12 == 0) goto L_0x00c7
            X.0t1 r2 = X.0eE.A00(r1)
            com.instagram.user.model.User r2 = r2.A00()
            X.4Cl r3 = r2.A03
            com.instagram.api.schemas.FanClubInfoDict r3 = r3.B3v()
            if (r3 == 0) goto L_0x00de
            com.instagram.api.schemas.FanClubInfoDictImpl r3 = r3.F2y()
            java.lang.Boolean r6 = r3.A01
            java.lang.Integer r10 = r3.A05
            java.lang.String r13 = r3.A08
            com.instagram.api.schemas.FanClubFanConsiderationPageFeatureEligibilityResponse r5 = r3.A00
            java.lang.Boolean r7 = r3.A02
            java.lang.Boolean r8 = r3.A03
            java.lang.Boolean r9 = r3.A04
            java.lang.String r14 = r3.A09
            java.lang.Integer r11 = r3.A06
            com.instagram.api.schemas.FanClubInfoDictImpl r4 = new com.instagram.api.schemas.FanClubInfoDictImpl
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x00bb:
            X.4Cl r3 = r2.A03
            r3.EVz(r4)
            X.17i r1 = X.17h.A00(r1)
            r1.A03(r2)
        L_0x00c7:
            java.lang.Object r0 = r0.A01
            X.3Ih r4 = new X.3Ih
            r4.<init>(r0)
        L_0x00ce:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00dd
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x012c
            X.0gF r0 = X.C60340gF.A00
            X.5sO r4 = new X.5sO
            r4.<init>(r0)
        L_0x00dd:
            return r4
        L_0x00de:
            com.instagram.api.schemas.FanClubInfoDictImpl r4 = new com.instagram.api.schemas.FanClubInfoDictImpl
            r5 = 0
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r13 = r5
            r14 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x00bb
        L_0x00ed:
            r5 = 0
            goto L_0x0055
        L_0x00f0:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00ce
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00fa:
            X.0eS.A00(r4)
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r13 = r23
            r14 = r24
            com.facebook.pando.PandoGraphQLRequest r1 = A00(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            com.instagram.common.session.UserSession r0 = r15.A00
            X.1vn r0 = X.1vm.A01(r0)
            r5.A01 = r15
            r5.A02 = r6
            r5.A00 = r2
            java.lang.Object r4 = r0.A04(r1, r5)
            if (r4 != r3) goto L_0x0122
            return r3
        L_0x0122:
            r1 = r15
            goto L_0x002f
        L_0x0125:
            X.MDx r5 = new X.MDx
            r5.<init>(r15, r4, r3)
            goto L_0x001b
        L_0x012c:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0132:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0J(java.lang.String, X.4D7, boolean, boolean, boolean, boolean, boolean, boolean, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.ME7, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0K(java.util.List r7, X.AnonymousClass4D7 r8) {
        /*
            r6 = this;
            r4 = 43
            boolean r0 = X.ME7.A02(r4, r8)
            if (r0 == 0) goto L_0x006d
            r3 = r8
            X.ME7 r3 = (X.ME7) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006d
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r3.A01
            X.1Hj r4 = X.1Hj.A02
            int r1 = r3.A00
            r5 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 != r5) goto L_0x007b
            X.0eS.A00(r0)
        L_0x0024:
            r4 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0034
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0075
            X.0gF r0 = X.C60340gF.A00
            X.5sO r4 = new X.5sO
            r4.<init>(r0)
        L_0x0034:
            return r4
        L_0x0035:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r1 = r6.A00
            r0 = -2
            X.1NY r2 = new X.1NY
            r2.<init>(r1, r0)
            r2.A04()
            java.lang.String r0 = "fan_club/make_preview_content_into_exclusive/"
            r2.A0A(r0)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>(r7)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "media_ids"
            r2.A9m(r0, r1)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            r2.A0Q(r1, r0)
            X.1OC r1 = r2.A0M()
            r3.A00 = r5
            r0 = 210647125(0xc8e3855, float:2.1912468E-31)
            java.lang.Object r0 = r1.A00(r0, r3)
            if (r0 != r4) goto L_0x0024
            return r4
        L_0x006d:
            r0 = 42
            X.ME7 r3 = new X.ME7
            r3.<init>(r6, r8, r4, r0)
            goto L_0x0016
        L_0x0075:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x007b:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0K(java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0M(java.util.List r18, X.AnonymousClass4D7 r19) {
        /*
            r17 = this;
            r5 = 10
            r6 = r19
            boolean r0 = X.C66136MDo.A01(r5, r6)
            r3 = r17
            if (r0 == 0) goto L_0x00b0
            r1 = r6
            X.MDo r1 = (X.C66136MDo) r1
            int r4 = r1.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r2
            if (r0 == 0) goto L_0x00b0
            int r4 = r4 - r2
            r1.A00 = r4
        L_0x001a:
            java.lang.Object r4 = r1.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r1.A00
            r11 = 1
            if (r0 == 0) goto L_0x0055
            if (r0 != r11) goto L_0x00bf
            X.0eS.A00(r4)
        L_0x0028:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x004b
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r0 = r4.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r0 = r0.A01
            X.3Ih r4 = new X.3Ih
            r4.<init>(r0)
        L_0x003b:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x004a
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00b9
            X.0gF r0 = X.C60340gF.A00
            X.5sO r4 = new X.5sO
            r4.<init>(r0)
        L_0x004a:
            return r4
        L_0x004b:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x003b
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0055:
            X.0eS.A00(r4)
            X.QNI r6 = new X.QNI
            r6.<init>()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "client_mutation_id"
            r6.A07(r4, r0)
            java.lang.String r0 = "custom_benefits"
            r4 = r18
            r6.A05(r0, r4)
            r12 = 0
            X.2IS r5 = new X.2IS
            r5.<init>()
            X.2IS r4 = new X.2IS
            r4.<init>()
            java.lang.String r14 = "input"
            r5.A00(r6, r14)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r6 = X.AnonymousClass1vS.A00()
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r4.getParamsCopy()
            java.lang.Class<X.Bkl> r10 = X.C42865Bkl.class
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            java.lang.String r7 = "SetCustomBenefits"
            r13 = 8
            java.lang.String r15 = "xig_ig_fan_club_set_custom_benefits"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.instagram.common.session.UserSession r0 = r3.A00
            X.1vn r0 = X.1vm.A01(r0)
            r1.A00 = r11
            java.lang.Object r4 = r0.A04(r5, r1)
            if (r4 != r2) goto L_0x0028
            return r2
        L_0x00b0:
            r0 = 42
            X.MDo r1 = new X.MDo
            r1.<init>(r3, r6, r5, r0)
            goto L_0x001a
        L_0x00b9:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00bf:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0M(java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0N(java.util.List r18, X.AnonymousClass4D7 r19) {
        /*
            r17 = this;
            r5 = 11
            r6 = r19
            boolean r0 = X.C66136MDo.A01(r5, r6)
            r3 = r17
            if (r0 == 0) goto L_0x00d9
            r1 = r6
            X.MDo r1 = (X.C66136MDo) r1
            int r4 = r1.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r2
            if (r0 == 0) goto L_0x00d9
            int r4 = r4 - r2
            r1.A00 = r4
        L_0x001a:
            java.lang.Object r4 = r1.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r1.A00
            r11 = 1
            if (r0 == 0) goto L_0x0055
            if (r0 != r11) goto L_0x00e8
            X.0eS.A00(r4)
        L_0x0028:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x004b
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r0 = r4.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r0 = r0.A01
            X.3Ih r4 = new X.3Ih
            r4.<init>(r0)
        L_0x003b:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x004a
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00e2
            X.0gF r0 = X.C60340gF.A00
            X.5sO r4 = new X.5sO
            r4.<init>(r0)
        L_0x004a:
            return r4
        L_0x004b:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x003b
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0055:
            X.0eS.A00(r4)
            r0 = 10
            r4 = r18
            int r0 = X.0Yv.A1E(r4, r0)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            java.util.Iterator r7 = r4.iterator()
        L_0x0069:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0090
            java.lang.Object r6 = r7.next()
            X.0eP r6 = (X.0eP) r6
            X.2IV r5 = new X.2IV
            r5.<init>()
            java.lang.Object r4 = r6.A00
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r0 = "title"
            r5.A09(r4, r0)
            java.lang.Object r4 = r6.A01
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r0 = "description"
            r5.A09(r4, r0)
            r8.add(r5)
            goto L_0x0069
        L_0x0090:
            X.2IV r6 = new X.2IV
            r6.<init>()
            java.lang.String r0 = "custom_benefits_data"
            r6.A05(r0, r8)
            r12 = 0
            X.2IS r5 = new X.2IS
            r5.<init>()
            X.2IS r4 = new X.2IS
            r4.<init>()
            java.lang.String r0 = "input"
            r5.A00(r6, r0)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r6 = X.AnonymousClass1vS.A00()
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r4.getParamsCopy()
            java.lang.Class<X.Bkn> r10 = X.C42867Bkn.class
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            java.lang.String r7 = "SetCustomBenefitsWithDescriptions"
            r13 = 0
            java.lang.String r15 = "xig_ig_fan_club_set_custom_benefits_data"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.instagram.common.session.UserSession r0 = r3.A00
            X.1vn r0 = X.1vm.A01(r0)
            r1.A00 = r11
            java.lang.Object r4 = r0.A04(r5, r1)
            if (r4 != r2) goto L_0x0028
            return r2
        L_0x00d9:
            r0 = 42
            X.MDo r1 = new X.MDo
            r1.<init>(r3, r6, r5, r0)
            goto L_0x001a
        L_0x00e2:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00e8:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0N(java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.ME7, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0098, code lost:
        if (r0 == r2) goto L_0x009a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0O(java.util.List r7, X.AnonymousClass4D7 r8, boolean r9) {
        /*
            r6 = this;
            r4 = 42
            boolean r0 = X.ME7.A02(r4, r8)
            if (r0 == 0) goto L_0x009b
            r3 = r8
            X.ME7 r3 = (X.ME7) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009b
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r3.A01
            X.1Hj r2 = X.1Hj.A02
            int r1 = r3.A00
            r5 = 1
            if (r1 == 0) goto L_0x005e
            if (r1 != r5) goto L_0x00a8
            X.0eS.A00(r0)
        L_0x0024:
            r2 = r0
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x003f
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r0 = r2.A00
            X.CD4 r0 = (X.CD4) r0
            X.JxC r0 = r0.A00
            if (r0 != 0) goto L_0x0049
            java.lang.String r0 = "response"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003f:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x004e
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0049:
            X.3Ih r2 = new X.3Ih
            r2.<init>(r0)
        L_0x004e:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x009a
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00a2
            X.0gF r0 = X.C60340gF.A00
            X.5sO r2 = new X.5sO
            r2.<init>(r0)
            return r2
        L_0x005e:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r1 = r6.A00
            r0 = -2
            X.1NY r4 = new X.1NY
            r4.<init>(r1, r0)
            r4.A04()
            java.lang.String r0 = "fan_club/make_exclusive_content_into_preview/"
            r4.A0A(r0)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>(r7)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "media_ids"
            r4.A9m(r0, r1)
            java.lang.String r0 = "need_replace"
            r4.A0H(r0, r9)
            java.lang.Class<X.CD4> r1 = X.CD4.class
            java.lang.Class<X.CyO> r0 = X.C45550CyO.class
            r4.A0Q(r1, r0)
            X.1OC r1 = r4.A0M()
            r3.A00 = r5
            r0 = 210647125(0xc8e3855, float:2.1912468E-31)
            java.lang.Object r0 = r1.A00(r0, r3)
            if (r0 != r2) goto L_0x0024
        L_0x009a:
            return r2
        L_0x009b:
            X.ME7 r3 = new X.ME7
            r3.<init>(r6, r8, r4, r4)
            goto L_0x0016
        L_0x00a2:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00a8:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0O(java.util.List, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.ME7, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0085, code lost:
        if (r0 == r3) goto L_0x0087;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0P(X.AnonymousClass4D7 r7) {
        /*
            r6 = this;
            r3 = 46
            boolean r0 = X.ME7.A02(r3, r7)
            if (r0 == 0) goto L_0x0088
            r5 = r7
            X.ME7 r5 = (X.ME7) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0088
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r5.A01
            X.1Hj r3 = X.1Hj.A02
            int r1 = r5.A00
            r4 = 1
            if (r1 == 0) goto L_0x005e
            if (r1 != r4) goto L_0x0096
            X.0eS.A00(r0)
        L_0x0024:
            r3 = r0
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x003f
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r0 = r3.A00
            X.CD5 r0 = (X.CD5) r0
            X.JxD r0 = r0.A00
            if (r0 != 0) goto L_0x0049
            java.lang.String r0 = "response"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003f:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x004e
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0049:
            X.3Ih r3 = new X.3Ih
            r3.<init>(r0)
        L_0x004e:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0087
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0090
            X.0gF r0 = X.C60340gF.A00
            X.5sO r3 = new X.5sO
            r3.<init>(r0)
            return r3
        L_0x005e:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r1 = r6.A00
            r0 = -2
            X.1NY r2 = new X.1NY
            r2.<init>(r1, r0)
            r2.A05()
            java.lang.String r0 = "fan_club/content_preview_ids/"
            r2.A0A(r0)
            java.lang.Class<X.CD5> r1 = X.CD5.class
            java.lang.Class<X.CyQ> r0 = X.C45552CyQ.class
            r2.A0Q(r1, r0)
            X.1OC r1 = r2.A0M()
            r5.A00 = r4
            r0 = 210647125(0xc8e3855, float:2.1912468E-31)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r3) goto L_0x0024
        L_0x0087:
            return r3
        L_0x0088:
            r0 = 42
            X.ME7 r5 = new X.ME7
            r5.<init>(r6, r7, r3, r0)
            goto L_0x0016
        L_0x0090:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0096:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0P(X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.9JT, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0Q(X.AnonymousClass4D7 r9) {
        /*
            r8 = this;
            r3 = 21
            boolean r0 = X.AnonymousClass9JT.A00(r3, r9)
            if (r0 == 0) goto L_0x006c
            r4 = r9
            X.9JT r4 = (X.AnonymousClass9JT) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006c
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r4.A01
            X.1Hj r6 = X.1Hj.A02
            int r1 = r4.A00
            r7 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 != r7) goto L_0x007a
            X.0eS.A00(r0)
        L_0x0024:
            r6 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0034
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0074
            X.0gF r0 = X.C60340gF.A00
            X.5sO r6 = new X.5sO
            r6.<init>(r0)
        L_0x0034:
            return r6
        L_0x0035:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r1 = r8.A00
            r5 = 0
            r0 = -2
            X.1NY r3 = new X.1NY
            r3.<init>(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r3.A08(r0)
            r3.A02()
            java.lang.String r0 = "api/v1/fan_club/unconnected_creators_to_susbcribe_to/"
            r3.A0A(r0)
            java.lang.Class<X.CD6> r2 = X.CD6.class
            java.lang.Class<X.CyT> r1 = X.C45555CyT.class
            r0 = 0
            r3.A0O(r0, r2, r1, r5)
            X.1OC r2 = r3.A0M()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubUnconnectedCreatorsToSubscribeToResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubUnconnectedCreatorsToSubscribeToResponse>>"
            X.0qQ.A0C(r2, r0)
            r4.A00 = r7
            r1 = 1595688088(0x5f1c4498, float:1.1260292E19)
            r0 = 3
            java.lang.Object r0 = r2.A02(r4, r1, r0, r5)
            if (r0 != r6) goto L_0x0024
            return r6
        L_0x006c:
            r0 = 42
            X.9JT r4 = new X.9JT
            r4.<init>(r8, r9, r3, r0)
            goto L_0x0016
        L_0x0074:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x007a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0Q(X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0S(X.AnonymousClass4D7 r18) {
        /*
            r17 = this;
            r5 = 9
            r6 = r18
            boolean r0 = X.C66136MDo.A01(r5, r6)
            r3 = r17
            if (r0 == 0) goto L_0x00b0
            r1 = r6
            X.MDo r1 = (X.C66136MDo) r1
            int r4 = r1.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r2
            if (r0 == 0) goto L_0x00b0
            int r4 = r4 - r2
            r1.A00 = r4
        L_0x001a:
            java.lang.Object r4 = r1.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r1.A00
            r11 = 1
            if (r0 == 0) goto L_0x0055
            if (r0 != r11) goto L_0x00bf
            X.0eS.A00(r4)
        L_0x0028:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x004b
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r0 = r4.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r0 = r0.A01
            X.3Ih r4 = new X.3Ih
            r4.<init>(r0)
        L_0x003b:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x004a
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00b9
            X.0gF r0 = X.C60340gF.A00
            X.5sO r4 = new X.5sO
            r4.<init>(r0)
        L_0x004a:
            return r4
        L_0x004b:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x003b
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0055:
            X.0eS.A00(r4)
            X.0K0 r5 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r12 = 0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "client_mutation_id"
            X.0Df r6 = r5.A02()
            X.0Df.A00(r6, r4, r0)
            X.2IS r5 = new X.2IS
            r5.<init>()
            X.2IS r4 = new X.2IS
            r4.<init>()
            java.lang.String r14 = "input"
            X.2IV r0 = r5.A00
            X.0Df r0 = r0.A02()
            r0.A0E(r6, r14)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r6 = X.AnonymousClass1vS.A00()
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r4.getParamsCopy()
            java.lang.Class<X.Bkj> r10 = X.C42863Bkj.class
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            java.lang.String r7 = "SendSubscriptionNotification"
            r13 = 8
            java.lang.String r15 = "xig_ig_fan_club_send_subscription_notification"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.instagram.common.session.UserSession r0 = r3.A00
            X.1vn r0 = X.1vm.A01(r0)
            r1.A00 = r11
            java.lang.Object r4 = r0.A04(r5, r1)
            if (r4 != r2) goto L_0x0028
            return r2
        L_0x00b0:
            r0 = 42
            X.MDo r1 = new X.MDo
            r1.<init>(r3, r6, r5, r0)
            goto L_0x001a
        L_0x00b9:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00bf:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0S(X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.ME7, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0T(X.AnonymousClass4D7 r12, boolean r13, boolean r14) {
        /*
            r11 = this;
            r4 = 48
            boolean r0 = X.ME7.A02(r4, r12)
            if (r0 == 0) goto L_0x00ab
            r2 = r12
            X.ME7 r2 = (X.ME7) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00ab
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0016:
            java.lang.Object r0 = r2.A01
            X.1Hj r3 = X.1Hj.A02
            int r1 = r2.A00
            r4 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 != r4) goto L_0x00ba
            X.0eS.A00(r0)
        L_0x0024:
            r3 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0034
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00b4
            X.0gF r0 = X.C60340gF.A00
            X.5sO r3 = new X.5sO
            r3.<init>(r0)
        L_0x0034:
            return r3
        L_0x0035:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r7 = r11.A00
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r13)
            X.0Tu r5 = X.0Tu.A05
            r0 = 36596106364782907(0x8203f70009093b, double:3.2068632535564935E-306)
            long r5 = X.182.A01(r5, r7, r0)
            int r0 = (int) r5
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r0)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r14)
            r0 = -2
            X.1NY r5 = new X.1NY
            r5.<init>(r7, r0)
            java.lang.String r7 = "api/"
            java.lang.String r6 = "v1/"
            java.lang.String r1 = "fan_club/"
            java.lang.String r0 = "categories_metadata/"
            r5.A05()
            r5.A02()
            java.lang.String r0 = X.002.A0u(r7, r6, r1, r0)
            X.0qQ.A07(r0)
            r5.A0E = r0
            java.lang.Class<X.CD3> r1 = X.CD3.class
            java.lang.Class<X.CyM> r0 = X.C45548CyM.class
            r5.A0Q(r1, r0)
            if (r10 == 0) goto L_0x0082
            boolean r1 = r10.booleanValue()
            java.lang.String r0 = "should_include_unconnected"
            r5.A0H(r0, r1)
        L_0x0082:
            int r1 = r8.intValue()
            java.lang.String r0 = "limit"
            r5.A0C(r0, r1)
            if (r9 == 0) goto L_0x0096
            boolean r1 = r9.booleanValue()
            java.lang.String r0 = "should_include_restricted_countries"
            r5.A0H(r0, r1)
        L_0x0096:
            X.1OC r1 = r5.A0M()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubCategoriesMetadataResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubCategoriesMetadataResponse>>"
            X.0qQ.A0C(r1, r0)
            r2.A00 = r4
            r0 = 849052330(0x329b82aa, float:1.8103794E-8)
            java.lang.Object r0 = r1.A00(r0, r2)
            if (r0 != r3) goto L_0x0024
            return r3
        L_0x00ab:
            r0 = 42
            X.ME7 r2 = new X.ME7
            r2.<init>(r11, r12, r4, r0)
            goto L_0x0016
        L_0x00b4:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x00ba:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.api.FanClubApi.A0T(X.4D7, boolean, boolean):java.lang.Object");
    }
}
