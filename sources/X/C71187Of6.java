package X;

import android.content.DialogInterface;

/* renamed from: X.Of6  reason: case insensitive filesystem */
public final class C71187Of6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ NV7 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public C71187Of6(NV7 nv7, String str, boolean z, boolean z2) {
        this.A00 = nv7;
        this.A01 = str;
        this.A02 = z;
        this.A03 = z2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        NV7 nv7 = this.A00;
        nv7.A0M();
        nv7.A0E().A0C(this.A01, this.A02, this.A03);
    }
}
