package com.instagram.debug.devoptions.section.xme.graphql;

import X.2IS;
import X.AnonymousClass000;
import X.AnonymousClass7TE;
import X.C41845B3m;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.debug.devoptions.section.xme.graphql.Sample3dPhotoQuery;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class Sample3dPhotoQueryImpl {
    public static final Companion Companion = new Object();
    public static final String QUERY_NAME = "Sample3dPhoto";

    public final class Companion {
        public final Builder create() {
            return new Builder();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public final class Builder implements Sample3dPhotoQuery.Builder {
        public final 2IS params = C41845B3m.A04();
        public final 2IS transientParams = C41845B3m.A04();

        public PandoGraphQLRequest build() {
            return new PandoGraphQLRequest(C41845B3m.A05(), Sample3dPhotoQueryImpl.QUERY_NAME, this.params.getParamsCopy(), this.transientParams.getParamsCopy(), Sample3dPhotoResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, AnonymousClass000.A00(1776), AnonymousClass7TE.A1C());
        }
    }

    public static final Builder create() {
        return new Builder();
    }
}
