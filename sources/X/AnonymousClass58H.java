package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.58H  reason: invalid class name */
public final class AnonymousClass58H extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass58H(2Lk r7) {
        super("LogStaticAttributes", 588907844, 3, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        Context context = (Context) r1.A06.get();
        0qQ.A0B(userSession, 0);
        if (context != null) {
            try {
                boolean z = false;
                if (W2z.A00(context) != null) {
                    z = true;
                }
                if (Boolean.valueOf(z).booleanValue()) {
                    0wc A02 = AnonymousClass0kN.A02(userSession);
                    C20365Wq5 wq5 = new C20365Wq5(new 1Ln(A02.A00(A02.A00, "ig_device_static_attributes"), 212));
                    if (W2z.A3W == null) {
                        synchronized (W2z.class) {
                            if (W2z.A3W == null) {
                                W2z.A3W = new W2z(context);
                            }
                        }
                    }
                    W2z w2z = W2z.A3W;
                    w2z.A03.post(new C20269WoK(w2z, wq5, W2z.A3V));
                }
            } catch (Exception unused) {
                0xa r3 = AnonymousClass0xl.A00(C61170le.A00).A00;
                int i = r3.getInt("preference_static_attributes_logging_failure_count", 0) + 1;
                0xY AR4 = r3.AR4();
                AR4.E5Z("preference_static_attributes_logging_failure_count", i);
                AR4.apply();
                r3.getInt("preference_static_attributes_logging_failure_count", 0);
            }
        }
    }
}
