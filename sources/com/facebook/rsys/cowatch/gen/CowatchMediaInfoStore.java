package com.facebook.rsys.cowatch.gen;

import X.AnonymousClass00P;

public abstract class CowatchMediaInfoStore {
    public abstract void fetchMedia(String str, String str2, CowatchFetchMediaSuccessCallback cowatchFetchMediaSuccessCallback, CowatchFetchMediaFailureCallback cowatchFetchMediaFailureCallback);

    public abstract void updateMediaLikedState(String str, String str2, boolean z);

    public CowatchMediaInfoStore() {
        throw AnonymousClass00P.createAndThrow();
    }
}
