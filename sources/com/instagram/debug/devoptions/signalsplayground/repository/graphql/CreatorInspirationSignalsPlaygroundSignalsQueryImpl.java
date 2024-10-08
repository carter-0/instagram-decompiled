package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.2IS;
import X.AnonymousClass000;
import X.C41845B3m;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalsQuery;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CreatorInspirationSignalsPlaygroundSignalsQueryImpl {
    public static final Companion Companion = new Object();
    public static final String QUERY_NAME = "CreatorInspirationSignalsPlaygroundSignalsQuery";

    public final class Companion {
        public final Builder create() {
            return new Builder();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public final class Builder implements CreatorInspirationSignalsPlaygroundSignalsQuery.Builder {
        public final 2IS params = new 2IS();
        public final 2IS transientParams = new 2IS();

        public PandoGraphQLRequest build() {
            return new PandoGraphQLRequest(C41845B3m.A05(), CreatorInspirationSignalsPlaygroundSignalsQueryImpl.QUERY_NAME, this.params.getParamsCopy(), this.transientParams.getParamsCopy(), CreatorInspirationSignalsPlaygroundSignalsQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, AnonymousClass000.A00(1941), new ArrayList());
        }
    }

    public static final Builder create() {
        return new Builder();
    }
}
