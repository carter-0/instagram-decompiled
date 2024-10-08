package X;

import android.view.View;
import java.util.List;

public final class Q3N implements Runnable {
    public final /* synthetic */ C307786Rm A00;
    public final /* synthetic */ C276544tV A01;
    public final /* synthetic */ List A02;

    public Q3N(C307786Rm r1, C276544tV r2, List list) {
        this.A02 = list;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        String obj;
        int i = -1;
        for (Object next : this.A02) {
            C276544tV r2 = this.A01;
            if (next == null) {
                obj = null;
            } else if (next instanceof String) {
                obj = (String) next;
            } else {
                obj = next.toString();
            }
            C276544tV A002 = C7299Q2y.A00(r2, new C7296Q2v(obj));
            if (A002 == null) {
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("Component with server id: ");
                A1A.append(next);
                1Kn.A00(this.A00, "AccessibilityUtils", AnonymousClass7TF.A0l(" not found in hierarchy.", A1A), (Throwable) null);
            } else {
                View A05 = A002.A05(this.A00);
                if (A05 != null) {
                    A05.setFocusable(true);
                    if (A05.getId() == -1) {
                        A05.setId(View.generateViewId());
                    }
                    if (i != -1) {
                        A05.setAccessibilityTraversalAfter(i);
                    }
                    i = A05.getId();
                }
            }
        }
    }
}
