package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Gis  reason: case insensitive filesystem */
public final class C53120Gis extends C249703kE {
    public final IgTextView A00;
    public final IgImageView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53120Gis(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A01 = DbX.A0b(view, R.id.icon_overlay_view);
        this.A00 = DbX.A0Z(view, R.id.title);
    }
}
