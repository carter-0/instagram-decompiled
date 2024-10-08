package com.instagram.bloks.extensions.plugins.bkigactionwarequestotp;

import X.0qQ;
import X.0tX;
import X.0xY;
import X.0xn;
import X.AnonymousClass0QR;
import X.C59880bj;
import X.DbS;
import X.DbT;
import X.Pxf;
import X.SR0;
import android.content.Context;
import android.content.Intent;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import org.json.JSONException;
import org.json.JSONObject;

public final class BloksWhatsAppCodeReceiver extends AnonymousClass0QR {
    public final void A05(Context context, Intent intent, C59880bj r10) {
        Intent intent2;
        String stringExtra;
        String stringExtra2;
        0qQ.A0B(context, 0);
        SR0 sr0 = SR0.A00;
        if (sr0.A02(intent)) {
            if (!sr0.A02(intent) || (stringExtra2 = intent.getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE)) == null) {
                intent2 = null;
            } else {
                intent2 = DbS.A09();
                intent2.setAction("com.instagram.android.WHATSAPP_OTP");
                intent2.putExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, stringExtra2);
            }
            if (sr0.A02(intent) && (stringExtra = intent.getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE)) != null) {
                0tX A01 = 0xn.A01("com.instagram.android.WHATSAPP_OTP");
                long currentTimeMillis = System.currentTimeMillis();
                0xY AR4 = A01.AR4();
                JSONObject A11 = DbS.A11();
                try {
                    A11.put("otp", stringExtra);
                    A11.put("ct", currentTimeMillis);
                } catch (JSONException unused) {
                }
                AR4.E5g("otp_data", DbT.A10(A11));
                AR4.apply();
            }
            if (intent2 != null) {
                Pxf.A0O().A0C(context, intent2);
            }
        }
    }
}
