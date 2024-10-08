package com.instagram.realtimeclient.regionhint.graphql;

import X.AnonymousClass39G;
import com.instagram.realtimeclient.regionhint.graphql.IGRealtimeRegionHintQueryImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IGRealtimeRegionHintQuery {
    public static final Companion Companion = new Object();

    public interface Builder extends AnonymousClass39G {
    }

    public final class Companion {
        public final Builder create() {
            return new IGRealtimeRegionHintQueryImpl.Builder();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public static final Builder create() {
        return new IGRealtimeRegionHintQueryImpl.Builder();
    }
}
