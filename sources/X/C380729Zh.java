package X;

import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.View;

/* renamed from: X.9Zh  reason: invalid class name and case insensitive filesystem */
public final class C380729Zh extends C344467ru implements C345757u2 {
    public GestureDetector A00;
    public ScaleGestureDetector A01;
    public View.OnTouchListener A02;
    public View A03;
    public C70666OFn A04;
    public A3A A05;
    public A3B A06;
    public O9Y A07;
    public boolean A08;
    public final View.OnTouchListener A09 = new AP3(this, 0);
    public final GestureDetector.SimpleOnGestureListener A0A;
    public final ScaleGestureDetector.OnScaleGestureListener A0B;

    public C380729Zh(C343837qt r9) {
        this.A00 = r9;
        C380319Xn r7 = new C380319Xn(this, 0);
        this.A0A = r7;
        C67677MsD msD = new C67677MsD(this);
        this.A0B = msD;
        C343937r3 r1 = C343927r2.A00;
        C343837qt r0 = this.A00;
        r0.getClass();
        C343927r2 r5 = (C343927r2) r0.Apf(r1);
        C343667qb r02 = C345757u2.A01;
        Boolean A0v = AnonymousClass7TE.A0v();
        boolean A1a = AnonymousClass7TE.A1a(A09(r02, A0v));
        boolean A1a2 = AnonymousClass7TE.A1a(A09(C345757u2.A02, A0v));
        this.A08 = AnonymousClass7TE.A1a(A09(C345757u2.A03, A0v));
        if (A1a) {
            C343837qt r03 = this.A00;
            r03.getClass();
            GestureDetector gestureDetector = new GestureDetector(r03.getContext(), r7, ((C343897qz) r5).A00);
            this.A00 = gestureDetector;
            gestureDetector.setOnDoubleTapListener(r7);
            this.A00.setIsLongpressEnabled(false);
        }
        if (A1a2) {
            C343837qt r04 = this.A00;
            r04.getClass();
            this.A01 = new ScaleGestureDetector(r04.getContext(), msD, ((C343897qz) r5).A00);
        }
    }
}
