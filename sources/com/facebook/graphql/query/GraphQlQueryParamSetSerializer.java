package com.facebook.graphql.query;

import X.17Z;
import X.C269504fE;
import com.fasterxml.jackson.databind.JsonSerializer;

public class GraphQlQueryParamSetSerializer extends JsonSerializer {
    public final /* bridge */ /* synthetic */ void A0A(17Z r2, C269504fE r3, Object obj) {
        GraphQlQueryParamSet graphQlQueryParamSet = (GraphQlQueryParamSet) obj;
        if (graphQlQueryParamSet == null) {
            r2.A0a();
        }
        r2.A0c();
        r2.A0q("params");
        r2.A0J(graphQlQueryParamSet.getParamsCopy());
        r2.A0q("input_name");
        r2.A0t((String) null);
        r2.A0Z();
    }
}
