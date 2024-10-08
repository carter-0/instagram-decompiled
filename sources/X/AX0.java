package X;

public final class AX0 implements YAD {
    public final /* synthetic */ C3743299a A00;

    public final C21963Xms AaB(byte[] bArr) {
        C3743299a r3 = this.A00;
        C375079Cd A01 = C375079Cd.A01(C375049Ca.A00, bArr);
        if (r3 == null) {
            throw AnonymousClass7TG.A0q("Cannot build without parameters and/or key material");
        } else if (r3.A01 != A01.A00.A00.length) {
            throw AnonymousClass7TG.A0q("Key size mismatch");
        } else if (!r3.A00()) {
            return new C21963Xms((AnonymousClass98Q) C375419Dm.A00(new C3744599n(r3, AnonymousClass9DQ.A00(r3, (Integer) null), A01, (Integer) null)));
        } else {
            throw AnonymousClass7TG.A0q("Cannot create key without ID requirement with parameters with ID requirement");
        }
    }

    public AX0(C3743299a r1) {
        this.A00 = r1;
    }

    public final int C3c() {
        return this.A00.A01;
    }
}
