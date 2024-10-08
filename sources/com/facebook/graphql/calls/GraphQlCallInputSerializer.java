package com.facebook.graphql.calls;

import X.17Z;
import X.C269504fE;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.TreeMap;

public class GraphQlCallInputSerializer extends JsonSerializer {
    public final /* bridge */ /* synthetic */ void A0A(17Z r3, C269504fE r4, Object obj) {
        GraphQlCallInput graphQlCallInput = (GraphQlCallInput) obj;
        if (graphQlCallInput == null) {
            r3.A0a();
        }
        TreeMap treeMap = new TreeMap();
        GraphQlCallInput.A01(graphQlCallInput.A00, graphQlCallInput, treeMap);
        r3.A0J(treeMap);
    }
}
