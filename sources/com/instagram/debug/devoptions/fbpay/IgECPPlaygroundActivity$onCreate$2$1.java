package com.instagram.debug.devoptions.fbpay;

import X.0qQ;
import X.2EG;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.Pxe;
import X.SUL;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.instagram.common.session.UserSession;

public final class IgECPPlaygroundActivity$onCreate$2$1 implements View.OnClickListener {
    public final /* synthetic */ IgECPPlaygroundActivity this$0;

    public IgECPPlaygroundActivity$onCreate$2$1(IgECPPlaygroundActivity igECPPlaygroundActivity) {
        this.this$0 = igECPPlaygroundActivity;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, java.lang.Object, com.instagram.debug.devoptions.fbpay.IgECPPlaygroundActivity] */
    public final void onClick(View view) {
        String str;
        int A05 = AnonymousClass0fD.A05(1425300274);
        EditText editText = this.this$0.offsiteUrlInputEditText;
        if (editText == null) {
            0qQ.A0F("offsiteUrlInputEditText");
            throw AnonymousClass00P.createAndThrow();
        }
        Editable text = editText.getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        ? r3 = this.this$0;
        UserSession A0a = Pxe.A0a(r3);
        if (str.length() <= 0) {
            str = IgECPPlaygroundActivity.OFFSITE_DEFAULT_URL;
        }
        SUL sul = new SUL(r3, A0a, 2EG.A1X, str, false);
        sul.A0S = IgECPPlaygroundActivity.MODULE_NAME;
        sul.A0A();
        AnonymousClass0fD.A0C(1399628834, A05);
    }
}
