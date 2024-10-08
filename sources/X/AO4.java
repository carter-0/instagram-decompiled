package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

public final class AO4 implements View.OnClickListener {
    public final /* synthetic */ IgSimpleImageView A00;
    public final /* synthetic */ ClipsTimelineEditorDrawerController A01;
    public final /* synthetic */ 1Xj A02;

    public AO4(IgSimpleImageView igSimpleImageView, ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController, 1Xj r3) {
        this.A02 = r3;
        this.A01 = clipsTimelineEditorDrawerController;
        this.A00 = igSimpleImageView;
    }

    public final void onClick(View view) {
        C243373Ym r12;
        int A05 = AnonymousClass0fD.A05(-582977926);
        1Xj r9 = this.A02;
        if (r9 == null || !r9.CbC()) {
            r12 = C243373Ym.SAVED;
        } else {
            r12 = C243373Ym.NOT_SAVED;
        }
        ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController = this.A01;
        C354878Ns r3 = clipsTimelineEditorDrawerController.A0l;
        IgSimpleImageView igSimpleImageView = this.A00;
        FragmentActivity fragmentActivity = clipsTimelineEditorDrawerController.A0Y;
        Context A0S = AnonymousClass7TE.A0S(igSimpleImageView);
        UserSession userSession = clipsTimelineEditorDrawerController.A0a;
        293 r6 = clipsTimelineEditorDrawerController.A0Z;
        if (r6 == null) {
            r6 = 293.A06;
        }
        r3.A00(fragmentActivity, A0S, r6, userSession, igSimpleImageView, r9, clipsTimelineEditorDrawerController, (IgdsMediaButton) null, r12);
        AnonymousClass0fD.A0C(1493381479, A05);
    }
}
