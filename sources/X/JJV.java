package X;

import androidx.compose.foundation.layout.FillElement;

public final class JJV extends 0Yg implements 0sJ {
    public final /* synthetic */ C54085Gz9 A00;
    public final /* synthetic */ boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JJV(C54085Gz9 gz9, boolean z) {
        super(4);
        this.A01 = z;
        this.A00 = gz9;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long j;
        boolean A1a = AnonymousClass7TE.A1a(obj2);
        C286575Wy r5 = (C286575Wy) obj3;
        boolean A1b = C51972G9s.A1b(obj4, obj);
        if (0fL.A02()) {
            0fL.A01(1617839575, "com.instagram.archive.updateshub.ContentCalendarPog.<anonymous>.<anonymous> (ArchiveCalendarStrip.kt:214)");
        }
        if (this.A01) {
            j = C51967G9n.A0a(r5, 2138910063).A0p;
        } else {
            j = C51967G9n.A0a(r5, 2138911306).A0t;
        }
        C286565Wx A0H = C51965G9l.A0H(r5, A1b);
        if (A1a) {
            C52390GQp.A02(r5, C51965G9l.A0K(r5, 1881785533).Ezh(new FillElement(AnonymousClass05K.A0C, 0.5f)), 2.0f, 390, A1b ? 1 : 0, j);
        } else {
            r5.ExS(1881990133);
            AnonymousClass5ZZ.A0r(r5, C51966G9m.A0h(r5), String.valueOf(this.A00.A00), j);
        }
        if (C51967G9n.A1b(A0H, A1b)) {
            0fL.A00(-1093838459);
        }
        return C60340gF.A00;
    }
}
