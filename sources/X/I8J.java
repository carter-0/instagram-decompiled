package X;

import android.content.DialogInterface;

public final class I8J implements DialogInterface.OnClickListener {
    public final /* synthetic */ C56911IHg A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public I8J(C56911IHg iHg, String str, String str2, String str3) {
        this.A00 = iHg;
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C56911IHg iHg = this.A00;
        LTV.A09(iHg.A04.requireActivity(), iHg.A0A, this.A01, (String) null, this.A03, this.A02);
    }
}
