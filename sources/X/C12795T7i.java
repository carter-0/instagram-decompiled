package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.T7i  reason: case insensitive filesystem */
public final class C12795T7i implements C328007Db, AnonymousClass7PN {
    public AnonymousClass6NS A00;
    public final C273694n2 A01;

    public final void APf(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        View childAt = this.A01.getChildAt(0);
        if (childAt != null) {
            childAt.dispatchTouchEvent(motionEvent);
        }
    }

    public final void DAV(float f, float f2) {
    }

    public final boolean EsS(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        return 0nA.A0F(this.A01).contains(motionEvent.getRawX(), motionEvent.getRawY());
    }

    public final boolean Esh() {
        return true;
    }

    public final /* bridge */ /* synthetic */ View BJd() {
        return this.A01;
    }

    public C12795T7i(Context context) {
        this.A01 = new C273694n2(context);
    }
}
