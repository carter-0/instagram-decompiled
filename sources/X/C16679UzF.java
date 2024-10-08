package X;

/* renamed from: X.UzF  reason: case insensitive filesystem */
public enum C16679UzF {
    CART("shopping_bag", 0),
    WISH_LIST("wish_list", 1),
    RECENTLY_VIEWED("recently_viewed", 2),
    LIKED("liked", 3);
    
    public final String A00;
    public final String A01;

    public final String A00(String str) {
        0qQ.A0B(str, 0);
        return 002.A0R(this.A01, str);
    }

    /* access modifiers changed from: public */
    static {
        C16679UzF[] uzFArr;
        A02 = 0oU.A00(uzFArr);
    }

    /* access modifiers changed from: public */
    C16679UzF(String str, int i) {
        this.A01 = r2;
        this.A00 = str;
    }
}
