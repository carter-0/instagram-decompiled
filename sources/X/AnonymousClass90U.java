package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.90U  reason: invalid class name */
public final class AnonymousClass90U implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass07Z A01;
    public final /* synthetic */ AnonymousClass72N A02;
    public final /* synthetic */ UserSession A03;

    public AnonymousClass90U(FragmentActivity fragmentActivity, AnonymousClass07Z r2, AnonymousClass72N r3, UserSession userSession) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = fragmentActivity;
        this.A03 = userSession;
    }

    public final void run() {
        AnonymousClass72N r7 = this.A02;
        2Fk r1 = r7.A04;
        AnonymousClass07Z r6 = this.A01;
        r1.A06(r6, new AnonymousClass90W(new AnonymousClass9MQ(16, this.A00, this.A03, r6, r7)));
    }
}
