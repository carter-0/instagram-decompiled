package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.discovery.ui.FixedAspectRatioVideoLayout;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.UEk  reason: case insensitive filesystem */
public final class C14905UEk extends C249703kE implements C20976X7p, X1S {
    public final IgSimpleImageView A00;
    public final IgTextView A01;
    public final FixedAspectRatioVideoLayout A02;
    public final IgImageButton A03;

    public final void ABK(C232822uV r1, int i) {
    }

    public final IgImageButton BGE() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ FixedAspectRatioVideoLayout BLn() {
        return this.A02;
    }

    public C14905UEk(View view) {
        super(view);
        this.A02 = (FixedAspectRatioVideoLayout) AnonymousClass7TE.A0b(view, R.id.layout_container);
        IgImageButton igImageButton = (IgImageButton) AnonymousClass7TF.A0F(view, R.id.image_preview);
        this.A03 = igImageButton;
        this.A00 = (IgSimpleImageView) AnonymousClass7TE.A0b(view, R.id.icon);
        this.A01 = Dba.A0E(view, R.id.title_text);
        igImageButton.setEnableTouchOverlay(false);
        view.setTag(this);
    }
}
