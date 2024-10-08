package X;

import android.text.Editable;

public final class H80 extends 0lr {
    public final int A00;
    public final Object A01;

    public H80(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void afterTextChanged(Editable editable) {
        if (this.A00 != 0) {
            H80.super.afterTextChanged(editable);
            return;
        }
        0qQ.A0B(editable, 0);
        ((IOA) this.A01).A08();
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(charSequence, 0);
                H80.super.onTextChanged(charSequence, i, i2, i3);
                return;
            case 1:
                0qQ.A0B(charSequence, 0);
                H80.super.onTextChanged(charSequence, i, i2, i3);
                ((C14894UDw) this.A01).A04.setEnabled(AnonymousClass7TF.A1R(charSequence.length()));
                return;
            default:
                0qQ.A0B(charSequence, 0);
                H80.super.onTextChanged(charSequence, i, i2, i3);
                C60291Jio A002 = C57106IOu.A00((C57106IOu) this.A01);
                String obj = charSequence.toString();
                0qQ.A0B(obj, 0);
                C60291Jio.A00((M0V) null, A002, obj, 15, false, false, false);
                return;
        }
    }
}
