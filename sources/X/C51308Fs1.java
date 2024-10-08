package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;

/* renamed from: X.Fs1  reason: case insensitive filesystem */
public final class C51308Fs1 implements Runnable {
    public final /* synthetic */ Context A00;

    public C51308Fs1(Context context) {
        this.A00 = context;
    }

    public final void run() {
        Context context = this.A00;
        if ((!(context instanceof Activity) || !((Activity) context).isFinishing()) && context != null) {
            C358248ab A0Y = DbS.A0Y(context);
            A0Y.A09(2131961740);
            A0Y.A08(2131968258);
            Dba.A0t((DialogInterface.OnClickListener) null, A0Y, 2131960862);
        }
    }
}
