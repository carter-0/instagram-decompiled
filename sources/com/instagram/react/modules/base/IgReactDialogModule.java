package com.instagram.react.modules.base;

import X.AnonymousClass0fN;
import X.AnonymousClass7TE;
import X.C358248ab;
import X.C51967G9n;
import X.Pxe;
import X.QZK;
import X.SVI;
import android.app.Activity;
import android.app.Dialog;
import com.facebook.fbreact.specs.NativeIgDialogSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = "IgDialog")
public class IgReactDialogModule extends NativeIgDialogSpec {
    public static final String CANCELABLE_KEY = "IS_CANCELABLE";
    public static final String CANCELED_ON_TOUCH_OUTSIDE_KEY = "CANCELED_ON_TOUCH_OUTSIDE";
    public static final String GRAVITY_BOTTOM = "BOTTOM";
    public static final String GRAVITY_CENTER = "CENTER";
    public static final String GRAVITY_TOP = "TOP";
    public static final String MODULE_NAME = "IgDialog";
    public static final String NEGATIVE_BUTTON_KEY = "NEGATIVE_BUTTON";
    public static final String NEGATIVE_BUTTON_TEXT_KEY = "NEGATIVE_BUTTON_TEXT";
    public static final String POSITIVE_BUTTON_KEY = "POSITIVE_BUTTON";
    public static final String POSITIVE_BUTTON_TEXT_KEY = "POSITIVE_BUTTON_TEXT";

    public String getName() {
        return "IgDialog";
    }

    public Map getTypedExportedConstants() {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put(CANCELABLE_KEY, CANCELABLE_KEY);
        A1E.put(CANCELED_ON_TOUCH_OUTSIDE_KEY, CANCELED_ON_TOUCH_OUTSIDE_KEY);
        A1E.put(NEGATIVE_BUTTON_TEXT_KEY, NEGATIVE_BUTTON_TEXT_KEY);
        A1E.put(NEGATIVE_BUTTON_KEY, -2);
        A1E.put(POSITIVE_BUTTON_KEY, C51967G9n.A0j());
        A1E.put(POSITIVE_BUTTON_TEXT_KEY, POSITIVE_BUTTON_TEXT_KEY);
        A1E.put("TOP", 48);
        A1E.put("CENTER", 17);
        A1E.put("BOTTOM", 80);
        return A1E;
    }

    public Dialog showDialogHelper(String str, String str2, ReadableMap readableMap, Callback callback, Callback callback2) {
        Activity A00 = Pxe.A0T(this).A00();
        if (A00 == null) {
            return null;
        }
        C358248ab r3 = new C358248ab(A00);
        if (str != null && !str.isEmpty()) {
            r3.A05 = str;
        }
        if (str2 != null && !str2.isEmpty()) {
            r3.A0q(str2);
        }
        if (readableMap.hasKey(CANCELABLE_KEY)) {
            r3.A0r(readableMap.getBoolean(CANCELABLE_KEY));
        }
        if (readableMap.hasKey(CANCELED_ON_TOUCH_OUTSIDE_KEY)) {
            r3.A0s(readableMap.getBoolean(CANCELED_ON_TOUCH_OUTSIDE_KEY));
        }
        SVI svi = new SVI(callback2, callback);
        if (readableMap.hasKey(NEGATIVE_BUTTON_TEXT_KEY)) {
            r3.A0b(svi, readableMap.getString(NEGATIVE_BUTTON_TEXT_KEY));
        }
        if (readableMap.hasKey(POSITIVE_BUTTON_TEXT_KEY)) {
            r3.A0c(svi, readableMap.getString(POSITIVE_BUTTON_TEXT_KEY));
        }
        r3.A0f(svi);
        Dialog A02 = r3.A02();
        AnonymousClass0fN.A00(A02);
        return A02;
    }

    public IgReactDialogModule(QZK qzk) {
        super(qzk);
    }

    public void showDialog(String str, String str2, ReadableMap readableMap, Callback callback, Callback callback2) {
        showDialogHelper(str, str2, readableMap, callback, callback2);
    }
}
