package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.M5u  reason: case insensitive filesystem */
public final class C65957M5u implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C61364K4g A01;

    public C65957M5u(View view, C61364K4g k4g) {
        this.A01 = k4g;
        this.A00 = view;
    }

    public final void run() {
        C61364K4g k4g = this.A01;
        FragmentActivity activity = k4g.getActivity();
        if (activity != null) {
            C63059Kqo.A00(activity, this.A00, AnonymousClass7TE.A0l(k4g.A0S));
        }
    }
}
