package X;

import java.io.Serializable;

/* renamed from: X.74u  reason: invalid class name and case insensitive filesystem */
public final class C3259474u implements Serializable {
    public int A00 = 0;
    public int A01 = 1;
    public long A02 = 0;
    public Integer A03 = AnonymousClass05K.A00;
    public String A04 = "";
    public String A05 = "";
    public String A06 = "";
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F = false;

    public final boolean A01(C3259474u r7) {
        if (r7 == null) {
            return false;
        }
        if (this == r7) {
            return true;
        }
        return this.A00 == r7.A00 && this.A02 == r7.A02 && this.A04.equals(r7.A04) && this.A0F == r7.A0F && this.A01 == r7.A01 && this.A06.equals(r7.A06) && this.A03 == r7.A03 && this.A05.equals(r7.A05) && this.A0D == r7.A0D;
    }

    public final void A00(C3259474u r4) {
        if (r4.A07) {
            int i = r4.A00;
            this.A07 = true;
            this.A00 = i;
        }
        if (r4.A0B) {
            long j = r4.A02;
            this.A0B = true;
            this.A02 = j;
        }
        if (r4.A09) {
            String str = r4.A04;
            this.A09 = true;
            this.A04 = str;
        }
        if (r4.A0A) {
            boolean z = r4.A0F;
            this.A0A = true;
            this.A0F = z;
        }
        if (r4.A0C) {
            int i2 = r4.A01;
            this.A0C = true;
            this.A01 = i2;
        }
        if (r4.A0E) {
            String str2 = r4.A06;
            this.A0E = true;
            this.A06 = str2;
        }
        if (r4.A08) {
            Integer num = r4.A03;
            this.A08 = true;
            this.A03 = num;
        }
        if (r4.A0D) {
            String str3 = r4.A05;
            this.A0D = true;
            this.A05 = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3259474u) || !A01((C3259474u) obj)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (((((2173 + this.A00) * 53) + Long.valueOf(this.A02).hashCode()) * 53) + this.A04.hashCode()) * 53;
        int i = 1231;
        int i2 = 1237;
        if (this.A0F) {
            i2 = 1231;
        }
        Integer num = this.A03;
        int hashCode2 = (((((((((hashCode + i2) * 53) + this.A01) * 53) + this.A06.hashCode()) * 53) + CUC.A00(num).hashCode() + num.intValue()) * 53) + this.A05.hashCode()) * 53;
        if (!this.A0D) {
            i = 1237;
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Country Code: ");
        sb.append(this.A00);
        sb.append(" National Number: ");
        sb.append(this.A02);
        if (this.A0A && this.A0F) {
            sb.append(" Leading Zero(s): true");
        }
        if (this.A0C) {
            sb.append(" Number of leading zeros: ");
            sb.append(this.A01);
        }
        if (this.A09) {
            sb.append(" Extension: ");
            sb.append(this.A04);
        }
        if (this.A08) {
            sb.append(" Country Code Source: ");
            sb.append(CUC.A00(this.A03));
        }
        if (this.A0D) {
            sb.append(" Preferred Domestic Carrier Code: ");
            sb.append(this.A05);
        }
        return sb.toString();
    }
}
