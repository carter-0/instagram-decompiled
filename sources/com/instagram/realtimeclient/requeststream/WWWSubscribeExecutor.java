package com.instagram.realtimeclient.requeststream;

import X.002;
import X.0KC;
import X.1Ng;
import X.1xh;
import X.AnonymousClass000;
import X.AnonymousClass1Nd;
import X.AnonymousClass7TF;
import X.C58840Ae;
import X.C635813i;
import X.C66584MXp;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class WWWSubscribeExecutor extends SubscribeExecutor {
    public static WWWSubscribeExecutor getInstance(UserSession userSession) {
        return (WWWSubscribeExecutor) userSession.A01(WWWSubscribeExecutor.class, new WWWSubscribeExecutor$$ExternalSyntheticLambda0(userSession));
    }

    public JSONObject buildHeaderJson(GraphQLSubscriptionRequestStub graphQLSubscriptionRequestStub, String str) {
        String str2;
        IGGraphQLSubscriptionRequestStringStub iGGraphQLSubscriptionRequestStringStub = graphQLSubscriptionRequestStub.mTypedGraphQLQueryString;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("doc_id", iGGraphQLSubscriptionRequestStringStub.mQueryId);
            jSONObject.put("client_subscription_id", str);
            jSONObject.put("method", 002.A0R("FBGQLS:", iGGraphQLSubscriptionRequestStringStub.getQueryName().toUpperCase(Locale.ENGLISH)));
            return jSONObject;
        } catch (JSONException e) {
            String str3 = SubscribeExecutor.TAG;
            if (e.getMessage() != null) {
                str2 = e.getMessage();
            } else {
                str2 = "unknown";
            }
            0KC.A0F(str3, str2, e);
            return jSONObject;
        }
    }

    public JSONObject buildPayload(GraphQLSubscriptionRequestStub graphQLSubscriptionRequestStub, String str) {
        String str2;
        IGGraphQLSubscriptionRequestStringStub iGGraphQLSubscriptionRequestStringStub = graphQLSubscriptionRequestStub.mTypedGraphQLQueryString;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            Iterator A0u = AnonymousClass7TF.A0u(new HashMap(graphQLSubscriptionRequestStub.mSimpleGraphqlQueryParameters.mParameters));
            while (A0u.hasNext()) {
                C66584MXp.A18(A0u, jSONObject2);
            }
            jSONObject2.put("client_subscription_id", str);
            ImmutableMap copyOf = ImmutableMap.copyOf(iGGraphQLSubscriptionRequestStringStub.mOptionParameters);
            JSONObject jSONObject3 = new JSONObject();
            Iterator A0u2 = AnonymousClass7TF.A0u(copyOf);
            while (A0u2.hasNext()) {
                C66584MXp.A18(A0u2, jSONObject3);
            }
            jSONObject.put("data", jSONObject2);
            jSONObject.put(AnonymousClass000.A00(1990), jSONObject3);
            return jSONObject;
        } catch (JSONException e) {
            String str3 = SubscribeExecutor.TAG;
            if (e.getMessage() != null) {
                str2 = e.getMessage();
            } else {
                str2 = "unknown";
            }
            0KC.A0F(str3, str2, e);
            return jSONObject;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.realtimeclient.requeststream.WWWSubscribeExecutor, com.instagram.realtimeclient.requeststream.SubscribeExecutor] */
    public static /* synthetic */ WWWSubscribeExecutor lambda$getInstance$0(UserSession userSession) {
        return new SubscribeExecutor(userSession, AnonymousClass1Nd.A00(userSession));
    }

    public WWWSubscribeExecutor(UserSession userSession, 1Ng r2) {
        super(userSession, r2);
    }

    public WWWSubscribeExecutor(1xh r1, C58840Ae r2, 1Ng r3, C635813i r4, long j) {
        super(r1, r2, r3, r4, j);
    }
}
