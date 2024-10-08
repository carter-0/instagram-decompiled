package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.DnP  reason: case insensitive filesystem */
public final class C46909DnP extends C249703kE {
    public final C3250370u A00;

    public C46909DnP(View view, UserSession userSession) {
        super(view);
        ViewGroup viewGroup = (ViewGroup) view;
        View A02 = C3250270t.A02(viewGroup, userSession);
        viewGroup.addView(A02);
        this.A00 = (C3250370u) DbT.A0o(A02);
    }
}
