package X;

public enum RDV {
    RSA_PKCS_1_5("RSA", new String[]{"SHA-256"}, 0),
    RSA("RSA", new String[]{"SHA-256"}, 1),
    EC("EC", new String[]{"SHA-256"}, 2);
    
    public final String A00;
    public final String A01;
    public final String[] A02;

    /* access modifiers changed from: public */
    RDV(String str, String[] strArr, int i) {
        this.A00 = r2;
        this.A01 = str;
        this.A02 = strArr;
    }
}
