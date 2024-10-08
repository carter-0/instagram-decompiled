package X;

import android.app.Dialog;
import android.view.View;

/* renamed from: X.0oc  reason: invalid class name */
public final class AnonymousClass0oc extends AnonymousClass06A {
    public final /* synthetic */ 0SM A00;
    public final /* synthetic */ AnonymousClass06A A01;

    public AnonymousClass0oc(0SM r1, AnonymousClass06A r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final View A00(int i) {
        AnonymousClass06A r1 = this.A01;
        if (r1.A01()) {
            return r1.A00(i);
        }
        Dialog dialog = this.A00.A01;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    public final boolean A01() {
        if (this.A01.A01() || this.A00.A06) {
            return true;
        }
        return false;
    }
}
