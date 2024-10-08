package X;

import java.util.Map;

/* renamed from: X.8K5  reason: invalid class name */
public final class AnonymousClass8K5 {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final Map A03;

    public AnonymousClass8K5(Integer num, String str, String str2, Map map) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = num;
        this.A03 = map;
        this.A02 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass8K5) {
                AnonymousClass8K5 r5 = (AnonymousClass8K5) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        Integer num = this.A00;
        return ((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.A03.hashCode()) * 31) + this.A02.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LoadedAiModel(filePath=");
        sb.append(this.A01);
        sb.append(", version=");
        sb.append(this.A00);
        sb.append(", extras=");
        sb.append(this.A03);
        sb.append(", name=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }
}
