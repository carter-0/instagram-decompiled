package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.discovery.ui.FixedAspectRatioVideoLayout;
import com.instagram.igds.components.imagebutton.IgImageButton;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.Mzi  reason: case insensitive filesystem */
public final class C68077Mzi extends C249703kE implements C20976X7p, X1S {
    public final ImageView A00;
    public final FixedAspectRatioVideoLayout A01;
    public final IgImageButton A02;
    public final RoundedCornerFrameLayout A03;

    public final void ABK(C232822uV r1, int i) {
    }

    public final IgImageButton BGE() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ FixedAspectRatioVideoLayout BLn() {
        return this.A01;
    }

    public C68077Mzi(View view) {
        super(view);
        this.A03 = (RoundedCornerFrameLayout) AnonymousClass7TE.A0b(view, R.id.preview_container);
        this.A02 = (IgImageButton) AnonymousClass7TE.A0b(view, R.id.image_button);
        this.A01 = (FixedAspectRatioVideoLayout) AnonymousClass7TE.A0b(view, R.id.layout_container);
        this.A00 = (ImageView) AnonymousClass7TE.A0b(view, R.id.icon);
    }
}
