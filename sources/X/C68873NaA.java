package X;

/* renamed from: X.NaA  reason: case insensitive filesystem */
public final class C68873NaA extends C71984OuG {
    public final C68817NYb A00;
    public final String A01;
    public final C328607Fl A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68873NaA) {
                C68873NaA naA = (C68873NaA) obj;
                if (!0qQ.A0K(this.A01, naA.A01) || !0qQ.A0K(this.A00, naA.A00) || !0qQ.A0K(this.A02, naA.A02)) {
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

    public C68873NaA(C328607Fl r1, C68817NYb nYb, String str) {
        super(r1, nYb);
        this.A01 = str;
        this.A00 = nYb;
        this.A02 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
