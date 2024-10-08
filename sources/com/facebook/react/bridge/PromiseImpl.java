package com.facebook.react.bridge;

import X.C13904TjR;
import X.C13948Tm8;
import X.Pxe;
import X.Pxf;
import X.Pxh;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public class PromiseImpl implements C13904TjR {
    public Callback mReject;
    public Callback mResolve;

    public void reject(Throwable th) {
        reject((String) null, (String) null, th, (C13948Tm8) null);
    }

    public void resolve(Object obj) {
        Callback callback = this.mResolve;
        if (callback != null) {
            Pxh.A1E(callback, obj);
            this.mResolve = null;
            this.mReject = null;
        }
    }

    public PromiseImpl(Callback callback, Callback callback2) {
        this.mResolve = callback;
        this.mReject = callback2;
    }

    public void reject(String str, String str2, Throwable th, C13948Tm8 tm8) {
        WritableNativeArray writableNativeArray;
        if (this.mReject == null) {
            this.mResolve = null;
            return;
        }
        WritableNativeMap A0U = Pxe.A0U();
        if (str == null) {
            str = "EUNSPECIFIED";
        }
        A0U.putString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, str);
        if (str2 == null) {
            if (th != null) {
                str2 = th.getMessage();
                if (str2 == null || str2.isEmpty()) {
                    str2 = Pxf.A0g(th);
                }
            } else {
                str2 = "Error not specified.";
            }
        }
        A0U.putString(DialogModule.KEY_MESSAGE, str2);
        A0U.putNull("userInfo");
        if (th != null) {
            A0U.putString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, Pxf.A0g(th));
            StackTraceElement[] stackTrace = th.getStackTrace();
            writableNativeArray = new WritableNativeArray();
            int i = 0;
            while (i < stackTrace.length && i < 50) {
                StackTraceElement stackTraceElement = stackTrace[i];
                WritableNativeMap A0U2 = Pxe.A0U();
                A0U2.putString("class", stackTraceElement.getClassName());
                A0U2.putString("file", stackTraceElement.getFileName());
                A0U2.putInt("lineNumber", stackTraceElement.getLineNumber());
                A0U2.putString("methodName", stackTraceElement.getMethodName());
                writableNativeArray.pushMap(A0U2);
                i++;
            }
        } else {
            writableNativeArray = new WritableNativeArray();
        }
        A0U.putArray("nativeStackAndroid", writableNativeArray);
        Pxh.A1E(this.mReject, A0U);
        this.mResolve = null;
        this.mReject = null;
    }
}
