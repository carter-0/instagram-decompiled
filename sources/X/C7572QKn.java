package X;

import android.os.Bundle;

/* renamed from: X.QKn  reason: case insensitive filesystem */
public final class C7572QKn extends SDT {
    public final String A00() {
        String string = this.A00.getString("TrackingInfo.ARG_MODULE_NAME", "in_app_browser_v2");
        0qQ.A07(string);
        return string;
    }

    public C7572QKn(Bundle bundle) {
        Bundle A0a;
        if (bundle != null) {
            A0a = Pxe.A0J(bundle);
        } else {
            A0a = AnonymousClass7TE.A0a();
        }
        this.A00 = A0a;
    }

    public C7572QKn() {
    }
}
