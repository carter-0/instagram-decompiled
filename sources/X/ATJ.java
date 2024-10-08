package X;

import java.util.Map;

public final class ATJ implements C341687nM {
    public final /* synthetic */ C341737nR A00;
    public final /* synthetic */ C341707nO A01;

    public ATJ(C341737nR r1, C341707nO r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void DCg(C391719tX r13) {
        C341707nO r2 = this.A01;
        r2.A0C.A01("pAPe");
        C343467qG r0 = r2.A05;
        C391719tX r4 = r13;
        if (r0 != null) {
            r13.A01(r0.A00());
        }
        r2.release();
        try {
            r13.A00("supported_configs", C39902AIk.A02(C39902AIk.A03()));
        } catch (Exception unused) {
        }
        r2.A0F.Cjv(r4, "prepare_recording_audio_failed", "AudioRecordingTrack", "", "prepareAudioPipeline", (Map) null, AnonymousClass7TE.A0Q(r2));
        this.A00.onError(r13);
    }

    public final void onSuccess() {
        this.A01.A0C.A01("pAPs");
        this.A00.onSuccess();
    }
}
