package X;

import java.util.Collection;

public final class AX2 implements YAD {
    public final /* synthetic */ AnonymousClass981 A00;

    public final C21963Xms AaB(byte[] bArr) {
        AnonymousClass981 r2 = this.A00;
        C375049Ca r4 = C375049Ca.A00;
        C375079Cd A01 = C375079Cd.A01(r4, bArr);
        if (r2 == null) {
            throw AnonymousClass7TE.A0w("Cannot build without parameters and/or key material");
        } else if (r2.A00 != A01.A00.A00.length) {
            throw AnonymousClass7TG.A0q("Key size mismatch");
        } else if (r2.A00()) {
            throw AnonymousClass7TG.A0q("Cannot create key without ID requirement with parameters with ID requirement");
        } else {
            C3740497y A002 = C375099Cg.A00(r2, (Integer) null);
            Collection collection = AnonymousClass9DR.A04;
            return new C21963Xms((AnonymousClass97H) new AnonymousClass9DR(A002, A01.A02(r4)));
        }
    }

    public AX2(AnonymousClass981 r1) {
        this.A00 = r1;
    }

    public final int C3c() {
        return this.A00.A00;
    }
}
