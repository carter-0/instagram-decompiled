package X;

/* renamed from: X.9J4  reason: invalid class name */
public final class AnonymousClass9J4 extends AnonymousClass0T0 {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public AnonymousClass9J4(AnonymousClass9JO r2, C230472pg r3, AnonymousClass4EC r4, C233162v9 r5, C230432pc r6, String str) {
        0qQ.A0B(str, 1);
        0qQ.A0B(r5, 2);
        0qQ.A0B(r4, 3);
        0qQ.A0B(r6, 4);
        0qQ.A0B(r3, 5);
        0qQ.A0B(r2, 6);
        this.A06 = str;
        this.A04 = r5;
        this.A03 = r4;
        this.A05 = r6;
        this.A01 = r3;
        this.A02 = r2;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass9J4)) {
            return false;
        }
        AnonymousClass9J4 r3 = (AnonymousClass9J4) obj;
        if (r3.A00 != 0 || this.A05 != r3.A05 || !0qQ.A0K(this.A04, r3.A04) || !0qQ.A0K(this.A06, r3.A06) || !0qQ.A0K(this.A01, r3.A01) || !0qQ.A0K(this.A02, r3.A02) || !0qQ.A0K(this.A03, r3.A03)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.A00 != 0) {
            return super.hashCode();
        }
        int intValue = (((-1739844639 + ((Number) this.A05).intValue()) * 31) + this.A04.hashCode()) * 31;
        String str = this.A06;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = (((((intValue + hashCode) * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode()) * 31;
        Object obj = this.A03;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SignalMetadata(signalId=");
        sb.append(this.A06);
        sb.append(C273654mx.A00(1148));
        sb.append(this.A04);
        sb.append(C273654mx.A00(1146));
        sb.append(this.A03);
        sb.append(", surfaceType=");
        sb.append(this.A05);
        sb.append(", itemType=");
        sb.append(this.A01);
        sb.append(", metaId=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass9J4(AnonymousClass9IR r2, AnonymousClass9IR r3, CharSequence charSequence, Integer num, Integer num2, String str) {
        this.A05 = num;
        this.A04 = charSequence;
        this.A06 = str;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = num2;
    }
}
