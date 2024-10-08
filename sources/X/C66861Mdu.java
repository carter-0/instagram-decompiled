package X;

/* renamed from: X.Mdu  reason: case insensitive filesystem */
public final class C66861Mdu extends AnonymousClass0T0 implements C232262tL, C328627Fn {
    public final C66851Mdk A00;
    public final String A01;
    public final C328607Fl A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66861Mdu) {
                C66861Mdu mdu = (C66861Mdu) obj;
                if (!0qQ.A0K(this.A01, mdu.A01) || !0qQ.A0K(this.A00, mdu.A00) || !0qQ.A0K(this.A02, mdu.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
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

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A01)));
    }

    public C66861Mdu(C328607Fl r1, C66851Mdk mdk, String str) {
        this.A01 = str;
        this.A00 = mdk;
        this.A02 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
