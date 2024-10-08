package org.webrtc;

import X.AnonymousClass7TE;

public class MediaSource {
    public long nativeSource;

    public static native State nativeGetState(long j);

    public enum State {
        INITIALIZING,
        LIVE,
        ENDED,
        MUTED;

        public static State fromNativeIndex(int i) {
            return values()[i];
        }
    }

    private void checkMediaSourceExists() {
        if (this.nativeSource == 0) {
            throw AnonymousClass7TE.A0z("MediaSource has been disposed.");
        }
    }

    public MediaSource(long j) {
        this.nativeSource = j;
    }

    public void dispose() {
        checkMediaSourceExists();
        JniCommon.nativeReleaseRef(this.nativeSource);
        this.nativeSource = 0;
    }

    public long getNativeMediaSource() {
        checkMediaSourceExists();
        return this.nativeSource;
    }

    public State state() {
        checkMediaSourceExists();
        return nativeGetState(this.nativeSource);
    }
}
