package X;

import com.instagram.common.recyclerview.ViewModelListUpdate;

/* renamed from: X.MhA  reason: case insensitive filesystem */
public final class C67037MhA implements 1aV {
    public final /* synthetic */ C66633Ma2 A00;

    public C67037MhA(C66633Ma2 ma2) {
        this.A00 = ma2;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        ViewModelListUpdate viewModelListUpdate = (ViewModelListUpdate) obj;
        C66633Ma2 ma2 = this.A00;
        0qQ.A0A(viewModelListUpdate);
        boolean A06 = 182.A06(0Tu.A05, ma2.A0p(), 36329732492837162L);
        if (!A06) {
            ((C67080Mhv) ma2.A1c.getValue()).A00(viewModelListUpdate);
            return;
        }
        if (ma2.A0t == null) {
            ma2.A0t = C51968G9o.A0u();
        }
        C227912kJ.A01(ma2.A0p(), ma2.A0t, new C73916Plr(3, viewModelListUpdate, ma2), new GN2(12, ma2, viewModelListUpdate, A06), A06);
    }
}
