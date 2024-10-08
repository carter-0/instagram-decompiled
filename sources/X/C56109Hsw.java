package X;

/* renamed from: X.Hsw  reason: case insensitive filesystem */
public final class C56109Hsw {
    public final String A00;
    public final String A01;
    public final I4X A02;

    public C56109Hsw(I4X i4x, String str, String str2) {
        0qQ.A0B(i4x, 2);
        this.A01 = str;
        this.A02 = i4x;
        this.A00 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56109Hsw) {
                C56109Hsw hsw = (C56109Hsw) obj;
                if (!0qQ.A0K(this.A01, hsw.A01) || !0qQ.A0K(this.A02, hsw.A02) || !0qQ.A0K(this.A00, hsw.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0O(this.A01)) + AnonymousClass7TG.A0E(this.A00);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("StackParams(screenName=");
        A1A.append(this.A01);
        A1A.append(", bottomSheetParams=");
        A1A.append(this.A02);
        A1A.append(", fromScreenName=");
        return C51975G9x.A0i(this.A00, A1A);
    }
}
