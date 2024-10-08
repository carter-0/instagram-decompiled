package X;

import android.content.DialogInterface;

/* renamed from: X.AKa  reason: case insensitive filesystem */
public final class C39934AKa implements DialogInterface.OnClickListener {
    public final /* synthetic */ C3726291q A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C39934AKa(C3726291q r1, String str, String str2) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A00.A01(C391519tD.DISMISS, this.A02, this.A01);
    }
}
