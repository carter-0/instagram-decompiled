package X;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.gradient.IGGradientView;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.Gir  reason: case insensitive filesystem */
public final class C53119Gir extends C249703kE {
    public final IgTextView A00;
    public final IgImageButton A01;

    public C53119Gir(View view) {
        super(view);
        this.A01 = (IgImageButton) AnonymousClass7TE.A0b(view, R.id.image_button);
        this.A00 = Dba.A0E(view, R.id.title_text);
        view.findViewById(R.id.overlay).setBackground(IGGradientView.A00.A01(GradientDrawable.Orientation.BOTTOM_TOP, 153));
    }
}
