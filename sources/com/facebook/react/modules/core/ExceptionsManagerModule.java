package com.facebook.react.modules.core;

import X.0I1;
import X.0qQ;
import X.C12220SpN;
import X.C13946Tlt;
import X.JTP;
import X.QZK;
import X.S9G;
import X.SMN;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.fbreact.specs.NativeExceptionsManagerSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.dialog.DialogModule;

@ReactModule(name = "ExceptionsManager")
public class ExceptionsManagerModule extends NativeExceptionsManagerSpec {
    public final C13946Tlt devSupportManager;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExceptionsManagerModule(C13946Tlt tlt) {
        super((QZK) null);
        0qQ.A0B(tlt, 1);
        this.devSupportManager = tlt;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Throwable, com.facebook.react.common.JavascriptException, java.lang.RuntimeException] */
    public void reportException(ReadableMap readableMap) {
        boolean z;
        0qQ.A0B(readableMap, 0);
        String string = readableMap.getString(DialogModule.KEY_MESSAGE);
        if (string == null) {
            string = "";
        }
        ReadableArray array = readableMap.getArray("stack");
        if (array == null) {
            array = new WritableNativeArray();
        }
        if (readableMap.hasKey("isFatal")) {
            z = readableMap.getBoolean("isFatal");
        } else {
            z = false;
        }
        String A00 = S9G.A00(readableMap);
        String A002 = SMN.A00(string, array);
        if (!z) {
            0I1.A03("ReactNative", A002);
            return;
        }
        ? runtimeException = new RuntimeException(A002);
        runtimeException.extraDataAsJson = A00;
        throw runtimeException;
    }

    public void reportFatalException(String str, ReadableArray readableArray, double d) {
        C12220SpN spN = new C12220SpN();
        spN.putString(DialogModule.KEY_MESSAGE, str);
        spN.putArray("stack", readableArray);
        spN.A01(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (int) d);
        JTP.A1R("isFatal", spN.A00, true);
        reportException(spN);
    }

    public void reportSoftException(String str, ReadableArray readableArray, double d) {
        C12220SpN spN = new C12220SpN();
        spN.putString(DialogModule.KEY_MESSAGE, str);
        spN.putArray("stack", readableArray);
        spN.A01(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (int) d);
        JTP.A1R("isFatal", spN.A00, false);
        reportException(spN);
    }

    public void dismissRedbox() {
    }

    public void updateExceptionMessage(String str, ReadableArray readableArray, double d) {
    }
}
