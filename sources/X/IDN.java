package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public final class IDN implements View.OnTouchListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;

    public IDN(ViewGroup viewGroup, View view) {
        this.A00 = view;
        this.A01 = viewGroup;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C51972G9s.A0I(view).withEndAction(new C57820Igz(this.A01, this.A00)).start();
        return true;
    }
}
