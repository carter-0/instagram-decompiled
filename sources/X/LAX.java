package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

public final class LAX {
    public final Context A00;
    public final View A01;
    public final View A02;
    public final ImageView A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final IgTextView A06;

    public LAX(View view) {
        0qQ.A0B(view, 1);
        Context A0S = AnonymousClass7TE.A0S(view);
        this.A00 = A0S;
        Resources resources = A0S.getResources();
        this.A01 = view;
        this.A02 = view.requireViewById(R.id.fundraiser_cta_description_layout);
        ImageView A0F = DbU.A0F(view, R.id.thumbnail_image);
        this.A03 = A0F;
        this.A06 = DbT.A0a(view, R.id.fundraiser_title);
        this.A05 = DbT.A0a(view, R.id.fundraiser_subtitle);
        this.A04 = DbT.A0a(view, R.id.fundraiser_cta_button);
        A0F.setImageDrawable(new GIH(A0S, (GJO) null, resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width), AnonymousClass7TE.A0H(resources), 0, 0, 0, -1, false));
    }
}
