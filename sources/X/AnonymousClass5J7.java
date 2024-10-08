package X;

import android.app.Activity;
import java.util.Iterator;

/* renamed from: X.5J7  reason: invalid class name */
public final class AnonymousClass5J7 implements AnonymousClass5J8 {
    public final /* synthetic */ C265624Vm A00;

    public final void E0T(Activity activity, C265674Vs r7) {
        Iterator it = this.A00.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass5JC r2 = (AnonymousClass5JC) it.next();
            if (0qQ.A0K(r2.A01, activity)) {
                0qQ.A0B(r7, 0);
                r2.A00 = r7;
                r2.A03.execute(new AnonymousClass5JD(r7, r2));
            }
        }
    }

    public AnonymousClass5J7(C265624Vm r1) {
        this.A00 = r1;
    }
}
