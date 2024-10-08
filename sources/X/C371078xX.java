package X;

/* renamed from: X.8xX  reason: invalid class name and case insensitive filesystem */
public abstract class C371078xX {
    public static final int A00(AnonymousClass84B r6) {
        int ordinal = r6.ordinal();
        if (ordinal == 1) {
            return 1;
        }
        if (ordinal == 2) {
            return 2;
        }
        if (ordinal == 6) {
            return 5;
        }
        if (ordinal == 9) {
            return 6;
        }
        if (ordinal != 4) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported EffectSource:");
            sb.append(r6);
            0wb.A03("EffectSelectionSourceExt", sb.toString());
        }
        return 3;
    }
}
