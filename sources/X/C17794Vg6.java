package X;

/* renamed from: X.Vg6  reason: case insensitive filesystem */
public final class C17794Vg6 {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17794Vg6)) {
            return false;
        }
        C17794Vg6 vg6 = (C17794Vg6) obj;
        return this.A00.equals(vg6.A00) && this.A01.equals(vg6.A01);
    }

    public C17794Vg6(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
