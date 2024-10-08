package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Scroller;
import androidx.activity.ComponentActivity;

public final class N1T extends C283285Gy {
    public static int A0E;
    public static Float A0F;
    public static Float A0G;
    public int A00;
    public Rect A01;
    public boolean A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public final Activity A07;
    public final View.OnTouchListener A08;
    public final View A09;
    public final Scroller A0A;
    public final 2cs A0B;
    public final 2cs A0C;
    public final C62320sa A0D;

    public final boolean onDown(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        this.A03 = (int) motionEvent.getRawX();
        this.A04 = (int) motionEvent.getRawY();
        2cs r6 = this.A0B;
        View view = this.A09;
        r6.A08((double) view.getX(), true);
        2cs r4 = this.A0C;
        r4.A08((double) view.getY(), true);
        this.A05 = this.A03 - ((int) r6.A09.A00);
        this.A06 = this.A04 - ((int) r4.A09.A00);
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        0qQ.A0B(motionEvent2, 1);
        this.A03 = (int) motionEvent2.getRawX();
        this.A04 = (int) motionEvent2.getRawY();
        this.A0B.A08(((double) this.A03) - ((double) this.A05), true);
        this.A0C.A08(((double) this.A04) - ((double) this.A06), true);
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        int i2;
        Rect A002 = A00(this);
        Scroller scroller = this.A0A;
        scroller.abortAnimation();
        float f3 = f;
        float f4 = f2;
        scroller.fling(this.A03, this.A04, (int) f3, (int) f4, A002.left, A002.right, A002.top, A002.bottom);
        float f5 = ((float) (A002.top + A002.bottom)) / 2.0f;
        if (((float) scroller.getFinalX()) > ((float) (A002.left + A002.right)) / 2.0f) {
            i = A002.right;
        } else {
            i = A002.left;
        }
        if (((float) scroller.getFinalY()) > f5) {
            i2 = A002.bottom;
        } else {
            i2 = A002.top;
        }
        2cs r2 = this.A0B;
        r2.A07((double) f3);
        r2.A06((double) i);
        2cs r22 = this.A0C;
        r22.A07((double) f4);
        r22.A06((double) i2);
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View view = this.A09;
        if (view.hasOnClickListeners()) {
            return view.performClick();
        }
        this.A0D.invoke();
        return true;
    }

    public /* synthetic */ N1T(Activity activity, View view, C62320sa r8) {
        Context context = view.getContext();
        Scroller scroller = new Scroller(context);
        0qQ.A0B(r8, 4);
        this.A09 = view;
        this.A07 = activity;
        this.A0A = scroller;
        this.A0D = r8;
        2cp A002 = C61340me.A00();
        NC8 nc8 = new NC8(this);
        C71392co r1 = C71392co.A02;
        2cs A022 = A002.A02();
        A022.A09(r1);
        A022.A0A(nc8);
        this.A0B = A022;
        2cs A023 = A002.A02();
        A023.A09(r1);
        A023.A0A(nc8);
        this.A0C = A023;
        this.A08 = new C71433OkY(new GestureDetector(context, this), this);
        if (activity instanceof ComponentActivity) {
            new C64309LZj((ComponentActivity) activity, C66580MXl.A14(this, 39));
        }
    }

    public static final Rect A00(N1T n1t) {
        int i;
        int width;
        Rect A0W;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Rect A0W2 = AnonymousClass7TE.A0W();
        Rect rect = n1t.A01;
        if (rect == null) {
            View view = n1t.A09;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                A0W = AnonymousClass7TE.A0W();
            } else {
                A0W = C66580MXl.A0C(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            A0W2.top = A0W.top;
            A0W2.bottom = ((C3019160o.A01(view).getHeight() - view.getHeight()) - A0W.bottom) - n1t.A00;
            A0W2.left = A0W.left;
            i = C3019160o.A01(view).getWidth() - view.getWidth();
            width = A0W.right;
        } else {
            A0W2.top = rect.top;
            int i2 = rect.bottom;
            View view2 = n1t.A09;
            A0W2.bottom = (i2 - view2.getHeight()) - n1t.A00;
            A0W2.left = rect.left;
            i = rect.right;
            width = view2.getWidth();
        }
        A0W2.right = i - width;
        return A0W2;
    }

    public final void A01() {
        Rect A002 = A00(this);
        View view = this.A09;
        int x = (int) view.getX();
        int y = (int) view.getY();
        Point point = new Point();
        int i = A002.left;
        point.x = C66584MXp.A02(x, i, A002.right, i);
        int i2 = A002.top;
        point.y = C66584MXp.A02(y, i2, A002.bottom, i2);
        2cs r2 = this.A0B;
        r2.A08((double) x, true);
        r2.A06((double) point.x);
        2cs r22 = this.A0C;
        r22.A08((double) y, true);
        r22.A06((double) point.y);
    }
}
