package X;

/* renamed from: X.748  reason: invalid class name */
public final class AnonymousClass748 extends AnonymousClass0T0 implements C232262tL, C328627Fn {
    public final AnonymousClass79c A00;
    public final String A01;
    public final C328607Fl A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass748) {
                AnonymousClass748 r5 = (AnonymousClass748) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01.hashCode() * 31) + this.A00.hashCode()) * 31) + this.A02.hashCode();
    }

    public final C328607Fl ApX() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass7FW Aqp() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public AnonymousClass748(C328607Fl r1, AnonymousClass79c r2, String str) {
        this.A01 = str;
        this.A00 = r2;
        this.A02 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
