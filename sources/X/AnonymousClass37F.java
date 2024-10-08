package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import com.facebook.systrace.Systrace;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.37F  reason: invalid class name */
public final class AnonymousClass37F extends AnonymousClass37D implements C252203oj {
    public static final C71392co A18 = C71392co.A04(40.0d, 7.0d);
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public View.OnClickListener A08;
    public Fragment A09;
    public C71392co A0A;
    public AnonymousClass91D A0B;
    public C10312RqA A0C;
    public C7218Pzn A0D;
    public GPw A0E;
    public C13678Ten A0F;
    public C13823Tht A0G;
    public C332277Ui A0H;
    public C13679Teo A0I;
    public SHR A0J;
    public Integer A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
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
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public int[] A0o;
    public boolean A0p;
    public final int A0q;
    public final Activity A0r;
    public final Handler A0s;
    public final 2cs A0t;
    public final AnonymousClass37K A0u;
    public final 0lg A0v;
    public final Runnable A0w;
    public final WeakReference A0x;
    public final Map A0y = new WeakHashMap();
    public final Set A0z;
    public final Set A10;
    public final AnonymousClass0eM A11;
    public final AnonymousClass0eM A12;
    public final boolean A13;
    public final Rect A14 = new Rect();
    public final AnonymousClass0eM A15;
    public final AnonymousClass0eM A16;
    public final int[] A17 = {0, 0};

    public AnonymousClass37F(Activity activity, View view, 0hq r8, 0lg r9, int i, boolean z) {
        this.A0q = i;
        this.A13 = z;
        this.A0r = activity;
        this.A0v = r9;
        this.A0x = new WeakReference(r8);
        this.A11 = AnonymousClass0eN.A01(new AnonymousClass9LL(view, 11));
        this.A15 = AnonymousClass0eN.A01(new AnonymousClass9LL(this, 9));
        this.A12 = AnonymousClass0eN.A01(new AnonymousClass9LL(activity, 12));
        this.A16 = AnonymousClass0eN.A01(new AnonymousClass9LL(this, 10));
        this.A0K = AnonymousClass05K.A02;
        this.A0N = true;
        this.A0L = true;
        this.A0z = new LinkedHashSet();
        this.A05 = 255;
        this.A04 = 255;
        this.A03 = 255;
        this.A0k = true;
        this.A01 = 0.5f;
        this.A02 = 2;
        this.A0s = new Handler(Looper.getMainLooper());
        this.A10 = new LinkedHashSet();
        this.A0w = new AnonymousClass37G(this);
        0Tu r4 = 0Tu.A05;
        if (!182.A06(r4, r9, 36327189872064735L)) {
            ((C252063oV) this.A11.getValue()).setVisibility(8);
            if (!182.A06(r4, r9, 36324694496391423L)) {
                ((C252063oV) this.A11.getValue()).getView().setVisibility(8);
            }
        }
        this.A0A = A18;
        2cs A022 = C61340me.A00().A02();
        A022.A08(0.0d, true);
        A022.A09(this.A0A);
        A022.A06 = true;
        this.A0t = A022;
        AnonymousClass37K r0 = new AnonymousClass37K();
        this.A0u = r0;
        r0.A00.add(new AnonymousClass37L(this));
        Set set = C71342cb.A00(r9).A0P;
        set.add("bottom_sheet_component");
        set.add("action_sheet_fragment");
    }

    public final void DmB(2cs r6) {
        float translationY;
        0qQ.A0B(r6, 0);
        if (r6.A01 == 1.0d) {
            A01(this).setClickable(this.A0N);
            translationY = 0.0f;
        } else {
            translationY = A02(this).getTranslationY();
        }
        this.A00 = translationY;
    }

    public final void DmC(2cs r7) {
        0qQ.A0B(r7, 0);
        if (r7.A01 == 0.0d) {
            A03();
            return;
        }
        C7218Pzn pzn = this.A0D;
        if (pzn != null) {
            pzn.A0I(false);
            pzn.DmC(r7);
        }
    }

    public final void DmD(2cs r1) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (r0.A02 == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DmE(X.2cs r7) {
        /*
            r6 = this;
            r0 = 0
            X.0qQ.A0B(r7, r0)
            X.2ct r0 = r7.A09
            double r0 = r0.A00
            float r5 = (float) r0
            A06(r7, r6)
            double r3 = r7.A01
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001d
            X.GPw r0 = r6.A0E
            r0.getClass()
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x002e
        L_0x001d:
            double r3 = r7.A01
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0046
            X.GPw r0 = r6.A0E
            r0.getClass()
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0046
        L_0x002e:
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = A02(r6)
            int r0 = r0.getHeight()
            float r1 = (float) r0
            float r0 = r6.A00
            float r1 = r1 - r0
            float r2 = r2 * r1
            float r2 = r2 + r0
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = A02(r6)
            r0.setTranslationY(r2)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass37F.DmE(X.2cs):void");
    }

    public static final TouchInterceptorFrameLayout A01(AnonymousClass37F r0) {
        Object value = r0.A15.getValue();
        0qQ.A07(value);
        return (TouchInterceptorFrameLayout) value;
    }

    public static final TouchInterceptorFrameLayout A02(AnonymousClass37F r0) {
        Object value = r0.A16.getValue();
        0qQ.A07(value);
        return (TouchInterceptorFrameLayout) value;
    }

    private final void A03() {
        ((C252063oV) this.A11.getValue()).getView().CNi((View.OnTouchListener) null);
        A02(this).CNi((View.OnTouchListener) null);
        if (Systrace.A0E(1)) {
            0fS.A01("IgBottomSheetNavigator::restoreOtherViewsImportantForAccessibilityValues", -2120970585);
        }
        try {
            Map map = this.A0y;
            for (View view : map.keySet()) {
                Object obj = map.get(view);
                if (obj != null) {
                    view.setImportantForAccessibility(((Number) obj).intValue());
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            map.clear();
            Context context = A02(this).getContext();
            0qQ.A0C(context, "null cannot be cast to non-null type android.app.Activity");
            Activity activity = (Activity) context;
            int i = this.A05;
            if (i != 255) {
                2db.A02(activity, i);
                this.A05 = 255;
            }
            C7218Pzn pzn = this.A0D;
            if (pzn != null) {
                pzn.A0G();
            }
            this.A0D = null;
            new Handler(Looper.getMainLooper()).post(new Q4S(this));
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(2037960822);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0043, code lost:
        if (com.instagram.igds.components.bottomsheet.BottomSheetFragment.A00(r1).A1S != false) goto L_0x0045;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(androidx.fragment.app.Fragment r7, X.AnonymousClass37F r8, java.lang.Integer r9) {
        /*
            r8.A0K = r9
            boolean r0 = r8.A0S
            if (r0 != 0) goto L_0x00ed
            androidx.fragment.app.Fragment r4 = r8.A09
            boolean r0 = r4 instanceof X.AnonymousClass0iw
            if (r0 == 0) goto L_0x0030
            java.lang.ref.WeakReference r0 = r8.A0x
            java.lang.Object r2 = r0.get()
            X.0hq r2 = (X.0hq) r2
            if (r2 == 0) goto L_0x0139
            X.0iw r4 = (X.AnonymousClass0iw) r4
            X.0lg r1 = r8.A0v
            r0 = 0
            X.0qQ.A0B(r4, r0)
            r0 = 2
            X.0qQ.A0B(r1, r0)
            X.2cc r3 = X.C71342cb.A00(r1)
            int r2 = r2.A0M()
            r1 = 0
            X.90t r0 = X.C3724190t.A00
            r3.A0B(r0, r4, r1, r2)
        L_0x0030:
            boolean r0 = r7 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r0 == 0) goto L_0x012e
            r1 = r7
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r1
            boolean r0 = com.instagram.igds.components.bottomsheet.BottomSheetFragment.A0J(r1)
            if (r0 == 0) goto L_0x012e
            X.7Pr r0 = com.instagram.igds.components.bottomsheet.BottomSheetFragment.A00(r1)
            boolean r0 = r0.A1S
            if (r0 == 0) goto L_0x012e
        L_0x0045:
            r1 = 0
            X.Pzn r0 = r8.A0D
            if (r0 == 0) goto L_0x004c
            r0.A0D = r1
        L_0x004c:
            r8.A09 = r1
            r2 = 1
            r8.A0b = r2
            X.7Ui r0 = r8.A0H
            if (r0 == 0) goto L_0x0058
            r0.D9a()
        L_0x0058:
            X.0lg r4 = r8.A0v
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r4)
            X.3KU r0 = new X.3KU
            r0.<init>()
            r1.A00(r0)
            r0 = 3075(0xc03, float:4.309E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r7, r0)
            r1 = r7
            X.4DJ r1 = (X.AnonymousClass4DJ) r1
            X.37K r0 = r8.A0u
            r1.unregisterLifecycleListener(r0)
            boolean r0 = r8.A0X
            if (r0 == 0) goto L_0x0088
            androidx.fragment.app.FragmentActivity r0 = r7.getActivity()
            if (r0 == 0) goto L_0x0088
            androidx.fragment.app.FragmentActivity r0 = r7.requireActivity()
            r0.finish()
        L_0x0088:
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = A02(r8)
            android.content.Context r1 = r0.getContext()
            java.lang.String r6 = "null cannot be cast to non-null type android.app.Activity"
            X.0qQ.A0C(r1, r6)
            android.app.Activity r1 = (android.app.Activity) r1
            int r0 = r8.A04
            r5 = 255(0xff, float:3.57E-43)
            if (r0 == r5) goto L_0x00a7
            X.AnonymousClass2uJ.A04(r1, r0)
            boolean r0 = r8.A0d
            X.AnonymousClass2uJ.A06(r1, r0)
            r8.A04 = r5
        L_0x00a7:
            X.GPw r0 = r8.A0E
            if (r0 == 0) goto L_0x00f6
            boolean r0 = r0.A02
            if (r0 != r2) goto L_0x0111
            r8.A0S = r2
            X.2cs r3 = r8.A0t
            r1 = 0
            r3.A06(r1)
            X.2ct r0 = r3.A09
            double r5 = r0.A00
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00c3
            r8.DmC(r3)
        L_0x00c3:
            X.Pzn r0 = r8.A0D
            if (r0 == 0) goto L_0x00cc
            X.2cs r0 = r0.A0V
            r0.A06(r1)
        L_0x00cc:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36311736579654384(0x810155000202f0, double:3.0270266563760004E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x00ed
            r0 = 36325768237692109(0x810e18000034cd, double:3.0359003334200095E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x00ee
            android.view.View r1 = r7.mView
            if (r1 == 0) goto L_0x00ed
            X.2eh r0 = X.AnonymousClass2eg.A00
        L_0x00ea:
            r0.A01(r1)
        L_0x00ed:
            return
        L_0x00ee:
            X.2eh r0 = X.AnonymousClass2eg.A00
            android.view.View r1 = r7.mView
            r1.getClass()
            goto L_0x00ea
        L_0x00f6:
            java.lang.String r3 = "mShowing: "
            boolean r2 = r8.A0g
            java.lang.String r1 = ", mBottomSheetContainer: "
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = A02(r8)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x012b
            java.lang.String r0 = "visible"
        L_0x0108:
            java.lang.String r1 = X.002.A1A(r3, r1, r0, r2)
            java.lang.String r0 = "BottomSheetNavigator"
            X.0wb.A03(r0, r1)
        L_0x0111:
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = A02(r8)
            android.content.Context r1 = r0.getContext()
            X.0qQ.A0C(r1, r6)
            android.app.Activity r1 = (android.app.Activity) r1
            int r0 = r8.A05
            if (r0 == r5) goto L_0x0127
            X.2db.A02(r1, r0)
            r8.A05 = r5
        L_0x0127:
            r8.A03()
            goto L_0x00cc
        L_0x012b:
            java.lang.String r0 = "invisible"
            goto L_0x0108
        L_0x012e:
            boolean r0 = r8.A0W
            if (r0 != 0) goto L_0x0045
            android.view.View r0 = r7.mView
            X.0nA.A0N(r0)
            goto L_0x0045
        L_0x0139:
            r0 = 54
            java.lang.String r1 = X.Pxd.A00(r0)
            java.lang.String r0 = "FragmentManager is null in onDismissInternal"
            X.0wb.A03(r1, r0)
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass37F.A05(androidx.fragment.app.Fragment, X.37F, java.lang.Integer):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.7hH] */
    public static final void A06(2cs r6, AnonymousClass37F r7) {
        int i;
        float f = (float) r6.A09.A00;
        GPw gPw = r7.A0E;
        if (gPw != null && gPw.A00) {
            double d = r6.A01;
            if ((d == 0.0d || d == 1.0d) && !r7.A0Z) {
                A01(r7).setAlpha(f);
                Activity activity = r7.A0r;
                if (0lz.A02(activity)) {
                    View view = (View) r7.A12.getValue();
                    if (view != null) {
                        view.setAlpha(f);
                        return;
                    }
                    return;
                }
                int i2 = r7.A05;
                if (i2 != 255 && (i = r7.A03) != 255) {
                    Object evaluate = new Object().evaluate(f, Integer.valueOf(i2), Integer.valueOf(i));
                    0qQ.A0C(evaluate, "null cannot be cast to non-null type kotlin.Int");
                    2db.A02(activity, ((Number) evaluate).intValue());
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004d, code lost:
        if (r0 != false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A07(android.view.MotionEvent r8, androidx.fragment.app.Fragment r9, X.AnonymousClass37F r10) {
        /*
            boolean r0 = r10.A0p
            r6 = 1
            if (r0 == 0) goto L_0x000c
            int r0 = r8.getActionMasked()
            if (r0 == 0) goto L_0x000c
            return r6
        L_0x000c:
            boolean r0 = r9 instanceof X.C268594df
            if (r0 == 0) goto L_0x0056
            X.4df r9 = (X.C268594df) r9
            android.view.View r0 = r9.C4U()
        L_0x0016:
            boolean r1 = r10.A0R
            if (r1 == 0) goto L_0x0052
            if (r0 == 0) goto L_0x0052
            int[] r7 = r10.A17
            r0.getLocationOnScreen(r7)
            android.graphics.Rect r5 = r10.A14
            r1 = 0
            r4 = r7[r1]
            r3 = r7[r6]
            int r2 = r0.getWidth()
            int r2 = r2 + r4
            r1 = r7[r6]
            int r0 = r0.getHeight()
            int r1 = r1 + r0
            r5.set(r4, r3, r2, r1)
            float r0 = r8.getRawX()
            int r1 = java.lang.Math.round(r0)
            float r0 = r8.getRawY()
            int r0 = java.lang.Math.round(r0)
            boolean r0 = r5.contains(r1, r0)
            r10.A0p = r0
            if (r0 == 0) goto L_0x0051
        L_0x004f:
            r10.A0h = r6
        L_0x0051:
            return r0
        L_0x0052:
            r10.A0p = r6
            r0 = 1
            goto L_0x004f
        L_0x0056:
            android.view.View r0 = r9.mView
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass37F.A07(android.view.MotionEvent, androidx.fragment.app.Fragment, X.37F):boolean");
    }

    public final Integer A0a(Float f) {
        if (f == null) {
            return AnonymousClass05K.A1F;
        }
        float floatValue = f.floatValue();
        C7218Pzn pzn = this.A0D;
        if (pzn == null || !pzn.A0J(floatValue)) {
            return AnonymousClass05K.A0j;
        }
        return AnonymousClass05K.A0u;
    }

    public static final View A00(AnonymousClass37F r1) {
        C268594df A092 = r1.A09();
        if (A092 instanceof C268594df) {
            return A092.C4U();
        }
        if (A092 != null) {
            return A092.mView;
        }
        return null;
    }

    public static final void A04(View view, AnonymousClass37F r8) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != view) {
                    r8.A0y.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    childAt.setImportantForAccessibility(4);
                }
            }
        }
        if (parent instanceof View) {
            A04((View) parent, r8);
        }
    }
}
