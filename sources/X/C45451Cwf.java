package X;

import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.Cwf  reason: case insensitive filesystem */
public final class C45451Cwf {
    public final String A00;

    public C45451Cwf(String str) {
        C11367SPk.A03(str, DialogModule.KEY_TITLE);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C45451Cwf) && 0qQ.A0K(this.A00, ((C45451Cwf) obj).A00));
    }

    public final int hashCode() {
        return C11367SPk.A02(this.A00, 1);
    }
}
