package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.AOy  reason: case insensitive filesystem */
public final /* synthetic */ class C40042AOy implements View.OnTouchListener {
    public final /* synthetic */ C353798Jc A00;

    public /* synthetic */ C40042AOy(C353798Jc r1) {
        this.A00 = r1;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C353798Jc r4 = this.A00;
        if (1 != motionEvent.getAction()) {
            return false;
        }
        AnonymousClass80U r3 = r4.A0Z;
        CharSequence charSequence = r4.A0H;
        charSequence.getClass();
        r3.E3H(new AnonymousClass8TM(r4.A0E, charSequence));
        return false;
    }
}
