package X;

/* renamed from: X.VjE  reason: case insensitive filesystem */
public final class C17976VjE {
    public final /* synthetic */ 2A4 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public final boolean equals(Object obj) {
        C256243vS r0;
        if (obj == null) {
            return false;
        }
        if (obj instanceof AnonymousClass5Hd) {
            r0 = ((AnonymousClass5Hd) obj).A00;
        } else if (!(obj instanceof C256443vm)) {
            return false;
        } else {
            r0 = ((C256443vm) obj).A02;
        }
        if (r0 == null) {
            return false;
        }
        String str = this.A01;
        C255653uU r1 = r0.A0D;
        if (str.equals(r1.A0A)) {
            return !this.A02 || !r1.A0N;
        }
        return false;
    }

    public C17976VjE(2A4 r1, String str, boolean z) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = z;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
