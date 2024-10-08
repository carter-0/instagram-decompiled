package X;

import android.content.DialogInterface;

public final class AL1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ AnonymousClass84J A00;

    public AL1(AnonymousClass84J r1) {
        this.A00 = r1;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass84J r2 = this.A00;
        r2.A00 = System.currentTimeMillis();
        r2.A01 = false;
    }
}
