package X;

import android.view.MotionEvent;
import android.view.View;

public abstract class GMP {
    public static final boolean A01(GMQ gmq, C70802Vt r11, C70762Uy r12, C59492JLq jLq, C59553JNz jNz, 0sP r15, boolean z) {
        0qQ.A0B(r11, 1);
        AnonymousClass7TG.A0w(2, gmq, jLq, r15);
        0qQ.A0B(jNz, 5);
        r11.onTouchEvent(r12.A00);
        C243673Zt r6 = (C243673Zt) gmq.A06;
        C243673Zt r5 = (C243673Zt) gmq.A07;
        C243673Zt r9 = (C243673Zt) gmq.A03;
        C243673Zt r0 = (C243673Zt) gmq.A04;
        C243673Zt r4 = (C243673Zt) gmq.A01;
        C243673Zt r2 = (C243673Zt) gmq.A02;
        View view = r12.A01;
        MotionEvent motionEvent = r12.A00;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                view.getParent().requestDisallowInterceptTouchEvent(false);
                if (!jNz.DAa(motionEvent, view, C52296GMm.A00)) {
                    AnonymousClass2VL.A00();
                    C14001To3 to3 = (C14001To3) r6.A00;
                    if (to3 != null) {
                        to3.A02();
                    }
                    AnonymousClass2VL.A00();
                    C14001To3 to32 = (C14001To3) r5.A00;
                    if (to32 != null) {
                        to32.A02();
                        return true;
                    }
                }
            } else if (actionMasked == 2 && !z) {
                if (AnonymousClass7TE.A00(C51972G9s.A03(r4), motionEvent.getX()) > 10.0f || AnonymousClass7TE.A00(C51972G9s.A03(r2), motionEvent.getY()) > 10.0f) {
                    Object tag = view.getTag();
                    0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.contentnotes.ui.animator.DraggingContentNotesViewTag");
                    r15.invoke(tag);
                }
                view.animate().x(motionEvent.getRawX() + C51972G9s.A03(r9)).y(motionEvent.getRawY() + C51972G9s.A03(r0)).setDuration(0).start();
            }
        } else if (z || !jLq.equals(C52296GMm.A00)) {
            return false;
        } else {
            0qQ.A0A(view);
            C14754U7l u7l = C14001To3.A0J;
            float x = view.getX();
            C14090Tph tph = new C14090Tph(u7l, view);
            C14002To4 to4 = new C14002To4(x);
            to4.A02(1500.0f);
            to4.A01(0.75f);
            tph.A01 = to4;
            r6.A00(tph);
            C14754U7l u7l2 = C14001To3.A0K;
            float y = view.getY();
            C14090Tph tph2 = new C14090Tph(u7l2, view);
            C14002To4 to42 = new C14002To4(y);
            to42.A02(1500.0f);
            to42.A01(0.75f);
            tph2.A01 = to42;
            r5.A00(tph2);
            r9.A00(Float.valueOf(view.getX() - motionEvent.getRawX()));
            r0.A00(Float.valueOf(view.getY() - motionEvent.getRawY()));
            r4.A00(Float.valueOf(motionEvent.getX()));
            r2.A00(Float.valueOf(motionEvent.getY()));
            view.bringToFront();
            view.getParent().requestDisallowInterceptTouchEvent(true);
            AnonymousClass2VL.A00();
            C14001To3 to33 = (C14001To3) r6.A00;
            if (to33 != null) {
                to33.A01();
            }
            AnonymousClass2VL.A00();
            C14001To3 to34 = (C14001To3) r5.A00;
            if (to34 != null) {
                to34.A01();
                return true;
            }
        }
        return true;
    }

    public static final GMQ A00(AnonymousClass3Y5 r7) {
        return new GMQ(C243633Zp.A00(r7, GMZ.A00), C243633Zp.A00(r7, C52284GMa.A00), C243633Zp.A00(r7, C52285GMb.A00), C243633Zp.A00(r7, C52286GMc.A00), C243633Zp.A00(r7, C52287GMd.A00), C243633Zp.A00(r7, C52289GMf.A00), C243633Zp.A00(r7, C52290GMg.A00));
    }
}
