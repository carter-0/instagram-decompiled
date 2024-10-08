package X;

import androidx.activity.ComponentActivity;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.8CY  reason: invalid class name */
public final class AnonymousClass8CY {
    public final AnonymousClass8CX A00;
    public final WeakReference A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new C377269Le(this, 28));
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;

    public AnonymousClass8CY(ComponentActivity componentActivity, UserSession userSession, AnonymousClass8CX r9) {
        0qQ.A0B(componentActivity, 2);
        this.A00 = r9;
        this.A04 = new C227862kA(new C377269Le(componentActivity, 29), AnonymousClass8CZ.A00, new C377429Lu(13, (Object) null, componentActivity), new 0Yh(C352178Ca.class));
        this.A01 = new WeakReference(componentActivity);
        this.A03 = AnonymousClass0eN.A01(new C377429Lu(12, userSession, this));
        androidx.core.app.ComponentActivity componentActivity2 = (androidx.core.app.ComponentActivity) this.A01.get();
        if (componentActivity2 != null) {
            AnonymousClass0xx A002 = C71772f0.A00(componentActivity2.getLifecycle());
            C376889Js r2 = new C376889Js(this, (AnonymousClass4D7) null, 38);
            1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A002);
        }
        androidx.core.app.ComponentActivity componentActivity3 = (androidx.core.app.ComponentActivity) this.A01.get();
        if (componentActivity3 != null) {
            AnonymousClass0xx A003 = C71772f0.A00(componentActivity3.getLifecycle());
            C376889Js r22 = new C376889Js(this, (AnonymousClass4D7) null, 39);
            1Eo.A03(AnonymousClass05K.A00, 19B.A00, r22, A003);
        }
    }
}
