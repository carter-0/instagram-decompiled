package X;

import android.content.DialogInterface;

public final class AKO implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass8ME A00;
    public final /* synthetic */ String A01;

    public AKO(AnonymousClass8ME r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass8ME r0 = this.A00;
        LTM.A04(r0.A0o, r0.A0r, "STICKER_TRAY", this.A01);
    }
}
