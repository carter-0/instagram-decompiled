package com.instagram.fbpay.w3c.views;

import X.0qQ;
import X.0s1;
import X.AnonymousClass7TE;
import X.C11249SHj;
import X.C2818159r;
import X.DbW;
import X.Qn0;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebookpay.logging.FBPayLoggerData;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class PaymentMethodsActivity extends BaseFragmentActivity {
    public final FBPayLoggerData A00;

    public PaymentMethodsActivity() {
        C11249SHj sHj = new C11249SHj();
        sHj.A01(C2818159r.A01());
        String lowerCase = "IAB_AUTOFILL".toLowerCase();
        0qQ.A07(lowerCase);
        sHj.A01 = lowerCase;
        sHj.A05 = "offline_offsite";
        this.A00 = new FBPayLoggerData(sHj);
    }

    public final void A0j(Bundle bundle) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putSerializable("viewmodel_class", Qn0.class);
        A0a.putParcelable("logger_data", this.A00);
        A0a.putString(IgReactPurchaseExperienceBridgeModule.RN_PAYMENT_TYPE_KEY, "IAB_AUTOFILL");
        Fragment fragment = new Fragment();
        fragment.setArguments(A0a);
        0s1 A0D = DbW.A0D(this);
        A0D.A09(fragment, R.id.layout_container_main);
        A0D.A00();
    }
}
