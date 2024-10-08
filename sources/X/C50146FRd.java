package X;

import java.lang.ref.WeakReference;
import java.util.Set;

/* renamed from: X.FRd  reason: case insensitive filesystem */
public final class C50146FRd implements 0L6 {
    public String A00 = null;
    public boolean A01 = true;
    public final C272584kz A02;
    public final Set A03 = AnonymousClass7TE.A1F();

    public final void DCF(String str, String str2, WeakReference weakReference) {
        boolean add = this.A03.add(str2);
        if (!this.A01) {
            C272584kz r1 = this.A02;
            r1.A02("next_module", str2);
            r1.A01();
        }
        this.A01 = false;
        C272584kz r2 = this.A02;
        r2.A03(str2, weakReference, add);
        String str3 = this.A00;
        if (str3 == null) {
            str3 = "";
        }
        r2.A02("previous_module", str3);
        r2.A02("current_module", str);
        this.A00 = str;
    }

    public C50146FRd(C272584kz r2) {
        this.A02 = r2;
    }
}
