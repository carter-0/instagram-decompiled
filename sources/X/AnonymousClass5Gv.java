package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.user.model.User;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5Gv  reason: invalid class name */
public final class AnonymousClass5Gv implements C252203oj, View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
    public int A00;
    public Rect A01;
    public Rect A02;
    public Rect A03;
    public TouchInterceptorFrameLayout A04;
    public C284395Mi A05;
    public Boolean A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Runnable A0A;
    public String A0B;
    public int A0C;
    public ViewGroup A0D;
    public final int A0E;
    public final int A0F;
    public final GestureDetector A0G;
    public final ViewGroup A0H;
    public final 2cs A0I;
    public final C283245Gr A0J;
    public final C283265Gw A0K;
    public final C234222xL A0L;
    public final C226262fy A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final int A0S;
    public final Context A0T;
    public final GestureDetector A0U;
    public final C71392co A0V;
    public final C226172fn A0W;
    public final C283255Gu A0X;
    public final AnonymousClass5Gs A0Y;

    public final void A06() {
        A07((UserSession) null);
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r6) {
        C234222xL r0;
        0qQ.A0B(r6, 0);
        if (r6.A01 == 1.0d) {
            Integer num = this.A09;
            Integer num2 = AnonymousClass05K.A01;
            if (num == num2 && (r0 = this.A0L) != null) {
                r0.DsH(this);
            } else if (num == AnonymousClass05K.A0C) {
                this.A09 = num2;
            }
        }
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r7) {
        0qQ.A0B(r7, 0);
        float f = (float) r7.A09.A00;
        C226172fn r1 = this.A0W;
        if (r1 != null) {
            r1.DmF(this.A09, f);
        }
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A04;
        if (touchInterceptorFrameLayout != null) {
            float f2 = f;
            if (f < 0.0f) {
                f2 = 0.0f;
            }
            touchInterceptorFrameLayout.setScaleX(f2);
        }
        TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = this.A04;
        if (touchInterceptorFrameLayout2 != null) {
            float f3 = f;
            if (f < 0.0f) {
                f3 = 0.0f;
            }
            touchInterceptorFrameLayout2.setScaleY(f3);
        }
        if (f != 0.0f || this.A09 != AnonymousClass05K.A0N) {
            return;
        }
        if (0qQ.A0K(this.A06, true)) {
            this.A06 = false;
            11Z.A03(new C46536Dgd(this));
            return;
        }
        A04(this);
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        0qQ.A0B(view, 0);
        view.removeOnAttachStateChangeListener(this);
        this.A06 = true;
        A08(true);
    }

    public static final int A00(AnonymousClass5Gv r1) {
        C284395Mi r0 = r1.A05;
        if (r0 != null) {
            return r0.A00.getHeight();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A03(MotionEvent motionEvent, AnonymousClass5Gv r2) {
        r2.A0U.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 1 || actionMasked == 3) && r2.A09 == AnonymousClass05K.A0C) {
            2cs r22 = r2.A0I;
            r22.A06 = false;
            r22.A06(1.0d);
        }
    }

    public static final void A04(AnonymousClass5Gv r2) {
        r2.A09 = AnonymousClass05K.A00;
        View Acv = r2.A0J.Acv();
        Acv.removeOnAttachStateChangeListener(r2);
        ViewTreeObserver viewTreeObserver = Acv.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnPreDrawListener(r2);
        }
        Acv.setHasTransientState(false);
        r2.A0I.A0B(r2);
        r2.A0H.removeView(r2.A0D);
        r2.A05 = null;
        r2.A04 = null;
        r2.A0D = null;
        C234222xL r0 = r2.A0L;
        if (r0 != null) {
            r0.DsC(r2);
        }
    }

    public final void A07(UserSession userSession) {
        User user;
        View view;
        Boolean CdQ;
        if (this.A09 == AnonymousClass05K.A00) {
            if (userSession != null) {
                user = 0eE.A00(userSession).A00();
            } else {
                user = null;
            }
            if (userSession == null || user == null || (CdQ = user.A03.CdQ()) == null || !CdQ.booleanValue()) {
                C283245Gr r3 = this.A0J;
                if (!r3.CFc(this.A02, this.A0Q, this.A0P)) {
                    C234222xL r0 = this.A0L;
                    if (r0 != null) {
                        r0.DsC(this);
                        return;
                    }
                    return;
                }
                this.A09 = AnonymousClass05K.A01;
                Context context = this.A0T;
                FrameLayout frameLayout = new FrameLayout(context);
                this.A0D = frameLayout;
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                ViewGroup viewGroup = this.A0D;
                if (viewGroup != null) {
                    viewGroup.setOnTouchListener(new C284355Me(this));
                }
                TouchInterceptorFrameLayout touchInterceptorFrameLayout = new TouchInterceptorFrameLayout(context, (AttributeSet) null, 0);
                this.A04 = touchInterceptorFrameLayout;
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                int i = this.A0S;
                if (i > 0) {
                    marginLayoutParams.leftMargin = i;
                    marginLayoutParams.rightMargin = i;
                }
                touchInterceptorFrameLayout.setLayoutParams(marginLayoutParams);
                touchInterceptorFrameLayout.setBackground(this.A0K);
                int i2 = this.A0F;
                touchInterceptorFrameLayout.setPadding(i2, i2, i2, i2);
                touchInterceptorFrameLayout.setKeepObservingAfterRequestDisallowTouchEvent(true);
                touchInterceptorFrameLayout.A00(new C284365Mf(this), new C284375Mg(this));
                AnonymousClass5Gs r8 = this.A0Y;
                LayoutInflater from = LayoutInflater.from(context);
                0qQ.A07(from);
                C284395Mi ANJ = r8.ANJ(from, touchInterceptorFrameLayout);
                this.A05 = ANJ;
                r8.ADq(this.A0X, ANJ);
                if (this.A0B != null) {
                    C284395Mi r1 = this.A05;
                    if (r1 instanceof C369058tl) {
                        0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.igds.components.tooltip.template.BaseTextViewBinder.Holder");
                        ((C369058tl) r1).A00.setContentDescription(this.A0B);
                    }
                }
                ViewGroup viewGroup2 = this.A0D;
                if (viewGroup2 != null) {
                    viewGroup2.setImportantForAccessibility(4);
                }
                C284395Mi r02 = this.A05;
                if (r02 != null) {
                    view = r02.A00;
                } else {
                    view = null;
                }
                touchInterceptorFrameLayout.addView(view);
                ViewGroup viewGroup3 = this.A0D;
                if (viewGroup3 != null) {
                    viewGroup3.addView(touchInterceptorFrameLayout);
                }
                ViewGroup viewGroup4 = this.A0D;
                if (viewGroup4 != null) {
                    viewGroup4.setClipChildren(false);
                }
                this.A0H.addView(this.A0D);
                this.A0I.A0A(this);
                View Acv = r3.Acv();
                Acv.addOnAttachStateChangeListener(this);
                Acv.setHasTransientState(true);
                0nA.A0s(touchInterceptorFrameLayout, (Runnable) null, new C284405Mj(touchInterceptorFrameLayout, this), TimeUnit.SECONDS.toMillis(5));
                if (2eO.A00(context)) {
                    03v.A0B(Acv, new AnonymousClass9Y6(this));
                }
                C234222xL r03 = this.A0L;
                if (r03 != null) {
                    r03.DsE(this);
                }
            }
        }
    }

    public final void A08(boolean z) {
        if (this.A09 != AnonymousClass05K.A00) {
            this.A09 = AnonymousClass05K.A0N;
            TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A04;
            if (touchInterceptorFrameLayout != null) {
                touchInterceptorFrameLayout.removeCallbacks(this.A0A);
            }
            if (z) {
                2cs r5 = this.A0I;
                if (r5.A09.A00 != 0.0d) {
                    r5.A06 = true;
                    r5.A06(0.0d);
                    return;
                }
            }
            this.A0I.A05(0.0d);
        }
    }

    public final boolean A09() {
        if (this.A09 == AnonymousClass05K.A01) {
            return true;
        }
        return false;
    }

    public final boolean onPreDraw() {
        TouchInterceptorFrameLayout touchInterceptorFrameLayout;
        C283245Gr r3 = this.A0J;
        if (r3.CFc(this.A02, this.A0Q, this.A0P)) {
            if (this.A09 != AnonymousClass05K.A00) {
                Rect rect = this.A01;
                r3.Ahb(rect);
                int centerX = rect.centerX();
                int centerY = rect.centerY();
                Integer num = this.A07;
                if (num != null) {
                    int intValue = centerX - num.intValue();
                    Integer num2 = this.A08;
                    if (num2 != null) {
                        int intValue2 = centerY - num2.intValue();
                        if (!((intValue == 0 && intValue2 == 0) || (touchInterceptorFrameLayout = this.A04) == null)) {
                            touchInterceptorFrameLayout.setX(touchInterceptorFrameLayout.getX() + ((float) intValue));
                            touchInterceptorFrameLayout.setY(touchInterceptorFrameLayout.getY() + ((float) intValue2));
                        }
                        this.A07 = Integer.valueOf(centerX);
                        this.A08 = Integer.valueOf(centerY);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            return true;
        }
        A08(true);
        return true;
    }

    public AnonymousClass5Gv(AnonymousClass5Gt r9) {
        C283255Gu r7;
        C71392co A042 = C71392co.A04(40.0d, 7.0d);
        this.A0V = A042;
        Context context = r9.A0H;
        this.A0T = context;
        ViewGroup viewGroup = r9.A02;
        if (viewGroup != null) {
            this.A0H = viewGroup;
            if (AnonymousClass3HA.A00(context)) {
                r7 = r9.A07;
            } else {
                r7 = r9.A08;
            }
            this.A0X = r7;
            this.A0Y = r9.A09;
            C283245Gr r0 = r9.A03;
            if (r0 != null) {
                this.A0J = r0;
                this.A0M = r9.A05;
                this.A0L = r9.A04;
                this.A0W = r9.A06;
                this.A0K = new C283265Gw(context, r7, r9.A0F, r9.A0E);
                2cs A022 = C61340me.A00().A02();
                A022.A09(A042);
                this.A0I = A022;
                GestureDetector gestureDetector = new GestureDetector(context, new C283275Gx(this));
                this.A0U = gestureDetector;
                GestureDetector gestureDetector2 = new GestureDetector(context, new C283295Gz(this));
                this.A0G = gestureDetector2;
                this.A03 = new Rect();
                this.A01 = new Rect();
                this.A02 = new Rect();
                this.A0A = new AnonymousClass5H0(this);
                this.A0F = context.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
                Drawable drawable = context.getDrawable(R.drawable.tooltip_nub_bottom);
                if (drawable != null) {
                    this.A00 = drawable.getIntrinsicHeight();
                    Drawable drawable2 = context.getDrawable(R.drawable.tooltip_nub_left);
                    if (drawable2 != null) {
                        this.A0C = drawable2.getIntrinsicWidth();
                        this.A0E = r9.A00;
                        this.A0O = r9.A0B;
                        this.A0N = r9.A0A;
                        this.A0R = r9.A0G;
                        this.A0Q = r9.A0D;
                        this.A0P = r9.A0C;
                        this.A09 = AnonymousClass05K.A00;
                        this.A0S = r9.A01;
                        if (C61670oa.A0G()) {
                            Drawable drawable3 = context.getDrawable(R.drawable.prism_tooltip_nub_bottom);
                            if (drawable3 != null) {
                                this.A00 = drawable3.getIntrinsicHeight();
                                Drawable drawable4 = context.getDrawable(R.drawable.prism_tooltip_nub_left);
                                if (drawable4 != null) {
                                    this.A0C = drawable4.getIntrinsicWidth();
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        gestureDetector.setIsLongpressEnabled(false);
                        gestureDetector2.setIsLongpressEnabled(false);
                        this.A03.set(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final int A01(AnonymousClass5Gv r5, C226262fy r6) {
        int ordinal = r6.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            int centerX = r5.A02.centerX();
            TouchInterceptorFrameLayout touchInterceptorFrameLayout = r5.A04;
            if (touchInterceptorFrameLayout != null) {
                int width = centerX - (touchInterceptorFrameLayout.getWidth() / 2);
                int i = r5.A0S;
                if (width < i) {
                    width = i;
                }
                int i2 = r5.A03.right;
                TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = r5.A04;
                if (touchInterceptorFrameLayout2 != null) {
                    int width2 = i2 - touchInterceptorFrameLayout2.getWidth();
                    if (width > width2) {
                        return width2;
                    }
                    return width;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        } else if (ordinal == 3) {
            int i3 = r5.A02.left;
            TouchInterceptorFrameLayout touchInterceptorFrameLayout3 = r5.A04;
            if (touchInterceptorFrameLayout3 != null) {
                return i3 - touchInterceptorFrameLayout3.getWidth();
            }
            throw new IllegalStateException("Required value was null.");
        } else if (ordinal == 4) {
            return r5.A02.right;
        } else {
            throw new UnsupportedOperationException("Unknown position value");
        }
    }

    public static final int A02(AnonymousClass5Gv r3, C226262fy r4) {
        int i;
        int ordinal = r4.ordinal();
        if (ordinal == 0) {
            i = r3.A02.centerY();
        } else if (ordinal == 1) {
            i = ((r3.A02.top - r3.A00) - A00(r3)) - r3.A0F;
        } else if (ordinal == 2) {
            i = r3.A02.bottom;
        } else if (ordinal == 3 || ordinal == 4) {
            int centerY = r3.A02.centerY();
            TouchInterceptorFrameLayout touchInterceptorFrameLayout = r3.A04;
            if (touchInterceptorFrameLayout != null) {
                return centerY - (touchInterceptorFrameLayout.getHeight() / 2);
            }
            throw new IllegalStateException("Required value was null.");
        } else {
            throw new UnsupportedOperationException("Unknown position value");
        }
        if (i < 0) {
            i = 0;
        }
        int i2 = r3.A03.bottom;
        if (i > i2) {
            return i2;
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A05(X.AnonymousClass5Gv r3, X.C226262fy r4) {
        /*
            int r1 = r4.ordinal()
            r2 = 0
            if (r1 == r2) goto L_0x0029
            r0 = 1
            if (r1 == r0) goto L_0x003c
            r0 = 2
            if (r1 == r0) goto L_0x002b
            r0 = 3
            if (r1 == r0) goto L_0x0041
            r0 = 4
            if (r1 != r0) goto L_0x0050
            int r1 = A01(r3, r4)
            int r0 = r3.A0C
            int r1 = r1 + r0
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = r3.A04
            if (r0 == 0) goto L_0x0048
            int r0 = r0.getWidth()
            int r1 = r1 + r0
            android.graphics.Rect r0 = r3.A03
            int r0 = r0.right
        L_0x0027:
            if (r1 > r0) goto L_0x002a
        L_0x0029:
            r2 = 1
        L_0x002a:
            return r2
        L_0x002b:
            int r1 = A02(r3, r4)
            int r0 = r3.A00
            int r1 = r1 + r0
            int r0 = A00(r3)
            int r1 = r1 + r0
            android.graphics.Rect r0 = r3.A03
            int r0 = r0.bottom
            goto L_0x0027
        L_0x003c:
            int r0 = A02(r3, r4)
            goto L_0x0045
        L_0x0041:
            int r0 = A01(r3, r4)
        L_0x0045:
            if (r0 < 0) goto L_0x002a
            goto L_0x0029
        L_0x0048:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0050:
            java.lang.String r0 = "Unknown position value"
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Gv.A05(X.5Gv, X.2fy):boolean");
    }
}
