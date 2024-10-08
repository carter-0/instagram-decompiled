package X;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

/* renamed from: X.Jf4  reason: case insensitive filesystem */
public final class C60071Jf4 extends Toast {
    public static final LBZ A01 = new Object();
    public final Context A00;

    public final void show() {
        try {
            Context context = this.A00;
            02V.A07(AnonymousClass7TF.A1V(context), "context is null");
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                02V.A07(!activity.isFinishing(), "activity is finishing");
                02V.A07(!activity.isDestroyed(), "activity is destroyed");
            }
            0KC.A0H("IGToast", "Showing IG Toast", new Throwable());
            super.show();
        } catch (IllegalStateException e) {
            0wb.A06("IGToast", "Context is invalid", e);
        }
    }

    public C60071Jf4(Context context) {
        super(context);
        this.A00 = context;
    }
}
