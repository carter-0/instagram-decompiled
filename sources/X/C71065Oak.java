package X;

import android.view.View;

/* renamed from: X.Oak  reason: case insensitive filesystem */
public class C71065Oak {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public CharSequence A08;
    public CharSequence A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public final View.OnClickListener A0D;
    public final String A0E;

    public C71065Oak(View.OnClickListener onClickListener, int i) {
        this(onClickListener, (String) null, i, 0);
    }

    public C71065Oak(View.OnClickListener onClickListener, CharSequence charSequence, CharSequence charSequence2, String str) {
        this.A00 = 1.0f;
        this.A09 = charSequence;
        this.A08 = charSequence2;
        this.A0B = false;
        this.A0E = str;
        this.A0D = onClickListener;
    }

    public C71065Oak(View.OnClickListener onClickListener, CharSequence charSequence, String str, boolean z) {
        0qQ.A0B(charSequence, 1);
        this.A00 = 1.0f;
        this.A09 = charSequence;
        this.A0B = z;
        this.A0E = str;
        this.A0D = onClickListener;
    }

    public C71065Oak(View.OnClickListener onClickListener, String str, int i, int i2) {
        this.A00 = 1.0f;
        this.A06 = i;
        this.A0D = onClickListener;
        this.A04 = i2;
        this.A0B = false;
        this.A0E = str;
    }
}
