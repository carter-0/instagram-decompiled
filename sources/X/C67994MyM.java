package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.MyM  reason: case insensitive filesystem */
public final class C67994MyM extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final C71662eb A02;
    public final GradientSpinnerAvatarView A03;

    public C67994MyM(View view) {
        super(view);
        ViewStub viewStub;
        this.A03 = DbX.A0j(view, R.id.avatar_container);
        this.A01 = C66582MXn.A0F(view);
        this.A00 = AnonymousClass7TG.A0R(view, R.id.subtitle);
        View findViewById = view.findViewById(R.id.unread_badge_stub);
        if (findViewById instanceof ViewStub) {
            viewStub = (ViewStub) findViewById;
        } else {
            viewStub = null;
        }
        this.A02 = new C71662eb(viewStub);
    }
}
