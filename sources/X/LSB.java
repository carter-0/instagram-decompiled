package X;

import android.view.View;

public final class LSB {
    public final int A00;
    public final int A01;
    public final View.OnClickListener A02;
    public final View.OnClickListener A03;
    public final Integer A04;
    public final Long A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public LSB(View.OnClickListener onClickListener, Integer num, String str, String str2, String str3) {
        this.A01 = 0;
        this.A00 = 0;
        this.A09 = str;
        this.A07 = str3;
        this.A08 = str2;
        this.A03 = onClickListener;
        this.A06 = null;
        this.A02 = null;
        this.A04 = num;
        this.A05 = null;
    }

    public LSB(String str, String str2) {
        this.A01 = 0;
        this.A00 = 0;
        this.A09 = str;
        this.A07 = str2;
        this.A08 = null;
        this.A03 = null;
        this.A06 = null;
        this.A02 = null;
        this.A04 = null;
        this.A05 = null;
    }

    public LSB(View.OnClickListener onClickListener, Integer num, Long l, String str, String str2, String str3) {
        this.A01 = 0;
        this.A00 = 0;
        this.A09 = str;
        this.A07 = str2;
        this.A08 = null;
        this.A03 = null;
        this.A06 = str3;
        this.A02 = onClickListener;
        this.A04 = num;
        this.A05 = l;
    }

    public LSB(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A09 = null;
        this.A07 = null;
        this.A08 = null;
        this.A03 = null;
        this.A06 = null;
        this.A02 = null;
        this.A04 = null;
        this.A05 = null;
    }
}
