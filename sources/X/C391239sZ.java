package X;

import com.instagram.android.R;

/* renamed from: X.9sZ  reason: invalid class name and case insensitive filesystem */
public enum C391239sZ {
    VIBRANT(r7, 0, R.color.design_dark_default_color_on_background),
    SUBTLE(r13, 1, R.color.sticker_subtle_light_background),
    RAINBOW(r7, 2, R.color.design_dark_default_color_on_background),
    HERO(new int[]{AnonymousClass7TF.A03(C60960kU.A00, R.attr.igds_color_text_on_white), AnonymousClass7TF.A03(C60960kU.A00, R.attr.igds_color_text_on_white)}, 3, r22),
    DEFAULT(new int[]{AnonymousClass7TF.A03(C60960kU.A00, R.attr.igds_color_text_on_white), AnonymousClass7TF.A03(C60960kU.A00, R.attr.igds_color_text_on_white)}, 4, r22),
    SUBTLE_REDESIGN(r13, 5, R.color.sticker_subtle_light_background),
    RAINBOW_REDESIGN(r7, 6, R.color.design_dark_default_color_on_background),
    HERO_REDESIGN(new int[]{AnonymousClass7TF.A03(C60960kU.A00, R.attr.igds_color_text_on_white), AnonymousClass7TF.A03(C60960kU.A00, R.attr.igds_color_text_on_white)}, 7, R.color.design_dark_default_color_on_background),
    VIBRANT_REDESIGN(new int[]{C60960kU.A00.getColor(R.color.igds_creation_tools_purple), C60960kU.A00.getColor(R.color.igds_creation_tools_purple)}, 8, r6),
    MONOTONE(r0, 9, r6);
    
    public int A00;
    public boolean A01;
    public final int A02;
    public final int[] A03;
    public final int[] A04;

    /* access modifiers changed from: public */
    C391239sZ(int[] iArr, int i, int i2) {
        this.A00 = 0;
        this.A02 = i2;
        this.A03 = r3;
        this.A04 = iArr;
    }
}
