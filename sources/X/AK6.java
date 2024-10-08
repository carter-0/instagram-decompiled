package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController;

public final class AK6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ ClipsTimelineEditorDrawerController A00;

    public AK6(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        this.A00 = clipsTimelineEditorDrawerController;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController = this.A00;
        UserSession userSession = clipsTimelineEditorDrawerController.A0a;
        27p.A01(userSession).A1l(AnonymousClass000.A00(443));
        29I r1 = 27p.A01(userSession).A02;
        AnonymousClass7TG.A1K(r1);
        29I.A00(r1, "user_template_discard_video_click");
        ClipsTimelineEditorDrawerController.A08(clipsTimelineEditorDrawerController);
        clipsTimelineEditorDrawerController.A0j.A0O();
        ClipsTimelineEditorDrawerController.A0G(clipsTimelineEditorDrawerController, false, true);
    }
}
