package X;

/* renamed from: X.9cD  reason: invalid class name and case insensitive filesystem */
public final class C381719cD extends AnonymousClass0T0 {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381719cD) {
                C381719cD r8 = (C381719cD) obj;
                if (!0qQ.A0K(this.A04, r8.A04) || !0qQ.A0K(this.A03, r8.A03) || this.A05 != r8.A05 || this.A00 != r8.A00 || !0qQ.A0K(this.A02, r8.A02) || !0qQ.A0K(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A012 = AnonymousClass7TF.A01(this.A00, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0O(this.A04))));
        int i = 0;
        int A0E = (A012 + AnonymousClass7TG.A0E(this.A02)) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return A0E + i;
    }

    public C381719cD(String str, String str2, String str3, String str4, long j, boolean z) {
        this.A04 = str;
        this.A03 = str2;
        this.A05 = z;
        this.A00 = j;
        this.A02 = str3;
        this.A01 = str4;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("UserInThreadState(userId=");
        A1A.append(this.A04);
        A1A.append(", threadFbid=");
        A1A.append(this.A03);
        A1A.append(", isPresentInThread=");
        A1A.append(this.A05);
        A1A.append(", capabilities=");
        A1A.append(this.A00);
        A1A.append(AnonymousClass000.A00(402));
        A1A.append(this.A02);
        A1A.append(C66579MXk.A00(190));
        A1A.append(this.A01);
        return AnonymousClass7TG.A0p(A1A);
    }
}
