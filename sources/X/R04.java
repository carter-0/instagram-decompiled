package X;

import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.RegularImmutableMultiset;

public class R04 extends 1J3 {
    public SK2 A00;
    public boolean A01 = false;

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.SK2] */
    public R04() {
        ? obj = new Object();
        obj.A09(4, 1.0f);
        this.A00 = obj;
    }

    public /* bridge */ /* synthetic */ 1J3 add(Object obj) {
        if (this instanceof R0P) {
            ((R0P) this).A04(obj, 1);
            return this;
        }
        A02(obj, 1);
        return this;
    }

    /* renamed from: A00 */
    public final ImmutableMultiset build() {
        if (this instanceof R0P) {
            return ((R0P) this).build();
        }
        this.A00.getClass();
        SK2 sk2 = this.A00;
        if (sk2.A02 == 0) {
            return RegularImmutableMultiset.A03;
        }
        this.A01 = true;
        return new RegularImmutableMultiset(sk2);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.SK2] */
    public final void A02(Object obj, int i) {
        int i2;
        if (this instanceof R0P) {
            ((R0P) this).A04(obj, i);
            return;
        }
        this.A00.getClass();
        if (i != 0) {
            if (this.A01) {
                SK2 sk2 = this.A00;
                ? obj2 = new Object();
                obj2.A09(sk2.A02, 1.0f);
                for (int A02 = sk2.A02(); A02 != -1; A02 = sk2.A03(A02)) {
                    17k.A01(A02, sk2.A02);
                    Object obj3 = sk2.A06[A02];
                    17k.A01(A02, sk2.A02);
                    obj2.A0A(obj3, sk2.A05[A02]);
                }
                this.A00 = obj2;
            }
            this.A01 = false;
            obj.getClass();
            SK2 sk22 = this.A00;
            int A05 = sk22.A05(obj);
            if (A05 == -1) {
                i2 = 0;
            } else {
                i2 = sk22.A05[A05];
            }
            sk22.A0A(obj, i + i2);
        }
    }
}
