package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.FuN  reason: case insensitive filesystem */
public final class C51453FuN implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public C51453FuN(UserSession userSession, Activity activity, String str) {
        this.A00 = activity;
        this.A01 = userSession;
        this.A02 = str;
    }

    public final void run() {
        new C49695F2f(this.A00, (Fragment) null, (28D) null, this.A01, this.A02).A00();
    }
}
