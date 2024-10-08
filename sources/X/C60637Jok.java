package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Jok  reason: case insensitive filesystem */
public final class C60637Jok extends C249703kE {
    public final View A00;
    public final ImageView A01;
    public final IgImageView A02;
    public final C59740JVy A03;

    public C60637Jok(View view) {
        super(view);
        this.A02 = DbX.A0b(view, R.id.gallery_grid_item_thumbnail);
        C59740JVy jVy = new C59740JVy(AnonymousClass7TE.A0S(view));
        this.A03 = jVy;
        View requireViewById = view.requireViewById(R.id.gallery_grid_item_selection_circle);
        ImageView imageView = (ImageView) requireViewById;
        imageView.setImageDrawable(jVy);
        0qQ.A07(requireViewById);
        this.A01 = imageView;
        this.A00 = AnonymousClass7TF.A0G(view, R.id.gallery_grid_item_selection_overlay);
    }
}
