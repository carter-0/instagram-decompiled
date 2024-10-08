package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Jp9  reason: case insensitive filesystem */
public final class C60662Jp9 extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final CircularImageView A03;
    public final IgImageView A04;
    public final IgImageView A05;

    public C60662Jp9(View view) {
        super(view);
        this.A03 = (CircularImageView) view.findViewById(R.id.profile_picture);
        this.A02 = AnonymousClass7TE.A0d(view, R.id.username);
        this.A01 = AnonymousClass7TE.A0d(view, R.id.subtext);
        this.A05 = JTO.A0Y(view, R.id.verified_icon);
        this.A04 = JTO.A0Y(view, R.id.badge_tier_icon);
        this.A00 = AnonymousClass7TE.A0d(view, R.id.badge_count);
    }
}
