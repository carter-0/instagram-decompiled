package com.facebook.react.views.text;

import X.QZL;
import X.U6K;
import android.view.View;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewManager;

@ReactModule(name = "RCTRawText")
public class ReactRawTextManager extends ViewManager {
    public static final String REACT_CLASS = "RCTRawText";

    public String getName() {
        return REACT_CLASS;
    }

    public void updateExtraData(View view, Object obj) {
    }

    public U6K createViewInstance(QZL qzl) {
        throw new IllegalStateException("Attempt to create a native view for RCTRawText");
    }

    public Class getShadowNodeClass() {
        return ReactRawTextShadowNode.class;
    }

    public View prepareToRecycleView(QZL qzl, View view) {
        throw new IllegalStateException("Attempt to recycle a native view for RCTRawText");
    }

    public ReactRawTextShadowNode createShadowNodeInstance() {
        return new ReactRawTextShadowNode();
    }
}
