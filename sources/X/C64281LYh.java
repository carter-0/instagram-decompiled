package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.LYh  reason: case insensitive filesystem */
public final class C64281LYh implements View.OnTouchListener {
    public final /* synthetic */ GestureDetector A00;
    public final /* synthetic */ C64855LjH A01;

    public C64281LYh(GestureDetector gestureDetector, C64855LjH ljH) {
        this.A00 = gestureDetector;
        this.A01 = ljH;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C60205JhO jhO;
        C318136oS A002;
        int i;
        this.A00.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                jhO = this.A01.A00;
                if (jhO != null) {
                    A002 = C318116oQ.A00(jhO);
                    i = 31;
                }
                0qQ.A0F("viewModel");
                throw AnonymousClass00P.createAndThrow();
            }
            return true;
        }
        jhO = this.A01.A00;
        if (jhO != null) {
            A002 = C318116oQ.A00(jhO);
            i = 30;
        }
        0qQ.A0F("viewModel");
        throw AnonymousClass00P.createAndThrow();
        MG2.A01(jhO, A002, i);
        return true;
    }
}
