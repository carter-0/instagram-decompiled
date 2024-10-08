package X;

import android.widget.ImageView;
import com.instagram.api.schemas.CommentGiphyMediaInfo;

/* renamed from: X.PYq  reason: case insensitive filesystem */
public final class C73212PYq implements Runnable {
    public final /* synthetic */ CommentGiphyMediaInfo A00;
    public final /* synthetic */ C68467NJf A01;

    public C73212PYq(CommentGiphyMediaInfo commentGiphyMediaInfo, C68467NJf nJf) {
        this.A01 = nJf;
        this.A00 = commentGiphyMediaInfo;
    }

    public final void run() {
        C68467NJf nJf = this.A01;
        C252063oV r0 = nJf.A0M;
        if (r0 != null) {
            C321016tR A002 = C395089zC.A00(r0.getView(), this.A00, AnonymousClass7TE.A0l(nJf.A0j));
            if (A002 != null) {
                C252063oV r02 = nJf.A0M;
                if (r02 != null) {
                    ((ImageView) r02.getView()).setImageDrawable(A002);
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F("gifSquareViewStub");
        throw AnonymousClass00P.createAndThrow();
    }
}
