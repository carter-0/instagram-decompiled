package X;

import android.database.DataSetObserver;

/* renamed from: X.2xk  reason: invalid class name and case insensitive filesystem */
public final class C234362xk extends DataSetObserver {
    public final /* synthetic */ C234342xi A00;

    public C234362xk(C234342xi r1) {
        this.A00 = r1;
    }

    public final void onChanged() {
        super.onChanged();
        C234372xl r1 = this.A00.A05;
        if (r1 == null) {
            0qQ.A0F("simpleZoomableViewController");
            throw AnonymousClass00P.createAndThrow();
        } else if (!r1.isIdle()) {
            r1.A0K = true;
        }
    }

    public final void onInvalidated() {
        super.onInvalidated();
        C234372xl r1 = this.A00.A05;
        if (r1 == null) {
            0qQ.A0F("simpleZoomableViewController");
            throw AnonymousClass00P.createAndThrow();
        } else if (!r1.isIdle()) {
            r1.A0K = true;
        }
    }
}
