package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.M8b  reason: case insensitive filesystem */
public final class C66016M8b implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C66445MRz A02;

    public C66016M8b(Activity activity, UserSession userSession, C66445MRz mRz) {
        this.A02 = mRz;
        this.A00 = activity;
        this.A01 = userSession;
    }

    public final void run() {
        this.A02.Dqr(C226132fh.A00(this.A00, this.A01));
    }
}
