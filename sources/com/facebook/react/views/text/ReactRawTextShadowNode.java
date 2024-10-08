package com.facebook.react.views.text;

import X.002;
import X.0Sd;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.annotations.ReactProp;

public class ReactRawTextShadowNode extends ReactShadowNodeImpl {
    public String A00 = null;

    @ReactProp(name = "text")
    public void setText(String str) {
        this.A00 = str;
        A07();
    }

    public final String toString() {
        String str = this.A0E;
        0Sd.A00(str);
        return 002.A0u(str, " [text: ", this.A00, "]");
    }
}
