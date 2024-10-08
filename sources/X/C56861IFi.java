package X;

/* renamed from: X.IFi  reason: case insensitive filesystem */
public final class C56861IFi implements JNW {
    public final C56033Hrg A00;
    public final C56101Hso A01;
    public final boolean A02;

    public final Integer Asz() {
        C56033Hrg hrg = this.A00;
        int i = hrg.A02;
        int i2 = hrg.A00;
        if (i < i2) {
            return AnonymousClass05K.A01;
        }
        if (i > i2) {
            return AnonymousClass05K.A00;
        }
        return AnonymousClass05K.A0C;
    }

    public C56861IFi(C56033Hrg hrg, C56101Hso hso, boolean z) {
        this.A02 = z;
        this.A01 = hso;
        this.A00 = hrg;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SingleSelectionLayout(isStartHandle=");
        A1A.append(this.A02);
        A1A.append(", crossed=");
        switch (Asz().intValue()) {
            case 0:
                str = "CROSSED";
                break;
            case 1:
                str = "NOT_CROSSED";
                break;
            default:
                str = "COLLAPSED";
                break;
        }
        A1A.append(str);
        A1A.append(", info=\n\t");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
