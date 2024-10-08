package X;

public final class AQU implements C341507n0 {
    public final /* synthetic */ AQY A00;

    public AQU(AQY aqy) {
        this.A00 = aqy;
    }

    public final int DKo(Y1G y1g) {
        AQY aqy = this.A00;
        C22018Xss xss = aqy.A00;
        if (xss != null) {
            return xss.A03(y1g);
        }
        aqy.A04.Cjw(new C382299dT("Attempted to fill audio buffer with no audio pipeline present"), "inprogress_recording_audio_failure", "LegacyAudioPipeline", "", "high", "onInputBufferReady", AnonymousClass7TE.A0Q(aqy));
        return 1;
    }
}
