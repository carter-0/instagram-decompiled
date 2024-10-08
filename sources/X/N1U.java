package X;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Scroller;

public final class N1U extends C283285Gy implements View.OnTouchListener {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public A42 A04;
    public Integer A05 = AnonymousClass05K.A01;
    public Integer A06 = AnonymousClass05K.A00;
    public int A07;
    public int A08;
    public boolean A09;
    public final View A0A;
    public final C383699g0 A0B;
    public final 2cs A0C;
    public final 2cs A0D;
    public final Handler A0E;
    public final GestureDetector A0F;
    public final Scroller A0G;
    public final 2cp A0H;

    public N1U(View view) {
        0qQ.A0B(view, 1);
        this.A0A = view;
        Handler A0D2 = AnonymousClass7TF.A0D();
        this.A0E = A0D2;
        Context context = view.getContext();
        this.A0F = new GestureDetector(context, this, A0D2);
        this.A0G = new Scroller(context);
        2cp A002 = C61340me.A00();
        this.A0H = A002;
        this.A0C = A002.A02();
        this.A0D = A002.A02();
        this.A0B = new C383699g0(this, 2);
    }

    public final boolean onDown(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        this.A07 = (int) motionEvent.getRawX();
        this.A08 = (int) motionEvent.getRawY();
        return false;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        0qQ.A0B(motionEvent2, 1);
        this.A09 = true;
        int rawX = (int) motionEvent2.getRawX();
        int rawY = (int) motionEvent2.getRawY();
        double d = (double) (rawX - this.A07);
        double d2 = (double) (rawY - this.A08);
        2cs r7 = this.A0C;
        2cs r2 = this.A0D;
        r7.A08(r7.A09.A00 + d, true);
        r2.A08(r2.A09.A00 + d2, true);
        this.A07 = rawX;
        this.A08 = rawY;
        return true;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        if (motionEvent.getActionMasked() == 1 && this.A09) {
            A01((Double) null, (Double) null, this.A07, this.A08);
            this.A09 = false;
        }
        return this.A0F.onTouchEvent(motionEvent);
    }

    public static final C15048ULb A00(N1U n1u) {
        int i = n1u.A01;
        View view = n1u.A0A;
        return new C15048ULb(i + (view.getWidth() / 2), n1u.A03 + (view.getHeight() / 2), n1u.A02 - (view.getWidth() / 2), n1u.A00 - (view.getHeight() / 2), 0);
    }

    private final void A01(Double d, Double d2, int i, int i2) {
        Integer num;
        Integer num2;
        int i3;
        int i4;
        C15048ULb A002 = A00(this);
        if (i > ((A002.A01 + A002.A02) >> 1)) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A00;
        }
        if (i2 > ((A002.A03 + A002.A00) >> 1)) {
            num2 = AnonymousClass05K.A01;
        } else {
            num2 = AnonymousClass05K.A00;
        }
        if (d != null) {
            this.A0C.A07(d.doubleValue());
        }
        if (d2 != null) {
            this.A0D.A07(d2.doubleValue());
        }
        this.A05 = num;
        this.A06 = num2;
        Integer num3 = AnonymousClass05K.A00;
        if (num == num3) {
            i3 = A002.A01;
        } else {
            i3 = A002.A02;
        }
        if (num2 == num3) {
            i4 = A002.A03;
        } else {
            i4 = A002.A00;
        }
        View view = this.A0A;
        double translationX = ((double) view.getTranslationX()) + ((double) (i3 - C66584MXp.A03(view)));
        double translationY = ((double) view.getTranslationY()) + ((double) (i4 - C66584MXp.A04(view)));
        this.A0C.A06(translationX);
        this.A0D.A06(translationY);
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C15048ULb A002 = A00(this);
        Scroller scroller = this.A0G;
        scroller.abortAnimation();
        View view = this.A0A;
        scroller.fling(C66584MXp.A03(view), C66584MXp.A04(view), (int) f, (int) f2, A002.A01, A002.A02, A002.A03, A002.A00);
        A01(Double.valueOf((double) f), Double.valueOf((double) f2), scroller.getFinalX(), scroller.getFinalY());
        return true;
    }
}
