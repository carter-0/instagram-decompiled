package X;

/* renamed from: X.5mB  reason: invalid class name and case insensitive filesystem */
public final class C294275mB extends C242703Vp implements C242713Vq {
    public C294255m9 A00;
    public Integer A01;
    public String A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C294275mB) || !super.equals(obj)) {
            return false;
        }
        C294275mB r4 = (C294275mB) obj;
        if (r4.A01 == this.A01 && r4.A00 == this.A00 && 0qQ.A0K(r4.A02, this.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str;
        int hashCode = super.hashCode() * 31;
        int intValue = this.A01.intValue();
        switch (intValue) {
            case 1:
                str = "GRID";
                break;
            case 2:
                str = "GRID_CELL";
                break;
            default:
                str = "FEED";
                break;
        }
        return ((((hashCode + str.hashCode() + intValue) * 31) + this.A00.hashCode()) * 31) + this.A02.hashCode();
    }
}
