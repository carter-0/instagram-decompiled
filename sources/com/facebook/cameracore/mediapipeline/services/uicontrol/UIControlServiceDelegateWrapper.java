package com.facebook.cameracore.mediapipeline.services.uicontrol;

import X.C364668ln;
import X.C368468sf;
import X.C371638yj;
import X.C371648yk;
import X.C371658yn;
import X.C40732AiJ;
import X.C40944Alq;
import X.C40945Alr;
import X.C40946Als;
import X.C40947Alt;
import X.C40948Alu;
import X.C41111AoX;
import X.C41243Aqf;
import com.facebook.native_bridge.NativeDataPromise;

public class UIControlServiceDelegateWrapper implements C371648yk {
    public final C371638yj mCommonDelegate;
    public final String mEffectId;
    public NativeDataPromise mPromise;

    public void enterTextEditMode(String str, boolean z, int i, int i2, NativeDataPromise nativeDataPromise) {
        this.mPromise = nativeDataPromise;
        C371638yj r2 = this.mCommonDelegate;
        r2.A00.post(new C41243Aqf(r2, this, str, i, i2, z));
    }

    public void configurePicker(PickerConfiguration pickerConfiguration) {
        C371638yj r2 = this.mCommonDelegate;
        r2.A00.post(new C40948Alu(pickerConfiguration, r2));
    }

    public void configureSlider(SliderConfiguration sliderConfiguration) {
        C371638yj r2 = this.mCommonDelegate;
        r2.A00.post(new C371658yn(sliderConfiguration, r2));
    }

    public void enterRawTextEditMode(String str, RawEditableTextListener rawEditableTextListener) {
        C371638yj r2 = this.mCommonDelegate;
        r2.A00.post(new C41111AoX(r2, rawEditableTextListener, str));
    }

    public void exitRawTextEditMode() {
        C371638yj r2 = this.mCommonDelegate;
        r2.A00.post(new C40732AiJ(r2));
    }

    public void hidePicker() {
        C371638yj r2 = this.mCommonDelegate;
        r2.A00.post(new C364668ln(r2));
    }

    public void hideSlider() {
        C371638yj r2 = this.mCommonDelegate;
        r2.A00.post(new C368468sf(r2));
    }

    public void onTextEditComplete(String str) {
        NativeDataPromise nativeDataPromise = this.mPromise;
        if (nativeDataPromise != null) {
            nativeDataPromise.setValue(new EditedText(str.trim()));
        }
    }

    public void setPickerSelectedIndex(int i) {
        C371638yj r2 = this.mCommonDelegate;
        r2.A00.post(new C40944Alq(r2, i));
    }

    public void setSliderValue(float f) {
        C371638yj r2 = this.mCommonDelegate;
        r2.A00.post(new C40946Als(r2, f));
    }

    public void showPicker(OnPickerItemSelectedListener onPickerItemSelectedListener) {
        C371638yj r2 = this.mCommonDelegate;
        r2.A00.post(new C40947Alt(r2, onPickerItemSelectedListener));
    }

    public void showSlider(OnAdjustableValueChangedListener onAdjustableValueChangedListener) {
        C371638yj r2 = this.mCommonDelegate;
        r2.A00.post(new C40945Alr(r2, onAdjustableValueChangedListener));
    }

    public UIControlServiceDelegateWrapper(String str, C371638yj r5) {
        this.mEffectId = str;
        this.mCommonDelegate = r5;
        r5.A00.post(new C371658yn(new SliderConfiguration(0, 0, (float[]) null, (byte[]) null), r5));
    }
}
