package X;

import android.content.DialogInterface;

/* renamed from: X.Of2  reason: case insensitive filesystem */
public final class C71184Of2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ OIT A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public C71184Of2(OIT oit, String str, boolean z) {
        this.A00 = oit;
        this.A01 = str;
        this.A02 = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        OIT oit = this.A00;
        oit.A0D.A0C(this.A01, this.A02, oit.A04);
    }
}
