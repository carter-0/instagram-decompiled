package com.instagram.discovery.mediamap.fragment.bottomsheetbehavior;

import X.0mi;
import X.0qQ;
import X.2cp;
import X.2cs;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C13989Tnp;
import X.C20906X3x;
import X.C252203oj;
import X.C51970G9q;
import X.JTP;
import X.JTR;
import X.JTS;
import X.X97;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;

public final class MapBottomSheetBehavior extends CoordinatorLayout.Behavior implements C252203oj, GestureDetector.OnGestureListener {
    public float A00;
    public float A01;
    public C20906X3x A02;
    public X97 A03;
    public Float A04;
    public WeakReference A05;
    public boolean A06;
    public boolean A07;
    public float A08;
    public float A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final double A0E;
    public final 2cs A0F;
    public final GestureDetector A0G;

    public MapBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        0qQ.A0B(context, 1);
        2cs A022 = 2cp.A00().A02();
        A022.A06 = true;
        this.A0F = A022;
        this.A0E = (double) ViewConfiguration.get(context).getScaledTouchSlop();
        this.A0G = new GestureDetector(context, this);
    }

    public final void A0I(View view, View view2, CoordinatorLayout coordinatorLayout, int i) {
        0qQ.A0B(view2, 2);
    }

    public final boolean A0L(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        boolean A1U = AnonymousClass7TF.A1U(0, coordinatorLayout, view);
        0qQ.A0B(motionEvent, 2);
        if (!coordinatorLayout.A0G(view, Math.round(motionEvent.getX()), Math.round(motionEvent.getY()))) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A0B = false;
            this.A0A = false;
            this.A0C = false;
            this.A06 = false;
            this.A07 = false;
            this.A00 = motionEvent.getRawX();
            this.A01 = motionEvent.getRawY();
            this.A08 = 0.0f;
        } else if (actionMasked == 2 && !this.A07 && !this.A06) {
            float rawX = this.A00 - motionEvent.getRawX();
            float rawY = this.A01 - motionEvent.getRawY();
            boolean A1R = AnonymousClass7TF.A1R((JTR.A00(rawX, rawY) > this.A0E ? 1 : (JTR.A00(rawX, rawY) == this.A0E ? 0 : -1)));
            double A002 = JTS.A00(rawY, rawX);
            if (A1R) {
                if (A002 < 45.0d) {
                    this.A06 = A1U;
                } else {
                    this.A07 = A1U;
                }
            }
        }
        this.A0G.onTouchEvent(motionEvent);
        motionEvent.getRawY();
        boolean A1V = AnonymousClass7TF.A1V(this.A02);
        if (!this.A07 || ((this.A0B || !A1V) && ((float) this.A0F.A09.A00) >= 1.0f && !this.A0A)) {
            return false;
        }
        return true;
    }

    public final boolean A0M(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        X97 x97;
        0qQ.A0B(motionEvent, 2);
        this.A0C = true;
        if ((!this.A0D && motionEvent.getActionMasked() == 2) || motionEvent.getActionMasked() == 0) {
            this.A0D = true;
            X97 x972 = this.A03;
            if (x972 != null) {
                x972.Cxy();
            }
        }
        boolean onTouchEvent = this.A0G.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            2cs r7 = this.A0F;
            r7.A07((-((double) this.A08)) / ((double) A00()));
            C20906X3x x3x = this.A02;
            if (x3x != null) {
                r7.A06((double) x3x.AP4(this.A09, (float) r7.A09.A00, this.A08));
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            X97 x973 = this.A03;
            if (x973 != null) {
                x973.DCD();
            }
            this.A0D = false;
            if (this.A0F.A0C() && (x97 = this.A03) != null) {
                x97.Dja();
            }
        }
        return onTouchEvent;
    }

    public final boolean A0Q(View view, CoordinatorLayout coordinatorLayout, int i) {
        0qQ.A0B(view, 1);
        if (this.A05 == null) {
            this.A05 = new WeakReference(view);
            view.setVisibility(0);
            2cs r3 = this.A0F;
            r3.A02();
            this.A09 = (float) r3.A09.A00;
            r3.A0A(this);
            X97 x97 = this.A03;
            if (x97 != null) {
                x97.Cyl();
            }
        }
        return false;
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r4) {
        0qQ.A0B(r4, 0);
        this.A09 = (float) r4.A09.A00;
        X97 x97 = this.A03;
        if (x97 != null && !this.A0D) {
            x97.Dja();
        }
    }

    public final void DmD(2cs r5) {
        0qQ.A0B(r5, 0);
        X97 x97 = this.A03;
        if (x97 != null) {
            x97.DhQ(this, (float) r5.A01);
        }
    }

    public final void DmE(2cs r9) {
        View view;
        0qQ.A0B(r9, 0);
        WeakReference weakReference = this.A05;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            float f = (float) r9.A09.A00;
            float f2 = 0.0f;
            if (f <= C13989Tnp.A05(this.A04) || f >= 1.0f) {
                this.A0F.A07(0.0d);
                Float f3 = this.A04;
                if (f3 != null) {
                    f2 = f3.floatValue();
                }
                f = 0mi.A00(f, f2, 1.0f);
            }
            float A002 = (float) A00();
            float f4 = 1.0f - 0.0f;
            float f5 = 0.0f - A002;
            float f6 = 0.0f;
            if (f4 != 0.0f) {
                f6 = (f - 0.0f) / f4;
            }
            float f7 = (f6 * f5) + A002;
            float translationY = view.getTranslationY();
            view.setTranslationY(f7);
            X97 x97 = this.A03;
            if (x97 != null) {
                x97.DhJ(this, f, f7, translationY);
            }
        }
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    private final int A00() {
        View view;
        WeakReference weakReference = this.A05;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return 0;
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            return ((View) parent).getHeight();
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if ((r7 & 2) != 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0N(android.view.View r3, android.view.View r4, android.view.View r5, androidx.coordinatorlayout.widget.CoordinatorLayout r6, int r7, int r8) {
        /*
            r2 = this;
            boolean r0 = r2.A0B
            if (r0 != 0) goto L_0x0009
            r1 = r7 & 2
            r0 = 0
            if (r1 == 0) goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            r2.A0B = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.discovery.mediamap.fragment.bottomsheetbehavior.MapBottomSheetBehavior.A0N(android.view.View, android.view.View, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int, int):boolean");
    }

    public final void A0R(boolean z, float f) {
        float A002 = 0mi.A00(f, 0.0f, 1.0f);
        2cs r3 = this.A0F;
        double d = (double) A002;
        if (z) {
            r3.A06(d);
            return;
        }
        r3.A06(d);
        r3.A08(d, true);
        this.A09 = (float) r3.A09.A00;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A08 = f2;
        return true;
    }

    public final void A0J(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        this.A0A = C51970G9q.A1T(i4);
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (A00() == 0 || !this.A0C) {
            return false;
        }
        2cs r3 = this.A0F;
        JTP.A1K(r3, 0mi.A00(((float) r3.A09.A00) + (f2 / ((float) A00())), 0.0f, 1.0f));
        return true;
    }

    public final void A0P(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3) {
        AnonymousClass7TG.A1T(coordinatorLayout, view, view2);
    }
}
