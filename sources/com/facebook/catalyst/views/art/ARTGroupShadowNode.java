package com.facebook.catalyst.views.art;

import X.C16768V5b;
import android.graphics.RectF;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.annotations.ReactProp;

public class ARTGroupShadowNode extends ARTVirtualNode {
    public RectF A00;

    @ReactProp(name = "clipping")
    public void setClipping(ReadableArray readableArray) {
        float[] A002 = C16768V5b.A00(readableArray);
        if (A002 == null) {
            return;
        }
        if (A002.length == 4) {
            float f = A002[0];
            float f2 = A002[1];
            this.A00 = new RectF(f, f2, A002[2] + f, A002[3] + f2);
            A07();
            return;
        }
        throw new RuntimeException("Clipping should be array of length 4 (e.g. [x, y, width, height])");
    }
}
