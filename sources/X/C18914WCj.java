package X;

import android.widget.AutoCompleteTextView;

/* renamed from: X.WCj  reason: case insensitive filesystem */
public final class C18914WCj implements AutoCompleteTextView.OnDismissListener {
    public final /* synthetic */ C15224UWb A00;

    public C18914WCj(C15224UWb uWb) {
        this.A00 = uWb;
    }

    public final void onDismiss() {
        C15224UWb uWb = this.A00;
        uWb.A06 = true;
        uWb.A00 = System.currentTimeMillis();
        C15224UWb.A02(uWb, false);
    }
}
