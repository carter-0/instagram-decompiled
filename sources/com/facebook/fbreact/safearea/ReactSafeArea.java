package com.facebook.fbreact.safearea;

import X.02M;
import X.0Sd;
import X.0qQ;
import X.AnonymousClass03j;
import X.C11611SdE;
import X.C13773Tgo;
import X.C59344JFw;
import X.Pxe;
import X.QZK;
import X.RVE;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.facebook.fbreact.specs.NativeSafeAreaSpec;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "SafeArea")
public final class ReactSafeArea extends NativeSafeAreaSpec implements C13773Tgo {
    public static final RVE Companion = new Object();
    public static final String NAME = "SafeArea";
    public final boolean enableSafeArea;
    public final int insetsType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReactSafeArea(QZK qzk, boolean z) {
        super(qzk);
        0qQ.A0B(qzk, 1);
        this.enableSafeArea = z;
        this.insetsType = 135;
    }

    public void onHostPause() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (hasForcedEdgeToEdge(r0) != false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C13948Tm8 safeAreaInsets() {
        /*
            r12 = this;
            r3 = r12
            boolean r0 = r12.enableSafeArea
            if (r0 != 0) goto L_0x0012
            X.QZK r0 = X.Pxe.A0T(r12)
            X.0qQ.A07(r0)
            boolean r0 = r12.hasForcedEdgeToEdge(r0)
            if (r0 == 0) goto L_0x0050
        L_0x0012:
            X.QZK r0 = r12.mReactApplicationContext
            java.lang.String r2 = "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one"
            X.0Sd.A01(r0, r2)
            android.app.Activity r0 = r0.A00()
            if (r0 == 0) goto L_0x0048
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x0048
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L_0x0048
            r12.setWindowInsetsListener(r1)
            android.view.WindowInsets r0 = r1.getRootWindowInsets()
            if (r0 == 0) goto L_0x0048
            X.04k r0 = X.04k.A01(r1, r0)
            int r1 = r12.insetsType
            X.04h r0 = r0.A00
            X.02M r0 = r0.A05(r1)
            X.0qQ.A07(r0)
            com.facebook.react.bridge.WritableNativeMap r0 = r12.toSafeAreaMap(r0)
            return r0
        L_0x0048:
            X.QZK r0 = r12.mReactApplicationContext
            X.0Sd.A01(r0, r2)
            r0.A09(r12)
        L_0x0050:
            r4 = 0
            r6 = r4
            r8 = r4
            r10 = r4
            com.facebook.react.bridge.WritableNativeMap r0 = r3.createSafeAreaMap(r4, r6, r8, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbreact.safearea.ReactSafeArea.safeAreaInsets():X.Tm8");
    }

    public boolean setSupportsOrientationChange(boolean z) {
        return false;
    }

    public static /* synthetic */ WritableNativeMap createSafeAreaMap$default(ReactSafeArea reactSafeArea, double d, double d2, double d3, double d4, int i, Object obj) {
        if ((i & 1) != 0) {
            d = 0.0d;
        }
        if ((i & 2) != 0) {
            d2 = 0.0d;
        }
        if ((i & 4) != 0) {
            d3 = 0.0d;
        }
        if ((i & 8) != 0) {
            d4 = 0.0d;
        }
        return reactSafeArea.createSafeAreaMap(d, d2, d3, d4);
    }

    private final boolean hasForcedEdgeToEdge(Context context) {
        if (Build.VERSION.SDK_INT < 35 || context.getApplicationInfo().targetSdkVersion < 35) {
            return false;
        }
        return true;
    }

    private final void setWindowInsetsListener(View view) {
        AnonymousClass03j.A00(view, new C11611SdE(new C59344JFw(this, 23), 0));
    }

    /* access modifiers changed from: private */
    public final WritableNativeMap toSafeAreaMap(02M r10) {
        return createSafeAreaMap(Pxe.A01(r10.A03), Pxe.A01(r10.A01), Pxe.A01(r10.A00), Pxe.A01(r10.A02));
    }

    public void onHostResume() {
        Window window;
        View decorView;
        QZK qzk = this.mReactApplicationContext;
        0Sd.A01(qzk, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
        Activity A00 = qzk.A00();
        if (A00 != null && (window = A00.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            setWindowInsetsListener(decorView);
            QZK qzk2 = this.mReactApplicationContext;
            0Sd.A01(qzk2, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
            qzk2.A0A(this);
            decorView.requestApplyInsets();
        }
    }

    private final WritableNativeMap createSafeAreaMap(double d, double d2, double d3, double d4) {
        WritableNativeMap A0U = Pxe.A0U();
        A0U.putDouble("top", d);
        A0U.putDouble("left", d2);
        A0U.putDouble("bottom", d3);
        A0U.putDouble("right", d4);
        return A0U;
    }

    private final double pxToDp(int i) {
        return Pxe.A01(i);
    }

    public void onHostDestroy() {
        Pxe.A0T(this).A0A(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ReactSafeArea(QZK qzk) {
        this(qzk, false);
        0qQ.A0B(qzk, 1);
    }
}
