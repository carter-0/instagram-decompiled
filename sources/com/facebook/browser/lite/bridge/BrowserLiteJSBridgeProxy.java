package com.facebook.browser.lite.bridge;

import X.0qQ;
import X.AnonymousClass00P;
import X.C10947S2f;
import X.QLA;
import X.SWS;
import X.TK4;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.browser.lite.webview.SystemWebView;

public class BrowserLiteJSBridgeProxy implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWS.A00(14);
    public Bundle A00;
    public String A01;
    public QLA A02;
    public String A03;

    public final synchronized Bundle A04() {
        return this.A00;
    }

    public final synchronized QLA A05() {
        return this.A02;
    }

    public final synchronized String A07() {
        return this.A03;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.QcV, android.view.View] */
    public final void A08(C10947S2f s2f, BrowserLiteJSBridgeCall browserLiteJSBridgeCall, String str) {
        String str2 = str;
        0qQ.A0B(str, 1);
        QLA A05 = A05();
        if (A05 != null) {
            C10947S2f s2f2 = s2f;
            if (s2f != null) {
                ((SystemWebView) A05).A04.post(new TK4(this, s2f2, browserLiteJSBridgeCall, A05, str2));
            }
        }
    }

    public final synchronized void A09(QLA qla) {
        this.A02 = qla;
        if (qla != null) {
            this.A03 = qla.A05();
        }
    }

    public final synchronized void A0A(String str) {
        0qQ.A0B(str, 0);
        this.A03 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        String str = this.A01;
        if (str == null) {
            0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            throw AnonymousClass00P.createAndThrow();
        }
        parcel.writeString(str);
        parcel.writeBundle(this.A00);
    }

    public final String A06() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.QcV, android.view.View] */
    public final Context A03() {
        QLA A05 = A05();
        if (A05 != null) {
            return ((SystemWebView) A05).A04.getContext();
        }
        return null;
    }
}
