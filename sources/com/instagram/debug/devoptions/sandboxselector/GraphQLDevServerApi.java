package com.instagram.debug.devoptions.sandboxselector;

import X.0qQ;
import X.1vm;
import X.1vn;
import X.AnonymousClass4D7;
import X.C343637qX;
import X.C349197zk;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.DevserversCategoryInfoQueryImpl;

public final class GraphQLDevServerApi {
    /* JADX WARNING: type inference failed for: r4v1, types: [com.instagram.debug.devoptions.sandboxselector.GraphQLDevServerApi$getDevServers$1, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getDevServers(com.instagram.common.session.UserSession r6, X.AnonymousClass4D7 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.instagram.debug.devoptions.sandboxselector.GraphQLDevServerApi$getDevServers$1
            if (r0 == 0) goto L_0x0090
            r4 = r7
            com.instagram.debug.devoptions.sandboxselector.GraphQLDevServerApi$getDevServers$1 r4 = (com.instagram.debug.devoptions.sandboxselector.GraphQLDevServerApi$getDevServers$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0090
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r1 = r4.result
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L_0x0074
            if (r0 != r2) goto L_0x009c
            X.0eS.A00(r1)
        L_0x0020:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C297815sO
            r3 = 0
            if (r0 == 0) goto L_0x004c
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r1 = r1.A00
            boolean r0 = r1 instanceof X.C268674do
            if (r0 == 0) goto L_0x004a
            X.4do r1 = (X.C268674do) r1
            if (r1 == 0) goto L_0x004a
            java.lang.Object r0 = r1.A00
            X.1XQ r0 = (X.1XQ) r0
            if (r0 == 0) goto L_0x004a
            int r2 = r0.mStatusCode
        L_0x003b:
            int r1 = r2 / 100
            r0 = 5
            if (r1 == r0) goto L_0x0042
            if (r2 != 0) goto L_0x006e
        L_0x0042:
            com.instagram.debug.devoptions.sandboxselector.DevserverListError$ConnectionError r0 = com.instagram.debug.devoptions.sandboxselector.DevserverListError.ConnectionError.INSTANCE
        L_0x0044:
            X.5sO r3 = new X.5sO
            r3.<init>(r0)
            return r3
        L_0x004a:
            r2 = 0
            goto L_0x003b
        L_0x004c:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0097
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r2 = r1.A00
            X.3JC r2 = (X.AnonymousClass3JC) r2
            java.lang.Object r1 = r2.A01
            com.instagram.debug.devoptions.sandboxselector.DevserversListResponse r1 = (com.instagram.debug.devoptions.sandboxselector.DevserversListResponse) r1
            boolean r0 = r2.isOk()
            if (r0 == 0) goto L_0x006c
            if (r1 == 0) goto L_0x006c
            X.X9q r0 = r1.getXdtApiV1DevserversListAsApiTypeModel()
            X.3Ih r3 = new X.3Ih
            r3.<init>(r0)
            return r3
        L_0x006c:
            int r2 = r2.mStatusCode
        L_0x006e:
            com.instagram.debug.devoptions.sandboxselector.DevserverListError$HttpError r0 = new com.instagram.debug.devoptions.sandboxselector.DevserverListError$HttpError
            r0.<init>(r2, r3)
            goto L_0x0044
        L_0x0074:
            X.0eS.A00(r1)
            com.instagram.debug.devoptions.sandboxselector.DevserversListQueryImpl$Builder r0 = new com.instagram.debug.devoptions.sandboxselector.DevserversListQueryImpl$Builder
            r0.<init>()
            com.facebook.pando.PandoGraphQLRequest r1 = r0.build()
            X.1vn r0 = X.1vm.A01(r6)
            X.0qQ.A0A(r1)
            r4.label = r2
            java.lang.Object r1 = r0.A04(r1, r4)
            if (r1 != r3) goto L_0x0020
            return r3
        L_0x0090:
            com.instagram.debug.devoptions.sandboxselector.GraphQLDevServerApi$getDevServers$1 r4 = new com.instagram.debug.devoptions.sandboxselector.GraphQLDevServerApi$getDevServers$1
            r4.<init>(r5, r7)
            goto L_0x0012
        L_0x0097:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x009c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.sandboxselector.GraphQLDevServerApi.getDevServers(com.instagram.common.session.UserSession, X.4D7):java.lang.Object");
    }

    public Object getDevServersCategorizedAsFlow(UserSession userSession, AnonymousClass4D7 r6) {
        PandoGraphQLRequest build = new DevserversCategoryInfoQueryImpl.Builder().build();
        1vn A01 = 1vm.A01(userSession);
        0qQ.A0A(build);
        return C349197zk.A00(new GraphQLDevServerApi$getDevServersCategorizedAsFlow$3((AnonymousClass4D7) null), new C343637qX(new GraphQLDevServerApi$getDevServersCategorizedAsFlow$2((AnonymousClass4D7) null), A01.A05(build)));
    }
}
