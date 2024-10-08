package com.facebook.fbreact.views.picker;

import X.C19068WIz;
import X.QZK;
import X.QZL;
import X.U6E;
import X.X62;
import android.view.View;
import android.widget.Spinner;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.annotations.ReactProp;

@ReactModule(name = "AndroidDropdownPicker")
public class ReactDropdownPickerManager extends ReactPickerManager {
    public static final String REACT_CLASS = "AndroidDropdownPicker";
    public final X62 mDelegate = new C19068WIz(this);

    public ReactDropdownPickerManager() {
        super((QZK) null);
    }

    public U6E createViewInstance(QZL qzl) {
        return new U6E(qzl, 1);
    }

    public String getName() {
        return REACT_CLASS;
    }

    public X62 getDelegate() {
        return this.mDelegate;
    }

    @ReactProp(customType = "Color", name = "color")
    public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
        ((U6E) view).A02 = num;
    }

    @ReactProp(name = "items")
    public /* bridge */ /* synthetic */ void setItems(View view, ReadableArray readableArray) {
        super.setItems((U6E) view, readableArray);
    }

    @ReactProp(name = "prompt")
    public /* bridge */ /* synthetic */ void setPrompt(View view, String str) {
        ((Spinner) view).setPrompt(str);
    }

    @ReactProp(name = "selected")
    public /* bridge */ /* synthetic */ void setSelected(View view, int i) {
        ((U6E) view).setStagedSelection(i);
    }

    public void setBackgroundColor(U6E u6e, int i) {
        u6e.A01 = Integer.valueOf(i);
    }

    @ReactProp(defaultBoolean = true, name = "enabled")
    public /* bridge */ /* synthetic */ void setEnabled(View view, boolean z) {
        view.setEnabled(z);
    }
}
