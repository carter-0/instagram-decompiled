package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.0qQ;
import X.2IS;
import X.AnonymousClass000;
import X.C41845B3m;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalDetailsQuery;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CreatorInspirationSignalsPlaygroundSignalDetailsQueryImpl {
    public static final Companion Companion = new Object();
    public static final String QUERY_NAME = "CreatorInspirationSignalsPlaygroundSignalDetailsQuery";

    public final class Builder implements CreatorInspirationSignalsPlaygroundSignalDetailsQuery.Builder {
        public boolean isIdentifierSet;
        public final 2IS params = new 2IS();
        public final 2IS transientParams = new 2IS();

        public Builder setIdentifier(String str) {
            0qQ.A0B(str, 0);
            this.params.A04("identifier", str);
            this.isIdentifierSet = true;
            return this;
        }

        public PandoGraphQLRequest build() {
            return new PandoGraphQLRequest(C41845B3m.A06(this.isIdentifierSet), CreatorInspirationSignalsPlaygroundSignalDetailsQueryImpl.QUERY_NAME, this.params.getParamsCopy(), this.transientParams.getParamsCopy(), CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, AnonymousClass000.A00(1941), new ArrayList());
        }
    }

    public final class Companion {
        public final CreatorInspirationSignalsPlaygroundSignalDetailsQuery.BuilderForIdentifier create() {
            return new Builder();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public static final CreatorInspirationSignalsPlaygroundSignalDetailsQuery.BuilderForIdentifier create() {
        return new Builder();
    }
}
