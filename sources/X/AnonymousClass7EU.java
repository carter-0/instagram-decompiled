package X;

import android.view.View;

/* renamed from: X.7EU  reason: invalid class name */
public final class AnonymousClass7EU implements C328007Db {
    public final C71662eb A00;

    public final View BJd() {
        View view;
        C71662eb r1 = this.A00;
        if (r1.A00 != null) {
            view = r1.A01();
        } else {
            view = r1.A01;
        }
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public AnonymousClass7EU(C71662eb r1) {
        this.A00 = r1;
    }
}
