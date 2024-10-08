package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.AnonymousClass39G;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalDetailsQueryImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CreatorInspirationSignalsPlaygroundSignalDetailsQuery {
    public static final Companion Companion = new Object();

    public interface Builder extends AnonymousClass39G, BuilderForIdentifier {
        Builder setIdentifier(String str);
    }

    public interface BuilderForIdentifier {
        Builder setIdentifier(String str);
    }

    public final class Companion {
        public final BuilderForIdentifier create() {
            return new CreatorInspirationSignalsPlaygroundSignalDetailsQueryImpl.Builder();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public static final BuilderForIdentifier create() {
        return new CreatorInspirationSignalsPlaygroundSignalDetailsQueryImpl.Builder();
    }
}
