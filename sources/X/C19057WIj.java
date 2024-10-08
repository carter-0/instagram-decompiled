package X;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.views.view.ReactViewManager;

/* renamed from: X.WIj  reason: case insensitive filesystem */
public final class C19057WIj implements Dynamic {
    public Object A00;

    public final void recycle() {
    }

    public static void A00(View view, BaseViewManager baseViewManager, Object obj) {
        baseViewManager.setAccessibilityLabelledBy(view, new C19057WIj(obj));
    }

    public static void A01(U3r u3r, ReactViewManager reactViewManager, Object obj, int i) {
        reactViewManager.setBorderRadius(u3r, i, (Dynamic) new C19057WIj(obj));
    }

    public final ReadableArray asArray() {
        return (ReadableArray) this.A00;
    }

    public final boolean asBoolean() {
        return AnonymousClass7TE.A1a(this.A00);
    }

    public final double asDouble() {
        return JTO.A00(this.A00);
    }

    public final int asInt() {
        return AnonymousClass7TE.A0M(this.A00);
    }

    public final ReadableMap asMap() {
        return (ReadableMap) this.A00;
    }

    public final String asString() {
        return (String) this.A00;
    }

    public final boolean isNull() {
        return DbW.A1a(this.A00);
    }

    public C19057WIj(Object obj) {
        this.A00 = obj;
    }

    public final ReadableType getType() {
        String A0y;
        if (isNull()) {
            return ReadableType.Null;
        }
        Object obj = this.A00;
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if (obj instanceof Number) {
            return ReadableType.Number;
        }
        if (obj instanceof String) {
            return ReadableType.String;
        }
        if (obj instanceof ReadableMap) {
            return ReadableType.Map;
        }
        if (obj instanceof ReadableArray) {
            return ReadableType.Array;
        }
        if (obj == null) {
            A0y = "<NULL object>";
        } else {
            A0y = C66581MXm.A0y(obj);
        }
        0I1.A03("ReactNative", 002.A0R("Unmapped object type ", A0y));
        return ReadableType.Null;
    }
}
