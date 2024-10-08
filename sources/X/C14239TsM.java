package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.TsM  reason: case insensitive filesystem */
public final class C14239TsM extends C249703kE {
    public final View A00;
    public final View A01;
    public final IgTextView A02;
    public final IgImageView A03;

    public C14239TsM(View view) {
        super(view);
        this.A01 = view;
        this.A00 = view.requireViewById(R.id.floating_button_background);
        IgImageView A0b = DbT.A0b(view, R.id.floating_button_image);
        this.A03 = A0b;
        DbU.A14(view.getContext(), A0b, R.color.design_dark_default_color_on_background);
        this.A02 = DbT.A0a(view, R.id.floating_button_text);
    }
}
