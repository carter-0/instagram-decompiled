package X;

import android.widget.CompoundButton;

/* renamed from: X.FRj  reason: case insensitive filesystem */
public final class C50151FRj implements 2Kw {
    public final /* synthetic */ CompoundButton A00;
    public final /* synthetic */ 0r1 A01;
    public final /* synthetic */ boolean A02;

    public C50151FRj(CompoundButton compoundButton, 0r1 r2, boolean z) {
        this.A00 = compoundButton;
        this.A01 = r2;
        this.A02 = z;
    }

    public final void invoke(Throwable th) {
        CompoundButton compoundButton = this.A00;
        compoundButton.setEnabled(true);
        this.A01.A00 = false;
        compoundButton.setChecked(!this.A02);
    }
}
