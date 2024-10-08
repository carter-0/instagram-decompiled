package X;

/* renamed from: X.9bo  reason: invalid class name and case insensitive filesystem */
public final class C381469bo extends AnonymousClass0T0 {
    public final float A00;
    public final String A01;
    public final String A02;

    public C381469bo(String str, String str2, float f) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = f;
        this.A02 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381469bo) {
                C381469bo r5 = (C381469bo) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || Float.compare(this.A00, r5.A00) != 0 || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A00(AnonymousClass7TE.A0O(this.A01), this.A00) + this.A02.hashCode();
    }
}
