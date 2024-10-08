package X;

import android.content.Context;

public final class S33 {
    public S7C A00;
    public final Context A01;
    public final AnonymousClass07Z A02;
    public final AnonymousClass2Fj A03 = JTO.A0K();
    public final C270254gR A04;
    public final AnonymousClass2gO A05 = new C11651Sdt(this, 26);

    public final AnonymousClass2Fj A00() {
        String str;
        S7C s7c = this.A00;
        if (s7c == null) {
            AnonymousClass2IJ r1 = AnonymousClass2IK.A04;
            if (AnonymousClass2IK.A06 != null) {
                s7c = r1.A02();
                this.A00 = s7c;
                if (s7c == null) {
                    str = "w3cAppRepo";
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                s7c.A00 = this.A04;
            } else {
                AnonymousClass2Fj r2 = this.A03;
                SUj.A0M(r2, 0sn.A00, new Throwable("Failed to initialize W3C Repo"));
                return r2;
            }
        }
        str = "w3cAppRepo";
        if (s7c != null) {
            AnonymousClass2gB A002 = s7c.A00();
            AnonymousClass2gO r22 = this.A05;
            A002.A08(r22);
            S7C s7c2 = this.A00;
            if (s7c2 != null) {
                s7c2.A00().A06(this.A02, r22);
                return this.A03;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public S33(Context context, AnonymousClass07Z r4, C270254gR r5) {
        AnonymousClass7TG.A1P(r5, context);
        this.A04 = r5;
        this.A02 = r4;
        this.A01 = context;
        AnonymousClass2IJ r1 = AnonymousClass2IK.A04;
        if (AnonymousClass2IK.A06 != null) {
            S7C A022 = r1.A02();
            this.A00 = A022;
            if (A022 == null) {
                0qQ.A0F("w3cAppRepo");
                throw AnonymousClass00P.createAndThrow();
            } else {
                A022.A00 = this.A04;
            }
        }
    }
}
