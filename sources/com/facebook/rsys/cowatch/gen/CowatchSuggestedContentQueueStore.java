package com.facebook.rsys.cowatch.gen;

import X.AnonymousClass00P;
import java.util.Map;

public abstract class CowatchSuggestedContentQueueStore {
    public abstract void fetchSuggestedContentQueue(String str, String str2, String str3, String str4, String str5, String str6, Map map, CowatchFetchSuggestedContentQueueSuccessCallback cowatchFetchSuggestedContentQueueSuccessCallback, CowatchFetchSuggestedContentQueueFailureCallback cowatchFetchSuggestedContentQueueFailureCallback);

    public abstract void fetchSuggestedReelsQueueDEPRECATED(String str, String str2, CowatchFetchSuggestedContentQueueSuccessCallback cowatchFetchSuggestedContentQueueSuccessCallback, CowatchFetchSuggestedContentQueueFailureCallback cowatchFetchSuggestedContentQueueFailureCallback);

    public CowatchSuggestedContentQueueStore() {
        throw AnonymousClass00P.createAndThrow();
    }
}
