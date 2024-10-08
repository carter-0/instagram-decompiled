package com.facebook.graphql.error;

import X.17Z;
import X.C269504fE;
import X.C291405h7;
import X.C291415hE;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableMap;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public class GraphQLErrorSerializer extends JsonSerializer {
    static {
        Object obj = new Object();
        C291405h7.A08.putIfAbsent(GraphQLError.class, obj);
    }

    public final /* bridge */ /* synthetic */ void A0A(17Z r4, C269504fE r5, Object obj) {
        GraphQLError graphQLError = (GraphQLError) obj;
        if (graphQLError == null) {
            r4.A0a();
        }
        r4.A0c();
        int i = graphQLError.code;
        r4.A0q(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
        r4.A0g(i);
        int i2 = graphQLError.apiErrorCode;
        r4.A0q("api_error_code");
        r4.A0g(i2);
        C291415hE.A04(r4, "summary", graphQLError.summary);
        C291415hE.A04(r4, DevServerEntity.COLUMN_DESCRIPTION, graphQLError.description);
        boolean z = graphQLError.isSilent;
        r4.A0q("is_silent");
        r4.A0x(z);
        boolean z2 = graphQLError.isTransient;
        r4.A0q("is_transient");
        r4.A0x(z2);
        C291415hE.A04(r4, "fb_request_id", graphQLError.fbRequestId);
        boolean z3 = graphQLError.requiresReauth;
        r4.A0q("requires_reauth");
        r4.A0x(z3);
        C291415hE.A04(r4, "debug_info", graphQLError.debugInfo);
        C291415hE.A04(r4, "query_path", graphQLError.queryPath);
        ImmutableMap<String, String> immutableMap = graphQLError.sentryBlockUserInfo;
        if (immutableMap != null) {
            r4.A0q("sentry_block_user_info");
            C291415hE.A00(r4, r5, immutableMap);
        }
        C291415hE.A04(r4, "severity", graphQLError.severity);
        long j = graphQLError.helpCenterId;
        r4.A0q("help_center_id");
        r4.A0h(j);
        r4.A0Z();
    }
}
