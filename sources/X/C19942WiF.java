package X;

import com.facebook.mediastreaming.opt.source.audio.AndroidAudioRecorder;

/* renamed from: X.WiF  reason: case insensitive filesystem */
public final class C19942WiF implements Runnable {
    public final /* synthetic */ AndroidAudioRecorder A00;

    public C19942WiF(AndroidAudioRecorder androidAudioRecorder) {
        this.A00 = androidAudioRecorder;
    }

    public final void run() {
        AndroidAudioRecorder.access$restartRecorder(this.A00);
    }
}
