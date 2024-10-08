package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.A7k  reason: case insensitive filesystem */
public final class C39744A7k {
    public final Context A00;
    public final View A01;
    public final TextView A02;
    public final FragmentActivity A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final ViewStub A06;

    public C39744A7k(Context context, ViewStub viewStub, FragmentActivity fragmentActivity, AnonymousClass0iw r6, UserSession userSession) {
        0qQ.A0B(viewStub, 2);
        this.A00 = context;
        this.A06 = viewStub;
        this.A05 = userSession;
        this.A04 = r6;
        this.A03 = fragmentActivity;
        View inflate = viewStub.inflate();
        0qQ.A07(inflate);
        this.A01 = inflate;
        this.A02 = AnonymousClass7TG.A0R(inflate, R.id.professional_hmps_limited_composer_content);
    }
}
