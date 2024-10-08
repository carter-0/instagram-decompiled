package X;

import com.facebookpay.offsite.base.CheckoutHandler;
import com.facebookpay.otc.models.OtcInput;

/* renamed from: X.Svb  reason: case insensitive filesystem */
public final class C12505Svb implements C13622Tdo {
    public final /* synthetic */ CheckoutHandler A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C12505Svb(CheckoutHandler checkoutHandler, String str, String str2, String str3, String str4) {
        this.A00 = checkoutHandler;
        this.A04 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A03 = str4;
    }

    public final void DYU() {
        C12402StT stT = this.A00.A0S;
        Integer num = AnonymousClass05K.A01;
        String str = this.A04;
        String str2 = this.A02;
        stT.CIS(new C10749RxT((OtcInput) null, str, str2, this.A01, this.A03), C11418SSt.A00(str, str2), num);
    }
}
