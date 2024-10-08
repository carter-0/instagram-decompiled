package com.facebook.graphql.query;

import X.16F;
import X.16L;
import X.2IV;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.C249933kc;
import X.C269674fV;
import X.C8152Qhl;
import X.C8153Qhm;
import X.RV1;
import X.S8P;
import X.SS5;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.util.Map;

public class GraphQlQueryParamSetDeserializer extends JsonDeserializer {
    public final Object A0D(16F r5, C269674fV r6) {
        IllegalStateException illegalStateException;
        GraphQlQueryParamSet graphQlQueryParamSet = null;
        while (RV1.A00(r5) != 16L.A09) {
            try {
                if (r5.A11() == 16L.A0A) {
                    String A17 = AnonymousClass7TE.A17(r5);
                    if (A17.equals("params")) {
                        C8152Qhl qhl = new C8152Qhl(this);
                        C249933kc A1K = r5.A1K();
                        if (A1K != null) {
                            graphQlQueryParamSet = new GraphQlQueryParamSet();
                            2IV r1 = graphQlQueryParamSet.A00;
                            r1.A04(r1.A02(), (Map) A1K.A05(r5, qhl));
                        } else {
                            illegalStateException = AnonymousClass7TE.A0z("No ObjectCodec defined for parser, needed for deserialization");
                            throw illegalStateException;
                        }
                    } else if (A17.equals("input_name")) {
                        C8153Qhm qhm = new C8153Qhm(this);
                        C249933kc A1K2 = r5.A1K();
                        if (A1K2 != null) {
                            A1K2.A05(r5, qhm);
                        } else {
                            illegalStateException = AnonymousClass7TE.A0z("No ObjectCodec defined for parser, needed for deserialization");
                            throw illegalStateException;
                        }
                    }
                    r5.A0z();
                }
            } catch (Exception e) {
                SS5.A03(e);
                S8P.A00(r5, GraphQlQueryParamSet.class, e);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        return graphQlQueryParamSet;
    }

    public final boolean A0M() {
        return true;
    }
}
