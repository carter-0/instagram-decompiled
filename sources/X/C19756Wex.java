package X;

import com.instagram.ui.widget.rangeseekbar.RangeSeekBar;

/* renamed from: X.Wex  reason: case insensitive filesystem */
public final class C19756Wex implements X5F {
    public final /* synthetic */ UZT A00;

    public C19756Wex(UZT uzt) {
        this.A00 = uzt;
    }

    public final void DbS(float f, float f2, float f3, float f4) {
        UZT uzt = this.A00;
        RangeSeekBar rangeSeekBar = uzt.A08;
        if (rangeSeekBar != null) {
            rangeSeekBar.requestFocus();
        }
        uzt.A01 = (int) f;
        uzt.A00 = (int) f2;
        RangeSeekBar rangeSeekBar2 = uzt.A08;
        if (rangeSeekBar2 != null) {
            C21001X8y x8y = uzt.A07;
            if (x8y == null) {
                0qQ.A0F("delegate");
                throw AnonymousClass00P.createAndThrow();
            }
            rangeSeekBar2.A03(x8y);
        }
        UZT.A01(uzt);
    }
}
