package X;

import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.8K9  reason: invalid class name */
public final class AnonymousClass8K9 implements AnonymousClass8KA {
    public final /* synthetic */ AnonymousClass8K4 A00;

    public AnonymousClass8K9(AnonymousClass8K4 r1) {
        this.A00 = r1;
    }

    public final void Dpt(int i) {
        ComposeView composeView;
        AnonymousClass8K4 r5 = this.A00;
        ((C229402nK) r5.A0k.getValue()).A02(true);
        String str = C353948Ka.A00(r5.A0D).A01(i).A04;
        r5.A0K.A04(str, 1000);
        A6N a6n = r5.A04;
        if (!(a6n == null || (composeView = a6n.A00) == null)) {
            composeView.setVisibility(0);
        }
        for (C352348Cz DBP : r5.A0G.A1u) {
            DBP.DBP(true);
        }
        C394839ym.A00(r5.A0A, str);
    }

    public final void Dpx() {
        AnonymousClass8K4 r2 = this.A00;
        ((C229402nK) r2.A0k.getValue()).A02(false);
        r2.A0K.A05(false);
    }
}
