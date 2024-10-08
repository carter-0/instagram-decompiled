package X;

/* renamed from: X.HtI  reason: case insensitive filesystem */
public final class C56130HtI {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56130HtI) {
                C56130HtI htI = (C56130HtI) obj;
                if (!0qQ.A0K(this.A02, htI.A02) || !0qQ.A0K(this.A01, htI.A01) || !0qQ.A0K(this.A03, htI.A03) || !0qQ.A0K(this.A04, htI.A04) || this.A00 != htI.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A08 = (((AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0O(this.A02)) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31;
        int intValue = this.A00.intValue();
        if (intValue != 0) {
            str = "SQUARE";
        } else {
            str = "PORTRAIT";
        }
        return A08 + C51966G9m.A04(str, intValue);
    }

    public C56130HtI(Integer num, String str, String str2, String str3, String str4) {
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A00 = num;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FeedbackMedia(mediaUrl=");
        A1A.append(this.A02);
        A1A.append(", mediaId=");
        A1A.append(this.A01);
        A1A.append(", requestId=");
        A1A.append(this.A03);
        A1A.append(", responseId=");
        A1A.append(this.A04);
        A1A.append(C66579MXk.A00(77));
        if (this.A00.intValue() != 0) {
            str = "SQUARE";
        } else {
            str = "PORTRAIT";
        }
        return C51975G9x.A0i(str, A1A);
    }
}
