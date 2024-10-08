package X;

import android.app.Activity;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Adapter;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.2xi  reason: invalid class name and case insensitive filesystem */
public final class C234342xi extends C252233om {
    public int A00;
    public int A01;
    public long A02;
    public 0wc A03;
    public 1Xj A04;
    public C234372xl A05;
    public final UserSession A06;
    public final AnonymousClass4DU A07;
    public final DataSetObserver A08;
    public final C234352xj A09;

    public C234342xi(Activity activity, Adapter adapter, UserSession userSession, AnonymousClass4DU r10) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(activity, 2);
        0qQ.A0B(r10, 4);
        this.A06 = userSession;
        this.A07 = r10;
        C234352xj r4 = new C234352xj(this);
        this.A09 = r4;
        C234362xk r3 = new C234362xk(this);
        this.A08 = r3;
        Activity parent = activity.getParent();
        parent = parent == null ? activity : parent;
        View decorView = parent.getWindow().getDecorView();
        0qQ.A0C(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) decorView;
        C234372xl r0 = new C234372xl(viewGroup, true);
        this.A05 = r0;
        r0.A0I = r4;
        if (parent.getWindow() != null) {
            Window window = activity.getWindow();
            0qQ.A07(window);
            C61290mR.A05(window);
            viewGroup.requestApplyInsets();
        }
        if (adapter != null) {
            adapter.registerDataSetObserver(r3);
        }
    }

    public final void A01(View view, C253723rH r4, 1Xj r5, C253913rc r6, int i, int i2) {
        0qQ.A0B(r4, 0);
        this.A00 = i;
        this.A01 = i2;
        this.A04 = r5;
        this.A02 = System.currentTimeMillis();
        C234372xl r0 = this.A05;
        if (r0 == null) {
            0qQ.A0F("simpleZoomableViewController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.Exy(view, r4, r6);
        }
    }

    public static final void A00(C234342xi r3, boolean z) {
        int i;
        C234372xl r32 = r3.A05;
        if (r32 == null) {
            0qQ.A0F("simpleZoomableViewController");
            throw AnonymousClass00P.createAndThrow();
        }
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = r32.A0E;
        if (touchInterceptorFrameLayout != null) {
            int systemUiVisibility = touchInterceptorFrameLayout.getSystemUiVisibility();
            int i2 = systemUiVisibility & -5;
            if (!z) {
                i2 = systemUiVisibility | 256 | 4;
            }
            touchInterceptorFrameLayout.setSystemUiVisibility(i2);
        }
        TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = r32.A0E;
        if (touchInterceptorFrameLayout2 != null) {
            int systemUiVisibility2 = touchInterceptorFrameLayout2.getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility2 & -513 & -3;
            } else {
                i = systemUiVisibility2 | 256 | 512 | 2;
            }
            touchInterceptorFrameLayout2.setSystemUiVisibility(i);
        }
    }

    public final boolean A02() {
        C234372xl r0 = this.A05;
        if (r0 == null) {
            0qQ.A0F("simpleZoomableViewController");
            throw AnonymousClass00P.createAndThrow();
        } else if (r0.A0J == AnonymousClass05K.A01) {
            return true;
        } else {
            return false;
        }
    }

    public final void D6z(View view) {
        C234372xl r0 = this.A05;
        if (r0 == null) {
            0qQ.A0F("simpleZoomableViewController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.start();
        }
    }

    public final void onDestroyView() {
        C234372xl r0 = this.A05;
        if (r0 == null) {
            0qQ.A0F("simpleZoomableViewController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.stop();
        }
    }
}
