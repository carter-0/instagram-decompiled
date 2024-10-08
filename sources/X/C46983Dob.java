package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.Dob  reason: case insensitive filesystem */
public final class C46983Dob extends C249703kE {
    public final View.OnClickListener A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final CircularImageView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46983Dob(View view, G9Z g9z) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = FPI.A00(g9z, 14);
        this.A03 = DbX.A0a(view, R.id.discover_people_image_view);
        this.A02 = DbX.A0Z(view, R.id.discover_people_row_title);
        this.A01 = DbX.A0Z(view, R.id.discover_people_row_subtitle);
    }
}
