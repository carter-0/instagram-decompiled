package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Doi  reason: case insensitive filesystem */
public final class C46990Doi extends C249703kE {
    public final View A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;
    public final IgTextView A03;

    public C46990Doi(View view) {
        super(view);
        this.A00 = view;
        this.A01 = (IgSimpleImageView) AnonymousClass7TE.A0b(view, R.id.campfire_create_row_photo);
        this.A03 = Dba.A0E(view, R.id.campfire_create_row_title);
        this.A02 = Dba.A0E(view, R.id.campfire_create_row_subtitle);
    }
}
