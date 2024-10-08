package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;

public final class F13 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View.OnClickListener A05;
    public final C358618bC A06;
    public final Integer A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public /* synthetic */ F13(Context context, View.OnClickListener onClickListener, C358618bC r12, Integer num, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4) {
        int i5;
        int i6;
        boolean z5 = z2;
        boolean z6 = z3;
        boolean z7 = z4;
        int i7 = i4;
        boolean z8 = (i4 & 16) != 0 ? false : z;
        if ((i4 & 32) != 0) {
            i5 = 2Yu.A0H(context, z8 ? R.attr.igds_color_error_or_destructive : R.attr.igds_color_primary_icon);
        } else {
            i5 = 0;
        }
        if ((i4 & 64) != 0) {
            i6 = 2Yu.A0H(context, z8 ? R.attr.igds_color_error_or_destructive : R.attr.igds_color_primary_text);
        } else {
            i6 = 0;
        }
        z5 = (i7 & 128) != 0 ? false : z5;
        z6 = (i7 & 256) != 0 ? false : z6;
        r12 = (i7 & 512) != 0 ? null : r12;
        num = (i7 & 1024) != 0 ? null : num;
        z7 = (i7 & C249703kE.FLAG_MOVED) != 0 ? false : z7;
        this.A02 = i;
        this.A04 = i2;
        this.A00 = i3;
        this.A08 = z8;
        this.A01 = i5;
        this.A03 = i6;
        this.A0B = z5;
        this.A0A = z6;
        this.A06 = r12;
        this.A07 = num;
        this.A09 = z7;
        this.A05 = onClickListener;
    }
}
