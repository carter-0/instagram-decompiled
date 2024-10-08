package org.webrtc;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.Pxe;
import X.Pxg;
import java.util.IdentityHashMap;
import java.util.Iterator;

public class VideoTrack extends MediaStreamTrack {
    public final IdentityHashMap sinks = new IdentityHashMap();

    public static native void nativeAddSink(long j, long j2);

    public static native void nativeFreeSink(long j);

    public static native void nativeRemoveSink(long j, long j2);

    public static native long nativeWrapSink(VideoSink videoSink);

    public void addSink(VideoSink videoSink) {
        if (videoSink == null) {
            throw AnonymousClass7TE.A0w("The VideoSink is not allowed to be null");
        } else if (!this.sinks.containsKey(videoSink)) {
            long nativeWrapSink = nativeWrapSink(videoSink);
            Pxe.A1X(videoSink, this.sinks, nativeWrapSink);
            nativeAddSink(getNativeMediaStreamTrack(), nativeWrapSink);
        }
    }

    public void dispose() {
        Iterator A0t = AnonymousClass7TF.A0t(this.sinks);
        while (A0t.hasNext()) {
            long A0H = Pxg.A0H(A0t);
            nativeRemoveSink(getNativeMediaStreamTrack(), A0H);
            nativeFreeSink(A0H);
        }
        this.sinks.clear();
        super.dispose();
    }

    public void removeSink(VideoSink videoSink) {
        Number number = (Number) this.sinks.remove(videoSink);
        if (number != null) {
            long nativeMediaStreamTrack = getNativeMediaStreamTrack();
            long longValue = number.longValue();
            nativeRemoveSink(nativeMediaStreamTrack, longValue);
            nativeFreeSink(longValue);
        }
    }

    public VideoTrack(long j) {
        super(j);
    }

    public long getNativeVideoTrack() {
        return getNativeMediaStreamTrack();
    }
}
