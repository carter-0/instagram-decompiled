package X;

import java.util.List;

/* renamed from: X.SrF  reason: case insensitive filesystem */
public final class C12312SrF implements C13588TdG {
    public final C13588TdG A00;
    public final List A01;

    public C12312SrF(C13588TdG tdG, List list) {
        this.A01 = list;
        this.A00 = tdG;
    }

    public final /* bridge */ /* synthetic */ C13852TiV AL5() {
        01N A1H = 0jo.A1H();
        for (C13951TmC AL6 : this.A01) {
            A1H.add(AL6.AL6());
        }
        01N A1I = 0jo.A1I(A1H);
        C13852TiV AL5 = this.A00.AL5();
        0qQ.A07(AL5);
        return new C12310SrD(AL5, A1I);
    }
}
