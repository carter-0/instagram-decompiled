package X;

import android.animation.ArgbEvaluator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import com.instagram.android.R;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: X.5nL  reason: invalid class name and case insensitive filesystem */
public abstract class C294975nL {
    public static final ArgbEvaluator A0b = new ArgbEvaluator();
    public static final ArgbEvaluator A0c = new ArgbEvaluator();
    public float A00;
    public int A01;
    public int A02;
    public int A03 = -1;
    public int A04 = -1;
    public C295005nO A05;
    public C315616kD A06;
    public C315626kE A07;
    public String A08;
    public boolean A09 = false;
    public boolean A0A = false;
    public boolean A0B = false;
    public boolean A0C = false;
    public boolean A0D = false;
    public boolean A0E = false;
    public boolean A0F = false;
    public float A0G;
    public float A0H;
    public float A0I;
    public float A0J;
    public float A0K;
    public float A0L;
    public float A0M;
    public float A0N;
    public float A0O;
    public float A0P;
    public float A0Q;
    public float A0R;
    public float A0S;
    public float A0T;
    public float A0U;
    public float A0V;
    public float A0W;
    public float A0X;
    public boolean A0Y = false;
    public boolean A0Z = false;
    public final View A0a;

    public static C294975nL A00(View view) {
        return A01(view, 0);
    }

    public static void A02(View view, long j) {
        A04(new C19672Wda(view, j), new View[]{view}, true);
    }

    public static void A03(View view, C295005nO r4, int i, boolean z) {
        if (view.getAlpha() <= 0.0f || view.getVisibility() != 0 || !z) {
            view.setVisibility(i);
            A01(view, 0).A0G();
            view.setAlpha(0.0f);
            if (r4 != null) {
                r4.onFinish();
                return;
            }
            return;
        }
        C294975nL A012 = A01(view, 0);
        A012.A0I(0.0f);
        A012.A05 = new C346917vy(view, r4, i);
        A012.A0H();
    }

    public static void A04(C295005nO r9, View[] viewArr, boolean z) {
        HashSet hashSet;
        PQP pqp;
        if (r9 != null) {
            hashSet = new HashSet(Arrays.asList(viewArr));
        } else {
            hashSet = null;
        }
        for (View view : viewArr) {
            if ((view.getAlpha() < 1.0f || view.getVisibility() != 0) && z) {
                view.setVisibility(0);
                if (r9 != null) {
                    pqp = new PQP(view, r9, hashSet);
                } else {
                    pqp = null;
                }
                C294975nL A012 = A01(view, 0);
                A012.A0I(1.0f);
                A012.A05 = pqp;
                A012.A0H();
            } else {
                view.setVisibility(0);
                A01(view, 0).A0G();
                view.setAlpha(1.0f);
                if (r9 != null) {
                    r9.onFinish();
                }
            }
        }
    }

    public static void A06(View[] viewArr, boolean z) {
        A03(viewArr[0], (C295005nO) null, 4, z);
    }

    public static void A07(View[] viewArr, boolean z) {
        A04((C295005nO) null, viewArr, z);
    }

    public final C294975nL A0A() {
        return A0F(true);
    }

    public final void A0I(float f) {
        this.A09 = true;
        this.A0G = this.A0a.getAlpha();
        this.A0Q = f;
    }

    public final void A0M(float f, float f2) {
        this.A09 = true;
        this.A0G = f;
        this.A0Q = f2;
    }

    public final void A0N(float f, float f2) {
        this.A0B = true;
        this.A0H = f;
        this.A0R = f2;
    }

    public final void A0O(float f, float f2) {
        this.A0C = true;
        this.A0I = f;
        this.A0S = f2;
    }

    public final void A0R(float f, float f2) {
        this.A0D = true;
        this.A0L = f;
        this.A0V = f2;
    }

    public final void A0S(float f, float f2) {
        this.A0E = true;
        this.A0M = f;
        this.A0W = f2;
    }

    public final void A0T(float f, float f2) {
        this.A0F = true;
        this.A0N = f;
        this.A0X = f2;
    }

    public final void A0U(float f, float f2, float f3) {
        this.A0Y = true;
        this.A0J = f;
        this.A0T = f2;
        this.A0O = f3;
    }

    public final void A0V(float f, float f2, float f3) {
        this.A0Z = true;
        this.A0K = f;
        this.A0U = f2;
        this.A0P = f3;
    }

    public static void A05(View[] viewArr, boolean z) {
        for (View A032 : viewArr) {
            A03(A032, (C295005nO) null, 8, z);
        }
    }

    public final C294975nL A0B(float f) {
        if (this instanceof C315596kB) {
            C315596kB r1 = (C315596kB) this;
            r1.A00 = Math.abs(f);
            return r1;
        }
        throw new UnsupportedOperationException("InterpolatorViewAnimator does not support spring config");
    }

    public final C294975nL A0C(long j) {
        if (this instanceof C294985nM) {
            C294985nM r1 = (C294985nM) this;
            r1.A01.setDuration(j);
            return r1;
        }
        throw new UnsupportedOperationException("SpringViewAnimator does not support interpolator config");
    }

    public final C294975nL A0D(TimeInterpolator timeInterpolator) {
        if (this instanceof C294985nM) {
            C294985nM r1 = (C294985nM) this;
            r1.A01.setInterpolator(timeInterpolator);
            return r1;
        }
        throw new UnsupportedOperationException("SpringViewAnimator does not support interpolator config");
    }

    public final C294975nL A0E(C71392co r3) {
        if (this instanceof C315596kB) {
            C315596kB r1 = (C315596kB) this;
            r1.A01.A09(r3);
            return r1;
        }
        throw new UnsupportedOperationException("InterpolatorViewAnimator does not support spring config");
    }

    public final C294975nL A0F(boolean z) {
        if (this instanceof C315596kB) {
            C315596kB r1 = (C315596kB) this;
            r1.A01.A06 = z;
            return r1;
        }
        throw new UnsupportedOperationException("InterpolatorViewAnimator does not support spring config");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.6kB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.5nM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.6kB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.6kB} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0G() {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C294985nM
            if (r0 == 0) goto L_0x003b
            r3 = r4
            X.5nM r3 = (X.C294985nM) r3
            android.animation.ValueAnimator r2 = r3.A01
            r2.cancel()
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            r2.setInterpolator(r0)
            int r0 = r3.A00
            long r0 = (long) r0
            r2.setDuration(r0)
        L_0x001a:
            r0 = 0
            r3.A0E = r0
            r3.A0F = r0
            r3.A09 = r0
            r3.A0C = r0
            r3.A0B = r0
            r3.A0D = r0
            r0 = -1
            r3.A04 = r0
            r3.A03 = r0
            r1 = 0
            r3.A06 = r1
            r3.A05 = r1
            X.6kE r0 = r3.A07
            if (r0 == 0) goto L_0x0038
            r0.Df0()
        L_0x0038:
            r3.A07 = r1
            return
        L_0x003b:
            r3 = r4
            X.6kB r3 = (X.C315596kB) r3
            X.2cs r1 = r3.A01
            r1.A01()
            X.2co r0 = X.C315596kB.A02
            r1.A09(r0)
            r0 = 0
            r1.A06 = r0
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C294975nL.A0G():void");
    }

    public final void A0H() {
        if (this instanceof C294985nM) {
            C294985nM r4 = (C294985nM) this;
            r4.A0a.setTag(R.id.view_animator, r4);
            ValueAnimator valueAnimator = r4.A01;
            valueAnimator.cancel();
            valueAnimator.setFloatValues(new float[]{r4.A00, 1.0f});
            valueAnimator.start();
            r4.A00 = 0.0f;
            return;
        }
        C315596kB r3 = (C315596kB) this;
        r3.A0a.setTag(R.id.view_animator, r3);
        2cs r2 = r3.A01;
        r2.A01();
        r2.A05((double) r3.A00);
        r2.A06(1.0d);
        r2.A07((double) r3.A00);
        r3.A00 = 0.0f;
        r3.A00 = 0.0f;
    }

    public final void A0J(float f) {
        A0S(this.A0a.getTranslationX(), f);
    }

    public final void A0K(float f) {
        A0T(this.A0a.getTranslationY(), f);
    }

    public final void A0L(float f) {
        if (this.A0A) {
            int intValue = ((Number) A0b.evaluate(f, Integer.valueOf(this.A01), Integer.valueOf(this.A02))).intValue();
            View view = this.A0a;
            if (view.getBackground() instanceof ShapeDrawable) {
                ((ShapeDrawable) view.getBackground()).getPaint().setColor(intValue);
                view.invalidate();
            } else {
                view.setBackgroundColor(intValue);
            }
        }
        if (this.A0E) {
            View view2 = this.A0a;
            float f2 = this.A0M;
            view2.setTranslationX(f2 + ((this.A0W - f2) * f));
        }
        if (this.A0F) {
            View view3 = this.A0a;
            float f3 = this.A0N;
            view3.setTranslationY(f3 + ((this.A0X - f3) * f));
        }
        if (this.A0Y) {
            float f4 = this.A0O;
            if (f4 != -1.0f) {
                this.A0a.setPivotX(f4);
            }
            View view4 = this.A0a;
            float f5 = this.A0J;
            view4.setScaleX(f5 + ((this.A0T - f5) * f));
        }
        if (this.A0Z) {
            float f6 = this.A0P;
            if (f6 != -1.0f) {
                this.A0a.setPivotY(f6);
            }
            View view5 = this.A0a;
            float f7 = this.A0K;
            view5.setScaleY(f7 + ((this.A0U - f7) * f));
        }
        if (this.A09) {
            float f8 = this.A0G;
            this.A0a.setAlpha(Math.max(0.0f, Math.min(f8 + ((this.A0Q - f8) * f), 1.0f)));
        }
        if (this.A0C) {
            float f9 = this.A0I;
            this.A0a.setRotation(f9 + ((this.A0S - f9) * f));
        }
        boolean z = this.A0D;
        boolean z2 = this.A0B;
        if (z) {
            View view6 = this.A0a;
            float f10 = this.A0L;
            int i = (int) (f10 + ((this.A0V - f10) * f));
            if (z2) {
                float f11 = this.A0H;
                0nA.A0g(view6, i, (int) (f11 + ((this.A0R - f11) * f)));
            } else {
                0nA.A0f(view6, i);
            }
        } else if (z2) {
            View view7 = this.A0a;
            float f12 = this.A0H;
            0nA.A0V(view7, (int) (f12 + ((this.A0R - f12) * f)));
        }
        C315616kD r0 = this.A06;
        if (r0 != null) {
            r0.DaF(this, f);
        }
    }

    public final void A0P(float f, float f2) {
        A0U(this.A0a.getScaleX(), f, f2);
    }

    public final void A0Q(float f, float f2) {
        A0V(this.A0a.getScaleY(), f, f2);
    }

    public final boolean A0W() {
        if (this instanceof C294985nM) {
            return ((C294985nM) this).A01.isRunning();
        }
        return !((C315596kB) this).A01.A0C();
    }

    public C294975nL(View view) {
        this.A0a = view;
    }

    public static C294975nL A01(View view, int i) {
        C294975nL r1 = (C294975nL) view.getTag(R.id.view_animator);
        if (i == 0) {
            if (!(r1 instanceof C315596kB)) {
                r1 = new C315596kB(view);
            }
            return r1;
        }
        if (!(r1 instanceof C294985nM)) {
            r1 = new C294985nM(view);
        }
        return r1;
        view.setTag(R.id.view_animator, r1);
        return r1;
    }
}
