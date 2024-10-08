package X;

import com.facebook.cameracore.audiograph.AudioPipelineImpl;

public final class ATG implements C341687nM {
    public final /* synthetic */ AudioPipelineImpl A00;
    public final /* synthetic */ C341687nM A01;

    public ATG(AudioPipelineImpl audioPipelineImpl, C341687nM r2) {
        this.A00 = audioPipelineImpl;
        this.A01 = r2;
    }

    public final void DCg(C391719tX r3) {
        this.A00.mAudioRecorder = null;
        this.A01.DCg(r3);
    }

    public final void onSuccess() {
        AudioPipelineImpl audioPipelineImpl = this.A00;
        int access$100 = audioPipelineImpl.stopInputInternal();
        audioPipelineImpl.mAudioRecorder = null;
        if (access$100 == 0 || access$100 == 13) {
            this.A01.onSuccess();
        } else {
            AudioPipelineImpl.reportException(access$100, "stopInputInternal failed", this.A01);
        }
    }
}
