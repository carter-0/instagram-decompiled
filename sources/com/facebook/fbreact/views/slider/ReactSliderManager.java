package com.facebook.fbreact.views.slider;

import X.0Sd;
import X.AnonymousClass2T1;
import X.C13990Tnq;
import X.C13991Tnr;
import X.C14750U7h;
import X.C19068WIz;
import X.C245003c8;
import X.C245103cK;
import X.C245193cT;
import X.Dba;
import X.QZK;
import X.QZL;
import X.U6D;
import X.W2U;
import X.WD6;
import X.X62;
import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.SeekBar;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.HashMap;
import java.util.Map;

public class ReactSliderManager extends SimpleViewManager {
    public static final SeekBar.OnSeekBarChangeListener ON_CHANGE_LISTENER = new WD6();
    public static final String REACT_CLASS = "RCTSlider";
    public static final int STYLE = 16842875;
    public final X62 mDelegate = new C19068WIz(this);

    public class ReactSliderShadowNode extends LayoutShadowNode implements AnonymousClass2T1 {
        public int A00;
        public int A01;
        public boolean A02;

        public final long Cnu(C245103cK r4, C245103cK r5, C245003c8 r6, float f, float f2) {
            if (!this.A02) {
                QZL qzl = this.A0A;
                0Sd.A00(qzl);
                U6D u6d = new U6D(qzl);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
                u6d.measure(makeMeasureSpec, makeMeasureSpec);
                this.A01 = u6d.getMeasuredWidth();
                this.A00 = u6d.getMeasuredHeight();
                this.A02 = true;
            }
            return C245193cT.A00(this.A01, this.A00);
        }

        public ReactSliderShadowNode() {
            A09(this);
        }
    }

    public ReactSliderManager() {
        super((QZK) null);
    }

    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = "disabled")
    public void setDisabled(U6D u6d, boolean z) {
    }

    @ReactProp(customType = "ImageSource", name = "maximumTrackImage")
    public void setMaximumTrackImage(U6D u6d, ReadableMap readableMap) {
    }

    @ReactProp(customType = "ImageSource", name = "minimumTrackImage")
    public void setMinimumTrackImage(U6D u6d, ReadableMap readableMap) {
    }

    @ReactProp(customType = "ImageSource", name = "thumbImage")
    public void setThumbImage(U6D u6d, ReadableMap readableMap) {
    }

    @ReactProp(customType = "ImageSource", name = "trackImage")
    public void setTrackImage(U6D u6d, ReadableMap readableMap) {
    }

    @ReactProp(defaultDouble = 0.0d, name = "value")
    public void setValue(U6D u6d, double d) {
        u6d.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) null);
        u6d.setValue(d);
        u6d.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }

    public /* bridge */ /* synthetic */ void addEventEmitters(QZL qzl, View view) {
        ((SeekBar) view).setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }

    public LayoutShadowNode createShadowNodeInstance() {
        return new ReactSliderShadowNode();
    }

    public U6D createViewInstance(QZL qzl) {
        U6D u6d = new U6D(qzl);
        C14750U7h.A02(u6d, u6d.getImportantForAccessibility(), u6d.isFocusable());
        return u6d;
    }

    public X62 getDelegate() {
        return this.mDelegate;
    }

    public Class getShadowNodeClass() {
        return ReactSliderShadowNode.class;
    }

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, C245103cK r9, float f2, C245103cK r11, float[] fArr) {
        U6D u6d = new U6D(context);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
        u6d.measure(makeMeasureSpec, makeMeasureSpec);
        return C13990Tnq.A0C(W2U.A00((float) u6d.getMeasuredWidth()), W2U.A00((float) u6d.getMeasuredHeight()));
    }

    @ReactProp(defaultDouble = 1.0d, name = "maximumValue")
    public /* bridge */ /* synthetic */ void setMaximumValue(View view, double d) {
        ((U6D) view).setMaxValue(d);
    }

    @ReactProp(defaultDouble = 0.0d, name = "minimumValue")
    public /* bridge */ /* synthetic */ void setMinimumValue(View view, double d) {
        ((U6D) view).setMinValue(d);
    }

    @ReactProp(defaultDouble = 0.0d, name = "step")
    public /* bridge */ /* synthetic */ void setStep(View view, double d) {
        ((U6D) view).setStep(d);
    }

    public Map getExportedCustomBubblingEventTypeConstants() {
        Map exportedCustomBubblingEventTypeConstants = super.getExportedCustomBubblingEventTypeConstants();
        HashMap hashMap = new HashMap();
        hashMap.put("topValueChange", Dba.A0f("phasedRegistrationNames", C13991Tnr.A0p("bubbled", "onValueChange", "captured", "onValueChangeCapture")));
        exportedCustomBubblingEventTypeConstants.putAll(hashMap);
        return exportedCustomBubblingEventTypeConstants;
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        Map exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        exportedCustomDirectEventTypeConstants.putAll(Dba.A0f("topSlidingComplete", Dba.A0f("registrationName", "onSlidingComplete")));
        return exportedCustomDirectEventTypeConstants;
    }

    @ReactProp(name = "disabled")
    public /* bridge */ /* synthetic */ void setDisabled(View view, boolean z) {
    }

    @ReactProp(defaultBoolean = true, name = "enabled")
    public void setEnabled(U6D u6d, boolean z) {
        u6d.setEnabled(z);
    }

    @ReactProp(customType = "ImageSource", name = "maximumTrackImage")
    public /* bridge */ /* synthetic */ void setMaximumTrackImage(View view, ReadableMap readableMap) {
    }

    @ReactProp(customType = "Color", name = "maximumTrackTintColor")
    public void setMaximumTrackTintColor(U6D u6d, Integer num) {
        C13991Tnr.A0t(((LayerDrawable) u6d.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908288), num);
    }

    @ReactProp(customType = "ImageSource", name = "minimumTrackImage")
    public /* bridge */ /* synthetic */ void setMinimumTrackImage(View view, ReadableMap readableMap) {
    }

    @ReactProp(customType = "Color", name = "minimumTrackTintColor")
    public void setMinimumTrackTintColor(U6D u6d, Integer num) {
        C13991Tnr.A0t(((LayerDrawable) u6d.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908301), num);
    }

    public void setTestID(U6D u6d, String str) {
        super.setTestId(u6d, str);
    }

    @ReactProp(customType = "ImageSource", name = "thumbImage")
    public /* bridge */ /* synthetic */ void setThumbImage(View view, ReadableMap readableMap) {
    }

    @ReactProp(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(U6D u6d, Integer num) {
        C13991Tnr.A0t(u6d.getThumb(), num);
    }

    @ReactProp(customType = "ImageSource", name = "trackImage")
    public /* bridge */ /* synthetic */ void setTrackImage(View view, ReadableMap readableMap) {
    }

    public void addEventEmitters(QZL qzl, U6D u6d) {
        u6d.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }

    @ReactProp(defaultBoolean = true, name = "enabled")
    public /* bridge */ /* synthetic */ void setEnabled(View view, boolean z) {
        view.setEnabled(z);
    }

    @ReactProp(defaultDouble = 1.0d, name = "maximumValue")
    public void setMaximumValue(U6D u6d, double d) {
        u6d.setMaxValue(d);
    }

    @ReactProp(defaultDouble = 0.0d, name = "minimumValue")
    public void setMinimumValue(U6D u6d, double d) {
        u6d.setMinValue(d);
    }

    @ReactProp(defaultDouble = 0.0d, name = "step")
    public void setStep(U6D u6d, double d) {
        u6d.setStep(d);
    }

    public /* bridge */ /* synthetic */ void setTestID(View view, String str) {
        super.setTestId(view, str);
    }
}
