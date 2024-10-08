package X;

import android.widget.CompoundButton;

/* renamed from: X.Ol2  reason: case insensitive filesystem */
public final class C71461Ol2 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C70837ONj A01;
    public final /* synthetic */ Integer A02;

    public C71461Ol2(C70837ONj oNj, Integer num, int i) {
        this.A00 = i;
        this.A02 = num;
        this.A01 = oNj;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.A01.A03.FKB(new ODT(this.A02, this.A00, z));
    }
}
