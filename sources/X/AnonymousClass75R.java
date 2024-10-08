package X;

/* renamed from: X.75R  reason: invalid class name */
public final class AnonymousClass75R extends AnonymousClass75N {
    public final AnonymousClass752 A00;
    public final String A01;
    public final C328607Fl A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass75R(C328607Fl r2, AnonymousClass752 r3, String str) {
        super(r2, r3);
        0qQ.A0B(r2, 3);
        this.A01 = str;
        this.A00 = r3;
        this.A02 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass75R) {
                AnonymousClass75R r5 = (AnonymousClass75R) obj;
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

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
