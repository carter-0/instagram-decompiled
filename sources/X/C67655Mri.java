package X;

import android.media.AudioManager;
import java.util.List;

/* renamed from: X.Mri  reason: case insensitive filesystem */
public final class C67655Mri extends AudioManager.AudioRecordingCallback {
    public final /* synthetic */ C71064Oaj A00;

    public final void onRecordingConfigChanged(List list) {
        0qQ.A0B(list, 0);
        super.onRecordingConfigChanged(list);
        C71064Oaj.A02(this.A00, "recording_configs_changed", list);
    }

    public C67655Mri(C71064Oaj oaj) {
        this.A00 = oaj;
    }
}
