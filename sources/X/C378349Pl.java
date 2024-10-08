package X;

/* renamed from: X.9Pl  reason: invalid class name and case insensitive filesystem */
public abstract class C378349Pl {
    public static int A00(AnonymousClass8AZ r5, int i) {
        int AZP = r5.AZP() - 1;
        int[] Ath = r5.Ath();
        int i2 = 0;
        while (AZP > i2) {
            int i3 = (AZP + i2) / 2;
            if (i < Ath[i3]) {
                AZP = i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return i2;
    }
}
