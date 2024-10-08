package X;

import com.facebook.mediastreaming.opt.source.audio.AndroidAudioRecorder;

public final class Y2T implements Runnable {
    public final /* synthetic */ AndroidAudioRecorder A00;
    public final /* synthetic */ XZS A01;

    public Y2T(AndroidAudioRecorder androidAudioRecorder, XZS xzs) {
        this.A00 = androidAudioRecorder;
        this.A01 = xzs;
    }

    public final void run() {
        this.A00.release();
        11Z.A02(new Y26(this.A01.A00));
    }
}
