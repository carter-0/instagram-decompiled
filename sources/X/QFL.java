package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.android.R;

public final class QFL extends C249703kE {
    public final FrameLayout A00;
    public final ViewGroup A01;
    public final /* synthetic */ C7998Qel A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QFL(ViewGroup viewGroup, C7998Qel qel) {
        super(viewGroup);
        0qQ.A0B(viewGroup, 2);
        this.A02 = qel;
        this.A01 = viewGroup;
        FrameLayout frameLayout = (FrameLayout) AnonymousClass7TF.A0F(viewGroup, R.id.bloks_container);
        this.A00 = frameLayout;
        C11409SSh.A04(frameLayout, 35, false);
    }
}
