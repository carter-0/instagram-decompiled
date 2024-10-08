package X;

/* renamed from: X.O0p  reason: case insensitive filesystem */
public abstract class C70285O0p {
    public static final AnonymousClass3UL A00(C67687MsP msP, int i) {
        0qQ.A0B(msP, 0);
        Object item = msP.getItem(i);
        if (!(item instanceof AnonymousClass3UI)) {
            return (AnonymousClass3UL) item;
        }
        AnonymousClass3UI r2 = (AnonymousClass3UI) item;
        if (r2.A07 == AnonymousClass3UO.SUGGESTED_USER) {
            return r2.A00();
        }
        return null;
    }
}
