package X;

/* renamed from: X.UNv  reason: case insensitive filesystem */
public final class C15078UNv extends AnonymousClass0T0 implements C232262tL {
    public final C56078HsR A00;
    public final String A01;
    public final C62320sa A02;

    public C15078UNv(C56078HsR hsR, String str, C62320sa r4) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = hsR;
        this.A02 = r4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15078UNv) {
                C15078UNv uNv = (C15078UNv) obj;
                if (!0qQ.A0K(this.A01, uNv.A01) || !0qQ.A0K(this.A00, uNv.A00) || !0qQ.A0K(this.A02, uNv.A02)) {
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
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A01)));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C56078HsR hsR;
        C15078UNv uNv = (C15078UNv) obj;
        C56078HsR hsR2 = this.A00;
        if (uNv != null) {
            hsR = uNv.A00;
        } else {
            hsR = null;
        }
        return 0qQ.A0K(hsR2, hsR);
    }
}
