package com.facebook.react.modules.dialog;

import X.0I1;
import X.0SM;
import X.AnonymousClass7TE;
import X.C11184SEk;
import X.C13050TJg;
import X.C13773Tgo;
import X.C18773W0w;
import X.C51967G9n;
import X.Pxe;
import X.Pxh;
import X.QZK;
import X.S9A;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = "DialogManagerAndroid")
public class DialogModule extends NativeDialogManagerAndroidSpec implements C13773Tgo {
    public static final String ACTION_BUTTON_CLICKED = "buttonClicked";
    public static final String ACTION_DISMISSED = "dismissed";
    public static final Map CONSTANTS;
    public static final String FRAGMENT_TAG = "com.facebook.catalyst.react.dialog.DialogModule";
    public static final String KEY_BUTTON_NEGATIVE = "buttonNegative";
    public static final String KEY_BUTTON_NEUTRAL = "buttonNeutral";
    public static final String KEY_BUTTON_POSITIVE = "buttonPositive";
    public static final String KEY_CANCELABLE = "cancelable";
    public static final String KEY_ITEMS = "items";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_TITLE = "title";
    public boolean mIsInForeground;

    public void onHostDestroy() {
    }

    public void onHostPause() {
        this.mIsInForeground = false;
    }

    public void onHostResume() {
        this.mIsInForeground = true;
        C11184SEk fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper != null) {
            S9A.A00(fragmentManagerHelper.A02.mIsInForeground, "showPendingAlert() called in background");
            if (fragmentManagerHelper.A00 != null) {
                C11184SEk.A00(fragmentManagerHelper);
                ((0SM) fragmentManagerHelper.A00).A0B(fragmentManagerHelper.A01, FRAGMENT_TAG);
                fragmentManagerHelper.A00 = null;
                return;
            }
            return;
        }
        0I1.A00(DialogModule.class, "onHostResume called but no FragmentManager found");
    }

    public Map getTypedExportedConstants() {
        return CONSTANTS;
    }

    static {
        Integer A0j = C51967G9n.A0j();
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put(ACTION_BUTTON_CLICKED, ACTION_BUTTON_CLICKED);
        A1E.put(ACTION_DISMISSED, ACTION_DISMISSED);
        A1E.put(KEY_BUTTON_POSITIVE, A0j);
        A1E.put(KEY_BUTTON_NEGATIVE, -2);
        A1E.put(KEY_BUTTON_NEUTRAL, -3);
        CONSTANTS = A1E;
    }

    private C11184SEk getFragmentManagerHelper() {
        FragmentActivity A00 = Pxe.A0T(this).A00();
        if (A00 == null || !(A00 instanceof FragmentActivity)) {
            return null;
        }
        return new C11184SEk(A00.getSupportFragmentManager(), this);
    }

    public void initialize() {
        Pxe.A0T(this).A09(this);
    }

    public void invalidate() {
        Pxe.A0T(this).A0A(this);
    }

    public void showAlert(ReadableMap readableMap, Callback callback, Callback callback2) {
        C11184SEk fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper == null) {
            Pxh.A1E(callback, "Tried to show an alert while not attached to an Activity");
            return;
        }
        Bundle A0a = AnonymousClass7TE.A0a();
        if (readableMap.hasKey(KEY_TITLE)) {
            A0a.putString(KEY_TITLE, readableMap.getString(KEY_TITLE));
        }
        if (readableMap.hasKey(KEY_MESSAGE)) {
            A0a.putString(KEY_MESSAGE, readableMap.getString(KEY_MESSAGE));
        }
        if (readableMap.hasKey(KEY_BUTTON_POSITIVE)) {
            A0a.putString("button_positive", readableMap.getString(KEY_BUTTON_POSITIVE));
        }
        if (readableMap.hasKey(KEY_BUTTON_NEGATIVE)) {
            A0a.putString("button_negative", readableMap.getString(KEY_BUTTON_NEGATIVE));
        }
        if (readableMap.hasKey(KEY_BUTTON_NEUTRAL)) {
            A0a.putString("button_neutral", readableMap.getString(KEY_BUTTON_NEUTRAL));
        }
        if (readableMap.hasKey(KEY_ITEMS)) {
            ReadableArray array = readableMap.getArray(KEY_ITEMS);
            CharSequence[] charSequenceArr = new CharSequence[array.size()];
            for (int i = 0; i < array.size(); i++) {
                charSequenceArr[i] = array.getString(i);
            }
            A0a.putCharSequenceArray(KEY_ITEMS, charSequenceArr);
        }
        if (readableMap.hasKey(KEY_CANCELABLE)) {
            A0a.putBoolean(KEY_CANCELABLE, readableMap.getBoolean(KEY_CANCELABLE));
        }
        C18773W0w.A01(new C13050TJg(A0a, callback2, fragmentManagerHelper, this));
    }

    public DialogModule(QZK qzk) {
        super(qzk);
    }
}
