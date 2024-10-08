package X;

/* renamed from: X.REx  reason: case insensitive filesystem */
public enum C8905REx {
    RESPONSE_CODE_UNSPECIFIED(-999);
    
    public static final C13140TMy A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C10990S4c s4c = new C10990S4c();
        for (C8905REx rEx : values()) {
            s4c.A01(Integer.valueOf(rEx.A00), rEx);
        }
        A01 = s4c.A00();
    }

    public static C8905REx A00(int i) {
        C13140TMy tMy = A01;
        Integer valueOf = Integer.valueOf(i);
        if (!tMy.containsKey(valueOf)) {
            return RESPONSE_CODE_UNSPECIFIED;
        }
        return (C8905REx) tMy.get(valueOf);
    }

    /* access modifiers changed from: public */
    C8905REx(int i) {
        this.A00 = i;
    }
}
