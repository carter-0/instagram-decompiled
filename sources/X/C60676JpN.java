package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igtv.widget.ExpandableTextView;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.JpN  reason: case insensitive filesystem */
public final class C60676JpN extends C249703kE {
    public final int A00;
    public final int A01;
    public final View A02;
    public final TextView A03;
    public final TextView A04;
    public final UserSession A05;
    public final IgImageView A06;
    public final C61417K6o A07;
    public final ExpandableTextView A08;
    public final FollowButton A09;
    public final AnonymousClass0eM A0A;

    public C60676JpN(View view, UserSession userSession, C61417K6o k6o) {
        super(view);
        this.A05 = userSession;
        this.A07 = k6o;
        IgImageView A0Y = JTO.A0Y(view, R.id.profile_picture);
        this.A06 = A0Y;
        TextView A0d = AnonymousClass7TE.A0d(view, R.id.user_name);
        this.A04 = A0d;
        TextView A0d2 = AnonymousClass7TE.A0d(view, R.id.user_name_full);
        this.A03 = A0d2;
        ExpandableTextView expandableTextView = (ExpandableTextView) view.findViewById(R.id.series_description);
        this.A08 = expandableTextView;
        this.A02 = view.findViewById(R.id.info_separator);
        this.A09 = (FollowButton) view.findViewById(R.id.follow_button);
        Context context = view.getContext();
        this.A00 = context.getColor(2Yu.A0D(context));
        this.A01 = DbV.A01(context);
        this.A0A = AnonymousClass0eN.A01(new C58185Inp(46, view, this));
        expandableTextView.setTextLayoutHorizontalPadding(AnonymousClass7TH.A01(context));
        expandableTextView.A01 = new C65415Lsv(this);
        LY6.A01(A0d, 1, this);
        LY6.A01(A0d2, 2, this);
        LY6.A01(A0Y, 3, this);
    }
}
