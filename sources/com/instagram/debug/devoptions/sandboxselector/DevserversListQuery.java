package com.instagram.debug.devoptions.sandboxselector;

import X.AnonymousClass39G;
import com.instagram.debug.devoptions.sandboxselector.DevserversListQueryImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DevserversListQuery {
    public static final Companion Companion = new Object();

    public interface Builder extends AnonymousClass39G {
    }

    public final class Companion {
        public final Builder create() {
            return new DevserversListQueryImpl.Builder();
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final Builder create() {
        return new DevserversListQueryImpl.Builder();
    }
}
