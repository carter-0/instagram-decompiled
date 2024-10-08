package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.8bJ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C358688bJ implements AnonymousClass0eK {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C358368an A01;

    public /* synthetic */ C358688bJ(UserSession userSession, C358368an r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }

    public final Object get() {
        C358368an r4 = this.A01;
        UserSession userSession = this.A00;
        View view = r4.A15;
        ViewGroup viewGroup = r4.A16;
        0qQ.A0B(view, 1);
        0qQ.A0B(viewGroup, 2);
        return new AnonymousClass91a(view, viewGroup, userSession, r4, AnonymousClass05K.A01, R.id.text_overlay_edit_text, R.id.postcapture_text_alignment_button);
    }
}
