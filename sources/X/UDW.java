package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class UDW extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final IgImageView A02;
    public final C17533VZm A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDW(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A03 = new C17533VZm(view, view.getId());
        this.A01 = C66582MXn.A0F(view);
        this.A00 = AnonymousClass7TG.A0R(view, R.id.subtitle);
        IgImageView requireViewById = view.requireViewById(R.id.image);
        IgImageView igImageView = requireViewById;
        igImageView.A0I = WTT.A00;
        0qQ.A07(requireViewById);
        this.A02 = igImageView;
    }
}
