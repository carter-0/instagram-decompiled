package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.AnP  reason: case insensitive filesystem */
public final class C41041AnP implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ UserSession A01;

    public C41041AnP(View view, UserSession userSession) {
        this.A00 = view;
        this.A01 = userSession;
    }

    public final void run() {
        C355098Oo.A06(new View[]{this.A00}, true, true);
        0xY A0N = AnonymousClass7TF.A0N(this.A01);
        A0N.E5T("has_seen_valentines_sticker_tray_icon", true);
        A0N.apply();
    }
}
