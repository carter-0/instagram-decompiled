package X;

import com.facebook.flexlayout.layoutoutput.LayoutOutput;

/* renamed from: X.6TK  reason: invalid class name */
public final class AnonymousClass6TK implements AnonymousClass2Ta {
    public final Integer[] A00;
    public final LayoutOutput A01;
    public final 2Th A02;

    public final Object BLp() {
        return null;
    }

    public final int Ba8() {
        return 0;
    }

    public final int Ba9() {
        return 0;
    }

    public final int BaB() {
        return 0;
    }

    public final int BaC() {
        return 0;
    }

    public final AnonymousClass2Ta AnD(int i) {
        LayoutOutput layoutOutput = this.A01;
        Integer[] numArr = this.A00;
        if (numArr != null && numArr.length > i) {
            i = numArr[i].intValue();
        }
        return (AnonymousClass2Ta) layoutOutput.measureResults[i];
    }

    public final int AnO() {
        return this.A01.measureResults.length;
    }

    public final 2Th Blo() {
        return this.A02;
    }

    public final int CGw(int i) {
        LayoutOutput layoutOutput = this.A01;
        Integer[] numArr = this.A00;
        if (numArr != null && numArr.length > i) {
            i = numArr[i].intValue();
        }
        return (int) layoutOutput.arr[AnonymousClass05K.A00(3).length + (i * AnonymousClass05K.A00(4).length)];
    }

    public final int CHT(int i) {
        LayoutOutput layoutOutput = this.A01;
        Integer[] numArr = this.A00;
        if (numArr != null && numArr.length > i) {
            i = numArr[i].intValue();
        }
        return (int) layoutOutput.arr[AnonymousClass05K.A00(3).length + (i * AnonymousClass05K.A00(4).length) + 1];
    }

    public final int getHeight() {
        return (int) this.A01.arr[1];
    }

    public final int getWidth() {
        return (int) this.A01.arr[0];
    }

    public AnonymousClass6TK(LayoutOutput layoutOutput, 2Th r2, Integer[] numArr) {
        this.A01 = layoutOutput;
        this.A02 = r2;
        this.A00 = numArr;
    }
}
