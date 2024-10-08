package X;

import android.app.Application;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Jfa  reason: case insensitive filesystem */
public final class C60094Jfa extends C361478gI {
    public final AnonymousClass0r6 A00;
    public final 0V2 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60094Jfa(Application application) {
        super(application);
        0qQ.A0B(application, 1);
        05D A0p = JTQ.A0p();
        this.A01 = A0p;
        this.A00 = A0p;
    }

    public final void A0E(int i, boolean z, List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.add(new KMB(i, z));
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            A1C.add(new KMA(((AnonymousClass51N) list.get(i2)).BrP(), z));
            if (i2 != DbT.A02(list, 1)) {
                A1C.add(new KMB(10, z));
            }
        }
        A1C.add(new KMB(i, z));
        MHN.A03(A1C, this, C318116oQ.A00(this), 5);
    }
}
