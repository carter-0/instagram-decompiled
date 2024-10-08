package com.facebook.react.modules.permissions;

import X.0I1;
import X.0I2;
import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C12209Sp8;
import X.C12210Sp9;
import X.C13717Tfi;
import X.C13904TjR;
import X.C13948Tm8;
import X.C9541Rce;
import X.Pxe;
import X.Pxf;
import X.QZK;
import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import com.facebook.fbreact.specs.NativePermissionsAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.PromiseImpl;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import java.util.ArrayList;

@ReactModule(name = "PermissionsAndroid")
public final class PermissionsModule extends NativePermissionsAndroidSpec {
    public static final C9541Rce Companion = new Object();
    public static final String ERROR_INVALID_ACTIVITY = "E_INVALID_ACTIVITY";
    public final String DENIED = "denied";
    public final String GRANTED = "granted";
    public final String NEVER_ASK_AGAIN = "never_ask_again";
    public final SparseArray callbacks = Pxe.A0L();
    public int requestCode;

    public void requestMultiplePermissions(ReadableArray readableArray, C13904TjR tjR) {
        AnonymousClass7TF.A1H(readableArray, tjR);
        WritableNativeMap A0U = Pxe.A0U();
        ArrayList A1C = AnonymousClass7TE.A1C();
        Context baseContext = Pxe.A0T(this).getBaseContext();
        int size = readableArray.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            String string = readableArray.getString(i2);
            if (baseContext.checkSelfPermission(string) == 0) {
                A0U.putString(string, this.GRANTED);
                i++;
            } else {
                A1C.add(string);
            }
        }
        if (readableArray.size() == i) {
            tjR.resolve(A0U);
            return;
        }
        try {
            C13717Tfi permissionAwareActivity = getPermissionAwareActivity();
            this.callbacks.put(this.requestCode, new C12210Sp9(tjR, A0U, this, A1C));
            permissionAwareActivity.EHZ(this, Pxf.A1a(A1C, 0), this.requestCode);
            this.requestCode++;
        } catch (IllegalStateException e) {
            ((PromiseImpl) tjR).reject(ERROR_INVALID_ACTIVITY, (String) null, e, (C13948Tm8) null);
        }
    }

    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        0qQ.A0B(iArr, 2);
        try {
            Callback callback = (Callback) this.callbacks.get(i);
            if (callback != null) {
                callback.invoke(iArr, getPermissionAwareActivity());
                this.callbacks.remove(i);
            } else {
                0I1.A09("PermissionsModule", "Unable to find callback with requestCode %d", new Object[]{Integer.valueOf(i)});
            }
            if (this.callbacks.size() == 0) {
                return true;
            }
            return false;
        } catch (IllegalStateException e) {
            Object[] objArr = new Object[0];
            0I2 r1 = 0I1.A00;
            if (!r1.isLoggable(6)) {
                return false;
            }
            r1.e("PermissionsModule", Pxf.A0m("Unexpected invocation of `onRequestPermissionsResult` with invalid current activity", objArr), e);
            return false;
        }
    }

    public PermissionsModule(QZK qzk) {
        super(qzk);
    }

    private final C13717Tfi getPermissionAwareActivity() {
        Activity A00 = Pxe.A0T(this).A00();
        if (A00 == null) {
            throw AnonymousClass7TE.A0z("Tried to use permissions API while not attached to an Activity.");
        } else if (A00 instanceof C13717Tfi) {
            return (C13717Tfi) A00;
        } else {
            throw AnonymousClass7TE.A0z("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
        }
    }

    public void checkPermission(String str, C13904TjR tjR) {
        AnonymousClass7TG.A1N(str, tjR);
        tjR.resolve(Boolean.valueOf(AnonymousClass7TF.A1Q(Pxe.A0T(this).getBaseContext().checkSelfPermission(str))));
    }

    public void requestPermission(String str, C13904TjR tjR) {
        AnonymousClass7TG.A1N(str, tjR);
        if (Pxe.A0T(this).getBaseContext().checkSelfPermission(str) == 0) {
            tjR.resolve(this.GRANTED);
            return;
        }
        try {
            C13717Tfi permissionAwareActivity = getPermissionAwareActivity();
            SparseArray sparseArray = this.callbacks;
            int i = this.requestCode;
            sparseArray.put(i, new C12209Sp8(tjR, this, str));
            permissionAwareActivity.EHZ(this, new String[]{str}, i);
            this.requestCode++;
        } catch (IllegalStateException e) {
            ((PromiseImpl) tjR).reject(ERROR_INVALID_ACTIVITY, (String) null, e, (C13948Tm8) null);
        }
    }

    public void shouldShowRequestPermissionRationale(String str, C13904TjR tjR) {
        AnonymousClass7TG.A1N(str, tjR);
        try {
            tjR.resolve(Boolean.valueOf(getPermissionAwareActivity().shouldShowRequestPermissionRationale(str)));
        } catch (IllegalStateException e) {
            ((PromiseImpl) tjR).reject(ERROR_INVALID_ACTIVITY, (String) null, e, (C13948Tm8) null);
        }
    }
}
