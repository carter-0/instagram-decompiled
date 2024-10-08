package X;

import com.facebook.common.dextricks.Constants;

/* renamed from: X.3Ze  reason: invalid class name and case insensitive filesystem */
public final class C243543Ze implements AnonymousClass2WY {
    public final 2V1 A00;
    public final C243533Zd A01;
    public final String A02;

    public C243543Ze(2V1 r2, C243533Zd r3, String str) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(r3, 3);
        this.A00 = r2;
        this.A02 = str;
        this.A01 = r3;
    }

    public final void ABy(2TC r5, 2V1 r6) {
        0qQ.A0B(r5, 1);
        String str = this.A02;
        String A08 = this.A00.A08();
        C243593Zj A012 = 2TC.A01(r5);
        A012.A02 |= 512;
        A012.A0F = str;
        A012.A0G = A08;
        C243533Zd r3 = this.A01;
        C243593Zj A013 = 2TC.A01(r5);
        A013.A02 |= Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
        A013.A0E = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C243543Ze) {
                C243543Ze r5 = (C243543Ze) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A02, r5.A02) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        String str = this.A02;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransitionKeyStyleItem(context=");
        sb.append(this.A00);
        sb.append(", transitionKey=");
        sb.append(this.A02);
        sb.append(", transitionKeyType=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }
}
