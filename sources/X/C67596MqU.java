package X;

import com.instagram.android.R;

/* renamed from: X.MqU  reason: case insensitive filesystem */
public abstract class C67596MqU {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public /* synthetic */ C67596MqU(float f, float f2, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3) {
        i = (i5 & 1) != 0 ? R.dimen.account_group_management_title_text_horizontal_padding : i;
        i2 = (i5 & 2) != 0 ? R.dimen.abc_action_bar_elevation_material : i2;
        i3 = (i5 & 4) != 0 ? R.dimen.afi_indicator_arrow_margin_top : i3;
        i4 = (i5 & 8) != 0 ? R.dimen.abc_edit_text_inset_top_material : i4;
        boolean z4 = true;
        boolean A1P = AnonymousClass7TF.A1P(i5 & 16);
        boolean z5 = false;
        boolean A1Q = C51966G9m.A1Q(i5 & 32, z);
        boolean A1Q2 = C51966G9m.A1Q(i5 & 64, z2);
        z4 = (i5 & 128) == 0 ? false : z4;
        f = (i5 & 256) != 0 ? 1.0f : f;
        f2 = (i5 & 512) != 0 ? 0.0f : f2;
        z5 = (i5 & 1024) == 0 ? z3 : z5;
        this.A04 = i;
        this.A02 = i2;
        this.A05 = i3;
        this.A03 = i4;
        this.A09 = A1P;
        this.A0A = A1Q;
        this.A07 = A1Q2;
        this.A06 = z4;
        this.A01 = f;
        this.A00 = f2;
        this.A08 = z5;
    }
}
