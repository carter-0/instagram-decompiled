package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.AnonymousClass39G;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundRecommendationsQueryImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CreatorInspirationSignalsPlaygroundRecommendationsQuery {
    public static final Companion Companion = new Object();

    public interface Builder extends AnonymousClass39G, BuilderForUserId, BuilderForIdentifier {
        Builder setIdentifier(String str);

        Builder setUserId(String str);
    }

    public interface BuilderForIdentifier {
        BuilderForUserId setIdentifier(String str);
    }

    public interface BuilderForUserId {
        Builder setUserId(String str);
    }

    public final class Companion {
        public final BuilderForIdentifier create() {
            return new CreatorInspirationSignalsPlaygroundRecommendationsQueryImpl.Builder();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public static final BuilderForIdentifier create() {
        return new CreatorInspirationSignalsPlaygroundRecommendationsQueryImpl.Builder();
    }
}
