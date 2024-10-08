package X;

import android.view.ViewGroup;

/* renamed from: X.Q8i  reason: case insensitive filesystem */
public final class C7365Q8i extends ViewGroup {
    public C20831X0g A00;
    public final QZL A01;

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final QZL getReactContext() {
        return this.A01;
    }

    public final C20831X0g getStateWrapper$xplat_js_react_native_github_packages_react_native_ReactAndroid_src_main_java_com_facebook_react_views_safeareaview_safeareaviewAndroid() {
        return null;
    }

    public final void setStateWrapper$xplat_js_react_native_github_packages_react_native_ReactAndroid_src_main_java_com_facebook_react_views_safeareaview_safeareaviewAndroid(C20831X0g x0g) {
        this.A00 = x0g;
    }

    public C7365Q8i(QZL qzl) {
        super(qzl);
        this.A01 = qzl;
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(-878614876);
        super.onAttachedToWindow();
        AnonymousClass03j.A00(this, new C11611SdE(this, 1));
        requestApplyInsets();
        AnonymousClass0fD.A0D(1771810527, A06);
    }
}
