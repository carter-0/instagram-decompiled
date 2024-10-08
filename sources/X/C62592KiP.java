package X;

import com.instagram.android.R;

/* renamed from: X.KiP  reason: case insensitive filesystem */
public enum C62592KiP {
    FILTER(0, R.attr.igds_color_secondary_text, R.attr.igds_color_primary_text, 8),
    FILTER_DARK(1, R.color.grey_6, R.attr.igds_color_text_on_color, 8),
    TOOL(2, R.attr.igds_color_primary_text, R.attr.igds_color_secondary_text, 0),
    TOOL_DARK(3, R.attr.igds_color_text_on_color, R.attr.igds_color_text_on_color, 0);
    
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;

    /* access modifiers changed from: public */
    static {
        C62592KiP[] kiPArr;
        A04 = 0oU.A00(kiPArr);
    }

    /* access modifiers changed from: public */
    C62592KiP(int i, int i2, int i3, int i4) {
        this.A03 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A00 = r2;
    }
}
