package X;

import java.util.Comparator;

/* renamed from: X.SBw  reason: case insensitive filesystem */
public final class C11141SBw {
    public static final Comparator A00;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(String.valueOf(C11141SBw.class.getName()).concat("$UnsafeComparator")).getEnumConstants();
            enumConstants.getClass();
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = RJH.A01;
        }
        A00 = comparator;
    }
}
