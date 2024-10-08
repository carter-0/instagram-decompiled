package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.TrY  reason: case insensitive filesystem */
public final class C14193TrY implements View.OnTouchListener {
    public final /* synthetic */ C66970Mg3 A00;
    public final /* synthetic */ C14226Ts8 A01;

    public C14193TrY(C66970Mg3 mg3, C14226Ts8 ts8) {
        this.A01 = ts8;
        this.A00 = mg3;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C14226Ts8 ts8 = this.A01;
        0qQ.A0A(view);
        0qQ.A0A(motionEvent);
        int bindingAdapterPosition = this.A00.getBindingAdapterPosition();
        AnonymousClass7TG.A1N(view, motionEvent);
        return ts8.A00.D47(motionEvent, view, ts8.A01, bindingAdapterPosition);
    }
}
