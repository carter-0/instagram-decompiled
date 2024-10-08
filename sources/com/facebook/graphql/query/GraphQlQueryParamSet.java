package com.facebook.graphql.query;

import X.2IV;
import X.AnonymousClass2IU;
import X.Pxe;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Map;
import java.util.TreeMap;

@JsonDeserialize(using = GraphQlQueryParamSetDeserializer.class)
@JsonSerialize(using = GraphQlQueryParamSetSerializer.class)
public final class GraphQlQueryParamSet implements AnonymousClass2IU {
    public 2IV A00 = Pxe.A0R();

    public final Map getParamsCopy() {
        2IV r2 = this.A00;
        TreeMap treeMap = new TreeMap();
        GraphQlCallInput.A01(r2.A00, r2, treeMap);
        return treeMap;
    }
}
