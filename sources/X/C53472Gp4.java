package X;

/* renamed from: X.Gp4  reason: case insensitive filesystem */
public final class C53472Gp4 extends AnonymousClass0T0 implements JQB {
    public final int A00 = 1;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    public C53472Gp4(JV7 jv7, String str, String str2, AnonymousClass62P r5, int i, int i2) {
        0qQ.A0B(r5, 5);
        this.A06 = str;
        this.A02 = i;
        this.A01 = i2;
        this.A05 = str2;
        this.A03 = r5;
        this.A04 = jv7;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C53472Gp4) || ((C53472Gp4) obj).A00 != i) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!A00(i, obj)) {
            return false;
        }
        C53472Gp4 gp4 = (C53472Gp4) obj;
        if (!0qQ.A0K(this.A06, gp4.A06) || this.A02 != gp4.A02 || this.A01 != gp4.A01 || !0qQ.A0K(this.A05, gp4.A05) || !0qQ.A0K(this.A03, gp4.A03) || !0qQ.A0K(this.A04, gp4.A04)) {
            return false;
        }
        return true;
    }

    public final int getHeight() {
        return this.A01;
    }

    public final String getId() {
        return this.A06;
    }

    public final int getWidth() {
        return this.A02;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A03, (((((AnonymousClass7TE.A0O(this.A06) + this.A02) * 31) + this.A01) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A04);
    }

    public C53472Gp4(JV7 jv7, AnonymousClass3WR r3, String str, String str2, int i, int i2) {
        this.A06 = str;
        this.A02 = i;
        this.A01 = i2;
        this.A05 = str2;
        this.A03 = r3;
        this.A04 = jv7;
    }
}
