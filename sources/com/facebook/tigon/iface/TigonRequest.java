package com.facebook.tigon.iface;

import X.1Rw;
import X.1Rx;
import X.AnonymousClass1S0;
import java.util.Map;

public interface TigonRequest {
    public static final Companion Companion = Companion.A00;
    public static final String FETCH = "fetch";
    public static final String GET = "GET";
    public static final String HEAD = "HEAD";
    public static final String POST = "POST";
    public static final String PREFETCH = "prefetch";

    public final class Companion {
        public static final /* synthetic */ Companion A00 = new Object();
        public static final String FETCH = "fetch";
        public static final String GET = "GET";
        public static final String HEAD = "HEAD";
        public static final String POST = "POST";
        public static final String PREFETCH = "prefetch";
    }

    long addedToMiddlewareSinceEpochMS();

    TigonAuthHandler authHandler();

    long connectionTimeoutMS();

    long expectedResponseSizeBytes();

    Object getLayerInformation(AnonymousClass1S0 r1);

    Map headers();

    1Rx httpPriority();

    HttpPriorityContext httpPriorityContext();

    long idleTimeoutMS();

    String loggingId();

    String method();

    boolean replaySafe();

    1Rw requestCategory();

    long requestTimeoutMS();

    boolean retryable();

    int startupStatusOnAdded();

    int tigonPriority();

    String url();
}
