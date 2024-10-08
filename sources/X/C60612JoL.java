package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.JoL  reason: case insensitive filesystem */
public final class C60612JoL extends C249703kE {
    public final ViewGroup A00;
    public final IgTextView A01;
    public final IgImageView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60612JoL(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = (ViewGroup) view;
        this.A02 = JTR.A0i(view, R.id.alt_text_carousel_image_view);
        this.A01 = Dba.A0E(view, R.id.alt_text_carousel_text_view);
    }
}
