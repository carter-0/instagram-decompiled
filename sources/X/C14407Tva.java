package X;

import org.webrtc.MediaStreamTrack;

/* renamed from: X.Tva  reason: case insensitive filesystem */
public enum C14407Tva {
    BLENDED("blended"),
    USERS("users"),
    HASHTAG("hashtags"),
    PLACES("places"),
    AUDIO(MediaStreamTrack.AUDIO_TRACK_KIND),
    MAP("map");
    
    public final String A00;

    /* access modifiers changed from: public */
    static {
        C14407Tva[] tvaArr;
        A01 = 0oU.A00(tvaArr);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C14407Tva(String str) {
        this.A00 = str;
    }
}
