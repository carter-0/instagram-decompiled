package X;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.user.model.User;

/* renamed from: X.2xl  reason: invalid class name and case insensitive filesystem */
public final class C234372xl implements View.OnTouchListener, C252203oj, C234382xm, C234392xn {
    public static final C71392co A0R = C71392co.A04(40.0d, 5.0d);
    public static final C71392co A0S = C71392co.A04(90.0d, 0.0d);
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public int A09;
    public int A0A;
    public Drawable A0B;
    public View A0C;
    public ViewGroup.LayoutParams A0D;
    public TouchInterceptorFrameLayout A0E;
    public 2cv A0F;
    public C253723rH A0G;
    public C253913rc A0H;
    public C234352xj A0I;
    public Integer A0J;
    public boolean A0K;
    public boolean A0L;
    public final ViewGroup A0M;
    public final 2cs A0N;
    public final 2cs A0O;
    public final PointF A0P = new PointF();
    public final boolean A0Q;

    public C234372xl(ViewGroup viewGroup, boolean z) {
        0qQ.A0B(viewGroup, 1);
        this.A0M = viewGroup;
        this.A0Q = z;
        this.A0J = AnonymousClass05K.A00;
        2cp A002 = C61340me.A00();
        2cs A022 = A002.A02();
        A022.A09(A0S);
        this.A0O = A022;
        2cs A023 = A002.A02();
        A023.A09(A0R);
        A023.A06 = true;
        this.A0N = A023;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0027, code lost:
        if (r4 <= r2) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        if (r4 < r2) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
        r4 = ((r4 - r2) * 0.30000001192092896d) + r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Dgn(X.C253913rc r9) {
        /*
            r8 = this;
            r0 = 0
            X.0qQ.A0B(r9, r0)
            android.view.ScaleGestureDetector r0 = r9.A00
            float r1 = r0.getFocusX()
            float r0 = r0.getFocusY()
            r8.A02(r1, r0)
            X.2cs r6 = r8.A0O
            X.2ct r7 = r6.A09
            double r4 = r7.A00
            float r0 = r9.A00()
            double r0 = (double) r0
            double r4 = r4 * r0
            r1 = 4613937818241073152(0x4008000000000000, double:3.0)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0029
            double r2 = r7.A00
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0035
        L_0x0029:
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x003d
            double r2 = r7.A00
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x003d
        L_0x0035:
            double r4 = r4 - r2
            r0 = 4599075939685498880(0x3fd3333340000000, double:0.30000001192092896)
            double r4 = r4 * r0
            double r4 = r4 + r2
        L_0x003d:
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r2 = 4614388178311184384(0x40099999a0000000, double:3.200000047683716)
            double r0 = java.lang.Math.max(r4, r0)
            double r1 = java.lang.Math.min(r0, r2)
            r0 = 1
            r6.A08(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C234372xl.Dgn(X.3rc):boolean");
    }

    public final boolean Dgo(C253913rc r4) {
        0qQ.A0B(r4, 0);
        ScaleGestureDetector scaleGestureDetector = r4.A00;
        float focusX = scaleGestureDetector.getFocusX();
        boolean z = this.A0L;
        float focusY = scaleGestureDetector.getFocusY();
        if (z) {
            focusY -= (float) this.A0A;
        }
        A03(focusX, focusY + this.A04);
        return true;
    }

    public final void Dgt(C253913rc r1) {
    }

    public final void DmB(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r23) {
        2cs r1 = r23;
        0qQ.A0B(r1, 0);
        float f = (float) r1.A09.A00;
        if (this.A0J == AnonymousClass05K.A01) {
            A01(f);
        } else if (this.A0K) {
            View view = this.A0C;
            if (view != null) {
                view.setAlpha(f);
                A00((float) AnonymousClass37Q.A04((double) f, 0.0d, 1.0d, 0.0d, (double) this.A01));
                return;
            }
            throw new IllegalStateException("Required value was null.");
        } else {
            double d = (double) f;
            C71412ct r5 = this.A0O.A09;
            A01((float) AnonymousClass37Q.A04(d, 0.0d, 1.0d, 1.0d, r5.A00));
            double d2 = (double) this.A02;
            double d3 = r5.A00;
            A04((float) AnonymousClass37Q.A04(d, 0.0d, 1.0d, 0.0d, d3 * d2), (float) AnonymousClass37Q.A04(d, 0.0d, 1.0d, 0.0d, d3 * ((double) this.A03)));
        }
    }

    public final void Exy(View view, C253723rH r9, C253913rc r10) {
        0qQ.A0B(r10, 2);
        this.A0J = AnonymousClass05K.A01;
        this.A0G = r9;
        View view2 = (View) r9;
        0nA.A0V(view2, view.getMeasuredHeight());
        view2.setHasTransientState(true);
        this.A0C = view;
        this.A04 = view.getTranslationY();
        this.A0D = view.getLayoutParams();
        this.A0H = r10;
        r10.A01.add(this);
        2cv r1 = this.A0F;
        if (r1 == null) {
            r1 = C324286z2.A00(view);
            this.A0F = r1;
        }
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A0E;
        if (r1 != null && touchInterceptorFrameLayout != null) {
            r1.requestDisallowInterceptTouchEvent(false);
            r1.CNi(this);
            r1.getParent().requestDisallowInterceptTouchEvent(true);
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i = iArr[1];
            r1.getLocationInWindow(iArr);
            this.A0A = i - iArr[1];
            this.A09 = r9.indexOfChild(view);
            r9.AOy(view);
            view2.invalidate();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.topMargin = i;
            A00(0.0f);
            touchInterceptorFrameLayout.setVisibility(0);
            touchInterceptorFrameLayout.attachViewToParent(view, 0, layoutParams);
            touchInterceptorFrameLayout.bringToFront();
            ViewGroup viewGroup = this.A0M;
            viewGroup.requestLayout();
            viewGroup.invalidate();
            ScaleGestureDetector scaleGestureDetector = r10.A00;
            A03(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            2cs r2 = this.A0O;
            r2.A08(1.0d, true);
            r2.A0A(this);
            C234352xj r0 = this.A0I;
            if (r0 != null) {
                C234342xi.A00(r0.A00, false);
            }
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        1Xj r3;
        User A2A;
        Long l;
        float focusY;
        0qQ.A0B(motionEvent, 1);
        this.A0L = true;
        C253913rc r0 = this.A0H;
        if (r0 != null) {
            r0.A01(motionEvent);
            C234352xj r32 = this.A0I;
            if (!(r32 == null || motionEvent.getAction() == 6 || motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
                C234342xi.A00(r32.A00, false);
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            if (this.A0Q) {
                                this.A0J = AnonymousClass05K.A0N;
                                if (motionEvent.getPointerCount() == 2) {
                                    int pointerCount = (motionEvent.getPointerCount() - motionEvent.getActionIndex()) - 1;
                                    this.A07 = motionEvent.getX(pointerCount) - this.A05;
                                    focusY = motionEvent.getY(pointerCount);
                                } else {
                                    C253913rc r02 = this.A0H;
                                    if (r02 != null) {
                                        this.A07 = r02.A00.getFocusX() - this.A05;
                                        C253913rc r03 = this.A0H;
                                        if (r03 != null) {
                                            focusY = r03.A00.getFocusY();
                                        } else {
                                            throw new IllegalStateException("Required value was null.");
                                        }
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                                this.A08 = focusY - this.A06;
                            }
                        }
                    }
                } else if (this.A0Q) {
                    Integer num = this.A0J;
                    Integer num2 = AnonymousClass05K.A0N;
                    C253913rc r04 = this.A0H;
                    if (num == num2) {
                        if (r04 != null) {
                            float focusX = r04.A00.getFocusX() - this.A07;
                            C253913rc r05 = this.A0H;
                            if (r05 != null) {
                                A02(focusX, r05.A00.getFocusY() - this.A08);
                                return true;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        throw new IllegalStateException("Required value was null.");
                    } else if (r04 != null) {
                        this.A05 = r04.A00.getFocusX();
                        C253913rc r06 = this.A0H;
                        if (r06 != null) {
                            this.A06 = r06.A00.getFocusY();
                            return true;
                        }
                        throw new IllegalStateException("Required value was null.");
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                return true;
            }
            Integer num3 = this.A0J;
            if (num3 == AnonymousClass05K.A01 || num3 == AnonymousClass05K.A0N) {
                this.A05 = 0.0f;
                this.A06 = 0.0f;
                this.A07 = 0.0f;
                this.A08 = 0.0f;
                this.A0J = AnonymousClass05K.A0C;
                this.A01 = this.A00;
                2cs r33 = this.A0N;
                r33.A08(1.0d, true);
                r33.A0A(this);
                r33.A06(0.0d);
                C234352xj r07 = this.A0I;
                if (r07 != null) {
                    C234342xi r9 = r07.A00;
                    C234342xi.A00(r9, true);
                    1Xj r7 = r9.A04;
                    if (r7 != null) {
                        UserSession userSession = r9.A06;
                        if (182.A06(0Tu.A05, userSession, 36314399459314201L)) {
                            AnonymousClass4DU r4 = r9.A07;
                            0wc A012 = AnonymousClass0kN.A01(new 0xG(r4.getModuleName()), userSession);
                            r9.A03 = A012;
                            0Aj A002 = A012.A00(A012.A00, "instagram_organic_zoom_duration");
                            if (!(!A002.isSampled() || (r3 = r9.A04) == null || (A2A = r3.A2A(userSession)) == null)) {
                                A002.A9F("a_pk", Long.valueOf(Long.parseLong(A2A.getId())));
                                String id = r3.getId();
                                if (id != null) {
                                    A002.AAJ("m_pk", id);
                                    A002.AAJ("source_of_action", r4.getModuleName());
                                    String C9L = r3.C9L();
                                    if (C9L == null) {
                                        C9L = "";
                                    }
                                    A002.AAJ("tracking_token", C9L);
                                    A002.AAJ("inventory_source", r3.A0C.BIl());
                                    String A30 = r3.A30();
                                    if (A30 != null) {
                                        l = 00y.A0n(10, A30);
                                    } else {
                                        l = null;
                                    }
                                    A002.A9F("media_id", l);
                                    A002.A9F("media_author_id", 00y.A0n(10, A2A.getId()));
                                    A002.AAJ("module_name", r4.getModuleName());
                                    A002.AAJ("delivery_flags", C243413Yr.A00(r3.A0e));
                                    A002.A7p("production_build", true);
                                    A002.A8D(TraceFieldType.Duration, Double.valueOf(((double) (System.currentTimeMillis() - r9.A02)) / 1000.0d));
                                    A002.Cgf();
                                    return true;
                                }
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            AnonymousClass4DU r11 = r9.A07;
                            C254523sc A042 = C254513sb.A04(r7, r11, "zoom_duration");
                            A042.A0G(userSession, r7);
                            A042.A09(r9.A01);
                            A042.A01 = ((double) (System.currentTimeMillis() - r9.A02)) / 1000.0d;
                            C233822wX.A0E(userSession, A042, r7, r11, r9.A00);
                            return true;
                        }
                    }
                }
            }
            return true;
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A00(float f) {
        this.A00 = f;
        Drawable drawable = this.A0B;
        if (drawable != null) {
            drawable.setAlpha(Math.round(f * 255.0f));
        }
    }

    private final void A02(float f, float f2) {
        if (this.A0L) {
            f2 -= (float) this.A0A;
        }
        float f3 = f2 + this.A04;
        PointF pointF = this.A0P;
        float f4 = f - pointF.x;
        float f5 = f3 - pointF.y;
        float f6 = this.A02 + f4;
        this.A02 = f6;
        this.A03 += f5;
        View view = this.A0C;
        if (view != null) {
            float scaleX = f6 * view.getScaleX();
            float f7 = this.A03;
            View view2 = this.A0C;
            if (view2 != null) {
                A04(scaleX, f7 * view2.getScaleY());
                A03(f, f3);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A03(float f, float f2) {
        PointF pointF = this.A0P;
        pointF.x = f;
        pointF.y = f2;
        View view = this.A0C;
        if (view != null) {
            view.setPivotX(f);
            View view2 = this.A0C;
            if (view2 != null) {
                view2.setPivotY(f2);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A04(float f, float f2) {
        View view = this.A0C;
        if (view != null) {
            view.setTranslationX(f);
            View view2 = this.A0C;
            if (view2 != null) {
                view2.setTranslationY(f2);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void DmC(2cs r7) {
        if (this.A0J == AnonymousClass05K.A0C) {
            C253913rc r0 = this.A0H;
            if (r0 != null) {
                r0.A01.remove(this);
                this.A0O.A0B(this);
                this.A0N.A0B(this);
                View view = this.A0C;
                if (view != null) {
                    TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A0E;
                    if (touchInterceptorFrameLayout != null) {
                        if (view.getParent() == touchInterceptorFrameLayout) {
                            View view2 = this.A0C;
                            if (view2 != null) {
                                touchInterceptorFrameLayout.detachViewFromParent(view2);
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        touchInterceptorFrameLayout.setVisibility(8);
                    }
                    View view3 = this.A0C;
                    if (view3 != null) {
                        float width = ((float) view3.getWidth()) / 2.0f;
                        View view4 = this.A0C;
                        if (view4 != null) {
                            A03(width, ((float) view4.getHeight()) / 2.0f);
                            A04(0.0f, this.A04);
                            A01(1.0f);
                            if (this.A0K) {
                                View view5 = this.A0C;
                                if (view5 != null) {
                                    view5.setAlpha(1.0f);
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                            C253723rH r4 = this.A0G;
                            if (r4 != null) {
                                r4.ACu(this.A0C, this.A09, this.A0D);
                                ViewGroup.LayoutParams layoutParams = this.A0D;
                                if (layoutParams != null) {
                                    C253723rH r2 = this.A0G;
                                    if (r2 != null) {
                                        0nA.A0V((View) r2, layoutParams.height);
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                                View view6 = this.A0C;
                                if (view6 != null) {
                                    view6.requestLayout();
                                    this.A09 = -1;
                                    this.A0D = null;
                                    this.A0A = 0;
                                    this.A02 = 0.0f;
                                    this.A03 = 0.0f;
                                    2cv r02 = this.A0F;
                                    if (r02 != null) {
                                        r02.CNi((View.OnTouchListener) null);
                                        this.A0F = null;
                                        this.A0H = null;
                                        this.A0L = false;
                                        this.A0K = false;
                                        this.A0C = null;
                                        C253723rH r03 = this.A0G;
                                        if (r03 != null) {
                                            r03.requestDisallowInterceptTouchEvent(false);
                                            C253723rH r04 = this.A0G;
                                            if (r04 != null) {
                                                r04.setHasTransientState(false);
                                                this.A0G = null;
                                                this.A0J = AnonymousClass05K.A00;
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
                            throw new IllegalStateException("Required value was null.");
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final boolean isIdle() {
        if (this.A0J == AnonymousClass05K.A00) {
            return true;
        }
        return false;
    }

    public final void start() {
        ViewGroup viewGroup = this.A0M;
        TouchInterceptorFrameLayout inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zoom, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout");
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = inflate;
        this.A0E = touchInterceptorFrameLayout;
        if (touchInterceptorFrameLayout != null) {
            touchInterceptorFrameLayout.CNi(C238163Au.A00);
            TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = this.A0E;
            if (touchInterceptorFrameLayout2 != null) {
                this.A0B = touchInterceptorFrameLayout2.getBackground().mutate();
                viewGroup.addView(this.A0E);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void stop() {
        this.A0M.post(new C320246s3(this));
    }

    private final void A01(float f) {
        if (Float.isNaN(f)) {
            0wb.A03("SimpleZoomableViewController", C273654mx.A00(3461));
            f = 1.0f;
        }
        View view = this.A0C;
        if (view != null) {
            view.setScaleX(f);
            View view2 = this.A0C;
            if (view2 != null) {
                view2.setScaleY(f);
                A00((float) AnonymousClass37Q.A04((double) f, 0.5d, 3.200000047683716d, 0.0d, 1.0d));
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
