package com.facebook.react.views.text;

import X.AnonymousClass7TE;
import X.QZK;
import X.QZL;
import android.view.View;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BaseViewManager;

@ReactModule(name = "RCTVirtualText")
public class ReactVirtualTextViewManager extends BaseViewManager {
    public static final String REACT_CLASS = "RCTVirtualText";

    public ReactVirtualTextViewManager() {
        super((QZK) null);
    }

    public String getName() {
        return REACT_CLASS;
    }

    public void updateExtraData(View view, Object obj) {
    }

    public View createViewInstance(QZL qzl) {
        throw AnonymousClass7TE.A0z("Attempt to create a native view for RCTVirtualText");
    }

    public Class getShadowNodeClass() {
        return ReactVirtualTextShadowNode.class;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.react.views.text.ReactBaseTextShadowNode, com.facebook.react.views.text.ReactVirtualTextShadowNode] */
    public ReactVirtualTextShadowNode createShadowNodeInstance() {
        return new ReactBaseTextShadowNode();
    }
}
