package X;

import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController;

public final class AfY implements C3493580b {
    public final /* synthetic */ ClipsTimelineEditorDrawerController A00;

    public AfY(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        this.A00 = clipsTimelineEditorDrawerController;
    }

    public final /* bridge */ /* synthetic */ void Dmx(Object obj, Object obj2, Object obj3) {
        Fragment fragment;
        C19140WMw wMw;
        AnonymousClass80V r2 = AnonymousClass80V.CLIPS_EDITOR;
        if (obj == r2) {
            ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController = this.A00;
            if (clipsTimelineEditorDrawerController.A0v.contains(obj2)) {
                ClipsTimelineEditorDrawerController.A0D(clipsTimelineEditorDrawerController, AnonymousClass8RM.A07);
                return;
            }
        }
        if (obj2 == r2) {
            ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController2 = this.A00;
            if (clipsTimelineEditorDrawerController2.A0v.contains(obj)) {
                clipsTimelineEditorDrawerController2.A0k.A03(C388519nx.A00);
                return;
            }
        }
        if (obj2 == AnonymousClass80V.CONFIGURE_CAMERA && obj == AnonymousClass80V.MEDIA_EDIT) {
            ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController3 = this.A00;
            C19140WMw wMw2 = clipsTimelineEditorDrawerController3.A0C;
            if (wMw2 != null) {
                fragment = wMw2.A0E.A0P(R.id.fragment_container);
            } else {
                fragment = null;
            }
            if ((fragment instanceof K5P) && (wMw = clipsTimelineEditorDrawerController3.A0C) != null) {
                wMw.A05(true);
            }
        }
    }
}
