package com.facebook.react.views.progressbar;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C13990Tnq;
import X.C18671VwU;
import X.C19068WIz;
import X.C245103cK;
import X.QZK;
import X.QZL;
import X.U4S;
import X.W2U;
import X.X62;
import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.WeakHashMap;

@ReactModule(name = "AndroidProgressBar")
public final class ReactProgressBarViewManager extends BaseViewManager {
    public static final C18671VwU Companion = new Object();
    public static final String DEFAULT_STYLE = "Normal";
    public static final String PROP_ANIMATING = "animating";
    public static final String PROP_ATTR = "typeAttr";
    public static final String PROP_INDETERMINATE = "indeterminate";
    public static final String PROP_PROGRESS = "progress";
    public static final String PROP_STYLE = "styleAttr";
    public static final String REACT_CLASS = "AndroidProgressBar";
    public static final Object progressBarCtorLock = new Object();
    public final X62 delegate = new C19068WIz(this);
    public final WeakHashMap measuredStyles = new WeakHashMap();

    public ReactProgressBarViewManager() {
        super((QZK) null);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.U4S, android.widget.FrameLayout] */
    public U4S createViewInstance(QZL qzl) {
        0qQ.A0B(qzl, 0);
        ? frameLayout = new FrameLayout(qzl);
        frameLayout.A03 = true;
        frameLayout.A02 = true;
        return frameLayout;
    }

    public String getName() {
        return REACT_CLASS;
    }

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, C245103cK r11, float f2, C245103cK r13, float[] fArr) {
        AnonymousClass7TF.A1B(context, 0, readableMap2);
        int A00 = C18671VwU.A00(readableMap2.getString(PROP_STYLE));
        WeakHashMap weakHashMap = this.measuredStyles;
        Integer valueOf = Integer.valueOf(A00);
        Object obj = weakHashMap.get(valueOf);
        if (obj == null) {
            ProgressBar A01 = C18671VwU.A01(context, A00);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            A01.measure(makeMeasureSpec, makeMeasureSpec);
            obj = Pair.create(Integer.valueOf(A01.getMeasuredWidth()), Integer.valueOf(A01.getMeasuredHeight()));
            weakHashMap.put(valueOf, obj);
        }
        Pair pair = (Pair) obj;
        return C13990Tnq.A0C(W2U.A00((float) AnonymousClass7TE.A0M(pair.first)), W2U.A00((float) AnonymousClass7TE.A0M(pair.second)));
    }

    public void onAfterUpdateTransaction(U4S u4s) {
        0qQ.A0B(u4s, 0);
        u4s.A00();
    }

    @ReactProp(name = "animating")
    public void setAnimating(U4S u4s, boolean z) {
        0qQ.A0B(u4s, 0);
        u4s.A02 = z;
    }

    @ReactProp(customType = "Color", name = "color")
    public void setColor(U4S u4s, Integer num) {
        0qQ.A0B(u4s, 0);
        u4s.A01 = num;
    }

    @ReactProp(name = "indeterminate")
    public void setIndeterminate(U4S u4s, boolean z) {
        0qQ.A0B(u4s, 0);
        u4s.A03 = z;
    }

    @ReactProp(name = "progress")
    public void setProgress(U4S u4s, double d) {
        0qQ.A0B(u4s, 0);
        u4s.A00 = d;
    }

    @ReactProp(name = "styleAttr")
    public void setStyleAttr(U4S u4s, String str) {
        0qQ.A0B(u4s, 0);
        u4s.setStyle$xplat_js_react_native_github_packages_react_native_ReactAndroid_src_main_java_com_facebook_react_views_progressbar_progressbarAndroid(str);
    }

    public void setTestID(U4S u4s, String str) {
        0qQ.A0B(u4s, 0);
        super.setTestId(u4s, str);
    }

    @ReactProp(name = "typeAttr")
    public void setTypeAttr(U4S u4s, String str) {
    }

    public void updateExtraData(U4S u4s, Object obj) {
    }

    public X62 getDelegate() {
        return this.delegate;
    }

    public Class getShadowNodeClass() {
        return ProgressBarShadowNode.class;
    }

    public /* bridge */ /* synthetic */ void setTypeAttr(View view, String str) {
    }

    public /* bridge */ /* synthetic */ void updateExtraData(View view, Object obj) {
    }

    public ProgressBarShadowNode createShadowNodeInstance() {
        return new ProgressBarShadowNode();
    }
}
