package X;

import android.view.MotionEvent;
import android.view.View;

public final class IDZ implements View.OnTouchListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public IDZ(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.A00 = i2;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A02 = obj;
        this.A01 = i;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Object obj;
        String A2n;
        View view2 = view;
        MotionEvent motionEvent2 = motionEvent;
        switch (this.A00) {
            case 0:
                0sI r3 = ((C67371Mmn) this.A04).A04;
                Object obj2 = this.A02;
                Object obj3 = this.A03;
                Integer valueOf = Integer.valueOf(this.A01);
                0qQ.A0A(view);
                0qQ.A0A(motionEvent);
                obj = r3.invoke(obj2, obj3, valueOf, view2, motionEvent2);
                break;
            case 1:
                Object obj4 = this.A02;
                0qQ.A0A(motionEvent);
                obj = ((0sJ) ((C53267GlF) this.A03).A01.A01).invoke(obj4, motionEvent, Integer.valueOf(this.A01), ((C55967HqY) this.A04).A00);
                break;
            default:
                if (motionEvent.getAction() != 1 || (A2n = ((1Xj) this.A03).A2n()) == null) {
                    return true;
                }
                int i = this.A01;
                ((C317286n1) this.A04).DrJ(AnonymousClass7TE.A0S(view), (AnonymousClass0iw) this.A02, A2n, motionEvent.getRawX(), motionEvent.getRawY(), i);
                return true;
        }
        return AnonymousClass7TE.A1a(obj);
    }
}
