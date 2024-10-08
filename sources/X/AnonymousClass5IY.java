package X;

/* renamed from: X.5IY  reason: invalid class name */
public final class AnonymousClass5IY {
    public final AnonymousClass424 A00;
    public final String A01;

    public AnonymousClass5IY(AnonymousClass424 r2, String str) {
        0qQ.A0B(r2, 2);
        this.A01 = str;
        this.A00 = r2;
    }

    public final int A00(Integer num) {
        AnonymousClass424 r2;
        Integer num2;
        0qQ.A0B(num, 0);
        int intValue = num.intValue();
        if (intValue == 0) {
            r2 = this.A00;
            num2 = AnonymousClass05K.A00;
        } else if (intValue == 1) {
            r2 = this.A00;
            num2 = AnonymousClass05K.A01;
        } else if (intValue == 2) {
            r2 = this.A00;
            num2 = AnonymousClass05K.A0C;
        } else if (intValue == 3) {
            r2 = this.A00;
            num2 = AnonymousClass05K.A0N;
        } else {
            throw new RuntimeException();
        }
        return r2.A04(num2, this.A01);
    }

    public final long A01(Integer num) {
        AnonymousClass424 r4;
        Integer num2;
        Integer num3;
        0qQ.A0B(num, 0);
        int intValue = num.intValue();
        if (intValue == 0) {
            r4 = this.A00;
            num2 = AnonymousClass05K.A00;
        } else if (intValue == 1) {
            r4 = this.A00;
            num2 = AnonymousClass05K.A01;
        } else if (intValue == 2) {
            r4 = this.A00;
            num2 = AnonymousClass05K.A0C;
        } else if (intValue == 3) {
            r4 = this.A00;
            num2 = AnonymousClass05K.A0N;
        } else {
            throw new RuntimeException();
        }
        String str = this.A01;
        int intValue2 = num2.intValue();
        if (intValue2 == 0) {
            num3 = AnonymousClass05K.A0N;
        } else if (intValue2 == 1) {
            num3 = AnonymousClass05K.A0j;
        } else if (intValue2 != 2) {
            num3 = AnonymousClass05K.A1I;
        } else {
            num3 = AnonymousClass05K.A15;
        }
        return r4.A00.getLong(AnonymousClass424.A01(r4, num3, str), 0);
    }
}
