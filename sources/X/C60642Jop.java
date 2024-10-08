package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.Jop  reason: case insensitive filesystem */
public final class C60642Jop extends C249703kE {
    public final AnonymousClass0iw A00 = DbS.A0O("media_kit_selected_picker_item");
    public final IgImageButton A01;
    public final IgImageButton A02 = ((IgImageButton) AnonymousClass7TF.A0F(this.itemView, R.id.mk_delete_selected_media));
    public final K5B A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60642Jop(View view, K5B k5b) {
        super(view);
        0qQ.A0B(k5b, 2);
        this.A03 = k5b;
        View requireViewById = this.itemView.requireViewById(R.id.mini_media_image_view);
        IgImageButton igImageButton = (IgImageButton) requireViewById;
        igImageButton.A00 = 1.0f;
        0qQ.A07(requireViewById);
        this.A01 = igImageButton;
    }
}
