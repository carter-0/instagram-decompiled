package X;

public final class AfC implements C337267fz {
    public final C337267fz A00;
    public final boolean A01;
    public final /* synthetic */ F05 A02;

    public final 1OC AMw(C15050ULg uLg, String str) {
        0qQ.A0B(uLg, 0);
        return AMx(uLg.A01, str);
    }

    public final 1OC AMx(String str, String str2) {
        String str3;
        0qQ.A0B(str, 0);
        boolean z = this.A02.A00;
        if (z == this.A01) {
            return this.A00.AMx(str, str2);
        }
        if (z) {
            str3 = "searching";
        } else {
            str3 = "sorting";
        }
        throw AnonymousClass7TE.A0z(002.A0R("FollowListFragmentQueryManager is in a wrong state: ", str3));
    }

    public final /* synthetic */ void DeG(C15050ULg uLg) {
        AnonymousClass9V2.A02(uLg, this);
    }

    public final void DeH(String str) {
        0qQ.A0B(str, 0);
        if (this.A02.A00 == this.A01) {
            this.A00.DeH(str);
        }
    }

    public final /* synthetic */ void DeJ(C15050ULg uLg, C268654dm r2) {
        AnonymousClass9V2.A01(uLg, r2, this);
    }

    public final /* synthetic */ void DeT(C15050ULg uLg) {
        AnonymousClass9V2.A03(uLg, this);
    }

    public final void DeW(String str) {
        0qQ.A0B(str, 0);
        if (this.A02.A00 == this.A01) {
            this.A00.DeW(str);
        }
    }

    public final /* synthetic */ void Dej(C15050ULg uLg) {
        AnonymousClass9V2.A04(uLg, this);
    }

    public final void Dem(String str) {
        0qQ.A0B(str, 0);
        if (this.A02.A00 == this.A01) {
            this.A00.Dem(str);
        }
    }

    public final /* synthetic */ void Der(C15050ULg uLg, AnonymousClass1XT r2) {
        AnonymousClass9V2.A00(uLg, r2, this);
    }

    public final /* synthetic */ void Dnw(boolean z) {
    }

    public AfC(C337267fz r1, F05 f05, boolean z) {
        this.A02 = f05;
        this.A01 = z;
        this.A00 = r1;
    }

    public final AnonymousClass4D6 Bpf() {
        return this.A00.Bpf();
    }

    public final /* synthetic */ boolean Cch() {
        return false;
    }

    public final void DeM(C268654dm r3, String str) {
        AnonymousClass7TG.A1N(str, r3);
        if (this.A02.A00 == this.A01) {
            this.A00.DeM(r3, str);
        }
    }

    public final void Dev(AnonymousClass1XT r3, String str) {
        AnonymousClass7TG.A1N(str, r3);
        if (this.A02.A00 == this.A01) {
            this.A00.Dev(r3, str);
        }
    }

    public final /* synthetic */ 1GP AMy(C15050ULg uLg, String str) {
        return null;
    }
}
