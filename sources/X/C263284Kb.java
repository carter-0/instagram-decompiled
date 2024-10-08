package X;

/* renamed from: X.4Kb  reason: invalid class name and case insensitive filesystem */
public abstract class C263284Kb {
    public static final 0bY A00 = new 1Q7("IgSecureUriParser").A00;

    public static final String A00(AnonymousClass3WR r1) {
        switch (r1.A0E.intValue()) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                if (r1.A08()) {
                    return "DashVod";
                }
                return "Progressive";
            case 3:
                return "Live";
            default:
                throw new RuntimeException();
        }
    }
}
