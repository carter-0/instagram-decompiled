package X;

import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.Jpg  reason: case insensitive filesystem */
public final class C60695Jpg extends C249703kE implements AnonymousClass07Z {
    public final 0h9 A00 = new 0h9(this);
    public final C262794Ga A01;
    public final ViewStub A02;

    public final /* bridge */ /* synthetic */ AnonymousClass07V getLifecycle() {
        return this.A00;
    }

    public C60695Jpg(IgFrameLayout igFrameLayout) {
        super(igFrameLayout);
        ViewStub A0X = JTR.A0X(igFrameLayout, R.id.open_carousel_prompt_view_stub);
        this.A02 = A0X;
        this.A01 = new C262794Ga(A0X);
    }
}
