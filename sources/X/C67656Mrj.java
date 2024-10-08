package X;

import android.media.AudioManager;
import java.util.List;

/* renamed from: X.Mrj  reason: case insensitive filesystem */
public final class C67656Mrj extends AudioManager.AudioRecordingCallback {
    public final /* synthetic */ C71125OdK A00;

    public C67656Mrj(C71125OdK odK) {
        this.A00 = odK;
    }

    public final void onRecordingConfigChanged(List list) {
        super.onRecordingConfigChanged(list);
        C71125OdK.A03(this.A00);
    }
}
