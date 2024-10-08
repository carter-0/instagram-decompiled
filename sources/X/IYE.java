package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class IYE implements AnonymousClass2wO {
    public final AnonymousClass2wO A00;
    public final AnonymousClass2wO A01;

    public IYE(AnonymousClass2wO r1, AnonymousClass2wO r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ void AWG(C54608HKr hKr, 1PW r3, Object obj) {
        AnonymousClass7TG.A1T(obj, hKr, r3);
        this.A00.AWG(hKr, r3, obj);
        this.A01.AWG(hKr, r3, obj);
    }

    public final C271864ji E4e(String str, Collection collection, Map map, boolean z) {
        AnonymousClass7TG.A1U(collection, map, str);
        C271864ji E4e = this.A00.E4e(str, collection, map, z);
        C271864ji E4e2 = this.A01.E4e(str, E4e.A01, map, z);
        ArrayList A1D = AnonymousClass7TE.A1D(E4e.A00);
        Collection collection2 = E4e2.A00;
        0qQ.A06(collection2);
        A1D.addAll(collection2);
        return new C271864ji(E4e2.A01, A1D);
    }
}
