package X;

import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.949  reason: invalid class name */
public final class AnonymousClass949 implements 0gc {
    public final /* synthetic */ C62320sa A00;
    public final /* synthetic */ C62320sa A01;
    public final /* synthetic */ C62320sa A02;

    public AnonymousClass949(C62320sa r1, C62320sa r2, C62320sa r3) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = r3;
    }

    public final /* synthetic */ void EGJ(String str, String str2, String str3, String str4, WeakReference weakReference, boolean z) {
        C62320sa r0;
        List list = AnonymousClass948.A01;
        if (0qQ.A0K(str4, "main_direct") || (0qQ.A0K(str2, "direct_inbox") && !0qQ.A0K(str, "direct_inbox") && 00k.A0u(AnonymousClass948.A00, str))) {
            r0 = this.A02;
        } else if ((00k.A0u(AnonymousClass948.A01, str4) && !0qQ.A0K(str4, "main_direct")) || (0qQ.A0K(str, "direct_inbox") && !0qQ.A0K(str2, "direct_inbox") && 00k.A0u(AnonymousClass948.A00, str2))) {
            r0 = this.A01;
        } else if (!0qQ.A0K(str, "direct_inbox") && 0qQ.A0K(str2, "direct_inbox")) {
            r0 = this.A00;
        } else {
            return;
        }
        r0.invoke();
    }
}
