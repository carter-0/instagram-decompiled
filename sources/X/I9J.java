package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Window;
import android.view.WindowManager;

public final class I9J implements DialogInterface.OnShowListener {
    public final int A00;
    public final Object A01;

    public I9J(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onShow(DialogInterface dialogInterface) {
        switch (this.A00) {
            case 0:
                1Av A002 = 1Au.A00(((C52971GgO) this.A01).A0E);
                AnonymousClass7TF.A1J(A002, A002.A7L, 1Av.A8a, 282, true);
                return;
            case 1:
                C51966G9m.A0p(((C54135H0e) this.A01).A09).A06.FIA(IQQ.A00);
                return;
            default:
                F1B f1b = (F1B) this.A01;
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = f1b.A05.getWindow();
                if (window != null) {
                    layoutParams.copyFrom(window.getAttributes());
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    int A03 = (int) (AnonymousClass7TE.A03(window.getDecorView()) / Resources.getSystem().getDisplayMetrics().density);
                    Context context = f1b.A06;
                    0qQ.A0C(context, "null cannot be cast to non-null type android.app.Activity");
                    ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                    int i = ((int) (((float) displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)) - 120;
                    if (A03 > i) {
                        layoutParams.height = (int) (((float) i) * Resources.getSystem().getDisplayMetrics().density);
                    }
                    window.setAttributes(layoutParams);
                    return;
                }
                throw AnonymousClass7TE.A0y();
        }
    }
}
