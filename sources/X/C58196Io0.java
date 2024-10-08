package X;

import androidx.compose.ui.window.PopupLayout;

/* renamed from: X.Io0  reason: case insensitive filesystem */
public final class C58196Io0 extends 0Yg implements C62320sa {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C56558I1m A02;
    public final /* synthetic */ PopupLayout A03;
    public final /* synthetic */ 0rl A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58196Io0(C56558I1m i1m, PopupLayout popupLayout, 0rl r4, long j, long j2) {
        super(0);
        this.A04 = r4;
        this.A03 = popupLayout;
        this.A02 = i1m;
        this.A01 = j;
        this.A00 = j2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        0rl r2 = this.A04;
        PopupLayout popupLayout = this.A03;
        r2.A00 = popupLayout.A01.AF5(this.A02, popupLayout.A00, this.A01, this.A00);
        return C60340gF.A00;
    }
}
