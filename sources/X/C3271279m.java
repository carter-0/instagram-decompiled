package X;

import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.79m  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C3271279m implements C255763ug {
    public final /* synthetic */ AnonymousClass768 A00;
    public final /* synthetic */ AnonymousClass79c A01;

    public /* synthetic */ C3271279m(AnonymousClass768 r1, AnonymousClass79c r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void D28(ClickableSpan clickableSpan, View view, String str) {
        AnonymousClass768 r0 = this.A00;
        AnonymousClass79c r2 = this.A01;
        AnonymousClass7XR r1 = r0.A01;
        if (r1 != null) {
            AnonymousClass7XI r12 = (AnonymousClass7XI) r1;
            if (!((Boolean) r0.A02.A0E.getValue()).booleanValue()) {
                r12.Cq5(str);
            } else {
                r12.Cq6(view, str, r2.A00.CU2());
            }
        }
    }
}
