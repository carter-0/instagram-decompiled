package X;

import android.content.Context;
import android.os.Handler;

/* renamed from: X.SId  reason: case insensitive filesystem */
public final class C11266SId {
    public static final Handler A08 = AnonymousClass7TF.A0D();
    public Context A00;
    public C61046Jvk A01;
    public C13851TiU A02;
    public C13561Tca A03;
    public boolean A04;
    public final SPQ A05;
    public final C9010RLe A06;
    public final LCD A07;

    public final String A00() {
        String str;
        C61046Jvk jvk = this.A01;
        if (jvk == null || (str = jvk.A00) == null) {
            return "";
        }
        return str;
    }

    public final boolean A01() {
        C13851TiU tiU = this.A02;
        if ((tiU == null || !tiU.CaO()) && !this.A04) {
            return false;
        }
        return true;
    }

    public C11266SId(SPQ spq, C9010RLe rLe, LCD lcd) {
        this.A06 = rLe;
        this.A05 = spq;
        this.A07 = lcd;
    }
}
