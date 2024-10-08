package X;

import java.math.BigInteger;

/* renamed from: X.48j  reason: invalid class name and case insensitive filesystem */
public abstract class C2611348j {
    public static final long A00(String str) {
        0qQ.A0B(str, 0);
        return A01(str) / 1000000;
    }

    public static final String A03(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new BigInteger(str).and(new BigInteger("FFFFFFFFFFFFFFFF", 16)).toString();
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final String A04(String str, long j) {
        0qQ.A0B(str, 0);
        if (1388563201 > j || j >= 32945472000L) {
            throw new RuntimeException(002.A0e("serverTimestampSec: ", " passed for generating itemId is invalid!", j));
        }
        long parseLong = Long.parseLong(str);
        BigInteger valueOf = BigInteger.valueOf((j * 1000000) + ((((parseLong >> 22) & 2199023255551L) % 100000) * 10) + (parseLong % 10));
        0qQ.A07(valueOf);
        BigInteger shiftLeft = valueOf.shiftLeft(64);
        BigInteger valueOf2 = BigInteger.valueOf(parseLong);
        0qQ.A07(valueOf2);
        String obj = shiftLeft.or(valueOf2).toString();
        0qQ.A07(obj);
        if (obj.length() == 35) {
            return obj;
        }
        throw new RuntimeException(002.A0g("serverItemId: ", obj, " generated is invalid!"));
    }

    public static final String A02(long j, boolean z) {
        long j2;
        if (!z) {
            j2 = 999;
        } else {
            j2 = 0;
        }
        BigInteger valueOf = BigInteger.valueOf((j * 1000) + j2);
        0qQ.A07(valueOf);
        BigInteger shiftLeft = valueOf.shiftLeft(64);
        BigInteger valueOf2 = BigInteger.valueOf(Long.MAX_VALUE);
        0qQ.A07(valueOf2);
        String obj = shiftLeft.add(valueOf2).toString();
        0qQ.A07(obj);
        return obj;
    }

    public static final long A01(String str) {
        long j;
        Long A0n;
        String A03 = A03(str);
        if (A03 == null || (A0n = 00y.A0n(10, A03)) == null) {
            j = 0;
        } else {
            j = A0n.longValue() % 10;
        }
        return new BigInteger(str).shiftRight(64).longValue() - j;
    }
}
