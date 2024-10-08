package X;

import android.content.Context;
import android.view.MotionEvent;

/* renamed from: X.GkT  reason: case insensitive filesystem */
public final class C53219GkT extends C283285Gy {
    public final Context A00;
    public final C263184Jl A01;
    public final GC9 A02;

    public C53219GkT(Context context, C263184Jl r3) {
        0qQ.A0B(r3, 2);
        this.A00 = context;
        this.A01 = r3;
        this.A02 = new GC9(context);
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        0sK r2;
        Object invoke;
        String A002;
        MotionEvent motionEvent3 = motionEvent2;
        0qQ.A0B(motionEvent3, 1);
        MotionEvent motionEvent4 = motionEvent;
        float f3 = f;
        float f4 = f2;
        C53277GlP glP = new C53277GlP(motionEvent3, motionEvent4, f3, f4, 1);
        int intValue = this.A02.A00(motionEvent4, motionEvent3, f3, f4, false).intValue();
        if (intValue != 3) {
            if (intValue == 2) {
                C263184Jl r0 = this.A01;
                r2 = r0.A0I;
                invoke = r0.A05.invoke();
                A002 = "swipe_up_other_area";
            }
            return true;
        }
        C263184Jl r02 = this.A01;
        r2 = r02.A0I;
        invoke = r02.A05.invoke();
        A002 = AnonymousClass000.A00(1870);
        r2.invoke(A002, glP, invoke);
        return true;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.A01.A09.invoke();
        return true;
    }
}
