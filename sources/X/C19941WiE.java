package X;

import com.facebook.mediastreaming.opt.source.audio.AndroidAudioRecorder;
import java.util.Arrays;

/* renamed from: X.WiE  reason: case insensitive filesystem */
public final class C19941WiE implements Runnable {
    public final /* synthetic */ AndroidAudioRecorder A00;

    public C19941WiE(AndroidAudioRecorder androidAudioRecorder) {
        this.A00 = androidAudioRecorder;
    }

    public final void run() {
        AndroidAudioRecorder androidAudioRecorder = this.A00;
        V65 v65 = AndroidAudioRecorder.Companion;
        if (androidAudioRecorder.isRecordingAudioData.get()) {
            W3b.A02("mss:AndroidAudioRecorder", "Audio recording already started!", (Throwable) null, Arrays.copyOf(new Object[0], 0));
            return;
        }
        androidAudioRecorder.prepare();
        AndroidAudioRecorder.access$startAudioRecordingInternal(androidAudioRecorder);
    }
}
