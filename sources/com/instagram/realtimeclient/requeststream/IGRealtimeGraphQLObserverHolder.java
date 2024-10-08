package com.instagram.realtimeclient.requeststream;

import X.0KC;
import X.0bH;
import X.0mp;
import X.15p;
import X.16F;
import X.1Ef;
import X.2IR;
import X.C60960kU;
import X.C9153RRe;
import X.Y8P;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;

@Deprecated(since = "Use IgGraphQLQueryExecutor instead. Wiki: https://fburl.com/wiki/4l43dk3q")
public class IGRealtimeGraphQLObserverHolder {
    public static final String FAILED_TO_PARSE_RESPONSE_ERROR = "Failed to parse response";
    public final Executor mExecutor;
    public final 15p mJsonFactory;
    public final SubscribeExecutor mSubscribeExecutor;

    public final class ErrorHandlingFutureCallback implements 2IR {
        public final 2IR mInner;
        public final String mUseCase;

        public final void onFailure(Throwable th) {
            try {
                this.mInner.onFailure(th);
            } catch (Exception e) {
                0KC.A0K(0mp.A06("realtime_handler_exception_%s", new Object[]{this.mUseCase}), "Caught error in handler", e);
            }
        }

        public final void onSuccess(Object obj) {
            try {
                this.mInner.onSuccess(obj);
            } catch (Exception e) {
                0KC.A0K(0mp.A06("realtime_handler_exception_%s", new Object[]{this.mUseCase}), "Caught error in handler", e);
            }
        }

        public ErrorHandlingFutureCallback(2IR r1, String str) {
            this.mInner = r1;
            this.mUseCase = str;
        }
    }

    public SubscriptionHandler subscribe(1Ef r7, 2IR r8, Executor executor, Y8P y8p) {
        return subscribe(r7, r8, executor, y8p, 0);
    }

    public static IGRealtimeGraphQLObserverHolder getInstanceDistillery(UserSession userSession) {
        return (IGRealtimeGraphQLObserverHolder) userSession.A01(DistilleryIGRealtimeGraphQLObserverHolder.class, new IGRealtimeGraphQLObserverHolder$$ExternalSyntheticLambda0(userSession));
    }

    public static IGRealtimeGraphQLObserverHolder getInstanceWWW(UserSession userSession) {
        return (IGRealtimeGraphQLObserverHolder) userSession.A01(WWWIGRealtimeGraphQLObserverHolder.class, new IGRealtimeGraphQLObserverHolder$$ExternalSyntheticLambda1(userSession));
    }

    public IGRealtimeGraphQLObserverHolder(SubscribeExecutor subscribeExecutor, Executor executor, 15p r3) {
        this.mSubscribeExecutor = subscribeExecutor;
        this.mExecutor = executor;
        this.mJsonFactory = r3;
    }

    public static /* synthetic */ DistilleryIGRealtimeGraphQLObserverHolder lambda$getInstanceDistillery$1(UserSession userSession) {
        return new DistilleryIGRealtimeGraphQLObserverHolder(DistillerySubscribeExecutor.getInstance(userSession), C60960kU.A00.getMainExecutor(), new 0bH(userSession));
    }

    public static /* synthetic */ WWWIGRealtimeGraphQLObserverHolder lambda$getInstanceWWW$0(UserSession userSession) {
        return new WWWIGRealtimeGraphQLObserverHolder(WWWSubscribeExecutor.getInstance(userSession), C60960kU.A00.getMainExecutor(), new 0bH(userSession));
    }

    public static Object parseFromJson(String str, Class cls, 15p r3) {
        16F A03;
        try {
            A03 = r3.A03(str);
            A03.A1J();
            Object invoke = cls.getMethod("parseFromJson", new Class[]{16F.class}).invoke((Object) null, new Object[]{A03});
            A03.close();
            return invoke;
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            throw new IllegalArgumentException("Failed to parse json", e);
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
        }
        throw th;
    }

    public class DistilleryIGRealtimeGraphQLObserverHolder extends IGRealtimeGraphQLObserverHolder {
        public DistilleryIGRealtimeGraphQLObserverHolder(SubscribeExecutor subscribeExecutor, Executor executor, 15p r3) {
            super(subscribeExecutor, executor, r3);
        }
    }

    public class WWWIGRealtimeGraphQLObserverHolder extends IGRealtimeGraphQLObserverHolder {
        public WWWIGRealtimeGraphQLObserverHolder(SubscribeExecutor subscribeExecutor, Executor executor, 15p r3) {
            super(subscribeExecutor, executor, r3);
        }
    }

    public SubscriptionHandler subscribe(1Ef r2, 2IR r3, Y8P y8p) {
        return subscribe(r2, r3, this.mExecutor, y8p);
    }

    public SubscriptionHandler subscribe(1Ef r10, 2IR r11, Executor executor, Y8P y8p, int i) {
        1Ef r4 = r10;
        final GraphQLSubscriptionRequestStub graphQLSubscriptionRequestStub = (GraphQLSubscriptionRequestStub) r4;
        final ErrorHandlingFutureCallback errorHandlingFutureCallback = new ErrorHandlingFutureCallback(r11, graphQLSubscriptionRequestStub.mTypedGraphQLQueryString.getQueryName());
        return this.mSubscribeExecutor.subscribe(r4, executor, new DataCallBack() {
            public void onData(String str) {
                try {
                    errorHandlingFutureCallback.onSuccess(IGRealtimeGraphQLObserverHolder.parseFromJson(str, graphQLSubscriptionRequestStub.mJsonHelperClass, IGRealtimeGraphQLObserverHolder.this.mJsonFactory));
                } catch (IOException | IllegalArgumentException e) {
                    errorHandlingFutureCallback.onFailure(new IOException(IGRealtimeGraphQLObserverHolder.FAILED_TO_PARSE_RESPONSE_ERROR, e));
                }
            }
        }, y8p, i);
    }
}
