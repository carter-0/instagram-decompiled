package com.facebook.rsys.mediasync.gen;

public abstract class MediaSyncProxy {
    public abstract InitialMediaSyncInfo getInitialMediaSyncInfo();

    public abstract void setApi(MediaSyncApi mediaSyncApi);
}
