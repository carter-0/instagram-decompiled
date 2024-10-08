package X;

import java.util.List;

/* renamed from: X.8jo  reason: invalid class name and case insensitive filesystem */
public final class C363488jo {
    public String A00;
    public String A01;
    public String A02;
    public List A03;

    public C363488jo(String str, String str2, String str3, List list) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(str3, 3);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C363488jo) {
                C363488jo r5 = (C363488jo) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A00.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FxIdentity(identityId=");
        sb.append(this.A00);
        sb.append(", identityType=");
        sb.append(this.A01);
        sb.append(AnonymousClass000.A00(2035));
        sb.append(this.A02);
        sb.append(C273654mx.A00(1156));
        sb.append(this.A03);
        sb.append(')');
        return sb.toString();
    }

    public C363488jo() {
        this("", "", "", 0sn.A00);
    }
}
