package X;

/* renamed from: X.Vjn  reason: case insensitive filesystem */
public final class C18011Vjn {
    public long A00 = 0;
    public VOT A01 = null;
    public VOU A02 = null;
    public String A03 = null;
    public String A04 = null;
    public String A05 = null;
    public String A06 = AnonymousClass7TF.A0b();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C18011Vjn vjn = (C18011Vjn) obj;
            if (!2PP.A00(this.A05, vjn.A05) || !2PP.A00(this.A06, vjn.A06)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Pxf.A0A(this.A05, this.A06);
    }
}
