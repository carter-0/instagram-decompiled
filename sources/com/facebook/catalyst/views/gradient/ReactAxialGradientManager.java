package com.facebook.catalyst.views.gradient;

import X.AnonymousClass00P;
import X.C18099VlT;
import X.C19068WIz;
import X.C244163ak;
import X.QZK;
import X.QZL;
import X.SPt;
import X.U38;
import X.W2U;
import X.X62;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;

@ReactModule(name = "RCTAxialGradientView")
public class ReactAxialGradientManager extends SimpleViewManager {
    public static final String REACT_CLASS = "RCTAxialGradientView";
    public final X62 mDelegate = new C19068WIz(this);

    public ReactAxialGradientManager() {
        super((QZK) null);
    }

    public String getName() {
        return REACT_CLASS;
    }

    private void throwBorderRadiusNotImplementedException() {
        throw new RuntimeException("Border radius type not yet implemented!");
    }

    public U38 createViewInstance(QZL qzl) {
        return new U38(qzl);
    }

    public X62 getDelegate() {
        return this.mDelegate;
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(U38 u38, int i, float f) {
        if (i == 0) {
            setBorderRadius(u38, f);
        } else {
            throwBorderRadiusNotImplementedException();
            throw AnonymousClass00P.createAndThrow();
        }
    }

    @ReactProp(customType = "ColorArray", name = "colors")
    public void setColors(U38 u38, ReadableArray readableArray) {
        int i;
        if (readableArray == null || readableArray.size() < 2) {
            throw new RuntimeException("The gradient must contain at least 2 colors");
        }
        int[] iArr = new int[readableArray.size()];
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            if (readableArray.getType(i2) == ReadableType.Map) {
                i = SPt.A00(u38.getContext(), readableArray.getMap(i2)).intValue();
            } else {
                i = readableArray.getInt(i2);
            }
            iArr[i2] = i;
        }
        u38.A08 = iArr;
    }

    @ReactProp(name = "locations")
    public void setLocations(U38 u38, ReadableArray readableArray) {
        float[] fArr;
        if (readableArray == null) {
            fArr = null;
        } else {
            fArr = new float[readableArray.size()];
            for (int i = 0; i < readableArray.size(); i++) {
                fArr[i] = (float) readableArray.getDouble(i);
            }
        }
        u38.A07 = fArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: setBorderRadiusInternal */
    public void setBorderRadius(U38 u38, float f) {
        if (!C244163ak.A00(f)) {
            f = W2U.A01(f);
        }
        if (!C18099VlT.A00(u38.A00, f)) {
            u38.A00 = f;
        }
    }

    public void setBorderBottomLeftRadius(U38 u38, float f) {
        throwBorderRadiusNotImplementedException();
        throw AnonymousClass00P.createAndThrow();
    }

    public void setBorderBottomRightRadius(U38 u38, float f) {
        throwBorderRadiusNotImplementedException();
        throw AnonymousClass00P.createAndThrow();
    }

    public void setBorderTopLeftRadius(U38 u38, float f) {
        throwBorderRadiusNotImplementedException();
        throw AnonymousClass00P.createAndThrow();
    }

    public void setBorderTopRightRadius(U38 u38, float f) {
        throwBorderRadiusNotImplementedException();
        throw AnonymousClass00P.createAndThrow();
    }

    @ReactProp(name = "endX")
    public void setEndX(U38 u38, float f) {
        if (!Float.isNaN(f)) {
            u38.A01 = f;
            return;
        }
        throw new RuntimeException("Invalid float for endX");
    }

    @ReactProp(name = "endY")
    public void setEndY(U38 u38, float f) {
        if (!Float.isNaN(f)) {
            u38.A02 = f;
            return;
        }
        throw new RuntimeException("Invalid float for endY");
    }

    @ReactProp(name = "startX")
    public void setStartX(U38 u38, float f) {
        if (!Float.isNaN(f)) {
            u38.A03 = f;
            return;
        }
        throw new RuntimeException("Invalid float for startX");
    }

    @ReactProp(name = "startY")
    public void setStartY(U38 u38, float f) {
        if (!Float.isNaN(f)) {
            u38.A04 = f;
            return;
        }
        throw new RuntimeException("Invalid float for startY");
    }

    public void onAfterUpdateTransaction(U38 u38) {
        u38.invalidate();
    }

    public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
        view.invalidate();
    }

    public /* bridge */ /* synthetic */ void setBorderBottomLeftRadius(View view, float f) {
        throwBorderRadiusNotImplementedException();
        throw AnonymousClass00P.createAndThrow();
    }

    public /* bridge */ /* synthetic */ void setBorderBottomRightRadius(View view, float f) {
        throwBorderRadiusNotImplementedException();
        throw AnonymousClass00P.createAndThrow();
    }

    public /* bridge */ /* synthetic */ void setBorderTopLeftRadius(View view, float f) {
        throwBorderRadiusNotImplementedException();
        throw AnonymousClass00P.createAndThrow();
    }

    public /* bridge */ /* synthetic */ void setBorderTopRightRadius(View view, float f) {
        throwBorderRadiusNotImplementedException();
        throw AnonymousClass00P.createAndThrow();
    }

    public void setBorderRadius(U38 u38, float f) {
        setBorderRadius(u38, f);
    }
}
