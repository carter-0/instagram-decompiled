package org.webrtc;

import X.AnonymousClass7TE;
import X.DbW;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.webrtc.MediaStreamTrack;

public class RtpTransceiver {
    public RtpReceiver cachedReceiver;
    public RtpSender cachedSender;
    public long nativeRtpTransceiver;

    public enum RtpTransceiverDirection {
        SEND_RECV(0),
        SEND_ONLY(1),
        RECV_ONLY(2),
        INACTIVE(3);
        
        public final int nativeIndex;

        public int getNativeIndex() {
            return this.nativeIndex;
        }

        /* access modifiers changed from: public */
        RtpTransceiverDirection(int i) {
            this.nativeIndex = i;
        }

        public static RtpTransceiverDirection fromNativeIndex(int i) {
            for (RtpTransceiverDirection rtpTransceiverDirection : values()) {
                if (rtpTransceiverDirection.getNativeIndex() == i) {
                    return rtpTransceiverDirection;
                }
            }
            throw DbW.A0a("Uknown native RtpTransceiverDirection type", i);
        }
    }

    public final class RtpTransceiverInit {
        public final RtpTransceiverDirection direction;
        public final List sendEncodings;
        public final List streamIds;

        public int getDirectionNativeIndex() {
            return this.direction.getNativeIndex();
        }

        public List getSendEncodings() {
            return new ArrayList(this.sendEncodings);
        }

        public List getStreamIds() {
            return new ArrayList(this.streamIds);
        }

        public RtpTransceiverInit(RtpTransceiverDirection rtpTransceiverDirection, List list, List list2) {
            this.direction = rtpTransceiverDirection;
            this.streamIds = new ArrayList(list);
            this.sendEncodings = new ArrayList(list2);
        }

        public RtpTransceiverInit(RtpTransceiverDirection rtpTransceiverDirection, List list) {
            this(rtpTransceiverDirection, list, Collections.emptyList());
        }

        public RtpTransceiverInit(RtpTransceiverDirection rtpTransceiverDirection) {
            this(rtpTransceiverDirection, Collections.emptyList(), Collections.emptyList());
        }

        public RtpTransceiverInit() {
            this(RtpTransceiverDirection.SEND_RECV);
        }
    }

    public static native RtpTransceiverDirection nativeCurrentDirection(long j);

    public static native RtpTransceiverDirection nativeDirection(long j);

    public static native MediaStreamTrack.MediaType nativeGetMediaType(long j);

    public static native String nativeGetMid(long j);

    public static native RtpReceiver nativeGetReceiver(long j);

    public static native RtpSender nativeGetSender(long j);

    public static native void nativeSetCodecPreferences(long j, List list);

    public static native boolean nativeSetDirection(long j, RtpTransceiverDirection rtpTransceiverDirection);

    public static native void nativeStopInternal(long j);

    public static native void nativeStopStandard(long j);

    public static native boolean nativeStopped(long j);

    private void checkRtpTransceiverExists() {
        if (this.nativeRtpTransceiver == 0) {
            throw AnonymousClass7TE.A0z("RtpTransceiver has been disposed.");
        }
    }

    public RtpTransceiver(long j) {
        this.nativeRtpTransceiver = j;
        this.cachedSender = nativeGetSender(j);
        this.cachedReceiver = nativeGetReceiver(j);
    }

    public void dispose() {
        checkRtpTransceiverExists();
        this.cachedSender.dispose();
        this.cachedReceiver.dispose();
        JniCommon.nativeReleaseRef(this.nativeRtpTransceiver);
        this.nativeRtpTransceiver = 0;
    }

    public RtpTransceiverDirection getCurrentDirection() {
        checkRtpTransceiverExists();
        return nativeCurrentDirection(this.nativeRtpTransceiver);
    }

    public RtpTransceiverDirection getDirection() {
        checkRtpTransceiverExists();
        return nativeDirection(this.nativeRtpTransceiver);
    }

    public MediaStreamTrack.MediaType getMediaType() {
        checkRtpTransceiverExists();
        return nativeGetMediaType(this.nativeRtpTransceiver);
    }

    public String getMid() {
        checkRtpTransceiverExists();
        return nativeGetMid(this.nativeRtpTransceiver);
    }

    public RtpReceiver getReceiver() {
        return this.cachedReceiver;
    }

    public RtpSender getSender() {
        return this.cachedSender;
    }

    public boolean isStopped() {
        checkRtpTransceiverExists();
        return nativeStopped(this.nativeRtpTransceiver);
    }

    public void setCodecPreferences(List list) {
        checkRtpTransceiverExists();
        nativeSetCodecPreferences(this.nativeRtpTransceiver, list);
    }

    public boolean setDirection(RtpTransceiverDirection rtpTransceiverDirection) {
        checkRtpTransceiverExists();
        return nativeSetDirection(this.nativeRtpTransceiver, rtpTransceiverDirection);
    }

    public void stop() {
        checkRtpTransceiverExists();
        nativeStopInternal(this.nativeRtpTransceiver);
    }

    public void stopInternal() {
        checkRtpTransceiverExists();
        nativeStopInternal(this.nativeRtpTransceiver);
    }

    public void stopStandard() {
        checkRtpTransceiverExists();
        nativeStopStandard(this.nativeRtpTransceiver);
    }
}
