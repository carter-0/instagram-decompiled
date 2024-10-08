package X;

import androidx.fragment.app.FragmentActivity;
import instagram.features.clips.edit.ClipsEditMetadataController;
import java.io.File;

public final class M5V implements Runnable {
    public final /* synthetic */ ClipsEditMetadataController A00;

    public M5V(ClipsEditMetadataController clipsEditMetadataController) {
        this.A00 = clipsEditMetadataController;
    }

    public final void run() {
        ClipsEditMetadataController clipsEditMetadataController = this.A00;
        FragmentActivity activity = clipsEditMetadataController.A0q.getActivity();
        if (activity != null) {
            File file = clipsEditMetadataController.A0L;
            if (file != null) {
                file.delete();
            }
            activity.onBackPressed();
        }
    }
}
