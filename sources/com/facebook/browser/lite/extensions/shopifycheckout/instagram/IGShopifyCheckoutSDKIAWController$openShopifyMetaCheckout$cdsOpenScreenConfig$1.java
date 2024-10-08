package com.facebook.browser.lite.extensions.shopifycheckout.instagram;

import X.C7571QKc;
import X.QPy;
import android.os.Parcel;
import android.webkit.WebView;
import com.meta.foa.cds.CdsOpenScreenDismissCallback;

public final class IGShopifyCheckoutSDKIAWController$openShopifyMetaCheckout$cdsOpenScreenConfig$1 implements CdsOpenScreenDismissCallback {
    public final /* synthetic */ C7571QKc A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }

    public IGShopifyCheckoutSDKIAWController$openShopifyMetaCheckout$cdsOpenScreenConfig$1(C7571QKc qKc) {
        this.A00 = qKc;
    }

    public final void D9E(int i) {
        QPy qPy = this.A00.A01;
        if (qPy != null) {
            WebView webView = qPy.A07.A00.A00;
            if (webView != null) {
                webView.destroy();
            }
            qPy.A04 = qPy.A0C;
        }
    }
}
