package X;

import android.widget.ImageView;
import com.instagram.api.schemas.CommentGiphyMediaInfo;

/* renamed from: X.PYr  reason: case insensitive filesystem */
public final class C73213PYr implements Runnable {
    public final /* synthetic */ CommentGiphyMediaInfo A00;
    public final /* synthetic */ C68467NJf A01;

    public C73213PYr(CommentGiphyMediaInfo commentGiphyMediaInfo, C68467NJf nJf) {
        this.A01 = nJf;
        this.A00 = commentGiphyMediaInfo;
    }

    public final void run() {
        C68467NJf nJf = this.A01;
        C252063oV r0 = nJf.A0L;
        if (r0 != null) {
            C321016tR A002 = C395089zC.A00(r0.getView(), this.A00, AnonymousClass7TE.A0l(nJf.A0j));
            if (A002 != null) {
                C252063oV r02 = nJf.A0L;
                if (r02 != null) {
                    ((ImageView) r02.getView()).setImageDrawable(A002);
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F("gifPogViewStub");
        throw AnonymousClass00P.createAndThrow();
    }
}
