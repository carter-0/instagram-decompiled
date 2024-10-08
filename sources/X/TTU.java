package X;

import com.facebookpay.addresstypeahead.controller.AddressTypeaheadController;
import com.facebookpay.logging.LoggingContext;

public final class TTU extends 0Yg implements C62320sa {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TTU(Object obj, Object obj2, String str, int i, int i2) {
        super(0);
        this.A00 = i2;
        this.A03 = obj;
        this.A04 = str;
        this.A01 = i;
        this.A02 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            TTU.super.Ckz(this.A04, (0eP) this.A02, this.A01);
        } else {
            C12411Sto A0g = C51965G9l.A0g();
            AddressTypeaheadController addressTypeaheadController = (AddressTypeaheadController) this.A03;
            LoggingContext loggingContext = addressTypeaheadController.A07;
            int A05 = DbX.A05(this.A04);
            C12411Sto.A03(C51965G9l.A0U(C51969G9p.A0d(A0g.A00, "user_click_ecpaddresstypeahead_atomic"), 391), loggingContext, new C73961Pmf(loggingContext, (Object) null, "address_suggestion", this.A01, A05, 0));
            addressTypeaheadController.A09.invoke(this.A02);
        }
        return C60340gF.A00;
    }
}
