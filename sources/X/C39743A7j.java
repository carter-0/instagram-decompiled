package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.A7j  reason: case insensitive filesystem */
public final class C39743A7j {
    public final Context A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final A5O A04;
    public final ViewStub A05;
    public final UserSession A06;

    public C39743A7j(Context context, ViewStub viewStub, UserSession userSession) {
        0qQ.A0B(viewStub, 2);
        this.A00 = context;
        this.A05 = viewStub;
        this.A06 = userSession;
        View inflate = viewStub.inflate();
        0qQ.A07(inflate);
        this.A01 = inflate;
        this.A03 = AnonymousClass7TG.A0R(inflate, R.id.feature_limited_composer_header_title);
        this.A02 = AnonymousClass7TG.A0R(inflate, R.id.feature_limited_composer_header_subtitle);
        this.A04 = new A5O(userSession);
    }
}
