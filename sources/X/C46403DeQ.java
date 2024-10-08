package X;

import android.view.View;
import android.widget.FrameLayout;
import com.instagram.android.R;

/* renamed from: X.DeQ  reason: case insensitive filesystem */
public final class C46403DeQ extends C249703kE {
    public AnonymousClass6NS A00;
    public final FrameLayout A01;
    public final C273694n2 A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46403DeQ(View view) {
        super(view);
        0qQ.A0B(view, 1);
        FrameLayout frameLayout = (FrameLayout) AnonymousClass7TE.A0b(view, R.id.bloks_container);
        this.A01 = frameLayout;
        C273694n2 r0 = new C273694n2(AnonymousClass7TE.A0S(view));
        this.A02 = r0;
        frameLayout.addView(r0);
    }
}
