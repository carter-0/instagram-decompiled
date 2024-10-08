package com.instagram.bloks.extensions.plugins.bkigactionwarequestotp;

import X.0qQ;
import X.AnonymousClass0fD;
import X.DbS;
import X.Pxf;
import X.SR0;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class BloksWhatsAppCodeReceiverActivity extends Activity {
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        int A02 = Pxf.A02(this, 1298990936);
        super.onCreate(bundle);
        Intent intent = getIntent();
        SR0 sr0 = SR0.A00;
        0qQ.A0A(intent);
        if (sr0.A02(intent)) {
            0qQ.A0B(intent, 0);
            if (sr0.A02(intent) && (stringExtra = intent.getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE)) != null) {
                Intent A09 = DbS.A09();
                A09.setAction("com.instagram.android.WHATSAPP_OTP");
                A09.putExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, stringExtra);
                Pxf.A0O().A0C(getApplicationContext(), A09);
            }
        }
        finish();
        AnonymousClass0fD.A07(1573754259, A02);
    }
}
