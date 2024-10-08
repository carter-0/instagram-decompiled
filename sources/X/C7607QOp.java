package X;

/* renamed from: X.QOp  reason: case insensitive filesystem */
public final class C7607QOp extends AnonymousClass0T0 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C7607QOp(String str, String str2, String str3, String str4, String str5, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
                this.A01 = str;
                this.A02 = str2;
                this.A04 = str3;
                this.A05 = str4;
                this.A03 = str5;
                return;
            case 1:
                AnonymousClass7TG.A1O(str, str2);
                this.A01 = str;
                this.A05 = str2;
                this.A03 = str3;
                this.A04 = str4;
                this.A02 = str5;
                return;
            case 2:
                this.A05 = str;
                this.A04 = str2;
                this.A02 = str3;
                this.A03 = str4;
                this.A01 = str5;
                return;
            default:
                0qQ.A0B(str, 1);
                this.A04 = str;
                this.A01 = str2;
                this.A02 = str3;
                this.A03 = str4;
                this.A05 = str5;
                return;
        }
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C7607QOp) {
                    C7607QOp qOp = (C7607QOp) obj;
                    if (qOp.A00 == 0 && 0qQ.A0K(this.A01, qOp.A01) && 0qQ.A0K(this.A02, qOp.A02) && 0qQ.A0K(this.A04, qOp.A04) && 0qQ.A0K(this.A05, qOp.A05)) {
                        str = this.A03;
                        str2 = qOp.A03;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C7607QOp) {
                    C7607QOp qOp2 = (C7607QOp) obj;
                    if (qOp2.A00 == 1 && 0qQ.A0K(this.A01, qOp2.A01) && 0qQ.A0K(this.A05, qOp2.A05) && 0qQ.A0K(this.A03, qOp2.A03) && 0qQ.A0K(this.A04, qOp2.A04)) {
                        str = this.A02;
                        str2 = qOp2.A02;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            case 2:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C7607QOp) {
                    C7607QOp qOp3 = (C7607QOp) obj;
                    if (qOp3.A00 == 2 && 0qQ.A0K(this.A05, qOp3.A05) && 0qQ.A0K(this.A04, qOp3.A04) && 0qQ.A0K(this.A02, qOp3.A02) && 0qQ.A0K(this.A03, qOp3.A03)) {
                        str = this.A01;
                        str2 = qOp3.A01;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C7607QOp) {
                    C7607QOp qOp4 = (C7607QOp) obj;
                    if (qOp4.A00 == 3 && 0qQ.A0K(this.A04, qOp4.A04) && 0qQ.A0K(this.A01, qOp4.A01) && 0qQ.A0K(this.A02, qOp4.A02) && 0qQ.A0K(this.A03, qOp4.A03)) {
                        str = this.A05;
                        str2 = qOp4.A05;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
        }
        if (!0qQ.A0K(str, str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A08;
        String str;
        switch (this.A00) {
            case 0:
                A08 = ((((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31;
                str = this.A03;
                break;
            case 1:
                A08 = (((AnonymousClass7TF.A08(this.A05, AnonymousClass7TE.A0O(this.A01)) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31;
                str = this.A02;
                break;
            case 2:
                return C41845B3m.A01(this.A01, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A04, AnonymousClass7TE.A0O(this.A05)))));
            default:
                A08 = (((((AnonymousClass7TE.A0O(this.A04) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31;
                str = this.A05;
                break;
        }
        return A08 + C41845B3m.A00(str);
    }
}
