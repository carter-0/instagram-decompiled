package X;

import java.util.UUID;

/* renamed from: X.7vQ  reason: invalid class name and case insensitive filesystem */
public final class C346587vQ {
    public static int A00 = 1;
    public static Boolean A01;
    public static Boolean A02;
    public static Boolean A03;
    public static Integer A04;
    public static Long A05;
    public static Long A06;
    public static String A07;
    public static String A08;
    public static String A09;
    public static String A0A;
    public static String A0B;
    public static final C346587vQ A0C = new Object();

    public final synchronized Boolean A00() {
        return A01;
    }

    public final synchronized Boolean A01() {
        return A02;
    }

    public final synchronized Integer A02() {
        return A04;
    }

    public final synchronized Long A03() {
        return A05;
    }

    public final synchronized Long A04() {
        return A06;
    }

    public final synchronized String A05() {
        return A07;
    }

    public final synchronized String A06() {
        String str;
        str = A08;
        if (str == null) {
            str = A09();
        }
        return str;
    }

    public final synchronized String A07() {
        return A09;
    }

    public final synchronized String A08() {
        return A0A;
    }

    public final synchronized String A09() {
        String obj;
        obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        A08 = obj;
        A06 = Long.valueOf(System.currentTimeMillis());
        A03 = true;
        return obj;
    }

    public final synchronized void A0A(boolean z) {
        A02 = Boolean.valueOf(z);
    }

    public final synchronized boolean A0B() {
        boolean z;
        Boolean bool = A03;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        return z;
    }
}
