package com.instagram.realtimeclient.regionhint.graphql;

import X.2IS;
import X.C41845B3m;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.realtimeclient.regionhint.graphql.IGRealtimeRegionHintQuery;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IGRealtimeRegionHintQueryImpl {
    public static final Companion Companion = new Object();
    public static final String QUERY_NAME = "IGRealtimeRegionHintQuery";

    public final class Companion {
        public final Builder create() {
            return new Builder();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public final class Builder implements IGRealtimeRegionHintQuery.Builder {
        public final 2IS params = new 2IS();
        public final 2IS transientParams = new 2IS();

        public PandoGraphQLRequest build() {
            return new PandoGraphQLRequest(C41845B3m.A05(), IGRealtimeRegionHintQueryImpl.QUERY_NAME, this.params.getParamsCopy(), this.transientParams.getParamsCopy(), IGRealtimeRegionHintQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_igd_msg_region", new ArrayList());
        }
    }

    public static final Builder create() {
        return new Builder();
    }
}
