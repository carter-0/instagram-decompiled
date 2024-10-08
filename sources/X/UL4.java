package X;

public final class UL4 extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Integer A03;
    public final Integer A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UL4) {
                UL4 ul4 = (UL4) obj;
                if (!(this.A03 == ul4.A03 && this.A04 == ul4.A04 && this.A02 == ul4.A02 && this.A00 == ul4.A00 && this.A01 == ul4.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int intValue = (64547 + this.A03.intValue()) * 31;
        Integer num = this.A04;
        return ((((AnonymousClass7TG.A0B(num, C16805V6m.A00(num), intValue) + this.A02) * 31) + this.A00) * 31) + this.A01;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("AudioFormat(codec=");
        if (this.A03 != null) {
            str = "AAC";
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", codecProfile=");
        Integer num = this.A04;
        if (num != null) {
            str2 = C16805V6m.A00(num);
        } else {
            str2 = "null";
        }
        sb.append(str2);
        sb.append(AnonymousClass000.A00(2045));
        sb.append(this.A02);
        sb.append(", bitRate=");
        sb.append(this.A00);
        sb.append(AnonymousClass000.A00(398));
        return C51975G9x.A0j(sb, this.A01);
    }

    public UL4(Integer num, Integer num2, int i, int i2, int i3) {
        this.A03 = num;
        this.A04 = num2;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }
}
