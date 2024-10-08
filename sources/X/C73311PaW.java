package X;

import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.PaW  reason: case insensitive filesystem */
public final class C73311PaW implements Runnable {
    public final /* synthetic */ CommentGiphyMediaInfo A00;
    public final /* synthetic */ RoundedCornerImageView A01;
    public final /* synthetic */ NKL A02;

    public C73311PaW(CommentGiphyMediaInfo commentGiphyMediaInfo, RoundedCornerImageView roundedCornerImageView, NKL nkl) {
        this.A01 = roundedCornerImageView;
        this.A02 = nkl;
        this.A00 = commentGiphyMediaInfo;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.widget.ImageView, android.view.View, java.lang.Object] */
    public final void run() {
        ? r2 = this.A01;
        0qQ.A0A(r2);
        C321016tR A002 = C395089zC.A00(r2, this.A00, AnonymousClass7TE.A0l(this.A02.A0S));
        if (A002 != null) {
            r2.setImageDrawable(A002);
        }
    }
}
