package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

/* renamed from: X.OhI  reason: case insensitive filesystem */
public final class C71277OhI implements TextWatcher {
    public String A00;
    public final TextView.OnEditorActionListener A01;
    public final Integer A02;
    public final String A03;
    public final boolean A04;
    public final C74369Ptj A05;

    public final void afterTextChanged(Editable editable) {
        0qQ.A0B(editable, 0);
        String obj = editable.toString();
        this.A00 = obj;
        this.A05.onTextChanged(obj);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C71277OhI(TextView.OnEditorActionListener onEditorActionListener, C74369Ptj ptj, Integer num, String str, String str2, boolean z) {
        C51974G9v.A1P(str, str2, ptj, onEditorActionListener);
        this.A03 = str;
        this.A00 = str2;
        this.A05 = ptj;
        this.A01 = onEditorActionListener;
        this.A02 = num;
        this.A04 = z;
    }
}
