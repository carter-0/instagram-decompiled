package org.webrtc;

public class AudioSource extends MediaSource {
    public long getNativeAudioSource() {
        return getNativeMediaSource();
    }

    public AudioSource(long j) {
        super(j);
    }
}
