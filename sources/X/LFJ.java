package X;

import java.util.ArrayList;

public final class LFJ {
    public String A00 = "amount";
    public final AnonymousClass2Fj A01;
    public final AnonymousClass2Fj A02;
    public final 1a8 A03;
    public final C63689L2z A04;

    public final AnonymousClass2Fj A00() {
        if (0qQ.A0K(this.A00, "amount")) {
            return this.A01;
        }
        return this.A02;
    }

    public final void A01(String str, boolean z, String str2) {
        AnonymousClass2Fj r3;
        C60931Jtp jtp;
        if (0qQ.A0K(this.A00, "time")) {
            r3 = this.A02;
        } else {
            r3 = this.A01;
        }
        String str3 = null;
        if (z || !((jtp = (C60931Jtp) r3.A02()) == null || (str3 = jtp.A00) == null)) {
            C60931Jtp jtp2 = (C60931Jtp) r3.A02();
            if (jtp2 != null) {
                jtp2.A03 = true;
            }
            r3.A0A(r3.A02());
            1a8 r4 = this.A03;
            C63689L2z l2z = this.A04;
            String str4 = this.A00;
            1NY A0b = AnonymousClass7TG.A0b(l2z.A00.A00);
            A0b.A0K("media/%s/user_pay_supporters/", new Object[]{str});
            A0b.A0O((15p) null, K1V.class, LKK.class, true);
            A0b.A9m(AnonymousClass000.A00(1830), str4);
            if (str3 != null) {
                A0b.A9m("cursor", str3);
            }
            if (str2 != null) {
                A0b.A9m(AnonymousClass000.A00(659), str2);
            }
            M1T.A00(C69818Nsf.A00(A0b.A0M()), r4, r3, 13);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.Jtp] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.Jtp] */
    public LFJ(C63689L2z l2z) {
        this.A04 = l2z;
        ArrayList A1C = AnonymousClass7TE.A1C();
        ? obj = new Object();
        obj.A01 = A1C;
        obj.A00 = null;
        obj.A03 = false;
        obj.A02 = false;
        this.A01 = new 2Fk(obj);
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        ? obj2 = new Object();
        obj2.A01 = A1C2;
        obj2.A00 = null;
        obj2.A03 = false;
        obj2.A02 = false;
        this.A02 = new 2Fk(obj2);
        this.A03 = new 1a8(C318146oT.A01);
    }
}
