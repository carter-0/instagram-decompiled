package X;

/* renamed from: X.XRb  reason: case insensitive filesystem */
public enum C21256XRb {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    
    public final String A00;

    /* access modifiers changed from: public */
    C21256XRb(String str) {
        this.A00 = str;
    }

    public static C21256XRb A00(String str) {
        switch (str.hashCode()) {
            case -503070503:
                if (str.equals("TLSv1.1")) {
                    return TLS_1_1;
                }
                break;
            case -503070502:
                if (str.equals("TLSv1.2")) {
                    return TLS_1_2;
                }
                break;
            case -503070501:
                if (str.equals("TLSv1.3")) {
                    return TLS_1_3;
                }
                break;
            case 79201641:
                if (str.equals("SSLv3")) {
                    return SSL_3_0;
                }
                break;
            case 79923350:
                if (str.equals("TLSv1")) {
                    return TLS_1_0;
                }
                break;
        }
        throw AnonymousClass7TF.A0W("Unexpected TLS version: ", str);
    }
}
