package X;

public final class F38 {
    public int A00;
    public String A01;

    public final boolean equals(Object obj) {
        F38 f38;
        String str;
        if (this == obj) {
            return true;
        }
        if (obj == null || !DbY.A1b(this, obj) || !(obj instanceof F38) || (f38 = (F38) obj) == null) {
            return false;
        }
        String str2 = this.A01;
        if (str2 != null && (str = f38.A01) != null) {
            return str2.equals(str);
        }
        0qQ.A0F("stepName");
        throw AnonymousClass00P.createAndThrow();
    }

    public final int hashCode() {
        String str = this.A01;
        if (str != null) {
            return str.hashCode();
        }
        0qQ.A0F("stepName");
        throw AnonymousClass00P.createAndThrow();
    }
}
