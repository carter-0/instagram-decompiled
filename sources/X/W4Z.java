package X;

import android.content.DialogInterface;

public final class W4Z implements DialogInterface.OnCancelListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;

    public W4Z(Object obj, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = z;
        this.A02 = z2;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        if (this.A00 != 0) {
            ((C15311UaI) this.A01).A01().A01(this.A03, this.A02);
        } else {
            ((UaM) this.A01).A02().A07(this.A03, this.A02);
        }
    }
}
