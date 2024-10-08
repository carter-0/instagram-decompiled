package X;

/* renamed from: X.UNr  reason: case insensitive filesystem */
public final class C15074UNr extends AnonymousClass0T0 implements C232262tL {
    public final C59721JVf A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15074UNr) {
                C15074UNr uNr = (C15074UNr) obj;
                if (!0qQ.A0K(this.A01, uNr.A01) || !0qQ.A0K(this.A00, uNr.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0O(this.A01));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C59721JVf jVf;
        C15074UNr uNr = (C15074UNr) obj;
        C59721JVf jVf2 = this.A00;
        if (uNr != null) {
            jVf = uNr.A00;
        } else {
            jVf = null;
        }
        return 0qQ.A0K(jVf2, jVf);
    }

    public C15074UNr(C59721JVf jVf, String str) {
        this.A01 = str;
        this.A00 = jVf;
    }
}
