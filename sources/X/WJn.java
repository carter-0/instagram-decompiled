package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;

public final class WJn implements C252203oj {
    public static final int A0U = Color.parseColor("#CC000000");
    public static final FrameLayout.LayoutParams A0V = new FrameLayout.LayoutParams(-1, -1);
    public double A00;
    public double A01;
    public float A02 = 1.0f;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public View A0D;
    public ViewGroup.LayoutParams A0E;
    public 2cs A0F;
    public 2cs A0G;
    public U4O A0H;
    public U4O A0I;
    public Integer A0J = AnonymousClass05K.A00;
    public boolean A0K;
    public final float A0L;
    public final Context A0M;
    public final PointF A0N;
    public final Rect A0O;
    public final Drawable A0P;
    public final ScaleGestureDetector A0Q;
    public final ViewGroup A0R;
    public final C17171VLa A0S;
    public final W8C A0T;

    public static final void A01(WJn wJn) {
        wJn.A03 = 0.0f;
        wJn.A04 = 0.0f;
        wJn.A08 = 0.0f;
        wJn.A09 = 0.0f;
        wJn.A06 = 0.0f;
        wJn.A07 = 0.0f;
        wJn.A0A = 0;
        wJn.A01 = 0.0d;
        wJn.A00 = 0.0d;
        wJn.A0E = null;
        wJn.A0J = AnonymousClass05K.A00;
    }

    public final void A04() {
        this.A0K = false;
        View A002 = A00(this);
        2cs r5 = this.A0G;
        if (r5 != null) {
            2cs r4 = this.A0F;
            if (r4 != null) {
                float width = ((float) A002.getWidth()) / 2.0f;
                float height = ((float) A002.getHeight()) / 2.0f;
                PointF pointF = this.A0N;
                pointF.x = width;
                pointF.y = height;
                View A003 = A00(this);
                A003.setPivotX(width);
                A003.setPivotY(height);
                r5.A0B(this);
                r4.A0B(this);
                A002.setHasTransientState(false);
                float f = this.A05;
                View A004 = A00(this);
                A004.setTranslationX(0.0f);
                A004.setTranslationY(f);
                A02(this, 1.0f);
                A01(this);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void DmB(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r12) {
        0qQ.A0B(r12, 0);
        if (this.A0J == AnonymousClass05K.A01) {
            double d = r12.A09.A00;
            2cs r0 = this.A0G;
            if (r0 != null) {
                A02(this, (float) AnonymousClass37Q.A03(d, 1.0d, r0.A09.A00));
                float A032 = (float) AnonymousClass37Q.A03(d, this.A00, ((double) this.A03) * d);
                View A002 = A00(this);
                A002.setTranslationX(A032);
                A002.setTranslationY((float) AnonymousClass37Q.A03(d, this.A01, ((double) this.A04) * d));
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public /* synthetic */ WJn(Context context) {
        ColorDrawable colorDrawable = new ColorDrawable(A0U);
        this.A0M = context;
        this.A0P = colorDrawable;
        this.A0L = 4.0f * C13989Tnp.A03(context);
        this.A0N = new PointF();
        this.A0O = new Rect();
        W8C w8c = new W8C(this);
        this.A0T = w8c;
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, w8c);
        scaleGestureDetector.setQuickScaleEnabled(false);
        this.A0Q = scaleGestureDetector;
        Activity A002 = C70782Va.A00(context);
        if (!(A002 instanceof ComponentActivity) || A002 == null) {
            throw AnonymousClass7TE.A0y();
        }
        View A0A2 = C66581MXm.A0A(A002);
        C66580MXl.A1R(A0A2);
        this.A0R = (ViewGroup) A0A2;
        this.A0S = new C17171VLa(this);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.GrK, android.view.View] */
    public static final View A00(WJn wJn) {
        if (wJn.A0J == AnonymousClass05K.A0C) {
            View view = wJn.A0D;
            if (view != null) {
                return view;
            }
            throw AnonymousClass7TE.A0y();
        }
        U4O u4o = wJn.A0I;
        if (u4o != null) {
            return ((C54019Gy1) u4o).A00;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A03(WJn wJn, float f, float f2) {
        PointF pointF = wJn.A0N;
        float f3 = f - pointF.x;
        float f4 = f2 - pointF.y;
        View A002 = A00(wJn);
        float f5 = wJn.A03 + f3;
        wJn.A03 = f5;
        wJn.A04 += f4;
        float scaleX = f5 * A002.getScaleX();
        float scaleY = wJn.A04 * A002.getScaleY();
        View A003 = A00(wJn);
        A003.setTranslationX(scaleX);
        A003.setTranslationY(scaleY);
        pointF.x = f;
        pointF.y = f2;
        View A004 = A00(wJn);
        A004.setPivotX(f);
        A004.setPivotY(f2);
    }

    public final void DmC(2cs r5) {
        Integer num = this.A0J;
        if (num == AnonymousClass05K.A0C || num == AnonymousClass05K.A01) {
            this.A0K = false;
            U4O u4o = this.A0I;
            if (u4o != null) {
                U4O u4o2 = this.A0H;
                if (u4o2 != null) {
                    View A002 = A00(this);
                    JTP.A15(u4o, false);
                    u4o.requestDisallowInterceptTouchEvent(false);
                    JTP.A15(u4o2, false);
                    A002.setHasTransientState(false);
                    u4o2.detachViewFromParent(A002);
                    u4o.attachViewToParent(A002, this.A0A, this.A0E);
                    A002.requestLayout();
                    this.A0R.removeView(this.A0H);
                    this.A0D = A002;
                    this.A0H = null;
                    this.A0J = AnonymousClass05K.A00;
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        A04();
    }

    public static final void A02(WJn wJn, float f) {
        View A002 = A00(wJn);
        float f2 = f;
        if (Float.isNaN(f)) {
            f2 = 1.0f;
        }
        wJn.A02 = f;
        A002.setScaleX(f2);
        A002.setScaleY(f2);
    }
}
