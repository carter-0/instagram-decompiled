package X;

/* renamed from: X.7ce  reason: invalid class name and case insensitive filesystem */
public final class C335247ce extends AnonymousClass0T0 implements C334107ag {
    public final AnonymousClass7a4 A00;
    public final CharSequence A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C335247ce) {
                C335247ce r5 = (C335247ce) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        CharSequence charSequence = this.A01;
        int i = 0;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        AnonymousClass7a4 r0 = this.A00;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return hashCode + i;
    }

    public C335247ce(AnonymousClass7a4 r1, CharSequence charSequence) {
        this.A01 = charSequence;
        this.A00 = r1;
    }
}
