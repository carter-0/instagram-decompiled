package com.instagram.debug.devoptions.signalsplayground.repository;

import X.0qQ;
import X.1Ef;
import X.1vm;
import X.1vn;
import X.AnonymousClass4D7;
import X.AnonymousClass7TG;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundRecommendationsQueryImpl;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalDetailsQueryImpl;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalsQueryImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CreatorInspirationSignalsPlaygroundDataSource {
    public final 1vn executor;
    public final UserSession userSession;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CreatorInspirationSignalsPlaygroundDataSource(UserSession userSession2, 1vn r3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userSession2, (i & 2) != 0 ? 1vm.A01(userSession2) : r3);
    }

    public final Object getSignalDetails(String str, AnonymousClass4D7 r4) {
        1Ef build = new CreatorInspirationSignalsPlaygroundSignalDetailsQueryImpl.Builder().setIdentifier(str).build();
        1vn r0 = this.executor;
        0qQ.A0A(build);
        return r0.A04(build, r4);
    }

    public final Object getSignalRecommendations(String str, String str2, AnonymousClass4D7 r5) {
        1Ef build = new CreatorInspirationSignalsPlaygroundRecommendationsQueryImpl.Builder().setIdentifier(str).setUserId(str2).build();
        1vn r0 = this.executor;
        0qQ.A0A(build);
        return r0.A04(build, r5);
    }

    public final Object getSignals(AnonymousClass4D7 r3) {
        PandoGraphQLRequest build = new CreatorInspirationSignalsPlaygroundSignalsQueryImpl.Builder().build();
        1vn r0 = this.executor;
        0qQ.A0A(build);
        return r0.A04(build, r3);
    }

    public CreatorInspirationSignalsPlaygroundDataSource(UserSession userSession2, 1vn r2) {
        AnonymousClass7TG.A1O(userSession2, r2);
        this.userSession = userSession2;
        this.executor = r2;
    }
}
