package X;

/* renamed from: X.9J7  reason: invalid class name */
public final class AnonymousClass9J7 extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;

    public AnonymousClass9J7(String str, int i, int i2, int i3, String str2) {
        this.A00 = i3;
        if (i3 != 0) {
            this.A01 = i;
            this.A02 = i2;
            this.A04 = str;
            this.A03 = str2;
            return;
        }
        this.A02 = i;
        this.A01 = i2;
        this.A03 = str;
        this.A04 = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnonymousClass9J7)) {
                return false;
            }
            AnonymousClass9J7 r3 = (AnonymousClass9J7) obj;
            if (r3.A00 != 1 || this.A01 != r3.A01 || this.A02 != r3.A02 || !0qQ.A0K(this.A04, r3.A04)) {
                return false;
            }
            str = this.A03;
            str2 = r3.A03;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof AnonymousClass9J7)) {
                return false;
            }
            AnonymousClass9J7 r32 = (AnonymousClass9J7) obj;
            if (r32.A00 != 0 || this.A02 != r32.A02 || this.A01 != r32.A01 || !0qQ.A0K(this.A03, r32.A03)) {
                return false;
            }
            str = this.A04;
            str2 = r32.A04;
        }
        if (!0qQ.A0K(str, str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        String str;
        if (this.A00 != 0) {
            hashCode = ((((this.A01 * 31) + this.A02) * 31) + this.A04.hashCode()) * 31;
            str = this.A03;
        } else {
            hashCode = ((((this.A02 * 31) + this.A01) * 31) + this.A03.hashCode()) * 31;
            str = this.A04;
        }
        return hashCode + str.hashCode();
    }

    public final String toString() {
        if (this.A00 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("PatternMatch(startPosition=");
        sb.append(this.A02);
        sb.append(Pxd.A00(115));
        sb.append(this.A01);
        sb.append(", dictionaryId=");
        sb.append(this.A03);
        sb.append(", matchedDictionaryWord=");
        sb.append(this.A04);
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass9J7(int i, int i2, String str) {
        this(str, i, i2, 0, "");
        this.A00 = 0;
        this.A00 = 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass9J7() {
        this("", -1, -1, 0, "");
        this.A00 = 0;
    }
}
