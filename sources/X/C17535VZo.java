package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;

/* renamed from: X.VZo  reason: case insensitive filesystem */
public final class C17535VZo {
    public C20967X6u A00;
    public C18001Vjd A01;
    public final View A02;
    public final SimpleZoomableViewContainer A03;
    public final AnonymousClass7HQ A04;

    public C17535VZo(View view, int i) {
        this.A03 = (SimpleZoomableViewContainer) AnonymousClass7TE.A0b(view, R.id.container);
        View A0G = AnonymousClass7TF.A0G(view, i);
        this.A02 = A0G;
        AnonymousClass7HQ r2 = new AnonymousClass7HQ(AnonymousClass7TE.A0S(view));
        this.A04 = r2;
        WC3.A00(A0G, 13, this);
        r2.A01.add(new C16295UsD(this));
    }
}
