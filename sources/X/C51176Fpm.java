package X;

import com.instagram.model.business.BusinessInfo;

/* renamed from: X.Fpm  reason: case insensitive filesystem */
public final class C51176Fpm implements Runnable {
    public final /* synthetic */ C47492E4w A00;

    public C51176Fpm(C47492E4w e4w) {
        this.A00 = e4w;
    }

    public final void run() {
        C47492E4w e4w = this.A00;
        FEa fEa = new FEa(e4w.A06);
        fEa.A0B = e4w.A03.getEmail();
        fEa.A01 = e4w.A03.getSubmitPublicPhoneContact();
        BusinessInfo businessInfo = new BusinessInfo(fEa);
        e4w.A06 = businessInfo;
        C48754Ejd.A00(C47697EDg.A00(this, 16), e4w.A05, e4w, businessInfo);
    }
}
