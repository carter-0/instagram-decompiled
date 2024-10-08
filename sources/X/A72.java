package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class A72 {
    public final Context A00;
    public final View A01;
    public final C314826iu A02;
    public final AE5 A03;
    public final UserSession A04;

    public A72(Context context, View view, UserSession userSession) {
        this.A00 = context;
        this.A01 = view;
        this.A04 = userSession;
        C314826iu r2 = new C314826iu(C314816it.THREAD, userSession);
        this.A02 = r2;
        AE5 ae5 = new AE5(context, view, userSession, false);
        this.A03 = ae5;
        ae5.A04();
        r2.A01();
    }
}
