package X;

/* renamed from: X.RVm  reason: case insensitive filesystem */
public abstract class C9261RVm {
    public static int A00(String str) {
        int A0M = new C227922kK(str).A0M("Orientation", 1);
        for (RFQ rfq : RFQ.values()) {
            if (A0M == rfq.A00) {
                Number number = (Number) C10066Rm3.A00.get(rfq);
                if (number != null) {
                    return number.intValue();
                }
                return 0;
            }
        }
        throw DbW.A0a("Invalid ExifInterface Orientation: ", A0M);
    }
}
