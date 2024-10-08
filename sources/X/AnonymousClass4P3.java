package X;

/* renamed from: X.4P3  reason: invalid class name */
public final class AnonymousClass4P3 {
    public final /* synthetic */ 2A4 A00;
    public final /* synthetic */ String A01;

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
        return r0 != null && this.A01.equals(r0.A0D.A0G);
    }

    public AnonymousClass4P3(2A4 r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
