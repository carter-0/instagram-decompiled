package X;

/* renamed from: X.S1k  reason: case insensitive filesystem */
public final class C10932S1k {
    public final Integer A00;
    public final boolean A01;
    public final boolean A02;

    public C10932S1k(Integer num, boolean z, boolean z2) {
        this.A01 = z;
        this.A02 = z2;
        this.A00 = num;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("TosFlow{shouldAcceptTos=");
        A1A.append(this.A01);
        A1A.append(", shouldShowExplicitTos=");
        A1A.append(this.A02);
        A1A.append(", reason=");
        switch (this.A00.intValue()) {
            case 1:
                str = "EXPLICIT_COMPONENT_STATE";
                break;
            case 2:
                str = "DEFAULT_COMPONENT_STATE";
                break;
            case 3:
                str = "UNEXPECTED_SIGNATURES_STATE";
                break;
            case 4:
                str = "APPMANAGER_NOT_INSTALLED";
                break;
            case 5:
                str = "FALLBACK_V13_NO_SIM";
                break;
            case 6:
                str = "FALLBACK_V13_EU_CANADA";
                break;
            default:
                str = "FALLBACK_V13_OUTSIDE_EU_CANADA";
                break;
        }
        A1A.append(str);
        return Pxg.A0x(A1A);
    }
}
