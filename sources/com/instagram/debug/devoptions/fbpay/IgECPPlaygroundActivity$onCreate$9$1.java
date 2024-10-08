package com.instagram.debug.devoptions.fbpay;

import X.0kR;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass2E0;
import X.DbX;
import android.content.Intent;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public final class IgECPPlaygroundActivity$onCreate$9$1 implements View.OnClickListener {
    public final /* synthetic */ IgECPPlaygroundActivity this$0;

    public IgECPPlaygroundActivity$onCreate$9$1(IgECPPlaygroundActivity igECPPlaygroundActivity) {
        this.this$0 = igECPPlaygroundActivity;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, com.instagram.debug.devoptions.fbpay.IgECPPlaygroundActivity, android.app.Activity] */
    public final void onClick(View view) {
        String str;
        int A05 = AnonymousClass0fD.A05(1180212003);
        EditText editText = this.this$0.deeplinkE2EUrlInputEditText;
        if (editText == null) {
            0qQ.A0F("deeplinkE2EUrlInputEditText");
            throw AnonymousClass00P.createAndThrow();
        }
        Editable text = editText.getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        if (str.length() > 0) {
            Intent A09 = DbX.A09(str);
            AnonymousClass2E0.A07();
            ? r3 = this.this$0;
            0qQ.A0B(r3, 2);
            0kR.A00.A08(IgECPPlaygroundActivity.DOMAIN_E2E).A0F(r3, A09, 10);
        }
        AnonymousClass0fD.A0C(-1876500321, A05);
    }
}
