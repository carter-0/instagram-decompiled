package X;

import com.google.common.collect.ImmutableList;
import java.util.Arrays;

/* renamed from: X.SOv  reason: case insensitive filesystem */
public final class C11359SOv {
    public static final C12614Szy A02;
    public static final C12614Szy A03;
    public static final C12614Szy A04 = C12614Szy.A01(".。．｡");
    public static final C12614Szy A05;
    public static final C12614Szy A06;
    public static final C239023El A07 = C239023El.A00('.');
    public static final C7246Q0s A08 = C7246Q0s.A00('.');
    public final ImmutableList A00;
    public final String A01;

    static {
        C12614Szy A012 = C12614Szy.A01("-_");
        A02 = A012;
        C8637Qya A002 = C8637Qya.A00();
        A03 = A002;
        C12614Szy A072 = new C8637Qya('a', 'z').A07(new C8637Qya('A', 'Z'));
        A05 = A072;
        A06 = A002.A07(A072).A07(A012);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11359SOv) {
            return this.A01.equals(((C11359SOv) obj).A01);
        }
        return false;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final String toString() {
        return this.A01;
    }

    public C11359SOv(String str) {
        String charSequence;
        boolean z;
        C12614Szy szy = A04;
        if (szy instanceof C7247Q0t) {
            charSequence = str.toString().replace(((C7247Q0t) szy).A00, '.');
        } else if (szy instanceof C7249Q0w) {
            charSequence = str.toString();
        } else if (szy instanceof C8638Qyb) {
            char[] cArr = new char[str.length()];
            Arrays.fill(cArr, '.');
            charSequence = new String(cArr);
        } else {
            charSequence = str.toString();
            int A042 = szy.A04(charSequence);
            if (A042 != -1) {
                char[] charArray = charSequence.toCharArray();
                loop1:
                while (true) {
                    charArray[A042] = '.';
                    while (true) {
                        A042++;
                        if (A042 >= charArray.length) {
                            break loop1;
                        } else if (szy.A09(charArray[A042])) {
                        }
                    }
                }
                charSequence = new String(charArray);
            }
        }
        String A002 = C256643w7.A00(charSequence);
        boolean z2 = true;
        A002 = A002.endsWith(".") ? A002.substring(0, A002.length() - 1) : A002;
        17k.A0A(A002, "Domain name too long: '%s':", Pxg.A1T(A002.length(), 253));
        this.A01 = A002;
        ImmutableList copyOf = ImmutableList.copyOf((Iterable) new TAL(A08, A002));
        this.A00 = copyOf;
        17k.A0A(A002, "Domain has too many parts: '%s'", copyOf.size() > 127 ? false : z2);
        int size = copyOf.size() - 1;
        if (A00(AnonymousClass7TE.A19(copyOf, size), true)) {
            int i = 0;
            while (true) {
                if (i < size) {
                    if (!A00(AnonymousClass7TE.A19(copyOf, i), false)) {
                        break;
                    }
                    i++;
                } else {
                    z = true;
                    break;
                }
            }
            17k.A0A(A002, "Not a valid domain name: '%s'", z);
        }
        z = false;
        17k.A0A(A002, "Not a valid domain name: '%s'", z);
    }

    public static boolean A00(String str, boolean z) {
        int length = str.length();
        if (length >= 1 && length <= 63) {
            if (A06.A0A(C8639Qyc.A00.A06().A08(str))) {
                C12614Szy szy = A02;
                if (szy.A09(str.charAt(0)) || szy.A09(str.charAt(length - 1)) || (z && A03.A09(str.charAt(0)))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
