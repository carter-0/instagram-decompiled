package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* renamed from: X.9Yp  reason: invalid class name and case insensitive filesystem */
public final class C380549Yp extends C249703kE {
    public A75 A00;
    public final View A01;
    public final IgTextView A02;
    public final AnonymousClass3NM A03;
    public final ConstrainedImageView A04;

    public C380549Yp(View view) {
        super(view);
        this.A01 = view;
        this.A04 = (ConstrainedImageView) AnonymousClass7TF.A0F(view, R.id.sticker_sheet_redesign_item_drawable);
        this.A02 = AnonymousClass7TF.A0F(view, R.id.new_badge);
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(view);
        A0m.A0C = true;
        A0m.A07 = true;
        this.A03 = C386359kT.A00(A0m, this, 3);
    }
}
