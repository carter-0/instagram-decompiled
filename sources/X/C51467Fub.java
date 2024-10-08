package X;

import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fub  reason: case insensitive filesystem */
public final class C51467Fub implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ EM0 A01;
    public final /* synthetic */ ED8 A02;

    public C51467Fub(UserSession userSession, EM0 em0, ED8 ed8) {
        this.A02 = ed8;
        this.A00 = userSession;
        this.A01 = em0;
    }

    public final void run() {
        DbT.A15();
        UserSession userSession = this.A00;
        EM0 em0 = this.A01;
        String str = em0.A00;
        String str2 = em0.A01;
        ED8 ed8 = this.A02;
        Uri uri = ed8.A05;
        Bundle A09 = DbY.A09(userSession);
        A09.putString("argument_token", str);
        A09.putString("argument_source", str2);
        if (uri != null) {
            A09.putParcelable("argument_redirect_uri", uri);
        }
        AnonymousClass4DH r2 = new AnonymousClass4DH();
        r2.setArguments(A09);
        Dbb.A12(r2, ed8.A00, ed8.A02);
    }
}
