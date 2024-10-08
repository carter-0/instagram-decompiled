package X;

import android.widget.AutoCompleteTextView;

/* renamed from: X.Wmd  reason: case insensitive filesystem */
public final class C20179Wmd implements Runnable {
    public final /* synthetic */ AutoCompleteTextView A00;
    public final /* synthetic */ C19121WMc A01;

    public C20179Wmd(AutoCompleteTextView autoCompleteTextView, C19121WMc wMc) {
        this.A01 = wMc;
        this.A00 = autoCompleteTextView;
    }

    public final void run() {
        this.A00.removeTextChangedListener(this.A01.A00.A08);
    }
}
