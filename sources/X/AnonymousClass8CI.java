package X;

import java.util.List;

/* renamed from: X.8CI  reason: invalid class name */
public final class AnonymousClass8CI {
    public final long A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public AnonymousClass8CI(String str, String str2, List list, long j) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 3);
        0qQ.A0B(list, 4);
        this.A02 = str;
        this.A00 = j;
        this.A01 = str2;
        this.A03 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass8CI) {
                AnonymousClass8CI r8 = (AnonymousClass8CI) obj;
                if (!0qQ.A0K(this.A02, r8.A02) || this.A00 != r8.A00 || !0qQ.A0K(this.A01, r8.A01) || !0qQ.A0K(this.A03, r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NativeModelRequestMetadata(modelName=");
        sb.append(this.A02);
        sb.append(", version=");
        sb.append(this.A00);
        sb.append(", assetName=");
        sb.append(this.A01);
        sb.append(", extras=");
        sb.append(this.A03);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        long j = this.A00;
        return (((((this.A02.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.A01.hashCode()) * 31) + this.A03.hashCode();
    }
}
