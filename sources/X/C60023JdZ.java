package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.JdZ  reason: case insensitive filesystem */
public final class C60023JdZ extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C64855LjH A00;

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C318136oS A002;
        int i;
        0qQ.A0B(motionEvent, 0);
        float x = motionEvent.getX();
        C64855LjH ljH = this.A00;
        int i2 = (x > (AnonymousClass7TE.A02(AnonymousClass7TE.A0c(ljH.A06)) / 2.0f) ? 1 : (x == (AnonymousClass7TE.A02(AnonymousClass7TE.A0c(ljH.A06)) / 2.0f) ? 0 : -1));
        C60205JhO jhO = ljH.A00;
        if (i2 >= 0) {
            if (jhO != null) {
                A002 = C318116oQ.A00(jhO);
                i = 27;
            }
            0qQ.A0F("viewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        if (jhO != null) {
            A002 = C318116oQ.A00(jhO);
            i = 34;
        }
        0qQ.A0F("viewModel");
        throw AnonymousClass00P.createAndThrow();
        MG2.A01(jhO, A002, i);
        return true;
    }

    public C60023JdZ(C64855LjH ljH) {
        this.A00 = ljH;
    }
}
