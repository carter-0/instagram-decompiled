package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.UDa  reason: case insensitive filesystem */
public final class C14872UDa extends C249703kE {
    public UpcomingEvent A00;
    public final ImageView A01;
    public final UserSession A02;
    public final AnonymousClass3NM A03;

    public C14872UDa(View view, UserSession userSession, AnonymousClass8MS r6) {
        super(view);
        this.A02 = userSession;
        ImageView A0J = DbX.A0J(view, R.id.upcoming_event_sticker);
        this.A01 = A0J;
        AnonymousClass3NG r2 = new AnonymousClass3NG(A0J);
        r2.A07 = true;
        r2.A04 = new C15845UjV(7, r6, this);
        this.A03 = r2.A00();
    }
}
