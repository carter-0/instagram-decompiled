package org.webrtc;

import X.AnonymousClass7TE;
import org.webrtc.MediaStreamTrack;

public class RtpReceiver {
    public MediaStreamTrack cachedTrack;
    public long nativeObserver;
    public long nativeRtpReceiver;

    public interface Observer {
        void onFirstPacketReceived(MediaStreamTrack.MediaType mediaType);
    }

    public static native String nativeGetId(long j);

    public static native RtpParameters nativeGetParameters(long j);

    public static native long nativeGetTrack(long j);

    public static native void nativeSetFrameDecryptor(long j, long j2);

    public static native long nativeSetObserver(long j, Observer observer);

    public static native void nativeUnsetObserver(long j, long j2);

    private void checkRtpReceiverExists() {
        if (this.nativeRtpReceiver == 0) {
            throw AnonymousClass7TE.A0z("RtpReceiver has been disposed.");
        }
    }

    public RtpReceiver(long j) {
        this.nativeRtpReceiver = j;
        this.cachedTrack = MediaStreamTrack.createMediaStreamTrack(nativeGetTrack(j));
    }

    public void SetObserver(Observer observer) {
        checkRtpReceiverExists();
        long j = this.nativeObserver;
        if (j != 0) {
            nativeUnsetObserver(this.nativeRtpReceiver, j);
        }
        this.nativeObserver = nativeSetObserver(this.nativeRtpReceiver, observer);
    }

    public void dispose() {
        checkRtpReceiverExists();
        this.cachedTrack.dispose();
        long j = this.nativeObserver;
        if (j != 0) {
            nativeUnsetObserver(this.nativeRtpReceiver, j);
            this.nativeObserver = 0;
        }
        JniCommon.nativeReleaseRef(this.nativeRtpReceiver);
        this.nativeRtpReceiver = 0;
    }

    public RtpParameters getParameters() {
        checkRtpReceiverExists();
        return nativeGetParameters(this.nativeRtpReceiver);
    }

    public String id() {
        checkRtpReceiverExists();
        return nativeGetId(this.nativeRtpReceiver);
    }

    public void setFrameDecryptor(FrameDecryptor frameDecryptor) {
        checkRtpReceiverExists();
        nativeSetFrameDecryptor(this.nativeRtpReceiver, frameDecryptor.getNativeFrameDecryptor());
    }

    public MediaStreamTrack track() {
        return this.cachedTrack;
    }
}
