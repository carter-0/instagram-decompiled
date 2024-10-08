package X;

import android.content.DialogInterface;
import com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController;

public final class AJc implements DialogInterface.OnCancelListener {
    public final /* synthetic */ ClipsTimelineEditorDrawerController A00;

    public AJc(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        this.A00 = clipsTimelineEditorDrawerController;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        27p.A01(this.A00.A0a).A1l("EXIT_DIALOG_CANCEL");
    }
}
