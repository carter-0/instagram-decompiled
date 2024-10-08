package X;

import java.util.Iterator;

public abstract class TMB implements Iterator {
    public Integer A00 = AnonymousClass05K.A01;
    public Object A01;

    public final boolean hasNext() {
        String str;
        int i;
        int i2;
        Integer num = this.A00;
        Integer num2 = AnonymousClass05K.A0N;
        17k.A0F(C51969G9p.A1a(num, num2));
        int intValue = num.intValue();
        if (intValue == 2) {
            return false;
        }
        if (intValue == 0) {
            return true;
        }
        this.A00 = num2;
        C8634QyX qyX = (C8634QyX) this;
        int i3 = qyX.A01;
        while (true) {
            int i4 = qyX.A01;
            if (i4 == -1) {
                qyX.A00 = AnonymousClass05K.A0C;
                str = null;
                break;
            }
            C12614Szy szy = qyX.A04.A00;
            CharSequence charSequence = qyX.A03;
            int A05 = szy.A05(charSequence, i4);
            if (A05 == -1) {
                A05 = charSequence.length();
                qyX.A01 = -1;
                i = -1;
            } else {
                i = A05 + 1;
                qyX.A01 = i;
            }
            if (i == i3) {
                int i5 = i + 1;
                qyX.A01 = i5;
                if (i5 > charSequence.length()) {
                    qyX.A01 = -1;
                }
            } else {
                while (i3 < A05 && qyX.A02.A09(charSequence.charAt(i3))) {
                    i3++;
                }
                while (i2 > i3 && qyX.A02.A09(charSequence.charAt(i2 - 1))) {
                    A05 = i2 - 1;
                }
                int i6 = qyX.A00;
                if (i6 == 1) {
                    i2 = charSequence.length();
                    qyX.A01 = -1;
                    while (i2 > i3 && qyX.A02.A09(charSequence.charAt(i2 - 1))) {
                        i2--;
                    }
                } else {
                    qyX.A00 = i6 - 1;
                }
                str = charSequence.subSequence(i3, i2).toString();
            }
        }
        this.A01 = str;
        if (this.A00 == AnonymousClass05K.A0C) {
            return false;
        }
        this.A00 = AnonymousClass05K.A00;
        return true;
    }

    public final Object next() {
        if (hasNext()) {
            this.A00 = AnonymousClass05K.A01;
            Object obj = this.A01;
            this.A01 = null;
            return obj;
        }
        throw Pxe.A1C();
    }

    public final void remove() {
        throw C66580MXl.A11();
    }
}
