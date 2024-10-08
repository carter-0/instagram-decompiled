package X;

import java.util.ArrayList;

/* renamed from: X.WDy  reason: case insensitive filesystem */
public final class C18945WDy implements AnonymousClass3K4 {
    public final /* synthetic */ C17219VMx A00;
    public final /* synthetic */ C17577VaV A01;

    public C18945WDy(C17219VMx vMx, C17577VaV vaV) {
        this.A00 = vMx;
        this.A01 = vaV;
    }

    public final void CvG(C14001To3 to3, float f, float f2, boolean z) {
        ArrayList arrayList = to3.A0A;
        int indexOf = arrayList.indexOf(this);
        if (indexOf >= 0) {
            arrayList.set(indexOf, (Object) null);
        }
        C17219VMx vMx = this.A00;
        C17577VaV vaV = this.A01;
        C249703kE r3 = vaV.A04;
        boolean z2 = vaV.A05;
        U05 u05 = vMx.A00;
        u05.A00.remove(r3);
        if (z2) {
            u05.A0O(r3);
        } else {
            u05.A0Q(r3);
        }
        if (!u05.A0L()) {
            u05.A0A();
        }
    }
}
