package X;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.Iterator;

/* renamed from: X.MzH  reason: case insensitive filesystem */
public final class C68050MzH extends C249703kE {
    public final Context A00;
    public final FrameLayout A01;
    public final C68478NJv A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68050MzH(FrameLayout frameLayout, C68478NJv nJv) {
        super(frameLayout);
        0qQ.A0B(frameLayout, 1);
        this.A01 = frameLayout;
        this.A02 = nJv;
        this.A00 = AnonymousClass7TE.A0S(frameLayout);
    }

    public final NR1 A00() {
        Object next;
        Iterator it = C242173Sx.A0B(C74119PpM.A00, new AnonymousClass044(this.A01)).iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            do {
                next = it.next();
            } while (it.hasNext());
        }
        return (NR1) next;
    }

    public final void A01() {
        this.itemView.post(new C73105PWm(this));
    }
}
