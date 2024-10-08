package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.JoU  reason: case insensitive filesystem */
public final class C60621JoU extends C249703kE {
    public final IgImageButton A00;
    public final IgImageButton A01 = ((IgImageButton) AnonymousClass7TF.A0F(this.itemView, R.id.mk_delete_selected_media));
    public final K5B A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60621JoU(View view, K5B k5b) {
        super(view);
        0qQ.A0B(k5b, 2);
        this.A02 = k5b;
        View requireViewById = this.itemView.requireViewById(R.id.mini_media_image_view);
        IgImageButton igImageButton = (IgImageButton) requireViewById;
        igImageButton.A00 = 1.0f;
        0qQ.A07(requireViewById);
        this.A00 = igImageButton;
    }
}
