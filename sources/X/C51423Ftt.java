package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ftt  reason: case insensitive filesystem */
public final class C51423Ftt implements Runnable {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ AnonymousClass57Y A01;
    public final /* synthetic */ UserSession A02;

    public C51423Ftt(Fragment fragment, AnonymousClass57Y r2, UserSession userSession) {
        this.A00 = fragment;
        this.A02 = userSession;
        this.A01 = r2;
    }

    public final void run() {
        if (this.A00.isResumed()) {
            boolean z = AnonymousClass36O.A0G;
            AnonymousClass36Q.A03(this.A01, this.A02, (String) null);
        }
    }
}
