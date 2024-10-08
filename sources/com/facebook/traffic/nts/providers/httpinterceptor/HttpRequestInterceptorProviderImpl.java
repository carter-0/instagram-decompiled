package com.facebook.traffic.nts.providers.httpinterceptor;

import X.0dV;
import X.0qQ;
import com.facebook.jni.HybridData;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class HttpRequestInterceptorProviderImpl implements HttpRequestInterceptorProviderAppLayer, HttpRequestInterceptorProviderXplat {
    public static final Companion Companion = new Object();
    public final HybridData mHybridData;

    public HttpRequestInterceptorProviderImpl(HybridData hybridData) {
        0qQ.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public static final native HybridData initHybrid0();

    public native void onRequestAppLayer(HttpRequestInterface httpRequestInterface);

    public final class Companion {
        private final HybridData initHybrid0() {
            return HttpRequestInterceptorProviderImpl.initHybrid0();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, com.facebook.traffic.nts.providers.httpinterceptor.HttpRequestInterceptorProviderImpl$Companion] */
    static {
        0dV.A0C("http_interceptor");
    }

    public void addInterceptor(HttpRequestInterceptor httpRequestInterceptor) {
        throw new RuntimeException("addInterceptor is to be used in xplat only.");
    }

    public void onRequestXplat(HttpRequestInterface httpRequestInterface) {
        throw new RuntimeException("onRequestXplat is to be used in xplat only.");
    }

    public HttpRequestInterceptorProviderImpl() {
        this(initHybrid0());
    }
}
