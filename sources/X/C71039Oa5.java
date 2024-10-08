package X;

/* renamed from: X.Oa5  reason: case insensitive filesystem */
public final class C71039Oa5 {
    public final Object A00;

    public C71039Oa5(C70825OMx oMx) {
        0qQ.A0B(oMx, 1);
        this.A00 = oMx;
    }

    public final int A00() {
        1Xj r0;
        Object obj = this.A00;
        if (obj instanceof OIP) {
            return ((OIP) obj).A00;
        }
        if (!(obj instanceof C70825OMx) || (r0 = ((C70825OMx) obj).A02) == null) {
            return 0;
        }
        return C51967G9n.A04(r0.A0C.BQR(), 0);
    }

    public final long A01() {
        Object obj = this.A00;
        if (obj instanceof OIP) {
            return ((OIP) obj).A01;
        }
        if (obj instanceof C70825OMx) {
            return ((C70825OMx) obj).A00;
        }
        if (obj instanceof N3S) {
            return ((N3S) obj).A02 * 1000;
        }
        throw C66583MXo.A0b(obj);
    }

    public final 1Xj A02() {
        Object obj = this.A00;
        if (obj instanceof OIP) {
            return ((OIP) obj).A03;
        }
        if (obj instanceof C70825OMx) {
            return ((C70825OMx) obj).A02;
        }
        if (obj instanceof N3S) {
            return null;
        }
        throw C66583MXo.A0b(obj);
    }

    public final Boolean A03() {
        Object obj = this.A00;
        if (obj instanceof OIP) {
            return ((OIP) obj).A04;
        }
        if (obj instanceof C70825OMx) {
            return ((C70825OMx) obj).A03;
        }
        if (obj instanceof N3S) {
            return AnonymousClass7TE.A0u();
        }
        throw C66583MXo.A0b(obj);
    }

    public final String A04() {
        Object obj = this.A00;
        if (obj instanceof OIP) {
            return ((OIP) obj).A07;
        }
        if (obj instanceof C70825OMx) {
            return ((C70825OMx) obj).A07;
        }
        if (obj instanceof N3S) {
            return ((N3S) obj).A09;
        }
        throw C66583MXo.A0b(obj);
    }

    public final String A05() {
        Object obj = this.A00;
        if (obj instanceof OIP) {
            return ((OIP) obj).A08;
        }
        if (obj instanceof C70825OMx) {
            return ((C70825OMx) obj).A08;
        }
        if (obj instanceof N3S) {
            return ((N3S) obj).A08;
        }
        throw C66583MXo.A0b(obj);
    }

    public final String A06() {
        Object obj = this.A00;
        if (obj instanceof OIP) {
            return ((OIP) obj).A09;
        }
        if (obj instanceof C70825OMx) {
            return ((C70825OMx) obj).A0A;
        }
        if (obj instanceof N3S) {
            N3S n3s = (N3S) obj;
            0qQ.A0B(n3s, 0);
            return OXF.A02(n3s.A07, (String) null, n3s.A01);
        }
        throw C66583MXo.A0b(obj);
    }

    public final String A07() {
        Object obj = this.A00;
        if (obj instanceof OIP) {
            return ((OIP) obj).A0A;
        }
        if (obj instanceof C70825OMx) {
            return ((C70825OMx) obj).A09;
        }
        if (obj instanceof N3S) {
            return ((N3S) obj).A0B;
        }
        throw C66583MXo.A0b(obj);
    }

    public final boolean A08() {
        Object obj = this.A00;
        if (obj instanceof OIP) {
            return ((OIP) obj).A0G;
        }
        if (obj instanceof C70825OMx) {
            return ((C70825OMx) obj).A0B;
        }
        if (obj instanceof N3S) {
            return false;
        }
        throw C66583MXo.A0b(obj);
    }

    public final boolean A09() {
        Object obj = this.A00;
        if (obj instanceof OIP) {
            return ((OIP) obj).A0I;
        }
        if (!(obj instanceof C70825OMx) || AnonymousClass7TF.A1Y(((C70825OMx) obj).A03, true)) {
            return false;
        }
        return true;
    }

    public C71039Oa5(N3S n3s) {
        0qQ.A0B(n3s, 1);
        this.A00 = n3s;
    }

    public C71039Oa5(OIP oip) {
        this.A00 = oip;
    }
}
