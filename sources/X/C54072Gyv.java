package X;

import java.util.List;

/* renamed from: X.Gyv  reason: case insensitive filesystem */
public abstract class C54072Gyv extends 1XP {
    public C70826OMy A00;
    public N3M A01;
    public C55853Hoa A02;
    public C55531HjD A03;
    public OEW A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public List A09 = AnonymousClass7TE.A1C();
    public List A0A;
    public boolean A0B;

    public final String BjE() {
        String str;
        C55853Hoa hoa = this.A02;
        if (hoa == null || (str = hoa.A03) == null) {
            return this.A07;
        }
        return str;
    }

    public final boolean CKA() {
        C55853Hoa hoa = this.A02;
        if (hoa != null) {
            return hoa.A06;
        }
        return this.A0B;
    }

    public final String getNextMaxId() {
        String str;
        C55853Hoa hoa = this.A02;
        if (hoa == null || (str = hoa.A02) == null) {
            return this.A06;
        }
        return str;
    }
}
