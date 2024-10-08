package X;

import android.content.DialogInterface;

/* renamed from: X.AJb  reason: case insensitive filesystem */
public final class C39910AJb implements DialogInterface.OnCancelListener {
    public final /* synthetic */ C353498Hw A00;

    public C39910AJb(C353498Hw r1) {
        this.A00 = r1;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C353498Hw r2 = this.A00;
        27p.A01(r2.A1D).A1l("EXIT_DIALOG_CANCEL");
        C353498Hw.A0n(r2);
    }
}
