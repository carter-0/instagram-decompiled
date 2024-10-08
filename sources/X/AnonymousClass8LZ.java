package X;

import android.view.View;
import com.instagram.android.R;

/* renamed from: X.8LZ  reason: invalid class name */
public abstract class AnonymousClass8LZ {
    public static final void A00(View view) {
        0qQ.A0B(view, 0);
        A01(view, (float) view.getContext().getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material), 0);
    }

    public static final void A01(View view, float f, int i) {
        C354198La r0;
        0qQ.A0B(view, 0);
        if (f > 0.0f) {
            r0 = new C354198La(i, f);
        } else {
            r0 = null;
        }
        view.setOutlineProvider(r0);
        boolean z = false;
        if (f > 0.0f) {
            z = true;
        }
        view.setClipToOutline(z);
    }

    public static final void A02(View view, int i) {
        0qQ.A0B(view, 0);
        if (I7E.A09()) {
            view.post(new C40758Aio(view));
        } else {
            A01(view, ((float) i) * 0.24f, 0);
        }
    }
}
