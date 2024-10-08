package X;

import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

/* renamed from: X.6PF  reason: invalid class name */
public final class AnonymousClass6PF {
    public IgTextView A00;
    public IgTextView A01;
    public IgTextView A02;
    public RoundedCornerImageView A03;
    public RoundedCornerConstraintLayout A04;
    public final C252063oV A05;

    public final RoundedCornerImageView A00() {
        RoundedCornerImageView roundedCornerImageView = this.A03;
        if (roundedCornerImageView != null) {
            return roundedCornerImageView;
        }
        0qQ.A0F("image");
        throw AnonymousClass00P.createAndThrow();
    }

    public final RoundedCornerConstraintLayout A01() {
        RoundedCornerConstraintLayout roundedCornerConstraintLayout = this.A04;
        if (roundedCornerConstraintLayout != null) {
            return roundedCornerConstraintLayout;
        }
        0qQ.A0F("container");
        throw AnonymousClass00P.createAndThrow();
    }

    public AnonymousClass6PF(C252063oV r2) {
        this.A05 = r2;
        r2.EeU(new AnonymousClass6PG(this));
    }
}
