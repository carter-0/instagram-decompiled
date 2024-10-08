package X;

import android.widget.AutoCompleteTextView;

/* renamed from: X.Wmc  reason: case insensitive filesystem */
public final class C20178Wmc implements Runnable {
    public final /* synthetic */ AutoCompleteTextView A00;
    public final /* synthetic */ UWG A01;

    public C20178Wmc(AutoCompleteTextView autoCompleteTextView, UWG uwg) {
        this.A01 = uwg;
        this.A00 = autoCompleteTextView;
    }

    public final void run() {
        boolean isPopupShowing = this.A00.isPopupShowing();
        C15224UWb uWb = this.A01.A00;
        C15224UWb.A02(uWb, isPopupShowing);
        uWb.A06 = isPopupShowing;
    }
}
