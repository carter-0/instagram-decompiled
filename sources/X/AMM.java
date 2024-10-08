package X;

import android.view.View;
import com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController;

public final class AMM implements View.OnClickListener {
    public final /* synthetic */ ClipsTimelineEditorDrawerController A00;

    public AMM(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        this.A00 = clipsTimelineEditorDrawerController;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(300919873);
        ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController = this.A00;
        if (clipsTimelineEditorDrawerController.A0m.A04 != null) {
            clipsTimelineEditorDrawerController.onBackPressed();
        } else {
            ClipsTimelineEditorDrawerController.A08(clipsTimelineEditorDrawerController);
            ClipsTimelineEditorDrawerController.A0G(clipsTimelineEditorDrawerController, false, true);
        }
        AnonymousClass0fD.A0C(-2118690283, A05);
    }
}
