package X;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.IFb  reason: case insensitive filesystem */
public final class C56854IFb implements MRM {
    public final View A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A00(0eO.A02, new C58682Ivr(this, 37));
    public final AnonymousClass03a A02;

    public final void Exc() {
        if (Build.VERSION.SDK_INT >= 34) {
            HR7.A00(this.A00, (InputMethodManager) this.A01.getValue());
        }
    }

    public C56854IFb(View view) {
        this.A00 = view;
        this.A02 = new AnonymousClass03a(view);
    }
}
