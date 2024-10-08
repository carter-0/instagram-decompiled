package X;

/* renamed from: X.8Rq  reason: invalid class name and case insensitive filesystem */
public final class C355858Rq extends AnonymousClass8Rc {
    public final int A00;
    public final int A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C355858Rq) {
                C355858Rq r5 = (C355858Rq) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && 0qQ.A0K(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((this.A01 * 31) + this.A00) * 31;
        String str = this.A02;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TextSelectedState(selectedRow=");
        sb.append(this.A01);
        sb.append(", selectedIndex=");
        sb.append(this.A00);
        sb.append(", selectedVoiceName=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public C355858Rq(int i, int i2, String str) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = str;
    }
}
