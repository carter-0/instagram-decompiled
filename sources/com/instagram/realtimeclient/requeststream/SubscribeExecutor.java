package com.instagram.realtimeclient.requeststream;

import X.002;
import X.0Aj;
import X.0Sd;
import X.1Ef;
import X.1Ng;
import X.1xh;
import X.AnonymousClass000;
import X.AnonymousClass0kN;
import X.AnonymousClass0lh;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C51969G9p;
import X.C58840Ae;
import X.C635813i;
import X.C66579MXk;
import X.DbV;
import X.Y8P;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.facebook.realtime.requeststream.streameventhandler.StreamEventHandler;
import com.instagram.common.session.UserSession;
import com.instagram.realtime.requeststream.dgw.DGWRequestStreamClientHolder;
import com.instagram.realtimeclient.clientconfig.RealtimeClientConfig;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import org.webrtc.CameraCapturer;

public abstract class SubscribeExecutor implements AnonymousClass0lh {
    public static final String TAG = "com.instagram.realtimeclient.requeststream.SubscribeExecutor";
    public final C58840Ae mEventLogger;
    public final 1Ng mIgEventBus;
    public final RealtimeClientConfig mRealtimeClientConfig;
    public final 1xh mRequestStreamClient;
    public final Map mSubscribedTopics = AnonymousClass7TE.A1E();
    public final C635813i mUUIDSupplier;
    public final long mUserID;

    public class ClientSubEventType {
        public static final String PAYLOAD_RECEIVED = "receivepayload";
        public static final String SUBSCRIBE = "client_subscribe";
        public static final String UNSUBSCRIBE = "client_unsubscribe";
    }

    public abstract JSONObject buildHeaderJson(GraphQLSubscriptionRequestStub graphQLSubscriptionRequestStub, String str);

    public abstract JSONObject buildPayload(GraphQLSubscriptionRequestStub graphQLSubscriptionRequestStub, String str);

    public synchronized void onSessionWillEnd() {
        for (SubscriptionHandler subscriptionHandler : this.mSubscribedTopics.values()) {
            subscriptionHandler.mStream.cancel();
        }
        this.mSubscribedTopics.clear();
    }

    public synchronized void unsubscribe(SubscriptionHandler subscriptionHandler) {
        GraphQLSubscriptionRequestStub graphQLSubscriptionRequestStub = subscriptionHandler.mRequest;
        logEvent("client_unsubscribe", graphQLSubscriptionRequestStub, subscriptionHandler.mSubscriptionID);
        SubscriptionHandler subscriptionHandler2 = (SubscriptionHandler) this.mSubscribedTopics.remove(buildStreamKeyFromRequest(graphQLSubscriptionRequestStub));
        if (subscriptionHandler2 != null) {
            subscriptionHandler2.mStream.cancel();
        }
    }

    public static String buildStreamKeyFromRequest(GraphQLSubscriptionRequestStub graphQLSubscriptionRequestStub) {
        IGGraphQLSubscriptionRequestStringStub iGGraphQLSubscriptionRequestStringStub = graphQLSubscriptionRequestStub.mTypedGraphQLQueryString;
        String A0g = 002.A0g(iGGraphQLSubscriptionRequestStringStub.getQueryName(), "-", iGGraphQLSubscriptionRequestStringStub.mQueryId);
        String str = iGGraphQLSubscriptionRequestStringStub.mParamsKey;
        if (str != null) {
            return 002.A0g(A0g, "-", str);
        }
        return A0g;
    }

    public static boolean coinFlip(int i) {
        Random random = new Random();
        if (i <= 0) {
            i = CameraCapturer.OPEN_CAMERA_TIMEOUT;
        }
        return AnonymousClass7TF.A1Q(random.nextInt(i));
    }

    /* access modifiers changed from: private */
    public void logEvent(String str, GraphQLSubscriptionRequestStub graphQLSubscriptionRequestStub, String str2) {
        long j;
        IGGraphQLSubscriptionRequestStringStub iGGraphQLSubscriptionRequestStringStub = graphQLSubscriptionRequestStub.mTypedGraphQLQueryString;
        RealtimeClientConfig realtimeClientConfig = this.mRealtimeClientConfig;
        if (realtimeClientConfig != null) {
            j = realtimeClientConfig.getGQLSSamplingWeight();
        } else {
            j = 10000;
        }
        if (coinFlip((int) j)) {
            0Aj A0d = C51969G9p.A0d(this.mEventLogger, AnonymousClass000.A00(3298));
            A0d.AAJ(AnonymousClass000.A00(3072), str);
            A0d.A9F("ig_user_id", Long.valueOf(this.mUserID));
            A0d.AAJ(C66579MXk.A00(33), AnonymousClass000.A00(2102));
            A0d.A9F(AnonymousClass000.A00(3902), Long.valueOf(j));
            A0d.A9F(AnonymousClass000.A00(1732), DbV.A0q(iGGraphQLSubscriptionRequestStringStub.mQueryId));
            A0d.AAJ("query_param_string", buildPayload(graphQLSubscriptionRequestStub, str2).toString());
            A0d.AAJ("subscription_name", iGGraphQLSubscriptionRequestStringStub.getQueryName());
            A0d.AAJ(TraceFieldType.TransportType, "XPLAT_RS_STARGATE");
            A0d.Cgf();
        }
    }

    public SubscriptionHandler subscribe(1Ef r17, Executor executor, DataCallBack dataCallBack, Y8P y8p, int i) {
        SubscriptionHandler subscriptionHandler;
        1Ef r3 = r17;
        final GraphQLSubscriptionRequestStub graphQLSubscriptionRequestStub = (GraphQLSubscriptionRequestStub) r3;
        String buildStreamKeyFromRequest = buildStreamKeyFromRequest(graphQLSubscriptionRequestStub);
        synchronized (this.mSubscribedTopics) {
            subscriptionHandler = (SubscriptionHandler) this.mSubscribedTopics.get(buildStreamKeyFromRequest);
        }
        if (subscriptionHandler == null) {
            this.mIgEventBus.A00(new FleetBeaconEvent(graphQLSubscriptionRequestStub));
            Object obj = this.mUUIDSupplier.get();
            0Sd.A00(obj);
            final String obj2 = obj.toString();
            final DataCallBack dataCallBack2 = dataCallBack;
            final Y8P y8p2 = y8p;
            subscriptionHandler = new SubscriptionHandler(r3, obj2, this.mRequestStreamClient.createStream(buildHeaderJson(graphQLSubscriptionRequestStub, obj2).toString(), buildPayload(graphQLSubscriptionRequestStub, obj2).toString().getBytes(StandardCharsets.UTF_8), (String) null, new StreamEventHandler() {
                public void onData(byte[] bArr) {
                    String str = new String(bArr, Charset.forName(ReactWebViewManager.HTML_ENCODING));
                    SubscribeExecutor.this.logEvent("receivepayload", graphQLSubscriptionRequestStub, obj2);
                    dataCallBack2.onData(str);
                }

                public void onFlowStatus(int i) {
                }

                public void onLog(String str) {
                }

                public void onTermination(int i, String str, boolean z) {
                }
            }, executor, i), this);
            synchronized (this.mSubscribedTopics) {
                this.mSubscribedTopics.put(buildStreamKeyFromRequest, subscriptionHandler);
            }
        }
        logEvent("client_subscribe", graphQLSubscriptionRequestStub, subscriptionHandler.mSubscriptionID);
        return subscriptionHandler;
    }

    public SubscribeExecutor(UserSession userSession, 1Ng r4) {
        long j;
        this.mRequestStreamClient = DGWRequestStreamClientHolder.getInstance(userSession).mClient;
        this.mEventLogger = AnonymousClass0kN.A02(userSession);
        this.mRealtimeClientConfig = new RealtimeClientConfig(userSession);
        this.mIgEventBus = r4;
        this.mUUIDSupplier = new C635813i() {
            public UUID get() {
                return UUID.randomUUID();
            }
        };
        try {
            j = Long.parseLong(userSession.A06);
        } catch (NumberFormatException unused) {
            j = 0;
        }
        this.mUserID = j;
    }

    public SubscribeExecutor(1xh r2, C58840Ae r3, 1Ng r4, C635813i r5, long j) {
        this.mRequestStreamClient = r2;
        this.mEventLogger = r3;
        this.mIgEventBus = r4;
        this.mUUIDSupplier = r5;
        this.mUserID = j;
        this.mRealtimeClientConfig = null;
    }
}
