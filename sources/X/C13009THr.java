package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableMap;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.THr  reason: case insensitive filesystem */
public final class C13009THr implements Runnable {
    public final /* synthetic */ ReadableMap A00;
    public final /* synthetic */ IgReactPurchaseExperienceBridgeModule A01;

    public C13009THr(ReadableMap readableMap, IgReactPurchaseExperienceBridgeModule igReactPurchaseExperienceBridgeModule) {
        this.A01 = igReactPurchaseExperienceBridgeModule;
        this.A00 = readableMap;
    }

    public final void run() {
        String string = this.A00.getString(IgReactPurchaseExperienceBridgeModule.RN_PAYMENT_TYPE_KEY);
        Bundle A0a = AnonymousClass7TE.A0a();
        if (!TextUtils.isEmpty(string)) {
            A0a.putString("PAYMENT_TYPE", string);
        }
        AnonymousClass2E0.A03().A04(A0a);
    }
}
