package X;

import android.content.DialogInterface;

public final class I9F implements DialogInterface.OnDismissListener {
    public final /* synthetic */ C273384mU A00;
    public final /* synthetic */ C315346jk A01;

    public I9F(C273384mU r1, C315346jk r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.A01.A00 = false;
        this.A00.EHd();
    }
}
