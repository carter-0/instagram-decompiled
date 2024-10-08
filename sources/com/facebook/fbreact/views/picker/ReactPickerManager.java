package com.facebook.fbreact.views.picker;

import X.0fE;
import X.C13990Tnq;
import X.C13991Tnr;
import X.C17306VQh;
import X.Dba;
import X.QZK;
import X.QZL;
import X.U45;
import X.U6E;
import X.WH7;
import android.content.res.ColorStateList;
import android.widget.AdapterView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ReactPickerManager extends SimpleViewManager {
    public ReactPickerManager() {
        super((QZK) null);
    }

    public void receiveCommand(U6E u6e, String str, ReadableArray readableArray) {
        if (str.equals("setNativeSelectedPosition") && readableArray != null) {
            u6e.setImmediateSelection(readableArray.getInt(0));
        }
    }

    @ReactProp(name = "items")
    public void setItems(U6E u6e, ReadableArray readableArray) {
        ArrayList arrayList;
        if (readableArray == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(readableArray.size());
            for (int i = 0; i < readableArray.size(); i++) {
                arrayList.add(new C17306VQh(readableArray.getMap(i)));
            }
        }
        u6e.A05 = arrayList;
    }

    public void addEventEmitters(QZL qzl, U6E u6e) {
        u6e.A00 = new WH7(u6e, C13990Tnq.A0K(u6e, qzl));
    }

    public Map getExportedCustomBubblingEventTypeConstants() {
        Map exportedCustomBubblingEventTypeConstants = super.getExportedCustomBubblingEventTypeConstants();
        HashMap hashMap = new HashMap();
        hashMap.put("topSelect", Dba.A0f("phasedRegistrationNames", C13991Tnr.A0p("bubbled", "onSelect", "captured", "onSelectCapture")));
        exportedCustomBubblingEventTypeConstants.putAll(hashMap);
        return exportedCustomBubblingEventTypeConstants;
    }

    public void onAfterUpdateTransaction(U6E u6e) {
        int intValue;
        super.onAfterUpdateTransaction(u6e);
        u6e.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) null);
        U45 u45 = (U45) u6e.getAdapter();
        int selectedItemPosition = u6e.getSelectedItemPosition();
        List list = u6e.A05;
        if (!(list == null || list == u6e.A04)) {
            u6e.A04 = list;
            u6e.A05 = null;
            if (u45 == null) {
                u45 = new U45(u6e.getContext(), list);
                u6e.setAdapter(u45);
            } else {
                u45.clear();
                u45.addAll(u6e.A04);
                0fE.A00(u45, 1142137060);
            }
        }
        Integer num = u6e.A03;
        if (!(num == null || (intValue = num.intValue()) == selectedItemPosition)) {
            u6e.setSelection(intValue, false);
            u6e.A03 = null;
        }
        Integer num2 = u6e.A02;
        if (!(num2 == null || u45 == null || num2 == u45.A01)) {
            u45.A01 = num2;
            0fE.A00(u45, 1237627749);
            u6e.setBackgroundTintList(ColorStateList.valueOf(u6e.A02.intValue()));
            u6e.A02 = null;
        }
        Integer num3 = u6e.A01;
        if (!(num3 == null || u45 == null || num3 == u45.A00)) {
            u45.A00 = num3;
            0fE.A00(u45, -600922149);
            u6e.A01 = null;
        }
        u6e.setOnItemSelectedListener(u6e.A07);
    }

    @ReactProp(customType = "Color", name = "color")
    public void setColor(U6E u6e, Integer num) {
        u6e.A02 = num;
    }

    @ReactProp(defaultBoolean = true, name = "enabled")
    public void setEnabled(U6E u6e, boolean z) {
        u6e.setEnabled(z);
    }

    @ReactProp(name = "prompt")
    public void setPrompt(U6E u6e, String str) {
        u6e.setPrompt(str);
    }

    @ReactProp(name = "selected")
    public void setSelected(U6E u6e, int i) {
        u6e.setStagedSelection(i);
    }
}
