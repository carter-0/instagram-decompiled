package X;

/* renamed from: X.HHz  reason: case insensitive filesystem */
public final class C54538HHz extends HQ1 {
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54538HHz) {
                C54538HHz hHz = (C54538HHz) obj;
                if (!(0qQ.A0K(this.A02, hHz.A02) && 0qQ.A0K(this.A03, hHz.A03) && this.A01 == hHz.A01 && this.A00 == hHz.A00 && this.A04 == hHz.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0O(this.A02));
        Integer num = this.A01;
        int A0B = AnonymousClass7TG.A0B(num, C49259Es2.A00(num), A08);
        Integer num2 = this.A00;
        return DbS.A06(this.A04, AnonymousClass7TG.A0B(num2, LKT.A01(num2), A0B));
    }

    public C54538HHz(Integer num, Integer num2, String str, String str2, boolean z) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = num;
        this.A00 = num2;
        this.A04 = z;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Download(imageId=");
        G9w.A1T(A1A, this.A02);
        A1A.append(this.A03);
        A1A.append(", mediaType=");
        Integer num = this.A01;
        if (num != null) {
            str = C49259Es2.A00(num);
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(AnonymousClass000.A00(845));
        Integer num2 = this.A00;
        if (num2 != null) {
            str2 = LKT.A01(num2);
        } else {
            str2 = "null";
        }
        A1A.append(str2);
        A1A.append(", isEditScreen=");
        return G9t.A1C(A1A, this.A04);
    }
}
