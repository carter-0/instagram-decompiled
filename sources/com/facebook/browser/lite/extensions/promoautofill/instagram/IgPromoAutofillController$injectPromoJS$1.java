package com.facebook.browser.lite.extensions.promoautofill.instagram;

import X.0qQ;
import X.AnonymousClass0fD;
import X.C12054Slh;
import X.C7579QKu;
import X.QLA;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.facebook.browser.lite.ipc.AutofillScriptCallback;
import com.facebook.common.stringformat.StringFormatUtil;

public final class IgPromoAutofillController$injectPromoJS$1 extends Binder implements AutofillScriptCallback {
    public final /* synthetic */ C7579QKu A00;
    public final /* synthetic */ QLA A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgPromoAutofillController$injectPromoJS$1(C7579QKu qKu, QLA qla) {
        this();
        this.A01 = qla;
        this.A02 = "https://connect.facebook.net/en_US/promo.v2.js";
        this.A00 = qKu;
        AnonymousClass0fD.A0A(199720894, AnonymousClass0fD.A03(-1708043018));
    }

    public final void Czq(String str) {
        int A03 = AnonymousClass0fD.A03(743888134);
        QLA qla = this.A01;
        String str2 = this.A02;
        0qQ.A0B(str2, 0);
        qla.A0E(new C12054Slh(this.A00, 5), StringFormatUtil.formatStrLocaleSafe("(function(d, s, id){    var sdkURL = \"%s\";    var js, fjs = d.getElementsByTagName(s)[0];    if (d.getElementById(id)) {return;}    js = d.createElement(s); js.id = id;    js.src = sdkURL;    fjs.parentNode.insertBefore(js, fjs);}(document, 'script', 'promo-autofill-sdk'));", str2), true);
        AnonymousClass0fD.A0A(-936142725, A03);
    }

    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(-1605374822, AnonymousClass0fD.A03(1505159352));
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = AnonymousClass0fD.A03(-295573265);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.facebook.browser.lite.ipc.AutofillScriptCallback");
                if (i == 1) {
                    Czq(parcel.readString());
                    i3 = -379189614;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("com.facebook.browser.lite.ipc.AutofillScriptCallback");
                i3 = -1864008284;
            }
            AnonymousClass0fD.A0A(i3, A03);
            return true;
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        AnonymousClass0fD.A0A(1012021015, A03);
        return onTransact;
    }

    public IgPromoAutofillController$injectPromoJS$1() {
        int A03 = AnonymousClass0fD.A03(-1631264194);
        attachInterface(this, "com.facebook.browser.lite.ipc.AutofillScriptCallback");
        AnonymousClass0fD.A0A(-737463034, A03);
    }
}
