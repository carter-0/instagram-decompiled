package X;

import com.facebook.common.dextricks.Constants;

/* renamed from: X.3at  reason: invalid class name and case insensitive filesystem */
public final class C244253at implements AnonymousClass2WY {
    public final Integer A00;
    public final Object A01;
    public final String A02;

    public final void ABy(2TC r8, 2V1 r9) {
        0qQ.A0B(r8, 1);
        int intValue = this.A00.intValue();
        Object obj = this.A01;
        switch (intValue) {
            case 0:
                0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.VisibleEvent, kotlin.Unit>");
                0u4.A05(obj, 1);
                C244173al r2 = new C244173al(this.A02, (0sP) obj);
                C243593Zj A012 = 2TC.A01(r8);
                A012.A02 |= 8;
                A012.A0D = r2;
                return;
            case 1:
                0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.InvisibleEvent, kotlin.Unit>");
                0u4.A05(obj, 1);
                C244173al r22 = new C244173al(this.A02, (0sP) obj);
                C243593Zj A013 = 2TC.A01(r8);
                A013.A02 |= 64;
                A013.A0A = r22;
                return;
            case 2:
                0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.FocusedVisibleEvent, kotlin.Unit>");
                0u4.A05(obj, 1);
                C244173al r23 = new C244173al(this.A02, (0sP) obj);
                C243593Zj A014 = 2TC.A01(r8);
                A014.A02 |= 16;
                A014.A08 = r23;
                return;
            case 3:
                0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.UnfocusedVisibleEvent, kotlin.Unit>");
                0u4.A05(obj, 1);
                C244173al r24 = new C244173al(this.A02, (0sP) obj);
                C243593Zj A015 = 2TC.A01(r8);
                A015.A02 |= 128;
                A015.A0B = r24;
                return;
            case 4:
                0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.FullImpressionVisibleEvent, kotlin.Unit>");
                0u4.A05(obj, 1);
                C244173al r25 = new C244173al(this.A02, (0sP) obj);
                C243593Zj A016 = 2TC.A01(r8);
                A016.A02 |= 32;
                A016.A09 = r25;
                return;
            case 5:
                0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.VisibilityChangedEvent, kotlin.Unit>");
                0u4.A05(obj, 1);
                C244173al r3 = new C244173al(this.A02, (0sP) obj);
                C243593Zj A017 = 2TC.A01(r8);
                A017.A02 |= Constants.LOAD_RESULT_PGO_ATTEMPTED;
                A017.A0C = r3;
                return;
            default:
                if (obj instanceof C56055Hs4) {
                    int i = ((C56055Hs4) obj).A00;
                    2TG A022 = 2TC.A02(r8);
                    C56055Hs4 hs4 = new C56055Hs4(i);
                    A022.A0F |= 17179869184L;
                    A022.A0Y = hs4;
                    r8.A08 = true;
                    return;
                }
                return;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C244253at) {
                C244253at r5 = (C244253at) obj;
                if (this.A00 != r5.A00 || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.A00;
        int hashCode2 = (C16786V5t.A00(num).hashCode() + num.intValue()) * 31;
        Object obj = this.A01;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VisibilityStyleItem(field=");
        sb.append(C16786V5t.A00(this.A00));
        sb.append(", value=");
        sb.append(this.A01);
        sb.append(", tag=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public C244253at(Integer num, Object obj, String str) {
        this.A00 = num;
        this.A01 = obj;
        this.A02 = str;
    }
}
