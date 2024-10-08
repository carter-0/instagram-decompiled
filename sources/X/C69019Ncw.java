package X;

import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.Ncw  reason: case insensitive filesystem */
public final class C69019Ncw extends AnonymousClass369 {
    public final NMW A00;
    public final ReboundViewPager A01;
    public final C67687MsP A02;

    public final void FN9(AnonymousClass345 r5, int i) {
        0qQ.A0B(r5, 0);
        AnonymousClass3UL A002 = C70285O0p.A00(this.A02, i);
        if (A002 != null) {
            ReboundViewPager reboundViewPager = this.A01;
            if (C55005Hac.A00(reboundViewPager, 0.75d) && C55005Hac.A00(reboundViewPager.A0D(i), 0.5d)) {
                r5.FNA(A002.getId(), A002, i);
            }
        }
    }

    public final Class C9I() {
        return AnonymousClass3UL.class;
    }

    public final /* bridge */ /* synthetic */ void Cry(Object obj) {
        AnonymousClass3UL r4 = (AnonymousClass3UL) obj;
        0qQ.A0B(r4, 0);
        NMW.A00(this.A00, r4.getId(), true);
    }

    public final /* bridge */ /* synthetic */ void Cs0(Object obj, int i) {
        AnonymousClass3UL r11 = (AnonymousClass3UL) obj;
        0qQ.A0B(r11, 0);
        NMW nmw = this.A00;
        nmw.A00.put(r11.getId(), new OH5(nmw, r11.A08, r11.A04, r11.A05, i, System.currentTimeMillis()));
    }

    public C69019Ncw(ReboundViewPager reboundViewPager, NMW nmw, C67687MsP msP) {
        this.A01 = reboundViewPager;
        this.A02 = msP;
        this.A00 = nmw;
    }
}
