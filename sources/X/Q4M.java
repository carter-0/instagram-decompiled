package X;

public final class Q4M extends C9108RPf {
    public final Object A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public Q4M(Object obj, Object obj2, String str, String str2) {
        0qQ.A0B(str2, 3);
        this.A02 = str;
        this.A00 = obj;
        this.A03 = str2;
        this.A01 = obj2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Q4M) {
                Q4M q4m = (Q4M) obj;
                if (!0qQ.A0K(this.A02, q4m.A02) || !0qQ.A0K(this.A00, q4m.A00) || !0qQ.A0K(this.A03, q4m.A03) || !0qQ.A0K(this.A01, q4m.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A02))) + AnonymousClass7TG.A0C(this.A01);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SnapshotAndVariableUpdate(dataModuleType=");
        A1A.append(this.A02);
        A1A.append(", snapshot=");
        A1A.append(this.A00);
        A1A.append(", variableIdentifier=");
        A1A.append(this.A03);
        A1A.append(", value=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
