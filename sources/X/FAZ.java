package X;

import android.graphics.drawable.Drawable;

public final class FAZ {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public Drawable A04;
    public F0T A05;
    public final int A06;
    public final CharSequence A07;

    public FAZ(int i) {
        this.A00 = 1.0f;
        this.A07 = null;
        this.A06 = i;
    }

    public FAZ(CharSequence charSequence) {
        this.A00 = 1.0f;
        this.A07 = charSequence;
        this.A06 = 0;
    }
}
