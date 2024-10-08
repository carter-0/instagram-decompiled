package X;

import java.util.ArrayList;
import java.util.List;

public final class Xn0 {
    public static int A03;
    public C270324gY A00;
    public C270324gY A01;
    public ArrayList A02;

    public static long A00(C22054Xuf xuf, Xn0 xn0, long j) {
        C270324gY r4 = xuf.A05;
        if (r4 instanceof XGU) {
            return j;
        }
        List list = xuf.A07;
        int size = list.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C270334gZ r8 = (C270334gZ) list.get(i);
            if (r8 instanceof C22054Xuf) {
                C22054Xuf xuf2 = (C22054Xuf) r8;
                if (xuf2.A05 != r4) {
                    j2 = Math.min(j2, A00(xuf2, xn0, ((long) xuf2.A00) + j));
                }
            }
        }
        if (xuf != r4.A03) {
            return j2;
        }
        long A05 = r4.A05();
        C22054Xuf xuf3 = r4.A04;
        long j3 = j - A05;
        return Math.min(Math.min(j2, A00(xuf3, xn0, j3)), j3 - ((long) xuf3.A00));
    }

    public static long A01(C22054Xuf xuf, Xn0 xn0, long j) {
        C270324gY r4 = xuf.A05;
        if (r4 instanceof XGU) {
            return j;
        }
        List list = xuf.A07;
        int size = list.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C270334gZ r8 = (C270334gZ) list.get(i);
            if (r8 instanceof C22054Xuf) {
                C22054Xuf xuf2 = (C22054Xuf) r8;
                if (xuf2.A05 != r4) {
                    j2 = Math.max(j2, A01(xuf2, xn0, ((long) xuf2.A00) + j));
                }
            }
        }
        if (xuf != r4.A04) {
            return j2;
        }
        long A05 = r4.A05();
        C22054Xuf xuf3 = r4.A03;
        long j3 = j + A05;
        return Math.max(Math.max(j2, A01(xuf3, xn0, j3)), j3 - ((long) xuf3.A00));
    }
}
