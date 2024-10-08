package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

public final class ADu {
    public static final AnonymousClass0eM A02 = AnonymousClass0eN.A01(C41651Ay3.A00);
    public Bitmap A00;
    public WeakReference A01;

    public final void A01(Activity activity) {
        0qQ.A0B(activity, 0);
        ImageView imageView = new ImageView(activity);
        Window window = activity.getWindow();
        if (window != null) {
            View decorView = window.getDecorView();
            0qQ.A0C(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) decorView).addView(imageView);
            imageView.setVisibility(8);
            this.A01 = new WeakReference(imageView);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A00() {
        View view;
        WeakReference weakReference = this.A01;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            if (view.getParent() != null) {
                ViewParent parent = view.getParent();
                0qQ.A0C(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(view);
            }
            this.A01 = null;
        }
    }
}
