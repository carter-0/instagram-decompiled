package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.Jov  reason: case insensitive filesystem */
public final class C60648Jov extends C249703kE {
    public final IgLinearLayout A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final C252063oV A03;
    public final SpinnerImageView A04;

    public C60648Jov(View view) {
        super(view);
        this.A00 = (IgLinearLayout) AnonymousClass7TF.A0F(view, R.id.pack_item);
        this.A02 = DbX.A0Z(view, R.id.title);
        this.A03 = DbU.A0Z(view, R.id.bonus_free_stars_stub);
        this.A01 = DbX.A0Z(view, R.id.price);
        this.A04 = (SpinnerImageView) AnonymousClass7TF.A0F(view, R.id.loading);
    }
}
