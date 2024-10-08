package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.My3  reason: case insensitive filesystem */
public final class C67978My3 extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final GradientSpinnerAvatarView A02;

    public C67978My3(View view) {
        super(view);
        this.A00 = AnonymousClass7TG.A0R(view, R.id.row_user_primary_name);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.row_user_secondary_name);
        this.A02 = DbX.A0j(view, R.id.row_user_avatar);
    }
}
