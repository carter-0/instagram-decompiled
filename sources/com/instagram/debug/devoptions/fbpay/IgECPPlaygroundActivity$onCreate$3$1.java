package com.instagram.debug.devoptions.fbpay;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public final class IgECPPlaygroundActivity$onCreate$3$1 implements View.OnClickListener {
    public final /* synthetic */ IgECPPlaygroundActivity this$0;

    public IgECPPlaygroundActivity$onCreate$3$1(IgECPPlaygroundActivity igECPPlaygroundActivity) {
        this.this$0 = igECPPlaygroundActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1573141281);
        EditText editText = this.this$0.offsiteUrlInputEditText;
        if (editText == null) {
            0qQ.A0F("offsiteUrlInputEditText");
            throw AnonymousClass00P.createAndThrow();
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        AnonymousClass0fD.A0C(-288484769, A05);
    }
}
