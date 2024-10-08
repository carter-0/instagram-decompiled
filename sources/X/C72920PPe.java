package X;

import java.util.List;

/* renamed from: X.PPe  reason: case insensitive filesystem */
public final class C72920PPe implements C337237fw, C336267eL {
    public C337237fw A00;
    public Object A01 = 0sn.A00;
    public String A02 = "";
    public final OIy A03;
    public final C336267eL A04;
    public final AnonymousClass4D6 A05;
    public final Object A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final void DDU() {
    }

    public final void ERO(List list) {
    }

    public final String Amq() {
        return null;
    }

    public final Object B3J() {
        return this.A06;
    }

    public final boolean BBY() {
        return this.A08;
    }

    public final String BiY() {
        return this.A02;
    }

    public final String BjE() {
        return null;
    }

    public final Integer BlQ() {
        return null;
    }

    public final String BnF() {
        return null;
    }

    public final Object Bo1() {
        return this.A01;
    }

    public final List Bqo() {
        return this.A07;
    }

    public final boolean CT5() {
        return this.A09;
    }

    public final boolean CWX() {
        return this.A0A;
    }

    public final boolean CYL() {
        return false;
    }

    public final void Dam(C337257fy r3) {
        Object Bo1 = this.A04.Bo1();
        if (Bo1 != null) {
            this.A01 = this.A03.A00(Bo1);
        }
        C337237fw r0 = this.A00;
        if (r0 != null) {
            r0.Dam(this);
        }
    }

    public final void EJE() {
        this.A04.EJE();
    }

    public final void EcJ(C337237fw r2) {
        if (this.A00 != r2) {
            this.A00 = r2;
            if (r2 != null) {
                r2.Dam(this);
            }
        }
    }

    public final boolean isLoading() {
        return this.A0B;
    }

    public C72920PPe(AnonymousClass4D6 r3, OIy oIy, C336267eL r5) {
        this.A04 = r5;
        this.A03 = oIy;
        this.A05 = r3;
        this.A06 = r5.B3J();
        this.A07 = C66581MXm.A11("Categories", "Suggested");
        this.A0B = r5.isLoading();
        this.A09 = r5.CT5();
        this.A0A = r5.CWX();
        this.A08 = r5.BBY();
        r3.schedule(new C72226Oyu(this));
    }

    public final void EhX(String str) {
        this.A02 = str;
    }
}
