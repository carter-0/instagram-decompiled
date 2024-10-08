package X;

import android.content.DialogInterface;

public final class AKG implements DialogInterface.OnClickListener {
    public final /* synthetic */ Runnable A00;

    public AKG(Runnable runnable) {
        this.A00 = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A00.run();
    }
}
