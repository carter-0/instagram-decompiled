package X;

import android.view.View;

/* renamed from: X.Q3d  reason: case insensitive filesystem */
public final class C7302Q3d implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C307786Rm A01;
    public final /* synthetic */ Object A02;

    public C7302Q3d(View view, C307786Rm r2, Object obj) {
        this.A02 = obj;
        this.A01 = r2;
        this.A00 = view;
    }

    public final void run() {
        String obj;
        String str;
        String format;
        C276544tV A002;
        Object obj2 = this.A02;
        if (obj2 instanceof String) {
            obj = (String) obj2;
        } else {
            obj = obj2.toString();
        }
        C307786Rm r4 = this.A01;
        C276544tV A05 = C307476Qg.A02(r4).A05();
        if (A05 == null || (A002 = C7299Q2y.A00(A05, new C7296Q2v(obj))) == null) {
            str = "AccessibilityUtils";
            format = String.format("Component does not exist in the hierarchy for id: %s. Is the component with this ID not yet rendered? If so, this will not work.", C66581MXm.A1b(obj, 1));
            0qQ.A07(format);
        } else {
            View A052 = A002.A05(r4);
            if (A052 == null) {
                str = "AccessibilityUtils";
                format = 002.A0R("No View found for component with id: ", obj);
            } else {
                int id = A052.getId();
                if (id == -1) {
                    id = View.generateViewId();
                    A052.setId(id);
                }
                this.A00.setLabelFor(id);
                return;
            }
        }
        1Kn.A00(r4, str, format, (Throwable) null);
    }
}
