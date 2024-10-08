package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.instagram.common.session.UserSession;

/* renamed from: X.6mO  reason: invalid class name and case insensitive filesystem */
public final class C316896mO {
    public C258103yT A00;
    public View A01;
    public final Context A02;
    public final View A03;
    public final ViewStub A04;
    public final UserSession A05;

    public static View A00(C316896mO r1) {
        View view = r1.A01;
        if (view != null) {
            return view;
        }
        View inflate = r1.A04.inflate();
        r1.A01 = inflate;
        return inflate;
    }

    public C316896mO(View view, ViewStub viewStub, UserSession userSession) {
        this.A02 = view.getContext();
        this.A05 = userSession;
        this.A03 = view;
        this.A04 = viewStub;
    }
}
