package X;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: X.Sqr  reason: case insensitive filesystem */
public final class C12293Sqr implements AnonymousClass46H, Serializable, Cloneable {
    public static final AnonymousClass46E A02 = new AnonymousClass46E("qualityOfService", (byte) 8, 2);
    public static final AnonymousClass46E A03 = new AnonymousClass46E("topicName", (byte) 11, 1);
    public static final AnonymousClass46D A04 = new Object();
    public final Integer A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof C12293Sqr) {
                    C12293Sqr sqr = (C12293Sqr) obj;
                    String str = this.A01;
                    boolean A1V = AnonymousClass7TF.A1V(str);
                    String str2 = sqr.A01;
                    if (!(AnonymousClass7TF.A1V(str2) ^ A1V) && (!A1V || (str != null ? str.equals(str2) : str2 == null))) {
                        Integer num = this.A00;
                        boolean A1V2 = AnonymousClass7TF.A1V(num);
                        Integer num2 = sqr.A00;
                        if (!(AnonymousClass7TF.A1V(num2) ^ A1V2)) {
                            if (A1V2) {
                                if (num == null) {
                                    if (num2 == null) {
                                        return true;
                                    }
                                } else if (!num.equals(num2)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        return SPv.A01(this, AnonymousClass7TE.A1A(), 1);
    }

    public final int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.A01, this.A00});
    }

    public C12293Sqr(String str, Integer num) {
        this.A01 = str;
        this.A00 = num;
    }
}
