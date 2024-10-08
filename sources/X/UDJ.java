package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class UDJ extends C249703kE {
    public final Context A00;
    public final TextView A01;
    public final UserSession A02;

    public UDJ(View view, UserSession userSession) {
        super(view);
        this.A00 = AnonymousClass7TE.A0S(view);
        this.A02 = userSession;
        this.A01 = AnonymousClass7TG.A0R(view, R.id.text);
    }
}
