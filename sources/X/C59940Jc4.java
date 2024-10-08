package X;

import java.util.Arrays;

/* renamed from: X.Jc4  reason: case insensitive filesystem */
public abstract class C59940Jc4 {
    public static final String A00(long j) {
        long abs = Math.abs(j);
        long j2 = abs / 60;
        if ((abs ^ 60) < 0 && j2 * 60 != abs) {
            j2--;
        }
        long j3 = abs % 60;
        String format = String.format("%02d", Arrays.copyOf(AnonymousClass7TF.A1b((int) (j3 + (60 & (((j3 ^ 60) & ((-j3) | j3)) >> 63)))), 1));
        0qQ.A07(format);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(j2);
        A1A.append(':');
        return AnonymousClass7TF.A0l(format, A1A);
    }
}
