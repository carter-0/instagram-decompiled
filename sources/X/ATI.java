package X;

import com.facebook.cameracore.audiograph.AudioPipelineImpl;

public final class ATI implements C341687nM {
    public final /* synthetic */ AudioPipelineImpl A00;
    public final /* synthetic */ C341687nM A01;

    public ATI(AudioPipelineImpl audioPipelineImpl, C341687nM r2) {
        this.A00 = audioPipelineImpl;
        this.A01 = r2;
    }

    public final void DCg(C391719tX r6) {
        AudioPipelineImpl audioPipelineImpl = this.A00;
        audioPipelineImpl.mAudioRecorder = null;
        C341687nM r0 = this.A01;
        if (r0 != null) {
            r0.DCg(r6);
        }
        if (audioPipelineImpl.mAudioRecorderThread != null) {
            C341447mt.A02(audioPipelineImpl.mAudioRecorderThread, false, true);
            audioPipelineImpl.mAudioRecorderThread = null;
        }
    }

    public final void onSuccess() {
        AudioPipelineImpl audioPipelineImpl = this.A00;
        audioPipelineImpl.mAudioRecorder = null;
        C341687nM r0 = this.A01;
        if (r0 != null) {
            r0.onSuccess();
        }
        if (audioPipelineImpl.mAudioRecorderThread != null) {
            C341447mt.A02(audioPipelineImpl.mAudioRecorderThread, false, true);
            audioPipelineImpl.mAudioRecorderThread = null;
        }
    }
}
