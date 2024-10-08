package X;

import android.view.View;
import android.widget.FrameLayout;
import com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController;

public final class ANQ implements View.OnClickListener {
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ ClipsTimelineEditorDrawerController A01;

    public ANQ(FrameLayout frameLayout, ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        this.A01 = clipsTimelineEditorDrawerController;
        this.A00 = frameLayout;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1541639965);
        ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController = this.A01;
        if (ClipsTimelineEditorDrawerController.A0I(clipsTimelineEditorDrawerController)) {
            AnonymousClass80U r1 = clipsTimelineEditorDrawerController.A0e;
            if (r1.CQ0(AnonymousClass80V.CLIPS_EDITOR)) {
                if (clipsTimelineEditorDrawerController.A0C != null) {
                    ClipsTimelineEditorDrawerController.A0D(clipsTimelineEditorDrawerController, AnonymousClass8RM.A0B);
                }
            } else if (r1.CQ0(AnonymousClass80V.MEDIA_EDIT)) {
                AnonymousClass7TH.A0R(clipsTimelineEditorDrawerController.A01);
                C357068Wi r0 = (C357068Wi) clipsTimelineEditorDrawerController.A0x.get();
                if (r0 != null) {
                    r0.A06();
                }
            }
        } else if (clipsTimelineEditorDrawerController.ABA()) {
            this.A00.setVisibility(8);
            ClipsTimelineEditorDrawerController.A06(clipsTimelineEditorDrawerController);
            ClipsTimelineEditorDrawerController.A0G(clipsTimelineEditorDrawerController, true, true);
            27p.A01(clipsTimelineEditorDrawerController.A0a).A0h();
        }
        AnonymousClass0fD.A0C(-647117912, A05);
    }
}
