package X;

/* renamed from: X.DiE  reason: case insensitive filesystem */
public enum C46634DiE {
    ONE_PAGE_V2("password", 12),
    SET_PASSWORD("password", 13),
    DONE("registration", 14),
    ACCESS_DIALOG("login", 23),
    ONE_TAP("one_tap", 44);
    
    public final String A00;
    public final String A01;

    /* access modifiers changed from: public */
    static {
        C46634DiE[] diEArr;
        A02 = 0oU.A00(diEArr);
    }

    public static C46634DiE A00(String str, String str2, int i) {
        return new C46634DiE(str, i, str2);
    }

    /* access modifiers changed from: public */
    C46634DiE(String str) {
        this.A01 = str;
        this.A00 = str;
    }

    /* access modifiers changed from: public */
    C46634DiE(String str, int i) {
        this.A01 = r2;
        this.A00 = str;
    }
}
