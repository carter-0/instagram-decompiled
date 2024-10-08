package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;

/* renamed from: X.9ml  reason: invalid class name and case insensitive filesystem */
public final class C387779ml extends AnonymousClass9YS {
    public TextView A00;
    public IgImageView A01;
    public User A02;
    public final AnonymousClass3NM A03;
    public final 0sP A04;

    public C387779ml(View view, 0sP r5) {
        super(view);
        this.A04 = r5;
        this.A01 = AnonymousClass7TF.A0F(view, R.id.reel_tagging_profile_view);
        this.A00 = AnonymousClass7TG.A0R(view, R.id.reel_tagging_name_view);
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(view);
        A0m.A07 = true;
        this.A03 = C386359kT.A00(A0m, this, 15);
    }
}
