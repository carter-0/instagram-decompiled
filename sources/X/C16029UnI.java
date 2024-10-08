package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.UnI  reason: case insensitive filesystem */
public final class C16029UnI extends C14898UEa {
    public final IgTextView A00;
    public final IgTextView A01;

    public C16029UnI(View view, UserSession userSession) {
        super(view, userSession);
        this.A01 = Dba.A0E(view, R.id.disqualified_lead_title);
        this.A00 = Dba.A0E(view, R.id.disqualified_lead_subtitle);
    }
}
