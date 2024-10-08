package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.1TB  reason: invalid class name */
public abstract class AnonymousClass1TB {
    public static AnonymousClass1Sl A00;
    public static AnonymousClass1Sl A01;
    public static AnonymousClass1Sl A02;
    public static AnonymousClass1Sl A03;
    public static final View.OnAttachStateChangeListener A04 = new AnonymousClass1TJ();

    static {
        AnonymousClass1Sl r1 = AnonymousClass1TE.A01;
        A03 = r1;
        AnonymousClass1Sl r0 = AnonymousClass1TE.A00;
        A02 = r0;
        A01 = r1;
        A00 = r0;
    }

    public static final C226742hm A00(View view) {
        Drawable background;
        if (view instanceof ImageView) {
            background = ((ImageView) view).getDrawable();
        } else {
            background = view.getBackground();
        }
        if (background instanceof C226742hm) {
            return (C226742hm) background;
        }
        return null;
    }
}
