package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.M9e  reason: case insensitive filesystem */
public final /* synthetic */ class C66045M9e implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 26t A03;

    public /* synthetic */ C66045M9e(Activity activity, View view, UserSession userSession, 26t r4) {
        this.A00 = activity;
        this.A01 = view;
        this.A02 = userSession;
        this.A03 = r4;
    }

    public final void run() {
        Activity activity = this.A00;
        View view = this.A01;
        UserSession userSession = this.A02;
        26t r3 = this.A03;
        AnonymousClass5Gt A0e = AnonymousClass7TG.A0e(activity, 2131953427);
        A0e.A03(view);
        A0e.A01();
        A0e.A0B = true;
        A0e.A00 = 5000;
        A0e.A0A = true;
        A0e.A00().A07(userSession);
        0xY AR4 = r3.A00.AR4();
        AR4.E5T("key_has_seen_coin_flip_mimicry_tooltip", true);
        AR4.apply();
    }
}
