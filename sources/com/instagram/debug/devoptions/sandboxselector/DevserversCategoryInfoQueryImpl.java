package com.instagram.debug.devoptions.sandboxselector;

import X.2IS;
import X.AnonymousClass7TE;
import X.C41845B3m;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.debug.devoptions.sandboxselector.DevserversCategoryInfoQuery;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DevserversCategoryInfoQueryImpl {
    public static final Companion Companion = new Object();
    public static final String QUERY_NAME = "DevserversCategoryInfo";

    public final class Companion {
        public final Builder create() {
            return new Builder();
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final class Builder implements DevserversCategoryInfoQuery.Builder {
        public final 2IS params = C41845B3m.A04();
        public final 2IS transientParams = C41845B3m.A04();

        public PandoGraphQLRequest build() {
            return new PandoGraphQLRequest(C41845B3m.A05(), DevserversCategoryInfoQueryImpl.QUERY_NAME, this.params.getParamsCopy(), this.transientParams.getParamsCopy(), DevserversCategoryInfoResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_api__v1__devservers__list_categorized", AnonymousClass7TE.A1C());
        }
    }

    public static final Builder create() {
        return new Builder();
    }
}
