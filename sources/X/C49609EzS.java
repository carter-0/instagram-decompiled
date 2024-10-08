package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.EzS  reason: case insensitive filesystem */
public final class C49609EzS {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final GradientSpinnerAvatarView A03;

    public C49609EzS(View view) {
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A03 = DbX.A0j(view, R.id.follow_list_user_imageview);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.follow_list_mutual_count);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.follow_list_comma_separated);
    }
}
