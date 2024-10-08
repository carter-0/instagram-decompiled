package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: X.Vjm  reason: case insensitive filesystem */
public final class C18010Vjm {
    public C62320sa A00;
    public 0sL A01;
    public final GestureDetector A02;
    public final ArrayList A03 = new ArrayList();
    public final View.OnTouchListener A04;
    public final View.OnTouchListener A05;

    public final void A00(View view) {
        View.OnTouchListener onTouchListener;
        0qQ.A0B(view, 0);
        if (view instanceof TextView) {
            onTouchListener = this.A04;
        } else {
            onTouchListener = this.A05;
        }
        view.setOnTouchListener(onTouchListener);
    }

    public final void A01(View view) {
        0qQ.A0B(view, 0);
        this.A03.add(view);
    }

    public C18010Vjm(Context context) {
        this.A02 = new GestureDetector(context, new C60032Jdi(this, 5));
        WC3 wc3 = new WC3(this, 15);
        this.A05 = wc3;
        this.A04 = new C18898WBq(wc3);
    }
}
