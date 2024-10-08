package X;

import com.facebook.distribgw.client.DGWClient;
import com.facebook.graphql.rtgql.sdk.RealtimeGraphQLSDKProvider;
import com.facebook.graphql.rtgql.sdk.connection.RealtimeGraphQLDgwStreamGroupProvider;
import com.facebook.pando.ConnectionManager;
import com.facebook.pando.PandoConnectionService;
import com.facebook.pando.PandoPrimaryExecution;
import com.facebook.pando.primaryexecution.analytics.PandoAnalyticsService;
import com.facebook.pando.primaryexecution.cache.PandoCacheService;
import com.facebook.pando.primaryexecution.cache.PandoCacheTimeoutService;
import com.facebook.pando.primaryexecution.cache.PandoResponseCache;
import com.facebook.pando.primaryexecution.cancelledcallbacks.PandoCancelledCallbacksService;
import com.facebook.pando.primaryexecution.livequery.PandoLiveQueryService;
import com.facebook.pando.primaryexecution.networksequencing.PandoNetworkSequencingService;
import com.facebook.realtime.config.RealtimeConfigSourceProxy;
import com.facebook.realtime.requeststream.api.BaseRequestStreamClient;
import com.instagram.common.session.UserSession;
import com.instagram.distribgw.client.DGWClientHolder;
import com.instagram.graphql.rtgql.graphqllivequeries.sdk.IGGraphQLLiveQuerySDKProvider;
import com.instagram.realtime.requeststream.dgw.DGWRequestStreamClientHolder;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.9N2  reason: invalid class name */
public final class AnonymousClass9N2 extends 0Yg implements C62320sa {
    public final Object A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9N2(UserSession userSession, String str, AnonymousClass0eM r4, AnonymousClass0eM r5, AnonymousClass0eM r6, boolean z, boolean z2, boolean z3) {
        super(0);
        this.A04 = str;
        this.A02 = userSession;
        this.A00 = r4;
        this.A07 = z;
        this.A06 = z2;
        this.A03 = r5;
        this.A01 = r6;
        this.A05 = z3;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.3qc, X.3qb, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str = this.A04;
        UserSession userSession = (UserSession) this.A02;
        PandoPrimaryExecution pandoPrimaryExecution = new PandoPrimaryExecution(PandoNetworkSequencingService.initHybridData(1vr.A00(userSession, str, true)));
        AnonymousClass3qZ r0 = RealtimeGraphQLSDKProvider.Companion;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C61560nl.A00().A00;
        0qQ.A07(scheduledThreadPoolExecutor);
        RealtimeGraphQLSDKProvider realtimeGraphQLSDKProvider = new RealtimeGraphQLSDKProvider(scheduledThreadPoolExecutor, ((C67451ta) C67451ta.A02.getValue()).A01);
        BaseRequestStreamClient baseRequestStreamClient = DGWRequestStreamClientHolder.getInstance(userSession).mClient;
        0qQ.A07(baseRequestStreamClient);
        0Tu r7 = 0Tu.A05;
        String A042 = 182.A04(r7, userSession, 36889620134232917L);
        ? obj = new Object();
        obj.A00 = 0sl.A00;
        obj.A00 = 00k.A0k(00l.A0R(A042, new String[]{";"}, 0));
        RealtimeGraphQLDgwStreamGroupProvider realtimeGraphQLDgwStreamGroupProvider = RealtimeGraphQLDgwStreamGroupProvider.$redex_init_class;
        DGWClient dGWClient = DGWClientHolder.Companion.A00(userSession).client;
        String str2 = AnonymousClass1CT.A00(userSession).A04;
        if (str2 == null) {
            str2 = "";
        }
        IGGraphQLLiveQuerySDKProvider iGGraphQLLiveQuerySDKProvider = new IGGraphQLLiveQuerySDKProvider(realtimeGraphQLSDKProvider, baseRequestStreamClient, obj, new RealtimeGraphQLDgwStreamGroupProvider(dGWClient, 6, str2, userSession.A06, 182.A04(r7, userSession, 36889620134298454L), 182.A04(r7, userSession, 36889620134363991L), C61560nl.A00().A00));
        C253383qh r02 = PandoLiveQueryService.Companion;
        PandoPrimaryExecution pandoPrimaryExecution2 = new PandoPrimaryExecution(PandoLiveQueryService.initHybridData(pandoPrimaryExecution, iGGraphQLLiveQuerySDKProvider, new RealtimeConfigSourceProxy((C253403qj) userSession.A01(C253403qj.class, new C73662Phb(userSession, 47)))));
        AnonymousClass0eM r3 = (AnonymousClass0eM) this.A00;
        boolean z = this.A07;
        boolean z2 = this.A06;
        C253423ql r03 = PandoCacheService.Companion;
        PandoResponseCache pandoResponseCache = (PandoResponseCache) r3.getValue();
        0qQ.A0B(pandoResponseCache, 2);
        PandoPrimaryExecution pandoPrimaryExecution3 = new PandoPrimaryExecution(PandoCacheService.initHybridData(pandoPrimaryExecution2, pandoResponseCache, z, z2));
        C253553qy r04 = PandoCacheTimeoutService.Companion;
        Object value = ((AnonymousClass0eM) this.A03).getValue();
        0qQ.A07(value);
        PandoCacheTimeoutService pandoCacheTimeoutService = new PandoCacheTimeoutService(pandoPrimaryExecution3, (PandoResponseCache) r3.getValue(), (ScheduledExecutorService) value);
        boolean z3 = this.A05;
        C253563qz r05 = PandoConnectionService.Companion;
        ConnectionManager connectionManager = (ConnectionManager) ((AnonymousClass0eM) this.A01).getValue();
        0qQ.A0B(connectionManager, 2);
        return new PandoPrimaryExecution(PandoAnalyticsService.initHybridData(new PandoPrimaryExecution(PandoCancelledCallbacksService.initHybridData(new PandoPrimaryExecution(PandoConnectionService.initHybridData(pandoCacheTimeoutService, connectionManager, true, z3)))), 3213622));
    }
}
