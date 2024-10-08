package X;

/* renamed from: X.Mdt  reason: case insensitive filesystem */
public final class C66860Mdt extends AnonymousClass0T0 implements C232262tL, C328627Fn {
    public final C66859Mds A00;
    public final C328607Fl A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66860Mdt) {
                C66860Mdt mdt = (C66860Mdt) obj;
                if (!0qQ.A0K(this.A00, mdt.A00) || !0qQ.A0K(this.A01, mdt.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C328607Fl ApX() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass7FW Aqp() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.A06;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public C66860Mdt(C328607Fl r1, C66859Mds mds) {
        this.A00 = mds;
        this.A01 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
