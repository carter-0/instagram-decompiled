package X;

public final class GPL extends AnonymousClass0T0 implements C59490JLo {
    public final C266444Yx A00;
    public final Integer A01;
    public final boolean A02;

    public GPL(C266444Yx r2, Integer num, boolean z) {
        0qQ.A0B(num, 2);
        this.A00 = r2;
        this.A01 = num;
        this.A02 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GPL) {
                GPL gpl = (GPL) obj;
                if (!(0qQ.A0K(this.A00, gpl.A00) && this.A01 == gpl.A01 && this.A02 == gpl.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A00);
        Integer num = this.A01;
        return DbS.A06(this.A02, AnonymousClass7TG.A0B(num, C59701JUi.A00(num), A0K));
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("TextContent(text=");
        A1A.append(this.A00);
        A1A.append(", mimicryNoteType=");
        Integer num = this.A01;
        if (num != null) {
            str = C59701JUi.A00(num);
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", useEnlargedStyling=");
        return G9t.A1C(A1A, this.A02);
    }
}
