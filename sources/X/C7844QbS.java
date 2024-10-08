package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.config.ReactFeatureFlags;

/* renamed from: X.QbS  reason: case insensitive filesystem */
public final class C7844QbS extends U3r implements X61 {
    public int A00;
    public int A01;
    public C20831X0g A02;
    public C20877X2e A03;
    public C18801W2o A04;
    public final C11245SHf A05 = new C11245SHf(this);

    public final void D1k(MotionEvent motionEvent, View view) {
        C20877X2e x2e = this.A03;
        if (x2e != null) {
            C11245SHf sHf = this.A05;
            if (!sHf.A01) {
                C11245SHf.A00(motionEvent, sHf, x2e);
                sHf.A01 = true;
                sHf.A00 = -1;
            }
            C18801W2o w2o = this.A04;
            if (w2o != null) {
                w2o.A04(motionEvent, view, x2e);
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C18801W2o w2o;
        0qQ.A0B(motionEvent, 0);
        C20877X2e x2e = this.A03;
        if (!(x2e == null || (w2o = this.A04) == null)) {
            w2o.A05(motionEvent, x2e, false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public final boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        C18801W2o w2o;
        0qQ.A0B(motionEvent, 0);
        C20877X2e x2e = this.A03;
        if (!(x2e == null || (w2o = this.A04) == null)) {
            w2o.A05(motionEvent, x2e, true);
        }
        return super.onHoverEvent(motionEvent);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        C20877X2e x2e = this.A03;
        if (x2e != null) {
            this.A05.A01(motionEvent, getReactContext(), x2e);
            C18801W2o w2o = this.A04;
            if (w2o != null) {
                w2o.A05(motionEvent, x2e, true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
    }

    public final void D1f(MotionEvent motionEvent, View view) {
        if (this.A03 != null) {
            this.A05.A01 = false;
        }
        C18801W2o w2o = this.A04;
        if (w2o != null) {
            w2o.A00 = -1;
        }
    }

    public final C20877X2e getEventDispatcher$xplat_js_react_native_github_packages_react_native_ReactAndroid_src_main_java_com_facebook_react_views_modal_modalAndroid() {
        return this.A03;
    }

    public final C20831X0g getStateWrapper$xplat_js_react_native_github_packages_react_native_ReactAndroid_src_main_java_com_facebook_react_views_modal_modalAndroid() {
        return null;
    }

    public final void setEventDispatcher$xplat_js_react_native_github_packages_react_native_ReactAndroid_src_main_java_com_facebook_react_views_modal_modalAndroid(C20877X2e x2e) {
        this.A03 = x2e;
    }

    public final void setStateWrapper$xplat_js_react_native_github_packages_react_native_ReactAndroid_src_main_java_com_facebook_react_views_modal_modalAndroid(C20831X0g x0g) {
        this.A02 = x0g;
    }

    public C7844QbS(Context context) {
        super(context);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.A04 = new C18801W2o(this);
        }
    }

    /* access modifiers changed from: private */
    public final QZL getReactContext() {
        Context context = getContext();
        0qQ.A0C(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        return (QZL) context;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = AnonymousClass0fD.A06(-584971480);
        super.onSizeChanged(i, i2, i3, i4);
        this.A01 = i;
        this.A00 = i2;
        W2U.A00((float) i);
        W2U.A00((float) i2);
        getReactContext().A0D(new QZ4(getReactContext(), this));
        AnonymousClass0fD.A0D(1009071715, A06);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0fD.A05(1526727920);
        0qQ.A0B(motionEvent, 0);
        C20877X2e x2e = this.A03;
        if (x2e != null) {
            this.A05.A01(motionEvent, getReactContext(), x2e);
            C18801W2o w2o = this.A04;
            if (w2o != null) {
                w2o.A05(motionEvent, x2e, false);
            }
        }
        super.onTouchEvent(motionEvent);
        AnonymousClass0fD.A0C(1427069623, A052);
        return true;
    }
}
