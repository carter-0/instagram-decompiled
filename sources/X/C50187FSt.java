package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.ui.widget.edittext.ConfirmationCodeEditText;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.FSt  reason: case insensitive filesystem */
public final class C50187FSt implements C59900bo {
    public final /* synthetic */ int A00;
    public final /* synthetic */ IntentFilter A01;
    public final /* synthetic */ C47712EDv A02;
    public final /* synthetic */ ConfirmationCodeEditText A03;

    public C50187FSt(IntentFilter intentFilter, C47712EDv eDv, ConfirmationCodeEditText confirmationCodeEditText, int i) {
        this.A02 = eDv;
        this.A00 = i;
        this.A03 = confirmationCodeEditText;
        this.A01 = intentFilter;
    }

    public final ArrayList BIF() {
        return AnonymousClass7TE.A1D(Collections.singletonList(this.A01));
    }

    public final void Dbc(Context context, Intent intent, C59880bj r6) {
        String stringExtra;
        if (C59910bu.A02().A00(context, intent, this) && (stringExtra = intent.getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE)) != null && stringExtra.length() == this.A00) {
            this.A03.setText(stringExtra);
        }
    }
}
