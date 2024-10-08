package X;

import android.view.View;

/* renamed from: X.7Do  reason: invalid class name and case insensitive filesystem */
public final class C328127Do implements C328007Db {
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

    public C328127Do(C71662eb r1) {
        this.A00 = r1;
    }
}
