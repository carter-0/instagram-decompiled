package com.facebook.common.draggableview;

import X.03v;
import X.0fh;
import X.0qQ;
import X.0sJ;
import X.0sr;
import X.2cp;
import X.2cs;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C14283TtH;
import X.C14284TtI;
import X.C14287TtL;
import X.C15048ULb;
import X.C66584MXp;
import X.C69292Nis;
import X.DbX;
import X.JTT;
import X.N1S;
import X.NC9;
import X.PUL;
import X.UF2;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class DraggableViewContainer extends FrameLayout {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public View A09;
    public C69292Nis A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public Rect A0F;
    public ViewGroup.LayoutParams A0G;
    public C69292Nis A0H;
    public 0sJ A0I;
    public boolean A0J;
    public final 2cs A0K;
    public final 2cs A0L;
    public final List A0M;
    public final GestureDetector A0N;
    public final NC9 A0O;
    public final 2cp A0P;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DraggableViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    private final void A02() {
        this.A0B = false;
        2cs r2 = this.A0K;
        r2.A08(r2.A01, true);
        2cs r22 = this.A0L;
        r22.A08(r22.A01, true);
        C14283TtH.A00.remove(this);
        AbstractCollection abstractCollection = (AbstractCollection) C14283TtH.A00().get(this);
        if (abstractCollection != null && !abstractCollection.isEmpty()) {
            ArrayList A1D = AnonymousClass7TE.A1D(abstractCollection);
            int size = A1D.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((C14284TtI) A1D.get(size)).A0Q(this);
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
        if (r1 != false) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(android.view.View r13, X.C69292Nis r14, X.C15048ULb r15, int r16, int r17, int r18, int r19, int r20, int r21, boolean r22) {
        /*
            r12 = this;
            r6 = r15
            r11 = 0
            X.0qQ.A0B(r13, r11)
            java.lang.String r1 = "DraggableViewContainer.update"
            r0 = 1082865386(0x408b36ea, float:4.3504534)
            X.0fh.A01(r1, r0)
            int r0 = r12.A05     // Catch:{ all -> 0x00a8 }
            r2 = 1
            r4 = r19
            r3 = r20
            r1 = r21
            r5 = r18
            if (r5 != r0) goto L_0x0028
            int r0 = r12.A08     // Catch:{ all -> 0x00a8 }
            if (r4 != r0) goto L_0x0028
            int r0 = r12.A07     // Catch:{ all -> 0x00a8 }
            if (r3 != r0) goto L_0x0028
            int r0 = r12.A00     // Catch:{ all -> 0x00a8 }
            if (r1 != r0) goto L_0x0028
            r1 = 0
            goto L_0x0031
        L_0x0028:
            r12.A05 = r5     // Catch:{ all -> 0x00a8 }
            r12.A08 = r4     // Catch:{ all -> 0x00a8 }
            r12.A07 = r3     // Catch:{ all -> 0x00a8 }
            r12.A00 = r1     // Catch:{ all -> 0x00a8 }
            r1 = 1
        L_0x0031:
            X.Nis r0 = r12.A0H     // Catch:{ all -> 0x00a8 }
            if (r14 == r0) goto L_0x003c
            if (r14 == 0) goto L_0x0039
            r12.A0A = r14     // Catch:{ all -> 0x00a8 }
        L_0x0039:
            r12.A0H = r14     // Catch:{ all -> 0x00a8 }
            r1 = 1
        L_0x003c:
            int r0 = r12.A02     // Catch:{ all -> 0x00a8 }
            r3 = r17
            r4 = r16
            if (r4 != r0) goto L_0x0048
            int r0 = r12.A01     // Catch:{ all -> 0x00a8 }
            if (r3 == r0) goto L_0x004d
        L_0x0048:
            r12.A02 = r4     // Catch:{ all -> 0x00a8 }
            r12.A01 = r3     // Catch:{ all -> 0x00a8 }
            r1 = 1
        L_0x004d:
            android.view.View r0 = r12.A09     // Catch:{ all -> 0x00a8 }
            if (r0 != r13) goto L_0x0052
            goto L_0x0067
        L_0x0052:
            if (r0 == 0) goto L_0x0057
            r12.removeView(r0)     // Catch:{ all -> 0x00a8 }
        L_0x0057:
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()     // Catch:{ all -> 0x00a8 }
            r12.A0G = r0     // Catch:{ all -> 0x00a8 }
            r12.A09 = r13     // Catch:{ all -> 0x00a8 }
            android.widget.FrameLayout$LayoutParams r0 = r12.generateDefaultLayoutParams()     // Catch:{ all -> 0x00a8 }
            r12.addView(r13, r0)     // Catch:{ all -> 0x00a8 }
            goto L_0x0069
        L_0x0067:
            if (r1 == 0) goto L_0x00a1
        L_0x0069:
            if (r22 == 0) goto L_0x009e
            if (r15 != 0) goto L_0x0090
            float r0 = r13.getTranslationX()     // Catch:{ all -> 0x00a8 }
            int r1 = (int) r0     // Catch:{ all -> 0x00a8 }
            float r0 = r13.getTranslationY()     // Catch:{ all -> 0x00a8 }
            int r0 = (int) r0     // Catch:{ all -> 0x00a8 }
            int r7 = r13.getLeft()     // Catch:{ all -> 0x00a8 }
            int r7 = r7 + r1
            int r8 = r13.getTop()     // Catch:{ all -> 0x00a8 }
            int r8 = r8 + r0
            int r9 = r13.getRight()     // Catch:{ all -> 0x00a8 }
            int r9 = r9 + r1
            int r10 = r13.getBottom()     // Catch:{ all -> 0x00a8 }
            int r10 = r10 + r0
            X.ULb r6 = new X.ULb     // Catch:{ all -> 0x00a8 }
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00a8 }
        L_0x0090:
            r12.A0B = r2     // Catch:{ all -> 0x00a8 }
            r12.A08(r6, r11)     // Catch:{ all -> 0x00a8 }
            X.PUM r0 = new X.PUM     // Catch:{ all -> 0x00a8 }
            r0.<init>(r12)     // Catch:{ all -> 0x00a8 }
            r12.post(r0)     // Catch:{ all -> 0x00a8 }
            goto L_0x00a1
        L_0x009e:
            A07(r12, r11)     // Catch:{ all -> 0x00a8 }
        L_0x00a1:
            r0 = 1844933909(0x6df77515, float:9.5730426E27)
            X.0fh.A00(r0)
            return
        L_0x00a8:
            r1 = move-exception
            r0 = 518850426(0x1eed077a, float:2.5096443E-20)
            X.0fh.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.draggableview.DraggableViewContainer.A0A(android.view.View, X.Nis, X.ULb, int, int, int, int, int, int, boolean):void");
    }

    private final void A03() {
        this.A0K.A08(0.0d, true);
        this.A0L.A08(0.0d, true);
        View view = this.A09;
        if (view != null) {
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }
    }

    private final void A05(C69292Nis nis, boolean z, boolean z2) {
        0fh.A01("DraggableViewContainer.setCorner", -711763862);
        try {
            if (this.A0A != nis) {
                this.A0A = nis;
                if (z) {
                    A07(this, z2);
                }
            }
        } finally {
            0fh.A00(285698293);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        if (r4 == X.C69292Nis.A03) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(com.facebook.common.draggableview.DraggableViewContainer r8, java.lang.Double r9, java.lang.Double r10, int r11, int r12) {
        /*
            android.view.View r3 = r8.A09
            if (r3 == 0) goto L_0x00b1
            X.ULb r1 = r8.getCenterBounds()
            int r6 = r1.A01
            int r0 = r1.A02
            int r5 = X.C66584MXp.A02(r11, r6, r0, r6)
            int r4 = r1.A03
            int r0 = r1.A00
            int r2 = X.C66584MXp.A02(r12, r4, r0, r4)
            r1 = 1
            boolean r0 = X.AnonymousClass7TF.A1S(r5, r6)
            if (r2 == r4) goto L_0x0020
            r1 = 0
        L_0x0020:
            if (r0 == 0) goto L_0x00ff
            if (r1 == 0) goto L_0x00fb
            X.Nis r0 = X.C69292Nis.TOP_LEFT
        L_0x0026:
            r5 = 0
            r8.A05(r0, r5, r5)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0079
            android.view.View r7 = r8.A09
            boolean r1 = r8.A0C
            r0 = 0
            if (r1 == 0) goto L_0x0076
            if (r7 == 0) goto L_0x0076
            X.Nis r4 = r8.A0A
            X.Nis r1 = X.C69292Nis.TOP_LEFT
            if (r4 == r1) goto L_0x0044
            X.Nis r2 = X.C69292Nis.BOTTOM_LEFT
            r1 = 0
            if (r4 != r2) goto L_0x0045
        L_0x0044:
            r1 = 1
        L_0x0045:
            int r1 = A00(r7, r8, r1)
            if (r11 != r1) goto L_0x0076
            float r1 = X.AnonymousClass7TE.A02(r7)
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            float r1 = r1 * r0
            int r4 = (int) r1
            float r0 = r7.getY()
            int r6 = (int) r0
            X.Nis r0 = r8.A0A
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x00f0
            r0 = 2
            if (r1 == r0) goto L_0x00dd
            r0 = 3
            if (r1 == r0) goto L_0x00cc
            r0 = 4
            if (r1 == r0) goto L_0x00b2
            if (r1 != r5) goto L_0x0109
            int r1 = r7.getHeight()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r5, r5, r4, r1)
        L_0x0076:
            r8.setGestureExclusionRect(r0)
        L_0x0079:
            if (r9 == 0) goto L_0x0084
            double r0 = r9.doubleValue()
            X.2cs r2 = r8.A0K
            r2.A07(r0)
        L_0x0084:
            if (r10 == 0) goto L_0x008f
            double r0 = r10.doubleValue()
            X.2cs r2 = r8.A0L
            r2.A07(r0)
        L_0x008f:
            X.2cs r2 = r8.A0K
            float r1 = r3.getTranslationX()
            int r0 = X.C66584MXp.A03(r3)
            int r11 = r11 - r0
            float r0 = (float) r11
            float r1 = r1 + r0
            double r0 = (double) r1
            r2.A06(r0)
            X.2cs r2 = r8.A0L
            float r1 = r3.getTranslationY()
            int r0 = X.C66584MXp.A04(r3)
            int r12 = r12 - r0
            float r0 = (float) r12
            float r1 = r1 + r0
            double r0 = (double) r1
            r2.A06(r0)
        L_0x00b1:
            return
        L_0x00b2:
            int r5 = r8.getWidth()
            int r5 = r5 - r4
            int r4 = r8.getHeight()
            int r4 = r4 - r6
            int r2 = r8.getWidth()
            int r1 = r8.getHeight()
            int r0 = r8.A00
            int r1 = r1 - r0
            android.graphics.Rect r0 = X.C66580MXl.A0C(r5, r4, r2, r1)
            goto L_0x0076
        L_0x00cc:
            int r2 = r8.getHeight()
            int r2 = r2 - r6
            int r1 = r8.getHeight()
            int r0 = r8.A00
            int r1 = r1 - r0
            android.graphics.Rect r0 = X.C66580MXl.A0C(r5, r2, r4, r1)
            goto L_0x0076
        L_0x00dd:
            int r2 = r8.getWidth()
            int r2 = r2 - r4
            int r1 = r8.getWidth()
            int r0 = r7.getHeight()
            int r0 = r0 + r6
            android.graphics.Rect r0 = X.C66580MXl.A0C(r2, r6, r1, r0)
            goto L_0x0076
        L_0x00f0:
            int r0 = r7.getHeight()
            int r0 = r0 + r6
            android.graphics.Rect r0 = X.C66580MXl.A0C(r5, r6, r4, r0)
            goto L_0x0076
        L_0x00fb:
            X.Nis r0 = X.C69292Nis.BOTTOM_LEFT
            goto L_0x0026
        L_0x00ff:
            if (r1 == 0) goto L_0x0105
            X.Nis r0 = X.C69292Nis.TOP_RIGHT
            goto L_0x0026
        L_0x0105:
            X.Nis r0 = X.C69292Nis.BOTTOM_RIGHT
            goto L_0x0026
        L_0x0109:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.draggableview.DraggableViewContainer.A06(com.facebook.common.draggableview.DraggableViewContainer, java.lang.Double, java.lang.Double, int, int):void");
    }

    public static final void A07(DraggableViewContainer draggableViewContainer, boolean z) {
        if (!draggableViewContainer.A0B) {
            draggableViewContainer.A08(draggableViewContainer.getCurrentFrame(), z);
        }
    }

    private final void A08(C15048ULb uLb, boolean z) {
        0fh.A01("DraggableViewContainer.moveToFrame", 655361040);
        try {
            View view = this.A09;
            if (view != null) {
                A03();
                if (z) {
                    0fh.A01("DraggableViewContainer.beginDelayedTransition", 1670718631);
                    C14287TtL ttL = new C14287TtL();
                    ttL.A0L(200);
                    ttL.A0A(new UF2(this, 1));
                    C14283TtH.A02(this, ttL);
                }
                ViewGroup.MarginLayoutParams A0G2 = DbX.A0G(view);
                A0G2.leftMargin = uLb.A01;
                A0G2.topMargin = uLb.A03;
                int width = getWidth();
                int i = uLb.A02;
                A0G2.rightMargin = width - i;
                A0G2.bottomMargin = getHeight() - i;
                A0G2.width = uLb.A02 - uLb.A01;
                A0G2.height = uLb.A00 - uLb.A03;
                view.setLayoutParams(A0G2);
            }
            0fh.A00(1161051742);
        } catch (Throwable th) {
            throw th;
        } finally {
        }
    }

    public static final boolean A09(View view, DraggableViewContainer draggableViewContainer, boolean z) {
        float A022;
        if (!draggableViewContainer.A0C) {
            return false;
        }
        float A023 = AnonymousClass7TE.A02(view) * 0.1f;
        float x = view.getX();
        if (z) {
            A022 = -x;
        } else {
            A022 = (x + AnonymousClass7TE.A02(view)) - AnonymousClass7TE.A02(draggableViewContainer);
        }
        if (A022 > A023) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final C15048ULb getCenterBounds() {
        return new C15048ULb((this.A02 / 2) + this.A05, (this.A01 / 2) + this.A08, (getWidth() - this.A07) - (this.A02 / 2), (getHeight() - this.A00) - (this.A01 / 2), 0);
    }

    public static /* synthetic */ void setCorner$default(DraggableViewContainer draggableViewContainer, C69292Nis nis, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            draggableViewContainer.A05(nis, z, z2);
            return;
        }
        throw AnonymousClass7TE.A1B("Super calls with default arguments not supported in this target, function: setCorner");
    }

    private final void setGestureExclusionRect(Rect rect) {
        View view;
        if (!0qQ.A0K(this.A0F, rect)) {
            this.A0F = rect;
            if (this.A0C && (view = this.A09) != null) {
                view.requestLayout();
            }
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view = this.A09;
        if (view == null || motionEvent == null || this.A06 != 0) {
            return false;
        }
        float x = motionEvent.getX() - view.getTranslationX();
        float y = motionEvent.getY() - view.getTranslationY();
        if (this.A0J || (((float) view.getLeft()) <= x && x <= ((float) view.getRight()) && ((float) view.getTop()) <= y && y <= ((float) view.getBottom()))) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public final 0sJ getContainerSizeChangedListener() {
        return this.A0I;
    }

    public final C69292Nis getCorner() {
        return this.A0A;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A0E) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void removeView(View view) {
        int i;
        0fh.A01("DraggableViewContainer.removeView", -1602354141);
        if (view != null) {
            try {
                View view2 = this.A09;
                if (view2 != null && view2 == view) {
                    A02();
                    ViewGroup.LayoutParams layoutParams = this.A0G;
                    if (layoutParams != null) {
                        view.setLayoutParams(layoutParams);
                    }
                    this.A0G = null;
                    A03();
                    super.removeView(this.A09);
                    this.A09 = null;
                    i = 648716430;
                    0fh.A00(i);
                }
            } catch (Throwable th) {
                0fh.A00(-1240913838);
                throw th;
            }
        }
        i = 497492323;
        0fh.A00(i);
    }

    public static final int A00(View view, DraggableViewContainer draggableViewContainer, boolean z) {
        float A022;
        float width = ((float) (view.getWidth() / 2)) - (AnonymousClass7TE.A02(view) * 0.2f);
        if (z) {
            A022 = -width;
        } else {
            A022 = AnonymousClass7TE.A02(draggableViewContainer) + width;
        }
        return (int) A022;
    }

    public static final void A04(View view, DraggableViewContainer draggableViewContainer, Boolean bool) {
        boolean A092;
        C15048ULb centerBounds = draggableViewContainer.getCenterBounds();
        int A032 = C66584MXp.A03(view);
        int i = centerBounds.A01;
        int A022 = C66584MXp.A02(A032, i, centerBounds.A02, i);
        int A042 = C66584MXp.A04(view);
        int i2 = centerBounds.A03;
        int A023 = C66584MXp.A02(A042, i2, centerBounds.A00, i2);
        boolean A1S = AnonymousClass7TF.A1S(A022, i);
        if (bool != null) {
            A092 = bool.booleanValue();
        } else {
            A092 = A09(view, draggableViewContainer, A1S);
        }
        if (A092) {
            A022 = A00(view, draggableViewContainer, A1S);
        }
        A06(draggableViewContainer, (Double) null, (Double) null, A022, A023);
    }

    private final C15048ULb getCurrentFrame() {
        int i;
        int i2;
        Point point;
        int i3;
        C15048ULb centerBounds = getCenterBounds();
        int ordinal = this.A0A.ordinal();
        if (ordinal == 1) {
            i3 = centerBounds.A01;
            i2 = centerBounds.A03;
            point = new Point(i, i2);
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                i = centerBounds.A01;
            } else if (ordinal == 4) {
                i = centerBounds.A02;
            } else if (ordinal == 0) {
                point = new Point(0, 0);
            } else {
                throw AnonymousClass7TE.A1K();
            }
            i2 = centerBounds.A00;
            point = new Point(i, i2);
        } else {
            i3 = centerBounds.A02;
            i2 = centerBounds.A03;
            point = new Point(i, i2);
        }
        int i4 = point.x;
        int i5 = this.A02 / 2;
        int i6 = point.y;
        int i7 = this.A01 / 2;
        return new C15048ULb(i4 - i5, i6 - i7, i4 + i5, i6 + i7, 0);
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(652006985);
        super.onAttachedToWindow();
        2cs r0 = this.A0K;
        NC9 nc9 = this.A0O;
        r0.A0A(nc9);
        this.A0L.A0A(nc9);
        AnonymousClass0fD.A0D(1926936154, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(-600353369);
        A02();
        2cs r0 = this.A0K;
        NC9 nc9 = this.A0O;
        r0.A0B(nc9);
        this.A0L.A0B(nc9);
        super.onDetachedFromWindow();
        AnonymousClass0fD.A0D(-265175903, A062);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.A0C) {
            03v.A0H(this, 0sr.A1N(this.A0F));
        }
        if (this.A06 > 0) {
            A03();
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(-1577179644);
        super.onSizeChanged(i, i2, i3, i4);
        A02();
        post(new PUL(this));
        0sJ r4 = this.A0I;
        if (r4 != null) {
            r4.invoke(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
        AnonymousClass0fD.A0D(-1056570532, A062);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A052 = AnonymousClass0fD.A05(-888600730);
        boolean z = false;
        if (motionEvent == null || this.A0D) {
            i = -98724687;
        } else {
            int action = motionEvent.getAction();
            if (action == 0) {
                requestDisallowInterceptTouchEvent(true);
                this.A0J = true;
                Iterator it = this.A0M.iterator();
                while (it.hasNext()) {
                    it.next();
                    motionEvent.getX();
                    motionEvent.getY();
                }
            } else if (action == 1 || action == 3) {
                requestDisallowInterceptTouchEvent(false);
                this.A0J = false;
                Iterator it2 = this.A0M.iterator();
                while (it2.hasNext()) {
                    it2.next();
                    motionEvent.getX();
                    motionEvent.getY();
                }
            }
            z = this.A0N.onTouchEvent(motionEvent);
            View view = this.A09;
            if (view != null && ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && !z)) {
                A04(view, this, (Boolean) null);
            }
            i = -1022691056;
        }
        AnonymousClass0fD.A0C(i, A052);
        return z;
    }

    public final void setContainerSizeChangedListener(0sJ r1) {
        this.A0I = r1;
    }

    public final void setDockingEnabled(boolean z) {
        this.A0C = z;
    }

    public final void setShouldDisableDragging(boolean z) {
        this.A0D = z;
    }

    public final void setShouldInterceptChildTouchEvents(boolean z) {
        this.A0E = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggableViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        2cp A012 = 2cp.A01(Choreographer.getInstance());
        this.A0P = A012;
        2cs A022 = A012.A02();
        0qQ.A0A(A022);
        A022.A02 = 0.3d;
        A022.A00 = 0.3d;
        this.A0K = A022;
        2cs A023 = A012.A02();
        0qQ.A0A(A023);
        A023.A02 = 0.3d;
        A023.A00 = 0.3d;
        this.A0L = A023;
        this.A0O = new NC9(this, 0);
        this.A0A = C69292Nis.TOP_RIGHT;
        this.A0N = new GestureDetector(context, new N1S(this));
        this.A0M = AnonymousClass7TE.A1C();
    }

    public /* synthetic */ DraggableViewContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DraggableViewContainer(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}
