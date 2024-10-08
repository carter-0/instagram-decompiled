package X;

/* renamed from: X.TsJ  reason: case insensitive filesystem */
public abstract class C14236TsJ {
    public static final C16616UyC A00(String str) {
        if (!(str == null || str.length() == 0)) {
            if (str.equalsIgnoreCase("not_boosted")) {
                return C16616UyC.NOT_BOOSTED;
            }
            if (str.equalsIgnoreCase("pending")) {
                return C16616UyC.PENDING;
            }
            if (str.equalsIgnoreCase("boosted")) {
                return C16616UyC.BOOSTED;
            }
            if (str.equalsIgnoreCase("boosted_eligible")) {
                return C16616UyC.BOOSTED_ELIGIBLE;
            }
            if (str.equalsIgnoreCase("not_approved")) {
                return C16616UyC.NOT_APPROVED;
            }
            if (str.equalsIgnoreCase("finished")) {
                return C16616UyC.FINISHED;
            }
            if (str.equalsIgnoreCase("unavailable")) {
                return C16616UyC.UNAVAILABLE;
            }
            if (str.equalsIgnoreCase("draft")) {
                return C16616UyC.DRAFT;
            }
            if (str.equalsIgnoreCase("paused")) {
                return C16616UyC.PAUSED;
            }
            if (str.equalsIgnoreCase("not_delivering")) {
                return C16616UyC.NOT_DELIVERING;
            }
            if (str.equalsIgnoreCase("scheduled")) {
                return C16616UyC.SCHEDULED;
            }
        }
        return C16616UyC.UNKNOWN;
    }
}
