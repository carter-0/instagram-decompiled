package X;

import android.text.TextUtils;
import com.google.common.collect.ImmutableList;

/* renamed from: X.6q5  reason: invalid class name and case insensitive filesystem */
public abstract class C319126q5 {
    public static String A00(C268654dm r1) {
        Throwable A01;
        C13802ThL thL;
        if (r1 == null || (A01 = r1.A01()) == null || !(A01 instanceof C16693V1w)) {
            return null;
        }
        ImmutableList immutableList = ((C16693V1w) A01).A00;
        if (immutableList != null) {
            thL = (C13802ThL) 00k.A0J(immutableList);
        } else {
            thL = null;
        }
        thL.getClass();
        return thL.getDescription();
    }

    public static String A01(C268654dm r1) {
        if (r1 instanceof C268674do) {
            return ((AnonymousClass1XT) r1.A00()).getErrorType();
        }
        return null;
    }

    public static String A02(C268654dm r2) {
        if (r2 instanceof C268674do) {
            AnonymousClass1XT r1 = (AnonymousClass1XT) r2.A00();
            if (!TextUtils.isEmpty(r1.getErrorMessage())) {
                return r1.getErrorMessage();
            }
        }
        Throwable A01 = r2.A01();
        if (A01 == null || TextUtils.isEmpty(A01.getMessage())) {
            return "";
        }
        return A01.getMessage();
    }

    public static String A03(C268654dm r1, String str) {
        String str2;
        Throwable A01;
        ImmutableList immutableList;
        C13802ThL thL;
        if (r1 == null || (A01 = r1.A01()) == null || !(A01 instanceof C16693V1w) || (immutableList = ((C16693V1w) A01).A00) == null || (thL = (C13802ThL) 00k.A0J(immutableList)) == null) {
            str2 = str;
        } else {
            str2 = thL.getDescription();
        }
        if (str2 == null || TextUtils.isEmpty(str2)) {
            return str;
        }
        return str2;
    }

    public static String A04(C268654dm r1, String str) {
        if (!(r1 instanceof C268674do)) {
            return str;
        }
        AnonymousClass1XT r12 = (AnonymousClass1XT) r1.A00();
        if (!TextUtils.isEmpty(r12.getErrorMessage())) {
            return r12.getErrorMessage();
        }
        return str;
    }

    public static boolean A05(0lg r2) {
        if (AnonymousClass0eD.A00(r2) == null || AnonymousClass0eD.A00(r2).A0J() != 16V.A05) {
            return false;
        }
        return true;
    }

    public static boolean A06(0lg r2) {
        if (AnonymousClass0eD.A00(r2) == null || AnonymousClass0eD.A00(r2).A0J() != 16V.A06) {
            return false;
        }
        return true;
    }

    public static boolean A07(0lg r1) {
        if (A05(r1) || A06(r1)) {
            return true;
        }
        return false;
    }
}
