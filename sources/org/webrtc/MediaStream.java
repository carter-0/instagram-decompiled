package org.webrtc;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import java.util.Iterator;
import java.util.List;

public class MediaStream {
    public static final String TAG = "MediaStream";
    public final List audioTracks = AnonymousClass7TE.A1C();
    public long nativeStream;
    public final List preservedVideoTracks = AnonymousClass7TE.A1C();
    public final List videoTracks = AnonymousClass7TE.A1C();

    public static native boolean nativeAddAudioTrackToNativeStream(long j, long j2);

    public static native boolean nativeAddVideoTrackToNativeStream(long j, long j2);

    public static native String nativeGetId(long j);

    public static native boolean nativeRemoveAudioTrack(long j, long j2);

    public static native boolean nativeRemoveVideoTrack(long j, long j2);

    private void checkMediaStreamExists() {
        if (this.nativeStream == 0) {
            throw AnonymousClass7TE.A0z("MediaStream has been disposed.");
        }
    }

    public void addNativeAudioTrack(long j) {
        this.audioTracks.add(new MediaStreamTrack(j));
    }

    public void addNativeVideoTrack(long j) {
        this.videoTracks.add(new VideoTrack(j));
    }

    public void removeAudioTrack(long j) {
        removeMediaStreamTrack(this.audioTracks, j);
    }

    public void removeVideoTrack(long j) {
        removeMediaStreamTrack(this.videoTracks, j);
    }

    public MediaStream(long j) {
        this.nativeStream = j;
    }

    public static void removeMediaStreamTrack(List list, long j) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) it.next();
            if (mediaStreamTrack.getNativeMediaStreamTrack() == j) {
                mediaStreamTrack.dispose();
                it.remove();
                return;
            }
        }
        boolean z = Logging.loggingEnabled;
    }

    public boolean addPreservedTrack(VideoTrack videoTrack) {
        checkMediaStreamExists();
        if (!nativeAddVideoTrackToNativeStream(this.nativeStream, videoTrack.getNativeMediaStreamTrack())) {
            return false;
        }
        this.preservedVideoTracks.add(videoTrack);
        return true;
    }

    public boolean addTrack(AudioTrack audioTrack) {
        checkMediaStreamExists();
        if (!nativeAddAudioTrackToNativeStream(this.nativeStream, audioTrack.getNativeMediaStreamTrack())) {
            return false;
        }
        this.audioTracks.add(audioTrack);
        return true;
    }

    public void dispose() {
        checkMediaStreamExists();
        while (!this.audioTracks.isEmpty()) {
            AudioTrack audioTrack = (AudioTrack) this.audioTracks.get(0);
            removeTrack(audioTrack);
            audioTrack.dispose();
        }
        while (!this.videoTracks.isEmpty()) {
            VideoTrack videoTrack = (VideoTrack) this.videoTracks.get(0);
            removeTrack(videoTrack);
            videoTrack.dispose();
        }
        while (!this.preservedVideoTracks.isEmpty()) {
            removeTrack((VideoTrack) this.preservedVideoTracks.get(0));
        }
        JniCommon.nativeReleaseRef(this.nativeStream);
        this.nativeStream = 0;
    }

    public String getId() {
        checkMediaStreamExists();
        return nativeGetId(this.nativeStream);
    }

    public long getNativeMediaStream() {
        checkMediaStreamExists();
        return this.nativeStream;
    }

    public boolean removeTrack(VideoTrack videoTrack) {
        checkMediaStreamExists();
        this.videoTracks.remove(videoTrack);
        this.preservedVideoTracks.remove(videoTrack);
        return nativeRemoveVideoTrack(this.nativeStream, videoTrack.getNativeMediaStreamTrack());
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("[");
        A1A.append(getId());
        A1A.append(":A=");
        A1A.append(this.audioTracks.size());
        A1A.append(":V=");
        A1A.append(this.videoTracks.size());
        return AnonymousClass7TF.A0l("]", A1A);
    }

    public boolean addTrack(VideoTrack videoTrack) {
        checkMediaStreamExists();
        if (!nativeAddVideoTrackToNativeStream(this.nativeStream, videoTrack.getNativeMediaStreamTrack())) {
            return false;
        }
        this.videoTracks.add(videoTrack);
        return true;
    }

    public boolean removeTrack(AudioTrack audioTrack) {
        checkMediaStreamExists();
        this.audioTracks.remove(audioTrack);
        return nativeRemoveAudioTrack(this.nativeStream, audioTrack.getNativeMediaStreamTrack());
    }
}
