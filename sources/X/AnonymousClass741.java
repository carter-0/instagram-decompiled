package X;

/* renamed from: X.741  reason: invalid class name */
public final class AnonymousClass741 extends AnonymousClass0T0 implements C232262tL, C328627Fn, AnonymousClass7FW {
    public final C328607Fl A00;
    public final C328667Fr A01;
    public final String A02;

    public AnonymousClass741(C328607Fl r2, C328667Fr r3, String str) {
        0qQ.A0B(r3, 2);
        this.A02 = str;
        this.A01 = r3;
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass741) {
                AnonymousClass741 r5 = (AnonymousClass741) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A02.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GenericXmaMessageViewModel(id=");
        sb.append(this.A02);
        sb.append(", contentViewModel=");
        sb.append(this.A01);
        sb.append(", commonMessageDecorationsViewModel=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public final C328607Fl ApX() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass7FW Aqp() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
