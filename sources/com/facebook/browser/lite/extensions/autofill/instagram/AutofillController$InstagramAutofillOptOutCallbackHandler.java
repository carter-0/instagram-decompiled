package com.facebook.browser.lite.extensions.autofill.instagram;

import X.AnonymousClass0fD;
import X.C7580QKv;
import X.JTP;
import X.QLA;
import X.SB5;
import X.TFX;
import X.TFY;
import android.content.Context;
import com.facebook.browser.lite.ipc.AutofillOptOutCallback;
import java.util.Map;

public final class AutofillController$InstagramAutofillOptOutCallbackHandler extends AutofillOptOutCallback.Stub {
    public final Context A00;
    public final C7580QKv A01;
    public final QLA A02;
    public final Map A03;
    public final boolean A04;

    public AutofillController$InstagramAutofillOptOutCallbackHandler(Context context, C7580QKv qKv, QLA qla, Map map, boolean z) {
        int A032 = AnonymousClass0fD.A03(1865864625);
        this.A00 = context;
        this.A01 = qKv;
        this.A04 = z;
        this.A02 = qla;
        this.A03 = map;
        AnonymousClass0fD.A0A(-590519486, A032);
        AnonymousClass0fD.A0A(2031910769, AnonymousClass0fD.A03(2019492565));
    }

    public final void Czt(String str, boolean z) {
        int A032 = AnonymousClass0fD.A03(-1443480586);
        JTP.A1R(str, this.A03, z);
        if (this.A04) {
            SB5.A00(new TFX(this, z));
        }
        if (!z) {
            SB5.A00(new TFY(this, str));
        }
        AnonymousClass0fD.A0A(-250285624, A032);
    }
}
