package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: X.8ac  reason: invalid class name and case insensitive filesystem */
public final class C358258ac implements DialogInterface.OnShowListener {
    public final /* synthetic */ DialogInterface.OnShowListener A00;
    public final /* synthetic */ C358248ab A01;

    public C358258ac(DialogInterface.OnShowListener onShowListener, C358248ab r2) {
        this.A01 = r2;
        this.A00 = onShowListener;
    }

    public final void onShow(DialogInterface dialogInterface) {
        WindowManager windowManager;
        C358248ab r3 = this.A01;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = r3.A0P.getWindow();
        if (window != null) {
            layoutParams.copyFrom(window.getAttributes());
            DisplayMetrics displayMetrics = new DisplayMetrics();
            int height = (int) (((float) window.getDecorView().getHeight()) / Resources.getSystem().getDisplayMetrics().density);
            Context context = r3.A0Q;
            if (context instanceof Activity) {
                windowManager = ((Activity) context).getWindowManager();
            } else {
                Object systemService = context.getSystemService("window");
                0qQ.A0C(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                windowManager = (WindowManager) systemService;
            }
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            int i = ((int) (((float) displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)) - 120;
            if (height > i) {
                layoutParams.height = (int) (((float) i) * Resources.getSystem().getDisplayMetrics().density);
            }
            window.setAttributes(layoutParams);
            C226462gr r0 = r3.A03;
            if (r0 != null) {
                r3.A0R.postDelayed(new C40885Akt(r0), 1000);
            }
            DialogInterface.OnShowListener onShowListener = this.A00;
            if (onShowListener != null) {
                onShowListener.onShow(dialogInterface);
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
