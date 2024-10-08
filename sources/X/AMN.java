package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController;

public final class AMN implements View.OnClickListener {
    public final /* synthetic */ ClipsTimelineEditorDrawerController A00;

    public AMN(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        this.A00 = clipsTimelineEditorDrawerController;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-825176397);
        ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController = this.A00;
        C56160Hto hto = new C56160Hto(clipsTimelineEditorDrawerController.A0a);
        Context context = clipsTimelineEditorDrawerController.A0W;
        hto.A00(context, new AOX((Object) clipsTimelineEditorDrawerController, 15), AnonymousClass7TE.A16(context, 2131972171), R.drawable.instagram_report_pano_outline_24);
        new C17897Vho(hto).A00(clipsTimelineEditorDrawerController.A0Y);
        AnonymousClass0fD.A0C(633632041, A05);
    }
}
