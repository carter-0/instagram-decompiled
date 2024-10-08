package com.facebook.tigon.tigonobserver;

import com.facebook.tigon.iface.TigonRequest;

public interface TigonRequestAdded {
    long creationTime();

    long requestId();

    TigonRequest submittedRequest();
}
