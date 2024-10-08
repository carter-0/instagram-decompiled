package X;

import java.util.List;

/* renamed from: X.4ZJ  reason: invalid class name */
public final class AnonymousClass4ZJ extends AnonymousClass0T0 {
    public String A00;
    public String A01;
    public boolean A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final AnonymousClass4ZF A07;

    public AnonymousClass4ZJ(AnonymousClass4ZF r2) {
        0qQ.A0B(r2, 1);
        this.A07 = r2;
        C272704lE r22 = (C272704lE) r2;
        0sn r0 = r22.A05;
        this.A06 = 00k.A0U(r0 == null ? 0sn.A00 : r0);
        this.A03 = r22.A00;
        this.A05 = r22.A04;
        this.A04 = r22.A03;
        this.A01 = r22.A02;
        this.A00 = r22.A01;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass4ZJ) && 0qQ.A0K(this.A07, ((AnonymousClass4ZJ) obj).A07));
    }

    public final int hashCode() {
        return this.A07.hashCode();
    }
}
