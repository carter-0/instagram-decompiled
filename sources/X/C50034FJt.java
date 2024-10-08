package X;

import android.content.DialogInterface;
import java.util.ArrayDeque;

/* renamed from: X.FJt  reason: case insensitive filesystem */
public final class C50034FJt implements DialogInterface.OnDismissListener {
    public static final C50034FJt A00 = new C50034FJt();

    public final void onDismiss(DialogInterface dialogInterface) {
        ArrayDeque arrayDeque = C49316Esz.A00;
        if (!arrayDeque.isEmpty()) {
            arrayDeque.removeLast();
        }
    }
}
