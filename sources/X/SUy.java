package X;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

public final class SUy implements DialogInterface.OnClickListener {
    public final WeakReference A00;

    public final void onClick(DialogInterface dialogInterface, int i) {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            ((QDG) weakReference.get()).A04(true);
        }
    }

    public SUy(QDG qdg) {
        this.A00 = C51965G9l.A0v(qdg);
    }
}
