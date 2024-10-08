package X;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.instagram.android.R;
import java.util.List;

public abstract class W1m {
    public static final Handler A0D = new Handler(Looper.getMainLooper(), new W69(1));
    public static final int[] A0E = {R.attr.snackbarStyle};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public X1C A04 = new WMX(this);
    public Rect A05;
    public final Context A06;
    public final ViewGroup A07;
    public final AccessibilityManager A08;
    public final U4W A09;
    public final X1B A0A;
    public final ViewTreeObserver.OnGlobalLayoutListener A0B = new WC9(this, 5);
    public final Runnable A0C = new C19969Wig(this);

    public abstract int A03();

    public static void A01(W1m w1m) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = w1m.A08;
        if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
            w1m.A09.post(new C19968Wif(w1m));
            return;
        }
        U4W u4w = w1m.A09;
        if (u4w.getParent() != null) {
            u4w.setVisibility(0);
        }
        w1m.A06();
    }

    public static void A02(W1m w1m) {
        Rect rect;
        U4W u4w = w1m.A09;
        ViewGroup.LayoutParams layoutParams = u4w.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (rect = w1m.A05) == null) {
            Log.w("BaseTransientBottomBar", "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = rect.bottom + w1m.A01;
        marginLayoutParams.leftMargin = rect.left + w1m.A02;
        marginLayoutParams.rightMargin = rect.right + w1m.A03;
        u4w.requestLayout();
        if (Build.VERSION.SDK_INT >= 29 && w1m.A00 > 0) {
            2dP layoutParams2 = u4w.getLayoutParams();
            if ((layoutParams2 instanceof 2dP) && (layoutParams2.A0A instanceof SwipeDismissBehavior)) {
                Runnable runnable = w1m.A0C;
                u4w.removeCallbacks(runnable);
                u4w.post(runnable);
            }
        }
    }

    public W1m(Context context, View view, ViewGroup viewGroup, X1B x1b) {
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (x1b != null) {
            this.A07 = viewGroup;
            this.A0A = x1b;
            this.A06 = context;
            C297855sT.A03(context, "Theme.AppCompat", C297855sT.A00);
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = this.A06.obtainStyledAttributes(A0E);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            U4W u4w = (U4W) from.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
            this.A09 = u4w;
            if (view instanceof SnackbarContentLayout) {
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
                float f = u4w.A05;
                if (f != 1.0f) {
                    snackbarContentLayout.A00.setTextColor(C18108Vlc.A00(f, C298035sl.A01(snackbarContentLayout, R.attr.colorSurface), snackbarContentLayout.A00.getCurrentTextColor()));
                }
            }
            u4w.addView(view);
            ViewGroup.LayoutParams layoutParams = u4w.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.A05 = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            u4w.setAccessibilityLiveRegion(1);
            u4w.setImportantForAccessibility(1);
            u4w.setFitsSystemWindows(true);
            AnonymousClass03j.A00(u4w, new C14309Ttj(this, 1));
            03v.A0B(u4w, new U7N(this, 5));
            this.A08 = (AccessibilityManager) context.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    public final void A04() {
        C18800W2n A002 = C18800W2n.A00();
        int A032 = A03();
        X1C x1c = this.A04;
        synchronized (A002.A03) {
            if (C18800W2n.A03(x1c, A002)) {
                VV6 vv6 = A002.A00;
                vv6.A00 = A032;
                A002.A02.removeCallbacksAndMessages(vv6);
                C18800W2n.A01(A002.A00, A002);
            } else {
                VV6 vv62 = A002.A01;
                if (vv62 == null || x1c == null || vv62.A02.get() != x1c) {
                    A002.A01 = new VV6(x1c, A032);
                } else {
                    vv62.A00 = A032;
                }
                VV6 vv63 = A002.A00;
                if (vv63 == null || !C18800W2n.A04(vv63, A002, 4)) {
                    A002.A00 = null;
                    C18800W2n.A02(A002);
                }
            }
        }
    }

    public final void A05() {
        C18800W2n A002 = C18800W2n.A00();
        X1C x1c = this.A04;
        synchronized (A002.A03) {
            if (C18800W2n.A03(x1c, A002)) {
                A002.A00 = null;
                if (A002.A01 != null) {
                    C18800W2n.A02(A002);
                }
            }
        }
        C13989Tnp.A17(this.A09);
    }

    public final void A06() {
        C18800W2n A002 = C18800W2n.A00();
        X1C x1c = this.A04;
        synchronized (A002.A03) {
            if (C18800W2n.A03(x1c, A002)) {
                C18800W2n.A01(A002.A00, A002);
            }
        }
    }

    public final void A07(int i) {
        VV6 vv6;
        C18800W2n A002 = C18800W2n.A00();
        X1C x1c = this.A04;
        synchronized (A002.A03) {
            if (C18800W2n.A03(x1c, A002)) {
                vv6 = A002.A00;
            } else {
                vv6 = A002.A01;
                if (!(vv6 == null || x1c == null || vv6.A02.get() != x1c)) {
                }
            }
            C18800W2n.A04(vv6, A002, i);
        }
    }
}
