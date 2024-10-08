package X;

public final class QOy extends AnonymousClass0T0 {
    public final long A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Boolean A06;
    public final String A07;

    public QOy(Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, long j) {
        0qQ.A0B(str2, 2);
        this.A07 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A00 = j;
        this.A01 = num;
        this.A05 = str5;
        this.A06 = bool;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QOy) {
                QOy qOy = (QOy) obj;
                if (!0qQ.A0K(this.A07, qOy.A07) || !0qQ.A0K(this.A04, qOy.A04) || !0qQ.A0K(this.A02, qOy.A02) || !0qQ.A0K(this.A03, qOy.A03) || this.A00 != qOy.A00 || this.A01 != qOy.A01 || !0qQ.A0K(this.A05, qOy.A05) || !0qQ.A0K(this.A06, qOy.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A072 = C51972G9s.A07(this.A00, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A04, AnonymousClass7TE.A0O(this.A07)))));
        int intValue = this.A01.intValue();
        switch (intValue) {
            case 1:
                str = "IMAGE";
                break;
            case 2:
                str = "IMAGE_PHOTO";
                break;
            default:
                str = "AUDIO";
                break;
        }
        return AnonymousClass7TF.A08(this.A05, (A072 + str.hashCode() + intValue) * 31) + AnonymousClass7TG.A0C(this.A06);
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CapturedSnapshot(sessionId=");
        A1A.append(this.A07);
        A1A.append(", playerSessionId=");
        A1A.append(this.A04);
        A1A.append(", fullFilePath=");
        A1A.append(this.A02);
        A1A.append(", mimeType=");
        A1A.append(this.A03);
        A1A.append(", previewTimestampUs=");
        A1A.append(this.A00);
        A1A.append(", type=");
        Integer num = this.A01;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "IMAGE";
                    break;
                case 2:
                    str = "IMAGE_PHOTO";
                    break;
                default:
                    str = "AUDIO";
                    break;
            }
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", tags=");
        A1A.append(this.A05);
        A1A.append(", isFinalSnapshot=");
        return AnonymousClass7TG.A0n(this.A06, A1A);
    }
}
