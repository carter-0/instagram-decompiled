package X;

/* renamed from: X.Hsu  reason: case insensitive filesystem */
public final class C56107Hsu {
    public final C56130HtI A00;
    public final Integer A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56107Hsu) {
                C56107Hsu hsu = (C56107Hsu) obj;
                if (this.A01 != hsu.A01 || !0qQ.A0K(this.A02, hsu.A02) || !0qQ.A0K(this.A00, hsu.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A01.intValue();
        switch (intValue) {
            case 1:
                str = "IMAGE";
                break;
            case 2:
                str = "VIDEO";
                break;
            default:
                str = "TEXT";
                break;
        }
        return ((C51968G9o.A0F(str, intValue) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C56107Hsu(C56130HtI htI, Integer num, String str) {
        this.A01 = num;
        this.A02 = str;
        this.A00 = htI;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FeedbackSuggestionPreviewState(previewType=");
        Integer num = this.A01;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "IMAGE";
                    break;
                case 2:
                    str = "VIDEO";
                    break;
                default:
                    str = "TEXT";
                    break;
            }
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", previewText=");
        A1A.append(this.A02);
        A1A.append(", generatedMedia=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
