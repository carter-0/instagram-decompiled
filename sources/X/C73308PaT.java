package X;

import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.direct.inbox.notes.ui.NoteAvatarView;

/* renamed from: X.PaT  reason: case insensitive filesystem */
public final class C73308PaT implements Runnable {
    public final /* synthetic */ CommentGiphyMediaInfo A00;
    public final /* synthetic */ AnonymousClass50C A01;
    public final /* synthetic */ AnonymousClass4AL A02;

    public C73308PaT(CommentGiphyMediaInfo commentGiphyMediaInfo, AnonymousClass50C r2, AnonymousClass4AL r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = commentGiphyMediaInfo;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v3, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public final void run() {
        AnonymousClass50C r1 = this.A01;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        NoteAvatarView noteAvatarView = r1.A0B;
        C321016tR A002 = C395089zC.A00(noteAvatarView.A0B, this.A00, this.A02.A02);
        if (A002 != null) {
            noteAvatarView.A0B.setImageDrawable(A002);
        }
    }
}
