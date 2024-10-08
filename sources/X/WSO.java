package X;

public final class WSO implements C232262tL {
    public final C61055Jvt A00;
    public final String A01;
    public final String A02;

    public WSO(C61055Jvt jvt, String str, String str2) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = jvt;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C61055Jvt jvt;
        WSO wso = (WSO) obj;
        C61055Jvt jvt2 = this.A00;
        if (wso != null) {
            jvt = wso.A00;
        } else {
            jvt = null;
        }
        return 0qQ.A0K(jvt2, jvt);
    }
}
