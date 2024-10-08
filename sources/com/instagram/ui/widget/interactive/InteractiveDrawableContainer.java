package com.instagram.ui.widget.interactive;

import X.01V;
import X.0Tu;
import X.0eP;
import X.0qQ;
import X.0sr;
import X.182;
import X.1UV;
import X.2cs;
import X.AEV;
import X.AJL;
import X.Ag5;
import X.AnonymousClass00P;
import X.AnonymousClass2hV;
import X.AnonymousClass3Z0;
import X.AnonymousClass5MI;
import X.AnonymousClass5MJ;
import X.AnonymousClass88G;
import X.AnonymousClass8BH;
import X.AnonymousClass8DA;
import X.AnonymousClass8QU;
import X.AnonymousClass91c;
import X.AnonymousClass9SF;
import X.B2K;
import X.B3f;
import X.C16338Ut8;
import X.C252203oj;
import X.C279284yO;
import X.C294975nL;
import X.C299875vz;
import X.C306386Ly;
import X.C310416b1;
import X.C347017w8;
import X.C349027zT;
import X.C349047zV;
import X.C3500282x;
import X.C3500783d;
import X.C3501883q;
import X.C3510487j;
import X.C354808Nl;
import X.C363138jC;
import X.C363148jF;
import X.C363158jG;
import X.C363168jH;
import X.C363178jI;
import X.C363188jJ;
import X.C363238jO;
import X.C363248jP;
import X.C363258jQ;
import X.C369458un;
import X.C378669Qs;
import X.C40901Al9;
import X.C41239Aqb;
import X.C59812JZg;
import X.C61210lx;
import X.C61340me;
import X.C71392co;
import X.C71662eb;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class InteractiveDrawableContainer extends FrameLayout implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, C363148jF, ScaleGestureDetector.OnScaleGestureListener {
    public static final C71392co A19 = C71392co.A03(2.0d, 60.0d);
    public static final C71392co A1A = C71392co.A04(80.0d, 9.0d);
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public UserSession A06;
    public C279284yO A07;
    public C3501883q A08;
    public AnonymousClass8QU A09;
    public B3f A0A;
    public B3f A0B;
    public B3f A0C;
    public C3500282x A0D;
    public List A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public float A0U;
    public float A0V;
    public long A0W;
    public long A0X;
    public C349027zT A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public final int A0d;
    public final int A0e;
    public final Matrix A0f;
    public final Matrix A0g;
    public final Rect A0h;
    public final Rect A0i;
    public final RectF A0j;
    public final View A0k;
    public final View A0l;
    public final View A0m;
    public final 2cs A0n;
    public final C363188jJ A0o;
    public final C363178jI A0p;
    public final C363158jG A0q;
    public final List A0r;
    public final List A0s;
    public final Set A0t;
    public final Set A0u;
    public final Paint A0v;
    public final Paint A0w;
    public final Path A0x;
    public final PointF A0y;
    public final PointF A0z;
    public final PointF A10;
    public final GestureDetector A11;
    public final GestureDetector A12;
    public final GestureDetector A13;
    public final ScaleGestureDetector A14;
    public final 2cs A15;
    public final C252203oj A16;
    public final C363248jP A17;
    public final C363258jQ A18;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InteractiveDrawableContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public static final void A06(InteractiveDrawableContainer interactiveDrawableContainer) {
        interactiveDrawableContainer.A0N = true;
        View view = interactiveDrawableContainer.A0l;
        C294975nL A012 = C294975nL.A01(view, 0);
        A012.A0P(1.0f, view.getPivotX());
        A012.A0Q(1.0f, view.getPivotY());
        A012.A0H();
        C294975nL.A03(interactiveDrawableContainer.A0k, new Ag5(interactiveDrawableContainer), 8, true);
        2cs r6 = interactiveDrawableContainer.A15;
        if (r6.A09.A00 > 0.0d) {
            B3f activeDrawable = interactiveDrawableContainer.getActiveDrawable();
            interactiveDrawableContainer.A0A = null;
            if (activeDrawable != null) {
                interactiveDrawableContainer.A0C(activeDrawable);
                interactiveDrawableContainer.A0u.remove(Integer.valueOf(((C378669Qs) activeDrawable).A0g));
            }
            interactiveDrawableContainer.invalidate();
            if (activeDrawable != null) {
                C378669Qs r8 = (C378669Qs) activeDrawable;
                if (r8.A0b) {
                    r8.A0H = "";
                    r8.A0Y = false;
                }
                if (r8.A0Y) {
                    Object C3s = activeDrawable.C3s();
                    0qQ.A0C(C3s, "null cannot be cast to non-null type com.instagram.ui.widget.interactive.DrawableConfig");
                    Object obj = ((C310416b1) C3s).A0C;
                    ListIterator drawableIterator = interactiveDrawableContainer.getDrawableIterator();
                    ArrayList arrayList = new ArrayList();
                    while (drawableIterator.hasNext()) {
                        B2K b2k = (B2K) drawableIterator.next();
                        Object C3s2 = b2k.C3s();
                        0qQ.A0C(C3s2, "null cannot be cast to non-null type com.instagram.ui.widget.interactive.DrawableConfig");
                        Object obj2 = ((C310416b1) C3s2).A0C;
                        if (obj != null && obj.equals(obj2)) {
                            arrayList.add(b2k);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        B3f b3f = (B3f) it.next();
                        interactiveDrawableContainer.A0C(b3f);
                        Set set = interactiveDrawableContainer.A0u;
                        C378669Qs r9 = (C378669Qs) b3f;
                        int i = r9.A0g;
                        set.remove(Integer.valueOf(i));
                        if (b3f == interactiveDrawableContainer.A0A) {
                            interactiveDrawableContainer.A0A = null;
                        }
                        for (AnonymousClass88G DdI : interactiveDrawableContainer.A0t) {
                            DdI.DdI(r9.A0B, i, false);
                        }
                    }
                }
                for (AnonymousClass88G DdI2 : interactiveDrawableContainer.A0t) {
                    DdI2.DdI(r8.A0B, r8.A0g, true);
                }
            }
            r6.A0B(interactiveDrawableContainer.A16);
            r6.A08(0.0d, true);
        }
        for (AnonymousClass88G Dsb : interactiveDrawableContainer.A0t) {
            Dsb.Dsb();
        }
    }

    private final ListIterator getDrawableIterator() {
        return getInteractiveDrawables().listIterator(0);
    }

    public final int A0J(Drawable drawable, C310416b1 r11) {
        Drawable drawable2 = drawable;
        0qQ.A0B(drawable, 0);
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            C378669Qs r1 = (C378669Qs) ((B2K) drawableIterator.next());
            if (r1.A0B == drawable) {
                return r1.A0g;
            }
        }
        return A0K(drawable2, r11, false, false, false);
    }

    public final int A0K(Drawable drawable, C310416b1 r14, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(drawable, 0);
        UserSession userSession = this.A06;
        Context context = getContext();
        0qQ.A07(context);
        C378669Qs r5 = new C378669Qs(context, drawable, userSession, getMaxZ() + 1, z, z2);
        this.A0A = r5;
        C363158jG r0 = this.A0q;
        0qQ.A0B(r0, 0);
        r5.A0C = r0;
        C310416b1 r11 = r14;
        if (r14 != null) {
            AEV.A00(r14, r5);
            if (r14.A0F) {
                2cs r4 = r5.A0i;
                r4.A08((double) r5.A0d, true);
                r4.A06(1.0d);
            }
            if (r14.A0N) {
                C61210lx.A00(r5.A0B, 0, 255, 150);
            }
            AnonymousClass8DA r2 = r14.A07;
            if (r2 != null) {
                if (r2.A04) {
                    r5.EeI(0.0f);
                    r5.EeJ(r2.A00);
                    r5.EjE(r2.A01);
                }
                r5.A0D = r2;
                if (r2.A04) {
                    r5.A0V = true;
                    C378669Qs.A05(r5);
                }
            }
            C3510487j r1 = r14.A08;
            if (r1 != null) {
                r5.A0E = r1;
                r1.DKg(r5.A0g);
            }
            AnonymousClass8BH r10 = r14.A06;
            if (r10 == null) {
                r10 = new C16338Ut8(17, 0.0f, 0.0f);
            }
            C41239Aqb aqb = new C41239Aqb(drawable, r10, r11, this, r5);
            if (isLaidOut()) {
                aqb.run();
            } else {
                this.A0s.add(aqb);
            }
        }
        A09(this, r5);
        if (z3 && r14 != null) {
            r5.A0H = r14;
        }
        A08(this);
        invalidate();
        for (AnonymousClass88G CuV : this.A0t) {
            CuV.CuV(r5.A0B, r5.A0g);
        }
        return r5.A0g;
    }

    public final Rect A0L(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        Rect rect = new Rect();
        RectF rectF = new RectF();
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            B3f b3f = (B3f) drawableIterator.next();
            C378669Qs r2 = (C378669Qs) b3f;
            if (r2.A0B == drawable) {
                Matrix matrix = this.A0g;
                b3f.C9R(matrix);
                Rect copyBounds = r2.A0B.copyBounds();
                rectF.set(copyBounds);
                matrix.mapRect(rectF);
                rectF.round(copyBounds);
                return copyBounds;
            }
        }
        return rect;
    }

    public final ArrayList A0V(Class cls) {
        0qQ.A0B(cls, 0);
        ArrayList arrayList = new ArrayList();
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            Drawable drawable = ((C378669Qs) ((B2K) drawableIterator.next())).A0B;
            if (cls.isInstance(drawable)) {
                Object cast = cls.cast(drawable);
                0qQ.A07(cast);
                arrayList.add(cast);
            }
        }
        return arrayList;
    }

    public final HashMap A0Z(Set set) {
        0qQ.A0B(set, 0);
        HashMap hashMap = new HashMap();
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            B2K b2k = (B2K) drawableIterator.next();
            if (b2k != null) {
                C378669Qs r2 = (C378669Qs) b2k;
                Integer valueOf = Integer.valueOf(r2.A0g);
                if (set.contains(valueOf)) {
                    hashMap.put(valueOf, r2.A0B);
                }
            }
        }
        return hashMap;
    }

    public final void A0h(int i, boolean z) {
        if (i != -1) {
            B3f A022 = A02(this, i);
            if (A022 != null) {
                ((C378669Qs) A022).A0B.setVisible(z, false);
            }
            A07(this);
        }
    }

    public final void A0k(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            C378669Qs r1 = (C378669Qs) ((B3f) drawableIterator.next());
            if (r1.A0B == drawable) {
                r1.A0K = true;
                return;
            }
        }
    }

    public final void A0l(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        ListIterator drawableIterator = getDrawableIterator();
        while (true) {
            if (drawableIterator.hasNext()) {
                Drawable drawable2 = ((C378669Qs) ((B3f) drawableIterator.next())).A0B;
                if (drawable2 == drawable) {
                    C61210lx.A00(drawable2, 0, 255, 150);
                    break;
                }
            } else {
                break;
            }
        }
        A07(this);
    }

    public final void A0r(Drawable drawable, C369458un r3) {
        0qQ.A0B(r3, 1);
        AEV.A01(r3, A00(drawable, this));
    }

    public final void A0t(Drawable drawable, boolean z) {
        0qQ.A0B(drawable, 0);
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            C378669Qs r1 = (C378669Qs) ((B2K) drawableIterator.next());
            if (r1.A0B == drawable) {
                B3f A022 = A02(this, r1.A0g);
                if (A022 != null) {
                    ((C378669Qs) A022).A0O = z;
                    return;
                }
                return;
            }
        }
    }

    public final void A0v(1UV r8) {
        0qQ.A0B(r8, 0);
        ListIterator drawableIterator = getDrawableIterator();
        ArrayList arrayList = new ArrayList();
        while (drawableIterator.hasNext()) {
            B2K b2k = (B2K) drawableIterator.next();
            if (r8.apply(((C378669Qs) b2k).A0B)) {
                arrayList.add(b2k);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            B3f b3f = (B3f) it.next();
            A0C(b3f);
            Set set = this.A0u;
            C378669Qs r4 = (C378669Qs) b3f;
            int i = r4.A0g;
            set.remove(Integer.valueOf(i));
            if (b3f == this.A0A) {
                this.A0A = null;
            }
            for (AnonymousClass88G DdI : this.A0t) {
                DdI.DdI(r4.A0B, i, false);
            }
        }
    }

    public final void A0w(1UV r8) {
        ListIterator drawableIterator = getDrawableIterator();
        ArrayList arrayList = new ArrayList();
        while (drawableIterator.hasNext()) {
            B2K b2k = (B2K) drawableIterator.next();
            Object C3s = b2k.C3s();
            0qQ.A0C(C3s, "null cannot be cast to non-null type com.instagram.ui.widget.interactive.DrawableConfig");
            if (r8.apply(((C310416b1) C3s).A0C)) {
                arrayList.add(b2k);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            B3f b3f = (B3f) it.next();
            A0C(b3f);
            Set set = this.A0u;
            C378669Qs r4 = (C378669Qs) b3f;
            int i = r4.A0g;
            set.remove(Integer.valueOf(i));
            if (b3f == this.A0A) {
                this.A0A = null;
            }
            for (AnonymousClass88G DdI : this.A0t) {
                DdI.DdI(r4.A0B, i, false);
            }
        }
    }

    public final void A0y(AnonymousClass88G r2) {
        0qQ.A0B(r2, 0);
        this.A0t.add(r2);
    }

    public final void A0z(AnonymousClass88G r2) {
        0qQ.A0B(r2, 0);
        this.A0t.remove(r2);
    }

    public final boolean A13(Integer num) {
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            if (((C378669Qs) ((B3f) drawableIterator.next())).A0G == num) {
                return true;
            }
        }
        return false;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        if (!this.A0S || !this.A18.A05(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        this.A0a = true;
        this.A0P = false;
        this.A0J = false;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01e8, code lost:
        if (r7.A02(r15) == null) goto L_0x01ea;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r38) {
        /*
            r37 = this;
            r11 = 0
            r12 = r38
            X.0qQ.A0B(r12, r11)
            r13 = r37
            super.onDraw(r12)
            java.util.ListIterator r23 = r13.getDrawableIterator()
        L_0x000f:
            boolean r0 = r23.hasNext()
            if (r0 == 0) goto L_0x03fb
            java.lang.Object r10 = r23.next()
            X.B3f r10 = (X.B3f) r10
            r9 = r10
            X.9Qs r9 = (X.C378669Qs) r9
            android.graphics.drawable.Drawable r0 = r9.A0B
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L_0x000f
            X.B3f r0 = r13.getActiveDrawable()
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0108
            X.8jJ r2 = r13.A0o
            X.8jK r0 = r2.A0V
            r0.A02(r12)
            X.8jK r0 = r2.A0U
            r0.A02(r12)
            boolean r0 = r2.A0K
            if (r0 == 0) goto L_0x0054
            X.8jK r0 = r2.A0W
            r0.A02(r12)
            X.8jK r0 = r2.A0X
            r0.A02(r12)
            X.8jK r0 = r2.A0Y
            r0.A02(r12)
            X.8jK r0 = r2.A0T
            r0.A02(r12)
        L_0x0054:
            X.2cs r0 = r2.A0R
            X.2ct r0 = r0.A09
            double r0 = r0.A00
            r4 = 0
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0065
            X.8jL r0 = r2.A0e
            r0.draw(r12)
        L_0x0065:
            X.8jN r1 = r2.A0c
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0070
            android.graphics.drawable.LayerDrawable r0 = r1.A01
            r0.draw(r12)
        L_0x0070:
            X.8jN r1 = r2.A0Z
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x007b
            android.graphics.drawable.LayerDrawable r0 = r1.A01
            r0.draw(r12)
        L_0x007b:
            X.8jN r1 = r2.A0a
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0086
            android.graphics.drawable.LayerDrawable r0 = r1.A01
            r0.draw(r12)
        L_0x0086:
            X.8jN r1 = r2.A0b
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0091
            android.graphics.drawable.LayerDrawable r0 = r1.A01
            r0.draw(r12)
        L_0x0091:
            X.8jM r2 = r2.A0d
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x00fe
            java.lang.Integer r0 = r2.A05
            int r1 = r0.intValue()
            if (r1 == r11) goto L_0x00b9
            r0 = 1
            if (r1 != r0) goto L_0x03f5
            float r3 = r2.A02
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ef
            float r4 = r2.A01
            android.graphics.Rect r1 = r2.A04
            java.lang.String r0 = "bounds"
            if (r1 != 0) goto L_0x00d8
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00b9:
            float r3 = r2.A02
            float r5 = r2.A03
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ef
            float r4 = r2.A01
            float r1 = r2.A00
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ef
            r0 = 1108082688(0x420c0000, float:35.0)
            float r3 = r3 + r0
            float r3 = java.lang.Math.min(r5, r3)
            r2.A02 = r3
            float r4 = r4 - r0
            float r0 = java.lang.Math.max(r1, r4)
            goto L_0x00ed
        L_0x00d8:
            int r0 = r1.bottom
            float r1 = (float) r0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ef
            r0 = 1108082688(0x420c0000, float:35.0)
            float r3 = r3 - r0
            float r3 = java.lang.Math.max(r5, r3)
            r2.A02 = r3
            float r4 = r4 + r0
            float r0 = java.lang.Math.min(r1, r4)
        L_0x00ed:
            r2.A01 = r0
        L_0x00ef:
            android.graphics.Rect r1 = r2.A09
            int r0 = (int) r3
            r1.top = r0
            float r0 = r2.A01
            int r0 = (int) r0
            r1.bottom = r0
            android.graphics.Paint r0 = r2.A08
            r12.drawRect(r1, r0)
        L_0x00fe:
            X.8jK r0 = r2.A0B
            r0.A02(r12)
            X.8jK r0 = r2.A0A
            r0.A02(r12)
        L_0x0108:
            r12.save()
            float r2 = r9.A03
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x011d
            float r1 = r10.Bcl()
            float r0 = r10.Bcm()
            r12.rotate(r2, r1, r0)
        L_0x011d:
            float r2 = r9.A04
            float r0 = r9.A00
            float r2 = r2 * r0
            r8 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0133
            float r1 = r10.Bcl()
            float r0 = r10.Bcm()
            r12.scale(r2, r2, r1, r0)
        L_0x0133:
            float r1 = r9.A01
            float r0 = r9.A02
            r12.translate(r1, r0)
            X.0xi r0 = X.0tS.A4E
            X.0tS r3 = r0.A00()
            X.0s0 r2 = r3.A2u
            X.0YZ[] r1 = X.0tS.A4G
            r0 = 2
            r0 = r1[r0]
            java.lang.Object r0 = r2.CDM(r3, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0179
            android.graphics.drawable.Drawable r0 = r9.A0B
            android.graphics.Rect r3 = r0.getBounds()
            X.0qQ.A07(r3)
            android.graphics.Paint r0 = r13.A0v
            r12.drawRect(r3, r0)
            android.graphics.Path r2 = r9.A0A
            if (r2 == 0) goto L_0x02e9
            r12.save()
            int r0 = r3.left
            float r1 = (float) r0
            int r0 = r3.top
            float r0 = (float) r0
            r12.translate(r1, r0)
            android.graphics.Paint r0 = r13.A0w
            r12.drawPath(r2, r0)
            r12.restore()
        L_0x0179:
            android.graphics.drawable.Drawable r1 = r10.AfT()
            boolean r0 = r1 instanceof X.C306386Ly
            if (r0 == 0) goto L_0x03da
            X.6Ly r1 = (X.C306386Ly) r1
            if (r1 == 0) goto L_0x03da
            X.6Lz r0 = r1.A0I
            if (r0 == 0) goto L_0x03da
            X.7zT r0 = r13.A0Y
            if (r0 == 0) goto L_0x03da
            r12.restore()
            long r17 = java.lang.System.nanoTime()
            X.7zT r2 = r13.A0Y
            if (r2 == 0) goto L_0x000f
            boolean r0 = r13.A0Z
            r15 = r0 ^ 1
            r3 = 1
            X.7zV r0 = r2.A00
            if (r0 == 0) goto L_0x000f
            X.ALH r7 = r0.B3D()
            if (r7 == 0) goto L_0x000f
            int r0 = r9.A0g
            r36 = r0
            X.C349027zT.A00(r2, r0)
            android.graphics.drawable.Drawable r0 = r10.AfT()
            android.graphics.Rect r0 = r0.getBounds()
            int r6 = r0.width()
            android.graphics.drawable.Drawable r0 = r10.AfT()
            android.graphics.Rect r0 = r0.getBounds()
            int r5 = r0.height()
            float r0 = (float) r6
            r22 = r0
            float r1 = r9.A04
            float r0 = r9.A00
            float r1 = r1 * r0
            float r0 = r1 * r22
            int r4 = (int) r0
            float r0 = (float) r5
            r21 = r0
            float r1 = r1 * r0
            int r14 = (int) r1
            boolean r0 = r2.A01
            r20 = r0
            X.ACi r19 = X.C39862ACi.A00
            monitor-enter(r19)
            monitor-exit(r19)
            if (r15 != 0) goto L_0x01ea
            java.lang.Integer r15 = java.lang.Integer.valueOf(r36)
            android.graphics.Bitmap r0 = r7.A02(r15)
            if (r0 != 0) goto L_0x0328
        L_0x01ea:
            android.graphics.drawable.Drawable r1 = r10.AfT()
            boolean r0 = r1 instanceof X.C15927Ukr
            if (r0 == 0) goto L_0x01f9
            X.Ukr r1 = (X.C15927Ukr) r1
            if (r1 == 0) goto L_0x01f9
            r1.A0b()
        L_0x01f9:
            android.graphics.drawable.Drawable r1 = r10.AfT()
            boolean r0 = r1 instanceof X.C306386Ly
            if (r0 == 0) goto L_0x0266
            X.6Ly r1 = (X.C306386Ly) r1
            if (r1 == 0) goto L_0x0266
            X.8ik r15 = r1.A0J
            if (r15 == 0) goto L_0x0266
            float r1 = r9.A04
            float r0 = r9.A00
            float r1 = r1 * r0
            X.6Lz r0 = r15.A07
            r26 = r0
            float r0 = r15.A02
            r29 = r0
            float r0 = r15.A03
            r31 = r0
            float r0 = r15.A00
            r32 = r0
            float r0 = r15.A01
            r33 = r0
            int r0 = r15.A05
            r34 = r0
            boolean r0 = r15.A0A
            r35 = r0
            java.util.List r0 = r15.A09
            r28 = r0
            android.graphics.Typeface r0 = r15.A06
            r25 = r0
            X.9c2 r15 = r15.A08
            r0 = r26
            X.0qQ.A0B(r0, r11)
            X.8ik r16 = new X.8ik
            r24 = r16
            r27 = r15
            r30 = r1
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r0 = r6
            if (r6 >= r3) goto L_0x0248
            r0 = 1
        L_0x0248:
            float r0 = (float) r0
            float r15 = r8 / r0
            r0 = r5
            if (r5 >= r3) goto L_0x024f
            r0 = 1
        L_0x024f:
            float r0 = (float) r0
            float r3 = r8 / r0
            float r1 = r9.A04
            float r0 = r9.A00
            float r1 = r1 * r0
            r0 = r16
            X.8ik r1 = X.C394799yi.A00(r0, r8, r15, r3, r1)
            if (r1 == 0) goto L_0x0266
            java.lang.Integer r0 = java.lang.Integer.valueOf(r36)
            X.C349027zT.A01(r2, r1, r0)
        L_0x0266:
            X.A95 r15 = r7.A04
            java.util.concurrent.atomic.AtomicLong r0 = r15.A04
            r16 = r0
            long r2 = (long) r4
            long r0 = (long) r14
            long r2 = r2 * r0
            r0 = r16
            r0.addAndGet(r2)
            X.A5k[] r0 = r15.A05
            r0 = r0[r11]
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A00
            r0.incrementAndGet()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r4, r14, r0)
            X.0qQ.A07(r2)
            android.graphics.Canvas r14 = new android.graphics.Canvas
            r14.<init>(r2)
            r14.drawARGB(r11, r11, r11, r11)
            r14.save()
            android.graphics.drawable.Drawable r0 = r10.AfT()
            android.graphics.Rect r0 = r0.getBounds()
            int r0 = r0.left
            float r3 = (float) r0
            float r1 = r9.A04
            float r0 = r9.A00
            float r1 = r1 * r0
            float r1 = r1 - r8
            float r1 = r1 * r22
            r16 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r16
            float r3 = r3 - r1
            float r3 = -r3
            android.graphics.drawable.Drawable r0 = r10.AfT()
            android.graphics.Rect r0 = r0.getBounds()
            int r0 = r0.top
            float r15 = (float) r0
            float r1 = r9.A04
            float r0 = r9.A00
            float r1 = r1 * r0
            float r1 = r1 - r8
            float r1 = r1 * r21
            float r1 = r1 / r16
            float r15 = r15 - r1
            float r0 = -r15
            r14.translate(r3, r0)
            float r3 = r9.A04
            float r0 = r9.A00
            float r3 = r3 * r0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x02f0
            android.graphics.drawable.Drawable r0 = r10.AfT()
            android.graphics.Rect r0 = r0.getBounds()
            float r1 = r0.exactCenterX()
            android.graphics.drawable.Drawable r0 = r10.AfT()
            android.graphics.Rect r0 = r0.getBounds()
            float r0 = r0.exactCenterY()
            r14.scale(r3, r3, r1, r0)
            goto L_0x02f0
        L_0x02e9:
            android.graphics.Paint r0 = r13.A0w
            r12.drawRect(r3, r0)
            goto L_0x0179
        L_0x02f0:
            android.graphics.drawable.Drawable r1 = r10.AfT()     // Catch:{ RuntimeException -> 0x0306 }
            boolean r0 = r1 instanceof X.C306386Ly     // Catch:{ RuntimeException -> 0x0306 }
            if (r0 == 0) goto L_0x0300
            X.6Ly r1 = (X.C306386Ly) r1     // Catch:{ RuntimeException -> 0x0306 }
            if (r1 == 0) goto L_0x0300
            r1.A0T(r14)     // Catch:{ RuntimeException -> 0x0306 }
            goto L_0x0316
        L_0x0300:
            android.graphics.drawable.Drawable r0 = r9.A0B     // Catch:{ RuntimeException -> 0x0306 }
            r0.draw(r14)     // Catch:{ RuntimeException -> 0x0306 }
            goto L_0x0316
        L_0x0306:
            r3 = move-exception
            java.lang.String r1 = "TextEffectRenderer.draw "
            java.lang.String r0 = r3.getMessage()
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "TextEffectRenderer"
            X.0kD.A0C(r0, r1, r3)
        L_0x0316:
            r14.restore()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r36)
            r0 = r17
            r7.A05(r2, r15, r0)
            if (r20 != 0) goto L_0x0328
            r0 = 0
            r7.onDrawFrame(r0)
        L_0x0328:
            r12.save()
            float r3 = r9.A03
            r2 = 0
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x033d
            float r1 = r10.Bcl()
            float r0 = r10.Bcm()
            r12.rotate(r3, r1, r0)
        L_0x033d:
            float r3 = r9.A04
            float r0 = r9.A00
            float r3 = r3 * r0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0351
            float r1 = r10.Bcl()
            float r0 = r10.Bcm()
            r12.scale(r3, r3, r1, r0)
        L_0x0351:
            float r1 = r9.A01
            float r0 = r9.A02
            r12.translate(r1, r0)
            android.graphics.drawable.Drawable r1 = r10.AfT()
            boolean r0 = r1 instanceof X.C306386Ly
            if (r0 == 0) goto L_0x0367
            X.6Ly r1 = (X.C306386Ly) r1
            if (r1 == 0) goto L_0x0367
            r1.A0S(r12)
        L_0x0367:
            r12.restore()
            android.graphics.Bitmap r3 = r7.A02(r15)
            if (r3 == 0) goto L_0x03d6
            r12.save()
            float r14 = r9.A03
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0384
            float r1 = r10.Bcl()
            float r0 = r10.Bcm()
            r12.rotate(r14, r1, r0)
        L_0x0384:
            float r4 = (float) r4
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r4 = r4 / r0
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x039a
            float r1 = r10.Bcl()
            float r0 = r10.Bcm()
            r12.scale(r4, r4, r1, r0)
        L_0x039a:
            float r1 = r9.A01
            float r0 = r9.A02
            r12.translate(r1, r0)
            android.graphics.drawable.Drawable r0 = r10.AfT()
            android.graphics.Rect r0 = r0.getBounds()
            int r0 = r0.left
            float r4 = (float) r0
            int r0 = r3.getWidth()
            int r0 = r0 - r6
            float r0 = (float) r0
            r6 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r6
            float r4 = r4 - r0
            android.graphics.drawable.Drawable r0 = r10.AfT()
            android.graphics.Rect r0 = r0.getBounds()
            int r0 = r0.top
            float r1 = (float) r0
            int r0 = r3.getHeight()
            int r0 = r0 - r5
            float r0 = (float) r0
            float r0 = r0 / r6
            float r1 = r1 - r0
            r12.translate(r4, r1)
            r0 = 0
            r12.drawBitmap(r3, r2, r2, r0)
            r12.restore()
            r7.A04(r3)
        L_0x03d6:
            monitor-enter(r19)
            monitor-exit(r19)
            goto L_0x000f
        L_0x03da:
            android.graphics.drawable.Drawable r0 = r9.A0B     // Catch:{ RuntimeException -> 0x03e0 }
            r0.draw(r12)     // Catch:{ RuntimeException -> 0x03e0 }
            goto L_0x03f0
        L_0x03e0:
            r0 = move-exception
            java.lang.String r1 = "onDraw "
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "InteractiveDrawableContainer"
            X.0wb.A03(r0, r1)
        L_0x03f0:
            r12.restore()
            goto L_0x000f
        L_0x03f5:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x03fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.interactive.InteractiveDrawableContainer.onDraw(android.graphics.Canvas):void");
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        this.A0b = true;
        Set<AnonymousClass88G> set = this.A0t;
        if (!set.isEmpty()) {
            B3f activeDrawable = getActiveDrawable();
            if (!this.A0Z || activeDrawable == null) {
                for (AnonymousClass88G DPH : set) {
                    DPH.DPH();
                }
                return;
            }
            for (AnonymousClass88G DP7 : set) {
                C378669Qs r0 = (C378669Qs) activeDrawable;
                DP7.DP7(r0.A0B, r0.A0g, motionEvent.getX(), motionEvent.getY());
            }
        }
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        B3f activeDrawable;
        B3f activeDrawable2;
        0qQ.A0B(scaleGestureDetector, 0);
        if (!this.A0Z || ((this.A0H && (activeDrawable2 = getActiveDrawable()) != null && !this.A0E.contains(((C378669Qs) activeDrawable2).A0B)) || ((activeDrawable = getActiveDrawable()) != null && ((C378669Qs) activeDrawable).A0N))) {
            return true;
        }
        PointF pointF = this.A0y;
        PointF pointF2 = this.A0z;
        pointF.x = pointF2.x;
        pointF.y = pointF2.y;
        pointF2.x = scaleGestureDetector.getFocusX();
        pointF2.y = scaleGestureDetector.getFocusY();
        B3f activeDrawable3 = getActiveDrawable();
        if (activeDrawable3 != null) {
            C378669Qs r2 = (C378669Qs) activeDrawable3;
            r2.EjE(r2.A04 * scaleGestureDetector.getScaleFactor());
            return true;
        }
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        boolean z = false;
        0qQ.A0B(scaleGestureDetector, 0);
        B3f activeDrawable = getActiveDrawable();
        if (activeDrawable != null) {
            C378669Qs r1 = (C378669Qs) activeDrawable;
            if (r1.A0S) {
                z = true;
                if (r1.A0V) {
                    r1.A0Q = true;
                    r1.A0T = true;
                }
                PointF pointF = this.A0y;
                pointF.x = scaleGestureDetector.getFocusX();
                pointF.y = scaleGestureDetector.getFocusY();
                PointF pointF2 = this.A0z;
                pointF2.x = scaleGestureDetector.getFocusX();
                pointF2.y = scaleGestureDetector.getFocusY();
            }
        }
        return z;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r2 = (X.C378669Qs) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onSingleTapUp(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r5 = 0
            r6 = r19
            X.0qQ.A0B(r6, r5)
            r7 = r18
            boolean r0 = r7.A0Z
            r7.A0L = r0
            if (r0 == 0) goto L_0x0027
            X.B3f r2 = r7.getActiveDrawable()
            if (r2 == 0) goto L_0x0027
            X.9Qs r2 = (X.C378669Qs) r2
            X.8DA r0 = r2.A0D
            if (r0 == 0) goto L_0x0027
            java.lang.Integer r1 = r0.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0027
            boolean r0 = r2.A0V
            if (r0 == 0) goto L_0x0094
            X.C378669Qs.A03(r2)
        L_0x0027:
            java.util.Set r9 = r7.A0t
            boolean r0 = r9.isEmpty()
            r10 = 1
            if (r0 != 0) goto L_0x009e
            X.B3f r4 = r7.getActiveDrawable()
            java.lang.String r1 = "Required value was null."
            if (r4 == 0) goto L_0x0098
            float r8 = r6.getX()
            float r2 = r6.getY()
            android.graphics.Matrix r0 = r7.A0g
            r4.C9R(r0)
            android.graphics.Matrix r1 = r7.A0f
            r0.invert(r1)
            r0 = 2
            float[] r3 = new float[r0]
            r3[r5] = r8
            r3[r10] = r2
            r1.mapPoints(r3)
            java.util.Iterator r9 = r9.iterator()
        L_0x0058:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x009e
            java.lang.Object r11 = r9.next()
            X.88G r11 = (X.AnonymousClass88G) r11
            boolean r0 = r7.A0L
            if (r0 == 0) goto L_0x0077
            r0 = r4
        L_0x0069:
            X.9Qs r0 = (X.C378669Qs) r0
            int r8 = r0.A0g
            android.graphics.drawable.Drawable r2 = r0.A0B
            r1 = r3[r5]
            r0 = r3[r10]
            r11.DlC(r2, r8, r1, r0)
            goto L_0x0058
        L_0x0077:
            X.B3f r0 = r7.A0B
            if (r0 != 0) goto L_0x0069
            r1 = r4
            X.9Qs r1 = (X.C378669Qs) r1
            int r0 = r1.A0g
            android.graphics.drawable.Drawable r12 = r1.A0B
            r13 = r3[r5]
            r14 = r3[r10]
            float r15 = r6.getX()
            float r16 = r6.getY()
            r17 = r0
            r11.DlE(r12, r13, r14, r15, r16, r17)
            goto L_0x0058
        L_0x0094:
            X.C378669Qs.A02(r2)
            goto L_0x0027
        L_0x0098:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x009e:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.interactive.InteractiveDrawableContainer.onSingleTapUp(android.view.MotionEvent):boolean");
    }

    public final void setAlignmentGuideFooter(C71662eb r7) {
        0qQ.A0B(r7, 0);
        C363188jJ r4 = this.A0o;
        C363188jJ.A00(r4.A0D);
        r4.A0D = r7;
        2cs A022 = r4.A0S.A02();
        A022.A0A(r4);
        A022.A06 = true;
        A022.A09(C363188jJ.A0h);
        A022.A08(0.0d, true);
        r4.A0A = A022;
        r4.A0I = false;
        r4.A0P.setEmpty();
        addView(r7.A01);
    }

    public final void setAlignmentGuideHeader(C71662eb r7) {
        0qQ.A0B(r7, 0);
        C363188jJ r4 = this.A0o;
        C363188jJ.A00(r4.A0E);
        r4.A0E = r7;
        2cs A022 = r4.A0S.A02();
        A022.A0A(r4);
        A022.A06 = true;
        A022.A09(C363188jJ.A0h);
        A022.A08(0.0d, true);
        r4.A0B = A022;
        r4.A0I = false;
        r4.A0P.setEmpty();
        addView(r7.A01);
    }

    public final void setAlignmentGuideUfiTower(C71662eb r7) {
        0qQ.A0B(r7, 0);
        C363188jJ r4 = this.A0o;
        C363188jJ.A00(r4.A0F);
        r4.A0F = r7;
        2cs A022 = r4.A0S.A02();
        A022.A0A(r4);
        A022.A06 = true;
        A022.A09(C363188jJ.A0h);
        A022.A08(0.0d, true);
        r4.A0C = A022;
        r4.A0I = false;
        r4.A0P.setEmpty();
        addView(r7.A01);
    }

    public final void setCameraDestination(C279284yO r4) {
        0qQ.A0B(r4, 0);
        if (this.A07 != r4) {
            this.A07 = r4;
            C363188jJ r1 = this.A0o;
            r1.A0d.A00(0, 0);
            r1.A0L = false;
            this.A0K = false;
        }
    }

    public final void setPropertyListener(Drawable drawable, C3510487j r3) {
        0qQ.A0B(r3, 1);
        B3f A002 = A00(drawable, this);
        if (A002 != null) {
            C378669Qs r0 = (C378669Qs) A002;
            r0.A0E = r3;
            r3.DKg(r0.A0g);
        }
    }

    public final void setStickersWithGesturesEnabled(Drawable... drawableArr) {
        0qQ.A0B(drawableArr, 0);
        this.A0E = new ArrayList(0sr.A1P(Arrays.copyOf(drawableArr, drawableArr.length)));
    }

    public static final ArrayList A03(InteractiveDrawableContainer interactiveDrawableContainer, int i) {
        ArrayList arrayList = new ArrayList();
        ListIterator drawableIterator = interactiveDrawableContainer.getDrawableIterator();
        while (drawableIterator.hasNext()) {
            B3f b3f = (B3f) drawableIterator.next();
            if (((C378669Qs) b3f).A08 == i) {
                arrayList.add(b3f);
            }
        }
        return arrayList;
    }

    public static final void A08(InteractiveDrawableContainer interactiveDrawableContainer) {
        C3500282x r0 = interactiveDrawableContainer.A0D;
        if (r0 != null) {
            C3500783d r02 = ((ClipsCreationViewModel) r0).A0N;
            List list = r02.A00;
            01V.A1C(list);
            r02.A0A.Epw(list);
            return;
        }
        01V.A1C(interactiveDrawableContainer.A0r);
    }

    public static final void A09(InteractiveDrawableContainer interactiveDrawableContainer, B3f b3f) {
        C363158jG r1 = interactiveDrawableContainer.A0q;
        0qQ.A0B(r1, 0);
        ((C378669Qs) b3f).A0C = r1;
        if (!interactiveDrawableContainer.A0M || !interactiveDrawableContainer.A0o.A0I) {
            interactiveDrawableContainer.A0M = true;
            C40901Al9 al9 = new C40901Al9(interactiveDrawableContainer);
            if (interactiveDrawableContainer.isLaidOut()) {
                al9.run();
            } else {
                interactiveDrawableContainer.A0s.add(al9);
            }
        }
        b3f.Cno(false);
        C3500282x r0 = interactiveDrawableContainer.A0D;
        if (r0 != null) {
            C3500783d r2 = ((ClipsCreationViewModel) r0).A0N;
            List list = r2.A00;
            list.add(b3f);
            r2.A0A.Epw(list);
            r2.A03.FIA(b3f);
        } else {
            interactiveDrawableContainer.A0r.add(b3f);
        }
        A07(interactiveDrawableContainer);
    }

    private final void A0B(B3f b3f) {
        if (b3f != null) {
            if (b3f == getActiveDrawable()) {
                if (this.A0Z) {
                    this.A0c = true;
                    return;
                } else if (this.A15.A01 != 1.0d) {
                    this.A0A = null;
                } else {
                    return;
                }
            }
            A0C(b3f);
            Set set = this.A0u;
            C378669Qs r8 = (C378669Qs) b3f;
            int i = r8.A0g;
            set.remove(Integer.valueOf(i));
            invalidate();
            for (AnonymousClass88G DdI : this.A0t) {
                DdI.DdI(r8.A0B, i, false);
            }
        }
    }

    private final void A0C(B3f b3f) {
        C3500282x r1 = this.A0D;
        if (r1 != null) {
            0qQ.A0B(b3f, 0);
            C3500783d r2 = ((ClipsCreationViewModel) r1).A0N;
            List list = r2.A00;
            list.remove(b3f);
            r2.A0A.Epw(list);
            r2.A04.FIA(b3f);
        } else {
            if (this.A0A == b3f) {
                this.A0A = null;
            }
            this.A0r.remove(b3f);
        }
        A07(this);
    }

    private final void A0D(B3f b3f, boolean z) {
        this.A0A = b3f;
        if (z) {
            A05();
        }
        for (AnonymousClass88G DAq : this.A0t) {
            C378669Qs r0 = (C378669Qs) b3f;
            DAq.DAq(r0.A0B, r0.A0g);
        }
    }

    /* access modifiers changed from: private */
    public final B3f getActiveDrawable() {
        B3f b3f = this.A0A;
        if (b3f == null) {
            b3f = null;
            int i = 0;
            ListIterator drawableIterator = getDrawableIterator();
            while (drawableIterator.hasNext()) {
                B3f b3f2 = (B3f) drawableIterator.next();
                int i2 = ((C378669Qs) b3f2).A09;
                if (i2 >= i) {
                    b3f = b3f2;
                    i = i2;
                }
            }
            this.A0A = b3f;
        }
        return b3f;
    }

    /* access modifiers changed from: private */
    public final List getDrawableRealBounds() {
        ArrayList arrayList = new ArrayList();
        RectF rectF = new RectF();
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            B3f b3f = (B3f) drawableIterator.next();
            Matrix matrix = this.A0g;
            b3f.C9R(matrix);
            Rect copyBounds = ((C378669Qs) b3f).A0B.copyBounds();
            0qQ.A07(copyBounds);
            rectF.set(copyBounds);
            matrix.mapRect(rectF);
            rectF.round(copyBounds);
            arrayList.add(copyBounds);
        }
        return arrayList;
    }

    public final ArrayList A0T(1UV r5) {
        ArrayList arrayList = new ArrayList();
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            Drawable drawable = ((C378669Qs) ((B2K) drawableIterator.next())).A0B;
            if (r5.apply(drawable)) {
                arrayList.add(drawable);
            }
        }
        return arrayList;
    }

    public final ArrayList A0U(1UV r6) {
        ArrayList arrayList = new ArrayList();
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            C378669Qs r1 = (C378669Qs) ((B2K) drawableIterator.next());
            Drawable drawable = r1.A0B;
            if (r6.apply(drawable)) {
                arrayList.add(new 0eP(Integer.valueOf(r1.A0g), drawable));
            }
        }
        return arrayList;
    }

    public final ArrayList A0W(Class cls, Set set) {
        ArrayList arrayList = new ArrayList();
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            C378669Qs r2 = (C378669Qs) ((B2K) drawableIterator.next());
            Drawable drawable = r2.A0B;
            if (drawable instanceof C347017w8) {
                0qQ.A0C(drawable, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.RotatableDrawable");
                drawable = ((C347017w8) drawable).A04();
            }
            0qQ.A0A(drawable);
            if (cls.isInstance(drawable) && set.contains(Integer.valueOf(r2.A0g))) {
                arrayList.add(drawable);
            }
        }
        return arrayList;
    }

    public final HashMap A0X(Class cls) {
        HashMap hashMap = new HashMap();
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            B3f b3f = (B3f) drawableIterator.next();
            Drawable drawable = ((C378669Qs) b3f).A0B;
            if (cls.isInstance(drawable)) {
                hashMap.put(cls.cast(drawable), new C369458un(this.A06, b3f));
            }
        }
        return hashMap;
    }

    public final HashMap A0Y(Class cls) {
        HashMap hashMap = new HashMap();
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            B3f b3f = (B3f) drawableIterator.next();
            Drawable drawable = ((C378669Qs) b3f).A0B;
            if (cls.isInstance(drawable)) {
                0qQ.A0C(drawable, "null cannot be cast to non-null type com.instagram.reels.interactive.view.InteractiveCompoundDrawable");
                hashMap.put(((C299875vz) drawable).A09(), new C369458un(this.A06, b3f));
            }
        }
        return hashMap;
    }

    public final void A0b() {
        C3500282x r0 = this.A0D;
        if (r0 != null) {
            r0.AHr();
        } else {
            this.A0A = null;
            this.A0r.clear();
        }
        A07(this);
        this.A0A = null;
        this.A0u.clear();
        this.A0E.clear();
        invalidate();
    }

    public final void A0i(Drawable drawable) {
        if (drawable != null) {
            ListIterator drawableIterator = getDrawableIterator();
            while (true) {
                if (drawableIterator.hasNext()) {
                    Drawable drawable2 = ((C378669Qs) ((B3f) drawableIterator.next())).A0B;
                    if (drawable2 == drawable) {
                        C61210lx.A00(drawable2, 255, 0, 150);
                        break;
                    }
                } else {
                    break;
                }
            }
            A07(this);
        }
    }

    public final boolean Dfy(C363248jP r15) {
        B3f activeDrawable;
        if (!this.A0Z || (this.A0G && (activeDrawable = getActiveDrawable()) != null && !this.A0E.contains(((C378669Qs) activeDrawable).A0B))) {
            return true;
        }
        B3f activeDrawable2 = getActiveDrawable();
        if (activeDrawable2 != null && ((C378669Qs) activeDrawable2).A0N) {
            return true;
        }
        B3f activeDrawable3 = getActiveDrawable();
        if (activeDrawable3 != null) {
            float f = -((float) Math.toDegrees(Math.atan2((double) r15.A03, (double) r15.A02) - Math.atan2((double) r15.A01, (double) r15.A00)));
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float f2 = ((C378669Qs) activeDrawable3).A03;
            Path path = this.A0x;
            RectF rectF = this.A0j;
            activeDrawable3.ArG(path, rectF);
            activeDrawable3.Ej2(this.A0o.A05(rectF.centerX(), rectF.centerY(), f / ((float) (elapsedRealtime - this.A0W)), f2, f));
            this.A0W = elapsedRealtime;
            return true;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return (AccessibilityNodeProvider) this.A18.A00;
    }

    public final C3501883q getDelegate() {
        return this.A08;
    }

    public final boolean getDetectGestureOnLongPress() {
        return this.A0F;
    }

    public final List getInteractiveDrawables() {
        C3500282x r0 = this.A0D;
        if (r0 != null) {
            return ((ClipsCreationViewModel) r0).A0N.A00;
        }
        return this.A0r;
    }

    public final boolean getTouchEnabled() {
        return this.A0S;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:142:0x036e, code lost:
        if (r5 != X.AnonymousClass05K.A00) goto L_0x0370;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x039c, code lost:
        if (r1.A05 != X.AnonymousClass05K.A00) goto L_0x039e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x048a, code lost:
        if (r7.left >= r0.A03) goto L_0x048c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x049a, code lost:
        if (r7.right <= r0.A06) goto L_0x049c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04c7, code lost:
        if (r7.bottom > r1.A00) goto L_0x04c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x019d, code lost:
        if ((r2.A07 instanceof X.AnonymousClass80O) == false) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c3, code lost:
        if (java.lang.Boolean.valueOf(X.182.A06(r6, r5, 36320214845038702L)).booleanValue() == false) goto L_0x01c5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03a6  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0420  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x042c  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0432  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0441  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0454  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x04b8  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x04dc  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x04ee  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x04fb  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0503  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x050b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onScroll(android.view.MotionEvent r78, android.view.MotionEvent r79, float r80, float r81) {
        /*
            r77 = this;
            r21 = r81
            r20 = r80
            r12 = 1
            r76 = r79
            r0 = r76
            X.0qQ.A0B(r0, r12)
            r2 = r77
            X.B3f r22 = r2.getActiveDrawable()
            if (r22 == 0) goto L_0x0584
            boolean r0 = r2.A0I
            if (r0 == 0) goto L_0x0027
            java.util.List r1 = r2.A0E
            r0 = r22
            X.9Qs r0 = (X.C378669Qs) r0
            android.graphics.drawable.Drawable r0 = r0.A0B
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0027
        L_0x0026:
            return r12
        L_0x0027:
            boolean r0 = r2.A0a
            r23 = 0
            if (r0 == 0) goto L_0x0032
            r0 = r23
            r2.A0a = r0
            return r12
        L_0x0032:
            boolean r0 = r2.A0Z
            if (r0 == 0) goto L_0x0026
            boolean r0 = r2.A0b
            if (r0 == 0) goto L_0x0064
            java.util.Set r0 = r2.A0t
            java.util.Iterator r3 = r0.iterator()
        L_0x0040:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0581
            java.lang.Object r1 = r3.next()
            X.88G r1 = (X.AnonymousClass88G) r1
            r0 = r22
            X.9Qs r0 = (X.C378669Qs) r0
            android.graphics.drawable.Drawable r0 = r0.A0B
            float r8 = r76.getRawX()
            float r9 = r76.getRawY()
            r4 = r1
            r5 = r0
            r6 = r20
            r7 = r21
            r4.DhH(r5, r6, r7, r8, r9)
            goto L_0x0040
        L_0x0064:
            r3 = r22
            X.9Qs r3 = (X.C378669Qs) r3
            boolean r0 = r3.A0N
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r3.A0W
            if (r0 != 0) goto L_0x0026
            r1 = 200(0xc8, double:9.9E-322)
            r7 = -1065353216(0xffffffffc0800000, float:-4.0)
            r6 = 1082130432(0x40800000, float:4.0)
            float r5 = r3.A03
            float r7 = r7 + r5
            float r6 = r6 + r5
            r0 = 5
            float[] r4 = new float[r0]
            r4[r23] = r5
            r4[r12] = r7
            r0 = 2
            r4[r0] = r6
            r0 = 3
            r4[r0] = r7
            r0 = 4
            r4[r0] = r5
            java.lang.String r0 = "rotateDelta"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r3, r0, r4)
            android.animation.ObjectAnimator r1 = r0.setDuration(r1)
            X.0qQ.A07(r1)
            X.AJH r0 = new X.AJH
            r0.<init>(r3)
            r1.addListener(r0)
            X.AJG r0 = new X.AJG
            r0.<init>(r3)
            r1.addListener(r0)
            r1.start()
            return r12
        L_0x00ab:
            android.view.ScaleGestureDetector r0 = r2.A14
            boolean r0 = r0.isInProgress()
            if (r0 == 0) goto L_0x00c7
            android.graphics.PointF r4 = r2.A0y
            float r0 = r4.x
            r20 = r0
            android.graphics.PointF r1 = r2.A0z
            float r0 = r1.x
            float r20 = r20 - r0
            float r0 = r4.y
            r21 = r0
            float r0 = r1.y
            float r21 = r21 - r0
        L_0x00c7:
            X.2cs r0 = r2.A15
            X.2ct r0 = r0.A09
            double r0 = r0.A00
            r16 = 0
            int r4 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r4 <= 0) goto L_0x012e
            float r0 = r2.A02
            float r0 = r0 - r20
            r2.A02 = r0
            float r0 = r2.A03
            float r0 = r0 - r21
            r2.A03 = r0
        L_0x00df:
            boolean r0 = r2.A0T
            if (r0 == 0) goto L_0x00f0
            int r0 = r76.getPointerCount()
            if (r0 <= r12) goto L_0x0119
            android.view.View r1 = r2.A0k
            r0 = 8
            r1.setVisibility(r0)
        L_0x00f0:
            r22.ECX()
            java.util.Set r0 = r2.A0t
            java.util.Iterator r4 = r0.iterator()
        L_0x00f9:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x056f
            java.lang.Object r1 = r4.next()
            X.88G r1 = (X.AnonymousClass88G) r1
            android.graphics.drawable.Drawable r0 = r3.A0B
            float r9 = r76.getRawX()
            float r10 = r76.getRawY()
            r5 = r1
            r6 = r0
            r7 = r20
            r8 = r21
            r5.DhH(r6, r7, r8, r9, r10)
            goto L_0x00f9
        L_0x0119:
            boolean r0 = r3.A0K
            if (r0 == 0) goto L_0x00f0
            android.view.View r1 = r2.A0k
            int r0 = r1.getVisibility()
            if (r0 == 0) goto L_0x00f0
            android.view.View[] r1 = new android.view.View[]{r1}
            r0 = 0
            X.C294975nL.A04(r0, r1, r12)
            goto L_0x00f0
        L_0x012e:
            com.instagram.common.session.UserSession r4 = r2.A06
            X.0Tu r6 = X.0Tu.A05
            r0 = 36320962169283563(0x8109b9000023eb, double:3.032860956405961E-306)
            boolean r0 = X.182.A06(r6, r4, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0148
            r2.A05()
        L_0x0148:
            long r4 = r76.getEventTime()
            long r0 = r2.A0X
            long r4 = r4 - r0
            float r0 = (float) r4
            float r30 = r76.getX()
            float r13 = r76.getY()
            float r1 = r2.A0U
            float r37 = r30 - r1
            float r37 = r37 / r0
            float r1 = r2.A0V
            float r45 = r13 - r1
            float r45 = r45 / r0
            android.graphics.Path r1 = r2.A0x
            android.graphics.RectF r7 = r2.A0j
            r0 = r22
            r0.ArG(r1, r7)
            android.graphics.PointF r4 = r2.A10
            boolean r1 = r3.A0Q
            r8 = 0
            r0 = 0
            if (r1 == 0) goto L_0x0178
            r0 = r20
            float r0 = -r0
        L_0x0178:
            r4.x = r0
            boolean r5 = r3.A0T
            if (r5 == 0) goto L_0x0181
            r0 = r21
            float r8 = -r0
        L_0x0181:
            r4.y = r8
            boolean r0 = r3.A0k
            if (r0 != 0) goto L_0x0197
            boolean r0 = r3.A0l
            if (r0 == 0) goto L_0x019f
            boolean r0 = r3.A0R
            if (r0 != 0) goto L_0x0197
            boolean r0 = r3.A0S
            if (r0 != 0) goto L_0x0197
            if (r1 != 0) goto L_0x0197
            if (r5 == 0) goto L_0x019f
        L_0x0197:
            X.4yO r0 = r2.A07
            boolean r0 = r0 instanceof X.AnonymousClass80O
            r29 = 1
            if (r0 != 0) goto L_0x01a1
        L_0x019f:
            r29 = 0
        L_0x01a1:
            X.4yO r0 = r2.A07
            boolean r0 = r0 instanceof X.AnonymousClass9QA
            if (r0 == 0) goto L_0x01c5
            int r1 = r3.A08
            r0 = 7
            if (r1 != r0) goto L_0x01c5
            com.instagram.common.session.UserSession r5 = r2.A06
            if (r5 == 0) goto L_0x01c5
            r0 = 36320214845038702(0x81090b0001206e, double:3.0323883455442776E-306)
            boolean r0 = X.182.A06(r6, r5, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            r28 = 1
            if (r0 != 0) goto L_0x01c7
        L_0x01c5:
            r28 = 0
        L_0x01c7:
            X.8jJ r0 = r2.A0o
            java.util.Set r1 = r2.A0u
            r75 = r1
            boolean r1 = r75.isEmpty()
            r18 = r1 ^ 1
            X.0qQ.A0B(r7, r12)
            float r1 = r4.x
            r27 = r1
            float r1 = r4.y
            r26 = r1
            boolean r5 = X.C363188jJ.A04(r0)
            r44 = 0
            r1 = r27
            if (r5 == 0) goto L_0x01e9
            r1 = 0
        L_0x01e9:
            r4.x = r1
            boolean r5 = X.C363188jJ.A03(r0)
            r1 = r26
            if (r5 == 0) goto L_0x01f4
            r1 = 0
        L_0x01f4:
            r4.y = r1
            float r33 = r7.centerX()
            float r41 = r7.centerY()
            X.8jK r1 = r0.A0V
            r74 = r1
            boolean r1 = r1.A00
            r36 = r27
            if (r1 == 0) goto L_0x020a
            r36 = 0
        L_0x020a:
            float r36 = r36 + r33
            X.8jK r1 = r0.A0U
            r39 = r1
            boolean r1 = r1.A00
            if (r1 != 0) goto L_0x0216
            r44 = r26
        L_0x0216:
            float r44 = r44 + r41
            float r15 = r7.left
            float r14 = r7.right
            float r51 = r15 + r27
            float r57 = r14 + r27
            float r11 = r7.top
            float r8 = r7.bottom
            float r63 = r11 + r26
            float r71 = r8 + r26
            boolean r25 = X.C363188jJ.A04(r0)
            boolean r24 = X.C363188jJ.A03(r0)
            float r5 = r0.A01
            r34 = r25 ^ 1
            float r1 = r0.A04
            float r1 = r1 - r30
            float r1 = java.lang.Math.abs(r1)
            r10 = 1117126656(0x42960000, float:75.0)
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            r35 = 0
            if (r1 >= 0) goto L_0x0246
            r35 = 1
        L_0x0246:
            r38 = 0
            r31 = r74
            r32 = r5
            r31.A01(r32, r33, r34, r35, r36, r37, r38)
            float r5 = r0.A02
            boolean r1 = X.C363188jJ.A03(r0)
            r42 = r1 ^ 1
            float r1 = r0.A05
            float r1 = r1 - r13
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            r43 = 0
            if (r1 >= 0) goto L_0x0266
            r43 = 1
        L_0x0266:
            r40 = r5
            r46 = r38
            r39.A01(r40, r41, r42, r43, r44, r45, r46)
            X.8jK r1 = r0.A0W
            r34 = r1
            float r5 = r0.A03
            boolean r1 = X.C363188jJ.A04(r0)
            r49 = r1 ^ 1
            float r1 = r0.A04
            float r1 = r1 - r30
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            r50 = 0
            if (r1 >= 0) goto L_0x0289
            r50 = 1
        L_0x0289:
            float r53 = r15 - r5
            r46 = r34
            r47 = r5
            r48 = r15
            r52 = r37
            r46.A01(r47, r48, r49, r50, r51, r52, r53)
            X.8jK r1 = r0.A0X
            r32 = r1
            float r5 = r0.A06
            boolean r1 = X.C363188jJ.A04(r0)
            r55 = r1 ^ 1
            float r1 = r0.A04
            float r1 = r1 - r30
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            r56 = 0
            if (r1 >= 0) goto L_0x02b2
            r56 = 1
        L_0x02b2:
            float r59 = r5 - r14
            r52 = r32
            r53 = r5
            r54 = r14
            r58 = r37
            r52.A01(r53, r54, r55, r56, r57, r58, r59)
            X.8jM r1 = r0.A0d
            boolean r5 = r1.A06
            if (r5 != 0) goto L_0x02eb
            X.8jK r9 = r0.A0Y
            float r6 = r0.A07
            boolean r5 = X.C363188jJ.A03(r0)
            r61 = r5 ^ 1
            float r5 = r0.A05
            float r5 = r5 - r13
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            r62 = 0
            if (r5 >= 0) goto L_0x02de
            r62 = 1
        L_0x02de:
            float r65 = r11 - r6
            r58 = r9
            r59 = r6
            r60 = r11
            r64 = r45
            r58.A01(r59, r60, r61, r62, r63, r64, r65)
        L_0x02eb:
            boolean r5 = r1.A06
            if (r5 != 0) goto L_0x0315
            X.8jK r9 = r0.A0T
            float r6 = r0.A00
            boolean r5 = X.C363188jJ.A03(r0)
            r69 = r5 ^ 1
            float r5 = r0.A05
            float r5 = r5 - r13
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            r70 = 0
            if (r5 >= 0) goto L_0x0308
            r70 = 1
        L_0x0308:
            float r73 = r6 - r8
            r66 = r9
            r67 = r6
            r68 = r8
            r72 = r45
            r66.A01(r67, r68, r69, r70, r71, r72, r73)
        L_0x0315:
            boolean r5 = r0.A0L
            if (r5 == 0) goto L_0x03b5
            float r10 = r0.A05
            boolean r5 = r1.A06
            if (r5 == 0) goto L_0x03b5
            if (r18 != 0) goto L_0x0343
            X.8jK r5 = r1.A0B
            boolean r5 = r5.A00
            if (r5 != 0) goto L_0x0567
            X.8jK r5 = r1.A0A
            boolean r5 = r5.A00
            if (r5 != 0) goto L_0x0567
            java.lang.Integer r6 = r1.A05
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            if (r6 != r5) goto L_0x0343
            float r6 = r1.A02
            float r5 = r1.A03
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x0343
            float r6 = r1.A01
            float r5 = r1.A00
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0567
        L_0x0343:
            r5 = 1
        L_0x0344:
            r1.A07 = r5
            if (r18 != 0) goto L_0x0563
            float r6 = r1.A03
            int r5 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0563
            float r5 = r1.A00
            int r9 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r9 > 0) goto L_0x0563
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x055f
            int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x055f
            java.lang.Integer r5 = r1.A05
        L_0x035e:
            r1.A05 = r5
            X.8jK r9 = r1.A0B
            float r6 = r1.A03
            r31 = r6
            boolean r6 = r9.A00
            if (r6 != 0) goto L_0x0370
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            r61 = 1
            if (r5 == r6) goto L_0x0372
        L_0x0370:
            r61 = 0
        L_0x0372:
            float r10 = r10 - r13
            float r19 = java.lang.Math.abs(r10)
            r18 = 1117126656(0x42960000, float:75.0)
            int r5 = (r19 > r18 ? 1 : (r19 == r18 ? 0 : -1))
            r62 = 0
            if (r5 >= 0) goto L_0x0381
            r62 = 1
        L_0x0381:
            r65 = 0
            r58 = r9
            r59 = r31
            r60 = r11
            r64 = r45
            r58.A01(r59, r60, r61, r62, r63, r64, r65)
            X.8jK r9 = r1.A0A
            float r10 = r1.A00
            boolean r5 = r9.A00
            if (r5 != 0) goto L_0x039e
            java.lang.Integer r6 = r1.A05
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            r69 = 1
            if (r6 == r5) goto L_0x03a0
        L_0x039e:
            r69 = 0
        L_0x03a0:
            int r5 = (r19 > r18 ? 1 : (r19 == r18 ? 0 : -1))
            r70 = 0
            if (r5 >= 0) goto L_0x03a8
            r70 = 1
        L_0x03a8:
            r66 = r9
            r67 = r10
            r68 = r8
            r72 = r45
            r73 = r65
            r66.A01(r67, r68, r69, r70, r71, r72, r73)
        L_0x03b5:
            X.2cs r9 = r0.A0B
            if (r9 == 0) goto L_0x03d0
            float r5 = r0.A07
            int r5 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x055b
            X.8jK r5 = r0.A0Y
            X.2cs r5 = r5.A05
            double r5 = r5.A01
            r18 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r10 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r10 == 0) goto L_0x055b
            r5 = 0
        L_0x03cd:
            r9.A06(r5)
        L_0x03d0:
            X.2cs r9 = r0.A0A
            if (r9 == 0) goto L_0x03eb
            float r5 = r0.A00
            int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x0557
            X.8jK r5 = r0.A0T
            X.2cs r5 = r5.A05
            double r5 = r5.A01
            r18 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r10 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r10 == 0) goto L_0x0557
            r5 = 0
        L_0x03e8:
            r9.A06(r5)
        L_0x03eb:
            X.2cs r10 = r0.A0C
            if (r10 == 0) goto L_0x0402
            boolean r9 = r0.A0f
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r18 = 1125515264(0x43160000, float:150.0)
            if (r9 == 0) goto L_0x0549
            float r9 = r0.A03
            float r9 = r9 + r18
            int r9 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r9 > 0) goto L_0x0553
        L_0x03ff:
            r10.A06(r5)
        L_0x0402:
            r5 = r74
            boolean r5 = r5.A00
            if (r5 == 0) goto L_0x0533
            float r5 = r0.A01
            float r5 = r5 - r33
        L_0x040c:
            r4.x = r5
        L_0x040e:
            r5 = r39
            boolean r5 = r5.A00
            if (r5 == 0) goto L_0x050b
            float r5 = r0.A02
            float r5 = r5 - r41
        L_0x0418:
            r4.y = r5
        L_0x041a:
            boolean r5 = X.C363188jJ.A04(r0)
            if (r25 != 0) goto L_0x0503
            if (r5 == 0) goto L_0x0426
            r5 = r30
            r0.A04 = r5
        L_0x0426:
            boolean r5 = X.C363188jJ.A03(r0)
            if (r24 != 0) goto L_0x04fb
            if (r5 == 0) goto L_0x0430
            r0.A05 = r13
        L_0x0430:
            if (r29 == 0) goto L_0x04ee
            float r5 = r0.A07
            int r6 = (r63 > r5 ? 1 : (r63 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x04e5
            float r5 = r5 - r11
        L_0x0439:
            r4.y = r5
        L_0x043b:
            float r6 = r0.A03
            int r5 = (r51 > r6 ? 1 : (r51 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x04dc
            float r6 = r6 - r15
        L_0x0442:
            r4.x = r6
        L_0x0444:
            float r10 = r7.centerX()
            float r9 = r7.centerY()
            X.2cs r5 = r0.A0R
            double r5 = r5.A01
            int r8 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r8 <= 0) goto L_0x045c
            X.8jL r5 = r0.A0e
            android.graphics.PointF r5 = r5.A09
            r5.x = r10
            r5.y = r9
        L_0x045c:
            float r6 = r4.x
            float r5 = r3.A01
            float r5 = r5 + r6
            r3.EeI(r5)
            float r5 = r4.y
            float r4 = r3.A02
            float r4 = r4 + r5
            r3.EeJ(r4)
            boolean r4 = r0.A0M
            if (r4 == 0) goto L_0x04b4
            android.graphics.RectF r4 = r0.A0Q
            boolean r4 = r7.equals(r4)
            r8 = 0
            if (r4 != 0) goto L_0x04b2
            boolean r4 = r0.A0M
            if (r4 == 0) goto L_0x04d9
            r4 = r34
            boolean r4 = r4.A00
            if (r4 != 0) goto L_0x048c
            float r5 = r7.left
            float r4 = r0.A03
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            r9 = 1
            if (r4 < 0) goto L_0x048d
        L_0x048c:
            r9 = 0
        L_0x048d:
            r4 = r32
            boolean r4 = r4.A00
            if (r4 != 0) goto L_0x049c
            float r5 = r7.right
            float r4 = r0.A06
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            r6 = 1
            if (r4 > 0) goto L_0x049d
        L_0x049c:
            r6 = 0
        L_0x049d:
            X.8jN r5 = r0.A0c
            r5.A00 = r8
            X.8jN r4 = r0.A0a
            r4.A00 = r9
            X.8jN r5 = r0.A0Z
            r5.A00 = r8
            X.8jN r4 = r0.A0b
            r4.A00 = r6
            if (r9 != 0) goto L_0x04b1
            if (r6 == 0) goto L_0x04b2
        L_0x04b1:
            r8 = 1
        L_0x04b2:
            r3.A0J = r8
        L_0x04b4:
            boolean r0 = r0.A0L
            if (r0 == 0) goto L_0x00df
            float r4 = r7.top
            float r0 = r1.A03
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x04c9
            float r4 = r7.bottom
            float r0 = r1.A00
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r4 = 0
            if (r0 <= 0) goto L_0x04ca
        L_0x04c9:
            r4 = 1
        L_0x04ca:
            int r0 = r3.A0g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = r75
            if (r4 == 0) goto L_0x056a
            r0.add(r1)
            goto L_0x00df
        L_0x04d9:
            r6 = 0
            r9 = 0
            goto L_0x049d
        L_0x04dc:
            float r6 = r0.A06
            int r5 = (r57 > r6 ? 1 : (r57 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0444
            float r6 = r6 - r14
            goto L_0x0442
        L_0x04e5:
            float r5 = r0.A00
            int r6 = (r71 > r5 ? 1 : (r71 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x043b
            float r5 = r5 - r8
            goto L_0x0439
        L_0x04ee:
            if (r28 == 0) goto L_0x0444
            float r6 = r0.A00
            int r5 = (r71 > r6 ? 1 : (r71 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0444
            float r6 = r6 - r8
            r4.y = r6
            goto L_0x0444
        L_0x04fb:
            if (r5 != 0) goto L_0x0430
            r5 = r26
            r4.y = r5
            goto L_0x0430
        L_0x0503:
            if (r5 != 0) goto L_0x0426
            r5 = r27
            r4.x = r5
            goto L_0x0426
        L_0x050b:
            X.8jK r5 = r0.A0Y
            boolean r5 = r5.A00
            if (r5 == 0) goto L_0x0516
            float r5 = r0.A07
        L_0x0513:
            float r5 = r5 - r11
            goto L_0x0418
        L_0x0516:
            X.8jK r5 = r0.A0T
            boolean r5 = r5.A00
            if (r5 == 0) goto L_0x0521
            float r5 = r0.A00
        L_0x051e:
            float r5 = r5 - r8
            goto L_0x0418
        L_0x0521:
            X.8jK r5 = r1.A0B
            boolean r5 = r5.A00
            if (r5 == 0) goto L_0x052a
            float r5 = r1.A03
            goto L_0x0513
        L_0x052a:
            X.8jK r5 = r1.A0A
            boolean r5 = r5.A00
            if (r5 == 0) goto L_0x041a
            float r5 = r1.A00
            goto L_0x051e
        L_0x0533:
            r5 = r34
            boolean r5 = r5.A00
            if (r5 == 0) goto L_0x053e
            float r5 = r0.A03
            float r5 = r5 - r15
            goto L_0x040c
        L_0x053e:
            r5 = r32
            boolean r5 = r5.A00
            if (r5 == 0) goto L_0x040e
            float r5 = r0.A06
            float r5 = r5 - r14
            goto L_0x040c
        L_0x0549:
            float r9 = r0.A06
            float r9 = r9 - r18
            int r9 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r9 < 0) goto L_0x0553
            goto L_0x03ff
        L_0x0553:
            r5 = 0
            goto L_0x03ff
        L_0x0557:
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x03e8
        L_0x055b:
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x03cd
        L_0x055f:
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            goto L_0x035e
        L_0x0563:
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            goto L_0x035e
        L_0x0567:
            r5 = 0
            goto L_0x0344
        L_0x056a:
            r0.remove(r1)
            goto L_0x00df
        L_0x056f:
            float r0 = r76.getX()
            r2.A0U = r0
            float r0 = r76.getY()
            r2.A0V = r0
            long r0 = r76.getEventTime()
            r2.A0X = r0
        L_0x0581:
            r2.A0P = r12
            return r12
        L_0x0584:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.interactive.InteractiveDrawableContainer.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    public final void setAlignmentGuideAlignBottomMarginToFooter(boolean z) {
        this.A0o.A0G = z;
    }

    public final void setAlignmentGuideAlignTopMarginToHeader(boolean z) {
        this.A0o.A0H = z;
    }

    public final void setLongPressEnabled(boolean z) {
        this.A12.setIsLongpressEnabled(z);
    }

    public final void setMarginAlignmentGuideEnabled(boolean z) {
        this.A0o.A0K = z;
    }

    public final void setSelectedDrawable(Drawable drawable) {
        B3f b3f;
        if (drawable != null) {
            b3f = A00(drawable, this);
        } else {
            b3f = null;
        }
        this.A0B = b3f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.B3f A00(android.graphics.drawable.Drawable r3, com.instagram.ui.widget.interactive.InteractiveDrawableContainer r4) {
        /*
            java.util.ListIterator r2 = r4.getDrawableIterator()
        L_0x0004:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r1 = r2.next()
            X.B3f r1 = (X.B3f) r1
            r0 = r1
            X.9Qs r0 = (X.C378669Qs) r0
            android.graphics.drawable.Drawable r0 = r0.A0B
            if (r0 == r3) goto L_0x001d
            android.graphics.drawable.Drawable r0 = r1.AfT()
            if (r0 != r3) goto L_0x0004
        L_0x001d:
            return r1
        L_0x001e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.interactive.InteractiveDrawableContainer.A00(android.graphics.drawable.Drawable, com.instagram.ui.widget.interactive.InteractiveDrawableContainer):X.B3f");
    }

    public static final B3f A02(InteractiveDrawableContainer interactiveDrawableContainer, int i) {
        ListIterator drawableIterator = interactiveDrawableContainer.getDrawableIterator();
        while (drawableIterator.hasNext()) {
            B3f b3f = (B3f) drawableIterator.next();
            if (((C378669Qs) b3f).A0g == i) {
                return b3f;
            }
        }
        return null;
    }

    private final void A05() {
        B3f activeDrawable = getActiveDrawable();
        if (activeDrawable != null) {
            C378669Qs r4 = (C378669Qs) activeDrawable;
            String str = r4.A0I;
            if (str != null) {
                ListIterator drawableIterator = getDrawableIterator();
                while (drawableIterator.hasNext()) {
                    C378669Qs r1 = (C378669Qs) ((B3f) drawableIterator.next());
                    if (0qQ.A0K(r1.A0I, str)) {
                        r1.A09 = getMaxZ() + 1;
                    }
                }
            }
            r4.A09 = getMaxZ() + 1;
            A08(this);
            invalidate();
        }
    }

    public static final void A07(InteractiveDrawableContainer interactiveDrawableContainer) {
        C349047zV r0;
        int drawableWithEffectCount = interactiveDrawableContainer.getDrawableWithEffectCount();
        UserSession userSession = interactiveDrawableContainer.A06;
        if (drawableWithEffectCount > 0 && userSession != null) {
            0Tu r2 = 0Tu.A05;
            if (182.A06(r2, userSession, 36323139717901188L) || 182.A06(r2, userSession, 36323139718294410L)) {
                if (interactiveDrawableContainer.A0Y == null) {
                    Context context = interactiveDrawableContainer.getContext();
                    0qQ.A07(context);
                    C349027zT r02 = new C349027zT(userSession, context, true);
                    interactiveDrawableContainer.A0Y = r02;
                    C349047zV r03 = r02.A00;
                    if (r03 != null) {
                        r03.Exd();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        C349027zT r1 = interactiveDrawableContainer.A0Y;
        if (r1 != null) {
            synchronized (r1) {
                C349047zV r04 = r1.A00;
                if (r04 != null) {
                    r04.EyL();
                }
            }
        }
        C349027zT r05 = interactiveDrawableContainer.A0Y;
        if (!(r05 == null || (r0 = r05.A00) == null)) {
            r0.cleanup();
        }
        interactiveDrawableContainer.A0Y = null;
    }

    public static final void A0A(InteractiveDrawableContainer interactiveDrawableContainer, String str) {
        ListIterator drawableIterator = interactiveDrawableContainer.getDrawableIterator();
        while (drawableIterator.hasNext()) {
            ((C378669Qs) ((B3f) drawableIterator.next())).A09 = interactiveDrawableContainer.getMaxZ() + 1;
        }
        ListIterator drawableIterator2 = interactiveDrawableContainer.getDrawableIterator();
        int i = 0;
        while (drawableIterator2.hasNext()) {
            C378669Qs r1 = (C378669Qs) ((B3f) drawableIterator2.next());
            if (0qQ.A0K(r1.A0I, str)) {
                i = Math.max(i, r1.A09);
            }
        }
        ListIterator drawableIterator3 = interactiveDrawableContainer.getDrawableIterator();
        while (drawableIterator3.hasNext()) {
            C378669Qs r12 = (C378669Qs) ((B3f) drawableIterator3.next());
            if (r12.A09 > i || 0qQ.A0K(r12.A0I, str)) {
                r12.A09 = interactiveDrawableContainer.getMaxZ() + 1;
            }
        }
        A08(interactiveDrawableContainer);
        interactiveDrawableContainer.invalidate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
        if (java.lang.Boolean.valueOf(X.182.A06(X.0Tu.A05, r8.A06, 36320962169283563L)).booleanValue() != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0E(com.instagram.ui.widget.interactive.InteractiveDrawableContainer r8, float r9, float r10, boolean r11) {
        /*
            java.util.List r0 = r8.getInteractiveDrawables()
            int r0 = r0.size()
            r7 = 0
            r4 = 1
            if (r0 <= r4) goto L_0x0028
            boolean r0 = r8.A0Q
            if (r0 == 0) goto L_0x0028
            com.instagram.common.session.UserSession r3 = r8.A06
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320962169283563(0x8109b9000023eb, double:3.032860956405961E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            r6 = 1
            if (r0 == 0) goto L_0x0029
        L_0x0028:
            r6 = 0
        L_0x0029:
            r5 = 0
            java.util.List r0 = r8.getInteractiveDrawables()
            int r1 = r0.size()
            java.util.List r0 = r8.getInteractiveDrawables()
            java.util.ListIterator r3 = r0.listIterator(r1)
        L_0x003a:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x006e
            java.lang.Object r2 = r3.previous()
            X.B3f r2 = (X.B3f) r2
            r1 = r2
            X.9Qs r1 = (X.C378669Qs) r1
            android.graphics.drawable.Drawable r0 = r1.A0B
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L_0x003a
            boolean r0 = r1.A0P
            if (r0 == 0) goto L_0x003a
            boolean r0 = r1.A0O
            if (r0 == 0) goto L_0x003a
            int r0 = r2.AJc(r9, r10)
            if (r0 != 0) goto L_0x0065
            if (r11 == 0) goto L_0x006b
            r8.A0D(r2, r6)
            return r4
        L_0x0065:
            if (r0 != r4) goto L_0x003a
            if (r5 != 0) goto L_0x003a
            r5 = r2
            goto L_0x003a
        L_0x006b:
            r8.A0C = r2
            return r4
        L_0x006e:
            if (r5 == 0) goto L_0x0079
            if (r11 == 0) goto L_0x0076
            r8.A0D(r5, r6)
            return r4
        L_0x0076:
            r8.A0C = r5
            return r4
        L_0x0079:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.interactive.InteractiveDrawableContainer.A0E(com.instagram.ui.widget.interactive.InteractiveDrawableContainer, float, float, boolean):boolean");
    }

    private final int getDrawableWithEffectCount() {
        C306386Ly r1;
        List<B3f> interactiveDrawables = getInteractiveDrawables();
        int i = 0;
        if (!(interactiveDrawables instanceof Collection) || !interactiveDrawables.isEmpty()) {
            for (B3f b3f : interactiveDrawables) {
                if (((C378669Qs) b3f).A0B.isVisible()) {
                    Drawable AfT = b3f.AfT();
                    if ((AfT instanceof C306386Ly) && (r1 = (C306386Ly) AfT) != null && r1.A0I != null && (i = i + 1) < 0) {
                        0sr.A1S();
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
            }
        }
        return i;
    }

    private final int getNextAvailableZ() {
        return getMaxZ() + 1;
    }

    public final float A0F(Drawable drawable) {
        B3f A002 = A00(drawable, this);
        if (A002 != null) {
            return ((C378669Qs) A002).A01;
        }
        return 0.0f;
    }

    public final float A0G(Drawable drawable) {
        B3f A002 = A00(drawable, this);
        if (A002 != null) {
            return ((C378669Qs) A002).A02;
        }
        return 0.0f;
    }

    public final float A0H(Drawable drawable) {
        B3f A002 = A00(drawable, this);
        if (A002 != null) {
            return ((C378669Qs) A002).A03;
        }
        return 0.0f;
    }

    public final int A0I(int i) {
        ListIterator drawableIterator = getDrawableIterator();
        int i2 = 0;
        while (drawableIterator.hasNext()) {
            if (((C378669Qs) ((B2K) drawableIterator.next())).A0g == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public final Drawable A0M(int i) {
        B3f A022 = A02(this, i);
        if (A022 != null) {
            return ((C378669Qs) A022).A0B;
        }
        return null;
    }

    public final C369458un A0N(int i) {
        B3f A022 = A02(this, i);
        UserSession userSession = this.A06;
        if (A022 != null) {
            return new C369458un(userSession, A022);
        }
        return null;
    }

    public final C369458un A0O(Drawable drawable) {
        B3f A002 = A00(drawable, this);
        UserSession userSession = this.A06;
        if (A002 != null) {
            return new C369458un(userSession, A002);
        }
        return null;
    }

    public final B3f A0P(int i) {
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            B3f b3f = (B3f) drawableIterator.next();
            if (((C378669Qs) b3f).A0g == i) {
                return b3f;
            }
        }
        return null;
    }

    public final Boolean A0Q(int i) {
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            C378669Qs r1 = (C378669Qs) ((B3f) drawableIterator.next());
            if (r1.A0g == i) {
                return Boolean.valueOf(r1.A0J);
            }
        }
        return null;
    }

    public final Float A0R(Drawable drawable) {
        B3f A002 = A00(drawable, this);
        if (A002 == null) {
            return null;
        }
        C378669Qs r0 = (C378669Qs) A002;
        return Float.valueOf(r0.A04 * r0.A00);
    }

    public final Integer A0S(Drawable drawable) {
        B3f b3f;
        ListIterator drawableIterator = getDrawableIterator();
        while (true) {
            if (!drawableIterator.hasNext()) {
                b3f = null;
                break;
            }
            b3f = (B3f) drawableIterator.next();
            if (((C378669Qs) b3f).A0B != drawable) {
                if (b3f.AfT() == drawable) {
                    break;
                }
            } else {
                break;
            }
        }
        A0B(b3f);
        if (b3f != null) {
            return Integer.valueOf(((C378669Qs) b3f).A0g);
        }
        return null;
    }

    public final void A0a() {
        B3f activeDrawable = getActiveDrawable();
        if (activeDrawable != null) {
            C378669Qs r4 = (C378669Qs) activeDrawable;
            2cs r3 = r4.A0i;
            if (!r3.A0C()) {
                r4.A0L = true;
                return;
            }
            r3.A08((double) r4.A0d, true);
            r3.A06((double) r4.A0e);
        }
    }

    public final void A0c() {
        B3f activeDrawable = getActiveDrawable();
        if (activeDrawable != null) {
            activeDrawable.ECX();
        }
    }

    public final void A0d() {
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            AnonymousClass5MJ A022 = AnonymousClass9SF.A02(((C378669Qs) ((B2K) drawableIterator.next())).A0B);
            if (A022 != null) {
                A022.EqG();
            }
        }
    }

    public final void A0e(int i, int i2) {
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            AnonymousClass5MJ A022 = AnonymousClass9SF.A02(((C378669Qs) ((B2K) drawableIterator.next())).A0B);
            if (A022 != null) {
                A022.EXC(i, i2);
            }
        }
        invalidate();
    }

    public final void A0f(int i, int i2) {
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            AnonymousClass5MJ A022 = AnonymousClass9SF.A02(((C378669Qs) ((B2K) drawableIterator.next())).A0B);
            if ((A022 instanceof AnonymousClass91c) || ((A022 instanceof AnonymousClass5MI) && (((AnonymousClass5MI) A022).AfT() instanceof AnonymousClass91c))) {
                A022.EXC(i, i2);
            }
        }
        invalidate();
    }

    public final void A0g(int i, boolean z) {
        B3f A022 = A02(this, i);
        if (A022 != null) {
            C378669Qs r0 = (C378669Qs) A022;
            r0.A0S = z;
            r0.A0R = z;
            r0.A0Q = z;
            r0.A0T = z;
        }
    }

    public final void A0j(Drawable drawable) {
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            B3f b3f = (B3f) drawableIterator.next();
            C378669Qs r2 = (C378669Qs) b3f;
            if (r2.A0B == drawable) {
                A0C(b3f);
                this.A0u.remove(Integer.valueOf(r2.A0g));
                invalidate();
                return;
            }
        }
    }

    public final void A0m(Drawable drawable) {
        B3f A002 = A00(drawable, this);
        if (A002 != null) {
            Drawable drawable2 = ((C378669Qs) A002).A0B;
            int centerX = drawable2.getBounds().centerX();
            int centerY = drawable2.getBounds().centerY();
            Rect rect = new Rect(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
            rect.offset(centerX - rect.centerX(), centerY - rect.centerY());
            drawable2.setBounds(rect);
        }
    }

    public final void A0n(Drawable drawable, float f) {
        B3f A002 = A00(drawable, this);
        if (A002 != null) {
            A002.Ej2(f);
        }
    }

    public final void A0o(Drawable drawable, float f) {
        B3f A002 = A00(drawable, this);
        if (A002 != null) {
            A002.EjE(f);
        }
    }

    public final void A0p(Drawable drawable, float f, float f2) {
        B3f A002 = A00(drawable, this);
        if (A002 != null) {
            A002.EeI(f);
            A002.EeJ(f2);
        }
    }

    public final void A0q(Drawable drawable, Drawable drawable2) {
        B3f A002 = A00(drawable, this);
        if (A002 != null) {
            C378669Qs r5 = (C378669Qs) A002;
            drawable2.setVisible(r5.A0B.isVisible(), false);
            int centerX = r5.A0B.getBounds().centerX();
            int centerY = r5.A0B.getBounds().centerY();
            Rect rect = new Rect(0, 0, r5.A0B.getIntrinsicWidth(), r5.A0B.getIntrinsicHeight());
            rect.offset(centerX - rect.centerX(), centerY - rect.centerY());
            drawable2.setBounds(rect);
            r5.A0B = drawable2;
        }
        A07(this);
    }

    public final void A0s(Drawable drawable, boolean z) {
        float f;
        Float A0R2 = A0R(drawable);
        if (A0R2 != null) {
            f = A0R2.floatValue();
        } else {
            f = 0.0f;
        }
        B3f A002 = A00(drawable, this);
        if (A002 != null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(A002, "scaleFactor", new float[]{0.1f + f}).setDuration(240);
            0qQ.A07(duration);
            duration.setRepeatCount(1);
            duration.setRepeatMode(2);
            duration.addListener(new AJL(A002, f));
            if (z) {
                duration.start();
            } else {
                duration.end();
            }
        }
    }

    public final void A0u(AnonymousClass2hV r3) {
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            r3.apply(Integer.valueOf(((C378669Qs) ((B2K) drawableIterator.next())).A0g));
        }
    }

    public final void A0x(1UV r4, int i) {
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            C378669Qs r1 = (C378669Qs) ((B3f) drawableIterator.next());
            if (r4.apply(r1.A0B)) {
                r1.A08 = i;
            }
        }
        A08(this);
        invalidate();
    }

    public final boolean A10() {
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            Drawable drawable = ((C378669Qs) ((B2K) drawableIterator.next())).A0B;
            if ((drawable instanceof C59812JZg) || ((drawable instanceof C347017w8) && (((C347017w8) drawable).A04() instanceof C354808Nl))) {
                return true;
            }
        }
        return false;
    }

    public final boolean A11(int i) {
        B3f A0P2 = A0P(i);
        if (A0P2 != null) {
            ListIterator drawableIterator = getDrawableIterator();
            while (drawableIterator.hasNext()) {
                if (((C378669Qs) ((B3f) drawableIterator.next())).A08 < ((C378669Qs) A0P2).A08) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean A12(int i) {
        B3f A0P2 = A0P(i);
        if (A0P2 != null) {
            ListIterator drawableIterator = getDrawableIterator();
            while (drawableIterator.hasNext()) {
                if (((C378669Qs) ((B3f) drawableIterator.next())).A08 > ((C378669Qs) A0P2).A08) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean Dfz(C363248jP r4) {
        B3f activeDrawable = getActiveDrawable();
        boolean z = false;
        if (activeDrawable != null) {
            C378669Qs r2 = (C378669Qs) activeDrawable;
            if (r2.A0R) {
                z = true;
                if (r2.A0V) {
                    r2.A0Q = true;
                    r2.A0T = true;
                }
            }
        }
        return z;
    }

    public final Integer getActiveDrawableHeight() {
        B3f activeDrawable = getActiveDrawable();
        if (activeDrawable != null) {
            return Integer.valueOf(((C378669Qs) activeDrawable).A0B.getIntrinsicHeight());
        }
        return null;
    }

    public final int getActiveDrawableId() {
        B3f activeDrawable = getActiveDrawable();
        if (activeDrawable != null) {
            return ((C378669Qs) activeDrawable).A0g;
        }
        return -1;
    }

    public final 0eP getActiveDrawableLocation() {
        B3f activeDrawable = getActiveDrawable();
        if (activeDrawable != null) {
            return new 0eP(Float.valueOf(activeDrawable.Bcl()), Float.valueOf(activeDrawable.Bcm()));
        }
        return null;
    }

    public final List getAllDrawables() {
        ArrayList arrayList = new ArrayList(getInteractiveDrawables().size());
        ListIterator drawableIterator = getDrawableIterator();
        while (drawableIterator.hasNext()) {
            arrayList.add(((C378669Qs) ((B2K) drawableIterator.next())).A0B);
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        0qQ.A07(unmodifiableList);
        return unmodifiableList;
    }

    public final int getDrawableCount() {
        return getInteractiveDrawables().size();
    }

    public final int getMaxZ() {
        ListIterator drawableIterator = getDrawableIterator();
        int i = 0;
        while (drawableIterator.hasNext()) {
            int i2 = ((C378669Qs) ((B3f) drawableIterator.next())).A09;
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            Rect rect = this.A0h;
            rect.set(i, i2, i3, i4);
            if (this.A0M) {
                this.A0o.A07(rect);
            }
        }
        List<Runnable> list = this.A0s;
        if (!list.isEmpty()) {
            for (Runnable run : list) {
                run.run();
            }
            list.clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0223, code lost:
        if (r2.contains((int) r1, (int) r3) == false) goto L_0x0225;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0441  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = 605984351(0x241e965f, float:3.4388158E-17)
            int r6 = X.AnonymousClass0fD.A05(r0)
            r5 = 0
            r7 = r18
            X.0qQ.A0B(r7, r5)
            r8 = r17
            X.83q r0 = r8.A08
            r16 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0029
            X.83p r0 = (X.C3501783p) r0
            X.80R r0 = r0.A00
            X.82p r0 = r0.A0o
            X.82o r0 = r0.A02
            boolean r0 = r0.A00
            if (r0 != r4) goto L_0x0029
            r0 = -1739037479(0xffffffff985864d9, float:-2.796826E-24)
            X.AnonymousClass0fD.A0C(r0, r6)
            return r5
        L_0x0029:
            com.instagram.common.session.UserSession r0 = r8.A06
            if (r0 == 0) goto L_0x0080
            boolean r0 = r8.A0K
            if (r0 != 0) goto L_0x0080
            X.4yO r0 = r8.A07
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x006e
            r8.A0K = r4
            X.8jJ r3 = r8.A0o
            r3.A0M = r4
            X.8jK r0 = r3.A0W
            r0.A01 = r4
            X.8jK r0 = r3.A0X
            r0.A01 = r4
            X.8jK r0 = r3.A0Y
            r0.A01 = r4
            X.8jK r0 = r3.A0T
            r0.A01 = r4
            X.2eb r0 = r3.A0F
            if (r0 == 0) goto L_0x006e
            android.view.View r2 = r0.A01()
            if (r2 == 0) goto L_0x006e
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            boolean r0 = r1 instanceof android.widget.FrameLayout.LayoutParams
            if (r0 == 0) goto L_0x00ae
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
        L_0x0061:
            boolean r0 = r3.A0f
            if (r0 == 0) goto L_0x00a7
            if (r1 == 0) goto L_0x006b
            int r0 = r3.A0N
            r1.leftMargin = r0
        L_0x006b:
            r2.setLayoutParams(r1)
        L_0x006e:
            X.4yO r0 = r8.A07
            boolean r0 = r0 instanceof X.AnonymousClass9QA
            if (r0 == 0) goto L_0x0080
            com.instagram.common.session.UserSession r3 = r8.A06
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320214845038702(0x81090b0001206e, double:3.0323883455442776E-306)
            X.182.A06(r2, r3, r0)
        L_0x0080:
            X.8jJ r10 = r8.A0o
            X.8jM r0 = r10.A0d
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x008a
            r10.A0L = r4
        L_0x008a:
            int r0 = r7.getAction()
            r9 = 3
            if (r0 != r9) goto L_0x00b0
            java.util.Set r0 = r8.A0t
            java.util.Iterator r1 = r0.iterator()
        L_0x0097:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r0 = r1.next()
            X.88G r0 = (X.AnonymousClass88G) r0
            r0.CtY()
            goto L_0x0097
        L_0x00a7:
            if (r1 == 0) goto L_0x006b
            int r0 = r3.A0N
            r1.rightMargin = r0
            goto L_0x006b
        L_0x00ae:
            r1 = 0
            goto L_0x0061
        L_0x00b0:
            boolean r0 = r8.A0S
            if (r0 == 0) goto L_0x0295
            java.util.List r0 = r8.getInteractiveDrawables()
            int r0 = r0.size()
            if (r0 > 0) goto L_0x00cb
            android.view.GestureDetector r0 = r8.A11
            boolean r1 = r0.onTouchEvent(r7)
            r0 = -881066568(0xffffffffcb7bfdb8, float:-1.6514488E7)
            X.AnonymousClass0fD.A0C(r0, r6)
            return r1
        L_0x00cb:
            int r0 = r7.getPointerCount()
            if (r0 != r4) goto L_0x00da
            r10.A0J = r5
            X.2cs r2 = r10.A0R
            r0 = 0
            r2.A06(r0)
        L_0x00da:
            boolean r0 = r8.A0J
            if (r0 == 0) goto L_0x00f5
            X.2cs r0 = r8.A15
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x00ee
            X.2cs r0 = r8.A0n
            boolean r0 = r0.A0C()
            if (r0 != 0) goto L_0x00f5
        L_0x00ee:
            r0 = -1403659898(0xffffffffac55d986, float:-3.038987E-12)
            X.AnonymousClass0fD.A0C(r0, r6)
            return r4
        L_0x00f5:
            int r12 = r7.getActionMasked()
            java.lang.String r11 = "Required value was null."
            if (r12 != 0) goto L_0x0168
            float r1 = r7.getX()
            float r0 = r7.getY()
            boolean r0 = A0E(r8, r1, r0, r4)
            if (r0 == 0) goto L_0x0199
            android.view.ViewParent r0 = r8.getParent()
            if (r0 == 0) goto L_0x015e
            r0.requestDisallowInterceptTouchEvent(r4)
            r8.A0Z = r4
            r8.A0J = r5
            X.B3f r1 = r8.getActiveDrawable()
            if (r1 == 0) goto L_0x0458
            X.9Qs r1 = (X.C378669Qs) r1
            boolean r0 = r1.A0U
            if (r0 == 0) goto L_0x0130
            r1.A0X = r5
            X.2cs r2 = r1.A0i
            r2.A06 = r4
            float r0 = r1.A0d
            double r0 = (double) r0
            r2.A06(r0)
        L_0x0130:
            boolean r0 = r8.A0Z
            if (r0 == 0) goto L_0x0199
            java.util.Set r0 = r8.A0t
            java.util.Iterator r2 = r0.iterator()
        L_0x013a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0199
            java.lang.Object r1 = r2.next()
            X.88G r1 = (X.AnonymousClass88G) r1
            X.B3f r0 = r8.getActiveDrawable()
            if (r0 == 0) goto L_0x0154
            X.9Qs r0 = (X.C378669Qs) r0
            android.graphics.drawable.Drawable r0 = r0.A0B
            r1.CtK(r0)
            goto L_0x013a
        L_0x0154:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r11)
            r0 = -663871989(0xffffffffd86e1e0b, float:-1.0472512E15)
            goto L_0x0460
        L_0x015e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r11)
            r0 = -412654216(0xffffffffe7676578, float:-1.0927384E24)
            goto L_0x0460
        L_0x0168:
            r0 = 5
            if (r12 != r0) goto L_0x0199
            boolean r0 = r8.A0P
            r13 = 0
            if (r0 != 0) goto L_0x0199
            int r3 = r7.getPointerCount()
            r2 = 0
            r1 = 0
        L_0x0176:
            if (r13 >= r3) goto L_0x0185
            float r0 = r7.getX(r13)
            float r2 = r2 + r0
            float r0 = r7.getY(r13)
            float r1 = r1 + r0
            int r13 = r13 + 1
            goto L_0x0176
        L_0x0185:
            float r0 = (float) r3
            float r2 = r2 / r0
            float r1 = r1 / r0
            boolean r0 = A0E(r8, r2, r1, r4)
            if (r0 == 0) goto L_0x0199
            android.view.ViewParent r0 = r8.getParent()
            if (r0 == 0) goto L_0x0276
            r0.requestDisallowInterceptTouchEvent(r4)
            r8.A0Z = r4
        L_0x0199:
            float r1 = r7.getX()
            float r3 = r7.getY()
            android.view.View r13 = r8.A0k
            int r0 = r13.getVisibility()
            if (r0 != 0) goto L_0x0245
            android.graphics.Rect r14 = r8.A0i
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L_0x01cf
            android.view.View r0 = r8.A0l
            r0.getHitRect(r14)
            float r0 = r13.getX()
            int r2 = (int) r0
            float r0 = r13.getY()
            int r0 = (int) r0
            r14.offset(r2, r0)
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x01cf
            int r0 = r8.A0e
            int r0 = -r0
            r14.inset(r0, r0)
        L_0x01cf:
            int r2 = (int) r1
            int r0 = (int) r3
            boolean r0 = r14.contains(r2, r0)
            if (r0 != 0) goto L_0x0225
            boolean r0 = r8.A0R
            if (r0 == 0) goto L_0x0245
            android.graphics.RectF r0 = r8.A0j
            android.graphics.RectF r14 = new android.graphics.RectF
            r14.<init>(r0)
            float r2 = r14.top
            float r0 = r8.getY()
            float r2 = r2 + r0
            r14.top = r2
            float r2 = r14.bottom
            float r0 = r8.getY()
            float r2 = r2 + r0
            r14.bottom = r2
            float r2 = r14.left
            float r0 = r8.getX()
            float r2 = r2 + r0
            r14.left = r2
            float r2 = r14.right
            float r0 = r8.getX()
            float r2 = r2 + r0
            r14.right = r2
            float r0 = r8.getX()
            float r1 = r1 + r0
            float r0 = r8.getY()
            float r3 = r3 + r0
            android.graphics.Rect r2 = r8.A0h
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r2)
            boolean r0 = android.graphics.RectF.intersects(r0, r14)
            if (r0 != 0) goto L_0x0245
            int r1 = (int) r1
            int r0 = (int) r3
            boolean r0 = r2.contains(r1, r0)
            if (r0 != 0) goto L_0x0245
        L_0x0225:
            java.util.Set r0 = r8.A0t
            java.util.Iterator r2 = r0.iterator()
        L_0x022b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02aa
            java.lang.Object r1 = r2.next()
            X.88G r1 = (X.AnonymousClass88G) r1
            X.B3f r0 = r8.getActiveDrawable()
            if (r0 == 0) goto L_0x022b
            X.9Qs r0 = (X.C378669Qs) r0
            android.graphics.drawable.Drawable r0 = r0.A0B
            r1.DAs(r0)
            goto L_0x022b
        L_0x0245:
            X.2cs r14 = r8.A15
            X.2ct r0 = r14.A09
            double r2 = r0.A00
            r0 = 0
            int r15 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r15 <= 0) goto L_0x0259
            android.view.GestureDetector r2 = r8.A12
            r2.onTouchEvent(r7)
            r14.A06 = r4
            goto L_0x02b9
        L_0x0259:
            android.view.ScaleGestureDetector r0 = r8.A14
            r0.onTouchEvent(r7)
            X.8jP r0 = r8.A17
            r0.A00(r7)
            android.view.GestureDetector r0 = r8.A12
            r0.onTouchEvent(r7)
            boolean r0 = r8.A0b
            if (r0 == 0) goto L_0x02bf
            boolean r0 = r8.A0F
            if (r0 == 0) goto L_0x02bf
            android.view.GestureDetector r0 = r8.A13
            r0.onTouchEvent(r7)
            goto L_0x02bf
        L_0x0276:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r11)
            r0 = -1894560019(0xffffffff8f134eed, float:-7.26286E-30)
            goto L_0x0460
        L_0x0280:
            if (r12 != 0) goto L_0x02bf
            float r1 = r7.getX()
            float r0 = r7.getY()
            boolean r0 = A0E(r8, r1, r0, r4)
            if (r0 == 0) goto L_0x0295
            android.view.GestureDetector r0 = r8.A12
            r0.onTouchEvent(r7)
        L_0x0295:
            boolean r0 = r8.A0S
            if (r0 == 0) goto L_0x02a3
            boolean r0 = r8.A0O
            if (r0 == 0) goto L_0x02a1
            boolean r0 = r8.A0Z
            if (r0 == 0) goto L_0x02a3
        L_0x02a1:
            r16 = 1
        L_0x02a3:
            r0 = -374984023(0xffffffffe9a632a9, float:-2.5115115E25)
            X.AnonymousClass0fD.A0C(r0, r6)
            return r16
        L_0x02aa:
            boolean r0 = r8.A0N
            if (r0 != 0) goto L_0x0280
            X.2cs r14 = r8.A15
            X.3oj r0 = r8.A16
            r14.A0A(r0)
            r14.A06 = r5
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x02b9:
            r14.A06(r0)
            r10.A06()
        L_0x02bf:
            r0 = 0
            if (r12 == r4) goto L_0x0305
            if (r12 != r9) goto L_0x0295
            r8.A0C = r0
            r8.A0J = r4
            r8.A0Z = r5
            r8.A0b = r5
            r10.A06()
            r8.invalidate()
            boolean r0 = r8.A0c
            if (r0 == 0) goto L_0x02fb
            r8.A0c = r5
            X.B3f r0 = r8.getActiveDrawable()
            r8.A0B(r0)
        L_0x02df:
            int r0 = r13.getVisibility()
            if (r0 == 0) goto L_0x0439
            java.util.Set r0 = r8.A0t
            java.util.Iterator r1 = r0.iterator()
        L_0x02eb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0295
            java.lang.Object r0 = r1.next()
            X.88G r0 = (X.AnonymousClass88G) r0
            r0.Dsb()
            goto L_0x02eb
        L_0x02fb:
            X.B3f r0 = r8.getActiveDrawable()
            if (r0 == 0) goto L_0x0446
            r0.ECX()
            goto L_0x02df
        L_0x0305:
            r8.A0C = r0
            boolean r0 = r8.A0Z
            if (r0 == 0) goto L_0x0359
            X.B3f r2 = r8.getActiveDrawable()
            if (r2 == 0) goto L_0x032c
            X.9Qs r2 = (X.C378669Qs) r2
            X.8DA r0 = r2.A0D
            if (r0 == 0) goto L_0x032c
            java.lang.Integer r1 = r0.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x032c
            float r1 = r2.A04
            float r0 = r2.A00
            float r1 = r1 * r0
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0351
            X.C378669Qs.A02(r2)
        L_0x032c:
            java.util.Set r0 = r8.A0t
            java.util.Iterator r3 = r0.iterator()
        L_0x0332:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0359
            java.lang.Object r2 = r3.next()
            X.88G r2 = (X.AnonymousClass88G) r2
            r2.CtX()
            X.B3f r0 = r8.getActiveDrawable()
            if (r0 == 0) goto L_0x0332
            X.9Qs r0 = (X.C378669Qs) r0
            float r1 = r0.A01
            float r0 = r0.A02
            r2.DAr(r1, r0)
            goto L_0x0332
        L_0x0351:
            boolean r0 = r2.A0V
            if (r0 == 0) goto L_0x032c
            X.C378669Qs.A03(r2)
            goto L_0x032c
        L_0x0359:
            r8.A0J = r4
            r8.A0Z = r5
            r8.A0b = r5
            r10.A06()
            r8.invalidate()
            boolean r0 = r8.A0c
            if (r0 == 0) goto L_0x038e
            r8.A0c = r5
            X.B3f r0 = r8.getActiveDrawable()
            r8.A0B(r0)
        L_0x0372:
            int r0 = r13.getVisibility()
            if (r0 == 0) goto L_0x0439
            java.util.Set r0 = r8.A0t
            java.util.Iterator r1 = r0.iterator()
        L_0x037e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0295
            java.lang.Object r0 = r1.next()
            X.88G r0 = (X.AnonymousClass88G) r0
            r0.Dsb()
            goto L_0x037e
        L_0x038e:
            X.B3f r0 = r8.getActiveDrawable()
            if (r0 == 0) goto L_0x044f
            r0.ECX()
            X.B3f r5 = r8.getActiveDrawable()
            if (r5 == 0) goto L_0x0372
            r3 = r5
            X.9Qs r3 = (X.C378669Qs) r3
            boolean r0 = r3.A0a
            if (r0 != 0) goto L_0x03a8
            boolean r0 = r3.A0Z
            if (r0 == 0) goto L_0x0372
        L_0x03a8:
            float r4 = r3.A01
            float r2 = r3.A02
            float r1 = r3.A04
            float r0 = r3.A03
            boolean r0 = X.C378669Qs.A07(r3, r4, r2, r1, r0)
            if (r0 != 0) goto L_0x0372
            com.instagram.common.session.UserSession r4 = r8.A06
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322826185091554(0x810b6b000029e2, double:3.0340397675087236E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0372
            X.8jI r4 = r8.A0p
            float r7 = r3.A01
            r4.A02 = r7
            float r2 = r3.A02
            r4.A03 = r2
            float r1 = r3.A04
            float r0 = r3.A03
            android.graphics.RectF r9 = X.C378669Qs.A01(r3, r7, r2, r1, r0)
            android.graphics.Rect r7 = X.C378669Qs.A00(r3)
            float r2 = r9.left
            int r0 = r7.left
            float r1 = (float) r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x042a
            float r9 = r3.A01
            float r1 = r1 - r2
            float r7 = r9 + r1
        L_0x03f1:
            r4.A00 = r7
            float r2 = r3.A02
            float r1 = r3.A04
            float r0 = r3.A03
            android.graphics.RectF r9 = X.C378669Qs.A01(r3, r9, r2, r1, r0)
            android.graphics.Rect r7 = X.C378669Qs.A00(r3)
            float r2 = r9.top
            int r0 = r7.top
            float r1 = (float) r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x041c
            float r3 = r3.A02
            float r1 = r1 - r2
            float r3 = r3 + r1
        L_0x040e:
            r4.A01 = r3
            r4.A04 = r5
            X.2cs r0 = r8.A0n
            r0.A0A(r4)
            r0.A03()
            goto L_0x0372
        L_0x041c:
            float r2 = r9.bottom
            int r0 = r7.bottom
            float r1 = (float) r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            float r3 = r3.A02
            if (r0 < 0) goto L_0x040e
            float r2 = r2 - r1
            float r3 = r3 - r2
            goto L_0x040e
        L_0x042a:
            float r2 = r9.right
            int r0 = r7.right
            float r1 = (float) r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            float r7 = r3.A01
            r9 = r7
            if (r0 <= 0) goto L_0x03f1
            float r2 = r2 - r1
            float r7 = r7 - r2
            goto L_0x03f1
        L_0x0439:
            X.2cs r0 = r8.A15
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x0295
            A06(r8)
            goto L_0x0295
        L_0x0446:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r11)
            r0 = 1351189304(0x50898338, float:1.84566252E10)
            goto L_0x0460
        L_0x044f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r11)
            r0 = 416999603(0x18dae8b3, float:5.6586645E-24)
            goto L_0x0460
        L_0x0458:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r11)
            r0 = -50634631(0xfffffffffcfb6079, float:-1.04417857E37)
        L_0x0460:
            X.AnonymousClass0fD.A0C(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.interactive.InteractiveDrawableContainer.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setAlignmentGuideAlignHorizontalMarginToUfiTower(boolean z) {
    }

    public final void setDelegate(C3501883q r1) {
        this.A08 = r1;
    }

    public final void setDetectGestureOnLongPress(boolean z) {
        this.A0F = z;
    }

    public final void setDisableRotate(boolean z) {
        this.A0G = z;
    }

    public final void setDisableScale(boolean z) {
        this.A0H = z;
    }

    public final void setDisableScroll(boolean z) {
        this.A0I = z;
    }

    public final void setDrawableUpdateListener(AnonymousClass8QU r1) {
        this.A09 = r1;
    }

    public final void setInteractiveDrawableDataSource(C3500282x r1) {
        this.A0D = r1;
    }

    public final void setOnlyHandleTouchesOnActiveDrawables(boolean z) {
        this.A0O = z;
    }

    public final void setShouldBringDrawableToFrontWhenActivated(boolean z) {
        this.A0Q = z;
    }

    public final void setTouchEnabled(boolean z) {
        this.A0S = z;
    }

    public final void setTrashCanEnabled(boolean z) {
        this.A0T = z;
    }

    public final void setUserSession(UserSession userSession) {
        this.A06 = userSession;
    }

    /* JADX WARNING: type inference failed for: r0v45, types: [X.8jQ, X.3Z0] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteractiveDrawableContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A0q = new C363158jG(this);
        Paint paint = new Paint();
        this.A0v = paint;
        Paint paint2 = new Paint();
        this.A0w = paint2;
        this.A0i = new Rect();
        this.A0r = new ArrayList();
        this.A0t = new CopyOnWriteArraySet();
        this.A16 = new C363168jH(this);
        this.A0p = new C363178jI(this);
        this.A0h = new Rect();
        this.A0j = new RectF();
        this.A0x = new Path();
        this.A0g = new Matrix();
        this.A0f = new Matrix();
        this.A0z = new PointF();
        this.A0y = new PointF();
        this.A0s = new ArrayList();
        this.A0Q = true;
        this.A0S = true;
        this.A0E = new ArrayList();
        this.A10 = new PointF();
        this.A0u = new HashSet();
        this.A07 = C363138jC.A00;
        setWillNotDraw(false);
        this.A0o = new C363188jJ(context);
        Handler handler = new Handler(Looper.getMainLooper());
        this.A11 = new GestureDetector(context, new C363238jO(this), handler);
        GestureDetector gestureDetector = new GestureDetector(context, this, handler);
        gestureDetector.setIsLongpressEnabled(false);
        this.A13 = gestureDetector;
        this.A12 = new GestureDetector(context, this, handler);
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, this, handler);
        this.A14 = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        this.A17 = new C363248jP(context, this);
        2cs A022 = C61340me.A00().A02();
        A022.A09(A1A);
        this.A15 = A022;
        2cs A023 = C61340me.A00().A02();
        A023.A09(A19);
        this.A0n = A023;
        Resources resources = context.getResources();
        this.A0e = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        this.A0d = resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(resources.getColor(R.color.sticker_boundaries_background));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(resources.getColor(R.color.sticker_contour_stroke_color));
        paint2.setStrokeWidth(5.0f);
        View inflate = LayoutInflater.from(context).inflate(R.layout.trash_can, this, false);
        this.A0k = inflate;
        this.A0m = inflate.requireViewById(R.id.trash_can_label);
        this.A0l = inflate.requireViewById(R.id.trash_can_circle);
        addView(inflate);
        this.A18 = new AnonymousClass3Z0(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InteractiveDrawableContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InteractiveDrawableContainer(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}
