package X;

/* renamed from: X.Lbj  reason: case insensitive filesystem */
public final class C64428Lbj implements 1To {
    public final int A00;
    public final Object A01;

    public C64428Lbj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void EFU(String str, Throwable th) {
        String str2;
        String A002 = AnonymousClass000.A00(2335);
        switch (this.A00) {
            case 0:
                ((C13712Tfa) this.A01).Ew3(A002, th);
                return;
            case 1:
                str2 = "CaaAutoConf";
                break;
            case 2:
                str2 = "ConfidenceFrameworkHelper";
                break;
            case 3:
                str2 = "FeO2IntegrateHelper";
                break;
            default:
                str2 = "GetClientMessageBloksSignature";
                break;
        }
        0wb.A07(str2, th);
    }
}
