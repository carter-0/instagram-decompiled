package X;

/* renamed from: X.8tc  reason: invalid class name and case insensitive filesystem */
public final class C368968tc implements Cloneable {
    public Integer A00;
    public boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C368968tc r5 = (C368968tc) obj;
            if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((this.A01 ? 1 : 0) * true) + C393169w0.A00(this.A00);
    }

    public final C368968tc A00() {
        try {
            return (C368968tc) super.clone();
        } catch (CloneNotSupportedException unused) {
            return this;
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return this;
        }
    }
}
