package X;

import org.webrtc.CameraCapturer;

/* renamed from: X.Uxl  reason: case insensitive filesystem */
public enum C16591Uxl {
    GenericError(0),
    CapsNegotiationError(1),
    StateTransitionError(2),
    DataWriteError(3),
    MessageBusError(4),
    NodeTeardownError(5),
    ServiceTeardownError(6),
    FlowStateError(7),
    InterruptedTooLongError(8),
    VideoSourceError(100),
    AudioSourceError(101),
    VideoEncoderError(102),
    AudioEncoderError(103),
    NetworkError(104),
    AudioMixerError(105),
    MaxFatalCodeError(CameraCapturer.OPEN_CAMERA_TIMEOUT),
    BigAVGapError(10001),
    DvrError(10002),
    MuxerError(10003),
    DvrInvalidDurationError(10004),
    DvrExceedMaxSizeError(10005),
    TsAdjusterGapError(10006),
    DvrNoEnoughDiskSpaceError(10007),
    DvrBigAVGapError(10008),
    DvrOutOfOrderTimestampError(10009),
    DvrPredictedToHaveWorseQualityThanLive(10010);
    
    public final int A00;

    /* access modifiers changed from: public */
    C16591Uxl(int i) {
        this.A00 = i;
    }
}
