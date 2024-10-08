package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import java.util.LinkedHashMap;

public final class CR7 extends 17P implements C269874fp {
    public 1Xj A00;

    public final 1Xj BPf() {
        return this.A00;
    }

    public final C269864fo FDx(1E9 r3) {
        1Xj r1;
        ImmutablePandoMediaDict immutablePandoMediaDict = (ImmutablePandoMediaDict) A05(103772132, ImmutablePandoMediaDict.class);
        if (immutablePandoMediaDict != null) {
            1Xv r0 = 1Xj.A0h;
            1Xj A002 = 1Xv.A00(r3, immutablePandoMediaDict);
            if (A002 != null) {
                r1 = C41846B3n.A0Y(r3, A002);
                return new C269864fo(r1);
            }
        }
        r1 = null;
        return new C269864fo(r1);
    }

    public final C269874fp E9e(1E9 r2) {
        this.A00 = C41847B3o.A0u(r2, this, 103772132);
        return this;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, X.CR7] */
    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        1Xj r0 = this.A00;
        if (r0 != null) {
            A0t.put("media", r0.A1C());
        }
        return C41846B3n.A0P(this, A0t);
    }
}
