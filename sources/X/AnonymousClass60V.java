package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.60V  reason: invalid class name */
public final /* synthetic */ class AnonymousClass60V implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
    }
}
