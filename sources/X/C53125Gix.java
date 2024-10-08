package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Gix  reason: case insensitive filesystem */
public final class C53125Gix extends C249703kE {
    public final ImageView A00;
    public final IgTextView A01;
    public final IgTextView A02;

    public C53125Gix(View view) {
        super(view);
        this.A02 = DbX.A0Z(view, R.id.metadata_name);
        this.A01 = DbX.A0Z(view, R.id.marquee_metadata_name);
        this.A00 = DbX.A0J(view, R.id.metadata_icon);
    }
}
