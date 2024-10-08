package X;

/* renamed from: X.7mz  reason: invalid class name and case insensitive filesystem */
public final class C341497mz implements C341507n0 {
    public final /* synthetic */ C341427mr A00;

    public C341497mz(C341427mr r1) {
        this.A00 = r1;
    }

    public final int DKo(Y1G y1g) {
        C341427mr r1 = this.A00;
        C3730593v r0 = r1.A03;
        if (r0 != null) {
            return r0.fillAudioBuffer(y1g);
        }
        r1.A0L.Cjw(new C382299dT("Attempted to fill audio buffer with no audio pipeline present"), "inprogress_recording_audio_failure", "AudioPipelineController", "", "high", "onInputBufferReady", (long) r1.hashCode());
        return 1;
    }
}
