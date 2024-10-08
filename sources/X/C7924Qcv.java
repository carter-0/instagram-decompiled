package X;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: X.Qcv  reason: case insensitive filesystem */
public abstract class C7924Qcv extends QCA {
    public WeakReference A00 = C51965G9l.A0v((Object) null);

    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        super.onAttach(context);
        if (context instanceof C13443TaW) {
            this.A00 = C51965G9l.A0v(context);
        }
    }
}
