package X;

import android.content.DialogInterface;

public final class AKH implements DialogInterface.OnClickListener {
    public final /* synthetic */ Runnable A00;

    public AKH(Runnable runnable) {
        this.A00 = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A00.run();
    }
}
