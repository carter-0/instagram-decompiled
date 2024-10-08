package com.instagram.react.views.image;

import X.002;
import X.C13991Tnr;
import X.C15852Ujc;
import X.Dba;
import X.QZK;
import X.QZL;
import X.W2U;
import android.widget.ImageView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import java.util.HashMap;
import java.util.Map;

public class IgReactImageManager extends SimpleViewManager {
    public IgReactImageManager() {
        super((QZK) null);
    }

    public String getName() {
        return "RCTImageView";
    }

    public C15852Ujc createViewInstance(QZL qzl) {
        return new C15852Ujc(qzl);
    }

    @ReactProp(name = "resizeMode")
    public void setResizeMode(C15852Ujc ujc, String str) {
        ImageView.ScaleType scaleType;
        if ("contain".equals(str)) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        } else {
            if (!"cover".equals(str)) {
                if ("stretch".equals(str)) {
                    scaleType = ImageView.ScaleType.FIT_XY;
                } else if (!"center".equals(str) && str != null) {
                    throw new RuntimeException(002.A0S("Invalid resize mode: '", str, '\''));
                }
            }
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        ujc.setScaleTypeNoUpdate(scaleType);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Ujc, android.widget.ImageView] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.facebook.react.uimanager.annotations.ReactProp(customType = "Color", name = "tintColor")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setTintColor(X.C15852Ujc r2, java.lang.Integer r3) {
        /*
            r1 = this;
            if (r3 != 0) goto L_0x0006
            r2.clearColorFilter()
            return
        L_0x0006:
            int r0 = r3.intValue()
            r2.setColorFilter(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.react.views.image.IgReactImageManager.setTintColor(X.Ujc, java.lang.Integer):void");
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        Map exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        HashMap A0f = Dba.A0f("registrationName", "onError");
        HashMap A0f2 = Dba.A0f("registrationName", "onLoad");
        HashMap A0f3 = Dba.A0f("registrationName", "onLoadEnd");
        HashMap A0f4 = Dba.A0f("registrationName", "onLoadStart");
        HashMap A0p = C13991Tnr.A0p("topError", A0f, "topLoad", A0f2);
        A0p.put("topLoadEnd", A0f3);
        A0p.put("topLoadStart", A0f4);
        exportedCustomDirectEventTypeConstants.putAll(A0p);
        return exportedCustomDirectEventTypeConstants;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Ujc, android.view.View] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAfterUpdateTransaction(X.C15852Ujc r1) {
        /*
            r0 = this;
            super.onAfterUpdateTransaction(r1)
            r1.A0H()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.react.views.image.IgReactImageManager.onAfterUpdateTransaction(X.Ujc):void");
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(C15852Ujc ujc, int i, float f) {
        if (!Float.isNaN(f)) {
            f = W2U.A01(f);
        }
        if (i == 0) {
            ujc.setBorderRadius(f);
        }
    }

    @ReactProp(name = "shouldNotifyLoadEvents")
    public void setShouldNotifyLoadEvents(C15852Ujc ujc, boolean z) {
        ujc.setShouldNotifyLoadEvents(z);
    }

    @ReactProp(name = "src")
    public void setSource(C15852Ujc ujc, ReadableArray readableArray) {
        ujc.setSource(readableArray);
    }
}
