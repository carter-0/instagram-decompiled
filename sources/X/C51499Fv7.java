package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fv7  reason: case insensitive filesystem */
public final class C51499Fv7 implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ Integer A03;

    public C51499Fv7(Activity activity, View view, UserSession userSession, Integer num) {
        this.A01 = view;
        this.A00 = activity;
        this.A03 = num;
        this.A02 = userSession;
    }

    public final void run() {
        View view = this.A01;
        View view2 = view;
        03T.A00(view, new C51534Fvg(this.A00, view, view2, this.A02, this.A03));
    }
}
