package X;

public final class SIS {
    public final SOC A00;
    public final AnonymousClass5A3 A01;
    public final C10633RvS A02;

    public static void A00(2Fk r3, SOC soc) {
        r3.A09(new C11648Sdq(r3, (AnonymousClass2gO) C11652Sdu.A00(soc, 32), 25));
    }

    public final AnonymousClass2gB A01() {
        SSZ ssz = this.A00.A01;
        return TPM.A00(TPM.A00(SSC.A03(ssz.A01), ssz, 19), this, 8);
    }

    public final C7422QCn A02(C11214SFo sFo, String str) {
        AnonymousClass5A3 r3 = this.A01;
        C45906DEl dEl = new C45906DEl(this, sFo, str, 4);
        SOC soc = this.A00;
        DbZ.A0t(0, r3, soc, sFo);
        C7422QCn A03 = SSC.A03(new C8296Qnc(dEl, soc, r3, sFo));
        A03.A09(new C11648Sdq((2Fk) A03, (AnonymousClass2gO) C11652Sdu.A00(soc, 33), 27));
        return A03;
    }

    public SIS(SOC soc, AnonymousClass5A3 r2, C10633RvS rvS) {
        this.A02 = rvS;
        this.A01 = r2;
        this.A00 = soc;
    }
}
