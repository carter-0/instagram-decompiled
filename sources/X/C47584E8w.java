package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.E8w  reason: case insensitive filesystem */
public final class C47584E8w extends C331047Ph implements G5R, C51858G4q {
    public final C51857G4p A00;
    public final C47620EAg A01;
    public final EB0 A02;
    public final C47637EAx A03;
    public final EAK A04;
    public final List A05;

    public final void D6n() {
    }

    public C47584E8w(Context context, C51857G4p g4p, AnonymousClass0iw r8, String str, String str2, String str3) {
        this.A00 = g4p;
        EAK eak = new EAK(context, this, r8);
        this.A04 = eak;
        EB0 eb0 = new EB0(context, str2 == null ? "" : str2);
        this.A02 = eb0;
        C47637EAx eAx = new C47637EAx(context, str == null ? "" : str, str3 == null ? "" : str3);
        this.A03 = eAx;
        C47620EAg eAg = new C47620EAg(context, this);
        this.A01 = eAg;
        this.A05 = AnonymousClass7TE.A1C();
        A0B(eAx, eak, eAg, eb0);
    }
}
