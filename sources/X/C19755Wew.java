package X;

import com.instagram.ui.widget.rangeseekbar.RangeSeekBar;

/* renamed from: X.Wew  reason: case insensitive filesystem */
public final class C19755Wew implements X5F {
    public final /* synthetic */ C15277UZf A00;

    public C19755Wew(C15277UZf uZf) {
        this.A00 = uZf;
    }

    public final void DbS(float f, float f2, float f3, float f4) {
        C15277UZf uZf = this.A00;
        RangeSeekBar rangeSeekBar = uZf.A0B;
        String str = "ageRangeSeekBar";
        if (rangeSeekBar != null) {
            rangeSeekBar.requestFocus();
            uZf.A01 = (int) f;
            uZf.A00 = (int) f2;
            RangeSeekBar rangeSeekBar2 = uZf.A0B;
            if (rangeSeekBar2 != null) {
                C21001X8y x8y = uZf.A0A;
                if (x8y == null) {
                    str = "delegate";
                } else {
                    rangeSeekBar2.A03(x8y);
                    C15277UZf.A01(uZf);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
