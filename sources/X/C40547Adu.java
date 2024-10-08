package X;

import android.widget.PopupWindow;

/* renamed from: X.Adu  reason: case insensitive filesystem */
public final class C40547Adu implements C367608rH {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C355048Oj A01;
    public final /* synthetic */ C362088hK A02;

    public C40547Adu(C355048Oj r1, C362088hK r2, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
    }

    public final void onClick() {
        C358088aL r3;
        C355048Oj r32 = this.A01;
        ((PopupWindow) r32.A11.getValue()).dismiss();
        C351978Be r2 = r32.A0q;
        C362088hK r1 = this.A02;
        r2.A0E(r1, AnonymousClass05K.A0N);
        int i = this.A00;
        27r A012 = 27p.A01(((A8X) r32.A13.getValue()).A00);
        int ordinal = r1.ordinal();
        if (ordinal == 0) {
            r3 = C358088aL.A0A;
        } else if (ordinal == 1) {
            r3 = C358088aL.A0m;
        } else if (ordinal == 2) {
            r3 = C358088aL.A0H;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        A012.A0F.A0S((C279294yP) null, (C371088xY) null, r3, AnonymousClass7TE.A1I(C371088xY.POST_CAPTURE_UTILITY_DROPDOWN), i, 0);
    }
}
