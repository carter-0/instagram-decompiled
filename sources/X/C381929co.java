package X;

/* renamed from: X.9co  reason: invalid class name and case insensitive filesystem */
public final class C381929co extends AnonymousClass0T0 implements C232262tL, C331837So {
    public final int A00;
    public final CharSequence A01;
    public final String A02;

    public C381929co(String str, CharSequence charSequence, int i) {
        0qQ.A0B(charSequence, 1);
        this.A01 = charSequence;
        this.A02 = str;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381929co) {
                C381929co r5 = (C381929co) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final long C7Z() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public final int getType() {
        return 187;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0K(this.A01)) + this.A00;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        CharSequence charSequence;
        C381929co r3 = (C381929co) obj;
        String obj2 = this.A01.toString();
        if (r3 == null || (charSequence = r3.A01) == null) {
            str = null;
        } else {
            str = charSequence.toString();
        }
        if (!0qQ.A0K(obj2, str) || !0qQ.A0K(this.A02, r3.A02)) {
            return false;
        }
        return true;
    }
}
