package X;

import android.text.Editable;

/* renamed from: X.Fgc  reason: case insensitive filesystem */
public final class C50677Fgc implements G98 {
    public boolean A00 = true;
    public final /* synthetic */ C46656Dib A01;

    public final void DFS() {
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C50677Fgc(C46656Dib dib) {
        this.A01 = dib;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.A00) {
            this.A01.A10 = true;
        }
        C46656Dib dib = this.A01;
        if (dib.A0N != null) {
            dib.A0N.setEnabled(dib.A0j.A0D());
        }
    }

    public final void setEnabled(boolean z) {
        this.A00 = z;
    }
}
