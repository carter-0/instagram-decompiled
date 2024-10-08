package X;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.3MM  reason: invalid class name */
public final class AnonymousClass3MM {
    public static final AnonymousClass3MM A00 = new Object();

    public final void A00(View view, String str, String str2) {
        0qQ.A0B(view, 0);
        0qQ.A0B(str2, 2);
        WeakReference weakReference = new WeakReference(view);
        2el A01 = AnonymousClass2hM.A01(C226592hN.A00(view));
        if (A01 != null) {
            String valueOf = String.valueOf(hashCode());
            AnonymousClass30Y r0 = AnonymousClass30Y.A07;
            C2354830a r1 = new C2354830a((Object) null, (Object) null, valueOf);
            r1.A00(new C64896Ljw(str, str2, weakReference));
            A01.A05(view, r1.A01());
        }
    }
}
