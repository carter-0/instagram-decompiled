package X;

/* renamed from: X.Di6  reason: case insensitive filesystem */
public enum C46626Di6 {
    FULL_SHEET(0, false),
    HALF_SHEET(1, false),
    AUTO_SHEET(2, false),
    FULL_SCREEN(3, false),
    FLEXIBLE_SHEET(4, true),
    HALF_SHEET_WITH_UNDERLAY(5, false),
    WRAP_CONTENT_SHEET(6, true);
    
    public static final C46626Di6[] A02 = null;
    public final String A00;
    public final boolean A01;

    /* access modifiers changed from: public */
    static {
        C46626Di6[] di6Arr;
        08f A002 = 0oU.A00(di6Arr);
        A03 = A002;
        A02 = (C46626Di6[]) A002.toArray(new C46626Di6[0]);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C46626Di6(int i, boolean z) {
        this.A00 = r2;
        this.A01 = z;
    }
}
