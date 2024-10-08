package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

public final class UDI extends C249703kE {
    public final IgImageView A00;
    public final IgdsMediaButton A01;
    public final C17533VZm A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDI(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A02 = new C17533VZm(view, view.getId());
        this.A01 = (IgdsMediaButton) AnonymousClass7TF.A0F(view, R.id.see_all);
        IgImageView requireViewById = view.requireViewById(R.id.image);
        IgImageView igImageView = requireViewById;
        igImageView.A0I = WTU.A00;
        0qQ.A07(requireViewById);
        this.A00 = igImageView;
    }
}
