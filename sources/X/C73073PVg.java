package X;

import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.inbox.notes.creation.NotesCreationPogView;

/* renamed from: X.PVg  reason: case insensitive filesystem */
public final class C73073PVg implements Runnable {
    public final /* synthetic */ C68449NIn A00;

    public C73073PVg(C68449NIn nIn) {
        this.A00 = nIn;
    }

    public final void run() {
        String str;
        C68449NIn nIn = this.A00;
        NotesCreationPogView notesCreationPogView = nIn.A0b;
        if (notesCreationPogView == null) {
            str = "pogViewContainer";
        } else {
            notesCreationPogView.setAlpha(0.6f);
            IgImageView igImageView = nIn.A0U;
            str = "selectedNoteXButton";
            if (igImageView != null) {
                igImageView.setAlpha(0.6f);
                IgImageView igImageView2 = nIn.A0U;
                if (igImageView2 != null) {
                    igImageView2.setEnabled(false);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
