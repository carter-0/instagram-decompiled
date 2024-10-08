package X;

/* renamed from: X.Ewd  reason: case insensitive filesystem */
public final class C49498Ewd {
    public final EX9 A00;
    public final C48100EVs A01;

    public C49498Ewd(C48100EVs eVs) {
        EX9 ex9;
        this.A01 = eVs;
        int ordinal = eVs.ordinal();
        if (ordinal == 0) {
            ex9 = EX9.PUSH_NOTIFICATION;
        } else if (ordinal != 1) {
            ex9 = EX9.UNKNOWN;
        } else {
            ex9 = EX9.ACTIVITY_FEED_NOTIFICATION;
        }
        this.A00 = ex9;
    }
}
