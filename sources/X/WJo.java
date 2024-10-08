package X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;

public final class WJo implements C252203oj {
    public static final FrameLayout.LayoutParams A0c = new FrameLayout.LayoutParams(-1, -1);
    public float A00;
    public float A01;
    public float A02 = 1.0f;
    public float A03 = 4.0f;
    public float A04;
    public float A05;
    public float A06;
    public float A07 = 4.0f;
    public int A08;
    public int A09 = 255;
    public int A0A;
    public int A0B;
    public int A0C;
    public Drawable A0D;
    public View A0E;
    public ViewGroup.LayoutParams A0F;
    public C15173UTy A0G;
    public 2cs A0H;
    public 2cs A0I;
    public 2cs A0J;
    public U4O A0K;
    public Integer A0L = AnonymousClass05K.A00;
    public C62320sa A0M;
    public C62320sa A0N;
    public C62320sa A0O;
    public boolean A0P;
    public boolean A0Q;
    public final int A0R;
    public final Context A0S;
    public final PointF A0T;
    public final ScaleGestureDetector A0U;
    public final View A0V;
    public final OverScroller A0W;
    public final AnonymousClass0eM A0X;
    public final AnonymousClass0eM A0Y;
    public final AnonymousClass0eM A0Z;
    public final float A0a;
    public final W8B A0b;

    public static final void A02(WJo wJo) {
        wJo.A0P = false;
        View A002 = A00(wJo);
        PointF pointF = wJo.A0T;
        pointF.x = ((float) A002.getWidth()) / 2.0f;
        pointF.y = ((float) A002.getHeight()) / 2.0f;
        2cs r6 = wJo.A0J;
        r6.A08((double) wJo.A02, true);
        2cs r3 = wJo.A0H;
        r3.A08((double) wJo.A04, true);
        2cs r2 = wJo.A0I;
        r2.A08((double) wJo.A05, true);
        r6.A0B(wJo);
        r3.A0B(wJo);
        r2.A0B(wJo);
        A002.setHasTransientState(false);
        if (wJo.A0Q) {
            float f = wJo.A06;
            View A003 = A00(wJo);
            A003.setTranslationX(0.0f);
            A003.setTranslationY(f);
        }
        wJo.A04 = 0.0f;
        wJo.A05 = 0.0f;
        wJo.A08 = 0;
        wJo.A0F = null;
        wJo.A08(AnonymousClass05K.A00);
    }

    public final void DmB(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public static final View A00(WJo wJo) {
        if (wJo.A0L != AnonymousClass05K.A0C) {
            return wJo.A0V;
        }
        View view = wJo.A0E;
        if (view != null) {
            return view;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A03(WJo wJo, double d, double d2, double d3, boolean z) {
        wJo.A08(AnonymousClass05K.A01);
        wJo.A0P = false;
        2cs r0 = wJo.A0J;
        r0.A0A(wJo);
        2cs r2 = wJo.A0H;
        r2.A0A(wJo);
        2cs r1 = wJo.A0I;
        r1.A0A(wJo);
        r0.A06(d);
        r2.A06(d2);
        r1.A06(d3);
        if (z || (r0.A0C() && r2.A0C() && r1.A0C())) {
            A02(wJo);
        }
    }

    public static final boolean A04(WJo wJo, float f) {
        float f2 = wJo.A02;
        View view = wJo.A0V;
        float A002 = C51967G9n.A00(f2 * ((float) view.getWidth()), (float) view.getWidth());
        float f3 = wJo.A04;
        float signum = Math.signum(f);
        float f4 = wJo.A0a;
        float f5 = f3 - (signum * f4);
        if ((-A002) > f5 || f5 > A002 || Math.abs(f) <= f4) {
            return false;
        }
        return true;
    }

    public static final boolean A05(WJo wJo, float f) {
        float f2 = wJo.A02;
        View view = wJo.A0V;
        float A002 = C51967G9n.A00(f2 * ((float) view.getHeight()), (float) view.getHeight());
        float f3 = wJo.A05;
        float signum = Math.signum(f);
        float f4 = wJo.A0a;
        float f5 = f3 - (signum * f4);
        if ((-A002) > f5 || f5 > A002 || Math.abs(f) <= f4) {
            return false;
        }
        return true;
    }

    public final void A06() {
        0eP A012 = A01(this, 1.0f);
        A03(this, 1.0d, (double) AnonymousClass7TE.A04(A012.A00), (double) AnonymousClass7TE.A04(A012.A01), true);
    }

    public final void A07(float f) {
        float A022 = C229632nm.A02(f, 0.0f, this.A07);
        if (A022 != this.A02) {
            this.A02 = A022;
            Drawable drawable = this.A0D;
            if (drawable != null) {
                float f2 = A022 - 1.0f;
                if (f2 < 0.0f) {
                    f2 = 0.0f;
                }
                float f3 = this.A07 - 1.0f;
                if (f3 < Float.MIN_VALUE) {
                    f3 = Float.MIN_VALUE;
                }
                int A012 = AnonymousClass1GB.A01(((f2 / f3) * ((float) this.A09)) + ((float) this.A0A));
                if (A012 < 0) {
                    A012 = 0;
                } else if (A012 > 255) {
                    A012 = 255;
                }
                drawable.setAlpha(A012);
            }
        }
    }

    public final void A08(Integer num) {
        C62320sa r0;
        if (this.A0L != num) {
            this.A0L = num;
            int intValue = num.intValue();
            if (intValue == 0) {
                r0 = this.A0M;
            } else if (intValue == 2) {
                r0 = this.A0N;
            } else {
                return;
            }
            if (r0 != null) {
                r0.invoke();
            }
        }
    }

    public final void DmC(2cs r6) {
        Integer num;
        if (this.A0Q && ((num = this.A0L) == AnonymousClass05K.A0C || num == AnonymousClass05K.A01)) {
            this.A0P = false;
            C15173UTy uTy = this.A0G;
            if (uTy != null) {
                U4O u4o = this.A0K;
                if (u4o != null) {
                    View A002 = A00(this);
                    JTP.A15(uTy, false);
                    uTy.requestDisallowInterceptTouchEvent(false);
                    JTP.A15(u4o, false);
                    A002.setHasTransientState(false);
                    uTy.A00.A01(0);
                    u4o.detachViewFromParent(A002);
                    uTy.attachViewToParent(A002, this.A08, this.A0F);
                    A002.requestLayout();
                    ((ViewGroup) this.A0X.getValue()).removeView(this.A0K);
                    this.A0E = A002;
                    this.A0K = null;
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        A02(this);
    }

    public final void DmE(2cs r6) {
        if (this.A0L == AnonymousClass05K.A01) {
            A07((float) this.A0J.A09.A00);
            float f = this.A02;
            View A002 = A00(this);
            if (Float.isNaN(f)) {
                f = 1.0f;
            }
            A002.setScaleX(f);
            A002.setScaleY(f);
            float f2 = (float) this.A0H.A09.A00;
            this.A04 = f2;
            float f3 = (float) this.A0I.A09.A00;
            this.A05 = f3;
            View A003 = A00(this);
            A003.setTranslationX(f2);
            A003.setTranslationY(f3);
        }
    }

    public WJo(Context context, View view) {
        this.A0S = context;
        this.A0V = view;
        0eO r6 = 0eO.A02;
        this.A0X = AnonymousClass0eN.A00(r6, new C13347TVu((Object) this, 33));
        this.A0W = new OverScroller(context);
        this.A0R = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.A0a = 4.0f * C13989Tnp.A03(this.A0S);
        this.A0T = new PointF();
        C245983dn.A02("init() must be called on the main thread");
        2cp A002 = 2cp.A00();
        2cs A022 = A002.A02();
        A022.A09(C71392co.A04(90.0d, 10.0d));
        A022.A02();
        this.A0J = A022;
        2cs A023 = A002.A02();
        A023.A09(C71392co.A04(90.0d, 10.0d));
        this.A0H = A023;
        2cs A024 = A002.A02();
        A024.A09(C71392co.A04(90.0d, 10.0d));
        this.A0I = A024;
        W8B w8b = new W8B(this);
        this.A0b = w8b;
        this.A0Z = AnonymousClass0eN.A00(r6, new C13347TVu((Object) this, 35));
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, w8b);
        scaleGestureDetector.setQuickScaleEnabled(false);
        this.A0U = scaleGestureDetector;
        this.A0Y = AnonymousClass0eN.A01(new C13347TVu((Object) this, 34));
    }

    public static final 0eP A01(WJo wJo, float f) {
        View A002 = A00(wJo);
        float width = ((((float) A002.getWidth()) * f) - ((float) A002.getWidth())) / 2.0f;
        float height = ((f * ((float) A002.getHeight())) - ((float) A002.getHeight())) / 2.0f;
        float f2 = -width;
        float A042 = C13989Tnp.A04(Float.valueOf(wJo.A04), f2, width);
        float f3 = -height;
        float A043 = C13989Tnp.A04(Float.valueOf(wJo.A05), f3, height);
        float f4 = wJo.A0a;
        if (A042 > f2 + f4 || f2 > A042) {
            f2 = A042;
        }
        if (width - f4 > f2 || f2 > width) {
            width = f2;
        }
        if (A043 > f3 + f4 || f3 > A043) {
            f3 = A043;
        }
        if (height - f4 > f3 || f3 > height) {
            height = f3;
        }
        return new 0eP(Float.valueOf(width), Float.valueOf(height));
    }
}
