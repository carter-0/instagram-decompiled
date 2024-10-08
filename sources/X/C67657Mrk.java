package X;

import android.media.AudioManager;
import java.util.List;

/* renamed from: X.Mrk  reason: case insensitive filesystem */
public final class C67657Mrk extends AudioManager.AudioRecordingCallback {
    public final /* synthetic */ OVK A00;

    public C67657Mrk(OVK ovk) {
        this.A00 = ovk;
    }

    public final void onRecordingConfigChanged(List list) {
        super.onRecordingConfigChanged(list);
        OVK.A00(this.A00);
    }
}
