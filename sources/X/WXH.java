package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.direct.visual.DirectVisualMessageViewerController;

public final class WXH implements C247813gx {
    public final int A00;
    public final Object A01;

    public WXH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* synthetic */ void DEN() {
    }

    public final void DO4(C240983Nk r4) {
        switch (this.A00) {
            case 0:
                ((C15696Uh2) this.A01).A03();
                return;
            case 1:
                C15692Ugx ugx = ((C15697Uh3) this.A01).A06;
                if (ugx == null) {
                    0qQ.A0F("videoModule");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    ugx.A03.sendEmptyMessage(0);
                    return;
                }
            case 2:
                DirectVisualMessageViewerController directVisualMessageViewerController = (DirectVisualMessageViewerController) this.A01;
                OIU oiu = directVisualMessageViewerController.contentHolder;
                if (oiu != null) {
                    oiu.A0J.A06(R.id.direct_visual_message_viewer_fragment_image_view_id);
                    View view = directVisualMessageViewerController.contentView;
                    if (view != null) {
                        0nA.A0p(view, new PWQ(directVisualMessageViewerController));
                        return;
                    }
                    throw AnonymousClass7TE.A0y();
                }
                throw AnonymousClass7TE.A0y();
            case 3:
                0qQ.A0B(r4, 0);
                ((View) this.A01).setTag(R.id.id_for_thumbnail_media_loaded_data_tag, r4.A04);
                return;
            default:
                return;
        }
    }
}
