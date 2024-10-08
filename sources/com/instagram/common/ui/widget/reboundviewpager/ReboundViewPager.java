package com.instagram.common.ui.widget.reboundviewpager;

import X.02Z;
import X.03v;
import X.0fS;
import X.0qQ;
import X.0sn;
import X.2cs;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass3TD;
import X.AnonymousClass3TE;
import X.AnonymousClass3TF;
import X.AnonymousClass3TG;
import X.AnonymousClass3TH;
import X.AnonymousClass3TI;
import X.AnonymousClass4G7;
import X.AnonymousClass4GU;
import X.AnonymousClass4GW;
import X.AnonymousClass4GX;
import X.AnonymousClass9LM;
import X.C252203oj;
import X.C252293os;
import X.C253723rH;
import X.C255963v0;
import X.C255973v1;
import X.C255993v3;
import X.C256093vD;
import X.C256103vE;
import X.C314096he;
import X.C342287oL;
import X.C342317oO;
import X.C59549JNv;
import X.C62000qj;
import X.C71382cm;
import X.C71392co;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Adapter;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.facebook.systrace.Systrace;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class ReboundViewPager extends FrameLayout implements C253723rH, C252203oj, GestureDetector.OnGestureListener {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public View A0F;
    public C255993v3 A0G;
    public AnonymousClass3TH A0H;
    public C314096he A0I;
    public C255973v1 A0J;
    public C342317oO A0K;
    public C59549JNv A0L;
    public AnonymousClass3TI A0M;
    public AnonymousClass3TG A0N;
    public AnonymousClass3TF A0O;
    public C342287oL A0P;
    public Integer A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public int[] A0c;
    public int[] A0d;
    public float A0e;
    public float A0f;
    public float A0g;
    public float A0h;
    public int A0i;
    public int A0j;
    public int A0k;
    public int A0l;
    public Boolean A0m;
    public Integer A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public final AccessibilityManager A0u;
    public final Map A0v;
    public final Map A0w;
    public final Set A0x;
    public final Set A0y;
    public final Set A0z;
    public final AnonymousClass0eM A10;
    public final float[] A11;
    public final float[] A12;
    public final GestureDetector A13;
    public final Scroller A14;
    public final AnonymousClass3TD A15;
    public final List A16;
    public final List A17;
    public final List A18;
    public final List A19;
    public final List A1A;
    public final Map A1B;
    public final Map A1C;

    public static final void A05(ReboundViewPager reboundViewPager, double d, float f, boolean z) {
        reboundViewPager.A03((C71392co) reboundViewPager.A0v.get(AnonymousClass3TE.A03), d, f, z);
    }

    private final boolean A09(float f, float f2) {
        boolean z = true;
        if (f < 0.0f) {
            if (f2 >= getMinimumOffset()) {
                return z;
            }
            return false;
        } else if (f > 0.0f) {
            return f2 <= getMaximumOffset();
        } else {
            if (f2 < getMinimumOffset()) {
                return false;
            }
            z = true;
            if (f2 > getMaximumOffset()) {
                return false;
            }
        }
        return z;
    }

    public final float A0B(float f) {
        float f2 = this.A01;
        float f3 = f2 % 1.0f;
        if (f3 < 0.0f) {
            f3 += 1.0f;
        }
        float f4 = f2 + (1.0f - f3) + 0.0f;
        A05(this, (double) f, f4, true);
        return f4;
    }

    public final void A0H(float f) {
        A0J(f, true, false);
    }

    public final void A0K(int i) {
        A05(this, 0.0d, (float) i, false);
    }

    public final void A0L(int i, float f) {
        A05(this, (double) f, (float) i, true);
    }

    public final void A0N(Adapter adapter, float f) {
        0qQ.A0B(adapter, 0);
        A0O(new AnonymousClass4G7(adapter), f);
    }

    public final void A0O(C255993v3 r4, float f) {
        0qQ.A0B(r4, 0);
        this.A05 = f;
        this.A0i = 0;
        C255993v3 r1 = this.A0G;
        if (r1 != null) {
            r1.FJ4(this.A15);
        }
        if (this.A0G != r4) {
            0sn r0 = 0sn.A00;
            A07(r0, r0, r0, false);
        }
        r4.EC1(this.A15);
        this.A0G = r4;
        A0J(f, true, false);
        this.A0D = this.A08;
    }

    public final void A0P(C252293os r2) {
        Set set;
        0qQ.A0B(r2, 0);
        this.A0x.add(r2);
        if (r2 instanceof C256093vD) {
            set = this.A0y;
        } else if (r2 instanceof C256103vE) {
            set = this.A0z;
        } else {
            return;
        }
        set.add(r2);
    }

    public final void A0Q(C252293os r2) {
        0qQ.A0B(r2, 0);
        this.A0x.remove(r2);
        if (r2 instanceof C256093vD) {
            this.A0y.remove(r2);
        }
        if (r2 instanceof C256103vE) {
            this.A0z.remove(r2);
        }
    }

    public final void ACu(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.attachViewToParent(view, 0, layoutParams);
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r5) {
        0qQ.A0B(r5, 0);
        if (this.A0O == AnonymousClass3TF.SETTLING) {
            A0R(false, (float) r5.A01);
            A04(AnonymousClass3TF.IDLE, false);
        }
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r5) {
        2cs r2;
        float maximumOffset;
        0qQ.A0B(r5, 0);
        if (this.A0O == AnonymousClass3TF.SETTLING) {
            A0R(false, (float) r5.A09.A00);
            float f = this.A01;
            if (f < getMinimumOffset()) {
                AnonymousClass0eM r3 = this.A10;
                ((2cs) r3.getValue()).A09((C71392co) this.A0v.get(AnonymousClass3TE.A03));
                r2 = (2cs) r3.getValue();
                maximumOffset = getMinimumOffset();
            } else if (f > getMaximumOffset()) {
                AnonymousClass0eM r32 = this.A10;
                ((2cs) r32.getValue()).A09((C71392co) this.A0v.get(AnonymousClass3TE.A03));
                r2 = (2cs) r32.getValue();
                maximumOffset = getMaximumOffset();
            } else {
                return;
            }
            r2.A06((double) maximumOffset);
        }
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        if (r1 != 3) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007a, code lost:
        if (r0 != false) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            r4 = 0
            X.0qQ.A0B(r9, r4)
            X.3TG r1 = r8.A0N
            X.3TG r0 = X.AnonymousClass3TG.DISABLED
            r7 = 0
            if (r1 == r0) goto L_0x00ed
            X.3v1 r2 = r8.A0J
            float r1 = r9.getX()
            float r0 = r9.getY()
            boolean r0 = r2.FHR(r8, r1, r0)
            if (r0 == 0) goto L_0x00ed
            int r1 = r9.getActionMasked()
            r3 = 1
            if (r1 == 0) goto L_0x00d1
            if (r1 == r3) goto L_0x00cb
            r0 = 2
            if (r1 == r0) goto L_0x002b
            r0 = 3
            if (r1 == r0) goto L_0x00cb
        L_0x002a:
            return r7
        L_0x002b:
            r8.A01(r9)
            float r6 = r9.getRawX()
            float r0 = r8.A0e
            float r6 = r6 - r0
            float r2 = r9.getRawY()
            float r0 = r8.A0f
            float r2 = r2 - r0
            boolean r0 = r8.A0q
            if (r0 == 0) goto L_0x0046
            X.3TI r1 = r8.A0M
            X.3TI r0 = X.AnonymousClass3TI.HORIZONTAL
            if (r1 == r0) goto L_0x0050
        L_0x0046:
            boolean r0 = r8.A0r
            if (r0 == 0) goto L_0x00c9
            X.3TI r1 = r8.A0M
            X.3TI r0 = X.AnonymousClass3TI.VERTICAL
            if (r1 != r0) goto L_0x00c9
        L_0x0050:
            r1 = 1
        L_0x0051:
            X.3TI r0 = r8.A0M
            X.3TI r5 = X.AnonymousClass3TI.VERTICAL
            if (r0 == r5) goto L_0x0058
            r2 = r6
        L_0x0058:
            if (r1 == 0) goto L_0x002a
            boolean r0 = r8.A0Z
            if (r0 == 0) goto L_0x0062
            boolean r0 = r8.A0Y
            if (r0 != 0) goto L_0x007c
        L_0x0062:
            boolean r0 = r8.A0R
            if (r0 != 0) goto L_0x007c
            boolean r1 = r8.A0S()
            r0 = 0
            if (r1 == 0) goto L_0x00c2
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c7
        L_0x0071:
            r2 = 1
        L_0x0072:
            int r1 = r8.A07
            if (r1 != 0) goto L_0x00b0
            if (r2 != 0) goto L_0x007c
            boolean r0 = r8.A0Z
        L_0x007a:
            if (r0 == 0) goto L_0x002a
        L_0x007c:
            X.3TI r0 = r8.A0M
            if (r0 == r5) goto L_0x0091
            int r2 = (int) r6
            float r0 = r9.getX()
            int r1 = (int) r0
            float r0 = r9.getY()
            int r0 = (int) r0
            boolean r0 = X.C14246TsT.A00(r8, r2, r1, r0, r4)
            if (r0 != 0) goto L_0x002a
        L_0x0091:
            android.view.ViewParent r0 = r8.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
            boolean r0 = r8.A0U
            if (r0 == 0) goto L_0x00ae
            X.3TF r0 = X.AnonymousClass3TF.IDLE
            r8.A04(r0, r3)
            X.0eM r0 = r8.A10
            java.lang.Object r0 = r0.getValue()
            X.2cs r0 = (X.2cs) r0
            r0.A01()
            r8.A0U = r4
        L_0x00ae:
            r7 = 1
            return r7
        L_0x00b0:
            X.3v3 r0 = r8.A0G
            if (r0 == 0) goto L_0x00c0
            int r0 = r0.getCount()
        L_0x00b8:
            int r0 = r0 - r3
            if (r1 != r0) goto L_0x007c
            if (r2 == 0) goto L_0x007c
            boolean r0 = r8.A0Y
            goto L_0x007a
        L_0x00c0:
            r0 = 0
            goto L_0x00b8
        L_0x00c2:
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c7
            goto L_0x0071
        L_0x00c7:
            r2 = 0
            goto L_0x0072
        L_0x00c9:
            r1 = 0
            goto L_0x0051
        L_0x00cb:
            float r0 = r8.A0h
            r8.A0I(r0)
            return r7
        L_0x00d1:
            r8.A0q = r4
            r8.A0r = r4
            r8.A0s = r4
            r0 = 0
            r8.A0h = r0
            float r0 = r9.getRawX()
            r8.A0e = r0
            float r0 = r9.getRawY()
            r8.A0f = r0
            r8.A0U = r3
            int r0 = r8.A07
            r8.A0k = r0
            return r7
        L_0x00ed:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r4 == X.AnonymousClass88T.TABLE_TOP) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onSingleTapUp(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r1 = 0
            X.0qQ.A0B(r7, r1)
            X.7oO r0 = r6.A0K
            if (r0 == 0) goto L_0x0036
            float r2 = r7.getRawX()
            float r3 = r7.getRawY()
            X.7oN r0 = (X.C342307oN) r0
            X.86m r5 = r0.A00
            X.4Vs r0 = r5.A03
            r4 = 0
            if (r0 == 0) goto L_0x0037
            X.4W8 r0 = X.AnonymousClass4W7.A00(r0)
            if (r0 == 0) goto L_0x0037
            android.app.Activity r0 = r5.A0K
            java.lang.Integer r1 = X.AnonymousClass4WA.A01(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x0037
            X.4Vs r0 = r5.A03
            if (r0 == 0) goto L_0x0031
            X.88T r4 = X.AnonymousClass4W7.A01(r0)
        L_0x0031:
            X.88T r0 = X.AnonymousClass88T.TABLE_TOP
            if (r4 != r0) goto L_0x0037
        L_0x0035:
            r1 = 1
        L_0x0036:
            return r1
        L_0x0037:
            X.86h r0 = r5.A0T
            X.0eK r0 = r0.A06
            java.lang.Object r1 = r0.get()
            X.8Fl r1 = (X.C352888Fl) r1
            X.7l2 r0 = r1.A06
            if (r0 == 0) goto L_0x0035
            boolean r0 = r0.CVP()
            if (r0 == 0) goto L_0x0035
            boolean r0 = r1.A0K
            if (r0 != 0) goto L_0x0035
            X.7l2 r0 = r1.A06
            X.7tb r0 = X.C340297l2.A02(r0)
            com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController r0 = (com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController) r0
            X.7lR r0 = r0.A04
            if (r0 == 0) goto L_0x005e
            r0.A07(r2, r3)
        L_0x005e:
            X.C352888Fl.A0L(r1, r2, r3, r2, r3)
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager.onSingleTapUp(android.view.MotionEvent):boolean");
    }

    public final void setBufferBias(AnonymousClass3TH r2) {
        0qQ.A0B(r2, 0);
        this.A0H = r2;
    }

    public final void setExtraBufferSize(int i) {
        A0M(i, false);
    }

    public final void setScrollDirection(AnonymousClass3TI r2) {
        0qQ.A0B(r2, 0);
        this.A0M = r2;
    }

    public final void setScrollMode(AnonymousClass3TG r5) {
        AnonymousClass3TE r0;
        0qQ.A0B(r5, 0);
        AnonymousClass3TG r3 = AnonymousClass3TG.DISCRETE_PAGING;
        2cs r2 = (2cs) this.A10.getValue();
        Map map = this.A0v;
        if (r5 == r3) {
            r0 = AnonymousClass3TE.A03;
        } else {
            r0 = AnonymousClass3TE.A04;
        }
        r2.A09((C71392co) map.get(r0));
        this.A0N = r5;
    }

    public final void setSpringConfig(AnonymousClass3TE r2, C71392co r3) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        this.A0v.put(r2, r3);
    }

    public final void setTouchSlopDp(int i) {
        this.A0g = TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReboundViewPager(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final View A00(AnonymousClass4GW r10) {
        Map map = (Map) this.A1C.get(Integer.valueOf(r10.A01));
        if (map != null) {
            C255993v3 r1 = this.A0G;
            if (!this.A0b || r1 == null || !r1.hasStableIds()) {
                View view = (View) map.remove(r10);
                if (view != null) {
                    return view;
                }
            } else {
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    View view2 = (View) entry.getValue();
                    if (((AnonymousClass4GW) entry.getKey()).A02 == r10.A02) {
                        it.remove();
                        return view2;
                    }
                }
            }
            for (AnonymousClass4GW r2 : map.keySet()) {
                if (r2.A00 != ((int) this.A02)) {
                    return (View) map.remove(r2);
                }
            }
        }
        return null;
    }

    private final void A01(MotionEvent motionEvent) {
        if (!this.A0r && !this.A0q) {
            float rawX = this.A0e - motionEvent.getRawX();
            float rawY = this.A0f - motionEvent.getRawY();
            boolean z = false;
            boolean z2 = false;
            if (Math.sqrt((double) ((rawX * rawX) + (rawY * rawY))) > ((double) this.A0g)) {
                z2 = true;
            }
            double degrees = Math.toDegrees(Math.atan((double) Math.abs(rawY / rawX)));
            if (!z2) {
                return;
            }
            if (this.A0O != AnonymousClass3TF.IDLE) {
                AnonymousClass3TI r2 = this.A0M;
                boolean z3 = false;
                if (r2 == AnonymousClass3TI.HORIZONTAL) {
                    z3 = true;
                }
                this.A0q = z3;
                if (r2 == AnonymousClass3TI.VERTICAL) {
                    z = true;
                }
                this.A0r = z;
            } else if (degrees < ((double) (this.A0l / 2))) {
                this.A0q = true;
            } else {
                this.A0r = true;
            }
        }
    }

    public static final void A02(View view, AnonymousClass4GW r4, ReboundViewPager reboundViewPager) {
        int i = r4.A01;
        Map map = reboundViewPager.A1C;
        Integer valueOf = Integer.valueOf(i);
        Map map2 = (Map) map.get(valueOf);
        if (map2 == null) {
            map2 = new LinkedHashMap();
            map.put(valueOf, map2);
        }
        map2.put(r4, view);
    }

    private final void A03(C71392co r7, double d, float f, boolean z) {
        AnonymousClass0eM r3 = this.A10;
        ((2cs) r3.getValue()).A09(r7);
        if (!this.A0R) {
            float minimumOffset = getMinimumOffset();
            if (f < minimumOffset) {
                f = minimumOffset;
            } else if (f > getMaximumOffset()) {
                f = getMaximumOffset();
            }
        }
        if (this.A01 != f) {
            A04(AnonymousClass3TF.SETTLING, false);
            2cs r5 = (2cs) r3.getValue();
            if (z) {
                r5.A08((double) this.A01, true);
                ((2cs) r3.getValue()).A07(-d);
                ((2cs) r3.getValue()).A06((double) f);
            } else {
                r5.A08((double) f, true);
                r5.A01();
            }
        }
        if (((2cs) r3.getValue()).A0C()) {
            A04(AnonymousClass3TF.IDLE, false);
        }
    }

    private final void A04(AnonymousClass3TF r7, boolean z) {
        int i;
        int i2;
        AnonymousClass3TF r5 = this.A0O;
        if (r7 != r5) {
            if (r7 != AnonymousClass3TF.IDLE || (i2 = this.A08) == (i = this.A0D)) {
                i = -1;
            } else {
                this.A0D = i2;
            }
            this.A0O = r7;
            for (C252293os r1 : this.A0x) {
                if (i != -1) {
                    r1.DW9(this.A08, i, z);
                }
                r1.DhS(this.A0O, r5);
            }
        }
    }

    public static final void A06(ReboundViewPager reboundViewPager, boolean z, boolean z2) {
        float f = reboundViewPager.A01;
        if (!reboundViewPager.A0R) {
            float minimumOffset = reboundViewPager.getMinimumOffset();
            if (f < minimumOffset) {
                f = minimumOffset;
            } else if (f > reboundViewPager.getMaximumOffset()) {
                f = reboundViewPager.getMaximumOffset();
            }
        }
        reboundViewPager.A0J(f, z, z2);
    }

    private final void A07(List list, List list2, List list3, boolean z) {
        boolean A0E2;
        int i;
        IllegalArgumentException illegalArgumentException;
        if (Systrace.A0E(1)) {
            0fS.A01("ReboundViewPager.fillRange", 1558794193);
        }
        try {
            List list4 = this.A18;
            List list5 = this.A16;
            list4.addAll(list5);
            list5.clear();
            int size = list.size();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    int intValue = ((Number) list.get(i3)).intValue();
                    int intValue2 = ((Number) list2.get(i3)).intValue();
                    C255993v3 r0 = this.A0G;
                    if (r0 == null) {
                        illegalArgumentException = new IllegalArgumentException("Required value was null.");
                        break;
                    }
                    long itemId = r0.getItemId(intValue);
                    if (!this.A0R) {
                        intValue2 = intValue;
                    }
                    C255993v3 r2 = this.A0G;
                    if (r2 == null) {
                        illegalArgumentException = new IllegalArgumentException("Required value was null.");
                        break;
                    }
                    AnonymousClass4GW r22 = new AnonymousClass4GW(itemId, intValue2, r2.getItemViewType(intValue));
                    list5.add(r22);
                    list4.remove(r22);
                    i3++;
                } else {
                    int size2 = list4.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        AnonymousClass4GW r6 = (AnonymousClass4GW) list4.get(i4);
                        Map map = this.A1B;
                        View view = (View) map.get(r6);
                        if (view != null) {
                            A02(view, r6, this);
                            this.A0w.remove(view);
                            map.remove(r6);
                        }
                    }
                    list4.clear();
                    int size3 = list5.size();
                    while (i2 < size3) {
                        if (this.A0J instanceof AnonymousClass4GX) {
                            i = (list5.size() - 1) - i2;
                        } else {
                            i = i2;
                        }
                        AnonymousClass4GW r23 = (AnonymousClass4GW) list5.get(i);
                        int intValue3 = ((Number) list.get(i)).intValue();
                        int intValue4 = ((Number) list2.get(i)).intValue();
                        Map map2 = this.A1B;
                        View view2 = (View) map2.get(r23);
                        if (z) {
                            if (view2 == null && (view2 = A00(r23)) == null) {
                                this.A0i++;
                            }
                            C255993v3 r02 = this.A0G;
                            if (r02 != null) {
                                view2 = r02.getView(intValue3, view2, this);
                            } else {
                                illegalArgumentException = new IllegalArgumentException("Required value was null.");
                            }
                        }
                        if (view2 == null) {
                            View A002 = A00(r23);
                            if (A002 == null) {
                                this.A0i++;
                            }
                            C255993v3 r03 = this.A0G;
                            if (r03 != null) {
                                view2 = r03.getView(intValue3, A002, this);
                            } else {
                                illegalArgumentException = new IllegalArgumentException("Required value was null.");
                            }
                        }
                        map2.put(r23, view2);
                        this.A0w.put(view2, r23);
                        if (intValue4 == this.A07) {
                            this.A0F = view2;
                        }
                        if (view2 == null || view2.getParent() == null) {
                            addView(view2);
                        }
                        C255973v1 r24 = this.A0J;
                        if (view2 != null) {
                            float f = 1.0f;
                            if (A0S()) {
                                f = -1.0f;
                            }
                            r24.E3E(view2, this, f * ((Number) list3.get(i)).floatValue(), intValue3);
                            C342287oL r25 = this.A0P;
                            AccessibilityManager accessibilityManager = this.A0u;
                            if (!(accessibilityManager == null || !accessibilityManager.isEnabled() || r25 == null)) {
                                if (view2.getImportantForAccessibility() == 0) {
                                    view2.setImportantForAccessibility(1);
                                }
                                02Z r26 = r25.A00;
                                02Z A012 = 03v.A01(view2);
                                if (!(A012 == null || A012 == r26)) {
                                    r26.A00.put(view2, A012);
                                }
                                03v.A0B(view2, r26);
                            }
                            i2++;
                        } else {
                            illegalArgumentException = new IllegalArgumentException("Required value was null.");
                        }
                    }
                    for (Map values : this.A1C.values()) {
                        for (View view3 : values.values()) {
                            if (view3.getParent() == this) {
                                for (C252293os DzE : this.A0x) {
                                    DzE.DzE(view3);
                                }
                                removeView(view3);
                            }
                            Map map3 = this.A0w;
                            if (map3.containsKey(view3)) {
                                this.A1B.remove((AnonymousClass4GW) map3.remove(view3));
                            }
                            C342287oL r27 = this.A0P;
                            AccessibilityManager accessibilityManager2 = this.A0u;
                            if (!(accessibilityManager2 == null || !accessibilityManager2.isEnabled() || r27 == null)) {
                                03v.A0B(view3, (02Z) r27.A00.A00.remove(view3));
                            }
                        }
                    }
                    if (!A0E2) {
                        return;
                    }
                    return;
                }
            }
            throw illegalArgumentException;
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(187399473);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005a, code lost:
        if (A0S() != false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0077, code lost:
        if (A0S() != false) goto L_0x005d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A08(float r6) {
        /*
            r5 = this;
            X.3TI r1 = r5.A0M
            X.3TI r0 = X.AnonymousClass3TI.VERTICAL
            if (r1 != r0) goto L_0x003b
            boolean r0 = r5.A0t
        L_0x0008:
            r1 = 0
            if (r0 == 0) goto L_0x0030
            X.3v3 r0 = r5.A0G
            if (r0 == 0) goto L_0x0030
            boolean r0 = r5.A0V
            r4 = 0
            if (r0 == 0) goto L_0x001a
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0036
            r5.A0V = r1
        L_0x001a:
            boolean r0 = r5.A0T
            if (r0 == 0) goto L_0x0024
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0031
            r5.A0T = r1
        L_0x0024:
            boolean r0 = X.AnonymousClass4GU.A00(r6)
            if (r0 != 0) goto L_0x003e
            X.0qi r0 = X.C62000qj.A02
            boolean r0 = r0.A0R
            if (r0 == 0) goto L_0x003e
        L_0x0030:
            return r1
        L_0x0031:
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0024
            return r1
        L_0x0036:
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x001a
            return r1
        L_0x003b:
            boolean r0 = r5.A0p
            goto L_0x0008
        L_0x003e:
            X.6he r0 = r5.A0I
            r3 = 1
            if (r0 == 0) goto L_0x0094
            float r1 = r5.A01
            float r1 = r1 + r6
            X.3v1 r0 = r5.A0J
            int r2 = r0.AVk(r5, r1)
            X.3v1 r0 = r5.A0J
            int r1 = r0.CfQ(r5, r1)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x006f
            boolean r0 = r5.A0S()
            if (r0 == 0) goto L_0x005d
        L_0x005c:
            r2 = r1
        L_0x005d:
            java.lang.String r1 = "Required value was null."
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x007d
            if (r2 < 0) goto L_0x0092
            X.3v3 r0 = r5.A0G
            if (r0 != 0) goto L_0x008f
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x006f:
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x007a
            boolean r0 = r5.A0S()
            if (r0 == 0) goto L_0x005c
            goto L_0x005d
        L_0x007a:
            int r2 = r5.A08
            goto L_0x005d
        L_0x007d:
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0094
            int r0 = r2 + -1
            if (r0 < 0) goto L_0x0092
            X.3v3 r0 = r5.A0G
            if (r0 != 0) goto L_0x008f
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x008f:
            r0.getCount()
        L_0x0092:
            r1 = 1
            return r1
        L_0x0094:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager.A08(float):boolean");
    }

    public static final boolean A0A(ReboundViewPager reboundViewPager, int i) {
        if (reboundViewPager.A0R) {
            return true;
        }
        if (i < 0) {
            return false;
        }
        C255993v3 r0 = reboundViewPager.A0G;
        if (r0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        } else if (i < r0.getCount()) {
            return true;
        } else {
            return false;
        }
    }

    public static /* synthetic */ void setExtraBufferSize$default(ReboundViewPager reboundViewPager, int i, boolean z, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z = false;
            }
            reboundViewPager.A0M(i, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setExtraBufferSize");
    }

    public final float A0C(float f, int i) {
        float f2 = this.A01;
        float f3 = f2 % 1.0f;
        if (f3 < 0.0f) {
            f3 += 1.0f;
        }
        float f4 = -f3;
        if (f3 == 0.0f) {
            f4 = -1.0f;
        }
        float f5 = (f2 + f4) - ((float) (i - 1));
        A05(this, (double) f, f5, true);
        return f5;
    }

    public final View A0D(int i) {
        Map map = this.A1B;
        for (AnonymousClass4GW r1 : map.keySet()) {
            if (r1 != null && r1.A00 == i) {
                return (View) map.get(r1);
            }
        }
        return null;
    }

    public final void A0E() {
        C255993v3 r1 = this.A0G;
        if (r1 != null) {
            r1.FJ4(this.A15);
        }
    }

    public final void A0F() {
        this.A0x.clear();
        this.A0z.clear();
        this.A0y.clear();
    }

    public final void A0G(float f) {
        A05(this, 0.0d, f, false);
    }

    public final void A0I(float f) {
        float pageSize;
        boolean z;
        int i;
        int i2;
        float A0B2;
        float f2 = f;
        int ordinal = this.A0N.ordinal();
        if (ordinal == 1) {
            float pageSize2 = (float) (this.A0B / getPageSize());
            boolean z2 = this.A0o;
            int i3 = this.A0j;
            if (z2) {
                pageSize = ((float) i3) / ((float) getPageSize());
            } else {
                pageSize = (float) (i3 / getPageSize());
            }
            boolean z3 = false;
            if (A08((-f2) / ((float) getPageSize())) && Math.abs(f2) > pageSize) {
                z3 = true;
            }
            if ((!this.A0q || this.A0M != AnonymousClass3TI.HORIZONTAL) && (!this.A0r || this.A0M != AnonymousClass3TI.VERTICAL)) {
                z = false;
            } else {
                z = true;
            }
            if (z3 && z) {
                if (f > pageSize) {
                    if (f > pageSize2) {
                        f2 = pageSize2;
                    }
                    A0B2 = A0C(f2, 1);
                } else if (f < (-pageSize)) {
                    float f3 = -pageSize2;
                    if (f < f3) {
                        f2 = f3;
                    }
                    A0B2 = A0B(f2);
                } else {
                    return;
                }
                i = this.A0k;
                i2 = (int) A0B2;
            } else if (((2cs) this.A10.getValue()).A0C()) {
                A0L(this.A07, 0.0f);
                i = this.A0k;
                i2 = this.A07;
                if (i == i2) {
                    return;
                }
            } else {
                return;
            }
        } else if (ordinal == 2) {
            Scroller scroller = this.A14;
            scroller.fling(Math.round(this.A01 * ((float) getPageSize())), 0, Math.round((-f2) * ((float) getPageSize())), 0, -2147483647, Integer.MAX_VALUE, 0, 0);
            i2 = Math.round(((float) scroller.getFinalX()) / ((float) getPageSize()));
            A03((C71392co) this.A0v.get(AnonymousClass3TE.A04), (double) f2, (float) i2, true);
            i = this.A0k;
        } else {
            return;
        }
        for (C252293os Dpz : this.A0x) {
            Dpz.Dpz(i, i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0289, code lost:
        if (r15 < r19) goto L_0x0293;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0291, code lost:
        if (r21 < r19) goto L_0x0293;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:?, code lost:
        r1 = new java.lang.IllegalArgumentException("Required value was null.");
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01d9 A[Catch:{ all -> 0x04fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0213 A[Catch:{ all -> 0x04fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x022c A[Catch:{ all -> 0x04fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0254 A[Catch:{ all -> 0x04fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02ac A[Catch:{ all -> 0x04fe }, LOOP:1: B:132:0x0242->B:162:0x02ac, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02c9 A[Catch:{ all -> 0x04fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0350 A[Catch:{ all -> 0x04fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x03c4 A[Catch:{ all -> 0x04fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0400 A[Catch:{ all -> 0x04fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0407 A[Catch:{ all -> 0x04fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x040f A[Catch:{ all -> 0x04fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0416 A[Catch:{ all -> 0x04fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x041f A[Catch:{ all -> 0x04fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x044c A[Catch:{ all -> 0x04fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x04df A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x01c6 A[EDGE_INSN: B:304:0x01c6->B:102:0x01c6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x02ad A[EDGE_INSN: B:309:0x02ad->B:163:0x02ad ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:332:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c8 A[Catch:{ all -> 0x04fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cd A[Catch:{ all -> 0x04fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f5 A[Catch:{ all -> 0x04fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0120 A[Catch:{ all -> 0x04fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0188 A[Catch:{ all -> 0x04fe }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0J(float r26, boolean r27, boolean r28) {
        /*
            r25 = this;
            r8 = r25
            X.3v3 r0 = r8.A0G
            r24 = r0
            if (r0 == 0) goto L_0x0016
            float r0 = r8.A01
            r7 = 0
            r6 = 1
            r23 = 3
            r1 = r26
            int r0 = (r26 > r0 ? 1 : (r26 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0017
            if (r28 == 0) goto L_0x0017
        L_0x0016:
            return
        L_0x0017:
            boolean r0 = X.AnonymousClass4GU.A00(r1)
            if (r0 != 0) goto L_0x0024
            X.0qi r0 = X.C62000qj.A02
            boolean r0 = r0.A0R
            if (r0 == 0) goto L_0x0024
            return
        L_0x0024:
            r16 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x0034
            r2 = -1267072475(0xffffffffb47a0225, float:-2.3283845E-7)
            java.lang.String r0 = "ReboundViewPager.setCurrentOffsetInternal"
            X.0fS.A01(r0, r2)
        L_0x0034:
            float r5 = r8.A01     // Catch:{ all -> 0x04fe }
            r8.A01 = r1     // Catch:{ all -> 0x04fe }
            int r10 = r8.getPageSize()     // Catch:{ all -> 0x04fe }
            float r11 = r8.A01     // Catch:{ all -> 0x04fe }
            int r2 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            r0 = 0
            if (r2 != 0) goto L_0x0044
            r0 = 1
        L_0x0044:
            java.lang.String r9 = " pageSize:"
            java.lang.String r4 = " newPageOffset:"
            java.lang.String r3 = "priorPageOffset:"
            if (r0 != 0) goto L_0x0077
            boolean r0 = X.AnonymousClass4GU.A00(r11)     // Catch:{ all -> 0x04fe }
            if (r0 != 0) goto L_0x0077
            X.0wb r12 = X.0wb.A01     // Catch:{ all -> 0x04fe }
            java.lang.String r11 = "ReboundViewPager#setCurrentOffsetInternal-infinite"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x04fe }
            r0.<init>()     // Catch:{ all -> 0x04fe }
            r0.append(r3)     // Catch:{ all -> 0x04fe }
            r0.append(r5)     // Catch:{ all -> 0x04fe }
            r0.append(r4)     // Catch:{ all -> 0x04fe }
            r0.append(r1)     // Catch:{ all -> 0x04fe }
            r0.append(r9)     // Catch:{ all -> 0x04fe }
            r0.append(r10)     // Catch:{ all -> 0x04fe }
            java.lang.String r2 = r0.toString()     // Catch:{ all -> 0x04fe }
            java.lang.Throwable r0 = new java.lang.Throwable     // Catch:{ all -> 0x04fe }
            r0.<init>()     // Catch:{ all -> 0x04fe }
            goto L_0x00b2
        L_0x0077:
            float r0 = r11 - r5
            float r2 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x04fe }
            r0 = 1148846080(0x447a0000, float:1000.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b5
            float r2 = java.lang.Math.abs(r11)     // Catch:{ all -> 0x04fe }
            r0 = 1232348160(0x49742400, float:1000000.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b5
            X.0wb r12 = X.0wb.A01     // Catch:{ all -> 0x04fe }
            java.lang.String r11 = "ReboundViewPager#setCurrentOffsetInternal-large"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x04fe }
            r0.<init>()     // Catch:{ all -> 0x04fe }
            r0.append(r3)     // Catch:{ all -> 0x04fe }
            r0.append(r5)     // Catch:{ all -> 0x04fe }
            r0.append(r4)     // Catch:{ all -> 0x04fe }
            r0.append(r1)     // Catch:{ all -> 0x04fe }
            r0.append(r9)     // Catch:{ all -> 0x04fe }
            r0.append(r10)     // Catch:{ all -> 0x04fe }
            java.lang.String r2 = r0.toString()     // Catch:{ all -> 0x04fe }
            java.lang.Throwable r0 = new java.lang.Throwable     // Catch:{ all -> 0x04fe }
            r0.<init>()     // Catch:{ all -> 0x04fe }
        L_0x00b2:
            r12.Ew6(r11, r2, r6, r0)     // Catch:{ all -> 0x04fe }
        L_0x00b5:
            r2 = 0
            int r0 = (r26 > r2 ? 1 : (r26 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x00c4
            int r0 = r24.getCount()     // Catch:{ all -> 0x04fe }
            int r0 = r0 - r6
            float r0 = (float) r0     // Catch:{ all -> 0x04fe }
            int r0 = (r26 > r0 ? 1 : (r26 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00cd
        L_0x00c4:
            boolean r0 = r8.A0R     // Catch:{ all -> 0x04fe }
            if (r0 != 0) goto L_0x00cd
            int r0 = (r26 > r2 ? 1 : (r26 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00dc
            goto L_0x00eb
        L_0x00cd:
            X.3v1 r0 = r8.A0J     // Catch:{ all -> 0x04fe }
            int r0 = r0.AVk(r8, r1)     // Catch:{ all -> 0x04fe }
            r8.A09 = r0     // Catch:{ all -> 0x04fe }
            X.3v1 r0 = r8.A0J     // Catch:{ all -> 0x04fe }
            int r0 = r0.CfQ(r8, r1)     // Catch:{ all -> 0x04fe }
            goto L_0x00e8
        L_0x00dc:
            int r0 = r24.getCount()     // Catch:{ all -> 0x04fe }
            int r0 = r0 - r6
            r8.A09 = r0     // Catch:{ all -> 0x04fe }
            int r0 = r24.getCount()     // Catch:{ all -> 0x04fe }
            int r0 = r0 - r6
        L_0x00e8:
            r8.A0A = r0     // Catch:{ all -> 0x04fe }
            goto L_0x00ef
        L_0x00eb:
            r8.A09 = r7     // Catch:{ all -> 0x04fe }
            r8.A0A = r7     // Catch:{ all -> 0x04fe }
        L_0x00ef:
            X.3TH r3 = r8.A0H     // Catch:{ all -> 0x04fe }
            X.3TH r9 = X.AnonymousClass3TH.BIAS_FORWARD     // Catch:{ all -> 0x04fe }
            if (r3 != r9) goto L_0x0177
            float r2 = r8.A01     // Catch:{ all -> 0x04fe }
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0164
            boolean r0 = r8.A0X     // Catch:{ all -> 0x04fe }
            if (r0 == 0) goto L_0x0154
            float r0 = r8.A05     // Catch:{ all -> 0x04fe }
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0154
            r8.A0X = r7     // Catch:{ all -> 0x04fe }
            r8.A0W = r6     // Catch:{ all -> 0x04fe }
        L_0x0109:
            boolean r0 = r8.A0X     // Catch:{ all -> 0x04fe }
            if (r0 == 0) goto L_0x0149
            float[] r4 = r8.A11     // Catch:{ all -> 0x04fe }
            r4[r7] = r2     // Catch:{ all -> 0x04fe }
            float r2 = r8.A05     // Catch:{ all -> 0x04fe }
        L_0x0113:
            int r0 = r8.A06     // Catch:{ all -> 0x04fe }
            float r0 = (float) r0     // Catch:{ all -> 0x04fe }
            float r2 = r2 + r0
        L_0x0117:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 + r0
            r4[r6] = r2     // Catch:{ all -> 0x04fe }
            X.3TH r0 = X.AnonymousClass3TH.BIAS_ADAPTIVE     // Catch:{ all -> 0x04fe }
            if (r3 != r0) goto L_0x0133
            r3 = r4[r7]     // Catch:{ all -> 0x04fe }
            double r0 = (double) r3     // Catch:{ all -> 0x04fe }
            double r10 = java.lang.Math.ceil(r0)     // Catch:{ all -> 0x04fe }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0133
            float[] r1 = r8.A12     // Catch:{ all -> 0x04fe }
            r1[r7] = r3     // Catch:{ all -> 0x04fe }
            r0 = r4[r6]     // Catch:{ all -> 0x04fe }
            r1[r6] = r0     // Catch:{ all -> 0x04fe }
        L_0x0133:
            X.3v3 r0 = r8.A0G     // Catch:{ all -> 0x04fe }
            r10 = 0
            if (r0 == 0) goto L_0x01c6
            int r0 = r0.getCount()     // Catch:{ all -> 0x04fe }
            if (r0 == 0) goto L_0x01c6
            X.3TH r0 = r8.A0H     // Catch:{ all -> 0x04fe }
            int r1 = r0.ordinal()     // Catch:{ all -> 0x04fe }
            r0 = r23
            if (r1 == r0) goto L_0x01b9
            goto L_0x0184
        L_0x0149:
            boolean r0 = r8.A0W     // Catch:{ all -> 0x04fe }
            if (r0 == 0) goto L_0x0177
            float[] r4 = r8.A11     // Catch:{ all -> 0x04fe }
            float r0 = r8.A05     // Catch:{ all -> 0x04fe }
            r4[r7] = r0     // Catch:{ all -> 0x04fe }
            goto L_0x0113
        L_0x0154:
            boolean r0 = r8.A0W     // Catch:{ all -> 0x04fe }
            if (r0 == 0) goto L_0x0109
            float r1 = r8.A05     // Catch:{ all -> 0x04fe }
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0109
            r8.A0W = r7     // Catch:{ all -> 0x04fe }
            goto L_0x0109
        L_0x0164:
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0109
            boolean r0 = r8.A0W     // Catch:{ all -> 0x04fe }
            if (r0 == 0) goto L_0x0109
            float r0 = r8.A05     // Catch:{ all -> 0x04fe }
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0109
            r8.A0W = r7     // Catch:{ all -> 0x04fe }
            r8.A0X = r6     // Catch:{ all -> 0x04fe }
            goto L_0x0109
        L_0x0177:
            float[] r4 = r8.A11     // Catch:{ all -> 0x04fe }
            float r2 = r8.A01     // Catch:{ all -> 0x04fe }
            int r0 = r8.A06     // Catch:{ all -> 0x04fe }
            float r1 = (float) r0     // Catch:{ all -> 0x04fe }
            float r0 = r2 - r1
            r4[r7] = r0     // Catch:{ all -> 0x04fe }
            float r2 = r2 + r1
            goto L_0x0117
        L_0x0184:
            if (r1 == r7) goto L_0x01b9
            if (r1 == r6) goto L_0x0213
            r0 = 2
            if (r1 == r0) goto L_0x01aa
            r0 = 4
            if (r1 != r0) goto L_0x04f6
            float[] r2 = r8.A12     // Catch:{ all -> 0x04fe }
            r1 = r2[r6]     // Catch:{ all -> 0x04fe }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01b9
            r11 = r4[r7]     // Catch:{ all -> 0x04fe }
            r0 = r2[r7]     // Catch:{ all -> 0x04fe }
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            double r0 = (double) r11     // Catch:{ all -> 0x04fe }
            if (r2 >= 0) goto L_0x01a5
            double r0 = java.lang.Math.ceil(r0)     // Catch:{ all -> 0x04fe }
            goto L_0x01c0
        L_0x01a5:
            double r0 = java.lang.Math.floor(r0)     // Catch:{ all -> 0x04fe }
            goto L_0x01c0
        L_0x01aa:
            r11 = r4[r7]     // Catch:{ all -> 0x04fe }
            double r2 = (double) r11     // Catch:{ all -> 0x04fe }
            double r0 = java.lang.Math.ceil(r2)     // Catch:{ all -> 0x04fe }
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x01c0
            int r2 = (int) r0     // Catch:{ all -> 0x04fe }
            int r12 = r2 + 1
            goto L_0x0219
        L_0x01b9:
            r11 = r4[r7]     // Catch:{ all -> 0x04fe }
            double r0 = (double) r11     // Catch:{ all -> 0x04fe }
            double r0 = java.lang.Math.floor(r0)     // Catch:{ all -> 0x04fe }
        L_0x01c0:
            int r12 = (int) r0     // Catch:{ all -> 0x04fe }
            goto L_0x0219
        L_0x01c2:
            X.3TH r0 = r8.A0H     // Catch:{ all -> 0x04fe }
            if (r0 != r9) goto L_0x01f3
        L_0x01c6:
            java.util.List r10 = r8.A1A     // Catch:{ all -> 0x04fe }
            r10.clear()     // Catch:{ all -> 0x04fe }
            java.util.List r3 = r8.A17     // Catch:{ all -> 0x04fe }
            r3.clear()     // Catch:{ all -> 0x04fe }
            java.util.List r2 = r8.A19     // Catch:{ all -> 0x04fe }
            r2.clear()     // Catch:{ all -> 0x04fe }
            int r11 = r8.A0E     // Catch:{ all -> 0x04fe }
            if (r11 <= 0) goto L_0x02ad
            X.3TH r0 = r8.A0H     // Catch:{ all -> 0x04fe }
            if (r0 != r9) goto L_0x0234
            float r9 = r8.A01     // Catch:{ all -> 0x04fe }
            double r0 = (double) r9     // Catch:{ all -> 0x04fe }
            double r0 = java.lang.Math.floor(r0)     // Catch:{ all -> 0x04fe }
            int r12 = (int) r0     // Catch:{ all -> 0x04fe }
            float r0 = (float) r12     // Catch:{ all -> 0x04fe }
            float r9 = r9 - r0
            boolean r0 = r8.A0X     // Catch:{ all -> 0x04fe }
            if (r0 != 0) goto L_0x0232
            boolean r0 = r8.A0W     // Catch:{ all -> 0x04fe }
            if (r0 != 0) goto L_0x0232
            float r14 = -r9
            int r0 = r8.A06     // Catch:{ all -> 0x04fe }
            goto L_0x023f
        L_0x01f3:
            r0 = r4[r6]     // Catch:{ all -> 0x04fe }
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x01c6
            int[] r0 = r8.A0c     // Catch:{ all -> 0x04fe }
            r0[r10] = r12     // Catch:{ all -> 0x04fe }
            X.3v3 r0 = r8.A0G     // Catch:{ all -> 0x04fe }
            if (r0 == 0) goto L_0x0230
            int r1 = r0.getCount()     // Catch:{ all -> 0x04fe }
        L_0x0205:
            int r0 = r12 % r1
            if (r0 >= 0) goto L_0x020a
            int r0 = r0 + r1
        L_0x020a:
            r3[r10] = r0     // Catch:{ all -> 0x04fe }
            int r10 = r10 + 1
            r8.A0E = r10     // Catch:{ all -> 0x04fe }
            int r12 = r12 + 1
            goto L_0x0227
        L_0x0213:
            r11 = r4[r7]     // Catch:{ all -> 0x04fe }
            int r12 = java.lang.Math.round(r11)     // Catch:{ all -> 0x04fe }
        L_0x0219:
            r0 = r4[r6]     // Catch:{ all -> 0x04fe }
            double r0 = (double) r0     // Catch:{ all -> 0x04fe }
            double r0 = java.lang.Math.ceil(r0)     // Catch:{ all -> 0x04fe }
            double r2 = (double) r11     // Catch:{ all -> 0x04fe }
            double r2 = java.lang.Math.floor(r2)     // Catch:{ all -> 0x04fe }
            double r0 = r0 - r2
            int r2 = (int) r0     // Catch:{ all -> 0x04fe }
        L_0x0227:
            int[] r3 = r8.A0d     // Catch:{ all -> 0x04fe }
            int r0 = r3.length     // Catch:{ all -> 0x04fe }
            if (r10 >= r0) goto L_0x01c6
            float r1 = (float) r12     // Catch:{ all -> 0x04fe }
            if (r10 != r2) goto L_0x01f3
            goto L_0x01c2
        L_0x0230:
            r1 = 0
            goto L_0x0205
        L_0x0232:
            float r14 = -r9
            goto L_0x0241
        L_0x0234:
            int[] r0 = r8.A0c     // Catch:{ all -> 0x04fe }
            r0 = r0[r7]     // Catch:{ all -> 0x04fe }
            float r1 = (float) r0     // Catch:{ all -> 0x04fe }
            r0 = r4[r7]     // Catch:{ all -> 0x04fe }
            float r0 = r0 - r1
            float r14 = -r0
            int r0 = r8.A06     // Catch:{ all -> 0x04fe }
        L_0x023f:
            float r0 = (float) r0     // Catch:{ all -> 0x04fe }
            float r14 = r14 - r0
        L_0x0241:
            r13 = 0
        L_0x0242:
            int[] r0 = r8.A0d     // Catch:{ all -> 0x04fe }
            r22 = r0[r13]     // Catch:{ all -> 0x04fe }
            int[] r0 = r8.A0c     // Catch:{ all -> 0x04fe }
            r12 = r0[r13]     // Catch:{ all -> 0x04fe }
            float r9 = (float) r13     // Catch:{ all -> 0x04fe }
            float r9 = r9 + r14
            int r1 = r24.getCount()     // Catch:{ all -> 0x04fe }
            r0 = r22
            if (r0 >= r1) goto L_0x02a8
            boolean r0 = r8.A0R     // Catch:{ all -> 0x04fe }
            if (r0 != 0) goto L_0x0265
            if (r12 < 0) goto L_0x02a8
            X.3v3 r0 = r8.A0G     // Catch:{ all -> 0x04fe }
            if (r0 == 0) goto L_0x04e6
            int r0 = r0.getCount()     // Catch:{ all -> 0x04fe }
            if (r12 < r0) goto L_0x0265
            goto L_0x02a8
        L_0x0265:
            float r15 = (float) r12     // Catch:{ all -> 0x04fe }
            r21 = 1065353216(0x3f800000, float:1.0)
            float r21 = r21 + r15
            r20 = r4[r7]     // Catch:{ all -> 0x04fe }
            r19 = r4[r6]     // Catch:{ all -> 0x04fe }
            X.3TH r1 = r8.A0H     // Catch:{ all -> 0x04fe }
            X.3TH r0 = X.AnonymousClass3TH.BIAS_END     // Catch:{ all -> 0x04fe }
            int r18 = (r20 > r15 ? 1 : (r20 == r15 ? 0 : -1))
            if (r1 != r0) goto L_0x0285
            if (r18 > 0) goto L_0x027c
            int r0 = (r15 > r19 ? 1 : (r15 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x0293
        L_0x027c:
            int r0 = (r20 > r21 ? 1 : (r20 == r21 ? 0 : -1))
            if (r0 > 0) goto L_0x02a8
            int r0 = (r21 > r19 ? 1 : (r21 == r19 ? 0 : -1))
            if (r0 > 0) goto L_0x02a8
            goto L_0x0293
        L_0x0285:
            if (r18 > 0) goto L_0x028b
            int r0 = (r15 > r19 ? 1 : (r15 == r19 ? 0 : -1))
            if (r0 < 0) goto L_0x0293
        L_0x028b:
            int r0 = (r20 > r21 ? 1 : (r20 == r21 ? 0 : -1))
            if (r0 > 0) goto L_0x02a8
            int r0 = (r21 > r19 ? 1 : (r21 == r19 ? 0 : -1))
            if (r0 >= 0) goto L_0x02a8
        L_0x0293:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)     // Catch:{ all -> 0x04fe }
            r10.add(r0)     // Catch:{ all -> 0x04fe }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x04fe }
            r3.add(r0)     // Catch:{ all -> 0x04fe }
            java.lang.Float r0 = java.lang.Float.valueOf(r9)     // Catch:{ all -> 0x04fe }
            r2.add(r0)     // Catch:{ all -> 0x04fe }
        L_0x02a8:
            int r13 = r13 + 1
            if (r13 >= r11) goto L_0x02ad
            goto L_0x0242
        L_0x02ad:
            int r9 = r8.A08     // Catch:{ all -> 0x04fe }
            float r11 = r8.A01     // Catch:{ all -> 0x04fe }
            double r0 = (double) r11     // Catch:{ all -> 0x04fe }
            double r0 = java.lang.Math.floor(r0)     // Catch:{ all -> 0x04fe }
            int r12 = (int) r0     // Catch:{ all -> 0x04fe }
            float r0 = (float) r12     // Catch:{ all -> 0x04fe }
            float r11 = r11 - r0
            float r12 = java.lang.Math.abs(r11)     // Catch:{ all -> 0x04fe }
            X.3TH r0 = r8.A0H     // Catch:{ all -> 0x04fe }
            int r1 = r0.ordinal()     // Catch:{ all -> 0x04fe }
            r11 = 1056964608(0x3f000000, float:0.5)
            r0 = r23
            if (r1 == r0) goto L_0x0350
            if (r1 == r7) goto L_0x0334
            if (r1 == r6) goto L_0x0329
            r0 = 2
            if (r1 == r0) goto L_0x030c
            r0 = 4
            if (r1 != r0) goto L_0x04ee
            r1 = r4[r7]     // Catch:{ all -> 0x04fe }
            float[] r0 = r8.A12     // Catch:{ all -> 0x04fe }
            r0 = r0[r7]     // Catch:{ all -> 0x04fe }
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x02ef
            int r0 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x02e3
            goto L_0x0374
        L_0x02e3:
            int[] r0 = r8.A0d     // Catch:{ all -> 0x04fe }
            int r4 = r8.A06     // Catch:{ all -> 0x04fe }
            r1 = r0[r4]     // Catch:{ all -> 0x04fe }
            int[] r0 = r8.A0c     // Catch:{ all -> 0x04fe }
            r4 = r0[r4]     // Catch:{ all -> 0x04fe }
            goto L_0x0381
        L_0x02ef:
            int r0 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0301
            int[] r1 = r8.A0d     // Catch:{ all -> 0x04fe }
            int r0 = r8.A06     // Catch:{ all -> 0x04fe }
            int r4 = r0 + 1
            r1 = r1[r4]     // Catch:{ all -> 0x04fe }
            int[] r0 = r8.A0c     // Catch:{ all -> 0x04fe }
            r4 = r0[r4]     // Catch:{ all -> 0x04fe }
            goto L_0x0381
        L_0x0301:
            int[] r0 = r8.A0d     // Catch:{ all -> 0x04fe }
            int r4 = r8.A06     // Catch:{ all -> 0x04fe }
            r1 = r0[r4]     // Catch:{ all -> 0x04fe }
            int[] r0 = r8.A0c     // Catch:{ all -> 0x04fe }
            r4 = r0[r4]     // Catch:{ all -> 0x04fe }
            goto L_0x0381
        L_0x030c:
            int r0 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x031e
            int[] r1 = r8.A0d     // Catch:{ all -> 0x04fe }
            int r4 = r8.A06     // Catch:{ all -> 0x04fe }
            int r0 = r4 + -1
            r1 = r1[r0]     // Catch:{ all -> 0x04fe }
            int[] r0 = r8.A0c     // Catch:{ all -> 0x04fe }
            int r4 = r4 - r6
            r4 = r0[r4]     // Catch:{ all -> 0x04fe }
            goto L_0x0381
        L_0x031e:
            int[] r0 = r8.A0d     // Catch:{ all -> 0x04fe }
            int r4 = r8.A06     // Catch:{ all -> 0x04fe }
            r1 = r0[r4]     // Catch:{ all -> 0x04fe }
            int[] r0 = r8.A0c     // Catch:{ all -> 0x04fe }
            r4 = r0[r4]     // Catch:{ all -> 0x04fe }
            goto L_0x0381
        L_0x0329:
            int[] r0 = r8.A0d     // Catch:{ all -> 0x04fe }
            int r4 = r8.A06     // Catch:{ all -> 0x04fe }
            r1 = r0[r4]     // Catch:{ all -> 0x04fe }
            int[] r0 = r8.A0c     // Catch:{ all -> 0x04fe }
            r4 = r0[r4]     // Catch:{ all -> 0x04fe }
            goto L_0x0381
        L_0x0334:
            int r0 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0345
            int[] r1 = r8.A0d     // Catch:{ all -> 0x04fe }
            int r0 = r8.A06     // Catch:{ all -> 0x04fe }
            int r4 = r0 + 1
            r1 = r1[r4]     // Catch:{ all -> 0x04fe }
            int[] r0 = r8.A0c     // Catch:{ all -> 0x04fe }
            r4 = r0[r4]     // Catch:{ all -> 0x04fe }
            goto L_0x0381
        L_0x0345:
            int[] r0 = r8.A0d     // Catch:{ all -> 0x04fe }
            int r4 = r8.A06     // Catch:{ all -> 0x04fe }
            r1 = r0[r4]     // Catch:{ all -> 0x04fe }
            int[] r0 = r8.A0c     // Catch:{ all -> 0x04fe }
            r4 = r0[r4]     // Catch:{ all -> 0x04fe }
            goto L_0x0381
        L_0x0350:
            boolean r0 = r8.A0X     // Catch:{ all -> 0x04fe }
            if (r0 != 0) goto L_0x035b
            boolean r0 = r8.A0W     // Catch:{ all -> 0x04fe }
            if (r0 != 0) goto L_0x035b
            int r4 = r8.A06     // Catch:{ all -> 0x04fe }
            goto L_0x035c
        L_0x035b:
            r4 = 0
        L_0x035c:
            int r0 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x036b
            int[] r0 = r8.A0d     // Catch:{ all -> 0x04fe }
            int r4 = r4 + 1
            r1 = r0[r4]     // Catch:{ all -> 0x04fe }
            int[] r0 = r8.A0c     // Catch:{ all -> 0x04fe }
            r4 = r0[r4]     // Catch:{ all -> 0x04fe }
            goto L_0x0381
        L_0x036b:
            int[] r0 = r8.A0d     // Catch:{ all -> 0x04fe }
            r1 = r0[r4]     // Catch:{ all -> 0x04fe }
            int[] r0 = r8.A0c     // Catch:{ all -> 0x04fe }
            r4 = r0[r4]     // Catch:{ all -> 0x04fe }
            goto L_0x0381
        L_0x0374:
            int[] r1 = r8.A0d     // Catch:{ all -> 0x04fe }
            int r4 = r8.A06     // Catch:{ all -> 0x04fe }
            int r0 = r4 + -1
            r1 = r1[r0]     // Catch:{ all -> 0x04fe }
            int[] r0 = r8.A0c     // Catch:{ all -> 0x04fe }
            int r4 = r4 - r6
            r4 = r0[r4]     // Catch:{ all -> 0x04fe }
        L_0x0381:
            int r0 = r8.A07     // Catch:{ all -> 0x04fe }
            if (r4 == r0) goto L_0x038e
            int r0 = r24.getCount()     // Catch:{ all -> 0x04fe }
            if (r4 >= r0) goto L_0x038e
            r0 = -1
            if (r4 > r0) goto L_0x0396
        L_0x038e:
            boolean r0 = r8.A0R     // Catch:{ all -> 0x04fe }
            if (r0 == 0) goto L_0x0397
            int r0 = r8.A08     // Catch:{ all -> 0x04fe }
            if (r1 == r0) goto L_0x0397
        L_0x0396:
            r7 = 1
        L_0x0397:
            java.util.List r0 = r8.A16     // Catch:{ all -> 0x04fe }
            boolean r13 = r0.isEmpty()     // Catch:{ all -> 0x04fe }
            r8.A07 = r4     // Catch:{ all -> 0x04fe }
            r8.A08 = r1     // Catch:{ all -> 0x04fe }
            r0 = r27
            r8.A07(r10, r3, r2, r0)     // Catch:{ all -> 0x04fe }
            float r1 = r8.A01     // Catch:{ all -> 0x04fe }
            java.util.Set r6 = r8.A0z     // Catch:{ all -> 0x04fe }
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x04fe }
            if (r0 == 0) goto L_0x03e1
            java.util.Set r0 = r8.A0y     // Catch:{ all -> 0x04fe }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x04fe }
            if (r0 == 0) goto L_0x03e1
        L_0x03b8:
            java.util.Set r0 = r8.A0x     // Catch:{ all -> 0x04fe }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x04fe }
        L_0x03be:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x04fe }
            if (r0 == 0) goto L_0x04d9
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x04fe }
            X.3os r2 = (X.C252293os) r2     // Catch:{ all -> 0x04fe }
            if (r7 != 0) goto L_0x03d4
            if (r13 == 0) goto L_0x03d9
            boolean r0 = r2.CsC()     // Catch:{ all -> 0x04fe }
            if (r0 == 0) goto L_0x03d9
        L_0x03d4:
            int r0 = r8.A08     // Catch:{ all -> 0x04fe }
            r2.DVx(r0, r9)     // Catch:{ all -> 0x04fe }
        L_0x03d9:
            float r1 = r8.A01     // Catch:{ all -> 0x04fe }
            X.3TF r0 = r8.A0O     // Catch:{ all -> 0x04fe }
            r2.DhK(r0, r1, r5)     // Catch:{ all -> 0x04fe }
            goto L_0x03be
        L_0x03e1:
            X.3v1 r0 = r8.A0J     // Catch:{ all -> 0x04fe }
            int r4 = r0.AVk(r8, r5)     // Catch:{ all -> 0x04fe }
            X.3v1 r0 = r8.A0J     // Catch:{ all -> 0x04fe }
            int r10 = r0.CfQ(r8, r5)     // Catch:{ all -> 0x04fe }
            X.3v1 r0 = r8.A0J     // Catch:{ all -> 0x04fe }
            int r3 = r0.AVk(r8, r1)     // Catch:{ all -> 0x04fe }
            X.3v1 r0 = r8.A0J     // Catch:{ all -> 0x04fe }
            int r1 = r0.CfQ(r8, r1)     // Catch:{ all -> 0x04fe }
            boolean r0 = r8.A0S()     // Catch:{ all -> 0x04fe }
            r2 = r4
            if (r0 == 0) goto L_0x0401
            r2 = r10
        L_0x0401:
            boolean r0 = r8.A0S()     // Catch:{ all -> 0x04fe }
            if (r0 != 0) goto L_0x0408
            r4 = r10
        L_0x0408:
            boolean r0 = r8.A0S()     // Catch:{ all -> 0x04fe }
            r11 = r3
            if (r0 == 0) goto L_0x0410
            r11 = r1
        L_0x0410:
            boolean r0 = r8.A0S()     // Catch:{ all -> 0x04fe }
            if (r0 != 0) goto L_0x0417
            r3 = r1
        L_0x0417:
            java.util.Set r1 = r8.A0y     // Catch:{ all -> 0x04fe }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x04fe }
            if (r0 != 0) goto L_0x0446
            java.util.Iterator r12 = r1.iterator()     // Catch:{ all -> 0x04fe }
        L_0x0423:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x04fe }
            if (r0 == 0) goto L_0x0446
            java.lang.Object r10 = r12.next()     // Catch:{ all -> 0x04fe }
            X.3vD r10 = (X.C256093vD) r10     // Catch:{ all -> 0x04fe }
            r1 = 11
            X.9LG r0 = new X.9LG     // Catch:{ all -> 0x04fe }
            r0.<init>(r8, r1)     // Catch:{ all -> 0x04fe }
            r18 = r10
            r19 = r0
            r20 = r11
            r21 = r2
            r22 = r3
            r23 = r4
            r18.CsI(r19, r20, r21, r22, r23)     // Catch:{ all -> 0x04fe }
            goto L_0x0423
        L_0x0446:
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x04fe }
            if (r0 != 0) goto L_0x03b8
            if (r11 >= r2) goto L_0x046e
            r10 = r11
        L_0x044f:
            if (r10 >= r2) goto L_0x046e
            boolean r0 = A0A(r8, r10)     // Catch:{ all -> 0x04fe }
            if (r0 == 0) goto L_0x046b
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x04fe }
        L_0x045b:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x04fe }
            if (r0 == 0) goto L_0x046b
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x04fe }
            X.3vE r0 = (X.C256103vE) r0     // Catch:{ all -> 0x04fe }
            r0.DVz(r10)     // Catch:{ all -> 0x04fe }
            goto L_0x045b
        L_0x046b:
            int r10 = r10 + 1
            goto L_0x044f
        L_0x046e:
            if (r3 <= r4) goto L_0x0492
            r10 = r3
        L_0x0471:
            if (r10 <= r4) goto L_0x0492
            if (r10 < r11) goto L_0x0492
            boolean r0 = A0A(r8, r10)     // Catch:{ all -> 0x04fe }
            if (r0 == 0) goto L_0x048f
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x04fe }
        L_0x047f:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x04fe }
            if (r0 == 0) goto L_0x048f
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x04fe }
            X.3vE r0 = (X.C256103vE) r0     // Catch:{ all -> 0x04fe }
            r0.DVz(r10)     // Catch:{ all -> 0x04fe }
            goto L_0x047f
        L_0x048f:
            int r10 = r10 + -1
            goto L_0x0471
        L_0x0492:
            if (r2 >= r11) goto L_0x04b6
            r10 = r2
        L_0x0495:
            if (r10 >= r11) goto L_0x04b6
            if (r10 > r4) goto L_0x04b6
            boolean r0 = A0A(r8, r10)     // Catch:{ all -> 0x04fe }
            if (r0 == 0) goto L_0x04b3
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x04fe }
        L_0x04a3:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x04fe }
            if (r0 == 0) goto L_0x04b3
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x04fe }
            X.3vE r0 = (X.C256103vE) r0     // Catch:{ all -> 0x04fe }
            r0.DW0(r10)     // Catch:{ all -> 0x04fe }
            goto L_0x04a3
        L_0x04b3:
            int r10 = r10 + 1
            goto L_0x0495
        L_0x04b6:
            if (r3 >= r4) goto L_0x03b8
        L_0x04b8:
            if (r4 <= r3) goto L_0x03b8
            if (r4 < r2) goto L_0x03b8
            boolean r0 = A0A(r8, r4)     // Catch:{ all -> 0x04fe }
            if (r0 == 0) goto L_0x04d6
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x04fe }
        L_0x04c6:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x04fe }
            if (r0 == 0) goto L_0x04d6
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x04fe }
            X.3vE r0 = (X.C256103vE) r0     // Catch:{ all -> 0x04fe }
            r0.DW0(r4)     // Catch:{ all -> 0x04fe }
            goto L_0x04c6
        L_0x04d6:
            int r4 = r4 + -1
            goto L_0x04b8
        L_0x04d9:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x0016
            r0 = 904846041(0x35eedad9, float:1.7796075E-6)
            X.0fS.A00(r0)
            return
        L_0x04e6:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x04fe }
            r1.<init>(r0)     // Catch:{ all -> 0x04fe }
            goto L_0x04fd
        L_0x04ee:
            java.lang.String r0 = "Invalid BufferBias"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x04fe }
            r1.<init>(r0)     // Catch:{ all -> 0x04fe }
            goto L_0x04fd
        L_0x04f6:
            java.lang.String r0 = "Invalid BufferBias"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x04fe }
            r1.<init>(r0)     // Catch:{ all -> 0x04fe }
        L_0x04fd:
            throw r1     // Catch:{ all -> 0x04fe }
        L_0x04fe:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x050b
            r0 = 562872743(0x218cc1a7, float:9.538028E-19)
            X.0fS.A00(r0)
        L_0x050b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager.A0J(float, boolean, boolean):void");
    }

    public final void A0M(int i, boolean z) {
        this.A06 = i;
        int max = Math.max(1, i * 2) + 1;
        this.A0d = new int[max];
        this.A0c = new int[max];
        A06(this, z, !z);
    }

    public final void A0R(boolean z, float f) {
        AnonymousClass3TF r1;
        if (z || ((f >= getMinimumOffset() && f <= getMaximumOffset()) || (r1 = this.A0O) == AnonymousClass3TF.SETTLING || r1 == AnonymousClass3TF.DRAGGING)) {
            A0J(f, false, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        if (getResources().getConfiguration().getLayoutDirection() != 1) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0S() {
        /*
            r3 = this;
            X.3TI r1 = r3.A0M
            X.3TI r0 = X.AnonymousClass3TI.HORIZONTAL
            r2 = 1
            if (r1 != r0) goto L_0x003e
            java.lang.Boolean r1 = r3.A0m
            if (r1 != 0) goto L_0x0030
            android.content.Context r0 = r3.getContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r1 = r0.flags
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0029
            android.content.res.Resources r0 = r3.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.getLayoutDirection()
            r0 = 1
            if (r1 == r2) goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r3.A0m = r1
        L_0x0030:
            boolean r0 = r3.A0a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x003d
            r2 = 0
        L_0x003d:
            return r2
        L_0x003e:
            boolean r2 = r3.A0a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager.A0S():boolean");
    }

    public final boolean canScrollHorizontally(int i) {
        int i2 = 0;
        if (!this.A0p || this.A0M == AnonymousClass3TI.VERTICAL) {
            return false;
        }
        if (this.A0R) {
            C255993v3 r0 = this.A0G;
            if (r0 == null || r0.getCount() <= 1) {
                return false;
            }
            return true;
        }
        if (i != 0) {
            i2 = 1;
            if (i < 0) {
                i2 = -1;
            }
        }
        if (A0S()) {
            i2 = -i2;
        }
        float f = (float) i2;
        return A09(f, this.A01 + (f / ((float) getPageSize())));
    }

    public final boolean canScrollVertically(int i) {
        int i2 = 0;
        if (!this.A0t || this.A0M == AnonymousClass3TI.HORIZONTAL) {
            return false;
        }
        if (this.A0R) {
            C255993v3 r0 = this.A0G;
            if (r0 == null || r0.getCount() <= 1) {
                return false;
            }
            return true;
        }
        if (i != 0) {
            i2 = 1;
            if (i < 0) {
                i2 = -1;
            }
        }
        if (A0S()) {
            i2 = -i2;
        }
        float f = (float) i2;
        return A09(f, this.A01 + (f / ((float) getPageSize())));
    }

    public final Adapter getAdapter() {
        AnonymousClass4G7 r1;
        C255993v3 r0 = this.A0G;
        if (!(r0 instanceof AnonymousClass4G7) || (r1 = (AnonymousClass4G7) r0) == null) {
            return r0;
        }
        return r1.A00;
    }

    public final boolean getCarouselModeEnabled() {
        return this.A0R;
    }

    public final View getCurrentActiveView() {
        return this.A0F;
    }

    public final int getCurrentDataIndex() {
        C255993v3 r1 = this.A0G;
        if (r1 == null) {
            return -1;
        }
        if (this.A0R) {
            return this.A08;
        }
        double d = (double) this.A07;
        return (int) Math.min(Math.max(d, 0.0d), (double) (r1.getCount() - 1));
    }

    public final float getCurrentOffset() {
        return this.A01;
    }

    public final int getCurrentRawDataIndex() {
        return this.A07;
    }

    public final int getCurrentWrappedDataIndex() {
        return this.A08;
    }

    public final int getExtraBufferSize() {
        return this.A06;
    }

    public final int getFirstVisiblePosition() {
        return this.A09;
    }

    public final C255973v1 getItemPositioner() {
        return this.A0J;
    }

    public final int getLastVisiblePosition() {
        return this.A0A;
    }

    public final float getMaximumOffset() {
        int i;
        int max;
        if (this.A0R) {
            return Float.MAX_VALUE;
        }
        Integer num = this.A0n;
        if (num != null) {
            max = num.intValue();
        } else {
            C255993v3 r0 = this.A0G;
            if (r0 != null) {
                i = r0.getCount();
            } else {
                i = 0;
            }
            max = Math.max(i - 1, 0);
        }
        return (float) max;
    }

    public final float getMinimumOffset() {
        if (this.A0R) {
            return -3.4028235E38f;
        }
        Integer num = this.A0Q;
        if (num != null) {
            return (float) num.intValue();
        }
        return 0.0f;
    }

    public final float getOffsetFromCurrentDataIndex() {
        return this.A01 - ((float) this.A0D);
    }

    public final int getPageSize() {
        int i = this.A0C;
        if (i != -1) {
            return i;
        }
        if (this.A0M == AnonymousClass3TI.VERTICAL) {
            return getHeight();
        }
        return getWidth();
    }

    public final float getPageSpacing() {
        return this.A00;
    }

    public final boolean getReverseLayout() {
        return this.A0a;
    }

    public final AnonymousClass3TI getScrollDirection() {
        return this.A0M;
    }

    public final AnonymousClass3TG getScrollMode() {
        return this.A0N;
    }

    public final AnonymousClass3TF getScrollState() {
        return this.A0O;
    }

    public final boolean getStoriesModeEnabled() {
        return this.A0S;
    }

    public final float getTargetOffset() {
        return (float) ((2cs) this.A10.getValue()).A01;
    }

    public final boolean getUseStableIdForRecycledView() {
        return this.A0b;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AnonymousClass3TI r2 = this.A0M;
        AnonymousClass3TI r1 = AnonymousClass3TI.VERTICAL;
        boolean A0S2 = A0S();
        if (r2 == r1) {
            f = f2;
            if (A0S2) {
                f = -f2;
            }
        } else if (A0S2) {
            f = -f;
        }
        this.A0h = f / ((float) getPageSize());
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C255993v3 r0;
        if ((this.A0r && this.A0M == AnonymousClass3TI.HORIZONTAL) || (this.A0q && this.A0M == AnonymousClass3TI.VERTICAL)) {
            return false;
        }
        if (!this.A0s) {
            this.A0s = true;
            return true;
        }
        AnonymousClass3TI r3 = this.A0M;
        AnonymousClass3TI r1 = AnonymousClass3TI.VERTICAL;
        boolean A0S2 = A0S();
        if (r3 == r1) {
            f = f2;
            if (A0S2) {
                f = -f2;
            }
        } else if (A0S2) {
            f = -f;
        }
        for (C252293os Dwb : this.A0x) {
            Dwb.Dwb(this.A08, f);
        }
        float pageSize = (f * this.A04) / ((float) getPageSize());
        if (!AnonymousClass4GU.A00(pageSize) && C62000qj.A02.A0R) {
            return true;
        }
        C314096he r12 = this.A0I;
        if (A08(pageSize)) {
            A04(AnonymousClass3TF.DRAGGING, false);
            if (!this.A0R) {
                float f3 = this.A01 + pageSize;
                if (f3 < getMinimumOffset() || f3 > getMaximumOffset()) {
                    pageSize *= this.A03;
                }
            }
            A0R(false, this.A01 + pageSize);
            return true;
        } else if (r12 == null || pageSize == 0.0f) {
            return true;
        } else {
            float f4 = this.A01 + pageSize;
            if (f4 < 0.0f || (r0 = this.A0G) == null || f4 >= ((float) r0.getCount())) {
                return true;
            }
            if (!AnonymousClass4GU.A00(f4) && C62000qj.A02.A0R) {
                return true;
            }
            float f5 = this.A01 + pageSize;
            this.A0J.AVk(this, f5);
            this.A0J.CfQ(this, f5);
            if (pageSize <= 0.0f && pageSize >= 0.0f) {
                return true;
            }
            A0S();
            return true;
        }
    }

    public final void setAccessibilityDelegateCompat(C342287oL r1) {
        this.A0P = r1;
        03v.A0B(this, r1);
    }

    public final void setAdapter(Adapter adapter) {
        if (adapter != null) {
            setAdapter((C255993v3) new AnonymousClass4G7(adapter));
        }
    }

    public final void setCarouselModeEnabled(boolean z) {
        this.A0R = z;
        A06(this, false, true);
    }

    public final void setDraggingEnabled(boolean z) {
        this.A0p = z;
        this.A0t = z;
    }

    public final void setItemPositioner(C255973v1 r1) {
        if (r1 != null) {
            this.A0J = r1;
        }
    }

    public final void setOverScrollOnEdgeItems(boolean z) {
        this.A0Z = z;
        this.A0Y = z;
    }

    public final void setOvershootClampingEnabled(boolean z) {
        ((2cs) this.A10.getValue()).A06 = z;
    }

    public final void setPageSpacing(float f) {
        this.A00 = f;
        A06(this, true, false);
    }

    public final void setRestDisplacementThreshold(double d) {
        ((2cs) this.A10.getValue()).A00 = d;
    }

    public final void setRestSpeedThreshold(double d) {
        ((2cs) this.A10.getValue()).A02 = d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (X.C62000qj.A02.A0V == false) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSizeChanged(int r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            r0 = 1619856179(0x608d0b33, float:8.1306184E19)
            int r3 = X.AnonymousClass0fD.A06(r0)
            super.onSizeChanged(r5, r6, r7, r8)
            X.JNv r0 = r4.A0L
            if (r0 == 0) goto L_0x0011
            r0.DlI(r5, r6)
        L_0x0011:
            boolean r0 = r4.A0S
            if (r0 == 0) goto L_0x001c
            r0 = 1171587877(0x45d50325, float:6816.393)
        L_0x0018:
            X.AnonymousClass0fD.A0D(r0, r3)
            return
        L_0x001c:
            boolean r0 = r4.A0R
            if (r0 == 0) goto L_0x002f
            X.0qi r0 = X.C62000qj.A02
            boolean r0 = r0.A0S
            if (r0 == 0) goto L_0x002f
            r1 = 1
            r0 = 0
            A06(r4, r1, r0)
            r0 = 2060537561(0x7ad14ed9, float:5.4339463E35)
            goto L_0x0018
        L_0x002f:
            X.0qi r0 = X.C62000qj.A02
            boolean r0 = r0.A0W
            if (r0 == 0) goto L_0x0039
            r0 = 1705748079(0x65aba66f, float:1.0132435E23)
            goto L_0x0018
        L_0x0039:
            if (r7 != 0) goto L_0x0045
            if (r8 != 0) goto L_0x0045
            X.0qi r0 = X.C62000qj.A02
            boolean r2 = r0.A0V
            r1 = 0
            r0 = 1
            if (r2 != 0) goto L_0x0047
        L_0x0045:
            r1 = 1
            r0 = 0
        L_0x0047:
            A06(r4, r1, r0)
            r0 = -1746465939(0xffffffff97e70b6d, float:-1.4930909E-24)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager.onSizeChanged(int, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r1 != 3) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r0 = -1068678586(0xffffffffc04d4246, float:-3.20717)
            int r3 = X.AnonymousClass0fD.A05(r0)
            r4 = 0
            X.0qQ.A0B(r7, r4)
            X.3TG r1 = r6.A0N
            X.3TG r0 = X.AnonymousClass3TG.DISABLED
            r5 = 0
            if (r1 != r0) goto L_0x0019
            r0 = 989236866(0x3af68e82, float:0.0018810781)
            X.AnonymousClass0fD.A0C(r0, r3)
            return r4
        L_0x0019:
            boolean r0 = super.onTouchEvent(r7)
            r2 = 1
            if (r0 != 0) goto L_0x0028
            android.view.GestureDetector r0 = r6.A13
            boolean r0 = r0.onTouchEvent(r7)
            if (r0 == 0) goto L_0x0029
        L_0x0028:
            r5 = 1
        L_0x0029:
            int r1 = r7.getActionMasked()
            if (r1 == 0) goto L_0x007a
            if (r1 == r2) goto L_0x0074
            r0 = 2
            if (r1 == r0) goto L_0x003f
            r0 = 3
            if (r1 == r0) goto L_0x0074
        L_0x0037:
            r2 = r5
        L_0x0038:
            r0 = 1566743885(0x5d629d4d, float:1.02058078E18)
            X.AnonymousClass0fD.A0C(r0, r3)
            return r2
        L_0x003f:
            r6.A01(r7)
            boolean r0 = r6.A0q
            if (r0 == 0) goto L_0x004c
            X.3TI r1 = r6.A0M
            X.3TI r0 = X.AnonymousClass3TI.HORIZONTAL
            if (r1 == r0) goto L_0x0056
        L_0x004c:
            boolean r0 = r6.A0r
            if (r0 == 0) goto L_0x0037
            X.3TI r1 = r6.A0M
            X.3TI r0 = X.AnonymousClass3TI.VERTICAL
            if (r1 != r0) goto L_0x0037
        L_0x0056:
            android.view.ViewParent r0 = r6.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
            boolean r0 = r6.A0U
            if (r0 == 0) goto L_0x0038
            X.3TF r0 = X.AnonymousClass3TF.IDLE
            r6.A04(r0, r2)
            X.0eM r0 = r6.A10
            java.lang.Object r0 = r0.getValue()
            X.2cs r0 = (X.2cs) r0
            r0.A01()
            r6.A0U = r4
            goto L_0x0038
        L_0x0074:
            float r0 = r6.A0h
            r6.A0I(r0)
            goto L_0x0037
        L_0x007a:
            X.3v1 r2 = r6.A0J
            float r1 = r7.getX()
            float r0 = r7.getY()
            boolean r2 = r2.FHR(r6, r1, r0)
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void AOy(View view) {
        super.detachViewFromParent(view);
    }

    public final void setBackwardDraggingDisabled(boolean z) {
        this.A0T = z;
    }

    public final void setCustomMaximumOffset(Integer num) {
        this.A0n = num;
    }

    public final void setCustomMinimumOffset(Integer num) {
        this.A0Q = num;
    }

    public final void setDraggingController(C314096he r1) {
        this.A0I = r1;
    }

    public final void setEnabledMinPagingVelocityCastingFix(boolean z) {
        this.A0o = z;
    }

    public final void setForwardDraggingDisabled(boolean z) {
        this.A0V = z;
    }

    public final void setMaximumFlingVelocity(int i) {
        this.A0B = i;
    }

    public final void setMinPagingVelocity(int i) {
        this.A0j = i;
    }

    public final void setOnSingleTapListener(C342317oO r1) {
        this.A0K = r1;
    }

    public final void setOnSizeChangedListener(C59549JNv jNv) {
        this.A0L = jNv;
    }

    public final void setOutOfBoundsDragSlipRatio(float f) {
        this.A03 = f;
    }

    public final void setOverScrollOnEndItem(boolean z) {
        this.A0Y = z;
    }

    public final void setOverScrollOnStartItem(boolean z) {
        this.A0Z = z;
    }

    public final void setOverridePageSize(int i) {
        this.A0C = i;
    }

    public final void setReverseLayout(boolean z) {
        this.A0a = z;
    }

    public final void setScrollSpeedFactor(float f) {
        this.A04 = f;
    }

    public final void setStoriesModeEnabled(boolean z) {
        this.A0S = z;
    }

    public final void setUseStableIdForRecycledView(boolean z) {
        this.A0b = z;
    }

    public final void setXDraggingRange(int i) {
        this.A0l = i;
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReboundViewPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A11 = new float[]{0.0f, 0.0f};
        this.A12 = new float[]{0.0f, 0.0f};
        this.A02 = -1.0f;
        this.A1A = new ArrayList();
        this.A17 = new ArrayList();
        this.A19 = new ArrayList();
        this.A1B = new HashMap();
        this.A0w = new HashMap();
        this.A1C = new HashMap();
        this.A16 = new ArrayList();
        this.A18 = new ArrayList();
        this.A0x = new CopyOnWriteArraySet();
        this.A0z = new CopyOnWriteArraySet();
        this.A0y = new CopyOnWriteArraySet();
        this.A15 = new AnonymousClass3TD(this);
        this.A0v = new EnumMap(AnonymousClass3TE.class);
        this.A0c = new int[0];
        this.A0d = new int[0];
        AnonymousClass3TF r6 = AnonymousClass3TF.IDLE;
        this.A0O = r6;
        this.A09 = -1;
        this.A0A = -1;
        this.A0X = true;
        this.A0p = true;
        this.A0t = true;
        this.A0C = -1;
        this.A0N = AnonymousClass3TG.DISCRETE_PAGING;
        this.A04 = 1.0f;
        this.A0Z = true;
        this.A0Y = true;
        this.A03 = 0.25f;
        this.A0H = AnonymousClass3TH.BIAS_START;
        this.A0M = AnonymousClass3TI.HORIZONTAL;
        for (AnonymousClass3TE r2 : AnonymousClass3TE.values()) {
            this.A0v.put(r2, r2.A00);
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float applyDimension = TypedValue.applyDimension(1, 2.0f, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A1u);
        0qQ.A07(obtainStyledAttributes);
        try {
            float dimension = obtainStyledAttributes.getDimension(0, applyDimension);
            obtainStyledAttributes.recycle();
            setPageSpacing(dimension);
            this.A0g = TypedValue.applyDimension(1, 8.0f, displayMetrics);
            this.A0l = 90;
            A04(r6, false);
            A0J(0.0f, true, false);
            A0M(1, false);
            GestureDetector gestureDetector = new GestureDetector(context, this, new Handler(Looper.getMainLooper()));
            this.A13 = gestureDetector;
            gestureDetector.setIsLongpressEnabled(false);
            int scaledMinimumFlingVelocity = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
            this.A0B = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            this.A0j = scaledMinimumFlingVelocity;
            this.A0J = new C255963v0();
            Context context2 = getContext();
            Scroller scroller = new Scroller(context2);
            this.A14 = scroller;
            scroller.setFriction(0.1f);
            this.A10 = AnonymousClass0eN.A01(new AnonymousClass9LM(this, 24));
            Object systemService = context2.getSystemService("accessibility");
            0qQ.A0C(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
            this.A0u = (AccessibilityManager) systemService;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void setAdapter(C255993v3 r2) {
        0qQ.A0B(r2, 0);
        A0O(r2, this.A01);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ReboundViewPager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ReboundViewPager(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }
}
