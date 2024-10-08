package X;

/* renamed from: X.9cG  reason: invalid class name and case insensitive filesystem */
public final class C381749cG extends AnonymousClass0T0 {
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381749cG) {
                C381749cG r8 = (C381749cG) obj;
                if (!0qQ.A0K(this.A06, r8.A06) || !0qQ.A0K(this.A04, r8.A04) || this.A00 != r8.A00 || this.A01 != r8.A01 || !0qQ.A0K(this.A02, r8.A02) || !0qQ.A0K(this.A03, r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A06);
        int i = 0;
        int A012 = (AnonymousClass7TF.A01(this.A01, (AnonymousClass7TF.A08(this.A04, A0O) + this.A00) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31;
        String str = this.A03;
        if (str != null) {
            i = str.hashCode();
        }
        return A012 + i;
    }

    public C381749cG(String str, String str2, String str3, String str4, int i, long j) {
        this.A06 = str;
        this.A04 = str2;
        this.A00 = i;
        this.A01 = j;
        this.A02 = str3;
        this.A03 = str4;
        this.A05 = 002.A0G(str2, '_', i);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("UserInClipsTogetherState(userId=");
        A1A.append(this.A06);
        A1A.append(", surfaceId=");
        A1A.append(this.A04);
        A1A.append(", surfaceType=");
        A1A.append(this.A00);
        A1A.append(", capabilities=");
        A1A.append(this.A01);
        A1A.append(", clipId=");
        A1A.append(this.A02);
        A1A.append(AnonymousClass000.A00(402));
        A1A.append(this.A03);
        return AnonymousClass7TG.A0p(A1A);
    }
}
