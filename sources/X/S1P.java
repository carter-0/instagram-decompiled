package X;

public final class S1P {
    public final /* synthetic */ T69 A00;
    public final /* synthetic */ String A01;

    public S1P(T69 t69, String str) {
        this.A00 = t69;
        this.A01 = str;
    }

    public final void A00(Integer num) {
        String str;
        0lg r5 = this.A00.A01;
        switch (num.intValue()) {
            case 0:
                str = "UNKNOWN";
                break;
            case 1:
                str = "INTERNAL_UNRECOVERABLE";
                break;
            case 2:
                str = "INTERNAL_RECOVERABLE";
                break;
            case 3:
                str = "AM_DISABLED";
                break;
            case 4:
                str = "NOT_PRELOADED";
                break;
            case 5:
                str = "FEATURE_NOT_SUPPORTED";
                break;
            default:
                str = "NO_VALID_REFERRER";
                break;
        }
        String str2 = this.A01;
        String A11 = 002.A11("InstallReferrerRegistrar_OXYGEN_SDK_NO_REFERRER", " : ", "no referrer returned", " : ", str);
        String A0o = Pxg.A0o(r5);
        1Ln A0N = Pxh.A0N(r5, A11);
        if (A0o != null) {
            A0N.A0R("pigeon_session_id", A0o);
        }
        Pxh.A1A(A0N, str2, (String) null);
    }
}
