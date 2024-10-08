package org.webrtc;

import X.AnonymousClass7TE;
import X.DbW;

public class MediaStreamTrack {
    public static final String AUDIO_TRACK_KIND = "audio";
    public static final String VIDEO_TRACK_KIND = "video";
    public long nativeTrack;

    public static MediaStreamTrack createMediaStreamTrack(long j) {
        if (j == 0) {
            return null;
        }
        String nativeGetKind = nativeGetKind(j);
        if (nativeGetKind.equals(AUDIO_TRACK_KIND)) {
            return new MediaStreamTrack(j);
        }
        if (nativeGetKind.equals(VIDEO_TRACK_KIND)) {
            return new VideoTrack(j);
        }
        return null;
    }

    public static native boolean nativeGetEnabled(long j);

    public static native String nativeGetId(long j);

    public static native String nativeGetKind(long j);

    public static native State nativeGetState(long j);

    public static native boolean nativeSetEnabled(long j, boolean z);

    public enum MediaType {
        MEDIA_TYPE_AUDIO(0),
        MEDIA_TYPE_VIDEO(1);
        
        public final int nativeIndex;

        /* access modifiers changed from: public */
        MediaType(int i) {
            this.nativeIndex = i;
        }

        public static MediaType fromNativeIndex(int i) {
            for (MediaType mediaType : values()) {
                if (mediaType.getNative() == i) {
                    return mediaType;
                }
            }
            throw DbW.A0a("Unknown native media type: ", i);
        }

        public int getNative() {
            return this.nativeIndex;
        }
    }

    public enum State {
        LIVE,
        ENDED;

        public static State fromNativeIndex(int i) {
            return values()[i];
        }
    }

    private void checkMediaStreamTrackExists() {
        if (this.nativeTrack == 0) {
            throw AnonymousClass7TE.A0z("MediaStreamTrack has been disposed.");
        }
    }

    public MediaStreamTrack(long j) {
        if (j != 0) {
            this.nativeTrack = j;
            return;
        }
        throw AnonymousClass7TE.A0w("nativeTrack may not be null");
    }

    public void dispose() {
        checkMediaStreamTrackExists();
        JniCommon.nativeReleaseRef(this.nativeTrack);
        this.nativeTrack = 0;
    }

    public boolean enabled() {
        checkMediaStreamTrackExists();
        return nativeGetEnabled(this.nativeTrack);
    }

    public long getNativeMediaStreamTrack() {
        checkMediaStreamTrackExists();
        return this.nativeTrack;
    }

    public String id() {
        checkMediaStreamTrackExists();
        return nativeGetId(this.nativeTrack);
    }

    public String kind() {
        checkMediaStreamTrackExists();
        return nativeGetKind(this.nativeTrack);
    }

    public boolean setEnabled(boolean z) {
        checkMediaStreamTrackExists();
        return nativeSetEnabled(this.nativeTrack, z);
    }

    public State state() {
        checkMediaStreamTrackExists();
        return nativeGetState(this.nativeTrack);
    }
}
