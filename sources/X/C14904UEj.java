package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.discovery.ui.FixedAspectRatioVideoLayout;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.UEj  reason: case insensitive filesystem */
public final class C14904UEj extends C249703kE implements C20976X7p, X1S {
    public final FixedAspectRatioVideoLayout A00;
    public final IgImageButton A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14904UEj(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = (FixedAspectRatioVideoLayout) AnonymousClass7TE.A0b(view, R.id.layout_container);
        IgImageButton igImageButton = (IgImageButton) AnonymousClass7TF.A0F(view, R.id.image_preview);
        this.A01 = igImageButton;
        igImageButton.setEnableTouchOverlay(false);
        view.setTag(this);
    }

    public final void ABK(C232822uV r1, int i) {
    }

    public final IgImageButton BGE() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ FixedAspectRatioVideoLayout BLn() {
        return this.A00;
    }
}
