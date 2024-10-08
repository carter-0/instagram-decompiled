package X;

public final class OM0 {
    public final /* synthetic */ 1cR A00;
    public final /* synthetic */ AnonymousClass0eM A01;
    public final /* synthetic */ AnonymousClass0eM A02;
    public final /* synthetic */ AnonymousClass0eM A03;
    public final /* synthetic */ AnonymousClass0eM A04;
    public final /* synthetic */ AnonymousClass0eM A05;
    public final /* synthetic */ AnonymousClass0eM A06;
    public final /* synthetic */ AnonymousClass0eM A07;
    public final /* synthetic */ AnonymousClass0eM A08;
    public final /* synthetic */ AnonymousClass0eM A09;
    public final /* synthetic */ AnonymousClass0eM A0A;
    public final /* synthetic */ AnonymousClass0eM A0B;
    public final /* synthetic */ AnonymousClass0eM A0C;
    public final /* synthetic */ AnonymousClass0eM A0D;
    public final /* synthetic */ AnonymousClass0eM A0E;
    public final /* synthetic */ AnonymousClass0eM A0F;
    public final /* synthetic */ AnonymousClass0eM A0G;
    public final /* synthetic */ AnonymousClass0eM A0H;

    public OM0(1cR r2, AnonymousClass0eM r3, AnonymousClass0eM r4, AnonymousClass0eM r5, AnonymousClass0eM r6, AnonymousClass0eM r7, AnonymousClass0eM r8, AnonymousClass0eM r9, AnonymousClass0eM r10, AnonymousClass0eM r11, AnonymousClass0eM r12, AnonymousClass0eM r13, AnonymousClass0eM r14, AnonymousClass0eM r15, AnonymousClass0eM r16, AnonymousClass0eM r17, AnonymousClass0eM r18, AnonymousClass0eM r19) {
        this.A00 = r2;
        this.A0G = r3;
        this.A0F = r4;
        this.A0E = r5;
        this.A02 = r6;
        this.A05 = r7;
        this.A03 = r8;
        this.A0B = r9;
        this.A07 = r10;
        this.A09 = r11;
        this.A0A = r12;
        this.A08 = r13;
        this.A0D = r14;
        this.A0H = r15;
        this.A06 = r16;
        this.A0C = r17;
        this.A04 = r18;
        this.A01 = r19;
    }

    public final boolean A00(C65451cb r5) {
        AnonymousClass0eM r0;
        AnonymousClass0eM r02;
        boolean A1Z;
        AnonymousClass9JI r03;
        if (r5 instanceof C65431cZ) {
            C65441ca r52 = (C65441ca) r5;
            2FW BS4 = r52.BS4();
            if (r52 instanceof C65481cr) {
                if ((!BS4.equals(2FW.A1g) || !AnonymousClass7TF.A1Z(this.A0G)) && ((!BS4.equals(2FW.A0m) || !AnonymousClass7TF.A1Z(this.A0F)) && (!BS4.equals(2FW.A0K) || !AnonymousClass7TF.A1Z(this.A0E)))) {
                    A1Z = BS4.equals(2FW.A0N);
                }
                return true;
            } else if (!(r52 instanceof AnonymousClass1e7)) {
                if (r52 instanceof 1cX) {
                    r0 = this.A05;
                } else if (!(r52 instanceof C68968Nbv)) {
                    return false;
                } else {
                    r0 = this.A03;
                }
                return AnonymousClass7TF.A1Z(r0);
            } else if (!BS4.equals(2FW.A0m)) {
                return false;
            } else {
                r02 = this.A02;
                A1Z = AnonymousClass7TF.A1Z(r02);
            }
        } else if ((r5 instanceof AnonymousClass1dS) || (r5 instanceof 1dq)) {
            if (r5 instanceof 1dq) {
                r03 = ((1dq) r5).A07();
            } else {
                r03 = ((AnonymousClass1dS) r5).A00;
            }
            1Xj r1 = (1Xj) r03.A00;
            if (r1.CeS()) {
                r0 = this.A0B;
            } else if (r1.A56()) {
                r0 = this.A07;
            } else if (r1.A4u()) {
                r0 = this.A09;
            } else if (r1.A0C.CBy() != null) {
                r0 = this.A0A;
            } else {
                r0 = this.A08;
            }
            return AnonymousClass7TF.A1Z(r0);
        } else {
            if ((!(r5 instanceof C65611ei) || !AnonymousClass7TF.A1Z(this.A0D)) && ((!(r5 instanceof 1dI) || !AnonymousClass7TF.A1Z(this.A0H)) && ((!(r5 instanceof 1du) || !AnonymousClass7TF.A1Z(this.A0H)) && ((!(r5 instanceof AnonymousClass1dM) || !AnonymousClass7TF.A1Z(this.A06)) && ((!(r5 instanceof AnonymousClass1f3) || !AnonymousClass7TF.A1Z(this.A0C)) && ((!(r5 instanceof C65521dX) || !AnonymousClass7TF.A1Z(this.A04)) && ((!(r5 instanceof 1dd) || !AnonymousClass7TF.A1Z(this.A02)) && (!(r5 instanceof 1di) || !AnonymousClass7TF.A1Z(this.A02))))))))) {
                if (!(r5 instanceof AnonymousClass1ez)) {
                    return false;
                }
                r02 = this.A01;
                A1Z = AnonymousClass7TF.A1Z(r02);
            }
            return true;
        }
        if (A1Z) {
            return true;
        }
        return false;
    }
}
