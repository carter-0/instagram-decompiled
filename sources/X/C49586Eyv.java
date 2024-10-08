package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Eyv  reason: case insensitive filesystem */
public final class C49586Eyv {
    public final Context A00;
    public final View A01;
    public final UserSession A02;
    public final IgTextView A03;

    public C49586Eyv(Context context, ViewStub viewStub, UserSession userSession) {
        0qQ.A0B(viewStub, 2);
        this.A02 = userSession;
        View inflate = viewStub.inflate();
        this.A01 = inflate;
        IgTextView A0Z = DbX.A0Z(inflate, R.id.xac_thread_disabled_text);
        this.A03 = A0Z;
        Context context2 = inflate.getContext();
        String A16 = AnonymousClass7TE.A16(context2, 2131960768);
        this.A00 = context2;
        String A0h = DbW.A0h(context, A16, 2131960767);
        int A022 = DbV.A02(context);
        AnonymousClass7AV.A07(new E8Z(new 04x(16, A16), this, AnonymousClass05K.A01, A16, A022), A0Z, A16, A0h);
    }
}
