package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public abstract class SKW {
    public static final View A00(View view, int i) {
        0qQ.A0B(view, 0);
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw AnonymousClass7TE.A0z("Required View not found. Your layout is missing the ID requested.");
    }

    public static ImageView A01(View view, int i) {
        return (ImageView) A00(view, i);
    }

    public static TextView A02(View view, int i) {
        return (TextView) A00(view, i);
    }
}
