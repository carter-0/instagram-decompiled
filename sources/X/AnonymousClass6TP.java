package X;

/* renamed from: X.6TP  reason: invalid class name */
public abstract class AnonymousClass6TP {
    public static int A00(C307786Rm r0, C276544tV r1, int i) {
        try {
            if (r0.A05) {
                String A0K = r1.A0K(35);
                if (A0K != null) {
                    return AnonymousClass6Su.A03(A0K);
                }
                return i;
            }
            String A0K2 = r1.A0K(36);
            if (A0K2 != null) {
                return AnonymousClass6Su.A03(A0K2);
            }
            return i;
        } catch (C258053yO unused) {
            1Kn.A02("ThemedColorUtils", "Error parsing themed color");
            return i;
        }
    }
}
