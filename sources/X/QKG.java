package X;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.fbpay.w3c.CardDetails;

public abstract class QKG extends QKM {
    public C270254gR A00;
    public STY A01;
    public boolean A02;
    public boolean A03;

    public final void onCancel(DialogInterface dialogInterface) {
        C340037kb r0;
        QLA C8U;
        C10185Ro1 ro1;
        Bundle bundle;
        String str;
        0qQ.A0B(dialogInterface, 0);
        STY sty = this.A01;
        if (!(sty == null || (bundle = this.mArguments) == null)) {
            Parcelable parcelable = null;
            Parcelable.Creator creator = AutofillData.CREATOR;
            0qQ.A08(creator);
            AutofillData autofillData = (AutofillData) 0B0.A01(creator, bundle.getParcelable("contact_info"), AutofillData.class);
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null) {
                parcelable = bundle2.getParcelable("payment_info");
            }
            Parcelable.Creator creator2 = CardDetails.CREATOR;
            0qQ.A08(creator2);
            CardDetails cardDetails = (CardDetails) 0B0.A01(creator2, parcelable, CardDetails.class);
            if (!(autofillData == null && cardDetails == null)) {
                SGp sGp = new SGp(autofillData, cardDetails);
                C270254gR r6 = sty.A0T;
                RF6 rf6 = (RF6) r6.A00.A0J.A00;
                RF6 rf62 = RF6.NOT_OPT_IN;
                if (rf6 == rf62) {
                    str = "DECLINED_SAVE";
                } else {
                    str = "DECLINED_ADD_NEW_CARD";
                }
                sty.A0M = true;
                RRP A06 = sty.A06(str);
                C7580QKv qKv = sty.A04;
                C11364SPc.A03(qKv, A06);
                A06.A07 = S8J.A00(sGp);
                SUR.A0A(qKv.A02(), r6, A06.A00());
                if (rf6 == rf62) {
                    A06.A0I = "NOT_NOW_CLICK";
                    SUR.A0B(r6, qKv, A06);
                }
            }
        }
        STY sty2 = this.A01;
        if (sty2 != null) {
            C270254gR r1 = sty2.A0T;
            if (r1.A00.A0P.A04) {
                if (DbY.A1Z(0Tu.A06, r1.A04.A00, 36322860544961063L) && (r0 = sty2.A04.A04) != null && (C8U = r0.C8U()) != null && (ro1 = C8U.A0C) != null) {
                    ro1.A00.AI4(3, C8U.A05());
                }
            }
        }
    }
}
