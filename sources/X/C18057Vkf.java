package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.Vkf  reason: case insensitive filesystem */
public final class C18057Vkf {
    public static volatile Integer A0D;
    public final double A00;
    public final double A01;
    public final String A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final Set A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public C18057Vkf(Integer num, String str, String str2, String str3, Set set, double d, double d2, int i, int i2, long j, boolean z, boolean z2, boolean z3) {
        this.A0A = z;
        this.A05 = j;
        C11367SPk.A03(str, "fullAddress");
        this.A07 = str;
        this.A00 = d;
        this.A03 = i;
        this.A01 = d2;
        this.A04 = i2;
        this.A0B = z2;
        this.A06 = num;
        this.A0C = z3;
        C11367SPk.A03(str2, "userId");
        this.A02 = str2;
        C11367SPk.A03(str3, "userName");
        this.A08 = str3;
        this.A09 = Collections.unmodifiableSet(set);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C18057Vkf) {
                C18057Vkf vkf = (C18057Vkf) obj;
                if (!(this.A0A == vkf.A0A && this.A05 == vkf.A05 && 0qQ.A0K(this.A07, vkf.A07) && this.A00 == vkf.A00 && this.A03 == vkf.A03 && this.A01 == vkf.A01 && this.A04 == vkf.A04 && this.A0B == vkf.A0B && A00() == vkf.A00() && this.A0C == vkf.A0C && 0qQ.A0K(this.A02, vkf.A02) && 0qQ.A0K(this.A08, vkf.A08))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer A00() {
        if (this.A09.contains(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS)) {
            return this.A06;
        }
        if (A0D == null) {
            synchronized (this) {
                if (A0D == null) {
                    A0D = AnonymousClass05K.A00;
                }
            }
        }
        return A0D;
    }

    public final int hashCode() {
        int intValue;
        int i = 1237;
        if (this.A0A) {
            i = 1231;
        }
        int A002 = C11367SPk.A00(((((((((((((i + 31) * 31) + C51968G9o.A03(this.A05)) * 31) + C51971G9r.A0E(this.A07)) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A00))) * 31) + this.A03) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A01))) * 31) + this.A04, this.A0B);
        if (A00() == null) {
            intValue = -1;
        } else {
            intValue = A00().intValue();
        }
        return (((C11367SPk.A00((A002 * 31) + intValue, this.A0C) * 31) + C51971G9r.A0E(this.A02)) * 31) + C51971G9r.A0E(this.A08);
    }
}
