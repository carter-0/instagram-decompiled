package X;

import android.content.Context;

/* renamed from: X.Icc  reason: case insensitive filesystem */
public final class C57550Icc implements JT7 {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;

    public final /* bridge */ /* synthetic */ Object EIh(Context context, C59535JNh jNh) {
        float f;
        float f2;
        float f3;
        Integer num = AnonymousClass05K.A00;
        int intValue = this.A01.intValue();
        if (intValue == 1) {
            f = 0.8f;
        } else if (intValue == 0) {
            f = 0.75f;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        Integer num2 = this.A00;
        C56103Hsq hsq = new C56103Hsq(num, f, C55216He7.A00(num2));
        Integer num3 = AnonymousClass05K.A01;
        Integer num4 = this.A02;
        int intValue2 = num4.intValue();
        if (intValue2 == 0) {
            f2 = 0.97f;
        } else if (intValue2 == 1) {
            f2 = 0.98f;
        } else if (intValue2 == 2) {
            f2 = 1.0f;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        C56103Hsq hsq2 = new C56103Hsq(num3, f2, C55216He7.A00(num2));
        Integer num5 = AnonymousClass05K.A0C;
        int intValue3 = num4.intValue();
        if (intValue3 == 0) {
            f3 = 0.97f;
        } else if (intValue3 == 1) {
            f3 = 0.98f;
        } else if (intValue3 == 2) {
            f3 = 1.0f;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return new C56062HsB(0sr.A1P(new C56103Hsq[]{hsq, hsq2, new C56103Hsq(num5, f3, C55216He7.A00(num2))}));
    }

    public C57550Icc(Integer num, Integer num2, Integer num3) {
        AnonymousClass7TG.A1U(num, num2, num3);
        this.A01 = num;
        this.A02 = num2;
        this.A00 = num3;
    }
}
