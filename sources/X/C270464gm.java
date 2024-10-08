package X;

/* renamed from: X.4gm  reason: invalid class name and case insensitive filesystem */
public final class C270464gm implements AnonymousClass3O9 {
    public C250533lb A00;
    public AnonymousClass6NS A01;
    public C270864hR A02;
    public C257593xe A03;
    public Integer A04;
    public Integer A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;

    public final C276544tV A00() {
        C257593xe r0;
        AnonymousClass6NS r02 = this.A01;
        if (r02 != null) {
            return C307476Qg.A02(r02.A02()).A06;
        }
        C270864hR r1 = this.A02;
        if (r1 == null && (r0 = this.A03) != null) {
            r1 = Ci1.A00(r0).A01;
            this.A02 = r1;
        }
        if (r1 != null) {
            return r1.A01().A00;
        }
        0wb.A03("null_bloks_data", "Netego bloks layout should not be null");
        return null;
    }

    public final C246643ew A01() {
        C257593xe r0;
        C270864hR r1 = this.A02;
        if (r1 == null && (r0 = this.A03) != null) {
            r1 = Ci1.A00(r0).A01;
            this.A02 = r1;
        }
        if (r1 != null) {
            return r1.A01();
        }
        return null;
    }

    public final 1UQ B5J() {
        return 1UQ.A0A;
    }

    public final Integer B9V() {
        return this.A04;
    }

    public final C67241sS BJP() {
        return this.A00;
    }

    public final Integer BVp() {
        return null;
    }

    public final String C9L() {
        return this.A08;
    }

    public final Integer CBd() {
        return AnonymousClass05K.A0N;
    }

    public final Integer CEl() {
        return this.A05;
    }

    public final String getId() {
        return this.A06;
    }

    public C270464gm(C277074uO r2) {
        boolean booleanValue;
        C250533lb A002;
        C277064uN r22 = (C277064uN) r2;
        String str = r22.A06;
        this.A06 = str == null ? "" : str;
        this.A08 = r22.A08;
        this.A02 = r22.A01;
        this.A03 = r22.A02;
        this.A05 = r22.A05;
        this.A04 = r22.A04;
        Boolean bool = r22.A03;
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        this.A09 = booleanValue;
        C67241sS r0 = r22.A00;
        if (r0 == null) {
            A002 = null;
        } else {
            A002 = r0.AKN().A00();
        }
        this.A00 = A002;
        this.A07 = r22.A07;
    }

    public C270464gm() {
    }
}
